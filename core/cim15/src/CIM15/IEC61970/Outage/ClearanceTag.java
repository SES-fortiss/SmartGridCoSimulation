/**
 */
package CIM15.IEC61970.Outage;

import CIM15.IEC61970.Core.ConductingEquipment;
import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM15.IEC61970.Informative.InfOperations.SafetyDocument;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clearance Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkStartTime <em>Work Start Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getAuthorityName <em>Authority Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getTagIssueTime <em>Tag Issue Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#isGroundReqFlag <em>Ground Req Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkDescription <em>Work Description</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getSafetyDocument <em>Safety Document</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getClearanceTagType <em>Clearance Tag Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkEndTime <em>Work End Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClearanceTag extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getWorkStartTime() <em>Work Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date WORK_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkStartTime() <em>Work Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date workStartTime = WORK_START_TIME_EDEFAULT;

	/**
	 * This is true if the Work Start Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workStartTimeESet;

	/**
	 * The default value of the '{@link #isPhaseCheckReqFlag() <em>Phase Check Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhaseCheckReqFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PHASE_CHECK_REQ_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPhaseCheckReqFlag() <em>Phase Check Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPhaseCheckReqFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCheckReqFlag = PHASE_CHECK_REQ_FLAG_EDEFAULT;

	/**
	 * This is true if the Phase Check Req Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCheckReqFlagESet;

	/**
	 * The default value of the '{@link #isDeenergizeReqFlag() <em>Deenergize Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeenergizeReqFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEENERGIZE_REQ_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeenergizeReqFlag() <em>Deenergize Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeenergizeReqFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean deenergizeReqFlag = DEENERGIZE_REQ_FLAG_EDEFAULT;

	/**
	 * This is true if the Deenergize Req Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deenergizeReqFlagESet;

	/**
	 * The default value of the '{@link #getAuthorityName() <em>Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorityName() <em>Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected String authorityName = AUTHORITY_NAME_EDEFAULT;

	/**
	 * This is true if the Authority Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean authorityNameESet;

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
	 * The default value of the '{@link #getTagIssueTime() <em>Tag Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagIssueTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TAG_ISSUE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagIssueTime() <em>Tag Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagIssueTime()
	 * @generated
	 * @ordered
	 */
	protected Date tagIssueTime = TAG_ISSUE_TIME_EDEFAULT;

	/**
	 * This is true if the Tag Issue Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagIssueTimeESet;

	/**
	 * The default value of the '{@link #isGroundReqFlag() <em>Ground Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundReqFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUND_REQ_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroundReqFlag() <em>Ground Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundReqFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean groundReqFlag = GROUND_REQ_FLAG_EDEFAULT;

	/**
	 * This is true if the Ground Req Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundReqFlagESet;

	/**
	 * The default value of the '{@link #getWorkDescription() <em>Work Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkDescription() <em>Work Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkDescription()
	 * @generated
	 * @ordered
	 */
	protected String workDescription = WORK_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Work Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workDescriptionESet;

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
	 * The cached value of the '{@link #getClearanceTagType() <em>Clearance Tag Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearanceTagType()
	 * @generated
	 * @ordered
	 */
	protected ClearanceTagType clearanceTagType;

	/**
	 * The default value of the '{@link #getWorkEndTime() <em>Work End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date WORK_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEndTime() <em>Work End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date workEndTime = WORK_END_TIME_EDEFAULT;

	/**
	 * This is true if the Work End Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workEndTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearanceTag() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.CLEARANCE_TAG;
	}

	/**
	 * Returns the value of the '<em><b>Work Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Start Time</em>' attribute.
	 * @see #isSetWorkStartTime()
	 * @see #unsetWorkStartTime()
	 * @see #setWorkStartTime(Date)
	 * @generated
	 */
	public Date getWorkStartTime() {
		return workStartTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkStartTime <em>Work Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Start Time</em>' attribute.
	 * @see #isSetWorkStartTime()
	 * @see #unsetWorkStartTime()
	 * @see #getWorkStartTime()
	 * @generated
	 */
	public void setWorkStartTime(Date newWorkStartTime) {
		workStartTime = newWorkStartTime;
		workStartTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkStartTime <em>Work Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkStartTime()
	 * @see #getWorkStartTime()
	 * @see #setWorkStartTime(Date)
	 * @generated
	 */
	public void unsetWorkStartTime() {
		workStartTime = WORK_START_TIME_EDEFAULT;
		workStartTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkStartTime <em>Work Start Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Start Time</em>' attribute is set.
	 * @see #unsetWorkStartTime()
	 * @see #getWorkStartTime()
	 * @see #setWorkStartTime(Date)
	 * @generated
	 */
	public boolean isSetWorkStartTime() {
		return workStartTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Check Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Check Req Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Check Req Flag</em>' attribute.
	 * @see #isSetPhaseCheckReqFlag()
	 * @see #unsetPhaseCheckReqFlag()
	 * @see #setPhaseCheckReqFlag(boolean)
	 * @generated
	 */
	public boolean isPhaseCheckReqFlag() {
		return phaseCheckReqFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Check Req Flag</em>' attribute.
	 * @see #isSetPhaseCheckReqFlag()
	 * @see #unsetPhaseCheckReqFlag()
	 * @see #isPhaseCheckReqFlag()
	 * @generated
	 */
	public void setPhaseCheckReqFlag(boolean newPhaseCheckReqFlag) {
		phaseCheckReqFlag = newPhaseCheckReqFlag;
		phaseCheckReqFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCheckReqFlag()
	 * @see #isPhaseCheckReqFlag()
	 * @see #setPhaseCheckReqFlag(boolean)
	 * @generated
	 */
	public void unsetPhaseCheckReqFlag() {
		phaseCheckReqFlag = PHASE_CHECK_REQ_FLAG_EDEFAULT;
		phaseCheckReqFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isPhaseCheckReqFlag <em>Phase Check Req Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Check Req Flag</em>' attribute is set.
	 * @see #unsetPhaseCheckReqFlag()
	 * @see #isPhaseCheckReqFlag()
	 * @see #setPhaseCheckReqFlag(boolean)
	 * @generated
	 */
	public boolean isSetPhaseCheckReqFlag() {
		return phaseCheckReqFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Deenergize Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deenergize Req Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deenergize Req Flag</em>' attribute.
	 * @see #isSetDeenergizeReqFlag()
	 * @see #unsetDeenergizeReqFlag()
	 * @see #setDeenergizeReqFlag(boolean)
	 * @generated
	 */
	public boolean isDeenergizeReqFlag() {
		return deenergizeReqFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deenergize Req Flag</em>' attribute.
	 * @see #isSetDeenergizeReqFlag()
	 * @see #unsetDeenergizeReqFlag()
	 * @see #isDeenergizeReqFlag()
	 * @generated
	 */
	public void setDeenergizeReqFlag(boolean newDeenergizeReqFlag) {
		deenergizeReqFlag = newDeenergizeReqFlag;
		deenergizeReqFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeenergizeReqFlag()
	 * @see #isDeenergizeReqFlag()
	 * @see #setDeenergizeReqFlag(boolean)
	 * @generated
	 */
	public void unsetDeenergizeReqFlag() {
		deenergizeReqFlag = DEENERGIZE_REQ_FLAG_EDEFAULT;
		deenergizeReqFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isDeenergizeReqFlag <em>Deenergize Req Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deenergize Req Flag</em>' attribute is set.
	 * @see #unsetDeenergizeReqFlag()
	 * @see #isDeenergizeReqFlag()
	 * @see #setDeenergizeReqFlag(boolean)
	 * @generated
	 */
	public boolean isSetDeenergizeReqFlag() {
		return deenergizeReqFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Authority Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority Name</em>' attribute.
	 * @see #isSetAuthorityName()
	 * @see #unsetAuthorityName()
	 * @see #setAuthorityName(String)
	 * @generated
	 */
	public String getAuthorityName() {
		return authorityName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getAuthorityName <em>Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority Name</em>' attribute.
	 * @see #isSetAuthorityName()
	 * @see #unsetAuthorityName()
	 * @see #getAuthorityName()
	 * @generated
	 */
	public void setAuthorityName(String newAuthorityName) {
		authorityName = newAuthorityName;
		authorityNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getAuthorityName <em>Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuthorityName()
	 * @see #getAuthorityName()
	 * @see #setAuthorityName(String)
	 * @generated
	 */
	public void unsetAuthorityName() {
		authorityName = AUTHORITY_NAME_EDEFAULT;
		authorityNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getAuthorityName <em>Authority Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Authority Name</em>' attribute is set.
	 * @see #unsetAuthorityName()
	 * @see #getAuthorityName()
	 * @see #setAuthorityName(String)
	 * @generated
	 */
	public boolean isSetAuthorityName() {
		return authorityNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConductingEquipment#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getClearanceTags
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
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getConductingEquipment <em>Conducting Equipment</em>}' reference.
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
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Tag Issue Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Issue Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Issue Time</em>' attribute.
	 * @see #isSetTagIssueTime()
	 * @see #unsetTagIssueTime()
	 * @see #setTagIssueTime(Date)
	 * @generated
	 */
	public Date getTagIssueTime() {
		return tagIssueTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getTagIssueTime <em>Tag Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Issue Time</em>' attribute.
	 * @see #isSetTagIssueTime()
	 * @see #unsetTagIssueTime()
	 * @see #getTagIssueTime()
	 * @generated
	 */
	public void setTagIssueTime(Date newTagIssueTime) {
		tagIssueTime = newTagIssueTime;
		tagIssueTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getTagIssueTime <em>Tag Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTagIssueTime()
	 * @see #getTagIssueTime()
	 * @see #setTagIssueTime(Date)
	 * @generated
	 */
	public void unsetTagIssueTime() {
		tagIssueTime = TAG_ISSUE_TIME_EDEFAULT;
		tagIssueTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getTagIssueTime <em>Tag Issue Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag Issue Time</em>' attribute is set.
	 * @see #unsetTagIssueTime()
	 * @see #getTagIssueTime()
	 * @see #setTagIssueTime(Date)
	 * @generated
	 */
	public boolean isSetTagIssueTime() {
		return tagIssueTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Ground Req Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Req Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Req Flag</em>' attribute.
	 * @see #isSetGroundReqFlag()
	 * @see #unsetGroundReqFlag()
	 * @see #setGroundReqFlag(boolean)
	 * @generated
	 */
	public boolean isGroundReqFlag() {
		return groundReqFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isGroundReqFlag <em>Ground Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Req Flag</em>' attribute.
	 * @see #isSetGroundReqFlag()
	 * @see #unsetGroundReqFlag()
	 * @see #isGroundReqFlag()
	 * @generated
	 */
	public void setGroundReqFlag(boolean newGroundReqFlag) {
		groundReqFlag = newGroundReqFlag;
		groundReqFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isGroundReqFlag <em>Ground Req Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroundReqFlag()
	 * @see #isGroundReqFlag()
	 * @see #setGroundReqFlag(boolean)
	 * @generated
	 */
	public void unsetGroundReqFlag() {
		groundReqFlag = GROUND_REQ_FLAG_EDEFAULT;
		groundReqFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#isGroundReqFlag <em>Ground Req Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ground Req Flag</em>' attribute is set.
	 * @see #unsetGroundReqFlag()
	 * @see #isGroundReqFlag()
	 * @see #setGroundReqFlag(boolean)
	 * @generated
	 */
	public boolean isSetGroundReqFlag() {
		return groundReqFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Description</em>' attribute.
	 * @see #isSetWorkDescription()
	 * @see #unsetWorkDescription()
	 * @see #setWorkDescription(String)
	 * @generated
	 */
	public String getWorkDescription() {
		return workDescription;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkDescription <em>Work Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Description</em>' attribute.
	 * @see #isSetWorkDescription()
	 * @see #unsetWorkDescription()
	 * @see #getWorkDescription()
	 * @generated
	 */
	public void setWorkDescription(String newWorkDescription) {
		workDescription = newWorkDescription;
		workDescriptionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkDescription <em>Work Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkDescription()
	 * @see #getWorkDescription()
	 * @see #setWorkDescription(String)
	 * @generated
	 */
	public void unsetWorkDescription() {
		workDescription = WORK_DESCRIPTION_EDEFAULT;
		workDescriptionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkDescription <em>Work Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Description</em>' attribute is set.
	 * @see #unsetWorkDescription()
	 * @see #getWorkDescription()
	 * @see #setWorkDescription(String)
	 * @generated
	 */
	public boolean isSetWorkDescription() {
		return workDescriptionESet;
	}

	/**
	 * Returns the value of the '<em><b>Safety Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Document</em>' reference.
	 * @see #setSafetyDocument(SafetyDocument)
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getClearanceTags
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
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getSafetyDocument <em>Safety Document</em>}' reference.
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
				msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS, SafetyDocument.class, msgs);
			if (newSafetyDocument != null)
				msgs = ((InternalEObject)newSafetyDocument).eInverseAdd(this, InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS, SafetyDocument.class, msgs);
			msgs = basicSetSafetyDocument(newSafetyDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Clearance Tag Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.ClearanceTagType#getClearanceTags <em>Clearance Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearance Tag Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearance Tag Type</em>' reference.
	 * @see #setClearanceTagType(ClearanceTagType)
	 * @see CIM15.IEC61970.Outage.ClearanceTagType#getClearanceTags
	 * @generated
	 */
	public ClearanceTagType getClearanceTagType() {
		if (clearanceTagType != null && clearanceTagType.eIsProxy()) {
			InternalEObject oldClearanceTagType = (InternalEObject)clearanceTagType;
			clearanceTagType = (ClearanceTagType)eResolveProxy(oldClearanceTagType);
			if (clearanceTagType != oldClearanceTagType) {
			}
		}
		return clearanceTagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearanceTagType basicGetClearanceTagType() {
		return clearanceTagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearanceTagType(ClearanceTagType newClearanceTagType, NotificationChain msgs) {
		ClearanceTagType oldClearanceTagType = clearanceTagType;
		clearanceTagType = newClearanceTagType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getClearanceTagType <em>Clearance Tag Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clearance Tag Type</em>' reference.
	 * @see #getClearanceTagType()
	 * @generated
	 */
	public void setClearanceTagType(ClearanceTagType newClearanceTagType) {
		if (newClearanceTagType != clearanceTagType) {
			NotificationChain msgs = null;
			if (clearanceTagType != null)
				msgs = ((InternalEObject)clearanceTagType).eInverseRemove(this, OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS, ClearanceTagType.class, msgs);
			if (newClearanceTagType != null)
				msgs = ((InternalEObject)newClearanceTagType).eInverseAdd(this, OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS, ClearanceTagType.class, msgs);
			msgs = basicSetClearanceTagType(newClearanceTagType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Work End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work End Time</em>' attribute.
	 * @see #isSetWorkEndTime()
	 * @see #unsetWorkEndTime()
	 * @see #setWorkEndTime(Date)
	 * @generated
	 */
	public Date getWorkEndTime() {
		return workEndTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkEndTime <em>Work End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work End Time</em>' attribute.
	 * @see #isSetWorkEndTime()
	 * @see #unsetWorkEndTime()
	 * @see #getWorkEndTime()
	 * @generated
	 */
	public void setWorkEndTime(Date newWorkEndTime) {
		workEndTime = newWorkEndTime;
		workEndTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkEndTime <em>Work End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkEndTime()
	 * @see #getWorkEndTime()
	 * @see #setWorkEndTime(Date)
	 * @generated
	 */
	public void unsetWorkEndTime() {
		workEndTime = WORK_END_TIME_EDEFAULT;
		workEndTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.ClearanceTag#getWorkEndTime <em>Work End Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work End Time</em>' attribute is set.
	 * @see #unsetWorkEndTime()
	 * @see #getWorkEndTime()
	 * @see #setWorkEndTime(Date)
	 * @generated
	 */
	public boolean isSetWorkEndTime() {
		return workEndTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				if (safetyDocument != null)
					msgs = ((InternalEObject)safetyDocument).eInverseRemove(this, InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS, SafetyDocument.class, msgs);
				return basicSetSafetyDocument((SafetyDocument)otherEnd, msgs);
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				if (clearanceTagType != null)
					msgs = ((InternalEObject)clearanceTagType).eInverseRemove(this, OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS, ClearanceTagType.class, msgs);
				return basicSetClearanceTagType((ClearanceTagType)otherEnd, msgs);
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
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				return basicSetSafetyDocument(null, msgs);
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				return basicSetClearanceTagType(null, msgs);
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
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				return getWorkStartTime();
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				return isPhaseCheckReqFlag();
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				return isDeenergizeReqFlag();
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				return getAuthorityName();
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				return getTagIssueTime();
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				return isGroundReqFlag();
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				return getWorkDescription();
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				if (resolve) return getSafetyDocument();
				return basicGetSafetyDocument();
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				if (resolve) return getClearanceTagType();
				return basicGetClearanceTagType();
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				return getWorkEndTime();
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
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				setWorkStartTime((Date)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				setPhaseCheckReqFlag((Boolean)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				setDeenergizeReqFlag((Boolean)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				setAuthorityName((String)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				setTagIssueTime((Date)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				setGroundReqFlag((Boolean)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				setWorkDescription((String)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				setClearanceTagType((ClearanceTagType)newValue);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				setWorkEndTime((Date)newValue);
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
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				unsetWorkStartTime();
				return;
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				unsetPhaseCheckReqFlag();
				return;
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				unsetDeenergizeReqFlag();
				return;
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				unsetAuthorityName();
				return;
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
				return;
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				unsetTagIssueTime();
				return;
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				unsetGroundReqFlag();
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				unsetWorkDescription();
				return;
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				setSafetyDocument((SafetyDocument)null);
				return;
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				setClearanceTagType((ClearanceTagType)null);
				return;
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				unsetWorkEndTime();
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
			case OutagePackage.CLEARANCE_TAG__WORK_START_TIME:
				return isSetWorkStartTime();
			case OutagePackage.CLEARANCE_TAG__PHASE_CHECK_REQ_FLAG:
				return isSetPhaseCheckReqFlag();
			case OutagePackage.CLEARANCE_TAG__DEENERGIZE_REQ_FLAG:
				return isSetDeenergizeReqFlag();
			case OutagePackage.CLEARANCE_TAG__AUTHORITY_NAME:
				return isSetAuthorityName();
			case OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
			case OutagePackage.CLEARANCE_TAG__TAG_ISSUE_TIME:
				return isSetTagIssueTime();
			case OutagePackage.CLEARANCE_TAG__GROUND_REQ_FLAG:
				return isSetGroundReqFlag();
			case OutagePackage.CLEARANCE_TAG__WORK_DESCRIPTION:
				return isSetWorkDescription();
			case OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT:
				return safetyDocument != null;
			case OutagePackage.CLEARANCE_TAG__CLEARANCE_TAG_TYPE:
				return clearanceTagType != null;
			case OutagePackage.CLEARANCE_TAG__WORK_END_TIME:
				return isSetWorkEndTime();
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
		result.append(" (workStartTime: ");
		if (workStartTimeESet) result.append(workStartTime); else result.append("<unset>");
		result.append(", phaseCheckReqFlag: ");
		if (phaseCheckReqFlagESet) result.append(phaseCheckReqFlag); else result.append("<unset>");
		result.append(", deenergizeReqFlag: ");
		if (deenergizeReqFlagESet) result.append(deenergizeReqFlag); else result.append("<unset>");
		result.append(", authorityName: ");
		if (authorityNameESet) result.append(authorityName); else result.append("<unset>");
		result.append(", tagIssueTime: ");
		if (tagIssueTimeESet) result.append(tagIssueTime); else result.append("<unset>");
		result.append(", groundReqFlag: ");
		if (groundReqFlagESet) result.append(groundReqFlag); else result.append("<unset>");
		result.append(", workDescription: ");
		if (workDescriptionESet) result.append(workDescription); else result.append("<unset>");
		result.append(", workEndTime: ");
		if (workEndTimeESet) result.append(workEndTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ClearanceTag
