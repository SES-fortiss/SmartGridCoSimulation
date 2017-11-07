/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.StateVariables.StateVariablesPackage;
import CIM15.IEC61970.StateVariables.SvShuntCompensatorSections;

import CIM15.IEC61970.WiresPhaseModel.ShuntCompensatorPhase;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getShuntCompensatorPhases <em>Shunt Compensator Phases</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuntCompensator extends RegulatingCondEq {
	/**
	 * The default value of the '{@link #getNomQ() <em>Nom Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomQ()
	 * @generated
	 * @ordered
	 */
	protected static final float NOM_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNomQ() <em>Nom Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomQ()
	 * @generated
	 * @ordered
	 */
	protected float nomQ = NOM_Q_EDEFAULT;

	/**
	 * This is true if the Nom Q attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nomQESet;

	/**
	 * The default value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxU() <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxU()
	 * @generated
	 * @ordered
	 */
	protected float maxU = MAX_U_EDEFAULT;

	/**
	 * This is true if the Max U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxUESet;

	/**
	 * The default value of the '{@link #getGPerSection() <em>GPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float GPER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGPerSection() <em>GPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPerSection()
	 * @generated
	 * @ordered
	 */
	protected float gPerSection = GPER_SECTION_EDEFAULT;

	/**
	 * This is true if the GPer Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gPerSectionESet;

	/**
	 * The default value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSensitivity()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_SENSITIVITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSensitivity()
	 * @generated
	 * @ordered
	 */
	protected float voltageSensitivity = VOLTAGE_SENSITIVITY_EDEFAULT;

	/**
	 * This is true if the Voltage Sensitivity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageSensitivityESet;

	/**
	 * The default value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomU()
	 * @generated
	 * @ordered
	 */
	protected static final float NOM_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomU()
	 * @generated
	 * @ordered
	 */
	protected float nomU = NOM_U_EDEFAULT;

	/**
	 * This is true if the Nom U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nomUESet;

	/**
	 * The default value of the '{@link #getB0PerSection() <em>B0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0PerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_PER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0PerSection() <em>B0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0PerSection()
	 * @generated
	 * @ordered
	 */
	protected float b0PerSection = B0_PER_SECTION_EDEFAULT;

	/**
	 * This is true if the B0 Per Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean b0PerSectionESet;

	/**
	 * The default value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSections()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_SECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSections()
	 * @generated
	 * @ordered
	 */
	protected int maximumSections = MAXIMUM_SECTIONS_EDEFAULT;

	/**
	 * This is true if the Maximum Sections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumSectionsESet;

	/**
	 * The default value of the '{@link #getBPerSection() <em>BPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float BPER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBPerSection() <em>BPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPerSection()
	 * @generated
	 * @ordered
	 */
	protected float bPerSection = BPER_SECTION_EDEFAULT;

	/**
	 * This is true if the BPer Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bPerSectionESet;

	/**
	 * The cached value of the '{@link #getSvShuntCompensatorSections() <em>Sv Shunt Compensator Sections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 * @ordered
	 */
	protected SvShuntCompensatorSections svShuntCompensatorSections;

	/**
	 * The default value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float AVR_DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRDelay()
	 * @generated
	 * @ordered
	 */
	protected float aVRDelay = AVR_DELAY_EDEFAULT;

	/**
	 * This is true if the AVR Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aVRDelayESet;

	/**
	 * The default value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_U_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinU() <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinU()
	 * @generated
	 * @ordered
	 */
	protected float minU = MIN_U_EDEFAULT;

	/**
	 * This is true if the Min U attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minUESet;

	/**
	 * The default value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalSections()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_SECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalSections()
	 * @generated
	 * @ordered
	 */
	protected int normalSections = NORMAL_SECTIONS_EDEFAULT;

	/**
	 * This is true if the Normal Sections attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalSectionsESet;

	/**
	 * The cached value of the '{@link #getShuntCompensatorPhases() <em>Shunt Compensator Phases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuntCompensatorPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<ShuntCompensatorPhase> shuntCompensatorPhases;

	/**
	 * The default value of the '{@link #getReactivePerSection() <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float REACTIVE_PER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getReactivePerSection() <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivePerSection()
	 * @generated
	 * @ordered
	 */
	protected float reactivePerSection = REACTIVE_PER_SECTION_EDEFAULT;

	/**
	 * This is true if the Reactive Per Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reactivePerSectionESet;

	/**
	 * The default value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SWITCH_ON_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSwitchOnCount() <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnCount()
	 * @generated
	 * @ordered
	 */
	protected int switchOnCount = SWITCH_ON_COUNT_EDEFAULT;

	/**
	 * This is true if the Switch On Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean switchOnCountESet;

	/**
	 * The default value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SWITCH_ON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitchOnDate() <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchOnDate()
	 * @generated
	 * @ordered
	 */
	protected Date switchOnDate = SWITCH_ON_DATE_EDEFAULT;

	/**
	 * This is true if the Switch On Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean switchOnDateESet;

	/**
	 * The default value of the '{@link #getG0PerSection() <em>G0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0PerSection()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_PER_SECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0PerSection() <em>G0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0PerSection()
	 * @generated
	 * @ordered
	 */
	protected float g0PerSection = G0_PER_SECTION_EDEFAULT;

	/**
	 * This is true if the G0 Per Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean g0PerSectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShuntCompensator() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.SHUNT_COMPENSATOR;
	}

	/**
	 * Returns the value of the '<em><b>Nom Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Q</em>' attribute.
	 * @see #isSetNomQ()
	 * @see #unsetNomQ()
	 * @see #setNomQ(float)
	 * @generated
	 */
	public float getNomQ() {
		return nomQ;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Q</em>' attribute.
	 * @see #isSetNomQ()
	 * @see #unsetNomQ()
	 * @see #getNomQ()
	 * @generated
	 */
	public void setNomQ(float newNomQ) {
		nomQ = newNomQ;
		nomQESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNomQ()
	 * @see #getNomQ()
	 * @see #setNomQ(float)
	 * @generated
	 */
	public void unsetNomQ() {
		nomQ = NOM_Q_EDEFAULT;
		nomQESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomQ <em>Nom Q</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nom Q</em>' attribute is set.
	 * @see #unsetNomQ()
	 * @see #getNomQ()
	 * @see #setNomQ(float)
	 * @generated
	 */
	public boolean isSetNomQ() {
		return nomQESet;
	}

	/**
	 * Returns the value of the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max U</em>' attribute.
	 * @see #isSetMaxU()
	 * @see #unsetMaxU()
	 * @see #setMaxU(float)
	 * @generated
	 */
	public float getMaxU() {
		return maxU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max U</em>' attribute.
	 * @see #isSetMaxU()
	 * @see #unsetMaxU()
	 * @see #getMaxU()
	 * @generated
	 */
	public void setMaxU(float newMaxU) {
		maxU = newMaxU;
		maxUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxU()
	 * @see #getMaxU()
	 * @see #setMaxU(float)
	 * @generated
	 */
	public void unsetMaxU() {
		maxU = MAX_U_EDEFAULT;
		maxUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaxU <em>Max U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max U</em>' attribute is set.
	 * @see #unsetMaxU()
	 * @see #getMaxU()
	 * @see #setMaxU(float)
	 * @generated
	 */
	public boolean isSetMaxU() {
		return maxUESet;
	}

	/**
	 * Returns the value of the '<em><b>GPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPer Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPer Section</em>' attribute.
	 * @see #isSetGPerSection()
	 * @see #unsetGPerSection()
	 * @see #setGPerSection(float)
	 * @generated
	 */
	public float getGPerSection() {
		return gPerSection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPer Section</em>' attribute.
	 * @see #isSetGPerSection()
	 * @see #unsetGPerSection()
	 * @see #getGPerSection()
	 * @generated
	 */
	public void setGPerSection(float newGPerSection) {
		gPerSection = newGPerSection;
		gPerSectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGPerSection()
	 * @see #getGPerSection()
	 * @see #setGPerSection(float)
	 * @generated
	 */
	public void unsetGPerSection() {
		gPerSection = GPER_SECTION_EDEFAULT;
		gPerSectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getGPerSection <em>GPer Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GPer Section</em>' attribute is set.
	 * @see #unsetGPerSection()
	 * @see #getGPerSection()
	 * @see #setGPerSection(float)
	 * @generated
	 */
	public boolean isSetGPerSection() {
		return gPerSectionESet;
	}

	/**
	 * Returns the value of the '<em><b>Voltage Sensitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage Sensitivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Sensitivity</em>' attribute.
	 * @see #isSetVoltageSensitivity()
	 * @see #unsetVoltageSensitivity()
	 * @see #setVoltageSensitivity(float)
	 * @generated
	 */
	public float getVoltageSensitivity() {
		return voltageSensitivity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Sensitivity</em>' attribute.
	 * @see #isSetVoltageSensitivity()
	 * @see #unsetVoltageSensitivity()
	 * @see #getVoltageSensitivity()
	 * @generated
	 */
	public void setVoltageSensitivity(float newVoltageSensitivity) {
		voltageSensitivity = newVoltageSensitivity;
		voltageSensitivityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageSensitivity()
	 * @see #getVoltageSensitivity()
	 * @see #setVoltageSensitivity(float)
	 * @generated
	 */
	public void unsetVoltageSensitivity() {
		voltageSensitivity = VOLTAGE_SENSITIVITY_EDEFAULT;
		voltageSensitivityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getVoltageSensitivity <em>Voltage Sensitivity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Sensitivity</em>' attribute is set.
	 * @see #unsetVoltageSensitivity()
	 * @see #getVoltageSensitivity()
	 * @see #setVoltageSensitivity(float)
	 * @generated
	 */
	public boolean isSetVoltageSensitivity() {
		return voltageSensitivityESet;
	}

	/**
	 * Returns the value of the '<em><b>Nom U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom U</em>' attribute.
	 * @see #isSetNomU()
	 * @see #unsetNomU()
	 * @see #setNomU(float)
	 * @generated
	 */
	public float getNomU() {
		return nomU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom U</em>' attribute.
	 * @see #isSetNomU()
	 * @see #unsetNomU()
	 * @see #getNomU()
	 * @generated
	 */
	public void setNomU(float newNomU) {
		nomU = newNomU;
		nomUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNomU()
	 * @see #getNomU()
	 * @see #setNomU(float)
	 * @generated
	 */
	public void unsetNomU() {
		nomU = NOM_U_EDEFAULT;
		nomUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNomU <em>Nom U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nom U</em>' attribute is set.
	 * @see #unsetNomU()
	 * @see #getNomU()
	 * @see #setNomU(float)
	 * @generated
	 */
	public boolean isSetNomU() {
		return nomUESet;
	}

	/**
	 * Returns the value of the '<em><b>B0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0 Per Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0 Per Section</em>' attribute.
	 * @see #isSetB0PerSection()
	 * @see #unsetB0PerSection()
	 * @see #setB0PerSection(float)
	 * @generated
	 */
	public float getB0PerSection() {
		return b0PerSection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0 Per Section</em>' attribute.
	 * @see #isSetB0PerSection()
	 * @see #unsetB0PerSection()
	 * @see #getB0PerSection()
	 * @generated
	 */
	public void setB0PerSection(float newB0PerSection) {
		b0PerSection = newB0PerSection;
		b0PerSectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB0PerSection()
	 * @see #getB0PerSection()
	 * @see #setB0PerSection(float)
	 * @generated
	 */
	public void unsetB0PerSection() {
		b0PerSection = B0_PER_SECTION_EDEFAULT;
		b0PerSectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getB0PerSection <em>B0 Per Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B0 Per Section</em>' attribute is set.
	 * @see #unsetB0PerSection()
	 * @see #getB0PerSection()
	 * @see #setB0PerSection(float)
	 * @generated
	 */
	public boolean isSetB0PerSection() {
		return b0PerSectionESet;
	}

	/**
	 * Returns the value of the '<em><b>Maximum Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Sections</em>' attribute.
	 * @see #isSetMaximumSections()
	 * @see #unsetMaximumSections()
	 * @see #setMaximumSections(int)
	 * @generated
	 */
	public int getMaximumSections() {
		return maximumSections;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Sections</em>' attribute.
	 * @see #isSetMaximumSections()
	 * @see #unsetMaximumSections()
	 * @see #getMaximumSections()
	 * @generated
	 */
	public void setMaximumSections(int newMaximumSections) {
		maximumSections = newMaximumSections;
		maximumSectionsESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSections()
	 * @see #getMaximumSections()
	 * @see #setMaximumSections(int)
	 * @generated
	 */
	public void unsetMaximumSections() {
		maximumSections = MAXIMUM_SECTIONS_EDEFAULT;
		maximumSectionsESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMaximumSections <em>Maximum Sections</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Sections</em>' attribute is set.
	 * @see #unsetMaximumSections()
	 * @see #getMaximumSections()
	 * @see #setMaximumSections(int)
	 * @generated
	 */
	public boolean isSetMaximumSections() {
		return maximumSectionsESet;
	}

	/**
	 * Returns the value of the '<em><b>BPer Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPer Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPer Section</em>' attribute.
	 * @see #isSetBPerSection()
	 * @see #unsetBPerSection()
	 * @see #setBPerSection(float)
	 * @generated
	 */
	public float getBPerSection() {
		return bPerSection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPer Section</em>' attribute.
	 * @see #isSetBPerSection()
	 * @see #unsetBPerSection()
	 * @see #getBPerSection()
	 * @generated
	 */
	public void setBPerSection(float newBPerSection) {
		bPerSection = newBPerSection;
		bPerSectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBPerSection()
	 * @see #getBPerSection()
	 * @see #setBPerSection(float)
	 * @generated
	 */
	public void unsetBPerSection() {
		bPerSection = BPER_SECTION_EDEFAULT;
		bPerSectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getBPerSection <em>BPer Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>BPer Section</em>' attribute is set.
	 * @see #unsetBPerSection()
	 * @see #getBPerSection()
	 * @see #setBPerSection(float)
	 * @generated
	 */
	public boolean isSetBPerSection() {
		return bPerSectionESet;
	}

	/**
	 * Returns the value of the '<em><b>Sv Shunt Compensator Sections</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Shunt Compensator Sections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Shunt Compensator Sections</em>' reference.
	 * @see #setSvShuntCompensatorSections(SvShuntCompensatorSections)
	 * @see CIM15.IEC61970.StateVariables.SvShuntCompensatorSections#getShuntCompensator
	 * @generated
	 */
	public SvShuntCompensatorSections getSvShuntCompensatorSections() {
		if (svShuntCompensatorSections != null && svShuntCompensatorSections.eIsProxy()) {
			InternalEObject oldSvShuntCompensatorSections = (InternalEObject)svShuntCompensatorSections;
			svShuntCompensatorSections = (SvShuntCompensatorSections)eResolveProxy(oldSvShuntCompensatorSections);
			if (svShuntCompensatorSections != oldSvShuntCompensatorSections) {
			}
		}
		return svShuntCompensatorSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvShuntCompensatorSections basicGetSvShuntCompensatorSections() {
		return svShuntCompensatorSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvShuntCompensatorSections(SvShuntCompensatorSections newSvShuntCompensatorSections, NotificationChain msgs) {
		SvShuntCompensatorSections oldSvShuntCompensatorSections = svShuntCompensatorSections;
		svShuntCompensatorSections = newSvShuntCompensatorSections;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Shunt Compensator Sections</em>' reference.
	 * @see #getSvShuntCompensatorSections()
	 * @generated
	 */
	public void setSvShuntCompensatorSections(SvShuntCompensatorSections newSvShuntCompensatorSections) {
		if (newSvShuntCompensatorSections != svShuntCompensatorSections) {
			NotificationChain msgs = null;
			if (svShuntCompensatorSections != null)
				msgs = ((InternalEObject)svShuntCompensatorSections).eInverseRemove(this, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class, msgs);
			if (newSvShuntCompensatorSections != null)
				msgs = ((InternalEObject)newSvShuntCompensatorSections).eInverseAdd(this, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class, msgs);
			msgs = basicSetSvShuntCompensatorSections(newSvShuntCompensatorSections, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>AVR Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AVR Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVR Delay</em>' attribute.
	 * @see #isSetAVRDelay()
	 * @see #unsetAVRDelay()
	 * @see #setAVRDelay(float)
	 * @generated
	 */
	public float getAVRDelay() {
		return aVRDelay;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVR Delay</em>' attribute.
	 * @see #isSetAVRDelay()
	 * @see #unsetAVRDelay()
	 * @see #getAVRDelay()
	 * @generated
	 */
	public void setAVRDelay(float newAVRDelay) {
		aVRDelay = newAVRDelay;
		aVRDelayESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAVRDelay()
	 * @see #getAVRDelay()
	 * @see #setAVRDelay(float)
	 * @generated
	 */
	public void unsetAVRDelay() {
		aVRDelay = AVR_DELAY_EDEFAULT;
		aVRDelayESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getAVRDelay <em>AVR Delay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AVR Delay</em>' attribute is set.
	 * @see #unsetAVRDelay()
	 * @see #getAVRDelay()
	 * @see #setAVRDelay(float)
	 * @generated
	 */
	public boolean isSetAVRDelay() {
		return aVRDelayESet;
	}

	/**
	 * Returns the value of the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min U</em>' attribute.
	 * @see #isSetMinU()
	 * @see #unsetMinU()
	 * @see #setMinU(float)
	 * @generated
	 */
	public float getMinU() {
		return minU;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min U</em>' attribute.
	 * @see #isSetMinU()
	 * @see #unsetMinU()
	 * @see #getMinU()
	 * @generated
	 */
	public void setMinU(float newMinU) {
		minU = newMinU;
		minUESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinU()
	 * @see #getMinU()
	 * @see #setMinU(float)
	 * @generated
	 */
	public void unsetMinU() {
		minU = MIN_U_EDEFAULT;
		minUESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getMinU <em>Min U</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min U</em>' attribute is set.
	 * @see #unsetMinU()
	 * @see #getMinU()
	 * @see #setMinU(float)
	 * @generated
	 */
	public boolean isSetMinU() {
		return minUESet;
	}

	/**
	 * Returns the value of the '<em><b>Normal Sections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Sections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Sections</em>' attribute.
	 * @see #isSetNormalSections()
	 * @see #unsetNormalSections()
	 * @see #setNormalSections(int)
	 * @generated
	 */
	public int getNormalSections() {
		return normalSections;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Sections</em>' attribute.
	 * @see #isSetNormalSections()
	 * @see #unsetNormalSections()
	 * @see #getNormalSections()
	 * @generated
	 */
	public void setNormalSections(int newNormalSections) {
		normalSections = newNormalSections;
		normalSectionsESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalSections()
	 * @see #getNormalSections()
	 * @see #setNormalSections(int)
	 * @generated
	 */
	public void unsetNormalSections() {
		normalSections = NORMAL_SECTIONS_EDEFAULT;
		normalSectionsESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getNormalSections <em>Normal Sections</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normal Sections</em>' attribute is set.
	 * @see #unsetNormalSections()
	 * @see #getNormalSections()
	 * @see #setNormalSections(int)
	 * @generated
	 */
	public boolean isSetNormalSections() {
		return normalSectionsESet;
	}

	/**
	 * Returns the value of the '<em><b>Shunt Compensator Phases</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.WiresPhaseModel.ShuntCompensatorPhase}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.WiresPhaseModel.ShuntCompensatorPhase#getShuntCompensator <em>Shunt Compensator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt Compensator Phases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt Compensator Phases</em>' reference list.
	 * @see CIM15.IEC61970.WiresPhaseModel.ShuntCompensatorPhase#getShuntCompensator
	 * @generated
	 */
	public EList<ShuntCompensatorPhase> getShuntCompensatorPhases() {
		if (shuntCompensatorPhases == null) {
			shuntCompensatorPhases = new BasicInternalEList<ShuntCompensatorPhase>(ShuntCompensatorPhase.class);
		}
		return shuntCompensatorPhases;
	}

	/**
	 * Returns the value of the '<em><b>Reactive Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive Per Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive Per Section</em>' attribute.
	 * @see #isSetReactivePerSection()
	 * @see #unsetReactivePerSection()
	 * @see #setReactivePerSection(float)
	 * @generated
	 */
	public float getReactivePerSection() {
		return reactivePerSection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive Per Section</em>' attribute.
	 * @see #isSetReactivePerSection()
	 * @see #unsetReactivePerSection()
	 * @see #getReactivePerSection()
	 * @generated
	 */
	public void setReactivePerSection(float newReactivePerSection) {
		reactivePerSection = newReactivePerSection;
		reactivePerSectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReactivePerSection()
	 * @see #getReactivePerSection()
	 * @see #setReactivePerSection(float)
	 * @generated
	 */
	public void unsetReactivePerSection() {
		reactivePerSection = REACTIVE_PER_SECTION_EDEFAULT;
		reactivePerSectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getReactivePerSection <em>Reactive Per Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reactive Per Section</em>' attribute is set.
	 * @see #unsetReactivePerSection()
	 * @see #getReactivePerSection()
	 * @see #setReactivePerSection(float)
	 * @generated
	 */
	public boolean isSetReactivePerSection() {
		return reactivePerSectionESet;
	}

	/**
	 * Returns the value of the '<em><b>Switch On Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch On Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch On Count</em>' attribute.
	 * @see #isSetSwitchOnCount()
	 * @see #unsetSwitchOnCount()
	 * @see #setSwitchOnCount(int)
	 * @generated
	 */
	public int getSwitchOnCount() {
		return switchOnCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Count</em>' attribute.
	 * @see #isSetSwitchOnCount()
	 * @see #unsetSwitchOnCount()
	 * @see #getSwitchOnCount()
	 * @generated
	 */
	public void setSwitchOnCount(int newSwitchOnCount) {
		switchOnCount = newSwitchOnCount;
		switchOnCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchOnCount()
	 * @see #getSwitchOnCount()
	 * @see #setSwitchOnCount(int)
	 * @generated
	 */
	public void unsetSwitchOnCount() {
		switchOnCount = SWITCH_ON_COUNT_EDEFAULT;
		switchOnCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnCount <em>Switch On Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switch On Count</em>' attribute is set.
	 * @see #unsetSwitchOnCount()
	 * @see #getSwitchOnCount()
	 * @see #setSwitchOnCount(int)
	 * @generated
	 */
	public boolean isSetSwitchOnCount() {
		return switchOnCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Switch On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch On Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch On Date</em>' attribute.
	 * @see #isSetSwitchOnDate()
	 * @see #unsetSwitchOnDate()
	 * @see #setSwitchOnDate(Date)
	 * @generated
	 */
	public Date getSwitchOnDate() {
		return switchOnDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch On Date</em>' attribute.
	 * @see #isSetSwitchOnDate()
	 * @see #unsetSwitchOnDate()
	 * @see #getSwitchOnDate()
	 * @generated
	 */
	public void setSwitchOnDate(Date newSwitchOnDate) {
		switchOnDate = newSwitchOnDate;
		switchOnDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSwitchOnDate()
	 * @see #getSwitchOnDate()
	 * @see #setSwitchOnDate(Date)
	 * @generated
	 */
	public void unsetSwitchOnDate() {
		switchOnDate = SWITCH_ON_DATE_EDEFAULT;
		switchOnDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getSwitchOnDate <em>Switch On Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Switch On Date</em>' attribute is set.
	 * @see #unsetSwitchOnDate()
	 * @see #getSwitchOnDate()
	 * @see #setSwitchOnDate(Date)
	 * @generated
	 */
	public boolean isSetSwitchOnDate() {
		return switchOnDateESet;
	}

	/**
	 * Returns the value of the '<em><b>G0 Per Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0 Per Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0 Per Section</em>' attribute.
	 * @see #isSetG0PerSection()
	 * @see #unsetG0PerSection()
	 * @see #setG0PerSection(float)
	 * @generated
	 */
	public float getG0PerSection() {
		return g0PerSection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0 Per Section</em>' attribute.
	 * @see #isSetG0PerSection()
	 * @see #unsetG0PerSection()
	 * @see #getG0PerSection()
	 * @generated
	 */
	public void setG0PerSection(float newG0PerSection) {
		g0PerSection = newG0PerSection;
		g0PerSectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG0PerSection()
	 * @see #getG0PerSection()
	 * @see #setG0PerSection(float)
	 * @generated
	 */
	public void unsetG0PerSection() {
		g0PerSection = G0_PER_SECTION_EDEFAULT;
		g0PerSectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ShuntCompensator#getG0PerSection <em>G0 Per Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G0 Per Section</em>' attribute is set.
	 * @see #unsetG0PerSection()
	 * @see #getG0PerSection()
	 * @see #setG0PerSection(float)
	 * @generated
	 */
	public boolean isSetG0PerSection() {
		return g0PerSectionESet;
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
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				if (svShuntCompensatorSections != null)
					msgs = ((InternalEObject)svShuntCompensatorSections).eInverseRemove(this, StateVariablesPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class, msgs);
				return basicSetSvShuntCompensatorSections((SvShuntCompensatorSections)otherEnd, msgs);
			case WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShuntCompensatorPhases()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				return basicSetSvShuntCompensatorSections(null, msgs);
			case WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES:
				return ((InternalEList<?>)getShuntCompensatorPhases()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				return getNomQ();
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				return getMaxU();
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				return getGPerSection();
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				return getVoltageSensitivity();
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				return getNomU();
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				return getB0PerSection();
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				return getMaximumSections();
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				return getBPerSection();
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				if (resolve) return getSvShuntCompensatorSections();
				return basicGetSvShuntCompensatorSections();
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				return getAVRDelay();
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				return getMinU();
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				return getNormalSections();
			case WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES:
				return getShuntCompensatorPhases();
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				return getReactivePerSection();
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				return getSwitchOnCount();
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				return getSwitchOnDate();
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				return getG0PerSection();
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
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				setNomQ((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				setGPerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				setVoltageSensitivity((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				setNomU((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				setB0PerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				setMaximumSections((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				setBPerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				setSvShuntCompensatorSections((SvShuntCompensatorSections)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				setAVRDelay((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				setNormalSections((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES:
				getShuntCompensatorPhases().clear();
				getShuntCompensatorPhases().addAll((Collection<? extends ShuntCompensatorPhase>)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				setReactivePerSection((Float)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				setSwitchOnCount((Integer)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				setSwitchOnDate((Date)newValue);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				setG0PerSection((Float)newValue);
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
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				unsetNomQ();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				unsetMaxU();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				unsetGPerSection();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				unsetVoltageSensitivity();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				unsetNomU();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				unsetB0PerSection();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				unsetMaximumSections();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				unsetBPerSection();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				setSvShuntCompensatorSections((SvShuntCompensatorSections)null);
				return;
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				unsetAVRDelay();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				unsetMinU();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				unsetNormalSections();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES:
				getShuntCompensatorPhases().clear();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				unsetReactivePerSection();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				unsetSwitchOnCount();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				unsetSwitchOnDate();
				return;
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				unsetG0PerSection();
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
			case WiresPackage.SHUNT_COMPENSATOR__NOM_Q:
				return isSetNomQ();
			case WiresPackage.SHUNT_COMPENSATOR__MAX_U:
				return isSetMaxU();
			case WiresPackage.SHUNT_COMPENSATOR__GPER_SECTION:
				return isSetGPerSection();
			case WiresPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
				return isSetVoltageSensitivity();
			case WiresPackage.SHUNT_COMPENSATOR__NOM_U:
				return isSetNomU();
			case WiresPackage.SHUNT_COMPENSATOR__B0_PER_SECTION:
				return isSetB0PerSection();
			case WiresPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
				return isSetMaximumSections();
			case WiresPackage.SHUNT_COMPENSATOR__BPER_SECTION:
				return isSetBPerSection();
			case WiresPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
				return svShuntCompensatorSections != null;
			case WiresPackage.SHUNT_COMPENSATOR__AVR_DELAY:
				return isSetAVRDelay();
			case WiresPackage.SHUNT_COMPENSATOR__MIN_U:
				return isSetMinU();
			case WiresPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
				return isSetNormalSections();
			case WiresPackage.SHUNT_COMPENSATOR__SHUNT_COMPENSATOR_PHASES:
				return shuntCompensatorPhases != null && !shuntCompensatorPhases.isEmpty();
			case WiresPackage.SHUNT_COMPENSATOR__REACTIVE_PER_SECTION:
				return isSetReactivePerSection();
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
				return isSetSwitchOnCount();
			case WiresPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
				return isSetSwitchOnDate();
			case WiresPackage.SHUNT_COMPENSATOR__G0_PER_SECTION:
				return isSetG0PerSection();
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
		result.append(" (nomQ: ");
		if (nomQESet) result.append(nomQ); else result.append("<unset>");
		result.append(", maxU: ");
		if (maxUESet) result.append(maxU); else result.append("<unset>");
		result.append(", gPerSection: ");
		if (gPerSectionESet) result.append(gPerSection); else result.append("<unset>");
		result.append(", voltageSensitivity: ");
		if (voltageSensitivityESet) result.append(voltageSensitivity); else result.append("<unset>");
		result.append(", nomU: ");
		if (nomUESet) result.append(nomU); else result.append("<unset>");
		result.append(", b0PerSection: ");
		if (b0PerSectionESet) result.append(b0PerSection); else result.append("<unset>");
		result.append(", maximumSections: ");
		if (maximumSectionsESet) result.append(maximumSections); else result.append("<unset>");
		result.append(", bPerSection: ");
		if (bPerSectionESet) result.append(bPerSection); else result.append("<unset>");
		result.append(", aVRDelay: ");
		if (aVRDelayESet) result.append(aVRDelay); else result.append("<unset>");
		result.append(", minU: ");
		if (minUESet) result.append(minU); else result.append("<unset>");
		result.append(", normalSections: ");
		if (normalSectionsESet) result.append(normalSections); else result.append("<unset>");
		result.append(", reactivePerSection: ");
		if (reactivePerSectionESet) result.append(reactivePerSection); else result.append("<unset>");
		result.append(", switchOnCount: ");
		if (switchOnCountESet) result.append(switchOnCount); else result.append("<unset>");
		result.append(", switchOnDate: ");
		if (switchOnDateESet) result.append(switchOnDate); else result.append("<unset>");
		result.append(", g0PerSection: ");
		if (g0PerSectionESet) result.append(g0PerSection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ShuntCompensator
