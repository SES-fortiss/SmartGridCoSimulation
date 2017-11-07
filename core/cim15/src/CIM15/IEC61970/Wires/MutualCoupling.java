/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.Terminal;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutual Coupling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MutualCoupling extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getDistance12() <em>Distance12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance12()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE12_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance12() <em>Distance12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance12()
	 * @generated
	 * @ordered
	 */
	protected float distance12 = DISTANCE12_EDEFAULT;

	/**
	 * This is true if the Distance12 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distance12ESet;

	/**
	 * The default value of the '{@link #getDistance11() <em>Distance11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance11()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE11_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance11() <em>Distance11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance11()
	 * @generated
	 * @ordered
	 */
	protected float distance11 = DISTANCE11_EDEFAULT;

	/**
	 * This is true if the Distance11 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distance11ESet;

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
	 * The default value of the '{@link #getDistance22() <em>Distance22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance22()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE22_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance22() <em>Distance22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance22()
	 * @generated
	 * @ordered
	 */
	protected float distance22 = DISTANCE22_EDEFAULT;

	/**
	 * This is true if the Distance22 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distance22ESet;

	/**
	 * The default value of the '{@link #getDistance21() <em>Distance21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance21()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE21_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance21() <em>Distance21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance21()
	 * @generated
	 * @ordered
	 */
	protected float distance21 = DISTANCE21_EDEFAULT;

	/**
	 * This is true if the Distance21 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distance21ESet;

	/**
	 * The cached value of the '{@link #getFirst_Terminal() <em>First Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst_Terminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal first_Terminal;

	/**
	 * The default value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0ch()
	 * @generated
	 * @ordered
	 */
	protected static final float B0CH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0ch()
	 * @generated
	 * @ordered
	 */
	protected float b0ch = B0CH_EDEFAULT;

	/**
	 * This is true if the B0ch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean b0chESet;

	/**
	 * The cached value of the '{@link #getSecond_Terminal() <em>Second Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond_Terminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal second_Terminal;

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
	 * The default value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0ch()
	 * @generated
	 * @ordered
	 */
	protected static final float G0CH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0ch()
	 * @generated
	 * @ordered
	 */
	protected float g0ch = G0CH_EDEFAULT;

	/**
	 * This is true if the G0ch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean g0chESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualCoupling() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.MUTUAL_COUPLING;
	}

	/**
	 * Returns the value of the '<em><b>Distance12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance12</em>' attribute.
	 * @see #isSetDistance12()
	 * @see #unsetDistance12()
	 * @see #setDistance12(float)
	 * @generated
	 */
	public float getDistance12() {
		return distance12;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance12</em>' attribute.
	 * @see #isSetDistance12()
	 * @see #unsetDistance12()
	 * @see #getDistance12()
	 * @generated
	 */
	public void setDistance12(float newDistance12) {
		distance12 = newDistance12;
		distance12ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance12()
	 * @see #getDistance12()
	 * @see #setDistance12(float)
	 * @generated
	 */
	public void unsetDistance12() {
		distance12 = DISTANCE12_EDEFAULT;
		distance12ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance12 <em>Distance12</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance12</em>' attribute is set.
	 * @see #unsetDistance12()
	 * @see #getDistance12()
	 * @see #setDistance12(float)
	 * @generated
	 */
	public boolean isSetDistance12() {
		return distance12ESet;
	}

	/**
	 * Returns the value of the '<em><b>Distance11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance11</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance11</em>' attribute.
	 * @see #isSetDistance11()
	 * @see #unsetDistance11()
	 * @see #setDistance11(float)
	 * @generated
	 */
	public float getDistance11() {
		return distance11;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance11</em>' attribute.
	 * @see #isSetDistance11()
	 * @see #unsetDistance11()
	 * @see #getDistance11()
	 * @generated
	 */
	public void setDistance11(float newDistance11) {
		distance11 = newDistance11;
		distance11ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance11()
	 * @see #getDistance11()
	 * @see #setDistance11(float)
	 * @generated
	 */
	public void unsetDistance11() {
		distance11 = DISTANCE11_EDEFAULT;
		distance11ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance11 <em>Distance11</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance11</em>' attribute is set.
	 * @see #unsetDistance11()
	 * @see #getDistance11()
	 * @see #setDistance11(float)
	 * @generated
	 */
	public boolean isSetDistance11() {
		return distance11ESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getR0 <em>R0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Distance22</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance22</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance22</em>' attribute.
	 * @see #isSetDistance22()
	 * @see #unsetDistance22()
	 * @see #setDistance22(float)
	 * @generated
	 */
	public float getDistance22() {
		return distance22;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance22</em>' attribute.
	 * @see #isSetDistance22()
	 * @see #unsetDistance22()
	 * @see #getDistance22()
	 * @generated
	 */
	public void setDistance22(float newDistance22) {
		distance22 = newDistance22;
		distance22ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance22()
	 * @see #getDistance22()
	 * @see #setDistance22(float)
	 * @generated
	 */
	public void unsetDistance22() {
		distance22 = DISTANCE22_EDEFAULT;
		distance22ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance22 <em>Distance22</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance22</em>' attribute is set.
	 * @see #unsetDistance22()
	 * @see #getDistance22()
	 * @see #setDistance22(float)
	 * @generated
	 */
	public boolean isSetDistance22() {
		return distance22ESet;
	}

	/**
	 * Returns the value of the '<em><b>Distance21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance21</em>' attribute.
	 * @see #isSetDistance21()
	 * @see #unsetDistance21()
	 * @see #setDistance21(float)
	 * @generated
	 */
	public float getDistance21() {
		return distance21;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance21</em>' attribute.
	 * @see #isSetDistance21()
	 * @see #unsetDistance21()
	 * @see #getDistance21()
	 * @generated
	 */
	public void setDistance21(float newDistance21) {
		distance21 = newDistance21;
		distance21ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance21()
	 * @see #getDistance21()
	 * @see #setDistance21(float)
	 * @generated
	 */
	public void unsetDistance21() {
		distance21 = DISTANCE21_EDEFAULT;
		distance21ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getDistance21 <em>Distance21</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance21</em>' attribute is set.
	 * @see #unsetDistance21()
	 * @see #getDistance21()
	 * @see #setDistance21(float)
	 * @generated
	 */
	public boolean isSetDistance21() {
		return distance21ESet;
	}

	/**
	 * Returns the value of the '<em><b>First Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getHasFirst_MutualCoupling <em>Has First Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Terminal</em>' reference.
	 * @see #setFirst_Terminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getHasFirst_MutualCoupling
	 * @generated
	 */
	public Terminal getFirst_Terminal() {
		if (first_Terminal != null && first_Terminal.eIsProxy()) {
			InternalEObject oldFirst_Terminal = (InternalEObject)first_Terminal;
			first_Terminal = (Terminal)eResolveProxy(oldFirst_Terminal);
			if (first_Terminal != oldFirst_Terminal) {
			}
		}
		return first_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetFirst_Terminal() {
		return first_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst_Terminal(Terminal newFirst_Terminal, NotificationChain msgs) {
		Terminal oldFirst_Terminal = first_Terminal;
		first_Terminal = newFirst_Terminal;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Terminal</em>' reference.
	 * @see #getFirst_Terminal()
	 * @generated
	 */
	public void setFirst_Terminal(Terminal newFirst_Terminal) {
		if (newFirst_Terminal != first_Terminal) {
			NotificationChain msgs = null;
			if (first_Terminal != null)
				msgs = ((InternalEObject)first_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs);
			if (newFirst_Terminal != null)
				msgs = ((InternalEObject)newFirst_Terminal).eInverseAdd(this, CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs);
			msgs = basicSetFirst_Terminal(newFirst_Terminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0ch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0ch</em>' attribute.
	 * @see #isSetB0ch()
	 * @see #unsetB0ch()
	 * @see #setB0ch(float)
	 * @generated
	 */
	public float getB0ch() {
		return b0ch;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0ch</em>' attribute.
	 * @see #isSetB0ch()
	 * @see #unsetB0ch()
	 * @see #getB0ch()
	 * @generated
	 */
	public void setB0ch(float newB0ch) {
		b0ch = newB0ch;
		b0chESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB0ch()
	 * @see #getB0ch()
	 * @see #setB0ch(float)
	 * @generated
	 */
	public void unsetB0ch() {
		b0ch = B0CH_EDEFAULT;
		b0chESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getB0ch <em>B0ch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B0ch</em>' attribute is set.
	 * @see #unsetB0ch()
	 * @see #getB0ch()
	 * @see #setB0ch(float)
	 * @generated
	 */
	public boolean isSetB0ch() {
		return b0chESet;
	}

	/**
	 * Returns the value of the '<em><b>Second Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getHasSecond_MutualCoupling <em>Has Second Mutual Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Terminal</em>' reference.
	 * @see #setSecond_Terminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getHasSecond_MutualCoupling
	 * @generated
	 */
	public Terminal getSecond_Terminal() {
		if (second_Terminal != null && second_Terminal.eIsProxy()) {
			InternalEObject oldSecond_Terminal = (InternalEObject)second_Terminal;
			second_Terminal = (Terminal)eResolveProxy(oldSecond_Terminal);
			if (second_Terminal != oldSecond_Terminal) {
			}
		}
		return second_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetSecond_Terminal() {
		return second_Terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond_Terminal(Terminal newSecond_Terminal, NotificationChain msgs) {
		Terminal oldSecond_Terminal = second_Terminal;
		second_Terminal = newSecond_Terminal;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Terminal</em>' reference.
	 * @see #getSecond_Terminal()
	 * @generated
	 */
	public void setSecond_Terminal(Terminal newSecond_Terminal) {
		if (newSecond_Terminal != second_Terminal) {
			NotificationChain msgs = null;
			if (second_Terminal != null)
				msgs = ((InternalEObject)second_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs);
			if (newSecond_Terminal != null)
				msgs = ((InternalEObject)newSecond_Terminal).eInverseAdd(this, CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs);
			msgs = basicSetSecond_Terminal(newSecond_Terminal, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getX0 <em>X0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0ch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0ch</em>' attribute.
	 * @see #isSetG0ch()
	 * @see #unsetG0ch()
	 * @see #setG0ch(float)
	 * @generated
	 */
	public float getG0ch() {
		return g0ch;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0ch</em>' attribute.
	 * @see #isSetG0ch()
	 * @see #unsetG0ch()
	 * @see #getG0ch()
	 * @generated
	 */
	public void setG0ch(float newG0ch) {
		g0ch = newG0ch;
		g0chESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG0ch()
	 * @see #getG0ch()
	 * @see #setG0ch(float)
	 * @generated
	 */
	public void unsetG0ch() {
		g0ch = G0CH_EDEFAULT;
		g0chESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.MutualCoupling#getG0ch <em>G0ch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G0ch</em>' attribute is set.
	 * @see #unsetG0ch()
	 * @see #getG0ch()
	 * @see #setG0ch(float)
	 * @generated
	 */
	public boolean isSetG0ch() {
		return g0chESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				if (first_Terminal != null)
					msgs = ((InternalEObject)first_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs);
				return basicSetFirst_Terminal((Terminal)otherEnd, msgs);
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				if (second_Terminal != null)
					msgs = ((InternalEObject)second_Terminal).eInverseRemove(this, CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs);
				return basicSetSecond_Terminal((Terminal)otherEnd, msgs);
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
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				return basicSetFirst_Terminal(null, msgs);
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				return basicSetSecond_Terminal(null, msgs);
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				return getDistance12();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				return getDistance11();
			case WiresPackage.MUTUAL_COUPLING__R0:
				return getR0();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				return getDistance22();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				return getDistance21();
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				if (resolve) return getFirst_Terminal();
				return basicGetFirst_Terminal();
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				return getB0ch();
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				if (resolve) return getSecond_Terminal();
				return basicGetSecond_Terminal();
			case WiresPackage.MUTUAL_COUPLING__X0:
				return getX0();
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				return getG0ch();
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				setDistance12((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				setDistance11((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				setDistance22((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				setDistance21((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				setFirst_Terminal((Terminal)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				setB0ch((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				setSecond_Terminal((Terminal)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				setG0ch((Float)newValue);
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				unsetDistance12();
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				unsetDistance11();
				return;
			case WiresPackage.MUTUAL_COUPLING__R0:
				unsetR0();
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				unsetDistance22();
				return;
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				unsetDistance21();
				return;
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				setFirst_Terminal((Terminal)null);
				return;
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				unsetB0ch();
				return;
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				setSecond_Terminal((Terminal)null);
				return;
			case WiresPackage.MUTUAL_COUPLING__X0:
				unsetX0();
				return;
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				unsetG0ch();
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
			case WiresPackage.MUTUAL_COUPLING__DISTANCE12:
				return isSetDistance12();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE11:
				return isSetDistance11();
			case WiresPackage.MUTUAL_COUPLING__R0:
				return isSetR0();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE22:
				return isSetDistance22();
			case WiresPackage.MUTUAL_COUPLING__DISTANCE21:
				return isSetDistance21();
			case WiresPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
				return first_Terminal != null;
			case WiresPackage.MUTUAL_COUPLING__B0CH:
				return isSetB0ch();
			case WiresPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
				return second_Terminal != null;
			case WiresPackage.MUTUAL_COUPLING__X0:
				return isSetX0();
			case WiresPackage.MUTUAL_COUPLING__G0CH:
				return isSetG0ch();
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
		result.append(" (distance12: ");
		if (distance12ESet) result.append(distance12); else result.append("<unset>");
		result.append(", distance11: ");
		if (distance11ESet) result.append(distance11); else result.append("<unset>");
		result.append(", r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(", distance22: ");
		if (distance22ESet) result.append(distance22); else result.append("<unset>");
		result.append(", distance21: ");
		if (distance21ESet) result.append(distance21); else result.append("<unset>");
		result.append(", b0ch: ");
		if (b0chESet) result.append(b0ch); else result.append("<unset>");
		result.append(", x0: ");
		if (x0ESet) result.append(x0); else result.append("<unset>");
		result.append(", g0ch: ");
		if (g0chESet) result.append(g0ch); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // MutualCoupling
