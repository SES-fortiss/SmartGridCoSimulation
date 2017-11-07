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
 * A representation of the model object '<em><b>Load Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.LoadModel.LoadArea#getSubLoadAreas <em>Sub Load Areas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadArea extends EnergyArea {
	/**
	 * The cached value of the '{@link #getSubLoadAreas() <em>Sub Load Areas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLoadAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<SubLoadArea> subLoadAreas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadArea() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadModelPackage.Literals.LOAD_AREA;
	}

	/**
	 * Returns the value of the '<em><b>Sub Load Areas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.LoadModel.SubLoadArea}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.LoadModel.SubLoadArea#getLoadArea <em>Load Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Load Areas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Load Areas</em>' reference list.
	 * @see CIM15.IEC61970.LoadModel.SubLoadArea#getLoadArea
	 * @generated
	 */
	public EList<SubLoadArea> getSubLoadAreas() {
		if (subLoadAreas == null) {
			subLoadAreas = new BasicInternalEList<SubLoadArea>(SubLoadArea.class);
		}
		return subLoadAreas;
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubLoadAreas()).basicAdd(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return ((InternalEList<?>)getSubLoadAreas()).basicRemove(otherEnd, msgs);
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return getSubLoadAreas();
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				getSubLoadAreas().clear();
				getSubLoadAreas().addAll((Collection<? extends SubLoadArea>)newValue);
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				getSubLoadAreas().clear();
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
			case LoadModelPackage.LOAD_AREA__SUB_LOAD_AREAS:
				return subLoadAreas != null && !subLoadAreas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // LoadArea
