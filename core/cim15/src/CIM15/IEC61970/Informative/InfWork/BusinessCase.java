/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Work.Work;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getProjects <em>Projects</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessCase extends Document {
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
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessCase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.BUSINESS_CASE;
	}

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Project}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Project#getBusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Project#getBusinessCase
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new BasicInternalEList<Project>(Project.class);
		}
		return projects;
	}

	/**
	 * Returns the value of the '<em><b>Works</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Work.Work}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Work.Work#getBusinessCase <em>Business Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works</em>' reference list.
	 * @see CIM15.IEC61968.Work.Work#getBusinessCase
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new BasicInternalEList<Work>(Work.class);
		}
		return works;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.BusinessCase#getCorporateCode <em>Corporate Code</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfWorkPackage.BUSINESS_CASE__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.BUSINESS_CASE__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.BUSINESS_CASE__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.BUSINESS_CASE__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.BUSINESS_CASE__PROJECTS:
				return getProjects();
			case InfWorkPackage.BUSINESS_CASE__WORKS:
				return getWorks();
			case InfWorkPackage.BUSINESS_CASE__CORPORATE_CODE:
				return getCorporateCode();
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
			case InfWorkPackage.BUSINESS_CASE__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case InfWorkPackage.BUSINESS_CASE__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case InfWorkPackage.BUSINESS_CASE__CORPORATE_CODE:
				setCorporateCode((String)newValue);
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
			case InfWorkPackage.BUSINESS_CASE__PROJECTS:
				getProjects().clear();
				return;
			case InfWorkPackage.BUSINESS_CASE__WORKS:
				getWorks().clear();
				return;
			case InfWorkPackage.BUSINESS_CASE__CORPORATE_CODE:
				unsetCorporateCode();
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
			case InfWorkPackage.BUSINESS_CASE__PROJECTS:
				return projects != null && !projects.isEmpty();
			case InfWorkPackage.BUSINESS_CASE__WORKS:
				return works != null && !works.isEmpty();
			case InfWorkPackage.BUSINESS_CASE__CORPORATE_CODE:
				return isSetCorporateCode();
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
		result.append(" (corporateCode: ");
		if (corporateCodeESet) result.append(corporateCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BusinessCase
