/**
 */
package CIM15.IEC61970.SCADA;

import CIM15.IEC61970.Core.PowerSystemResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteUnit#getRemotePoints <em>Remote Points</em>}</li>
 *   <li>{@link CIM15.IEC61970.SCADA.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteUnit extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getRemoteUnitType() <em>Remote Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final RemoteUnitType REMOTE_UNIT_TYPE_EDEFAULT = RemoteUnitType.SUBSTATION_CONTROL_SYSTEM;

	/**
	 * The cached value of the '{@link #getRemoteUnitType() <em>Remote Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUnitType()
	 * @generated
	 * @ordered
	 */
	protected RemoteUnitType remoteUnitType = REMOTE_UNIT_TYPE_EDEFAULT;

	/**
	 * This is true if the Remote Unit Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remoteUnitTypeESet;

	/**
	 * The cached value of the '{@link #getRemotePoints() <em>Remote Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemotePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<RemotePoint> remotePoints;

	/**
	 * The cached value of the '{@link #getCommunicationLinks() <em>Communication Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> communicationLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.REMOTE_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>Remote Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.SCADA.RemoteUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Unit Type</em>' attribute.
	 * @see CIM15.IEC61970.SCADA.RemoteUnitType
	 * @see #isSetRemoteUnitType()
	 * @see #unsetRemoteUnitType()
	 * @see #setRemoteUnitType(RemoteUnitType)
	 * @generated
	 */
	public RemoteUnitType getRemoteUnitType() {
		return remoteUnitType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.SCADA.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Unit Type</em>' attribute.
	 * @see CIM15.IEC61970.SCADA.RemoteUnitType
	 * @see #isSetRemoteUnitType()
	 * @see #unsetRemoteUnitType()
	 * @see #getRemoteUnitType()
	 * @generated
	 */
	public void setRemoteUnitType(RemoteUnitType newRemoteUnitType) {
		remoteUnitType = newRemoteUnitType == null ? REMOTE_UNIT_TYPE_EDEFAULT : newRemoteUnitType;
		remoteUnitTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.SCADA.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoteUnitType()
	 * @see #getRemoteUnitType()
	 * @see #setRemoteUnitType(RemoteUnitType)
	 * @generated
	 */
	public void unsetRemoteUnitType() {
		remoteUnitType = REMOTE_UNIT_TYPE_EDEFAULT;
		remoteUnitTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.SCADA.RemoteUnit#getRemoteUnitType <em>Remote Unit Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote Unit Type</em>' attribute is set.
	 * @see #unsetRemoteUnitType()
	 * @see #getRemoteUnitType()
	 * @see #setRemoteUnitType(RemoteUnitType)
	 * @generated
	 */
	public boolean isSetRemoteUnitType() {
		return remoteUnitTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Remote Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.SCADA.RemotePoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.SCADA.RemotePoint#getRemoteUnit <em>Remote Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Points</em>' reference list.
	 * @see CIM15.IEC61970.SCADA.RemotePoint#getRemoteUnit
	 * @generated
	 */
	public EList<RemotePoint> getRemotePoints() {
		if (remotePoints == null) {
			remotePoints = new BasicInternalEList<RemotePoint>(RemotePoint.class);
		}
		return remotePoints;
	}

	/**
	 * Returns the value of the '<em><b>Communication Links</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.SCADA.CommunicationLink}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.SCADA.CommunicationLink#getRemoteUnits <em>Remote Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Links</em>' reference list.
	 * @see CIM15.IEC61970.SCADA.CommunicationLink#getRemoteUnits
	 * @generated
	 */
	public EList<CommunicationLink> getCommunicationLinks() {
		if (communicationLinks == null) {
			communicationLinks = new BasicInternalEList<CommunicationLink>(CommunicationLink.class);
		}
		return communicationLinks;
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemotePoints()).basicAdd(otherEnd, msgs);
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicationLinks()).basicAdd(otherEnd, msgs);
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return ((InternalEList<?>)getRemotePoints()).basicRemove(otherEnd, msgs);
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return ((InternalEList<?>)getCommunicationLinks()).basicRemove(otherEnd, msgs);
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				return getRemoteUnitType();
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return getRemotePoints();
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return getCommunicationLinks();
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				setRemoteUnitType((RemoteUnitType)newValue);
				return;
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				getRemotePoints().clear();
				getRemotePoints().addAll((Collection<? extends RemotePoint>)newValue);
				return;
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
				getCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				unsetRemoteUnitType();
				return;
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				getRemotePoints().clear();
				return;
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				getCommunicationLinks().clear();
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
			case SCADAPackage.REMOTE_UNIT__REMOTE_UNIT_TYPE:
				return isSetRemoteUnitType();
			case SCADAPackage.REMOTE_UNIT__REMOTE_POINTS:
				return remotePoints != null && !remotePoints.isEmpty();
			case SCADAPackage.REMOTE_UNIT__COMMUNICATION_LINKS:
				return communicationLinks != null && !communicationLinks.isEmpty();
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
		result.append(" (remoteUnitType: ");
		if (remoteUnitTypeESet) result.append(remoteUnitType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // RemoteUnit
