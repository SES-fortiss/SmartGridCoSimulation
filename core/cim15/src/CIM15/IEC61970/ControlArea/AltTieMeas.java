/**
 */
package CIM15.IEC61970.ControlArea;

import CIM15.Element;

import CIM15.IEC61970.Meas.AnalogValue;
import CIM15.IEC61970.Meas.MeasPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Tie Meas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AltTieMeas extends Element {
	/**
	 * The cached value of the '{@link #getAnalogValue() <em>Analog Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogValue()
	 * @generated
	 * @ordered
	 */
	protected AnalogValue analogValue;

	/**
	 * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieFlow()
	 * @generated
	 * @ordered
	 */
	protected TieFlow tieFlow;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltTieMeas() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.ALT_TIE_MEAS;
	}

	/**
	 * Returns the value of the '<em><b>Analog Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Value</em>' reference.
	 * @see #setAnalogValue(AnalogValue)
	 * @see CIM15.IEC61970.Meas.AnalogValue#getAltTieMeas
	 * @generated
	 */
	public AnalogValue getAnalogValue() {
		if (analogValue != null && analogValue.eIsProxy()) {
			InternalEObject oldAnalogValue = (InternalEObject)analogValue;
			analogValue = (AnalogValue)eResolveProxy(oldAnalogValue);
			if (analogValue != oldAnalogValue) {
			}
		}
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue basicGetAnalogValue() {
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalogValue(AnalogValue newAnalogValue, NotificationChain msgs) {
		AnalogValue oldAnalogValue = analogValue;
		analogValue = newAnalogValue;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analog Value</em>' reference.
	 * @see #getAnalogValue()
	 * @generated
	 */
	public void setAnalogValue(AnalogValue newAnalogValue) {
		if (newAnalogValue != analogValue) {
			NotificationChain msgs = null;
			if (analogValue != null)
				msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS, AnalogValue.class, msgs);
			if (newAnalogValue != null)
				msgs = ((InternalEObject)newAnalogValue).eInverseAdd(this, MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS, AnalogValue.class, msgs);
			msgs = basicSetAnalogValue(newAnalogValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference.
	 * @see #setTieFlow(TieFlow)
	 * @see CIM15.IEC61970.ControlArea.TieFlow#getAltTieMeas
	 * @generated
	 */
	public TieFlow getTieFlow() {
		if (tieFlow != null && tieFlow.eIsProxy()) {
			InternalEObject oldTieFlow = (InternalEObject)tieFlow;
			tieFlow = (TieFlow)eResolveProxy(oldTieFlow);
			if (tieFlow != oldTieFlow) {
			}
		}
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TieFlow basicGetTieFlow() {
		return tieFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTieFlow(TieFlow newTieFlow, NotificationChain msgs) {
		TieFlow oldTieFlow = tieFlow;
		tieFlow = newTieFlow;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Flow</em>' reference.
	 * @see #getTieFlow()
	 * @generated
	 */
	public void setTieFlow(TieFlow newTieFlow) {
		if (newTieFlow != tieFlow) {
			NotificationChain msgs = null;
			if (tieFlow != null)
				msgs = ((InternalEObject)tieFlow).eInverseRemove(this, ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS, TieFlow.class, msgs);
			if (newTieFlow != null)
				msgs = ((InternalEObject)newTieFlow).eInverseAdd(this, ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS, TieFlow.class, msgs);
			msgs = basicSetTieFlow(newTieFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(int newPriority) {
		priority = newPriority;
		priorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	public void unsetPriority() {
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				if (analogValue != null)
					msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS, AnalogValue.class, msgs);
				return basicSetAnalogValue((AnalogValue)otherEnd, msgs);
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				if (tieFlow != null)
					msgs = ((InternalEObject)tieFlow).eInverseRemove(this, ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS, TieFlow.class, msgs);
				return basicSetTieFlow((TieFlow)otherEnd, msgs);
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				return basicSetAnalogValue(null, msgs);
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				return basicSetTieFlow(null, msgs);
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				if (resolve) return getAnalogValue();
				return basicGetAnalogValue();
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				if (resolve) return getTieFlow();
				return basicGetTieFlow();
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				return getPriority();
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)newValue);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				setTieFlow((TieFlow)newValue);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				setPriority((Integer)newValue);
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)null);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				setTieFlow((TieFlow)null);
				return;
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				unsetPriority();
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
			case ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE:
				return analogValue != null;
			case ControlAreaPackage.ALT_TIE_MEAS__TIE_FLOW:
				return tieFlow != null;
			case ControlAreaPackage.ALT_TIE_MEAS__PRIORITY:
				return isSetPriority();
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
		result.append(" (priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AltTieMeas
