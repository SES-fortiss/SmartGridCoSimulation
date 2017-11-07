/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.Specification;

import CIM15.IEC61970.Informative.InfCommon.Skill;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualification Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSkills <em>Skills</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems <em>CU Labor Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualificationRequirement extends IdentifiedObject {
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
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<Skill> skills;

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
	 * The default value of the '{@link #getQualificationID() <em>Qualification ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationID()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualificationID() <em>Qualification ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationID()
	 * @generated
	 * @ordered
	 */
	protected String qualificationID = QUALIFICATION_ID_EDEFAULT;

	/**
	 * This is true if the Qualification ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificationIDESet;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualificationRequirement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.QUALIFICATION_REQUIREMENT;
	}

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getQualificationRequirements
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new BasicInternalEList<WorkTask>(WorkTask.class);
		}
		return workTasks;
	}

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.Skill}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.Skill#getQualificationRequirements
	 * @generated
	 */
	public EList<Skill> getSkills() {
		if (skills == null) {
			skills = new BasicInternalEList<Skill>(Skill.class);
		}
		return skills;
	}

	/**
	 * Returns the value of the '<em><b>CU Labor Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CULaborItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Labor Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Labor Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements
	 * @generated
	 */
	public EList<CULaborItem> getCULaborItems() {
		if (cuLaborItems == null) {
			cuLaborItems = new BasicInternalEList<CULaborItem>(CULaborItem.class);
		}
		return cuLaborItems;
	}

	/**
	 * Returns the value of the '<em><b>Qualification ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification ID</em>' attribute.
	 * @see #isSetQualificationID()
	 * @see #unsetQualificationID()
	 * @see #setQualificationID(String)
	 * @generated
	 */
	public String getQualificationID() {
		return qualificationID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification ID</em>' attribute.
	 * @see #isSetQualificationID()
	 * @see #unsetQualificationID()
	 * @see #getQualificationID()
	 * @generated
	 */
	public void setQualificationID(String newQualificationID) {
		qualificationID = newQualificationID;
		qualificationIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificationID()
	 * @see #getQualificationID()
	 * @see #setQualificationID(String)
	 * @generated
	 */
	public void unsetQualificationID() {
		qualificationID = QUALIFICATION_ID_EDEFAULT;
		qualificationIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getQualificationID <em>Qualification ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualification ID</em>' attribute is set.
	 * @see #unsetQualificationID()
	 * @see #getQualificationID()
	 * @see #setQualificationID(String)
	 * @generated
	 */
	public boolean isSetQualificationID() {
		return qualificationIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Specification}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements <em>Qualification Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getQualificationRequirements
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new BasicInternalEList<Specification>(Specification.class);
		}
		return specifications;
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSkills()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCULaborItems()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifications()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return ((InternalEList<?>)getCULaborItems()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return getSkills();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return getCULaborItems();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				return getQualificationID();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return getSpecifications();
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
				getCULaborItems().addAll((Collection<? extends CULaborItem>)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				setQualificationID((String)newValue);
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				getSkills().clear();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				getCULaborItems().clear();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				unsetQualificationID();
				return;
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				getSpecifications().clear();
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
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SKILLS:
				return skills != null && !skills.isEmpty();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__CU_LABOR_ITEMS:
				return cuLaborItems != null && !cuLaborItems.isEmpty();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__QUALIFICATION_ID:
				return isSetQualificationID();
			case InfWorkPackage.QUALIFICATION_REQUIREMENT__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
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
		result.append(" (qualificationID: ");
		if (qualificationIDESet) result.append(qualificationID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // QualificationRequirement
