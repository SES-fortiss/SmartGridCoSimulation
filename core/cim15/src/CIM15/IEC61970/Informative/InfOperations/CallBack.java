/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM15.IEC61970.Informative.InfWork.Appointment;

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
 * A representation of the model object '<em><b>Call Back</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallBack extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointments()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointments;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateTimeESet;

	/**
	 * The cached value of the '{@link #getErpPersons() <em>Erp Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPerson> erpPersons;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * This is true if the Comment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commentESet;

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
	 * The cached value of the '{@link #getTroubleTickets() <em>Trouble Tickets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroubleTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<TroubleTicket> troubleTickets;

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
	 * The default value of the '{@link #getContactDetail() <em>Contact Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactDetail() <em>Contact Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactDetail()
	 * @generated
	 * @ordered
	 */
	protected String contactDetail = CONTACT_DETAIL_EDEFAULT;

	/**
	 * This is true if the Contact Detail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contactDetailESet;

	/**
	 * The default value of the '{@link #getProblemInfo() <em>Problem Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBLEM_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProblemInfo() <em>Problem Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemInfo()
	 * @generated
	 * @ordered
	 */
	protected String problemInfo = PROBLEM_INFO_EDEFAULT;

	/**
	 * This is true if the Problem Info attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean problemInfoESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallBack() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.CALL_BACK;
	}

	/**
	 * Returns the value of the '<em><b>Appointments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Appointment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appointments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointments</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Appointment#getCallBack
	 * @generated
	 */
	public EList<Appointment> getAppointments() {
		if (appointments == null) {
			appointments = new BasicInternalEList<Appointment>(Appointment.class);
		}
		return appointments;
	}

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		dateTime = newDateTime;
		dateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public void unsetDateTime() {
		dateTime = DATE_TIME_EDEFAULT;
		dateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getDateTime <em>Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date Time</em>' attribute is set.
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public boolean isSetDateTime() {
		return dateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getCallBacks
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new BasicInternalEList<ErpPerson>(ErpPerson.class);
		}
		return erpPersons;
	}

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #setComment(String)
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #getComment()
	 * @generated
	 */
	public void setComment(String newComment) {
		comment = newComment;
		commentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	public void unsetComment() {
		comment = COMMENT_EDEFAULT;
		commentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getComment <em>Comment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comment</em>' attribute is set.
	 * @see #unsetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	public boolean isSetComment() {
		return commentESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAdvice <em>Advice</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Tickets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getCallBacks
	 * @generated
	 */
	public EList<TroubleTicket> getTroubleTickets() {
		if (troubleTickets == null) {
			troubleTickets = new BasicInternalEList<TroubleTicket>(TroubleTicket.class);
		}
		return troubleTickets;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.CALL_BACK__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.CALL_BACK__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Contact Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Detail</em>' attribute.
	 * @see #isSetContactDetail()
	 * @see #unsetContactDetail()
	 * @see #setContactDetail(String)
	 * @generated
	 */
	public String getContactDetail() {
		return contactDetail;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Detail</em>' attribute.
	 * @see #isSetContactDetail()
	 * @see #unsetContactDetail()
	 * @see #getContactDetail()
	 * @generated
	 */
	public void setContactDetail(String newContactDetail) {
		contactDetail = newContactDetail;
		contactDetailESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContactDetail()
	 * @see #getContactDetail()
	 * @see #setContactDetail(String)
	 * @generated
	 */
	public void unsetContactDetail() {
		contactDetail = CONTACT_DETAIL_EDEFAULT;
		contactDetailESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getContactDetail <em>Contact Detail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contact Detail</em>' attribute is set.
	 * @see #unsetContactDetail()
	 * @see #getContactDetail()
	 * @see #setContactDetail(String)
	 * @generated
	 */
	public boolean isSetContactDetail() {
		return contactDetailESet;
	}

	/**
	 * Returns the value of the '<em><b>Problem Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Info</em>' attribute.
	 * @see #isSetProblemInfo()
	 * @see #unsetProblemInfo()
	 * @see #setProblemInfo(String)
	 * @generated
	 */
	public String getProblemInfo() {
		return problemInfo;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Info</em>' attribute.
	 * @see #isSetProblemInfo()
	 * @see #unsetProblemInfo()
	 * @see #getProblemInfo()
	 * @generated
	 */
	public void setProblemInfo(String newProblemInfo) {
		problemInfo = newProblemInfo;
		problemInfoESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProblemInfo()
	 * @see #getProblemInfo()
	 * @see #setProblemInfo(String)
	 * @generated
	 */
	public void unsetProblemInfo() {
		problemInfo = PROBLEM_INFO_EDEFAULT;
		problemInfoESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getProblemInfo <em>Problem Info</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Problem Info</em>' attribute is set.
	 * @see #unsetProblemInfo()
	 * @see #getProblemInfo()
	 * @see #setProblemInfo(String)
	 * @generated
	 */
	public boolean isSetProblemInfo() {
		return problemInfoESet;
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
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppointments()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTroubleTickets()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return ((InternalEList<?>)getAppointments()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return ((InternalEList<?>)getTroubleTickets()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.CALL_BACK__STATUS:
				return basicSetStatus(null, msgs);
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
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return getAppointments();
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				return getDateTime();
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return getErpPersons();
			case InfOperationsPackage.CALL_BACK__COMMENT:
				return getComment();
			case InfOperationsPackage.CALL_BACK__ADVICE:
				return getAdvice();
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return getTroubleTickets();
			case InfOperationsPackage.CALL_BACK__STATUS:
				return getStatus();
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				return getContactDetail();
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				return getProblemInfo();
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
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				getAppointments().clear();
				getAppointments().addAll((Collection<? extends Appointment>)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__COMMENT:
				setComment((String)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__ADVICE:
				setAdvice((String)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				getTroubleTickets().addAll((Collection<? extends TroubleTicket>)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				setContactDetail((String)newValue);
				return;
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				setProblemInfo((String)newValue);
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
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				getAppointments().clear();
				return;
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				unsetDateTime();
				return;
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case InfOperationsPackage.CALL_BACK__COMMENT:
				unsetComment();
				return;
			case InfOperationsPackage.CALL_BACK__ADVICE:
				unsetAdvice();
				return;
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				return;
			case InfOperationsPackage.CALL_BACK__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				unsetContactDetail();
				return;
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				unsetProblemInfo();
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
			case InfOperationsPackage.CALL_BACK__APPOINTMENTS:
				return appointments != null && !appointments.isEmpty();
			case InfOperationsPackage.CALL_BACK__DATE_TIME:
				return isSetDateTime();
			case InfOperationsPackage.CALL_BACK__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case InfOperationsPackage.CALL_BACK__COMMENT:
				return isSetComment();
			case InfOperationsPackage.CALL_BACK__ADVICE:
				return isSetAdvice();
			case InfOperationsPackage.CALL_BACK__TROUBLE_TICKETS:
				return troubleTickets != null && !troubleTickets.isEmpty();
			case InfOperationsPackage.CALL_BACK__STATUS:
				return status != null;
			case InfOperationsPackage.CALL_BACK__CONTACT_DETAIL:
				return isSetContactDetail();
			case InfOperationsPackage.CALL_BACK__PROBLEM_INFO:
				return isSetProblemInfo();
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
		result.append(" (dateTime: ");
		if (dateTimeESet) result.append(dateTime); else result.append("<unset>");
		result.append(", comment: ");
		if (commentESet) result.append(comment); else result.append("<unset>");
		result.append(", advice: ");
		if (adviceESet) result.append(advice); else result.append("<unset>");
		result.append(", contactDetail: ");
		if (contactDetailESet) result.append(contactDetail); else result.append("<unset>");
		result.append(", problemInfo: ");
		if (problemInfoESet) result.append(problemInfo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CallBack
