/**
 */
package CIM15.IEC61970.Equivalents;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equivalent Shunt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getB <em>B</em>}</li>
 *   <li>{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getG <em>G</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquivalentShunt extends EquivalentEquipment {
	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

	/**
	 * This is true if the B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bESet;

	/**
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final float G_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected float g = G_EDEFAULT;

	/**
	 * This is true if the G attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquivalentShunt() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquivalentsPackage.Literals.EQUIVALENT_SHUNT;
	}

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #setB(float)
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #getB()
	 * @generated
	 */
	public void setB(float newB) {
		b = newB;
		bESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public void unsetB() {
		b = B_EDEFAULT;
		bESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getB <em>B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B</em>' attribute is set.
	 * @see #unsetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public boolean isSetB() {
		return bESet;
	}

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #isSetG()
	 * @see #unsetG()
	 * @see #setG(float)
	 * @generated
	 */
	public float getG() {
		return g;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #isSetG()
	 * @see #unsetG()
	 * @see #getG()
	 * @generated
	 */
	public void setG(float newG) {
		g = newG;
		gESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG()
	 * @see #getG()
	 * @see #setG(float)
	 * @generated
	 */
	public void unsetG() {
		g = G_EDEFAULT;
		gESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Equivalents.EquivalentShunt#getG <em>G</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G</em>' attribute is set.
	 * @see #unsetG()
	 * @see #getG()
	 * @see #setG(float)
	 * @generated
	 */
	public boolean isSetG() {
		return gESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				return getB();
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				return getG();
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
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				setB((Float)newValue);
				return;
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				setG((Float)newValue);
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
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				unsetB();
				return;
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				unsetG();
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
			case EquivalentsPackage.EQUIVALENT_SHUNT__B:
				return isSetB();
			case EquivalentsPackage.EQUIVALENT_SHUNT__G:
				return isSetG();
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
		result.append(" (b: ");
		if (bESet) result.append(b); else result.append("<unset>");
		result.append(", g: ");
		if (gESet) result.append(g); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EquivalentShunt
