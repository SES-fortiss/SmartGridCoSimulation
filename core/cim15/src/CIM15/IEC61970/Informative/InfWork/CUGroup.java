/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups <em>Parent CU Groups</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups <em>Child CU Groups</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs <em>Design Location CUs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CUGroup extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The cached value of the '{@link #getParentCUGroups() <em>Parent CU Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCUGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CUGroup> parentCUGroups;

	/**
	 * The cached value of the '{@link #getChildCUGroups() <em>Child CU Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCUGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CUGroup> childCUGroups;

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
	 * The cached value of the '{@link #getDesignLocationCUs() <em>Design Location CUs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocationCUs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocationCU> designLocationCUs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CUGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup <em>CU Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCUGroup
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
	}

	/**
	 * Returns the value of the '<em><b>Parent CU Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups <em>Child CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent CU Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent CU Groups</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getChildCUGroups
	 * @generated
	 */
	public EList<CUGroup> getParentCUGroups() {
		if (parentCUGroups == null) {
			parentCUGroups = new BasicInternalEList<CUGroup>(CUGroup.class);
		}
		return parentCUGroups;
	}

	/**
	 * Returns the value of the '<em><b>Child CU Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups <em>Parent CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child CU Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child CU Groups</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getParentCUGroups
	 * @generated
	 */
	public EList<CUGroup> getChildCUGroups() {
		if (childCUGroups == null) {
			childCUGroups = new BasicInternalEList<CUGroup>(CUGroup.class);
		}
		return childCUGroups;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_GROUP__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_GROUP__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Design Location CUs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups <em>CU Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location CUs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location CUs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups
	 * @generated
	 */
	public EList<DesignLocationCU> getDesignLocationCUs() {
		if (designLocationCUs == null) {
			designLocationCUs = new BasicInternalEList<DesignLocationCU>(DesignLocationCU.class);
		}
		return designLocationCUs;
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
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentCUGroups()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCUGroups()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocationCUs()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return ((InternalEList<?>)getParentCUGroups()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return ((InternalEList<?>)getChildCUGroups()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_GROUP__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return ((InternalEList<?>)getDesignLocationCUs()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return getParentCUGroups();
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return getChildCUGroups();
			case InfWorkPackage.CU_GROUP__STATUS:
				return getStatus();
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return getDesignLocationCUs();
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
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				getParentCUGroups().clear();
				getParentCUGroups().addAll((Collection<? extends CUGroup>)newValue);
				return;
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				getChildCUGroups().clear();
				getChildCUGroups().addAll((Collection<? extends CUGroup>)newValue);
				return;
			case InfWorkPackage.CU_GROUP__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
				getDesignLocationCUs().addAll((Collection<? extends DesignLocationCU>)newValue);
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
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				getParentCUGroups().clear();
				return;
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				getChildCUGroups().clear();
				return;
			case InfWorkPackage.CU_GROUP__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				getDesignLocationCUs().clear();
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
			case InfWorkPackage.CU_GROUP__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_GROUP__PARENT_CU_GROUPS:
				return parentCUGroups != null && !parentCUGroups.isEmpty();
			case InfWorkPackage.CU_GROUP__CHILD_CU_GROUPS:
				return childCUGroups != null && !childCUGroups.isEmpty();
			case InfWorkPackage.CU_GROUP__STATUS:
				return status != null;
			case InfWorkPackage.CU_GROUP__DESIGN_LOCATION_CUS:
				return designLocationCUs != null && !designLocationCUs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CUGroup
