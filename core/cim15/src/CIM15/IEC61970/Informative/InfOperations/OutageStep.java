/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfWork.Crew;

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
 * A representation of the model object '<em><b>Outage Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval <em>No Power Interval</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getConductingEquipmentRoles <em>Conducting Equipment Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageCodes <em>Outage Codes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutageStep extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getAverageCml() <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCml()
	 * @generated
	 * @ordered
	 */
	protected static final float AVERAGE_CML_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAverageCml() <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCml()
	 * @generated
	 * @ordered
	 */
	protected float averageCml = AVERAGE_CML_EDEFAULT;

	/**
	 * This is true if the Average Cml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean averageCmlESet;

	/**
	 * The default value of the '{@link #isDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDamage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAMAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDamage()
	 * @generated
	 * @ordered
	 */
	protected boolean damage = DAMAGE_EDEFAULT;

	/**
	 * This is true if the Damage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean damageESet;

	/**
	 * The default value of the '{@link #getSpecialCustomerCount() <em>Special Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SPECIAL_CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpecialCustomerCount() <em>Special Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int specialCustomerCount = SPECIAL_CUSTOMER_COUNT_EDEFAULT;

	/**
	 * This is true if the Special Customer Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialCustomerCountESet;

	/**
	 * The default value of the '{@link #getCriticalCustomerCount() <em>Critical Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CRITICAL_CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCriticalCustomerCount() <em>Critical Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int criticalCustomerCount = CRITICAL_CUSTOMER_COUNT_EDEFAULT;

	/**
	 * This is true if the Critical Customer Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean criticalCustomerCountESet;

	/**
	 * The default value of the '{@link #getEstimatedRestoreDateTime() <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRestoreDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_RESTORE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedRestoreDateTime() <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRestoreDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedRestoreDateTime = ESTIMATED_RESTORE_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Estimated Restore Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedRestoreDateTimeESet;

	/**
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The default value of the '{@link #isShockReported() <em>Shock Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShockReported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOCK_REPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShockReported() <em>Shock Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShockReported()
	 * @generated
	 * @ordered
	 */
	protected boolean shockReported = SHOCK_REPORTED_EDEFAULT;

	/**
	 * This is true if the Shock Reported attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shockReportedESet;

	/**
	 * The cached value of the '{@link #getNoPowerInterval() <em>No Power Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoPowerInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval noPowerInterval;

	/**
	 * The default value of the '{@link #getCallerCount() <em>Caller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CALLER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCallerCount() <em>Caller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallerCount()
	 * @generated
	 * @ordered
	 */
	protected int callerCount = CALLER_COUNT_EDEFAULT;

	/**
	 * This is true if the Caller Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callerCountESet;

	/**
	 * The cached value of the '{@link #getConductingEquipmentRoles() <em>Conducting Equipment Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipmentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStepPsrRole> conductingEquipmentRoles;

	/**
	 * The default value of the '{@link #isFatality() <em>Fatality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFatality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FATALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFatality() <em>Fatality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFatality()
	 * @generated
	 * @ordered
	 */
	protected boolean fatality = FATALITY_EDEFAULT;

	/**
	 * This is true if the Fatality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fatalityESet;

	/**
	 * The default value of the '{@link #getJobPriority() <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobPriority() <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriority()
	 * @generated
	 * @ordered
	 */
	protected String jobPriority = JOB_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Job Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean jobPriorityESet;

	/**
	 * The default value of the '{@link #getTotalCustomerCount() <em>Total Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CUSTOMER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCustomerCount() <em>Total Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCustomerCount()
	 * @generated
	 * @ordered
	 */
	protected int totalCustomerCount = TOTAL_CUSTOMER_COUNT_EDEFAULT;

	/**
	 * This is true if the Total Customer Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalCustomerCountESet;

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
	 * The default value of the '{@link #isInjury() <em>Injury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjury()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INJURY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInjury() <em>Injury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInjury()
	 * @generated
	 * @ordered
	 */
	protected boolean injury = INJURY_EDEFAULT;

	/**
	 * This is true if the Injury attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean injuryESet;

	/**
	 * The cached value of the '{@link #getOutageRecord() <em>Outage Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageRecord()
	 * @generated
	 * @ordered
	 */
	protected OutageRecord outageRecord;

	/**
	 * The default value of the '{@link #getTotalCml() <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCml()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_CML_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalCml() <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCml()
	 * @generated
	 * @ordered
	 */
	protected float totalCml = TOTAL_CML_EDEFAULT;

	/**
	 * This is true if the Total Cml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalCmlESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageStep() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_STEP;
	}

	/**
	 * Returns the value of the '<em><b>Average Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Cml</em>' attribute.
	 * @see #isSetAverageCml()
	 * @see #unsetAverageCml()
	 * @see #setAverageCml(float)
	 * @generated
	 */
	public float getAverageCml() {
		return averageCml;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Cml</em>' attribute.
	 * @see #isSetAverageCml()
	 * @see #unsetAverageCml()
	 * @see #getAverageCml()
	 * @generated
	 */
	public void setAverageCml(float newAverageCml) {
		averageCml = newAverageCml;
		averageCmlESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAverageCml()
	 * @see #getAverageCml()
	 * @see #setAverageCml(float)
	 * @generated
	 */
	public void unsetAverageCml() {
		averageCml = AVERAGE_CML_EDEFAULT;
		averageCmlESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getAverageCml <em>Average Cml</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Average Cml</em>' attribute is set.
	 * @see #unsetAverageCml()
	 * @see #getAverageCml()
	 * @see #setAverageCml(float)
	 * @generated
	 */
	public boolean isSetAverageCml() {
		return averageCmlESet;
	}

	/**
	 * Returns the value of the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage</em>' attribute.
	 * @see #isSetDamage()
	 * @see #unsetDamage()
	 * @see #setDamage(boolean)
	 * @generated
	 */
	public boolean isDamage() {
		return damage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage</em>' attribute.
	 * @see #isSetDamage()
	 * @see #unsetDamage()
	 * @see #isDamage()
	 * @generated
	 */
	public void setDamage(boolean newDamage) {
		damage = newDamage;
		damageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDamage()
	 * @see #isDamage()
	 * @see #setDamage(boolean)
	 * @generated
	 */
	public void unsetDamage() {
		damage = DAMAGE_EDEFAULT;
		damageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isDamage <em>Damage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Damage</em>' attribute is set.
	 * @see #unsetDamage()
	 * @see #isDamage()
	 * @see #setDamage(boolean)
	 * @generated
	 */
	public boolean isSetDamage() {
		return damageESet;
	}

	/**
	 * Returns the value of the '<em><b>Special Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Customer Count</em>' attribute.
	 * @see #isSetSpecialCustomerCount()
	 * @see #unsetSpecialCustomerCount()
	 * @see #setSpecialCustomerCount(int)
	 * @generated
	 */
	public int getSpecialCustomerCount() {
		return specialCustomerCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Customer Count</em>' attribute.
	 * @see #isSetSpecialCustomerCount()
	 * @see #unsetSpecialCustomerCount()
	 * @see #getSpecialCustomerCount()
	 * @generated
	 */
	public void setSpecialCustomerCount(int newSpecialCustomerCount) {
		specialCustomerCount = newSpecialCustomerCount;
		specialCustomerCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecialCustomerCount()
	 * @see #getSpecialCustomerCount()
	 * @see #setSpecialCustomerCount(int)
	 * @generated
	 */
	public void unsetSpecialCustomerCount() {
		specialCustomerCount = SPECIAL_CUSTOMER_COUNT_EDEFAULT;
		specialCustomerCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getSpecialCustomerCount <em>Special Customer Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Special Customer Count</em>' attribute is set.
	 * @see #unsetSpecialCustomerCount()
	 * @see #getSpecialCustomerCount()
	 * @see #setSpecialCustomerCount(int)
	 * @generated
	 */
	public boolean isSetSpecialCustomerCount() {
		return specialCustomerCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Critical Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Customer Count</em>' attribute.
	 * @see #isSetCriticalCustomerCount()
	 * @see #unsetCriticalCustomerCount()
	 * @see #setCriticalCustomerCount(int)
	 * @generated
	 */
	public int getCriticalCustomerCount() {
		return criticalCustomerCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Customer Count</em>' attribute.
	 * @see #isSetCriticalCustomerCount()
	 * @see #unsetCriticalCustomerCount()
	 * @see #getCriticalCustomerCount()
	 * @generated
	 */
	public void setCriticalCustomerCount(int newCriticalCustomerCount) {
		criticalCustomerCount = newCriticalCustomerCount;
		criticalCustomerCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCriticalCustomerCount()
	 * @see #getCriticalCustomerCount()
	 * @see #setCriticalCustomerCount(int)
	 * @generated
	 */
	public void unsetCriticalCustomerCount() {
		criticalCustomerCount = CRITICAL_CUSTOMER_COUNT_EDEFAULT;
		criticalCustomerCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCriticalCustomerCount <em>Critical Customer Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Critical Customer Count</em>' attribute is set.
	 * @see #unsetCriticalCustomerCount()
	 * @see #getCriticalCustomerCount()
	 * @see #setCriticalCustomerCount(int)
	 * @generated
	 */
	public boolean isSetCriticalCustomerCount() {
		return criticalCustomerCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Estimated Restore Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Restore Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Restore Date Time</em>' attribute.
	 * @see #isSetEstimatedRestoreDateTime()
	 * @see #unsetEstimatedRestoreDateTime()
	 * @see #setEstimatedRestoreDateTime(Date)
	 * @generated
	 */
	public Date getEstimatedRestoreDateTime() {
		return estimatedRestoreDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Restore Date Time</em>' attribute.
	 * @see #isSetEstimatedRestoreDateTime()
	 * @see #unsetEstimatedRestoreDateTime()
	 * @see #getEstimatedRestoreDateTime()
	 * @generated
	 */
	public void setEstimatedRestoreDateTime(Date newEstimatedRestoreDateTime) {
		estimatedRestoreDateTime = newEstimatedRestoreDateTime;
		estimatedRestoreDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedRestoreDateTime()
	 * @see #getEstimatedRestoreDateTime()
	 * @see #setEstimatedRestoreDateTime(Date)
	 * @generated
	 */
	public void unsetEstimatedRestoreDateTime() {
		estimatedRestoreDateTime = ESTIMATED_RESTORE_DATE_TIME_EDEFAULT;
		estimatedRestoreDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Restore Date Time</em>' attribute is set.
	 * @see #unsetEstimatedRestoreDateTime()
	 * @see #getEstimatedRestoreDateTime()
	 * @see #setEstimatedRestoreDateTime(Date)
	 * @generated
	 */
	public boolean isSetEstimatedRestoreDateTime() {
		return estimatedRestoreDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getOutageSteps
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new BasicInternalEList<Crew>(Crew.class);
		}
		return crews;
	}

	/**
	 * Returns the value of the '<em><b>Shock Reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shock Reported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shock Reported</em>' attribute.
	 * @see #isSetShockReported()
	 * @see #unsetShockReported()
	 * @see #setShockReported(boolean)
	 * @generated
	 */
	public boolean isShockReported() {
		return shockReported;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shock Reported</em>' attribute.
	 * @see #isSetShockReported()
	 * @see #unsetShockReported()
	 * @see #isShockReported()
	 * @generated
	 */
	public void setShockReported(boolean newShockReported) {
		shockReported = newShockReported;
		shockReportedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShockReported()
	 * @see #isShockReported()
	 * @see #setShockReported(boolean)
	 * @generated
	 */
	public void unsetShockReported() {
		shockReported = SHOCK_REPORTED_EDEFAULT;
		shockReportedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isShockReported <em>Shock Reported</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shock Reported</em>' attribute is set.
	 * @see #unsetShockReported()
	 * @see #isShockReported()
	 * @see #setShockReported(boolean)
	 * @generated
	 */
	public boolean isSetShockReported() {
		return shockReportedESet;
	}

	/**
	 * Returns the value of the '<em><b>No Power Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Power Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Power Interval</em>' containment reference.
	 * @see #setNoPowerInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getNoPowerInterval() {
		return noPowerInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoPowerInterval(DateTimeInterval newNoPowerInterval, NotificationChain msgs) {
		DateTimeInterval oldNoPowerInterval = noPowerInterval;
		noPowerInterval = newNoPowerInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getNoPowerInterval <em>No Power Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Power Interval</em>' containment reference.
	 * @see #getNoPowerInterval()
	 * @generated
	 */
	public void setNoPowerInterval(DateTimeInterval newNoPowerInterval) {
		if (newNoPowerInterval != noPowerInterval) {
			NotificationChain msgs = null;
			if (noPowerInterval != null)
				msgs = ((InternalEObject)noPowerInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL, null, msgs);
			if (newNoPowerInterval != null)
				msgs = ((InternalEObject)newNoPowerInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL, null, msgs);
			msgs = basicSetNoPowerInterval(newNoPowerInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Caller Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller Count</em>' attribute.
	 * @see #isSetCallerCount()
	 * @see #unsetCallerCount()
	 * @see #setCallerCount(int)
	 * @generated
	 */
	public int getCallerCount() {
		return callerCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller Count</em>' attribute.
	 * @see #isSetCallerCount()
	 * @see #unsetCallerCount()
	 * @see #getCallerCount()
	 * @generated
	 */
	public void setCallerCount(int newCallerCount) {
		callerCount = newCallerCount;
		callerCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallerCount()
	 * @see #getCallerCount()
	 * @see #setCallerCount(int)
	 * @generated
	 */
	public void unsetCallerCount() {
		callerCount = CALLER_COUNT_EDEFAULT;
		callerCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getCallerCount <em>Caller Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caller Count</em>' attribute is set.
	 * @see #unsetCallerCount()
	 * @see #getCallerCount()
	 * @see #setCallerCount(int)
	 * @generated
	 */
	public boolean isSetCallerCount() {
		return callerCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Conducting Equipment Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep <em>Outage Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageStepPsrRole#getOutageStep
	 * @generated
	 */
	public EList<OutageStepPsrRole> getConductingEquipmentRoles() {
		if (conductingEquipmentRoles == null) {
			conductingEquipmentRoles = new BasicInternalEList<OutageStepPsrRole>(OutageStepPsrRole.class);
		}
		return conductingEquipmentRoles;
	}

	/**
	 * Returns the value of the '<em><b>Fatality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fatality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fatality</em>' attribute.
	 * @see #isSetFatality()
	 * @see #unsetFatality()
	 * @see #setFatality(boolean)
	 * @generated
	 */
	public boolean isFatality() {
		return fatality;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fatality</em>' attribute.
	 * @see #isSetFatality()
	 * @see #unsetFatality()
	 * @see #isFatality()
	 * @generated
	 */
	public void setFatality(boolean newFatality) {
		fatality = newFatality;
		fatalityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFatality()
	 * @see #isFatality()
	 * @see #setFatality(boolean)
	 * @generated
	 */
	public void unsetFatality() {
		fatality = FATALITY_EDEFAULT;
		fatalityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isFatality <em>Fatality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fatality</em>' attribute is set.
	 * @see #unsetFatality()
	 * @see #isFatality()
	 * @see #setFatality(boolean)
	 * @generated
	 */
	public boolean isSetFatality() {
		return fatalityESet;
	}

	/**
	 * Returns the value of the '<em><b>Job Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Priority</em>' attribute.
	 * @see #isSetJobPriority()
	 * @see #unsetJobPriority()
	 * @see #setJobPriority(String)
	 * @generated
	 */
	public String getJobPriority() {
		return jobPriority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Priority</em>' attribute.
	 * @see #isSetJobPriority()
	 * @see #unsetJobPriority()
	 * @see #getJobPriority()
	 * @generated
	 */
	public void setJobPriority(String newJobPriority) {
		jobPriority = newJobPriority;
		jobPriorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJobPriority()
	 * @see #getJobPriority()
	 * @see #setJobPriority(String)
	 * @generated
	 */
	public void unsetJobPriority() {
		jobPriority = JOB_PRIORITY_EDEFAULT;
		jobPriorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getJobPriority <em>Job Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Job Priority</em>' attribute is set.
	 * @see #unsetJobPriority()
	 * @see #getJobPriority()
	 * @see #setJobPriority(String)
	 * @generated
	 */
	public boolean isSetJobPriority() {
		return jobPriorityESet;
	}

	/**
	 * Returns the value of the '<em><b>Total Customer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Customer Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Customer Count</em>' attribute.
	 * @see #isSetTotalCustomerCount()
	 * @see #unsetTotalCustomerCount()
	 * @see #setTotalCustomerCount(int)
	 * @generated
	 */
	public int getTotalCustomerCount() {
		return totalCustomerCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Customer Count</em>' attribute.
	 * @see #isSetTotalCustomerCount()
	 * @see #unsetTotalCustomerCount()
	 * @see #getTotalCustomerCount()
	 * @generated
	 */
	public void setTotalCustomerCount(int newTotalCustomerCount) {
		totalCustomerCount = newTotalCustomerCount;
		totalCustomerCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalCustomerCount()
	 * @see #getTotalCustomerCount()
	 * @see #setTotalCustomerCount(int)
	 * @generated
	 */
	public void unsetTotalCustomerCount() {
		totalCustomerCount = TOTAL_CUSTOMER_COUNT_EDEFAULT;
		totalCustomerCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCustomerCount <em>Total Customer Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Customer Count</em>' attribute is set.
	 * @see #unsetTotalCustomerCount()
	 * @see #getTotalCustomerCount()
	 * @see #setTotalCustomerCount(int)
	 * @generated
	 */
	public boolean isSetTotalCustomerCount() {
		return totalCustomerCountESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.OUTAGE_STEP__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.OUTAGE_STEP__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Injury</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injury</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injury</em>' attribute.
	 * @see #isSetInjury()
	 * @see #unsetInjury()
	 * @see #setInjury(boolean)
	 * @generated
	 */
	public boolean isInjury() {
		return injury;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injury</em>' attribute.
	 * @see #isSetInjury()
	 * @see #unsetInjury()
	 * @see #isInjury()
	 * @generated
	 */
	public void setInjury(boolean newInjury) {
		injury = newInjury;
		injuryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInjury()
	 * @see #isInjury()
	 * @see #setInjury(boolean)
	 * @generated
	 */
	public void unsetInjury() {
		injury = INJURY_EDEFAULT;
		injuryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#isInjury <em>Injury</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Injury</em>' attribute is set.
	 * @see #unsetInjury()
	 * @see #isInjury()
	 * @see #setInjury(boolean)
	 * @generated
	 */
	public boolean isSetInjury() {
		return injuryESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Record</em>' reference.
	 * @see #setOutageRecord(OutageRecord)
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageRecord#getOutageSteps
	 * @generated
	 */
	public OutageRecord getOutageRecord() {
		if (outageRecord != null && outageRecord.eIsProxy()) {
			InternalEObject oldOutageRecord = (InternalEObject)outageRecord;
			outageRecord = (OutageRecord)eResolveProxy(oldOutageRecord);
			if (outageRecord != oldOutageRecord) {
			}
		}
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageRecord basicGetOutageRecord() {
		return outageRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageRecord(OutageRecord newOutageRecord, NotificationChain msgs) {
		OutageRecord oldOutageRecord = outageRecord;
		outageRecord = newOutageRecord;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getOutageRecord <em>Outage Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Record</em>' reference.
	 * @see #getOutageRecord()
	 * @generated
	 */
	public void setOutageRecord(OutageRecord newOutageRecord) {
		if (newOutageRecord != outageRecord) {
			NotificationChain msgs = null;
			if (outageRecord != null)
				msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS, OutageRecord.class, msgs);
			if (newOutageRecord != null)
				msgs = ((InternalEObject)newOutageRecord).eInverseAdd(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS, OutageRecord.class, msgs);
			msgs = basicSetOutageRecord(newOutageRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Total Cml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cml</em>' attribute.
	 * @see #isSetTotalCml()
	 * @see #unsetTotalCml()
	 * @see #setTotalCml(float)
	 * @generated
	 */
	public float getTotalCml() {
		return totalCml;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cml</em>' attribute.
	 * @see #isSetTotalCml()
	 * @see #unsetTotalCml()
	 * @see #getTotalCml()
	 * @generated
	 */
	public void setTotalCml(float newTotalCml) {
		totalCml = newTotalCml;
		totalCmlESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalCml()
	 * @see #getTotalCml()
	 * @see #setTotalCml(float)
	 * @generated
	 */
	public void unsetTotalCml() {
		totalCml = TOTAL_CML_EDEFAULT;
		totalCmlESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.OutageStep#getTotalCml <em>Total Cml</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Cml</em>' attribute is set.
	 * @see #unsetTotalCml()
	 * @see #getTotalCml()
	 * @see #setTotalCml(float)
	 * @generated
	 */
	public boolean isSetTotalCml() {
		return totalCmlESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage Codes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OutageCode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps <em>Outage Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Codes</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OutageCode#getOutageSteps
	 * @generated
	 */
	public EList<OutageCode> getOutageCodes() {
		if (outageCodes == null) {
			outageCodes = new BasicInternalEList<OutageCode>(OutageCode.class);
		}
		return outageCodes;
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
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipmentRoles()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				if (outageRecord != null)
					msgs = ((InternalEObject)outageRecord).eInverseRemove(this, InfOperationsPackage.OUTAGE_RECORD__OUTAGE_STEPS, OutageRecord.class, msgs);
				return basicSetOutageRecord((OutageRecord)otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageCodes()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				return basicSetNoPowerInterval(null, msgs);
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return ((InternalEList<?>)getConductingEquipmentRoles()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				return basicSetStatus(null, msgs);
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				return basicSetOutageRecord(null, msgs);
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return ((InternalEList<?>)getOutageCodes()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				return getAverageCml();
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				return isDamage();
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				return getSpecialCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				return getCriticalCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				return getEstimatedRestoreDateTime();
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return getCrews();
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				return isShockReported();
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				return getNoPowerInterval();
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				return getCallerCount();
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return getConductingEquipmentRoles();
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				return isFatality();
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				return getJobPriority();
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				return getTotalCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				return getStatus();
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				return isInjury();
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				if (resolve) return getOutageRecord();
				return basicGetOutageRecord();
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				return getTotalCml();
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return getOutageCodes();
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
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				setAverageCml((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				setDamage((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				setSpecialCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				setCriticalCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				setEstimatedRestoreDateTime((Date)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				setShockReported((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				setNoPowerInterval((DateTimeInterval)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				setCallerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				getConductingEquipmentRoles().clear();
				getConductingEquipmentRoles().addAll((Collection<? extends OutageStepPsrRole>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				setFatality((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				setJobPriority((String)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				setTotalCustomerCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				setInjury((Boolean)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				setTotalCml((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				getOutageCodes().clear();
				getOutageCodes().addAll((Collection<? extends OutageCode>)newValue);
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
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				unsetAverageCml();
				return;
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				unsetDamage();
				return;
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				unsetSpecialCustomerCount();
				return;
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				unsetCriticalCustomerCount();
				return;
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				unsetEstimatedRestoreDateTime();
				return;
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				getCrews().clear();
				return;
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				unsetShockReported();
				return;
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				setNoPowerInterval((DateTimeInterval)null);
				return;
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				unsetCallerCount();
				return;
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				getConductingEquipmentRoles().clear();
				return;
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				unsetFatality();
				return;
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				unsetJobPriority();
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				unsetTotalCustomerCount();
				return;
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				unsetInjury();
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				setOutageRecord((OutageRecord)null);
				return;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				unsetTotalCml();
				return;
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				getOutageCodes().clear();
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
			case InfOperationsPackage.OUTAGE_STEP__AVERAGE_CML:
				return isSetAverageCml();
			case InfOperationsPackage.OUTAGE_STEP__DAMAGE:
				return isSetDamage();
			case InfOperationsPackage.OUTAGE_STEP__SPECIAL_CUSTOMER_COUNT:
				return isSetSpecialCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__CRITICAL_CUSTOMER_COUNT:
				return isSetCriticalCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__ESTIMATED_RESTORE_DATE_TIME:
				return isSetEstimatedRestoreDateTime();
			case InfOperationsPackage.OUTAGE_STEP__CREWS:
				return crews != null && !crews.isEmpty();
			case InfOperationsPackage.OUTAGE_STEP__SHOCK_REPORTED:
				return isSetShockReported();
			case InfOperationsPackage.OUTAGE_STEP__NO_POWER_INTERVAL:
				return noPowerInterval != null;
			case InfOperationsPackage.OUTAGE_STEP__CALLER_COUNT:
				return isSetCallerCount();
			case InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES:
				return conductingEquipmentRoles != null && !conductingEquipmentRoles.isEmpty();
			case InfOperationsPackage.OUTAGE_STEP__FATALITY:
				return isSetFatality();
			case InfOperationsPackage.OUTAGE_STEP__JOB_PRIORITY:
				return isSetJobPriority();
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CUSTOMER_COUNT:
				return isSetTotalCustomerCount();
			case InfOperationsPackage.OUTAGE_STEP__STATUS:
				return status != null;
			case InfOperationsPackage.OUTAGE_STEP__INJURY:
				return isSetInjury();
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_RECORD:
				return outageRecord != null;
			case InfOperationsPackage.OUTAGE_STEP__TOTAL_CML:
				return isSetTotalCml();
			case InfOperationsPackage.OUTAGE_STEP__OUTAGE_CODES:
				return outageCodes != null && !outageCodes.isEmpty();
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
		result.append(" (averageCml: ");
		if (averageCmlESet) result.append(averageCml); else result.append("<unset>");
		result.append(", damage: ");
		if (damageESet) result.append(damage); else result.append("<unset>");
		result.append(", specialCustomerCount: ");
		if (specialCustomerCountESet) result.append(specialCustomerCount); else result.append("<unset>");
		result.append(", criticalCustomerCount: ");
		if (criticalCustomerCountESet) result.append(criticalCustomerCount); else result.append("<unset>");
		result.append(", estimatedRestoreDateTime: ");
		if (estimatedRestoreDateTimeESet) result.append(estimatedRestoreDateTime); else result.append("<unset>");
		result.append(", shockReported: ");
		if (shockReportedESet) result.append(shockReported); else result.append("<unset>");
		result.append(", callerCount: ");
		if (callerCountESet) result.append(callerCount); else result.append("<unset>");
		result.append(", fatality: ");
		if (fatalityESet) result.append(fatality); else result.append("<unset>");
		result.append(", jobPriority: ");
		if (jobPriorityESet) result.append(jobPriority); else result.append("<unset>");
		result.append(", totalCustomerCount: ");
		if (totalCustomerCountESet) result.append(totalCustomerCount); else result.append("<unset>");
		result.append(", injury: ");
		if (injuryESet) result.append(injury); else result.append("<unset>");
		result.append(", totalCml: ");
		if (totalCmlESet) result.append(totalCml); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // OutageStep
