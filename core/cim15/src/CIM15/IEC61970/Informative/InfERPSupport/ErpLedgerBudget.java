/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Document;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Ledger Budget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems <em>Erp Led Bud Line Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpLedgerBudget extends Document {
	/**
	 * The cached value of the '{@link #getErpLedBudLineItems() <em>Erp Led Bud Line Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedBudLineItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpLedBudLineItem> erpLedBudLineItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpLedgerBudget() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_LEDGER_BUDGET;
	}

	/**
	 * Returns the value of the '<em><b>Erp Led Bud Line Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Led Bud Line Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Led Bud Line Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget
	 * @generated
	 */
	public EList<ErpLedBudLineItem> getErpLedBudLineItems() {
		if (erpLedBudLineItems == null) {
			erpLedBudLineItems = new BasicInternalEList<ErpLedBudLineItem>(ErpLedBudLineItem.class);
		}
		return erpLedBudLineItems;
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpLedBudLineItems()).basicAdd(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return ((InternalEList<?>)getErpLedBudLineItems()).basicRemove(otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return getErpLedBudLineItems();
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				getErpLedBudLineItems().clear();
				getErpLedBudLineItems().addAll((Collection<? extends ErpLedBudLineItem>)newValue);
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				getErpLedBudLineItems().clear();
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
			case InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS:
				return erpLedBudLineItems != null && !erpLedBudLineItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ErpLedgerBudget
