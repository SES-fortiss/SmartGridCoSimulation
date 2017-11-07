/**
 */
package CIM15.IEC61968.LoadControl;

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
 * A representation of the model object '<em><b>Connect Disconnect Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getSwitches <em>Switches</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}</li>
 *   <li>{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectDisconnectFunction extends EndDeviceFunction {
	/**
	 * The default value of the '{@link #isIsDelayedDiscon() <em>Is Delayed Discon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDelayedDiscon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DELAYED_DISCON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDelayedDiscon() <em>Is Delayed Discon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDelayedDiscon()
	 * @generated
	 * @ordered
	 */
	protected boolean isDelayedDiscon = IS_DELAYED_DISCON_EDEFAULT;

	/**
	 * This is true if the Is Delayed Discon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDelayedDisconESet;

	/**
	 * The cached value of the '{@link #getRcdInfo() <em>Rcd Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcdInfo()
	 * @generated
	 * @ordered
	 */
	protected RemoteConnectDisconnectInfo rcdInfo;

	/**
	 * The default value of the '{@link #getEventCount() <em>Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCount()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventCount() <em>Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCount()
	 * @generated
	 * @ordered
	 */
	protected int eventCount = EVENT_COUNT_EDEFAULT;

	/**
	 * This is true if the Event Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventCountESet;

	/**
	 * The default value of the '{@link #isIsRemoteAutoReconOp() <em>Is Remote Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOTE_AUTO_RECON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRemoteAutoReconOp() <em>Is Remote Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isRemoteAutoReconOp = IS_REMOTE_AUTO_RECON_OP_EDEFAULT;

	/**
	 * This is true if the Is Remote Auto Recon Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRemoteAutoReconOpESet;

	/**
	 * The default value of the '{@link #isIsRemoteAutoDisconOp() <em>Is Remote Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOTE_AUTO_DISCON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRemoteAutoDisconOp() <em>Is Remote Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoteAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isRemoteAutoDisconOp = IS_REMOTE_AUTO_DISCON_OP_EDEFAULT;

	/**
	 * This is true if the Is Remote Auto Discon Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRemoteAutoDisconOpESet;

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
	 * The default value of the '{@link #isIsLocalAutoDisconOp() <em>Is Local Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_AUTO_DISCON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocalAutoDisconOp() <em>Is Local Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoDisconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalAutoDisconOp = IS_LOCAL_AUTO_DISCON_OP_EDEFAULT;

	/**
	 * This is true if the Is Local Auto Discon Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalAutoDisconOpESet;

	/**
	 * The default value of the '{@link #isIsLocalAutoReconOp() <em>Is Local Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_AUTO_RECON_OP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocalAutoReconOp() <em>Is Local Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocalAutoReconOp()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalAutoReconOp = IS_LOCAL_AUTO_RECON_OP_EDEFAULT;

	/**
	 * This is true if the Is Local Auto Recon Op attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLocalAutoReconOpESet;

	/**
	 * The default value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConnected() <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean isConnected = IS_CONNECTED_EDEFAULT;

	/**
	 * This is true if the Is Connected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isConnectedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectDisconnectFunction() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoadControlPackage.Literals.CONNECT_DISCONNECT_FUNCTION;
	}

	/**
	 * Returns the value of the '<em><b>Is Delayed Discon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Delayed Discon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Delayed Discon</em>' attribute.
	 * @see #isSetIsDelayedDiscon()
	 * @see #unsetIsDelayedDiscon()
	 * @see #setIsDelayedDiscon(boolean)
	 * @generated
	 */
	public boolean isIsDelayedDiscon() {
		return isDelayedDiscon;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Delayed Discon</em>' attribute.
	 * @see #isSetIsDelayedDiscon()
	 * @see #unsetIsDelayedDiscon()
	 * @see #isIsDelayedDiscon()
	 * @generated
	 */
	public void setIsDelayedDiscon(boolean newIsDelayedDiscon) {
		isDelayedDiscon = newIsDelayedDiscon;
		isDelayedDisconESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDelayedDiscon()
	 * @see #isIsDelayedDiscon()
	 * @see #setIsDelayedDiscon(boolean)
	 * @generated
	 */
	public void unsetIsDelayedDiscon() {
		isDelayedDiscon = IS_DELAYED_DISCON_EDEFAULT;
		isDelayedDisconESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsDelayedDiscon <em>Is Delayed Discon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Delayed Discon</em>' attribute is set.
	 * @see #unsetIsDelayedDiscon()
	 * @see #isIsDelayedDiscon()
	 * @see #setIsDelayedDiscon(boolean)
	 * @generated
	 */
	public boolean isSetIsDelayedDiscon() {
		return isDelayedDisconESet;
	}

	/**
	 * Returns the value of the '<em><b>Rcd Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcd Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcd Info</em>' containment reference.
	 * @see #setRcdInfo(RemoteConnectDisconnectInfo)
	 * @generated
	 */
	public RemoteConnectDisconnectInfo getRcdInfo() {
		return rcdInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRcdInfo(RemoteConnectDisconnectInfo newRcdInfo, NotificationChain msgs) {
		RemoteConnectDisconnectInfo oldRcdInfo = rcdInfo;
		rcdInfo = newRcdInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcd Info</em>' containment reference.
	 * @see #getRcdInfo()
	 * @generated
	 */
	public void setRcdInfo(RemoteConnectDisconnectInfo newRcdInfo) {
		if (newRcdInfo != rcdInfo) {
			NotificationChain msgs = null;
			if (rcdInfo != null)
				msgs = ((InternalEObject)rcdInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, null, msgs);
			if (newRcdInfo != null)
				msgs = ((InternalEObject)newRcdInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO, null, msgs);
			msgs = basicSetRcdInfo(newRcdInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Event Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Count</em>' attribute.
	 * @see #isSetEventCount()
	 * @see #unsetEventCount()
	 * @see #setEventCount(int)
	 * @generated
	 */
	public int getEventCount() {
		return eventCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Count</em>' attribute.
	 * @see #isSetEventCount()
	 * @see #unsetEventCount()
	 * @see #getEventCount()
	 * @generated
	 */
	public void setEventCount(int newEventCount) {
		eventCount = newEventCount;
		eventCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventCount()
	 * @see #getEventCount()
	 * @see #setEventCount(int)
	 * @generated
	 */
	public void unsetEventCount() {
		eventCount = EVENT_COUNT_EDEFAULT;
		eventCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Count</em>' attribute is set.
	 * @see #unsetEventCount()
	 * @see #getEventCount()
	 * @see #setEventCount(int)
	 * @generated
	 */
	public boolean isSetEventCount() {
		return eventCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Remote Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Remote Auto Recon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Remote Auto Recon Op</em>' attribute.
	 * @see #isSetIsRemoteAutoReconOp()
	 * @see #unsetIsRemoteAutoReconOp()
	 * @see #setIsRemoteAutoReconOp(boolean)
	 * @generated
	 */
	public boolean isIsRemoteAutoReconOp() {
		return isRemoteAutoReconOp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remote Auto Recon Op</em>' attribute.
	 * @see #isSetIsRemoteAutoReconOp()
	 * @see #unsetIsRemoteAutoReconOp()
	 * @see #isIsRemoteAutoReconOp()
	 * @generated
	 */
	public void setIsRemoteAutoReconOp(boolean newIsRemoteAutoReconOp) {
		isRemoteAutoReconOp = newIsRemoteAutoReconOp;
		isRemoteAutoReconOpESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRemoteAutoReconOp()
	 * @see #isIsRemoteAutoReconOp()
	 * @see #setIsRemoteAutoReconOp(boolean)
	 * @generated
	 */
	public void unsetIsRemoteAutoReconOp() {
		isRemoteAutoReconOp = IS_REMOTE_AUTO_RECON_OP_EDEFAULT;
		isRemoteAutoReconOpESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Remote Auto Recon Op</em>' attribute is set.
	 * @see #unsetIsRemoteAutoReconOp()
	 * @see #isIsRemoteAutoReconOp()
	 * @see #setIsRemoteAutoReconOp(boolean)
	 * @generated
	 */
	public boolean isSetIsRemoteAutoReconOp() {
		return isRemoteAutoReconOpESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Remote Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Remote Auto Discon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Remote Auto Discon Op</em>' attribute.
	 * @see #isSetIsRemoteAutoDisconOp()
	 * @see #unsetIsRemoteAutoDisconOp()
	 * @see #setIsRemoteAutoDisconOp(boolean)
	 * @generated
	 */
	public boolean isIsRemoteAutoDisconOp() {
		return isRemoteAutoDisconOp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remote Auto Discon Op</em>' attribute.
	 * @see #isSetIsRemoteAutoDisconOp()
	 * @see #unsetIsRemoteAutoDisconOp()
	 * @see #isIsRemoteAutoDisconOp()
	 * @generated
	 */
	public void setIsRemoteAutoDisconOp(boolean newIsRemoteAutoDisconOp) {
		isRemoteAutoDisconOp = newIsRemoteAutoDisconOp;
		isRemoteAutoDisconOpESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRemoteAutoDisconOp()
	 * @see #isIsRemoteAutoDisconOp()
	 * @see #setIsRemoteAutoDisconOp(boolean)
	 * @generated
	 */
	public void unsetIsRemoteAutoDisconOp() {
		isRemoteAutoDisconOp = IS_REMOTE_AUTO_DISCON_OP_EDEFAULT;
		isRemoteAutoDisconOpESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Remote Auto Discon Op</em>' attribute is set.
	 * @see #unsetIsRemoteAutoDisconOp()
	 * @see #isIsRemoteAutoDisconOp()
	 * @see #setIsRemoteAutoDisconOp(boolean)
	 * @generated
	 */
	public boolean isSetIsRemoteAutoDisconOp() {
		return isRemoteAutoDisconOpESet;
	}

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.Switch}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' reference list.
	 * @see CIM15.IEC61970.Wires.Switch#getConnectDisconnectFunctions
	 * @generated
	 */
	public EList<Switch> getSwitches() {
		if (switches == null) {
			switches = new BasicInternalEList<Switch>(Switch.class);
		}
		return switches;
	}

	/**
	 * Returns the value of the '<em><b>Is Local Auto Discon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Local Auto Discon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Local Auto Discon Op</em>' attribute.
	 * @see #isSetIsLocalAutoDisconOp()
	 * @see #unsetIsLocalAutoDisconOp()
	 * @see #setIsLocalAutoDisconOp(boolean)
	 * @generated
	 */
	public boolean isIsLocalAutoDisconOp() {
		return isLocalAutoDisconOp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Local Auto Discon Op</em>' attribute.
	 * @see #isSetIsLocalAutoDisconOp()
	 * @see #unsetIsLocalAutoDisconOp()
	 * @see #isIsLocalAutoDisconOp()
	 * @generated
	 */
	public void setIsLocalAutoDisconOp(boolean newIsLocalAutoDisconOp) {
		isLocalAutoDisconOp = newIsLocalAutoDisconOp;
		isLocalAutoDisconOpESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalAutoDisconOp()
	 * @see #isIsLocalAutoDisconOp()
	 * @see #setIsLocalAutoDisconOp(boolean)
	 * @generated
	 */
	public void unsetIsLocalAutoDisconOp() {
		isLocalAutoDisconOp = IS_LOCAL_AUTO_DISCON_OP_EDEFAULT;
		isLocalAutoDisconOpESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Local Auto Discon Op</em>' attribute is set.
	 * @see #unsetIsLocalAutoDisconOp()
	 * @see #isIsLocalAutoDisconOp()
	 * @see #setIsLocalAutoDisconOp(boolean)
	 * @generated
	 */
	public boolean isSetIsLocalAutoDisconOp() {
		return isLocalAutoDisconOpESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Local Auto Recon Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Local Auto Recon Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Local Auto Recon Op</em>' attribute.
	 * @see #isSetIsLocalAutoReconOp()
	 * @see #unsetIsLocalAutoReconOp()
	 * @see #setIsLocalAutoReconOp(boolean)
	 * @generated
	 */
	public boolean isIsLocalAutoReconOp() {
		return isLocalAutoReconOp;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Local Auto Recon Op</em>' attribute.
	 * @see #isSetIsLocalAutoReconOp()
	 * @see #unsetIsLocalAutoReconOp()
	 * @see #isIsLocalAutoReconOp()
	 * @generated
	 */
	public void setIsLocalAutoReconOp(boolean newIsLocalAutoReconOp) {
		isLocalAutoReconOp = newIsLocalAutoReconOp;
		isLocalAutoReconOpESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLocalAutoReconOp()
	 * @see #isIsLocalAutoReconOp()
	 * @see #setIsLocalAutoReconOp(boolean)
	 * @generated
	 */
	public void unsetIsLocalAutoReconOp() {
		isLocalAutoReconOp = IS_LOCAL_AUTO_RECON_OP_EDEFAULT;
		isLocalAutoReconOpESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Local Auto Recon Op</em>' attribute is set.
	 * @see #unsetIsLocalAutoReconOp()
	 * @see #isIsLocalAutoReconOp()
	 * @see #setIsLocalAutoReconOp(boolean)
	 * @generated
	 */
	public boolean isSetIsLocalAutoReconOp() {
		return isLocalAutoReconOpESet;
	}

	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' attribute.
	 * @see #isSetIsConnected()
	 * @see #unsetIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	public boolean isIsConnected() {
		return isConnected;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connected</em>' attribute.
	 * @see #isSetIsConnected()
	 * @see #unsetIsConnected()
	 * @see #isIsConnected()
	 * @generated
	 */
	public void setIsConnected(boolean newIsConnected) {
		isConnected = newIsConnected;
		isConnectedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConnected()
	 * @see #isIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	public void unsetIsConnected() {
		isConnected = IS_CONNECTED_EDEFAULT;
		isConnectedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.LoadControl.ConnectDisconnectFunction#isIsConnected <em>Is Connected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Connected</em>' attribute is set.
	 * @see #unsetIsConnected()
	 * @see #isIsConnected()
	 * @see #setIsConnected(boolean)
	 * @generated
	 */
	public boolean isSetIsConnected() {
		return isConnectedESet;
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				return basicSetRcdInfo(null, msgs);
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				return isIsDelayedDiscon();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				return getRcdInfo();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				return getEventCount();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				return isIsRemoteAutoReconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				return isIsRemoteAutoDisconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				return getSwitches();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				return isIsLocalAutoDisconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				return isIsLocalAutoReconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				return isIsConnected();
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				setIsDelayedDiscon((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				setRcdInfo((RemoteConnectDisconnectInfo)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				setEventCount((Integer)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				setIsRemoteAutoReconOp((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				setIsRemoteAutoDisconOp((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends Switch>)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				setIsLocalAutoDisconOp((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				setIsLocalAutoReconOp((Boolean)newValue);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				setIsConnected((Boolean)newValue);
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				unsetIsDelayedDiscon();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				setRcdInfo((RemoteConnectDisconnectInfo)null);
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				unsetEventCount();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				unsetIsRemoteAutoReconOp();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				unsetIsRemoteAutoDisconOp();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				getSwitches().clear();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				unsetIsLocalAutoDisconOp();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				unsetIsLocalAutoReconOp();
				return;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				unsetIsConnected();
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
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
				return isSetIsDelayedDiscon();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
				return rcdInfo != null;
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
				return isSetEventCount();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
				return isSetIsRemoteAutoReconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
				return isSetIsRemoteAutoDisconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__SWITCHES:
				return switches != null && !switches.isEmpty();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
				return isSetIsLocalAutoDisconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
				return isSetIsLocalAutoReconOp();
			case LoadControlPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
				return isSetIsConnected();
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
		result.append(" (isDelayedDiscon: ");
		if (isDelayedDisconESet) result.append(isDelayedDiscon); else result.append("<unset>");
		result.append(", eventCount: ");
		if (eventCountESet) result.append(eventCount); else result.append("<unset>");
		result.append(", isRemoteAutoReconOp: ");
		if (isRemoteAutoReconOpESet) result.append(isRemoteAutoReconOp); else result.append("<unset>");
		result.append(", isRemoteAutoDisconOp: ");
		if (isRemoteAutoDisconOpESet) result.append(isRemoteAutoDisconOp); else result.append("<unset>");
		result.append(", isLocalAutoDisconOp: ");
		if (isLocalAutoDisconOpESet) result.append(isLocalAutoDisconOp); else result.append("<unset>");
		result.append(", isLocalAutoReconOp: ");
		if (isLocalAutoReconOpESet) result.append(isLocalAutoReconOp); else result.append("<unset>");
		result.append(", isConnected: ");
		if (isConnectedESet) result.append(isConnected); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ConnectDisconnectFunction
