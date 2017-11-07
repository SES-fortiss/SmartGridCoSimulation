/**
 */
package CIM15.IEC61968.Metering;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingQuality#getIntervalReading <em>Interval Reading</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadingQuality extends Element {
	/**
	 * The cached value of the '{@link #getReading() <em>Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected Reading reading;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected String quality = QUALITY_EDEFAULT;

	/**
	 * This is true if the Quality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualityESet;

	/**
	 * The cached value of the '{@link #getIntervalReading() <em>Interval Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalReading()
	 * @generated
	 * @ordered
	 */
	protected IntervalReading intervalReading;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingQuality() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.READING_QUALITY;
	}

	/**
	 * Returns the value of the '<em><b>Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Reading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' reference.
	 * @see #setReading(Reading)
	 * @see CIM15.IEC61968.Metering.Reading#getReadingQualities
	 * @generated
	 */
	public Reading getReading() {
		if (reading != null && reading.eIsProxy()) {
			InternalEObject oldReading = (InternalEObject)reading;
			reading = (Reading)eResolveProxy(oldReading);
			if (reading != oldReading) {
			}
		}
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reading basicGetReading() {
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReading(Reading newReading, NotificationChain msgs) {
		Reading oldReading = reading;
		reading = newReading;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingQuality#getReading <em>Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' reference.
	 * @see #getReading()
	 * @generated
	 */
	public void setReading(Reading newReading) {
		if (newReading != reading) {
			NotificationChain msgs = null;
			if (reading != null)
				msgs = ((InternalEObject)reading).eInverseRemove(this, MeteringPackage.READING__READING_QUALITIES, Reading.class, msgs);
			if (newReading != null)
				msgs = ((InternalEObject)newReading).eInverseAdd(this, MeteringPackage.READING__READING_QUALITIES, Reading.class, msgs);
			msgs = basicSetReading(newReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #setQuality(String)
	 * @generated
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @generated
	 */
	public void setQuality(String newQuality) {
		quality = newQuality;
		qualityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuality()
	 * @see #getQuality()
	 * @see #setQuality(String)
	 * @generated
	 */
	public void unsetQuality() {
		quality = QUALITY_EDEFAULT;
		qualityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingQuality#getQuality <em>Quality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quality</em>' attribute is set.
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @see #setQuality(String)
	 * @generated
	 */
	public boolean isSetQuality() {
		return qualityESet;
	}

	/**
	 * Returns the value of the '<em><b>Interval Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.IntervalReading#getReadingQualities <em>Reading Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Reading</em>' reference.
	 * @see #setIntervalReading(IntervalReading)
	 * @see CIM15.IEC61968.Metering.IntervalReading#getReadingQualities
	 * @generated
	 */
	public IntervalReading getIntervalReading() {
		if (intervalReading != null && intervalReading.eIsProxy()) {
			InternalEObject oldIntervalReading = (InternalEObject)intervalReading;
			intervalReading = (IntervalReading)eResolveProxy(oldIntervalReading);
			if (intervalReading != oldIntervalReading) {
			}
		}
		return intervalReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalReading basicGetIntervalReading() {
		return intervalReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalReading(IntervalReading newIntervalReading, NotificationChain msgs) {
		IntervalReading oldIntervalReading = intervalReading;
		intervalReading = newIntervalReading;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingQuality#getIntervalReading <em>Interval Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Reading</em>' reference.
	 * @see #getIntervalReading()
	 * @generated
	 */
	public void setIntervalReading(IntervalReading newIntervalReading) {
		if (newIntervalReading != intervalReading) {
			NotificationChain msgs = null;
			if (intervalReading != null)
				msgs = ((InternalEObject)intervalReading).eInverseRemove(this, MeteringPackage.INTERVAL_READING__READING_QUALITIES, IntervalReading.class, msgs);
			if (newIntervalReading != null)
				msgs = ((InternalEObject)newIntervalReading).eInverseAdd(this, MeteringPackage.INTERVAL_READING__READING_QUALITIES, IntervalReading.class, msgs);
			msgs = basicSetIntervalReading(newIntervalReading, msgs);
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
			case MeteringPackage.READING_QUALITY__READING:
				if (reading != null)
					msgs = ((InternalEObject)reading).eInverseRemove(this, MeteringPackage.READING__READING_QUALITIES, Reading.class, msgs);
				return basicSetReading((Reading)otherEnd, msgs);
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				if (intervalReading != null)
					msgs = ((InternalEObject)intervalReading).eInverseRemove(this, MeteringPackage.INTERVAL_READING__READING_QUALITIES, IntervalReading.class, msgs);
				return basicSetIntervalReading((IntervalReading)otherEnd, msgs);
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
			case MeteringPackage.READING_QUALITY__READING:
				return basicSetReading(null, msgs);
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				return basicSetIntervalReading(null, msgs);
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
			case MeteringPackage.READING_QUALITY__READING:
				if (resolve) return getReading();
				return basicGetReading();
			case MeteringPackage.READING_QUALITY__QUALITY:
				return getQuality();
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				if (resolve) return getIntervalReading();
				return basicGetIntervalReading();
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
			case MeteringPackage.READING_QUALITY__READING:
				setReading((Reading)newValue);
				return;
			case MeteringPackage.READING_QUALITY__QUALITY:
				setQuality((String)newValue);
				return;
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				setIntervalReading((IntervalReading)newValue);
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
			case MeteringPackage.READING_QUALITY__READING:
				setReading((Reading)null);
				return;
			case MeteringPackage.READING_QUALITY__QUALITY:
				unsetQuality();
				return;
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				setIntervalReading((IntervalReading)null);
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
			case MeteringPackage.READING_QUALITY__READING:
				return reading != null;
			case MeteringPackage.READING_QUALITY__QUALITY:
				return isSetQuality();
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				return intervalReading != null;
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
		result.append(" (quality: ");
		if (qualityESet) result.append(quality); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ReadingQuality
