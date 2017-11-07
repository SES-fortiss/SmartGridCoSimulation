/**
 */
package CIM15.IEC61970.Informative.InfLoadControl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Limit Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadLimitFunction extends LoadMgmtFunction {
	/**
	 * The default value of the '{@link #getDisconnectTimeDelay() <em>Disconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCONNECT_TIME_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDisconnectTimeDelay() <em>Disconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected float disconnectTimeDelay = DISCONNECT_TIME_DELAY_EDEFAULT;

	/**
	 * This is true if the Disconnect Time Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disconnectTimeDelayESet;

	/**
	 * The default value of the '{@link #isIsAutoReconOp() <em>Is Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTO_RECON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutoReconOp() <em>Is Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoReconOp = IS_AUTO_RECON_OP_EDEFAULT;

	/**
	 * This is true if the Is Auto Recon Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoReconOpESet;

	/**
	 * The default value of the '{@link #getReconnectTimeDelay() <em>Reconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float RECONNECT_TIME_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReconnectTimeDelay() <em>Reconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconnectTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected float reconnectTimeDelay = RECONNECT_TIME_DELAY_EDEFAULT;

	/**
	 * This is true if the Reconnect Time Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reconnectTimeDelayESet;

	/**
	 * The default value of the '{@link #getMaximumLoad() <em>Maximum Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumLoad() <em>Maximum Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLoad()
	 * @generated
	 * @ordered
	 */
	protected float maximumLoad = MAXIMUM_LOAD_EDEFAULT;

	/**
	 * This is true if the Maximum Load attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumLoadESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadLimitFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_LIMIT_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>Disconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disconnect Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnect Time Delay</em>' attribute.
	 * @see #isSetDisconnectTimeDelay()
	 * @see #unsetDisconnectTimeDelay()
	 * @see #setDisconnectTimeDelay(float)
	 * @generated
	 */
	public float getDisconnectTimeDelay() {
		return disconnectTimeDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnect Time Delay</em>' attribute.
	 * @see #isSetDisconnectTimeDelay()
	 * @see #unsetDisconnectTimeDelay()
	 * @see #getDisconnectTimeDelay()
	 * @generated
	 */
	public void setDisconnectTimeDelay(float newDisconnectTimeDelay) {
		disconnectTimeDelay = newDisconnectTimeDelay;
		disconnectTimeDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisconnectTimeDelay()
	 * @see #getDisconnectTimeDelay()
	 * @see #setDisconnectTimeDelay(float)
	 * @generated
	 */
	public void unsetDisconnectTimeDelay() {
		disconnectTimeDelay = DISCONNECT_TIME_DELAY_EDEFAULT;
		disconnectTimeDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getDisconnectTimeDelay <em>Disconnect Time Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disconnect Time Delay</em>' attribute is set.
	 * @see #unsetDisconnectTimeDelay()
	 * @see #getDisconnectTimeDelay()
	 * @see #setDisconnectTimeDelay(float)
	 * @generated
	 */
	public boolean isSetDisconnectTimeDelay() {
		return disconnectTimeDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auto Recon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto Recon Op</em>' attribute.
	 * @see #isSetIsAutoReconOp()
	 * @see #unsetIsAutoReconOp()
	 * @see #setIsAutoReconOp(boolean)
	 * @generated
	 */
	public boolean isIsAutoReconOp() {
		return isAutoReconOp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto Recon Op</em>' attribute.
	 * @see #isSetIsAutoReconOp()
	 * @see #unsetIsAutoReconOp()
	 * @see #isIsAutoReconOp()
	 * @generated
	 */
	public void setIsAutoReconOp(boolean newIsAutoReconOp) {
		isAutoReconOp = newIsAutoReconOp;
		isAutoReconOpESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAutoReconOp()
	 * @see #isIsAutoReconOp()
	 * @see #setIsAutoReconOp(boolean)
	 * @generated
	 */
	public void unsetIsAutoReconOp() {
		isAutoReconOp = IS_AUTO_RECON_OP_EDEFAULT;
		isAutoReconOpESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#isIsAutoReconOp <em>Is Auto Recon Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Auto Recon Op</em>' attribute is set.
	 * @see #unsetIsAutoReconOp()
	 * @see #isIsAutoReconOp()
	 * @see #setIsAutoReconOp(boolean)
	 * @generated
	 */
	public boolean isSetIsAutoReconOp() {
		return isAutoReconOpESet;
	}

	/**
	 * Returns the value of the '<em><b>Reconnect Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconnect Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconnect Time Delay</em>' attribute.
	 * @see #isSetReconnectTimeDelay()
	 * @see #unsetReconnectTimeDelay()
	 * @see #setReconnectTimeDelay(float)
	 * @generated
	 */
	public float getReconnectTimeDelay() {
		return reconnectTimeDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconnect Time Delay</em>' attribute.
	 * @see #isSetReconnectTimeDelay()
	 * @see #unsetReconnectTimeDelay()
	 * @see #getReconnectTimeDelay()
	 * @generated
	 */
	public void setReconnectTimeDelay(float newReconnectTimeDelay) {
		reconnectTimeDelay = newReconnectTimeDelay;
		reconnectTimeDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReconnectTimeDelay()
	 * @see #getReconnectTimeDelay()
	 * @see #setReconnectTimeDelay(float)
	 * @generated
	 */
	public void unsetReconnectTimeDelay() {
		reconnectTimeDelay = RECONNECT_TIME_DELAY_EDEFAULT;
		reconnectTimeDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getReconnectTimeDelay <em>Reconnect Time Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reconnect Time Delay</em>' attribute is set.
	 * @see #unsetReconnectTimeDelay()
	 * @see #getReconnectTimeDelay()
	 * @see #setReconnectTimeDelay(float)
	 * @generated
	 */
	public boolean isSetReconnectTimeDelay() {
		return reconnectTimeDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Load</em>' attribute.
	 * @see #isSetMaximumLoad()
	 * @see #unsetMaximumLoad()
	 * @see #setMaximumLoad(float)
	 * @generated
	 */
	public float getMaximumLoad() {
		return maximumLoad;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Load</em>' attribute.
	 * @see #isSetMaximumLoad()
	 * @see #unsetMaximumLoad()
	 * @see #getMaximumLoad()
	 * @generated
	 */
	public void setMaximumLoad(float newMaximumLoad) {
		maximumLoad = newMaximumLoad;
		maximumLoadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumLoad()
	 * @see #getMaximumLoad()
	 * @see #setMaximumLoad(float)
	 * @generated
	 */
	public void unsetMaximumLoad() {
		maximumLoad = MAXIMUM_LOAD_EDEFAULT;
		maximumLoadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadLimitFunction#getMaximumLoad <em>Maximum Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Load</em>' attribute is set.
	 * @see #unsetMaximumLoad()
	 * @see #getMaximumLoad()
	 * @see #setMaximumLoad(float)
	 * @generated
	 */
	public boolean isSetMaximumLoad() {
		return maximumLoadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				return getDisconnectTimeDelay();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				return isIsAutoReconOp();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				return getReconnectTimeDelay();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				return getMaximumLoad();
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
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				setDisconnectTimeDelay((Float)newValue);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				setIsAutoReconOp((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				setReconnectTimeDelay((Float)newValue);
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				setMaximumLoad((Float)newValue);
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
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				unsetDisconnectTimeDelay();
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				unsetIsAutoReconOp();
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				unsetReconnectTimeDelay();
				return;
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				unsetMaximumLoad();
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
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__DISCONNECT_TIME_DELAY:
				return isSetDisconnectTimeDelay();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__IS_AUTO_RECON_OP:
				return isSetIsAutoReconOp();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__RECONNECT_TIME_DELAY:
				return isSetReconnectTimeDelay();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION__MAXIMUM_LOAD:
				return isSetMaximumLoad();
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
		result.append(" (disconnectTimeDelay: ");
		if (disconnectTimeDelayESet) result.append(disconnectTimeDelay); else result.append("<unset>");
		result.append(", isAutoReconOp: ");
		if (isAutoReconOpESet) result.append(isAutoReconOp); else result.append("<unset>");
		result.append(", reconnectTimeDelay: ");
		if (reconnectTimeDelayESet) result.append(reconnectTimeDelay); else result.append("<unset>");
		result.append(", maximumLoad: ");
		if (maximumLoadESet) result.append(maximumLoad); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LoadLimitFunction
