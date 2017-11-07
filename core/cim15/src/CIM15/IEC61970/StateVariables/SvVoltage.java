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
 * A representation of the model object '<em><b>Sv Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvVoltage#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvVoltage extends StateVariable {
	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final float ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected float angle = ANGLE_EDEFAULT;

	/**
	 * This is true if the Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angleESet;

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
	 * The default value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected static final float V_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected float v = V_EDEFAULT;

	/**
	 * This is true if the V attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvVoltage() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_VOLTAGE;
	}

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #setAngle(float)
	 * @generated
	 */
	public float getAngle() {
		return angle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #isSetAngle()
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @generated
	 */
	public void setAngle(float newAngle) {
		angle = newAngle;
		angleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngle()
	 * @see #getAngle()
	 * @see #setAngle(float)
	 * @generated
	 */
	public void unsetAngle() {
		angle = ANGLE_EDEFAULT;
		angleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvVoltage#getAngle <em>Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle</em>' attribute is set.
	 * @see #unsetAngle()
	 * @see #getAngle()
	 * @see #setAngle(float)
	 * @generated
	 */
	public boolean isSetAngle() {
		return angleESet;
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getSvVoltage
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
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvVoltage#getTopologicalNode <em>Topological Node</em>}' reference.
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
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #isSetV()
	 * @see #unsetV()
	 * @see #setV(float)
	 * @generated
	 */
	public float getV() {
		return v;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #isSetV()
	 * @see #unsetV()
	 * @see #getV()
	 * @generated
	 */
	public void setV(float newV) {
		v = newV;
		vESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetV()
	 * @see #getV()
	 * @see #setV(float)
	 * @generated
	 */
	public void unsetV() {
		v = V_EDEFAULT;
		vESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvVoltage#getV <em>V</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>V</em>' attribute is set.
	 * @see #unsetV()
	 * @see #getV()
	 * @see #setV(float)
	 * @generated
	 */
	public boolean isSetV() {
		return vESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, TopologicalNode.class, msgs);
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
			case StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
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
			case StateVariablesPackage.SV_VOLTAGE__ANGLE:
				return getAngle();
			case StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
			case StateVariablesPackage.SV_VOLTAGE__V:
				return getV();
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
			case StateVariablesPackage.SV_VOLTAGE__ANGLE:
				setAngle((Float)newValue);
				return;
			case StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
				return;
			case StateVariablesPackage.SV_VOLTAGE__V:
				setV((Float)newValue);
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
			case StateVariablesPackage.SV_VOLTAGE__ANGLE:
				unsetAngle();
				return;
			case StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
				return;
			case StateVariablesPackage.SV_VOLTAGE__V:
				unsetV();
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
			case StateVariablesPackage.SV_VOLTAGE__ANGLE:
				return isSetAngle();
			case StateVariablesPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
				return topologicalNode != null;
			case StateVariablesPackage.SV_VOLTAGE__V:
				return isSetV();
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
		result.append(" (angle: ");
		if (angleESet) result.append(angle); else result.append("<unset>");
		result.append(", v: ");
		if (vESet) result.append(v); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SvVoltage
