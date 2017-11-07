/**
 */
package CIM15.IEC61968.Metering;

import CIM15.Element;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.IntervalBlock#getIntervalReadings <em>Interval Readings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervalBlock extends Element {
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
	 * The cached value of the '{@link #getIntervalReadings() <em>Interval Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<IntervalReading> intervalReadings;

	/**
	 * The cached value of the '{@link #getMeterReading() <em>Meter Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterReading()
	 * @generated
	 * @ordered
	 */
	protected MeterReading meterReading;

	/**
	 * The cached value of the '{@link #getPendingCalculation() <em>Pending Calculation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingCalculation()
	 * @generated
	 * @ordered
	 */
	protected PendingCalculation pendingCalculation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalBlock() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.INTERVAL_BLOCK;
	}

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see CIM15.IEC61968.Metering.ReadingType#getIntervalBlocks
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}' reference.
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
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Interval Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.IntervalReading}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.IntervalReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Readings</em>' reference list.
	 * @see CIM15.IEC61968.Metering.IntervalReading#getIntervalBlocks
	 * @generated
	 */
	public EList<IntervalReading> getIntervalReadings() {
		if (intervalReadings == null) {
			intervalReadings = new BasicInternalEList<IntervalReading>(IntervalReading.class);
		}
		return intervalReadings;
	}

	/**
	 * Returns the value of the '<em><b>Meter Reading</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.MeterReading#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Reading</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Reading</em>' reference.
	 * @see #setMeterReading(MeterReading)
	 * @see CIM15.IEC61968.Metering.MeterReading#getIntervalBlocks
	 * @generated
	 */
	public MeterReading getMeterReading() {
		if (meterReading != null && meterReading.eIsProxy()) {
			InternalEObject oldMeterReading = (InternalEObject)meterReading;
			meterReading = (MeterReading)eResolveProxy(oldMeterReading);
			if (meterReading != oldMeterReading) {
			}
		}
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterReading basicGetMeterReading() {
		return meterReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterReading(MeterReading newMeterReading, NotificationChain msgs) {
		MeterReading oldMeterReading = meterReading;
		meterReading = newMeterReading;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.IntervalBlock#getMeterReading <em>Meter Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Reading</em>' reference.
	 * @see #getMeterReading()
	 * @generated
	 */
	public void setMeterReading(MeterReading newMeterReading) {
		if (newMeterReading != meterReading) {
			NotificationChain msgs = null;
			if (meterReading != null)
				msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs);
			if (newMeterReading != null)
				msgs = ((InternalEObject)newMeterReading).eInverseAdd(this, MeteringPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs);
			msgs = basicSetMeterReading(newMeterReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Pending Calculation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.PendingCalculation#getIntervalBlocks <em>Interval Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Calculation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Calculation</em>' reference.
	 * @see #setPendingCalculation(PendingCalculation)
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getIntervalBlocks
	 * @generated
	 */
	public PendingCalculation getPendingCalculation() {
		if (pendingCalculation != null && pendingCalculation.eIsProxy()) {
			InternalEObject oldPendingCalculation = (InternalEObject)pendingCalculation;
			pendingCalculation = (PendingCalculation)eResolveProxy(oldPendingCalculation);
			if (pendingCalculation != oldPendingCalculation) {
			}
		}
		return pendingCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PendingCalculation basicGetPendingCalculation() {
		return pendingCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPendingCalculation(PendingCalculation newPendingCalculation, NotificationChain msgs) {
		PendingCalculation oldPendingCalculation = pendingCalculation;
		pendingCalculation = newPendingCalculation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending Calculation</em>' reference.
	 * @see #getPendingCalculation()
	 * @generated
	 */
	public void setPendingCalculation(PendingCalculation newPendingCalculation) {
		if (newPendingCalculation != pendingCalculation) {
			NotificationChain msgs = null;
			if (pendingCalculation != null)
				msgs = ((InternalEObject)pendingCalculation).eInverseRemove(this, MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS, PendingCalculation.class, msgs);
			if (newPendingCalculation != null)
				msgs = ((InternalEObject)newPendingCalculation).eInverseAdd(this, MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS, PendingCalculation.class, msgs);
			msgs = basicSetPendingCalculation(newPendingCalculation, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__INTERVAL_BLOCKS, ReadingType.class, msgs);
				return basicSetReadingType((ReadingType)otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				if (meterReading != null)
					msgs = ((InternalEObject)meterReading).eInverseRemove(this, MeteringPackage.METER_READING__INTERVAL_BLOCKS, MeterReading.class, msgs);
				return basicSetMeterReading((MeterReading)otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
				if (pendingCalculation != null)
					msgs = ((InternalEObject)pendingCalculation).eInverseRemove(this, MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS, PendingCalculation.class, msgs);
				return basicSetPendingCalculation((PendingCalculation)otherEnd, msgs);
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
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				return basicSetReadingType(null, msgs);
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return ((InternalEList<?>)getIntervalReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				return basicSetMeterReading(null, msgs);
			case MeteringPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
				return basicSetPendingCalculation(null, msgs);
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
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				if (resolve) return getReadingType();
				return basicGetReadingType();
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return getIntervalReadings();
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				if (resolve) return getMeterReading();
				return basicGetMeterReading();
			case MeteringPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
				if (resolve) return getPendingCalculation();
				return basicGetPendingCalculation();
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
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				setReadingType((ReadingType)newValue);
				return;
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				getIntervalReadings().clear();
				getIntervalReadings().addAll((Collection<? extends IntervalReading>)newValue);
				return;
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				setMeterReading((MeterReading)newValue);
				return;
			case MeteringPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
				setPendingCalculation((PendingCalculation)newValue);
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
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				setReadingType((ReadingType)null);
				return;
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				getIntervalReadings().clear();
				return;
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				setMeterReading((MeterReading)null);
				return;
			case MeteringPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
				setPendingCalculation((PendingCalculation)null);
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
			case MeteringPackage.INTERVAL_BLOCK__READING_TYPE:
				return readingType != null;
			case MeteringPackage.INTERVAL_BLOCK__INTERVAL_READINGS:
				return intervalReadings != null && !intervalReadings.isEmpty();
			case MeteringPackage.INTERVAL_BLOCK__METER_READING:
				return meterReading != null;
			case MeteringPackage.INTERVAL_BLOCK__PENDING_CALCULATION:
				return pendingCalculation != null;
		}
		return super.eIsSet(featureID);
	}

} // IntervalBlock
