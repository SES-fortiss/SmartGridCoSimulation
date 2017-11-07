/**
 */
package CIM15.IEC61970.Wires;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Transformer End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB0 <em>B0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG0 <em>G0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB <em>B</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG <em>G</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerTransformerEnd extends TransformerEnd {
	/**
	 * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformer()
	 * @generated
	 * @ordered
	 */
	protected PowerTransformer powerTransformer;

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
	 * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected float b0 = B0_EDEFAULT;

	/**
	 * This is true if the B0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean b0ESet;

	/**
	 * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected float g0 = G0_EDEFAULT;

	/**
	 * This is true if the G0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean g0ESet;

	/**
	 * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_S_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedS()
	 * @generated
	 * @ordered
	 */
	protected float ratedS = RATED_S_EDEFAULT;

	/**
	 * This is true if the Rated S attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedSESet;

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
	 * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedU()
	 * @generated
	 * @ordered
	 */
	protected float ratedU = RATED_U_EDEFAULT;

	/**
	 * This is true if the Rated U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedUESet;

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
	 * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected static final WindingConnection CONNECTION_KIND_EDEFAULT = WindingConnection.Z;

	/**
	 * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionKind()
	 * @generated
	 * @ordered
	 */
	protected WindingConnection connectionKind = CONNECTION_KIND_EDEFAULT;

	/**
	 * This is true if the Connection Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerTransformerEnd() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.POWER_TRANSFORMER_END;
	}

	/**
	 * Returns the value of the '<em><b>Power Transformer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerEnd <em>Power Transformer End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Transformer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Transformer</em>' reference.
	 * @see #setPowerTransformer(PowerTransformer)
	 * @see CIM15.IEC61970.Wires.PowerTransformer#getPowerTransformerEnd
	 * @generated
	 */
	public PowerTransformer getPowerTransformer() {
		if (powerTransformer != null && powerTransformer.eIsProxy()) {
			InternalEObject oldPowerTransformer = (InternalEObject)powerTransformer;
			powerTransformer = (PowerTransformer)eResolveProxy(oldPowerTransformer);
			if (powerTransformer != oldPowerTransformer) {
			}
		}
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer basicGetPowerTransformer() {
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerTransformer(PowerTransformer newPowerTransformer, NotificationChain msgs) {
		PowerTransformer oldPowerTransformer = powerTransformer;
		powerTransformer = newPowerTransformer;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getPowerTransformer <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Transformer</em>' reference.
	 * @see #getPowerTransformer()
	 * @generated
	 */
	public void setPowerTransformer(PowerTransformer newPowerTransformer) {
		if (newPowerTransformer != powerTransformer) {
			NotificationChain msgs = null;
			if (powerTransformer != null)
				msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs);
			if (newPowerTransformer != null)
				msgs = ((InternalEObject)newPowerTransformer).eInverseAdd(this, WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs);
			msgs = basicSetPowerTransformer(newPowerTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX0 <em>X0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX0 <em>X0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX0 <em>X0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0</em>' attribute.
	 * @see #isSetB0()
	 * @see #unsetB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public float getB0() {
		return b0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0</em>' attribute.
	 * @see #isSetB0()
	 * @see #unsetB0()
	 * @see #getB0()
	 * @generated
	 */
	public void setB0(float newB0) {
		b0 = newB0;
		b0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB0()
	 * @see #getB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public void unsetB0() {
		b0 = B0_EDEFAULT;
		b0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB0 <em>B0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B0</em>' attribute is set.
	 * @see #unsetB0()
	 * @see #getB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public boolean isSetB0() {
		return b0ESet;
	}

	/**
	 * Returns the value of the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0</em>' attribute.
	 * @see #isSetG0()
	 * @see #unsetG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public float getG0() {
		return g0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0</em>' attribute.
	 * @see #isSetG0()
	 * @see #unsetG0()
	 * @see #getG0()
	 * @generated
	 */
	public void setG0(float newG0) {
		g0 = newG0;
		g0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG0()
	 * @see #getG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public void unsetG0() {
		g0 = G0_EDEFAULT;
		g0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG0 <em>G0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G0</em>' attribute is set.
	 * @see #unsetG0()
	 * @see #getG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public boolean isSetG0() {
		return g0ESet;
	}

	/**
	 * Returns the value of the '<em><b>Rated S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated S</em>' attribute.
	 * @see #isSetRatedS()
	 * @see #unsetRatedS()
	 * @see #setRatedS(float)
	 * @generated
	 */
	public float getRatedS() {
		return ratedS;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated S</em>' attribute.
	 * @see #isSetRatedS()
	 * @see #unsetRatedS()
	 * @see #getRatedS()
	 * @generated
	 */
	public void setRatedS(float newRatedS) {
		ratedS = newRatedS;
		ratedSESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedS <em>Rated S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedS()
	 * @see #getRatedS()
	 * @see #setRatedS(float)
	 * @generated
	 */
	public void unsetRatedS() {
		ratedS = RATED_S_EDEFAULT;
		ratedSESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedS <em>Rated S</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated S</em>' attribute is set.
	 * @see #unsetRatedS()
	 * @see #getRatedS()
	 * @see #setRatedS(float)
	 * @generated
	 */
	public boolean isSetRatedS() {
		return ratedSESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB <em>B</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB <em>B</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getB <em>B</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated U</em>' attribute.
	 * @see #isSetRatedU()
	 * @see #unsetRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public float getRatedU() {
		return ratedU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated U</em>' attribute.
	 * @see #isSetRatedU()
	 * @see #unsetRatedU()
	 * @see #getRatedU()
	 * @generated
	 */
	public void setRatedU(float newRatedU) {
		ratedU = newRatedU;
		ratedUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedU()
	 * @see #getRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public void unsetRatedU() {
		ratedU = RATED_U_EDEFAULT;
		ratedUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getRatedU <em>Rated U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated U</em>' attribute is set.
	 * @see #unsetRatedU()
	 * @see #getRatedU()
	 * @see #setRatedU(float)
	 * @generated
	 */
	public boolean isSetRatedU() {
		return ratedUESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG <em>G</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG <em>G</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getG <em>G</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR <em>R</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR <em>R</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR <em>R</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX <em>X</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getX <em>X</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR0 <em>R0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR0 <em>R0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getR0 <em>R0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Connection Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.WindingConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Kind</em>' attribute.
	 * @see CIM15.IEC61970.Wires.WindingConnection
	 * @see #isSetConnectionKind()
	 * @see #unsetConnectionKind()
	 * @see #setConnectionKind(WindingConnection)
	 * @generated
	 */
	public WindingConnection getConnectionKind() {
		return connectionKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Kind</em>' attribute.
	 * @see CIM15.IEC61970.Wires.WindingConnection
	 * @see #isSetConnectionKind()
	 * @see #unsetConnectionKind()
	 * @see #getConnectionKind()
	 * @generated
	 */
	public void setConnectionKind(WindingConnection newConnectionKind) {
		connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
		connectionKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectionKind()
	 * @see #getConnectionKind()
	 * @see #setConnectionKind(WindingConnection)
	 * @generated
	 */
	public void unsetConnectionKind() {
		connectionKind = CONNECTION_KIND_EDEFAULT;
		connectionKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.PowerTransformerEnd#getConnectionKind <em>Connection Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connection Kind</em>' attribute is set.
	 * @see #unsetConnectionKind()
	 * @see #getConnectionKind()
	 * @see #setConnectionKind(WindingConnection)
	 * @generated
	 */
	public boolean isSetConnectionKind() {
		return connectionKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
				if (powerTransformer != null)
					msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs);
				return basicSetPowerTransformer((PowerTransformer)otherEnd, msgs);
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
			case WiresPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
				return basicSetPowerTransformer(null, msgs);
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
			case WiresPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
				if (resolve) return getPowerTransformer();
				return basicGetPowerTransformer();
			case WiresPackage.POWER_TRANSFORMER_END__X0:
				return getX0();
			case WiresPackage.POWER_TRANSFORMER_END__B0:
				return getB0();
			case WiresPackage.POWER_TRANSFORMER_END__G0:
				return getG0();
			case WiresPackage.POWER_TRANSFORMER_END__RATED_S:
				return getRatedS();
			case WiresPackage.POWER_TRANSFORMER_END__B:
				return getB();
			case WiresPackage.POWER_TRANSFORMER_END__RATED_U:
				return getRatedU();
			case WiresPackage.POWER_TRANSFORMER_END__G:
				return getG();
			case WiresPackage.POWER_TRANSFORMER_END__R:
				return getR();
			case WiresPackage.POWER_TRANSFORMER_END__X:
				return getX();
			case WiresPackage.POWER_TRANSFORMER_END__R0:
				return getR0();
			case WiresPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
				return getConnectionKind();
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
			case WiresPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__B0:
				setB0((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__G0:
				setG0((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__RATED_S:
				setRatedS((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__B:
				setB((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__RATED_U:
				setRatedU((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__G:
				setG((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__R:
				setR((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__X:
				setX((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
				setConnectionKind((WindingConnection)newValue);
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
			case WiresPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)null);
				return;
			case WiresPackage.POWER_TRANSFORMER_END__X0:
				unsetX0();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__B0:
				unsetB0();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__G0:
				unsetG0();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__RATED_S:
				unsetRatedS();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__B:
				unsetB();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__RATED_U:
				unsetRatedU();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__G:
				unsetG();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__R:
				unsetR();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__X:
				unsetX();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__R0:
				unsetR0();
				return;
			case WiresPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
				unsetConnectionKind();
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
			case WiresPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
				return powerTransformer != null;
			case WiresPackage.POWER_TRANSFORMER_END__X0:
				return isSetX0();
			case WiresPackage.POWER_TRANSFORMER_END__B0:
				return isSetB0();
			case WiresPackage.POWER_TRANSFORMER_END__G0:
				return isSetG0();
			case WiresPackage.POWER_TRANSFORMER_END__RATED_S:
				return isSetRatedS();
			case WiresPackage.POWER_TRANSFORMER_END__B:
				return isSetB();
			case WiresPackage.POWER_TRANSFORMER_END__RATED_U:
				return isSetRatedU();
			case WiresPackage.POWER_TRANSFORMER_END__G:
				return isSetG();
			case WiresPackage.POWER_TRANSFORMER_END__R:
				return isSetR();
			case WiresPackage.POWER_TRANSFORMER_END__X:
				return isSetX();
			case WiresPackage.POWER_TRANSFORMER_END__R0:
				return isSetR0();
			case WiresPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
				return isSetConnectionKind();
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
		result.append(", b0: ");
		if (b0ESet) result.append(b0); else result.append("<unset>");
		result.append(", g0: ");
		if (g0ESet) result.append(g0); else result.append("<unset>");
		result.append(", ratedS: ");
		if (ratedSESet) result.append(ratedS); else result.append("<unset>");
		result.append(", b: ");
		if (bESet) result.append(b); else result.append("<unset>");
		result.append(", ratedU: ");
		if (ratedUESet) result.append(ratedU); else result.append("<unset>");
		result.append(", g: ");
		if (gESet) result.append(g); else result.append("<unset>");
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(", connectionKind: ");
		if (connectionKindESet) result.append(connectionKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PowerTransformerEnd
