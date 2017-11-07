/**
 */
package CIM15.IEC61970.Informative.InfCommon;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61968.Common.ActivityRecord;
import CIM15.IEC61968.Common.CommonPackage;
import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Status;
import CIM15.IEC61968.Common.TimePoint;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument <em>Document</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord <em>Activity Record</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint <em>Time Point</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDuration <em>Duration</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo <em>Schedule Parameter Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getAssets <em>Assets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduledEvent extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;

	/**
	 * The cached value of the '{@link #getActivityRecord() <em>Activity Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRecord()
	 * @generated
	 * @ordered
	 */
	protected ActivityRecord activityRecord;

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
	 * The cached value of the '{@link #getTimePoint() <em>Time Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePoint()
	 * @generated
	 * @ordered
	 */
	protected TimePoint timePoint;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * This is true if the Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationESet;

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
	 * The cached value of the '{@link #getScheduleParameterInfo() <em>Schedule Parameter Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleParameterInfo()
	 * @generated
	 * @ordered
	 */
	protected ScheduleParameterInfo scheduleParameterInfo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledEvent() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.SCHEDULED_EVENT;
	}

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Document#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see CIM15.IEC61968.Common.Document#getScheduledEvents
	 * @generated
	 */
	public Document getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (Document)eResolveProxy(oldDocument);
			if (document != oldDocument) {
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		Document oldDocument = document;
		document = newDocument;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__SCHEDULED_EVENTS, Document.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, CommonPackage.DOCUMENT__SCHEDULED_EVENTS, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Activity Record</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.ActivityRecord#getScheduledEvent <em>Scheduled Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Record</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Record</em>' reference.
	 * @see #setActivityRecord(ActivityRecord)
	 * @see CIM15.IEC61968.Common.ActivityRecord#getScheduledEvent
	 * @generated
	 */
	public ActivityRecord getActivityRecord() {
		if (activityRecord != null && activityRecord.eIsProxy()) {
			InternalEObject oldActivityRecord = (InternalEObject)activityRecord;
			activityRecord = (ActivityRecord)eResolveProxy(oldActivityRecord);
			if (activityRecord != oldActivityRecord) {
			}
		}
		return activityRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityRecord basicGetActivityRecord() {
		return activityRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityRecord(ActivityRecord newActivityRecord, NotificationChain msgs) {
		ActivityRecord oldActivityRecord = activityRecord;
		activityRecord = newActivityRecord;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getActivityRecord <em>Activity Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Record</em>' reference.
	 * @see #getActivityRecord()
	 * @generated
	 */
	public void setActivityRecord(ActivityRecord newActivityRecord) {
		if (newActivityRecord != activityRecord) {
			NotificationChain msgs = null;
			if (activityRecord != null)
				msgs = ((InternalEObject)activityRecord).eInverseRemove(this, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, ActivityRecord.class, msgs);
			if (newActivityRecord != null)
				msgs = ((InternalEObject)newActivityRecord).eInverseAdd(this, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, ActivityRecord.class, msgs);
			msgs = basicSetActivityRecord(newActivityRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULED_EVENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SCHEDULED_EVENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Time Point</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.TimePoint#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Point</em>' reference.
	 * @see #setTimePoint(TimePoint)
	 * @see CIM15.IEC61968.Common.TimePoint#getScheduledEvents
	 * @generated
	 */
	public TimePoint getTimePoint() {
		if (timePoint != null && timePoint.eIsProxy()) {
			InternalEObject oldTimePoint = (InternalEObject)timePoint;
			timePoint = (TimePoint)eResolveProxy(oldTimePoint);
			if (timePoint != oldTimePoint) {
			}
		}
		return timePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint basicGetTimePoint() {
		return timePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePoint(TimePoint newTimePoint, NotificationChain msgs) {
		TimePoint oldTimePoint = timePoint;
		timePoint = newTimePoint;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getTimePoint <em>Time Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Point</em>' reference.
	 * @see #getTimePoint()
	 * @generated
	 */
	public void setTimePoint(TimePoint newTimePoint) {
		if (newTimePoint != timePoint) {
			NotificationChain msgs = null;
			if (timePoint != null)
				msgs = ((InternalEObject)timePoint).eInverseRemove(this, CommonPackage.TIME_POINT__SCHEDULED_EVENTS, TimePoint.class, msgs);
			if (newTimePoint != null)
				msgs = ((InternalEObject)newTimePoint).eInverseAdd(this, CommonPackage.TIME_POINT__SCHEDULED_EVENTS, TimePoint.class, msgs);
			msgs = basicSetTimePoint(newTimePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	public void setDuration(float newDuration) {
		duration = newDuration;
		durationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	public void unsetDuration() {
		duration = DURATION_EDEFAULT;
		durationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	public boolean isSetDuration() {
		return durationESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getCategory <em>Category</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getCategory <em>Category</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getCategory <em>Category</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Schedule Parameter Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Parameter Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Parameter Info</em>' reference.
	 * @see #setScheduleParameterInfo(ScheduleParameterInfo)
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getScheduledEvents
	 * @generated
	 */
	public ScheduleParameterInfo getScheduleParameterInfo() {
		if (scheduleParameterInfo != null && scheduleParameterInfo.eIsProxy()) {
			InternalEObject oldScheduleParameterInfo = (InternalEObject)scheduleParameterInfo;
			scheduleParameterInfo = (ScheduleParameterInfo)eResolveProxy(oldScheduleParameterInfo);
			if (scheduleParameterInfo != oldScheduleParameterInfo) {
			}
		}
		return scheduleParameterInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleParameterInfo basicGetScheduleParameterInfo() {
		return scheduleParameterInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleParameterInfo(ScheduleParameterInfo newScheduleParameterInfo, NotificationChain msgs) {
		ScheduleParameterInfo oldScheduleParameterInfo = scheduleParameterInfo;
		scheduleParameterInfo = newScheduleParameterInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getScheduleParameterInfo <em>Schedule Parameter Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Parameter Info</em>' reference.
	 * @see #getScheduleParameterInfo()
	 * @generated
	 */
	public void setScheduleParameterInfo(ScheduleParameterInfo newScheduleParameterInfo) {
		if (newScheduleParameterInfo != scheduleParameterInfo) {
			NotificationChain msgs = null;
			if (scheduleParameterInfo != null)
				msgs = ((InternalEObject)scheduleParameterInfo).eInverseRemove(this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS, ScheduleParameterInfo.class, msgs);
			if (newScheduleParameterInfo != null)
				msgs = ((InternalEObject)newScheduleParameterInfo).eInverseAdd(this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS, ScheduleParameterInfo.class, msgs);
			msgs = basicSetScheduleParameterInfo(newScheduleParameterInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getScheduledEvents <em>Scheduled Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getScheduledEvents
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__SCHEDULED_EVENTS, Document.class, msgs);
				return basicSetDocument((Document)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				if (activityRecord != null)
					msgs = ((InternalEObject)activityRecord).eInverseRemove(this, CommonPackage.ACTIVITY_RECORD__SCHEDULED_EVENT, ActivityRecord.class, msgs);
				return basicSetActivityRecord((ActivityRecord)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				if (timePoint != null)
					msgs = ((InternalEObject)timePoint).eInverseRemove(this, CommonPackage.TIME_POINT__SCHEDULED_EVENTS, TimePoint.class, msgs);
				return basicSetTimePoint((TimePoint)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				if (scheduleParameterInfo != null)
					msgs = ((InternalEObject)scheduleParameterInfo).eInverseRemove(this, InfCommonPackage.SCHEDULE_PARAMETER_INFO__SCHEDULED_EVENTS, ScheduleParameterInfo.class, msgs);
				return basicSetScheduleParameterInfo((ScheduleParameterInfo)otherEnd, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				return basicSetActivityRecord(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				return basicSetStatus(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				return basicSetTimePoint(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				return basicSetScheduleParameterInfo(null, msgs);
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				if (resolve) return getActivityRecord();
				return basicGetActivityRecord();
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				return getStatus();
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				if (resolve) return getTimePoint();
				return basicGetTimePoint();
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				return getDuration();
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				return getCategory();
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				if (resolve) return getScheduleParameterInfo();
				return basicGetScheduleParameterInfo();
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return getAssets();
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				setActivityRecord((ActivityRecord)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				setStatus((Status)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				setTimePoint((TimePoint)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				setDuration((Float)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				setScheduleParameterInfo((ScheduleParameterInfo)newValue);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				setDocument((Document)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				setActivityRecord((ActivityRecord)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				setStatus((Status)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				setTimePoint((TimePoint)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				unsetDuration();
				return;
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				unsetCategory();
				return;
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				setScheduleParameterInfo((ScheduleParameterInfo)null);
				return;
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				getAssets().clear();
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
			case InfCommonPackage.SCHEDULED_EVENT__DOCUMENT:
				return document != null;
			case InfCommonPackage.SCHEDULED_EVENT__ACTIVITY_RECORD:
				return activityRecord != null;
			case InfCommonPackage.SCHEDULED_EVENT__STATUS:
				return status != null;
			case InfCommonPackage.SCHEDULED_EVENT__TIME_POINT:
				return timePoint != null;
			case InfCommonPackage.SCHEDULED_EVENT__DURATION:
				return isSetDuration();
			case InfCommonPackage.SCHEDULED_EVENT__CATEGORY:
				return isSetCategory();
			case InfCommonPackage.SCHEDULED_EVENT__SCHEDULE_PARAMETER_INFO:
				return scheduleParameterInfo != null;
			case InfCommonPackage.SCHEDULED_EVENT__ASSETS:
				return assets != null && !assets.isEmpty();
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
		result.append(" (duration: ");
		if (durationESet) result.append(duration); else result.append("<unset>");
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ScheduledEvent
