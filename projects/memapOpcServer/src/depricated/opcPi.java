package depricated;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import opcMEMAP.StartOPCUAServer;
import opcMEMAP.serverConfigurationClassesXML.ServerConfig;
import opcMEMAP.serverConfigurationClassesXML.ServerConfig.FolderNodes;
import opcMEMAP.serverConfigurationClassesXML.ServerConfig.NameSpaces;
import opcMEMAP.serverConfigurationClassesXML.ServerConfig.Nodes;
import opcMEMAP.serverConfigurationClassesXML.ServerConfig.FolderNodes.FolderNode;
import opcMEMAP.serverConfigurationClassesXML.ServerConfig.Nodes.Node;
import opcMEMAP.serverConfigurationClassesXML.ServerConfig.Nodes.Node.ModbusConnector;

@SuppressWarnings({ "rawtypes", "unchecked","serial"  })
public class opcPi {
	private JFrame frmOpcpi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					opcPi window = new opcPi();
					window.frmOpcpi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public opcPi() {
		initialize();
	}
	

     
	private ScheduledExecutorService executor;
	private JTextField txtNodeId;
	private JTextField txtDisplayName;
	private JTextField txtNodeDescription;
	private JTextField txtDefaultValue;
	private JTextField txtMinSamplingInterval;
	JTree nodeTree = new JTree();
	JPanel tabNode = new JPanel();
	JPanel tabFolders = new JPanel();
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private static ServerConfig config;
	private JTextField txtFoldernodeid;
	private JTextField txtFolderDisplayName;
	private JTextField txtFolderDescription;
	private JTextField txtNameSpaceTitle;
	JList lbNamespace = new JList();
	DefaultListModel lbListModel =new DefaultListModel();
	JPanel tabNamespace = new JPanel();
	JPanel tabGeneralSettings = new JPanel();
	JComboBox cbNodeNameSpace = new JComboBox();
	JComboBox cbNodeParentFolder = new JComboBox();
	JComboBox cbFolderNameSpace = new JComboBox();
	JComboBox cbAccessLevel = new JComboBox();
	JComboBox cbNodeDatatype = new JComboBox();
	JComboBox cbUserAccessLevel = new JComboBox();
	private JCheckBox checkBoxHistorization;
	private JTextField txtHostAddress;
	private JTextField txtApplicationUri;
	private JTextField txtServerUsername;
	private JPasswordField pwdPassword;
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOpcpi = new JFrame();
		frmOpcpi.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmOpcpi.setTitle("OpcPi");
		frmOpcpi.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmOpcpi.setBounds(100, 100, 771, 678);
		frmOpcpi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		JButton btnStartServer = new JButton("Start Server");
		btnStartServer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnStartServer.setBounds(465, 445, 225, 31);
		btnStartServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {    
		           
					executor = Executors.newSingleThreadScheduledExecutor();
		            executor.execute(new StartOPCUAServer());
		              
		          }
				catch (Exception e1) {
					e1.printStackTrace();
				}
				

/*				JAXBContext contextObj = JAXBContext.newInstance(Employee.class);  
				  
			    Marshaller marshallerObj = contextObj.createMarshaller();  
			    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
			  
			    Employee emp1=new Employee(1,"Vimal Jaiswal",50000);  
			      
			    marshallerObj.marshal(emp1, new FileOutputStream("employee.xml"));*/  
			}
		});
		frmOpcpi.getContentPane().setLayout(null);
		frmOpcpi.getContentPane().add(btnStartServer);
		
		
		nodeTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Object") {
				{
				}
			}
		));

		nodeTree.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nodeTree.setBounds(0, 90, 157, 310);
		nodeTree.addTreeSelectionListener(new TreeSelectionListener() {
		    public void valueChanged(TreeSelectionEvent e) {
		        DefaultMutableTreeNode node = (DefaultMutableTreeNode)
		        		nodeTree.getLastSelectedPathComponent();

		    /* if nothing is selected */ 
		        if (node == null) return;

		    /* retrieve the node that was selected */ 
		        Object nodeInfo = node.getUserObject();

		    /* React to the node selection. */


				if (nodeInfo instanceof Node) {
					txtNodeId.setText(nodeInfo.toString()); 

			    		txtDisplayName.setText(((Node) nodeInfo).getDisplayName());
			    		txtNodeDescription.setText(((Node) nodeInfo).getDescription());
			    		txtDefaultValue.setText(((Node) nodeInfo).getValue());
			    		txtMinSamplingInterval.setText(Double.toString(((Node) nodeInfo).getMinSamplingInterval()));
			    		cbNodeParentFolder.setSelectedItem(((Node) nodeInfo).getParentFolder());
			    		cbNodeNameSpace.setSelectedItem(((Node) nodeInfo).getNameSpace());
			    		cbAccessLevel.setSelectedItem(((Node) nodeInfo).getAccessLevel());
			    		cbUserAccessLevel.setSelectedItem(((Node) nodeInfo).getUserAccessLevel());
			    		cbNodeDatatype.setSelectedItem(((Node) nodeInfo).getDatatype());
			    		txtDefaultValue.setText(((Node) nodeInfo).getValue());
			    		txtMinSamplingInterval.setText(Double.toString(((Node) nodeInfo).getMinSamplingInterval()));
			    		checkBoxHistorization.setSelected(((Node) nodeInfo).isHistorizing());
			    		
				}
				if (nodeInfo instanceof FolderNode) {
					txtFoldernodeid.setText(((FolderNode) nodeInfo).getNodeId()); 
					txtFolderDisplayName.setText(((FolderNode) nodeInfo).getDisplayName());
					txtFolderDescription.setText(((FolderNode) nodeInfo).getDescription());
					cbFolderNameSpace.setSelectedItem(((FolderNode) nodeInfo).getNameSpace());
				}


		        
		        
		    }
		});
		frmOpcpi.getContentPane().add(nodeTree);
		
		JTextArea txtrServerLog = new JTextArea();
		txtrServerLog.setText("Server Log");
		txtrServerLog.setBounds(17, 495, 713, 100);
		frmOpcpi.getContentPane().add(txtrServerLog);
		
		JButton btnSaveConfiguration = new JButton("Save Configuration");
		btnSaveConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JAXBContext contextObj = JAXBContext.newInstance(ServerConfig.class);  
				    Marshaller marshallerObj = contextObj.createMarshaller();
				    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
					marshallerObj.marshal(config, new FileOutputStream("src/opcPi/server_config.xml"));
				} catch (Exception e1) {					
					e1.printStackTrace();
				}
			}
		});
		btnSaveConfiguration.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSaveConfiguration.setBounds(228, 445, 225, 31);
		frmOpcpi.getContentPane().add(btnSaveConfiguration);
		
		Image wPic = new ImageIcon("src/opcPi/opcPi_icon_resized.png").getImage();
		JLabel lblopcPiLogo = new JLabel("");
		lblopcPiLogo.setBounds(0, 0, 169, 45);
		lblopcPiLogo.setIcon(new ImageIcon(wPic));
		frmOpcpi.getContentPane().add(lblopcPiLogo);
		

		tabbedPane.setBounds(203, 19, 527, 391);
		frmOpcpi.getContentPane().add(tabbedPane);
		

		tabbedPane.addTab("Namespace", null, tabNamespace, null);
		tabNamespace.setLayout(null);
		

		lbNamespace.setBounds(40, 136, 215, 156);
		lbNamespace.setModel(lbListModel);
		tabNamespace.add(lbNamespace);
		
		JLabel lblNamespaceTitle = new JLabel("Namespace Title:");
		lblNamespaceTitle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNamespaceTitle.setBounds(40, 62, 86, 14);
		tabNamespace.add(lblNamespaceTitle);
		
		txtNameSpaceTitle = new JTextField();
		txtNameSpaceTitle.setText("Name Space Title");
		txtNameSpaceTitle.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNameSpaceTitle.setColumns(10);
		txtNameSpaceTitle.setBounds(131, 59, 124, 20);
		tabNamespace.add(txtNameSpaceTitle);
		
		JButton btnAddNamespace = new JButton("Add Namespace");
		btnAddNamespace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNamespaceToList(txtNameSpaceTitle.getText());
				addItemToNSComboBox(txtNameSpaceTitle.getText());
				addItemToFolderNSComboBox(txtNameSpaceTitle.getText());
				NameSpaces nss=config.getNameSpaces();
				nss.getNameSpace().add(txtNameSpaceTitle.getText());
			}
		});
		btnAddNamespace.setForeground(Color.WHITE);
		btnAddNamespace.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAddNamespace.setBackground(new Color(0, 128, 0));
		btnAddNamespace.setBounds(142, 98, 113, 23);
		tabNamespace.add(btnAddNamespace);
		
		tabbedPane.addTab("Folder Nodes", null, tabFolders, null);
		tabFolders.setLayout(null);
		
		JLabel label = new JLabel("NodeID:");
		label.setBounds(62, 22, 40, 14);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabFolders.add(label);
		
		txtFoldernodeid = new JTextField();
		txtFoldernodeid.setBounds(107, 19, 86, 20);
		txtFoldernodeid.setText("FolderNodeID");
		txtFoldernodeid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtFoldernodeid.setColumns(10);
		tabFolders.add(txtFoldernodeid);
		
		JLabel label_1 = new JLabel("Display name:");
		label_1.setBounds(35, 50, 67, 14);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabFolders.add(label_1);
		
		txtFolderDisplayName = new JTextField();
		txtFolderDisplayName.setBounds(107, 47, 86, 20);
		txtFolderDisplayName.setText("Folder Display name");
		txtFolderDisplayName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtFolderDisplayName.setColumns(10);
		tabFolders.add(txtFolderDisplayName);
		
		JLabel label_2 = new JLabel("Node Description:");
		label_2.setBounds(17, 86, 85, 14);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabFolders.add(label_2);
		
		txtFolderDescription = new JTextField();
		txtFolderDescription.setBounds(107, 83, 86, 20);
		txtFolderDescription.setText("Folder Description");
		txtFolderDescription.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtFolderDescription.setColumns(10);
		tabFolders.add(txtFolderDescription);
		
		JButton btnAddFolderNode = new JButton("Add Folder Node");
		btnAddFolderNode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addItemToFolderComboBox(txtFoldernodeid.getText());
				FolderNodes fns=config.getFolderNodes();
				FolderNode fn=new FolderNode();
				
				fn.setNodeId(txtFoldernodeid.getText());
				fn.setDisplayName(txtFolderDisplayName.getText());
				fn.setDescription(txtFolderDescription.getText());
				fn.setNameSpace(cbFolderNameSpace.getSelectedItem().toString());
				
				addNodeToTree(fn);
				fns.getFolderNode().add(fn);
			}
		});
		btnAddFolderNode.setForeground(Color.WHITE);
		btnAddFolderNode.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAddFolderNode.setBackground(new Color(0, 128, 0));
		btnAddFolderNode.setBounds(80, 162, 113, 23);
		tabFolders.add(btnAddFolderNode);
		
		JLabel label_3 = new JLabel("NameSpace:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_3.setBounds(27, 119, 63, 23);
		tabFolders.add(label_3);
		cbFolderNameSpace.setModel(new DefaultComboBoxModel(new String[] {"default"}));
		

		cbFolderNameSpace.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbFolderNameSpace.setBounds(93, 119, 100, 23);
		tabFolders.add(cbFolderNameSpace);
		

		tabbedPane.addTab("Analog Nodes", null, tabNode, null);
		tabNode.setLayout(null);
		
		JLabel lblNodeid = new JLabel("NodeID:");
		lblNodeid.setBounds(81, 102, 49, 23);
		tabNode.add(lblNodeid);
		lblNodeid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtNodeId = new JTextField();
		txtNodeId.setBounds(134, 101, 100, 24);
		tabNode.add(txtNodeId);
		txtNodeId.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNodeId.setText("Node ID");
		txtNodeId.setColumns(10);
		
		JLabel lblDisplayName = new JLabel("Display name:");
		lblDisplayName.setBounds(54, 131, 76, 23);
		tabNode.add(lblDisplayName);
		lblDisplayName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtDisplayName = new JTextField();
		txtDisplayName.setBounds(134, 130, 100, 24);
		tabNode.add(txtDisplayName);
		txtDisplayName.setText("Display name");
		txtDisplayName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDisplayName.setColumns(10);
		
		JLabel lblDefaultValue = new JLabel("Default Value:");
		lblDefaultValue.setBounds(54, 188, 76, 23);
		tabNode.add(lblDefaultValue);
		lblDefaultValue.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNodeDescription = new JLabel("Node Description:");
		lblNodeDescription.setBounds(38, 159, 85, 23);
		tabNode.add(lblNodeDescription);
		lblNodeDescription.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtNodeDescription = new JTextField();
		txtNodeDescription.setBounds(134, 158, 100, 24);
		tabNode.add(txtNodeDescription);
		txtNodeDescription.setText("Node Description");
		txtNodeDescription.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNodeDescription.setColumns(10);
		
		txtDefaultValue = new JTextField();
		txtDefaultValue.setBounds(134, 187, 100, 24);
		tabNode.add(txtDefaultValue);
		txtDefaultValue.setText("Default Value");
		txtDefaultValue.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDefaultValue.setColumns(10);
		
		JLabel lblDatatype = new JLabel("NodeDataType:");
		lblDatatype.setBounds(38, 70, 92, 23);
		tabNode.add(lblDatatype);
		lblDatatype.setFont(new Font("Tahoma", Font.PLAIN, 11));
		

		cbNodeDatatype.setModel(new DefaultComboBoxModel(new String[] {"Double", "Boolean", "Integer", "Float", "String"}));
		cbNodeDatatype.setBounds(134, 70, 100, 23);
		tabNode.add(cbNodeDatatype);
		cbNodeDatatype.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblAccessLevel = new JLabel("Access Level:");
		lblAccessLevel.setBounds(54, 217, 76, 23);
		tabNode.add(lblAccessLevel);
		lblAccessLevel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		

		cbAccessLevel.setModel(new DefaultComboBoxModel(new String[] {"READ_WRITE", "READ_ONLY"}));
		cbAccessLevel.setBounds(134, 217, 100, 23);
		tabNode.add(cbAccessLevel);
		cbAccessLevel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblUserAccessLevel = new JLabel("User Access Level:");
		lblUserAccessLevel.setBounds(30, 247, 100, 23);
		tabNode.add(lblUserAccessLevel);
		lblUserAccessLevel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		

		cbUserAccessLevel.setModel(new DefaultComboBoxModel(new String[] {"READ_WRITE", "READ_ONLY"}));
		cbUserAccessLevel.setBounds(134, 247, 100, 23);
		tabNode.add(cbUserAccessLevel);
		cbUserAccessLevel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblMinSamplingInterval = new JLabel("Min. Sampling Interval:");
		lblMinSamplingInterval.setBounds(17, 277, 113, 23);
		tabNode.add(lblMinSamplingInterval);
		lblMinSamplingInterval.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtMinSamplingInterval = new JTextField();
		txtMinSamplingInterval.setBounds(134, 276, 100, 24);
		tabNode.add(txtMinSamplingInterval);
		txtMinSamplingInterval.setText("Min. Sampling Interval");
		txtMinSamplingInterval.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtMinSamplingInterval.setColumns(10);
		
		checkBoxHistorization = new JCheckBox("Historization");
		checkBoxHistorization.setBounds(134, 304, 100, 23);
		tabNode.add(checkBoxHistorization);
		checkBoxHistorization.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnAddNode = new JButton("Add Node");
		btnAddNode.setBounds(134, 335, 100, 23);
		tabNode.add(btnAddNode);
		btnAddNode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Nodes nss=config.getNodes();
				Node n=new Node();
				n.setNodeId(txtNodeId.getText());
				n.setDisplayName(txtDisplayName.getText());
				n.setDescription(txtNodeDescription.getText());
				n.setDatatype(cbNodeDatatype.getSelectedItem().toString());
				n.setAccessLevel(cbAccessLevel.getSelectedItem().toString());
				n.setUserAccessLevel(cbUserAccessLevel.getSelectedItem().toString());
				n.setNameSpace(cbNodeNameSpace.getSelectedItem().toString());
				n.setHistorizing(checkBoxHistorization.isSelected());
				n.setParentFolder(cbNodeParentFolder.getSelectedItem().toString());
				n.setValue(txtDefaultValue.getText());
				n.setMinSamplingInterval(Double.parseDouble(txtMinSamplingInterval.getText()));
				ModbusConnector mbusConnector=new ModbusConnector();
				
				n.setModbusConnector(mbusConnector);
				addNodeToTree(n);
				nss.getNode().add(n);
		
				
			}
		});
		btnAddNode.setForeground(new Color(255, 255, 255));
		btnAddNode.setBackground(new Color(0, 128, 0));
		btnAddNode.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNodeNamespace = new JLabel("NameSpace:");
		lblNodeNamespace.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNodeNamespace.setBounds(54, 42, 76, 23);
		tabNode.add(lblNodeNamespace);
		

		cbNodeNameSpace.setModel(new DefaultComboBoxModel(new String[] {"default"}));
		cbNodeNameSpace.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbNodeNameSpace.setBounds(134, 42, 100, 23);
		tabNode.add(cbNodeNameSpace);
		

		cbNodeParentFolder.setModel(new DefaultComboBoxModel(new String[] {"none"}));
		cbNodeParentFolder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbNodeParentFolder.setBounds(134, 13, 100, 23);
		tabNode.add(cbNodeParentFolder);
		
		JLabel lblNodeParentFolder = new JLabel("Parent Folder:");
		lblNodeParentFolder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNodeParentFolder.setBounds(54, 13, 76, 23);
		tabNode.add(lblNodeParentFolder);
		

		tabbedPane.addTab("GeneralSettings", null, tabGeneralSettings, null);
		tabGeneralSettings.setLayout(null);
		
		JLabel lblHostAddress = new JLabel("Host Address:");
		lblHostAddress.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblHostAddress.setBounds(62, 42, 76, 23);
		tabGeneralSettings.add(lblHostAddress);
		
		txtHostAddress = new JTextField();
		txtHostAddress.setText("host address");
		txtHostAddress.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtHostAddress.setColumns(10);
		txtHostAddress.setBounds(142, 41, 100, 24);
		tabGeneralSettings.add(txtHostAddress);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPort.setBounds(105, 71, 33, 23);
		tabGeneralSettings.add(lblPort);
		
		JLabel lblApplicationUri = new JLabel("Application URI:");
		lblApplicationUri.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblApplicationUri.setBounds(53, 99, 85, 23);
		tabGeneralSettings.add(lblApplicationUri);
		
		txtApplicationUri = new JTextField();
		txtApplicationUri.setText("Application URI");
		txtApplicationUri.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtApplicationUri.setColumns(10);
		txtApplicationUri.setBounds(142, 98, 100, 24);
		tabGeneralSettings.add(txtApplicationUri);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUsername.setBounds(73, 171, 53, 23);
		tabGeneralSettings.add(lblUsername);
		
		txtServerUsername = new JTextField();
		txtServerUsername.setText("Server UserName");
		txtServerUsername.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtServerUsername.setColumns(10);
		txtServerUsername.setBounds(142, 170, 100, 24);
		tabGeneralSettings.add(txtServerUsername);
		
		JFormattedTextField frmtdtxtfldServerPort = new JFormattedTextField();
		frmtdtxtfldServerPort.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmtdtxtfldServerPort.setText("Server port");
		frmtdtxtfldServerPort.setBounds(142, 71, 100, 22);
		tabGeneralSettings.add(frmtdtxtfldServerPort);
		
		JLabel lblUserTokenPolicies = new JLabel("User Token Policies:");
		lblUserTokenPolicies.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUserTokenPolicies.setBounds(38, 129, 100, 23);
		tabGeneralSettings.add(lblUserTokenPolicies);
		
		JComboBox cbUserTokenPolicies = new JComboBox();
		cbUserTokenPolicies.setModel(new DefaultComboBoxModel(new String[] {"ANONYMOUS"}));
		cbUserTokenPolicies.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbUserTokenPolicies.setBounds(142, 129, 100, 23);
		tabGeneralSettings.add(cbUserTokenPolicies);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPassword.setBounds(73, 202, 53, 23);
		tabGeneralSettings.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pwdPassword.setText("password");
		pwdPassword.setBounds(142, 202, 100, 23);
		tabGeneralSettings.add(pwdPassword);
		
		JButton btnSaveSettings = new JButton("Save Settings");
		btnSaveSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				config.setHost(txtHostAddress.getText());
				config.setPort(Integer.parseInt(frmtdtxtfldServerPort.getText()));
				config.setApplicationUri(txtApplicationUri.getText());
				config.setUserTokenPolicies(cbUserTokenPolicies.getSelectedItem().toString());
				config.setUsername(txtServerUsername.getText());
				config.setPassword(pwdPassword.getPassword().toString());
			}
		});
		btnSaveSettings.setForeground(Color.WHITE);
		btnSaveSettings.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSaveSettings.setBackground(new Color(0, 128, 0));
		btnSaveSettings.setBounds(142, 245, 100, 23);
		tabGeneralSettings.add(btnSaveSettings);
		
		


		//read existing configuration file 
		try {    
	        File file = new File("src/opcPi/server_config.xml");    
	        JAXBContext jaxbContext = JAXBContext.newInstance(ServerConfig.class);    
	     
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
	        config=(ServerConfig) jaxbUnmarshaller.unmarshal(file);
	          
	      } catch (JAXBException e1) {e1.printStackTrace(); }
		//populate existing serverconfig.xml data onto UI
		txtHostAddress.setText(config.getHost());
		frmtdtxtfldServerPort.setText(Integer.toString(config.getPort()));
		txtApplicationUri.setText(config.getApplicationUri());
		cbUserTokenPolicies.setSelectedItem(config.getUserTokenPolicies());
		txtServerUsername.setText(config.getUsername());
		pwdPassword.setText(config.getPassword());
		
	for(Node node : config.getNodes().getNode())
	{
		//addNodeToTree(node.getNodeId());
		addNodeToTree(node);
	}
	for(FolderNode fnode : config.getFolderNodes().getFolderNode())
	{
		addItemToFolderComboBox(fnode.getNodeId());
		addNodeToTree(fnode);
		
	}
	for(String ns : config.getNameSpaces().getNameSpace())
	{
		addNamespaceToList(ns);
		addItemToNSComboBox(ns);
		addItemToFolderNSComboBox(ns);
	}
	
	}
	
	public void addNodeToTree(String nodeToAdd) {
	      DefaultTreeModel model = (DefaultTreeModel) nodeTree.getModel();
	      DefaultMutableTreeNode root = (DefaultMutableTreeNode) nodeTree.getModel()
	          .getRoot();
	      DefaultMutableTreeNode child = new DefaultMutableTreeNode(nodeToAdd);
	      model.insertNodeInto(child, root, root.getChildCount());

	      nodeTree.scrollPathToVisible(new TreePath(child.getPath()));
	    }
	
	public void addNodeToTree(Object nodeToAdd) {
	      DefaultTreeModel model = (DefaultTreeModel) nodeTree.getModel();
	      DefaultMutableTreeNode root = (DefaultMutableTreeNode) nodeTree.getModel()
	          .getRoot();
	      DefaultMutableTreeNode child = new DefaultMutableTreeNode(nodeToAdd);
	      model.insertNodeInto(child, root, root.getChildCount());

	      nodeTree.scrollPathToVisible(new TreePath(child.getPath()));
	    }
	
	public void addNamespaceToList(String nsToAdd) {
		 //lbListModel = (DefaultListModel) lbNamespace.getModel();
		 lbListModel.addElement(nsToAdd);
	    }
	
	public void addItemToNSComboBox(String nsToAdd) {
		cbNodeNameSpace.addItem(nsToAdd);
	    }
	
	public void addItemToFolderNSComboBox(String nsToAdd) {
		cbFolderNameSpace.addItem(nsToAdd);
	    }
	
	public void addItemToFolderComboBox(String folderToAdd) {
		cbNodeParentFolder.addItem(folderToAdd);
	    }
}
