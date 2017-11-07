/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.IEC61968.Common.Agreement;

import CIM15.IEC61968.Customers.CustomerAgreement;
import CIM15.IEC61968.Customers.CustomersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuxiliaryAgreement extends Agreement {
	/**
	 * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreement()
	 * @generated
	 * @ordered
	 */
	protected CustomerAgreement customerAgreement;

	/**
	 * The default value of the '{@link #getVendPortionArrear() <em>Vend Portion Arrear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortionArrear()
	 * @generated
	 * @ordered
	 */
	protected static final float VEND_PORTION_ARREAR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVendPortionArrear() <em>Vend Portion Arrear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortionArrear()
	 * @generated
	 * @ordered
	 */
	protected float vendPortionArrear = VEND_PORTION_ARREAR_EDEFAULT;

	/**
	 * This is true if the Vend Portion Arrear attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vendPortionArrearESet;

	/**
	 * The default value of the '{@link #getAuxRef() <em>Aux Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxRef()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxRef() <em>Aux Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxRef()
	 * @generated
	 * @ordered
	 */
	protected String auxRef = AUX_REF_EDEFAULT;

	/**
	 * This is true if the Aux Ref attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auxRefESet;

	/**
	 * The default value of the '{@link #getPayCycle() <em>Pay Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String PAY_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayCycle() <em>Pay Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayCycle()
	 * @generated
	 * @ordered
	 */
	protected String payCycle = PAY_CYCLE_EDEFAULT;

	/**
	 * This is true if the Pay Cycle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean payCycleESet;

	/**
	 * The default value of the '{@link #getArrearsInterest() <em>Arrears Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrearsInterest()
	 * @generated
	 * @ordered
	 */
	protected static final float ARREARS_INTEREST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArrearsInterest() <em>Arrears Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrearsInterest()
	 * @generated
	 * @ordered
	 */
	protected float arrearsInterest = ARREARS_INTEREST_EDEFAULT;

	/**
	 * This is true if the Arrears Interest attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arrearsInterestESet;

	/**
	 * The default value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAmount()
	 * @generated
	 * @ordered
	 */
	protected float fixedAmount = FIXED_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Fixed Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedAmountESet;

	/**
	 * The cached value of the '{@link #getAuxiliaryAccounts() <em>Auxiliary Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryAccount> auxiliaryAccounts;

	/**
	 * The default value of the '{@link #getVendPortion() <em>Vend Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortion()
	 * @generated
	 * @ordered
	 */
	protected static final float VEND_PORTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVendPortion() <em>Vend Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendPortion()
	 * @generated
	 * @ordered
	 */
	protected float vendPortion = VEND_PORTION_EDEFAULT;

	/**
	 * This is true if the Vend Portion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vendPortionESet;

	/**
	 * The default value of the '{@link #getSubCategory() <em>Sub Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubCategory() <em>Sub Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory()
	 * @generated
	 * @ordered
	 */
	protected String subCategory = SUB_CATEGORY_EDEFAULT;

	/**
	 * This is true if the Sub Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subCategoryESet;

	/**
	 * The default value of the '{@link #getAuxCycle() <em>Aux Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxCycle()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_CYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxCycle() <em>Aux Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxCycle()
	 * @generated
	 * @ordered
	 */
	protected String auxCycle = AUX_CYCLE_EDEFAULT;

	/**
	 * This is true if the Aux Cycle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auxCycleESet;

	/**
	 * The default value of the '{@link #getAuxPriorityCode() <em>Aux Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_PRIORITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxPriorityCode() <em>Aux Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPriorityCode()
	 * @generated
	 * @ordered
	 */
	protected String auxPriorityCode = AUX_PRIORITY_CODE_EDEFAULT;

	/**
	 * This is true if the Aux Priority Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auxPriorityCodeESet;

	/**
	 * The default value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAmount()
	 * @generated
	 * @ordered
	 */
	protected float minAmount = MIN_AMOUNT_EDEFAULT;

	/**
	 * This is true if the Min Amount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minAmountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuxiliaryAgreement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.AUXILIARY_AGREEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Customer Agreement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements <em>Auxiliary Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Agreement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Agreement</em>' reference.
	 * @see #setCustomerAgreement(CustomerAgreement)
	 * @see CIM15.IEC61968.Customers.CustomerAgreement#getAuxiliaryAgreements
	 * @generated
	 */
	public CustomerAgreement getCustomerAgreement() {
		if (customerAgreement != null && customerAgreement.eIsProxy()) {
			InternalEObject oldCustomerAgreement = (InternalEObject)customerAgreement;
			customerAgreement = (CustomerAgreement)eResolveProxy(oldCustomerAgreement);
			if (customerAgreement != oldCustomerAgreement) {
			}
		}
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAgreement basicGetCustomerAgreement() {
		return customerAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAgreement(CustomerAgreement newCustomerAgreement, NotificationChain msgs) {
		CustomerAgreement oldCustomerAgreement = customerAgreement;
		customerAgreement = newCustomerAgreement;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Agreement</em>' reference.
	 * @see #getCustomerAgreement()
	 * @generated
	 */
	public void setCustomerAgreement(CustomerAgreement newCustomerAgreement) {
		if (newCustomerAgreement != customerAgreement) {
			NotificationChain msgs = null;
			if (customerAgreement != null)
				msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs);
			if (newCustomerAgreement != null)
				msgs = ((InternalEObject)newCustomerAgreement).eInverseAdd(this, CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs);
			msgs = basicSetCustomerAgreement(newCustomerAgreement, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Vend Portion Arrear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vend Portion Arrear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vend Portion Arrear</em>' attribute.
	 * @see #isSetVendPortionArrear()
	 * @see #unsetVendPortionArrear()
	 * @see #setVendPortionArrear(float)
	 * @generated
	 */
	public float getVendPortionArrear() {
		return vendPortionArrear;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vend Portion Arrear</em>' attribute.
	 * @see #isSetVendPortionArrear()
	 * @see #unsetVendPortionArrear()
	 * @see #getVendPortionArrear()
	 * @generated
	 */
	public void setVendPortionArrear(float newVendPortionArrear) {
		vendPortionArrear = newVendPortionArrear;
		vendPortionArrearESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVendPortionArrear()
	 * @see #getVendPortionArrear()
	 * @see #setVendPortionArrear(float)
	 * @generated
	 */
	public void unsetVendPortionArrear() {
		vendPortionArrear = VEND_PORTION_ARREAR_EDEFAULT;
		vendPortionArrearESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vend Portion Arrear</em>' attribute is set.
	 * @see #unsetVendPortionArrear()
	 * @see #getVendPortionArrear()
	 * @see #setVendPortionArrear(float)
	 * @generated
	 */
	public boolean isSetVendPortionArrear() {
		return vendPortionArrearESet;
	}

	/**
	 * Returns the value of the '<em><b>Aux Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Ref</em>' attribute.
	 * @see #isSetAuxRef()
	 * @see #unsetAuxRef()
	 * @see #setAuxRef(String)
	 * @generated
	 */
	public String getAuxRef() {
		return auxRef;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Ref</em>' attribute.
	 * @see #isSetAuxRef()
	 * @see #unsetAuxRef()
	 * @see #getAuxRef()
	 * @generated
	 */
	public void setAuxRef(String newAuxRef) {
		auxRef = newAuxRef;
		auxRefESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuxRef()
	 * @see #getAuxRef()
	 * @see #setAuxRef(String)
	 * @generated
	 */
	public void unsetAuxRef() {
		auxRef = AUX_REF_EDEFAULT;
		auxRefESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aux Ref</em>' attribute is set.
	 * @see #unsetAuxRef()
	 * @see #getAuxRef()
	 * @see #setAuxRef(String)
	 * @generated
	 */
	public boolean isSetAuxRef() {
		return auxRefESet;
	}

	/**
	 * Returns the value of the '<em><b>Pay Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay Cycle</em>' attribute.
	 * @see #isSetPayCycle()
	 * @see #unsetPayCycle()
	 * @see #setPayCycle(String)
	 * @generated
	 */
	public String getPayCycle() {
		return payCycle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay Cycle</em>' attribute.
	 * @see #isSetPayCycle()
	 * @see #unsetPayCycle()
	 * @see #getPayCycle()
	 * @generated
	 */
	public void setPayCycle(String newPayCycle) {
		payCycle = newPayCycle;
		payCycleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPayCycle()
	 * @see #getPayCycle()
	 * @see #setPayCycle(String)
	 * @generated
	 */
	public void unsetPayCycle() {
		payCycle = PAY_CYCLE_EDEFAULT;
		payCycleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pay Cycle</em>' attribute is set.
	 * @see #unsetPayCycle()
	 * @see #getPayCycle()
	 * @see #setPayCycle(String)
	 * @generated
	 */
	public boolean isSetPayCycle() {
		return payCycleESet;
	}

	/**
	 * Returns the value of the '<em><b>Arrears Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrears Interest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrears Interest</em>' attribute.
	 * @see #isSetArrearsInterest()
	 * @see #unsetArrearsInterest()
	 * @see #setArrearsInterest(float)
	 * @generated
	 */
	public float getArrearsInterest() {
		return arrearsInterest;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrears Interest</em>' attribute.
	 * @see #isSetArrearsInterest()
	 * @see #unsetArrearsInterest()
	 * @see #getArrearsInterest()
	 * @generated
	 */
	public void setArrearsInterest(float newArrearsInterest) {
		arrearsInterest = newArrearsInterest;
		arrearsInterestESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrearsInterest()
	 * @see #getArrearsInterest()
	 * @see #setArrearsInterest(float)
	 * @generated
	 */
	public void unsetArrearsInterest() {
		arrearsInterest = ARREARS_INTEREST_EDEFAULT;
		arrearsInterestESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arrears Interest</em>' attribute is set.
	 * @see #unsetArrearsInterest()
	 * @see #getArrearsInterest()
	 * @see #setArrearsInterest(float)
	 * @generated
	 */
	public boolean isSetArrearsInterest() {
		return arrearsInterestESet;
	}

	/**
	 * Returns the value of the '<em><b>Fixed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Amount</em>' attribute.
	 * @see #isSetFixedAmount()
	 * @see #unsetFixedAmount()
	 * @see #setFixedAmount(float)
	 * @generated
	 */
	public float getFixedAmount() {
		return fixedAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Amount</em>' attribute.
	 * @see #isSetFixedAmount()
	 * @see #unsetFixedAmount()
	 * @see #getFixedAmount()
	 * @generated
	 */
	public void setFixedAmount(float newFixedAmount) {
		fixedAmount = newFixedAmount;
		fixedAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixedAmount()
	 * @see #getFixedAmount()
	 * @see #setFixedAmount(float)
	 * @generated
	 */
	public void unsetFixedAmount() {
		fixedAmount = FIXED_AMOUNT_EDEFAULT;
		fixedAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed Amount</em>' attribute is set.
	 * @see #unsetFixedAmount()
	 * @see #getFixedAmount()
	 * @see #setFixedAmount(float)
	 * @generated
	 */
	public boolean isSetFixedAmount() {
		return fixedAmountESet;
	}

	/**
	 * Returns the value of the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Accounts</em>' reference list.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement
	 * @generated
	 */
	public EList<AuxiliaryAccount> getAuxiliaryAccounts() {
		if (auxiliaryAccounts == null) {
			auxiliaryAccounts = new BasicInternalEList<AuxiliaryAccount>(AuxiliaryAccount.class);
		}
		return auxiliaryAccounts;
	}

	/**
	 * Returns the value of the '<em><b>Vend Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vend Portion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vend Portion</em>' attribute.
	 * @see #isSetVendPortion()
	 * @see #unsetVendPortion()
	 * @see #setVendPortion(float)
	 * @generated
	 */
	public float getVendPortion() {
		return vendPortion;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vend Portion</em>' attribute.
	 * @see #isSetVendPortion()
	 * @see #unsetVendPortion()
	 * @see #getVendPortion()
	 * @generated
	 */
	public void setVendPortion(float newVendPortion) {
		vendPortion = newVendPortion;
		vendPortionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVendPortion()
	 * @see #getVendPortion()
	 * @see #setVendPortion(float)
	 * @generated
	 */
	public void unsetVendPortion() {
		vendPortion = VEND_PORTION_EDEFAULT;
		vendPortionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vend Portion</em>' attribute is set.
	 * @see #unsetVendPortion()
	 * @see #getVendPortion()
	 * @see #setVendPortion(float)
	 * @generated
	 */
	public boolean isSetVendPortion() {
		return vendPortionESet;
	}

	/**
	 * Returns the value of the '<em><b>Sub Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Category</em>' attribute.
	 * @see #isSetSubCategory()
	 * @see #unsetSubCategory()
	 * @see #setSubCategory(String)
	 * @generated
	 */
	public String getSubCategory() {
		return subCategory;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Category</em>' attribute.
	 * @see #isSetSubCategory()
	 * @see #unsetSubCategory()
	 * @see #getSubCategory()
	 * @generated
	 */
	public void setSubCategory(String newSubCategory) {
		subCategory = newSubCategory;
		subCategoryESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubCategory()
	 * @see #getSubCategory()
	 * @see #setSubCategory(String)
	 * @generated
	 */
	public void unsetSubCategory() {
		subCategory = SUB_CATEGORY_EDEFAULT;
		subCategoryESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sub Category</em>' attribute is set.
	 * @see #unsetSubCategory()
	 * @see #getSubCategory()
	 * @see #setSubCategory(String)
	 * @generated
	 */
	public boolean isSetSubCategory() {
		return subCategoryESet;
	}

	/**
	 * Returns the value of the '<em><b>Aux Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Cycle</em>' attribute.
	 * @see #isSetAuxCycle()
	 * @see #unsetAuxCycle()
	 * @see #setAuxCycle(String)
	 * @generated
	 */
	public String getAuxCycle() {
		return auxCycle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Cycle</em>' attribute.
	 * @see #isSetAuxCycle()
	 * @see #unsetAuxCycle()
	 * @see #getAuxCycle()
	 * @generated
	 */
	public void setAuxCycle(String newAuxCycle) {
		auxCycle = newAuxCycle;
		auxCycleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuxCycle()
	 * @see #getAuxCycle()
	 * @see #setAuxCycle(String)
	 * @generated
	 */
	public void unsetAuxCycle() {
		auxCycle = AUX_CYCLE_EDEFAULT;
		auxCycleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aux Cycle</em>' attribute is set.
	 * @see #unsetAuxCycle()
	 * @see #getAuxCycle()
	 * @see #setAuxCycle(String)
	 * @generated
	 */
	public boolean isSetAuxCycle() {
		return auxCycleESet;
	}

	/**
	 * Returns the value of the '<em><b>Aux Priority Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux Priority Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux Priority Code</em>' attribute.
	 * @see #isSetAuxPriorityCode()
	 * @see #unsetAuxPriorityCode()
	 * @see #setAuxPriorityCode(String)
	 * @generated
	 */
	public String getAuxPriorityCode() {
		return auxPriorityCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Priority Code</em>' attribute.
	 * @see #isSetAuxPriorityCode()
	 * @see #unsetAuxPriorityCode()
	 * @see #getAuxPriorityCode()
	 * @generated
	 */
	public void setAuxPriorityCode(String newAuxPriorityCode) {
		auxPriorityCode = newAuxPriorityCode;
		auxPriorityCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAuxPriorityCode()
	 * @see #getAuxPriorityCode()
	 * @see #setAuxPriorityCode(String)
	 * @generated
	 */
	public void unsetAuxPriorityCode() {
		auxPriorityCode = AUX_PRIORITY_CODE_EDEFAULT;
		auxPriorityCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aux Priority Code</em>' attribute is set.
	 * @see #unsetAuxPriorityCode()
	 * @see #getAuxPriorityCode()
	 * @see #setAuxPriorityCode(String)
	 * @generated
	 */
	public boolean isSetAuxPriorityCode() {
		return auxPriorityCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Amount</em>' attribute.
	 * @see #isSetMinAmount()
	 * @see #unsetMinAmount()
	 * @see #setMinAmount(float)
	 * @generated
	 */
	public float getMinAmount() {
		return minAmount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Amount</em>' attribute.
	 * @see #isSetMinAmount()
	 * @see #unsetMinAmount()
	 * @see #getMinAmount()
	 * @generated
	 */
	public void setMinAmount(float newMinAmount) {
		minAmount = newMinAmount;
		minAmountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinAmount()
	 * @see #getMinAmount()
	 * @see #setMinAmount(float)
	 * @generated
	 */
	public void unsetMinAmount() {
		minAmount = MIN_AMOUNT_EDEFAULT;
		minAmountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Amount</em>' attribute is set.
	 * @see #unsetMinAmount()
	 * @see #getMinAmount()
	 * @see #setMinAmount(float)
	 * @generated
	 */
	public boolean isSetMinAmount() {
		return minAmountESet;
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				if (customerAgreement != null)
					msgs = ((InternalEObject)customerAgreement).eInverseRemove(this, CustomersPackage.CUSTOMER_AGREEMENT__AUXILIARY_AGREEMENTS, CustomerAgreement.class, msgs);
				return basicSetCustomerAgreement((CustomerAgreement)otherEnd, msgs);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryAccounts()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				return basicSetCustomerAgreement(null, msgs);
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return ((InternalEList<?>)getAuxiliaryAccounts()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				if (resolve) return getCustomerAgreement();
				return basicGetCustomerAgreement();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				return getVendPortionArrear();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				return getAuxRef();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				return getPayCycle();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				return getArrearsInterest();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				return getFixedAmount();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return getAuxiliaryAccounts();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				return getVendPortion();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				return getSubCategory();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				return getAuxCycle();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				return getAuxPriorityCode();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				return getMinAmount();
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				setVendPortionArrear((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				setAuxRef((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				setPayCycle((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				setArrearsInterest((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				setFixedAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				getAuxiliaryAccounts().addAll((Collection<? extends AuxiliaryAccount>)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				setVendPortion((Float)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				setSubCategory((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				setAuxCycle((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				setAuxPriorityCode((String)newValue);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				setMinAmount((Float)newValue);
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				setCustomerAgreement((CustomerAgreement)null);
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				unsetVendPortionArrear();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				unsetAuxRef();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				unsetPayCycle();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				unsetArrearsInterest();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				unsetFixedAmount();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				getAuxiliaryAccounts().clear();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				unsetVendPortion();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				unsetSubCategory();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				unsetAuxCycle();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				unsetAuxPriorityCode();
				return;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				unsetMinAmount();
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
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT:
				return customerAgreement != null;
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR:
				return isSetVendPortionArrear();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_REF:
				return isSetAuxRef();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__PAY_CYCLE:
				return isSetPayCycle();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__ARREARS_INTEREST:
				return isSetArrearsInterest();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__FIXED_AMOUNT:
				return isSetFixedAmount();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS:
				return auxiliaryAccounts != null && !auxiliaryAccounts.isEmpty();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__VEND_PORTION:
				return isSetVendPortion();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__SUB_CATEGORY:
				return isSetSubCategory();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_CYCLE:
				return isSetAuxCycle();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE:
				return isSetAuxPriorityCode();
			case PaymentMeteringPackage.AUXILIARY_AGREEMENT__MIN_AMOUNT:
				return isSetMinAmount();
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
		result.append(" (vendPortionArrear: ");
		if (vendPortionArrearESet) result.append(vendPortionArrear); else result.append("<unset>");
		result.append(", auxRef: ");
		if (auxRefESet) result.append(auxRef); else result.append("<unset>");
		result.append(", payCycle: ");
		if (payCycleESet) result.append(payCycle); else result.append("<unset>");
		result.append(", arrearsInterest: ");
		if (arrearsInterestESet) result.append(arrearsInterest); else result.append("<unset>");
		result.append(", fixedAmount: ");
		if (fixedAmountESet) result.append(fixedAmount); else result.append("<unset>");
		result.append(", vendPortion: ");
		if (vendPortionESet) result.append(vendPortion); else result.append("<unset>");
		result.append(", subCategory: ");
		if (subCategoryESet) result.append(subCategory); else result.append("<unset>");
		result.append(", auxCycle: ");
		if (auxCycleESet) result.append(auxCycle); else result.append("<unset>");
		result.append(", auxPriorityCode: ");
		if (auxPriorityCodeESet) result.append(auxPriorityCode); else result.append("<unset>");
		result.append(", minAmount: ");
		if (minAmountESet) result.append(minAmount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AuxiliaryAgreement
