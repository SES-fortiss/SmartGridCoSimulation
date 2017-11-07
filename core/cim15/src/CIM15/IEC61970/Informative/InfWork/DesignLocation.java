/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData;

import CIM15.IEC61970.Informative.InfGMLSupport.Diagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesigns <em>Designs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations <em>Work Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getMiscCostItems <em>Misc Cost Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getErpBomItemDatas <em>Erp Bom Item Datas</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getConditionFactors <em>Condition Factors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignLocation extends IdentifiedObject {
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
	 * The cached value of the '{@link #getMaterialItems() <em>Material Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialItem> materialItems;

	/**
	 * The cached value of the '{@link #getDesigns() <em>Designs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Design> designs;

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
	 * The cached value of the '{@link #getWorkLocations() <em>Work Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkLocation> workLocations;

	/**
	 * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrams()
	 * @generated
	 * @ordered
	 */
	protected EList<Diagram> diagrams;

	/**
	 * The cached value of the '{@link #getMiscCostItems() <em>Misc Cost Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscCostItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MiscCostItem> miscCostItems;

	/**
	 * The cached value of the '{@link #getErpBomItemDatas() <em>Erp Bom Item Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBomItemDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpBomItemData> erpBomItemDatas;

	/**
	 * The default value of the '{@link #getSpanLength() <em>Span Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanLength()
	 * @generated
	 * @ordered
	 */
	protected static final float SPAN_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpanLength() <em>Span Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanLength()
	 * @generated
	 * @ordered
	 */
	protected float spanLength = SPAN_LENGTH_EDEFAULT;

	/**
	 * This is true if the Span Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spanLengthESet;

	/**
	 * The cached value of the '{@link #getConditionFactors() <em>Condition Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionFactor> conditionFactors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignLocation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DESIGN_LOCATION;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.DESIGN_LOCATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.DESIGN_LOCATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getDesignLocation
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new BasicInternalEList<MaterialItem>(MaterialItem.class);
		}
		return materialItems;
	}

	/**
	 * Returns the value of the '<em><b>Designs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Design}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Design#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getDesignLocations
	 * @generated
	 */
	public EList<Design> getDesigns() {
		if (designs == null) {
			designs = new BasicInternalEList<Design>(Design.class);
		}
		return designs;
	}

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new BasicInternalEList<DesignLocationCU>(DesignLocationCU.class);
		}
		return designLocationCUs;
	}

	/**
	 * Returns the value of the '<em><b>Work Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkLocation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Locations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations
	 * @generated
	 */
	public EList<WorkLocation> getWorkLocations() {
		if (workLocations == null) {
			workLocations = new BasicInternalEList<WorkLocation>(WorkLocation.class);
		}
		return workLocations;
	}

	/**
	 * Returns the value of the '<em><b>Diagrams</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagrams</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.Diagram#getDesignLocations
	 * @generated
	 */
	public EList<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new BasicInternalEList<Diagram>(Diagram.class);
		}
		return diagrams;
	}

	/**
	 * Returns the value of the '<em><b>Misc Cost Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.MiscCostItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Cost Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Cost Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getDesignLocation
	 * @generated
	 */
	public EList<MiscCostItem> getMiscCostItems() {
		if (miscCostItems == null) {
			miscCostItems = new BasicInternalEList<MiscCostItem>(MiscCostItem.class);
		}
		return miscCostItems;
	}

	/**
	 * Returns the value of the '<em><b>Erp Bom Item Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation <em>Design Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Bom Item Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Bom Item Datas</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBomItemData#getDesignLocation
	 * @generated
	 */
	public EList<ErpBomItemData> getErpBomItemDatas() {
		if (erpBomItemDatas == null) {
			erpBomItemDatas = new BasicInternalEList<ErpBomItemData>(ErpBomItemData.class);
		}
		return erpBomItemDatas;
	}

	/**
	 * Returns the value of the '<em><b>Span Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span Length</em>' attribute.
	 * @see #isSetSpanLength()
	 * @see #unsetSpanLength()
	 * @see #setSpanLength(float)
	 * @generated
	 */
	public float getSpanLength() {
		return spanLength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span Length</em>' attribute.
	 * @see #isSetSpanLength()
	 * @see #unsetSpanLength()
	 * @see #getSpanLength()
	 * @generated
	 */
	public void setSpanLength(float newSpanLength) {
		spanLength = newSpanLength;
		spanLengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpanLength()
	 * @see #getSpanLength()
	 * @see #setSpanLength(float)
	 * @generated
	 */
	public void unsetSpanLength() {
		spanLength = SPAN_LENGTH_EDEFAULT;
		spanLengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getSpanLength <em>Span Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span Length</em>' attribute is set.
	 * @see #unsetSpanLength()
	 * @see #getSpanLength()
	 * @see #setSpanLength(float)
	 * @generated
	 */
	public boolean isSetSpanLength() {
		return spanLengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Condition Factors</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.ConditionFactor}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations <em>Design Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Factors</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocations
	 * @generated
	 */
	public EList<ConditionFactor> getConditionFactors() {
		if (conditionFactors == null) {
			conditionFactors = new BasicInternalEList<ConditionFactor>(ConditionFactor.class);
		}
		return conditionFactors;
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
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigns()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMiscCostItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpBomItemDatas()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditionFactors()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return ((InternalEList<?>)getWorkLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return ((InternalEList<?>)getMiscCostItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return ((InternalEList<?>)getErpBomItemDatas()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return ((InternalEList<?>)getConditionFactors()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				return getStatus();
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return getDesigns();
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return getWorkLocations();
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return getDiagrams();
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return getMiscCostItems();
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return getErpBomItemDatas();
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				return getSpanLength();
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return getConditionFactors();
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
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				getDesigns().clear();
				getDesigns().addAll((Collection<? extends Design>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				getWorkLocations().clear();
				getWorkLocations().addAll((Collection<? extends WorkLocation>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				getDiagrams().clear();
				getDiagrams().addAll((Collection<? extends Diagram>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				getMiscCostItems().addAll((Collection<? extends MiscCostItem>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				getErpBomItemDatas().addAll((Collection<? extends ErpBomItemData>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				setSpanLength((Float)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				getConditionFactors().clear();
				getConditionFactors().addAll((Collection<? extends ConditionFactor>)newValue);
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
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				getDesigns().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				getWorkLocations().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				getDiagrams().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				getErpBomItemDatas().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				unsetSpanLength();
				return;
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				getConditionFactors().clear();
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
			case InfWorkPackage.DESIGN_LOCATION__STATUS:
				return status != null;
			case InfWorkPackage.DESIGN_LOCATION__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__DESIGNS:
				return designs != null && !designs.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__WORK_LOCATIONS:
				return workLocations != null && !workLocations.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__DIAGRAMS:
				return diagrams != null && !diagrams.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__MISC_COST_ITEMS:
				return miscCostItems != null && !miscCostItems.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__ERP_BOM_ITEM_DATAS:
				return erpBomItemDatas != null && !erpBomItemDatas.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION__SPAN_LENGTH:
				return isSetSpanLength();
			case InfWorkPackage.DESIGN_LOCATION__CONDITION_FACTORS:
				return conditionFactors != null && !conditionFactors.isEmpty();
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
		result.append(" (spanLength: ");
		if (spanLengthESet) result.append(spanLength); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DesignLocation
