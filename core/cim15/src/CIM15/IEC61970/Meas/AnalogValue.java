/**
 */
package CIM15.IEC61970.Meas;

import CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas;
import CIM15.IEC61970.ControlArea.AltTieMeas;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalogValue extends MeasurementValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The cached value of the '{@link #getAltTieMeas() <em>Alt Tie Meas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltTieMeas()
	 * @generated
	 * @ordered
	 */
	protected EList<AltTieMeas> altTieMeas;

	/**
	 * The cached value of the '{@link #getAnalog() <em>Analog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalog()
	 * @generated
	 * @ordered
	 */
	protected Analog analog;

	/**
	 * The cached value of the '{@link #getAltGeneratingUnit() <em>Alt Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<AltGeneratingUnitMeas> altGeneratingUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogValue() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG_VALUE;
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(float newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Meas.AnalogValue#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(float)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * Returns the value of the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.AltTieMeas}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Tie Meas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Tie Meas</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.AltTieMeas#getAnalogValue
	 * @generated
	 */
	public EList<AltTieMeas> getAltTieMeas() {
		if (altTieMeas == null) {
			altTieMeas = new BasicInternalEList<AltTieMeas>(AltTieMeas.class);
		}
		return altTieMeas;
	}

	/**
	 * Returns the value of the '<em><b>Analog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Analog#getAnalogValues <em>Analog Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog</em>' reference.
	 * @see #setAnalog(Analog)
	 * @see CIM15.IEC61970.Meas.Analog#getAnalogValues
	 * @generated
	 */
	public Analog getAnalog() {
		if (analog != null && analog.eIsProxy()) {
			InternalEObject oldAnalog = (InternalEObject)analog;
			analog = (Analog)eResolveProxy(oldAnalog);
			if (analog != oldAnalog) {
			}
		}
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog basicGetAnalog() {
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalog(Analog newAnalog, NotificationChain msgs) {
		Analog oldAnalog = analog;
		analog = newAnalog;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Meas.AnalogValue#getAnalog <em>Analog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analog</em>' reference.
	 * @see #getAnalog()
	 * @generated
	 */
	public void setAnalog(Analog newAnalog) {
		if (newAnalog != analog) {
			NotificationChain msgs = null;
			if (analog != null)
				msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs);
			if (newAnalog != null)
				msgs = ((InternalEObject)newAnalog).eInverseAdd(this, MeasPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs);
			msgs = basicSetAnalog(newAnalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Alt Generating Unit</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Generating Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Generating Unit</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue
	 * @generated
	 */
	public EList<AltGeneratingUnitMeas> getAltGeneratingUnit() {
		if (altGeneratingUnit == null) {
			altGeneratingUnit = new BasicInternalEList<AltGeneratingUnitMeas>(AltGeneratingUnitMeas.class);
		}
		return altGeneratingUnit;
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
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltTieMeas()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG_VALUE__ANALOG:
				if (analog != null)
					msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs);
				return basicSetAnalog((Analog)otherEnd, msgs);
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltGeneratingUnit()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return ((InternalEList<?>)getAltTieMeas()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG_VALUE__ANALOG:
				return basicSetAnalog(null, msgs);
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return ((InternalEList<?>)getAltGeneratingUnit()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.ANALOG_VALUE__VALUE:
				return getValue();
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return getAltTieMeas();
			case MeasPackage.ANALOG_VALUE__ANALOG:
				if (resolve) return getAnalog();
				return basicGetAnalog();
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return getAltGeneratingUnit();
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
			case MeasPackage.ANALOG_VALUE__VALUE:
				setValue((Float)newValue);
				return;
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				getAltTieMeas().addAll((Collection<? extends AltTieMeas>)newValue);
				return;
			case MeasPackage.ANALOG_VALUE__ANALOG:
				setAnalog((Analog)newValue);
				return;
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				getAltGeneratingUnit().clear();
				getAltGeneratingUnit().addAll((Collection<? extends AltGeneratingUnitMeas>)newValue);
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
			case MeasPackage.ANALOG_VALUE__VALUE:
				unsetValue();
				return;
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				return;
			case MeasPackage.ANALOG_VALUE__ANALOG:
				setAnalog((Analog)null);
				return;
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				getAltGeneratingUnit().clear();
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
			case MeasPackage.ANALOG_VALUE__VALUE:
				return isSetValue();
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return altTieMeas != null && !altTieMeas.isEmpty();
			case MeasPackage.ANALOG_VALUE__ANALOG:
				return analog != null;
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return altGeneratingUnit != null && !altGeneratingUnit.isEmpty();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AnalogValue
