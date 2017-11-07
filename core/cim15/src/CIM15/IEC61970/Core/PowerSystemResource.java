/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61968.Common.CommonPackage;
import CIM15.IEC61968.Common.Location;

import CIM15.IEC61970.Informative.InfCommon.DocPsrRole;

import CIM15.IEC61970.Informative.InfOperations.ChangeItem;
import CIM15.IEC61970.Informative.InfOperations.NetworkDataSet;
import CIM15.IEC61970.Informative.InfOperations.OrgPsrRole;
import CIM15.IEC61970.Informative.InfOperations.PSREvent;
import CIM15.IEC61970.Informative.InfOperations.SafetyDocument;
import CIM15.IEC61970.Informative.InfOperations.SwitchingStep;

import CIM15.IEC61970.Meas.Measurement;

import CIM15.IEC61970.Outage.OutagePackage;
import CIM15.IEC61970.Outage.OutageSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getScheduleSteps <em>Schedule Steps</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getSafetyDocuments <em>Safety Documents</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getOperatingShare <em>Operating Share</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getDocumentRoles <em>Document Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getPsrLists <em>Psr Lists</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getPSRType <em>PSR Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getPSREvent <em>PSR Event</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getNetworkDataSets <em>Network Data Sets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerSystemResource extends IdentifiedObject {
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
	 * The cached value of the '{@link #getScheduleSteps() <em>Schedule Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingStep> scheduleSteps;

	/**
	 * The cached value of the '{@link #getSafetyDocuments() <em>Safety Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyDocument> safetyDocuments;

	/**
	 * The cached value of the '{@link #getOperatingShare() <em>Operating Share</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingShare()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingShare> operatingShare;

	/**
	 * The cached value of the '{@link #getDocumentRoles() <em>Document Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocPsrRole> documentRoles;

	/**
	 * The cached value of the '{@link #getPsrLists() <em>Psr Lists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsrLists()
	 * @generated
	 * @ordered
	 */
	protected EList<PsrList> psrLists;

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
	 * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportingGroup> reportingGroup;

	/**
	 * The cached value of the '{@link #getPSRType() <em>PSR Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSRType()
	 * @generated
	 * @ordered
	 */
	protected PSRType psrType;

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
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPsrRole> erpOrganisationRoles;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getPSREvent() <em>PSR Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSREvent()
	 * @generated
	 * @ordered
	 */
	protected EList<PSREvent> psrEvent;

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
	 * The cached value of the '{@link #getOutageSchedule() <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSchedule()
	 * @generated
	 * @ordered
	 */
	protected OutageSchedule outageSchedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSystemResource() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.POWER_SYSTEM_RESOURCE;
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
	}

	/**
	 * Returns the value of the '<em><b>Schedule Steps</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Steps</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.SwitchingStep#getPowerSystemResources
	 * @generated
	 */
	public EList<SwitchingStep> getScheduleSteps() {
		if (scheduleSteps == null) {
			scheduleSteps = new BasicInternalEList<SwitchingStep>(SwitchingStep.class);
		}
		return scheduleSteps;
	}

	/**
	 * Returns the value of the '<em><b>Safety Documents</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Documents</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.SafetyDocument#getPowerSystemResource
	 * @generated
	 */
	public EList<SafetyDocument> getSafetyDocuments() {
		if (safetyDocuments == null) {
			safetyDocuments = new BasicInternalEList<SafetyDocument>(SafetyDocument.class);
		}
		return safetyDocuments;
	}

	/**
	 * Returns the value of the '<em><b>Operating Share</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.OperatingShare}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Share</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Share</em>' reference list.
	 * @see CIM15.IEC61970.Core.OperatingShare#getPowerSystemResource
	 * @generated
	 */
	public EList<OperatingShare> getOperatingShare() {
		if (operatingShare == null) {
			operatingShare = new BasicInternalEList<OperatingShare>(OperatingShare.class);
		}
		return operatingShare;
	}

	/**
	 * Returns the value of the '<em><b>Document Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.DocPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.DocPsrRole#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.DocPsrRole#getPowerSystemResource
	 * @generated
	 */
	public EList<DocPsrRole> getDocumentRoles() {
		if (documentRoles == null) {
			documentRoles = new BasicInternalEList<DocPsrRole>(DocPsrRole.class);
		}
		return documentRoles;
	}

	/**
	 * Returns the value of the '<em><b>Psr Lists</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.PsrList}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PsrList#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Psr Lists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Psr Lists</em>' reference list.
	 * @see CIM15.IEC61970.Core.PsrList#getPowerSystemResources
	 * @generated
	 */
	public EList<PsrList> getPsrLists() {
		if (psrLists == null) {
			psrLists = new BasicInternalEList<PsrList>(PsrList.class);
		}
		return psrLists;
	}

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Measurement#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Measurement#getPowerSystemResource
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new BasicInternalEList<Measurement>(Measurement.class);
		}
		return measurements;
	}

	/**
	 * Returns the value of the '<em><b>Reporting Group</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.ReportingGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Group</em>' reference list.
	 * @see CIM15.IEC61970.Core.ReportingGroup#getPowerSystemResource
	 * @generated
	 */
	public EList<ReportingGroup> getReportingGroup() {
		if (reportingGroup == null) {
			reportingGroup = new BasicInternalEList<ReportingGroup>(ReportingGroup.class);
		}
		return reportingGroup;
	}

	/**
	 * Returns the value of the '<em><b>PSR Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PSRType#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSR Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSR Type</em>' reference.
	 * @see #setPSRType(PSRType)
	 * @see CIM15.IEC61970.Core.PSRType#getPowerSystemResources
	 * @generated
	 */
	public PSRType getPSRType() {
		if (psrType != null && psrType.eIsProxy()) {
			InternalEObject oldPSRType = (InternalEObject)psrType;
			psrType = (PSRType)eResolveProxy(oldPSRType);
			if (psrType != oldPSRType) {
			}
		}
		return psrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSRType basicGetPSRType() {
		return psrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSRType(PSRType newPSRType, NotificationChain msgs) {
		PSRType oldPSRType = psrType;
		psrType = newPSRType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.PowerSystemResource#getPSRType <em>PSR Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PSR Type</em>' reference.
	 * @see #getPSRType()
	 * @generated
	 */
	public void setPSRType(PSRType newPSRType) {
		if (newPSRType != psrType) {
			NotificationChain msgs = null;
			if (psrType != null)
				msgs = ((InternalEObject)psrType).eInverseRemove(this, CorePackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs);
			if (newPSRType != null)
				msgs = ((InternalEObject)newPSRType).eInverseAdd(this, CorePackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs);
			msgs = basicSetPSRType(newPSRType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getPowerSystemResources
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.OrgPsrRole#getPowerSystemResource
	 * @generated
	 */
	public EList<OrgPsrRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new BasicInternalEList<OrgPsrRole>(OrgPsrRole.class);
		}
		return erpOrganisationRoles;
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM15.IEC61968.Common.Location#getPowerSystemResources
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>PSR Event</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.PSREvent}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PSR Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PSR Event</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.PSREvent#getPowerSystemResource
	 * @generated
	 */
	public EList<PSREvent> getPSREvent() {
		if (psrEvent == null) {
			psrEvent = new BasicInternalEList<PSREvent>(PSREvent.class);
		}
		return psrEvent;
	}

	/**
	 * Returns the value of the '<em><b>Network Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources <em>Power System Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources
	 * @generated
	 */
	public EList<NetworkDataSet> getNetworkDataSets() {
		if (networkDataSets == null) {
			networkDataSets = new BasicInternalEList<NetworkDataSet>(NetworkDataSet.class);
		}
		return networkDataSets;
	}

	/**
	 * Returns the value of the '<em><b>Outage Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.OutageSchedule#getPowerSystemResource <em>Power System Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Schedule</em>' reference.
	 * @see #setOutageSchedule(OutageSchedule)
	 * @see CIM15.IEC61970.Outage.OutageSchedule#getPowerSystemResource
	 * @generated
	 */
	public OutageSchedule getOutageSchedule() {
		if (outageSchedule != null && outageSchedule.eIsProxy()) {
			InternalEObject oldOutageSchedule = (InternalEObject)outageSchedule;
			outageSchedule = (OutageSchedule)eResolveProxy(oldOutageSchedule);
			if (outageSchedule != oldOutageSchedule) {
			}
		}
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageSchedule basicGetOutageSchedule() {
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageSchedule(OutageSchedule newOutageSchedule, NotificationChain msgs) {
		OutageSchedule oldOutageSchedule = outageSchedule;
		outageSchedule = newOutageSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.PowerSystemResource#getOutageSchedule <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Schedule</em>' reference.
	 * @see #getOutageSchedule()
	 * @generated
	 */
	public void setOutageSchedule(OutageSchedule newOutageSchedule) {
		if (newOutageSchedule != outageSchedule) {
			NotificationChain msgs = null;
			if (outageSchedule != null)
				msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, OutageSchedule.class, msgs);
			if (newOutageSchedule != null)
				msgs = ((InternalEObject)newOutageSchedule).eInverseAdd(this, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, OutageSchedule.class, msgs);
			msgs = basicSetOutageSchedule(newOutageSchedule, msgs);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleSteps()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSafetyDocuments()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatingShare()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentRoles()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPsrLists()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportingGroup()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				if (psrType != null)
					msgs = ((InternalEObject)psrType).eInverseRemove(this, CorePackage.PSR_TYPE__POWER_SYSTEM_RESOURCES, PSRType.class, msgs);
				return basicSetPSRType((PSRType)otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPSREvent()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkDataSets()).basicAdd(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				if (outageSchedule != null)
					msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, OutageSchedule.class, msgs);
				return basicSetOutageSchedule((OutageSchedule)otherEnd, msgs);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return ((InternalEList<?>)getScheduleSteps()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return ((InternalEList<?>)getSafetyDocuments()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return ((InternalEList<?>)getOperatingShare()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return ((InternalEList<?>)getDocumentRoles()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return ((InternalEList<?>)getPsrLists()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return ((InternalEList<?>)getReportingGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				return basicSetPSRType(null, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				return basicSetLocation(null, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return ((InternalEList<?>)getPSREvent()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return ((InternalEList<?>)getNetworkDataSets()).basicRemove(otherEnd, msgs);
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				return basicSetOutageSchedule(null, msgs);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return getChangeItems();
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return getScheduleSteps();
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return getSafetyDocuments();
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return getOperatingShare();
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return getDocumentRoles();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return getPsrLists();
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return getMeasurements();
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return getReportingGroup();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				if (resolve) return getPSRType();
				return basicGetPSRType();
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return getAssets();
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return getPSREvent();
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return getNetworkDataSets();
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				if (resolve) return getOutageSchedule();
				return basicGetOutageSchedule();
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
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				getScheduleSteps().addAll((Collection<? extends SwitchingStep>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				getSafetyDocuments().clear();
				getSafetyDocuments().addAll((Collection<? extends SafetyDocument>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				getOperatingShare().clear();
				getOperatingShare().addAll((Collection<? extends OperatingShare>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				getDocumentRoles().addAll((Collection<? extends DocPsrRole>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				getPsrLists().clear();
				getPsrLists().addAll((Collection<? extends PsrList>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				getReportingGroup().clear();
				getReportingGroup().addAll((Collection<? extends ReportingGroup>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				setPSRType((PSRType)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgPsrRole>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				setLocation((Location)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				getPSREvent().clear();
				getPSREvent().addAll((Collection<? extends PSREvent>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				getNetworkDataSets().addAll((Collection<? extends NetworkDataSet>)newValue);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)newValue);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				getSafetyDocuments().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				getOperatingShare().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				getDocumentRoles().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				getPsrLists().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				getReportingGroup().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				setPSRType((PSRType)null);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				getAssets().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				setLocation((Location)null);
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				getPSREvent().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				getNetworkDataSets().clear();
				return;
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)null);
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
			case CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__SCHEDULE_STEPS:
				return scheduleSteps != null && !scheduleSteps.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS:
				return safetyDocuments != null && !safetyDocuments.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__OPERATING_SHARE:
				return operatingShare != null && !operatingShare.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__DOCUMENT_ROLES:
				return documentRoles != null && !documentRoles.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_LISTS:
				return psrLists != null && !psrLists.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__REPORTING_GROUP:
				return reportingGroup != null && !reportingGroup.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_TYPE:
				return psrType != null;
			case CorePackage.POWER_SYSTEM_RESOURCE__ASSETS:
				return assets != null && !assets.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__LOCATION:
				return location != null;
			case CorePackage.POWER_SYSTEM_RESOURCE__PSR_EVENT:
				return psrEvent != null && !psrEvent.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__NETWORK_DATA_SETS:
				return networkDataSets != null && !networkDataSets.isEmpty();
			case CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE:
				return outageSchedule != null;
		}
		return super.eIsSet(featureID);
	}

} // PowerSystemResource
