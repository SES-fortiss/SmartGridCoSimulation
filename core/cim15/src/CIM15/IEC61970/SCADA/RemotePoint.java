/**
 */
package CIM15.IEC61970.SCADA;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.SCADA.RemotePoint#getRemoteUnit <em>Remote Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemotePoint extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getRemoteUnit() <em>Remote Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUnit()
	 * @generated
	 * @ordered
	 */
	protected RemoteUnit remoteUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemotePoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.REMOTE_POINT;
	}

	/**
	 * Returns the value of the '<em><b>Remote Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.SCADA.RemoteUnit#getRemotePoints <em>Remote Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Unit</em>' reference.
	 * @see #setRemoteUnit(RemoteUnit)
	 * @see CIM15.IEC61970.SCADA.RemoteUnit#getRemotePoints
	 * @generated
	 */
	public RemoteUnit getRemoteUnit() {
		if (remoteUnit != null && remoteUnit.eIsProxy()) {
			InternalEObject oldRemoteUnit = (InternalEObject)remoteUnit;
			remoteUnit = (RemoteUnit)eResolveProxy(oldRemoteUnit);
			if (remoteUnit != oldRemoteUnit) {
			}
		}
		return remoteUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteUnit basicGetRemoteUnit() {
		return remoteUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoteUnit(RemoteUnit newRemoteUnit, NotificationChain msgs) {
		RemoteUnit oldRemoteUnit = remoteUnit;
		remoteUnit = newRemoteUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemotePoint#getRemoteUnit <em>Remote Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Unit</em>' reference.
	 * @see #getRemoteUnit()
	 * @generated
	 */
	public void setRemoteUnit(RemoteUnit newRemoteUnit) {
		if (newRemoteUnit != remoteUnit) {
			NotificationChain msgs = null;
			if (remoteUnit != null)
				msgs = ((InternalEObject)remoteUnit).eInverseRemove(this, SCADAPackage.REMOTE_UNIT__REMOTE_POINTS, RemoteUnit.class, msgs);
			if (newRemoteUnit != null)
				msgs = ((InternalEObject)newRemoteUnit).eInverseAdd(this, SCADAPackage.REMOTE_UNIT__REMOTE_POINTS, RemoteUnit.class, msgs);
			msgs = basicSetRemoteUnit(newRemoteUnit, msgs);
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
			case SCADAPackage.REMOTE_POINT__REMOTE_UNIT:
				if (remoteUnit != null)
					msgs = ((InternalEObject)remoteUnit).eInverseRemove(this, SCADAPackage.REMOTE_UNIT__REMOTE_POINTS, RemoteUnit.class, msgs);
				return basicSetRemoteUnit((RemoteUnit)otherEnd, msgs);
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
			case SCADAPackage.REMOTE_POINT__REMOTE_UNIT:
				return basicSetRemoteUnit(null, msgs);
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
			case SCADAPackage.REMOTE_POINT__REMOTE_UNIT:
				if (resolve) return getRemoteUnit();
				return basicGetRemoteUnit();
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
			case SCADAPackage.REMOTE_POINT__REMOTE_UNIT:
				setRemoteUnit((RemoteUnit)newValue);
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
			case SCADAPackage.REMOTE_POINT__REMOTE_UNIT:
				setRemoteUnit((RemoteUnit)null);
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
			case SCADAPackage.REMOTE_POINT__REMOTE_UNIT:
				return remoteUnit != null;
		}
		return super.eIsSet(featureID);
	}

} // RemotePoint
