/**
 */
package CIM15.IEC61970.OperationalLimits;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchGroup extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getBranchGroupTerminal() <em>Branch Group Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchGroupTerminal()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchGroupTerminal> branchGroupTerminal;

	/**
	 * The default value of the '{@link #getMinimumReactivePower() <em>Minimum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_REACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumReactivePower() <em>Minimum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected float minimumReactivePower = MINIMUM_REACTIVE_POWER_EDEFAULT;

	/**
	 * This is true if the Minimum Reactive Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumReactivePowerESet;

	/**
	 * The default value of the '{@link #getMaximumReactivePower() <em>Maximum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_REACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumReactivePower() <em>Maximum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumReactivePower()
	 * @generated
	 * @ordered
	 */
	protected float maximumReactivePower = MAXIMUM_REACTIVE_POWER_EDEFAULT;

	/**
	 * This is true if the Maximum Reactive Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumReactivePowerESet;

	/**
	 * The default value of the '{@link #getMaximumActivePower() <em>Maximum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_ACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaximumActivePower() <em>Maximum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumActivePower()
	 * @generated
	 * @ordered
	 */
	protected float maximumActivePower = MAXIMUM_ACTIVE_POWER_EDEFAULT;

	/**
	 * This is true if the Maximum Active Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumActivePowerESet;

	/**
	 * The default value of the '{@link #getMinimumActivePower() <em>Minimum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_ACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumActivePower() <em>Minimum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumActivePower()
	 * @generated
	 * @ordered
	 */
	protected float minimumActivePower = MINIMUM_ACTIVE_POWER_EDEFAULT;

	/**
	 * This is true if the Minimum Active Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumActivePowerESet;

	/**
	 * The default value of the '{@link #isMonitorActivePower() <em>Monitor Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITOR_ACTIVE_POWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorActivePower() <em>Monitor Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorActivePower()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorActivePower = MONITOR_ACTIVE_POWER_EDEFAULT;

	/**
	 * This is true if the Monitor Active Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitorActivePowerESet;

	/**
	 * The default value of the '{@link #isMonitorReactivePower() <em>Monitor Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorReactivePower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITOR_REACTIVE_POWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorReactivePower() <em>Monitor Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorReactivePower()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorReactivePower = MONITOR_REACTIVE_POWER_EDEFAULT;

	/**
	 * This is true if the Monitor Reactive Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitorReactivePowerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.BRANCH_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Group Terminal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Group Terminal</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup
	 * @generated
	 */
	public EList<BranchGroupTerminal> getBranchGroupTerminal() {
		if (branchGroupTerminal == null) {
			branchGroupTerminal = new BasicInternalEList<BranchGroupTerminal>(BranchGroupTerminal.class);
		}
		return branchGroupTerminal;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Reactive Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Reactive Power</em>' attribute.
	 * @see #isSetMinimumReactivePower()
	 * @see #unsetMinimumReactivePower()
	 * @see #setMinimumReactivePower(float)
	 * @generated
	 */
	public float getMinimumReactivePower() {
		return minimumReactivePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Reactive Power</em>' attribute.
	 * @see #isSetMinimumReactivePower()
	 * @see #unsetMinimumReactivePower()
	 * @see #getMinimumReactivePower()
	 * @generated
	 */
	public void setMinimumReactivePower(float newMinimumReactivePower) {
		minimumReactivePower = newMinimumReactivePower;
		minimumReactivePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumReactivePower()
	 * @see #getMinimumReactivePower()
	 * @see #setMinimumReactivePower(float)
	 * @generated
	 */
	public void unsetMinimumReactivePower() {
		minimumReactivePower = MINIMUM_REACTIVE_POWER_EDEFAULT;
		minimumReactivePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Reactive Power</em>' attribute is set.
	 * @see #unsetMinimumReactivePower()
	 * @see #getMinimumReactivePower()
	 * @see #setMinimumReactivePower(float)
	 * @generated
	 */
	public boolean isSetMinimumReactivePower() {
		return minimumReactivePowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Reactive Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Reactive Power</em>' attribute.
	 * @see #isSetMaximumReactivePower()
	 * @see #unsetMaximumReactivePower()
	 * @see #setMaximumReactivePower(float)
	 * @generated
	 */
	public float getMaximumReactivePower() {
		return maximumReactivePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Reactive Power</em>' attribute.
	 * @see #isSetMaximumReactivePower()
	 * @see #unsetMaximumReactivePower()
	 * @see #getMaximumReactivePower()
	 * @generated
	 */
	public void setMaximumReactivePower(float newMaximumReactivePower) {
		maximumReactivePower = newMaximumReactivePower;
		maximumReactivePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumReactivePower()
	 * @see #getMaximumReactivePower()
	 * @see #setMaximumReactivePower(float)
	 * @generated
	 */
	public void unsetMaximumReactivePower() {
		maximumReactivePower = MAXIMUM_REACTIVE_POWER_EDEFAULT;
		maximumReactivePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Reactive Power</em>' attribute is set.
	 * @see #unsetMaximumReactivePower()
	 * @see #getMaximumReactivePower()
	 * @see #setMaximumReactivePower(float)
	 * @generated
	 */
	public boolean isSetMaximumReactivePower() {
		return maximumReactivePowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Active Power</em>' attribute.
	 * @see #isSetMaximumActivePower()
	 * @see #unsetMaximumActivePower()
	 * @see #setMaximumActivePower(float)
	 * @generated
	 */
	public float getMaximumActivePower() {
		return maximumActivePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Active Power</em>' attribute.
	 * @see #isSetMaximumActivePower()
	 * @see #unsetMaximumActivePower()
	 * @see #getMaximumActivePower()
	 * @generated
	 */
	public void setMaximumActivePower(float newMaximumActivePower) {
		maximumActivePower = newMaximumActivePower;
		maximumActivePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumActivePower()
	 * @see #getMaximumActivePower()
	 * @see #setMaximumActivePower(float)
	 * @generated
	 */
	public void unsetMaximumActivePower() {
		maximumActivePower = MAXIMUM_ACTIVE_POWER_EDEFAULT;
		maximumActivePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Active Power</em>' attribute is set.
	 * @see #unsetMaximumActivePower()
	 * @see #getMaximumActivePower()
	 * @see #setMaximumActivePower(float)
	 * @generated
	 */
	public boolean isSetMaximumActivePower() {
		return maximumActivePowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Minimum Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Active Power</em>' attribute.
	 * @see #isSetMinimumActivePower()
	 * @see #unsetMinimumActivePower()
	 * @see #setMinimumActivePower(float)
	 * @generated
	 */
	public float getMinimumActivePower() {
		return minimumActivePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Active Power</em>' attribute.
	 * @see #isSetMinimumActivePower()
	 * @see #unsetMinimumActivePower()
	 * @see #getMinimumActivePower()
	 * @generated
	 */
	public void setMinimumActivePower(float newMinimumActivePower) {
		minimumActivePower = newMinimumActivePower;
		minimumActivePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumActivePower()
	 * @see #getMinimumActivePower()
	 * @see #setMinimumActivePower(float)
	 * @generated
	 */
	public void unsetMinimumActivePower() {
		minimumActivePower = MINIMUM_ACTIVE_POWER_EDEFAULT;
		minimumActivePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Active Power</em>' attribute is set.
	 * @see #unsetMinimumActivePower()
	 * @see #getMinimumActivePower()
	 * @see #setMinimumActivePower(float)
	 * @generated
	 */
	public boolean isSetMinimumActivePower() {
		return minimumActivePowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Monitor Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Active Power</em>' attribute.
	 * @see #isSetMonitorActivePower()
	 * @see #unsetMonitorActivePower()
	 * @see #setMonitorActivePower(boolean)
	 * @generated
	 */
	public boolean isMonitorActivePower() {
		return monitorActivePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Active Power</em>' attribute.
	 * @see #isSetMonitorActivePower()
	 * @see #unsetMonitorActivePower()
	 * @see #isMonitorActivePower()
	 * @generated
	 */
	public void setMonitorActivePower(boolean newMonitorActivePower) {
		monitorActivePower = newMonitorActivePower;
		monitorActivePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitorActivePower()
	 * @see #isMonitorActivePower()
	 * @see #setMonitorActivePower(boolean)
	 * @generated
	 */
	public void unsetMonitorActivePower() {
		monitorActivePower = MONITOR_ACTIVE_POWER_EDEFAULT;
		monitorActivePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorActivePower <em>Monitor Active Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitor Active Power</em>' attribute is set.
	 * @see #unsetMonitorActivePower()
	 * @see #isMonitorActivePower()
	 * @see #setMonitorActivePower(boolean)
	 * @generated
	 */
	public boolean isSetMonitorActivePower() {
		return monitorActivePowerESet;
	}

	/**
	 * Returns the value of the '<em><b>Monitor Reactive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Reactive Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Reactive Power</em>' attribute.
	 * @see #isSetMonitorReactivePower()
	 * @see #unsetMonitorReactivePower()
	 * @see #setMonitorReactivePower(boolean)
	 * @generated
	 */
	public boolean isMonitorReactivePower() {
		return monitorReactivePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Reactive Power</em>' attribute.
	 * @see #isSetMonitorReactivePower()
	 * @see #unsetMonitorReactivePower()
	 * @see #isMonitorReactivePower()
	 * @generated
	 */
	public void setMonitorReactivePower(boolean newMonitorReactivePower) {
		monitorReactivePower = newMonitorReactivePower;
		monitorReactivePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitorReactivePower()
	 * @see #isMonitorReactivePower()
	 * @see #setMonitorReactivePower(boolean)
	 * @generated
	 */
	public void unsetMonitorReactivePower() {
		monitorReactivePower = MONITOR_REACTIVE_POWER_EDEFAULT;
		monitorReactivePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#isMonitorReactivePower <em>Monitor Reactive Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitor Reactive Power</em>' attribute is set.
	 * @see #unsetMonitorReactivePower()
	 * @see #isMonitorReactivePower()
	 * @see #setMonitorReactivePower(boolean)
	 * @generated
	 */
	public boolean isSetMonitorReactivePower() {
		return monitorReactivePowerESet;
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranchGroupTerminal()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<?>)getBranchGroupTerminal()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return getBranchGroupTerminal();
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				return getMinimumReactivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				return getMaximumReactivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				return getMaximumActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				return getMinimumActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				return isMonitorActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				return isMonitorReactivePower();
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				getBranchGroupTerminal().addAll((Collection<? extends BranchGroupTerminal>)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				setMinimumReactivePower((Float)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				setMaximumReactivePower((Float)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				setMaximumActivePower((Float)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				setMinimumActivePower((Float)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				setMonitorActivePower((Boolean)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				setMonitorReactivePower((Boolean)newValue);
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				unsetMinimumReactivePower();
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				unsetMaximumReactivePower();
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				unsetMaximumActivePower();
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				unsetMinimumActivePower();
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				unsetMonitorActivePower();
				return;
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				unsetMonitorReactivePower();
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
			case OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL:
				return branchGroupTerminal != null && !branchGroupTerminal.isEmpty();
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_REACTIVE_POWER:
				return isSetMinimumReactivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_REACTIVE_POWER:
				return isSetMaximumReactivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MAXIMUM_ACTIVE_POWER:
				return isSetMaximumActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MINIMUM_ACTIVE_POWER:
				return isSetMinimumActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_ACTIVE_POWER:
				return isSetMonitorActivePower();
			case OperationalLimitsPackage.BRANCH_GROUP__MONITOR_REACTIVE_POWER:
				return isSetMonitorReactivePower();
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
		result.append(" (minimumReactivePower: ");
		if (minimumReactivePowerESet) result.append(minimumReactivePower); else result.append("<unset>");
		result.append(", maximumReactivePower: ");
		if (maximumReactivePowerESet) result.append(maximumReactivePower); else result.append("<unset>");
		result.append(", maximumActivePower: ");
		if (maximumActivePowerESet) result.append(maximumActivePower); else result.append("<unset>");
		result.append(", minimumActivePower: ");
		if (minimumActivePowerESet) result.append(minimumActivePower); else result.append("<unset>");
		result.append(", monitorActivePower: ");
		if (monitorActivePowerESet) result.append(monitorActivePower); else result.append("<unset>");
		result.append(", monitorReactivePower: ");
		if (monitorReactivePowerESet) result.append(monitorReactivePower); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // BranchGroup
