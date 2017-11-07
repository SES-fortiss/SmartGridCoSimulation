/**
 */
package CIM15.IEC61970.AuxiliaryEquipment;

import CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCtClass <em>Ct Class</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getUsage <em>Usage</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCoreCount <em>Core Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCTInfo <em>CT Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrentTransformer extends Sensor {
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
	 * The default value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCURACY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccuracyLimit() <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracyLimit()
	 * @generated
	 * @ordered
	 */
	protected String accuracyLimit = ACCURACY_LIMIT_EDEFAULT;

	/**
	 * This is true if the Accuracy Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accuracyLimitESet;

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
	 * The default value of the '{@link #getMaxRatio() <em>Max Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxRatio() <em>Max Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRatio()
	 * @generated
	 * @ordered
	 */
	protected float maxRatio = MAX_RATIO_EDEFAULT;

	/**
	 * This is true if the Max Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxRatioESet;

	/**
	 * The cached value of the '{@link #getCTInfo() <em>CT Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTInfo()
	 * @generated
	 * @ordered
	 */
	protected CurrentTransformerInfo ctInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTransformer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuxiliaryEquipmentPackage.Literals.CURRENT_TRANSFORMER;
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
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCtClass <em>Ct Class</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCtClass <em>Ct Class</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCtClass <em>Ct Class</em>}' attribute is set.
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
	 * @see #setAccuracyLimit(String)
	 * @generated
	 */
	public String getAccuracyLimit() {
		return accuracyLimit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy Limit</em>' attribute.
	 * @see #isSetAccuracyLimit()
	 * @see #unsetAccuracyLimit()
	 * @see #getAccuracyLimit()
	 * @generated
	 */
	public void setAccuracyLimit(String newAccuracyLimit) {
		accuracyLimit = newAccuracyLimit;
		accuracyLimitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccuracyLimit()
	 * @see #getAccuracyLimit()
	 * @see #setAccuracyLimit(String)
	 * @generated
	 */
	public void unsetAccuracyLimit() {
		accuracyLimit = ACCURACY_LIMIT_EDEFAULT;
		accuracyLimitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyLimit <em>Accuracy Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accuracy Limit</em>' attribute is set.
	 * @see #unsetAccuracyLimit()
	 * @see #getAccuracyLimit()
	 * @see #setAccuracyLimit(String)
	 * @generated
	 */
	public boolean isSetAccuracyLimit() {
		return accuracyLimitESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getUsage <em>Usage</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getUsage <em>Usage</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getUsage <em>Usage</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCoreCount <em>Core Count</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCoreCount <em>Core Count</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCoreCount <em>Core Count</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Max Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ratio</em>' attribute.
	 * @see #isSetMaxRatio()
	 * @see #unsetMaxRatio()
	 * @see #setMaxRatio(float)
	 * @generated
	 */
	public float getMaxRatio() {
		return maxRatio;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ratio</em>' attribute.
	 * @see #isSetMaxRatio()
	 * @see #unsetMaxRatio()
	 * @see #getMaxRatio()
	 * @generated
	 */
	public void setMaxRatio(float newMaxRatio) {
		maxRatio = newMaxRatio;
		maxRatioESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRatio()
	 * @see #getMaxRatio()
	 * @see #setMaxRatio(float)
	 * @generated
	 */
	public void unsetMaxRatio() {
		maxRatio = MAX_RATIO_EDEFAULT;
		maxRatioESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getMaxRatio <em>Max Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Ratio</em>' attribute is set.
	 * @see #unsetMaxRatio()
	 * @see #getMaxRatio()
	 * @see #setMaxRatio(float)
	 * @generated
	 */
	public boolean isSetMaxRatio() {
		return maxRatioESet;
	}

	/**
	 * Returns the value of the '<em><b>CT Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCTs <em>CTs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CT Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CT Info</em>' reference.
	 * @see #setCTInfo(CurrentTransformerInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.CurrentTransformerInfo#getCTs
	 * @generated
	 */
	public CurrentTransformerInfo getCTInfo() {
		if (ctInfo != null && ctInfo.eIsProxy()) {
			InternalEObject oldCTInfo = (InternalEObject)ctInfo;
			ctInfo = (CurrentTransformerInfo)eResolveProxy(oldCTInfo);
			if (ctInfo != oldCTInfo) {
			}
		}
		return ctInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTransformerInfo basicGetCTInfo() {
		return ctInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTInfo(CurrentTransformerInfo newCTInfo, NotificationChain msgs) {
		CurrentTransformerInfo oldCTInfo = ctInfo;
		ctInfo = newCTInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.CurrentTransformer#getCTInfo <em>CT Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CT Info</em>' reference.
	 * @see #getCTInfo()
	 * @generated
	 */
	public void setCTInfo(CurrentTransformerInfo newCTInfo) {
		if (newCTInfo != ctInfo) {
			NotificationChain msgs = null;
			if (ctInfo != null)
				msgs = ((InternalEObject)ctInfo).eInverseRemove(this, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS, CurrentTransformerInfo.class, msgs);
			if (newCTInfo != null)
				msgs = ((InternalEObject)newCTInfo).eInverseAdd(this, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS, CurrentTransformerInfo.class, msgs);
			msgs = basicSetCTInfo(newCTInfo, msgs);
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
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_INFO:
				if (ctInfo != null)
					msgs = ((InternalEObject)ctInfo).eInverseRemove(this, InfAssetsPackage.CURRENT_TRANSFORMER_INFO__CTS, CurrentTransformerInfo.class, msgs);
				return basicSetCTInfo((CurrentTransformerInfo)otherEnd, msgs);
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
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_INFO:
				return basicSetCTInfo(null, msgs);
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
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_CLASS:
				return getCtClass();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				return getAccuracyLimit();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__USAGE:
				return getUsage();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				return getAccuracyClass();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				return getCoreCount();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				return getMaxRatio();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_INFO:
				if (resolve) return getCTInfo();
				return basicGetCTInfo();
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
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_CLASS:
				setCtClass((String)newValue);
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				setAccuracyLimit((String)newValue);
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__USAGE:
				setUsage((String)newValue);
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				setAccuracyClass((String)newValue);
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				setCoreCount((Integer)newValue);
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				setMaxRatio((Float)newValue);
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_INFO:
				setCTInfo((CurrentTransformerInfo)newValue);
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
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_CLASS:
				unsetCtClass();
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				unsetAccuracyLimit();
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__USAGE:
				unsetUsage();
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				unsetAccuracyClass();
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				unsetCoreCount();
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				unsetMaxRatio();
				return;
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_INFO:
				setCTInfo((CurrentTransformerInfo)null);
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
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_CLASS:
				return isSetCtClass();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_LIMIT:
				return isSetAccuracyLimit();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__USAGE:
				return isSetUsage();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__ACCURACY_CLASS:
				return isSetAccuracyClass();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CORE_COUNT:
				return isSetCoreCount();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__MAX_RATIO:
				return isSetMaxRatio();
			case AuxiliaryEquipmentPackage.CURRENT_TRANSFORMER__CT_INFO:
				return ctInfo != null;
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
		result.append(" (ctClass: ");
		if (ctClassESet) result.append(ctClass); else result.append("<unset>");
		result.append(", accuracyLimit: ");
		if (accuracyLimitESet) result.append(accuracyLimit); else result.append("<unset>");
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", accuracyClass: ");
		if (accuracyClassESet) result.append(accuracyClass); else result.append("<unset>");
		result.append(", coreCount: ");
		if (coreCountESet) result.append(coreCount); else result.append("<unset>");
		result.append(", maxRatio: ");
		if (maxRatioESet) result.append(maxRatio); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CurrentTransformer
