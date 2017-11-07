/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfCommon.InfCommonPackage;
import CIM15.IEC61970.Informative.InfCommon.ScheduledEvent;

import CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;

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
 * A representation of the model object '<em><b>Activity Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getDocuments <em>Documents</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityRecord extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

	/**
	 * This is true if the Severity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean severityESet;

	/**
	 * The default value of the '{@link #getCreatedDateTime() <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDateTime() <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date createdDateTime = CREATED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Created Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createdDateTimeESet;

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
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> organisations;

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

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
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * This is true if the Reason attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonESet;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet;

	/**
	 * The cached value of the '{@link #getScheduledEvent() <em>Scheduled Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvent()
	 * @generated
	 * @ordered
	 */
	protected ScheduledEvent scheduledEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityRecord() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ACTIVITY_RECORD;
	}

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #setSeverity(String)
	 * @generated
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @generated
	 */
	public void setSeverity(String newSeverity) {
		severity = newSeverity;
		severityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(String)
	 * @generated
	 */
	public void unsetSeverity() {
		severity = SEVERITY_EDEFAULT;
		severityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getSeverity <em>Severity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Severity</em>' attribute is set.
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(String)
	 * @generated
	 */
	public boolean isSetSeverity() {
		return severityESet;
	}

	/**
	 * Returns the value of the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date Time</em>' attribute.
	 * @see #isSetCreatedDateTime()
	 * @see #unsetCreatedDateTime()
	 * @see #setCreatedDateTime(Date)
	 * @generated
	 */
	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date Time</em>' attribute.
	 * @see #isSetCreatedDateTime()
	 * @see #unsetCreatedDateTime()
	 * @see #getCreatedDateTime()
	 * @generated
	 */
	public void setCreatedDateTime(Date newCreatedDateTime) {
		createdDateTime = newCreatedDateTime;
		createdDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreatedDateTime()
	 * @see #getCreatedDateTime()
	 * @see #setCreatedDateTime(Date)
	 * @generated
	 */
	public void unsetCreatedDateTime() {
		createdDateTime = CREATED_DATE_TIME_EDEFAULT;
		createdDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getCreatedDateTime <em>Created Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Created Date Time</em>' attribute is set.
	 * @see #unsetCreatedDateTime()
	 * @see #getCreatedDateTime()
	 * @see #setCreatedDateTime(Date)
	 * @generated
	 */
	public boolean isSetCreatedDateTime() {
		return createdDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Persons</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Persons</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getActivityRecords
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new BasicInternalEList<ErpPerson>(ErpPerson.class);
		}
		return erpPersons;
	}

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getActivityRecords
	 * @generated
	 */
	public EList<ErpOrganisation> getOrganisations() {
		if (organisations == null) {
			organisations = new BasicInternalEList<ErpOrganisation>(ErpOrganisation.class);
		}
		return organisations;
	}

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Document#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see CIM15.IEC61968.Common.Document#getActivityRecords
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new BasicInternalEList<Document>(Document.class);
		}
		return documents;
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getActivityRecords <em>Activity Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getActivityRecords
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ACTIVITY_RECORD__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ACTIVITY_RECORD__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #getReason()
	 * @generated
	 */
	public void setReason(String newReason) {
		reason = newReason;
		reasonESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public void unsetReason() {
		reason = REASON_EDEFAULT;
		reasonESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getReason <em>Reason</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason</em>' attribute is set.
	 * @see #unsetReason()
	 * @see #getReason()
	 * @see #setReason(String)
	 * @generated
	 */
	public boolean isSetReason() {
		return reasonESet;
	}

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	public void setCategory(String newCategory) {
		category = newCategory;
		categoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public void unsetCategory() {
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(String)
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * Returns the value of the '<em><b>Scheduled Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord <em>Activity Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Event</em>' reference.
	 * @see #setScheduledEvent(ScheduledEvent)
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord
	 * @generated
	 */
	public ScheduledEvent getScheduledEvent() {
		if (scheduledEvent != null && scheduledEvent.eIsProxy()) {
			InternalEObject oldScheduledEvent = (InternalEObject)scheduledEvent;
			scheduledEvent = (ScheduledEvent)eResolveProxy(oldScheduledEvent);
			if (scheduledEvent != oldScheduledEvent) {
			}
		}
		return scheduledEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvent basicGetScheduledEvent() {
		return scheduledEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledEvent(ScheduledEvent newScheduledEvent, NotificationChain msgs) {
		ScheduledEvent oldScheduledEvent = scheduledEvent;
		scheduledEvent = newScheduledEvent;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Event</em>' reference.
	 * @see #getScheduledEvent()
	 * @generated
	 */
	public void setScheduledEvent(ScheduledEvent newScheduledEvent) {
		if (newScheduledEvent != scheduledEvent) {
			NotificationChain msgs = null;
			if (scheduledEvent != null)
				msgs = ((InternalEObject)scheduledEvent).eInverseRemove(this, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, ScheduledEvent.class, msgs);
			if (newScheduledEvent != null)
				msgs = ((InternalEObject)newScheduledEvent).eInverseAdd(this, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, ScheduledEvent.class, msgs);
			msgs = basicSetScheduledEvent(newScheduledEvent, msgs);
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
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				if (scheduledEvent != null)
					msgs = ((InternalEObject)scheduledEvent).eInverseRemove(this, InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD, ScheduledEvent.class, msgs);
				return basicSetScheduledEvent((ScheduledEvent)otherEnd, msgs);
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
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				return basicSetStatus(null, msgs);
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				return basicSetScheduledEvent(null, msgs);
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
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				return getSeverity();
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				return getCreatedDateTime();
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				return getErpPersons();
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return getOrganisations();
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return getDocuments();
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return getAssets();
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				return getStatus();
			case CommonPackage.ACTIVITY_RECORD__REASON:
				return getReason();
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				return getCategory();
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				if (resolve) return getScheduledEvent();
				return basicGetScheduledEvent();
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
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				setSeverity((String)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				setCreatedDateTime((Date)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__REASON:
				setReason((String)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				setCategory((String)newValue);
				return;
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				setScheduledEvent((ScheduledEvent)newValue);
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
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				unsetSeverity();
				return;
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				unsetCreatedDateTime();
				return;
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				getDocuments().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				getAssets().clear();
				return;
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.ACTIVITY_RECORD__REASON:
				unsetReason();
				return;
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				unsetCategory();
				return;
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				setScheduledEvent((ScheduledEvent)null);
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
			case CommonPackage.ACTIVITY_RECORD__SEVERITY:
				return isSetSeverity();
			case CommonPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
				return isSetCreatedDateTime();
			case CommonPackage.ACTIVITY_RECORD__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__ASSETS:
				return assets != null && !assets.isEmpty();
			case CommonPackage.ACTIVITY_RECORD__STATUS:
				return status != null;
			case CommonPackage.ACTIVITY_RECORD__REASON:
				return isSetReason();
			case CommonPackage.ACTIVITY_RECORD__CATEGORY:
				return isSetCategory();
			case CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT:
				return scheduledEvent != null;
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
		result.append(" (severity: ");
		if (severityESet) result.append(severity); else result.append("<unset>");
		result.append(", createdDateTime: ");
		if (createdDateTimeESet) result.append(createdDateTime); else result.append("<unset>");
		result.append(", reason: ");
		if (reasonESet) result.append(reason); else result.append("<unset>");
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ActivityRecord
