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
 * A representation of the model object '<em><b>Alt Generating Unit Meas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AltGeneratingUnitMeas extends Element {
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
	 * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ControlAreaGeneratingUnit controlAreaGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltGeneratingUnitMeas() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.ALT_GENERATING_UNIT_MEAS;
	}

	/**
	 * Returns the value of the '<em><b>Analog Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Value</em>' reference.
	 * @see #setAnalogValue(AnalogValue)
	 * @see CIM15.IEC61970.Meas.AnalogValue#getAltGeneratingUnit
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
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}' reference.
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
				msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs);
			if (newAnalogValue != null)
				msgs = ((InternalEObject)newAnalogValue).eInverseAdd(this, MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs);
			msgs = basicSetAnalogValue(newAnalogValue, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference.
	 * @see #setControlAreaGeneratingUnit(ControlAreaGeneratingUnit)
	 * @see CIM15.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas
	 * @generated
	 */
	public ControlAreaGeneratingUnit getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnit != null && controlAreaGeneratingUnit.eIsProxy()) {
			InternalEObject oldControlAreaGeneratingUnit = (InternalEObject)controlAreaGeneratingUnit;
			controlAreaGeneratingUnit = (ControlAreaGeneratingUnit)eResolveProxy(oldControlAreaGeneratingUnit);
			if (controlAreaGeneratingUnit != oldControlAreaGeneratingUnit) {
			}
		}
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaGeneratingUnit basicGetControlAreaGeneratingUnit() {
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlAreaGeneratingUnit(ControlAreaGeneratingUnit newControlAreaGeneratingUnit, NotificationChain msgs) {
		ControlAreaGeneratingUnit oldControlAreaGeneratingUnit = controlAreaGeneratingUnit;
		controlAreaGeneratingUnit = newControlAreaGeneratingUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area Generating Unit</em>' reference.
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	public void setControlAreaGeneratingUnit(ControlAreaGeneratingUnit newControlAreaGeneratingUnit) {
		if (newControlAreaGeneratingUnit != controlAreaGeneratingUnit) {
			NotificationChain msgs = null;
			if (controlAreaGeneratingUnit != null)
				msgs = ((InternalEObject)controlAreaGeneratingUnit).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaGeneratingUnit.class, msgs);
			if (newControlAreaGeneratingUnit != null)
				msgs = ((InternalEObject)newControlAreaGeneratingUnit).eInverseAdd(this, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaGeneratingUnit.class, msgs);
			msgs = basicSetControlAreaGeneratingUnit(newControlAreaGeneratingUnit, msgs);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				if (analogValue != null)
					msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs);
				return basicSetAnalogValue((AnalogValue)otherEnd, msgs);
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				if (controlAreaGeneratingUnit != null)
					msgs = ((InternalEObject)controlAreaGeneratingUnit).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaGeneratingUnit.class, msgs);
				return basicSetControlAreaGeneratingUnit((ControlAreaGeneratingUnit)otherEnd, msgs);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				return basicSetAnalogValue(null, msgs);
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				return basicSetControlAreaGeneratingUnit(null, msgs);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				if (resolve) return getAnalogValue();
				return basicGetAnalogValue();
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				return getPriority();
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				if (resolve) return getControlAreaGeneratingUnit();
				return basicGetControlAreaGeneratingUnit();
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)newValue);
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				setControlAreaGeneratingUnit((ControlAreaGeneratingUnit)newValue);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)null);
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				unsetPriority();
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				setControlAreaGeneratingUnit((ControlAreaGeneratingUnit)null);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				return analogValue != null;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				return isSetPriority();
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				return controlAreaGeneratingUnit != null;
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

} // AltGeneratingUnitMeas
