/**
 */
package CIM15.IEC61968.AssetModels;

import CIM15.IEC61968.Assets.AssetInfo;

import CIM15.IEC61970.Wires.PowerTransformer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.PowerTransformerInfo#getPowerTransformers <em>Power Transformers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerTransformerInfo extends AssetInfo {
	/**
	 * The cached value of the '{@link #getTransformerTankInfo() <em>Transformer Tank Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerTankInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerTankInfo> transformerTankInfo;

	/**
	 * The cached value of the '{@link #getPowerTransformers() <em>Power Transformers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformers()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerTransformer> powerTransformers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerTransformerInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.POWER_TRANSFORMER_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Tank Info</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.TransformerTankInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Tank Info</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Tank Info</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.TransformerTankInfo#getPowerTransformerInfo
	 * @generated
	 */
	public EList<TransformerTankInfo> getTransformerTankInfo() {
		if (transformerTankInfo == null) {
			transformerTankInfo = new BasicInternalEList<TransformerTankInfo>(TransformerTankInfo.class);
		}
		return transformerTankInfo;
	}

	/**
	 * Returns the value of the '<em><b>Power Transformers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.PowerTransformer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerInfo <em>Power Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformers</em>' reference list.
	 * @see CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerInfo
	 * @generated
	 */
	public EList<PowerTransformer> getPowerTransformers() {
		if (powerTransformers == null) {
			powerTransformers = new BasicInternalEList<PowerTransformer>(PowerTransformer.class);
		}
		return powerTransformers;
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
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerTankInfo()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerTransformers()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO:
				return ((InternalEList<?>)getTransformerTankInfo()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS:
				return ((InternalEList<?>)getPowerTransformers()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO:
				return getTransformerTankInfo();
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS:
				return getPowerTransformers();
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
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO:
				getTransformerTankInfo().clear();
				getTransformerTankInfo().addAll((Collection<? extends TransformerTankInfo>)newValue);
				return;
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS:
				getPowerTransformers().clear();
				getPowerTransformers().addAll((Collection<? extends PowerTransformer>)newValue);
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
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO:
				getTransformerTankInfo().clear();
				return;
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS:
				getPowerTransformers().clear();
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
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFO:
				return transformerTankInfo != null && !transformerTankInfo.isEmpty();
			case AssetModelsPackage.POWER_TRANSFORMER_INFO__POWER_TRANSFORMERS:
				return powerTransformers != null && !powerTransformers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PowerTransformerInfo
