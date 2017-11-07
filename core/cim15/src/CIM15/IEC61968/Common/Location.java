/**
 */
package CIM15.IEC61968.Common;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Informative.InfAssets.DimensionsInfo;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation;

import CIM15.IEC61970.Informative.InfLocations.Direction;
import CIM15.IEC61970.Informative.InfLocations.Hazard;
import CIM15.IEC61970.Informative.InfLocations.LandProperty;
import CIM15.IEC61970.Informative.InfLocations.RedLine;
import CIM15.IEC61970.Informative.InfLocations.Route;

import CIM15.IEC61970.Informative.InfOperations.ChangeItem;

import CIM15.IEC61970.Informative.InfWork.Crew;

import CIM15.IEC61970.Meas.Measurement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.Location#getMainAddress <em>Main Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getSecondaryAddress <em>Secondary Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getRedLines <em>Red Lines</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getLandProperties <em>Land Properties</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getAssets <em>Assets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getHazards <em>Hazards</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getCrews <em>Crews</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getPositionPoints <em>Position Points</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getDirections <em>Directions</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getRoutes <em>Routes</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getErpOrganisations <em>Erp Organisations</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.Location#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Location extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getMainAddress() <em>Main Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress mainAddress;

	/**
	 * The cached value of the '{@link #getPhone1() <em>Phone1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone1()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone1;

	/**
	 * The cached value of the '{@link #getPhone2() <em>Phone2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone2()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber phone2;

	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * The cached value of the '{@link #getSecondaryAddress() <em>Secondary Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryAddress()
	 * @generated
	 * @ordered
	 */
	protected StreetAddress secondaryAddress;

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
	 * The cached value of the '{@link #getRedLines() <em>Red Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedLines()
	 * @generated
	 * @ordered
	 */
	protected EList<RedLine> redLines;

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
	 * The cached value of the '{@link #getDimensionsInfo() <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionsInfo()
	 * @generated
	 * @ordered
	 */
	protected DimensionsInfo dimensionsInfo;

	/**
	 * The cached value of the '{@link #getLandProperties() <em>Land Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<LandProperty> landProperties;

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
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

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
	 * The cached value of the '{@link #getCrews() <em>Crews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrews()
	 * @generated
	 * @ordered
	 */
	protected EList<Crew> crews;

	/**
	 * The cached value of the '{@link #getPositionPoints() <em>Position Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionPoint> positionPoints;

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
	 * The cached value of the '{@link #getDirections() <em>Directions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirections()
	 * @generated
	 * @ordered
	 */
	protected EList<Direction> directions;

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
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The default value of the '{@link #getGeoInfoReference() <em>Geo Info Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoInfoReference()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_INFO_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeoInfoReference() <em>Geo Info Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoInfoReference()
	 * @generated
	 * @ordered
	 */
	protected String geoInfoReference = GEO_INFO_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Geo Info Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geoInfoReferenceESet;

	/**
	 * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected CoordinateSystem coordinateSystem;

	/**
	 * The default value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPORATE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorporateCode() <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorporateCode()
	 * @generated
	 * @ordered
	 */
	protected String corporateCode = CORPORATE_CODE_EDEFAULT;

	/**
	 * This is true if the Corporate Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean corporateCodeESet;

	/**
	 * The cached value of the '{@link #getErpOrganisations() <em>Erp Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpOrganisation> erpOrganisations;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.LOCATION;
	}

	/**
	 * Returns the value of the '<em><b>Main Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Address</em>' containment reference.
	 * @see #setMainAddress(StreetAddress)
	 * @generated
	 */
	public StreetAddress getMainAddress() {
		return mainAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainAddress(StreetAddress newMainAddress, NotificationChain msgs) {
		StreetAddress oldMainAddress = mainAddress;
		mainAddress = newMainAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getMainAddress <em>Main Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Address</em>' containment reference.
	 * @see #getMainAddress()
	 * @generated
	 */
	public void setMainAddress(StreetAddress newMainAddress) {
		if (newMainAddress != mainAddress) {
			NotificationChain msgs = null;
			if (mainAddress != null)
				msgs = ((InternalEObject)mainAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__MAIN_ADDRESS, null, msgs);
			if (newMainAddress != null)
				msgs = ((InternalEObject)newMainAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__MAIN_ADDRESS, null, msgs);
			msgs = basicSetMainAddress(newMainAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone1</em>' containment reference.
	 * @see #setPhone1(TelephoneNumber)
	 * @generated
	 */
	public TelephoneNumber getPhone1() {
		return phone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone1(TelephoneNumber newPhone1, NotificationChain msgs) {
		TelephoneNumber oldPhone1 = phone1;
		phone1 = newPhone1;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getPhone1 <em>Phone1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone1</em>' containment reference.
	 * @see #getPhone1()
	 * @generated
	 */
	public void setPhone1(TelephoneNumber newPhone1) {
		if (newPhone1 != phone1) {
			NotificationChain msgs = null;
			if (phone1 != null)
				msgs = ((InternalEObject)phone1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__PHONE1, null, msgs);
			if (newPhone1 != null)
				msgs = ((InternalEObject)newPhone1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__PHONE1, null, msgs);
			msgs = basicSetPhone1(newPhone1, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone2</em>' containment reference.
	 * @see #setPhone2(TelephoneNumber)
	 * @generated
	 */
	public TelephoneNumber getPhone2() {
		return phone2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone2(TelephoneNumber newPhone2, NotificationChain msgs) {
		TelephoneNumber oldPhone2 = phone2;
		phone2 = newPhone2;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getPhone2 <em>Phone2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone2</em>' containment reference.
	 * @see #getPhone2()
	 * @generated
	 */
	public void setPhone2(TelephoneNumber newPhone2) {
		if (newPhone2 != phone2) {
			NotificationChain msgs = null;
			if (phone2 != null)
				msgs = ((InternalEObject)phone2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__PHONE2, null, msgs);
			if (newPhone2 != null)
				msgs = ((InternalEObject)newPhone2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__PHONE2, null, msgs);
			msgs = basicSetPhone2(newPhone2, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getLocation
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new BasicInternalEList<PowerSystemResource>(PowerSystemResource.class);
		}
		return powerSystemResources;
	}

	/**
	 * Returns the value of the '<em><b>Secondary Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Address</em>' containment reference.
	 * @see #setSecondaryAddress(StreetAddress)
	 * @generated
	 */
	public StreetAddress getSecondaryAddress() {
		return secondaryAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryAddress(StreetAddress newSecondaryAddress, NotificationChain msgs) {
		StreetAddress oldSecondaryAddress = secondaryAddress;
		secondaryAddress = newSecondaryAddress;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getSecondaryAddress <em>Secondary Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Address</em>' containment reference.
	 * @see #getSecondaryAddress()
	 * @generated
	 */
	public void setSecondaryAddress(StreetAddress newSecondaryAddress) {
		if (newSecondaryAddress != secondaryAddress) {
			NotificationChain msgs = null;
			if (secondaryAddress != null)
				msgs = ((InternalEObject)secondaryAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__SECONDARY_ADDRESS, null, msgs);
			if (newSecondaryAddress != null)
				msgs = ((InternalEObject)newSecondaryAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__SECONDARY_ADDRESS, null, msgs);
			msgs = basicSetSecondaryAddress(newSecondaryAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getLocation
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
	}

	/**
	 * Returns the value of the '<em><b>Red Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.RedLine}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.RedLine#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Lines</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.RedLine#getLocations
	 * @generated
	 */
	public EList<RedLine> getRedLines() {
		if (redLines == null) {
			redLines = new BasicInternalEList<RedLine>(RedLine.class);
		}
		return redLines;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getCategory <em>Category</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Location#getCategory <em>Category</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Location#getCategory <em>Category</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Dimensions Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions Info</em>' reference.
	 * @see #setDimensionsInfo(DimensionsInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.DimensionsInfo#getLocations
	 * @generated
	 */
	public DimensionsInfo getDimensionsInfo() {
		if (dimensionsInfo != null && dimensionsInfo.eIsProxy()) {
			InternalEObject oldDimensionsInfo = (InternalEObject)dimensionsInfo;
			dimensionsInfo = (DimensionsInfo)eResolveProxy(oldDimensionsInfo);
			if (dimensionsInfo != oldDimensionsInfo) {
			}
		}
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsInfo basicGetDimensionsInfo() {
		return dimensionsInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionsInfo(DimensionsInfo newDimensionsInfo, NotificationChain msgs) {
		DimensionsInfo oldDimensionsInfo = dimensionsInfo;
		dimensionsInfo = newDimensionsInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getDimensionsInfo <em>Dimensions Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions Info</em>' reference.
	 * @see #getDimensionsInfo()
	 * @generated
	 */
	public void setDimensionsInfo(DimensionsInfo newDimensionsInfo) {
		if (newDimensionsInfo != dimensionsInfo) {
			NotificationChain msgs = null;
			if (dimensionsInfo != null)
				msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS, DimensionsInfo.class, msgs);
			if (newDimensionsInfo != null)
				msgs = ((InternalEObject)newDimensionsInfo).eInverseAdd(this, InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS, DimensionsInfo.class, msgs);
			msgs = basicSetDimensionsInfo(newDimensionsInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Land Properties</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.LandProperty}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.LandProperty#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Land Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Land Properties</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.LandProperty#getLocations
	 * @generated
	 */
	public EList<LandProperty> getLandProperties() {
		if (landProperties == null) {
			landProperties = new BasicInternalEList<LandProperty>(LandProperty.class);
		}
		return landProperties;
	}

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getLocation
	 * @generated
	 */
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new BasicInternalEList<Asset>(Asset.class);
		}
		return assets;
	}

	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.Hazard}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.Hazard#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.Hazard#getLocations
	 * @generated
	 */
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new BasicInternalEList<Hazard>(Hazard.class);
		}
		return hazards;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Crews</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Crew}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crews</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crews</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getLocations
	 * @generated
	 */
	public EList<Crew> getCrews() {
		if (crews == null) {
			crews = new BasicInternalEList<Crew>(Crew.class);
		}
		return crews;
	}

	/**
	 * Returns the value of the '<em><b>Position Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.PositionPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.PositionPoint#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Points</em>' reference list.
	 * @see CIM15.IEC61968.Common.PositionPoint#getLocation
	 * @generated
	 */
	public EList<PositionPoint> getPositionPoints() {
		if (positionPoints == null) {
			positionPoints = new BasicInternalEList<PositionPoint>(PositionPoint.class);
		}
		return positionPoints;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getElectronicAddress <em>Electronic Address</em>}' containment reference.
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
				msgs = ((InternalEObject)electronicAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__ELECTRONIC_ADDRESS, null, msgs);
			if (newElectronicAddress != null)
				msgs = ((InternalEObject)newElectronicAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.LOCATION__ELECTRONIC_ADDRESS, null, msgs);
			msgs = basicSetElectronicAddress(newElectronicAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Directions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.Direction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.Direction#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directions</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.Direction#getLocation
	 * @generated
	 */
	public EList<Direction> getDirections() {
		if (directions == null) {
			directions = new BasicInternalEList<Direction>(Direction.class);
		}
		return directions;
	}

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Measurement#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Measurement#getLocations
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new BasicInternalEList<Measurement>(Measurement.class);
		}
		return measurements;
	}

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLocations.Route}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLocations.Route#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLocations.Route#getLocations
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new BasicInternalEList<Route>(Route.class);
		}
		return routes;
	}

	/**
	 * Returns the value of the '<em><b>Geo Info Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Info Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Info Reference</em>' attribute.
	 * @see #isSetGeoInfoReference()
	 * @see #unsetGeoInfoReference()
	 * @see #setGeoInfoReference(String)
	 * @generated
	 */
	public String getGeoInfoReference() {
		return geoInfoReference;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Info Reference</em>' attribute.
	 * @see #isSetGeoInfoReference()
	 * @see #unsetGeoInfoReference()
	 * @see #getGeoInfoReference()
	 * @generated
	 */
	public void setGeoInfoReference(String newGeoInfoReference) {
		geoInfoReference = newGeoInfoReference;
		geoInfoReferenceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeoInfoReference()
	 * @see #getGeoInfoReference()
	 * @see #setGeoInfoReference(String)
	 * @generated
	 */
	public void unsetGeoInfoReference() {
		geoInfoReference = GEO_INFO_REFERENCE_EDEFAULT;
		geoInfoReferenceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Location#getGeoInfoReference <em>Geo Info Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geo Info Reference</em>' attribute is set.
	 * @see #unsetGeoInfoReference()
	 * @see #getGeoInfoReference()
	 * @see #setGeoInfoReference(String)
	 * @generated
	 */
	public boolean isSetGeoInfoReference() {
		return geoInfoReferenceESet;
	}

	/**
	 * Returns the value of the '<em><b>Coordinate System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.CoordinateSystem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate System</em>' reference.
	 * @see #setCoordinateSystem(CoordinateSystem)
	 * @see CIM15.IEC61968.Common.CoordinateSystem#getLocation
	 * @generated
	 */
	public CoordinateSystem getCoordinateSystem() {
		if (coordinateSystem != null && coordinateSystem.eIsProxy()) {
			InternalEObject oldCoordinateSystem = (InternalEObject)coordinateSystem;
			coordinateSystem = (CoordinateSystem)eResolveProxy(oldCoordinateSystem);
			if (coordinateSystem != oldCoordinateSystem) {
			}
		}
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystem basicGetCoordinateSystem() {
		return coordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(CoordinateSystem newCoordinateSystem, NotificationChain msgs) {
		CoordinateSystem oldCoordinateSystem = coordinateSystem;
		coordinateSystem = newCoordinateSystem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getCoordinateSystem <em>Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate System</em>' reference.
	 * @see #getCoordinateSystem()
	 * @generated
	 */
	public void setCoordinateSystem(CoordinateSystem newCoordinateSystem) {
		if (newCoordinateSystem != coordinateSystem) {
			NotificationChain msgs = null;
			if (coordinateSystem != null)
				msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__LOCATION, CoordinateSystem.class, msgs);
			if (newCoordinateSystem != null)
				msgs = ((InternalEObject)newCoordinateSystem).eInverseAdd(this, CommonPackage.COORDINATE_SYSTEM__LOCATION, CoordinateSystem.class, msgs);
			msgs = basicSetCoordinateSystem(newCoordinateSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Corporate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corporate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public String getCorporateCode() {
		return corporateCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corporate Code</em>' attribute.
	 * @see #isSetCorporateCode()
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @generated
	 */
	public void setCorporateCode(String newCorporateCode) {
		corporateCode = newCorporateCode;
		corporateCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public void unsetCorporateCode() {
		corporateCode = CORPORATE_CODE_EDEFAULT;
		corporateCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Location#getCorporateCode <em>Corporate Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Corporate Code</em>' attribute is set.
	 * @see #unsetCorporateCode()
	 * @see #getCorporateCode()
	 * @see #setCorporateCode(String)
	 * @generated
	 */
	public boolean isSetCorporateCode() {
		return corporateCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Organisations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Organisations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getLocations
	 * @generated
	 */
	public EList<ErpOrganisation> getErpOrganisations() {
		if (erpOrganisations == null) {
			erpOrganisations = new BasicInternalEList<ErpOrganisation>(ErpOrganisation.class);
		}
		return erpOrganisations;
	}

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(String)
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.Location#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	public void setDirection(String newDirection) {
		direction = newDirection;
		directionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.Location#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(String)
	 * @generated
	 */
	public void unsetDirection() {
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.Location#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(String)
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
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
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__RED_LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRedLines()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				if (dimensionsInfo != null)
					msgs = ((InternalEObject)dimensionsInfo).eInverseRemove(this, InfAssetsPackage.DIMENSIONS_INFO__LOCATIONS, DimensionsInfo.class, msgs);
				return basicSetDimensionsInfo((DimensionsInfo)otherEnd, msgs);
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLandProperties()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssets()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__HAZARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHazards()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__CREWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrews()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__POSITION_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPositionPoints()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__DIRECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDirections()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__ROUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoutes()).basicAdd(otherEnd, msgs);
			case CommonPackage.LOCATION__COORDINATE_SYSTEM:
				if (coordinateSystem != null)
					msgs = ((InternalEObject)coordinateSystem).eInverseRemove(this, CommonPackage.COORDINATE_SYSTEM__LOCATION, CoordinateSystem.class, msgs);
				return basicSetCoordinateSystem((CoordinateSystem)otherEnd, msgs);
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpOrganisations()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				return basicSetMainAddress(null, msgs);
			case CommonPackage.LOCATION__PHONE1:
				return basicSetPhone1(null, msgs);
			case CommonPackage.LOCATION__PHONE2:
				return basicSetPhone2(null, msgs);
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				return basicSetSecondaryAddress(null, msgs);
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__RED_LINES:
				return ((InternalEList<?>)getRedLines()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				return basicSetDimensionsInfo(null, msgs);
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return ((InternalEList<?>)getLandProperties()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__ASSETS:
				return ((InternalEList<?>)getAssets()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__HAZARDS:
				return ((InternalEList<?>)getHazards()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__STATUS:
				return basicSetStatus(null, msgs);
			case CommonPackage.LOCATION__CREWS:
				return ((InternalEList<?>)getCrews()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__POSITION_POINTS:
				return ((InternalEList<?>)getPositionPoints()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				return basicSetElectronicAddress(null, msgs);
			case CommonPackage.LOCATION__DIRECTIONS:
				return ((InternalEList<?>)getDirections()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
			case CommonPackage.LOCATION__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return ((InternalEList<?>)getErpOrganisations()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				return getMainAddress();
			case CommonPackage.LOCATION__PHONE1:
				return getPhone1();
			case CommonPackage.LOCATION__PHONE2:
				return getPhone2();
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				return getSecondaryAddress();
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return getChangeItems();
			case CommonPackage.LOCATION__RED_LINES:
				return getRedLines();
			case CommonPackage.LOCATION__CATEGORY:
				return getCategory();
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				if (resolve) return getDimensionsInfo();
				return basicGetDimensionsInfo();
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return getLandProperties();
			case CommonPackage.LOCATION__ASSETS:
				return getAssets();
			case CommonPackage.LOCATION__HAZARDS:
				return getHazards();
			case CommonPackage.LOCATION__STATUS:
				return getStatus();
			case CommonPackage.LOCATION__CREWS:
				return getCrews();
			case CommonPackage.LOCATION__POSITION_POINTS:
				return getPositionPoints();
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				return getElectronicAddress();
			case CommonPackage.LOCATION__DIRECTIONS:
				return getDirections();
			case CommonPackage.LOCATION__MEASUREMENTS:
				return getMeasurements();
			case CommonPackage.LOCATION__ROUTES:
				return getRoutes();
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				return getGeoInfoReference();
			case CommonPackage.LOCATION__COORDINATE_SYSTEM:
				if (resolve) return getCoordinateSystem();
				return basicGetCoordinateSystem();
			case CommonPackage.LOCATION__CORPORATE_CODE:
				return getCorporateCode();
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return getErpOrganisations();
			case CommonPackage.LOCATION__DIRECTION:
				return getDirection();
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
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				setMainAddress((StreetAddress)newValue);
				return;
			case CommonPackage.LOCATION__PHONE1:
				setPhone1((TelephoneNumber)newValue);
				return;
			case CommonPackage.LOCATION__PHONE2:
				setPhone2((TelephoneNumber)newValue);
				return;
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				setSecondaryAddress((StreetAddress)newValue);
				return;
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case CommonPackage.LOCATION__RED_LINES:
				getRedLines().clear();
				getRedLines().addAll((Collection<? extends RedLine>)newValue);
				return;
			case CommonPackage.LOCATION__CATEGORY:
				setCategory((String)newValue);
				return;
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)newValue);
				return;
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				getLandProperties().clear();
				getLandProperties().addAll((Collection<? extends LandProperty>)newValue);
				return;
			case CommonPackage.LOCATION__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CommonPackage.LOCATION__HAZARDS:
				getHazards().clear();
				getHazards().addAll((Collection<? extends Hazard>)newValue);
				return;
			case CommonPackage.LOCATION__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.LOCATION__CREWS:
				getCrews().clear();
				getCrews().addAll((Collection<? extends Crew>)newValue);
				return;
			case CommonPackage.LOCATION__POSITION_POINTS:
				getPositionPoints().clear();
				getPositionPoints().addAll((Collection<? extends PositionPoint>)newValue);
				return;
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)newValue);
				return;
			case CommonPackage.LOCATION__DIRECTIONS:
				getDirections().clear();
				getDirections().addAll((Collection<? extends Direction>)newValue);
				return;
			case CommonPackage.LOCATION__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CommonPackage.LOCATION__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
				return;
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				setGeoInfoReference((String)newValue);
				return;
			case CommonPackage.LOCATION__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)newValue);
				return;
			case CommonPackage.LOCATION__CORPORATE_CODE:
				setCorporateCode((String)newValue);
				return;
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				getErpOrganisations().clear();
				getErpOrganisations().addAll((Collection<? extends ErpOrganisation>)newValue);
				return;
			case CommonPackage.LOCATION__DIRECTION:
				setDirection((String)newValue);
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
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				setMainAddress((StreetAddress)null);
				return;
			case CommonPackage.LOCATION__PHONE1:
				setPhone1((TelephoneNumber)null);
				return;
			case CommonPackage.LOCATION__PHONE2:
				setPhone2((TelephoneNumber)null);
				return;
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				setSecondaryAddress((StreetAddress)null);
				return;
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case CommonPackage.LOCATION__RED_LINES:
				getRedLines().clear();
				return;
			case CommonPackage.LOCATION__CATEGORY:
				unsetCategory();
				return;
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				setDimensionsInfo((DimensionsInfo)null);
				return;
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				getLandProperties().clear();
				return;
			case CommonPackage.LOCATION__ASSETS:
				getAssets().clear();
				return;
			case CommonPackage.LOCATION__HAZARDS:
				getHazards().clear();
				return;
			case CommonPackage.LOCATION__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.LOCATION__CREWS:
				getCrews().clear();
				return;
			case CommonPackage.LOCATION__POSITION_POINTS:
				getPositionPoints().clear();
				return;
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				setElectronicAddress((ElectronicAddress)null);
				return;
			case CommonPackage.LOCATION__DIRECTIONS:
				getDirections().clear();
				return;
			case CommonPackage.LOCATION__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CommonPackage.LOCATION__ROUTES:
				getRoutes().clear();
				return;
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				unsetGeoInfoReference();
				return;
			case CommonPackage.LOCATION__COORDINATE_SYSTEM:
				setCoordinateSystem((CoordinateSystem)null);
				return;
			case CommonPackage.LOCATION__CORPORATE_CODE:
				unsetCorporateCode();
				return;
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				getErpOrganisations().clear();
				return;
			case CommonPackage.LOCATION__DIRECTION:
				unsetDirection();
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
			case CommonPackage.LOCATION__MAIN_ADDRESS:
				return mainAddress != null;
			case CommonPackage.LOCATION__PHONE1:
				return phone1 != null;
			case CommonPackage.LOCATION__PHONE2:
				return phone2 != null;
			case CommonPackage.LOCATION__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case CommonPackage.LOCATION__SECONDARY_ADDRESS:
				return secondaryAddress != null;
			case CommonPackage.LOCATION__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case CommonPackage.LOCATION__RED_LINES:
				return redLines != null && !redLines.isEmpty();
			case CommonPackage.LOCATION__CATEGORY:
				return isSetCategory();
			case CommonPackage.LOCATION__DIMENSIONS_INFO:
				return dimensionsInfo != null;
			case CommonPackage.LOCATION__LAND_PROPERTIES:
				return landProperties != null && !landProperties.isEmpty();
			case CommonPackage.LOCATION__ASSETS:
				return assets != null && !assets.isEmpty();
			case CommonPackage.LOCATION__HAZARDS:
				return hazards != null && !hazards.isEmpty();
			case CommonPackage.LOCATION__STATUS:
				return status != null;
			case CommonPackage.LOCATION__CREWS:
				return crews != null && !crews.isEmpty();
			case CommonPackage.LOCATION__POSITION_POINTS:
				return positionPoints != null && !positionPoints.isEmpty();
			case CommonPackage.LOCATION__ELECTRONIC_ADDRESS:
				return electronicAddress != null;
			case CommonPackage.LOCATION__DIRECTIONS:
				return directions != null && !directions.isEmpty();
			case CommonPackage.LOCATION__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CommonPackage.LOCATION__ROUTES:
				return routes != null && !routes.isEmpty();
			case CommonPackage.LOCATION__GEO_INFO_REFERENCE:
				return isSetGeoInfoReference();
			case CommonPackage.LOCATION__COORDINATE_SYSTEM:
				return coordinateSystem != null;
			case CommonPackage.LOCATION__CORPORATE_CODE:
				return isSetCorporateCode();
			case CommonPackage.LOCATION__ERP_ORGANISATIONS:
				return erpOrganisations != null && !erpOrganisations.isEmpty();
			case CommonPackage.LOCATION__DIRECTION:
				return isSetDirection();
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
		result.append(" (category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(", geoInfoReference: ");
		if (geoInfoReferenceESet) result.append(geoInfoReference); else result.append("<unset>");
		result.append(", corporateCode: ");
		if (corporateCodeESet) result.append(corporateCode); else result.append("<unset>");
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Location
