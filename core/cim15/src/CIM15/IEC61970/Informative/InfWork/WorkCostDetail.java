/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Work.Work;

import CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * A representation of the model object '<em><b>Work Cost Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMiscCostItems <em>Misc Cost Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary <em>Work Cost Summary</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getPropertyUnits <em>Property Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getMaterialItems <em>Material Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getEquipmentItems <em>Equipment Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost <em>Overhead Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkCostDetail extends Document {
	/**
	 * The cached value of the '{@link #getWorkTask() <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTask()
	 * @generated
	 * @ordered
	 */
	protected WorkTask workTask;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #isIsDebit() <em>Is Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDebit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEBIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDebit() <em>Is Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDebit()
	 * @generated
	 * @ordered
	 */
	protected boolean isDebit = IS_DEBIT_EDEFAULT;

	/**
	 * This is true if the Is Debit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDebitESet;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * The cached value of the '{@link #getDesign() <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign()
	 * @generated
	 * @ordered
	 */
	protected Design design;

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
	 * The cached value of the '{@link #getWorkCostSummary() <em>Work Cost Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostSummary()
	 * @generated
	 * @ordered
	 */
	protected WorkCostSummary workCostSummary;

	/**
	 * The default value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionDateTime() <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDateTime = TRANSACTION_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Transaction Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transactionDateTimeESet;

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
	 * The cached value of the '{@link #getErpProjectAccounting() <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpProjectAccounting()
	 * @generated
	 * @ordered
	 */
	protected ErpProjectAccounting erpProjectAccounting;

	/**
	 * The cached value of the '{@link #getLaborItems() <em>Labor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborItems()
	 * @generated
	 * @ordered
	 */
	protected EList<LaborItem> laborItems;

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
	 * The cached value of the '{@link #getEquipmentItems() <em>Equipment Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipmentItems()
	 * @generated
	 * @ordered
	 */
	protected EList<EquipmentItem> equipmentItems;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * This is true if the Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amountESet;

	/**
	 * The cached value of the '{@link #getContractorItems() <em>Contractor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractorItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractorItem> contractorItems;

	/**
	 * The cached value of the '{@link #getOverheadCost() <em>Overhead Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverheadCost()
	 * @generated
	 * @ordered
	 */
	protected OverheadCost overheadCost;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkCostDetail() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_COST_DETAIL;
	}

	/**
	 * Returns the value of the '<em><b>Work Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Task</em>' reference.
	 * @see #setWorkTask(WorkTask)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails
	 * @generated
	 */
	public WorkTask getWorkTask() {
		if (workTask != null && workTask.eIsProxy()) {
			InternalEObject oldWorkTask = (InternalEObject)workTask;
			workTask = (WorkTask)eResolveProxy(oldWorkTask);
			if (workTask != oldWorkTask) {
			}
		}
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkTask basicGetWorkTask() {
		return workTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkTask(WorkTask newWorkTask, NotificationChain msgs) {
		WorkTask oldWorkTask = workTask;
		workTask = newWorkTask;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Task</em>' reference.
	 * @see #getWorkTask()
	 * @generated
	 */
	public void setWorkTask(WorkTask newWorkTask) {
		if (newWorkTask != workTask) {
			NotificationChain msgs = null;
			if (workTask != null)
				msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__WORK_COST_DETAILS, WorkTask.class, msgs);
			if (newWorkTask != null)
				msgs = ((InternalEObject)newWorkTask).eInverseAdd(this, InfWorkPackage.WORK_TASK__WORK_COST_DETAILS, WorkTask.class, msgs);
			msgs = basicSetWorkTask(newWorkTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
		typeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public void unsetType() {
		type = TYPE_EDEFAULT;
		typeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Debit</em>' attribute.
	 * @see #isSetIsDebit()
	 * @see #unsetIsDebit()
	 * @see #setIsDebit(boolean)
	 * @generated
	 */
	public boolean isIsDebit() {
		return isDebit;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Debit</em>' attribute.
	 * @see #isSetIsDebit()
	 * @see #unsetIsDebit()
	 * @see #isIsDebit()
	 * @generated
	 */
	public void setIsDebit(boolean newIsDebit) {
		isDebit = newIsDebit;
		isDebitESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDebit()
	 * @see #isIsDebit()
	 * @see #setIsDebit(boolean)
	 * @generated
	 */
	public void unsetIsDebit() {
		isDebit = IS_DEBIT_EDEFAULT;
		isDebitESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#isIsDebit <em>Is Debit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Debit</em>' attribute is set.
	 * @see #unsetIsDebit()
	 * @see #isIsDebit()
	 * @see #setIsDebit(boolean)
	 * @generated
	 */
	public boolean isSetIsDebit() {
		return isDebitESet;
	}

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM15.IEC61968.Work.Work#getWorkCostDetails
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new BasicInternalEList<Work>(Work.class);
		}
		return works;
	}

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Design#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference.
	 * @see #setDesign(Design)
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getWorkCostDetails
	 * @generated
	 */
	public Design getDesign() {
		if (design != null && design.eIsProxy()) {
			InternalEObject oldDesign = (InternalEObject)design;
			design = (Design)eResolveProxy(oldDesign);
			if (design != oldDesign) {
			}
		}
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Design basicGetDesign() {
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesign(Design newDesign, NotificationChain msgs) {
		Design oldDesign = design;
		design = newDesign;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getDesign <em>Design</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design</em>' reference.
	 * @see #getDesign()
	 * @generated
	 */
	public void setDesign(Design newDesign) {
		if (newDesign != design) {
			NotificationChain msgs = null;
			if (design != null)
				msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_COST_DETAILS, Design.class, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, InfWorkPackage.DESIGN__WORK_COST_DETAILS, Design.class, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Misc Cost Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.MiscCostItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Cost Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Cost Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkCostDetail
	 * @generated
	 */
	public EList<MiscCostItem> getMiscCostItems() {
		if (miscCostItems == null) {
			miscCostItems = new BasicInternalEList<MiscCostItem>(MiscCostItem.class);
		}
		return miscCostItems;
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Summary</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Summary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Summary</em>' reference.
	 * @see #setWorkCostSummary(WorkCostSummary)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostSummary#getWorkCostDetail
	 * @generated
	 */
	public WorkCostSummary getWorkCostSummary() {
		if (workCostSummary != null && workCostSummary.eIsProxy()) {
			InternalEObject oldWorkCostSummary = (InternalEObject)workCostSummary;
			workCostSummary = (WorkCostSummary)eResolveProxy(oldWorkCostSummary);
			if (workCostSummary != oldWorkCostSummary) {
			}
		}
		return workCostSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkCostSummary basicGetWorkCostSummary() {
		return workCostSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkCostSummary(WorkCostSummary newWorkCostSummary, NotificationChain msgs) {
		WorkCostSummary oldWorkCostSummary = workCostSummary;
		workCostSummary = newWorkCostSummary;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkCostSummary <em>Work Cost Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Cost Summary</em>' reference.
	 * @see #getWorkCostSummary()
	 * @generated
	 */
	public void setWorkCostSummary(WorkCostSummary newWorkCostSummary) {
		if (newWorkCostSummary != workCostSummary) {
			NotificationChain msgs = null;
			if (workCostSummary != null)
				msgs = ((InternalEObject)workCostSummary).eInverseRemove(this, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, WorkCostSummary.class, msgs);
			if (newWorkCostSummary != null)
				msgs = ((InternalEObject)newWorkCostSummary).eInverseAdd(this, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, WorkCostSummary.class, msgs);
			msgs = basicSetWorkCostSummary(newWorkCostSummary, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transaction Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #isSetTransactionDateTime()
	 * @see #unsetTransactionDateTime()
	 * @see #setTransactionDateTime(Date)
	 * @generated
	 */
	public Date getTransactionDateTime() {
		return transactionDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date Time</em>' attribute.
	 * @see #isSetTransactionDateTime()
	 * @see #unsetTransactionDateTime()
	 * @see #getTransactionDateTime()
	 * @generated
	 */
	public void setTransactionDateTime(Date newTransactionDateTime) {
		transactionDateTime = newTransactionDateTime;
		transactionDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransactionDateTime()
	 * @see #getTransactionDateTime()
	 * @see #setTransactionDateTime(Date)
	 * @generated
	 */
	public void unsetTransactionDateTime() {
		transactionDateTime = TRANSACTION_DATE_TIME_EDEFAULT;
		transactionDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getTransactionDateTime <em>Transaction Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transaction Date Time</em>' attribute is set.
	 * @see #unsetTransactionDateTime()
	 * @see #getTransactionDateTime()
	 * @see #setTransactionDateTime(Date)
	 * @generated
	 */
	public boolean isSetTransactionDateTime() {
		return transactionDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Property Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.PropertyUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.PropertyUnit#getWorkCostDetails
	 * @generated
	 */
	public EList<PropertyUnit> getPropertyUnits() {
		if (propertyUnits == null) {
			propertyUnits = new BasicInternalEList<PropertyUnit>(PropertyUnit.class);
		}
		return propertyUnits;
	}

	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails
	 * @generated
	 */
	public ErpProjectAccounting getErpProjectAccounting() {
		if (erpProjectAccounting != null && erpProjectAccounting.eIsProxy()) {
			InternalEObject oldErpProjectAccounting = (InternalEObject)erpProjectAccounting;
			erpProjectAccounting = (ErpProjectAccounting)eResolveProxy(oldErpProjectAccounting);
			if (erpProjectAccounting != oldErpProjectAccounting) {
			}
		}
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpProjectAccounting basicGetErpProjectAccounting() {
		return erpProjectAccounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting, NotificationChain msgs) {
		ErpProjectAccounting oldErpProjectAccounting = erpProjectAccounting;
		erpProjectAccounting = newErpProjectAccounting;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #getErpProjectAccounting()
	 * @generated
	 */
	public void setErpProjectAccounting(ErpProjectAccounting newErpProjectAccounting) {
		if (newErpProjectAccounting != erpProjectAccounting) {
			NotificationChain msgs = null;
			if (erpProjectAccounting != null)
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.LaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkCostDetail
	 * @generated
	 */
	public EList<LaborItem> getLaborItems() {
		if (laborItems == null) {
			laborItems = new BasicInternalEList<LaborItem>(LaborItem.class);
		}
		return laborItems;
	}

	/**
	 * Returns the value of the '<em><b>Material Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.MaterialItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkCostDetail
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new BasicInternalEList<MaterialItem>(MaterialItem.class);
		}
		return materialItems;
	}

	/**
	 * Returns the value of the '<em><b>Equipment Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.EquipmentItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkCostDetail
	 * @generated
	 */
	public EList<EquipmentItem> getEquipmentItems() {
		if (equipmentItems == null) {
			equipmentItems = new BasicInternalEList<EquipmentItem>(EquipmentItem.class);
		}
		return equipmentItems;
	}

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #isSetAmount()
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @generated
	 */
	public void setAmount(float newAmount) {
		amount = newAmount;
		amountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public void unsetAmount() {
		amount = AMOUNT_EDEFAULT;
		amountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getAmount <em>Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount</em>' attribute is set.
	 * @see #unsetAmount()
	 * @see #getAmount()
	 * @see #setAmount(float)
	 * @generated
	 */
	public boolean isSetAmount() {
		return amountESet;
	}

	/**
	 * Returns the value of the '<em><b>Contractor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.ContractorItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail <em>Work Cost Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkCostDetail
	 * @generated
	 */
	public EList<ContractorItem> getContractorItems() {
		if (contractorItems == null) {
			contractorItems = new BasicInternalEList<ContractorItem>(ContractorItem.class);
		}
		return contractorItems;
	}

	/**
	 * Returns the value of the '<em><b>Overhead Cost</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead Cost</em>' reference.
	 * @see #setOverheadCost(OverheadCost)
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkCostDetails
	 * @generated
	 */
	public OverheadCost getOverheadCost() {
		if (overheadCost != null && overheadCost.eIsProxy()) {
			InternalEObject oldOverheadCost = (InternalEObject)overheadCost;
			overheadCost = (OverheadCost)eResolveProxy(oldOverheadCost);
			if (overheadCost != oldOverheadCost) {
			}
		}
		return overheadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadCost basicGetOverheadCost() {
		return overheadCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverheadCost(OverheadCost newOverheadCost, NotificationChain msgs) {
		OverheadCost oldOverheadCost = overheadCost;
		overheadCost = newOverheadCost;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getOverheadCost <em>Overhead Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overhead Cost</em>' reference.
	 * @see #getOverheadCost()
	 * @generated
	 */
	public void setOverheadCost(OverheadCost newOverheadCost) {
		if (newOverheadCost != overheadCost) {
			NotificationChain msgs = null;
			if (overheadCost != null)
				msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS, OverheadCost.class, msgs);
			if (newOverheadCost != null)
				msgs = ((InternalEObject)newOverheadCost).eInverseAdd(this, InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS, OverheadCost.class, msgs);
			msgs = basicSetOverheadCost(newOverheadCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cost Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CostType#getWorkCostDetails <em>Work Cost Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Type</em>' reference.
	 * @see #setCostType(CostType)
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getWorkCostDetails
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}' reference.
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
				msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__WORK_COST_DETAILS, CostType.class, msgs);
			if (newCostType != null)
				msgs = ((InternalEObject)newCostType).eInverseAdd(this, InfWorkPackage.COST_TYPE__WORK_COST_DETAILS, CostType.class, msgs);
			msgs = basicSetCostType(newCostType, msgs);
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
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				if (workTask != null)
					msgs = ((InternalEObject)workTask).eInverseRemove(this, InfWorkPackage.WORK_TASK__WORK_COST_DETAILS, WorkTask.class, msgs);
				return basicSetWorkTask((WorkTask)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				if (design != null)
					msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_COST_DETAILS, Design.class, msgs);
				return basicSetDesign((Design)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMiscCostItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				if (workCostSummary != null)
					msgs = ((InternalEObject)workCostSummary).eInverseRemove(this, InfWorkPackage.WORK_COST_SUMMARY__WORK_COST_DETAIL, WorkCostSummary.class, msgs);
				return basicSetWorkCostSummary((WorkCostSummary)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaborItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquipmentItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContractorItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				if (overheadCost != null)
					msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_COST_DETAILS, OverheadCost.class, msgs);
				return basicSetOverheadCost((OverheadCost)otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				if (costType != null)
					msgs = ((InternalEObject)costType).eInverseRemove(this, InfWorkPackage.COST_TYPE__WORK_COST_DETAILS, CostType.class, msgs);
				return basicSetCostType((CostType)otherEnd, msgs);
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
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				return basicSetWorkTask(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				return basicSetDesign(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return ((InternalEList<?>)getMiscCostItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				return basicSetWorkCostSummary(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return ((InternalEList<?>)getPropertyUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return ((InternalEList<?>)getLaborItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return ((InternalEList<?>)getEquipmentItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return ((InternalEList<?>)getContractorItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				return basicSetOverheadCost(null, msgs);
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				return basicSetCostType(null, msgs);
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
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				if (resolve) return getWorkTask();
				return basicGetWorkTask();
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				return getType();
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				return isIsDebit();
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return getWorks();
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				if (resolve) return getDesign();
				return basicGetDesign();
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return getMiscCostItems();
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				if (resolve) return getWorkCostSummary();
				return basicGetWorkCostSummary();
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				return getTransactionDateTime();
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return getPropertyUnits();
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return getLaborItems();
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return getMaterialItems();
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return getEquipmentItems();
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				return getAmount();
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return getContractorItems();
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				if (resolve) return getOverheadCost();
				return basicGetOverheadCost();
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				if (resolve) return getCostType();
				return basicGetCostType();
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
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				setWorkTask((WorkTask)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				setType((String)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				setIsDebit((Boolean)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				setDesign((Design)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				getMiscCostItems().addAll((Collection<? extends MiscCostItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				setWorkCostSummary((WorkCostSummary)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				setTransactionDateTime((Date)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				getPropertyUnits().clear();
				getPropertyUnits().addAll((Collection<? extends PropertyUnit>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				getLaborItems().clear();
				getLaborItems().addAll((Collection<? extends LaborItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				getEquipmentItems().addAll((Collection<? extends EquipmentItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				setAmount((Float)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				getContractorItems().addAll((Collection<? extends ContractorItem>)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				setOverheadCost((OverheadCost)newValue);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				setCostType((CostType)newValue);
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
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				setWorkTask((WorkTask)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				unsetType();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				unsetIsDebit();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				getWorks().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				setDesign((Design)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				setWorkCostSummary((WorkCostSummary)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				unsetTransactionDateTime();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				getPropertyUnits().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				getLaborItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				getMaterialItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				unsetAmount();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				return;
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				setOverheadCost((OverheadCost)null);
				return;
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				setCostType((CostType)null);
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
			case InfWorkPackage.WORK_COST_DETAIL__WORK_TASK:
				return workTask != null;
			case InfWorkPackage.WORK_COST_DETAIL__TYPE:
				return isSetType();
			case InfWorkPackage.WORK_COST_DETAIL__IS_DEBIT:
				return isSetIsDebit();
			case InfWorkPackage.WORK_COST_DETAIL__WORKS:
				return works != null && !works.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__DESIGN:
				return design != null;
			case InfWorkPackage.WORK_COST_DETAIL__MISC_COST_ITEMS:
				return miscCostItems != null && !miscCostItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__WORK_COST_SUMMARY:
				return workCostSummary != null;
			case InfWorkPackage.WORK_COST_DETAIL__TRANSACTION_DATE_TIME:
				return isSetTransactionDateTime();
			case InfWorkPackage.WORK_COST_DETAIL__PROPERTY_UNITS:
				return propertyUnits != null && !propertyUnits.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
			case InfWorkPackage.WORK_COST_DETAIL__LABOR_ITEMS:
				return laborItems != null && !laborItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__EQUIPMENT_ITEMS:
				return equipmentItems != null && !equipmentItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__AMOUNT:
				return isSetAmount();
			case InfWorkPackage.WORK_COST_DETAIL__CONTRACTOR_ITEMS:
				return contractorItems != null && !contractorItems.isEmpty();
			case InfWorkPackage.WORK_COST_DETAIL__OVERHEAD_COST:
				return overheadCost != null;
			case InfWorkPackage.WORK_COST_DETAIL__COST_TYPE:
				return costType != null;
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", isDebit: ");
		if (isDebitESet) result.append(isDebit); else result.append("<unset>");
		result.append(", transactionDateTime: ");
		if (transactionDateTimeESet) result.append(transactionDateTime); else result.append("<unset>");
		result.append(", amount: ");
		if (amountESet) result.append(amount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WorkCostDetail
