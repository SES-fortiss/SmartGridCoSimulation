/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Domain.DateTimeInterval;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument <em>Safety Document</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval <em>Required Control Action Interval</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchingStep extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getSafetyDocument() <em>Safety Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyDocument()
	 * @generated
	 * @ordered
	 */
	protected SafetyDocument safetyDocument;

	/**
	 * The default value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusKind()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchingStepStatusKind STATUS_KIND_EDEFAULT = SwitchingStepStatusKind.INSTRUCTED;

	/**
	 * The cached value of the '{@link #getStatusKind() <em>Status Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusKind()
	 * @generated
	 * @ordered
	 */
	protected SwitchingStepStatusKind statusKind = STATUS_KIND_EDEFAULT;

	/**
	 * This is true if the Status Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusKindESet;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * This is true if the Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textESet;

	/**
	 * The cached value of the '{@link #getRequiredControlActionInterval() <em>Required Control Action Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlActionInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval requiredControlActionInterval;

	/**
	 * The default value of the '{@link #getRequiredControlAction() <em>Required Control Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlAction()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_CONTROL_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredControlAction() <em>Required Control Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredControlAction()
	 * @generated
	 * @ordered
	 */
	protected String requiredControlAction = REQUIRED_CONTROL_ACTION_EDEFAULT;

	/**
	 * This is true if the Required Control Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requiredControlActionESet;

	/**
	 * The cached value of the '{@link #getSwitchingSchedule() <em>Switching Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingSchedule()
	 * @generated
	 * @ordered
	 */
	protected SwitchingSchedule switchingSchedule;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * The cached value of the '{@link #getErpPersonRole() <em>Erp Person Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRole()
	 * @generated
	 * @ordered
	 */
	protected ErpPersonScheduleStepRole erpPersonRole;

	/**
	 * The default value of the '{@link #getDesiredEndState() <em>Desired End State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredEndState()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIRED_END_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredEndState() <em>Desired End State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredEndState()
	 * @generated
	 * @ordered
	 */
	protected String desiredEndState = DESIRED_END_STATE_EDEFAULT;

	/**
	 * This is true if the Desired End State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean desiredEndStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchingStep() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.SWITCHING_STEP;
	}

	/**
	 * Returns the value of the '<em><b>Safety Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Document</em>' reference.
	 * @see #setSafetyDocument(SafetyDocument)
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getScheduleSteps
	 * @generated
	 */
	public SafetyDocument getSafetyDocument() {
		if (safetyDocument != null && safetyDocument.eIsProxy()) {
			InternalEObject oldSafetyDocument = (InternalEObject)safetyDocument;
			safetyDocument = (SafetyDocument)eResolveProxy(oldSafetyDocument);
			if (safetyDocument != oldSafetyDocument) {
			}
		}
		return safetyDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyDocument basicGetSafetyDocument() {
		return safetyDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSafetyDocument(SafetyDocument newSafetyDocument, NotificationChain msgs) {
		SafetyDocument oldSafetyDocument = safetyDocument;
		safetyDocument = newSafetyDocument;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSafetyDocument <em>Safety Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Document</em>' reference.
	 * @see #getSafetyDocument()
	 * @generated
	 */
	public void setSafetyDocument(SafetyDocument newSafetyDocument) {
		if (newSafetyDocument != safetyDocument) {
			NotificationChain msgs = null;
			if (safetyDocument != null)
				msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS, SafetyDocument.class, msgs);
			if (newSafetyDocument != null)
				msgs = ((InternalEObject)newSafetyDocument).eInverseAdd(this, InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS, SafetyDocument.class, msgs);
			msgs = basicSetSafetyDocument(newSafetyDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Status Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @see #isSetStatusKind()
	 * @see #unsetStatusKind()
	 * @see #setStatusKind(SwitchingStepStatusKind)
	 * @generated
	 */
	public SwitchingStepStatusKind getStatusKind() {
		return statusKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStepStatusKind
	 * @see #isSetStatusKind()
	 * @see #unsetStatusKind()
	 * @see #getStatusKind()
	 * @generated
	 */
	public void setStatusKind(SwitchingStepStatusKind newStatusKind) {
		statusKind = newStatusKind == null ? STATUS_KIND_EDEFAULT : newStatusKind;
		statusKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatusKind()
	 * @see #getStatusKind()
	 * @see #setStatusKind(SwitchingStepStatusKind)
	 * @generated
	 */
	public void unsetStatusKind() {
		statusKind = STATUS_KIND_EDEFAULT;
		statusKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getStatusKind <em>Status Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status Kind</em>' attribute is set.
	 * @see #unsetStatusKind()
	 * @see #getStatusKind()
	 * @see #setStatusKind(SwitchingStepStatusKind)
	 * @generated
	 */
	public boolean isSetStatusKind() {
		return statusKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #setText(String)
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isSetText()
	 * @see #unsetText()
	 * @see #getText()
	 * @generated
	 */
	public void setText(String newText) {
		text = newText;
		textESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	public void unsetText() {
		text = TEXT_EDEFAULT;
		textESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getText <em>Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text</em>' attribute is set.
	 * @see #unsetText()
	 * @see #getText()
	 * @see #setText(String)
	 * @generated
	 */
	public boolean isSetText() {
		return textESet;
	}

	/**
	 * Returns the value of the '<em><b>Required Control Action Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Control Action Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Control Action Interval</em>' containment reference.
	 * @see #setRequiredControlActionInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getRequiredControlActionInterval() {
		return requiredControlActionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredControlActionInterval(DateTimeInterval newRequiredControlActionInterval, NotificationChain msgs) {
		DateTimeInterval oldRequiredControlActionInterval = requiredControlActionInterval;
		requiredControlActionInterval = newRequiredControlActionInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlActionInterval <em>Required Control Action Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Control Action Interval</em>' containment reference.
	 * @see #getRequiredControlActionInterval()
	 * @generated
	 */
	public void setRequiredControlActionInterval(DateTimeInterval newRequiredControlActionInterval) {
		if (newRequiredControlActionInterval != requiredControlActionInterval) {
			NotificationChain msgs = null;
			if (requiredControlActionInterval != null)
				msgs = ((InternalEObject)requiredControlActionInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL, null, msgs);
			if (newRequiredControlActionInterval != null)
				msgs = ((InternalEObject)newRequiredControlActionInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL, null, msgs);
			msgs = basicSetRequiredControlActionInterval(newRequiredControlActionInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Required Control Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Control Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Control Action</em>' attribute.
	 * @see #isSetRequiredControlAction()
	 * @see #unsetRequiredControlAction()
	 * @see #setRequiredControlAction(String)
	 * @generated
	 */
	public String getRequiredControlAction() {
		return requiredControlAction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Control Action</em>' attribute.
	 * @see #isSetRequiredControlAction()
	 * @see #unsetRequiredControlAction()
	 * @see #getRequiredControlAction()
	 * @generated
	 */
	public void setRequiredControlAction(String newRequiredControlAction) {
		requiredControlAction = newRequiredControlAction;
		requiredControlActionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequiredControlAction()
	 * @see #getRequiredControlAction()
	 * @see #setRequiredControlAction(String)
	 * @generated
	 */
	public void unsetRequiredControlAction() {
		requiredControlAction = REQUIRED_CONTROL_ACTION_EDEFAULT;
		requiredControlActionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getRequiredControlAction <em>Required Control Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Required Control Action</em>' attribute is set.
	 * @see #unsetRequiredControlAction()
	 * @see #getRequiredControlAction()
	 * @see #setRequiredControlAction(String)
	 * @generated
	 */
	public boolean isSetRequiredControlAction() {
		return requiredControlActionESet;
	}

	/**
	 * Returns the value of the '<em><b>Switching Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Schedule</em>' reference.
	 * @see #setSwitchingSchedule(SwitchingSchedule)
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingSchedule#getScheduleSteps
	 * @generated
	 */
	public SwitchingSchedule getSwitchingSchedule() {
		if (switchingSchedule != null && switchingSchedule.eIsProxy()) {
			InternalEObject oldSwitchingSchedule = (InternalEObject)switchingSchedule;
			switchingSchedule = (SwitchingSchedule)eResolveProxy(oldSwitchingSchedule);
			if (switchingSchedule != oldSwitchingSchedule) {
			}
		}
		return switchingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingSchedule basicGetSwitchingSchedule() {
		return switchingSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchingSchedule(SwitchingSchedule newSwitchingSchedule, NotificationChain msgs) {
		SwitchingSchedule oldSwitchingSchedule = switchingSchedule;
		switchingSchedule = newSwitchingSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getSwitchingSchedule <em>Switching Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switching Schedule</em>' reference.
	 * @see #getSwitchingSchedule()
	 * @generated
	 */
	public void setSwitchingSchedule(SwitchingSchedule newSwitchingSchedule) {
		if (newSwitchingSchedule != switchingSchedule) {
			NotificationChain msgs = null;
			if (switchingSchedule != null)
				msgs = ((InternalEObject)switchingSchedule).eInverseRemove(this, InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS, SwitchingSchedule.class, msgs);
			if (newSwitchingSchedule != null)
				msgs = ((InternalEObject)newSwitchingSchedule).eInverseAdd(this, InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS, SwitchingSchedule.class, msgs);
			msgs = basicSetSwitchingSchedule(newSwitchingSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getScheduleSteps <em>Schedule Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getScheduleSteps
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new BasicInternalEList<PowerSystemResource>(PowerSystemResource.class);
		}
		return powerSystemResources;
	}

	/**
	 * Returns the value of the '<em><b>Erp Person Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep <em>Switching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Role</em>' reference.
	 * @see #setErpPersonRole(ErpPersonScheduleStepRole)
	 * @see CIM15.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole#getSwitchingStep
	 * @generated
	 */
	public ErpPersonScheduleStepRole getErpPersonRole() {
		if (erpPersonRole != null && erpPersonRole.eIsProxy()) {
			InternalEObject oldErpPersonRole = (InternalEObject)erpPersonRole;
			erpPersonRole = (ErpPersonScheduleStepRole)eResolveProxy(oldErpPersonRole);
			if (erpPersonRole != oldErpPersonRole) {
			}
		}
		return erpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPersonScheduleStepRole basicGetErpPersonRole() {
		return erpPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPersonRole(ErpPersonScheduleStepRole newErpPersonRole, NotificationChain msgs) {
		ErpPersonScheduleStepRole oldErpPersonRole = erpPersonRole;
		erpPersonRole = newErpPersonRole;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getErpPersonRole <em>Erp Person Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person Role</em>' reference.
	 * @see #getErpPersonRole()
	 * @generated
	 */
	public void setErpPersonRole(ErpPersonScheduleStepRole newErpPersonRole) {
		if (newErpPersonRole != erpPersonRole) {
			NotificationChain msgs = null;
			if (erpPersonRole != null)
				msgs = ((InternalEObject)erpPersonRole).eInverseRemove(this, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, ErpPersonScheduleStepRole.class, msgs);
			if (newErpPersonRole != null)
				msgs = ((InternalEObject)newErpPersonRole).eInverseAdd(this, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, ErpPersonScheduleStepRole.class, msgs);
			msgs = basicSetErpPersonRole(newErpPersonRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Desired End State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired End State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired End State</em>' attribute.
	 * @see #isSetDesiredEndState()
	 * @see #unsetDesiredEndState()
	 * @see #setDesiredEndState(String)
	 * @generated
	 */
	public String getDesiredEndState() {
		return desiredEndState;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired End State</em>' attribute.
	 * @see #isSetDesiredEndState()
	 * @see #unsetDesiredEndState()
	 * @see #getDesiredEndState()
	 * @generated
	 */
	public void setDesiredEndState(String newDesiredEndState) {
		desiredEndState = newDesiredEndState;
		desiredEndStateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDesiredEndState()
	 * @see #getDesiredEndState()
	 * @see #setDesiredEndState(String)
	 * @generated
	 */
	public void unsetDesiredEndState() {
		desiredEndState = DESIRED_END_STATE_EDEFAULT;
		desiredEndStateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getDesiredEndState <em>Desired End State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Desired End State</em>' attribute is set.
	 * @see #unsetDesiredEndState()
	 * @see #getDesiredEndState()
	 * @see #setDesiredEndState(String)
	 * @generated
	 */
	public boolean isSetDesiredEndState() {
		return desiredEndStateESet;
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
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				if (safetyDocument != null)
					msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS, SafetyDocument.class, msgs);
				return basicSetSafetyDocument((SafetyDocument)otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				if (switchingSchedule != null)
					msgs = ((InternalEObject)switchingSchedule).eInverseRemove(this, InfOperationsPackage.SWITCHING_SCHEDULE__SCHEDULE_STEPS, SwitchingSchedule.class, msgs);
				return basicSetSwitchingSchedule((SwitchingSchedule)otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				if (erpPersonRole != null)
					msgs = ((InternalEObject)erpPersonRole).eInverseRemove(this, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, ErpPersonScheduleStepRole.class, msgs);
				return basicSetErpPersonRole((ErpPersonScheduleStepRole)otherEnd, msgs);
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
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				return basicSetSafetyDocument(null, msgs);
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				return basicSetRequiredControlActionInterval(null, msgs);
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				return basicSetSwitchingSchedule(null, msgs);
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				return basicSetErpPersonRole(null, msgs);
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
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				if (resolve) return getSafetyDocument();
				return basicGetSafetyDocument();
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				return getStatusKind();
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				return getText();
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				return getRequiredControlActionInterval();
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				return getRequiredControlAction();
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				if (resolve) return getSwitchingSchedule();
				return basicGetSwitchingSchedule();
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				if (resolve) return getErpPersonRole();
				return basicGetErpPersonRole();
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				return getDesiredEndState();
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
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				setStatusKind((SwitchingStepStatusKind)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				setText((String)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				setRequiredControlActionInterval((DateTimeInterval)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				setRequiredControlAction((String)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				setSwitchingSchedule((SwitchingSchedule)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				setErpPersonRole((ErpPersonScheduleStepRole)newValue);
				return;
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				setDesiredEndState((String)newValue);
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
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				unsetStatusKind();
				return;
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				unsetText();
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				setRequiredControlActionInterval((DateTimeInterval)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				unsetRequiredControlAction();
				return;
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				setSwitchingSchedule((SwitchingSchedule)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				setErpPersonRole((ErpPersonScheduleStepRole)null);
				return;
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				unsetDesiredEndState();
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
			case InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT:
				return safetyDocument != null;
			case InfOperationsPackage.SWITCHING_STEP__STATUS_KIND:
				return isSetStatusKind();
			case InfOperationsPackage.SWITCHING_STEP__TEXT:
				return isSetText();
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION_INTERVAL:
				return requiredControlActionInterval != null;
			case InfOperationsPackage.SWITCHING_STEP__REQUIRED_CONTROL_ACTION:
				return isSetRequiredControlAction();
			case InfOperationsPackage.SWITCHING_STEP__SWITCHING_SCHEDULE:
				return switchingSchedule != null;
			case InfOperationsPackage.SWITCHING_STEP__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE:
				return erpPersonRole != null;
			case InfOperationsPackage.SWITCHING_STEP__DESIRED_END_STATE:
				return isSetDesiredEndState();
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
		result.append(" (statusKind: ");
		if (statusKindESet) result.append(statusKind); else result.append("<unset>");
		result.append(", text: ");
		if (textESet) result.append(text); else result.append("<unset>");
		result.append(", requiredControlAction: ");
		if (requiredControlActionESet) result.append(requiredControlAction); else result.append("<unset>");
		result.append(", desiredEndState: ");
		if (desiredEndStateESet) result.append(desiredEndState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SwitchingStep
