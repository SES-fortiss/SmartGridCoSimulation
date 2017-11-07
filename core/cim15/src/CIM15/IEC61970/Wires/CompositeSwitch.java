/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.Equipment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.CompositeSwitch#getSwitches <em>Switches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeSwitch extends Equipment {
	/**
	 * The default value of the '{@link #getCompositeSwitchType() <em>Composite Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSwitchType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPOSITE_SWITCH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompositeSwitchType() <em>Composite Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSwitchType()
	 * @generated
	 * @ordered
	 */
	protected String compositeSwitchType = COMPOSITE_SWITCH_TYPE_EDEFAULT;

	/**
	 * This is true if the Composite Switch Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compositeSwitchTypeESet;

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeSwitch() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.COMPOSITE_SWITCH;
	}

	/**
	 * Returns the value of the '<em><b>Composite Switch Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Switch Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Switch Type</em>' attribute.
	 * @see #isSetCompositeSwitchType()
	 * @see #unsetCompositeSwitchType()
	 * @see #setCompositeSwitchType(String)
	 * @generated
	 */
	public String getCompositeSwitchType() {
		return compositeSwitchType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Switch Type</em>' attribute.
	 * @see #isSetCompositeSwitchType()
	 * @see #unsetCompositeSwitchType()
	 * @see #getCompositeSwitchType()
	 * @generated
	 */
	public void setCompositeSwitchType(String newCompositeSwitchType) {
		compositeSwitchType = newCompositeSwitchType;
		compositeSwitchTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositeSwitchType()
	 * @see #getCompositeSwitchType()
	 * @see #setCompositeSwitchType(String)
	 * @generated
	 */
	public void unsetCompositeSwitchType() {
		compositeSwitchType = COMPOSITE_SWITCH_TYPE_EDEFAULT;
		compositeSwitchTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Composite Switch Type</em>' attribute is set.
	 * @see #unsetCompositeSwitchType()
	 * @see #getCompositeSwitchType()
	 * @see #setCompositeSwitchType(String)
	 * @generated
	 */
	public boolean isSetCompositeSwitchType() {
		return compositeSwitchTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see CIM15.IEC61970.Wires.Switch#getCompositeSwitch
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new BasicInternalEList<Switch>(Switch.class);
		}
		return switches;
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
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitches()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				return getCompositeSwitchType();
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return getSwitches();
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				setCompositeSwitchType((String)newValue);
				return;
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				unsetCompositeSwitchType();
				return;
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				getSwitches().clear();
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
			case WiresPackage.COMPOSITE_SWITCH__COMPOSITE_SWITCH_TYPE:
				return isSetCompositeSwitchType();
			case WiresPackage.COMPOSITE_SWITCH__SWITCHES:
				return switches != null && !switches.isEmpty();
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
		result.append(" (compositeSwitchType: ");
		if (compositeSwitchTypeESet) result.append(compositeSwitchType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CompositeSwitch
