/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Work.Work;
import CIM15.IEC61968.Work.WorkPackage;

import CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getEquipmentItems <em>Equipment Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getUsages <em>Usages</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getMiscCostItems <em>Misc Cost Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getOverheadCost <em>Overhead Cost</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getContractorItems <em>Contractor Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSwitchingSchedules <em>Switching Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getLaborItems <em>Labor Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getMaterialItems <em>Material Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkTask extends Document {
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
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<Usage> usages;

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
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

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
	 * The cached value of the '{@link #getOverheadCost() <em>Overhead Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverheadCost()
	 * @generated
	 * @ordered
	 */
	protected OverheadCost overheadCost;

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
	 * The cached value of the '{@link #getContractorItems() <em>Contractor Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractorItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractorItem> contractorItems;

	/**
	 * The cached value of the '{@link #getSwitchingSchedules() <em>Switching Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingSchedule> switchingSchedules;

	/**
	 * The cached value of the '{@link #getWorkFlowStep() <em>Work Flow Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFlowStep()
	 * @generated
	 * @ordered
	 */
	protected WorkFlowStep workFlowStep;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

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
	 * The cached value of the '{@link #getQualificationRequirements() <em>Qualification Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<QualificationRequirement> qualificationRequirements;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

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
	 * The default value of the '{@link #getSchedOverride() <em>Sched Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHED_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedOverride() <em>Sched Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedOverride()
	 * @generated
	 * @ordered
	 */
	protected String schedOverride = SCHED_OVERRIDE_EDEFAULT;

	/**
	 * This is true if the Sched Override attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schedOverrideESet;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkTask() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_TASK;
	}

	/**
	 * Returns the value of the '<em><b>Equipment Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.EquipmentItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.EquipmentItem#getWorkTask
	 * @generated
	 */
	public EList<EquipmentItem> getEquipmentItems() {
		if (equipmentItems == null) {
			equipmentItems = new BasicInternalEList<EquipmentItem>(EquipmentItem.class);
		}
		return equipmentItems;
	}

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Usage}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage#getWorkTask
	 * @generated
	 */
	public EList<Usage> getUsages() {
		if (usages == null) {
			usages = new BasicInternalEList<Usage>(Usage.class);
		}
		return usages;
	}

	/**
	 * Returns the value of the '<em><b>Misc Cost Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.MiscCostItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Misc Cost Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Misc Cost Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MiscCostItem#getWorkTask
	 * @generated
	 */
	public EList<MiscCostItem> getMiscCostItems() {
		if (miscCostItems == null) {
			miscCostItems = new BasicInternalEList<MiscCostItem>(MiscCostItem.class);
		}
		return miscCostItems;
	}

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getWorkTasks
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new BasicInternalEList<Crew>(Crew.class);
		}
		return crews;
	}

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(Work)
	 * @see CIM15.IEC61968.Work.Work#getWorkTasks
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}' reference.
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
				msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__WORK_TASKS, Work.class, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, WorkPackage.WORK__WORK_TASKS, Work.class, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Overhead Cost</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead Cost</em>' reference.
	 * @see #setOverheadCost(OverheadCost)
	 * @see CIM15.IEC61970.Informative.InfWork.OverheadCost#getWorkTasks
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getOverheadCost <em>Overhead Cost</em>}' reference.
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
				msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_TASKS, OverheadCost.class, msgs);
			if (newOverheadCost != null)
				msgs = ((InternalEObject)newOverheadCost).eInverseAdd(this, InfWorkPackage.OVERHEAD_COST__WORK_TASKS, OverheadCost.class, msgs);
			msgs = basicSetOverheadCost(newOverheadCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new BasicInternalEList<DesignLocationCU>(DesignLocationCU.class);
		}
		return designLocationCUs;
	}

	/**
	 * Returns the value of the '<em><b>Contractor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.ContractorItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.ContractorItem#getWorkTask
	 * @generated
	 */
	public EList<ContractorItem> getContractorItems() {
		if (contractorItems == null) {
			contractorItems = new BasicInternalEList<ContractorItem>(ContractorItem.class);
		}
		return contractorItems;
	}

	/**
	 * Returns the value of the '<em><b>Switching Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getWorkTask
	 * @generated
	 */
	public EList<SwitchingSchedule> getSwitchingSchedules() {
		if (switchingSchedules == null) {
			switchingSchedules = new BasicInternalEList<SwitchingSchedule>(SwitchingSchedule.class);
		}
		return switchingSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Work Flow Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Flow Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Flow Step</em>' reference.
	 * @see #setWorkFlowStep(WorkFlowStep)
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWorkTasks
	 * @generated
	 */
	public WorkFlowStep getWorkFlowStep() {
		if (workFlowStep != null && workFlowStep.eIsProxy()) {
			InternalEObject oldWorkFlowStep = (InternalEObject)workFlowStep;
			workFlowStep = (WorkFlowStep)eResolveProxy(oldWorkFlowStep);
			if (workFlowStep != oldWorkFlowStep) {
			}
		}
		return workFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowStep basicGetWorkFlowStep() {
		return workFlowStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkFlowStep(WorkFlowStep newWorkFlowStep, NotificationChain msgs) {
		WorkFlowStep oldWorkFlowStep = workFlowStep;
		workFlowStep = newWorkFlowStep;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWorkFlowStep <em>Work Flow Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Flow Step</em>' reference.
	 * @see #getWorkFlowStep()
	 * @generated
	 */
	public void setWorkFlowStep(WorkFlowStep newWorkFlowStep) {
		if (newWorkFlowStep != workFlowStep) {
			NotificationChain msgs = null;
			if (workFlowStep != null)
				msgs = ((InternalEObject)workFlowStep).eInverseRemove(this, InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS, WorkFlowStep.class, msgs);
			if (newWorkFlowStep != null)
				msgs = ((InternalEObject)newWorkFlowStep).eInverseAdd(this, InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS, WorkFlowStep.class, msgs);
			msgs = basicSetWorkFlowStep(newWorkFlowStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(String newPriority) {
		priority = newPriority;
		priorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	public void unsetPriority() {
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * Returns the value of the '<em><b>Design</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Design#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' reference.
	 * @see #setDesign(Design)
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getWorkTasks
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getDesign <em>Design</em>}' reference.
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
				msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_TASKS, Design.class, msgs);
			if (newDesign != null)
				msgs = ((InternalEObject)newDesign).eInverseAdd(this, InfWorkPackage.DESIGN__WORK_TASKS, Design.class, msgs);
			msgs = basicSetDesign(newDesign, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new BasicInternalEList<QualificationRequirement>(QualificationRequirement.class);
		}
		return qualificationRequirements;
	}

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Capability}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Capability#getWorkTasks <em>Work Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Capability#getWorkTasks
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new BasicInternalEList<Capability>(Capability.class);
		}
		return capabilities;
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorkTask
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new BasicInternalEList<WorkCostDetail>(WorkCostDetail.class);
		}
		return workCostDetails;
	}

	/**
	 * Returns the value of the '<em><b>Sched Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Override</em>' attribute.
	 * @see #isSetSchedOverride()
	 * @see #unsetSchedOverride()
	 * @see #setSchedOverride(String)
	 * @generated
	 */
	public String getSchedOverride() {
		return schedOverride;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Override</em>' attribute.
	 * @see #isSetSchedOverride()
	 * @see #unsetSchedOverride()
	 * @see #getSchedOverride()
	 * @generated
	 */
	public void setSchedOverride(String newSchedOverride) {
		schedOverride = newSchedOverride;
		schedOverrideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchedOverride()
	 * @see #getSchedOverride()
	 * @see #setSchedOverride(String)
	 * @generated
	 */
	public void unsetSchedOverride() {
		schedOverride = SCHED_OVERRIDE_EDEFAULT;
		schedOverrideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getSchedOverride <em>Sched Override</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sched Override</em>' attribute is set.
	 * @see #unsetSchedOverride()
	 * @see #getSchedOverride()
	 * @see #setSchedOverride(String)
	 * @generated
	 */
	public boolean isSetSchedOverride() {
		return schedOverrideESet;
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getWorkTask
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
	}

	/**
	 * Returns the value of the '<em><b>Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.LaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.LaborItem#getWorkTask
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
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkTask <em>Work Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.MaterialItem#getWorkTask
	 * @generated
	 */
	public EList<MaterialItem> getMaterialItems() {
		if (materialItems == null) {
			materialItems = new BasicInternalEList<MaterialItem>(MaterialItem.class);
		}
		return materialItems;
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
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquipmentItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMiscCostItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK:
				if (work != null)
					msgs = ((InternalEObject)work).eInverseRemove(this, WorkPackage.WORK__WORK_TASKS, Work.class, msgs);
				return basicSetWork((Work)otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				if (overheadCost != null)
					msgs = ((InternalEObject)overheadCost).eInverseRemove(this, InfWorkPackage.OVERHEAD_COST__WORK_TASKS, OverheadCost.class, msgs);
				return basicSetOverheadCost((OverheadCost)otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContractorItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingSchedules()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				if (workFlowStep != null)
					msgs = ((InternalEObject)workFlowStep).eInverseRemove(this, InfWorkPackage.WORK_FLOW_STEP__WORK_TASKS, WorkFlowStep.class, msgs);
				return basicSetWorkFlowStep((WorkFlowStep)otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN:
				if (design != null)
					msgs = ((InternalEObject)design).eInverseRemove(this, InfWorkPackage.DESIGN__WORK_TASKS, Design.class, msgs);
				return basicSetDesign((Design)otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationRequirements()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilities()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLaborItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMaterialItems()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return ((InternalEList<?>)getEquipmentItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return ((InternalEList<?>)getMiscCostItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK:
				return basicSetWork(null, msgs);
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				return basicSetOverheadCost(null, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return ((InternalEList<?>)getContractorItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return ((InternalEList<?>)getSwitchingSchedules()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				return basicSetWorkFlowStep(null, msgs);
			case InfWorkPackage.WORK_TASK__DESIGN:
				return basicSetDesign(null, msgs);
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return ((InternalEList<?>)getLaborItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return ((InternalEList<?>)getMaterialItems()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return getEquipmentItems();
			case InfWorkPackage.WORK_TASK__USAGES:
				return getUsages();
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return getMiscCostItems();
			case InfWorkPackage.WORK_TASK__CREWS:
				return getCrews();
			case InfWorkPackage.WORK_TASK__WORK:
				if (resolve) return getWork();
				return basicGetWork();
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				if (resolve) return getOverheadCost();
				return basicGetOverheadCost();
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return getContractorItems();
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return getSwitchingSchedules();
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				if (resolve) return getWorkFlowStep();
				return basicGetWorkFlowStep();
			case InfWorkPackage.WORK_TASK__PRIORITY:
				return getPriority();
			case InfWorkPackage.WORK_TASK__DESIGN:
				if (resolve) return getDesign();
				return basicGetDesign();
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return getCapabilities();
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				return getSchedOverride();
			case InfWorkPackage.WORK_TASK__ASSETS:
				return getAssets();
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return getLaborItems();
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return getMaterialItems();
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
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				getEquipmentItems().addAll((Collection<? extends EquipmentItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends Usage>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				getMiscCostItems().addAll((Collection<? extends MiscCostItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__WORK:
				setWork((Work)newValue);
				return;
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				setOverheadCost((OverheadCost)newValue);
				return;
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				getContractorItems().addAll((Collection<? extends ContractorItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				getSwitchingSchedules().addAll((Collection<? extends SwitchingSchedule>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				setWorkFlowStep((WorkFlowStep)newValue);
				return;
			case InfWorkPackage.WORK_TASK__PRIORITY:
				setPriority((String)newValue);
				return;
			case InfWorkPackage.WORK_TASK__DESIGN:
				setDesign((Design)newValue);
				return;
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				setSchedOverride((String)newValue);
				return;
			case InfWorkPackage.WORK_TASK__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				getLaborItems().clear();
				getLaborItems().addAll((Collection<? extends LaborItem>)newValue);
				return;
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				getMaterialItems().clear();
				getMaterialItems().addAll((Collection<? extends MaterialItem>)newValue);
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
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				getEquipmentItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__USAGES:
				getUsages().clear();
				return;
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				getMiscCostItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__CREWS:
				getCrews().clear();
				return;
			case InfWorkPackage.WORK_TASK__WORK:
				setWork((Work)null);
				return;
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				setOverheadCost((OverheadCost)null);
				return;
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				return;
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				getContractorItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				getSwitchingSchedules().clear();
				return;
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				setWorkFlowStep((WorkFlowStep)null);
				return;
			case InfWorkPackage.WORK_TASK__PRIORITY:
				unsetPriority();
				return;
			case InfWorkPackage.WORK_TASK__DESIGN:
				setDesign((Design)null);
				return;
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				return;
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				getCapabilities().clear();
				return;
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				unsetSchedOverride();
				return;
			case InfWorkPackage.WORK_TASK__ASSETS:
				getAssets().clear();
				return;
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				getLaborItems().clear();
				return;
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				getMaterialItems().clear();
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
			case InfWorkPackage.WORK_TASK__EQUIPMENT_ITEMS:
				return equipmentItems != null && !equipmentItems.isEmpty();
			case InfWorkPackage.WORK_TASK__USAGES:
				return usages != null && !usages.isEmpty();
			case InfWorkPackage.WORK_TASK__MISC_COST_ITEMS:
				return miscCostItems != null && !miscCostItems.isEmpty();
			case InfWorkPackage.WORK_TASK__CREWS:
				return crews != null && !crews.isEmpty();
			case InfWorkPackage.WORK_TASK__WORK:
				return work != null;
			case InfWorkPackage.WORK_TASK__OVERHEAD_COST:
				return overheadCost != null;
			case InfWorkPackage.WORK_TASK__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
			case InfWorkPackage.WORK_TASK__CONTRACTOR_ITEMS:
				return contractorItems != null && !contractorItems.isEmpty();
			case InfWorkPackage.WORK_TASK__SWITCHING_SCHEDULES:
				return switchingSchedules != null && !switchingSchedules.isEmpty();
			case InfWorkPackage.WORK_TASK__WORK_FLOW_STEP:
				return workFlowStep != null;
			case InfWorkPackage.WORK_TASK__PRIORITY:
				return isSetPriority();
			case InfWorkPackage.WORK_TASK__DESIGN:
				return design != null;
			case InfWorkPackage.WORK_TASK__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
			case InfWorkPackage.WORK_TASK__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case InfWorkPackage.WORK_TASK__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfWorkPackage.WORK_TASK__SCHED_OVERRIDE:
				return isSetSchedOverride();
			case InfWorkPackage.WORK_TASK__ASSETS:
				return assets != null && !assets.isEmpty();
			case InfWorkPackage.WORK_TASK__LABOR_ITEMS:
				return laborItems != null && !laborItems.isEmpty();
			case InfWorkPackage.WORK_TASK__MATERIAL_ITEMS:
				return materialItems != null && !materialItems.isEmpty();
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
		result.append(" (priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", schedOverride: ");
		if (schedOverrideESet) result.append(schedOverride); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WorkTask
