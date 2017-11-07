/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61970.Meas.MeasurementValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Reading#getMeterReadings <em>Meter Readings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Reading#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.Reading#getReadingQualities <em>Reading Qualities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Reading extends MeasurementValue {
	/**
	 * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingType()
	 * @generated
	 * @ordered
	 */
	protected ReadingType readingType;

	/**
	 * The cached value of the '{@link #getMeterReadings() <em>Meter Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<MeterReading> meterReadings;

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
	 * The cached value of the '{@link #getReadingQualities() <em>Reading Qualities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingQualities()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadingQuality> readingQualities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reading() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.READING;
	}

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ReadingType#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see CIM15.IEC61968.Metering.ReadingType#getReadings
	 * @generated
	 */
	public ReadingType getReadingType() {
		if (readingType != null && readingType.eIsProxy()) {
			InternalEObject oldReadingType = (InternalEObject)readingType;
			readingType = (ReadingType)eResolveProxy(oldReadingType);
			if (readingType != oldReadingType) {
			}
		}
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType basicGetReadingType() {
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadingType(ReadingType newReadingType, NotificationChain msgs) {
		ReadingType oldReadingType = readingType;
		readingType = newReadingType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Type</em>' reference.
	 * @see #getReadingType()
	 * @generated
	 */
	public void setReadingType(ReadingType newReadingType) {
		if (newReadingType != readingType) {
			NotificationChain msgs = null;
			if (readingType != null)
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__READINGS, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__READINGS, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Meter Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.MeterReading}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterReading#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Readings</em>' reference list.
	 * @see CIM15.IEC61968.Metering.MeterReading#getReadings
	 * @generated
	 */
	public EList<MeterReading> getMeterReadings() {
		if (meterReadings == null) {
			meterReadings = new BasicInternalEList<MeterReading>(MeterReading.class);
		}
		return meterReadings;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.Reading#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.Reading#getValue <em>Value</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.Reading#getValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Reading Qualities</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ReadingQuality}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Qualities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Qualities</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ReadingQuality#getReading
	 * @generated
	 */
	public EList<ReadingQuality> getReadingQualities() {
		if (readingQualities == null) {
			readingQualities = new BasicInternalEList<ReadingQuality>(ReadingQuality.class);
		}
		return readingQualities;
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
			case MeteringPackage.READING__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__READINGS, ReadingType.class, msgs);
				return basicSetReadingType((ReadingType)otherEnd, msgs);
			case MeteringPackage.READING__METER_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeterReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.READING__READING_QUALITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadingQualities()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.READING__READING_TYPE:
				return basicSetReadingType(null, msgs);
			case MeteringPackage.READING__METER_READINGS:
				return ((InternalEList<?>)getMeterReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.READING__READING_QUALITIES:
				return ((InternalEList<?>)getReadingQualities()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.READING__READING_TYPE:
				if (resolve) return getReadingType();
				return basicGetReadingType();
			case MeteringPackage.READING__METER_READINGS:
				return getMeterReadings();
			case MeteringPackage.READING__VALUE:
				return getValue();
			case MeteringPackage.READING__READING_QUALITIES:
				return getReadingQualities();
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
			case MeteringPackage.READING__READING_TYPE:
				setReadingType((ReadingType)newValue);
				return;
			case MeteringPackage.READING__METER_READINGS:
				getMeterReadings().clear();
				getMeterReadings().addAll((Collection<? extends MeterReading>)newValue);
				return;
			case MeteringPackage.READING__VALUE:
				setValue((Float)newValue);
				return;
			case MeteringPackage.READING__READING_QUALITIES:
				getReadingQualities().clear();
				getReadingQualities().addAll((Collection<? extends ReadingQuality>)newValue);
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
			case MeteringPackage.READING__READING_TYPE:
				setReadingType((ReadingType)null);
				return;
			case MeteringPackage.READING__METER_READINGS:
				getMeterReadings().clear();
				return;
			case MeteringPackage.READING__VALUE:
				unsetValue();
				return;
			case MeteringPackage.READING__READING_QUALITIES:
				getReadingQualities().clear();
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
			case MeteringPackage.READING__READING_TYPE:
				return readingType != null;
			case MeteringPackage.READING__METER_READINGS:
				return meterReadings != null && !meterReadings.isEmpty();
			case MeteringPackage.READING__VALUE:
				return isSetValue();
			case MeteringPackage.READING__READING_QUALITIES:
				return readingQualities != null && !readingQualities.isEmpty();
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

} // Reading
