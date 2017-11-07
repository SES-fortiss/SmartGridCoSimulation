/**
 */
package CIM15.IEC61968.Work;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.Customer;

import CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo;

import CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM15.IEC61970.Informative.InfWork.BusinessCase;
import CIM15.IEC61970.Informative.InfWork.Design;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.Project;
import CIM15.IEC61970.Informative.InfWork.Request;
import CIM15.IEC61970.Informative.InfWork.WorkCostDetail;
import CIM15.IEC61970.Informative.InfWork.WorkFlowStep;
import CIM15.IEC61970.Informative.InfWork.WorkTask;

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
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Work.Work#getDesigns <em>Designs</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getPriority <em>Priority</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getProject <em>Project</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getRequestDateTime <em>Request Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getWorkFlowSteps <em>Work Flow Steps</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getBusinessCase <em>Business Case</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getWorkBillingInfo <em>Work Billing Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getRequest <em>Request</em>}</li>
 *   <li>{@link CIM15.IEC61968.Work.Work#getCustomers <em>Customers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Work extends Document {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final WorkKind KIND_EDEFAULT = WorkKind.DISCONNECT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected WorkKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

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
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

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
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The default value of the '{@link #getRequestDateTime() <em>Request Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date REQUEST_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestDateTime() <em>Request Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date requestDateTime = REQUEST_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Request Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestDateTimeESet;

	/**
	 * The cached value of the '{@link #getWorkFlowSteps() <em>Work Flow Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkFlowSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkFlowStep> workFlowSteps;

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
	 * The cached value of the '{@link #getBusinessCase() <em>Business Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCase()
	 * @generated
	 * @ordered
	 */
	protected BusinessCase businessCase;

	/**
	 * The cached value of the '{@link #getWorkBillingInfo() <em>Work Billing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBillingInfo()
	 * @generated
	 * @ordered
	 */
	protected WorkBillingInfo workBillingInfo;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Work() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkPackage.Literals.WORK;
	}

	/**
	 * Returns the value of the '<em><b>Designs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Design}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Design#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getWork
	 * @generated
	 */
	public EList<Design> getDesigns() {
		if (designs == null) {
			designs = new BasicInternalEList<Design>(Design.class);
		}
		return designs;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61968.Work.WorkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Work.WorkKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(WorkKind)
	 * @generated
	 */
	public WorkKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61968.Work.WorkKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(WorkKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Work.Work#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(WorkKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Work.Work#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(WorkKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getPriority <em>Priority</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.Work.Work#getPriority <em>Priority</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.Work.Work#getPriority <em>Priority</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getWorks
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new BasicInternalEList<WorkCostDetail>(WorkCostDetail.class);
		}
		return workCostDetails;
	}

	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks
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
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
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
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Project#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getWorks
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, InfWorkPackage.PROJECT__WORKS, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, InfWorkPackage.PROJECT__WORKS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Request Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Date Time</em>' attribute.
	 * @see #isSetRequestDateTime()
	 * @see #unsetRequestDateTime()
	 * @see #setRequestDateTime(Date)
	 * @generated
	 */
	public Date getRequestDateTime() {
		return requestDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getRequestDateTime <em>Request Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Date Time</em>' attribute.
	 * @see #isSetRequestDateTime()
	 * @see #unsetRequestDateTime()
	 * @see #getRequestDateTime()
	 * @generated
	 */
	public void setRequestDateTime(Date newRequestDateTime) {
		requestDateTime = newRequestDateTime;
		requestDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Work.Work#getRequestDateTime <em>Request Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestDateTime()
	 * @see #getRequestDateTime()
	 * @see #setRequestDateTime(Date)
	 * @generated
	 */
	public void unsetRequestDateTime() {
		requestDateTime = REQUEST_DATE_TIME_EDEFAULT;
		requestDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Work.Work#getRequestDateTime <em>Request Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Request Date Time</em>' attribute is set.
	 * @see #unsetRequestDateTime()
	 * @see #getRequestDateTime()
	 * @see #setRequestDateTime(Date)
	 * @generated
	 */
	public boolean isSetRequestDateTime() {
		return requestDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Flow Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Flow Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Flow Steps</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkFlowStep#getWork
	 * @generated
	 */
	public EList<WorkFlowStep> getWorkFlowSteps() {
		if (workFlowSteps == null) {
			workFlowSteps = new BasicInternalEList<WorkFlowStep>(WorkFlowStep.class);
		}
		return workFlowSteps;
	}

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getWork
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new BasicInternalEList<WorkTask>(WorkTask.class);
		}
		return workTasks;
	}

	/**
	 * Returns the value of the '<em><b>Business Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Case</em>' reference.
	 * @see #setBusinessCase(BusinessCase)
	 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase#getWorks
	 * @generated
	 */
	public BusinessCase getBusinessCase() {
		if (businessCase != null && businessCase.eIsProxy()) {
			InternalEObject oldBusinessCase = (InternalEObject)businessCase;
			businessCase = (BusinessCase)eResolveProxy(oldBusinessCase);
			if (businessCase != oldBusinessCase) {
			}
		}
		return businessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCase basicGetBusinessCase() {
		return businessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessCase(BusinessCase newBusinessCase, NotificationChain msgs) {
		BusinessCase oldBusinessCase = businessCase;
		businessCase = newBusinessCase;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getBusinessCase <em>Business Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Case</em>' reference.
	 * @see #getBusinessCase()
	 * @generated
	 */
	public void setBusinessCase(BusinessCase newBusinessCase) {
		if (newBusinessCase != businessCase) {
			NotificationChain msgs = null;
			if (businessCase != null)
				msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__WORKS, BusinessCase.class, msgs);
			if (newBusinessCase != null)
				msgs = ((InternalEObject)newBusinessCase).eInverseAdd(this, InfWorkPackage.BUSINESS_CASE__WORKS, BusinessCase.class, msgs);
			msgs = basicSetBusinessCase(newBusinessCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Work Billing Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Billing Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Billing Info</em>' reference.
	 * @see #setWorkBillingInfo(WorkBillingInfo)
	 * @see CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getWorks
	 * @generated
	 */
	public WorkBillingInfo getWorkBillingInfo() {
		if (workBillingInfo != null && workBillingInfo.eIsProxy()) {
			InternalEObject oldWorkBillingInfo = (InternalEObject)workBillingInfo;
			workBillingInfo = (WorkBillingInfo)eResolveProxy(oldWorkBillingInfo);
			if (workBillingInfo != oldWorkBillingInfo) {
			}
		}
		return workBillingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkBillingInfo basicGetWorkBillingInfo() {
		return workBillingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkBillingInfo(WorkBillingInfo newWorkBillingInfo, NotificationChain msgs) {
		WorkBillingInfo oldWorkBillingInfo = workBillingInfo;
		workBillingInfo = newWorkBillingInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getWorkBillingInfo <em>Work Billing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Billing Info</em>' reference.
	 * @see #getWorkBillingInfo()
	 * @generated
	 */
	public void setWorkBillingInfo(WorkBillingInfo newWorkBillingInfo) {
		if (newWorkBillingInfo != workBillingInfo) {
			NotificationChain msgs = null;
			if (workBillingInfo != null)
				msgs = ((InternalEObject)workBillingInfo).eInverseRemove(this, InfCustomersPackage.WORK_BILLING_INFO__WORKS, WorkBillingInfo.class, msgs);
			if (newWorkBillingInfo != null)
				msgs = ((InternalEObject)newWorkBillingInfo).eInverseAdd(this, InfCustomersPackage.WORK_BILLING_INFO__WORKS, WorkBillingInfo.class, msgs);
			msgs = basicSetWorkBillingInfo(newWorkBillingInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Request#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Request)
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getWorks
	 * @generated
	 */
	public Request getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (Request)eResolveProxy(oldRequest);
			if (request != oldRequest) {
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		Request oldRequest = request;
		request = newRequest;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Work.Work#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__WORKS, Request.class, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, InfWorkPackage.REQUEST__WORKS, Request.class, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Customers.Customer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Customer#getWorks <em>Works</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @see CIM15.IEC61968.Customers.Customer#getWorks
	 * @generated
	 */
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new BasicInternalEList<Customer>(Customer.class);
		}
		return customers;
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
			case WorkPackage.WORK__DESIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigns()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
			case WorkPackage.WORK__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, InfWorkPackage.PROJECT__WORKS, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkFlowSteps()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case WorkPackage.WORK__BUSINESS_CASE:
				if (businessCase != null)
					msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__WORKS, BusinessCase.class, msgs);
				return basicSetBusinessCase((BusinessCase)otherEnd, msgs);
			case WorkPackage.WORK__WORK_BILLING_INFO:
				if (workBillingInfo != null)
					msgs = ((InternalEObject)workBillingInfo).eInverseRemove(this, InfCustomersPackage.WORK_BILLING_INFO__WORKS, WorkBillingInfo.class, msgs);
				return basicSetWorkBillingInfo((WorkBillingInfo)otherEnd, msgs);
			case WorkPackage.WORK__REQUEST:
				if (request != null)
					msgs = ((InternalEObject)request).eInverseRemove(this, InfWorkPackage.REQUEST__WORKS, Request.class, msgs);
				return basicSetRequest((Request)otherEnd, msgs);
			case WorkPackage.WORK__CUSTOMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomers()).basicAdd(otherEnd, msgs);
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
			case WorkPackage.WORK__DESIGNS:
				return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
			case WorkPackage.WORK__PROJECT:
				return basicSetProject(null, msgs);
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return ((InternalEList<?>)getWorkFlowSteps()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case WorkPackage.WORK__BUSINESS_CASE:
				return basicSetBusinessCase(null, msgs);
			case WorkPackage.WORK__WORK_BILLING_INFO:
				return basicSetWorkBillingInfo(null, msgs);
			case WorkPackage.WORK__REQUEST:
				return basicSetRequest(null, msgs);
			case WorkPackage.WORK__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
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
			case WorkPackage.WORK__DESIGNS:
				return getDesigns();
			case WorkPackage.WORK__KIND:
				return getKind();
			case WorkPackage.WORK__PRIORITY:
				return getPriority();
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
			case WorkPackage.WORK__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				return getRequestDateTime();
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return getWorkFlowSteps();
			case WorkPackage.WORK__WORK_TASKS:
				return getWorkTasks();
			case WorkPackage.WORK__BUSINESS_CASE:
				if (resolve) return getBusinessCase();
				return basicGetBusinessCase();
			case WorkPackage.WORK__WORK_BILLING_INFO:
				if (resolve) return getWorkBillingInfo();
				return basicGetWorkBillingInfo();
			case WorkPackage.WORK__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case WorkPackage.WORK__CUSTOMERS:
				return getCustomers();
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
			case WorkPackage.WORK__DESIGNS:
				getDesigns().clear();
				getDesigns().addAll((Collection<? extends Design>)newValue);
				return;
			case WorkPackage.WORK__KIND:
				setKind((WorkKind)newValue);
				return;
			case WorkPackage.WORK__PRIORITY:
				setPriority((String)newValue);
				return;
			case WorkPackage.WORK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
				return;
			case WorkPackage.WORK__PROJECT:
				setProject((Project)newValue);
				return;
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				setRequestDateTime((Date)newValue);
				return;
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				getWorkFlowSteps().clear();
				getWorkFlowSteps().addAll((Collection<? extends WorkFlowStep>)newValue);
				return;
			case WorkPackage.WORK__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case WorkPackage.WORK__BUSINESS_CASE:
				setBusinessCase((BusinessCase)newValue);
				return;
			case WorkPackage.WORK__WORK_BILLING_INFO:
				setWorkBillingInfo((WorkBillingInfo)newValue);
				return;
			case WorkPackage.WORK__REQUEST:
				setRequest((Request)newValue);
				return;
			case WorkPackage.WORK__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
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
			case WorkPackage.WORK__DESIGNS:
				getDesigns().clear();
				return;
			case WorkPackage.WORK__KIND:
				unsetKind();
				return;
			case WorkPackage.WORK__PRIORITY:
				unsetPriority();
				return;
			case WorkPackage.WORK__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
				return;
			case WorkPackage.WORK__PROJECT:
				setProject((Project)null);
				return;
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				unsetRequestDateTime();
				return;
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				getWorkFlowSteps().clear();
				return;
			case WorkPackage.WORK__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case WorkPackage.WORK__BUSINESS_CASE:
				setBusinessCase((BusinessCase)null);
				return;
			case WorkPackage.WORK__WORK_BILLING_INFO:
				setWorkBillingInfo((WorkBillingInfo)null);
				return;
			case WorkPackage.WORK__REQUEST:
				setRequest((Request)null);
				return;
			case WorkPackage.WORK__CUSTOMERS:
				getCustomers().clear();
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
			case WorkPackage.WORK__DESIGNS:
				return designs != null && !designs.isEmpty();
			case WorkPackage.WORK__KIND:
				return isSetKind();
			case WorkPackage.WORK__PRIORITY:
				return isSetPriority();
			case WorkPackage.WORK__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case WorkPackage.WORK__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
			case WorkPackage.WORK__PROJECT:
				return project != null;
			case WorkPackage.WORK__REQUEST_DATE_TIME:
				return isSetRequestDateTime();
			case WorkPackage.WORK__WORK_FLOW_STEPS:
				return workFlowSteps != null && !workFlowSteps.isEmpty();
			case WorkPackage.WORK__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case WorkPackage.WORK__BUSINESS_CASE:
				return businessCase != null;
			case WorkPackage.WORK__WORK_BILLING_INFO:
				return workBillingInfo != null;
			case WorkPackage.WORK__REQUEST:
				return request != null;
			case WorkPackage.WORK__CUSTOMERS:
				return customers != null && !customers.isEmpty();
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
		result.append(" (kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", requestDateTime: ");
		if (requestDateTimeESet) result.append(requestDateTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Work
