/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole;

import CIM15.IEC61970.Outage.ClearanceTag;

import CIM15.IEC61970.Protection.ProtectionEquipment;

import CIM15.IEC61970.StateVariables.StateVariablesPackage;
import CIM15.IEC61970.StateVariables.SvStatus;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConductingEquipment#getClearanceTags <em>Clearance Tags</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConductingEquipment#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConductingEquipment#getOutageStepRoles <em>Outage Step Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ConductingEquipment#getSvStatus <em>Sv Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConductingEquipment extends Equipment {
	/**
	 * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVoltage()
	 * @generated
	 * @ordered
	 */
	protected BaseVoltage baseVoltage;

	/**
	 * The cached value of the '{@link #getClearanceTags() <em>Clearance Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearanceTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ClearanceTag> clearanceTags;

	/**
	 * The cached value of the '{@link #getProtectionEquipments() <em>Protection Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionEquipment> protectionEquipments;

	/**
	 * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminals;

	/**
	 * The cached value of the '{@link #getOutageStepRoles() <em>Outage Step Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageStepRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStepPsrRole> outageStepRoles;

	/**
	 * The cached value of the '{@link #getSvStatus() <em>Sv Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvStatus()
	 * @generated
	 * @ordered
	 */
	protected SvStatus svStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductingEquipment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONDUCTING_EQUIPMENT;
	}

	/**
	 * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Voltage</em>' reference.
	 * @see #setBaseVoltage(BaseVoltage)
	 * @see CIM15.IEC61970.Core.BaseVoltage#getConductingEquipment
	 * @generated
	 */
	public BaseVoltage getBaseVoltage() {
		if (baseVoltage != null && baseVoltage.eIsProxy()) {
			InternalEObject oldBaseVoltage = (InternalEObject)baseVoltage;
			baseVoltage = (BaseVoltage)eResolveProxy(oldBaseVoltage);
			if (baseVoltage != oldBaseVoltage) {
			}
		}
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage basicGetBaseVoltage() {
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseVoltage(BaseVoltage newBaseVoltage, NotificationChain msgs) {
		BaseVoltage oldBaseVoltage = baseVoltage;
		baseVoltage = newBaseVoltage;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Voltage</em>' reference.
	 * @see #getBaseVoltage()
	 * @generated
	 */
	public void setBaseVoltage(BaseVoltage newBaseVoltage) {
		if (newBaseVoltage != baseVoltage) {
			NotificationChain msgs = null;
			if (baseVoltage != null)
				msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
			if (newBaseVoltage != null)
				msgs = ((InternalEObject)newBaseVoltage).eInverseAdd(this, CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
			msgs = basicSetBaseVoltage(newBaseVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Clearance Tags</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Outage.ClearanceTag}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.ClearanceTag#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearance Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearance Tags</em>' reference list.
	 * @see CIM15.IEC61970.Outage.ClearanceTag#getConductingEquipment
	 * @generated
	 */
	public EList<ClearanceTag> getClearanceTags() {
		if (clearanceTags == null) {
			clearanceTags = new BasicInternalEList<ClearanceTag>(ClearanceTag.class);
		}
		return clearanceTags;
	}

	/**
	 * Returns the value of the '<em><b>Protection Equipments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Protection.ProtectionEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Protection.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Equipments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Equipments</em>' reference list.
	 * @see CIM15.IEC61970.Protection.ProtectionEquipment#getConductingEquipments
	 * @generated
	 */
	public EList<ProtectionEquipment> getProtectionEquipments() {
		if (protectionEquipments == null) {
			protectionEquipments = new BasicInternalEList<ProtectionEquipment>(ProtectionEquipment.class);
		}
		return protectionEquipments;
	}

	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Terminal}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see CIM15.IEC61970.Core.Terminal#getConductingEquipment
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		if (terminals == null) {
			terminals = new BasicInternalEList<Terminal>(Terminal.class);
		}
		return terminals;
	}

	/**
	 * Returns the value of the '<em><b>Outage Step Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Step Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Step Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getConductingEquipment
	 * @generated
	 */
	public EList<OutageStepPsrRole> getOutageStepRoles() {
		if (outageStepRoles == null) {
			outageStepRoles = new BasicInternalEList<OutageStepPsrRole>(OutageStepPsrRole.class);
		}
		return outageStepRoles;
	}

	/**
	 * Returns the value of the '<em><b>Sv Status</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.StateVariables.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Status</em>' reference.
	 * @see #setSvStatus(SvStatus)
	 * @see CIM15.IEC61970.StateVariables.SvStatus#getConductingEquipment
	 * @generated
	 */
	public SvStatus getSvStatus() {
		if (svStatus != null && svStatus.eIsProxy()) {
			InternalEObject oldSvStatus = (InternalEObject)svStatus;
			svStatus = (SvStatus)eResolveProxy(oldSvStatus);
			if (svStatus != oldSvStatus) {
			}
		}
		return svStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvStatus basicGetSvStatus() {
		return svStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvStatus(SvStatus newSvStatus, NotificationChain msgs) {
		SvStatus oldSvStatus = svStatus;
		svStatus = newSvStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.ConductingEquipment#getSvStatus <em>Sv Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Status</em>' reference.
	 * @see #getSvStatus()
	 * @generated
	 */
	public void setSvStatus(SvStatus newSvStatus) {
		if (newSvStatus != svStatus) {
			NotificationChain msgs = null;
			if (svStatus != null)
				msgs = ((InternalEObject)svStatus).eInverseRemove(this, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs);
			if (newSvStatus != null)
				msgs = ((InternalEObject)newSvStatus).eInverseAdd(this, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs);
			msgs = basicSetSvStatus(newSvStatus, msgs);
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
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				if (baseVoltage != null)
					msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
				return basicSetBaseVoltage((BaseVoltage)otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClearanceTags()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtectionEquipments()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminals()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageStepRoles()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				if (svStatus != null)
					msgs = ((InternalEObject)svStatus).eInverseRemove(this, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs);
				return basicSetSvStatus((SvStatus)otherEnd, msgs);
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
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				return basicSetBaseVoltage(null, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return ((InternalEList<?>)getClearanceTags()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return ((InternalEList<?>)getProtectionEquipments()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return ((InternalEList<?>)getTerminals()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return ((InternalEList<?>)getOutageStepRoles()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				return basicSetSvStatus(null, msgs);
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
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				if (resolve) return getBaseVoltage();
				return basicGetBaseVoltage();
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return getClearanceTags();
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return getProtectionEquipments();
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return getTerminals();
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return getOutageStepRoles();
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				if (resolve) return getSvStatus();
				return basicGetSvStatus();
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
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				getClearanceTags().clear();
				getClearanceTags().addAll((Collection<? extends ClearanceTag>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				getProtectionEquipments().clear();
				getProtectionEquipments().addAll((Collection<? extends ProtectionEquipment>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				getTerminals().clear();
				getTerminals().addAll((Collection<? extends Terminal>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				getOutageStepRoles().clear();
				getOutageStepRoles().addAll((Collection<? extends OutageStepPsrRole>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				setSvStatus((SvStatus)newValue);
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
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)null);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				getClearanceTags().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				getProtectionEquipments().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				getTerminals().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				getOutageStepRoles().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				setSvStatus((SvStatus)null);
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
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				return baseVoltage != null;
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return clearanceTags != null && !clearanceTags.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return protectionEquipments != null && !protectionEquipments.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return terminals != null && !terminals.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return outageStepRoles != null && !outageStepRoles.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				return svStatus != null;
		}
		return super.eIsSet(featureID);
	}

} // ConductingEquipment
