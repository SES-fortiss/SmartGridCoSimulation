/**
 */
package CIM15.IEC61970.Generation.GenerationDynamics;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Wires.SynchronousMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prime Mover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimeMover extends PowerSystemResource {
	/**
	 * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronousMachine> synchronousMachines;

	/**
	 * The default value of the '{@link #getPrimeMoverRating() <em>Prime Mover Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMoverRating()
	 * @generated
	 * @ordered
	 */
	protected static final float PRIME_MOVER_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrimeMoverRating() <em>Prime Mover Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMoverRating()
	 * @generated
	 * @ordered
	 */
	protected float primeMoverRating = PRIME_MOVER_RATING_EDEFAULT;

	/**
	 * This is true if the Prime Mover Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean primeMoverRatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimeMover() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.PRIME_MOVER;
	}

	/**
	 * Returns the value of the '<em><b>Synchronous Machines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.SynchronousMachine}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machines</em>' reference list.
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getPrimeMovers
	 * @generated
	 */
	public EList<SynchronousMachine> getSynchronousMachines() {
		if (synchronousMachines == null) {
			synchronousMachines = new BasicInternalEList<SynchronousMachine>(SynchronousMachine.class);
		}
		return synchronousMachines;
	}

	/**
	 * Returns the value of the '<em><b>Prime Mover Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prime Mover Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prime Mover Rating</em>' attribute.
	 * @see #isSetPrimeMoverRating()
	 * @see #unsetPrimeMoverRating()
	 * @see #setPrimeMoverRating(float)
	 * @generated
	 */
	public float getPrimeMoverRating() {
		return primeMoverRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prime Mover Rating</em>' attribute.
	 * @see #isSetPrimeMoverRating()
	 * @see #unsetPrimeMoverRating()
	 * @see #getPrimeMoverRating()
	 * @generated
	 */
	public void setPrimeMoverRating(float newPrimeMoverRating) {
		primeMoverRating = newPrimeMoverRating;
		primeMoverRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrimeMoverRating()
	 * @see #getPrimeMoverRating()
	 * @see #setPrimeMoverRating(float)
	 * @generated
	 */
	public void unsetPrimeMoverRating() {
		primeMoverRating = PRIME_MOVER_RATING_EDEFAULT;
		primeMoverRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover#getPrimeMoverRating <em>Prime Mover Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prime Mover Rating</em>' attribute is set.
	 * @see #unsetPrimeMoverRating()
	 * @see #getPrimeMoverRating()
	 * @see #setPrimeMoverRating(float)
	 * @generated
	 */
	public boolean isSetPrimeMoverRating() {
		return primeMoverRatingESet;
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronousMachines()).basicAdd(otherEnd, msgs);
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return ((InternalEList<?>)getSynchronousMachines()).basicRemove(otherEnd, msgs);
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return getSynchronousMachines();
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				return getPrimeMoverRating();
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				getSynchronousMachines().addAll((Collection<? extends SynchronousMachine>)newValue);
				return;
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				setPrimeMoverRating((Float)newValue);
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				getSynchronousMachines().clear();
				return;
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				unsetPrimeMoverRating();
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
			case GenerationDynamicsPackage.PRIME_MOVER__SYNCHRONOUS_MACHINES:
				return synchronousMachines != null && !synchronousMachines.isEmpty();
			case GenerationDynamicsPackage.PRIME_MOVER__PRIME_MOVER_RATING:
				return isSetPrimeMoverRating();
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
		result.append(" (primeMoverRating: ");
		if (primeMoverRatingESet) result.append(primeMoverRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PrimeMover
