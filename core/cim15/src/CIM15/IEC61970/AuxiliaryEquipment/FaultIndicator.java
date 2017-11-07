/**
 */
package CIM15.IEC61970.AuxiliaryEquipment;

import CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator#getFaultIndicatorInfo <em>Fault Indicator Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultIndicator extends AuxiliaryEquipment {
	/**
	 * The cached value of the '{@link #getFaultIndicatorInfo() <em>Fault Indicator Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultIndicatorInfo()
	 * @generated
	 * @ordered
	 */
	protected FaultIndicatorInfo faultIndicatorInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultIndicator() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuxiliaryEquipmentPackage.Literals.FAULT_INDICATOR;
	}

	/**
	 * Returns the value of the '<em><b>Fault Indicator Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getFaultIndicators <em>Fault Indicators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault Indicator Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault Indicator Info</em>' reference.
	 * @see #setFaultIndicatorInfo(FaultIndicatorInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getFaultIndicators
	 * @generated
	 */
	public FaultIndicatorInfo getFaultIndicatorInfo() {
		if (faultIndicatorInfo != null && faultIndicatorInfo.eIsProxy()) {
			InternalEObject oldFaultIndicatorInfo = (InternalEObject)faultIndicatorInfo;
			faultIndicatorInfo = (FaultIndicatorInfo)eResolveProxy(oldFaultIndicatorInfo);
			if (faultIndicatorInfo != oldFaultIndicatorInfo) {
			}
		}
		return faultIndicatorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultIndicatorInfo basicGetFaultIndicatorInfo() {
		return faultIndicatorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaultIndicatorInfo(FaultIndicatorInfo newFaultIndicatorInfo, NotificationChain msgs) {
		FaultIndicatorInfo oldFaultIndicatorInfo = faultIndicatorInfo;
		faultIndicatorInfo = newFaultIndicatorInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.AuxiliaryEquipment.FaultIndicator#getFaultIndicatorInfo <em>Fault Indicator Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Indicator Info</em>' reference.
	 * @see #getFaultIndicatorInfo()
	 * @generated
	 */
	public void setFaultIndicatorInfo(FaultIndicatorInfo newFaultIndicatorInfo) {
		if (newFaultIndicatorInfo != faultIndicatorInfo) {
			NotificationChain msgs = null;
			if (faultIndicatorInfo != null)
				msgs = ((InternalEObject)faultIndicatorInfo).eInverseRemove(this, InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS, FaultIndicatorInfo.class, msgs);
			if (newFaultIndicatorInfo != null)
				msgs = ((InternalEObject)newFaultIndicatorInfo).eInverseAdd(this, InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS, FaultIndicatorInfo.class, msgs);
			msgs = basicSetFaultIndicatorInfo(newFaultIndicatorInfo, msgs);
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
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR__FAULT_INDICATOR_INFO:
				if (faultIndicatorInfo != null)
					msgs = ((InternalEObject)faultIndicatorInfo).eInverseRemove(this, InfAssetsPackage.FAULT_INDICATOR_INFO__FAULT_INDICATORS, FaultIndicatorInfo.class, msgs);
				return basicSetFaultIndicatorInfo((FaultIndicatorInfo)otherEnd, msgs);
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
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR__FAULT_INDICATOR_INFO:
				return basicSetFaultIndicatorInfo(null, msgs);
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
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR__FAULT_INDICATOR_INFO:
				if (resolve) return getFaultIndicatorInfo();
				return basicGetFaultIndicatorInfo();
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
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR__FAULT_INDICATOR_INFO:
				setFaultIndicatorInfo((FaultIndicatorInfo)newValue);
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
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR__FAULT_INDICATOR_INFO:
				setFaultIndicatorInfo((FaultIndicatorInfo)null);
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
			case AuxiliaryEquipmentPackage.FAULT_INDICATOR__FAULT_INDICATOR_INFO:
				return faultIndicatorInfo != null;
		}
		return super.eIsSet(featureID);
	}

} // FaultIndicator
