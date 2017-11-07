/**
 */
package CIM15.IEC61970.Informative.InfOperations;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PowerSystemResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getDocuments <em>Documents</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getPowerSystemResources <em>Power System Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkDataSet extends IdentifiedObject {
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
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

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
	 * The cached value of the '{@link #getChangeSets() <em>Change Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeSet> changeSets;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkDataSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.NETWORK_DATA_SET;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.NETWORK_DATA_SET__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfOperationsPackage.NETWORK_DATA_SET__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.Document}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Document#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see CIM15.IEC61968.Common.Document#getNetworkDataSets
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new BasicInternalEList<Document>(Document.class);
		}
		return documents;
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet <em>Network Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getNetworkDataSet
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfOperations.NetworkDataSet#getCategory <em>Category</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Change Sets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Sets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeSet#getNetworkDataSets
	 * @generated
	 */
	public EList<ChangeSet> getChangeSets() {
		if (changeSets == null) {
			changeSets = new BasicInternalEList<ChangeSet>(ChangeSet.class);
		}
		return changeSets;
	}

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getNetworkDataSets <em>Network Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getNetworkDataSets
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new BasicInternalEList<PowerSystemResource>(PowerSystemResource.class);
		}
		return powerSystemResources;
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
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocuments()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeSets()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				return basicSetStatus(null, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return ((InternalEList<?>)getChangeSets()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				return getStatus();
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				return getDocuments();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return getChangeItems();
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
				return getCategory();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return getChangeSets();
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
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
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				setStatus((Status)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
				setCategory((String)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				getChangeSets().clear();
				getChangeSets().addAll((Collection<? extends ChangeSet>)newValue);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
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
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				setStatus((Status)null);
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				getDocuments().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
				unsetCategory();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				getChangeSets().clear();
				return;
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
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
			case InfOperationsPackage.NETWORK_DATA_SET__STATUS:
				return status != null;
			case InfOperationsPackage.NETWORK_DATA_SET__DOCUMENTS:
				return documents != null && !documents.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__CATEGORY:
				return isSetCategory();
			case InfOperationsPackage.NETWORK_DATA_SET__CHANGE_SETS:
				return changeSets != null && !changeSets.isEmpty();
			case InfOperationsPackage.NETWORK_DATA_SET__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} // NetworkDataSet
