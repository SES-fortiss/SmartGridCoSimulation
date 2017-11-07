/**
 */
package CIM15.IEC61970.Outage;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Wires.Switch;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switching Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Outage.SwitchingOperation#getOperationTime <em>Operation Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.SwitchingOperation#getOutageSchedule <em>Outage Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.SwitchingOperation#getNewState <em>New State</em>}</li>
 *   <li>{@link CIM15.IEC61970.Outage.SwitchingOperation#getSwitches <em>Switches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchingOperation extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getOperationTime() <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPERATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationTime() <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTime()
	 * @generated
	 * @ordered
	 */
	protected Date operationTime = OPERATION_TIME_EDEFAULT;

	/**
	 * This is true if the Operation Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationTimeESet;

	/**
	 * The cached value of the '{@link #getOutageSchedule() <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSchedule()
	 * @generated
	 * @ordered
	 */
	protected OutageSchedule outageSchedule;

	/**
	 * The default value of the '{@link #getNewState() <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewState()
	 * @generated
	 * @ordered
	 */
	protected static final SwitchState NEW_STATE_EDEFAULT = SwitchState.OPEN;

	/**
	 * The cached value of the '{@link #getNewState() <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewState()
	 * @generated
	 * @ordered
	 */
	protected SwitchState newState = NEW_STATE_EDEFAULT;

	/**
	 * This is true if the New State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean newStateESet;

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
	protected SwitchingOperation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.SWITCHING_OPERATION;
	}

	/**
	 * Returns the value of the '<em><b>Operation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Time</em>' attribute.
	 * @see #isSetOperationTime()
	 * @see #unsetOperationTime()
	 * @see #setOperationTime(Date)
	 * @generated
	 */
	public Date getOperationTime() {
		return operationTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.SwitchingOperation#getOperationTime <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Time</em>' attribute.
	 * @see #isSetOperationTime()
	 * @see #unsetOperationTime()
	 * @see #getOperationTime()
	 * @generated
	 */
	public void setOperationTime(Date newOperationTime) {
		operationTime = newOperationTime;
		operationTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.SwitchingOperation#getOperationTime <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationTime()
	 * @see #getOperationTime()
	 * @see #setOperationTime(Date)
	 * @generated
	 */
	public void unsetOperationTime() {
		operationTime = OPERATION_TIME_EDEFAULT;
		operationTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.SwitchingOperation#getOperationTime <em>Operation Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation Time</em>' attribute is set.
	 * @see #unsetOperationTime()
	 * @see #getOperationTime()
	 * @see #setOperationTime(Date)
	 * @generated
	 */
	public boolean isSetOperationTime() {
		return operationTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Outage Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.OutageSchedule#getSwitchingOperations <em>Switching Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outage Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outage Schedule</em>' reference.
	 * @see #setOutageSchedule(OutageSchedule)
	 * @see CIM15.IEC61970.Outage.OutageSchedule#getSwitchingOperations
	 * @generated
	 */
	public OutageSchedule getOutageSchedule() {
		if (outageSchedule != null && outageSchedule.eIsProxy()) {
			InternalEObject oldOutageSchedule = (InternalEObject)outageSchedule;
			outageSchedule = (OutageSchedule)eResolveProxy(oldOutageSchedule);
			if (outageSchedule != oldOutageSchedule) {
			}
		}
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageSchedule basicGetOutageSchedule() {
		return outageSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageSchedule(OutageSchedule newOutageSchedule, NotificationChain msgs) {
		OutageSchedule oldOutageSchedule = outageSchedule;
		outageSchedule = newOutageSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.SwitchingOperation#getOutageSchedule <em>Outage Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outage Schedule</em>' reference.
	 * @see #getOutageSchedule()
	 * @generated
	 */
	public void setOutageSchedule(OutageSchedule newOutageSchedule) {
		if (newOutageSchedule != outageSchedule) {
			NotificationChain msgs = null;
			if (outageSchedule != null)
				msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS, OutageSchedule.class, msgs);
			if (newOutageSchedule != null)
				msgs = ((InternalEObject)newOutageSchedule).eInverseAdd(this, OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS, OutageSchedule.class, msgs);
			msgs = basicSetOutageSchedule(newOutageSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>New State</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Outage.SwitchState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New State</em>' attribute.
	 * @see CIM15.IEC61970.Outage.SwitchState
	 * @see #isSetNewState()
	 * @see #unsetNewState()
	 * @see #setNewState(SwitchState)
	 * @generated
	 */
	public SwitchState getNewState() {
		return newState;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Outage.SwitchingOperation#getNewState <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New State</em>' attribute.
	 * @see CIM15.IEC61970.Outage.SwitchState
	 * @see #isSetNewState()
	 * @see #unsetNewState()
	 * @see #getNewState()
	 * @generated
	 */
	public void setNewState(SwitchState newNewState) {
		newState = newNewState == null ? NEW_STATE_EDEFAULT : newNewState;
		newStateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Outage.SwitchingOperation#getNewState <em>New State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNewState()
	 * @see #getNewState()
	 * @see #setNewState(SwitchState)
	 * @generated
	 */
	public void unsetNewState() {
		newState = NEW_STATE_EDEFAULT;
		newStateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Outage.SwitchingOperation#getNewState <em>New State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>New State</em>' attribute is set.
	 * @see #unsetNewState()
	 * @see #getNewState()
	 * @see #setNewState(SwitchState)
	 * @generated
	 */
	public boolean isSetNewState() {
		return newStateESet;
	}

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.Switch#getSwitchingOperations <em>Switching Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see CIM15.IEC61970.Wires.Switch#getSwitchingOperations
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
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				if (outageSchedule != null)
					msgs = ((InternalEObject)outageSchedule).eInverseRemove(this, OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS, OutageSchedule.class, msgs);
				return basicSetOutageSchedule((OutageSchedule)otherEnd, msgs);
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
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
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				return basicSetOutageSchedule(null, msgs);
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
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
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				return getOperationTime();
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				if (resolve) return getOutageSchedule();
				return basicGetOutageSchedule();
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				return getNewState();
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
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
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				setOperationTime((Date)newValue);
				return;
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)newValue);
				return;
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				setNewState((SwitchState)newValue);
				return;
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
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
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				unsetOperationTime();
				return;
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				setOutageSchedule((OutageSchedule)null);
				return;
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				unsetNewState();
				return;
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
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
			case OutagePackage.SWITCHING_OPERATION__OPERATION_TIME:
				return isSetOperationTime();
			case OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE:
				return outageSchedule != null;
			case OutagePackage.SWITCHING_OPERATION__NEW_STATE:
				return isSetNewState();
			case OutagePackage.SWITCHING_OPERATION__SWITCHES:
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
		result.append(" (operationTime: ");
		if (operationTimeESet) result.append(operationTime); else result.append("<unset>");
		result.append(", newState: ");
		if (newStateESet) result.append(newState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SwitchingOperation
