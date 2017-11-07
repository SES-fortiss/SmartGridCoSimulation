/**
 */
package CIM15.IEC61968.Common;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.PostalAddress#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.PostalAddress#getTownDetail <em>Town Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostalAddress extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getStreetDetail() <em>Street Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetDetail()
	 * @generated
	 * @ordered
	 */
	protected StreetDetail streetDetail;

	/**
	 * The default value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoBox()
	 * @generated
	 * @ordered
	 */
	protected static final String PO_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoBox() <em>Po Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoBox()
	 * @generated
	 * @ordered
	 */
	protected String poBox = PO_BOX_EDEFAULT;

	/**
	 * This is true if the Po Box attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean poBoxESet;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * This is true if the Postal Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postalCodeESet;

	/**
	 * The cached value of the '{@link #getTownDetail() <em>Town Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTownDetail()
	 * @generated
	 * @ordered
	 */
	protected TownDetail townDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddress() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.POSTAL_ADDRESS;
	}

	/**
	 * Returns the value of the '<em><b>Street Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Detail</em>' containment reference.
	 * @see #setStreetDetail(StreetDetail)
	 * @generated
	 */
	public StreetDetail getStreetDetail() {
		return streetDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreetDetail(StreetDetail newStreetDetail, NotificationChain msgs) {
		StreetDetail oldStreetDetail = streetDetail;
		streetDetail = newStreetDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getStreetDetail <em>Street Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Detail</em>' containment reference.
	 * @see #getStreetDetail()
	 * @generated
	 */
	public void setStreetDetail(StreetDetail newStreetDetail) {
		if (newStreetDetail != streetDetail) {
			NotificationChain msgs = null;
			if (streetDetail != null)
				msgs = ((InternalEObject)streetDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.POSTAL_ADDRESS__STREET_DETAIL, null, msgs);
			if (newStreetDetail != null)
				msgs = ((InternalEObject)newStreetDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.POSTAL_ADDRESS__STREET_DETAIL, null, msgs);
			msgs = basicSetStreetDetail(newStreetDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Po Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Po Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Po Box</em>' attribute.
	 * @see #isSetPoBox()
	 * @see #unsetPoBox()
	 * @see #setPoBox(String)
	 * @generated
	 */
	public String getPoBox() {
		return poBox;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Po Box</em>' attribute.
	 * @see #isSetPoBox()
	 * @see #unsetPoBox()
	 * @see #getPoBox()
	 * @generated
	 */
	public void setPoBox(String newPoBox) {
		poBox = newPoBox;
		poBoxESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoBox()
	 * @see #getPoBox()
	 * @see #setPoBox(String)
	 * @generated
	 */
	public void unsetPoBox() {
		poBox = PO_BOX_EDEFAULT;
		poBoxESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getPoBox <em>Po Box</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Po Box</em>' attribute is set.
	 * @see #unsetPoBox()
	 * @see #getPoBox()
	 * @see #setPoBox(String)
	 * @generated
	 */
	public boolean isSetPoBox() {
		return poBoxESet;
	}

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		postalCode = newPostalCode;
		postalCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	public void unsetPostalCode() {
		postalCode = POSTAL_CODE_EDEFAULT;
		postalCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Postal Code</em>' attribute is set.
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(String)
	 * @generated
	 */
	public boolean isSetPostalCode() {
		return postalCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Town Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Town Detail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Town Detail</em>' containment reference.
	 * @see #setTownDetail(TownDetail)
	 * @generated
	 */
	public TownDetail getTownDetail() {
		return townDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTownDetail(TownDetail newTownDetail, NotificationChain msgs) {
		TownDetail oldTownDetail = townDetail;
		townDetail = newTownDetail;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.PostalAddress#getTownDetail <em>Town Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Town Detail</em>' containment reference.
	 * @see #getTownDetail()
	 * @generated
	 */
	public void setTownDetail(TownDetail newTownDetail) {
		if (newTownDetail != townDetail) {
			NotificationChain msgs = null;
			if (townDetail != null)
				msgs = ((InternalEObject)townDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL, null, msgs);
			if (newTownDetail != null)
				msgs = ((InternalEObject)newTownDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL, null, msgs);
			msgs = basicSetTownDetail(newTownDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				return basicSetStreetDetail(null, msgs);
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				return basicSetTownDetail(null, msgs);
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
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				return getStreetDetail();
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				return getPoBox();
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				return getTownDetail();
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
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)newValue);
				return;
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				setPoBox((String)newValue);
				return;
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)newValue);
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
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				setStreetDetail((StreetDetail)null);
				return;
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				unsetPoBox();
				return;
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				unsetPostalCode();
				return;
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				setTownDetail((TownDetail)null);
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
			case CommonPackage.POSTAL_ADDRESS__STREET_DETAIL:
				return streetDetail != null;
			case CommonPackage.POSTAL_ADDRESS__PO_BOX:
				return isSetPoBox();
			case CommonPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return isSetPostalCode();
			case CommonPackage.POSTAL_ADDRESS__TOWN_DETAIL:
				return townDetail != null;
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
		result.append(" (poBox: ");
		if (poBoxESet) result.append(poBox); else result.append("<unset>");
		result.append(", postalCode: ");
		if (postalCodeESet) result.append(postalCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PostalAddress
