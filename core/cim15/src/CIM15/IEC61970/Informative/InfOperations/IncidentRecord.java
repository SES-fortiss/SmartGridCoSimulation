/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;

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
 * A representation of the model object '<em><b>Incident Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod <em>Period</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getIncidentCodes <em>Incident Codes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncidentRecord extends Document {
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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval period;

	/**
	 * The cached value of the '{@link #getIncidentCodes() <em>Incident Codes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<IncidentCode> incidentCodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncidentRecord() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.INCIDENT_RECORD;
	}

	/**
	 * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord <em>Incident Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trouble Tickets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.TroubleTicket#getIncidentRecord
	 * @generated
	 */
	public EList<TroubleTicket> getTroubleTickets() {
		if (troubleTickets == null) {
			troubleTickets = new BasicInternalEList<TroubleTicket>(TroubleTicket.class);
		}
		return troubleTickets;
	}

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(DateTimeInterval newPeriod, NotificationChain msgs) {
		DateTimeInterval oldPeriod = period;
		period = newPeriod;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.IncidentRecord#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	public void setPeriod(DateTimeInterval newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.INCIDENT_RECORD__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.INCIDENT_RECORD__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Incident Codes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.IncidentCode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords <em>Incident Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incident Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incident Codes</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.IncidentCode#getIncidentRecords
	 * @generated
	 */
	public EList<IncidentCode> getIncidentCodes() {
		if (incidentCodes == null) {
			incidentCodes = new BasicInternalEList<IncidentCode>(IncidentCode.class);
		}
		return incidentCodes;
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
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTroubleTickets()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncidentCodes()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return ((InternalEList<?>)getTroubleTickets()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				return basicSetPeriod(null, msgs);
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return ((InternalEList<?>)getIncidentCodes()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return getTroubleTickets();
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				return getPeriod();
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return getIncidentCodes();
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
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				getTroubleTickets().addAll((Collection<? extends TroubleTicket>)newValue);
				return;
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				setPeriod((DateTimeInterval)newValue);
				return;
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				getIncidentCodes().clear();
				getIncidentCodes().addAll((Collection<? extends IncidentCode>)newValue);
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
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				return;
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				setPeriod((DateTimeInterval)null);
				return;
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				getIncidentCodes().clear();
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
			case InfOperationsPackage.INCIDENT_RECORD__TROUBLE_TICKETS:
				return troubleTickets != null && !troubleTickets.isEmpty();
			case InfOperationsPackage.INCIDENT_RECORD__PERIOD:
				return period != null;
			case InfOperationsPackage.INCIDENT_RECORD__INCIDENT_CODES:
				return incidentCodes != null && !incidentCodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // IncidentRecord
