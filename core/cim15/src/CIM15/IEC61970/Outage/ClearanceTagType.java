/**
 */
package CIM15.IEC61970.Outage;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clearance Tag Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Outage.ClearanceTagType#getClearanceTags <em>Clearance Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClearanceTagType extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getClearanceTags() <em>Clearance Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearanceTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ClearanceTag> clearanceTags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearanceTagType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.CLEARANCE_TAG_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Clearance Tags</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Outage.ClearanceTag}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.ClearanceTag#getClearanceTagType <em>Clearance Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clearance Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clearance Tags</em>' reference list.
	 * @see CIM15.IEC61970.Outage.ClearanceTag#getClearanceTagType
	 * @generated
	 */
	public EList<ClearanceTag> getClearanceTags() {
		if (clearanceTags == null) {
			clearanceTags = new BasicInternalEList<ClearanceTag>(ClearanceTag.class);
		}
		return clearanceTags;
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClearanceTags()).basicAdd(otherEnd, msgs);
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return ((InternalEList<?>)getClearanceTags()).basicRemove(otherEnd, msgs);
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return getClearanceTags();
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				getClearanceTags().clear();
				getClearanceTags().addAll((Collection<? extends ClearanceTag>)newValue);
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				getClearanceTags().clear();
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
			case OutagePackage.CLEARANCE_TAG_TYPE__CLEARANCE_TAGS:
				return clearanceTags != null && !clearanceTags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ClearanceTagType
