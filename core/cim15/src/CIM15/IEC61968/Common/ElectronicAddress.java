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
 * A representation of the model object '<em><b>Electronic Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ElectronicAddress#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}</li>
 *   <li>{@link CIM15.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElectronicAddress extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected static final String RADIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected String radio = RADIO_EDEFAULT;

	/**
	 * This is true if the Radio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radioESet;

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
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * This is true if the Password attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passwordESet;

	/**
	 * The default value of the '{@link #getLan() <em>Lan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLan()
	 * @generated
	 * @ordered
	 */
	protected static final String LAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLan() <em>Lan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLan()
	 * @generated
	 * @ordered
	 */
	protected String lan = LAN_EDEFAULT;

	/**
	 * This is true if the Lan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lanESet;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * This is true if the User ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userIDESet;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * This is true if the Email attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emailESet;

	/**
	 * The default value of the '{@link #getWeb() <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeb() <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeb()
	 * @generated
	 * @ordered
	 */
	protected String web = WEB_EDEFAULT;

	/**
	 * This is true if the Web attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean webESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectronicAddress() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ELECTRONIC_ADDRESS;
	}

	/**
	 * Returns the value of the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio</em>' attribute.
	 * @see #isSetRadio()
	 * @see #unsetRadio()
	 * @see #setRadio(String)
	 * @generated
	 */
	public String getRadio() {
		return radio;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio</em>' attribute.
	 * @see #isSetRadio()
	 * @see #unsetRadio()
	 * @see #getRadio()
	 * @generated
	 */
	public void setRadio(String newRadio) {
		radio = newRadio;
		radioESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadio()
	 * @see #getRadio()
	 * @see #setRadio(String)
	 * @generated
	 */
	public void unsetRadio() {
		radio = RADIO_EDEFAULT;
		radioESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getRadio <em>Radio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radio</em>' attribute is set.
	 * @see #unsetRadio()
	 * @see #getRadio()
	 * @see #setRadio(String)
	 * @generated
	 */
	public boolean isSetRadio() {
		return radioESet;
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
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ELECTRONIC_ADDRESS__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ELECTRONIC_ADDRESS__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #setPassword(String)
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #getPassword()
	 * @generated
	 */
	public void setPassword(String newPassword) {
		password = newPassword;
		passwordESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPassword()
	 * @see #getPassword()
	 * @see #setPassword(String)
	 * @generated
	 */
	public void unsetPassword() {
		password = PASSWORD_EDEFAULT;
		passwordESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getPassword <em>Password</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Password</em>' attribute is set.
	 * @see #unsetPassword()
	 * @see #getPassword()
	 * @see #setPassword(String)
	 * @generated
	 */
	public boolean isSetPassword() {
		return passwordESet;
	}

	/**
	 * Returns the value of the '<em><b>Lan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lan</em>' attribute.
	 * @see #isSetLan()
	 * @see #unsetLan()
	 * @see #setLan(String)
	 * @generated
	 */
	public String getLan() {
		return lan;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lan</em>' attribute.
	 * @see #isSetLan()
	 * @see #unsetLan()
	 * @see #getLan()
	 * @generated
	 */
	public void setLan(String newLan) {
		lan = newLan;
		lanESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLan()
	 * @see #getLan()
	 * @see #setLan(String)
	 * @generated
	 */
	public void unsetLan() {
		lan = LAN_EDEFAULT;
		lanESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getLan <em>Lan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lan</em>' attribute is set.
	 * @see #unsetLan()
	 * @see #getLan()
	 * @see #setLan(String)
	 * @generated
	 */
	public boolean isSetLan() {
		return lanESet;
	}

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #isSetUserID()
	 * @see #unsetUserID()
	 * @see #setUserID(String)
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #isSetUserID()
	 * @see #unsetUserID()
	 * @see #getUserID()
	 * @generated
	 */
	public void setUserID(String newUserID) {
		userID = newUserID;
		userIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserID()
	 * @see #getUserID()
	 * @see #setUserID(String)
	 * @generated
	 */
	public void unsetUserID() {
		userID = USER_ID_EDEFAULT;
		userIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getUserID <em>User ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User ID</em>' attribute is set.
	 * @see #unsetUserID()
	 * @see #getUserID()
	 * @see #setUserID(String)
	 * @generated
	 */
	public boolean isSetUserID() {
		return userIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #isSetEmail()
	 * @see #unsetEmail()
	 * @see #setEmail(String)
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #isSetEmail()
	 * @see #unsetEmail()
	 * @see #getEmail()
	 * @generated
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
		emailESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmail()
	 * @see #getEmail()
	 * @see #setEmail(String)
	 * @generated
	 */
	public void unsetEmail() {
		email = EMAIL_EDEFAULT;
		emailESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getEmail <em>Email</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Email</em>' attribute is set.
	 * @see #unsetEmail()
	 * @see #getEmail()
	 * @see #setEmail(String)
	 * @generated
	 */
	public boolean isSetEmail() {
		return emailESet;
	}

	/**
	 * Returns the value of the '<em><b>Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web</em>' attribute.
	 * @see #isSetWeb()
	 * @see #unsetWeb()
	 * @see #setWeb(String)
	 * @generated
	 */
	public String getWeb() {
		return web;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web</em>' attribute.
	 * @see #isSetWeb()
	 * @see #unsetWeb()
	 * @see #getWeb()
	 * @generated
	 */
	public void setWeb(String newWeb) {
		web = newWeb;
		webESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeb()
	 * @see #getWeb()
	 * @see #setWeb(String)
	 * @generated
	 */
	public void unsetWeb() {
		web = WEB_EDEFAULT;
		webESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Common.ElectronicAddress#getWeb <em>Web</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Web</em>' attribute is set.
	 * @see #unsetWeb()
	 * @see #getWeb()
	 * @see #setWeb(String)
	 * @generated
	 */
	public boolean isSetWeb() {
		return webESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
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
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				return getRadio();
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				return getStatus();
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				return getPassword();
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				return getLan();
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				return getUserID();
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				return getEmail();
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				return getWeb();
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
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				setRadio((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				setStatus((Status)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				setPassword((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				setLan((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				setUserID((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				setEmail((String)newValue);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				setWeb((String)newValue);
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
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				unsetRadio();
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				setStatus((Status)null);
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				unsetPassword();
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				unsetLan();
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				unsetUserID();
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				unsetEmail();
				return;
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				unsetWeb();
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
			case CommonPackage.ELECTRONIC_ADDRESS__RADIO:
				return isSetRadio();
			case CommonPackage.ELECTRONIC_ADDRESS__STATUS:
				return status != null;
			case CommonPackage.ELECTRONIC_ADDRESS__PASSWORD:
				return isSetPassword();
			case CommonPackage.ELECTRONIC_ADDRESS__LAN:
				return isSetLan();
			case CommonPackage.ELECTRONIC_ADDRESS__USER_ID:
				return isSetUserID();
			case CommonPackage.ELECTRONIC_ADDRESS__EMAIL:
				return isSetEmail();
			case CommonPackage.ELECTRONIC_ADDRESS__WEB:
				return isSetWeb();
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
		result.append(" (radio: ");
		if (radioESet) result.append(radio); else result.append("<unset>");
		result.append(", password: ");
		if (passwordESet) result.append(password); else result.append("<unset>");
		result.append(", lan: ");
		if (lanESet) result.append(lan); else result.append("<unset>");
		result.append(", userID: ");
		if (userIDESet) result.append(userID); else result.append("<unset>");
		result.append(", email: ");
		if (emailESet) result.append(email); else result.append("<unset>");
		result.append(", web: ");
		if (webESet) result.append(web); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ElectronicAddress
