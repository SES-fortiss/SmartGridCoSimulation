/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.TransformerTankInfo;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getPowerRatings <em>Power Ratings</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerAsset extends Asset {
	/**
	 * The cached value of the '{@link #getPowerRatings() <em>Power Ratings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerRating> powerRatings;

	/**
	 * The cached value of the '{@link #getTransformerObservations() <em>Transformer Observations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerObservation> transformerObservations;

	/**
	 * The default value of the '{@link #getReconditionedDateTime() <em>Reconditioned Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconditionedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECONDITIONED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReconditionedDateTime() <em>Reconditioned Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconditionedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date reconditionedDateTime = RECONDITIONED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Reconditioned Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reconditionedDateTimeESet;

	/**
	 * The cached value of the '{@link #getTransformerInfo() <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerTankInfo transformerInfo;

	/**
	 * The cached value of the '{@link #getTransformerAssetModel() <em>Transformer Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssetModel()
	 * @generated
	 * @ordered
	 */
	protected TransformerAssetModel transformerAssetModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerAsset() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTransformerAsset();
	}

	/**
	 * Returns the value of the '<em><b>Power Ratings</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.PowerRating}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Ratings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Ratings</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.PowerRating#getTransformerAssets
	 * @generated
	 */
	public EList<PowerRating> getPowerRatings() {
		if (powerRatings == null) {
			powerRatings = new BasicInternalEList<PowerRating>(PowerRating.class);
		}
		return powerRatings;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Observations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset <em>Transformer Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getTransformerAsset
	 * @generated
	 */
	public EList<TransformerObservation> getTransformerObservations() {
		if (transformerObservations == null) {
			transformerObservations = new BasicInternalEList<TransformerObservation>(TransformerObservation.class);
		}
		return transformerObservations;
	}

	/**
	 * Returns the value of the '<em><b>Reconditioned Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconditioned Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconditioned Date Time</em>' attribute.
	 * @see #isSetReconditionedDateTime()
	 * @see #unsetReconditionedDateTime()
	 * @see #setReconditionedDateTime(Date)
	 * @generated
	 */
	public Date getReconditionedDateTime() {
		return reconditionedDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconditioned Date Time</em>' attribute.
	 * @see #isSetReconditionedDateTime()
	 * @see #unsetReconditionedDateTime()
	 * @see #getReconditionedDateTime()
	 * @generated
	 */
	public void setReconditionedDateTime(Date newReconditionedDateTime) {
		reconditionedDateTime = newReconditionedDateTime;
		reconditionedDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReconditionedDateTime()
	 * @see #getReconditionedDateTime()
	 * @see #setReconditionedDateTime(Date)
	 * @generated
	 */
	public void unsetReconditionedDateTime() {
		reconditionedDateTime = RECONDITIONED_DATE_TIME_EDEFAULT;
		reconditionedDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getReconditionedDateTime <em>Reconditioned Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reconditioned Date Time</em>' attribute is set.
	 * @see #unsetReconditionedDateTime()
	 * @see #getReconditionedDateTime()
	 * @see #setReconditionedDateTime(Date)
	 * @generated
	 */
	public boolean isSetReconditionedDateTime() {
		return reconditionedDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Info</em>' reference.
	 * @see #setTransformerInfo(TransformerTankInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getTransformerAssets
	 * @generated
	 */
	public TransformerTankInfo getTransformerInfo() {
		if (transformerInfo != null && transformerInfo.eIsProxy()) {
			InternalEObject oldTransformerInfo = (InternalEObject)transformerInfo;
			transformerInfo = (TransformerTankInfo)eResolveProxy(oldTransformerInfo);
			if (transformerInfo != oldTransformerInfo) {
			}
		}
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerTankInfo basicGetTransformerInfo() {
		return transformerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerInfo(TransformerTankInfo newTransformerInfo, NotificationChain msgs) {
		TransformerTankInfo oldTransformerInfo = transformerInfo;
		transformerInfo = newTransformerInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Info</em>' reference.
	 * @see #getTransformerInfo()
	 * @generated
	 */
	public void setTransformerInfo(TransformerTankInfo newTransformerInfo) {
		if (newTransformerInfo != transformerInfo) {
			NotificationChain msgs = null;
			if (transformerInfo != null)
				msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS, TransformerTankInfo.class, msgs);
			if (newTransformerInfo != null)
				msgs = ((InternalEObject)newTransformerInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS, TransformerTankInfo.class, msgs);
			msgs = basicSetTransformerInfo(newTransformerInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer Asset Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets <em>Transformer Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Asset Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Asset Model</em>' reference.
	 * @see #setTransformerAssetModel(TransformerAssetModel)
	 * @see CIM15.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerAssets
	 * @generated
	 */
	public TransformerAssetModel getTransformerAssetModel() {
		if (transformerAssetModel != null && transformerAssetModel.eIsProxy()) {
			InternalEObject oldTransformerAssetModel = (InternalEObject)transformerAssetModel;
			transformerAssetModel = (TransformerAssetModel)eResolveProxy(oldTransformerAssetModel);
			if (transformerAssetModel != oldTransformerAssetModel) {
			}
		}
		return transformerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAssetModel basicGetTransformerAssetModel() {
		return transformerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerAssetModel(TransformerAssetModel newTransformerAssetModel, NotificationChain msgs) {
		TransformerAssetModel oldTransformerAssetModel = transformerAssetModel;
		transformerAssetModel = newTransformerAssetModel;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerAssetModel <em>Transformer Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Asset Model</em>' reference.
	 * @see #getTransformerAssetModel()
	 * @generated
	 */
	public void setTransformerAssetModel(TransformerAssetModel newTransformerAssetModel) {
		if (newTransformerAssetModel != transformerAssetModel) {
			NotificationChain msgs = null;
			if (transformerAssetModel != null)
				msgs = ((InternalEObject)transformerAssetModel).eInverseRemove(this, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS, TransformerAssetModel.class, msgs);
			if (newTransformerAssetModel != null)
				msgs = ((InternalEObject)newTransformerAssetModel).eInverseAdd(this, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS, TransformerAssetModel.class, msgs);
			msgs = basicSetTransformerAssetModel(newTransformerAssetModel, msgs);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerRatings()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerObservations()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				if (transformerInfo != null)
					msgs = ((InternalEObject)transformerInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_ASSETS, TransformerTankInfo.class, msgs);
				return basicSetTransformerInfo((TransformerTankInfo)otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				if (transformerAssetModel != null)
					msgs = ((InternalEObject)transformerAssetModel).eInverseRemove(this, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_ASSETS, TransformerAssetModel.class, msgs);
				return basicSetTransformerAssetModel((TransformerAssetModel)otherEnd, msgs);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return ((InternalEList<?>)getPowerRatings()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<?>)getTransformerObservations()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				return basicSetTransformerInfo(null, msgs);
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				return basicSetTransformerAssetModel(null, msgs);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return getPowerRatings();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return getTransformerObservations();
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				return getReconditionedDateTime();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				if (resolve) return getTransformerInfo();
				return basicGetTransformerInfo();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				if (resolve) return getTransformerAssetModel();
				return basicGetTransformerAssetModel();
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				getPowerRatings().clear();
				getPowerRatings().addAll((Collection<? extends PowerRating>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				getTransformerObservations().addAll((Collection<? extends TransformerObservation>)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				setReconditionedDateTime((Date)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				setTransformerInfo((TransformerTankInfo)newValue);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				setTransformerAssetModel((TransformerAssetModel)newValue);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				getPowerRatings().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				unsetReconditionedDateTime();
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				setTransformerInfo((TransformerTankInfo)null);
				return;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				setTransformerAssetModel((TransformerAssetModel)null);
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
			case InfAssetsPackage.TRANSFORMER_ASSET__POWER_RATINGS:
				return powerRatings != null && !powerRatings.isEmpty();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_OBSERVATIONS:
				return transformerObservations != null && !transformerObservations.isEmpty();
			case InfAssetsPackage.TRANSFORMER_ASSET__RECONDITIONED_DATE_TIME:
				return isSetReconditionedDateTime();
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO:
				return transformerInfo != null;
			case InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_ASSET_MODEL:
				return transformerAssetModel != null;
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
		result.append(" (reconditionedDateTime: ");
		if (reconditionedDateTimeESet) result.append(reconditionedDateTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerAsset
