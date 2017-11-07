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
 * A representation of the model object '<em><b>Sv Short Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvShortCircuit extends StateVariable {
	/**
	 * The default value of the '{@link #getSShortCircuit() <em>SShort Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSShortCircuit()
	 * @generated
	 * @ordered
	 */
	protected static final float SSHORT_CIRCUIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSShortCircuit() <em>SShort Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSShortCircuit()
	 * @generated
	 * @ordered
	 */
	protected float sShortCircuit = SSHORT_CIRCUIT_EDEFAULT;

	/**
	 * This is true if the SShort Circuit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sShortCircuitESet;

	/**
	 * The default value of the '{@link #getR0PerR() <em>R0 Per R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0PerR()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_PER_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0PerR() <em>R0 Per R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0PerR()
	 * @generated
	 * @ordered
	 */
	protected float r0PerR = R0_PER_R_EDEFAULT;

	/**
	 * This is true if the R0 Per R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean r0PerRESet;

	/**
	 * The default value of the '{@link #getX0PerX() <em>X0 Per X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0PerX()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_PER_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0PerX() <em>X0 Per X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0PerX()
	 * @generated
	 * @ordered
	 */
	protected float x0PerX = X0_PER_X_EDEFAULT;

	/**
	 * This is true if the X0 Per X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x0PerXESet;

	/**
	 * The default value of the '{@link #getXPerR() <em>XPer R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPerR()
	 * @generated
	 * @ordered
	 */
	protected static final float XPER_R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXPerR() <em>XPer R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPerR()
	 * @generated
	 * @ordered
	 */
	protected float xPerR = XPER_R_EDEFAULT;

	/**
	 * This is true if the XPer R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xPerRESet;

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
	protected SvShortCircuit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_SHORT_CIRCUIT;
	}

	/**
	 * Returns the value of the '<em><b>SShort Circuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SShort Circuit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SShort Circuit</em>' attribute.
	 * @see #isSetSShortCircuit()
	 * @see #unsetSShortCircuit()
	 * @see #setSShortCircuit(float)
	 * @generated
	 */
	public float getSShortCircuit() {
		return sShortCircuit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SShort Circuit</em>' attribute.
	 * @see #isSetSShortCircuit()
	 * @see #unsetSShortCircuit()
	 * @see #getSShortCircuit()
	 * @generated
	 */
	public void setSShortCircuit(float newSShortCircuit) {
		sShortCircuit = newSShortCircuit;
		sShortCircuitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSShortCircuit()
	 * @see #getSShortCircuit()
	 * @see #setSShortCircuit(float)
	 * @generated
	 */
	public void unsetSShortCircuit() {
		sShortCircuit = SSHORT_CIRCUIT_EDEFAULT;
		sShortCircuitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getSShortCircuit <em>SShort Circuit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SShort Circuit</em>' attribute is set.
	 * @see #unsetSShortCircuit()
	 * @see #getSShortCircuit()
	 * @see #setSShortCircuit(float)
	 * @generated
	 */
	public boolean isSetSShortCircuit() {
		return sShortCircuitESet;
	}

	/**
	 * Returns the value of the '<em><b>R0 Per R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0 Per R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0 Per R</em>' attribute.
	 * @see #isSetR0PerR()
	 * @see #unsetR0PerR()
	 * @see #setR0PerR(float)
	 * @generated
	 */
	public float getR0PerR() {
		return r0PerR;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0 Per R</em>' attribute.
	 * @see #isSetR0PerR()
	 * @see #unsetR0PerR()
	 * @see #getR0PerR()
	 * @generated
	 */
	public void setR0PerR(float newR0PerR) {
		r0PerR = newR0PerR;
		r0PerRESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR0PerR()
	 * @see #getR0PerR()
	 * @see #setR0PerR(float)
	 * @generated
	 */
	public void unsetR0PerR() {
		r0PerR = R0_PER_R_EDEFAULT;
		r0PerRESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getR0PerR <em>R0 Per R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R0 Per R</em>' attribute is set.
	 * @see #unsetR0PerR()
	 * @see #getR0PerR()
	 * @see #setR0PerR(float)
	 * @generated
	 */
	public boolean isSetR0PerR() {
		return r0PerRESet;
	}

	/**
	 * Returns the value of the '<em><b>X0 Per X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0 Per X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0 Per X</em>' attribute.
	 * @see #isSetX0PerX()
	 * @see #unsetX0PerX()
	 * @see #setX0PerX(float)
	 * @generated
	 */
	public float getX0PerX() {
		return x0PerX;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0 Per X</em>' attribute.
	 * @see #isSetX0PerX()
	 * @see #unsetX0PerX()
	 * @see #getX0PerX()
	 * @generated
	 */
	public void setX0PerX(float newX0PerX) {
		x0PerX = newX0PerX;
		x0PerXESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX0PerX()
	 * @see #getX0PerX()
	 * @see #setX0PerX(float)
	 * @generated
	 */
	public void unsetX0PerX() {
		x0PerX = X0_PER_X_EDEFAULT;
		x0PerXESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getX0PerX <em>X0 Per X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X0 Per X</em>' attribute is set.
	 * @see #unsetX0PerX()
	 * @see #getX0PerX()
	 * @see #setX0PerX(float)
	 * @generated
	 */
	public boolean isSetX0PerX() {
		return x0PerXESet;
	}

	/**
	 * Returns the value of the '<em><b>XPer R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPer R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPer R</em>' attribute.
	 * @see #isSetXPerR()
	 * @see #unsetXPerR()
	 * @see #setXPerR(float)
	 * @generated
	 */
	public float getXPerR() {
		return xPerR;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPer R</em>' attribute.
	 * @see #isSetXPerR()
	 * @see #unsetXPerR()
	 * @see #getXPerR()
	 * @generated
	 */
	public void setXPerR(float newXPerR) {
		xPerR = newXPerR;
		xPerRESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXPerR()
	 * @see #getXPerR()
	 * @see #setXPerR(float)
	 * @generated
	 */
	public void unsetXPerR() {
		xPerR = XPER_R_EDEFAULT;
		xPerRESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getXPerR <em>XPer R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XPer R</em>' attribute is set.
	 * @see #unsetXPerR()
	 * @see #getXPerR()
	 * @see #setXPerR(float)
	 * @generated
	 */
	public boolean isSetXPerR() {
		return xPerRESet;
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getSvShortCircuit <em>Sv Short Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getSvShortCircuit
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
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvShortCircuit#getTopologicalNode <em>Topological Node</em>}' reference.
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
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, TopologicalNode.class, msgs);
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__SV_SHORT_CIRCUIT, TopologicalNode.class, msgs);
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				return getSShortCircuit();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				return getR0PerR();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				return getX0PerX();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				return getXPerR();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				setSShortCircuit((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				setR0PerR((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				setX0PerX((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				setXPerR((Float)newValue);
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				unsetSShortCircuit();
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				unsetR0PerR();
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				unsetX0PerX();
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				unsetXPerR();
				return;
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
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
			case StateVariablesPackage.SV_SHORT_CIRCUIT__SSHORT_CIRCUIT:
				return isSetSShortCircuit();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__R0_PER_R:
				return isSetR0PerR();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__X0_PER_X:
				return isSetX0PerX();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__XPER_R:
				return isSetXPerR();
			case StateVariablesPackage.SV_SHORT_CIRCUIT__TOPOLOGICAL_NODE:
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
		result.append(" (sShortCircuit: ");
		if (sShortCircuitESet) result.append(sShortCircuit); else result.append("<unset>");
		result.append(", r0PerR: ");
		if (r0PerRESet) result.append(r0PerR); else result.append("<unset>");
		result.append(", x0PerX: ");
		if (x0PerXESet) result.append(x0PerX); else result.append("<unset>");
		result.append(", xPerR: ");
		if (xPerRESet) result.append(xPerR); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SvShortCircuit
