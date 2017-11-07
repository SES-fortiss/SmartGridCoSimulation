/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Work.Work;

import CIM15.IEC61970.Informative.InfWork.Project;
import CIM15.IEC61970.Informative.InfWork.WorkCostDetail;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Project Accounting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects <em>Projects</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getErpTimeEntries <em>Erp Time Entries</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getWorkCostDetails <em>Work Cost Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpProjectAccounting extends Document {
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
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The cached value of the '{@link #getErpTimeEntries() <em>Erp Time Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpTimeEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpTimeEntry> erpTimeEntries;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpProjectAccounting() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_PROJECT_ACCOUNTING;
	}

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM15.IEC61968.Work.Work#getErpProjectAccounting
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new BasicInternalEList<Work>(Work.class);
		}
		return works;
	}

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Project}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getErpProjectAccounting
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new BasicInternalEList<Project>(Project.class);
		}
		return projects;
	}

	/**
	 * Returns the value of the '<em><b>Erp Time Entries</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Time Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Time Entries</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpTimeEntry#getErpProjectAccounting
	 * @generated
	 */
	public EList<ErpTimeEntry> getErpTimeEntries() {
		if (erpTimeEntries == null) {
			erpTimeEntries = new BasicInternalEList<ErpTimeEntry>(ErpTimeEntry.class);
		}
		return erpTimeEntries;
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting <em>Erp Project Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getErpProjectAccounting
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new BasicInternalEList<WorkCostDetail>(WorkCostDetail.class);
		}
		return workCostDetails;
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpTimeEntries()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return ((InternalEList<?>)getErpTimeEntries()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return getWorks();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return getProjects();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return getErpTimeEntries();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return getWorkCostDetails();
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				getErpTimeEntries().clear();
				getErpTimeEntries().addAll((Collection<? extends ErpTimeEntry>)newValue);
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				getWorks().clear();
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				getProjects().clear();
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				getErpTimeEntries().clear();
				return;
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
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
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORKS:
				return works != null && !works.isEmpty();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS:
				return projects != null && !projects.isEmpty();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__ERP_TIME_ENTRIES:
				return erpTimeEntries != null && !erpTimeEntries.isEmpty();
			case InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ErpProjectAccounting
