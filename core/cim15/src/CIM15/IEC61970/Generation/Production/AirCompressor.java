/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine;
import CIM15.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Air Compressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AirCompressor extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getAirCompressorRating() <em>Air Compressor Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressorRating()
	 * @generated
	 * @ordered
	 */
	protected static final float AIR_COMPRESSOR_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAirCompressorRating() <em>Air Compressor Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirCompressorRating()
	 * @generated
	 * @ordered
	 */
	protected float airCompressorRating = AIR_COMPRESSOR_RATING_EDEFAULT;

	/**
	 * This is true if the Air Compressor Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean airCompressorRatingESet;

	/**
	 * The cached value of the '{@link #getCombustionTurbine() <em>Combustion Turbine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTurbine()
	 * @generated
	 * @ordered
	 */
	protected CombustionTurbine combustionTurbine;

	/**
	 * The cached value of the '{@link #getCAESPlant() <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAESPlant()
	 * @generated
	 * @ordered
	 */
	protected CAESPlant caesPlant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirCompressor() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.AIR_COMPRESSOR;
	}

	/**
	 * Returns the value of the '<em><b>Air Compressor Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air Compressor Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Compressor Rating</em>' attribute.
	 * @see #isSetAirCompressorRating()
	 * @see #unsetAirCompressorRating()
	 * @see #setAirCompressorRating(float)
	 * @generated
	 */
	public float getAirCompressorRating() {
		return airCompressorRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Compressor Rating</em>' attribute.
	 * @see #isSetAirCompressorRating()
	 * @see #unsetAirCompressorRating()
	 * @see #getAirCompressorRating()
	 * @generated
	 */
	public void setAirCompressorRating(float newAirCompressorRating) {
		airCompressorRating = newAirCompressorRating;
		airCompressorRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAirCompressorRating()
	 * @see #getAirCompressorRating()
	 * @see #setAirCompressorRating(float)
	 * @generated
	 */
	public void unsetAirCompressorRating() {
		airCompressorRating = AIR_COMPRESSOR_RATING_EDEFAULT;
		airCompressorRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getAirCompressorRating <em>Air Compressor Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Air Compressor Rating</em>' attribute is set.
	 * @see #unsetAirCompressorRating()
	 * @see #getAirCompressorRating()
	 * @see #setAirCompressorRating(float)
	 * @generated
	 */
	public boolean isSetAirCompressorRating() {
		return airCompressorRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Combustion Turbine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Turbine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Turbine</em>' reference.
	 * @see #setCombustionTurbine(CombustionTurbine)
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.CombustionTurbine#getAirCompressor
	 * @generated
	 */
	public CombustionTurbine getCombustionTurbine() {
		if (combustionTurbine != null && combustionTurbine.eIsProxy()) {
			InternalEObject oldCombustionTurbine = (InternalEObject)combustionTurbine;
			combustionTurbine = (CombustionTurbine)eResolveProxy(oldCombustionTurbine);
			if (combustionTurbine != oldCombustionTurbine) {
			}
		}
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombustionTurbine basicGetCombustionTurbine() {
		return combustionTurbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombustionTurbine(CombustionTurbine newCombustionTurbine, NotificationChain msgs) {
		CombustionTurbine oldCombustionTurbine = combustionTurbine;
		combustionTurbine = newCombustionTurbine;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCombustionTurbine <em>Combustion Turbine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combustion Turbine</em>' reference.
	 * @see #getCombustionTurbine()
	 * @generated
	 */
	public void setCombustionTurbine(CombustionTurbine newCombustionTurbine) {
		if (newCombustionTurbine != combustionTurbine) {
			NotificationChain msgs = null;
			if (combustionTurbine != null)
				msgs = ((InternalEObject)combustionTurbine).eInverseRemove(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs);
			if (newCombustionTurbine != null)
				msgs = ((InternalEObject)newCombustionTurbine).eInverseAdd(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs);
			msgs = basicSetCombustionTurbine(newCombustionTurbine, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>CAES Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.CAESPlant#getAirCompressor <em>Air Compressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CAES Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CAES Plant</em>' reference.
	 * @see #setCAESPlant(CAESPlant)
	 * @see CIM15.IEC61970.Generation.Production.CAESPlant#getAirCompressor
	 * @generated
	 */
	public CAESPlant getCAESPlant() {
		if (caesPlant != null && caesPlant.eIsProxy()) {
			InternalEObject oldCAESPlant = (InternalEObject)caesPlant;
			caesPlant = (CAESPlant)eResolveProxy(oldCAESPlant);
			if (caesPlant != oldCAESPlant) {
			}
		}
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAESPlant basicGetCAESPlant() {
		return caesPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCAESPlant(CAESPlant newCAESPlant, NotificationChain msgs) {
		CAESPlant oldCAESPlant = caesPlant;
		caesPlant = newCAESPlant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.AirCompressor#getCAESPlant <em>CAES Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAES Plant</em>' reference.
	 * @see #getCAESPlant()
	 * @generated
	 */
	public void setCAESPlant(CAESPlant newCAESPlant) {
		if (newCAESPlant != caesPlant) {
			NotificationChain msgs = null;
			if (caesPlant != null)
				msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs);
			if (newCAESPlant != null)
				msgs = ((InternalEObject)newCAESPlant).eInverseAdd(this, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs);
			msgs = basicSetCAESPlant(newCAESPlant, msgs);
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
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				if (combustionTurbine != null)
					msgs = ((InternalEObject)combustionTurbine).eInverseRemove(this, GenerationDynamicsPackage.COMBUSTION_TURBINE__AIR_COMPRESSOR, CombustionTurbine.class, msgs);
				return basicSetCombustionTurbine((CombustionTurbine)otherEnd, msgs);
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				if (caesPlant != null)
					msgs = ((InternalEObject)caesPlant).eInverseRemove(this, ProductionPackage.CAES_PLANT__AIR_COMPRESSOR, CAESPlant.class, msgs);
				return basicSetCAESPlant((CAESPlant)otherEnd, msgs);
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
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				return basicSetCombustionTurbine(null, msgs);
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				return basicSetCAESPlant(null, msgs);
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
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				return getAirCompressorRating();
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				if (resolve) return getCombustionTurbine();
				return basicGetCombustionTurbine();
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				if (resolve) return getCAESPlant();
				return basicGetCAESPlant();
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
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				setAirCompressorRating((Float)newValue);
				return;
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				setCombustionTurbine((CombustionTurbine)newValue);
				return;
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				setCAESPlant((CAESPlant)newValue);
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
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				unsetAirCompressorRating();
				return;
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				setCombustionTurbine((CombustionTurbine)null);
				return;
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				setCAESPlant((CAESPlant)null);
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
			case ProductionPackage.AIR_COMPRESSOR__AIR_COMPRESSOR_RATING:
				return isSetAirCompressorRating();
			case ProductionPackage.AIR_COMPRESSOR__COMBUSTION_TURBINE:
				return combustionTurbine != null;
			case ProductionPackage.AIR_COMPRESSOR__CAES_PLANT:
				return caesPlant != null;
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
		result.append(" (airCompressorRating: ");
		if (airCompressorRatingESet) result.append(airCompressorRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // AirCompressor
