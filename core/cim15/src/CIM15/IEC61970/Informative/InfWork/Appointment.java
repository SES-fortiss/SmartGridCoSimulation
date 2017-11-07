/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.StreetAddress;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfCommon.ScheduledEvent;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;

import CIM15.IEC61970.Informative.InfOperations.CallBack;
import CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Appointment#getAddress <em>Address</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Appointment#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Appointment#getMeetingInterval <em>Meeting Interval</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Appointment extends ScheduledEvent {
	/**
	 * The default value of the '{@link #isCallAhead() <em>Call Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallAhead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_AHEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallAhead() <em>Call Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallAhead()
	 * @generated
	 * @ordered
	 */
	protected boolean callAhead = CALL_AHEAD_EDEFAULT;

	/**
	 * This is true if the Call Ahead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callAheadESet;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress address;

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
	 * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected String remark = REMARK_EDEFAULT;

	/**
	 * This is true if the Remark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remarkESet;

	/**
	 * The cached value of the '{@link #getMeetingInterval() <em>Meeting Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeetingInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval meetingInterval;

	/**
	 * The cached value of the '{@link #getCallBack() <em>Call Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBack()
	 * @generated
	 * @ordered
	 */
	protected CallBack callBack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Appointment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.APPOINTMENT;
	}

	/**
	 * Returns the value of the '<em><b>Call Ahead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Ahead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Ahead</em>' attribute.
	 * @see #isSetCallAhead()
	 * @see #unsetCallAhead()
	 * @see #setCallAhead(boolean)
	 * @generated
	 */
	public boolean isCallAhead() {
		return callAhead;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Ahead</em>' attribute.
	 * @see #isSetCallAhead()
	 * @see #unsetCallAhead()
	 * @see #isCallAhead()
	 * @generated
	 */
	public void setCallAhead(boolean newCallAhead) {
		callAhead = newCallAhead;
		callAheadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallAhead()
	 * @see #isCallAhead()
	 * @see #setCallAhead(boolean)
	 * @generated
	 */
	public void unsetCallAhead() {
		callAhead = CALL_AHEAD_EDEFAULT;
		callAheadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#isCallAhead <em>Call Ahead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Call Ahead</em>' attribute is set.
	 * @see #unsetCallAhead()
	 * @see #isCallAhead()
	 * @see #setCallAhead(boolean)
	 * @generated
	 */
	public boolean isSetCallAhead() {
		return callAheadESet;
	}

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(StreetAddress)
	 * @generated
	 */
	public StreetAddress getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(StreetAddress newAddress, NotificationChain msgs) {
		StreetAddress oldAddress = address;
		address = newAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	public void setAddress(StreetAddress newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.APPOINTMENT__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.APPOINTMENT__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getAppointments
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new BasicInternalEList<ErpPerson>(ErpPerson.class);
		}
		return erpPersons;
	}

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #isSetRemark()
	 * @see #unsetRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #isSetRemark()
	 * @see #unsetRemark()
	 * @see #getRemark()
	 * @generated
	 */
	public void setRemark(String newRemark) {
		remark = newRemark;
		remarkESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemark()
	 * @see #getRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public void unsetRemark() {
		remark = REMARK_EDEFAULT;
		remarkESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getRemark <em>Remark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remark</em>' attribute is set.
	 * @see #unsetRemark()
	 * @see #getRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public boolean isSetRemark() {
		return remarkESet;
	}

	/**
	 * Returns the value of the '<em><b>Meeting Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meeting Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meeting Interval</em>' containment reference.
	 * @see #setMeetingInterval(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getMeetingInterval() {
		return meetingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeetingInterval(DateTimeInterval newMeetingInterval, NotificationChain msgs) {
		DateTimeInterval oldMeetingInterval = meetingInterval;
		meetingInterval = newMeetingInterval;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getMeetingInterval <em>Meeting Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meeting Interval</em>' containment reference.
	 * @see #getMeetingInterval()
	 * @generated
	 */
	public void setMeetingInterval(DateTimeInterval newMeetingInterval) {
		if (newMeetingInterval != meetingInterval) {
			NotificationChain msgs = null;
			if (meetingInterval != null)
				msgs = ((InternalEObject)meetingInterval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.APPOINTMENT__MEETING_INTERVAL, null, msgs);
			if (newMeetingInterval != null)
				msgs = ((InternalEObject)newMeetingInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.APPOINTMENT__MEETING_INTERVAL, null, msgs);
			msgs = basicSetMeetingInterval(newMeetingInterval, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Call Back</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.CallBack#getAppointments <em>Appointments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Back</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Back</em>' reference.
	 * @see #setCallBack(CallBack)
	 * @see CIM15.IEC61970.Informative.InfOperations.CallBack#getAppointments
	 * @generated
	 */
	public CallBack getCallBack() {
		if (callBack != null && callBack.eIsProxy()) {
			InternalEObject oldCallBack = (InternalEObject)callBack;
			callBack = (CallBack)eResolveProxy(oldCallBack);
			if (callBack != oldCallBack) {
			}
		}
		return callBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBack basicGetCallBack() {
		return callBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallBack(CallBack newCallBack, NotificationChain msgs) {
		CallBack oldCallBack = callBack;
		callBack = newCallBack;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.Appointment#getCallBack <em>Call Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Back</em>' reference.
	 * @see #getCallBack()
	 * @generated
	 */
	public void setCallBack(CallBack newCallBack) {
		if (newCallBack != callBack) {
			NotificationChain msgs = null;
			if (callBack != null)
				msgs = ((InternalEObject)callBack).eInverseRemove(this, InfOperationsPackage.CALL_BACK__APPOINTMENTS, CallBack.class, msgs);
			if (newCallBack != null)
				msgs = ((InternalEObject)newCallBack).eInverseAdd(this, InfOperationsPackage.CALL_BACK__APPOINTMENTS, CallBack.class, msgs);
			msgs = basicSetCallBack(newCallBack, msgs);
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
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				if (callBack != null)
					msgs = ((InternalEObject)callBack).eInverseRemove(this, InfOperationsPackage.CALL_BACK__APPOINTMENTS, CallBack.class, msgs);
				return basicSetCallBack((CallBack)otherEnd, msgs);
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
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				return basicSetAddress(null, msgs);
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				return basicSetMeetingInterval(null, msgs);
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				return basicSetCallBack(null, msgs);
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
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				return isCallAhead();
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				return getAddress();
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return getErpPersons();
			case InfWorkPackage.APPOINTMENT__REMARK:
				return getRemark();
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				return getMeetingInterval();
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				if (resolve) return getCallBack();
				return basicGetCallBack();
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
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				setCallAhead((Boolean)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				setAddress((StreetAddress)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__REMARK:
				setRemark((String)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				setMeetingInterval((DateTimeInterval)newValue);
				return;
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				setCallBack((CallBack)newValue);
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
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				unsetCallAhead();
				return;
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				setAddress((StreetAddress)null);
				return;
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case InfWorkPackage.APPOINTMENT__REMARK:
				unsetRemark();
				return;
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				setMeetingInterval((DateTimeInterval)null);
				return;
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				setCallBack((CallBack)null);
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
			case InfWorkPackage.APPOINTMENT__CALL_AHEAD:
				return isSetCallAhead();
			case InfWorkPackage.APPOINTMENT__ADDRESS:
				return address != null;
			case InfWorkPackage.APPOINTMENT__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case InfWorkPackage.APPOINTMENT__REMARK:
				return isSetRemark();
			case InfWorkPackage.APPOINTMENT__MEETING_INTERVAL:
				return meetingInterval != null;
			case InfWorkPackage.APPOINTMENT__CALL_BACK:
				return callBack != null;
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
		result.append(" (callAhead: ");
		if (callAheadESet) result.append(callAhead); else result.append("<unset>");
		result.append(", remark: ");
		if (remarkESet) result.append(remark); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Appointment
