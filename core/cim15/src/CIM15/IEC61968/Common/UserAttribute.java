/**
 */
package CIM15.IEC61968.Common;

import CIM15.Element;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM15.IEC61968.PaymentMetering.Transaction;

import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM15.IEC61970.Informative.InfAssets.Procedure;
import CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet;
import CIM15.IEC61970.Informative.InfAssets.Specification;

import CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem;
import CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getErpLedgerEntries <em>Erp Ledger Entries</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getName <em>Name</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getPropertyAssets <em>Property Assets</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.UserAttribute#getRatingAssets <em>Rating Assets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserAttribute extends Element {
	/**
	 * The cached value of the '{@link #getErpLedgerEntries() <em>Erp Ledger Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpLedgerEntry> erpLedgerEntries;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The cached value of the '{@link #getProcedureDataSets() <em>Procedure Data Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDataSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureDataSet> procedureDataSets;

	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected Transaction transaction;

	/**
	 * The cached value of the '{@link #getPropertySpecification() <em>Property Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification propertySpecification;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

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
	 * The cached value of the '{@link #getPropertyAssets() <em>Property Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> propertyAssets;

	/**
	 * The cached value of the '{@link #getRatingSpecification() <em>Rating Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification ratingSpecification;

	/**
	 * The cached value of the '{@link #getErpInvoiceLineItems() <em>Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> erpInvoiceLineItems;

	/**
	 * The cached value of the '{@link #getRatingAssets() <em>Rating Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> ratingAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAttribute() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.USER_ATTRIBUTE;
	}

	/**
	 * Returns the value of the '<em><b>Erp Ledger Entries</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Entries</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getUserAttributes
	 * @generated
	 */
	public EList<ErpLedgerEntry> getErpLedgerEntries() {
		if (erpLedgerEntries == null) {
			erpLedgerEntries = new BasicInternalEList<ErpLedgerEntry>(ErpLedgerEntry.class);
		}
		return erpLedgerEntries;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
		nameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public void unsetName() {
		name = NAME_EDEFAULT;
		nameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
		valueESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public void unsetValue() {
		value = VALUE_EDEFAULT;
		valueESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(String)
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * Returns the value of the '<em><b>Procedure Data Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Data Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Data Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties
	 * @generated
	 */
	public EList<ProcedureDataSet> getProcedureDataSets() {
		if (procedureDataSets == null) {
			procedureDataSets = new BasicInternalEList<ProcedureDataSet>(ProcedureDataSet.class);
		}
		return procedureDataSets;
	}

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.Transaction#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference.
	 * @see #setTransaction(Transaction)
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getUserAttributes
	 * @generated
	 */
	public Transaction getTransaction() {
		if (transaction != null && transaction.eIsProxy()) {
			InternalEObject oldTransaction = (InternalEObject)transaction;
			transaction = (Transaction)eResolveProxy(oldTransaction);
			if (transaction != oldTransaction) {
			}
		}
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction basicGetTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(Transaction newTransaction, NotificationChain msgs) {
		Transaction oldTransaction = transaction;
		transaction = newTransaction;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getTransaction <em>Transaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' reference.
	 * @see #getTransaction()
	 * @generated
	 */
	public void setTransaction(Transaction newTransaction) {
		if (newTransaction != transaction) {
			NotificationChain msgs = null;
			if (transaction != null)
				msgs = ((InternalEObject)transaction).eInverseRemove(this, PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject)newTransaction).eInverseAdd(this, PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Property Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getAssetProperites <em>Asset Properites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Specification</em>' reference.
	 * @see #setPropertySpecification(Specification)
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getAssetProperites
	 * @generated
	 */
	public Specification getPropertySpecification() {
		if (propertySpecification != null && propertySpecification.eIsProxy()) {
			InternalEObject oldPropertySpecification = (InternalEObject)propertySpecification;
			propertySpecification = (Specification)eResolveProxy(oldPropertySpecification);
			if (propertySpecification != oldPropertySpecification) {
			}
		}
		return propertySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetPropertySpecification() {
		return propertySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertySpecification(Specification newPropertySpecification, NotificationChain msgs) {
		Specification oldPropertySpecification = propertySpecification;
		propertySpecification = newPropertySpecification;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getPropertySpecification <em>Property Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Specification</em>' reference.
	 * @see #getPropertySpecification()
	 * @generated
	 */
	public void setPropertySpecification(Specification newPropertySpecification) {
		if (newPropertySpecification != propertySpecification) {
			NotificationChain msgs = null;
			if (propertySpecification != null)
				msgs = ((InternalEObject)propertySpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES, Specification.class, msgs);
			if (newPropertySpecification != null)
				msgs = ((InternalEObject)newPropertySpecification).eInverseAdd(this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES, Specification.class, msgs);
			msgs = basicSetPropertySpecification(newPropertySpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureValues <em>Procedure Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference.
	 * @see #setProcedure(Procedure)
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureValues
	 * @generated
	 */
	public Procedure getProcedure() {
		if (procedure != null && procedure.eIsProxy()) {
			InternalEObject oldProcedure = (InternalEObject)procedure;
			procedure = (Procedure)eResolveProxy(oldProcedure);
			if (procedure != oldProcedure) {
			}
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure basicGetProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getProcedure <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' reference.
	 * @see #getProcedure()
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES, Procedure.class, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES, Procedure.class, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Property Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getProperties
	 * @generated
	 */
	public EList<Asset> getPropertyAssets() {
		if (propertyAssets == null) {
			propertyAssets = new BasicInternalEList<Asset>(Asset.class);
		}
		return propertyAssets;
	}

	/**
	 * Returns the value of the '<em><b>Rating Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Specification#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Specification</em>' reference.
	 * @see #setRatingSpecification(Specification)
	 * @see CIM15.IEC61970.Informative.InfAssets.Specification#getRatings
	 * @generated
	 */
	public Specification getRatingSpecification() {
		if (ratingSpecification != null && ratingSpecification.eIsProxy()) {
			InternalEObject oldRatingSpecification = (InternalEObject)ratingSpecification;
			ratingSpecification = (Specification)eResolveProxy(oldRatingSpecification);
			if (ratingSpecification != oldRatingSpecification) {
			}
		}
		return ratingSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetRatingSpecification() {
		return ratingSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatingSpecification(Specification newRatingSpecification, NotificationChain msgs) {
		Specification oldRatingSpecification = ratingSpecification;
		ratingSpecification = newRatingSpecification;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.UserAttribute#getRatingSpecification <em>Rating Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating Specification</em>' reference.
	 * @see #getRatingSpecification()
	 * @generated
	 */
	public void setRatingSpecification(Specification newRatingSpecification) {
		if (newRatingSpecification != ratingSpecification) {
			NotificationChain msgs = null;
			if (ratingSpecification != null)
				msgs = ((InternalEObject)ratingSpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RATINGS, Specification.class, msgs);
			if (newRatingSpecification != null)
				msgs = ((InternalEObject)newRatingSpecification).eInverseAdd(this, InfAssetsPackage.SPECIFICATION__RATINGS, Specification.class, msgs);
			msgs = basicSetRatingSpecification(newRatingSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getErpInvoiceLineItems() {
		if (erpInvoiceLineItems == null) {
			erpInvoiceLineItems = new BasicInternalEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class);
		}
		return erpInvoiceLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Rating Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Assets.Asset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Assets.Asset#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Assets</em>' reference list.
	 * @see CIM15.IEC61968.Assets.Asset#getRatings
	 * @generated
	 */
	public EList<Asset> getRatingAssets() {
		if (ratingAssets == null) {
			ratingAssets = new BasicInternalEList<Asset>(Asset.class);
		}
		return ratingAssets;
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
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLedgerEntries()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedureDataSets()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				if (transaction != null)
					msgs = ((InternalEObject)transaction).eInverseRemove(this, PaymentMeteringPackage.TRANSACTION__USER_ATTRIBUTES, Transaction.class, msgs);
				return basicSetTransaction((Transaction)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				if (propertySpecification != null)
					msgs = ((InternalEObject)propertySpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__ASSET_PROPERITES, Specification.class, msgs);
				return basicSetPropertySpecification((Specification)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				if (procedure != null)
					msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_VALUES, Procedure.class, msgs);
				return basicSetProcedure((Procedure)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPropertyAssets()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				if (ratingSpecification != null)
					msgs = ((InternalEObject)ratingSpecification).eInverseRemove(this, InfAssetsPackage.SPECIFICATION__RATINGS, Specification.class, msgs);
				return basicSetRatingSpecification((Specification)otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRatingAssets()).basicAdd(otherEnd, msgs);
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
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return ((InternalEList<?>)getErpLedgerEntries()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return ((InternalEList<?>)getProcedureDataSets()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				return basicSetPropertySpecification(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return ((InternalEList<?>)getPropertyAssets()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				return basicSetRatingSpecification(null, msgs);
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return ((InternalEList<?>)getRatingAssets()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return getErpLedgerEntries();
			case CommonPackage.USER_ATTRIBUTE__NAME:
				return getName();
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				return getValue();
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return getProcedureDataSets();
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				if (resolve) return getTransaction();
				return basicGetTransaction();
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				if (resolve) return getPropertySpecification();
				return basicGetPropertySpecification();
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return getPropertyAssets();
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				if (resolve) return getRatingSpecification();
				return basicGetRatingSpecification();
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return getErpInvoiceLineItems();
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return getRatingAssets();
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
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
				getErpLedgerEntries().addAll((Collection<? extends ErpLedgerEntry>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				setValue((String)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				getProcedureDataSets().addAll((Collection<? extends ProcedureDataSet>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				setTransaction((Transaction)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				setPropertySpecification((Specification)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				getPropertyAssets().clear();
				getPropertyAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				setRatingSpecification((Specification)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				getErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				getRatingAssets().clear();
				getRatingAssets().addAll((Collection<? extends Asset>)newValue);
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
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				getErpLedgerEntries().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__NAME:
				unsetName();
				return;
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				unsetValue();
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				getProcedureDataSets().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				setTransaction((Transaction)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				setPropertySpecification((Specification)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				getPropertyAssets().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				setRatingSpecification((Specification)null);
				return;
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				getErpInvoiceLineItems().clear();
				return;
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				getRatingAssets().clear();
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
			case CommonPackage.USER_ATTRIBUTE__ERP_LEDGER_ENTRIES:
				return erpLedgerEntries != null && !erpLedgerEntries.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__NAME:
				return isSetName();
			case CommonPackage.USER_ATTRIBUTE__VALUE:
				return isSetValue();
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE_DATA_SETS:
				return procedureDataSets != null && !procedureDataSets.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__TRANSACTION:
				return transaction != null;
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_SPECIFICATION:
				return propertySpecification != null;
			case CommonPackage.USER_ATTRIBUTE__PROCEDURE:
				return procedure != null;
			case CommonPackage.USER_ATTRIBUTE__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case CommonPackage.USER_ATTRIBUTE__PROPERTY_ASSETS:
				return propertyAssets != null && !propertyAssets.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__RATING_SPECIFICATION:
				return ratingSpecification != null;
			case CommonPackage.USER_ATTRIBUTE__ERP_INVOICE_LINE_ITEMS:
				return erpInvoiceLineItems != null && !erpInvoiceLineItems.isEmpty();
			case CommonPackage.USER_ATTRIBUTE__RATING_ASSETS:
				return ratingAssets != null && !ratingAssets.isEmpty();
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // UserAttribute
