/**
 */
package CIM15.IEC61970.Informative.InfLocations;

import CIM15.IEC61968.Assets.AssetContainer;

import CIM15.IEC61968.Common.Location;
import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Land Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getLocationGrants <em>Location Grants</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getErpSiteLevelDatas <em>Erp Site Level Datas</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference <em>External Record Reference</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind <em>Demographic Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getErpPersonRoles <em>Erp Person Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getErpOrganisationRoles <em>Erp Organisation Roles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getAssetContainers <em>Asset Containers</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getLocations <em>Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getRightOfWays <em>Right Of Ways</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandProperty extends IdentifiedObject {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final LandPropertyKind KIND_EDEFAULT = LandPropertyKind.STORE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected LandPropertyKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getLocationGrants() <em>Location Grants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationGrants()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationGrant> locationGrants;

	/**
	 * The cached value of the '{@link #getErpSiteLevelDatas() <em>Erp Site Level Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpSiteLevelDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpSiteLevelData> erpSiteLevelDatas;

	/**
	 * The default value of the '{@link #getExternalRecordReference() <em>External Record Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRecordReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_RECORD_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalRecordReference() <em>External Record Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRecordReference()
	 * @generated
	 * @ordered
	 */
	protected String externalRecordReference = EXTERNAL_RECORD_REFERENCE_EDEFAULT;

	/**
	 * This is true if the External Record Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalRecordReferenceESet;

	/**
	 * The default value of the '{@link #getDemographicKind() <em>Demographic Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemographicKind()
	 * @generated
	 * @ordered
	 */
	protected static final DemographicKind DEMOGRAPHIC_KIND_EDEFAULT = DemographicKind.OTHER;

	/**
	 * The cached value of the '{@link #getDemographicKind() <em>Demographic Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemographicKind()
	 * @generated
	 * @ordered
	 */
	protected DemographicKind demographicKind = DEMOGRAPHIC_KIND_EDEFAULT;

	/**
	 * This is true if the Demographic Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean demographicKindESet;

	/**
	 * The cached value of the '{@link #getErpPersonRoles() <em>Erp Person Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersonRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonPropertyRole> erpPersonRoles;

	/**
	 * The cached value of the '{@link #getErpOrganisationRoles() <em>Erp Organisation Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisationRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OrgPropertyRole> erpOrganisationRoles;

	/**
	 * The cached value of the '{@link #getAssetContainers() <em>Asset Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetContainer> assetContainers;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * The cached value of the '{@link #getRightOfWays() <em>Right Of Ways</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOfWays()
	 * @generated
	 * @ordered
	 */
	protected EList<RightOfWay> rightOfWays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandProperty() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLocationsPackage.Literals.LAND_PROPERTY;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfLocationsPackage.LAND_PROPERTY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfLocationsPackage.LAND_PROPERTY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfLocations.LandPropertyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLocations.LandPropertyKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(LandPropertyKind)
	 * @generated
	 */
	public LandPropertyKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLocations.LandPropertyKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(LandPropertyKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(LandPropertyKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(LandPropertyKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Location Grants</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.LocationGrant}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Grants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Grants</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.LocationGrant#getLandProperty
	 * @generated
	 */
	public EList<LocationGrant> getLocationGrants() {
		if (locationGrants == null) {
			locationGrants = new BasicInternalEList<LocationGrant>(LocationGrant.class);
		}
		return locationGrants;
	}

	/**
	 * Returns the value of the '<em><b>Erp Site Level Datas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Site Level Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Site Level Datas</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpSiteLevelData#getLandProperty
	 * @generated
	 */
	public EList<ErpSiteLevelData> getErpSiteLevelDatas() {
		if (erpSiteLevelDatas == null) {
			erpSiteLevelDatas = new BasicInternalEList<ErpSiteLevelData>(ErpSiteLevelData.class);
		}
		return erpSiteLevelDatas;
	}

	/**
	 * Returns the value of the '<em><b>External Record Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Record Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Record Reference</em>' attribute.
	 * @see #isSetExternalRecordReference()
	 * @see #unsetExternalRecordReference()
	 * @see #setExternalRecordReference(String)
	 * @generated
	 */
	public String getExternalRecordReference() {
		return externalRecordReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference <em>External Record Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Record Reference</em>' attribute.
	 * @see #isSetExternalRecordReference()
	 * @see #unsetExternalRecordReference()
	 * @see #getExternalRecordReference()
	 * @generated
	 */
	public void setExternalRecordReference(String newExternalRecordReference) {
		externalRecordReference = newExternalRecordReference;
		externalRecordReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference <em>External Record Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternalRecordReference()
	 * @see #getExternalRecordReference()
	 * @see #setExternalRecordReference(String)
	 * @generated
	 */
	public void unsetExternalRecordReference() {
		externalRecordReference = EXTERNAL_RECORD_REFERENCE_EDEFAULT;
		externalRecordReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getExternalRecordReference <em>External Record Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External Record Reference</em>' attribute is set.
	 * @see #unsetExternalRecordReference()
	 * @see #getExternalRecordReference()
	 * @see #setExternalRecordReference(String)
	 * @generated
	 */
	public boolean isSetExternalRecordReference() {
		return externalRecordReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>Demographic Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfLocations.DemographicKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demographic Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demographic Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLocations.DemographicKind
	 * @see #isSetDemographicKind()
	 * @see #unsetDemographicKind()
	 * @see #setDemographicKind(DemographicKind)
	 * @generated
	 */
	public DemographicKind getDemographicKind() {
		return demographicKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind <em>Demographic Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demographic Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLocations.DemographicKind
	 * @see #isSetDemographicKind()
	 * @see #unsetDemographicKind()
	 * @see #getDemographicKind()
	 * @generated
	 */
	public void setDemographicKind(DemographicKind newDemographicKind) {
		demographicKind = newDemographicKind == null ? DEMOGRAPHIC_KIND_EDEFAULT : newDemographicKind;
		demographicKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind <em>Demographic Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDemographicKind()
	 * @see #getDemographicKind()
	 * @see #setDemographicKind(DemographicKind)
	 * @generated
	 */
	public void unsetDemographicKind() {
		demographicKind = DEMOGRAPHIC_KIND_EDEFAULT;
		demographicKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getDemographicKind <em>Demographic Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Demographic Kind</em>' attribute is set.
	 * @see #unsetDemographicKind()
	 * @see #getDemographicKind()
	 * @see #setDemographicKind(DemographicKind)
	 * @generated
	 */
	public boolean isSetDemographicKind() {
		return demographicKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Person Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.PersonPropertyRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.PersonPropertyRole#getLandProperty
	 * @generated
	 */
	public EList<PersonPropertyRole> getErpPersonRoles() {
		if (erpPersonRoles == null) {
			erpPersonRoles = new BasicInternalEList<PersonPropertyRole>(PersonPropertyRole.class);
		}
		return erpPersonRoles;
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty <em>Land Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisation Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisation Roles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.OrgPropertyRole#getLandProperty
	 * @generated
	 */
	public EList<OrgPropertyRole> getErpOrganisationRoles() {
		if (erpOrganisationRoles == null) {
			erpOrganisationRoles = new BasicInternalEList<OrgPropertyRole>(OrgPropertyRole.class);
		}
		return erpOrganisationRoles;
	}

	/**
	 * Returns the value of the '<em><b>Asset Containers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.AssetContainer}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.AssetContainer#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Containers</em>' reference list.
	 * @see CIM15.IEC61968.Assets.AssetContainer#getLandProperties
	 * @generated
	 */
	public EList<AssetContainer> getAssetContainers() {
		if (assetContainers == null) {
			assetContainers = new BasicInternalEList<AssetContainer>(AssetContainer.class);
		}
		return assetContainers;
	}

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Location}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see CIM15.IEC61968.Common.Location#getLandProperties
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new BasicInternalEList<Location>(Location.class);
		}
		return locations;
	}

	/**
	 * Returns the value of the '<em><b>Right Of Ways</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.RightOfWay}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties <em>Land Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Of Ways</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Of Ways</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.RightOfWay#getLandProperties
	 * @generated
	 */
	public EList<RightOfWay> getRightOfWays() {
		if (rightOfWays == null) {
			rightOfWays = new BasicInternalEList<RightOfWay>(RightOfWay.class);
		}
		return rightOfWays;
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
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocationGrants()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpSiteLevelDatas()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersonRoles()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisationRoles()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssetContainers()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRightOfWays()).basicAdd(otherEnd, msgs);
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
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				return basicSetStatus(null, msgs);
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return ((InternalEList<?>)getLocationGrants()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return ((InternalEList<?>)getErpSiteLevelDatas()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return ((InternalEList<?>)getErpPersonRoles()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return ((InternalEList<?>)getErpOrganisationRoles()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return ((InternalEList<?>)getAssetContainers()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return ((InternalEList<?>)getRightOfWays()).basicRemove(otherEnd, msgs);
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
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				return getStatus();
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				return getKind();
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return getLocationGrants();
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return getErpSiteLevelDatas();
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				return getExternalRecordReference();
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				return getDemographicKind();
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return getErpPersonRoles();
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return getErpOrganisationRoles();
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return getAssetContainers();
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return getLocations();
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return getRightOfWays();
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
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				setStatus((Status)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				setKind((LandPropertyKind)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				getLocationGrants().clear();
				getLocationGrants().addAll((Collection<? extends LocationGrant>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				getErpSiteLevelDatas().clear();
				getErpSiteLevelDatas().addAll((Collection<? extends ErpSiteLevelData>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				setExternalRecordReference((String)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				setDemographicKind((DemographicKind)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				getErpPersonRoles().addAll((Collection<? extends PersonPropertyRole>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				getErpOrganisationRoles().addAll((Collection<? extends OrgPropertyRole>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				getAssetContainers().clear();
				getAssetContainers().addAll((Collection<? extends AssetContainer>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				getRightOfWays().clear();
				getRightOfWays().addAll((Collection<? extends RightOfWay>)newValue);
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
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				setStatus((Status)null);
				return;
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				unsetKind();
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				getLocationGrants().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				getErpSiteLevelDatas().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				unsetExternalRecordReference();
				return;
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				unsetDemographicKind();
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				getErpPersonRoles().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				getErpOrganisationRoles().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				getAssetContainers().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				getLocations().clear();
				return;
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				getRightOfWays().clear();
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
			case InfLocationsPackage.LAND_PROPERTY__STATUS:
				return status != null;
			case InfLocationsPackage.LAND_PROPERTY__KIND:
				return isSetKind();
			case InfLocationsPackage.LAND_PROPERTY__LOCATION_GRANTS:
				return locationGrants != null && !locationGrants.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__ERP_SITE_LEVEL_DATAS:
				return erpSiteLevelDatas != null && !erpSiteLevelDatas.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__EXTERNAL_RECORD_REFERENCE:
				return isSetExternalRecordReference();
			case InfLocationsPackage.LAND_PROPERTY__DEMOGRAPHIC_KIND:
				return isSetDemographicKind();
			case InfLocationsPackage.LAND_PROPERTY__ERP_PERSON_ROLES:
				return erpPersonRoles != null && !erpPersonRoles.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__ERP_ORGANISATION_ROLES:
				return erpOrganisationRoles != null && !erpOrganisationRoles.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__ASSET_CONTAINERS:
				return assetContainers != null && !assetContainers.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case InfLocationsPackage.LAND_PROPERTY__RIGHT_OF_WAYS:
				return rightOfWays != null && !rightOfWays.isEmpty();
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
		result.append(" (kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", externalRecordReference: ");
		if (externalRecordReferenceESet) result.append(externalRecordReference); else result.append("<unset>");
		result.append(", demographicKind: ");
		if (demographicKindESet) result.append(demographicKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LandProperty
