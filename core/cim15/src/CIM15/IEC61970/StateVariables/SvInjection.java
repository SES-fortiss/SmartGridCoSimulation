/**
 */
package CIM15.IEC61970.StateVariables;

import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Topology.TopologyPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvInjection#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvInjection extends StateVariable {
	/**
	 * The default value of the '{@link #getPNetInjection() <em>PNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPNetInjection()
	 * @generated
	 * @ordered
	 */
	protected static final float PNET_INJECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPNetInjection() <em>PNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPNetInjection()
	 * @generated
	 * @ordered
	 */
	protected float pNetInjection = PNET_INJECTION_EDEFAULT;

	/**
	 * This is true if the PNet Injection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pNetInjectionESet;

	/**
	 * The default value of the '{@link #getQNetInjection() <em>QNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQNetInjection()
	 * @generated
	 * @ordered
	 */
	protected static final float QNET_INJECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQNetInjection() <em>QNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQNetInjection()
	 * @generated
	 * @ordered
	 */
	protected float qNetInjection = QNET_INJECTION_EDEFAULT;

	/**
	 * This is true if the QNet Injection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qNetInjectionESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvInjection() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_INJECTION;
	}

	/**
	 * Returns the value of the '<em><b>PNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PNet Injection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PNet Injection</em>' attribute.
	 * @see #isSetPNetInjection()
	 * @see #unsetPNetInjection()
	 * @see #setPNetInjection(float)
	 * @generated
	 */
	public float getPNetInjection() {
		return pNetInjection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PNet Injection</em>' attribute.
	 * @see #isSetPNetInjection()
	 * @see #unsetPNetInjection()
	 * @see #getPNetInjection()
	 * @generated
	 */
	public void setPNetInjection(float newPNetInjection) {
		pNetInjection = newPNetInjection;
		pNetInjectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPNetInjection()
	 * @see #getPNetInjection()
	 * @see #setPNetInjection(float)
	 * @generated
	 */
	public void unsetPNetInjection() {
		pNetInjection = PNET_INJECTION_EDEFAULT;
		pNetInjectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvInjection#getPNetInjection <em>PNet Injection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PNet Injection</em>' attribute is set.
	 * @see #unsetPNetInjection()
	 * @see #getPNetInjection()
	 * @see #setPNetInjection(float)
	 * @generated
	 */
	public boolean isSetPNetInjection() {
		return pNetInjectionESet;
	}

	/**
	 * Returns the value of the '<em><b>QNet Injection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QNet Injection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QNet Injection</em>' attribute.
	 * @see #isSetQNetInjection()
	 * @see #unsetQNetInjection()
	 * @see #setQNetInjection(float)
	 * @generated
	 */
	public float getQNetInjection() {
		return qNetInjection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QNet Injection</em>' attribute.
	 * @see #isSetQNetInjection()
	 * @see #unsetQNetInjection()
	 * @see #getQNetInjection()
	 * @generated
	 */
	public void setQNetInjection(float newQNetInjection) {
		qNetInjection = newQNetInjection;
		qNetInjectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQNetInjection()
	 * @see #getQNetInjection()
	 * @see #setQNetInjection(float)
	 * @generated
	 */
	public void unsetQNetInjection() {
		qNetInjection = QNET_INJECTION_EDEFAULT;
		qNetInjectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvInjection#getQNetInjection <em>QNet Injection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QNet Injection</em>' attribute is set.
	 * @see #unsetQNetInjection()
	 * @see #getQNetInjection()
	 * @see #setQNetInjection(float)
	 * @generated
	 */
	public boolean isSetQNetInjection() {
		return qNetInjectionESet;
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getSvInjection <em>Sv Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getSvInjection
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
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvInjection#getTopologicalNode <em>Topological Node</em>}' reference.
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
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs);
				return basicSetTopologicalNode((TopologicalNode)otherEnd, msgs);
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
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				return basicSetTopologicalNode(null, msgs);
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
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				return getPNetInjection();
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				return getQNetInjection();
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				setPNetInjection((Float)newValue);
				return;
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				setQNetInjection((Float)newValue);
				return;
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
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
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				unsetPNetInjection();
				return;
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				unsetQNetInjection();
				return;
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
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
			case StateVariablesPackage.SV_INJECTION__PNET_INJECTION:
				return isSetPNetInjection();
			case StateVariablesPackage.SV_INJECTION__QNET_INJECTION:
				return isSetQNetInjection();
			case StateVariablesPackage.SV_INJECTION__TOPOLOGICAL_NODE:
				return topologicalNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pNetInjection: ");
		if (pNetInjectionESet) result.append(pNetInjection); else result.append("<unset>");
		result.append(", qNetInjection: ");
		if (qNetInjectionESet) result.append(qNetInjection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SvInjection
