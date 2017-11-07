/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.UserAttribute;

import CIM15.IEC61970.Informative.InfWork.QualificationRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Specification#getAssetPropertyCurves <em>Asset Property Curves</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Specification#getMediums <em>Mediums</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Specification#getAssetProperites <em>Asset Properites</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Specification#getReliabilityInfos <em>Reliability Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Specification#getDimensionsInfos <em>Dimensions Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Specification#getRatings <em>Ratings</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Specification extends Document {
	/**
	 * The cached value of the '{@link #getAssetPropertyCurves() <em>Asset Property Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPropertyCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetPropertyCurve> assetPropertyCurves;

	/**
	 * The cached value of the '{@link #getMediums() <em>Mediums</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediums()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> mediums;

	/**
	 * The cached value of the '{@link #getAssetProperites() <em>Asset Properites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetProperites()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> assetProperites;

	/**
	 * The cached value of the '{@link #getReliabilityInfos() <em>Reliability Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ReliabilityInfo> reliabilityInfos;

	/**
	 * The cached value of the '{@link #getDimensionsInfos() <em>Dimensions Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionsInfo> dimensionsInfos;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> ratings;

	/**
	 * The cached value of the '{@link #getQualificationRequirements() <em>Qualification Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<QualificationRequirement> qualificationRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Specification() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSpecification();
	}

	/**
	 * Returns the value of the '<em><b>Asset Property Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Property Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Property Curves</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.AssetPropertyCurve#getSpecification
	 * @generated
	 */
	public EList<AssetPropertyCurve> getAssetPropertyCurves() {
		if (assetPropertyCurves == null) {
			assetPropertyCurves = new BasicInternalEList<AssetPropertyCurve>(AssetPropertyCurve.class);
		}
		return assetPropertyCurves;
	}

	/**
	 * Returns the value of the '<em><b>Mediums</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Medium}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Medium#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mediums</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediums</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Medium#getSpecification
	 * @generated
	 */
	public EList<Medium> getMediums() {
		if (mediums == null) {
			mediums = new BasicInternalEList<Medium>(Medium.class);
		}
		return mediums;
	}

	/**
	 * Returns the value of the '<em><b>Asset Properites</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Properites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Properites</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getPropertySpecification
	 * @generated
	 */
	public EList<UserAttribute> getAssetProperites() {
		if (assetProperites == null) {
			assetProperites = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return assetProperites;
	}

	/**
	 * Returns the value of the '<em><b>Reliability Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ReliabilityInfo#getSpecification
	 * @generated
	 */
	public EList<ReliabilityInfo> getReliabilityInfos() {
		if (reliabilityInfos == null) {
			reliabilityInfos = new BasicInternalEList<ReliabilityInfo>(ReliabilityInfo.class);
		}
		return reliabilityInfos;
	}

	/**
	 * Returns the value of the '<em><b>Dimensions Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getSpecifications
	 * @generated
	 */
	public EList<DimensionsInfo> getDimensionsInfos() {
		if (dimensionsInfos == null) {
			dimensionsInfos = new BasicInternalEList<DimensionsInfo>(DimensionsInfo.class);
		}
		return dimensionsInfos;
	}

	/**
	 * Returns the value of the '<em><b>Ratings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratings</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getRatingSpecification
	 * @generated
	 */
	public EList<UserAttribute> getRatings() {
		if (ratings == null) {
			ratings = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return ratings;
	}

	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new BasicInternalEList<QualificationRequirement>(QualificationRequirement.class);
		}
		return qualificationRequirements;
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetPropertyCurves()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMediums()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetProperites()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReliabilityInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDimensionsInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatings()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationRequirements()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return ((InternalEList<?>)getAssetPropertyCurves()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return ((InternalEList<?>)getMediums()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return ((InternalEList<?>)getAssetProperites()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return ((InternalEList<?>)getReliabilityInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return ((InternalEList<?>)getDimensionsInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return getAssetPropertyCurves();
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return getMediums();
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return getAssetProperites();
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return getReliabilityInfos();
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return getDimensionsInfos();
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return getRatings();
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				getAssetPropertyCurves().addAll((Collection<? extends AssetPropertyCurve>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				getMediums().clear();
				getMediums().addAll((Collection<? extends Medium>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				getAssetProperites().clear();
				getAssetProperites().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				getReliabilityInfos().addAll((Collection<? extends ReliabilityInfo>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				getDimensionsInfos().clear();
				getDimensionsInfos().addAll((Collection<? extends DimensionsInfo>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				getRatings().clear();
				getRatings().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				getAssetPropertyCurves().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				getMediums().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				getAssetProperites().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				getReliabilityInfos().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				getDimensionsInfos().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				getRatings().clear();
				return;
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
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
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERTY_CURVES:
				return assetPropertyCurves != null && !assetPropertyCurves.isEmpty();
			case InfAssetsPackage.SPECIFICATION__MEDIUMS:
				return mediums != null && !mediums.isEmpty();
			case InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES:
				return assetProperites != null && !assetProperites.isEmpty();
			case InfAssetsPackage.SPECIFICATION__RELIABILITY_INFOS:
				return reliabilityInfos != null && !reliabilityInfos.isEmpty();
			case InfAssetsPackage.SPECIFICATION__DIMENSIONS_INFOS:
				return dimensionsInfos != null && !dimensionsInfos.isEmpty();
			case InfAssetsPackage.SPECIFICATION__RATINGS:
				return ratings != null && !ratings.isEmpty();
			case InfAssetsPackage.SPECIFICATION__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // Specification
