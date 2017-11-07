/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUAsset extends IdentifiedObject {
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
	 * The cached value of the '{@link #getTypeAsset() <em>Type Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsset()
	 * @generated
	 * @ordered
	 */
	protected GenericAssetModelOrMaterial typeAsset;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * This is true if the Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityESet;

	/**
	 * The default value of the '{@link #getTypeAssetCode() <em>Type Asset Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssetCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ASSET_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAssetCode() <em>Type Asset Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssetCode()
	 * @generated
	 * @ordered
	 */
	protected String typeAssetCode = TYPE_ASSET_CODE_EDEFAULT;

	/**
	 * This is true if the Type Asset Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeAssetCodeESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUAsset() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_ASSET;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets <em>CU Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
	}

	/**
	 * Returns the value of the '<em><b>Type Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUAsset <em>CU Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset</em>' reference.
	 * @see #setTypeAsset(GenericAssetModelOrMaterial)
	 * @see CIM15.IEC61970.Informative.InfAssets.GenericAssetModelOrMaterial#getCUAsset
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAsset <em>Type Asset</em>}' reference.
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
				msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET, GenericAssetModelOrMaterial.class, msgs);
			if (newTypeAsset != null)
				msgs = ((InternalEObject)newTypeAsset).eInverseAdd(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET, GenericAssetModelOrMaterial.class, msgs);
			msgs = basicSetTypeAsset(newTypeAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(BigInteger newQuantity) {
		quantity = newQuantity;
		quantityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public void unsetQuantity() {
		quantity = QUANTITY_EDEFAULT;
		quantityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getQuantity <em>Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity</em>' attribute is set.
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(BigInteger)
	 * @generated
	 */
	public boolean isSetQuantity() {
		return quantityESet;
	}

	/**
	 * Returns the value of the '<em><b>Type Asset Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Asset Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Asset Code</em>' attribute.
	 * @see #isSetTypeAssetCode()
	 * @see #unsetTypeAssetCode()
	 * @see #setTypeAssetCode(String)
	 * @generated
	 */
	public String getTypeAssetCode() {
		return typeAssetCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Asset Code</em>' attribute.
	 * @see #isSetTypeAssetCode()
	 * @see #unsetTypeAssetCode()
	 * @see #getTypeAssetCode()
	 * @generated
	 */
	public void setTypeAssetCode(String newTypeAssetCode) {
		typeAssetCode = newTypeAssetCode;
		typeAssetCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAssetCode()
	 * @see #getTypeAssetCode()
	 * @see #setTypeAssetCode(String)
	 * @generated
	 */
	public void unsetTypeAssetCode() {
		typeAssetCode = TYPE_ASSET_CODE_EDEFAULT;
		typeAssetCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getTypeAssetCode <em>Type Asset Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Asset Code</em>' attribute is set.
	 * @see #unsetTypeAssetCode()
	 * @see #getTypeAssetCode()
	 * @see #setTypeAssetCode(String)
	 * @generated
	 */
	public boolean isSetTypeAssetCode() {
		return typeAssetCodeESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_ASSET__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_ASSET__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
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
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				if (typeAsset != null)
					msgs = ((InternalEObject)typeAsset).eInverseRemove(this, InfAssetsPackage.GENERIC_ASSET_MODEL_OR_MATERIAL__CU_ASSET, GenericAssetModelOrMaterial.class, msgs);
				return basicSetTypeAsset((GenericAssetModelOrMaterial)otherEnd, msgs);
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
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				return basicSetTypeAsset(null, msgs);
			case InfWorkPackage.CU_ASSET__STATUS:
				return basicSetStatus(null, msgs);
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
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				if (resolve) return getTypeAsset();
				return basicGetTypeAsset();
			case InfWorkPackage.CU_ASSET__QUANTITY:
				return getQuantity();
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				return getTypeAssetCode();
			case InfWorkPackage.CU_ASSET__STATUS:
				return getStatus();
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
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)newValue);
				return;
			case InfWorkPackage.CU_ASSET__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				setTypeAssetCode((String)newValue);
				return;
			case InfWorkPackage.CU_ASSET__STATUS:
				setStatus((Status)newValue);
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
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				setTypeAsset((GenericAssetModelOrMaterial)null);
				return;
			case InfWorkPackage.CU_ASSET__QUANTITY:
				unsetQuantity();
				return;
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				unsetTypeAssetCode();
				return;
			case InfWorkPackage.CU_ASSET__STATUS:
				setStatus((Status)null);
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
			case InfWorkPackage.CU_ASSET__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_ASSET__TYPE_ASSET:
				return typeAsset != null;
			case InfWorkPackage.CU_ASSET__QUANTITY:
				return isSetQuantity();
			case InfWorkPackage.CU_ASSET__TYPE_ASSET_CODE:
				return isSetTypeAssetCode();
			case InfWorkPackage.CU_ASSET__STATUS:
				return status != null;
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
		result.append(" (quantity: ");
		if (quantityESet) result.append(quantity); else result.append("<unset>");
		result.append(", typeAssetCode: ");
		if (typeAssetCodeESet) result.append(typeAssetCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CUAsset
