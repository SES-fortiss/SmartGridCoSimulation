/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.UserAttribute;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo;
import CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo;

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
 * A representation of the model object '<em><b>Erp Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayments <em>Erp Payments</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getWorkBillingInfos <em>Work Billing Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getUserAttributes <em>User Attributes</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem <em>Erp Payable Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems <em>Component Erp Invoice Line Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod <em>Bill Period</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getCustomerBillingInfos <em>Customer Billing Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem <em>Erp Rec Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpInvoiceLineItem extends Document {
	/**
	 * The default value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineNumber() <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineNumber()
	 * @generated
	 * @ordered
	 */
	protected String lineNumber = LINE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Line Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineNumberESet;

	/**
	 * The default value of the '{@link #getGlDateTime() <em>Gl Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date GL_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlDateTime() <em>Gl Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date glDateTime = GL_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Gl Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean glDateTimeESet;

	/**
	 * The cached value of the '{@link #getErpPayments() <em>Erp Payments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPayment> erpPayments;

	/**
	 * The default value of the '{@link #getLineAmount() <em>Line Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float LINE_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLineAmount() <em>Line Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAmount()
	 * @generated
	 * @ordered
	 */
	protected float lineAmount = LINE_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Line Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineAmountESet;

	/**
	 * The cached value of the '{@link #getContainerErpInvoiceLineItem() <em>Container Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerErpInvoiceLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItem containerErpInvoiceLineItem;

	/**
	 * The default value of the '{@link #getNetAmount() <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float NET_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNetAmount() <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAmount()
	 * @generated
	 * @ordered
	 */
	protected float netAmount = NET_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Net Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean netAmountESet;

	/**
	 * The cached value of the '{@link #getWorkBillingInfos() <em>Work Billing Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBillingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkBillingInfo> workBillingInfos;

	/**
	 * The cached value of the '{@link #getErpQuoteLineItem() <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpQuoteLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpQuoteLineItem erpQuoteLineItem;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ErpInvoiceLineItemKind KIND_EDEFAULT = ErpInvoiceLineItemKind.OTHER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoiceLineItemKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The cached value of the '{@link #getUserAttributes() <em>User Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> userAttributes;

	/**
	 * The cached value of the '{@link #getErpRecDelvLineItem() <em>Erp Rec Delv Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpRecDelvLineItem erpRecDelvLineItem;

	/**
	 * The cached value of the '{@link #getErpPayableLineItem() <em>Erp Payable Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPayableLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpPayableLineItem erpPayableLineItem;

	/**
	 * The cached value of the '{@link #getComponentErpInvoiceLineItems() <em>Component Erp Invoice Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentErpInvoiceLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpInvoiceLineItem> componentErpInvoiceLineItems;

	/**
	 * The default value of the '{@link #getLineVersion() <em>Line Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineVersion() <em>Line Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineVersion()
	 * @generated
	 * @ordered
	 */
	protected String lineVersion = LINE_VERSION_EDEFAULT;

	/**
	 * This is true if the Line Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineVersionESet;

	/**
	 * The default value of the '{@link #getGlAccount() <em>Gl Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlAccount() <em>Gl Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccount()
	 * @generated
	 * @ordered
	 */
	protected String glAccount = GL_ACCOUNT_EDEFAULT;

	/**
	 * This is true if the Gl Account attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean glAccountESet;

	/**
	 * The cached value of the '{@link #getBillPeriod() <em>Bill Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval billPeriod;

	/**
	 * The cached value of the '{@link #getErpInvoice() <em>Erp Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpInvoice()
	 * @generated
	 * @ordered
	 */
	protected ErpInvoice erpInvoice;

	/**
	 * The default value of the '{@link #getPreviousAmount() <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PREVIOUS_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPreviousAmount() <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousAmount()
	 * @generated
	 * @ordered
	 */
	protected float previousAmount = PREVIOUS_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Previous Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean previousAmountESet;

	/**
	 * The cached value of the '{@link #getCustomerBillingInfos() <em>Customer Billing Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerBillingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerBillingInfo> customerBillingInfos;

	/**
	 * The cached value of the '{@link #getErpRecLineItem() <em>Erp Rec Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpRecLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpRecLineItem erpRecLineItem;

	/**
	 * The cached value of the '{@link #getErpJournalEntries() <em>Erp Journal Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournalEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpJournalEntry> erpJournalEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpInvoiceLineItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_INVOICE_LINE_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #isSetLineNumber()
	 * @see #unsetLineNumber()
	 * @see #setLineNumber(String)
	 * @generated
	 */
	public String getLineNumber() {
		return lineNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #isSetLineNumber()
	 * @see #unsetLineNumber()
	 * @see #getLineNumber()
	 * @generated
	 */
	public void setLineNumber(String newLineNumber) {
		lineNumber = newLineNumber;
		lineNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineNumber()
	 * @see #getLineNumber()
	 * @see #setLineNumber(String)
	 * @generated
	 */
	public void unsetLineNumber() {
		lineNumber = LINE_NUMBER_EDEFAULT;
		lineNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineNumber <em>Line Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Number</em>' attribute is set.
	 * @see #unsetLineNumber()
	 * @see #getLineNumber()
	 * @see #setLineNumber(String)
	 * @generated
	 */
	public boolean isSetLineNumber() {
		return lineNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Gl Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Date Time</em>' attribute.
	 * @see #isSetGlDateTime()
	 * @see #unsetGlDateTime()
	 * @see #setGlDateTime(Date)
	 * @generated
	 */
	public Date getGlDateTime() {
		return glDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Date Time</em>' attribute.
	 * @see #isSetGlDateTime()
	 * @see #unsetGlDateTime()
	 * @see #getGlDateTime()
	 * @generated
	 */
	public void setGlDateTime(Date newGlDateTime) {
		glDateTime = newGlDateTime;
		glDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlDateTime()
	 * @see #getGlDateTime()
	 * @see #setGlDateTime(Date)
	 * @generated
	 */
	public void unsetGlDateTime() {
		glDateTime = GL_DATE_TIME_EDEFAULT;
		glDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlDateTime <em>Gl Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gl Date Time</em>' attribute is set.
	 * @see #unsetGlDateTime()
	 * @see #getGlDateTime()
	 * @see #setGlDateTime(Date)
	 * @generated
	 */
	public boolean isSetGlDateTime() {
		return glDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Payments</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payments</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayment#getErpInvoiceLineItems
	 * @generated
	 */
	public EList<ErpPayment> getErpPayments() {
		if (erpPayments == null) {
			erpPayments = new BasicInternalEList<ErpPayment>(ErpPayment.class);
		}
		return erpPayments;
	}

	/**
	 * Returns the value of the '<em><b>Line Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Amount</em>' attribute.
	 * @see #isSetLineAmount()
	 * @see #unsetLineAmount()
	 * @see #setLineAmount(float)
	 * @generated
	 */
	public float getLineAmount() {
		return lineAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Amount</em>' attribute.
	 * @see #isSetLineAmount()
	 * @see #unsetLineAmount()
	 * @see #getLineAmount()
	 * @generated
	 */
	public void setLineAmount(float newLineAmount) {
		lineAmount = newLineAmount;
		lineAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineAmount()
	 * @see #getLineAmount()
	 * @see #setLineAmount(float)
	 * @generated
	 */
	public void unsetLineAmount() {
		lineAmount = LINE_AMOUNT_EDEFAULT;
		lineAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineAmount <em>Line Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Amount</em>' attribute is set.
	 * @see #unsetLineAmount()
	 * @see #getLineAmount()
	 * @see #setLineAmount(float)
	 * @generated
	 */
	public boolean isSetLineAmount() {
		return lineAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Container Erp Invoice Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems <em>Component Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Erp Invoice Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Erp Invoice Line Item</em>' reference.
	 * @see #setContainerErpInvoiceLineItem(ErpInvoiceLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getComponentErpInvoiceLineItems
	 * @generated
	 */
	public ErpInvoiceLineItem getContainerErpInvoiceLineItem() {
		if (containerErpInvoiceLineItem != null && containerErpInvoiceLineItem.eIsProxy()) {
			InternalEObject oldContainerErpInvoiceLineItem = (InternalEObject)containerErpInvoiceLineItem;
			containerErpInvoiceLineItem = (ErpInvoiceLineItem)eResolveProxy(oldContainerErpInvoiceLineItem);
			if (containerErpInvoiceLineItem != oldContainerErpInvoiceLineItem) {
			}
		}
		return containerErpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoiceLineItem basicGetContainerErpInvoiceLineItem() {
		return containerErpInvoiceLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerErpInvoiceLineItem(ErpInvoiceLineItem newContainerErpInvoiceLineItem, NotificationChain msgs) {
		ErpInvoiceLineItem oldContainerErpInvoiceLineItem = containerErpInvoiceLineItem;
		containerErpInvoiceLineItem = newContainerErpInvoiceLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Erp Invoice Line Item</em>' reference.
	 * @see #getContainerErpInvoiceLineItem()
	 * @generated
	 */
	public void setContainerErpInvoiceLineItem(ErpInvoiceLineItem newContainerErpInvoiceLineItem) {
		if (newContainerErpInvoiceLineItem != containerErpInvoiceLineItem) {
			NotificationChain msgs = null;
			if (containerErpInvoiceLineItem != null)
				msgs = ((InternalEObject)containerErpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS, ErpInvoiceLineItem.class, msgs);
			if (newContainerErpInvoiceLineItem != null)
				msgs = ((InternalEObject)newContainerErpInvoiceLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS, ErpInvoiceLineItem.class, msgs);
			msgs = basicSetContainerErpInvoiceLineItem(newContainerErpInvoiceLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Net Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Amount</em>' attribute.
	 * @see #isSetNetAmount()
	 * @see #unsetNetAmount()
	 * @see #setNetAmount(float)
	 * @generated
	 */
	public float getNetAmount() {
		return netAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Amount</em>' attribute.
	 * @see #isSetNetAmount()
	 * @see #unsetNetAmount()
	 * @see #getNetAmount()
	 * @generated
	 */
	public void setNetAmount(float newNetAmount) {
		netAmount = newNetAmount;
		netAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNetAmount()
	 * @see #getNetAmount()
	 * @see #setNetAmount(float)
	 * @generated
	 */
	public void unsetNetAmount() {
		netAmount = NET_AMOUNT_EDEFAULT;
		netAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getNetAmount <em>Net Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Net Amount</em>' attribute is set.
	 * @see #unsetNetAmount()
	 * @see #getNetAmount()
	 * @see #setNetAmount(float)
	 * @generated
	 */
	public boolean isSetNetAmount() {
		return netAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems <em>Erp Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Billing Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCustomers.WorkBillingInfo#getErpLineItems
	 * @generated
	 */
	public EList<WorkBillingInfo> getWorkBillingInfos() {
		if (workBillingInfos == null) {
			workBillingInfos = new BasicInternalEList<WorkBillingInfo>(WorkBillingInfo.class);
		}
		return workBillingInfos;
	}

	/**
	 * Returns the value of the '<em><b>Erp Quote Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Quote Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #setErpQuoteLineItem(ErpQuoteLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpQuoteLineItem#getErpInvoiceLineItem
	 * @generated
	 */
	public ErpQuoteLineItem getErpQuoteLineItem() {
		if (erpQuoteLineItem != null && erpQuoteLineItem.eIsProxy()) {
			InternalEObject oldErpQuoteLineItem = (InternalEObject)erpQuoteLineItem;
			erpQuoteLineItem = (ErpQuoteLineItem)eResolveProxy(oldErpQuoteLineItem);
			if (erpQuoteLineItem != oldErpQuoteLineItem) {
			}
		}
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpQuoteLineItem basicGetErpQuoteLineItem() {
		return erpQuoteLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem, NotificationChain msgs) {
		ErpQuoteLineItem oldErpQuoteLineItem = erpQuoteLineItem;
		erpQuoteLineItem = newErpQuoteLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpQuoteLineItem <em>Erp Quote Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Quote Line Item</em>' reference.
	 * @see #getErpQuoteLineItem()
	 * @generated
	 */
	public void setErpQuoteLineItem(ErpQuoteLineItem newErpQuoteLineItem) {
		if (newErpQuoteLineItem != erpQuoteLineItem) {
			NotificationChain msgs = null;
			if (erpQuoteLineItem != null)
				msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			if (newErpQuoteLineItem != null)
				msgs = ((InternalEObject)newErpQuoteLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpQuoteLineItem.class, msgs);
			msgs = basicSetErpQuoteLineItem(newErpQuoteLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ErpInvoiceLineItemKind)
	 * @generated
	 */
	public ErpInvoiceLineItemKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItemKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(ErpInvoiceLineItemKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ErpInvoiceLineItemKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ErpInvoiceLineItemKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>User Attributes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Attributes</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getErpInvoiceLineItems
	 * @generated
	 */
	public EList<UserAttribute> getUserAttributes() {
		if (userAttributes == null) {
			userAttributes = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return userAttributes;
	}

	/**
	 * Returns the value of the '<em><b>Erp Rec Delv Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Delv Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Delv Line Item</em>' reference.
	 * @see #setErpRecDelvLineItem(ErpRecDelvLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecDelvLineItem#getErpInvoiceLineItem
	 * @generated
	 */
	public ErpRecDelvLineItem getErpRecDelvLineItem() {
		if (erpRecDelvLineItem != null && erpRecDelvLineItem.eIsProxy()) {
			InternalEObject oldErpRecDelvLineItem = (InternalEObject)erpRecDelvLineItem;
			erpRecDelvLineItem = (ErpRecDelvLineItem)eResolveProxy(oldErpRecDelvLineItem);
			if (erpRecDelvLineItem != oldErpRecDelvLineItem) {
			}
		}
		return erpRecDelvLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecDelvLineItem basicGetErpRecDelvLineItem() {
		return erpRecDelvLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpRecDelvLineItem(ErpRecDelvLineItem newErpRecDelvLineItem, NotificationChain msgs) {
		ErpRecDelvLineItem oldErpRecDelvLineItem = erpRecDelvLineItem;
		erpRecDelvLineItem = newErpRecDelvLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecDelvLineItem <em>Erp Rec Delv Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Rec Delv Line Item</em>' reference.
	 * @see #getErpRecDelvLineItem()
	 * @generated
	 */
	public void setErpRecDelvLineItem(ErpRecDelvLineItem newErpRecDelvLineItem) {
		if (newErpRecDelvLineItem != erpRecDelvLineItem) {
			NotificationChain msgs = null;
			if (erpRecDelvLineItem != null)
				msgs = ((InternalEObject)erpRecDelvLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
			if (newErpRecDelvLineItem != null)
				msgs = ((InternalEObject)newErpRecDelvLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
			msgs = basicSetErpRecDelvLineItem(newErpRecDelvLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Payable Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Payable Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Payable Line Item</em>' reference.
	 * @see #setErpPayableLineItem(ErpPayableLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPayableLineItem#getErpInvoiceLineItem
	 * @generated
	 */
	public ErpPayableLineItem getErpPayableLineItem() {
		if (erpPayableLineItem != null && erpPayableLineItem.eIsProxy()) {
			InternalEObject oldErpPayableLineItem = (InternalEObject)erpPayableLineItem;
			erpPayableLineItem = (ErpPayableLineItem)eResolveProxy(oldErpPayableLineItem);
			if (erpPayableLineItem != oldErpPayableLineItem) {
			}
		}
		return erpPayableLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPayableLineItem basicGetErpPayableLineItem() {
		return erpPayableLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPayableLineItem(ErpPayableLineItem newErpPayableLineItem, NotificationChain msgs) {
		ErpPayableLineItem oldErpPayableLineItem = erpPayableLineItem;
		erpPayableLineItem = newErpPayableLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpPayableLineItem <em>Erp Payable Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Payable Line Item</em>' reference.
	 * @see #getErpPayableLineItem()
	 * @generated
	 */
	public void setErpPayableLineItem(ErpPayableLineItem newErpPayableLineItem) {
		if (newErpPayableLineItem != erpPayableLineItem) {
			NotificationChain msgs = null;
			if (erpPayableLineItem != null)
				msgs = ((InternalEObject)erpPayableLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpPayableLineItem.class, msgs);
			if (newErpPayableLineItem != null)
				msgs = ((InternalEObject)newErpPayableLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpPayableLineItem.class, msgs);
			msgs = basicSetErpPayableLineItem(newErpPayableLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Component Erp Invoice Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem <em>Container Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Erp Invoice Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Erp Invoice Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getContainerErpInvoiceLineItem
	 * @generated
	 */
	public EList<ErpInvoiceLineItem> getComponentErpInvoiceLineItems() {
		if (componentErpInvoiceLineItems == null) {
			componentErpInvoiceLineItems = new BasicInternalEList<ErpInvoiceLineItem>(ErpInvoiceLineItem.class);
		}
		return componentErpInvoiceLineItems;
	}

	/**
	 * Returns the value of the '<em><b>Line Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Version</em>' attribute.
	 * @see #isSetLineVersion()
	 * @see #unsetLineVersion()
	 * @see #setLineVersion(String)
	 * @generated
	 */
	public String getLineVersion() {
		return lineVersion;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Version</em>' attribute.
	 * @see #isSetLineVersion()
	 * @see #unsetLineVersion()
	 * @see #getLineVersion()
	 * @generated
	 */
	public void setLineVersion(String newLineVersion) {
		lineVersion = newLineVersion;
		lineVersionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineVersion()
	 * @see #getLineVersion()
	 * @see #setLineVersion(String)
	 * @generated
	 */
	public void unsetLineVersion() {
		lineVersion = LINE_VERSION_EDEFAULT;
		lineVersionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getLineVersion <em>Line Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Version</em>' attribute is set.
	 * @see #unsetLineVersion()
	 * @see #getLineVersion()
	 * @see #setLineVersion(String)
	 * @generated
	 */
	public boolean isSetLineVersion() {
		return lineVersionESet;
	}

	/**
	 * Returns the value of the '<em><b>Gl Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account</em>' attribute.
	 * @see #isSetGlAccount()
	 * @see #unsetGlAccount()
	 * @see #setGlAccount(String)
	 * @generated
	 */
	public String getGlAccount() {
		return glAccount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account</em>' attribute.
	 * @see #isSetGlAccount()
	 * @see #unsetGlAccount()
	 * @see #getGlAccount()
	 * @generated
	 */
	public void setGlAccount(String newGlAccount) {
		glAccount = newGlAccount;
		glAccountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlAccount()
	 * @see #getGlAccount()
	 * @see #setGlAccount(String)
	 * @generated
	 */
	public void unsetGlAccount() {
		glAccount = GL_ACCOUNT_EDEFAULT;
		glAccountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getGlAccount <em>Gl Account</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gl Account</em>' attribute is set.
	 * @see #unsetGlAccount()
	 * @see #getGlAccount()
	 * @see #setGlAccount(String)
	 * @generated
	 */
	public boolean isSetGlAccount() {
		return glAccountESet;
	}

	/**
	 * Returns the value of the '<em><b>Bill Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Period</em>' containment reference.
	 * @see #setBillPeriod(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getBillPeriod() {
		return billPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillPeriod(DateTimeInterval newBillPeriod, NotificationChain msgs) {
		DateTimeInterval oldBillPeriod = billPeriod;
		billPeriod = newBillPeriod;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getBillPeriod <em>Bill Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Period</em>' containment reference.
	 * @see #getBillPeriod()
	 * @generated
	 */
	public void setBillPeriod(DateTimeInterval newBillPeriod) {
		if (newBillPeriod != billPeriod) {
			NotificationChain msgs = null;
			if (billPeriod != null)
				msgs = ((InternalEObject)billPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD, null, msgs);
			if (newBillPeriod != null)
				msgs = ((InternalEObject)newBillPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD, null, msgs);
			msgs = basicSetBillPeriod(newBillPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Invoice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Invoice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Invoice</em>' reference.
	 * @see #setErpInvoice(ErpInvoice)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpInvoice#getErpInvoiceLineItems
	 * @generated
	 */
	public ErpInvoice getErpInvoice() {
		if (erpInvoice != null && erpInvoice.eIsProxy()) {
			InternalEObject oldErpInvoice = (InternalEObject)erpInvoice;
			erpInvoice = (ErpInvoice)eResolveProxy(oldErpInvoice);
			if (erpInvoice != oldErpInvoice) {
			}
		}
		return erpInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpInvoice basicGetErpInvoice() {
		return erpInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpInvoice(ErpInvoice newErpInvoice, NotificationChain msgs) {
		ErpInvoice oldErpInvoice = erpInvoice;
		erpInvoice = newErpInvoice;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpInvoice <em>Erp Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Invoice</em>' reference.
	 * @see #getErpInvoice()
	 * @generated
	 */
	public void setErpInvoice(ErpInvoice newErpInvoice) {
		if (newErpInvoice != erpInvoice) {
			NotificationChain msgs = null;
			if (erpInvoice != null)
				msgs = ((InternalEObject)erpInvoice).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS, ErpInvoice.class, msgs);
			if (newErpInvoice != null)
				msgs = ((InternalEObject)newErpInvoice).eInverseAdd(this, InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS, ErpInvoice.class, msgs);
			msgs = basicSetErpInvoice(newErpInvoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Previous Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Amount</em>' attribute.
	 * @see #isSetPreviousAmount()
	 * @see #unsetPreviousAmount()
	 * @see #setPreviousAmount(float)
	 * @generated
	 */
	public float getPreviousAmount() {
		return previousAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Amount</em>' attribute.
	 * @see #isSetPreviousAmount()
	 * @see #unsetPreviousAmount()
	 * @see #getPreviousAmount()
	 * @generated
	 */
	public void setPreviousAmount(float newPreviousAmount) {
		previousAmount = newPreviousAmount;
		previousAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreviousAmount()
	 * @see #getPreviousAmount()
	 * @see #setPreviousAmount(float)
	 * @generated
	 */
	public void unsetPreviousAmount() {
		previousAmount = PREVIOUS_AMOUNT_EDEFAULT;
		previousAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getPreviousAmount <em>Previous Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Previous Amount</em>' attribute is set.
	 * @see #unsetPreviousAmount()
	 * @see #getPreviousAmount()
	 * @see #setPreviousAmount(float)
	 * @generated
	 */
	public boolean isSetPreviousAmount() {
		return previousAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Customer Billing Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems <em>Erp Invoice Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Billing Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Billing Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCustomers.CustomerBillingInfo#getErpInvoiceLineItems
	 * @generated
	 */
	public EList<CustomerBillingInfo> getCustomerBillingInfos() {
		if (customerBillingInfos == null) {
			customerBillingInfos = new BasicInternalEList<CustomerBillingInfo>(CustomerBillingInfo.class);
		}
		return customerBillingInfos;
	}

	/**
	 * Returns the value of the '<em><b>Erp Rec Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Rec Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Rec Line Item</em>' reference.
	 * @see #setErpRecLineItem(ErpRecLineItem)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpRecLineItem#getErpInvoiceLineItem
	 * @generated
	 */
	public ErpRecLineItem getErpRecLineItem() {
		if (erpRecLineItem != null && erpRecLineItem.eIsProxy()) {
			InternalEObject oldErpRecLineItem = (InternalEObject)erpRecLineItem;
			erpRecLineItem = (ErpRecLineItem)eResolveProxy(oldErpRecLineItem);
			if (erpRecLineItem != oldErpRecLineItem) {
			}
		}
		return erpRecLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpRecLineItem basicGetErpRecLineItem() {
		return erpRecLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpRecLineItem(ErpRecLineItem newErpRecLineItem, NotificationChain msgs) {
		ErpRecLineItem oldErpRecLineItem = erpRecLineItem;
		erpRecLineItem = newErpRecLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpInvoiceLineItem#getErpRecLineItem <em>Erp Rec Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Rec Line Item</em>' reference.
	 * @see #getErpRecLineItem()
	 * @generated
	 */
	public void setErpRecLineItem(ErpRecLineItem newErpRecLineItem) {
		if (newErpRecLineItem != erpRecLineItem) {
			NotificationChain msgs = null;
			if (erpRecLineItem != null)
				msgs = ((InternalEObject)erpRecLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecLineItem.class, msgs);
			if (newErpRecLineItem != null)
				msgs = ((InternalEObject)newErpRecLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecLineItem.class, msgs);
			msgs = basicSetErpRecLineItem(newErpRecLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem <em>Erp Invoice Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal Entries</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getErpInvoiceLineItem
	 * @generated
	 */
	public EList<ErpJournalEntry> getErpJournalEntries() {
		if (erpJournalEntries == null) {
			erpJournalEntries = new BasicInternalEList<ErpJournalEntry>(ErpJournalEntry.class);
		}
		return erpJournalEntries;
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPayments()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				if (containerErpInvoiceLineItem != null)
					msgs = ((InternalEObject)containerErpInvoiceLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS, ErpInvoiceLineItem.class, msgs);
				return basicSetContainerErpInvoiceLineItem((ErpInvoiceLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkBillingInfos()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (erpQuoteLineItem != null)
					msgs = ((InternalEObject)erpQuoteLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_QUOTE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpQuoteLineItem.class, msgs);
				return basicSetErpQuoteLineItem((ErpQuoteLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserAttributes()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				if (erpRecDelvLineItem != null)
					msgs = ((InternalEObject)erpRecDelvLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_DELV_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecDelvLineItem.class, msgs);
				return basicSetErpRecDelvLineItem((ErpRecDelvLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				if (erpPayableLineItem != null)
					msgs = ((InternalEObject)erpPayableLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_PAYABLE_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpPayableLineItem.class, msgs);
				return basicSetErpPayableLineItem((ErpPayableLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponentErpInvoiceLineItems()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				if (erpInvoice != null)
					msgs = ((InternalEObject)erpInvoice).eInverseRemove(this, InfERPSupportPackage.ERP_INVOICE__ERP_INVOICE_LINE_ITEMS, ErpInvoice.class, msgs);
				return basicSetErpInvoice((ErpInvoice)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerBillingInfos()).basicAdd(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				if (erpRecLineItem != null)
					msgs = ((InternalEObject)erpRecLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_REC_LINE_ITEM__ERP_INVOICE_LINE_ITEM, ErpRecLineItem.class, msgs);
				return basicSetErpRecLineItem((ErpRecLineItem)otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpJournalEntries()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return ((InternalEList<?>)getErpPayments()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				return basicSetContainerErpInvoiceLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return ((InternalEList<?>)getWorkBillingInfos()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return basicSetErpQuoteLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return ((InternalEList<?>)getUserAttributes()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				return basicSetErpRecDelvLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				return basicSetErpPayableLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return ((InternalEList<?>)getComponentErpInvoiceLineItems()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				return basicSetBillPeriod(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				return basicSetErpInvoice(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return ((InternalEList<?>)getCustomerBillingInfos()).basicRemove(otherEnd, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				return basicSetErpRecLineItem(null, msgs);
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<?>)getErpJournalEntries()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				return getLineNumber();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				return getGlDateTime();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return getErpPayments();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				return getLineAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				if (resolve) return getContainerErpInvoiceLineItem();
				return basicGetContainerErpInvoiceLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				return getNetAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return getWorkBillingInfos();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				if (resolve) return getErpQuoteLineItem();
				return basicGetErpQuoteLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				return getKind();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return getUserAttributes();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				if (resolve) return getErpRecDelvLineItem();
				return basicGetErpRecDelvLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				if (resolve) return getErpPayableLineItem();
				return basicGetErpPayableLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return getComponentErpInvoiceLineItems();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				return getLineVersion();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				return getGlAccount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				return getBillPeriod();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				if (resolve) return getErpInvoice();
				return basicGetErpInvoice();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				return getPreviousAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return getCustomerBillingInfos();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				if (resolve) return getErpRecLineItem();
				return basicGetErpRecLineItem();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return getErpJournalEntries();
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				setLineNumber((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				setGlDateTime((Date)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				getErpPayments().clear();
				getErpPayments().addAll((Collection<? extends ErpPayment>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				setLineAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				setContainerErpInvoiceLineItem((ErpInvoiceLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				setNetAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				getWorkBillingInfos().addAll((Collection<? extends WorkBillingInfo>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				setKind((ErpInvoiceLineItemKind)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				getUserAttributes().clear();
				getUserAttributes().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				setErpRecDelvLineItem((ErpRecDelvLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				setErpPayableLineItem((ErpPayableLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				getComponentErpInvoiceLineItems().clear();
				getComponentErpInvoiceLineItems().addAll((Collection<? extends ErpInvoiceLineItem>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				setLineVersion((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				setGlAccount((String)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				setBillPeriod((DateTimeInterval)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				setErpInvoice((ErpInvoice)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				setPreviousAmount((Float)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
				getCustomerBillingInfos().addAll((Collection<? extends CustomerBillingInfo>)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				setErpRecLineItem((ErpRecLineItem)newValue);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				getErpJournalEntries().addAll((Collection<? extends ErpJournalEntry>)newValue);
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				unsetLineNumber();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				unsetGlDateTime();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				getErpPayments().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				unsetLineAmount();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				setContainerErpInvoiceLineItem((ErpInvoiceLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				unsetNetAmount();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				getWorkBillingInfos().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				setErpQuoteLineItem((ErpQuoteLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				unsetKind();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				getUserAttributes().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				setErpRecDelvLineItem((ErpRecDelvLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				setErpPayableLineItem((ErpPayableLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				getComponentErpInvoiceLineItems().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				unsetLineVersion();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				unsetGlAccount();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				setBillPeriod((DateTimeInterval)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				setErpInvoice((ErpInvoice)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				unsetPreviousAmount();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				getCustomerBillingInfos().clear();
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				setErpRecLineItem((ErpRecLineItem)null);
				return;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
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
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_NUMBER:
				return isSetLineNumber();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_DATE_TIME:
				return isSetGlDateTime();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYMENTS:
				return erpPayments != null && !erpPayments.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_AMOUNT:
				return isSetLineAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CONTAINER_ERP_INVOICE_LINE_ITEM:
				return containerErpInvoiceLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__NET_AMOUNT:
				return isSetNetAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__WORK_BILLING_INFOS:
				return workBillingInfos != null && !workBillingInfos.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_QUOTE_LINE_ITEM:
				return erpQuoteLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__KIND:
				return isSetKind();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__USER_ATTRIBUTES:
				return userAttributes != null && !userAttributes.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_DELV_LINE_ITEM:
				return erpRecDelvLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_PAYABLE_LINE_ITEM:
				return erpPayableLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__COMPONENT_ERP_INVOICE_LINE_ITEMS:
				return componentErpInvoiceLineItems != null && !componentErpInvoiceLineItems.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__LINE_VERSION:
				return isSetLineVersion();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__GL_ACCOUNT:
				return isSetGlAccount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__BILL_PERIOD:
				return billPeriod != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_INVOICE:
				return erpInvoice != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__PREVIOUS_AMOUNT:
				return isSetPreviousAmount();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__CUSTOMER_BILLING_INFOS:
				return customerBillingInfos != null && !customerBillingInfos.isEmpty();
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_REC_LINE_ITEM:
				return erpRecLineItem != null;
			case InfERPSupportPackage.ERP_INVOICE_LINE_ITEM__ERP_JOURNAL_ENTRIES:
				return erpJournalEntries != null && !erpJournalEntries.isEmpty();
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
		result.append(" (lineNumber: ");
		if (lineNumberESet) result.append(lineNumber); else result.append("<unset>");
		result.append(", glDateTime: ");
		if (glDateTimeESet) result.append(glDateTime); else result.append("<unset>");
		result.append(", lineAmount: ");
		if (lineAmountESet) result.append(lineAmount); else result.append("<unset>");
		result.append(", netAmount: ");
		if (netAmountESet) result.append(netAmount); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", lineVersion: ");
		if (lineVersionESet) result.append(lineVersion); else result.append("<unset>");
		result.append(", glAccount: ");
		if (glAccountESet) result.append(glAccount); else result.append("<unset>");
		result.append(", previousAmount: ");
		if (previousAmountESet) result.append(previousAmount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ErpInvoiceLineItem
