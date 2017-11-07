/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.UnitMultiplier;
import CIM15.IEC61970.Domain.UnitSymbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getDynamicConfiguration <em>Dynamic Configuration</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getReadings <em>Readings</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ReadingType#getPendingCalculation <em>Pending Calculation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadingType extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final UnitMultiplier MULTIPLIER_EDEFAULT = UnitMultiplier.M;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected UnitMultiplier multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplierESet;

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
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitSymbol UNIT_EDEFAULT = UnitSymbol.N;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitSymbol unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ReadingKind KIND_EDEFAULT = ReadingKind.PHASE_ANGLE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ReadingKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getDynamicConfiguration() <em>Dynamic Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicConfiguration()
	 * @generated
	 * @ordered
	 */
	protected DynamicDemand dynamicConfiguration;

	/**
	 * The default value of the '{@link #isReverseChronology() <em>Reverse Chronology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverseChronology()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSE_CHRONOLOGY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReverseChronology() <em>Reverse Chronology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReverseChronology()
	 * @generated
	 * @ordered
	 */
	protected boolean reverseChronology = REVERSE_CHRONOLOGY_EDEFAULT;

	/**
	 * This is true if the Reverse Chronology attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reverseChronologyESet;

	/**
	 * The default value of the '{@link #getDefaultQuality() <em>Default Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultQuality() <em>Default Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQuality()
	 * @generated
	 * @ordered
	 */
	protected String defaultQuality = DEFAULT_QUALITY_EDEFAULT;

	/**
	 * This is true if the Default Quality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultQualityESet;

	/**
	 * The default value of the '{@link #getIntervalLength() <em>Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalLength()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERVAL_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getIntervalLength() <em>Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalLength()
	 * @generated
	 * @ordered
	 */
	protected float intervalLength = INTERVAL_LENGTH_EDEFAULT;

	/**
	 * This is true if the Interval Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalLengthESet;

	/**
	 * The default value of the '{@link #getChannelNumber() <em>Channel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannelNumber() <em>Channel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelNumber()
	 * @generated
	 * @ordered
	 */
	protected int channelNumber = CHANNEL_NUMBER_EDEFAULT;

	/**
	 * This is true if the Channel Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean channelNumberESet;

	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<Reading> readings;

	/**
	 * The default value of the '{@link #getDefaultValueDataType() <em>Default Value Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueDataType() <em>Default Value Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueDataType()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueDataType = DEFAULT_VALUE_DATA_TYPE_EDEFAULT;

	/**
	 * This is true if the Default Value Data Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueDataTypeESet;

	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected Register register;

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
	protected ReadingType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.READING_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitMultiplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #setMultiplier(UnitMultiplier)
	 * @generated
	 */
	public UnitMultiplier getMultiplier() {
		return multiplier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @generated
	 */
	public void setMultiplier(UnitMultiplier newMultiplier) {
		multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
		multiplierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(UnitMultiplier)
	 * @generated
	 */
	public void unsetMultiplier() {
		multiplier = MULTIPLIER_EDEFAULT;
		multiplierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getMultiplier <em>Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplier</em>' attribute is set.
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(UnitMultiplier)
	 * @generated
	 */
	public boolean isSetMultiplier() {
		return multiplierESet;
	}

	/**
	 * Returns the value of the '<em><b>Interval Blocks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.IntervalBlock}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.IntervalBlock#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Blocks</em>' reference list.
	 * @see CIM15.IEC61968.Metering.IntervalBlock#getReadingType
	 * @generated
	 */
	public EList<IntervalBlock> getIntervalBlocks() {
		if (intervalBlocks == null) {
			intervalBlocks = new BasicInternalEList<IntervalBlock>(IntervalBlock.class);
		}
		return intervalBlocks;
	}

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Domain.UnitSymbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(UnitSymbol)
	 * @generated
	 */
	public UnitSymbol getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	public void setUnit(UnitSymbol newUnit) {
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		unitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitSymbol)
	 * @generated
	 */
	public void unsetUnit() {
		unit = UNIT_EDEFAULT;
		unitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitSymbol)
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Metering.ReadingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Metering.ReadingKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ReadingKind)
	 * @generated
	 */
	public ReadingKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Metering.ReadingKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(ReadingKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ReadingKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ReadingKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Dynamic Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Configuration</em>' containment reference.
	 * @see #setDynamicConfiguration(DynamicDemand)
	 * @generated
	 */
	public DynamicDemand getDynamicConfiguration() {
		return dynamicConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicConfiguration(DynamicDemand newDynamicConfiguration, NotificationChain msgs) {
		DynamicDemand oldDynamicConfiguration = dynamicConfiguration;
		dynamicConfiguration = newDynamicConfiguration;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getDynamicConfiguration <em>Dynamic Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Configuration</em>' containment reference.
	 * @see #getDynamicConfiguration()
	 * @generated
	 */
	public void setDynamicConfiguration(DynamicDemand newDynamicConfiguration) {
		if (newDynamicConfiguration != dynamicConfiguration) {
			NotificationChain msgs = null;
			if (dynamicConfiguration != null)
				msgs = ((InternalEObject)dynamicConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION, null, msgs);
			if (newDynamicConfiguration != null)
				msgs = ((InternalEObject)newDynamicConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION, null, msgs);
			msgs = basicSetDynamicConfiguration(newDynamicConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Reverse Chronology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Chronology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Chronology</em>' attribute.
	 * @see #isSetReverseChronology()
	 * @see #unsetReverseChronology()
	 * @see #setReverseChronology(boolean)
	 * @generated
	 */
	public boolean isReverseChronology() {
		return reverseChronology;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Chronology</em>' attribute.
	 * @see #isSetReverseChronology()
	 * @see #unsetReverseChronology()
	 * @see #isReverseChronology()
	 * @generated
	 */
	public void setReverseChronology(boolean newReverseChronology) {
		reverseChronology = newReverseChronology;
		reverseChronologyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReverseChronology()
	 * @see #isReverseChronology()
	 * @see #setReverseChronology(boolean)
	 * @generated
	 */
	public void unsetReverseChronology() {
		reverseChronology = REVERSE_CHRONOLOGY_EDEFAULT;
		reverseChronologyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#isReverseChronology <em>Reverse Chronology</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reverse Chronology</em>' attribute is set.
	 * @see #unsetReverseChronology()
	 * @see #isReverseChronology()
	 * @see #setReverseChronology(boolean)
	 * @generated
	 */
	public boolean isSetReverseChronology() {
		return reverseChronologyESet;
	}

	/**
	 * Returns the value of the '<em><b>Default Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Quality</em>' attribute.
	 * @see #isSetDefaultQuality()
	 * @see #unsetDefaultQuality()
	 * @see #setDefaultQuality(String)
	 * @generated
	 */
	public String getDefaultQuality() {
		return defaultQuality;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Quality</em>' attribute.
	 * @see #isSetDefaultQuality()
	 * @see #unsetDefaultQuality()
	 * @see #getDefaultQuality()
	 * @generated
	 */
	public void setDefaultQuality(String newDefaultQuality) {
		defaultQuality = newDefaultQuality;
		defaultQualityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultQuality()
	 * @see #getDefaultQuality()
	 * @see #setDefaultQuality(String)
	 * @generated
	 */
	public void unsetDefaultQuality() {
		defaultQuality = DEFAULT_QUALITY_EDEFAULT;
		defaultQualityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultQuality <em>Default Quality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Quality</em>' attribute is set.
	 * @see #unsetDefaultQuality()
	 * @see #getDefaultQuality()
	 * @see #setDefaultQuality(String)
	 * @generated
	 */
	public boolean isSetDefaultQuality() {
		return defaultQualityESet;
	}

	/**
	 * Returns the value of the '<em><b>Interval Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Length</em>' attribute.
	 * @see #isSetIntervalLength()
	 * @see #unsetIntervalLength()
	 * @see #setIntervalLength(float)
	 * @generated
	 */
	public float getIntervalLength() {
		return intervalLength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Length</em>' attribute.
	 * @see #isSetIntervalLength()
	 * @see #unsetIntervalLength()
	 * @see #getIntervalLength()
	 * @generated
	 */
	public void setIntervalLength(float newIntervalLength) {
		intervalLength = newIntervalLength;
		intervalLengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntervalLength()
	 * @see #getIntervalLength()
	 * @see #setIntervalLength(float)
	 * @generated
	 */
	public void unsetIntervalLength() {
		intervalLength = INTERVAL_LENGTH_EDEFAULT;
		intervalLengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getIntervalLength <em>Interval Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval Length</em>' attribute is set.
	 * @see #unsetIntervalLength()
	 * @see #getIntervalLength()
	 * @see #setIntervalLength(float)
	 * @generated
	 */
	public boolean isSetIntervalLength() {
		return intervalLengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Channel Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Number</em>' attribute.
	 * @see #isSetChannelNumber()
	 * @see #unsetChannelNumber()
	 * @see #setChannelNumber(int)
	 * @generated
	 */
	public int getChannelNumber() {
		return channelNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Number</em>' attribute.
	 * @see #isSetChannelNumber()
	 * @see #unsetChannelNumber()
	 * @see #getChannelNumber()
	 * @generated
	 */
	public void setChannelNumber(int newChannelNumber) {
		channelNumber = newChannelNumber;
		channelNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChannelNumber()
	 * @see #getChannelNumber()
	 * @see #setChannelNumber(int)
	 * @generated
	 */
	public void unsetChannelNumber() {
		channelNumber = CHANNEL_NUMBER_EDEFAULT;
		channelNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getChannelNumber <em>Channel Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Channel Number</em>' attribute is set.
	 * @see #unsetChannelNumber()
	 * @see #getChannelNumber()
	 * @see #setChannelNumber(int)
	 * @generated
	 */
	public boolean isSetChannelNumber() {
		return channelNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.Reading}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Reading#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see CIM15.IEC61968.Metering.Reading#getReadingType
	 * @generated
	 */
	public EList<Reading> getReadings() {
		if (readings == null) {
			readings = new BasicInternalEList<Reading>(Reading.class);
		}
		return readings;
	}

	/**
	 * Returns the value of the '<em><b>Default Value Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Data Type</em>' attribute.
	 * @see #isSetDefaultValueDataType()
	 * @see #unsetDefaultValueDataType()
	 * @see #setDefaultValueDataType(String)
	 * @generated
	 */
	public String getDefaultValueDataType() {
		return defaultValueDataType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Data Type</em>' attribute.
	 * @see #isSetDefaultValueDataType()
	 * @see #unsetDefaultValueDataType()
	 * @see #getDefaultValueDataType()
	 * @generated
	 */
	public void setDefaultValueDataType(String newDefaultValueDataType) {
		defaultValueDataType = newDefaultValueDataType;
		defaultValueDataTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValueDataType()
	 * @see #getDefaultValueDataType()
	 * @see #setDefaultValueDataType(String)
	 * @generated
	 */
	public void unsetDefaultValueDataType() {
		defaultValueDataType = DEFAULT_VALUE_DATA_TYPE_EDEFAULT;
		defaultValueDataTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getDefaultValueDataType <em>Default Value Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value Data Type</em>' attribute is set.
	 * @see #unsetDefaultValueDataType()
	 * @see #getDefaultValueDataType()
	 * @see #setDefaultValueDataType(String)
	 * @generated
	 */
	public boolean isSetDefaultValueDataType() {
		return defaultValueDataTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Register</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.Register#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' reference.
	 * @see #setRegister(Register)
	 * @see CIM15.IEC61968.Metering.Register#getReadingType
	 * @generated
	 */
	public Register getRegister() {
		if (register != null && register.eIsProxy()) {
			InternalEObject oldRegister = (InternalEObject)register;
			register = (Register)eResolveProxy(oldRegister);
			if (register != oldRegister) {
			}
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register basicGetRegister() {
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegister(Register newRegister, NotificationChain msgs) {
		Register oldRegister = register;
		register = newRegister;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getRegister <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' reference.
	 * @see #getRegister()
	 * @generated
	 */
	public void setRegister(Register newRegister) {
		if (newRegister != register) {
			NotificationChain msgs = null;
			if (register != null)
				msgs = ((InternalEObject)register).eInverseRemove(this, MeteringPackage.REGISTER__READING_TYPE, Register.class, msgs);
			if (newRegister != null)
				msgs = ((InternalEObject)newRegister).eInverseAdd(this, MeteringPackage.REGISTER__READING_TYPE, Register.class, msgs);
			msgs = basicSetRegister(newRegister, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Pending Calculation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.PendingCalculation#getReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Calculation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Calculation</em>' reference.
	 * @see #setPendingCalculation(PendingCalculation)
	 * @see CIM15.IEC61968.Metering.PendingCalculation#getReadingType
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
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ReadingType#getPendingCalculation <em>Pending Calculation</em>}' reference.
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
				msgs = ((InternalEObject)pendingCalculation).eInverseRemove(this, MeteringPackage.PENDING_CALCULATION__READING_TYPE, PendingCalculation.class, msgs);
			if (newPendingCalculation != null)
				msgs = ((InternalEObject)newPendingCalculation).eInverseAdd(this, MeteringPackage.PENDING_CALCULATION__READING_TYPE, PendingCalculation.class, msgs);
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
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervalBlocks()).basicAdd(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__READINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReadings()).basicAdd(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__REGISTER:
				if (register != null)
					msgs = ((InternalEObject)register).eInverseRemove(this, MeteringPackage.REGISTER__READING_TYPE, Register.class, msgs);
				return basicSetRegister((Register)otherEnd, msgs);
			case MeteringPackage.READING_TYPE__PENDING_CALCULATION:
				if (pendingCalculation != null)
					msgs = ((InternalEObject)pendingCalculation).eInverseRemove(this, MeteringPackage.PENDING_CALCULATION__READING_TYPE, PendingCalculation.class, msgs);
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
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return ((InternalEList<?>)getIntervalBlocks()).basicRemove(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				return basicSetDynamicConfiguration(null, msgs);
			case MeteringPackage.READING_TYPE__READINGS:
				return ((InternalEList<?>)getReadings()).basicRemove(otherEnd, msgs);
			case MeteringPackage.READING_TYPE__REGISTER:
				return basicSetRegister(null, msgs);
			case MeteringPackage.READING_TYPE__PENDING_CALCULATION:
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
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				return getMultiplier();
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return getIntervalBlocks();
			case MeteringPackage.READING_TYPE__UNIT:
				return getUnit();
			case MeteringPackage.READING_TYPE__KIND:
				return getKind();
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				return getDynamicConfiguration();
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				return isReverseChronology();
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				return getDefaultQuality();
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				return getIntervalLength();
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				return getChannelNumber();
			case MeteringPackage.READING_TYPE__READINGS:
				return getReadings();
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				return getDefaultValueDataType();
			case MeteringPackage.READING_TYPE__REGISTER:
				if (resolve) return getRegister();
				return basicGetRegister();
			case MeteringPackage.READING_TYPE__PENDING_CALCULATION:
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
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				setMultiplier((UnitMultiplier)newValue);
				return;
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				getIntervalBlocks().addAll((Collection<? extends IntervalBlock>)newValue);
				return;
			case MeteringPackage.READING_TYPE__UNIT:
				setUnit((UnitSymbol)newValue);
				return;
			case MeteringPackage.READING_TYPE__KIND:
				setKind((ReadingKind)newValue);
				return;
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				setDynamicConfiguration((DynamicDemand)newValue);
				return;
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				setReverseChronology((Boolean)newValue);
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				setDefaultQuality((String)newValue);
				return;
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				setIntervalLength((Float)newValue);
				return;
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				setChannelNumber((Integer)newValue);
				return;
			case MeteringPackage.READING_TYPE__READINGS:
				getReadings().clear();
				getReadings().addAll((Collection<? extends Reading>)newValue);
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				setDefaultValueDataType((String)newValue);
				return;
			case MeteringPackage.READING_TYPE__REGISTER:
				setRegister((Register)newValue);
				return;
			case MeteringPackage.READING_TYPE__PENDING_CALCULATION:
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
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				unsetMultiplier();
				return;
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				getIntervalBlocks().clear();
				return;
			case MeteringPackage.READING_TYPE__UNIT:
				unsetUnit();
				return;
			case MeteringPackage.READING_TYPE__KIND:
				unsetKind();
				return;
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				setDynamicConfiguration((DynamicDemand)null);
				return;
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				unsetReverseChronology();
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				unsetDefaultQuality();
				return;
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				unsetIntervalLength();
				return;
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				unsetChannelNumber();
				return;
			case MeteringPackage.READING_TYPE__READINGS:
				getReadings().clear();
				return;
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				unsetDefaultValueDataType();
				return;
			case MeteringPackage.READING_TYPE__REGISTER:
				setRegister((Register)null);
				return;
			case MeteringPackage.READING_TYPE__PENDING_CALCULATION:
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
			case MeteringPackage.READING_TYPE__MULTIPLIER:
				return isSetMultiplier();
			case MeteringPackage.READING_TYPE__INTERVAL_BLOCKS:
				return intervalBlocks != null && !intervalBlocks.isEmpty();
			case MeteringPackage.READING_TYPE__UNIT:
				return isSetUnit();
			case MeteringPackage.READING_TYPE__KIND:
				return isSetKind();
			case MeteringPackage.READING_TYPE__DYNAMIC_CONFIGURATION:
				return dynamicConfiguration != null;
			case MeteringPackage.READING_TYPE__REVERSE_CHRONOLOGY:
				return isSetReverseChronology();
			case MeteringPackage.READING_TYPE__DEFAULT_QUALITY:
				return isSetDefaultQuality();
			case MeteringPackage.READING_TYPE__INTERVAL_LENGTH:
				return isSetIntervalLength();
			case MeteringPackage.READING_TYPE__CHANNEL_NUMBER:
				return isSetChannelNumber();
			case MeteringPackage.READING_TYPE__READINGS:
				return readings != null && !readings.isEmpty();
			case MeteringPackage.READING_TYPE__DEFAULT_VALUE_DATA_TYPE:
				return isSetDefaultValueDataType();
			case MeteringPackage.READING_TYPE__REGISTER:
				return register != null;
			case MeteringPackage.READING_TYPE__PENDING_CALCULATION:
				return pendingCalculation != null;
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
		result.append(" (multiplier: ");
		if (multiplierESet) result.append(multiplier); else result.append("<unset>");
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", reverseChronology: ");
		if (reverseChronologyESet) result.append(reverseChronology); else result.append("<unset>");
		result.append(", defaultQuality: ");
		if (defaultQualityESet) result.append(defaultQuality); else result.append("<unset>");
		result.append(", intervalLength: ");
		if (intervalLengthESet) result.append(intervalLength); else result.append("<unset>");
		result.append(", channelNumber: ");
		if (channelNumberESet) result.append(channelNumber); else result.append("<unset>");
		result.append(", defaultValueDataType: ");
		if (defaultValueDataTypeESet) result.append(defaultValueDataType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ReadingType
