/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfAssets.DocAssetRole;

import CIM15.IEC61970.Informative.InfCommon.DocDocRole;
import CIM15.IEC61970.Informative.InfCommon.DocPsrRole;
import CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo;
import CIM15.IEC61970.Informative.InfCommon.ScheduledEvent;

import CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole;
import CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole;

import CIM15.IEC61970.Informative.InfOperations.ChangeItem;
import CIM15.IEC61970.Informative.InfOperations.ChangeSet;
import CIM15.IEC61970.Informative.InfOperations.NetworkDataSet;

import CIM15.IEC61970.Meas.Measurement;

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
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.Document#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getToDocumentRoles <em>To Document Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getFromDocumentRoles <em>From Document Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getScheduleParameterInfos <em>Schedule Parameter Infos</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getActivityRecords <em>Activity Records</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getSubject <em>Subject</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getTitle <em>Title</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getAssetRoles <em>Asset Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getPowerSystemResourceRoles <em>Power System Resource Roles</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Document#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Document extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * The cached value of the '{@link #getToDocumentRoles() <em>To Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocDocRole> toDocumentRoles;

	/**
	 * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicAddress()
	 * @generated
	 * @ordered
	 */
	protected ElectronicAddress electronicAddress;

	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected String revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * This is true if the Revision Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revisionNumberESet;

	/**
	 * The cached value of the '{@link #getNetworkDataSets() <em>Network Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkDataSet> networkDataSets;

	/**
	 * The cached value of the '{@link #getFromDocumentRoles() <em>From Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocDocRole> fromDocumentRoles;

	/**
	 * The cached value of the '{@link #getScheduleParameterInfos() <em>Schedule Parameter Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleParameterInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleParameterInfo> scheduleParameterInfos;

	/**
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocOrgRole> erpOrganisationRoles;

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
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The default value of the '{@link #getLastModifiedDateTime() <em>Last Modified Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDateTime() <em>Last Modified Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDateTime = LAST_MODIFIED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Last Modified Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lastModifiedDateTimeESet;

	/**
	 * The cached value of the '{@link #getActivityRecords() <em>Activity Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityRecord> activityRecords;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * This is true if the Subject attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subjectESet;

	/**
	 * The cached value of the '{@link #getChangeSets() <em>Change Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeSet> changeSets;

	/**
	 * The cached value of the '{@link #getErpPersonRoles() <em>Erp Person Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocErpPersonRole> erpPersonRoles;

	/**
	 * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduledEvent> scheduledEvents;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * This is true if the Title attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean titleESet;

	/**
	 * The cached value of the '{@link #getDocStatus() <em>Doc Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocStatus()
	 * @generated
	 * @ordered
	 */
	protected Status docStatus;

	/**
	 * The cached value of the '{@link #getAssetRoles() <em>Asset Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocAssetRole> assetRoles;

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
	 * The cached value of the '{@link #getPowerSystemResourceRoles() <em>Power System Resource Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResourceRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocPsrRole> powerSystemResourceRoles;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Document() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.DOCUMENT;
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getDocument
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
	}

	/**
	 * Returns the value of the '<em><b>To Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.DocDocRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument <em>From Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Document Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument
	 * @generated
	 */
	public EList<DocDocRole> getToDocumentRoles() {
		if (toDocumentRoles == null) {
			toDocumentRoles = new BasicInternalEList<DocDocRole>(DocDocRole.class);
		}
		return toDocumentRoles;
	}

	/**
	 * Returns the value of the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Address</em>' containment reference.
	 * @see #setElectronicAddress(ElectronicAddress)
	 * @generated
	 */
	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicAddress(ElectronicAddress newElectronicAddress, NotificationChain msgs) {
		ElectronicAddress oldElectronicAddress = electronicAddress;
		electronicAddress = newElectronicAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getElectronicAddress <em>Electronic Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Address</em>' containment reference.
	 * @see #getElectronicAddress()
	 * @generated
	 */
	public void setElectronicAddress(ElectronicAddress newElectronicAddress) {
		if (newElectronicAddress != electronicAddress) {
			NotificationChain msgs = null;
			if (electronicAddress != null)
				msgs = ((InternalEObject)electronicAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS, null, msgs);
			if (newElectronicAddress != null)
				msgs = ((InternalEObject)newElectronicAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS, null, msgs);
			msgs = basicSetElectronicAddress(newElectronicAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #isSetRevisionNumber()
	 * @see #unsetRevisionNumber()
	 * @see #setRevisionNumber(String)
	 * @generated
	 */
	public String getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #isSetRevisionNumber()
	 * @see #unsetRevisionNumber()
	 * @see #getRevisionNumber()
	 * @generated
	 */
	public void setRevisionNumber(String newRevisionNumber) {
		revisionNumber = newRevisionNumber;
		revisionNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionNumber()
	 * @see #getRevisionNumber()
	 * @see #setRevisionNumber(String)
	 * @generated
	 */
	public void unsetRevisionNumber() {
		revisionNumber = REVISION_NUMBER_EDEFAULT;
		revisionNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Document#getRevisionNumber <em>Revision Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revision Number</em>' attribute is set.
	 * @see #unsetRevisionNumber()
	 * @see #getRevisionNumber()
	 * @see #setRevisionNumber(String)
	 * @generated
	 */
	public boolean isSetRevisionNumber() {
		return revisionNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Network Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments
	 * @generated
	 */
	public EList<NetworkDataSet> getNetworkDataSets() {
		if (networkDataSets == null) {
			networkDataSets = new BasicInternalEList<NetworkDataSet>(NetworkDataSet.class);
		}
		return networkDataSets;
	}

	/**
	 * Returns the value of the '<em><b>From Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.DocDocRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.DocDocRole#getToDocument <em>To Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Document Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.DocDocRole#getToDocument
	 * @generated
	 */
	public EList<DocDocRole> getFromDocumentRoles() {
		if (fromDocumentRoles == null) {
			fromDocumentRoles = new BasicInternalEList<DocDocRole>(DocDocRole.class);
		}
		return fromDocumentRoles;
	}

	/**
	 * Returns the value of the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Parameter Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Parameter Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduleParameterInfo#getDocuments
	 * @generated
	 */
	public EList<ScheduleParameterInfo> getScheduleParameterInfos() {
		if (scheduleParameterInfos == null) {
			scheduleParameterInfos = new BasicInternalEList<ScheduleParameterInfo>(ScheduleParameterInfo.class);
		}
		return scheduleParameterInfos;
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocOrgRole#getDocument
	 * @generated
	 */
	public EList<DocOrgRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new BasicInternalEList<DocOrgRole>(DocOrgRole.class);
		}
		return erpOrganisationRoles;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Document#getCreatedDateTime <em>Created Date Time</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Measurement#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Measurement#getDocuments
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new BasicInternalEList<Measurement>(Measurement.class);
		}
		return measurements;
	}

	/**
	 * Returns the value of the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date Time</em>' attribute.
	 * @see #isSetLastModifiedDateTime()
	 * @see #unsetLastModifiedDateTime()
	 * @see #setLastModifiedDateTime(Date)
	 * @generated
	 */
	public Date getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date Time</em>' attribute.
	 * @see #isSetLastModifiedDateTime()
	 * @see #unsetLastModifiedDateTime()
	 * @see #getLastModifiedDateTime()
	 * @generated
	 */
	public void setLastModifiedDateTime(Date newLastModifiedDateTime) {
		lastModifiedDateTime = newLastModifiedDateTime;
		lastModifiedDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastModifiedDateTime()
	 * @see #getLastModifiedDateTime()
	 * @see #setLastModifiedDateTime(Date)
	 * @generated
	 */
	public void unsetLastModifiedDateTime() {
		lastModifiedDateTime = LAST_MODIFIED_DATE_TIME_EDEFAULT;
		lastModifiedDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Document#getLastModifiedDateTime <em>Last Modified Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Modified Date Time</em>' attribute is set.
	 * @see #unsetLastModifiedDateTime()
	 * @see #getLastModifiedDateTime()
	 * @see #setLastModifiedDateTime(Date)
	 * @generated
	 */
	public boolean isSetLastModifiedDateTime() {
		return lastModifiedDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Activity Records</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.ActivityRecord}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.ActivityRecord#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Records</em>' reference list.
	 * @see CIM15.IEC61968.Common.ActivityRecord#getDocuments
	 * @generated
	 */
	public EList<ActivityRecord> getActivityRecords() {
		if (activityRecords == null) {
			activityRecords = new BasicInternalEList<ActivityRecord>(ActivityRecord.class);
		}
		return activityRecords;
	}

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #isSetSubject()
	 * @see #unsetSubject()
	 * @see #setSubject(String)
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #isSetSubject()
	 * @see #unsetSubject()
	 * @see #getSubject()
	 * @generated
	 */
	public void setSubject(String newSubject) {
		subject = newSubject;
		subjectESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Document#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubject()
	 * @see #getSubject()
	 * @see #setSubject(String)
	 * @generated
	 */
	public void unsetSubject() {
		subject = SUBJECT_EDEFAULT;
		subjectESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Document#getSubject <em>Subject</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subject</em>' attribute is set.
	 * @see #unsetSubject()
	 * @see #getSubject()
	 * @see #setSubject(String)
	 * @generated
	 */
	public boolean isSetSubject() {
		return subjectESet;
	}

	/**
	 * Returns the value of the '<em><b>Change Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet#getDocuments
	 * @generated
	 */
	public EList<ChangeSet> getChangeSets() {
		if (changeSets == null) {
			changeSets = new BasicInternalEList<ChangeSet>(ChangeSet.class);
		}
		return changeSets;
	}

	/**
	 * Returns the value of the '<em><b>Erp Person Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.DocErpPersonRole#getDocument
	 * @generated
	 */
	public EList<DocErpPersonRole> getErpPersonRoles() {
		if (erpPersonRoles == null) {
			erpPersonRoles = new BasicInternalEList<DocErpPersonRole>(DocErpPersonRole.class);
		}
		return erpPersonRoles;
	}

	/**
	 * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Events</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.ScheduledEvent#getDocument
	 * @generated
	 */
	public EList<ScheduledEvent> getScheduledEvents() {
		if (scheduledEvents == null) {
			scheduledEvents = new BasicInternalEList<ScheduledEvent>(ScheduledEvent.class);
		}
		return scheduledEvents;
	}

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @generated
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
		titleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Document#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	public void unsetTitle() {
		title = TITLE_EDEFAULT;
		titleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Document#getTitle <em>Title</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Title</em>' attribute is set.
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	public boolean isSetTitle() {
		return titleESet;
	}

	/**
	 * Returns the value of the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Status</em>' containment reference.
	 * @see #setDocStatus(Status)
	 * @generated
	 */
	public Status getDocStatus() {
		return docStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocStatus(Status newDocStatus, NotificationChain msgs) {
		Status oldDocStatus = docStatus;
		docStatus = newDocStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getDocStatus <em>Doc Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Status</em>' containment reference.
	 * @see #getDocStatus()
	 * @generated
	 */
	public void setDocStatus(Status newDocStatus) {
		if (newDocStatus != docStatus) {
			NotificationChain msgs = null;
			if (docStatus != null)
				msgs = ((InternalEObject)docStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.DOCUMENT__DOC_STATUS, null, msgs);
			if (newDocStatus != null)
				msgs = ((InternalEObject)newDocStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.DOCUMENT__DOC_STATUS, null, msgs);
			msgs = basicSetDocStatus(newDocStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Asset Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.DocAssetRole#getDocument
	 * @generated
	 */
	public EList<DocAssetRole> getAssetRoles() {
		if (assetRoles == null) {
			assetRoles = new BasicInternalEList<DocAssetRole>(DocAssetRole.class);
		}
		return assetRoles;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.DOCUMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.DOCUMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.DocPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.DocPsrRole#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.DocPsrRole#getDocument
	 * @generated
	 */
	public EList<DocPsrRole> getPowerSystemResourceRoles() {
		if (powerSystemResourceRoles == null) {
			powerSystemResourceRoles = new BasicInternalEList<DocPsrRole>(DocPsrRole.class);
		}
		return powerSystemResourceRoles;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Document#getCategory <em>Category</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Document#getCategory <em>Category</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Document#getCategory <em>Category</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToDocumentRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkDataSets()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromDocumentRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleParameterInfos()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivityRecords()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeSets()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersonRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduledEvents()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetRoles()).basicAdd(otherEnd, msgs);
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResourceRoles()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return ((InternalEList<?>)getToDocumentRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				return basicSetElectronicAddress(null, msgs);
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return ((InternalEList<?>)getNetworkDataSets()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return ((InternalEList<?>)getFromDocumentRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return ((InternalEList<?>)getScheduleParameterInfos()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return ((InternalEList<?>)getActivityRecords()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return ((InternalEList<?>)getChangeSets()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return ((InternalEList<?>)getErpPersonRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return ((InternalEList<?>)getScheduledEvents()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__DOC_STATUS:
				return basicSetDocStatus(null, msgs);
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return ((InternalEList<?>)getAssetRoles()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT__STATUS:
				return basicSetStatus(null, msgs);
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return ((InternalEList<?>)getPowerSystemResourceRoles()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return getChangeItems();
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return getToDocumentRoles();
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				return getElectronicAddress();
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				return getRevisionNumber();
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return getNetworkDataSets();
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return getFromDocumentRoles();
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return getScheduleParameterInfos();
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				return getCreatedDateTime();
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return getMeasurements();
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				return getLastModifiedDateTime();
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return getActivityRecords();
			case CommonPackage.DOCUMENT__SUBJECT:
				return getSubject();
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return getChangeSets();
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return getErpPersonRoles();
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return getScheduledEvents();
			case CommonPackage.DOCUMENT__TITLE:
				return getTitle();
			case CommonPackage.DOCUMENT__DOC_STATUS:
				return getDocStatus();
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return getAssetRoles();
			case CommonPackage.DOCUMENT__STATUS:
				return getStatus();
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return getPowerSystemResourceRoles();
			case CommonPackage.DOCUMENT__CATEGORY:
				return getCategory();
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
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				getToDocumentRoles().clear();
				getToDocumentRoles().addAll((Collection<? extends DocDocRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				setRevisionNumber((String)newValue);
				return;
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				getNetworkDataSets().addAll((Collection<? extends NetworkDataSet>)newValue);
				return;
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				getFromDocumentRoles().clear();
				getFromDocumentRoles().addAll((Collection<? extends DocDocRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				getScheduleParameterInfos().clear();
				getScheduleParameterInfos().addAll((Collection<? extends ScheduleParameterInfo>)newValue);
				return;
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends DocOrgRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				setCreatedDateTime((Date)newValue);
				return;
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				setLastModifiedDateTime((Date)newValue);
				return;
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				getActivityRecords().addAll((Collection<? extends ActivityRecord>)newValue);
				return;
			case CommonPackage.DOCUMENT__SUBJECT:
				setSubject((String)newValue);
				return;
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				getChangeSets().clear();
				getChangeSets().addAll((Collection<? extends ChangeSet>)newValue);
				return;
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				getErpPersonRoles().addAll((Collection<? extends DocErpPersonRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				getScheduledEvents().addAll((Collection<? extends ScheduledEvent>)newValue);
				return;
			case CommonPackage.DOCUMENT__TITLE:
				setTitle((String)newValue);
				return;
			case CommonPackage.DOCUMENT__DOC_STATUS:
				setDocStatus((Status)newValue);
				return;
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				getAssetRoles().clear();
				getAssetRoles().addAll((Collection<? extends DocAssetRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				getPowerSystemResourceRoles().addAll((Collection<? extends DocPsrRole>)newValue);
				return;
			case CommonPackage.DOCUMENT__CATEGORY:
				setCategory((String)newValue);
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
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				getToDocumentRoles().clear();
				return;
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				unsetRevisionNumber();
				return;
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				return;
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				getFromDocumentRoles().clear();
				return;
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				getScheduleParameterInfos().clear();
				return;
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				unsetCreatedDateTime();
				return;
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				unsetLastModifiedDateTime();
				return;
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				getActivityRecords().clear();
				return;
			case CommonPackage.DOCUMENT__SUBJECT:
				unsetSubject();
				return;
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				getChangeSets().clear();
				return;
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				return;
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				getScheduledEvents().clear();
				return;
			case CommonPackage.DOCUMENT__TITLE:
				unsetTitle();
				return;
			case CommonPackage.DOCUMENT__DOC_STATUS:
				setDocStatus((Status)null);
				return;
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				getAssetRoles().clear();
				return;
			case CommonPackage.DOCUMENT__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				getPowerSystemResourceRoles().clear();
				return;
			case CommonPackage.DOCUMENT__CATEGORY:
				unsetCategory();
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
			case CommonPackage.DOCUMENT__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES:
				return toDocumentRoles != null && !toDocumentRoles.isEmpty();
			case CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case CommonPackage.DOCUMENT__REVISION_NUMBER:
				return isSetRevisionNumber();
			case CommonPackage.DOCUMENT__NETWORK_DATA_SETS:
				return networkDataSets != null && !networkDataSets.isEmpty();
			case CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES:
				return fromDocumentRoles != null && !fromDocumentRoles.isEmpty();
			case CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS:
				return scheduleParameterInfos != null && !scheduleParameterInfos.isEmpty();
			case CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case CommonPackage.DOCUMENT__CREATED_DATE_TIME:
				return isSetCreatedDateTime();
			case CommonPackage.DOCUMENT__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
				return isSetLastModifiedDateTime();
			case CommonPackage.DOCUMENT__ACTIVITY_RECORDS:
				return activityRecords != null && !activityRecords.isEmpty();
			case CommonPackage.DOCUMENT__SUBJECT:
				return isSetSubject();
			case CommonPackage.DOCUMENT__CHANGE_SETS:
				return changeSets != null && !changeSets.isEmpty();
			case CommonPackage.DOCUMENT__ERP_PERSON_ROLES:
				return erpPersonRoles != null && !erpPersonRoles.isEmpty();
			case CommonPackage.DOCUMENT__SCHEDULED_EVENTS:
				return scheduledEvents != null && !scheduledEvents.isEmpty();
			case CommonPackage.DOCUMENT__TITLE:
				return isSetTitle();
			case CommonPackage.DOCUMENT__DOC_STATUS:
				return docStatus != null;
			case CommonPackage.DOCUMENT__ASSET_ROLES:
				return assetRoles != null && !assetRoles.isEmpty();
			case CommonPackage.DOCUMENT__STATUS:
				return status != null;
			case CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES:
				return powerSystemResourceRoles != null && !powerSystemResourceRoles.isEmpty();
			case CommonPackage.DOCUMENT__CATEGORY:
				return isSetCategory();
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
		result.append(" (revisionNumber: ");
		if (revisionNumberESet) result.append(revisionNumber); else result.append("<unset>");
		result.append(", createdDateTime: ");
		if (createdDateTimeESet) result.append(createdDateTime); else result.append("<unset>");
		result.append(", lastModifiedDateTime: ");
		if (lastModifiedDateTimeESet) result.append(lastModifiedDateTime); else result.append("<unset>");
		result.append(", subject: ");
		if (subjectESet) result.append(subject); else result.append("<unset>");
		result.append(", title: ");
		if (titleESet) result.append(title); else result.append("<unset>");
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Document
