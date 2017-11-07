/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer;

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
 * A representation of the model object '<em><b>Potential Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPTs <em>PTs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotentialTransformerInfo extends AssetInfo {
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
	 * The cached value of the '{@link #getPrimaryRatio() <em>Primary Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio primaryRatio;

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
	 * The cached value of the '{@link #getPTs() <em>PTs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTs()
	 * @generated
	 * @ordered
	 */
	protected EList<PotentialTransformer> pTs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentialTransformerInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getPotentialTransformerInfo();
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getNominalRatio <em>Nominal Ratio</em>}' containment reference.
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
				msgs = ((InternalEObject)nominalRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO, null, msgs);
			if (newNominalRatio != null)
				msgs = ((InternalEObject)newNominalRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO, null, msgs);
			msgs = basicSetNominalRatio(newNominalRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPtClass <em>Pt Class</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getPrimaryRatio <em>Primary Ratio</em>}' containment reference.
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
				msgs = ((InternalEObject)primaryRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO, null, msgs);
			if (newPrimaryRatio != null)
				msgs = ((InternalEObject)newPrimaryRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO, null, msgs);
			msgs = basicSetPrimaryRatio(newPrimaryRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getTertiaryRatio <em>Tertiary Ratio</em>}' containment reference.
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
				msgs = ((InternalEObject)tertiaryRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO, null, msgs);
			if (newTertiaryRatio != null)
				msgs = ((InternalEObject)newTertiaryRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO, null, msgs);
			msgs = basicSetTertiaryRatio(newTertiaryRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getAccuracyClass <em>Accuracy Class</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>PTs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPTInfo <em>PT Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTs</em>' reference list.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.PotentialTransformer#getPTInfo
	 * @generated
	 */
	public EList<PotentialTransformer> getPTs() {
		if (pTs == null) {
			pTs = new BasicInternalEList<PotentialTransformer>(PotentialTransformer.class);
		}
		return pTs;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.PotentialTransformerInfo#getSecondaryRatio <em>Secondary Ratio</em>}' containment reference.
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
				msgs = ((InternalEObject)secondaryRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO, null, msgs);
			if (newSecondaryRatio != null)
				msgs = ((InternalEObject)newSecondaryRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO, null, msgs);
			msgs = basicSetSecondaryRatio(newSecondaryRatio, msgs);
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPTs()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				return basicSetNominalRatio(null, msgs);
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				return basicSetPrimaryRatio(null, msgs);
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				return basicSetTertiaryRatio(null, msgs);
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS:
				return ((InternalEList<?>)getPTs()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				return basicSetSecondaryRatio(null, msgs);
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				return getNominalRatio();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				return getPtClass();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				return getPrimaryRatio();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				return getTertiaryRatio();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				return getAccuracyClass();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS:
				return getPTs();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				return getSecondaryRatio();
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				setPtClass((String)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				setAccuracyClass((String)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS:
				getPTs().clear();
				getPTs().addAll((Collection<? extends PotentialTransformer>)newValue);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)newValue);
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				setNominalRatio((Ratio)null);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				unsetPtClass();
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				setPrimaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				setTertiaryRatio((Ratio)null);
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				unsetAccuracyClass();
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS:
				getPTs().clear();
				return;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				setSecondaryRatio((Ratio)null);
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
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__NOMINAL_RATIO:
				return nominalRatio != null;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PT_CLASS:
				return isSetPtClass();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PRIMARY_RATIO:
				return primaryRatio != null;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__TERTIARY_RATIO:
				return tertiaryRatio != null;
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__ACCURACY_CLASS:
				return isSetAccuracyClass();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__PTS:
				return pTs != null && !pTs.isEmpty();
			case InfAssetsPackage.POTENTIAL_TRANSFORMER_INFO__SECONDARY_RATIO:
				return secondaryRatio != null;
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
		result.append(" (ptClass: ");
		if (ptClassESet) result.append(ptClass); else result.append("<unset>");
		result.append(", accuracyClass: ");
		if (accuracyClassESet) result.append(accuracyClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PotentialTransformerInfo
