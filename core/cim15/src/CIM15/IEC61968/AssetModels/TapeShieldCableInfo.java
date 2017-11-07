/**
 */
package CIM15.IEC61968.AssetModels;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tape Shield Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}</li>
 *   <li>{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TapeShieldCableInfo extends CableInfo {
	/**
	 * The default value of the '{@link #getTapeLap() <em>Tape Lap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeLap()
	 * @generated
	 * @ordered
	 */
	protected static final float TAPE_LAP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTapeLap() <em>Tape Lap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeLap()
	 * @generated
	 * @ordered
	 */
	protected float tapeLap = TAPE_LAP_EDEFAULT;

	/**
	 * This is true if the Tape Lap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tapeLapESet;

	/**
	 * The default value of the '{@link #getTapeThickness() <em>Tape Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float TAPE_THICKNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTapeThickness() <em>Tape Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeThickness()
	 * @generated
	 * @ordered
	 */
	protected float tapeThickness = TAPE_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Tape Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tapeThicknessESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapeShieldCableInfo() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TAPE_SHIELD_CABLE_INFO;
	}

	/**
	 * Returns the value of the '<em><b>Tape Lap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tape Lap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tape Lap</em>' attribute.
	 * @see #isSetTapeLap()
	 * @see #unsetTapeLap()
	 * @see #setTapeLap(float)
	 * @generated
	 */
	public float getTapeLap() {
		return tapeLap;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tape Lap</em>' attribute.
	 * @see #isSetTapeLap()
	 * @see #unsetTapeLap()
	 * @see #getTapeLap()
	 * @generated
	 */
	public void setTapeLap(float newTapeLap) {
		tapeLap = newTapeLap;
		tapeLapESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTapeLap()
	 * @see #getTapeLap()
	 * @see #setTapeLap(float)
	 * @generated
	 */
	public void unsetTapeLap() {
		tapeLap = TAPE_LAP_EDEFAULT;
		tapeLapESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tape Lap</em>' attribute is set.
	 * @see #unsetTapeLap()
	 * @see #getTapeLap()
	 * @see #setTapeLap(float)
	 * @generated
	 */
	public boolean isSetTapeLap() {
		return tapeLapESet;
	}

	/**
	 * Returns the value of the '<em><b>Tape Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tape Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tape Thickness</em>' attribute.
	 * @see #isSetTapeThickness()
	 * @see #unsetTapeThickness()
	 * @see #setTapeThickness(float)
	 * @generated
	 */
	public float getTapeThickness() {
		return tapeThickness;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tape Thickness</em>' attribute.
	 * @see #isSetTapeThickness()
	 * @see #unsetTapeThickness()
	 * @see #getTapeThickness()
	 * @generated
	 */
	public void setTapeThickness(float newTapeThickness) {
		tapeThickness = newTapeThickness;
		tapeThicknessESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTapeThickness()
	 * @see #getTapeThickness()
	 * @see #setTapeThickness(float)
	 * @generated
	 */
	public void unsetTapeThickness() {
		tapeThickness = TAPE_THICKNESS_EDEFAULT;
		tapeThicknessESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tape Thickness</em>' attribute is set.
	 * @see #unsetTapeThickness()
	 * @see #getTapeThickness()
	 * @see #setTapeThickness(float)
	 * @generated
	 */
	public boolean isSetTapeThickness() {
		return tapeThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				return getTapeLap();
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				return getTapeThickness();
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
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				setTapeLap((Float)newValue);
				return;
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				setTapeThickness((Float)newValue);
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
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				unsetTapeLap();
				return;
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				unsetTapeThickness();
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
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				return isSetTapeLap();
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				return isSetTapeThickness();
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
		result.append(" (tapeLap: ");
		if (tapeLapESet) result.append(tapeLap); else result.append("<unset>");
		result.append(", tapeThickness: ");
		if (tapeThicknessESet) result.append(tapeThickness); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TapeShieldCableInfo
