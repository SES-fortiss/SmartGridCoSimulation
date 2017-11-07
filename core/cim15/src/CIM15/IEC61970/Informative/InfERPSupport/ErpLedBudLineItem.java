/**
 */
package CIM15.IEC61970.Informative.InfERPSupport;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erp Led Bud Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErpLedBudLineItem extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getErpLedBudLineItem() <em>Erp Led Bud Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedBudLineItem()
	 * @generated
	 * @ordered
	 */
	protected ErpLedgerEntry erpLedBudLineItem;

	/**
	 * The cached value of the '{@link #getErpLedgerBudget() <em>Erp Ledger Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpLedgerBudget()
	 * @generated
	 * @ordered
	 */
	protected ErpLedgerBudget erpLedgerBudget;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpLedBudLineItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_LED_BUD_LINE_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Erp Led Bud Line Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry <em>Erp Ledger Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Led Bud Line Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Led Bud Line Item</em>' reference.
	 * @see #setErpLedBudLineItem(ErpLedgerEntry)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerEntry#getErpLedgerEntry
	 * @generated
	 */
	public ErpLedgerEntry getErpLedBudLineItem() {
		if (erpLedBudLineItem != null && erpLedBudLineItem.eIsProxy()) {
			InternalEObject oldErpLedBudLineItem = (InternalEObject)erpLedBudLineItem;
			erpLedBudLineItem = (ErpLedgerEntry)eResolveProxy(oldErpLedBudLineItem);
			if (erpLedBudLineItem != oldErpLedBudLineItem) {
			}
		}
		return erpLedBudLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerEntry basicGetErpLedBudLineItem() {
		return erpLedBudLineItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedBudLineItem(ErpLedgerEntry newErpLedBudLineItem, NotificationChain msgs) {
		ErpLedgerEntry oldErpLedBudLineItem = erpLedBudLineItem;
		erpLedBudLineItem = newErpLedBudLineItem;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedBudLineItem <em>Erp Led Bud Line Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Led Bud Line Item</em>' reference.
	 * @see #getErpLedBudLineItem()
	 * @generated
	 */
	public void setErpLedBudLineItem(ErpLedgerEntry newErpLedBudLineItem) {
		if (newErpLedBudLineItem != erpLedBudLineItem) {
			NotificationChain msgs = null;
			if (erpLedBudLineItem != null)
				msgs = ((InternalEObject)erpLedBudLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, ErpLedgerEntry.class, msgs);
			if (newErpLedBudLineItem != null)
				msgs = ((InternalEObject)newErpLedBudLineItem).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, ErpLedgerEntry.class, msgs);
			msgs = basicSetErpLedBudLineItem(newErpLedBudLineItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Erp Ledger Budget</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems <em>Erp Led Bud Line Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Ledger Budget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Ledger Budget</em>' reference.
	 * @see #setErpLedgerBudget(ErpLedgerBudget)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpLedgerBudget#getErpLedBudLineItems
	 * @generated
	 */
	public ErpLedgerBudget getErpLedgerBudget() {
		if (erpLedgerBudget != null && erpLedgerBudget.eIsProxy()) {
			InternalEObject oldErpLedgerBudget = (InternalEObject)erpLedgerBudget;
			erpLedgerBudget = (ErpLedgerBudget)eResolveProxy(oldErpLedgerBudget);
			if (erpLedgerBudget != oldErpLedgerBudget) {
			}
		}
		return erpLedgerBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpLedgerBudget basicGetErpLedgerBudget() {
		return erpLedgerBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpLedgerBudget(ErpLedgerBudget newErpLedgerBudget, NotificationChain msgs) {
		ErpLedgerBudget oldErpLedgerBudget = erpLedgerBudget;
		erpLedgerBudget = newErpLedgerBudget;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getErpLedgerBudget <em>Erp Ledger Budget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Ledger Budget</em>' reference.
	 * @see #getErpLedgerBudget()
	 * @generated
	 */
	public void setErpLedgerBudget(ErpLedgerBudget newErpLedgerBudget) {
		if (newErpLedgerBudget != erpLedgerBudget) {
			NotificationChain msgs = null;
			if (erpLedgerBudget != null)
				msgs = ((InternalEObject)erpLedgerBudget).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS, ErpLedgerBudget.class, msgs);
			if (newErpLedgerBudget != null)
				msgs = ((InternalEObject)newErpLedgerBudget).eInverseAdd(this, InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS, ErpLedgerBudget.class, msgs);
			msgs = basicSetErpLedgerBudget(newErpLedgerBudget, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpLedBudLineItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				if (erpLedBudLineItem != null)
					msgs = ((InternalEObject)erpLedBudLineItem).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_ENTRY__ERP_LEDGER_ENTRY, ErpLedgerEntry.class, msgs);
				return basicSetErpLedBudLineItem((ErpLedgerEntry)otherEnd, msgs);
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				if (erpLedgerBudget != null)
					msgs = ((InternalEObject)erpLedgerBudget).eInverseRemove(this, InfERPSupportPackage.ERP_LEDGER_BUDGET__ERP_LED_BUD_LINE_ITEMS, ErpLedgerBudget.class, msgs);
				return basicSetErpLedgerBudget((ErpLedgerBudget)otherEnd, msgs);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				return basicSetErpLedBudLineItem(null, msgs);
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				return basicSetErpLedgerBudget(null, msgs);
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				return basicSetStatus(null, msgs);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				if (resolve) return getErpLedBudLineItem();
				return basicGetErpLedBudLineItem();
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				if (resolve) return getErpLedgerBudget();
				return basicGetErpLedgerBudget();
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				return getStatus();
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				setErpLedBudLineItem((ErpLedgerEntry)newValue);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				setErpLedgerBudget((ErpLedgerBudget)newValue);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				setStatus((Status)newValue);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				setErpLedBudLineItem((ErpLedgerEntry)null);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				setErpLedgerBudget((ErpLedgerBudget)null);
				return;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				setStatus((Status)null);
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
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LED_BUD_LINE_ITEM:
				return erpLedBudLineItem != null;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__ERP_LEDGER_BUDGET:
				return erpLedgerBudget != null;
			case InfERPSupportPackage.ERP_LED_BUD_LINE_ITEM__STATUS:
				return status != null;
		}
		return super.eIsSet(featureID);
	}

} // ErpLedBudLineItem
