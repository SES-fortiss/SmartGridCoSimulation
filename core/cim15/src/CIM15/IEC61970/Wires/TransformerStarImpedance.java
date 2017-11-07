/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Star Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getTransformerEnd <em>Transformer End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerStarImpedance extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected float x0 = X0_EDEFAULT;

	/**
	 * This is true if the X0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x0ESet;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * This is true if the R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rESet;

	/**
	 * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected float r0 = R0_EDEFAULT;

	/**
	 * This is true if the R0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean r0ESet;

	/**
	 * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerEnd> transformerEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerStarImpedance() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_STAR_IMPEDANCE;
	}

	/**
	 * Returns the value of the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' attribute.
	 * @see #isSetX0()
	 * @see #unsetX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public float getX0() {
		return x0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #isSetX0()
	 * @see #unsetX0()
	 * @see #getX0()
	 * @generated
	 */
	public void setX0(float newX0) {
		x0 = newX0;
		x0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX0()
	 * @see #getX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public void unsetX0() {
		x0 = X0_EDEFAULT;
		x0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX0 <em>X0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X0</em>' attribute is set.
	 * @see #unsetX0()
	 * @see #getX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public boolean isSetX0() {
		return x0ESet;
	}

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	public void setX(float newX) {
		x = newX;
		xESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public void unsetX() {
		x = X_EDEFAULT;
		xESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #setR(float)
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #getR()
	 * @generated
	 */
	public void setR(float newR) {
		r = newR;
		rESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public void unsetR() {
		r = R_EDEFAULT;
		rESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR <em>R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R</em>' attribute is set.
	 * @see #unsetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public boolean isSetR() {
		return rESet;
	}

	/**
	 * Returns the value of the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' attribute.
	 * @see #isSetR0()
	 * @see #unsetR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public float getR0() {
		return r0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #isSetR0()
	 * @see #unsetR0()
	 * @see #getR0()
	 * @generated
	 */
	public void setR0(float newR0) {
		r0 = newR0;
		r0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR0()
	 * @see #getR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public void unsetR0() {
		r0 = R0_EDEFAULT;
		r0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerStarImpedance#getR0 <em>R0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R0</em>' attribute is set.
	 * @see #unsetR0()
	 * @see #getR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public boolean isSetR0() {
		return r0ESet;
	}

	/**
	 * Returns the value of the '<em><b>Transformer End</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerEnd}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getStarImpedance <em>Star Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getStarImpedance
	 * @generated
	 */
	public EList<TransformerEnd> getTransformerEnd() {
		if (transformerEnd == null) {
			transformerEnd = new BasicInternalEList<TransformerEnd>(TransformerEnd.class);
		}
		return transformerEnd;
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
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerEnd()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
				return ((InternalEList<?>)getTransformerEnd()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
				return getX0();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X:
				return getX();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R:
				return getR();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
				return getR0();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
				return getTransformerEnd();
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
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X:
				setX((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R:
				setR((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
				getTransformerEnd().clear();
				getTransformerEnd().addAll((Collection<? extends TransformerEnd>)newValue);
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
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
				unsetX0();
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X:
				unsetX();
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R:
				unsetR();
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
				unsetR0();
				return;
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
				getTransformerEnd().clear();
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
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X0:
				return isSetX0();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__X:
				return isSetX();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R:
				return isSetR();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__R0:
				return isSetR0();
			case WiresPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END:
				return transformerEnd != null && !transformerEnd.isEmpty();
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
		result.append(" (x0: ");
		if (x0ESet) result.append(x0); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerStarImpedance
