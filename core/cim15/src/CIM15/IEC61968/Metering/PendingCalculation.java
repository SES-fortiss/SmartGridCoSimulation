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
 * A representation of the model object '<em><b>Pending Calculation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.PendingCalculation#isMultiplyBeforeAdd <em>Multiply Before Add</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.PendingCalculation#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarFloat <em>Scalar Float</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.PendingCalculation#getOffset <em>Offset</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.PendingCalculation#getReadingType <em>Reading Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PendingCalculation extends Element {
	/**
	 * The default value of the '{@link #getScalarNumerator() <em>Scalar Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALAR_NUMERATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScalarNumerator() <em>Scalar Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarNumerator()
	 * @generated
	 * @ordered
	 */
	protected int scalarNumerator = SCALAR_NUMERATOR_EDEFAULT;

	/**
	 * This is true if the Scalar Numerator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scalarNumeratorESet;

	/**
	 * The default value of the '{@link #isMultiplyBeforeAdd() <em>Multiply Before Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplyBeforeAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLY_BEFORE_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiplyBeforeAdd() <em>Multiply Before Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiplyBeforeAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean multiplyBeforeAdd = MULTIPLY_BEFORE_ADD_EDEFAULT;

	/**
	 * This is true if the Multiply Before Add attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplyBeforeAddESet;

	/**
	 * The cached value of the '{@link #getIntervalBlocks() <em>Interval Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<IntervalBlock> intervalBlocks;

	/**
	 * The default value of the '{@link #getScalarDenominator() <em>Scalar Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALAR_DENOMINATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScalarDenominator() <em>Scalar Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDenominator()
	 * @generated
	 * @ordered
	 */
	protected int scalarDenominator = SCALAR_DENOMINATOR_EDEFAULT;

	/**
	 * This is true if the Scalar Denominator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scalarDenominatorESet;

	/**
	 * The default value of the '{@link #getScalarFloat() <em>Scalar Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALAR_FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScalarFloat() <em>Scalar Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarFloat()
	 * @generated
	 * @ordered
	 */
	protected float scalarFloat = SCALAR_FLOAT_EDEFAULT;

	/**
	 * This is true if the Scalar Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scalarFloatESet;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PendingCalculation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.PENDING_CALCULATION;
	}

	/**
	 * Returns the value of the '<em><b>Scalar Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Numerator</em>' attribute.
	 * @see #isSetScalarNumerator()
	 * @see #unsetScalarNumerator()
	 * @see #setScalarNumerator(int)
	 * @generated
	 */
	public int getScalarNumerator() {
		return scalarNumerator;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Numerator</em>' attribute.
	 * @see #isSetScalarNumerator()
	 * @see #unsetScalarNumerator()
	 * @see #getScalarNumerator()
	 * @generated
	 */
	public void setScalarNumerator(int newScalarNumerator) {
		scalarNumerator = newScalarNumerator;
		scalarNumeratorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScalarNumerator()
	 * @see #getScalarNumerator()
	 * @see #setScalarNumerator(int)
	 * @generated
	 */
	public void unsetScalarNumerator() {
		scalarNumerator = SCALAR_NUMERATOR_EDEFAULT;
		scalarNumeratorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarNumerator <em>Scalar Numerator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scalar Numerator</em>' attribute is set.
	 * @see #unsetScalarNumerator()
	 * @see #getScalarNumerator()
	 * @see #setScalarNumerator(int)
	 * @generated
	 */
	public boolean isSetScalarNumerator() {
		return scalarNumeratorESet;
	}

	/**
	 * Returns the value of the '<em><b>Multiply Before Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiply Before Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiply Before Add</em>' attribute.
	 * @see #isSetMultiplyBeforeAdd()
	 * @see #unsetMultiplyBeforeAdd()
	 * @see #setMultiplyBeforeAdd(boolean)
	 * @generated
	 */
	public boolean isMultiplyBeforeAdd() {
		return multiplyBeforeAdd;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#isMultiplyBeforeAdd <em>Multiply Before Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiply Before Add</em>' attribute.
	 * @see #isSetMultiplyBeforeAdd()
	 * @see #unsetMultiplyBeforeAdd()
	 * @see #isMultiplyBeforeAdd()
	 * @generated
	 */
	public void setMultiplyBeforeAdd(boolean newMultiplyBeforeAdd) {
		multiplyBeforeAdd = newMultiplyBeforeAdd;
		multiplyBeforeAddESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#isMultiplyBeforeAdd <em>Multiply Before Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplyBeforeAdd()
	 * @see #isMultiplyBeforeAdd()
	 * @see #setMultiplyBeforeAdd(boolean)
	 * @generated
	 */
	public void unsetMultiplyBeforeAdd() {
		multiplyBeforeAdd = MULTIPLY_BEFORE_ADD_EDEFAULT;
		multiplyBeforeAddESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#isMultiplyBeforeAdd <em>Multiply Before Add</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiply Before Add</em>' attribute is set.
	 * @see #unsetMultiplyBeforeAdd()
	 * @see #isMultiplyBeforeAdd()
	 * @see #setMultiplyBeforeAdd(boolean)
	 * @generated
	 */
	public boolean isSetMultiplyBeforeAdd() {
		return multiplyBeforeAddESet;
	}

	/**
	 * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.IntervalBlock}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.IntervalBlock#getPendingCalculation <em>Pending Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Blocks</em>' reference list.
	 * @see CIM15.IEC61968.Metering.IntervalBlock#getPendingCalculation
	 * @generated
	 */
	public EList<IntervalBlock> getIntervalBlocks() {
		if (intervalBlocks == null) {
			intervalBlocks = new BasicInternalEList<IntervalBlock>(IntervalBlock.class);
		}
		return intervalBlocks;
	}

	/**
	 * Returns the value of the '<em><b>Scalar Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Denominator</em>' attribute.
	 * @see #isSetScalarDenominator()
	 * @see #unsetScalarDenominator()
	 * @see #setScalarDenominator(int)
	 * @generated
	 */
	public int getScalarDenominator() {
		return scalarDenominator;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Denominator</em>' attribute.
	 * @see #isSetScalarDenominator()
	 * @see #unsetScalarDenominator()
	 * @see #getScalarDenominator()
	 * @generated
	 */
	public void setScalarDenominator(int newScalarDenominator) {
		scalarDenominator = newScalarDenominator;
		scalarDenominatorESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScalarDenominator()
	 * @see #getScalarDenominator()
	 * @see #setScalarDenominator(int)
	 * @generated
	 */
	public void unsetScalarDenominator() {
		scalarDenominator = SCALAR_DENOMINATOR_EDEFAULT;
		scalarDenominatorESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarDenominator <em>Scalar Denominator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scalar Denominator</em>' attribute is set.
	 * @see #unsetScalarDenominator()
	 * @see #getScalarDenominator()
	 * @see #setScalarDenominator(int)
	 * @generated
	 */
	public boolean isSetScalarDenominator() {
		return scalarDenominatorESet;
	}

	/**
	 * Returns the value of the '<em><b>Scalar Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalar Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalar Float</em>' attribute.
	 * @see #isSetScalarFloat()
	 * @see #unsetScalarFloat()
	 * @see #setScalarFloat(float)
	 * @generated
	 */
	public float getScalarFloat() {
		return scalarFloat;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarFloat <em>Scalar Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalar Float</em>' attribute.
	 * @see #isSetScalarFloat()
	 * @see #unsetScalarFloat()
	 * @see #getScalarFloat()
	 * @generated
	 */
	public void setScalarFloat(float newScalarFloat) {
		scalarFloat = newScalarFloat;
		scalarFloatESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarFloat <em>Scalar Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScalarFloat()
	 * @see #getScalarFloat()
	 * @see #setScalarFloat(float)
	 * @generated
	 */
	public void unsetScalarFloat() {
		scalarFloat = SCALAR_FLOAT_EDEFAULT;
		scalarFloatESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getScalarFloat <em>Scalar Float</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scalar Float</em>' attribute is set.
	 * @see #unsetScalarFloat()
	 * @see #getScalarFloat()
	 * @see #setScalarFloat(float)
	 * @generated
	 */
	public boolean isSetScalarFloat() {
		return scalarFloatESet;
	}

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(int)
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	public void setOffset(int newOffset) {
		offset = newOffset;
		offsetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(int)
	 * @generated
	 */
	public void unsetOffset() {
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(int)
	 * @generated
	 */
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * Returns the value of the '<em><b>Reading Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ReadingType#getPendingCalculation <em>Pending Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Type</em>' reference.
	 * @see #setReadingType(ReadingType)
	 * @see CIM15.IEC61968.Metering.ReadingType#getPendingCalculation
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.PendingCalculation#getReadingType <em>Reading Type</em>}' reference.
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
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__PENDING_CALCULATION, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__PENDING_CALCULATION, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
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
			case MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalBlocks()).basicAdd(otherEnd, msgs);
			case MeteringPackage.PENDING_CALCULATION__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__PENDING_CALCULATION, ReadingType.class, msgs);
				return basicSetReadingType((ReadingType)otherEnd, msgs);
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
			case MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
				return ((InternalEList<?>)getIntervalBlocks()).basicRemove(otherEnd, msgs);
			case MeteringPackage.PENDING_CALCULATION__READING_TYPE:
				return basicSetReadingType(null, msgs);
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
			case MeteringPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
				return getScalarNumerator();
			case MeteringPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
				return isMultiplyBeforeAdd();
			case MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
				return getIntervalBlocks();
			case MeteringPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
				return getScalarDenominator();
			case MeteringPackage.PENDING_CALCULATION__SCALAR_FLOAT:
				return getScalarFloat();
			case MeteringPackage.PENDING_CALCULATION__OFFSET:
				return getOffset();
			case MeteringPackage.PENDING_CALCULATION__READING_TYPE:
				if (resolve) return getReadingType();
				return basicGetReadingType();
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
			case MeteringPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
				setScalarNumerator((Integer)newValue);
				return;
			case MeteringPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
				setMultiplyBeforeAdd((Boolean)newValue);
				return;
			case MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				getIntervalBlocks().addAll((Collection<? extends IntervalBlock>)newValue);
				return;
			case MeteringPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
				setScalarDenominator((Integer)newValue);
				return;
			case MeteringPackage.PENDING_CALCULATION__SCALAR_FLOAT:
				setScalarFloat((Float)newValue);
				return;
			case MeteringPackage.PENDING_CALCULATION__OFFSET:
				setOffset((Integer)newValue);
				return;
			case MeteringPackage.PENDING_CALCULATION__READING_TYPE:
				setReadingType((ReadingType)newValue);
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
			case MeteringPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
				unsetScalarNumerator();
				return;
			case MeteringPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
				unsetMultiplyBeforeAdd();
				return;
			case MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				return;
			case MeteringPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
				unsetScalarDenominator();
				return;
			case MeteringPackage.PENDING_CALCULATION__SCALAR_FLOAT:
				unsetScalarFloat();
				return;
			case MeteringPackage.PENDING_CALCULATION__OFFSET:
				unsetOffset();
				return;
			case MeteringPackage.PENDING_CALCULATION__READING_TYPE:
				setReadingType((ReadingType)null);
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
			case MeteringPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
				return isSetScalarNumerator();
			case MeteringPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
				return isSetMultiplyBeforeAdd();
			case MeteringPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
				return intervalBlocks != null && !intervalBlocks.isEmpty();
			case MeteringPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
				return isSetScalarDenominator();
			case MeteringPackage.PENDING_CALCULATION__SCALAR_FLOAT:
				return isSetScalarFloat();
			case MeteringPackage.PENDING_CALCULATION__OFFSET:
				return isSetOffset();
			case MeteringPackage.PENDING_CALCULATION__READING_TYPE:
				return readingType != null;
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
		result.append(" (scalarNumerator: ");
		if (scalarNumeratorESet) result.append(scalarNumerator); else result.append("<unset>");
		result.append(", multiplyBeforeAdd: ");
		if (multiplyBeforeAddESet) result.append(multiplyBeforeAdd); else result.append("<unset>");
		result.append(", scalarDenominator: ");
		if (scalarDenominatorESet) result.append(scalarDenominator); else result.append("<unset>");
		result.append(", scalarFloat: ");
		if (scalarFloatESet) result.append(scalarFloat); else result.append("<unset>");
		result.append(", offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PendingCalculation
