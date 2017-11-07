/**
 */
package CIM15.IEC61970.StateVariables;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Topology.TopologyPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topological Island</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopologicalIsland extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getAngleRef_TopologicalNode() <em>Angle Ref Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleRef_TopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected TopologicalNode angleRef_TopologicalNode;

	/**
	 * The cached value of the '{@link #getTopologicalNodes() <em>Topological Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologicalNode> topologicalNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologicalIsland() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.TOPOLOGICAL_ISLAND;
	}

	/**
	 * Returns the value of the '<em><b>Angle Ref Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland <em>Angle Ref Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Ref Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Ref Topological Node</em>' reference.
	 * @see #setAngleRef_TopologicalNode(TopologicalNode)
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getAngleRef_TopologicalIsland
	 * @generated
	 */
	public TopologicalNode getAngleRef_TopologicalNode() {
		if (angleRef_TopologicalNode != null && angleRef_TopologicalNode.eIsProxy()) {
			InternalEObject oldAngleRef_TopologicalNode = (InternalEObject)angleRef_TopologicalNode;
			angleRef_TopologicalNode = (TopologicalNode)eResolveProxy(oldAngleRef_TopologicalNode);
			if (angleRef_TopologicalNode != oldAngleRef_TopologicalNode) {
			}
		}
		return angleRef_TopologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalNode basicGetAngleRef_TopologicalNode() {
		return angleRef_TopologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleRef_TopologicalNode(TopologicalNode newAngleRef_TopologicalNode, NotificationChain msgs) {
		TopologicalNode oldAngleRef_TopologicalNode = angleRef_TopologicalNode;
		angleRef_TopologicalNode = newAngleRef_TopologicalNode;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.TopologicalIsland#getAngleRef_TopologicalNode <em>Angle Ref Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Ref Topological Node</em>' reference.
	 * @see #getAngleRef_TopologicalNode()
	 * @generated
	 */
	public void setAngleRef_TopologicalNode(TopologicalNode newAngleRef_TopologicalNode) {
		if (newAngleRef_TopologicalNode != angleRef_TopologicalNode) {
			NotificationChain msgs = null;
			if (angleRef_TopologicalNode != null)
				msgs = ((InternalEObject)angleRef_TopologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs);
			if (newAngleRef_TopologicalNode != null)
				msgs = ((InternalEObject)newAngleRef_TopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs);
			msgs = basicSetAngleRef_TopologicalNode(newAngleRef_TopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Topological Nodes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Nodes</em>' reference list.
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getTopologicalIsland
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNodes() {
		if (topologicalNodes == null) {
			topologicalNodes = new BasicInternalEList<TopologicalNode>(TopologicalNode.class);
		}
		return topologicalNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				if (angleRef_TopologicalNode != null)
					msgs = ((InternalEObject)angleRef_TopologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, TopologicalNode.class, msgs);
				return basicSetAngleRef_TopologicalNode((TopologicalNode)otherEnd, msgs);
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNodes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				return basicSetAngleRef_TopologicalNode(null, msgs);
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return ((InternalEList<?>)getTopologicalNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				if (resolve) return getAngleRef_TopologicalNode();
				return basicGetAngleRef_TopologicalNode();
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return getTopologicalNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				setAngleRef_TopologicalNode((TopologicalNode)newValue);
				return;
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				getTopologicalNodes().clear();
				getTopologicalNodes().addAll((Collection<? extends TopologicalNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				setAngleRef_TopologicalNode((TopologicalNode)null);
				return;
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				getTopologicalNodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE:
				return angleRef_TopologicalNode != null;
			case StateVariablesPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES:
				return topologicalNodes != null && !topologicalNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TopologicalIsland
