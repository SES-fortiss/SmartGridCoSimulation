/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61968.Metering.EndDeviceFunction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ComEquipment#getEndDeviceFunctions <em>End Device Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComEquipment extends Asset {
	/**
	 * The cached value of the '{@link #getEndDeviceFunctions() <em>End Device Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceFunction> endDeviceFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComEquipment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getComEquipment();
	}

	/**
	 * Returns the value of the '<em><b>End Device Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.EndDeviceFunction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.EndDeviceFunction#getComEquipment <em>Com Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Functions</em>' reference list.
	 * @see CIM15.IEC61968.Metering.EndDeviceFunction#getComEquipment
	 * @generated
	 */
	public EList<EndDeviceFunction> getEndDeviceFunctions() {
		if (endDeviceFunctions == null) {
			endDeviceFunctions = new BasicInternalEList<EndDeviceFunction>(EndDeviceFunction.class);
		}
		return endDeviceFunctions;
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
			case InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceFunctions()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS:
				return ((InternalEList<?>)getEndDeviceFunctions()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS:
				return getEndDeviceFunctions();
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
			case InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS:
				getEndDeviceFunctions().clear();
				getEndDeviceFunctions().addAll((Collection<? extends EndDeviceFunction>)newValue);
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
			case InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS:
				getEndDeviceFunctions().clear();
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
			case InfAssetsPackage.COM_EQUIPMENT__END_DEVICE_FUNCTIONS:
				return endDeviceFunctions != null && !endDeviceFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ComEquipment
