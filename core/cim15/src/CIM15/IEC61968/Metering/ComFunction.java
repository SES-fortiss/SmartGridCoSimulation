/**
 */
package CIM15.IEC61968.Metering;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComFunction extends EndDeviceFunction {
	/**
	 * The default value of the '{@link #getAmrRouter() <em>Amr Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrRouter()
	 * @generated
	 * @ordered
	 */
	protected static final String AMR_ROUTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmrRouter() <em>Amr Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrRouter()
	 * @generated
	 * @ordered
	 */
	protected String amrRouter = AMR_ROUTER_EDEFAULT;

	/**
	 * This is true if the Amr Router attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amrRouterESet;

	/**
	 * The default value of the '{@link #getAmrAddress() <em>Amr Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String AMR_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmrAddress() <em>Amr Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmrAddress()
	 * @generated
	 * @ordered
	 */
	protected String amrAddress = AMR_ADDRESS_EDEFAULT;

	/**
	 * This is true if the Amr Address attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amrAddressESet;

	/**
	 * The default value of the '{@link #isTwoWay() <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoWay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TWO_WAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTwoWay() <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTwoWay()
	 * @generated
	 * @ordered
	 */
	protected boolean twoWay = TWO_WAY_EDEFAULT;

	/**
	 * This is true if the Two Way attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean twoWayESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.COM_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>Amr Router</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amr Router</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amr Router</em>' attribute.
	 * @see #isSetAmrRouter()
	 * @see #unsetAmrRouter()
	 * @see #setAmrRouter(String)
	 * @generated
	 */
	public String getAmrRouter() {
		return amrRouter;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amr Router</em>' attribute.
	 * @see #isSetAmrRouter()
	 * @see #unsetAmrRouter()
	 * @see #getAmrRouter()
	 * @generated
	 */
	public void setAmrRouter(String newAmrRouter) {
		amrRouter = newAmrRouter;
		amrRouterESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmrRouter()
	 * @see #getAmrRouter()
	 * @see #setAmrRouter(String)
	 * @generated
	 */
	public void unsetAmrRouter() {
		amrRouter = AMR_ROUTER_EDEFAULT;
		amrRouterESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ComFunction#getAmrRouter <em>Amr Router</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amr Router</em>' attribute is set.
	 * @see #unsetAmrRouter()
	 * @see #getAmrRouter()
	 * @see #setAmrRouter(String)
	 * @generated
	 */
	public boolean isSetAmrRouter() {
		return amrRouterESet;
	}

	/**
	 * Returns the value of the '<em><b>Amr Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amr Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amr Address</em>' attribute.
	 * @see #isSetAmrAddress()
	 * @see #unsetAmrAddress()
	 * @see #setAmrAddress(String)
	 * @generated
	 */
	public String getAmrAddress() {
		return amrAddress;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amr Address</em>' attribute.
	 * @see #isSetAmrAddress()
	 * @see #unsetAmrAddress()
	 * @see #getAmrAddress()
	 * @generated
	 */
	public void setAmrAddress(String newAmrAddress) {
		amrAddress = newAmrAddress;
		amrAddressESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmrAddress()
	 * @see #getAmrAddress()
	 * @see #setAmrAddress(String)
	 * @generated
	 */
	public void unsetAmrAddress() {
		amrAddress = AMR_ADDRESS_EDEFAULT;
		amrAddressESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ComFunction#getAmrAddress <em>Amr Address</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amr Address</em>' attribute is set.
	 * @see #unsetAmrAddress()
	 * @see #getAmrAddress()
	 * @see #setAmrAddress(String)
	 * @generated
	 */
	public boolean isSetAmrAddress() {
		return amrAddressESet;
	}

	/**
	 * Returns the value of the '<em><b>Two Way</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Two Way</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Two Way</em>' attribute.
	 * @see #isSetTwoWay()
	 * @see #unsetTwoWay()
	 * @see #setTwoWay(boolean)
	 * @generated
	 */
	public boolean isTwoWay() {
		return twoWay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Two Way</em>' attribute.
	 * @see #isSetTwoWay()
	 * @see #unsetTwoWay()
	 * @see #isTwoWay()
	 * @generated
	 */
	public void setTwoWay(boolean newTwoWay) {
		twoWay = newTwoWay;
		twoWayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTwoWay()
	 * @see #isTwoWay()
	 * @see #setTwoWay(boolean)
	 * @generated
	 */
	public void unsetTwoWay() {
		twoWay = TWO_WAY_EDEFAULT;
		twoWayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.ComFunction#isTwoWay <em>Two Way</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Two Way</em>' attribute is set.
	 * @see #unsetTwoWay()
	 * @see #isTwoWay()
	 * @see #setTwoWay(boolean)
	 * @generated
	 */
	public boolean isSetTwoWay() {
		return twoWayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				return getAmrRouter();
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				return getAmrAddress();
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				return isTwoWay();
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
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				setAmrRouter((String)newValue);
				return;
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				setAmrAddress((String)newValue);
				return;
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				setTwoWay((Boolean)newValue);
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
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				unsetAmrRouter();
				return;
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				unsetAmrAddress();
				return;
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				unsetTwoWay();
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
			case MeteringPackage.COM_FUNCTION__AMR_ROUTER:
				return isSetAmrRouter();
			case MeteringPackage.COM_FUNCTION__AMR_ADDRESS:
				return isSetAmrAddress();
			case MeteringPackage.COM_FUNCTION__TWO_WAY:
				return isSetTwoWay();
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
		result.append(" (amrRouter: ");
		if (amrRouterESet) result.append(amrRouter); else result.append("<unset>");
		result.append(", amrAddress: ");
		if (amrAddressESet) result.append(amrAddress); else result.append("<unset>");
		result.append(", twoWay: ");
		if (twoWayESet) result.append(twoWay); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ComFunction
