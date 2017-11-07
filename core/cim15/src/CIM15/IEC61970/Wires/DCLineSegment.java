/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCLineSegment extends Conductor {
	/**
	 * The default value of the '{@link #getDcSegmentInductance() <em>Dc Segment Inductance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentInductance()
	 * @generated
	 * @ordered
	 */
	protected static final float DC_SEGMENT_INDUCTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDcSegmentInductance() <em>Dc Segment Inductance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentInductance()
	 * @generated
	 * @ordered
	 */
	protected float dcSegmentInductance = DC_SEGMENT_INDUCTANCE_EDEFAULT;

	/**
	 * This is true if the Dc Segment Inductance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dcSegmentInductanceESet;

	/**
	 * The default value of the '{@link #getDcSegmentResistance() <em>Dc Segment Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentResistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DC_SEGMENT_RESISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDcSegmentResistance() <em>Dc Segment Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcSegmentResistance()
	 * @generated
	 * @ordered
	 */
	protected float dcSegmentResistance = DC_SEGMENT_RESISTANCE_EDEFAULT;

	/**
	 * This is true if the Dc Segment Resistance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dcSegmentResistanceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCLineSegment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.DC_LINE_SEGMENT;
	}

	/**
	 * Returns the value of the '<em><b>Dc Segment Inductance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dc Segment Inductance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dc Segment Inductance</em>' attribute.
	 * @see #isSetDcSegmentInductance()
	 * @see #unsetDcSegmentInductance()
	 * @see #setDcSegmentInductance(float)
	 * @generated
	 */
	public float getDcSegmentInductance() {
		return dcSegmentInductance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dc Segment Inductance</em>' attribute.
	 * @see #isSetDcSegmentInductance()
	 * @see #unsetDcSegmentInductance()
	 * @see #getDcSegmentInductance()
	 * @generated
	 */
	public void setDcSegmentInductance(float newDcSegmentInductance) {
		dcSegmentInductance = newDcSegmentInductance;
		dcSegmentInductanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDcSegmentInductance()
	 * @see #getDcSegmentInductance()
	 * @see #setDcSegmentInductance(float)
	 * @generated
	 */
	public void unsetDcSegmentInductance() {
		dcSegmentInductance = DC_SEGMENT_INDUCTANCE_EDEFAULT;
		dcSegmentInductanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentInductance <em>Dc Segment Inductance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dc Segment Inductance</em>' attribute is set.
	 * @see #unsetDcSegmentInductance()
	 * @see #getDcSegmentInductance()
	 * @see #setDcSegmentInductance(float)
	 * @generated
	 */
	public boolean isSetDcSegmentInductance() {
		return dcSegmentInductanceESet;
	}

	/**
	 * Returns the value of the '<em><b>Dc Segment Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dc Segment Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dc Segment Resistance</em>' attribute.
	 * @see #isSetDcSegmentResistance()
	 * @see #unsetDcSegmentResistance()
	 * @see #setDcSegmentResistance(float)
	 * @generated
	 */
	public float getDcSegmentResistance() {
		return dcSegmentResistance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dc Segment Resistance</em>' attribute.
	 * @see #isSetDcSegmentResistance()
	 * @see #unsetDcSegmentResistance()
	 * @see #getDcSegmentResistance()
	 * @generated
	 */
	public void setDcSegmentResistance(float newDcSegmentResistance) {
		dcSegmentResistance = newDcSegmentResistance;
		dcSegmentResistanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDcSegmentResistance()
	 * @see #getDcSegmentResistance()
	 * @see #setDcSegmentResistance(float)
	 * @generated
	 */
	public void unsetDcSegmentResistance() {
		dcSegmentResistance = DC_SEGMENT_RESISTANCE_EDEFAULT;
		dcSegmentResistanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.DCLineSegment#getDcSegmentResistance <em>Dc Segment Resistance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dc Segment Resistance</em>' attribute is set.
	 * @see #unsetDcSegmentResistance()
	 * @see #getDcSegmentResistance()
	 * @see #setDcSegmentResistance(float)
	 * @generated
	 */
	public boolean isSetDcSegmentResistance() {
		return dcSegmentResistanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				return getDcSegmentInductance();
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				return getDcSegmentResistance();
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
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				setDcSegmentInductance((Float)newValue);
				return;
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				setDcSegmentResistance((Float)newValue);
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
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				unsetDcSegmentInductance();
				return;
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				unsetDcSegmentResistance();
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
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_INDUCTANCE:
				return isSetDcSegmentInductance();
			case WiresPackage.DC_LINE_SEGMENT__DC_SEGMENT_RESISTANCE:
				return isSetDcSegmentResistance();
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
		result.append(" (dcSegmentInductance: ");
		if (dcSegmentInductanceESet) result.append(dcSegmentInductance); else result.append("<unset>");
		result.append(", dcSegmentResistance: ");
		if (dcSegmentResistanceESet) result.append(dcSegmentResistance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DCLineSegment
