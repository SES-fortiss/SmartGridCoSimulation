/**
 */
package CIM15.IEC61970.AuxiliaryEquipment;

import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPTInfo <em>PT Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPtClass <em>Pt Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotentialTransformer extends Sensor {
	/**
	 * The cached value of the '{@link #getPTInfo() <em>PT Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTInfo()
	 * @generated
	 * @ordered
	 */
	protected PotentialTransformerInfo ptInfo;

	/**
	 * The default value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRatio()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_RATIO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalRatio() <em>Nominal Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalRatio()
	 * @generated
	 * @ordered
	 */
	protected float nominalRatio = NOMINAL_RATIO_EDEFAULT;

	/**
	 * This is true if the Nominal Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalRatioESet;

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
	 * The default value of the '{@link #getPtClass() <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPtClass() <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPtClass()
	 * @generated
	 * @ordered
	 */
	protected String ptClass = PT_CLASS_EDEFAULT;

	/**
	 * This is true if the Pt Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ptClassESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentialTransformer() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuxiliaryEquipmentPackage.Literals.POTENTIAL_TRANSFORMER;
	}

	/**
	 * Returns the value of the '<em><b>PT Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPTs <em>PTs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PT Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT Info</em>' reference.
	 * @see #setPTInfo(PotentialTransformerInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPTs
	 * @generated
	 */
	public PotentialTransformerInfo getPTInfo() {
		if (ptInfo != null && ptInfo.eIsProxy()) {
			InternalEObject oldPTInfo = (InternalEObject)ptInfo;
			ptInfo = (PotentialTransformerInfo)eResolveProxy(oldPTInfo);
			if (ptInfo != oldPTInfo) {
			}
		}
		return ptInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialTransformerInfo basicGetPTInfo() {
		return ptInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTInfo(PotentialTransformerInfo newPTInfo, NotificationChain msgs) {
		PotentialTransformerInfo oldPTInfo = ptInfo;
		ptInfo = newPTInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPTInfo <em>PT Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT Info</em>' reference.
	 * @see #getPTInfo()
	 * @generated
	 */
	public void setPTInfo(PotentialTransformerInfo newPTInfo) {
		if (newPTInfo != ptInfo) {
			NotificationChain msgs = null;
			if (ptInfo != null)
				msgs = ((InternalEObject)ptInfo).eInverseRemove(this, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS, PotentialTransformerInfo.class, msgs);
			if (newPTInfo != null)
				msgs = ((InternalEObject)newPTInfo).eInverseAdd(this, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS, PotentialTransformerInfo.class, msgs);
			msgs = basicSetPTInfo(newPTInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Nominal Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Ratio</em>' attribute.
	 * @see #isSetNominalRatio()
	 * @see #unsetNominalRatio()
	 * @see #setNominalRatio(float)
	 * @generated
	 */
	public float getNominalRatio() {
		return nominalRatio;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Ratio</em>' attribute.
	 * @see #isSetNominalRatio()
	 * @see #unsetNominalRatio()
	 * @see #getNominalRatio()
	 * @generated
	 */
	public void setNominalRatio(float newNominalRatio) {
		nominalRatio = newNominalRatio;
		nominalRatioESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalRatio()
	 * @see #getNominalRatio()
	 * @see #setNominalRatio(float)
	 * @generated
	 */
	public void unsetNominalRatio() {
		nominalRatio = NOMINAL_RATIO_EDEFAULT;
		nominalRatioESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getNominalRatio <em>Nominal Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Ratio</em>' attribute is set.
	 * @see #unsetNominalRatio()
	 * @see #getNominalRatio()
	 * @see #setNominalRatio(float)
	 * @generated
	 */
	public boolean isSetNominalRatio() {
		return nominalRatioESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getAccuracyClass <em>Accuracy Class</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Pt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Class</em>' attribute.
	 * @see #isSetPtClass()
	 * @see #unsetPtClass()
	 * @see #setPtClass(String)
	 * @generated
	 */
	public String getPtClass() {
		return ptClass;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPtClass <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Class</em>' attribute.
	 * @see #isSetPtClass()
	 * @see #unsetPtClass()
	 * @see #getPtClass()
	 * @generated
	 */
	public void setPtClass(String newPtClass) {
		ptClass = newPtClass;
		ptClassESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPtClass <em>Pt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPtClass()
	 * @see #getPtClass()
	 * @see #setPtClass(String)
	 * @generated
	 */
	public void unsetPtClass() {
		ptClass = PT_CLASS_EDEFAULT;
		ptClassESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPtClass <em>Pt Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pt Class</em>' attribute is set.
	 * @see #unsetPtClass()
	 * @see #getPtClass()
	 * @see #setPtClass(String)
	 * @generated
	 */
	public boolean isSetPtClass() {
		return ptClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_INFO:
				if (ptInfo != null)
					msgs = ((InternalEObject)ptInfo).eInverseRemove(this, InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS, PotentialTransformerInfo.class, msgs);
				return basicSetPTInfo((PotentialTransformerInfo)otherEnd, msgs);
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
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_INFO:
				return basicSetPTInfo(null, msgs);
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
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_INFO:
				if (resolve) return getPTInfo();
				return basicGetPTInfo();
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				return getNominalRatio();
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
				return getAccuracyClass();
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				return getPtClass();
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
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_INFO:
				setPTInfo((PotentialTransformerInfo)newValue);
				return;
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				setNominalRatio((Float)newValue);
				return;
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
				setAccuracyClass((String)newValue);
				return;
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				setPtClass((String)newValue);
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
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_INFO:
				setPTInfo((PotentialTransformerInfo)null);
				return;
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				unsetNominalRatio();
				return;
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
				unsetAccuracyClass();
				return;
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				unsetPtClass();
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
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_INFO:
				return ptInfo != null;
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__NOMINAL_RATIO:
				return isSetNominalRatio();
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__ACCURACY_CLASS:
				return isSetAccuracyClass();
			case AuxiliaryEquipmentPackage.POTENTIAL_TRANSFORMER__PT_CLASS:
				return isSetPtClass();
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
		result.append(" (nominalRatio: ");
		if (nominalRatioESet) result.append(nominalRatio); else result.append("<unset>");
		result.append(", accuracyClass: ");
		if (accuracyClassESet) result.append(accuracyClass); else result.append("<unset>");
		result.append(", ptClass: ");
		if (ptClassESet) result.append(ptClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PotentialTransformer
