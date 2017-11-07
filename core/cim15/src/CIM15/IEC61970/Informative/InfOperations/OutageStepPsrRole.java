/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Core.CorePackage;

import CIM15.IEC61970.Informative.InfCommon.Role;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Step Psr Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageStepPsrRole extends Role {
	/**
	 * The cached value of the '{@link #getOutageStep() <em>Outage Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageStep()
	 * @generated
	 * @ordered
	 */
	protected OutageStep outageStep;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageStepPsrRole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_STEP_PSR_ROLE;
	}

	/**
	 * Returns the value of the '<em><b>Outage Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles <em>Conducting Equipment Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Step</em>' reference.
	 * @see #setOutageStep(OutageStep)
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles
	 * @generated
	 */
	public OutageStep getOutageStep() {
		if (outageStep != null && outageStep.eIsProxy()) {
			InternalEObject oldOutageStep = (InternalEObject)outageStep;
			outageStep = (OutageStep)eResolveProxy(oldOutageStep);
			if (outageStep != oldOutageStep) {
			}
		}
		return outageStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageStep basicGetOutageStep() {
		return outageStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageStep(OutageStep newOutageStep, NotificationChain msgs) {
		OutageStep oldOutageStep = outageStep;
		outageStep = newOutageStep;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Step</em>' reference.
	 * @see #getOutageStep()
	 * @generated
	 */
	public void setOutageStep(OutageStep newOutageStep) {
		if (newOutageStep != outageStep) {
			NotificationChain msgs = null;
			if (outageStep != null)
				msgs = ((InternalEObject)outageStep).eInverseRemove(this, InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES, OutageStep.class, msgs);
			if (newOutageStep != null)
				msgs = ((InternalEObject)newOutageStep).eInverseAdd(this, InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES, OutageStep.class, msgs);
			msgs = basicSetOutageStep(newOutageStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConductingEquipment#getOutageStepRoles <em>Outage Step Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getOutageStepRoles
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				if (outageStep != null)
					msgs = ((InternalEObject)outageStep).eInverseRemove(this, InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES, OutageStep.class, msgs);
				return basicSetOutageStep((OutageStep)otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				return basicSetOutageStep(null, msgs);
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				if (resolve) return getOutageStep();
				return basicGetOutageStep();
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				setOutageStep((OutageStep)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				setOutageStep((OutageStep)null);
				return;
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				return outageStep != null;
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
		}
		return super.eIsSet(featureID);
	}

} // OutageStepPsrRole
