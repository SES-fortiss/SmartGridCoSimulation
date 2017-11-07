/**
 */
package CIM15.IEC61970.Core;

import CIM15.Element;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.Name#getName <em>Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Name#getNameType <em>Name Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Name#getIdentifiedObject <em>Identified Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Name extends Element {
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
	 * The cached value of the '{@link #getNameType() <em>Name Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameType()
	 * @generated
	 * @ordered
	 */
	protected NameType nameType;

	/**
	 * The cached value of the '{@link #getIdentifiedObject() <em>Identified Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedObject()
	 * @generated
	 * @ordered
	 */
	protected IdentifiedObject identifiedObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Name() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.NAME;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Name#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Name#getName <em>Name</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Name#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.NameType#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Type</em>' reference.
	 * @see #setNameType(NameType)
	 * @see CIM15.IEC61970.Core.NameType#getNames
	 * @generated
	 */
	public NameType getNameType() {
		if (nameType != null && nameType.eIsProxy()) {
			InternalEObject oldNameType = (InternalEObject)nameType;
			nameType = (NameType)eResolveProxy(oldNameType);
			if (nameType != oldNameType) {
			}
		}
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType basicGetNameType() {
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameType(NameType newNameType, NotificationChain msgs) {
		NameType oldNameType = nameType;
		nameType = newNameType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Name#getNameType <em>Name Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Type</em>' reference.
	 * @see #getNameType()
	 * @generated
	 */
	public void setNameType(NameType newNameType) {
		if (newNameType != nameType) {
			NotificationChain msgs = null;
			if (nameType != null)
				msgs = ((InternalEObject)nameType).eInverseRemove(this, CorePackage.NAME_TYPE__NAMES, NameType.class, msgs);
			if (newNameType != null)
				msgs = ((InternalEObject)newNameType).eInverseAdd(this, CorePackage.NAME_TYPE__NAMES, NameType.class, msgs);
			msgs = basicSetNameType(newNameType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Identified Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.IdentifiedObject#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identified Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified Object</em>' reference.
	 * @see #setIdentifiedObject(IdentifiedObject)
	 * @see CIM15.IEC61970.Core.IdentifiedObject#getNames
	 * @generated
	 */
	public IdentifiedObject getIdentifiedObject() {
		if (identifiedObject != null && identifiedObject.eIsProxy()) {
			InternalEObject oldIdentifiedObject = (InternalEObject)identifiedObject;
			identifiedObject = (IdentifiedObject)eResolveProxy(oldIdentifiedObject);
			if (identifiedObject != oldIdentifiedObject) {
			}
		}
		return identifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiedObject basicGetIdentifiedObject() {
		return identifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiedObject(IdentifiedObject newIdentifiedObject, NotificationChain msgs) {
		IdentifiedObject oldIdentifiedObject = identifiedObject;
		identifiedObject = newIdentifiedObject;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Name#getIdentifiedObject <em>Identified Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identified Object</em>' reference.
	 * @see #getIdentifiedObject()
	 * @generated
	 */
	public void setIdentifiedObject(IdentifiedObject newIdentifiedObject) {
		if (newIdentifiedObject != identifiedObject) {
			NotificationChain msgs = null;
			if (identifiedObject != null)
				msgs = ((InternalEObject)identifiedObject).eInverseRemove(this, CorePackage.IDENTIFIED_OBJECT__NAMES, IdentifiedObject.class, msgs);
			if (newIdentifiedObject != null)
				msgs = ((InternalEObject)newIdentifiedObject).eInverseAdd(this, CorePackage.IDENTIFIED_OBJECT__NAMES, IdentifiedObject.class, msgs);
			msgs = basicSetIdentifiedObject(newIdentifiedObject, msgs);
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
			case CorePackage.NAME__NAME_TYPE:
				if (nameType != null)
					msgs = ((InternalEObject)nameType).eInverseRemove(this, CorePackage.NAME_TYPE__NAMES, NameType.class, msgs);
				return basicSetNameType((NameType)otherEnd, msgs);
			case CorePackage.NAME__IDENTIFIED_OBJECT:
				if (identifiedObject != null)
					msgs = ((InternalEObject)identifiedObject).eInverseRemove(this, CorePackage.IDENTIFIED_OBJECT__NAMES, IdentifiedObject.class, msgs);
				return basicSetIdentifiedObject((IdentifiedObject)otherEnd, msgs);
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
			case CorePackage.NAME__NAME_TYPE:
				return basicSetNameType(null, msgs);
			case CorePackage.NAME__IDENTIFIED_OBJECT:
				return basicSetIdentifiedObject(null, msgs);
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
			case CorePackage.NAME__NAME:
				return getName();
			case CorePackage.NAME__NAME_TYPE:
				if (resolve) return getNameType();
				return basicGetNameType();
			case CorePackage.NAME__IDENTIFIED_OBJECT:
				if (resolve) return getIdentifiedObject();
				return basicGetIdentifiedObject();
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
			case CorePackage.NAME__NAME:
				setName((String)newValue);
				return;
			case CorePackage.NAME__NAME_TYPE:
				setNameType((NameType)newValue);
				return;
			case CorePackage.NAME__IDENTIFIED_OBJECT:
				setIdentifiedObject((IdentifiedObject)newValue);
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
			case CorePackage.NAME__NAME:
				unsetName();
				return;
			case CorePackage.NAME__NAME_TYPE:
				setNameType((NameType)null);
				return;
			case CorePackage.NAME__IDENTIFIED_OBJECT:
				setIdentifiedObject((IdentifiedObject)null);
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
			case CorePackage.NAME__NAME:
				return isSetName();
			case CorePackage.NAME__NAME_TYPE:
				return nameType != null;
			case CorePackage.NAME__IDENTIFIED_OBJECT:
				return identifiedObject != null;
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
		result.append(')');
		return result.toString();
	}

} // Name
