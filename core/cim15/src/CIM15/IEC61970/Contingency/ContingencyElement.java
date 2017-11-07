/**
 */
package CIM15.IEC61970.Contingency;

import CIM15.IEC61970.Core.IdentifiedObject;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContingencyElement extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getContingency() <em>Contingency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingency()
	 * @generated
	 * @ordered
	 */
	protected Contingency contingency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContingencyElement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContingencyPackage.Literals.CONTINGENCY_ELEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Contingency</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Contingency.Contingency#getContingencyElement <em>Contingency Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency</em>' reference.
	 * @see #setContingency(Contingency)
	 * @see CIM15.IEC61970.Contingency.Contingency#getContingencyElement
	 * @generated
	 */
	public Contingency getContingency() {
		if (contingency != null && contingency.eIsProxy()) {
			InternalEObject oldContingency = (InternalEObject)contingency;
			contingency = (Contingency)eResolveProxy(oldContingency);
			if (contingency != oldContingency) {
			}
		}
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency basicGetContingency() {
		return contingency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContingency(Contingency newContingency, NotificationChain msgs) {
		Contingency oldContingency = contingency;
		contingency = newContingency;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contingency</em>' reference.
	 * @see #getContingency()
	 * @generated
	 */
	public void setContingency(Contingency newContingency) {
		if (newContingency != contingency) {
			NotificationChain msgs = null;
			if (contingency != null)
				msgs = ((InternalEObject)contingency).eInverseRemove(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs);
			if (newContingency != null)
				msgs = ((InternalEObject)newContingency).eInverseAdd(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs);
			msgs = basicSetContingency(newContingency, msgs);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				if (contingency != null)
					msgs = ((InternalEObject)contingency).eInverseRemove(this, ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT, Contingency.class, msgs);
				return basicSetContingency((Contingency)otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				return basicSetContingency(null, msgs);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				if (resolve) return getContingency();
				return basicGetContingency();
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				setContingency((Contingency)newValue);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				setContingency((Contingency)null);
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
			case ContingencyPackage.CONTINGENCY_ELEMENT__CONTINGENCY:
				return contingency != null;
		}
		return super.eIsSet(featureID);
	}

} // ContingencyElement
