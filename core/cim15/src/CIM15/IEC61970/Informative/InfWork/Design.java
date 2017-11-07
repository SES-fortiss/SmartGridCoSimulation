/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Work.Work;
import CIM15.IEC61968.Work.WorkPackage;

import CIM15.IEC61970.Informative.InfERPSupport.ErpBOM;
import CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getErpBOMs <em>Erp BO Ms</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs <em>Design Locations CUs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Design extends Document {
	/**
	 * The cached value of the '{@link #getDesignLocations() <em>Design Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocation> designLocations;

	/**
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

	/**
	 * The default value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_ESTIMATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCostEstimate() <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostEstimate()
	 * @generated
	 * @ordered
	 */
	protected float costEstimate = COST_ESTIMATE_EDEFAULT;

	/**
	 * This is true if the Cost Estimate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costEstimateESet;

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
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

	/**
	 * The cached value of the '{@link #getErpBOMs() <em>Erp BO Ms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpBOMs()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpBOM> erpBOMs;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DesignKind KIND_EDEFAULT = DesignKind.AS_BUILT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DesignKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Work work;

	/**
	 * The cached value of the '{@link #getDesignLocationsCUs() <em>Design Locations CUs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocationsCUs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocationCU> designLocationsCUs;

	/**
	 * The cached value of the '{@link #getErpQuoteLineItem() <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpQuoteLineItem erpQuoteLineItem;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * This is true if the Price attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Design() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DESIGN;
	}

	/**
	 * Returns the value of the '<em><b>Design Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesigns
	 * @generated
	 */
	public EList<DesignLocation> getDesignLocations() {
		if (designLocations == null) {
			designLocations = new BasicInternalEList<DesignLocation>(DesignLocation.class);
		}
		return designLocations;
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getDesign
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new BasicInternalEList<WorkCostDetail>(WorkCostDetail.class);
		}
		return workCostDetails;
	}

	/**
	 * Returns the value of the '<em><b>Cost Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Estimate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Estimate</em>' attribute.
	 * @see #isSetCostEstimate()
	 * @see #unsetCostEstimate()
	 * @see #setCostEstimate(float)
	 * @generated
	 */
	public float getCostEstimate() {
		return costEstimate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Estimate</em>' attribute.
	 * @see #isSetCostEstimate()
	 * @see #unsetCostEstimate()
	 * @see #getCostEstimate()
	 * @generated
	 */
	public void setCostEstimate(float newCostEstimate) {
		costEstimate = newCostEstimate;
		costEstimateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCostEstimate()
	 * @see #getCostEstimate()
	 * @see #setCostEstimate(float)
	 * @generated
	 */
	public void unsetCostEstimate() {
		costEstimate = COST_ESTIMATE_EDEFAULT;
		costEstimateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getCostEstimate <em>Cost Estimate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost Estimate</em>' attribute is set.
	 * @see #unsetCostEstimate()
	 * @see #getCostEstimate()
	 * @see #setCostEstimate(float)
	 * @generated
	 */
	public boolean isSetCostEstimate() {
		return costEstimateESet;
	}

	/**
	 * Returns the value of the '<em><b>Condition Factors</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.ConditionFactor}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Factors</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesigns
	 * @generated
	 */
	public EList<ConditionFactor> getConditionFactors() {
		if (conditionFactors == null) {
			conditionFactors = new BasicInternalEList<ConditionFactor>(ConditionFactor.class);
		}
		return conditionFactors;
	}

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getDesign
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new BasicInternalEList<WorkTask>(WorkTask.class);
		}
		return workTasks;
	}

	/**
	 * Returns the value of the '<em><b>Erp BO Ms</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp BO Ms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp BO Ms</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpBOM#getDesign
	 * @generated
	 */
	public EList<ErpBOM> getErpBOMs() {
		if (erpBOMs == null) {
			erpBOMs = new BasicInternalEList<ErpBOM>(ErpBOM.class);
		}
		return erpBOMs;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfWork.DesignKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(DesignKind)
	 * @generated
	 */
	public DesignKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(DesignKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(DesignKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(DesignKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Work)
	 * @see CIM15.IEC61968.Work.Work#getDesigns
	 * @generated
	 */
	public Work getWork() {
		if (work != null && work.eIsProxy()) {
			InternalEObject oldWork = (InternalEObject)work;
			work = (Work)eResolveProxy(oldWork);
			if (work != oldWork) {
			}
		}
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work basicGetWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(Work newWork, NotificationChain msgs) {
		Work oldWork = work;
		work = newWork;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__DESIGNS, Work.class, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, WorkPackage.WORK__DESIGNS, Work.class, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Design Locations CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns <em>Designs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations CUs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationsCUs() {
		if (designLocationsCUs == null) {
			designLocationsCUs = new BasicInternalEList<DesignLocationCU>(DesignLocationCU.class);
		}
		return designLocationsCUs;
	}

	/**
	 * Returns the value of the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #setErpQuoteLineItem(ErpQuoteLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getDesign
	 * @generated
	 */
	public ErpQuoteLineItem getErpQuoteLineItem() {
		if (erpQuoteLineItem != null && erpQuoteLineItem.eIsProxy()) {
			InternalEObject oldErpQuoteLineItem = (InternalEObject)erpQuoteLineItem;
			erpQuoteLineItem = (ErpQuoteLineItem)eResolveProxy(oldErpQuoteLineItem);
			if (erpQuoteLineItem != oldErpQuoteLineItem) {
			}
		}
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem basicGetErpQuoteLineItem() {
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem, NotificationChain msgs) {
		ErpQuoteLineItem oldErpQuoteLineItem = erpQuoteLineItem;
		erpQuoteLineItem = newErpQuoteLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getErpQuoteLineItem <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public void setErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem) {
		if (newErpQuoteLineItem != erpQuoteLineItem) {
			NotificationChain msgs = null;
			if (erpQuoteLineItem != null)
				msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, ErpQuoteLineItem.class, msgs);
			if (newErpQuoteLineItem != null)
				msgs = ((InternalEObject)newErpQuoteLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, ErpQuoteLineItem.class, msgs);
			msgs = basicSetErpQuoteLineItem(newErpQuoteLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #isSetPrice()
	 * @see #unsetPrice()
	 * @see #setPrice(float)
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #isSetPrice()
	 * @see #unsetPrice()
	 * @see #getPrice()
	 * @generated
	 */
	public void setPrice(float newPrice) {
		price = newPrice;
		priceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrice()
	 * @see #getPrice()
	 * @see #setPrice(float)
	 * @generated
	 */
	public void unsetPrice() {
		price = PRICE_EDEFAULT;
		priceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Design#getPrice <em>Price</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Price</em>' attribute is set.
	 * @see #unsetPrice()
	 * @see #getPrice()
	 * @see #setPrice(float)
	 * @generated
	 */
	public boolean isSetPrice() {
		return priceESet;
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocations()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditionFactors()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpBOMs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK:
				if (work != null)
					msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__DESIGNS, Work.class, msgs);
				return basicSetWork((Work)otherEnd, msgs);
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationsCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				if (erpQuoteLineItem != null)
					msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__DESIGN, ErpQuoteLineItem.class, msgs);
				return basicSetErpQuoteLineItem((ErpQuoteLineItem)otherEnd, msgs);
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return ((InternalEList<?>)getDesignLocations()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return ((InternalEList<?>)getConditionFactors()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return ((InternalEList<?>)getErpBOMs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__WORK:
				return basicSetWork(null, msgs);
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return ((InternalEList<?>)getDesignLocationsCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				return basicSetErpQuoteLineItem(null, msgs);
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return getDesignLocations();
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				return getCostEstimate();
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return getConditionFactors();
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return getErpBOMs();
			case InfWorkPackage.DESIGN__KIND:
				return getKind();
			case InfWorkPackage.DESIGN__WORK:
				if (resolve) return getWork();
				return basicGetWork();
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return getDesignLocationsCUs();
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				if (resolve) return getErpQuoteLineItem();
				return basicGetErpQuoteLineItem();
			case InfWorkPackage.DESIGN__PRICE:
				return getPrice();
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				getDesignLocations().addAll((Collection<? extends DesignLocation>)newValue);
				return;
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				setCostEstimate((Float)newValue);
				return;
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				getConditionFactors().clear();
				getConditionFactors().addAll((Collection<? extends ConditionFactor>)newValue);
				return;
			case InfWorkPackage.DESIGN__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				getErpBOMs().clear();
				getErpBOMs().addAll((Collection<? extends ErpBOM>)newValue);
				return;
			case InfWorkPackage.DESIGN__KIND:
				setKind((DesignKind)newValue);
				return;
			case InfWorkPackage.DESIGN__WORK:
				setWork((Work)newValue);
				return;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				getDesignLocationsCUs().clear();
				getDesignLocationsCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)newValue);
				return;
			case InfWorkPackage.DESIGN__PRICE:
				setPrice((Float)newValue);
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				return;
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				unsetCostEstimate();
				return;
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				getConditionFactors().clear();
				return;
			case InfWorkPackage.DESIGN__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				getErpBOMs().clear();
				return;
			case InfWorkPackage.DESIGN__KIND:
				unsetKind();
				return;
			case InfWorkPackage.DESIGN__WORK:
				setWork((Work)null);
				return;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				getDesignLocationsCUs().clear();
				return;
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)null);
				return;
			case InfWorkPackage.DESIGN__PRICE:
				unsetPrice();
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
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS:
				return designLocations != null && !designLocations.isEmpty();
			case InfWorkPackage.DESIGN__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfWorkPackage.DESIGN__COST_ESTIMATE:
				return isSetCostEstimate();
			case InfWorkPackage.DESIGN__CONDITION_FACTORS:
				return conditionFactors != null && !conditionFactors.isEmpty();
			case InfWorkPackage.DESIGN__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.DESIGN__ERP_BO_MS:
				return erpBOMs != null && !erpBOMs.isEmpty();
			case InfWorkPackage.DESIGN__KIND:
				return isSetKind();
			case InfWorkPackage.DESIGN__WORK:
				return work != null;
			case InfWorkPackage.DESIGN__DESIGN_LOCATIONS_CUS:
				return designLocationsCUs != null && !designLocationsCUs.isEmpty();
			case InfWorkPackage.DESIGN__ERP_QUOTE_LINE_ITEM:
				return erpQuoteLineItem != null;
			case InfWorkPackage.DESIGN__PRICE:
				return isSetPrice();
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
		result.append(" (costEstimate: ");
		if (costEstimateESet) result.append(costEstimate); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", price: ");
		if (priceESet) result.append(price); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Design
