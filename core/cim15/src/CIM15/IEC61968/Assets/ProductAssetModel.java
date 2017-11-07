/**
 */
package CIM15.IEC61968.Assets;

import CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem;

import CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.ProductAssetModel#getUsageKind <em>Usage Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.ProductAssetModel#getGenericAssetModelOrMaterial <em>Generic Asset Model Or Material</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.ProductAssetModel#getAssetModelCatalogueItems <em>Asset Model Catalogue Items</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Assets.ProductAssetModel#getWeightTotal <em>Weight Total</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductAssetModel extends AssetModel {
	/**
	 * The default value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelVersion() <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelVersion()
	 * @generated
	 * @ordered
	 */
	protected String modelVersion = MODEL_VERSION_EDEFAULT;

	/**
	 * This is true if the Model Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modelVersionESet;

	/**
	 * The default value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected static final AssetModelUsageKind USAGE_KIND_EDEFAULT = AssetModelUsageKind.CUSTOMER_SUBSTATION;

	/**
	 * The cached value of the '{@link #getUsageKind() <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageKind()
	 * @generated
	 * @ordered
	 */
	protected AssetModelUsageKind usageKind = USAGE_KIND_EDEFAULT;

	/**
	 * This is true if the Usage Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageKindESet;

	/**
	 * The cached value of the '{@link #getGenericAssetModelOrMaterial() <em>Generic Asset Model Or Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 * @ordered
	 */
	protected GenericAssetModelOrMaterial genericAssetModelOrMaterial;

	/**
	 * The cached value of the '{@link #getAssetModelCatalogueItems() <em>Asset Model Catalogue Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetModelCatalogueItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetModelCatalogueItem> assetModelCatalogueItems;

	/**
	 * The default value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateStandardKind()
	 * @generated
	 * @ordered
	 */
	protected static final CorporateStandardKind CORPORATE_STANDARD_KIND_EDEFAULT = CorporateStandardKind.STANDARD;

	/**
	 * The cached value of the '{@link #getCorporateStandardKind() <em>Corporate Standard Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateStandardKind()
	 * @generated
	 * @ordered
	 */
	protected CorporateStandardKind corporateStandardKind = CORPORATE_STANDARD_KIND_EDEFAULT;

	/**
	 * This is true if the Corporate Standard Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean corporateStandardKindESet;

	/**
	 * The default value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected String modelNumber = MODEL_NUMBER_EDEFAULT;

	/**
	 * This is true if the Model Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modelNumberESet;

	/**
	 * The default value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float WEIGHT_TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWeightTotal() <em>Weight Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightTotal()
	 * @generated
	 * @ordered
	 */
	protected float weightTotal = WEIGHT_TOTAL_EDEFAULT;

	/**
	 * This is true if the Weight Total attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weightTotalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductAssetModel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetsPackage.Literals.PRODUCT_ASSET_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Version</em>' attribute.
	 * @see #isSetModelVersion()
	 * @see #unsetModelVersion()
	 * @see #setModelVersion(String)
	 * @generated
	 */
	public String getModelVersion() {
		return modelVersion;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Version</em>' attribute.
	 * @see #isSetModelVersion()
	 * @see #unsetModelVersion()
	 * @see #getModelVersion()
	 * @generated
	 */
	public void setModelVersion(String newModelVersion) {
		modelVersion = newModelVersion;
		modelVersionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModelVersion()
	 * @see #getModelVersion()
	 * @see #setModelVersion(String)
	 * @generated
	 */
	public void unsetModelVersion() {
		modelVersion = MODEL_VERSION_EDEFAULT;
		modelVersionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelVersion <em>Model Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model Version</em>' attribute is set.
	 * @see #unsetModelVersion()
	 * @see #getModelVersion()
	 * @see #setModelVersion(String)
	 * @generated
	 */
	public boolean isSetModelVersion() {
		return modelVersionESet;
	}

	/**
	 * Returns the value of the '<em><b>Usage Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Assets.AssetModelUsageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Kind</em>' attribute.
	 * @see CIM15.IEC61968.Assets.AssetModelUsageKind
	 * @see #isSetUsageKind()
	 * @see #unsetUsageKind()
	 * @see #setUsageKind(AssetModelUsageKind)
	 * @generated
	 */
	public AssetModelUsageKind getUsageKind() {
		return usageKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Kind</em>' attribute.
	 * @see CIM15.IEC61968.Assets.AssetModelUsageKind
	 * @see #isSetUsageKind()
	 * @see #unsetUsageKind()
	 * @see #getUsageKind()
	 * @generated
	 */
	public void setUsageKind(AssetModelUsageKind newUsageKind) {
		usageKind = newUsageKind == null ? USAGE_KIND_EDEFAULT : newUsageKind;
		usageKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageKind()
	 * @see #getUsageKind()
	 * @see #setUsageKind(AssetModelUsageKind)
	 * @generated
	 */
	public void unsetUsageKind() {
		usageKind = USAGE_KIND_EDEFAULT;
		usageKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getUsageKind <em>Usage Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Kind</em>' attribute is set.
	 * @see #unsetUsageKind()
	 * @see #getUsageKind()
	 * @see #setUsageKind(AssetModelUsageKind)
	 * @generated
	 */
	public boolean isSetUsageKind() {
		return usageKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Generic Asset Model Or Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getProductAssetModels <em>Product Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Asset Model Or Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Asset Model Or Material</em>' reference.
	 * @see #setGenericAssetModelOrMaterial(GenericAssetModelOrMaterial)
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getProductAssetModels
	 * @generated
	 */
	public GenericAssetModelOrMaterial getGenericAssetModelOrMaterial() {
		if (genericAssetModelOrMaterial != null && genericAssetModelOrMaterial.eIsProxy()) {
			InternalEObject oldGenericAssetModelOrMaterial = (InternalEObject)genericAssetModelOrMaterial;
			genericAssetModelOrMaterial = (GenericAssetModelOrMaterial)eResolveProxy(oldGenericAssetModelOrMaterial);
			if (genericAssetModelOrMaterial != oldGenericAssetModelOrMaterial) {
			}
		}
		return genericAssetModelOrMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAssetModelOrMaterial basicGetGenericAssetModelOrMaterial() {
		return genericAssetModelOrMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericAssetModelOrMaterial(GenericAssetModelOrMaterial newGenericAssetModelOrMaterial, NotificationChain msgs) {
		GenericAssetModelOrMaterial oldGenericAssetModelOrMaterial = genericAssetModelOrMaterial;
		genericAssetModelOrMaterial = newGenericAssetModelOrMaterial;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getGenericAssetModelOrMaterial <em>Generic Asset Model Or Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Asset Model Or Material</em>' reference.
	 * @see #getGenericAssetModelOrMaterial()
	 * @generated
	 */
	public void setGenericAssetModelOrMaterial(GenericAssetModelOrMaterial newGenericAssetModelOrMaterial) {
		if (newGenericAssetModelOrMaterial != genericAssetModelOrMaterial) {
			NotificationChain msgs = null;
			if (genericAssetModelOrMaterial != null)
				msgs = ((InternalEObject)genericAssetModelOrMaterial).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS, GenericAssetModelOrMaterial.class, msgs);
			if (newGenericAssetModelOrMaterial != null)
				msgs = ((InternalEObject)newGenericAssetModelOrMaterial).eInverseAdd(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS, GenericAssetModelOrMaterial.class, msgs);
			msgs = basicSetGenericAssetModelOrMaterial(newGenericAssetModelOrMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Asset Model Catalogue Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel <em>Asset Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Model Catalogue Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Model Catalogue Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssetModels.AssetModelCatalogueItem#getAssetModel
	 * @generated
	 */
	public EList<AssetModelCatalogueItem> getAssetModelCatalogueItems() {
		if (assetModelCatalogueItems == null) {
			assetModelCatalogueItems = new BasicInternalEList<AssetModelCatalogueItem>(AssetModelCatalogueItem.class);
		}
		return assetModelCatalogueItems;
	}

	/**
	 * Returns the value of the '<em><b>Corporate Standard Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Assets.CorporateStandardKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Standard Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Standard Kind</em>' attribute.
	 * @see CIM15.IEC61968.Assets.CorporateStandardKind
	 * @see #isSetCorporateStandardKind()
	 * @see #unsetCorporateStandardKind()
	 * @see #setCorporateStandardKind(CorporateStandardKind)
	 * @generated
	 */
	public CorporateStandardKind getCorporateStandardKind() {
		return corporateStandardKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Standard Kind</em>' attribute.
	 * @see CIM15.IEC61968.Assets.CorporateStandardKind
	 * @see #isSetCorporateStandardKind()
	 * @see #unsetCorporateStandardKind()
	 * @see #getCorporateStandardKind()
	 * @generated
	 */
	public void setCorporateStandardKind(CorporateStandardKind newCorporateStandardKind) {
		corporateStandardKind = newCorporateStandardKind == null ? CORPORATE_STANDARD_KIND_EDEFAULT : newCorporateStandardKind;
		corporateStandardKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorporateStandardKind()
	 * @see #getCorporateStandardKind()
	 * @see #setCorporateStandardKind(CorporateStandardKind)
	 * @generated
	 */
	public void unsetCorporateStandardKind() {
		corporateStandardKind = CORPORATE_STANDARD_KIND_EDEFAULT;
		corporateStandardKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getCorporateStandardKind <em>Corporate Standard Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Corporate Standard Kind</em>' attribute is set.
	 * @see #unsetCorporateStandardKind()
	 * @see #getCorporateStandardKind()
	 * @see #setCorporateStandardKind(CorporateStandardKind)
	 * @generated
	 */
	public boolean isSetCorporateStandardKind() {
		return corporateStandardKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Number</em>' attribute.
	 * @see #isSetModelNumber()
	 * @see #unsetModelNumber()
	 * @see #setModelNumber(String)
	 * @generated
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' attribute.
	 * @see #isSetModelNumber()
	 * @see #unsetModelNumber()
	 * @see #getModelNumber()
	 * @generated
	 */
	public void setModelNumber(String newModelNumber) {
		modelNumber = newModelNumber;
		modelNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModelNumber()
	 * @see #getModelNumber()
	 * @see #setModelNumber(String)
	 * @generated
	 */
	public void unsetModelNumber() {
		modelNumber = MODEL_NUMBER_EDEFAULT;
		modelNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getModelNumber <em>Model Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model Number</em>' attribute is set.
	 * @see #unsetModelNumber()
	 * @see #getModelNumber()
	 * @see #setModelNumber(String)
	 * @generated
	 */
	public boolean isSetModelNumber() {
		return modelNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Weight Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Total</em>' attribute.
	 * @see #isSetWeightTotal()
	 * @see #unsetWeightTotal()
	 * @see #setWeightTotal(float)
	 * @generated
	 */
	public float getWeightTotal() {
		return weightTotal;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Total</em>' attribute.
	 * @see #isSetWeightTotal()
	 * @see #unsetWeightTotal()
	 * @see #getWeightTotal()
	 * @generated
	 */
	public void setWeightTotal(float newWeightTotal) {
		weightTotal = newWeightTotal;
		weightTotalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeightTotal()
	 * @see #getWeightTotal()
	 * @see #setWeightTotal(float)
	 * @generated
	 */
	public void unsetWeightTotal() {
		weightTotal = WEIGHT_TOTAL_EDEFAULT;
		weightTotalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Assets.ProductAssetModel#getWeightTotal <em>Weight Total</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weight Total</em>' attribute is set.
	 * @see #unsetWeightTotal()
	 * @see #getWeightTotal()
	 * @see #setWeightTotal(float)
	 * @generated
	 */
	public boolean isSetWeightTotal() {
		return weightTotalESet;
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
			case AssetsPackage.PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL:
				if (genericAssetModelOrMaterial != null)
					msgs = ((InternalEObject)genericAssetModelOrMaterial).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__PRODUCT_ASSET_MODELS, GenericAssetModelOrMaterial.class, msgs);
				return basicSetGenericAssetModelOrMaterial((GenericAssetModelOrMaterial)otherEnd, msgs);
			case AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetModelCatalogueItems()).basicAdd(otherEnd, msgs);
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
			case AssetsPackage.PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL:
				return basicSetGenericAssetModelOrMaterial(null, msgs);
			case AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return ((InternalEList<?>)getAssetModelCatalogueItems()).basicRemove(otherEnd, msgs);
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
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
				return getModelVersion();
			case AssetsPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
				return getUsageKind();
			case AssetsPackage.PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL:
				if (resolve) return getGenericAssetModelOrMaterial();
				return basicGetGenericAssetModelOrMaterial();
			case AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return getAssetModelCatalogueItems();
			case AssetsPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
				return getCorporateStandardKind();
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
				return getModelNumber();
			case AssetsPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
				return getWeightTotal();
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
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
				setModelVersion((String)newValue);
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
				setUsageKind((AssetModelUsageKind)newValue);
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL:
				setGenericAssetModelOrMaterial((GenericAssetModelOrMaterial)newValue);
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				getAssetModelCatalogueItems().addAll((Collection<? extends AssetModelCatalogueItem>)newValue);
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
				setCorporateStandardKind((CorporateStandardKind)newValue);
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
				setModelNumber((String)newValue);
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
				setWeightTotal((Float)newValue);
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
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
				unsetModelVersion();
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
				unsetUsageKind();
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL:
				setGenericAssetModelOrMaterial((GenericAssetModelOrMaterial)null);
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				getAssetModelCatalogueItems().clear();
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
				unsetCorporateStandardKind();
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
				unsetModelNumber();
				return;
			case AssetsPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
				unsetWeightTotal();
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
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_VERSION:
				return isSetModelVersion();
			case AssetsPackage.PRODUCT_ASSET_MODEL__USAGE_KIND:
				return isSetUsageKind();
			case AssetsPackage.PRODUCT_ASSET_MODEL__GENERIC_ASSET_MODEL_OR_MATERIAL:
				return genericAssetModelOrMaterial != null;
			case AssetsPackage.PRODUCT_ASSET_MODEL__ASSET_MODEL_CATALOGUE_ITEMS:
				return assetModelCatalogueItems != null && !assetModelCatalogueItems.isEmpty();
			case AssetsPackage.PRODUCT_ASSET_MODEL__CORPORATE_STANDARD_KIND:
				return isSetCorporateStandardKind();
			case AssetsPackage.PRODUCT_ASSET_MODEL__MODEL_NUMBER:
				return isSetModelNumber();
			case AssetsPackage.PRODUCT_ASSET_MODEL__WEIGHT_TOTAL:
				return isSetWeightTotal();
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
		result.append(" (modelVersion: ");
		if (modelVersionESet) result.append(modelVersion); else result.append("<unset>");
		result.append(", usageKind: ");
		if (usageKindESet) result.append(usageKind); else result.append("<unset>");
		result.append(", corporateStandardKind: ");
		if (corporateStandardKindESet) result.append(corporateStandardKind); else result.append("<unset>");
		result.append(", modelNumber: ");
		if (modelNumberESet) result.append(modelNumber); else result.append("<unset>");
		result.append(", weightTotal: ");
		if (weightTotalESet) result.append(weightTotal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProductAssetModel
