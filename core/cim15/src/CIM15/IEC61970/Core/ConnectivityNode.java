/**
 */
package CIM15.IEC61970.Core;

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
 * A representation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConnectivityNode#getTerminals <em>Terminals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectivityNode extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected TopologicalNode topologicalNode;

	/**
	 * The cached value of the '{@link #getConnectivityNodeContainer() <em>Connectivity Node Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 * @ordered
	 */
	protected ConnectivityNodeContainer connectivityNodeContainer;

	/**
	 * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityNode() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONNECTIVITY_NODE;
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getConnectivityNodes
	 * @generated
	 */
	public TopologicalNode getTopologicalNode() {
		if (topologicalNode != null && topologicalNode.eIsProxy()) {
			InternalEObject oldTopologicalNode = (InternalEObject)topologicalNode;
			topologicalNode = (TopologicalNode)eResolveProxy(oldTopologicalNode);
			if (topologicalNode != oldTopologicalNode) {
			}
		}
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalNode basicGetTopologicalNode() {
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologicalNode(TopologicalNode newTopologicalNode, NotificationChain msgs) {
		TopologicalNode oldTopologicalNode = topologicalNode;
		topologicalNode = newTopologicalNode;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Node</em>' reference.
	 * @see #getTopologicalNode()
	 * @generated
	 */
	public void setTopologicalNode(TopologicalNode newTopologicalNode) {
		if (newTopologicalNode != topologicalNode) {
			NotificationChain msgs = null;
			if (topologicalNode != null)
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Connectivity Node Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes <em>Connectivity Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node Container</em>' reference.
	 * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
	 * @see CIM15.IEC61970.Core.ConnectivityNodeContainer#getConnectivityNodes
	 * @generated
	 */
	public ConnectivityNodeContainer getConnectivityNodeContainer() {
		if (connectivityNodeContainer != null && connectivityNodeContainer.eIsProxy()) {
			InternalEObject oldConnectivityNodeContainer = (InternalEObject)connectivityNodeContainer;
			connectivityNodeContainer = (ConnectivityNodeContainer)eResolveProxy(oldConnectivityNodeContainer);
			if (connectivityNodeContainer != oldConnectivityNodeContainer) {
			}
		}
		return connectivityNodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer basicGetConnectivityNodeContainer() {
		return connectivityNodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivityNodeContainer(ConnectivityNodeContainer newConnectivityNodeContainer, NotificationChain msgs) {
		ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
		connectivityNodeContainer = newConnectivityNodeContainer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.ConnectivityNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node Container</em>' reference.
	 * @see #getConnectivityNodeContainer()
	 * @generated
	 */
	public void setConnectivityNodeContainer(ConnectivityNodeContainer newConnectivityNodeContainer) {
		if (newConnectivityNodeContainer != connectivityNodeContainer) {
			NotificationChain msgs = null;
			if (connectivityNodeContainer != null)
				msgs = ((InternalEObject)connectivityNodeContainer).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
			if (newConnectivityNodeContainer != null)
				msgs = ((InternalEObject)newConnectivityNodeContainer).eInverseAdd(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
			msgs = basicSetConnectivityNodeContainer(newConnectivityNodeContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Terminal}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see CIM15.IEC61970.Core.Terminal#getConnectivityNode
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		if (terminals == null) {
			terminals = new BasicInternalEList<Terminal>(Terminal.class);
		}
		return terminals;
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
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs);
				return basicSetTopologicalNode((TopologicalNode)otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				if (connectivityNodeContainer != null)
					msgs = ((InternalEObject)connectivityNodeContainer).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs);
				return basicSetConnectivityNodeContainer((ConnectivityNodeContainer)otherEnd, msgs);
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminals()).basicAdd(otherEnd, msgs);
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
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				return basicSetTopologicalNode(null, msgs);
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				return basicSetConnectivityNodeContainer(null, msgs);
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return ((InternalEList<?>)getTerminals()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				if (resolve) return getConnectivityNodeContainer();
				return basicGetConnectivityNodeContainer();
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return getTerminals();
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
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				setConnectivityNodeContainer((ConnectivityNodeContainer)newValue);
				return;
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				getTerminals().clear();
				getTerminals().addAll((Collection<? extends Terminal>)newValue);
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
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
				return;
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				setConnectivityNodeContainer((ConnectivityNodeContainer)null);
				return;
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				getTerminals().clear();
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
			case CorePackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
				return topologicalNode != null;
			case CorePackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
				return connectivityNodeContainer != null;
			case CorePackage.CONNECTIVITY_NODE__TERMINALS:
				return terminals != null && !terminals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ConnectivityNode
