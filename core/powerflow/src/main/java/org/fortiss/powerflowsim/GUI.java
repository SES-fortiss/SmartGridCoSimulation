/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package org.fortiss.powerflowsim;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.BevelBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.fortiss.powerflowsim.exporters.RDFExporter;
import org.fortiss.powerflowsim.model.ModelUtils;
import org.fortiss.powerflowsim.util.JTextAreaAppender;

import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Core.ConnectivityNode;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.Terminal;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.EnergyConsumer;
import CIM15.IEC61970.Wires.EnergySource;
import CIM15.IEC61970.Wires.TransformerEnd;

import com.mxgraph.layout.mxPartitionLayout;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;

/**
 * 
 * @author murphy
 *
 */
public class GUI extends JFrame {

	private static final long serialVersionUID = -2707712944901661771L;
	private JTextField textFile_mrid;
	private JTree tree;
	private PowerFlowSim powerFlowSim;
	private JButton btnRunSimulation;
	private JTable table;
	private DefaultTableModel tableModel;
	private JComboBox<String> comboBox;
	private static Logger log = Logger.getRootLogger();
	private final JFileChooser fileChooser = new JFileChooser();
	private JScrollPane scrollPane;
	private JTextArea logTextField;
	private mxGraph graph;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GUI frame = new GUI();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1460, 1000);
		frame.setVisible(true);

		try {
			PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p [%t] %c: %m%n");
			ConsoleAppender consoleAppender = new ConsoleAppender(layout);
			JTextAreaAppender guiAppender = new JTextAreaAppender(frame.logTextField);
			log.addAppender(consoleAppender);
			log.addAppender(guiAppender);
			// ALL | DEBUG | INFO | WARN | ERROR | FATAL | OFF:
			log.setLevel(Level.ALL);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		frame.initGUI();

	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		super("GUI");
		logTextField = new JTextArea();
		logTextField.setFont(new Font(Font.SANS_SERIF, 0, 10));

		setTitle("PowerFlow Simulator");

	}

	public void initGUI() {
		this.setPowerFlowSim(new PowerFlowSim());
		addLogTextArea();

		tree = new JTree();
		final DefaultMutableTreeNode modelRoot = initTree(tree);
		getContentPane().add(tree);
		initMRIDtextField();

		addMRIDLabel();
		addValueLabel();
		addGetResultBtn();
		addRunSimulationBtn();

		addTreeScrollPane(tree);
		addResultsTable();
		addTableScrollPane();

		addSwingNodeLabel();
		addNetworkGraph();
		addSwingSelectionBox();

		addMenu(modelRoot);
		repaint();
		revalidate();

	}

	private void addLogTextArea() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(364, 136, 461, 279);
		getContentPane().add(scrollPane);

		scrollPane.setViewportView(logTextField);

	}

	private void addNetworkGraph() {
		graph = new mxGraph();
		graph.setEdgeLabelsMovable(false);
		graph.setAllowDanglingEdges(false);
		graph.setDisconnectOnMove(false);
		graph.setResetEdgesOnMove(true);

		Map<String, Object> style = new Hashtable<String, Object>();
		style = graph.getStylesheet().getDefaultEdgeStyle();
		style.put(mxConstants.STYLE_ROUNDED, "1");
		style.put("endArrow", "none");
		mxStylesheet stylesheet = graph.getStylesheet();
		stylesheet.putCellStyle("MyStyle", style);

		updateGraph(graph);
		getContentPane().setLayout(null);

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		graphComponent.setEventsEnabled(false);
		graphComponent.setEscapeEnabled(false);
		graphComponent.setExportEnabled(false);
		graphComponent.setFoldingEnabled(false);
		graphComponent.setDragEnabled(false);
		graphComponent.setConnectable(false);
		graphComponent.setBounds(364, 427, 1070, 514);

		new mxHierarchicalLayout(graph).execute(graph.getDefaultParent());
		new mxPartitionLayout(graph).execute(graph.getDefaultParent());

		getContentPane().add(graphComponent);
	}

	private void updateGraph(final mxGraph graph) {
		Object parent = graph.getDefaultParent();
		Map<IdentifiedObject, Object> graphMap = new HashMap<IdentifiedObject, Object>();
		graph.getModel().beginUpdate();
		graph.removeCells(graph.getChildVertices(graph.getDefaultParent()));
		try {
			int x = 80;
			int y = 30;

			for (TopologicalNode node : powerFlowSim.getModel().getTopologicalNodes()) {
				x += 50;
				y += 50;

				Object current_node = graph.insertVertex(parent, null, node.getMRID(), x, y, 100, 20);
				graphMap.put(node, current_node);
			}

			for (EnergySource node : powerFlowSim.getModel().getSources()) {
				x += 50;
				y += 50;

				Object current_node = graph.insertVertex(parent, null, "EnergySource\n" + node.getMRID(), x, y, 100, 40);
				graphMap.put(node, current_node);
				if (node.getTerminals().size() > 0) {
					graph.insertEdge(parent, null, "", current_node, graphMap.get(node.getTerminals().get(0).getTopologicalNode()), "MyStyle");
				}
			}

			for (EnergyConsumer node : powerFlowSim.getModel().getLoads()) {
				x += 50;
				y += 50;

				Object current_node = graph.insertVertex(parent, null, "EnergyConsumer\n" + node.getMRID(), x, y, 100, 40);
				graphMap.put(node, current_node);
				graph.insertEdge(parent, null, "", current_node, graphMap.get(node.getTerminals().get(0).getTopologicalNode()), "MyStyle");

			}
			for (ACLineSegment line : powerFlowSim.getModel().getLines()) {
				Object source = graphMap.get(line.getTerminals().get(0).getTopologicalNode());
				Object dest = graphMap.get(line.getTerminals().get(1).getTopologicalNode());

				graph.insertEdge(parent, null, line.getMRID(), source, dest, "MyStyle");

			}
			graph.getSelectionModel().addListener(mxEvent.CHANGE, new mxIEventListener() {

				@Override
				public void invoke(Object sender, mxEventObject evt) {
					try {
						textFile_mrid.setText(((mxCell) graph.getSelectionCell()).getValue().toString());
						Map<String, String> measurement = getValue(textFile_mrid.getText());

						tableModel.setRowCount(0);

						for (String key : measurement.keySet()) {
							String[] tableRow = { key, measurement.get(key) };
							tableModel.addRow(tableRow);
						}
					} catch (Exception ex) {
					}
				}
			});
			new mxHierarchicalLayout(graph).execute(graph.getDefaultParent());
			new mxPartitionLayout(graph).execute(graph.getDefaultParent());
		} finally {
			graph.getModel().endUpdate();
		}
	}

	private void addMenu(final DefaultMutableTreeNode modelRoot) {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1460, 27);
		getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JMenuItem mntmLoadFile = new JMenuItem("Load CIM-RDF");
		mntmLoadFile.addActionListener(loadFileActionListener(modelRoot));
		mnNewMenu.add(mntmLoadFile);

		JMenuItem mntmSaveFile = new JMenuItem("Save CIM-RDF");
		mntmSaveFile.addActionListener(saveFileActionListener());
		mnNewMenu.add(mntmSaveFile);

		JMenuItem mntmQuit = new JMenuItem("Quit");
		mnNewMenu.add(mntmQuit);
		mntmQuit.addActionListener(closeActionListener());
		menuBar.repaint();
	}

	private ActionListener saveFileActionListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = fileChooser.showSaveDialog(getComponent(0));
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					log.info("Saving: " + file.getName() + ".");
					RDFExporter.export(file, powerFlowSim.getModel());
					log.info("File saved.");
				} else {
					log.info("Saving command cancelled by user.");
				}
			}
		};
	}

	private void addSwingNodeLabel() {
		JLabel lblSwingNode = new JLabel("Swing Node:");
		lblSwingNode.setBounds(479, 74, 100, 16);
		getContentPane().add(lblSwingNode);
	}

	private void addSwingSelectionBox() {
		comboBox = new JComboBox<String>();

		addTopologicalNodesToSwingSelectionBox();

		comboBox.addItemListener(swingNodeItemListener());
		comboBox.setBounds(569, 71, 280, 31);
		getContentPane().add(comboBox);
	}

	private void addTableScrollPane() {
		JScrollPane tableScrollPane = new JScrollPane(table);
		tableScrollPane.setBounds(837, 136, 597, 279);
		getContentPane().add(tableScrollPane);
	}

	private void addResultsTable() {
		tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Property", "Value" });
		table = new JTable();
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(209);
		table.setBounds(270, 440, 606, 254);
		getContentPane().add(table);
	}

	private void addTreeScrollPane(JTree tree) {
		JScrollPane treeScrollPane = new JScrollPane(tree);
		treeScrollPane.setBounds(0, 31, 322, 910);
		getContentPane().add(treeScrollPane);
	}

	private void addRunSimulationBtn() {

		btnRunSimulation = new JButton("Run Simulation");
		btnRunSimulation.addActionListener(startSimulationActionListener());
		btnRunSimulation.setBounds(872, 72, 189, 29);
		getContentPane().add(btnRunSimulation);

	}

	private void addGetResultBtn() {
		JButton btnGetSimulationResult = new JButton("get simulation result");
		btnGetSimulationResult.addActionListener(getSimulationResultActionListener());
		btnGetSimulationResult.setBounds(733, 33, 189, 29);
		getContentPane().add(btnGetSimulationResult);
	}

	private void addValueLabel() {
		JLabel lblValue = new JLabel("Value:");
		lblValue.setBounds(364, 113, 61, 16);
		getContentPane().add(lblValue);
	}

	private void addMRIDLabel() {
		JLabel lblNewLabel_1 = new JLabel("MRID:");
		lblNewLabel_1.setBounds(364, 30, 46, 32);
		getContentPane().add(lblNewLabel_1);
	}

	private void initMRIDtextField() {
		textFile_mrid = new JTextField();
		textFile_mrid.setEnabled(false);
		textFile_mrid.setEditable(false);
		textFile_mrid.setBounds(422, 31, 299, 31);
		getContentPane().add(textFile_mrid);
		textFile_mrid.setColumns(10);
	}

	private DefaultMutableTreeNode initTree(JTree tree) {
		tree.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		final DefaultMutableTreeNode modelRoot = new DefaultMutableTreeNode("CIM Model");

		tree.setModel(new DefaultTreeModel(modelRoot));
		drawTree(modelRoot);
		tree.setBounds(2, 2, 443, 536);

		TreeSelectionListener treeSelectionListener = showResultsTreeSelectionListener();
		tree.addTreeSelectionListener(treeSelectionListener);
		return modelRoot;
	}

	private TreeSelectionListener showResultsTreeSelectionListener() {
		return new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				try {
					textFile_mrid.setText(e.getPath().getLastPathComponent().toString().split("[(]")[0]);
					Map<String, String> measurement = getValue(textFile_mrid.getText());

					tableModel.setRowCount(0);

					for (String key : measurement.keySet()) {
						String[] tableRow = { key, measurement.get(key) };
						tableModel.addRow(tableRow);
					}
				} catch (Exception ex) {
				}
			}
		};
	}

	private ActionListener getSimulationResultActionListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Map<String, String> measurement = getValue(textFile_mrid.getText());

				tableModel.setRowCount(0);

				for (String key : measurement.keySet()) {
					String[] tableRow = { key, measurement.get(key) };
					tableModel.addRow(tableRow);
				}

			}
		};
	}

	private ActionListener startSimulationActionListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnRunSimulation.setEnabled(false);
				getPowerFlowSim().runSimulation();
				// logTextField.setText(simulationOutput);
				btnRunSimulation.setEnabled(true);
			}
		};
	}

	private void addTopologicalNodesToSwingSelectionBox() {
		comboBox.removeAllItems();
		for (Object object : this.getPowerFlowSim().getModel().getAllObjectsWithClass(TopologicalNode.class)) {
			comboBox.addItem(((TopologicalNode) object).getMRID());
		}
	}

	private ItemListener swingNodeItemListener() {
		return new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

				log.info("Set SWING node to " + arg0.getItem().toString());
				getPowerFlowSim().getModel().setSWINGNodeWithMRID(arg0.getItem().toString());

			}
		};
	}

	private ActionListener closeActionListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		};
	}

	private ActionListener loadFileActionListener(final DefaultMutableTreeNode modelRoot) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = fileChooser.showOpenDialog(getComponent(0));
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					log.info("Opening: " + file.getName() + ".");

					getPowerFlowSim().loadFile(file);
					updateGraph(graph);

					drawTree(modelRoot);
					addTopologicalNodesToSwingSelectionBox();

				} else {
					log.info("Open command cancelled by user.");
				}
			}
		};
	}

	/**
	 * @param modelRoot
	 */
	private void drawTree(DefaultMutableTreeNode modelRoot) {
		modelRoot.removeAllChildren();

		DefaultMutableTreeNode topologicalNodes = new DefaultMutableTreeNode("Topological Nodes");
		modelRoot.add(topologicalNodes);
		for (Object topoNode : powerFlowSim.getModel().getAllObjectsWithClass(TopologicalNode.class)) {
			DefaultMutableTreeNode treeTopologicalNode = new DefaultMutableTreeNode(((TopologicalNode) topoNode).getMRID() + "(" + ((TopologicalNode) topoNode).getClass().getSimpleName() + ")");
			topologicalNodes.add(treeTopologicalNode);
			for (ConnectivityNode connectivityNode : ((TopologicalNode) topoNode).getConnectivityNodes()) {
				DefaultMutableTreeNode treeConnectivityNode = new DefaultMutableTreeNode(connectivityNode.getMRID() + "(" + connectivityNode.getClass().getSimpleName() + ")");
				treeTopologicalNode.add(treeConnectivityNode);
				for (Terminal terminal : connectivityNode.getTerminals()) {
					DefaultMutableTreeNode treeTerminal = new DefaultMutableTreeNode(terminal.getMRID() + "(" + terminal.getClass().getSimpleName() + ")");
					treeConnectivityNode.add(treeTerminal);
					try {
						for (TransformerEnd powerTransformerEnd : terminal.getTransformerEnd()) {
							DefaultMutableTreeNode treeTransformerEnd = new DefaultMutableTreeNode(powerTransformerEnd.getMRID() + "(" + powerTransformerEnd.getClass().getSimpleName() + ")");
							treeTerminal.add(treeTransformerEnd);
						}

					} catch (NullPointerException ex) {
					}
					try {
						DefaultMutableTreeNode treeConductingEquipment = new DefaultMutableTreeNode(terminal.getConductingEquipment().getMRID() + "("
								+ terminal.getConductingEquipment().getClass().getSimpleName() + ")");
						treeTerminal.add(treeConductingEquipment);
					} catch (NullPointerException ex) {
					}

				}

			}
		}

		DefaultMutableTreeNode connectivityNodes = new DefaultMutableTreeNode("Connectivity Nodes");
		modelRoot.add(connectivityNodes);
		for (Object connectivityNode : powerFlowSim.getModel().getAllObjectsWithClass(ConnectivityNode.class)) {
			DefaultMutableTreeNode treeConnectivityNode = new DefaultMutableTreeNode(((ConnectivityNode) connectivityNode).getMRID() + "("
					+ ((ConnectivityNode) connectivityNode).getClass().getSimpleName() + ")");
			connectivityNodes.add(treeConnectivityNode);
			for (Terminal terminal : ((ConnectivityNode) connectivityNode).getTerminals()) {
				DefaultMutableTreeNode treeTerminal = new DefaultMutableTreeNode(terminal.getMRID() + "(" + terminal.getClass().getSimpleName() + ")");
				treeConnectivityNode.add(treeTerminal);
				try {
					for (TransformerEnd powerTransformerEnd : terminal.getTransformerEnd()) {
						DefaultMutableTreeNode treeTransformerEnd = new DefaultMutableTreeNode(powerTransformerEnd.getMRID() + "(" + powerTransformerEnd.getClass().getSimpleName() + ")");
						treeTerminal.add(treeTransformerEnd);
					}

				} catch (NullPointerException ex) {
				}
				try {
					DefaultMutableTreeNode treeConductingEquipment = new DefaultMutableTreeNode(terminal.getConductingEquipment().getMRID() + "("
							+ terminal.getConductingEquipment().getClass().getSimpleName() + ")");
					treeTerminal.add(treeConductingEquipment);
				} catch (NullPointerException ex) {
				}

			}

		}

	}

	private Map<String, String> getValue(String selected_node) {
		log.info(selected_node);

		Object current_node = powerFlowSim.getModel().getObjectWithMRID(selected_node);
		Map<String, String> resultMap = new HashMap<String, String>();

		if (current_node instanceof TopologicalNode) {
			float activePower = ((TopologicalNode) current_node).getSvInjection().getPNetInjection();
			float reactivePower = ((TopologicalNode) current_node).getSvInjection().getQNetInjection();
			float voltageMagnitude = ((TopologicalNode) current_node).getSvVoltage().getV();
			float voltageAngle = ((TopologicalNode) current_node).getSvVoltage().getAngle();

			resultMap.put("active_power", String.valueOf(activePower));
			resultMap.put("reactive_power", String.valueOf(reactivePower));
			resultMap.put("voltage_magnitude", String.valueOf(voltageMagnitude));
			resultMap.put("voltage_angle", String.valueOf(voltageAngle) + " °");

		} else if (current_node instanceof ConductingEquipment) {
			TopologicalNode topologicalNode = ((ConductingEquipment) current_node).getTerminals().get(0).getTopologicalNode();
			float activePower = topologicalNode.getSvInjection().getPNetInjection();
			float reactivePower = topologicalNode.getSvInjection().getQNetInjection();
			float voltageMagnitude = topologicalNode.getSvVoltage().getV();
			float voltageAngle = topologicalNode.getSvVoltage().getAngle();

			resultMap.put("active_power", String.valueOf(activePower));
			resultMap.put("reactive_power", String.valueOf(reactivePower));
			resultMap.put("voltage_magnitude", String.valueOf(voltageMagnitude));
			resultMap.put("voltage_angle", String.valueOf(voltageAngle) + " °");

		}

		if (current_node instanceof IdentifiedObject) {
			resultMap.putAll(ModelUtils.getAttributes((IdentifiedObject) current_node));
		}

		return resultMap;
	}

	private PowerFlowSim getPowerFlowSim() {
		return powerFlowSim;
	}

	private void setPowerFlowSim(PowerFlowSim powerFlowSim) {
		this.powerFlowSim = powerFlowSim;
	}

	public JTree getTree() {
		return tree;
	}

	public void setTree(JTree tree) {
		this.tree = tree;
	}
}
