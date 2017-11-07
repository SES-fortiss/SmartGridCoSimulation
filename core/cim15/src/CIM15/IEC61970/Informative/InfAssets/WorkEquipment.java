/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Informative.InfWork.Crew;
import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;
import CIM15.IEC61970.Informative.InfWork.Usage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getCrew <em>Crew</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getUsages <em>Usages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkEquipment extends Asset {
	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected Crew crew;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<Usage> usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEquipment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getWorkEquipment();
	}

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets <em>Work Equipment Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see CIM15.IEC61970.Informative.InfWork.Crew#getWorkEquipmentAssets
	 * @generated
	 */
	public Crew getCrew() {
		if (crew != null && crew.eIsProxy()) {
			InternalEObject oldCrew = (InternalEObject)crew;
			crew = (Crew)eResolveProxy(oldCrew);
			if (crew != oldCrew) {
			}
		}
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crew basicGetCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(Crew newCrew, NotificationChain msgs) {
		Crew oldCrew = crew;
		crew = newCrew;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WorkEquipment#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	public void setCrew(Crew newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS, Crew.class, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject)newCrew).eInverseAdd(this, InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS, Crew.class, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Usage}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset <em>Work Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Usage#getWorkEquipmentAsset
	 * @generated
	 */
	public EList<Usage> getUsages() {
		if (usages == null) {
			usages = new BasicInternalEList<Usage>(Usage.class);
		}
		return usages;
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
			case InfAssetsPackage.WORK_EQUIPMENT__CREW:
				if (crew != null)
					msgs = ((InternalEObject)crew).eInverseRemove(this, InfWorkPackage.CREW__WORK_EQUIPMENT_ASSETS, Crew.class, msgs);
				return basicSetCrew((Crew)otherEnd, msgs);
			case InfAssetsPackage.WORK_EQUIPMENT__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.WORK_EQUIPMENT__CREW:
				return basicSetCrew(null, msgs);
			case InfAssetsPackage.WORK_EQUIPMENT__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.WORK_EQUIPMENT__CREW:
				if (resolve) return getCrew();
				return basicGetCrew();
			case InfAssetsPackage.WORK_EQUIPMENT__USAGES:
				return getUsages();
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
			case InfAssetsPackage.WORK_EQUIPMENT__CREW:
				setCrew((Crew)newValue);
				return;
			case InfAssetsPackage.WORK_EQUIPMENT__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends Usage>)newValue);
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
			case InfAssetsPackage.WORK_EQUIPMENT__CREW:
				setCrew((Crew)null);
				return;
			case InfAssetsPackage.WORK_EQUIPMENT__USAGES:
				getUsages().clear();
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
			case InfAssetsPackage.WORK_EQUIPMENT__CREW:
				return crew != null;
			case InfAssetsPackage.WORK_EQUIPMENT__USAGES:
				return usages != null && !usages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // WorkEquipment
