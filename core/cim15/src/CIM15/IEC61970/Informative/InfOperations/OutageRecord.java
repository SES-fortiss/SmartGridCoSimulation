/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outage Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageCodes <em>Outage Codes</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps <em>Outage Steps</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageRecord extends Document {
	/**
	 * The cached value of the '{@link #getOutageCodes() <em>Outage Codes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageCode> outageCodes;

	/**
	 * The default value of the '{@link #getEndDateTime() <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDateTime() <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date endDateTime = END_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the End Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endDateTimeESet;

	/**
	 * The cached value of the '{@link #getOutageReport() <em>Outage Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageReport()
	 * @generated
	 * @ordered
	 */
	protected OutageReport outageReport;

	/**
	 * The default value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLANNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlanned = IS_PLANNED_EDEFAULT;

	/**
	 * This is true if the Is Planned attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPlannedESet;

	/**
	 * The default value of the '{@link #getDamageCode() <em>Damage Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String DAMAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDamageCode() <em>Damage Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageCode()
	 * @generated
	 * @ordered
	 */
	protected String damageCode = DAMAGE_CODE_EDEFAULT;

	/**
	 * This is true if the Damage Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean damageCodeESet;

	/**
	 * The default value of the '{@link #getActionTaken() <em>Action Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTaken()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_TAKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionTaken() <em>Action Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTaken()
	 * @generated
	 * @ordered
	 */
	protected String actionTaken = ACTION_TAKEN_EDEFAULT;

	/**
	 * This is true if the Action Taken attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionTakenESet;

	/**
	 * The cached value of the '{@link #getOutageSteps() <em>Outage Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStep> outageSteps;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageRecord() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_RECORD;
	}

	/**
	 * Returns the value of the '<em><b>Outage Codes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageCode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords <em>Outage Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Codes</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageRecords
	 * @generated
	 */
	public EList<OutageCode> getOutageCodes() {
		if (outageCodes == null) {
			outageCodes = new BasicInternalEList<OutageCode>(OutageCode.class);
		}
		return outageCodes;
	}

	/**
	 * Returns the value of the '<em><b>End Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date Time</em>' attribute.
	 * @see #isSetEndDateTime()
	 * @see #unsetEndDateTime()
	 * @see #setEndDateTime(Date)
	 * @generated
	 */
	public Date getEndDateTime() {
		return endDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date Time</em>' attribute.
	 * @see #isSetEndDateTime()
	 * @see #unsetEndDateTime()
	 * @see #getEndDateTime()
	 * @generated
	 */
	public void setEndDateTime(Date newEndDateTime) {
		endDateTime = newEndDateTime;
		endDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndDateTime()
	 * @see #getEndDateTime()
	 * @see #setEndDateTime(Date)
	 * @generated
	 */
	public void unsetEndDateTime() {
		endDateTime = END_DATE_TIME_EDEFAULT;
		endDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getEndDateTime <em>End Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Date Time</em>' attribute is set.
	 * @see #unsetEndDateTime()
	 * @see #getEndDateTime()
	 * @see #setEndDateTime(Date)
	 * @generated
	 */
	public boolean isSetEndDateTime() {
		return endDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage Report</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Report</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Report</em>' reference.
	 * @see #setOutageReport(OutageReport)
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageReport#getOutageRecord
	 * @generated
	 */
	public OutageReport getOutageReport() {
		if (outageReport != null && outageReport.eIsProxy()) {
			InternalEObject oldOutageReport = (InternalEObject)outageReport;
			outageReport = (OutageReport)eResolveProxy(oldOutageReport);
			if (outageReport != oldOutageReport) {
			}
		}
		return outageReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageReport basicGetOutageReport() {
		return outageReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageReport(OutageReport newOutageReport, NotificationChain msgs) {
		OutageReport oldOutageReport = outageReport;
		outageReport = newOutageReport;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageReport <em>Outage Report</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Report</em>' reference.
	 * @see #getOutageReport()
	 * @generated
	 */
	public void setOutageReport(OutageReport newOutageReport) {
		if (newOutageReport != outageReport) {
			NotificationChain msgs = null;
			if (outageReport != null)
				msgs = ((InternalEObject)outageReport).eInverseRemove(this, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, OutageReport.class, msgs);
			if (newOutageReport != null)
				msgs = ((InternalEObject)newOutageReport).eInverseAdd(this, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, OutageReport.class, msgs);
			msgs = basicSetOutageReport(newOutageReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Is Planned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Planned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Planned</em>' attribute.
	 * @see #isSetIsPlanned()
	 * @see #unsetIsPlanned()
	 * @see #setIsPlanned(boolean)
	 * @generated
	 */
	public boolean isIsPlanned() {
		return isPlanned;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Planned</em>' attribute.
	 * @see #isSetIsPlanned()
	 * @see #unsetIsPlanned()
	 * @see #isIsPlanned()
	 * @generated
	 */
	public void setIsPlanned(boolean newIsPlanned) {
		isPlanned = newIsPlanned;
		isPlannedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPlanned()
	 * @see #isIsPlanned()
	 * @see #setIsPlanned(boolean)
	 * @generated
	 */
	public void unsetIsPlanned() {
		isPlanned = IS_PLANNED_EDEFAULT;
		isPlannedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#isIsPlanned <em>Is Planned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Planned</em>' attribute is set.
	 * @see #unsetIsPlanned()
	 * @see #isIsPlanned()
	 * @see #setIsPlanned(boolean)
	 * @generated
	 */
	public boolean isSetIsPlanned() {
		return isPlannedESet;
	}

	/**
	 * Returns the value of the '<em><b>Damage Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Code</em>' attribute.
	 * @see #isSetDamageCode()
	 * @see #unsetDamageCode()
	 * @see #setDamageCode(String)
	 * @generated
	 */
	public String getDamageCode() {
		return damageCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Code</em>' attribute.
	 * @see #isSetDamageCode()
	 * @see #unsetDamageCode()
	 * @see #getDamageCode()
	 * @generated
	 */
	public void setDamageCode(String newDamageCode) {
		damageCode = newDamageCode;
		damageCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDamageCode()
	 * @see #getDamageCode()
	 * @see #setDamageCode(String)
	 * @generated
	 */
	public void unsetDamageCode() {
		damageCode = DAMAGE_CODE_EDEFAULT;
		damageCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getDamageCode <em>Damage Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Damage Code</em>' attribute is set.
	 * @see #unsetDamageCode()
	 * @see #getDamageCode()
	 * @see #setDamageCode(String)
	 * @generated
	 */
	public boolean isSetDamageCode() {
		return damageCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Action Taken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Taken</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Taken</em>' attribute.
	 * @see #isSetActionTaken()
	 * @see #unsetActionTaken()
	 * @see #setActionTaken(String)
	 * @generated
	 */
	public String getActionTaken() {
		return actionTaken;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Taken</em>' attribute.
	 * @see #isSetActionTaken()
	 * @see #unsetActionTaken()
	 * @see #getActionTaken()
	 * @generated
	 */
	public void setActionTaken(String newActionTaken) {
		actionTaken = newActionTaken;
		actionTakenESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionTaken()
	 * @see #getActionTaken()
	 * @see #setActionTaken(String)
	 * @generated
	 */
	public void unsetActionTaken() {
		actionTaken = ACTION_TAKEN_EDEFAULT;
		actionTakenESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getActionTaken <em>Action Taken</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Taken</em>' attribute is set.
	 * @see #unsetActionTaken()
	 * @see #getActionTaken()
	 * @see #setActionTaken(String)
	 * @generated
	 */
	public boolean isSetActionTaken() {
		return actionTakenESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageStep}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Steps</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord
	 * @generated
	 */
	public EList<OutageStep> getOutageSteps() {
		if (outageSteps == null) {
			outageSteps = new BasicInternalEList<OutageStep>(OutageStep.class);
		}
		return outageSteps;
	}

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(String)
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	public void setMode(String newMode) {
		mode = newMode;
		modeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(String)
	 * @generated
	 */
	public void unsetMode() {
		mode = MODE_EDEFAULT;
		modeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(String)
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
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
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageCodes()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				if (outageReport != null)
					msgs = ((InternalEObject)outageReport).eInverseRemove(this, InfOperationsPackage.OUTAGE_REPORT__OUTAGE_RECORD, OutageReport.class, msgs);
				return basicSetOutageReport((OutageReport)otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSteps()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return ((InternalEList<?>)getOutageCodes()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				return basicSetOutageReport(null, msgs);
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return ((InternalEList<?>)getOutageSteps()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return getOutageCodes();
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				return getEndDateTime();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				if (resolve) return getOutageReport();
				return basicGetOutageReport();
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				return isIsPlanned();
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				return getDamageCode();
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				return getActionTaken();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return getOutageSteps();
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				return getMode();
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
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				getOutageCodes().clear();
				getOutageCodes().addAll((Collection<? extends OutageCode>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				setEndDateTime((Date)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				setOutageReport((OutageReport)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				setIsPlanned((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				setDamageCode((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				setActionTaken((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				getOutageSteps().clear();
				getOutageSteps().addAll((Collection<? extends OutageStep>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				setMode((String)newValue);
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
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				getOutageCodes().clear();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				unsetEndDateTime();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				setOutageReport((OutageReport)null);
				return;
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				unsetIsPlanned();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				unsetDamageCode();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				unsetActionTaken();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				getOutageSteps().clear();
				return;
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				unsetMode();
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
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_CODES:
				return outageCodes != null && !outageCodes.isEmpty();
			case InfOperationsPackage.OUTAGE_RECORD__END_DATE_TIME:
				return isSetEndDateTime();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_REPORT:
				return outageReport != null;
			case InfOperationsPackage.OUTAGE_RECORD__IS_PLANNED:
				return isSetIsPlanned();
			case InfOperationsPackage.OUTAGE_RECORD__DAMAGE_CODE:
				return isSetDamageCode();
			case InfOperationsPackage.OUTAGE_RECORD__ACTION_TAKEN:
				return isSetActionTaken();
			case InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS:
				return outageSteps != null && !outageSteps.isEmpty();
			case InfOperationsPackage.OUTAGE_RECORD__MODE:
				return isSetMode();
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
		result.append(" (endDateTime: ");
		if (endDateTimeESet) result.append(endDateTime); else result.append("<unset>");
		result.append(", isPlanned: ");
		if (isPlannedESet) result.append(isPlanned); else result.append("<unset>");
		result.append(", damageCode: ");
		if (damageCodeESet) result.append(damageCode); else result.append("<unset>");
		result.append(", actionTaken: ");
		if (actionTakenESet) result.append(actionTaken); else result.append("<unset>");
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OutageRecord
