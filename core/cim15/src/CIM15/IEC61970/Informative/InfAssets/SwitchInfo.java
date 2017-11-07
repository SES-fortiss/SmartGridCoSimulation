/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getDielectricStrength() <em>Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected static final float DIELECTRIC_STRENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDielectricStrength() <em>Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDielectricStrength()
	 * @generated
	 * @ordered
	 */
	protected float dielectricStrength = DIELECTRIC_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Dielectric Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dielectricStrengthESet;

	/**
	 * The default value of the '{@link #isGang() <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGang()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GANG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGang() <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGang()
	 * @generated
	 * @ordered
	 */
	protected boolean gang = GANG_EDEFAULT;

	/**
	 * This is true if the Gang attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gangESet;

	/**
	 * The default value of the '{@link #getMakingCapacity() <em>Making Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakingCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float MAKING_CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMakingCapacity() <em>Making Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakingCapacity()
	 * @generated
	 * @ordered
	 */
	protected float makingCapacity = MAKING_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Making Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean makingCapacityESet;

	/**
	 * The default value of the '{@link #getWithstandCurrent() <em>Withstand Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithstandCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float WITHSTAND_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWithstandCurrent() <em>Withstand Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithstandCurrent()
	 * @generated
	 * @ordered
	 */
	protected float withstandCurrent = WITHSTAND_CURRENT_EDEFAULT;

	/**
	 * This is true if the Withstand Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean withstandCurrentESet;

	/**
	 * The default value of the '{@link #isLoadBreak() <em>Load Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadBreak()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOAD_BREAK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoadBreak() <em>Load Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadBreak()
	 * @generated
	 * @ordered
	 */
	protected boolean loadBreak = LOAD_BREAK_EDEFAULT;

	/**
	 * This is true if the Load Break attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean loadBreakESet;

	/**
	 * The default value of the '{@link #getMinimumCurrent() <em>Minimum Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumCurrent() <em>Minimum Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCurrent()
	 * @generated
	 * @ordered
	 */
	protected float minimumCurrent = MINIMUM_CURRENT_EDEFAULT;

	/**
	 * This is true if the Minimum Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumCurrentESet;

	/**
	 * The default value of the '{@link #getInterruptingRating() <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingRating()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERRUPTING_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterruptingRating() <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingRating()
	 * @generated
	 * @ordered
	 */
	protected float interruptingRating = INTERRUPTING_RATING_EDEFAULT;

	/**
	 * This is true if the Interrupting Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interruptingRatingESet;

	/**
	 * The default value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected boolean remote = REMOTE_EDEFAULT;

	/**
	 * This is true if the Remote attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remoteESet;

	/**
	 * The default value of the '{@link #getPoleCount() <em>Pole Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoleCount()
	 * @generated
	 * @ordered
	 */
	protected static final int POLE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoleCount() <em>Pole Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoleCount()
	 * @generated
	 * @ordered
	 */
	protected int poleCount = POLE_COUNT_EDEFAULT;

	/**
	 * This is true if the Pole Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean poleCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSwitchInfo();
	}

	/**
	 * Returns the value of the '<em><b>Dielectric Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dielectric Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dielectric Strength</em>' attribute.
	 * @see #isSetDielectricStrength()
	 * @see #unsetDielectricStrength()
	 * @see #setDielectricStrength(float)
	 * @generated
	 */
	public float getDielectricStrength() {
		return dielectricStrength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dielectric Strength</em>' attribute.
	 * @see #isSetDielectricStrength()
	 * @see #unsetDielectricStrength()
	 * @see #getDielectricStrength()
	 * @generated
	 */
	public void setDielectricStrength(float newDielectricStrength) {
		dielectricStrength = newDielectricStrength;
		dielectricStrengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDielectricStrength()
	 * @see #getDielectricStrength()
	 * @see #setDielectricStrength(float)
	 * @generated
	 */
	public void unsetDielectricStrength() {
		dielectricStrength = DIELECTRIC_STRENGTH_EDEFAULT;
		dielectricStrengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getDielectricStrength <em>Dielectric Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dielectric Strength</em>' attribute is set.
	 * @see #unsetDielectricStrength()
	 * @see #getDielectricStrength()
	 * @see #setDielectricStrength(float)
	 * @generated
	 */
	public boolean isSetDielectricStrength() {
		return dielectricStrengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Gang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gang</em>' attribute.
	 * @see #isSetGang()
	 * @see #unsetGang()
	 * @see #setGang(boolean)
	 * @generated
	 */
	public boolean isGang() {
		return gang;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gang</em>' attribute.
	 * @see #isSetGang()
	 * @see #unsetGang()
	 * @see #isGang()
	 * @generated
	 */
	public void setGang(boolean newGang) {
		gang = newGang;
		gangESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGang()
	 * @see #isGang()
	 * @see #setGang(boolean)
	 * @generated
	 */
	public void unsetGang() {
		gang = GANG_EDEFAULT;
		gangESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isGang <em>Gang</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gang</em>' attribute is set.
	 * @see #unsetGang()
	 * @see #isGang()
	 * @see #setGang(boolean)
	 * @generated
	 */
	public boolean isSetGang() {
		return gangESet;
	}

	/**
	 * Returns the value of the '<em><b>Making Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Making Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Making Capacity</em>' attribute.
	 * @see #isSetMakingCapacity()
	 * @see #unsetMakingCapacity()
	 * @see #setMakingCapacity(float)
	 * @generated
	 */
	public float getMakingCapacity() {
		return makingCapacity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Making Capacity</em>' attribute.
	 * @see #isSetMakingCapacity()
	 * @see #unsetMakingCapacity()
	 * @see #getMakingCapacity()
	 * @generated
	 */
	public void setMakingCapacity(float newMakingCapacity) {
		makingCapacity = newMakingCapacity;
		makingCapacityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMakingCapacity()
	 * @see #getMakingCapacity()
	 * @see #setMakingCapacity(float)
	 * @generated
	 */
	public void unsetMakingCapacity() {
		makingCapacity = MAKING_CAPACITY_EDEFAULT;
		makingCapacityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMakingCapacity <em>Making Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Making Capacity</em>' attribute is set.
	 * @see #unsetMakingCapacity()
	 * @see #getMakingCapacity()
	 * @see #setMakingCapacity(float)
	 * @generated
	 */
	public boolean isSetMakingCapacity() {
		return makingCapacityESet;
	}

	/**
	 * Returns the value of the '<em><b>Withstand Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Withstand Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Withstand Current</em>' attribute.
	 * @see #isSetWithstandCurrent()
	 * @see #unsetWithstandCurrent()
	 * @see #setWithstandCurrent(float)
	 * @generated
	 */
	public float getWithstandCurrent() {
		return withstandCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Withstand Current</em>' attribute.
	 * @see #isSetWithstandCurrent()
	 * @see #unsetWithstandCurrent()
	 * @see #getWithstandCurrent()
	 * @generated
	 */
	public void setWithstandCurrent(float newWithstandCurrent) {
		withstandCurrent = newWithstandCurrent;
		withstandCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWithstandCurrent()
	 * @see #getWithstandCurrent()
	 * @see #setWithstandCurrent(float)
	 * @generated
	 */
	public void unsetWithstandCurrent() {
		withstandCurrent = WITHSTAND_CURRENT_EDEFAULT;
		withstandCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getWithstandCurrent <em>Withstand Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Withstand Current</em>' attribute is set.
	 * @see #unsetWithstandCurrent()
	 * @see #getWithstandCurrent()
	 * @see #setWithstandCurrent(float)
	 * @generated
	 */
	public boolean isSetWithstandCurrent() {
		return withstandCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>Load Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Break</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Break</em>' attribute.
	 * @see #isSetLoadBreak()
	 * @see #unsetLoadBreak()
	 * @see #setLoadBreak(boolean)
	 * @generated
	 */
	public boolean isLoadBreak() {
		return loadBreak;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Break</em>' attribute.
	 * @see #isSetLoadBreak()
	 * @see #unsetLoadBreak()
	 * @see #isLoadBreak()
	 * @generated
	 */
	public void setLoadBreak(boolean newLoadBreak) {
		loadBreak = newLoadBreak;
		loadBreakESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoadBreak()
	 * @see #isLoadBreak()
	 * @see #setLoadBreak(boolean)
	 * @generated
	 */
	public void unsetLoadBreak() {
		loadBreak = LOAD_BREAK_EDEFAULT;
		loadBreakESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isLoadBreak <em>Load Break</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Load Break</em>' attribute is set.
	 * @see #unsetLoadBreak()
	 * @see #isLoadBreak()
	 * @see #setLoadBreak(boolean)
	 * @generated
	 */
	public boolean isSetLoadBreak() {
		return loadBreakESet;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Current</em>' attribute.
	 * @see #isSetMinimumCurrent()
	 * @see #unsetMinimumCurrent()
	 * @see #setMinimumCurrent(float)
	 * @generated
	 */
	public float getMinimumCurrent() {
		return minimumCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Current</em>' attribute.
	 * @see #isSetMinimumCurrent()
	 * @see #unsetMinimumCurrent()
	 * @see #getMinimumCurrent()
	 * @generated
	 */
	public void setMinimumCurrent(float newMinimumCurrent) {
		minimumCurrent = newMinimumCurrent;
		minimumCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumCurrent()
	 * @see #getMinimumCurrent()
	 * @see #setMinimumCurrent(float)
	 * @generated
	 */
	public void unsetMinimumCurrent() {
		minimumCurrent = MINIMUM_CURRENT_EDEFAULT;
		minimumCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getMinimumCurrent <em>Minimum Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Current</em>' attribute is set.
	 * @see #unsetMinimumCurrent()
	 * @see #getMinimumCurrent()
	 * @see #setMinimumCurrent(float)
	 * @generated
	 */
	public boolean isSetMinimumCurrent() {
		return minimumCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>Interrupting Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupting Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupting Rating</em>' attribute.
	 * @see #isSetInterruptingRating()
	 * @see #unsetInterruptingRating()
	 * @see #setInterruptingRating(float)
	 * @generated
	 */
	public float getInterruptingRating() {
		return interruptingRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupting Rating</em>' attribute.
	 * @see #isSetInterruptingRating()
	 * @see #unsetInterruptingRating()
	 * @see #getInterruptingRating()
	 * @generated
	 */
	public void setInterruptingRating(float newInterruptingRating) {
		interruptingRating = newInterruptingRating;
		interruptingRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterruptingRating()
	 * @see #getInterruptingRating()
	 * @see #setInterruptingRating(float)
	 * @generated
	 */
	public void unsetInterruptingRating() {
		interruptingRating = INTERRUPTING_RATING_EDEFAULT;
		interruptingRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getInterruptingRating <em>Interrupting Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interrupting Rating</em>' attribute is set.
	 * @see #unsetInterruptingRating()
	 * @see #getInterruptingRating()
	 * @see #setInterruptingRating(float)
	 * @generated
	 */
	public boolean isSetInterruptingRating() {
		return interruptingRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #isSetRemote()
	 * @see #unsetRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	public boolean isRemote() {
		return remote;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #isSetRemote()
	 * @see #unsetRemote()
	 * @see #isRemote()
	 * @generated
	 */
	public void setRemote(boolean newRemote) {
		remote = newRemote;
		remoteESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemote()
	 * @see #isRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	public void unsetRemote() {
		remote = REMOTE_EDEFAULT;
		remoteESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#isRemote <em>Remote</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote</em>' attribute is set.
	 * @see #unsetRemote()
	 * @see #isRemote()
	 * @see #setRemote(boolean)
	 * @generated
	 */
	public boolean isSetRemote() {
		return remoteESet;
	}

	/**
	 * Returns the value of the '<em><b>Pole Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pole Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pole Count</em>' attribute.
	 * @see #isSetPoleCount()
	 * @see #unsetPoleCount()
	 * @see #setPoleCount(int)
	 * @generated
	 */
	public int getPoleCount() {
		return poleCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pole Count</em>' attribute.
	 * @see #isSetPoleCount()
	 * @see #unsetPoleCount()
	 * @see #getPoleCount()
	 * @generated
	 */
	public void setPoleCount(int newPoleCount) {
		poleCount = newPoleCount;
		poleCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoleCount()
	 * @see #getPoleCount()
	 * @see #setPoleCount(int)
	 * @generated
	 */
	public void unsetPoleCount() {
		poleCount = POLE_COUNT_EDEFAULT;
		poleCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.SwitchInfo#getPoleCount <em>Pole Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pole Count</em>' attribute is set.
	 * @see #unsetPoleCount()
	 * @see #getPoleCount()
	 * @see #setPoleCount(int)
	 * @generated
	 */
	public boolean isSetPoleCount() {
		return poleCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				return getDielectricStrength();
			case InfAssetsPackage.SWITCH_INFO__GANG:
				return isGang();
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				return getMakingCapacity();
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				return getWithstandCurrent();
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				return isLoadBreak();
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				return getMinimumCurrent();
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				return getInterruptingRating();
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
				return isRemote();
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				return getPoleCount();
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
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				setDielectricStrength((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__GANG:
				setGang((Boolean)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				setMakingCapacity((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				setWithstandCurrent((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				setLoadBreak((Boolean)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				setMinimumCurrent((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				setInterruptingRating((Float)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
				setRemote((Boolean)newValue);
				return;
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				setPoleCount((Integer)newValue);
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
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				unsetDielectricStrength();
				return;
			case InfAssetsPackage.SWITCH_INFO__GANG:
				unsetGang();
				return;
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				unsetMakingCapacity();
				return;
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				unsetWithstandCurrent();
				return;
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				unsetLoadBreak();
				return;
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				unsetMinimumCurrent();
				return;
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				unsetInterruptingRating();
				return;
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
				unsetRemote();
				return;
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				unsetPoleCount();
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
			case InfAssetsPackage.SWITCH_INFO__DIELECTRIC_STRENGTH:
				return isSetDielectricStrength();
			case InfAssetsPackage.SWITCH_INFO__GANG:
				return isSetGang();
			case InfAssetsPackage.SWITCH_INFO__MAKING_CAPACITY:
				return isSetMakingCapacity();
			case InfAssetsPackage.SWITCH_INFO__WITHSTAND_CURRENT:
				return isSetWithstandCurrent();
			case InfAssetsPackage.SWITCH_INFO__LOAD_BREAK:
				return isSetLoadBreak();
			case InfAssetsPackage.SWITCH_INFO__MINIMUM_CURRENT:
				return isSetMinimumCurrent();
			case InfAssetsPackage.SWITCH_INFO__INTERRUPTING_RATING:
				return isSetInterruptingRating();
			case InfAssetsPackage.SWITCH_INFO__REMOTE:
				return isSetRemote();
			case InfAssetsPackage.SWITCH_INFO__POLE_COUNT:
				return isSetPoleCount();
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
		result.append(" (dielectricStrength: ");
		if (dielectricStrengthESet) result.append(dielectricStrength); else result.append("<unset>");
		result.append(", gang: ");
		if (gangESet) result.append(gang); else result.append("<unset>");
		result.append(", makingCapacity: ");
		if (makingCapacityESet) result.append(makingCapacity); else result.append("<unset>");
		result.append(", withstandCurrent: ");
		if (withstandCurrentESet) result.append(withstandCurrent); else result.append("<unset>");
		result.append(", loadBreak: ");
		if (loadBreakESet) result.append(loadBreak); else result.append("<unset>");
		result.append(", minimumCurrent: ");
		if (minimumCurrentESet) result.append(minimumCurrent); else result.append("<unset>");
		result.append(", interruptingRating: ");
		if (interruptingRatingESet) result.append(interruptingRating); else result.append("<unset>");
		result.append(", remote: ");
		if (remoteESet) result.append(remote); else result.append("<unset>");
		result.append(", poleCount: ");
		if (poleCountESet) result.append(poleCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SwitchInfo
