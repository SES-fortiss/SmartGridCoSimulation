/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Core.ConductingEquipment;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnergySource extends ConductingEquipment {
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
	 * The default value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageMagnitude()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_MAGNITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageMagnitude()
	 * @generated
	 * @ordered
	 */
	protected float voltageMagnitude = VOLTAGE_MAGNITUDE_EDEFAULT;

	/**
	 * This is true if the Voltage Magnitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageMagnitudeESet;

	/**
	 * The default value of the '{@link #getXn() <em>Xn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXn()
	 * @generated
	 * @ordered
	 */
	protected static final float XN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXn() <em>Xn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXn()
	 * @generated
	 * @ordered
	 */
	protected float xn = XN_EDEFAULT;

	/**
	 * This is true if the Xn attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xnESet;

	/**
	 * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected float nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Nominal Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalVoltageESet;

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
	 * The default value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAngle()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAngle()
	 * @generated
	 * @ordered
	 */
	protected float voltageAngle = VOLTAGE_ANGLE_EDEFAULT;

	/**
	 * This is true if the Voltage Angle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageAngleESet;

	/**
	 * The default value of the '{@link #getRn() <em>Rn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRn()
	 * @generated
	 * @ordered
	 */
	protected static final float RN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRn() <em>Rn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRn()
	 * @generated
	 * @ordered
	 */
	protected float rn = RN_EDEFAULT;

	/**
	 * This is true if the Rn attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rnESet;

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
	 * The default value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePower()
	 * @generated
	 * @ordered
	 */
	protected float activePower = ACTIVE_POWER_EDEFAULT;

	/**
	 * This is true if the Active Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activePowerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergySource() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.ENERGY_SOURCE;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getR0 <em>R0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Voltage Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Magnitude</em>' attribute.
	 * @see #isSetVoltageMagnitude()
	 * @see #unsetVoltageMagnitude()
	 * @see #setVoltageMagnitude(float)
	 * @generated
	 */
	public float getVoltageMagnitude() {
		return voltageMagnitude;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Magnitude</em>' attribute.
	 * @see #isSetVoltageMagnitude()
	 * @see #unsetVoltageMagnitude()
	 * @see #getVoltageMagnitude()
	 * @generated
	 */
	public void setVoltageMagnitude(float newVoltageMagnitude) {
		voltageMagnitude = newVoltageMagnitude;
		voltageMagnitudeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageMagnitude()
	 * @see #getVoltageMagnitude()
	 * @see #setVoltageMagnitude(float)
	 * @generated
	 */
	public void unsetVoltageMagnitude() {
		voltageMagnitude = VOLTAGE_MAGNITUDE_EDEFAULT;
		voltageMagnitudeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageMagnitude <em>Voltage Magnitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Magnitude</em>' attribute is set.
	 * @see #unsetVoltageMagnitude()
	 * @see #getVoltageMagnitude()
	 * @see #setVoltageMagnitude(float)
	 * @generated
	 */
	public boolean isSetVoltageMagnitude() {
		return voltageMagnitudeESet;
	}

	/**
	 * Returns the value of the '<em><b>Xn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xn</em>' attribute.
	 * @see #isSetXn()
	 * @see #unsetXn()
	 * @see #setXn(float)
	 * @generated
	 */
	public float getXn() {
		return xn;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xn</em>' attribute.
	 * @see #isSetXn()
	 * @see #unsetXn()
	 * @see #getXn()
	 * @generated
	 */
	public void setXn(float newXn) {
		xn = newXn;
		xnESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXn()
	 * @see #getXn()
	 * @see #setXn(float)
	 * @generated
	 */
	public void unsetXn() {
		xn = XN_EDEFAULT;
		xnESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getXn <em>Xn</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xn</em>' attribute is set.
	 * @see #unsetXn()
	 * @see #getXn()
	 * @see #setXn(float)
	 * @generated
	 */
	public boolean isSetXn() {
		return xnESet;
	}

	/**
	 * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #isSetNominalVoltage()
	 * @see #unsetNominalVoltage()
	 * @see #setNominalVoltage(float)
	 * @generated
	 */
	public float getNominalVoltage() {
		return nominalVoltage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
	 * @see #isSetNominalVoltage()
	 * @see #unsetNominalVoltage()
	 * @see #getNominalVoltage()
	 * @generated
	 */
	public void setNominalVoltage(float newNominalVoltage) {
		nominalVoltage = newNominalVoltage;
		nominalVoltageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalVoltage()
	 * @see #getNominalVoltage()
	 * @see #setNominalVoltage(float)
	 * @generated
	 */
	public void unsetNominalVoltage() {
		nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;
		nominalVoltageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getNominalVoltage <em>Nominal Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Voltage</em>' attribute is set.
	 * @see #unsetNominalVoltage()
	 * @see #getNominalVoltage()
	 * @see #setNominalVoltage(float)
	 * @generated
	 */
	public boolean isSetNominalVoltage() {
		return nominalVoltageESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getX <em>X</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getX <em>X</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getR <em>R</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getR <em>R</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getR <em>R</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Voltage Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Angle</em>' attribute.
	 * @see #isSetVoltageAngle()
	 * @see #unsetVoltageAngle()
	 * @see #setVoltageAngle(float)
	 * @generated
	 */
	public float getVoltageAngle() {
		return voltageAngle;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Angle</em>' attribute.
	 * @see #isSetVoltageAngle()
	 * @see #unsetVoltageAngle()
	 * @see #getVoltageAngle()
	 * @generated
	 */
	public void setVoltageAngle(float newVoltageAngle) {
		voltageAngle = newVoltageAngle;
		voltageAngleESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageAngle()
	 * @see #getVoltageAngle()
	 * @see #setVoltageAngle(float)
	 * @generated
	 */
	public void unsetVoltageAngle() {
		voltageAngle = VOLTAGE_ANGLE_EDEFAULT;
		voltageAngleESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getVoltageAngle <em>Voltage Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Angle</em>' attribute is set.
	 * @see #unsetVoltageAngle()
	 * @see #getVoltageAngle()
	 * @see #setVoltageAngle(float)
	 * @generated
	 */
	public boolean isSetVoltageAngle() {
		return voltageAngleESet;
	}

	/**
	 * Returns the value of the '<em><b>Rn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rn</em>' attribute.
	 * @see #isSetRn()
	 * @see #unsetRn()
	 * @see #setRn(float)
	 * @generated
	 */
	public float getRn() {
		return rn;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rn</em>' attribute.
	 * @see #isSetRn()
	 * @see #unsetRn()
	 * @see #getRn()
	 * @generated
	 */
	public void setRn(float newRn) {
		rn = newRn;
		rnESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRn()
	 * @see #getRn()
	 * @see #setRn(float)
	 * @generated
	 */
	public void unsetRn() {
		rn = RN_EDEFAULT;
		rnESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getRn <em>Rn</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rn</em>' attribute is set.
	 * @see #unsetRn()
	 * @see #getRn()
	 * @see #setRn(float)
	 * @generated
	 */
	public boolean isSetRn() {
		return rnESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getX0 <em>X0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Active Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Power</em>' attribute.
	 * @see #isSetActivePower()
	 * @see #unsetActivePower()
	 * @see #setActivePower(float)
	 * @generated
	 */
	public float getActivePower() {
		return activePower;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Power</em>' attribute.
	 * @see #isSetActivePower()
	 * @see #unsetActivePower()
	 * @see #getActivePower()
	 * @generated
	 */
	public void setActivePower(float newActivePower) {
		activePower = newActivePower;
		activePowerESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivePower()
	 * @see #getActivePower()
	 * @see #setActivePower(float)
	 * @generated
	 */
	public void unsetActivePower() {
		activePower = ACTIVE_POWER_EDEFAULT;
		activePowerESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.EnergySource#getActivePower <em>Active Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active Power</em>' attribute is set.
	 * @see #unsetActivePower()
	 * @see #getActivePower()
	 * @see #setActivePower(float)
	 * @generated
	 */
	public boolean isSetActivePower() {
		return activePowerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.ENERGY_SOURCE__R0:
				return getR0();
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				return getVoltageMagnitude();
			case WiresPackage.ENERGY_SOURCE__XN:
				return getXn();
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				return getNominalVoltage();
			case WiresPackage.ENERGY_SOURCE__X:
				return getX();
			case WiresPackage.ENERGY_SOURCE__R:
				return getR();
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				return getVoltageAngle();
			case WiresPackage.ENERGY_SOURCE__RN:
				return getRn();
			case WiresPackage.ENERGY_SOURCE__X0:
				return getX0();
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				return getActivePower();
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
			case WiresPackage.ENERGY_SOURCE__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				setVoltageMagnitude((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__XN:
				setXn((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				setNominalVoltage((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__X:
				setX((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__R:
				setR((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				setVoltageAngle((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__RN:
				setRn((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				setActivePower((Float)newValue);
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
			case WiresPackage.ENERGY_SOURCE__R0:
				unsetR0();
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				unsetVoltageMagnitude();
				return;
			case WiresPackage.ENERGY_SOURCE__XN:
				unsetXn();
				return;
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				unsetNominalVoltage();
				return;
			case WiresPackage.ENERGY_SOURCE__X:
				unsetX();
				return;
			case WiresPackage.ENERGY_SOURCE__R:
				unsetR();
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				unsetVoltageAngle();
				return;
			case WiresPackage.ENERGY_SOURCE__RN:
				unsetRn();
				return;
			case WiresPackage.ENERGY_SOURCE__X0:
				unsetX0();
				return;
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				unsetActivePower();
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
			case WiresPackage.ENERGY_SOURCE__R0:
				return isSetR0();
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				return isSetVoltageMagnitude();
			case WiresPackage.ENERGY_SOURCE__XN:
				return isSetXn();
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				return isSetNominalVoltage();
			case WiresPackage.ENERGY_SOURCE__X:
				return isSetX();
			case WiresPackage.ENERGY_SOURCE__R:
				return isSetR();
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				return isSetVoltageAngle();
			case WiresPackage.ENERGY_SOURCE__RN:
				return isSetRn();
			case WiresPackage.ENERGY_SOURCE__X0:
				return isSetX0();
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				return isSetActivePower();
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
		result.append(" (r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(", voltageMagnitude: ");
		if (voltageMagnitudeESet) result.append(voltageMagnitude); else result.append("<unset>");
		result.append(", xn: ");
		if (xnESet) result.append(xn); else result.append("<unset>");
		result.append(", nominalVoltage: ");
		if (nominalVoltageESet) result.append(nominalVoltage); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", voltageAngle: ");
		if (voltageAngleESet) result.append(voltageAngle); else result.append("<unset>");
		result.append(", rn: ");
		if (rnESet) result.append(rn); else result.append("<unset>");
		result.append(", x0: ");
		if (x0ESet) result.append(x0); else result.append("<unset>");
		result.append(", activePower: ");
		if (activePowerESet) result.append(activePower); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // EnergySource
