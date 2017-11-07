/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Informative.InfAssets.Procedure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatible Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUWorkEquipmentItems <em>CU Work Equipment Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAssets <em>CU Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction <em>CU Allowable Action</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUContractorItems <em>CU Contractor Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUMaterialItems <em>CU Material Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems <em>CU Labor Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompatibleUnit extends Document {
	/**
	 * The cached value of the '{@link #getCUWorkEquipmentItems() <em>CU Work Equipment Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUWorkEquipmentItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUWorkEquipmentItem> cuWorkEquipmentItems;

	/**
	 * The cached value of the '{@link #getDesignLocationCUs() <em>Design Location CUs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocationCUs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocationCU> designLocationCUs;

	/**
	 * The cached value of the '{@link #getCUGroup() <em>CU Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUGroup()
	 * @generated
	 * @ordered
	 */
	protected CUGroup cuGroup;

	/**
	 * The cached value of the '{@link #getCUAssets() <em>CU Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<CUAsset> cuAssets;

	/**
	 * The cached value of the '{@link #getPropertyUnit() <em>Property Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyUnit()
	 * @generated
	 * @ordered
	 */
	protected PropertyUnit propertyUnit;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected String quantity = QUANTITY_EDEFAULT;

	/**
	 * This is true if the Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityESet;

	/**
	 * The cached value of the '{@link #getCostType() <em>Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostType()
	 * @generated
	 * @ordered
	 */
	protected CostType costType;

	/**
	 * The default value of the '{@link #getEstCost() <em>Est Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCost()
	 * @generated
	 * @ordered
	 */
	protected static final float EST_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstCost() <em>Est Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCost()
	 * @generated
	 * @ordered
	 */
	protected float estCost = EST_COST_EDEFAULT;

	/**
	 * This is true if the Est Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estCostESet;

	/**
	 * The cached value of the '{@link #getCUAllowableAction() <em>CU Allowable Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUAllowableAction()
	 * @generated
	 * @ordered
	 */
	protected CUAllowableAction cuAllowableAction;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> procedures;

	/**
	 * The cached value of the '{@link #getCUContractorItems() <em>CU Contractor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUContractorItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUContractorItem> cuContractorItems;

	/**
	 * The cached value of the '{@link #getCUMaterialItems() <em>CU Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CUMaterialItem> cuMaterialItems;

	/**
	 * The cached value of the '{@link #getCULaborItems() <em>CU Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCULaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<CULaborItem> cuLaborItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibleUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.COMPATIBLE_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>CU Work Equipment Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Work Equipment Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Work Equipment Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUWorkEquipmentItem#getCompatibleUnits
	 * @generated
	 */
	public EList<CUWorkEquipmentItem> getCUWorkEquipmentItems() {
		if (cuWorkEquipmentItems == null) {
			cuWorkEquipmentItems = new BasicInternalEList<CUWorkEquipmentItem>(CUWorkEquipmentItem.class);
		}
		return cuWorkEquipmentItems;
	}

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new BasicInternalEList<DesignLocationCU>(DesignLocationCU.class);
		}
		return designLocationCUs;
	}

	/**
	 * Returns the value of the '<em><b>CU Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Group</em>' reference.
	 * @see #setCUGroup(CUGroup)
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits
	 * @generated
	 */
	public CUGroup getCUGroup() {
		if (cuGroup != null && cuGroup.eIsProxy()) {
			InternalEObject oldCUGroup = (InternalEObject)cuGroup;
			cuGroup = (CUGroup)eResolveProxy(oldCUGroup);
			if (cuGroup != oldCUGroup) {
			}
		}
		return cuGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUGroup basicGetCUGroup() {
		return cuGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUGroup(CUGroup newCUGroup, NotificationChain msgs) {
		CUGroup oldCUGroup = cuGroup;
		cuGroup = newCUGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Group</em>' reference.
	 * @see #getCUGroup()
	 * @generated
	 */
	public void setCUGroup(CUGroup newCUGroup) {
		if (newCUGroup != cuGroup) {
			NotificationChain msgs = null;
			if (cuGroup != null)
				msgs = ((InternalEObject)cuGroup).eInverseRemove(this, InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS, CUGroup.class, msgs);
			if (newCUGroup != null)
				msgs = ((InternalEObject)newCUGroup).eInverseAdd(this, InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS, CUGroup.class, msgs);
			msgs = basicSetCUGroup(newCUGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>CU Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUAsset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUAsset#getCompatibleUnits
	 * @generated
	 */
	public EList<CUAsset> getCUAssets() {
		if (cuAssets == null) {
			cuAssets = new BasicInternalEList<CUAsset>(CUAsset.class);
		}
		return cuAssets;
	}

	/**
	 * Returns the value of the '<em><b>Property Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Unit</em>' reference.
	 * @see #setPropertyUnit(PropertyUnit)
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getCompatibleUnits
	 * @generated
	 */
	public PropertyUnit getPropertyUnit() {
		if (propertyUnit != null && propertyUnit.eIsProxy()) {
			InternalEObject oldPropertyUnit = (InternalEObject)propertyUnit;
			propertyUnit = (PropertyUnit)eResolveProxy(oldPropertyUnit);
			if (propertyUnit != oldPropertyUnit) {
			}
		}
		return propertyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyUnit basicGetPropertyUnit() {
		return propertyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyUnit(PropertyUnit newPropertyUnit, NotificationChain msgs) {
		PropertyUnit oldPropertyUnit = propertyUnit;
		propertyUnit = newPropertyUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getPropertyUnit <em>Property Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Unit</em>' reference.
	 * @see #getPropertyUnit()
	 * @generated
	 */
	public void setPropertyUnit(PropertyUnit newPropertyUnit) {
		if (newPropertyUnit != propertyUnit) {
			NotificationChain msgs = null;
			if (propertyUnit != null)
				msgs = ((InternalEObject)propertyUnit).eInverseRemove(this, InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS, PropertyUnit.class, msgs);
			if (newPropertyUnit != null)
				msgs = ((InternalEObject)newPropertyUnit).eInverseAdd(this, InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS, PropertyUnit.class, msgs);
			msgs = basicSetPropertyUnit(newPropertyUnit, msgs);
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
	 * @see #setQuantity(String)
	 * @generated
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @generated
	 */
	public void setQuantity(String newQuantity) {
		quantity = newQuantity;
		quantityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(String)
	 * @generated
	 */
	public void unsetQuantity() {
		quantity = QUANTITY_EDEFAULT;
		quantityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getQuantity <em>Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity</em>' attribute is set.
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(String)
	 * @generated
	 */
	public boolean isSetQuantity() {
		return quantityESet;
	}

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CostType#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' reference.
	 * @see #setCostType(CostType)
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getCompatibleUnits
	 * @generated
	 */
	public CostType getCostType() {
		if (costType != null && costType.eIsProxy()) {
			InternalEObject oldCostType = (InternalEObject)costType;
			costType = (CostType)eResolveProxy(oldCostType);
			if (costType != oldCostType) {
			}
		}
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType basicGetCostType() {
		return costType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostType(CostType newCostType, NotificationChain msgs) {
		CostType oldCostType = costType;
		costType = newCostType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Type</em>' reference.
	 * @see #getCostType()
	 * @generated
	 */
	public void setCostType(CostType newCostType) {
		if (newCostType != costType) {
			NotificationChain msgs = null;
			if (costType != null)
				msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS, CostType.class, msgs);
			if (newCostType != null)
				msgs = ((InternalEObject)newCostType).eInverseAdd(this, InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS, CostType.class, msgs);
			msgs = basicSetCostType(newCostType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Est Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Cost</em>' attribute.
	 * @see #isSetEstCost()
	 * @see #unsetEstCost()
	 * @see #setEstCost(float)
	 * @generated
	 */
	public float getEstCost() {
		return estCost;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Cost</em>' attribute.
	 * @see #isSetEstCost()
	 * @see #unsetEstCost()
	 * @see #getEstCost()
	 * @generated
	 */
	public void setEstCost(float newEstCost) {
		estCost = newEstCost;
		estCostESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstCost()
	 * @see #getEstCost()
	 * @see #setEstCost(float)
	 * @generated
	 */
	public void unsetEstCost() {
		estCost = EST_COST_EDEFAULT;
		estCostESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getEstCost <em>Est Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Est Cost</em>' attribute is set.
	 * @see #unsetEstCost()
	 * @see #getEstCost()
	 * @see #setEstCost(float)
	 * @generated
	 */
	public boolean isSetEstCost() {
		return estCostESet;
	}

	/**
	 * Returns the value of the '<em><b>CU Allowable Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Allowable Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Allowable Action</em>' reference.
	 * @see #setCUAllowableAction(CUAllowableAction)
	 * @see CIM15.IEC61970.Informative.InfWork.CUAllowableAction#getCompatibleUnits
	 * @generated
	 */
	public CUAllowableAction getCUAllowableAction() {
		if (cuAllowableAction != null && cuAllowableAction.eIsProxy()) {
			InternalEObject oldCUAllowableAction = (InternalEObject)cuAllowableAction;
			cuAllowableAction = (CUAllowableAction)eResolveProxy(oldCUAllowableAction);
			if (cuAllowableAction != oldCUAllowableAction) {
			}
		}
		return cuAllowableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUAllowableAction basicGetCUAllowableAction() {
		return cuAllowableAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCUAllowableAction(CUAllowableAction newCUAllowableAction, NotificationChain msgs) {
		CUAllowableAction oldCUAllowableAction = cuAllowableAction;
		cuAllowableAction = newCUAllowableAction;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUAllowableAction <em>CU Allowable Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Allowable Action</em>' reference.
	 * @see #getCUAllowableAction()
	 * @generated
	 */
	public void setCUAllowableAction(CUAllowableAction newCUAllowableAction) {
		if (newCUAllowableAction != cuAllowableAction) {
			NotificationChain msgs = null;
			if (cuAllowableAction != null)
				msgs = ((InternalEObject)cuAllowableAction).eInverseRemove(this, InfWorkPackage.CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS, CUAllowableAction.class, msgs);
			if (newCUAllowableAction != null)
				msgs = ((InternalEObject)newCUAllowableAction).eInverseAdd(this, InfWorkPackage.CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS, CUAllowableAction.class, msgs);
			msgs = basicSetCUAllowableAction(newCUAllowableAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Procedure}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getCompatibleUnits
	 * @generated
	 */
	public EList<Procedure> getProcedures() {
		if (procedures == null) {
			procedures = new BasicInternalEList<Procedure>(Procedure.class);
		}
		return procedures;
	}

	/**
	 * Returns the value of the '<em><b>CU Contractor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUContractorItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Contractor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Contractor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUContractorItem#getCompatibleUnits
	 * @generated
	 */
	public EList<CUContractorItem> getCUContractorItems() {
		if (cuContractorItems == null) {
			cuContractorItems = new BasicInternalEList<CUContractorItem>(CUContractorItem.class);
		}
		return cuContractorItems;
	}

	/**
	 * Returns the value of the '<em><b>CU Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUMaterialItem#getCompatibleUnits
	 * @generated
	 */
	public EList<CUMaterialItem> getCUMaterialItems() {
		if (cuMaterialItems == null) {
			cuMaterialItems = new BasicInternalEList<CUMaterialItem>(CUMaterialItem.class);
		}
		return cuMaterialItems;
	}

	/**
	 * Returns the value of the '<em><b>CU Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CULaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits <em>Compatible Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Labor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits
	 * @generated
	 */
	public EList<CULaborItem> getCULaborItems() {
		if (cuLaborItems == null) {
			cuLaborItems = new BasicInternalEList<CULaborItem>(CULaborItem.class);
		}
		return cuLaborItems;
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
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUWorkEquipmentItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				if (cuGroup != null)
					msgs = ((InternalEObject)cuGroup).eInverseRemove(this, InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS, CUGroup.class, msgs);
				return basicSetCUGroup((CUGroup)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUAssets()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				if (propertyUnit != null)
					msgs = ((InternalEObject)propertyUnit).eInverseRemove(this, InfWorkPackage.PROPERTY_UNIT__COMPATIBLE_UNITS, PropertyUnit.class, msgs);
				return basicSetPropertyUnit((PropertyUnit)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				if (costType != null)
					msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS, CostType.class, msgs);
				return basicSetCostType((CostType)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				if (cuAllowableAction != null)
					msgs = ((InternalEObject)cuAllowableAction).eInverseRemove(this, InfWorkPackage.CU_ALLOWABLE_ACTION__COMPATIBLE_UNITS, CUAllowableAction.class, msgs);
				return basicSetCUAllowableAction((CUAllowableAction)otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedures()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUContractorItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCULaborItems()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return ((InternalEList<?>)getCUWorkEquipmentItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				return basicSetCUGroup(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return ((InternalEList<?>)getCUAssets()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				return basicSetPropertyUnit(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				return basicSetCostType(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				return basicSetCUAllowableAction(null, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return ((InternalEList<?>)getCUContractorItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return ((InternalEList<?>)getCUMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return ((InternalEList<?>)getCULaborItems()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return getCUWorkEquipmentItems();
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				if (resolve) return getCUGroup();
				return basicGetCUGroup();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return getCUAssets();
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				if (resolve) return getPropertyUnit();
				return basicGetPropertyUnit();
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				return getQuantity();
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				if (resolve) return getCostType();
				return basicGetCostType();
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				return getEstCost();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				if (resolve) return getCUAllowableAction();
				return basicGetCUAllowableAction();
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return getProcedures();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return getCUContractorItems();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return getCUMaterialItems();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return getCULaborItems();
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
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				getCUWorkEquipmentItems().clear();
				getCUWorkEquipmentItems().addAll((Collection<? extends CUWorkEquipmentItem>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				setCUGroup((CUGroup)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				getCUAssets().clear();
				getCUAssets().addAll((Collection<? extends CUAsset>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				setPropertyUnit((PropertyUnit)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				setQuantity((String)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				setCostType((CostType)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				setEstCost((Float)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				setCUAllowableAction((CUAllowableAction)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends Procedure>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				getCUContractorItems().clear();
				getCUContractorItems().addAll((Collection<? extends CUContractorItem>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				getCUMaterialItems().addAll((Collection<? extends CUMaterialItem>)newValue);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
				getCULaborItems().addAll((Collection<? extends CULaborItem>)newValue);
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
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				getCUWorkEquipmentItems().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				setCUGroup((CUGroup)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				getCUAssets().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				setPropertyUnit((PropertyUnit)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				unsetQuantity();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				setCostType((CostType)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				unsetEstCost();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				setCUAllowableAction((CUAllowableAction)null);
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				getProcedures().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				getCUContractorItems().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				getCUMaterialItems().clear();
				return;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
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
			case InfWorkPackage.COMPATIBLE_UNIT__CU_WORK_EQUIPMENT_ITEMS:
				return cuWorkEquipmentItems != null && !cuWorkEquipmentItems.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_GROUP:
				return cuGroup != null;
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ASSETS:
				return cuAssets != null && !cuAssets.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__PROPERTY_UNIT:
				return propertyUnit != null;
			case InfWorkPackage.COMPATIBLE_UNIT__QUANTITY:
				return isSetQuantity();
			case InfWorkPackage.COMPATIBLE_UNIT__COST_TYPE:
				return costType != null;
			case InfWorkPackage.COMPATIBLE_UNIT__EST_COST:
				return isSetEstCost();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_ALLOWABLE_ACTION:
				return cuAllowableAction != null;
			case InfWorkPackage.COMPATIBLE_UNIT__PROCEDURES:
				return procedures != null && !procedures.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_CONTRACTOR_ITEMS:
				return cuContractorItems != null && !cuContractorItems.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_MATERIAL_ITEMS:
				return cuMaterialItems != null && !cuMaterialItems.isEmpty();
			case InfWorkPackage.COMPATIBLE_UNIT__CU_LABOR_ITEMS:
				return cuLaborItems != null && !cuLaborItems.isEmpty();
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
		result.append(", estCost: ");
		if (estCostESet) result.append(estCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CompatibleUnit
