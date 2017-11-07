/**
 */
package CIM15.IEC61970.StateVariables;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.Terminal;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sv Power Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}</li>
 *   <li>{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SvPowerFlow extends StateVariable {
	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The default value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected static final float P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected float p = P_EDEFAULT;

	/**
	 * This is true if the P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pESet;

	/**
	 * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected static final float Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected float q = Q_EDEFAULT;

	/**
	 * This is true if the Q attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SvPowerFlow() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateVariablesPackage.Literals.SV_POWER_FLOW;
	}

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getSvPowerFlow
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__SV_POWER_FLOW, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__SV_POWER_FLOW, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #isSetP()
	 * @see #unsetP()
	 * @see #setP(float)
	 * @generated
	 */
	public float getP() {
		return p;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #isSetP()
	 * @see #unsetP()
	 * @see #getP()
	 * @generated
	 */
	public void setP(float newP) {
		p = newP;
		pESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetP()
	 * @see #getP()
	 * @see #setP(float)
	 * @generated
	 */
	public void unsetP() {
		p = P_EDEFAULT;
		pESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getP <em>P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>P</em>' attribute is set.
	 * @see #unsetP()
	 * @see #getP()
	 * @see #setP(float)
	 * @generated
	 */
	public boolean isSetP() {
		return pESet;
	}

	/**
	 * Returns the value of the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' attribute.
	 * @see #isSetQ()
	 * @see #unsetQ()
	 * @see #setQ(float)
	 * @generated
	 */
	public float getQ() {
		return q;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' attribute.
	 * @see #isSetQ()
	 * @see #unsetQ()
	 * @see #getQ()
	 * @generated
	 */
	public void setQ(float newQ) {
		q = newQ;
		qESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQ()
	 * @see #getQ()
	 * @see #setQ(float)
	 * @generated
	 */
	public void unsetQ() {
		q = Q_EDEFAULT;
		qESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getQ <em>Q</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Q</em>' attribute is set.
	 * @see #unsetQ()
	 * @see #getQ()
	 * @see #setQ(float)
	 * @generated
	 */
	public boolean isSetQ() {
		return qESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__SV_POWER_FLOW, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				return basicSetTerminal(null, msgs);
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case StateVariablesPackage.SV_POWER_FLOW__P:
				return getP();
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				return getQ();
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case StateVariablesPackage.SV_POWER_FLOW__P:
				setP((Float)newValue);
				return;
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				setQ((Float)newValue);
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case StateVariablesPackage.SV_POWER_FLOW__P:
				unsetP();
				return;
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				unsetQ();
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
			case StateVariablesPackage.SV_POWER_FLOW__TERMINAL:
				return terminal != null;
			case StateVariablesPackage.SV_POWER_FLOW__P:
				return isSetP();
			case StateVariablesPackage.SV_POWER_FLOW__Q:
				return isSetQ();
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
		result.append(" (p: ");
		if (pESet) result.append(p); else result.append("<unset>");
		result.append(", q: ");
		if (qESet) result.append(q); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SvPowerFlow
