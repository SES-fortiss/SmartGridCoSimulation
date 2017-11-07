/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Meas.MeasPackage;
import CIM15.IEC61970.Meas.MeasurementValue;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gml Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlValue extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlObservation() <em>Gml Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlObservation()
	 * @generated
	 * @ordered
	 */
	protected GmlObservation gmlObservation;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateTimeESet;

	/**
	 * The default value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriod()
	 * @generated
	 * @ordered
	 */
	protected String timePeriod = TIME_PERIOD_EDEFAULT;

	/**
	 * This is true if the Time Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timePeriodESet;

	/**
	 * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValue()
	 * @generated
	 * @ordered
	 */
	protected MeasurementValue measurementValue;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlValue() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_VALUE;
	}

	/**
	 * Returns the value of the '<em><b>Gml Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Observation</em>' reference.
	 * @see #setGmlObservation(GmlObservation)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues
	 * @generated
	 */
	public GmlObservation getGmlObservation() {
		if (gmlObservation != null && gmlObservation.eIsProxy()) {
			InternalEObject oldGmlObservation = (InternalEObject)gmlObservation;
			gmlObservation = (GmlObservation)eResolveProxy(oldGmlObservation);
			if (gmlObservation != oldGmlObservation) {
			}
		}
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlObservation basicGetGmlObservation() {
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlObservation(GmlObservation newGmlObservation, NotificationChain msgs) {
		GmlObservation oldGmlObservation = gmlObservation;
		gmlObservation = newGmlObservation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Observation</em>' reference.
	 * @see #getGmlObservation()
	 * @generated
	 */
	public void setGmlObservation(GmlObservation newGmlObservation) {
		if (newGmlObservation != gmlObservation) {
			NotificationChain msgs = null;
			if (gmlObservation != null)
				msgs = ((InternalEObject)gmlObservation).eInverseRemove(this, InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES, GmlObservation.class, msgs);
			if (newGmlObservation != null)
				msgs = ((InternalEObject)newGmlObservation).eInverseAdd(this, InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES, GmlObservation.class, msgs);
			msgs = basicSetGmlObservation(newGmlObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		dateTime = newDateTime;
		dateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public void unsetDateTime() {
		dateTime = DATE_TIME_EDEFAULT;
		dateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getDateTime <em>Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date Time</em>' attribute is set.
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public boolean isSetDateTime() {
		return dateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Time Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Period</em>' attribute.
	 * @see #isSetTimePeriod()
	 * @see #unsetTimePeriod()
	 * @see #setTimePeriod(String)
	 * @generated
	 */
	public String getTimePeriod() {
		return timePeriod;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Period</em>' attribute.
	 * @see #isSetTimePeriod()
	 * @see #unsetTimePeriod()
	 * @see #getTimePeriod()
	 * @generated
	 */
	public void setTimePeriod(String newTimePeriod) {
		timePeriod = newTimePeriod;
		timePeriodESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimePeriod()
	 * @see #getTimePeriod()
	 * @see #setTimePeriod(String)
	 * @generated
	 */
	public void unsetTimePeriod() {
		timePeriod = TIME_PERIOD_EDEFAULT;
		timePeriodESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getTimePeriod <em>Time Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Period</em>' attribute is set.
	 * @see #unsetTimePeriod()
	 * @see #getTimePeriod()
	 * @see #setTimePeriod(String)
	 * @generated
	 */
	public boolean isSetTimePeriod() {
		return timePeriodESet;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.MeasurementValue#getGmlValues <em>Gml Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value</em>' reference.
	 * @see #setMeasurementValue(MeasurementValue)
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getGmlValues
	 * @generated
	 */
	public MeasurementValue getMeasurementValue() {
		if (measurementValue != null && measurementValue.eIsProxy()) {
			InternalEObject oldMeasurementValue = (InternalEObject)measurementValue;
			measurementValue = (MeasurementValue)eResolveProxy(oldMeasurementValue);
			if (measurementValue != oldMeasurementValue) {
			}
		}
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementValue basicGetMeasurementValue() {
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementValue(MeasurementValue newMeasurementValue, NotificationChain msgs) {
		MeasurementValue oldMeasurementValue = measurementValue;
		measurementValue = newMeasurementValue;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getMeasurementValue <em>Measurement Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Value</em>' reference.
	 * @see #getMeasurementValue()
	 * @generated
	 */
	public void setMeasurementValue(MeasurementValue newMeasurementValue) {
		if (newMeasurementValue != measurementValue) {
			NotificationChain msgs = null;
			if (measurementValue != null)
				msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__GML_VALUES, MeasurementValue.class, msgs);
			if (newMeasurementValue != null)
				msgs = ((InternalEObject)newMeasurementValue).eInverseAdd(this, MeasPackage.MEASUREMENT_VALUE__GML_VALUES, MeasurementValue.class, msgs);
			msgs = basicSetMeasurementValue(newMeasurementValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getValue <em>Value</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				if (gmlObservation != null)
					msgs = ((InternalEObject)gmlObservation).eInverseRemove(this, InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES, GmlObservation.class, msgs);
				return basicSetGmlObservation((GmlObservation)otherEnd, msgs);
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				if (measurementValue != null)
					msgs = ((InternalEObject)measurementValue).eInverseRemove(this, MeasPackage.MEASUREMENT_VALUE__GML_VALUES, MeasurementValue.class, msgs);
				return basicSetMeasurementValue((MeasurementValue)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				return basicSetGmlObservation(null, msgs);
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				return basicSetMeasurementValue(null, msgs);
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
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				if (resolve) return getGmlObservation();
				return basicGetGmlObservation();
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				return getDateTime();
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				return getTimePeriod();
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				if (resolve) return getMeasurementValue();
				return basicGetMeasurementValue();
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				return getValue();
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
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				setGmlObservation((GmlObservation)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				setTimePeriod((String)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)newValue);
				return;
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				setValue((Float)newValue);
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
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				setGmlObservation((GmlObservation)null);
				return;
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				unsetDateTime();
				return;
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				unsetTimePeriod();
				return;
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				setMeasurementValue((MeasurementValue)null);
				return;
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				unsetValue();
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
			case InfGMLSupportPackage.GML_VALUE__GML_OBSERVATION:
				return gmlObservation != null;
			case InfGMLSupportPackage.GML_VALUE__DATE_TIME:
				return isSetDateTime();
			case InfGMLSupportPackage.GML_VALUE__TIME_PERIOD:
				return isSetTimePeriod();
			case InfGMLSupportPackage.GML_VALUE__MEASUREMENT_VALUE:
				return measurementValue != null;
			case InfGMLSupportPackage.GML_VALUE__VALUE:
				return isSetValue();
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
		result.append(" (dateTime: ");
		if (dateTimeESet) result.append(dateTime); else result.append("<unset>");
		result.append(", timePeriod: ");
		if (timePeriodESet) result.append(timePeriod); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlValue
