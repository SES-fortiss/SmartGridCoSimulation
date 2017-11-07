/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

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
 * A representation of the model object '<em><b>CU Work Equipment Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUWorkEquipmentItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTypeAsset() <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected GenericAssetModelOrMaterial typeAsset;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final float RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected float rate = RATE_EDEFAULT;

	/**
	 * This is true if the Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rateESet;

	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The default value of the '{@link #getEquipCode() <em>Equip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipCode()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUIP_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEquipCode() <em>Equip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipCode()
	 * @generated
	 * @ordered
	 */
	protected String equipCode = EQUIP_CODE_EDEFAULT;

	/**
	 * This is true if the Equip Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equipCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUWorkEquipmentItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_WORK_EQUIPMENT_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUWorkEquipmentAsset <em>CU Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(GenericAssetModelOrMaterial)
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUWorkEquipmentAsset
	 * @generated
	 */
	public GenericAssetModelOrMaterial getTypeAsset() {
		if (typeAsset != null && typeAsset.eIsProxy()) {
			InternalEObject oldTypeAsset = (InternalEObject)typeAsset;
			typeAsset = (GenericAssetModelOrMaterial)eResolveProxy(oldTypeAsset);
			if (typeAsset != oldTypeAsset) {
			}
		}
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAssetModelOrMaterial basicGetTypeAsset() {
		return typeAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAsset(GenericAssetModelOrMaterial newTypeAsset, NotificationChain msgs) {
		GenericAssetModelOrMaterial oldTypeAsset = typeAsset;
		typeAsset = newTypeAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getTypeAsset <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset</em>' reference.
	 * @see #getTypeAsset()
	 * @generated
	 */
	public void setTypeAsset(GenericAssetModelOrMaterial newTypeAsset) {
		if (newTypeAsset != typeAsset) {
			NotificationChain msgs = null;
			if (typeAsset != null)
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET, GenericAssetModelOrMaterial.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET, GenericAssetModelOrMaterial.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #isSetRate()
	 * @see #unsetRate()
	 * @see #setRate(float)
	 * @generated
	 */
	public float getRate() {
		return rate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #isSetRate()
	 * @see #unsetRate()
	 * @see #getRate()
	 * @generated
	 */
	public void setRate(float newRate) {
		rate = newRate;
		rateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRate()
	 * @see #getRate()
	 * @see #setRate(float)
	 * @generated
	 */
	public void unsetRate() {
		rate = RATE_EDEFAULT;
		rateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getRate <em>Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rate</em>' attribute is set.
	 * @see #unsetRate()
	 * @see #getRate()
	 * @see #setRate(float)
	 * @generated
	 */
	public boolean isSetRate() {
		return rateESet;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems <em>CU Work Equipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
	}

	/**
	 * Returns the value of the '<em><b>Equip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equip Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equip Code</em>' attribute.
	 * @see #isSetEquipCode()
	 * @see #unsetEquipCode()
	 * @see #setEquipCode(String)
	 * @generated
	 */
	public String getEquipCode() {
		return equipCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equip Code</em>' attribute.
	 * @see #isSetEquipCode()
	 * @see #unsetEquipCode()
	 * @see #getEquipCode()
	 * @generated
	 */
	public void setEquipCode(String newEquipCode) {
		equipCode = newEquipCode;
		equipCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEquipCode()
	 * @see #getEquipCode()
	 * @see #setEquipCode(String)
	 * @generated
	 */
	public void unsetEquipCode() {
		equipCode = EQUIP_CODE_EDEFAULT;
		equipCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getEquipCode <em>Equip Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Equip Code</em>' attribute is set.
	 * @see #unsetEquipCode()
	 * @see #getEquipCode()
	 * @see #setEquipCode(String)
	 * @generated
	 */
	public boolean isSetEquipCode() {
		return equipCodeESet;
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
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_WORK_EQUIPMENT_ASSET, GenericAssetModelOrMaterial.class, msgs);
				return basicSetTypeAsset((GenericAssetModelOrMaterial)otherEnd, msgs);
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__STATUS:
				return getStatus();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__RATE:
				return getRate();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE:
				return getEquipCode();
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
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)newValue);
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__RATE:
				setRate((Float)newValue);
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE:
				setEquipCode((String)newValue);
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
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)null);
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__RATE:
				unsetRate();
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE:
				unsetEquipCode();
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
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__TYPE_ASSET:
				return typeAsset != null;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__RATE:
				return isSetRate();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_WORK_EQUIPMENT_ITEM__EQUIP_CODE:
				return isSetEquipCode();
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
		result.append(" (rate: ");
		if (rateESet) result.append(rate); else result.append("<unset>");
		result.append(", equipCode: ");
		if (equipCodeESet) result.append(equipCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CUWorkEquipmentItem
