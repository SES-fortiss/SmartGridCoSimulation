/**
 */
package CIM15.IEC61970.Core;

import CIM15.Element;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.NameType#getName <em>Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.NameType#getNames <em>Names</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.NameType#getNameTypeAuthority <em>Name Type Authority</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.NameType#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameType extends Element {
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
	 * The cached value of the '{@link #getNames() <em>Names</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<Name> names;

	/**
	 * The cached value of the '{@link #getNameTypeAuthority() <em>Name Type Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTypeAuthority()
	 * @generated
	 * @ordered
	 */
	protected NameTypeAuthority nameTypeAuthority;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.NAME_TYPE;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Core.NameType#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.NameType#getName <em>Name</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.NameType#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Names</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Name}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Name#getNameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' reference list.
	 * @see CIM15.IEC61970.Core.Name#getNameType
	 * @generated
	 */
	public EList<Name> getNames() {
		if (names == null) {
			names = new BasicInternalEList<Name>(Name.class);
		}
		return names;
	}

	/**
	 * Returns the value of the '<em><b>Name Type Authority</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.NameTypeAuthority#getNameTypes <em>Name Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Type Authority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Type Authority</em>' reference.
	 * @see #setNameTypeAuthority(NameTypeAuthority)
	 * @see CIM15.IEC61970.Core.NameTypeAuthority#getNameTypes
	 * @generated
	 */
	public NameTypeAuthority getNameTypeAuthority() {
		if (nameTypeAuthority != null && nameTypeAuthority.eIsProxy()) {
			InternalEObject oldNameTypeAuthority = (InternalEObject)nameTypeAuthority;
			nameTypeAuthority = (NameTypeAuthority)eResolveProxy(oldNameTypeAuthority);
			if (nameTypeAuthority != oldNameTypeAuthority) {
			}
		}
		return nameTypeAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameTypeAuthority basicGetNameTypeAuthority() {
		return nameTypeAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameTypeAuthority(NameTypeAuthority newNameTypeAuthority, NotificationChain msgs) {
		NameTypeAuthority oldNameTypeAuthority = nameTypeAuthority;
		nameTypeAuthority = newNameTypeAuthority;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.NameType#getNameTypeAuthority <em>Name Type Authority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Type Authority</em>' reference.
	 * @see #getNameTypeAuthority()
	 * @generated
	 */
	public void setNameTypeAuthority(NameTypeAuthority newNameTypeAuthority) {
		if (newNameTypeAuthority != nameTypeAuthority) {
			NotificationChain msgs = null;
			if (nameTypeAuthority != null)
				msgs = ((InternalEObject)nameTypeAuthority).eInverseRemove(this, CorePackage.NAME_TYPE_AUTHORITY__NAME_TYPES, NameTypeAuthority.class, msgs);
			if (newNameTypeAuthority != null)
				msgs = ((InternalEObject)newNameTypeAuthority).eInverseAdd(this, CorePackage.NAME_TYPE_AUTHORITY__NAME_TYPES, NameTypeAuthority.class, msgs);
			msgs = basicSetNameTypeAuthority(newNameTypeAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.NameType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
		descriptionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.NameType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	public void unsetDescription() {
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.NameType#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
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
			case CorePackage.NAME_TYPE__NAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNames()).basicAdd(otherEnd, msgs);
			case CorePackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
				if (nameTypeAuthority != null)
					msgs = ((InternalEObject)nameTypeAuthority).eInverseRemove(this, CorePackage.NAME_TYPE_AUTHORITY__NAME_TYPES, NameTypeAuthority.class, msgs);
				return basicSetNameTypeAuthority((NameTypeAuthority)otherEnd, msgs);
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
			case CorePackage.NAME_TYPE__NAMES:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case CorePackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
				return basicSetNameTypeAuthority(null, msgs);
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
			case CorePackage.NAME_TYPE__NAME:
				return getName();
			case CorePackage.NAME_TYPE__NAMES:
				return getNames();
			case CorePackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
				if (resolve) return getNameTypeAuthority();
				return basicGetNameTypeAuthority();
			case CorePackage.NAME_TYPE__DESCRIPTION:
				return getDescription();
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
			case CorePackage.NAME_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.NAME_TYPE__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends Name>)newValue);
				return;
			case CorePackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
				setNameTypeAuthority((NameTypeAuthority)newValue);
				return;
			case CorePackage.NAME_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case CorePackage.NAME_TYPE__NAME:
				unsetName();
				return;
			case CorePackage.NAME_TYPE__NAMES:
				getNames().clear();
				return;
			case CorePackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
				setNameTypeAuthority((NameTypeAuthority)null);
				return;
			case CorePackage.NAME_TYPE__DESCRIPTION:
				unsetDescription();
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
			case CorePackage.NAME_TYPE__NAME:
				return isSetName();
			case CorePackage.NAME_TYPE__NAMES:
				return names != null && !names.isEmpty();
			case CorePackage.NAME_TYPE__NAME_TYPE_AUTHORITY:
				return nameTypeAuthority != null;
			case CorePackage.NAME_TYPE__DESCRIPTION:
				return isSetDescription();
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
		result.append(", description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // NameType
