/**
 */
package CIM15.IEC61970.LoadModel;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadGroup extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getSubLoadArea() <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLoadArea()
	 * @generated
	 * @ordered
	 */
	protected SubLoadArea subLoadArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.LOAD_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Sub Load Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Load Area</em>' reference.
	 * @see #setSubLoadArea(SubLoadArea)
	 * @see CIM15.IEC61970.LoadModel.SubLoadArea#getLoadGroups
	 * @generated
	 */
	public SubLoadArea getSubLoadArea() {
		if (subLoadArea != null && subLoadArea.eIsProxy()) {
			InternalEObject oldSubLoadArea = (InternalEObject)subLoadArea;
			subLoadArea = (SubLoadArea)eResolveProxy(oldSubLoadArea);
			if (subLoadArea != oldSubLoadArea) {
			}
		}
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea basicGetSubLoadArea() {
		return subLoadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubLoadArea(SubLoadArea newSubLoadArea, NotificationChain msgs) {
		SubLoadArea oldSubLoadArea = subLoadArea;
		subLoadArea = newSubLoadArea;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Load Area</em>' reference.
	 * @see #getSubLoadArea()
	 * @generated
	 */
	public void setSubLoadArea(SubLoadArea newSubLoadArea) {
		if (newSubLoadArea != subLoadArea) {
			NotificationChain msgs = null;
			if (subLoadArea != null)
				msgs = ((InternalEObject)subLoadArea).eInverseRemove(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
			if (newSubLoadArea != null)
				msgs = ((InternalEObject)newSubLoadArea).eInverseAdd(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
			msgs = basicSetSubLoadArea(newSubLoadArea, msgs);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				if (subLoadArea != null)
					msgs = ((InternalEObject)subLoadArea).eInverseRemove(this, LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS, SubLoadArea.class, msgs);
				return basicSetSubLoadArea((SubLoadArea)otherEnd, msgs);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				return basicSetSubLoadArea(null, msgs);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				if (resolve) return getSubLoadArea();
				return basicGetSubLoadArea();
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)newValue);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				setSubLoadArea((SubLoadArea)null);
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
			case LoadModelPackage.LOAD_GROUP__SUB_LOAD_AREA:
				return subLoadArea != null;
		}
		return super.eIsSet(featureID);
	}

} // LoadGroup
