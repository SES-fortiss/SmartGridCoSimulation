/**
 */
package CIM15.IEC61970.Informative.InfLoadControl;

import CIM15.IEC61968.Metering.EndDeviceFunction;

import CIM15.IEC61970.Wires.Switch;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Mgmt Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSwitches <em>Switches</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords <em>Load Mgmt Records</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadMgmtFunction extends EndDeviceFunction {
	/**
	 * The default value of the '{@link #getSchedulingBasis() <em>Scheduling Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingBasis()
	 * @generated
	 * @ordered
	 */
	protected static final LoadMgmtKind SCHEDULING_BASIS_EDEFAULT = LoadMgmtKind.REMOTE_CONTROL;

	/**
	 * The cached value of the '{@link #getSchedulingBasis() <em>Scheduling Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingBasis()
	 * @generated
	 * @ordered
	 */
	protected LoadMgmtKind schedulingBasis = SCHEDULING_BASIS_EDEFAULT;

	/**
	 * This is true if the Scheduling Basis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schedulingBasisESet;

	/**
	 * The default value of the '{@link #isRemoteOverRide() <em>Remote Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteOverRide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_OVER_RIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteOverRide() <em>Remote Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteOverRide()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteOverRide = REMOTE_OVER_RIDE_EDEFAULT;

	/**
	 * This is true if the Remote Over Ride attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remoteOverRideESet;

	/**
	 * The default value of the '{@link #isIsAutoOp() <em>Is Auto Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTO_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutoOp() <em>Is Auto Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutoOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoOp = IS_AUTO_OP_EDEFAULT;

	/**
	 * This is true if the Is Auto Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAutoOpESet;

	/**
	 * The default value of the '{@link #getLoadStatus() <em>Load Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatus()
	 * @generated
	 * @ordered
	 */
	protected static final LoadStateKind LOAD_STATUS_EDEFAULT = LoadStateKind.LIMITED_LOAD;

	/**
	 * The cached value of the '{@link #getLoadStatus() <em>Load Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatus()
	 * @generated
	 * @ordered
	 */
	protected LoadStateKind loadStatus = LOAD_STATUS_EDEFAULT;

	/**
	 * This is true if the Load Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean loadStatusESet;

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
	 * The default value of the '{@link #isManualOverRide() <em>Manual Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualOverRide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_OVER_RIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManualOverRide() <em>Manual Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualOverRide()
	 * @generated
	 * @ordered
	 */
	protected boolean manualOverRide = MANUAL_OVER_RIDE_EDEFAULT;

	/**
	 * This is true if the Manual Over Ride attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean manualOverRideESet;

	/**
	 * The cached value of the '{@link #getLoadMgmtRecords() <em>Load Mgmt Records</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmtRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadMgmtRecord> loadMgmtRecords;

	/**
	 * The default value of the '{@link #getOverRideTimeOut() <em>Over Ride Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverRideTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final float OVER_RIDE_TIME_OUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOverRideTimeOut() <em>Over Ride Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverRideTimeOut()
	 * @generated
	 * @ordered
	 */
	protected float overRideTimeOut = OVER_RIDE_TIME_OUT_EDEFAULT;

	/**
	 * This is true if the Over Ride Time Out attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overRideTimeOutESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadMgmtFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_MGMT_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>Scheduling Basis</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Basis</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @see #isSetSchedulingBasis()
	 * @see #unsetSchedulingBasis()
	 * @see #setSchedulingBasis(LoadMgmtKind)
	 * @generated
	 */
	public LoadMgmtKind getSchedulingBasis() {
		return schedulingBasis;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Basis</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtKind
	 * @see #isSetSchedulingBasis()
	 * @see #unsetSchedulingBasis()
	 * @see #getSchedulingBasis()
	 * @generated
	 */
	public void setSchedulingBasis(LoadMgmtKind newSchedulingBasis) {
		schedulingBasis = newSchedulingBasis == null ? SCHEDULING_BASIS_EDEFAULT : newSchedulingBasis;
		schedulingBasisESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchedulingBasis()
	 * @see #getSchedulingBasis()
	 * @see #setSchedulingBasis(LoadMgmtKind)
	 * @generated
	 */
	public void unsetSchedulingBasis() {
		schedulingBasis = SCHEDULING_BASIS_EDEFAULT;
		schedulingBasisESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getSchedulingBasis <em>Scheduling Basis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scheduling Basis</em>' attribute is set.
	 * @see #unsetSchedulingBasis()
	 * @see #getSchedulingBasis()
	 * @see #setSchedulingBasis(LoadMgmtKind)
	 * @generated
	 */
	public boolean isSetSchedulingBasis() {
		return schedulingBasisESet;
	}

	/**
	 * Returns the value of the '<em><b>Remote Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Over Ride</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Over Ride</em>' attribute.
	 * @see #isSetRemoteOverRide()
	 * @see #unsetRemoteOverRide()
	 * @see #setRemoteOverRide(boolean)
	 * @generated
	 */
	public boolean isRemoteOverRide() {
		return remoteOverRide;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Over Ride</em>' attribute.
	 * @see #isSetRemoteOverRide()
	 * @see #unsetRemoteOverRide()
	 * @see #isRemoteOverRide()
	 * @generated
	 */
	public void setRemoteOverRide(boolean newRemoteOverRide) {
		remoteOverRide = newRemoteOverRide;
		remoteOverRideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoteOverRide()
	 * @see #isRemoteOverRide()
	 * @see #setRemoteOverRide(boolean)
	 * @generated
	 */
	public void unsetRemoteOverRide() {
		remoteOverRide = REMOTE_OVER_RIDE_EDEFAULT;
		remoteOverRideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isRemoteOverRide <em>Remote Over Ride</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote Over Ride</em>' attribute is set.
	 * @see #unsetRemoteOverRide()
	 * @see #isRemoteOverRide()
	 * @see #setRemoteOverRide(boolean)
	 * @generated
	 */
	public boolean isSetRemoteOverRide() {
		return remoteOverRideESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Auto Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auto Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auto Op</em>' attribute.
	 * @see #isSetIsAutoOp()
	 * @see #unsetIsAutoOp()
	 * @see #setIsAutoOp(boolean)
	 * @generated
	 */
	public boolean isIsAutoOp() {
		return isAutoOp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auto Op</em>' attribute.
	 * @see #isSetIsAutoOp()
	 * @see #unsetIsAutoOp()
	 * @see #isIsAutoOp()
	 * @generated
	 */
	public void setIsAutoOp(boolean newIsAutoOp) {
		isAutoOp = newIsAutoOp;
		isAutoOpESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAutoOp()
	 * @see #isIsAutoOp()
	 * @see #setIsAutoOp(boolean)
	 * @generated
	 */
	public void unsetIsAutoOp() {
		isAutoOp = IS_AUTO_OP_EDEFAULT;
		isAutoOpESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isIsAutoOp <em>Is Auto Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Auto Op</em>' attribute is set.
	 * @see #unsetIsAutoOp()
	 * @see #isIsAutoOp()
	 * @see #setIsAutoOp(boolean)
	 * @generated
	 */
	public boolean isSetIsAutoOp() {
		return isAutoOpESet;
	}

	/**
	 * Returns the value of the '<em><b>Load Status</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Status</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @see #isSetLoadStatus()
	 * @see #unsetLoadStatus()
	 * @see #setLoadStatus(LoadStateKind)
	 * @generated
	 */
	public LoadStateKind getLoadStatus() {
		return loadStatus;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Status</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadStateKind
	 * @see #isSetLoadStatus()
	 * @see #unsetLoadStatus()
	 * @see #getLoadStatus()
	 * @generated
	 */
	public void setLoadStatus(LoadStateKind newLoadStatus) {
		loadStatus = newLoadStatus == null ? LOAD_STATUS_EDEFAULT : newLoadStatus;
		loadStatusESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoadStatus()
	 * @see #getLoadStatus()
	 * @see #setLoadStatus(LoadStateKind)
	 * @generated
	 */
	public void unsetLoadStatus() {
		loadStatus = LOAD_STATUS_EDEFAULT;
		loadStatusESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadStatus <em>Load Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Load Status</em>' attribute is set.
	 * @see #unsetLoadStatus()
	 * @see #getLoadStatus()
	 * @see #setLoadStatus(LoadStateKind)
	 * @generated
	 */
	public boolean isSetLoadStatus() {
		return loadStatusESet;
	}

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.Switch#getLoadMgmtFunctions <em>Load Mgmt Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see CIM15.IEC61970.Wires.Switch#getLoadMgmtFunctions
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new BasicInternalEList<Switch>(Switch.class);
		}
		return switches;
	}

	/**
	 * Returns the value of the '<em><b>Manual Over Ride</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Over Ride</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Over Ride</em>' attribute.
	 * @see #isSetManualOverRide()
	 * @see #unsetManualOverRide()
	 * @see #setManualOverRide(boolean)
	 * @generated
	 */
	public boolean isManualOverRide() {
		return manualOverRide;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Over Ride</em>' attribute.
	 * @see #isSetManualOverRide()
	 * @see #unsetManualOverRide()
	 * @see #isManualOverRide()
	 * @generated
	 */
	public void setManualOverRide(boolean newManualOverRide) {
		manualOverRide = newManualOverRide;
		manualOverRideESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManualOverRide()
	 * @see #isManualOverRide()
	 * @see #setManualOverRide(boolean)
	 * @generated
	 */
	public void unsetManualOverRide() {
		manualOverRide = MANUAL_OVER_RIDE_EDEFAULT;
		manualOverRideESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#isManualOverRide <em>Manual Over Ride</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manual Over Ride</em>' attribute is set.
	 * @see #unsetManualOverRide()
	 * @see #isManualOverRide()
	 * @see #setManualOverRide(boolean)
	 * @generated
	 */
	public boolean isSetManualOverRide() {
		return manualOverRideESet;
	}

	/**
	 * Returns the value of the '<em><b>Load Mgmt Records</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt Records</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt Records</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction
	 * @generated
	 */
	public EList<LoadMgmtRecord> getLoadMgmtRecords() {
		if (loadMgmtRecords == null) {
			loadMgmtRecords = new BasicInternalEList<LoadMgmtRecord>(LoadMgmtRecord.class);
		}
		return loadMgmtRecords;
	}

	/**
	 * Returns the value of the '<em><b>Over Ride Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Over Ride Time Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over Ride Time Out</em>' attribute.
	 * @see #isSetOverRideTimeOut()
	 * @see #unsetOverRideTimeOut()
	 * @see #setOverRideTimeOut(float)
	 * @generated
	 */
	public float getOverRideTimeOut() {
		return overRideTimeOut;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Ride Time Out</em>' attribute.
	 * @see #isSetOverRideTimeOut()
	 * @see #unsetOverRideTimeOut()
	 * @see #getOverRideTimeOut()
	 * @generated
	 */
	public void setOverRideTimeOut(float newOverRideTimeOut) {
		overRideTimeOut = newOverRideTimeOut;
		overRideTimeOutESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverRideTimeOut()
	 * @see #getOverRideTimeOut()
	 * @see #setOverRideTimeOut(float)
	 * @generated
	 */
	public void unsetOverRideTimeOut() {
		overRideTimeOut = OVER_RIDE_TIME_OUT_EDEFAULT;
		overRideTimeOutESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getOverRideTimeOut <em>Over Ride Time Out</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Over Ride Time Out</em>' attribute is set.
	 * @see #unsetOverRideTimeOut()
	 * @see #getOverRideTimeOut()
	 * @see #setOverRideTimeOut(float)
	 * @generated
	 */
	public boolean isSetOverRideTimeOut() {
		return overRideTimeOutESet;
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitches()).basicAdd(otherEnd, msgs);
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLoadMgmtRecords()).basicAdd(otherEnd, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return ((InternalEList<?>)getLoadMgmtRecords()).basicRemove(otherEnd, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				return getSchedulingBasis();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				return isRemoteOverRide();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				return isIsAutoOp();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				return getLoadStatus();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return getSwitches();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				return isManualOverRide();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return getLoadMgmtRecords();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				return getOverRideTimeOut();
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				setSchedulingBasis((LoadMgmtKind)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				setRemoteOverRide((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				setIsAutoOp((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				setLoadStatus((LoadStateKind)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				setManualOverRide((Boolean)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				getLoadMgmtRecords().clear();
				getLoadMgmtRecords().addAll((Collection<? extends LoadMgmtRecord>)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				setOverRideTimeOut((Float)newValue);
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				unsetSchedulingBasis();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				unsetRemoteOverRide();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				unsetIsAutoOp();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				unsetLoadStatus();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				getSwitches().clear();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				unsetManualOverRide();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				getLoadMgmtRecords().clear();
				return;
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				unsetOverRideTimeOut();
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
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SCHEDULING_BASIS:
				return isSetSchedulingBasis();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__REMOTE_OVER_RIDE:
				return isSetRemoteOverRide();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__IS_AUTO_OP:
				return isSetIsAutoOp();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_STATUS:
				return isSetLoadStatus();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__SWITCHES:
				return switches != null && !switches.isEmpty();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__MANUAL_OVER_RIDE:
				return isSetManualOverRide();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS:
				return loadMgmtRecords != null && !loadMgmtRecords.isEmpty();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION__OVER_RIDE_TIME_OUT:
				return isSetOverRideTimeOut();
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
		result.append(" (schedulingBasis: ");
		if (schedulingBasisESet) result.append(schedulingBasis); else result.append("<unset>");
		result.append(", remoteOverRide: ");
		if (remoteOverRideESet) result.append(remoteOverRide); else result.append("<unset>");
		result.append(", isAutoOp: ");
		if (isAutoOpESet) result.append(isAutoOp); else result.append("<unset>");
		result.append(", loadStatus: ");
		if (loadStatusESet) result.append(loadStatus); else result.append("<unset>");
		result.append(", manualOverRide: ");
		if (manualOverRideESet) result.append(manualOverRide); else result.append("<unset>");
		result.append(", overRideTimeOut: ");
		if (overRideTimeOutESet) result.append(overRideTimeOut); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LoadMgmtFunction
