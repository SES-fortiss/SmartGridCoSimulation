/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.AssetInfo;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuntCompensatorInfo extends AssetInfo {
	/**
	 * The default value of the '{@link #getMaxPowerLoss() <em>Max Power Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerLoss()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_POWER_LOSS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxPowerLoss() <em>Max Power Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPowerLoss()
	 * @generated
	 * @ordered
	 */
	protected float maxPowerLoss = MAX_POWER_LOSS_EDEFAULT;

	/**
	 * This is true if the Max Power Loss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxPowerLossESet;

	/**
	 * The cached value of the '{@link #getShuntImpedanceInfo() <em>Shunt Impedance Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 * @ordered
	 */
	protected ShuntImpedanceInfo shuntImpedanceInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntCompensatorInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getShuntCompensatorInfo();
	}

	/**
	 * Returns the value of the '<em><b>Max Power Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Power Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Power Loss</em>' attribute.
	 * @see #isSetMaxPowerLoss()
	 * @see #unsetMaxPowerLoss()
	 * @see #setMaxPowerLoss(float)
	 * @generated
	 */
	public float getMaxPowerLoss() {
		return maxPowerLoss;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Power Loss</em>' attribute.
	 * @see #isSetMaxPowerLoss()
	 * @see #unsetMaxPowerLoss()
	 * @see #getMaxPowerLoss()
	 * @generated
	 */
	public void setMaxPowerLoss(float newMaxPowerLoss) {
		maxPowerLoss = newMaxPowerLoss;
		maxPowerLossESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxPowerLoss()
	 * @see #getMaxPowerLoss()
	 * @see #setMaxPowerLoss(float)
	 * @generated
	 */
	public void unsetMaxPowerLoss() {
		maxPowerLoss = MAX_POWER_LOSS_EDEFAULT;
		maxPowerLossESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getMaxPowerLoss <em>Max Power Loss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Power Loss</em>' attribute is set.
	 * @see #unsetMaxPowerLoss()
	 * @see #getMaxPowerLoss()
	 * @see #setMaxPowerLoss(float)
	 * @generated
	 */
	public boolean isSetMaxPowerLoss() {
		return maxPowerLossESet;
	}

	/**
	 * Returns the value of the '<em><b>Shunt Impedance Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos <em>Shunt Compensator Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Impedance Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Impedance Info</em>' reference.
	 * @see #setShuntImpedanceInfo(ShuntImpedanceInfo)
	 * @see CIM15.IEC61970.Informative.InfAssets.ShuntImpedanceInfo#getShuntCompensatorInfos
	 * @generated
	 */
	public ShuntImpedanceInfo getShuntImpedanceInfo() {
		if (shuntImpedanceInfo != null && shuntImpedanceInfo.eIsProxy()) {
			InternalEObject oldShuntImpedanceInfo = (InternalEObject)shuntImpedanceInfo;
			shuntImpedanceInfo = (ShuntImpedanceInfo)eResolveProxy(oldShuntImpedanceInfo);
			if (shuntImpedanceInfo != oldShuntImpedanceInfo) {
			}
		}
		return shuntImpedanceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuntImpedanceInfo basicGetShuntImpedanceInfo() {
		return shuntImpedanceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShuntImpedanceInfo(ShuntImpedanceInfo newShuntImpedanceInfo, NotificationChain msgs) {
		ShuntImpedanceInfo oldShuntImpedanceInfo = shuntImpedanceInfo;
		shuntImpedanceInfo = newShuntImpedanceInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ShuntCompensatorInfo#getShuntImpedanceInfo <em>Shunt Impedance Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt Impedance Info</em>' reference.
	 * @see #getShuntImpedanceInfo()
	 * @generated
	 */
	public void setShuntImpedanceInfo(ShuntImpedanceInfo newShuntImpedanceInfo) {
		if (newShuntImpedanceInfo != shuntImpedanceInfo) {
			NotificationChain msgs = null;
			if (shuntImpedanceInfo != null)
				msgs = ((InternalEObject)shuntImpedanceInfo).eInverseRemove(this, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS, ShuntImpedanceInfo.class, msgs);
			if (newShuntImpedanceInfo != null)
				msgs = ((InternalEObject)newShuntImpedanceInfo).eInverseAdd(this, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS, ShuntImpedanceInfo.class, msgs);
			msgs = basicSetShuntImpedanceInfo(newShuntImpedanceInfo, msgs);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				if (shuntImpedanceInfo != null)
					msgs = ((InternalEObject)shuntImpedanceInfo).eInverseRemove(this, InfAssetsPackage.SHUNT_IMPEDANCE_INFO__SHUNT_COMPENSATOR_INFOS, ShuntImpedanceInfo.class, msgs);
				return basicSetShuntImpedanceInfo((ShuntImpedanceInfo)otherEnd, msgs);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				return basicSetShuntImpedanceInfo(null, msgs);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				return getMaxPowerLoss();
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				if (resolve) return getShuntImpedanceInfo();
				return basicGetShuntImpedanceInfo();
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				setMaxPowerLoss((Float)newValue);
				return;
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				setShuntImpedanceInfo((ShuntImpedanceInfo)newValue);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				unsetMaxPowerLoss();
				return;
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				setShuntImpedanceInfo((ShuntImpedanceInfo)null);
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
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
				return isSetMaxPowerLoss();
			case InfAssetsPackage.SHUNT_COMPENSATOR_INFO__SHUNT_IMPEDANCE_INFO:
				return shuntImpedanceInfo != null;
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
		result.append(" (maxPowerLoss: ");
		if (maxPowerLossESet) result.append(maxPowerLoss); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ShuntCompensatorInfo
