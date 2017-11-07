/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.Topology.TopologicalNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Node Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectivityNodeContainer extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologicalNode> topologicalNode;

	/**
	 * The cached value of the '{@link #getConnectivityNodes() <em>Connectivity Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectivityNode> connectivityNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityNodeContainer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONNECTIVITY_NODE_CONTAINER;
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference list.
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getConnectivityNodeContainer
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNode() {
		if (topologicalNode == null) {
			topologicalNode = new BasicInternalEList<TopologicalNode>(TopologicalNode.class);
		}
		return topologicalNode;
	}

	/**
	 * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.ConnectivityNode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Nodes</em>' reference list.
	 * @see CIM15.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer
	 * @generated
	 */
	public EList<ConnectivityNode> getConnectivityNodes() {
		if (connectivityNodes == null) {
			connectivityNodes = new BasicInternalEList<ConnectivityNode>(ConnectivityNode.class);
		}
		return connectivityNodes;
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNode()).basicAdd(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivityNodes()).basicAdd(otherEnd, msgs);
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return ((InternalEList<?>)getTopologicalNode()).basicRemove(otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return ((InternalEList<?>)getConnectivityNodes()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return getTopologicalNode();
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return getConnectivityNodes();
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				getTopologicalNode().addAll((Collection<? extends TopologicalNode>)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
				getConnectivityNodes().addAll((Collection<? extends ConnectivityNode>)newValue);
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				return;
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				getConnectivityNodes().clear();
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
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE:
				return topologicalNode != null && !topologicalNode.isEmpty();
			case CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES:
				return connectivityNodes != null && !connectivityNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConnectivityNodeContainer
