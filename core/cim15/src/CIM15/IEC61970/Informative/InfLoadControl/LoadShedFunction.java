/**
 */
package CIM15.IEC61970.Informative.InfLoadControl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Shed Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadShedFunction extends LoadMgmtFunction {
	/**
	 * The default value of the '{@link #getSwitchedLoad() <em>Switched Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchedLoad()
	 * @generated
	 * @ordered
	 */
	protected static final float SWITCHED_LOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSwitchedLoad() <em>Switched Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchedLoad()
	 * @generated
	 * @ordered
	 */
	protected float switchedLoad = SWITCHED_LOAD_EDEFAULT;

	/**
	 * This is true if the Switched Load attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean switchedLoadESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadShedFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_SHED_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>Switched Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switched Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switched Load</em>' attribute.
	 * @see #isSetSwitchedLoad()
	 * @see #unsetSwitchedLoad()
	 * @see #setSwitchedLoad(float)
	 * @generated
	 */
	public float getSwitchedLoad() {
		return switchedLoad;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switched Load</em>' attribute.
	 * @see #isSetSwitchedLoad()
	 * @see #unsetSwitchedLoad()
	 * @see #getSwitchedLoad()
	 * @generated
	 */
	public void setSwitchedLoad(float newSwitchedLoad) {
		switchedLoad = newSwitchedLoad;
		switchedLoadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchedLoad()
	 * @see #getSwitchedLoad()
	 * @see #setSwitchedLoad(float)
	 * @generated
	 */
	public void unsetSwitchedLoad() {
		switchedLoad = SWITCHED_LOAD_EDEFAULT;
		switchedLoadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadShedFunction#getSwitchedLoad <em>Switched Load</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switched Load</em>' attribute is set.
	 * @see #unsetSwitchedLoad()
	 * @see #getSwitchedLoad()
	 * @see #setSwitchedLoad(float)
	 * @generated
	 */
	public boolean isSetSwitchedLoad() {
		return switchedLoadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				return getSwitchedLoad();
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
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				setSwitchedLoad((Float)newValue);
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
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				unsetSwitchedLoad();
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
			case InfLoadControlPackage.LOAD_SHED_FUNCTION__SWITCHED_LOAD:
				return isSetSwitchedLoad();
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
		result.append(" (switchedLoad: ");
		if (switchedLoadESet) result.append(switchedLoad); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LoadShedFunction
