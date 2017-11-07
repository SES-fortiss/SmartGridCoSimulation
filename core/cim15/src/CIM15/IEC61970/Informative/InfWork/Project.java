/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Work.Work;

import CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting;
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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Project#getSubProjects <em>Sub Projects</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Project#getRequests <em>Requests</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Project#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Project extends Document {
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
	 * The default value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected static final float BUDGET_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBudget() <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudget()
	 * @generated
	 * @ordered
	 */
	protected float budget = BUDGET_EDEFAULT;

	/**
	 * This is true if the Budget attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean budgetESet;

	/**
	 * The cached value of the '{@link #getSubProjects() <em>Sub Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> subProjects;

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
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

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
	 * The cached value of the '{@link #getParentProject() <em>Parent Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProject()
	 * @generated
	 * @ordered
	 */
	protected Project parentProject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Project() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.PROJECT;
	}

	/**
	 * Returns the value of the '<em><b>Business Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Case</em>' reference.
	 * @see #setBusinessCase(BusinessCase)
	 * @see CIM15.IEC61970.Informative.InfWork.BusinessCase#getProjects
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}' reference.
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
				msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__PROJECTS, BusinessCase.class, msgs);
			if (newBusinessCase != null)
				msgs = ((InternalEObject)newBusinessCase).eInverseAdd(this, InfWorkPackage.BUSINESS_CASE__PROJECTS, BusinessCase.class, msgs);
			msgs = basicSetBusinessCase(newBusinessCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget</em>' attribute.
	 * @see #isSetBudget()
	 * @see #unsetBudget()
	 * @see #setBudget(float)
	 * @generated
	 */
	public float getBudget() {
		return budget;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' attribute.
	 * @see #isSetBudget()
	 * @see #unsetBudget()
	 * @see #getBudget()
	 * @generated
	 */
	public void setBudget(float newBudget) {
		budget = newBudget;
		budgetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBudget()
	 * @see #getBudget()
	 * @see #setBudget(float)
	 * @generated
	 */
	public void unsetBudget() {
		budget = BUDGET_EDEFAULT;
		budgetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Project#getBudget <em>Budget</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Budget</em>' attribute is set.
	 * @see #unsetBudget()
	 * @see #getBudget()
	 * @see #setBudget(float)
	 * @generated
	 */
	public boolean isSetBudget() {
		return budgetESet;
	}

	/**
	 * Returns the value of the '<em><b>Sub Projects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Project}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Projects</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getParentProject
	 * @generated
	 */
	public EList<Project> getSubProjects() {
		if (subProjects == null) {
			subProjects = new BasicInternalEList<Project>(Project.class);
		}
		return subProjects;
	}

	/**
	 * Returns the value of the '<em><b>Erp Project Accounting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Project Accounting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Project Accounting</em>' reference.
	 * @see #setErpProjectAccounting(ErpProjectAccounting)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpProjectAccounting#getProjects
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Project#getErpProjectAccounting <em>Erp Project Accounting</em>}' reference.
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
				msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS, ErpProjectAccounting.class, msgs);
			if (newErpProjectAccounting != null)
				msgs = ((InternalEObject)newErpProjectAccounting).eInverseAdd(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS, ErpProjectAccounting.class, msgs);
			msgs = basicSetErpProjectAccounting(newErpProjectAccounting, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Request}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Request#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Request#getProjects
	 * @generated
	 */
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new BasicInternalEList<Request>(Request.class);
		}
		return requests;
	}

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM15.IEC61968.Work.Work#getProject
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new BasicInternalEList<Work>(Work.class);
		}
		return works;
	}

	/**
	 * Returns the value of the '<em><b>Parent Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Project#getSubProjects <em>Sub Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Project</em>' reference.
	 * @see #setParentProject(Project)
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getSubProjects
	 * @generated
	 */
	public Project getParentProject() {
		if (parentProject != null && parentProject.eIsProxy()) {
			InternalEObject oldParentProject = (InternalEObject)parentProject;
			parentProject = (Project)eResolveProxy(oldParentProject);
			if (parentProject != oldParentProject) {
			}
		}
		return parentProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetParentProject() {
		return parentProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentProject(Project newParentProject, NotificationChain msgs) {
		Project oldParentProject = parentProject;
		parentProject = newParentProject;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Project#getParentProject <em>Parent Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Project</em>' reference.
	 * @see #getParentProject()
	 * @generated
	 */
	public void setParentProject(Project newParentProject) {
		if (newParentProject != parentProject) {
			NotificationChain msgs = null;
			if (parentProject != null)
				msgs = ((InternalEObject)parentProject).eInverseRemove(this, InfWorkPackage.PROJECT__SUB_PROJECTS, Project.class, msgs);
			if (newParentProject != null)
				msgs = ((InternalEObject)newParentProject).eInverseAdd(this, InfWorkPackage.PROJECT__SUB_PROJECTS, Project.class, msgs);
			msgs = basicSetParentProject(newParentProject, msgs);
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
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				if (businessCase != null)
					msgs = ((InternalEObject)businessCase).eInverseRemove(this, InfWorkPackage.BUSINESS_CASE__PROJECTS, BusinessCase.class, msgs);
				return basicSetBusinessCase((BusinessCase)otherEnd, msgs);
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubProjects()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				if (erpProjectAccounting != null)
					msgs = ((InternalEObject)erpProjectAccounting).eInverseRemove(this, InfERPSupportPackage.ERP_PROJECT_ACCOUNTING__PROJECTS, ErpProjectAccounting.class, msgs);
				return basicSetErpProjectAccounting((ErpProjectAccounting)otherEnd, msgs);
			case InfWorkPackage.PROJECT__REQUESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequests()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROJECT__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				if (parentProject != null)
					msgs = ((InternalEObject)parentProject).eInverseRemove(this, InfWorkPackage.PROJECT__SUB_PROJECTS, Project.class, msgs);
				return basicSetParentProject((Project)otherEnd, msgs);
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
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				return basicSetBusinessCase(null, msgs);
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return ((InternalEList<?>)getSubProjects()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				return basicSetErpProjectAccounting(null, msgs);
			case InfWorkPackage.PROJECT__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROJECT__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				return basicSetParentProject(null, msgs);
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
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				if (resolve) return getBusinessCase();
				return basicGetBusinessCase();
			case InfWorkPackage.PROJECT__BUDGET:
				return getBudget();
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return getSubProjects();
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				if (resolve) return getErpProjectAccounting();
				return basicGetErpProjectAccounting();
			case InfWorkPackage.PROJECT__REQUESTS:
				return getRequests();
			case InfWorkPackage.PROJECT__WORKS:
				return getWorks();
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				if (resolve) return getParentProject();
				return basicGetParentProject();
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
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				setBusinessCase((BusinessCase)newValue);
				return;
			case InfWorkPackage.PROJECT__BUDGET:
				setBudget((Float)newValue);
				return;
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				getSubProjects().clear();
				getSubProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)newValue);
				return;
			case InfWorkPackage.PROJECT__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case InfWorkPackage.PROJECT__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				setParentProject((Project)newValue);
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
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				setBusinessCase((BusinessCase)null);
				return;
			case InfWorkPackage.PROJECT__BUDGET:
				unsetBudget();
				return;
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				getSubProjects().clear();
				return;
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				setErpProjectAccounting((ErpProjectAccounting)null);
				return;
			case InfWorkPackage.PROJECT__REQUESTS:
				getRequests().clear();
				return;
			case InfWorkPackage.PROJECT__WORKS:
				getWorks().clear();
				return;
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				setParentProject((Project)null);
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
			case InfWorkPackage.PROJECT__BUSINESS_CASE:
				return businessCase != null;
			case InfWorkPackage.PROJECT__BUDGET:
				return isSetBudget();
			case InfWorkPackage.PROJECT__SUB_PROJECTS:
				return subProjects != null && !subProjects.isEmpty();
			case InfWorkPackage.PROJECT__ERP_PROJECT_ACCOUNTING:
				return erpProjectAccounting != null;
			case InfWorkPackage.PROJECT__REQUESTS:
				return requests != null && !requests.isEmpty();
			case InfWorkPackage.PROJECT__WORKS:
				return works != null && !works.isEmpty();
			case InfWorkPackage.PROJECT__PARENT_PROJECT:
				return parentProject != null;
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
		result.append(" (budget: ");
		if (budgetESet) result.append(budget); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Project
