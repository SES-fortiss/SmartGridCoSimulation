/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61968.Customers.Customer;
import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61970.Domain.DateTimeInterval;

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
 * A representation of the model object '<em><b>Trouble Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks <em>Call Backs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod <em>Trouble Period</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TroubleTicket extends Document {
	/**
	 * The cached value of the '{@link #getCallBacks() <em>Call Backs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBacks()
	 * @generated
	 * @ordered
	 */
	protected EList<CallBack> callBacks;

	/**
	 * The cached value of the '{@link #getTroublePeriod() <em>Trouble Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroublePeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval troublePeriod;

	/**
	 * The default value of the '{@link #getFirstCallDateTime() <em>First Call Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCallDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRST_CALL_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstCallDateTime() <em>First Call Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCallDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date firstCallDateTime = FIRST_CALL_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the First Call Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstCallDateTimeESet;

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
	 * The default value of the '{@link #isInformBeforeRestored() <em>Inform Before Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformBeforeRestored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFORM_BEFORE_RESTORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInformBeforeRestored() <em>Inform Before Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformBeforeRestored()
	 * @generated
	 * @ordered
	 */
	protected boolean informBeforeRestored = INFORM_BEFORE_RESTORED_EDEFAULT;

	/**
	 * This is true if the Inform Before Restored attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean informBeforeRestoredESet;

	/**
	 * The default value of the '{@link #getReportingKind() <em>Reporting Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingKind()
	 * @generated
	 * @ordered
	 */
	protected static final TroubleReportingKind REPORTING_KIND_EDEFAULT = TroubleReportingKind.EMAIL;

	/**
	 * The cached value of the '{@link #getReportingKind() <em>Reporting Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingKind()
	 * @generated
	 * @ordered
	 */
	protected TroubleReportingKind reportingKind = REPORTING_KIND_EDEFAULT;

	/**
	 * This is true if the Reporting Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reportingKindESet;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The cached value of the '{@link #getCustomerData() <em>Customer Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerData()
	 * @generated
	 * @ordered
	 */
	protected Customer customerData;

	/**
	 * The default value of the '{@link #isInformAfterRestored() <em>Inform After Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformAfterRestored()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFORM_AFTER_RESTORED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInformAfterRestored() <em>Inform After Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInformAfterRestored()
	 * @generated
	 * @ordered
	 */
	protected boolean informAfterRestored = INFORM_AFTER_RESTORED_EDEFAULT;

	/**
	 * This is true if the Inform After Restored attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean informAfterRestoredESet;

	/**
	 * The default value of the '{@link #getAdvice() <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected static final String ADVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected String advice = ADVICE_EDEFAULT;

	/**
	 * This is true if the Advice attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adviceESet;

	/**
	 * The cached value of the '{@link #getIncidentRecord() <em>Incident Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentRecord()
	 * @generated
	 * @ordered
	 */
	protected IncidentRecord incidentRecord;

	/**
	 * The default value of the '{@link #getHazardCode() <em>Hazard Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCode()
	 * @generated
	 * @ordered
	 */
	protected static final String HAZARD_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHazardCode() <em>Hazard Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCode()
	 * @generated
	 * @ordered
	 */
	protected String hazardCode = HAZARD_CODE_EDEFAULT;

	/**
	 * This is true if the Hazard Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hazardCodeESet;

	/**
	 * The default value of the '{@link #isCallBack() <em>Call Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallBack()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_BACK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallBack() <em>Call Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallBack()
	 * @generated
	 * @ordered
	 */
	protected boolean callBack = CALL_BACK_EDEFAULT;

	/**
	 * This is true if the Call Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callBackESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TroubleTicket() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.TROUBLE_TICKET;
	}

	/**
	 * Returns the value of the '<em><b>Call Backs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.CallBack}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Backs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Backs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets
	 * @generated
	 */
	public EList<CallBack> getCallBacks() {
		if (callBacks == null) {
			callBacks = new BasicInternalEList<CallBack>(CallBack.class);
		}
		return callBacks;
	}

	/**
	 * Returns the value of the '<em><b>Trouble Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Period</em>' containment reference.
	 * @see #setTroublePeriod(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getTroublePeriod() {
		return troublePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTroublePeriod(DateTimeInterval newTroublePeriod, NotificationChain msgs) {
		DateTimeInterval oldTroublePeriod = troublePeriod;
		troublePeriod = newTroublePeriod;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getTroublePeriod <em>Trouble Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trouble Period</em>' containment reference.
	 * @see #getTroublePeriod()
	 * @generated
	 */
	public void setTroublePeriod(DateTimeInterval newTroublePeriod) {
		if (newTroublePeriod != troublePeriod) {
			NotificationChain msgs = null;
			if (troublePeriod != null)
				msgs = ((InternalEObject)troublePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD, null, msgs);
			if (newTroublePeriod != null)
				msgs = ((InternalEObject)newTroublePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD, null, msgs);
			msgs = basicSetTroublePeriod(newTroublePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>First Call Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Call Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Call Date Time</em>' attribute.
	 * @see #isSetFirstCallDateTime()
	 * @see #unsetFirstCallDateTime()
	 * @see #setFirstCallDateTime(Date)
	 * @generated
	 */
	public Date getFirstCallDateTime() {
		return firstCallDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Call Date Time</em>' attribute.
	 * @see #isSetFirstCallDateTime()
	 * @see #unsetFirstCallDateTime()
	 * @see #getFirstCallDateTime()
	 * @generated
	 */
	public void setFirstCallDateTime(Date newFirstCallDateTime) {
		firstCallDateTime = newFirstCallDateTime;
		firstCallDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstCallDateTime()
	 * @see #getFirstCallDateTime()
	 * @see #setFirstCallDateTime(Date)
	 * @generated
	 */
	public void unsetFirstCallDateTime() {
		firstCallDateTime = FIRST_CALL_DATE_TIME_EDEFAULT;
		firstCallDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getFirstCallDateTime <em>First Call Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Call Date Time</em>' attribute is set.
	 * @see #unsetFirstCallDateTime()
	 * @see #getFirstCallDateTime()
	 * @see #setFirstCallDateTime(Date)
	 * @generated
	 */
	public boolean isSetFirstCallDateTime() {
		return firstCallDateTimeESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getEstimatedRestoreDateTime <em>Estimated Restore Date Time</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Inform Before Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inform Before Restored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inform Before Restored</em>' attribute.
	 * @see #isSetInformBeforeRestored()
	 * @see #unsetInformBeforeRestored()
	 * @see #setInformBeforeRestored(boolean)
	 * @generated
	 */
	public boolean isInformBeforeRestored() {
		return informBeforeRestored;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inform Before Restored</em>' attribute.
	 * @see #isSetInformBeforeRestored()
	 * @see #unsetInformBeforeRestored()
	 * @see #isInformBeforeRestored()
	 * @generated
	 */
	public void setInformBeforeRestored(boolean newInformBeforeRestored) {
		informBeforeRestored = newInformBeforeRestored;
		informBeforeRestoredESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInformBeforeRestored()
	 * @see #isInformBeforeRestored()
	 * @see #setInformBeforeRestored(boolean)
	 * @generated
	 */
	public void unsetInformBeforeRestored() {
		informBeforeRestored = INFORM_BEFORE_RESTORED_EDEFAULT;
		informBeforeRestoredESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformBeforeRestored <em>Inform Before Restored</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inform Before Restored</em>' attribute is set.
	 * @see #unsetInformBeforeRestored()
	 * @see #isInformBeforeRestored()
	 * @see #setInformBeforeRestored(boolean)
	 * @generated
	 */
	public boolean isSetInformBeforeRestored() {
		return informBeforeRestoredESet;
	}

	/**
	 * Returns the value of the '<em><b>Reporting Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @see #isSetReportingKind()
	 * @see #unsetReportingKind()
	 * @see #setReportingKind(TroubleReportingKind)
	 * @generated
	 */
	public TroubleReportingKind getReportingKind() {
		return reportingKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleReportingKind
	 * @see #isSetReportingKind()
	 * @see #unsetReportingKind()
	 * @see #getReportingKind()
	 * @generated
	 */
	public void setReportingKind(TroubleReportingKind newReportingKind) {
		reportingKind = newReportingKind == null ? REPORTING_KIND_EDEFAULT : newReportingKind;
		reportingKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReportingKind()
	 * @see #getReportingKind()
	 * @see #setReportingKind(TroubleReportingKind)
	 * @generated
	 */
	public void unsetReportingKind() {
		reportingKind = REPORTING_KIND_EDEFAULT;
		reportingKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getReportingKind <em>Reporting Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reporting Kind</em>' attribute is set.
	 * @see #unsetReportingKind()
	 * @see #getReportingKind()
	 * @see #setReportingKind(TroubleReportingKind)
	 * @generated
	 */
	public boolean isSetReportingKind() {
		return reportingKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(String newPriority) {
		priority = newPriority;
		priorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	public void unsetPriority() {
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(String)
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.Customer#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Data</em>' reference.
	 * @see #setCustomerData(Customer)
	 * @see CIM15.IEC61968.Customers.Customer#getTroubleTickets
	 * @generated
	 */
	public Customer getCustomerData() {
		if (customerData != null && customerData.eIsProxy()) {
			InternalEObject oldCustomerData = (InternalEObject)customerData;
			customerData = (Customer)eResolveProxy(oldCustomerData);
			if (customerData != oldCustomerData) {
			}
		}
		return customerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomerData() {
		return customerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerData(Customer newCustomerData, NotificationChain msgs) {
		Customer oldCustomerData = customerData;
		customerData = newCustomerData;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCustomerData <em>Customer Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Data</em>' reference.
	 * @see #getCustomerData()
	 * @generated
	 */
	public void setCustomerData(Customer newCustomerData) {
		if (newCustomerData != customerData) {
			NotificationChain msgs = null;
			if (customerData != null)
				msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs);
			if (newCustomerData != null)
				msgs = ((InternalEObject)newCustomerData).eInverseAdd(this, CustomersPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs);
			msgs = basicSetCustomerData(newCustomerData, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Inform After Restored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inform After Restored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inform After Restored</em>' attribute.
	 * @see #isSetInformAfterRestored()
	 * @see #unsetInformAfterRestored()
	 * @see #setInformAfterRestored(boolean)
	 * @generated
	 */
	public boolean isInformAfterRestored() {
		return informAfterRestored;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inform After Restored</em>' attribute.
	 * @see #isSetInformAfterRestored()
	 * @see #unsetInformAfterRestored()
	 * @see #isInformAfterRestored()
	 * @generated
	 */
	public void setInformAfterRestored(boolean newInformAfterRestored) {
		informAfterRestored = newInformAfterRestored;
		informAfterRestoredESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInformAfterRestored()
	 * @see #isInformAfterRestored()
	 * @see #setInformAfterRestored(boolean)
	 * @generated
	 */
	public void unsetInformAfterRestored() {
		informAfterRestored = INFORM_AFTER_RESTORED_EDEFAULT;
		informAfterRestoredESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isInformAfterRestored <em>Inform After Restored</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inform After Restored</em>' attribute is set.
	 * @see #unsetInformAfterRestored()
	 * @see #isInformAfterRestored()
	 * @see #setInformAfterRestored(boolean)
	 * @generated
	 */
	public boolean isSetInformAfterRestored() {
		return informAfterRestoredESet;
	}

	/**
	 * Returns the value of the '<em><b>Advice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice</em>' attribute.
	 * @see #isSetAdvice()
	 * @see #unsetAdvice()
	 * @see #setAdvice(String)
	 * @generated
	 */
	public String getAdvice() {
		return advice;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice</em>' attribute.
	 * @see #isSetAdvice()
	 * @see #unsetAdvice()
	 * @see #getAdvice()
	 * @generated
	 */
	public void setAdvice(String newAdvice) {
		advice = newAdvice;
		adviceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdvice()
	 * @see #getAdvice()
	 * @see #setAdvice(String)
	 * @generated
	 */
	public void unsetAdvice() {
		advice = ADVICE_EDEFAULT;
		adviceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getAdvice <em>Advice</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Advice</em>' attribute is set.
	 * @see #unsetAdvice()
	 * @see #getAdvice()
	 * @see #setAdvice(String)
	 * @generated
	 */
	public boolean isSetAdvice() {
		return adviceESet;
	}

	/**
	 * Returns the value of the '<em><b>Incident Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets <em>Trouble Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incident Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incident Record</em>' reference.
	 * @see #setIncidentRecord(IncidentRecord)
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets
	 * @generated
	 */
	public IncidentRecord getIncidentRecord() {
		if (incidentRecord != null && incidentRecord.eIsProxy()) {
			InternalEObject oldIncidentRecord = (InternalEObject)incidentRecord;
			incidentRecord = (IncidentRecord)eResolveProxy(oldIncidentRecord);
			if (incidentRecord != oldIncidentRecord) {
			}
		}
		return incidentRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentRecord basicGetIncidentRecord() {
		return incidentRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncidentRecord(IncidentRecord newIncidentRecord, NotificationChain msgs) {
		IncidentRecord oldIncidentRecord = incidentRecord;
		incidentRecord = newIncidentRecord;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incident Record</em>' reference.
	 * @see #getIncidentRecord()
	 * @generated
	 */
	public void setIncidentRecord(IncidentRecord newIncidentRecord) {
		if (newIncidentRecord != incidentRecord) {
			NotificationChain msgs = null;
			if (incidentRecord != null)
				msgs = ((InternalEObject)incidentRecord).eInverseRemove(this, InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS, IncidentRecord.class, msgs);
			if (newIncidentRecord != null)
				msgs = ((InternalEObject)newIncidentRecord).eInverseAdd(this, InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS, IncidentRecord.class, msgs);
			msgs = basicSetIncidentRecord(newIncidentRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Hazard Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Code</em>' attribute.
	 * @see #isSetHazardCode()
	 * @see #unsetHazardCode()
	 * @see #setHazardCode(String)
	 * @generated
	 */
	public String getHazardCode() {
		return hazardCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Code</em>' attribute.
	 * @see #isSetHazardCode()
	 * @see #unsetHazardCode()
	 * @see #getHazardCode()
	 * @generated
	 */
	public void setHazardCode(String newHazardCode) {
		hazardCode = newHazardCode;
		hazardCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHazardCode()
	 * @see #getHazardCode()
	 * @see #setHazardCode(String)
	 * @generated
	 */
	public void unsetHazardCode() {
		hazardCode = HAZARD_CODE_EDEFAULT;
		hazardCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getHazardCode <em>Hazard Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hazard Code</em>' attribute is set.
	 * @see #unsetHazardCode()
	 * @see #getHazardCode()
	 * @see #setHazardCode(String)
	 * @generated
	 */
	public boolean isSetHazardCode() {
		return hazardCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Call Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Back</em>' attribute.
	 * @see #isSetCallBack()
	 * @see #unsetCallBack()
	 * @see #setCallBack(boolean)
	 * @generated
	 */
	public boolean isCallBack() {
		return callBack;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Back</em>' attribute.
	 * @see #isSetCallBack()
	 * @see #unsetCallBack()
	 * @see #isCallBack()
	 * @generated
	 */
	public void setCallBack(boolean newCallBack) {
		callBack = newCallBack;
		callBackESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallBack()
	 * @see #isCallBack()
	 * @see #setCallBack(boolean)
	 * @generated
	 */
	public void unsetCallBack() {
		callBack = CALL_BACK_EDEFAULT;
		callBackESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#isCallBack <em>Call Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Call Back</em>' attribute is set.
	 * @see #unsetCallBack()
	 * @see #isCallBack()
	 * @see #setCallBack(boolean)
	 * @generated
	 */
	public boolean isSetCallBack() {
		return callBackESet;
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallBacks()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				if (customerData != null)
					msgs = ((InternalEObject)customerData).eInverseRemove(this, CustomersPackage.CUSTOMER__TROUBLE_TICKETS, Customer.class, msgs);
				return basicSetCustomerData((Customer)otherEnd, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				if (incidentRecord != null)
					msgs = ((InternalEObject)incidentRecord).eInverseRemove(this, InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS, IncidentRecord.class, msgs);
				return basicSetIncidentRecord((IncidentRecord)otherEnd, msgs);
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return ((InternalEList<?>)getCallBacks()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				return basicSetTroublePeriod(null, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				return basicSetCustomerData(null, msgs);
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				return basicSetIncidentRecord(null, msgs);
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return getCallBacks();
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				return getTroublePeriod();
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				return getFirstCallDateTime();
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				return getEstimatedRestoreDateTime();
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				return isInformBeforeRestored();
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				return getReportingKind();
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				return getPriority();
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				if (resolve) return getCustomerData();
				return basicGetCustomerData();
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				return isInformAfterRestored();
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				return getAdvice();
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				if (resolve) return getIncidentRecord();
				return basicGetIncidentRecord();
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				return getHazardCode();
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				return isCallBack();
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				getCallBacks().clear();
				getCallBacks().addAll((Collection<? extends CallBack>)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				setTroublePeriod((DateTimeInterval)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				setFirstCallDateTime((Date)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				setEstimatedRestoreDateTime((Date)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				setInformBeforeRestored((Boolean)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				setReportingKind((TroubleReportingKind)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				setPriority((String)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				setCustomerData((Customer)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				setInformAfterRestored((Boolean)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				setAdvice((String)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				setIncidentRecord((IncidentRecord)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				setHazardCode((String)newValue);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				setCallBack((Boolean)newValue);
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				getCallBacks().clear();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				setTroublePeriod((DateTimeInterval)null);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				unsetFirstCallDateTime();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				unsetEstimatedRestoreDateTime();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				unsetInformBeforeRestored();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				unsetReportingKind();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				unsetPriority();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				setCustomerData((Customer)null);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				unsetInformAfterRestored();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				unsetAdvice();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				setIncidentRecord((IncidentRecord)null);
				return;
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				unsetHazardCode();
				return;
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				unsetCallBack();
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
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACKS:
				return callBacks != null && !callBacks.isEmpty();
			case InfOperationsPackage.TROUBLE_TICKET__TROUBLE_PERIOD:
				return troublePeriod != null;
			case InfOperationsPackage.TROUBLE_TICKET__FIRST_CALL_DATE_TIME:
				return isSetFirstCallDateTime();
			case InfOperationsPackage.TROUBLE_TICKET__ESTIMATED_RESTORE_DATE_TIME:
				return isSetEstimatedRestoreDateTime();
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_BEFORE_RESTORED:
				return isSetInformBeforeRestored();
			case InfOperationsPackage.TROUBLE_TICKET__REPORTING_KIND:
				return isSetReportingKind();
			case InfOperationsPackage.TROUBLE_TICKET__PRIORITY:
				return isSetPriority();
			case InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA:
				return customerData != null;
			case InfOperationsPackage.TROUBLE_TICKET__INFORM_AFTER_RESTORED:
				return isSetInformAfterRestored();
			case InfOperationsPackage.TROUBLE_TICKET__ADVICE:
				return isSetAdvice();
			case InfOperationsPackage.TROUBLE_TICKET__INCIDENT_RECORD:
				return incidentRecord != null;
			case InfOperationsPackage.TROUBLE_TICKET__HAZARD_CODE:
				return isSetHazardCode();
			case InfOperationsPackage.TROUBLE_TICKET__CALL_BACK:
				return isSetCallBack();
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
		result.append(" (firstCallDateTime: ");
		if (firstCallDateTimeESet) result.append(firstCallDateTime); else result.append("<unset>");
		result.append(", estimatedRestoreDateTime: ");
		if (estimatedRestoreDateTimeESet) result.append(estimatedRestoreDateTime); else result.append("<unset>");
		result.append(", informBeforeRestored: ");
		if (informBeforeRestoredESet) result.append(informBeforeRestored); else result.append("<unset>");
		result.append(", reportingKind: ");
		if (reportingKindESet) result.append(reportingKind); else result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", informAfterRestored: ");
		if (informAfterRestoredESet) result.append(informAfterRestored); else result.append("<unset>");
		result.append(", advice: ");
		if (adviceESet) result.append(advice); else result.append("<unset>");
		result.append(", hazardCode: ");
		if (hazardCodeESet) result.append(hazardCode); else result.append("<unset>");
		result.append(", callBack: ");
		if (callBackESet) result.append(callBack); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TroubleTicket
