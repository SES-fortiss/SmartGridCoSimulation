/**
 */
package CIM15.IEC61970.Generation.Production;

import CIM15.IEC61970.Core.PowerSystemResource;

import CIM15.IEC61970.Wires.SynchronousMachine;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Pump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}</li>
 *   <li>{@link CIM15.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HydroPump extends PowerSystemResource {
	/**
	 * The default value of the '{@link #getPumpDischAtMaxHead() <em>Pump Disch At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_DISCH_AT_MAX_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpDischAtMaxHead() <em>Pump Disch At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpDischAtMaxHead = PUMP_DISCH_AT_MAX_HEAD_EDEFAULT;

	/**
	 * This is true if the Pump Disch At Max Head attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pumpDischAtMaxHeadESet;

	/**
	 * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPowerPlant()
	 * @generated
	 * @ordered
	 */
	protected HydroPowerPlant hydroPowerPlant;

	/**
	 * The default value of the '{@link #getPumpDischAtMinHead() <em>Pump Disch At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_DISCH_AT_MIN_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpDischAtMinHead() <em>Pump Disch At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpDischAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpDischAtMinHead = PUMP_DISCH_AT_MIN_HEAD_EDEFAULT;

	/**
	 * This is true if the Pump Disch At Min Head attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pumpDischAtMinHeadESet;

	/**
	 * The default value of the '{@link #getPumpPowerAtMinHead() <em>Pump Power At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_POWER_AT_MIN_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpPowerAtMinHead() <em>Pump Power At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMinHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpPowerAtMinHead = PUMP_POWER_AT_MIN_HEAD_EDEFAULT;

	/**
	 * This is true if the Pump Power At Min Head attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pumpPowerAtMinHeadESet;

	/**
	 * The cached value of the '{@link #getHydroPumpOpSchedule() <em>Hydro Pump Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPumpOpSchedule()
	 * @generated
	 * @ordered
	 */
	protected HydroPumpOpSchedule hydroPumpOpSchedule;

	/**
	 * The default value of the '{@link #getPumpPowerAtMaxHead() <em>Pump Power At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected static final float PUMP_POWER_AT_MAX_HEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPumpPowerAtMaxHead() <em>Pump Power At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPumpPowerAtMaxHead()
	 * @generated
	 * @ordered
	 */
	protected float pumpPowerAtMaxHead = PUMP_POWER_AT_MAX_HEAD_EDEFAULT;

	/**
	 * This is true if the Pump Power At Max Head attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pumpPowerAtMaxHeadESet;

	/**
	 * The cached value of the '{@link #getSynchronousMachine() <em>Synchronous Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMachine()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachine synchronousMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HydroPump() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.HYDRO_PUMP;
	}

	/**
	 * Returns the value of the '<em><b>Pump Disch At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Disch At Max Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Disch At Max Head</em>' attribute.
	 * @see #isSetPumpDischAtMaxHead()
	 * @see #unsetPumpDischAtMaxHead()
	 * @see #setPumpDischAtMaxHead(float)
	 * @generated
	 */
	public float getPumpDischAtMaxHead() {
		return pumpDischAtMaxHead;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Disch At Max Head</em>' attribute.
	 * @see #isSetPumpDischAtMaxHead()
	 * @see #unsetPumpDischAtMaxHead()
	 * @see #getPumpDischAtMaxHead()
	 * @generated
	 */
	public void setPumpDischAtMaxHead(float newPumpDischAtMaxHead) {
		pumpDischAtMaxHead = newPumpDischAtMaxHead;
		pumpDischAtMaxHeadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPumpDischAtMaxHead()
	 * @see #getPumpDischAtMaxHead()
	 * @see #setPumpDischAtMaxHead(float)
	 * @generated
	 */
	public void unsetPumpDischAtMaxHead() {
		pumpDischAtMaxHead = PUMP_DISCH_AT_MAX_HEAD_EDEFAULT;
		pumpDischAtMaxHeadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pump Disch At Max Head</em>' attribute is set.
	 * @see #unsetPumpDischAtMaxHead()
	 * @see #getPumpDischAtMaxHead()
	 * @see #setPumpDischAtMaxHead(float)
	 * @generated
	 */
	public boolean isSetPumpDischAtMaxHead() {
		return pumpDischAtMaxHeadESet;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Power Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #setHydroPowerPlant(HydroPowerPlant)
	 * @see CIM15.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps
	 * @generated
	 */
	public HydroPowerPlant getHydroPowerPlant() {
		if (hydroPowerPlant != null && hydroPowerPlant.eIsProxy()) {
			InternalEObject oldHydroPowerPlant = (InternalEObject)hydroPowerPlant;
			hydroPowerPlant = (HydroPowerPlant)eResolveProxy(oldHydroPowerPlant);
			if (hydroPowerPlant != oldHydroPowerPlant) {
			}
		}
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPowerPlant basicGetHydroPowerPlant() {
		return hydroPowerPlant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPowerPlant(HydroPowerPlant newHydroPowerPlant, NotificationChain msgs) {
		HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
		hydroPowerPlant = newHydroPowerPlant;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	public void setHydroPowerPlant(HydroPowerPlant newHydroPowerPlant) {
		if (newHydroPowerPlant != hydroPowerPlant) {
			NotificationChain msgs = null;
			if (hydroPowerPlant != null)
				msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs);
			if (newHydroPowerPlant != null)
				msgs = ((InternalEObject)newHydroPowerPlant).eInverseAdd(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs);
			msgs = basicSetHydroPowerPlant(newHydroPowerPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Pump Disch At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Disch At Min Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Disch At Min Head</em>' attribute.
	 * @see #isSetPumpDischAtMinHead()
	 * @see #unsetPumpDischAtMinHead()
	 * @see #setPumpDischAtMinHead(float)
	 * @generated
	 */
	public float getPumpDischAtMinHead() {
		return pumpDischAtMinHead;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Disch At Min Head</em>' attribute.
	 * @see #isSetPumpDischAtMinHead()
	 * @see #unsetPumpDischAtMinHead()
	 * @see #getPumpDischAtMinHead()
	 * @generated
	 */
	public void setPumpDischAtMinHead(float newPumpDischAtMinHead) {
		pumpDischAtMinHead = newPumpDischAtMinHead;
		pumpDischAtMinHeadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPumpDischAtMinHead()
	 * @see #getPumpDischAtMinHead()
	 * @see #setPumpDischAtMinHead(float)
	 * @generated
	 */
	public void unsetPumpDischAtMinHead() {
		pumpDischAtMinHead = PUMP_DISCH_AT_MIN_HEAD_EDEFAULT;
		pumpDischAtMinHeadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pump Disch At Min Head</em>' attribute is set.
	 * @see #unsetPumpDischAtMinHead()
	 * @see #getPumpDischAtMinHead()
	 * @see #setPumpDischAtMinHead(float)
	 * @generated
	 */
	public boolean isSetPumpDischAtMinHead() {
		return pumpDischAtMinHeadESet;
	}

	/**
	 * Returns the value of the '<em><b>Pump Power At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Power At Min Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Power At Min Head</em>' attribute.
	 * @see #isSetPumpPowerAtMinHead()
	 * @see #unsetPumpPowerAtMinHead()
	 * @see #setPumpPowerAtMinHead(float)
	 * @generated
	 */
	public float getPumpPowerAtMinHead() {
		return pumpPowerAtMinHead;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Power At Min Head</em>' attribute.
	 * @see #isSetPumpPowerAtMinHead()
	 * @see #unsetPumpPowerAtMinHead()
	 * @see #getPumpPowerAtMinHead()
	 * @generated
	 */
	public void setPumpPowerAtMinHead(float newPumpPowerAtMinHead) {
		pumpPowerAtMinHead = newPumpPowerAtMinHead;
		pumpPowerAtMinHeadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPumpPowerAtMinHead()
	 * @see #getPumpPowerAtMinHead()
	 * @see #setPumpPowerAtMinHead(float)
	 * @generated
	 */
	public void unsetPumpPowerAtMinHead() {
		pumpPowerAtMinHead = PUMP_POWER_AT_MIN_HEAD_EDEFAULT;
		pumpPowerAtMinHeadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pump Power At Min Head</em>' attribute is set.
	 * @see #unsetPumpPowerAtMinHead()
	 * @see #getPumpPowerAtMinHead()
	 * @see #setPumpPowerAtMinHead(float)
	 * @generated
	 */
	public boolean isSetPumpPowerAtMinHead() {
		return pumpPowerAtMinHeadESet;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Pump Op Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pump Op Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pump Op Schedule</em>' reference.
	 * @see #setHydroPumpOpSchedule(HydroPumpOpSchedule)
	 * @see CIM15.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump
	 * @generated
	 */
	public HydroPumpOpSchedule getHydroPumpOpSchedule() {
		if (hydroPumpOpSchedule != null && hydroPumpOpSchedule.eIsProxy()) {
			InternalEObject oldHydroPumpOpSchedule = (InternalEObject)hydroPumpOpSchedule;
			hydroPumpOpSchedule = (HydroPumpOpSchedule)eResolveProxy(oldHydroPumpOpSchedule);
			if (hydroPumpOpSchedule != oldHydroPumpOpSchedule) {
			}
		}
		return hydroPumpOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPumpOpSchedule basicGetHydroPumpOpSchedule() {
		return hydroPumpOpSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPumpOpSchedule(HydroPumpOpSchedule newHydroPumpOpSchedule, NotificationChain msgs) {
		HydroPumpOpSchedule oldHydroPumpOpSchedule = hydroPumpOpSchedule;
		hydroPumpOpSchedule = newHydroPumpOpSchedule;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Pump Op Schedule</em>' reference.
	 * @see #getHydroPumpOpSchedule()
	 * @generated
	 */
	public void setHydroPumpOpSchedule(HydroPumpOpSchedule newHydroPumpOpSchedule) {
		if (newHydroPumpOpSchedule != hydroPumpOpSchedule) {
			NotificationChain msgs = null;
			if (hydroPumpOpSchedule != null)
				msgs = ((InternalEObject)hydroPumpOpSchedule).eInverseRemove(this, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs);
			if (newHydroPumpOpSchedule != null)
				msgs = ((InternalEObject)newHydroPumpOpSchedule).eInverseAdd(this, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs);
			msgs = basicSetHydroPumpOpSchedule(newHydroPumpOpSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Pump Power At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Power At Max Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Power At Max Head</em>' attribute.
	 * @see #isSetPumpPowerAtMaxHead()
	 * @see #unsetPumpPowerAtMaxHead()
	 * @see #setPumpPowerAtMaxHead(float)
	 * @generated
	 */
	public float getPumpPowerAtMaxHead() {
		return pumpPowerAtMaxHead;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Power At Max Head</em>' attribute.
	 * @see #isSetPumpPowerAtMaxHead()
	 * @see #unsetPumpPowerAtMaxHead()
	 * @see #getPumpPowerAtMaxHead()
	 * @generated
	 */
	public void setPumpPowerAtMaxHead(float newPumpPowerAtMaxHead) {
		pumpPowerAtMaxHead = newPumpPowerAtMaxHead;
		pumpPowerAtMaxHeadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPumpPowerAtMaxHead()
	 * @see #getPumpPowerAtMaxHead()
	 * @see #setPumpPowerAtMaxHead(float)
	 * @generated
	 */
	public void unsetPumpPowerAtMaxHead() {
		pumpPowerAtMaxHead = PUMP_POWER_AT_MAX_HEAD_EDEFAULT;
		pumpPowerAtMaxHeadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pump Power At Max Head</em>' attribute is set.
	 * @see #unsetPumpPowerAtMaxHead()
	 * @see #getPumpPowerAtMaxHead()
	 * @see #setPumpPowerAtMaxHead(float)
	 * @generated
	 */
	public boolean isSetPumpPowerAtMaxHead() {
		return pumpPowerAtMaxHeadESet;
	}

	/**
	 * Returns the value of the '<em><b>Synchronous Machine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machine</em>' reference.
	 * @see #setSynchronousMachine(SynchronousMachine)
	 * @see CIM15.IEC61970.Wires.SynchronousMachine#getHydroPump
	 * @generated
	 */
	public SynchronousMachine getSynchronousMachine() {
		if (synchronousMachine != null && synchronousMachine.eIsProxy()) {
			InternalEObject oldSynchronousMachine = (InternalEObject)synchronousMachine;
			synchronousMachine = (SynchronousMachine)eResolveProxy(oldSynchronousMachine);
			if (synchronousMachine != oldSynchronousMachine) {
			}
		}
		return synchronousMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronousMachine basicGetSynchronousMachine() {
		return synchronousMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronousMachine(SynchronousMachine newSynchronousMachine, NotificationChain msgs) {
		SynchronousMachine oldSynchronousMachine = synchronousMachine;
		synchronousMachine = newSynchronousMachine;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous Machine</em>' reference.
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	public void setSynchronousMachine(SynchronousMachine newSynchronousMachine) {
		if (newSynchronousMachine != synchronousMachine) {
			NotificationChain msgs = null;
			if (synchronousMachine != null)
				msgs = ((InternalEObject)synchronousMachine).eInverseRemove(this, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, SynchronousMachine.class, msgs);
			if (newSynchronousMachine != null)
				msgs = ((InternalEObject)newSynchronousMachine).eInverseAdd(this, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, SynchronousMachine.class, msgs);
			msgs = basicSetSynchronousMachine(newSynchronousMachine, msgs);
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
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				if (hydroPowerPlant != null)
					msgs = ((InternalEObject)hydroPowerPlant).eInverseRemove(this, ProductionPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs);
				return basicSetHydroPowerPlant((HydroPowerPlant)otherEnd, msgs);
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				if (hydroPumpOpSchedule != null)
					msgs = ((InternalEObject)hydroPumpOpSchedule).eInverseRemove(this, ProductionPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, HydroPumpOpSchedule.class, msgs);
				return basicSetHydroPumpOpSchedule((HydroPumpOpSchedule)otherEnd, msgs);
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				if (synchronousMachine != null)
					msgs = ((InternalEObject)synchronousMachine).eInverseRemove(this, WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP, SynchronousMachine.class, msgs);
				return basicSetSynchronousMachine((SynchronousMachine)otherEnd, msgs);
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
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				return basicSetHydroPowerPlant(null, msgs);
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				return basicSetHydroPumpOpSchedule(null, msgs);
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				return basicSetSynchronousMachine(null, msgs);
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
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				return getPumpDischAtMaxHead();
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				if (resolve) return getHydroPowerPlant();
				return basicGetHydroPowerPlant();
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				return getPumpDischAtMinHead();
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				return getPumpPowerAtMinHead();
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				if (resolve) return getHydroPumpOpSchedule();
				return basicGetHydroPumpOpSchedule();
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				return getPumpPowerAtMaxHead();
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				if (resolve) return getSynchronousMachine();
				return basicGetSynchronousMachine();
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
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				setPumpDischAtMaxHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				setPumpDischAtMinHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				setPumpPowerAtMinHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				setHydroPumpOpSchedule((HydroPumpOpSchedule)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				setPumpPowerAtMaxHead((Float)newValue);
				return;
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				setSynchronousMachine((SynchronousMachine)newValue);
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
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				unsetPumpDischAtMaxHead();
				return;
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				setHydroPowerPlant((HydroPowerPlant)null);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				unsetPumpDischAtMinHead();
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				unsetPumpPowerAtMinHead();
				return;
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				setHydroPumpOpSchedule((HydroPumpOpSchedule)null);
				return;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				unsetPumpPowerAtMaxHead();
				return;
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				setSynchronousMachine((SynchronousMachine)null);
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
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
				return isSetPumpDischAtMaxHead();
			case ProductionPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
				return hydroPowerPlant != null;
			case ProductionPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
				return isSetPumpDischAtMinHead();
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
				return isSetPumpPowerAtMinHead();
			case ProductionPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE:
				return hydroPumpOpSchedule != null;
			case ProductionPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
				return isSetPumpPowerAtMaxHead();
			case ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE:
				return synchronousMachine != null;
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
		result.append(" (pumpDischAtMaxHead: ");
		if (pumpDischAtMaxHeadESet) result.append(pumpDischAtMaxHead); else result.append("<unset>");
		result.append(", pumpDischAtMinHead: ");
		if (pumpDischAtMinHeadESet) result.append(pumpDischAtMinHead); else result.append("<unset>");
		result.append(", pumpPowerAtMinHead: ");
		if (pumpPowerAtMinHeadESet) result.append(pumpPowerAtMinHead); else result.append("<unset>");
		result.append(", pumpPowerAtMaxHead: ");
		if (pumpPowerAtMaxHeadESet) result.append(pumpPowerAtMaxHead); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // HydroPump
