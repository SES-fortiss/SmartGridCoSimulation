/**
 */
package CIM15.IEC61970.LoadModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.SubLoadArea#getLoadGroups <em>Load Groups</em>}</li>
 *   <li>{@link CIM15.IEC61970.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubLoadArea extends EnergyArea {
	/**
	 * The cached value of the '{@link #getLoadGroups() <em>Load Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadGroup> loadGroups;

	/**
	 * The cached value of the '{@link #getLoadArea() <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadArea()
	 * @generated
	 * @ordered
	 */
	protected LoadArea loadArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubLoadArea() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.SUB_LOAD_AREA;
	}

	/**
	 * Returns the value of the '<em><b>Load Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.LoadGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Groups</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.LoadGroup#getSubLoadArea
	 * @generated
	 */
	public EList<LoadGroup> getLoadGroups() {
		if (loadGroups == null) {
			loadGroups = new BasicInternalEList<LoadGroup>(LoadGroup.class);
		}
		return loadGroups;
	}

	/**
	 * Returns the value of the '<em><b>Load Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Area</em>' reference.
	 * @see #setLoadArea(LoadArea)
	 * @see CIM15.IEC61970.LoadModel.LoadArea#getSubLoadAreas
	 * @generated
	 */
	public LoadArea getLoadArea() {
		if (loadArea != null && loadArea.eIsProxy()) {
			InternalEObject oldLoadArea = (InternalEObject)loadArea;
			loadArea = (LoadArea)eResolveProxy(oldLoadArea);
			if (loadArea != oldLoadArea) {
			}
		}
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadArea basicGetLoadArea() {
		return loadArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadArea(LoadArea newLoadArea, NotificationChain msgs) {
		LoadArea oldLoadArea = loadArea;
		loadArea = newLoadArea;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Area</em>' reference.
	 * @see #getLoadArea()
	 * @generated
	 */
	public void setLoadArea(LoadArea newLoadArea) {
		if (newLoadArea != loadArea) {
			NotificationChain msgs = null;
			if (loadArea != null)
				msgs = ((InternalEObject)loadArea).eInverseRemove(this, LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
			if (newLoadArea != null)
				msgs = ((InternalEObject)newLoadArea).eInverseAdd(this, LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
			msgs = basicSetLoadArea(newLoadArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadGroups()).basicAdd(otherEnd, msgs);
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				if (loadArea != null)
					msgs = ((InternalEObject)loadArea).eInverseRemove(this, LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS, LoadArea.class, msgs);
				return basicSetLoadArea((LoadArea)otherEnd, msgs);
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return ((InternalEList<?>)getLoadGroups()).basicRemove(otherEnd, msgs);
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				return basicSetLoadArea(null, msgs);
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return getLoadGroups();
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				if (resolve) return getLoadArea();
				return basicGetLoadArea();
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				getLoadGroups().clear();
				getLoadGroups().addAll((Collection<? extends LoadGroup>)newValue);
				return;
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)newValue);
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				getLoadGroups().clear();
				return;
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				setLoadArea((LoadArea)null);
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
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_GROUPS:
				return loadGroups != null && !loadGroups.isEmpty();
			case LoadModelPackage.SUB_LOAD_AREA__LOAD_AREA:
				return loadArea != null;
		}
		return super.eIsSet(featureID);
	}

} // SubLoadArea
