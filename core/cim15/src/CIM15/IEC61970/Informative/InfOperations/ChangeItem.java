/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Assets.Asset;
import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.CommonPackage;
import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Location;
import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation;
import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation;
import CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector;
import CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector <em>Gml Selector</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet <em>Change Set</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getGmlSelector() <em>Gml Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSelector()
	 * @generated
	 * @ordered
	 */
	protected GmlSelector gmlSelector;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected ErpOrganisation organisation;

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
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset asset;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

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
	protected static final ChangeItemKind KIND_EDEFAULT = ChangeItemKind.ADD;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ChangeItemKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getGmlObservation() <em>Gml Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlObservation()
	 * @generated
	 * @ordered
	 */
	protected GmlObservation gmlObservation;

	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource powerSystemResource;

	/**
	 * The cached value of the '{@link #getChangeSet() <em>Change Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSet()
	 * @generated
	 * @ordered
	 */
	protected ChangeSet changeSet;

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
	 * The cached value of the '{@link #getNetworkDataSet() <em>Network Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkDataSet()
	 * @generated
	 * @ordered
	 */
	protected NetworkDataSet networkDataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.CHANGE_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Gml Selector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Selector</em>' reference.
	 * @see #setGmlSelector(GmlSelector)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSelector#getChangeItems
	 * @generated
	 */
	public GmlSelector getGmlSelector() {
		if (gmlSelector != null && gmlSelector.eIsProxy()) {
			InternalEObject oldGmlSelector = (InternalEObject)gmlSelector;
			gmlSelector = (GmlSelector)eResolveProxy(oldGmlSelector);
			if (gmlSelector != oldGmlSelector) {
			}
		}
		return gmlSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlSelector basicGetGmlSelector() {
		return gmlSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlSelector(GmlSelector newGmlSelector, NotificationChain msgs) {
		GmlSelector oldGmlSelector = gmlSelector;
		gmlSelector = newGmlSelector;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlSelector <em>Gml Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Selector</em>' reference.
	 * @see #getGmlSelector()
	 * @generated
	 */
	public void setGmlSelector(GmlSelector newGmlSelector) {
		if (newGmlSelector != gmlSelector) {
			NotificationChain msgs = null;
			if (gmlSelector != null)
				msgs = ((InternalEObject)gmlSelector).eInverseRemove(this, InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS, GmlSelector.class, msgs);
			if (newGmlSelector != null)
				msgs = ((InternalEObject)newGmlSelector).eInverseAdd(this, InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS, GmlSelector.class, msgs);
			msgs = basicSetGmlSelector(newGmlSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' reference.
	 * @see #setOrganisation(ErpOrganisation)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpOrganisation#getChangeItems
	 * @generated
	 */
	public ErpOrganisation getOrganisation() {
		if (organisation != null && organisation.eIsProxy()) {
			InternalEObject oldOrganisation = (InternalEObject)organisation;
			organisation = (ErpOrganisation)eResolveProxy(oldOrganisation);
			if (organisation != oldOrganisation) {
			}
		}
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpOrganisation basicGetOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisation(ErpOrganisation newOrganisation, NotificationChain msgs) {
		ErpOrganisation oldOrganisation = organisation;
		organisation = newOrganisation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getOrganisation <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	public void setOrganisation(ErpOrganisation newOrganisation) {
		if (newOrganisation != organisation) {
			NotificationChain msgs = null;
			if (organisation != null)
				msgs = ((InternalEObject)organisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS, ErpOrganisation.class, msgs);
			if (newOrganisation != null)
				msgs = ((InternalEObject)newOrganisation).eInverseAdd(this, InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS, ErpOrganisation.class, msgs);
			msgs = basicSetOrganisation(newOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Document#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see CIM15.IEC61968.Common.Document#getChangeItems
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getDocument <em>Document</em>}' reference.
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
				msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__CHANGE_ITEMS, Document.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, CommonPackage.DOCUMENT__CHANGE_ITEMS, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' reference.
	 * @see #setAsset(Asset)
	 * @see CIM15.IEC61968.Assets.Asset#getChangeItems
	 * @generated
	 */
	public Asset getAsset() {
		if (asset != null && asset.eIsProxy()) {
			InternalEObject oldAsset = (InternalEObject)asset;
			asset = (Asset)eResolveProxy(oldAsset);
			if (asset != oldAsset) {
			}
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset() {
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsset(Asset newAsset, NotificationChain msgs) {
		Asset oldAsset = asset;
		asset = newAsset;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getAsset <em>Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset</em>' reference.
	 * @see #getAsset()
	 * @generated
	 */
	public void setAsset(Asset newAsset) {
		if (newAsset != asset) {
			NotificationChain msgs = null;
			if (asset != null)
				msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__CHANGE_ITEMS, Asset.class, msgs);
			if (newAsset != null)
				msgs = ((InternalEObject)newAsset).eInverseAdd(this, AssetsPackage.ASSET__CHANGE_ITEMS, Asset.class, msgs);
			msgs = basicSetAsset(newAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
		sequenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public void unsetSequenceNumber() {
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.CHANGE_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.CHANGE_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfOperations.ChangeItemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ChangeItemKind)
	 * @generated
	 */
	public ChangeItemKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItemKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(ChangeItemKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ChangeItemKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ChangeItemKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Observation</em>' reference.
	 * @see #setGmlObservation(GmlObservation)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems
	 * @generated
	 */
	public GmlObservation getGmlObservation() {
		if (gmlObservation != null && gmlObservation.eIsProxy()) {
			InternalEObject oldGmlObservation = (InternalEObject)gmlObservation;
			gmlObservation = (GmlObservation)eResolveProxy(oldGmlObservation);
			if (gmlObservation != oldGmlObservation) {
			}
		}
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlObservation basicGetGmlObservation() {
		return gmlObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlObservation(GmlObservation newGmlObservation, NotificationChain msgs) {
		GmlObservation oldGmlObservation = gmlObservation;
		gmlObservation = newGmlObservation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Observation</em>' reference.
	 * @see #getGmlObservation()
	 * @generated
	 */
	public void setGmlObservation(GmlObservation newGmlObservation) {
		if (newGmlObservation != gmlObservation) {
			NotificationChain msgs = null;
			if (gmlObservation != null)
				msgs = ((InternalEObject)gmlObservation).eInverseRemove(this, InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS, GmlObservation.class, msgs);
			if (newGmlObservation != null)
				msgs = ((InternalEObject)newGmlObservation).eInverseAdd(this, InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS, GmlObservation.class, msgs);
			msgs = basicSetGmlObservation(newGmlObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getChangeItems
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference.
	 * @see #setPowerSystemResource(PowerSystemResource)
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getChangeItems
	 * @generated
	 */
	public PowerSystemResource getPowerSystemResource() {
		if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
			InternalEObject oldPowerSystemResource = (InternalEObject)powerSystemResource;
			powerSystemResource = (PowerSystemResource)eResolveProxy(oldPowerSystemResource);
			if (powerSystemResource != oldPowerSystemResource) {
			}
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetPowerSystemResource() {
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
		PowerSystemResource oldPowerSystemResource = powerSystemResource;
		powerSystemResource = newPowerSystemResource;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getPowerSystemResource <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power System Resource</em>' reference.
	 * @see #getPowerSystemResource()
	 * @generated
	 */
	public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
		if (newPowerSystemResource != powerSystemResource) {
			NotificationChain msgs = null;
			if (powerSystemResource != null)
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Change Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Set</em>' reference.
	 * @see #setChangeSet(ChangeSet)
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet#getChangeItems
	 * @generated
	 */
	public ChangeSet getChangeSet() {
		if (changeSet != null && changeSet.eIsProxy()) {
			InternalEObject oldChangeSet = (InternalEObject)changeSet;
			changeSet = (ChangeSet)eResolveProxy(oldChangeSet);
			if (changeSet != oldChangeSet) {
			}
		}
		return changeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeSet basicGetChangeSet() {
		return changeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeSet(ChangeSet newChangeSet, NotificationChain msgs) {
		ChangeSet oldChangeSet = changeSet;
		changeSet = newChangeSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getChangeSet <em>Change Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Set</em>' reference.
	 * @see #getChangeSet()
	 * @generated
	 */
	public void setChangeSet(ChangeSet newChangeSet) {
		if (newChangeSet != changeSet) {
			NotificationChain msgs = null;
			if (changeSet != null)
				msgs = ((InternalEObject)changeSet).eInverseRemove(this, InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS, ChangeSet.class, msgs);
			if (newChangeSet != null)
				msgs = ((InternalEObject)newChangeSet).eInverseAdd(this, InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS, ChangeSet.class, msgs);
			msgs = basicSetChangeSet(newChangeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Location#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see CIM15.IEC61968.Common.Location#getChangeItems
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getLocation <em>Location</em>}' reference.
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
				msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__CHANGE_ITEMS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CommonPackage.LOCATION__CHANGE_ITEMS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Network Data Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems <em>Change Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Data Set</em>' reference.
	 * @see #setNetworkDataSet(NetworkDataSet)
	 * @see CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems
	 * @generated
	 */
	public NetworkDataSet getNetworkDataSet() {
		if (networkDataSet != null && networkDataSet.eIsProxy()) {
			InternalEObject oldNetworkDataSet = (InternalEObject)networkDataSet;
			networkDataSet = (NetworkDataSet)eResolveProxy(oldNetworkDataSet);
			if (networkDataSet != oldNetworkDataSet) {
			}
		}
		return networkDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkDataSet basicGetNetworkDataSet() {
		return networkDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkDataSet(NetworkDataSet newNetworkDataSet, NotificationChain msgs) {
		NetworkDataSet oldNetworkDataSet = networkDataSet;
		networkDataSet = newNetworkDataSet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Data Set</em>' reference.
	 * @see #getNetworkDataSet()
	 * @generated
	 */
	public void setNetworkDataSet(NetworkDataSet newNetworkDataSet) {
		if (newNetworkDataSet != networkDataSet) {
			NotificationChain msgs = null;
			if (networkDataSet != null)
				msgs = ((InternalEObject)networkDataSet).eInverseRemove(this, InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS, NetworkDataSet.class, msgs);
			if (newNetworkDataSet != null)
				msgs = ((InternalEObject)newNetworkDataSet).eInverseAdd(this, InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS, NetworkDataSet.class, msgs);
			msgs = basicSetNetworkDataSet(newNetworkDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.CHANGE_ITEM__GML_SELECTOR:
				if (gmlSelector != null)
					msgs = ((InternalEObject)gmlSelector).eInverseRemove(this, InfGMLSupportPackage.GML_SELECTOR__CHANGE_ITEMS, GmlSelector.class, msgs);
				return basicSetGmlSelector((GmlSelector)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__ORGANISATION:
				if (organisation != null)
					msgs = ((InternalEObject)organisation).eInverseRemove(this, InfERPSupportPackage.ERP_ORGANISATION__CHANGE_ITEMS, ErpOrganisation.class, msgs);
				return basicSetOrganisation((ErpOrganisation)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, CommonPackage.DOCUMENT__CHANGE_ITEMS, Document.class, msgs);
				return basicSetDocument((Document)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__ASSET:
				if (asset != null)
					msgs = ((InternalEObject)asset).eInverseRemove(this, AssetsPackage.ASSET__CHANGE_ITEMS, Asset.class, msgs);
				return basicSetAsset((Asset)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__GML_OBSERVATION:
				if (gmlObservation != null)
					msgs = ((InternalEObject)gmlObservation).eInverseRemove(this, InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS, GmlObservation.class, msgs);
				return basicSetGmlObservation((GmlObservation)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__CHANGE_ITEMS, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__CHANGE_ITEMS, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__CHANGE_SET:
				if (changeSet != null)
					msgs = ((InternalEObject)changeSet).eInverseRemove(this, InfOperationsPackage.CHANGE_SET__CHANGE_ITEMS, ChangeSet.class, msgs);
				return basicSetChangeSet((ChangeSet)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CommonPackage.LOCATION__CHANGE_ITEMS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case InfOperationsPackage.CHANGE_ITEM__NETWORK_DATA_SET:
				if (networkDataSet != null)
					msgs = ((InternalEObject)networkDataSet).eInverseRemove(this, InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS, NetworkDataSet.class, msgs);
				return basicSetNetworkDataSet((NetworkDataSet)otherEnd, msgs);
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
			case InfOperationsPackage.CHANGE_ITEM__GML_SELECTOR:
				return basicSetGmlSelector(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__ORGANISATION:
				return basicSetOrganisation(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__DOCUMENT:
				return basicSetDocument(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__ASSET:
				return basicSetAsset(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__GML_OBSERVATION:
				return basicSetGmlObservation(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__CHANGE_SET:
				return basicSetChangeSet(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__LOCATION:
				return basicSetLocation(null, msgs);
			case InfOperationsPackage.CHANGE_ITEM__NETWORK_DATA_SET:
				return basicSetNetworkDataSet(null, msgs);
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
			case InfOperationsPackage.CHANGE_ITEM__GML_SELECTOR:
				if (resolve) return getGmlSelector();
				return basicGetGmlSelector();
			case InfOperationsPackage.CHANGE_ITEM__ORGANISATION:
				if (resolve) return getOrganisation();
				return basicGetOrganisation();
			case InfOperationsPackage.CHANGE_ITEM__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case InfOperationsPackage.CHANGE_ITEM__ASSET:
				if (resolve) return getAsset();
				return basicGetAsset();
			case InfOperationsPackage.CHANGE_ITEM__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case InfOperationsPackage.CHANGE_ITEM__STATUS:
				return getStatus();
			case InfOperationsPackage.CHANGE_ITEM__KIND:
				return getKind();
			case InfOperationsPackage.CHANGE_ITEM__GML_OBSERVATION:
				if (resolve) return getGmlObservation();
				return basicGetGmlObservation();
			case InfOperationsPackage.CHANGE_ITEM__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case InfOperationsPackage.CHANGE_ITEM__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
			case InfOperationsPackage.CHANGE_ITEM__CHANGE_SET:
				if (resolve) return getChangeSet();
				return basicGetChangeSet();
			case InfOperationsPackage.CHANGE_ITEM__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case InfOperationsPackage.CHANGE_ITEM__NETWORK_DATA_SET:
				if (resolve) return getNetworkDataSet();
				return basicGetNetworkDataSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfOperationsPackage.CHANGE_ITEM__GML_SELECTOR:
				setGmlSelector((GmlSelector)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__ORGANISATION:
				setOrganisation((ErpOrganisation)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__ASSET:
				setAsset((Asset)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__KIND:
				setKind((ChangeItemKind)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__GML_OBSERVATION:
				setGmlObservation((GmlObservation)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__CHANGE_SET:
				setChangeSet((ChangeSet)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__LOCATION:
				setLocation((Location)newValue);
				return;
			case InfOperationsPackage.CHANGE_ITEM__NETWORK_DATA_SET:
				setNetworkDataSet((NetworkDataSet)newValue);
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
			case InfOperationsPackage.CHANGE_ITEM__GML_SELECTOR:
				setGmlSelector((GmlSelector)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__ORGANISATION:
				setOrganisation((ErpOrganisation)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__DOCUMENT:
				setDocument((Document)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__ASSET:
				setAsset((Asset)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case InfOperationsPackage.CHANGE_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__KIND:
				unsetKind();
				return;
			case InfOperationsPackage.CHANGE_ITEM__GML_OBSERVATION:
				setGmlObservation((GmlObservation)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__CHANGE_SET:
				setChangeSet((ChangeSet)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__LOCATION:
				setLocation((Location)null);
				return;
			case InfOperationsPackage.CHANGE_ITEM__NETWORK_DATA_SET:
				setNetworkDataSet((NetworkDataSet)null);
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
			case InfOperationsPackage.CHANGE_ITEM__GML_SELECTOR:
				return gmlSelector != null;
			case InfOperationsPackage.CHANGE_ITEM__ORGANISATION:
				return organisation != null;
			case InfOperationsPackage.CHANGE_ITEM__DOCUMENT:
				return document != null;
			case InfOperationsPackage.CHANGE_ITEM__ASSET:
				return asset != null;
			case InfOperationsPackage.CHANGE_ITEM__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case InfOperationsPackage.CHANGE_ITEM__STATUS:
				return status != null;
			case InfOperationsPackage.CHANGE_ITEM__KIND:
				return isSetKind();
			case InfOperationsPackage.CHANGE_ITEM__GML_OBSERVATION:
				return gmlObservation != null;
			case InfOperationsPackage.CHANGE_ITEM__ERP_PERSON:
				return erpPerson != null;
			case InfOperationsPackage.CHANGE_ITEM__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
			case InfOperationsPackage.CHANGE_ITEM__CHANGE_SET:
				return changeSet != null;
			case InfOperationsPackage.CHANGE_ITEM__LOCATION:
				return location != null;
			case InfOperationsPackage.CHANGE_ITEM__NETWORK_DATA_SET:
				return networkDataSet != null;
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
		result.append(" (sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ChangeItem
