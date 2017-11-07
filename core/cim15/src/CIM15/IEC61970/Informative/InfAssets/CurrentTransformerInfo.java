/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer;

import CIM15.IEC61970.Informative.InfCommon.Ratio;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCTs <em>CTs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio <em>Max Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentTransformerInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getTertiaryFlsRating() <em>Tertiary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTertiaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected static final float TERTIARY_FLS_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTertiaryFlsRating() <em>Tertiary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTertiaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected float tertiaryFlsRating = TERTIARY_FLS_RATING_EDEFAULT;

	/**
	 * This is true if the Tertiary Fls Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tertiaryFlsRatingESet;

	/**
	 * The default value of the '{@link #getCoreCount() <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreCount() <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreCount()
	 * @generated
	 * @ordered
	 */
	protected int coreCount = CORE_COUNT_EDEFAULT;

	/**
	 * This is true if the Core Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreCountESet;

	/**
	 * The cached value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio nominalRatio;

	/**
	 * The default value of the '{@link #getSecondaryFlsRating() <em>Secondary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected static final float SECONDARY_FLS_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSecondaryFlsRating() <em>Secondary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected float secondaryFlsRating = SECONDARY_FLS_RATING_EDEFAULT;

	/**
	 * This is true if the Secondary Fls Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondaryFlsRatingESet;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * The default value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCURACY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccuracyClass() <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyClass()
	 * @generated
	 * @ordered
	 */
	protected String accuracyClass = ACCURACY_CLASS_EDEFAULT;

	/**
	 * This is true if the Accuracy Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accuracyClassESet;

	/**
	 * The cached value of the '{@link #getSecondaryRatio() <em>Secondary Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio secondaryRatio;

	/**
	 * The cached value of the '{@link #getCTs() <em>CTs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTs()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrentTransformer> cTs;

	/**
	 * The default value of the '{@link #getCtClass() <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCtClass() <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtClass()
	 * @generated
	 * @ordered
	 */
	protected String ctClass = CT_CLASS_EDEFAULT;

	/**
	 * This is true if the Ct Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctClassESet;

	/**
	 * The default value of the '{@link #getKneePointVoltage() <em>Knee Point Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float KNEE_POINT_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKneePointVoltage() <em>Knee Point Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointVoltage()
	 * @generated
	 * @ordered
	 */
	protected float kneePointVoltage = KNEE_POINT_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Knee Point Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kneePointVoltageESet;

	/**
	 * The cached value of the '{@link #getTertiaryRatio() <em>Tertiary Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTertiaryRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio tertiaryRatio;

	/**
	 * The default value of the '{@link #getCoreBurden() <em>Core Burden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreBurden()
	 * @generated
	 * @ordered
	 */
	protected static final float CORE_BURDEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoreBurden() <em>Core Burden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreBurden()
	 * @generated
	 * @ordered
	 */
	protected float coreBurden = CORE_BURDEN_EDEFAULT;

	/**
	 * This is true if the Core Burden attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreBurdenESet;

	/**
	 * The cached value of the '{@link #getMaxRatio() <em>Max Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio maxRatio;

	/**
	 * The default value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float ACCURACY_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected float accuracyLimit = ACCURACY_LIMIT_EDEFAULT;

	/**
	 * This is true if the Accuracy Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accuracyLimitESet;

	/**
	 * The default value of the '{@link #getKneePointCurrent() <em>Knee Point Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float KNEE_POINT_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKneePointCurrent() <em>Knee Point Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKneePointCurrent()
	 * @generated
	 * @ordered
	 */
	protected float kneePointCurrent = KNEE_POINT_CURRENT_EDEFAULT;

	/**
	 * This is true if the Knee Point Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kneePointCurrentESet;

	/**
	 * The cached value of the '{@link #getPrimaryRatio() <em>Primary Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio primaryRatio;

	/**
	 * The default value of the '{@link #getPrimaryFlsRating() <em>Primary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected static final float PRIMARY_FLS_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrimaryFlsRating() <em>Primary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFlsRating()
	 * @generated
	 * @ordered
	 */
	protected float primaryFlsRating = PRIMARY_FLS_RATING_EDEFAULT;

	/**
	 * This is true if the Primary Fls Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean primaryFlsRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTransformerInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getCurrentTransformerInfo();
	}

	/**
	 * Returns the value of the '<em><b>Tertiary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tertiary Fls Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiary Fls Rating</em>' attribute.
	 * @see #isSetTertiaryFlsRating()
	 * @see #unsetTertiaryFlsRating()
	 * @see #setTertiaryFlsRating(float)
	 * @generated
	 */
	public float getTertiaryFlsRating() {
		return tertiaryFlsRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiary Fls Rating</em>' attribute.
	 * @see #isSetTertiaryFlsRating()
	 * @see #unsetTertiaryFlsRating()
	 * @see #getTertiaryFlsRating()
	 * @generated
	 */
	public void setTertiaryFlsRating(float newTertiaryFlsRating) {
		tertiaryFlsRating = newTertiaryFlsRating;
		tertiaryFlsRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTertiaryFlsRating()
	 * @see #getTertiaryFlsRating()
	 * @see #setTertiaryFlsRating(float)
	 * @generated
	 */
	public void unsetTertiaryFlsRating() {
		tertiaryFlsRating = TERTIARY_FLS_RATING_EDEFAULT;
		tertiaryFlsRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryFlsRating <em>Tertiary Fls Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tertiary Fls Rating</em>' attribute is set.
	 * @see #unsetTertiaryFlsRating()
	 * @see #getTertiaryFlsRating()
	 * @see #setTertiaryFlsRating(float)
	 * @generated
	 */
	public boolean isSetTertiaryFlsRating() {
		return tertiaryFlsRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Core Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Count</em>' attribute.
	 * @see #isSetCoreCount()
	 * @see #unsetCoreCount()
	 * @see #setCoreCount(int)
	 * @generated
	 */
	public int getCoreCount() {
		return coreCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Count</em>' attribute.
	 * @see #isSetCoreCount()
	 * @see #unsetCoreCount()
	 * @see #getCoreCount()
	 * @generated
	 */
	public void setCoreCount(int newCoreCount) {
		coreCount = newCoreCount;
		coreCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreCount()
	 * @see #getCoreCount()
	 * @see #setCoreCount(int)
	 * @generated
	 */
	public void unsetCoreCount() {
		coreCount = CORE_COUNT_EDEFAULT;
		coreCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreCount <em>Core Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Count</em>' attribute is set.
	 * @see #unsetCoreCount()
	 * @see #getCoreCount()
	 * @see #setCoreCount(int)
	 * @generated
	 */
	public boolean isSetCoreCount() {
		return coreCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Nominal Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Ratio</em>' containment reference.
	 * @see #setNominalRatio(Ratio)
	 * @generated
	 */
	public Ratio getNominalRatio() {
		return nominalRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominalRatio(Ratio newNominalRatio, NotificationChain msgs) {
		Ratio oldNominalRatio = nominalRatio;
		nominalRatio = newNominalRatio;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Ratio</em>' containment reference.
	 * @see #getNominalRatio()
	 * @generated
	 */
	public void setNominalRatio(Ratio newNominalRatio) {
		if (newNominalRatio != nominalRatio) {
			NotificationChain msgs = null;
			if (nominalRatio != null)
				msgs = ((InternalEObject)nominalRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO, null, msgs);
			if (newNominalRatio != null)
				msgs = ((InternalEObject)newNominalRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO, null, msgs);
			msgs = basicSetNominalRatio(newNominalRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Secondary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Fls Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Fls Rating</em>' attribute.
	 * @see #isSetSecondaryFlsRating()
	 * @see #unsetSecondaryFlsRating()
	 * @see #setSecondaryFlsRating(float)
	 * @generated
	 */
	public float getSecondaryFlsRating() {
		return secondaryFlsRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Fls Rating</em>' attribute.
	 * @see #isSetSecondaryFlsRating()
	 * @see #unsetSecondaryFlsRating()
	 * @see #getSecondaryFlsRating()
	 * @generated
	 */
	public void setSecondaryFlsRating(float newSecondaryFlsRating) {
		secondaryFlsRating = newSecondaryFlsRating;
		secondaryFlsRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondaryFlsRating()
	 * @see #getSecondaryFlsRating()
	 * @see #setSecondaryFlsRating(float)
	 * @generated
	 */
	public void unsetSecondaryFlsRating() {
		secondaryFlsRating = SECONDARY_FLS_RATING_EDEFAULT;
		secondaryFlsRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryFlsRating <em>Secondary Fls Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Secondary Fls Rating</em>' attribute is set.
	 * @see #unsetSecondaryFlsRating()
	 * @see #getSecondaryFlsRating()
	 * @see #setSecondaryFlsRating(float)
	 * @generated
	 */
	public boolean isSetSecondaryFlsRating() {
		return secondaryFlsRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(String)
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	public void setUsage(String newUsage) {
		usage = newUsage;
		usageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(String)
	 * @generated
	 */
	public void unsetUsage() {
		usage = USAGE_EDEFAULT;
		usageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(String)
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * Returns the value of the '<em><b>Accuracy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy Class</em>' attribute.
	 * @see #isSetAccuracyClass()
	 * @see #unsetAccuracyClass()
	 * @see #setAccuracyClass(String)
	 * @generated
	 */
	public String getAccuracyClass() {
		return accuracyClass;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Class</em>' attribute.
	 * @see #isSetAccuracyClass()
	 * @see #unsetAccuracyClass()
	 * @see #getAccuracyClass()
	 * @generated
	 */
	public void setAccuracyClass(String newAccuracyClass) {
		accuracyClass = newAccuracyClass;
		accuracyClassESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccuracyClass()
	 * @see #getAccuracyClass()
	 * @see #setAccuracyClass(String)
	 * @generated
	 */
	public void unsetAccuracyClass() {
		accuracyClass = ACCURACY_CLASS_EDEFAULT;
		accuracyClassESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accuracy Class</em>' attribute is set.
	 * @see #unsetAccuracyClass()
	 * @see #getAccuracyClass()
	 * @see #setAccuracyClass(String)
	 * @generated
	 */
	public boolean isSetAccuracyClass() {
		return accuracyClassESet;
	}

	/**
	 * Returns the value of the '<em><b>Secondary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Ratio</em>' containment reference.
	 * @see #setSecondaryRatio(Ratio)
	 * @generated
	 */
	public Ratio getSecondaryRatio() {
		return secondaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryRatio(Ratio newSecondaryRatio, NotificationChain msgs) {
		Ratio oldSecondaryRatio = secondaryRatio;
		secondaryRatio = newSecondaryRatio;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Ratio</em>' containment reference.
	 * @see #getSecondaryRatio()
	 * @generated
	 */
	public void setSecondaryRatio(Ratio newSecondaryRatio) {
		if (newSecondaryRatio != secondaryRatio) {
			NotificationChain msgs = null;
			if (secondaryRatio != null)
				msgs = ((InternalEObject)secondaryRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO, null, msgs);
			if (newSecondaryRatio != null)
				msgs = ((InternalEObject)newSecondaryRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO, null, msgs);
			msgs = basicSetSecondaryRatio(newSecondaryRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>CTs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCTInfo <em>CT Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTs</em>' reference list.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCTInfo
	 * @generated
	 */
	public EList<CurrentTransformer> getCTs() {
		if (cTs == null) {
			cTs = new BasicInternalEList<CurrentTransformer>(CurrentTransformer.class);
		}
		return cTs;
	}

	/**
	 * Returns the value of the '<em><b>Ct Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ct Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ct Class</em>' attribute.
	 * @see #isSetCtClass()
	 * @see #unsetCtClass()
	 * @see #setCtClass(String)
	 * @generated
	 */
	public String getCtClass() {
		return ctClass;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ct Class</em>' attribute.
	 * @see #isSetCtClass()
	 * @see #unsetCtClass()
	 * @see #getCtClass()
	 * @generated
	 */
	public void setCtClass(String newCtClass) {
		ctClass = newCtClass;
		ctClassESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCtClass()
	 * @see #getCtClass()
	 * @see #setCtClass(String)
	 * @generated
	 */
	public void unsetCtClass() {
		ctClass = CT_CLASS_EDEFAULT;
		ctClassESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCtClass <em>Ct Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ct Class</em>' attribute is set.
	 * @see #unsetCtClass()
	 * @see #getCtClass()
	 * @see #setCtClass(String)
	 * @generated
	 */
	public boolean isSetCtClass() {
		return ctClassESet;
	}

	/**
	 * Returns the value of the '<em><b>Knee Point Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knee Point Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knee Point Voltage</em>' attribute.
	 * @see #isSetKneePointVoltage()
	 * @see #unsetKneePointVoltage()
	 * @see #setKneePointVoltage(float)
	 * @generated
	 */
	public float getKneePointVoltage() {
		return kneePointVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knee Point Voltage</em>' attribute.
	 * @see #isSetKneePointVoltage()
	 * @see #unsetKneePointVoltage()
	 * @see #getKneePointVoltage()
	 * @generated
	 */
	public void setKneePointVoltage(float newKneePointVoltage) {
		kneePointVoltage = newKneePointVoltage;
		kneePointVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKneePointVoltage()
	 * @see #getKneePointVoltage()
	 * @see #setKneePointVoltage(float)
	 * @generated
	 */
	public void unsetKneePointVoltage() {
		kneePointVoltage = KNEE_POINT_VOLTAGE_EDEFAULT;
		kneePointVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointVoltage <em>Knee Point Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Knee Point Voltage</em>' attribute is set.
	 * @see #unsetKneePointVoltage()
	 * @see #getKneePointVoltage()
	 * @see #setKneePointVoltage(float)
	 * @generated
	 */
	public boolean isSetKneePointVoltage() {
		return kneePointVoltageESet;
	}

	/**
	 * Returns the value of the '<em><b>Tertiary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tertiary Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiary Ratio</em>' containment reference.
	 * @see #setTertiaryRatio(Ratio)
	 * @generated
	 */
	public Ratio getTertiaryRatio() {
		return tertiaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTertiaryRatio(Ratio newTertiaryRatio, NotificationChain msgs) {
		Ratio oldTertiaryRatio = tertiaryRatio;
		tertiaryRatio = newTertiaryRatio;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiary Ratio</em>' containment reference.
	 * @see #getTertiaryRatio()
	 * @generated
	 */
	public void setTertiaryRatio(Ratio newTertiaryRatio) {
		if (newTertiaryRatio != tertiaryRatio) {
			NotificationChain msgs = null;
			if (tertiaryRatio != null)
				msgs = ((InternalEObject)tertiaryRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO, null, msgs);
			if (newTertiaryRatio != null)
				msgs = ((InternalEObject)newTertiaryRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO, null, msgs);
			msgs = basicSetTertiaryRatio(newTertiaryRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Core Burden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Burden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Burden</em>' attribute.
	 * @see #isSetCoreBurden()
	 * @see #unsetCoreBurden()
	 * @see #setCoreBurden(float)
	 * @generated
	 */
	public float getCoreBurden() {
		return coreBurden;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Burden</em>' attribute.
	 * @see #isSetCoreBurden()
	 * @see #unsetCoreBurden()
	 * @see #getCoreBurden()
	 * @generated
	 */
	public void setCoreBurden(float newCoreBurden) {
		coreBurden = newCoreBurden;
		coreBurdenESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreBurden()
	 * @see #getCoreBurden()
	 * @see #setCoreBurden(float)
	 * @generated
	 */
	public void unsetCoreBurden() {
		coreBurden = CORE_BURDEN_EDEFAULT;
		coreBurdenESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCoreBurden <em>Core Burden</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Burden</em>' attribute is set.
	 * @see #unsetCoreBurden()
	 * @see #getCoreBurden()
	 * @see #setCoreBurden(float)
	 * @generated
	 */
	public boolean isSetCoreBurden() {
		return coreBurdenESet;
	}

	/**
	 * Returns the value of the '<em><b>Max Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ratio</em>' containment reference.
	 * @see #setMaxRatio(Ratio)
	 * @generated
	 */
	public Ratio getMaxRatio() {
		return maxRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxRatio(Ratio newMaxRatio, NotificationChain msgs) {
		Ratio oldMaxRatio = maxRatio;
		maxRatio = newMaxRatio;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getMaxRatio <em>Max Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ratio</em>' containment reference.
	 * @see #getMaxRatio()
	 * @generated
	 */
	public void setMaxRatio(Ratio newMaxRatio) {
		if (newMaxRatio != maxRatio) {
			NotificationChain msgs = null;
			if (maxRatio != null)
				msgs = ((InternalEObject)maxRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO, null, msgs);
			if (newMaxRatio != null)
				msgs = ((InternalEObject)newMaxRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO, null, msgs);
			msgs = basicSetMaxRatio(newMaxRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Accuracy Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy Limit</em>' attribute.
	 * @see #isSetAccuracyLimit()
	 * @see #unsetAccuracyLimit()
	 * @see #setAccuracyLimit(float)
	 * @generated
	 */
	public float getAccuracyLimit() {
		return accuracyLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Limit</em>' attribute.
	 * @see #isSetAccuracyLimit()
	 * @see #unsetAccuracyLimit()
	 * @see #getAccuracyLimit()
	 * @generated
	 */
	public void setAccuracyLimit(float newAccuracyLimit) {
		accuracyLimit = newAccuracyLimit;
		accuracyLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccuracyLimit()
	 * @see #getAccuracyLimit()
	 * @see #setAccuracyLimit(float)
	 * @generated
	 */
	public void unsetAccuracyLimit() {
		accuracyLimit = ACCURACY_LIMIT_EDEFAULT;
		accuracyLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getAccuracyLimit <em>Accuracy Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accuracy Limit</em>' attribute is set.
	 * @see #unsetAccuracyLimit()
	 * @see #getAccuracyLimit()
	 * @see #setAccuracyLimit(float)
	 * @generated
	 */
	public boolean isSetAccuracyLimit() {
		return accuracyLimitESet;
	}

	/**
	 * Returns the value of the '<em><b>Knee Point Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knee Point Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knee Point Current</em>' attribute.
	 * @see #isSetKneePointCurrent()
	 * @see #unsetKneePointCurrent()
	 * @see #setKneePointCurrent(float)
	 * @generated
	 */
	public float getKneePointCurrent() {
		return kneePointCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knee Point Current</em>' attribute.
	 * @see #isSetKneePointCurrent()
	 * @see #unsetKneePointCurrent()
	 * @see #getKneePointCurrent()
	 * @generated
	 */
	public void setKneePointCurrent(float newKneePointCurrent) {
		kneePointCurrent = newKneePointCurrent;
		kneePointCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKneePointCurrent()
	 * @see #getKneePointCurrent()
	 * @see #setKneePointCurrent(float)
	 * @generated
	 */
	public void unsetKneePointCurrent() {
		kneePointCurrent = KNEE_POINT_CURRENT_EDEFAULT;
		kneePointCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getKneePointCurrent <em>Knee Point Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Knee Point Current</em>' attribute is set.
	 * @see #unsetKneePointCurrent()
	 * @see #getKneePointCurrent()
	 * @see #setKneePointCurrent(float)
	 * @generated
	 */
	public boolean isSetKneePointCurrent() {
		return kneePointCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>Primary Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Ratio</em>' containment reference.
	 * @see #setPrimaryRatio(Ratio)
	 * @generated
	 */
	public Ratio getPrimaryRatio() {
		return primaryRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryRatio(Ratio newPrimaryRatio, NotificationChain msgs) {
		Ratio oldPrimaryRatio = primaryRatio;
		primaryRatio = newPrimaryRatio;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Ratio</em>' containment reference.
	 * @see #getPrimaryRatio()
	 * @generated
	 */
	public void setPrimaryRatio(Ratio newPrimaryRatio) {
		if (newPrimaryRatio != primaryRatio) {
			NotificationChain msgs = null;
			if (primaryRatio != null)
				msgs = ((InternalEObject)primaryRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO, null, msgs);
			if (newPrimaryRatio != null)
				msgs = ((InternalEObject)newPrimaryRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO, null, msgs);
			msgs = basicSetPrimaryRatio(newPrimaryRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Primary Fls Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Fls Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Fls Rating</em>' attribute.
	 * @see #isSetPrimaryFlsRating()
	 * @see #unsetPrimaryFlsRating()
	 * @see #setPrimaryFlsRating(float)
	 * @generated
	 */
	public float getPrimaryFlsRating() {
		return primaryFlsRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Fls Rating</em>' attribute.
	 * @see #isSetPrimaryFlsRating()
	 * @see #unsetPrimaryFlsRating()
	 * @see #getPrimaryFlsRating()
	 * @generated
	 */
	public void setPrimaryFlsRating(float newPrimaryFlsRating) {
		primaryFlsRating = newPrimaryFlsRating;
		primaryFlsRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrimaryFlsRating()
	 * @see #getPrimaryFlsRating()
	 * @see #setPrimaryFlsRating(float)
	 * @generated
	 */
	public void unsetPrimaryFlsRating() {
		primaryFlsRating = PRIMARY_FLS_RATING_EDEFAULT;
		primaryFlsRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getPrimaryFlsRating <em>Primary Fls Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Primary Fls Rating</em>' attribute is set.
	 * @see #unsetPrimaryFlsRating()
	 * @see #getPrimaryFlsRating()
	 * @see #setPrimaryFlsRating(float)
	 * @generated
	 */
	public boolean isSetPrimaryFlsRating() {
		return primaryFlsRatingESet;
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCTs()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				return basicSetNominalRatio(null, msgs);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				return basicSetSecondaryRatio(null, msgs);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS:
				return ((InternalEList<?>)getCTs()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				return basicSetTertiaryRatio(null, msgs);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				return basicSetMaxRatio(null, msgs);
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				return basicSetPrimaryRatio(null, msgs);
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				return getTertiaryFlsRating();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				return getCoreCount();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				return getNominalRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				return getSecondaryFlsRating();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				return getUsage();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				return getAccuracyClass();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				return getSecondaryRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS:
				return getCTs();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				return getCtClass();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				return getKneePointVoltage();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				return getTertiaryRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				return getCoreBurden();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				return getMaxRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				return getAccuracyLimit();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				return getKneePointCurrent();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				return getPrimaryRatio();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				return getPrimaryFlsRating();
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				setTertiaryFlsRating((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				setCoreCount((Integer)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				setSecondaryFlsRating((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				setUsage((String)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				setAccuracyClass((String)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS:
				getCTs().clear();
				getCTs().addAll((Collection<? extends CurrentTransformer>)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				setCtClass((String)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				setKneePointVoltage((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				setCoreBurden((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				setMaxRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				setAccuracyLimit((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				setKneePointCurrent((Float)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				setPrimaryFlsRating((Float)newValue);
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				unsetTertiaryFlsRating();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				unsetCoreCount();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				unsetSecondaryFlsRating();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				unsetUsage();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				unsetAccuracyClass();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS:
				getCTs().clear();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				unsetCtClass();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				unsetKneePointVoltage();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				unsetCoreBurden();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				setMaxRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				unsetAccuracyLimit();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				unsetKneePointCurrent();
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				unsetPrimaryFlsRating();
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
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_FLS_RATING:
				return isSetTertiaryFlsRating();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_COUNT:
				return isSetCoreCount();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__NOMINAL_RATIO:
				return nominalRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_FLS_RATING:
				return isSetSecondaryFlsRating();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__USAGE:
				return isSetUsage();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_CLASS:
				return isSetAccuracyClass();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__SECONDARY_RATIO:
				return secondaryRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS:
				return cTs != null && !cTs.isEmpty();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CT_CLASS:
				return isSetCtClass();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_VOLTAGE:
				return isSetKneePointVoltage();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__TERTIARY_RATIO:
				return tertiaryRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CORE_BURDEN:
				return isSetCoreBurden();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__MAX_RATIO:
				return maxRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__ACCURACY_LIMIT:
				return isSetAccuracyLimit();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__KNEE_POINT_CURRENT:
				return isSetKneePointCurrent();
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_RATIO:
				return primaryRatio != null;
			case InfAssetsPackage.CURRENT_TRANSFORMER_INFO__PRIMARY_FLS_RATING:
				return isSetPrimaryFlsRating();
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
		result.append(" (tertiaryFlsRating: ");
		if (tertiaryFlsRatingESet) result.append(tertiaryFlsRating); else result.append("<unset>");
		result.append(", coreCount: ");
		if (coreCountESet) result.append(coreCount); else result.append("<unset>");
		result.append(", secondaryFlsRating: ");
		if (secondaryFlsRatingESet) result.append(secondaryFlsRating); else result.append("<unset>");
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", accuracyClass: ");
		if (accuracyClassESet) result.append(accuracyClass); else result.append("<unset>");
		result.append(", ctClass: ");
		if (ctClassESet) result.append(ctClass); else result.append("<unset>");
		result.append(", kneePointVoltage: ");
		if (kneePointVoltageESet) result.append(kneePointVoltage); else result.append("<unset>");
		result.append(", coreBurden: ");
		if (coreBurdenESet) result.append(coreBurden); else result.append("<unset>");
		result.append(", accuracyLimit: ");
		if (accuracyLimitESet) result.append(accuracyLimit); else result.append("<unset>");
		result.append(", kneePointCurrent: ");
		if (kneePointCurrentESet) result.append(kneePointCurrent); else result.append("<unset>");
		result.append(", primaryFlsRating: ");
		if (primaryFlsRatingESet) result.append(primaryFlsRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CurrentTransformerInfo
