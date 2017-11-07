/**
 */
package CIM15.IEC61970.Generation.Production;

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
 * A representation of the model object '<em><b>Combined Cycle Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedCyclePlant extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getCombCyclePlantRating() <em>Comb Cycle Plant Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombCyclePlantRating()
	 * @generated
	 * @ordered
	 */
	protected static final float COMB_CYCLE_PLANT_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCombCyclePlantRating() <em>Comb Cycle Plant Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombCyclePlantRating()
	 * @generated
	 * @ordered
	 */
	protected float combCyclePlantRating = COMB_CYCLE_PLANT_RATING_EDEFAULT;

	/**
	 * This is true if the Comb Cycle Plant Rating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean combCyclePlantRatingESet;

	/**
	 * The cached value of the '{@link #getThermalGeneratingUnits() <em>Thermal Generating Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalGeneratingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<ThermalGeneratingUnit> thermalGeneratingUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedCyclePlant() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.COMBINED_CYCLE_PLANT;
	}

	/**
	 * Returns the value of the '<em><b>Comb Cycle Plant Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comb Cycle Plant Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comb Cycle Plant Rating</em>' attribute.
	 * @see #isSetCombCyclePlantRating()
	 * @see #unsetCombCyclePlantRating()
	 * @see #setCombCyclePlantRating(float)
	 * @generated
	 */
	public float getCombCyclePlantRating() {
		return combCyclePlantRating;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comb Cycle Plant Rating</em>' attribute.
	 * @see #isSetCombCyclePlantRating()
	 * @see #unsetCombCyclePlantRating()
	 * @see #getCombCyclePlantRating()
	 * @generated
	 */
	public void setCombCyclePlantRating(float newCombCyclePlantRating) {
		combCyclePlantRating = newCombCyclePlantRating;
		combCyclePlantRatingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCombCyclePlantRating()
	 * @see #getCombCyclePlantRating()
	 * @see #setCombCyclePlantRating(float)
	 * @generated
	 */
	public void unsetCombCyclePlantRating() {
		combCyclePlantRating = COMB_CYCLE_PLANT_RATING_EDEFAULT;
		combCyclePlantRatingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comb Cycle Plant Rating</em>' attribute is set.
	 * @see #unsetCombCyclePlantRating()
	 * @see #getCombCyclePlantRating()
	 * @see #setCombCyclePlantRating(float)
	 * @generated
	 */
	public boolean isSetCombCyclePlantRating() {
		return combCyclePlantRatingESet;
	}

	/**
	 * Returns the value of the '<em><b>Thermal Generating Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Generating Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Generating Units</em>' reference list.
	 * @see CIM15.IEC61970.Generation.Production.ThermalGeneratingUnit#getCombinedCyclePlant
	 * @generated
	 */
	public EList<ThermalGeneratingUnit> getThermalGeneratingUnits() {
		if (thermalGeneratingUnits == null) {
			thermalGeneratingUnits = new BasicInternalEList<ThermalGeneratingUnit>(ThermalGeneratingUnit.class);
		}
		return thermalGeneratingUnits;
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThermalGeneratingUnits()).basicAdd(otherEnd, msgs);
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				return ((InternalEList<?>)getThermalGeneratingUnits()).basicRemove(otherEnd, msgs);
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				return getCombCyclePlantRating();
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				return getThermalGeneratingUnits();
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				setCombCyclePlantRating((Float)newValue);
				return;
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
				getThermalGeneratingUnits().addAll((Collection<? extends ThermalGeneratingUnit>)newValue);
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				unsetCombCyclePlantRating();
				return;
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				getThermalGeneratingUnits().clear();
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
			case ProductionPackage.COMBINED_CYCLE_PLANT__COMB_CYCLE_PLANT_RATING:
				return isSetCombCyclePlantRating();
			case ProductionPackage.COMBINED_CYCLE_PLANT__THERMAL_GENERATING_UNITS:
				return thermalGeneratingUnits != null && !thermalGeneratingUnits.isEmpty();
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
		result.append(" (combCyclePlantRating: ");
		if (combCyclePlantRatingESet) result.append(combCyclePlantRating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CombinedCyclePlant
