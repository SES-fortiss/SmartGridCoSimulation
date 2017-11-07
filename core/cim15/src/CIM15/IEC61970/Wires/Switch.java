/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.LoadControl.ConnectDisconnectFunction;

import CIM15.IEC61970.Core.ConductingEquipment;

import CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction;

import CIM15.IEC61970.Outage.SwitchingOperation;

import CIM15.IEC61970.WiresPhaseModel.SwitchPhase;

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
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getSwitchingOperations <em>Switching Operations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getLoadMgmtFunctions <em>Load Mgmt Functions</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#isRetained <em>Retained</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getSwitchSchedules <em>Switch Schedules</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getSwitchPhases <em>Switch Phases</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Switch extends ConductingEquipment {
	/**
	 * The default value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SWITCH_ON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected Date switchOnDate = SWITCH_ON_DATE_EDEFAULT;

	/**
	 * This is true if the Switch On Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean switchOnDateESet;

	/**
	 * The default value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NORMAL_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNormalOpen() <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNormalOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpen = NORMAL_OPEN_EDEFAULT;

	/**
	 * This is true if the Normal Open attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalOpenESet;

	/**
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * This is true if the Rated Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedCurrentESet;

	/**
	 * The cached value of the '{@link #getSwitchingOperations() <em>Switching Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingOperation> switchingOperations;

	/**
	 * The cached value of the '{@link #getLoadMgmtFunctions() <em>Load Mgmt Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmtFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadMgmtFunction> loadMgmtFunctions;

	/**
	 * The default value of the '{@link #isRetained() <em>Retained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetained()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETAINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetained() <em>Retained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetained()
	 * @generated
	 * @ordered
	 */
	protected boolean retained = RETAINED_EDEFAULT;

	/**
	 * This is true if the Retained attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retainedESet;

	/**
	 * The cached value of the '{@link #getConnectDisconnectFunctions() <em>Connect Disconnect Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectDisconnectFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectDisconnectFunction> connectDisconnectFunctions;

	/**
	 * The default value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SWITCH_ON_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected int switchOnCount = SWITCH_ON_COUNT_EDEFAULT;

	/**
	 * This is true if the Switch On Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean switchOnCountESet;

	/**
	 * The cached value of the '{@link #getSwitchSchedules() <em>Switch Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchSchedule> switchSchedules;

	/**
	 * The cached value of the '{@link #getSwitchPhases() <em>Switch Phases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchPhase> switchPhases;

	/**
	 * The cached value of the '{@link #getCompositeSwitch() <em>Composite Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSwitch()
	 * @generated
	 * @ordered
	 */
	protected CompositeSwitch compositeSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Switch() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.SWITCH;
	}

	/**
	 * Returns the value of the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch On Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch On Date</em>' attribute.
	 * @see #isSetSwitchOnDate()
	 * @see #unsetSwitchOnDate()
	 * @see #setSwitchOnDate(Date)
	 * @generated
	 */
	public Date getSwitchOnDate() {
		return switchOnDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Date</em>' attribute.
	 * @see #isSetSwitchOnDate()
	 * @see #unsetSwitchOnDate()
	 * @see #getSwitchOnDate()
	 * @generated
	 */
	public void setSwitchOnDate(Date newSwitchOnDate) {
		switchOnDate = newSwitchOnDate;
		switchOnDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchOnDate()
	 * @see #getSwitchOnDate()
	 * @see #setSwitchOnDate(Date)
	 * @generated
	 */
	public void unsetSwitchOnDate() {
		switchOnDate = SWITCH_ON_DATE_EDEFAULT;
		switchOnDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnDate <em>Switch On Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switch On Date</em>' attribute is set.
	 * @see #unsetSwitchOnDate()
	 * @see #getSwitchOnDate()
	 * @see #setSwitchOnDate(Date)
	 * @generated
	 */
	public boolean isSetSwitchOnDate() {
		return switchOnDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Open</em>' attribute.
	 * @see #isSetNormalOpen()
	 * @see #unsetNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public boolean isNormalOpen() {
		return normalOpen;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Open</em>' attribute.
	 * @see #isSetNormalOpen()
	 * @see #unsetNormalOpen()
	 * @see #isNormalOpen()
	 * @generated
	 */
	public void setNormalOpen(boolean newNormalOpen) {
		normalOpen = newNormalOpen;
		normalOpenESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalOpen()
	 * @see #isNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public void unsetNormalOpen() {
		normalOpen = NORMAL_OPEN_EDEFAULT;
		normalOpenESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.Switch#isNormalOpen <em>Normal Open</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Open</em>' attribute is set.
	 * @see #unsetNormalOpen()
	 * @see #isNormalOpen()
	 * @see #setNormalOpen(boolean)
	 * @generated
	 */
	public boolean isSetNormalOpen() {
		return normalOpenESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.Switch#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Current</em>' attribute.
	 * @see #isSetRatedCurrent()
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		ratedCurrent = newRatedCurrent;
		ratedCurrentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.Switch#getRatedCurrent <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public void unsetRatedCurrent() {
		ratedCurrent = RATED_CURRENT_EDEFAULT;
		ratedCurrentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.Switch#getRatedCurrent <em>Rated Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Current</em>' attribute is set.
	 * @see #unsetRatedCurrent()
	 * @see #getRatedCurrent()
	 * @see #setRatedCurrent(float)
	 * @generated
	 */
	public boolean isSetRatedCurrent() {
		return ratedCurrentESet;
	}

	/**
	 * Returns the value of the '<em><b>Switching Operations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Outage.SwitchingOperation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Outage.SwitchingOperation#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switching Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switching Operations</em>' reference list.
	 * @see CIM15.IEC61970.Outage.SwitchingOperation#getSwitches
	 * @generated
	 */
	public EList<SwitchingOperation> getSwitchingOperations() {
		if (switchingOperations == null) {
			switchingOperations = new BasicInternalEList<SwitchingOperation>(SwitchingOperation.class);
		}
		return switchingOperations;
	}

	/**
	 * Returns the value of the '<em><b>Load Mgmt Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt Functions</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches
	 * @generated
	 */
	public EList<LoadMgmtFunction> getLoadMgmtFunctions() {
		if (loadMgmtFunctions == null) {
			loadMgmtFunctions = new BasicInternalEList<LoadMgmtFunction>(LoadMgmtFunction.class);
		}
		return loadMgmtFunctions;
	}

	/**
	 * Returns the value of the '<em><b>Retained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retained</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retained</em>' attribute.
	 * @see #isSetRetained()
	 * @see #unsetRetained()
	 * @see #setRetained(boolean)
	 * @generated
	 */
	public boolean isRetained() {
		return retained;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.Switch#isRetained <em>Retained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retained</em>' attribute.
	 * @see #isSetRetained()
	 * @see #unsetRetained()
	 * @see #isRetained()
	 * @generated
	 */
	public void setRetained(boolean newRetained) {
		retained = newRetained;
		retainedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.Switch#isRetained <em>Retained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetained()
	 * @see #isRetained()
	 * @see #setRetained(boolean)
	 * @generated
	 */
	public void unsetRetained() {
		retained = RETAINED_EDEFAULT;
		retainedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.Switch#isRetained <em>Retained</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retained</em>' attribute is set.
	 * @see #unsetRetained()
	 * @see #isRetained()
	 * @see #setRetained(boolean)
	 * @generated
	 */
	public boolean isSetRetained() {
		return retainedESet;
	}

	/**
	 * Returns the value of the '<em><b>Connect Disconnect Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Disconnect Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Disconnect Functions</em>' reference list.
	 * @see CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches
	 * @generated
	 */
	public EList<ConnectDisconnectFunction> getConnectDisconnectFunctions() {
		if (connectDisconnectFunctions == null) {
			connectDisconnectFunctions = new BasicInternalEList<ConnectDisconnectFunction>(ConnectDisconnectFunction.class);
		}
		return connectDisconnectFunctions;
	}

	/**
	 * Returns the value of the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch On Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch On Count</em>' attribute.
	 * @see #isSetSwitchOnCount()
	 * @see #unsetSwitchOnCount()
	 * @see #setSwitchOnCount(int)
	 * @generated
	 */
	public int getSwitchOnCount() {
		return switchOnCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Count</em>' attribute.
	 * @see #isSetSwitchOnCount()
	 * @see #unsetSwitchOnCount()
	 * @see #getSwitchOnCount()
	 * @generated
	 */
	public void setSwitchOnCount(int newSwitchOnCount) {
		switchOnCount = newSwitchOnCount;
		switchOnCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchOnCount()
	 * @see #getSwitchOnCount()
	 * @see #setSwitchOnCount(int)
	 * @generated
	 */
	public void unsetSwitchOnCount() {
		switchOnCount = SWITCH_ON_COUNT_EDEFAULT;
		switchOnCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.Switch#getSwitchOnCount <em>Switch On Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switch On Count</em>' attribute is set.
	 * @see #unsetSwitchOnCount()
	 * @see #getSwitchOnCount()
	 * @see #setSwitchOnCount(int)
	 * @generated
	 */
	public boolean isSetSwitchOnCount() {
		return switchOnCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Switch Schedules</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.SwitchSchedule}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.SwitchSchedule#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Schedules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Schedules</em>' reference list.
	 * @see CIM15.IEC61970.Wires.SwitchSchedule#getSwitch
	 * @generated
	 */
	public EList<SwitchSchedule> getSwitchSchedules() {
		if (switchSchedules == null) {
			switchSchedules = new BasicInternalEList<SwitchSchedule>(SwitchSchedule.class);
		}
		return switchSchedules;
	}

	/**
	 * Returns the value of the '<em><b>Switch Phases</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch Phases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Phases</em>' reference list.
	 * @see CIM15.IEC61970.WiresPhaseModel.SwitchPhase#getSwitch
	 * @generated
	 */
	public EList<SwitchPhase> getSwitchPhases() {
		if (switchPhases == null) {
			switchPhases = new BasicInternalEList<SwitchPhase>(SwitchPhase.class);
		}
		return switchPhases;
	}

	/**
	 * Returns the value of the '<em><b>Composite Switch</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.CompositeSwitch#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Switch</em>' reference.
	 * @see #setCompositeSwitch(CompositeSwitch)
	 * @see CIM15.IEC61970.Wires.CompositeSwitch#getSwitches
	 * @generated
	 */
	public CompositeSwitch getCompositeSwitch() {
		if (compositeSwitch != null && compositeSwitch.eIsProxy()) {
			InternalEObject oldCompositeSwitch = (InternalEObject)compositeSwitch;
			compositeSwitch = (CompositeSwitch)eResolveProxy(oldCompositeSwitch);
			if (compositeSwitch != oldCompositeSwitch) {
			}
		}
		return compositeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSwitch basicGetCompositeSwitch() {
		return compositeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSwitch(CompositeSwitch newCompositeSwitch, NotificationChain msgs) {
		CompositeSwitch oldCompositeSwitch = compositeSwitch;
		compositeSwitch = newCompositeSwitch;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.Switch#getCompositeSwitch <em>Composite Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Switch</em>' reference.
	 * @see #getCompositeSwitch()
	 * @generated
	 */
	public void setCompositeSwitch(CompositeSwitch newCompositeSwitch) {
		if (newCompositeSwitch != compositeSwitch) {
			NotificationChain msgs = null;
			if (compositeSwitch != null)
				msgs = ((InternalEObject)compositeSwitch).eInverseRemove(this, WiresPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs);
			if (newCompositeSwitch != null)
				msgs = ((InternalEObject)newCompositeSwitch).eInverseAdd(this, WiresPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs);
			msgs = basicSetCompositeSwitch(newCompositeSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingOperations()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadMgmtFunctions()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectDisconnectFunctions()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchSchedules()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCH_PHASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchPhases()).basicAdd(otherEnd, msgs);
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				if (compositeSwitch != null)
					msgs = ((InternalEObject)compositeSwitch).eInverseRemove(this, WiresPackage.COMPOSITE_SWITCH__SWITCHES, CompositeSwitch.class, msgs);
				return basicSetCompositeSwitch((CompositeSwitch)otherEnd, msgs);
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
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return ((InternalEList<?>)getSwitchingOperations()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return ((InternalEList<?>)getLoadMgmtFunctions()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return ((InternalEList<?>)getConnectDisconnectFunctions()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return ((InternalEList<?>)getSwitchSchedules()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__SWITCH_PHASES:
				return ((InternalEList<?>)getSwitchPhases()).basicRemove(otherEnd, msgs);
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				return basicSetCompositeSwitch(null, msgs);
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
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				return getSwitchOnDate();
			case WiresPackage.SWITCH__NORMAL_OPEN:
				return isNormalOpen();
			case WiresPackage.SWITCH__RATED_CURRENT:
				return getRatedCurrent();
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return getSwitchingOperations();
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return getLoadMgmtFunctions();
			case WiresPackage.SWITCH__RETAINED:
				return isRetained();
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return getConnectDisconnectFunctions();
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				return getSwitchOnCount();
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return getSwitchSchedules();
			case WiresPackage.SWITCH__SWITCH_PHASES:
				return getSwitchPhases();
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				if (resolve) return getCompositeSwitch();
				return basicGetCompositeSwitch();
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
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				setSwitchOnDate((Date)newValue);
				return;
			case WiresPackage.SWITCH__NORMAL_OPEN:
				setNormalOpen((Boolean)newValue);
				return;
			case WiresPackage.SWITCH__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
				getSwitchingOperations().addAll((Collection<? extends SwitchingOperation>)newValue);
				return;
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				getLoadMgmtFunctions().clear();
				getLoadMgmtFunctions().addAll((Collection<? extends LoadMgmtFunction>)newValue);
				return;
			case WiresPackage.SWITCH__RETAINED:
				setRetained((Boolean)newValue);
				return;
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				getConnectDisconnectFunctions().clear();
				getConnectDisconnectFunctions().addAll((Collection<? extends ConnectDisconnectFunction>)newValue);
				return;
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				setSwitchOnCount((Integer)newValue);
				return;
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				getSwitchSchedules().clear();
				getSwitchSchedules().addAll((Collection<? extends SwitchSchedule>)newValue);
				return;
			case WiresPackage.SWITCH__SWITCH_PHASES:
				getSwitchPhases().clear();
				getSwitchPhases().addAll((Collection<? extends SwitchPhase>)newValue);
				return;
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				setCompositeSwitch((CompositeSwitch)newValue);
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
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				unsetSwitchOnDate();
				return;
			case WiresPackage.SWITCH__NORMAL_OPEN:
				unsetNormalOpen();
				return;
			case WiresPackage.SWITCH__RATED_CURRENT:
				unsetRatedCurrent();
				return;
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
				return;
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				getLoadMgmtFunctions().clear();
				return;
			case WiresPackage.SWITCH__RETAINED:
				unsetRetained();
				return;
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				getConnectDisconnectFunctions().clear();
				return;
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				unsetSwitchOnCount();
				return;
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				getSwitchSchedules().clear();
				return;
			case WiresPackage.SWITCH__SWITCH_PHASES:
				getSwitchPhases().clear();
				return;
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				setCompositeSwitch((CompositeSwitch)null);
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
			case WiresPackage.SWITCH__SWITCH_ON_DATE:
				return isSetSwitchOnDate();
			case WiresPackage.SWITCH__NORMAL_OPEN:
				return isSetNormalOpen();
			case WiresPackage.SWITCH__RATED_CURRENT:
				return isSetRatedCurrent();
			case WiresPackage.SWITCH__SWITCHING_OPERATIONS:
				return switchingOperations != null && !switchingOperations.isEmpty();
			case WiresPackage.SWITCH__LOAD_MGMT_FUNCTIONS:
				return loadMgmtFunctions != null && !loadMgmtFunctions.isEmpty();
			case WiresPackage.SWITCH__RETAINED:
				return isSetRetained();
			case WiresPackage.SWITCH__CONNECT_DISCONNECT_FUNCTIONS:
				return connectDisconnectFunctions != null && !connectDisconnectFunctions.isEmpty();
			case WiresPackage.SWITCH__SWITCH_ON_COUNT:
				return isSetSwitchOnCount();
			case WiresPackage.SWITCH__SWITCH_SCHEDULES:
				return switchSchedules != null && !switchSchedules.isEmpty();
			case WiresPackage.SWITCH__SWITCH_PHASES:
				return switchPhases != null && !switchPhases.isEmpty();
			case WiresPackage.SWITCH__COMPOSITE_SWITCH:
				return compositeSwitch != null;
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
		result.append(" (switchOnDate: ");
		if (switchOnDateESet) result.append(switchOnDate); else result.append("<unset>");
		result.append(", normalOpen: ");
		if (normalOpenESet) result.append(normalOpen); else result.append("<unset>");
		result.append(", ratedCurrent: ");
		if (ratedCurrentESet) result.append(ratedCurrent); else result.append("<unset>");
		result.append(", retained: ");
		if (retainedESet) result.append(retained); else result.append("<unset>");
		result.append(", switchOnCount: ");
		if (switchOnCountESet) result.append(switchOnCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Switch
