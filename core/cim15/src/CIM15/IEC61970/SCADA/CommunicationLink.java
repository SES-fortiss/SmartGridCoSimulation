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
 * A representation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.SCADA.CommunicationLink#getRemoteUnits <em>Remote Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationLink extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getRemoteUnits() <em>Remote Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteUnit> remoteUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLink() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SCADAPackage.Literals.COMMUNICATION_LINK;
	}

	/**
	 * Returns the value of the '<em><b>Remote Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.SCADA.RemoteUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.SCADA.RemoteUnit#getCommunicationLinks <em>Communication Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Units</em>' reference list.
	 * @see CIM15.IEC61970.SCADA.RemoteUnit#getCommunicationLinks
	 * @generated
	 */
	public EList<RemoteUnit> getRemoteUnits() {
		if (remoteUnits == null) {
			remoteUnits = new BasicInternalEList<RemoteUnit>(RemoteUnit.class);
		}
		return remoteUnits;
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRemoteUnits()).basicAdd(otherEnd, msgs);
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return ((InternalEList<?>)getRemoteUnits()).basicRemove(otherEnd, msgs);
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return getRemoteUnits();
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				getRemoteUnits().clear();
				getRemoteUnits().addAll((Collection<? extends RemoteUnit>)newValue);
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				getRemoteUnits().clear();
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
			case SCADAPackage.COMMUNICATION_LINK__REMOTE_UNITS:
				return remoteUnits != null && !remoteUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CommunicationLink
