/**
 */
package CIM15.IEC61970.Core;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.OperatingParticipant#getOperatingShare <em>Operating Share</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatingParticipant extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getOperatingShare() <em>Operating Share</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingShare()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingShare> operatingShare;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingParticipant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.OPERATING_PARTICIPANT;
	}

	/**
	 * Returns the value of the '<em><b>Operating Share</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.OperatingShare}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.OperatingShare#getOperatingParticipant <em>Operating Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Share</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Share</em>' reference list.
	 * @see CIM15.IEC61970.Core.OperatingShare#getOperatingParticipant
	 * @generated
	 */
	public EList<OperatingShare> getOperatingShare() {
		if (operatingShare == null) {
			operatingShare = new BasicInternalEList<OperatingShare>(OperatingShare.class);
		}
		return operatingShare;
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatingShare()).basicAdd(otherEnd, msgs);
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return ((InternalEList<?>)getOperatingShare()).basicRemove(otherEnd, msgs);
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return getOperatingShare();
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				getOperatingShare().clear();
				getOperatingShare().addAll((Collection<? extends OperatingShare>)newValue);
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				getOperatingShare().clear();
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
			case CorePackage.OPERATING_PARTICIPANT__OPERATING_SHARE:
				return operatingShare != null && !operatingShare.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // OperatingParticipant
