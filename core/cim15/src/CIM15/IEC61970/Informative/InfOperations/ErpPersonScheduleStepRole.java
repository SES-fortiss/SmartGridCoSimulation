/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61970.Informative.InfCommon.Role;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Person Schedule Step Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpPersonScheduleStepRole extends Role {
	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * The cached value of the '{@link #getSwitchingStep() <em>Switching Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingStep()
	 * @generated
	 * @ordered
	 */
	protected SwitchingStep switchingStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPersonScheduleStepRole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.ERP_PERSON_SCHEDULE_STEP_ROLE;
	}

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles <em>Switching Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSwitchingStepRoles
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Switching Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Step</em>' reference.
	 * @see #setSwitchingStep(SwitchingStep)
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole
	 * @generated
	 */
	public SwitchingStep getSwitchingStep() {
		if (switchingStep != null && switchingStep.eIsProxy()) {
			InternalEObject oldSwitchingStep = (InternalEObject)switchingStep;
			switchingStep = (SwitchingStep)eResolveProxy(oldSwitchingStep);
			if (switchingStep != oldSwitchingStep) {
			}
		}
		return switchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStep basicGetSwitchingStep() {
		return switchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchingStep(SwitchingStep newSwitchingStep, NotificationChain msgs) {
		SwitchingStep oldSwitchingStep = switchingStep;
		switchingStep = newSwitchingStep;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switching Step</em>' reference.
	 * @see #getSwitchingStep()
	 * @generated
	 */
	public void setSwitchingStep(SwitchingStep newSwitchingStep) {
		if (newSwitchingStep != switchingStep) {
			NotificationChain msgs = null;
			if (switchingStep != null)
				msgs = ((InternalEObject)switchingStep).eInverseRemove(this, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, SwitchingStep.class, msgs);
			if (newSwitchingStep != null)
				msgs = ((InternalEObject)newSwitchingStep).eInverseAdd(this, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, SwitchingStep.class, msgs);
			msgs = basicSetSwitchingStep(newSwitchingStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				if (switchingStep != null)
					msgs = ((InternalEObject)switchingStep).eInverseRemove(this, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, SwitchingStep.class, msgs);
				return basicSetSwitchingStep((SwitchingStep)otherEnd, msgs);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				return basicSetSwitchingStep(null, msgs);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				if (resolve) return getSwitchingStep();
				return basicGetSwitchingStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				setSwitchingStep((SwitchingStep)newValue);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				setSwitchingStep((SwitchingStep)null);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				return erpPerson != null;
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				return switchingStep != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpPersonScheduleStepRole
