/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

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
 * A representation of the model object '<em><b>CU Material Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getPropertyUnits <em>Property Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUMaterialItem extends IdentifiedObject {
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
	 * The cached value of the '{@link #getPropertyUnits() <em>Property Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyUnit> propertyUnits;

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
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * This is true if the Corporate Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean corporateCodeESet;

	/**
	 * The cached value of the '{@link #getTypeMaterial() <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMaterial()
	 * @generated
	 * @ordered
	 */
	protected TypeMaterial typeMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUMaterialItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_MATERIAL_ITEM;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_MATERIAL_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_MATERIAL_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Property Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.PropertyUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCUMaterialItems
	 * @generated
	 */
	public EList<PropertyUnit> getPropertyUnits() {
		if (propertyUnits == null) {
			propertyUnits = new BasicInternalEList<PropertyUnit>(PropertyUnit.class);
		}
		return propertyUnits;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getQuantity <em>Quantity</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		corporateCode = newCorporateCode;
		corporateCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public void unsetCorporateCode() {
		corporateCode = CORPORATE_CODE_EDEFAULT;
		corporateCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCorporateCode <em>Corporate Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Corporate Code</em>' attribute is set.
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public boolean isSetCorporateCode() {
		return corporateCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Type Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems <em>CU Material Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Material</em>' reference.
	 * @see #setTypeMaterial(TypeMaterial)
	 * @see CIM15.IEC61970.Informative.InfWork.TypeMaterial#getCUMaterialItems
	 * @generated
	 */
	public TypeMaterial getTypeMaterial() {
		if (typeMaterial != null && typeMaterial.eIsProxy()) {
			InternalEObject oldTypeMaterial = (InternalEObject)typeMaterial;
			typeMaterial = (TypeMaterial)eResolveProxy(oldTypeMaterial);
			if (typeMaterial != oldTypeMaterial) {
			}
		}
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMaterial basicGetTypeMaterial() {
		return typeMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMaterial(TypeMaterial newTypeMaterial, NotificationChain msgs) {
		TypeMaterial oldTypeMaterial = typeMaterial;
		typeMaterial = newTypeMaterial;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getTypeMaterial <em>Type Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Material</em>' reference.
	 * @see #getTypeMaterial()
	 * @generated
	 */
	public void setTypeMaterial(TypeMaterial newTypeMaterial) {
		if (newTypeMaterial != typeMaterial) {
			NotificationChain msgs = null;
			if (typeMaterial != null)
				msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS, TypeMaterial.class, msgs);
			if (newTypeMaterial != null)
				msgs = ((InternalEObject)newTypeMaterial).eInverseAdd(this, InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS, TypeMaterial.class, msgs);
			msgs = basicSetTypeMaterial(newTypeMaterial, msgs);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				if (typeMaterial != null)
					msgs = ((InternalEObject)typeMaterial).eInverseRemove(this, InfWorkPackage.TYPE_MATERIAL__CU_MATERIAL_ITEMS, TypeMaterial.class, msgs);
				return basicSetTypeMaterial((TypeMaterial)otherEnd, msgs);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return ((InternalEList<?>)getPropertyUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				return basicSetTypeMaterial(null, msgs);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				return getStatus();
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return getPropertyUnits();
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				return getQuantity();
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				return getCorporateCode();
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				if (resolve) return getTypeMaterial();
				return basicGetTypeMaterial();
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
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				getPropertyUnits().clear();
				getPropertyUnits().addAll((Collection<? extends PropertyUnit>)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)newValue);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				getPropertyUnits().clear();
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				unsetQuantity();
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				unsetCorporateCode();
				return;
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				setTypeMaterial((TypeMaterial)null);
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
			case InfWorkPackage.CU_MATERIAL_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CU_MATERIAL_ITEM__PROPERTY_UNITS:
				return propertyUnits != null && !propertyUnits.isEmpty();
			case InfWorkPackage.CU_MATERIAL_ITEM__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_MATERIAL_ITEM__QUANTITY:
				return isSetQuantity();
			case InfWorkPackage.CU_MATERIAL_ITEM__CORPORATE_CODE:
				return isSetCorporateCode();
			case InfWorkPackage.CU_MATERIAL_ITEM__TYPE_MATERIAL:
				return typeMaterial != null;
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
		result.append(", corporateCode: ");
		if (corporateCodeESet) result.append(corporateCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CUMaterialItem
