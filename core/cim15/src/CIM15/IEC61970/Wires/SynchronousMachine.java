/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover;

import CIM15.IEC61970.Generation.Production.GeneratingUnit;
import CIM15.IEC61970.Generation.Production.HydroPump;
import CIM15.IEC61970.Generation.Production.ProductionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getPrimeMovers <em>Prime Movers</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getReactiveCapabilityCurves <em>Reactive Capability Curves</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronousMachine extends RegulatingCondEq {
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
	 * The cached value of the '{@link #getPrimeMovers() <em>Prime Movers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimeMovers()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimeMover> primeMovers;

	/**
	 * The default value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected static final float R2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR2() <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected float r2 = R2_EDEFAULT;

	/**
	 * This is true if the R2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean r2ESet;

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
	 * The default value of the '{@link #getManualToAVR() <em>Manual To AVR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualToAVR()
	 * @generated
	 * @ordered
	 */
	protected static final float MANUAL_TO_AVR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getManualToAVR() <em>Manual To AVR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualToAVR()
	 * @generated
	 * @ordered
	 */
	protected float manualToAVR = MANUAL_TO_AVR_EDEFAULT;

	/**
	 * This is true if the Manual To AVR attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean manualToAVRESet;

	/**
	 * The default value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPercent()
	 * @generated
	 * @ordered
	 */
	protected static final float QPERCENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getQPercent() <em>QPercent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPercent()
	 * @generated
	 * @ordered
	 */
	protected float qPercent = QPERCENT_EDEFAULT;

	/**
	 * This is true if the QPercent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qPercentESet;

	/**
	 * The default value of the '{@link #getCoolantCondition() <em>Coolant Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantCondition()
	 * @generated
	 * @ordered
	 */
	protected static final float COOLANT_CONDITION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoolantCondition() <em>Coolant Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantCondition()
	 * @generated
	 * @ordered
	 */
	protected float coolantCondition = COOLANT_CONDITION_EDEFAULT;

	/**
	 * This is true if the Coolant Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coolantConditionESet;

	/**
	 * The default value of the '{@link #getCondenserP() <em>Condenser P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondenserP()
	 * @generated
	 * @ordered
	 */
	protected static final float CONDENSER_P_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCondenserP() <em>Condenser P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondenserP()
	 * @generated
	 * @ordered
	 */
	protected float condenserP = CONDENSER_P_EDEFAULT;

	/**
	 * This is true if the Condenser P attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean condenserPESet;

	/**
	 * The default value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadTrans()
	 * @generated
	 * @ordered
	 */
	protected float xQuadTrans = XQUAD_TRANS_EDEFAULT;

	/**
	 * This is true if the XQuad Trans attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xQuadTransESet;

	/**
	 * The default value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float xQuadSubtrans = XQUAD_SUBTRANS_EDEFAULT;

	/**
	 * This is true if the XQuad Subtrans attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xQuadSubtransESet;

	/**
	 * The default value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSync()
	 * @generated
	 * @ordered
	 */
	protected static final float XQUAD_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXQuadSync()
	 * @generated
	 * @ordered
	 */
	protected float xQuadSync = XQUAD_SYNC_EDEFAULT;

	/**
	 * This is true if the XQuad Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xQuadSyncESet;

	/**
	 * The default value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSync()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_SYNC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSync()
	 * @generated
	 * @ordered
	 */
	protected float xDirectSync = XDIRECT_SYNC_EDEFAULT;

	/**
	 * This is true if the XDirect Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xDirectSyncESet;

	/**
	 * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQ()
	 * @generated
	 * @ordered
	 */
	protected float minQ = MIN_Q_EDEFAULT;

	/**
	 * This is true if the Min Q attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minQESet;

	/**
	 * The default value of the '{@link #getAVRToManualLag() <em>AVR To Manual Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLag()
	 * @generated
	 * @ordered
	 */
	protected static final float AVR_TO_MANUAL_LAG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAVRToManualLag() <em>AVR To Manual Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLag()
	 * @generated
	 * @ordered
	 */
	protected float aVRToManualLag = AVR_TO_MANUAL_LAG_EDEFAULT;

	/**
	 * This is true if the AVR To Manual Lag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aVRToManualLagESet;

	/**
	 * The default value of the '{@link #getDamping() <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected static final float DAMPING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDamping() <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected float damping = DAMPING_EDEFAULT;

	/**
	 * This is true if the Damping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dampingESet;

	/**
	 * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected GeneratingUnit generatingUnit;

	/**
	 * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronousMachineOperatingMode OPERATING_MODE_EDEFAULT = SynchronousMachineOperatingMode.CONDENSER;

	/**
	 * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingMode()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachineOperatingMode operatingMode = OPERATING_MODE_EDEFAULT;

	/**
	 * This is true if the Operating Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operatingModeESet;

	/**
	 * The default value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_SUBTRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectSubtrans()
	 * @generated
	 * @ordered
	 */
	protected float xDirectSubtrans = XDIRECT_SUBTRANS_EDEFAULT;

	/**
	 * This is true if the XDirect Subtrans attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xDirectSubtransESet;

	/**
	 * The default value of the '{@link #getCoolantType() <em>Coolant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantType()
	 * @generated
	 * @ordered
	 */
	protected static final CoolantType COOLANT_TYPE_EDEFAULT = CoolantType.AIR;

	/**
	 * The cached value of the '{@link #getCoolantType() <em>Coolant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolantType()
	 * @generated
	 * @ordered
	 */
	protected CoolantType coolantType = COOLANT_TYPE_EDEFAULT;

	/**
	 * This is true if the Coolant Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coolantTypeESet;

	/**
	 * The default value of the '{@link #getAVRToManualLead() <em>AVR To Manual Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLead()
	 * @generated
	 * @ordered
	 */
	protected static final float AVR_TO_MANUAL_LEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAVRToManualLead() <em>AVR To Manual Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAVRToManualLead()
	 * @generated
	 * @ordered
	 */
	protected float aVRToManualLead = AVR_TO_MANUAL_LEAD_EDEFAULT;

	/**
	 * This is true if the AVR To Manual Lead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aVRToManualLeadESet;

	/**
	 * The cached value of the '{@link #getReactiveCapabilityCurves() <em>Reactive Capability Curves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactiveCapabilityCurves()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactiveCapabilityCurve> reactiveCapabilityCurves;

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
	 * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQ()
	 * @generated
	 * @ordered
	 */
	protected float maxQ = MAX_Q_EDEFAULT;

	/**
	 * This is true if the Max Q attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxQESet;

	/**
	 * The default value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePriority()
	 * @generated
	 * @ordered
	 */
	protected static final int REFERENCE_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReferencePriority() <em>Reference Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePriority()
	 * @generated
	 * @ordered
	 */
	protected int referencePriority = REFERENCE_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Reference Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencePriorityESet;

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
	 * The default value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected static final float XDIRECT_TRANS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDirectTrans()
	 * @generated
	 * @ordered
	 */
	protected float xDirectTrans = XDIRECT_TRANS_EDEFAULT;

	/**
	 * This is true if the XDirect Trans attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xDirectTransESet;

	/**
	 * The cached value of the '{@link #getHydroPump() <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroPump()
	 * @generated
	 * @ordered
	 */
	protected HydroPump hydroPump;

	/**
	 * The default value of the '{@link #getInertia() <em>Inertia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertia()
	 * @generated
	 * @ordered
	 */
	protected static final float INERTIA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInertia() <em>Inertia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertia()
	 * @generated
	 * @ordered
	 */
	protected float inertia = INERTIA_EDEFAULT;

	/**
	 * This is true if the Inertia attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inertiaESet;

	/**
	 * The default value of the '{@link #getBaseQ() <em>Base Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQ()
	 * @generated
	 * @ordered
	 */
	protected static final float BASE_Q_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBaseQ() <em>Base Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseQ()
	 * @generated
	 * @ordered
	 */
	protected float baseQ = BASE_Q_EDEFAULT;

	/**
	 * This is true if the Base Q attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseQESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronousMachineType TYPE_EDEFAULT = SynchronousMachineType.CONDENSER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SynchronousMachineType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final float X2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected float x2 = X2_EDEFAULT;

	/**
	 * This is true if the X2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x2ESet;

	/**
	 * The cached value of the '{@link #getInitialReactiveCapabilityCurve() <em>Initial Reactive Capability Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReactiveCapabilityCurve()
	 * @generated
	 * @ordered
	 */
	protected ReactiveCapabilityCurve initialReactiveCapabilityCurve;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronousMachine() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.SYNCHRONOUS_MACHINE;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getRatedS <em>Rated S</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Prime Movers</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prime Movers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prime Movers</em>' reference list.
	 * @see CIM15.IEC61970.Generation.GenerationDynamics.PrimeMover#getSynchronousMachines
	 * @generated
	 */
	public EList<PrimeMover> getPrimeMovers() {
		if (primeMovers == null) {
			primeMovers = new BasicInternalEList<PrimeMover>(PrimeMover.class);
		}
		return primeMovers;
	}

	/**
	 * Returns the value of the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R2</em>' attribute.
	 * @see #isSetR2()
	 * @see #unsetR2()
	 * @see #setR2(float)
	 * @generated
	 */
	public float getR2() {
		return r2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R2</em>' attribute.
	 * @see #isSetR2()
	 * @see #unsetR2()
	 * @see #getR2()
	 * @generated
	 */
	public void setR2(float newR2) {
		r2 = newR2;
		r2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR2()
	 * @see #getR2()
	 * @see #setR2(float)
	 * @generated
	 */
	public void unsetR2() {
		r2 = R2_EDEFAULT;
		r2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR2 <em>R2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R2</em>' attribute is set.
	 * @see #unsetR2()
	 * @see #getR2()
	 * @see #setR2(float)
	 * @generated
	 */
	public boolean isSetR2() {
		return r2ESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR0 <em>R0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Manual To AVR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual To AVR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual To AVR</em>' attribute.
	 * @see #isSetManualToAVR()
	 * @see #unsetManualToAVR()
	 * @see #setManualToAVR(float)
	 * @generated
	 */
	public float getManualToAVR() {
		return manualToAVR;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual To AVR</em>' attribute.
	 * @see #isSetManualToAVR()
	 * @see #unsetManualToAVR()
	 * @see #getManualToAVR()
	 * @generated
	 */
	public void setManualToAVR(float newManualToAVR) {
		manualToAVR = newManualToAVR;
		manualToAVRESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetManualToAVR()
	 * @see #getManualToAVR()
	 * @see #setManualToAVR(float)
	 * @generated
	 */
	public void unsetManualToAVR() {
		manualToAVR = MANUAL_TO_AVR_EDEFAULT;
		manualToAVRESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getManualToAVR <em>Manual To AVR</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manual To AVR</em>' attribute is set.
	 * @see #unsetManualToAVR()
	 * @see #getManualToAVR()
	 * @see #setManualToAVR(float)
	 * @generated
	 */
	public boolean isSetManualToAVR() {
		return manualToAVRESet;
	}

	/**
	 * Returns the value of the '<em><b>QPercent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QPercent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QPercent</em>' attribute.
	 * @see #isSetQPercent()
	 * @see #unsetQPercent()
	 * @see #setQPercent(float)
	 * @generated
	 */
	public float getQPercent() {
		return qPercent;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QPercent</em>' attribute.
	 * @see #isSetQPercent()
	 * @see #unsetQPercent()
	 * @see #getQPercent()
	 * @generated
	 */
	public void setQPercent(float newQPercent) {
		qPercent = newQPercent;
		qPercentESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQPercent()
	 * @see #getQPercent()
	 * @see #setQPercent(float)
	 * @generated
	 */
	public void unsetQPercent() {
		qPercent = QPERCENT_EDEFAULT;
		qPercentESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getQPercent <em>QPercent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>QPercent</em>' attribute is set.
	 * @see #unsetQPercent()
	 * @see #getQPercent()
	 * @see #setQPercent(float)
	 * @generated
	 */
	public boolean isSetQPercent() {
		return qPercentESet;
	}

	/**
	 * Returns the value of the '<em><b>Coolant Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coolant Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coolant Condition</em>' attribute.
	 * @see #isSetCoolantCondition()
	 * @see #unsetCoolantCondition()
	 * @see #setCoolantCondition(float)
	 * @generated
	 */
	public float getCoolantCondition() {
		return coolantCondition;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coolant Condition</em>' attribute.
	 * @see #isSetCoolantCondition()
	 * @see #unsetCoolantCondition()
	 * @see #getCoolantCondition()
	 * @generated
	 */
	public void setCoolantCondition(float newCoolantCondition) {
		coolantCondition = newCoolantCondition;
		coolantConditionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoolantCondition()
	 * @see #getCoolantCondition()
	 * @see #setCoolantCondition(float)
	 * @generated
	 */
	public void unsetCoolantCondition() {
		coolantCondition = COOLANT_CONDITION_EDEFAULT;
		coolantConditionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantCondition <em>Coolant Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coolant Condition</em>' attribute is set.
	 * @see #unsetCoolantCondition()
	 * @see #getCoolantCondition()
	 * @see #setCoolantCondition(float)
	 * @generated
	 */
	public boolean isSetCoolantCondition() {
		return coolantConditionESet;
	}

	/**
	 * Returns the value of the '<em><b>Condenser P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condenser P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condenser P</em>' attribute.
	 * @see #isSetCondenserP()
	 * @see #unsetCondenserP()
	 * @see #setCondenserP(float)
	 * @generated
	 */
	public float getCondenserP() {
		return condenserP;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condenser P</em>' attribute.
	 * @see #isSetCondenserP()
	 * @see #unsetCondenserP()
	 * @see #getCondenserP()
	 * @generated
	 */
	public void setCondenserP(float newCondenserP) {
		condenserP = newCondenserP;
		condenserPESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCondenserP()
	 * @see #getCondenserP()
	 * @see #setCondenserP(float)
	 * @generated
	 */
	public void unsetCondenserP() {
		condenserP = CONDENSER_P_EDEFAULT;
		condenserPESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCondenserP <em>Condenser P</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condenser P</em>' attribute is set.
	 * @see #unsetCondenserP()
	 * @see #getCondenserP()
	 * @see #setCondenserP(float)
	 * @generated
	 */
	public boolean isSetCondenserP() {
		return condenserPESet;
	}

	/**
	 * Returns the value of the '<em><b>XQuad Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Trans</em>' attribute.
	 * @see #isSetXQuadTrans()
	 * @see #unsetXQuadTrans()
	 * @see #setXQuadTrans(float)
	 * @generated
	 */
	public float getXQuadTrans() {
		return xQuadTrans;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Trans</em>' attribute.
	 * @see #isSetXQuadTrans()
	 * @see #unsetXQuadTrans()
	 * @see #getXQuadTrans()
	 * @generated
	 */
	public void setXQuadTrans(float newXQuadTrans) {
		xQuadTrans = newXQuadTrans;
		xQuadTransESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXQuadTrans()
	 * @see #getXQuadTrans()
	 * @see #setXQuadTrans(float)
	 * @generated
	 */
	public void unsetXQuadTrans() {
		xQuadTrans = XQUAD_TRANS_EDEFAULT;
		xQuadTransESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadTrans <em>XQuad Trans</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XQuad Trans</em>' attribute is set.
	 * @see #unsetXQuadTrans()
	 * @see #getXQuadTrans()
	 * @see #setXQuadTrans(float)
	 * @generated
	 */
	public boolean isSetXQuadTrans() {
		return xQuadTransESet;
	}

	/**
	 * Returns the value of the '<em><b>XQuad Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Subtrans</em>' attribute.
	 * @see #isSetXQuadSubtrans()
	 * @see #unsetXQuadSubtrans()
	 * @see #setXQuadSubtrans(float)
	 * @generated
	 */
	public float getXQuadSubtrans() {
		return xQuadSubtrans;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Subtrans</em>' attribute.
	 * @see #isSetXQuadSubtrans()
	 * @see #unsetXQuadSubtrans()
	 * @see #getXQuadSubtrans()
	 * @generated
	 */
	public void setXQuadSubtrans(float newXQuadSubtrans) {
		xQuadSubtrans = newXQuadSubtrans;
		xQuadSubtransESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXQuadSubtrans()
	 * @see #getXQuadSubtrans()
	 * @see #setXQuadSubtrans(float)
	 * @generated
	 */
	public void unsetXQuadSubtrans() {
		xQuadSubtrans = XQUAD_SUBTRANS_EDEFAULT;
		xQuadSubtransESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XQuad Subtrans</em>' attribute is set.
	 * @see #unsetXQuadSubtrans()
	 * @see #getXQuadSubtrans()
	 * @see #setXQuadSubtrans(float)
	 * @generated
	 */
	public boolean isSetXQuadSubtrans() {
		return xQuadSubtransESet;
	}

	/**
	 * Returns the value of the '<em><b>XQuad Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XQuad Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XQuad Sync</em>' attribute.
	 * @see #isSetXQuadSync()
	 * @see #unsetXQuadSync()
	 * @see #setXQuadSync(float)
	 * @generated
	 */
	public float getXQuadSync() {
		return xQuadSync;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XQuad Sync</em>' attribute.
	 * @see #isSetXQuadSync()
	 * @see #unsetXQuadSync()
	 * @see #getXQuadSync()
	 * @generated
	 */
	public void setXQuadSync(float newXQuadSync) {
		xQuadSync = newXQuadSync;
		xQuadSyncESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXQuadSync()
	 * @see #getXQuadSync()
	 * @see #setXQuadSync(float)
	 * @generated
	 */
	public void unsetXQuadSync() {
		xQuadSync = XQUAD_SYNC_EDEFAULT;
		xQuadSyncESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXQuadSync <em>XQuad Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XQuad Sync</em>' attribute is set.
	 * @see #unsetXQuadSync()
	 * @see #getXQuadSync()
	 * @see #setXQuadSync(float)
	 * @generated
	 */
	public boolean isSetXQuadSync() {
		return xQuadSyncESet;
	}

	/**
	 * Returns the value of the '<em><b>XDirect Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Sync</em>' attribute.
	 * @see #isSetXDirectSync()
	 * @see #unsetXDirectSync()
	 * @see #setXDirectSync(float)
	 * @generated
	 */
	public float getXDirectSync() {
		return xDirectSync;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Sync</em>' attribute.
	 * @see #isSetXDirectSync()
	 * @see #unsetXDirectSync()
	 * @see #getXDirectSync()
	 * @generated
	 */
	public void setXDirectSync(float newXDirectSync) {
		xDirectSync = newXDirectSync;
		xDirectSyncESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXDirectSync()
	 * @see #getXDirectSync()
	 * @see #setXDirectSync(float)
	 * @generated
	 */
	public void unsetXDirectSync() {
		xDirectSync = XDIRECT_SYNC_EDEFAULT;
		xDirectSyncESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSync <em>XDirect Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XDirect Sync</em>' attribute is set.
	 * @see #unsetXDirectSync()
	 * @see #getXDirectSync()
	 * @see #setXDirectSync(float)
	 * @generated
	 */
	public boolean isSetXDirectSync() {
		return xDirectSyncESet;
	}

	/**
	 * Returns the value of the '<em><b>Min Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Q</em>' attribute.
	 * @see #isSetMinQ()
	 * @see #unsetMinQ()
	 * @see #setMinQ(float)
	 * @generated
	 */
	public float getMinQ() {
		return minQ;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Q</em>' attribute.
	 * @see #isSetMinQ()
	 * @see #unsetMinQ()
	 * @see #getMinQ()
	 * @generated
	 */
	public void setMinQ(float newMinQ) {
		minQ = newMinQ;
		minQESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinQ()
	 * @see #getMinQ()
	 * @see #setMinQ(float)
	 * @generated
	 */
	public void unsetMinQ() {
		minQ = MIN_Q_EDEFAULT;
		minQESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinQ <em>Min Q</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Q</em>' attribute is set.
	 * @see #unsetMinQ()
	 * @see #getMinQ()
	 * @see #setMinQ(float)
	 * @generated
	 */
	public boolean isSetMinQ() {
		return minQESet;
	}

	/**
	 * Returns the value of the '<em><b>AVR To Manual Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AVR To Manual Lag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVR To Manual Lag</em>' attribute.
	 * @see #isSetAVRToManualLag()
	 * @see #unsetAVRToManualLag()
	 * @see #setAVRToManualLag(float)
	 * @generated
	 */
	public float getAVRToManualLag() {
		return aVRToManualLag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVR To Manual Lag</em>' attribute.
	 * @see #isSetAVRToManualLag()
	 * @see #unsetAVRToManualLag()
	 * @see #getAVRToManualLag()
	 * @generated
	 */
	public void setAVRToManualLag(float newAVRToManualLag) {
		aVRToManualLag = newAVRToManualLag;
		aVRToManualLagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAVRToManualLag()
	 * @see #getAVRToManualLag()
	 * @see #setAVRToManualLag(float)
	 * @generated
	 */
	public void unsetAVRToManualLag() {
		aVRToManualLag = AVR_TO_MANUAL_LAG_EDEFAULT;
		aVRToManualLagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLag <em>AVR To Manual Lag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AVR To Manual Lag</em>' attribute is set.
	 * @see #unsetAVRToManualLag()
	 * @see #getAVRToManualLag()
	 * @see #setAVRToManualLag(float)
	 * @generated
	 */
	public boolean isSetAVRToManualLag() {
		return aVRToManualLagESet;
	}

	/**
	 * Returns the value of the '<em><b>Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping</em>' attribute.
	 * @see #isSetDamping()
	 * @see #unsetDamping()
	 * @see #setDamping(float)
	 * @generated
	 */
	public float getDamping() {
		return damping;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping</em>' attribute.
	 * @see #isSetDamping()
	 * @see #unsetDamping()
	 * @see #getDamping()
	 * @generated
	 */
	public void setDamping(float newDamping) {
		damping = newDamping;
		dampingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDamping()
	 * @see #getDamping()
	 * @see #setDamping(float)
	 * @generated
	 */
	public void unsetDamping() {
		damping = DAMPING_EDEFAULT;
		dampingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getDamping <em>Damping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Damping</em>' attribute is set.
	 * @see #unsetDamping()
	 * @see #getDamping()
	 * @see #setDamping(float)
	 * @generated
	 */
	public boolean isSetDamping() {
		return dampingESet;
	}

	/**
	 * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generating Unit</em>' reference.
	 * @see #setGeneratingUnit(GeneratingUnit)
	 * @see CIM15.IEC61970.Generation.Production.GeneratingUnit#getSynchronousMachines
	 * @generated
	 */
	public GeneratingUnit getGeneratingUnit() {
		if (generatingUnit != null && generatingUnit.eIsProxy()) {
			InternalEObject oldGeneratingUnit = (InternalEObject)generatingUnit;
			generatingUnit = (GeneratingUnit)eResolveProxy(oldGeneratingUnit);
			if (generatingUnit != oldGeneratingUnit) {
			}
		}
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratingUnit basicGetGeneratingUnit() {
		return generatingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratingUnit(GeneratingUnit newGeneratingUnit, NotificationChain msgs) {
		GeneratingUnit oldGeneratingUnit = generatingUnit;
		generatingUnit = newGeneratingUnit;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getGeneratingUnit <em>Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Unit</em>' reference.
	 * @see #getGeneratingUnit()
	 * @generated
	 */
	public void setGeneratingUnit(GeneratingUnit newGeneratingUnit) {
		if (newGeneratingUnit != generatingUnit) {
			NotificationChain msgs = null;
			if (generatingUnit != null)
				msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
			if (newGeneratingUnit != null)
				msgs = ((InternalEObject)newGeneratingUnit).eInverseAdd(this, ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
			msgs = basicSetGeneratingUnit(newGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.SynchronousMachineOperatingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @see #isSetOperatingMode()
	 * @see #unsetOperatingMode()
	 * @see #setOperatingMode(SynchronousMachineOperatingMode)
	 * @generated
	 */
	public SynchronousMachineOperatingMode getOperatingMode() {
		return operatingMode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Mode</em>' attribute.
	 * @see CIM15.IEC61970.Wires.SynchronousMachineOperatingMode
	 * @see #isSetOperatingMode()
	 * @see #unsetOperatingMode()
	 * @see #getOperatingMode()
	 * @generated
	 */
	public void setOperatingMode(SynchronousMachineOperatingMode newOperatingMode) {
		operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
		operatingModeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperatingMode()
	 * @see #getOperatingMode()
	 * @see #setOperatingMode(SynchronousMachineOperatingMode)
	 * @generated
	 */
	public void unsetOperatingMode() {
		operatingMode = OPERATING_MODE_EDEFAULT;
		operatingModeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getOperatingMode <em>Operating Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operating Mode</em>' attribute is set.
	 * @see #unsetOperatingMode()
	 * @see #getOperatingMode()
	 * @see #setOperatingMode(SynchronousMachineOperatingMode)
	 * @generated
	 */
	public boolean isSetOperatingMode() {
		return operatingModeESet;
	}

	/**
	 * Returns the value of the '<em><b>XDirect Subtrans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Subtrans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Subtrans</em>' attribute.
	 * @see #isSetXDirectSubtrans()
	 * @see #unsetXDirectSubtrans()
	 * @see #setXDirectSubtrans(float)
	 * @generated
	 */
	public float getXDirectSubtrans() {
		return xDirectSubtrans;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Subtrans</em>' attribute.
	 * @see #isSetXDirectSubtrans()
	 * @see #unsetXDirectSubtrans()
	 * @see #getXDirectSubtrans()
	 * @generated
	 */
	public void setXDirectSubtrans(float newXDirectSubtrans) {
		xDirectSubtrans = newXDirectSubtrans;
		xDirectSubtransESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXDirectSubtrans()
	 * @see #getXDirectSubtrans()
	 * @see #setXDirectSubtrans(float)
	 * @generated
	 */
	public void unsetXDirectSubtrans() {
		xDirectSubtrans = XDIRECT_SUBTRANS_EDEFAULT;
		xDirectSubtransESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XDirect Subtrans</em>' attribute is set.
	 * @see #unsetXDirectSubtrans()
	 * @see #getXDirectSubtrans()
	 * @see #setXDirectSubtrans(float)
	 * @generated
	 */
	public boolean isSetXDirectSubtrans() {
		return xDirectSubtransESet;
	}

	/**
	 * Returns the value of the '<em><b>Coolant Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.CoolantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coolant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coolant Type</em>' attribute.
	 * @see CIM15.IEC61970.Wires.CoolantType
	 * @see #isSetCoolantType()
	 * @see #unsetCoolantType()
	 * @see #setCoolantType(CoolantType)
	 * @generated
	 */
	public CoolantType getCoolantType() {
		return coolantType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coolant Type</em>' attribute.
	 * @see CIM15.IEC61970.Wires.CoolantType
	 * @see #isSetCoolantType()
	 * @see #unsetCoolantType()
	 * @see #getCoolantType()
	 * @generated
	 */
	public void setCoolantType(CoolantType newCoolantType) {
		coolantType = newCoolantType == null ? COOLANT_TYPE_EDEFAULT : newCoolantType;
		coolantTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoolantType()
	 * @see #getCoolantType()
	 * @see #setCoolantType(CoolantType)
	 * @generated
	 */
	public void unsetCoolantType() {
		coolantType = COOLANT_TYPE_EDEFAULT;
		coolantTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getCoolantType <em>Coolant Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coolant Type</em>' attribute is set.
	 * @see #unsetCoolantType()
	 * @see #getCoolantType()
	 * @see #setCoolantType(CoolantType)
	 * @generated
	 */
	public boolean isSetCoolantType() {
		return coolantTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>AVR To Manual Lead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AVR To Manual Lead</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AVR To Manual Lead</em>' attribute.
	 * @see #isSetAVRToManualLead()
	 * @see #unsetAVRToManualLead()
	 * @see #setAVRToManualLead(float)
	 * @generated
	 */
	public float getAVRToManualLead() {
		return aVRToManualLead;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AVR To Manual Lead</em>' attribute.
	 * @see #isSetAVRToManualLead()
	 * @see #unsetAVRToManualLead()
	 * @see #getAVRToManualLead()
	 * @generated
	 */
	public void setAVRToManualLead(float newAVRToManualLead) {
		aVRToManualLead = newAVRToManualLead;
		aVRToManualLeadESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAVRToManualLead()
	 * @see #getAVRToManualLead()
	 * @see #setAVRToManualLead(float)
	 * @generated
	 */
	public void unsetAVRToManualLead() {
		aVRToManualLead = AVR_TO_MANUAL_LEAD_EDEFAULT;
		aVRToManualLeadESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getAVRToManualLead <em>AVR To Manual Lead</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AVR To Manual Lead</em>' attribute is set.
	 * @see #unsetAVRToManualLead()
	 * @see #getAVRToManualLead()
	 * @see #setAVRToManualLead(float)
	 * @generated
	 */
	public boolean isSetAVRToManualLead() {
		return aVRToManualLeadESet;
	}

	/**
	 * Returns the value of the '<em><b>Reactive Capability Curves</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines <em>Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactive Capability Curves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactive Capability Curves</em>' reference list.
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getSynchronousMachines
	 * @generated
	 */
	public EList<ReactiveCapabilityCurve> getReactiveCapabilityCurves() {
		if (reactiveCapabilityCurves == null) {
			reactiveCapabilityCurves = new BasicInternalEList<ReactiveCapabilityCurve>(ReactiveCapabilityCurve.class);
		}
		return reactiveCapabilityCurves;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMinU <em>Min U</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Max Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Q</em>' attribute.
	 * @see #isSetMaxQ()
	 * @see #unsetMaxQ()
	 * @see #setMaxQ(float)
	 * @generated
	 */
	public float getMaxQ() {
		return maxQ;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Q</em>' attribute.
	 * @see #isSetMaxQ()
	 * @see #unsetMaxQ()
	 * @see #getMaxQ()
	 * @generated
	 */
	public void setMaxQ(float newMaxQ) {
		maxQ = newMaxQ;
		maxQESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxQ()
	 * @see #getMaxQ()
	 * @see #setMaxQ(float)
	 * @generated
	 */
	public void unsetMaxQ() {
		maxQ = MAX_Q_EDEFAULT;
		maxQESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxQ <em>Max Q</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Q</em>' attribute is set.
	 * @see #unsetMaxQ()
	 * @see #getMaxQ()
	 * @see #setMaxQ(float)
	 * @generated
	 */
	public boolean isSetMaxQ() {
		return maxQESet;
	}

	/**
	 * Returns the value of the '<em><b>Reference Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Priority</em>' attribute.
	 * @see #isSetReferencePriority()
	 * @see #unsetReferencePriority()
	 * @see #setReferencePriority(int)
	 * @generated
	 */
	public int getReferencePriority() {
		return referencePriority;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Priority</em>' attribute.
	 * @see #isSetReferencePriority()
	 * @see #unsetReferencePriority()
	 * @see #getReferencePriority()
	 * @generated
	 */
	public void setReferencePriority(int newReferencePriority) {
		referencePriority = newReferencePriority;
		referencePriorityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencePriority()
	 * @see #getReferencePriority()
	 * @see #setReferencePriority(int)
	 * @generated
	 */
	public void unsetReferencePriority() {
		referencePriority = REFERENCE_PRIORITY_EDEFAULT;
		referencePriorityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getReferencePriority <em>Reference Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Priority</em>' attribute is set.
	 * @see #unsetReferencePriority()
	 * @see #getReferencePriority()
	 * @see #setReferencePriority(int)
	 * @generated
	 */
	public boolean isSetReferencePriority() {
		return referencePriorityESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getMaxU <em>Max U</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>XDirect Trans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDirect Trans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDirect Trans</em>' attribute.
	 * @see #isSetXDirectTrans()
	 * @see #unsetXDirectTrans()
	 * @see #setXDirectTrans(float)
	 * @generated
	 */
	public float getXDirectTrans() {
		return xDirectTrans;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDirect Trans</em>' attribute.
	 * @see #isSetXDirectTrans()
	 * @see #unsetXDirectTrans()
	 * @see #getXDirectTrans()
	 * @generated
	 */
	public void setXDirectTrans(float newXDirectTrans) {
		xDirectTrans = newXDirectTrans;
		xDirectTransESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXDirectTrans()
	 * @see #getXDirectTrans()
	 * @see #setXDirectTrans(float)
	 * @generated
	 */
	public void unsetXDirectTrans() {
		xDirectTrans = XDIRECT_TRANS_EDEFAULT;
		xDirectTransESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getXDirectTrans <em>XDirect Trans</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XDirect Trans</em>' attribute is set.
	 * @see #unsetXDirectTrans()
	 * @see #getXDirectTrans()
	 * @see #setXDirectTrans(float)
	 * @generated
	 */
	public boolean isSetXDirectTrans() {
		return xDirectTransESet;
	}

	/**
	 * Returns the value of the '<em><b>Hydro Pump</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pump</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pump</em>' reference.
	 * @see #setHydroPump(HydroPump)
	 * @see CIM15.IEC61970.Generation.Production.HydroPump#getSynchronousMachine
	 * @generated
	 */
	public HydroPump getHydroPump() {
		if (hydroPump != null && hydroPump.eIsProxy()) {
			InternalEObject oldHydroPump = (InternalEObject)hydroPump;
			hydroPump = (HydroPump)eResolveProxy(oldHydroPump);
			if (hydroPump != oldHydroPump) {
			}
		}
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HydroPump basicGetHydroPump() {
		return hydroPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydroPump(HydroPump newHydroPump, NotificationChain msgs) {
		HydroPump oldHydroPump = hydroPump;
		hydroPump = newHydroPump;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Pump</em>' reference.
	 * @see #getHydroPump()
	 * @generated
	 */
	public void setHydroPump(HydroPump newHydroPump) {
		if (newHydroPump != hydroPump) {
			NotificationChain msgs = null;
			if (hydroPump != null)
				msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, HydroPump.class, msgs);
			if (newHydroPump != null)
				msgs = ((InternalEObject)newHydroPump).eInverseAdd(this, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, HydroPump.class, msgs);
			msgs = basicSetHydroPump(newHydroPump, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Inertia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inertia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inertia</em>' attribute.
	 * @see #isSetInertia()
	 * @see #unsetInertia()
	 * @see #setInertia(float)
	 * @generated
	 */
	public float getInertia() {
		return inertia;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertia</em>' attribute.
	 * @see #isSetInertia()
	 * @see #unsetInertia()
	 * @see #getInertia()
	 * @generated
	 */
	public void setInertia(float newInertia) {
		inertia = newInertia;
		inertiaESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInertia()
	 * @see #getInertia()
	 * @see #setInertia(float)
	 * @generated
	 */
	public void unsetInertia() {
		inertia = INERTIA_EDEFAULT;
		inertiaESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getInertia <em>Inertia</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inertia</em>' attribute is set.
	 * @see #unsetInertia()
	 * @see #getInertia()
	 * @see #setInertia(float)
	 * @generated
	 */
	public boolean isSetInertia() {
		return inertiaESet;
	}

	/**
	 * Returns the value of the '<em><b>Base Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Q</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Q</em>' attribute.
	 * @see #isSetBaseQ()
	 * @see #unsetBaseQ()
	 * @see #setBaseQ(float)
	 * @generated
	 */
	public float getBaseQ() {
		return baseQ;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Q</em>' attribute.
	 * @see #isSetBaseQ()
	 * @see #unsetBaseQ()
	 * @see #getBaseQ()
	 * @generated
	 */
	public void setBaseQ(float newBaseQ) {
		baseQ = newBaseQ;
		baseQESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseQ()
	 * @see #getBaseQ()
	 * @see #setBaseQ(float)
	 * @generated
	 */
	public void unsetBaseQ() {
		baseQ = BASE_Q_EDEFAULT;
		baseQESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getBaseQ <em>Base Q</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Q</em>' attribute is set.
	 * @see #unsetBaseQ()
	 * @see #getBaseQ()
	 * @see #setBaseQ(float)
	 * @generated
	 */
	public boolean isSetBaseQ() {
		return baseQESet;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Wires.SynchronousMachineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CIM15.IEC61970.Wires.SynchronousMachineType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(SynchronousMachineType)
	 * @generated
	 */
	public SynchronousMachineType getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CIM15.IEC61970.Wires.SynchronousMachineType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(SynchronousMachineType newType) {
		type = newType == null ? TYPE_EDEFAULT : newType;
		typeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(SynchronousMachineType)
	 * @generated
	 */
	public void unsetType() {
		type = TYPE_EDEFAULT;
		typeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(SynchronousMachineType)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getR <em>R</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX0 <em>X0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #setX2(float)
	 * @generated
	 */
	public float getX2() {
		return x2;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #getX2()
	 * @generated
	 */
	public void setX2(float newX2) {
		x2 = newX2;
		x2ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX2()
	 * @see #getX2()
	 * @see #setX2(float)
	 * @generated
	 */
	public void unsetX2() {
		x2 = X2_EDEFAULT;
		x2ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX2 <em>X2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X2</em>' attribute is set.
	 * @see #unsetX2()
	 * @see #getX2()
	 * @see #setX2(float)
	 * @generated
	 */
	public boolean isSetX2() {
		return x2ESet;
	}

	/**
	 * Returns the value of the '<em><b>Initial Reactive Capability Curve</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Reactive Capability Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Reactive Capability Curve</em>' reference.
	 * @see #setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve)
	 * @see CIM15.IEC61970.Wires.ReactiveCapabilityCurve#getInitiallyUsedBySynchronousMachines
	 * @generated
	 */
	public ReactiveCapabilityCurve getInitialReactiveCapabilityCurve() {
		if (initialReactiveCapabilityCurve != null && initialReactiveCapabilityCurve.eIsProxy()) {
			InternalEObject oldInitialReactiveCapabilityCurve = (InternalEObject)initialReactiveCapabilityCurve;
			initialReactiveCapabilityCurve = (ReactiveCapabilityCurve)eResolveProxy(oldInitialReactiveCapabilityCurve);
			if (initialReactiveCapabilityCurve != oldInitialReactiveCapabilityCurve) {
			}
		}
		return initialReactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveCapabilityCurve basicGetInitialReactiveCapabilityCurve() {
		return initialReactiveCapabilityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialReactiveCapabilityCurve(ReactiveCapabilityCurve newInitialReactiveCapabilityCurve, NotificationChain msgs) {
		ReactiveCapabilityCurve oldInitialReactiveCapabilityCurve = initialReactiveCapabilityCurve;
		initialReactiveCapabilityCurve = newInitialReactiveCapabilityCurve;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getInitialReactiveCapabilityCurve <em>Initial Reactive Capability Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Reactive Capability Curve</em>' reference.
	 * @see #getInitialReactiveCapabilityCurve()
	 * @generated
	 */
	public void setInitialReactiveCapabilityCurve(ReactiveCapabilityCurve newInitialReactiveCapabilityCurve) {
		if (newInitialReactiveCapabilityCurve != initialReactiveCapabilityCurve) {
			NotificationChain msgs = null;
			if (initialReactiveCapabilityCurve != null)
				msgs = ((InternalEObject)initialReactiveCapabilityCurve).eInverseRemove(this, WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES, ReactiveCapabilityCurve.class, msgs);
			if (newInitialReactiveCapabilityCurve != null)
				msgs = ((InternalEObject)newInitialReactiveCapabilityCurve).eInverseAdd(this, WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES, ReactiveCapabilityCurve.class, msgs);
			msgs = basicSetInitialReactiveCapabilityCurve(newInitialReactiveCapabilityCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.SynchronousMachine#getX <em>X</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrimeMovers()).basicAdd(otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				if (generatingUnit != null)
					msgs = ((InternalEObject)generatingUnit).eInverseRemove(this, ProductionPackage.GENERATING_UNIT__SYNCHRONOUS_MACHINES, GeneratingUnit.class, msgs);
				return basicSetGeneratingUnit((GeneratingUnit)otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReactiveCapabilityCurves()).basicAdd(otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				if (hydroPump != null)
					msgs = ((InternalEObject)hydroPump).eInverseRemove(this, ProductionPackage.HYDRO_PUMP__SYNCHRONOUS_MACHINE, HydroPump.class, msgs);
				return basicSetHydroPump((HydroPump)otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				if (initialReactiveCapabilityCurve != null)
					msgs = ((InternalEObject)initialReactiveCapabilityCurve).eInverseRemove(this, WiresPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES, ReactiveCapabilityCurve.class, msgs);
				return basicSetInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)otherEnd, msgs);
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
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return ((InternalEList<?>)getPrimeMovers()).basicRemove(otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				return basicSetGeneratingUnit(null, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return ((InternalEList<?>)getReactiveCapabilityCurves()).basicRemove(otherEnd, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				return basicSetHydroPump(null, msgs);
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				return basicSetInitialReactiveCapabilityCurve(null, msgs);
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
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				return getRatedS();
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return getPrimeMovers();
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				return getR2();
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				return getR0();
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				return getManualToAVR();
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				return getQPercent();
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				return getCoolantCondition();
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				return getCondenserP();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				return getXQuadTrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				return getXQuadSubtrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				return getXQuadSync();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				return getXDirectSync();
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				return getMinQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				return getAVRToManualLag();
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				return getDamping();
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				if (resolve) return getGeneratingUnit();
				return basicGetGeneratingUnit();
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				return getOperatingMode();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				return getXDirectSubtrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				return getCoolantType();
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				return getAVRToManualLead();
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return getReactiveCapabilityCurves();
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				return getMinU();
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				return getMaxQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				return getReferencePriority();
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				return getMaxU();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				return getXDirectTrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				if (resolve) return getHydroPump();
				return basicGetHydroPump();
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				return getInertia();
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				return getBaseQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				return getType();
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				return getR();
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				return getX0();
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				return getX2();
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				if (resolve) return getInitialReactiveCapabilityCurve();
				return basicGetInitialReactiveCapabilityCurve();
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				return getX();
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
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				setRatedS((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				getPrimeMovers().clear();
				getPrimeMovers().addAll((Collection<? extends PrimeMover>)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				setR2((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				setManualToAVR((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				setQPercent((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				setCoolantCondition((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				setCondenserP((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				setXQuadTrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				setXQuadSubtrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				setXQuadSync((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				setXDirectSync((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				setMinQ((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				setAVRToManualLag((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				setDamping((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				setOperatingMode((SynchronousMachineOperatingMode)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				setXDirectSubtrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				setCoolantType((CoolantType)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				setAVRToManualLead((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				getReactiveCapabilityCurves().clear();
				getReactiveCapabilityCurves().addAll((Collection<? extends ReactiveCapabilityCurve>)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				setMinU((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				setMaxQ((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				setReferencePriority((Integer)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				setMaxU((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				setXDirectTrans((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				setHydroPump((HydroPump)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				setInertia((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				setBaseQ((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				setType((SynchronousMachineType)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				setR((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				setX2((Float)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				setInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)newValue);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				setX((Float)newValue);
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
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				unsetRatedS();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				getPrimeMovers().clear();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				unsetR2();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				unsetR0();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				unsetManualToAVR();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				unsetQPercent();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				unsetCoolantCondition();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				unsetCondenserP();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				unsetXQuadTrans();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				unsetXQuadSubtrans();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				unsetXQuadSync();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				unsetXDirectSync();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				unsetMinQ();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				unsetAVRToManualLag();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				unsetDamping();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				setGeneratingUnit((GeneratingUnit)null);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				unsetOperatingMode();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				unsetXDirectSubtrans();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				unsetCoolantType();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				unsetAVRToManualLead();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				getReactiveCapabilityCurves().clear();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				unsetMinU();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				unsetMaxQ();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				unsetReferencePriority();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				unsetMaxU();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				unsetXDirectTrans();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				setHydroPump((HydroPump)null);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				unsetInertia();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				unsetBaseQ();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				unsetType();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				unsetR();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				unsetX0();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				unsetX2();
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				setInitialReactiveCapabilityCurve((ReactiveCapabilityCurve)null);
				return;
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				unsetX();
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
			case WiresPackage.SYNCHRONOUS_MACHINE__RATED_S:
				return isSetRatedS();
			case WiresPackage.SYNCHRONOUS_MACHINE__PRIME_MOVERS:
				return primeMovers != null && !primeMovers.isEmpty();
			case WiresPackage.SYNCHRONOUS_MACHINE__R2:
				return isSetR2();
			case WiresPackage.SYNCHRONOUS_MACHINE__R0:
				return isSetR0();
			case WiresPackage.SYNCHRONOUS_MACHINE__MANUAL_TO_AVR:
				return isSetManualToAVR();
			case WiresPackage.SYNCHRONOUS_MACHINE__QPERCENT:
				return isSetQPercent();
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_CONDITION:
				return isSetCoolantCondition();
			case WiresPackage.SYNCHRONOUS_MACHINE__CONDENSER_P:
				return isSetCondenserP();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_TRANS:
				return isSetXQuadTrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SUBTRANS:
				return isSetXQuadSubtrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__XQUAD_SYNC:
				return isSetXQuadSync();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SYNC:
				return isSetXDirectSync();
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_Q:
				return isSetMinQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LAG:
				return isSetAVRToManualLag();
			case WiresPackage.SYNCHRONOUS_MACHINE__DAMPING:
				return isSetDamping();
			case WiresPackage.SYNCHRONOUS_MACHINE__GENERATING_UNIT:
				return generatingUnit != null;
			case WiresPackage.SYNCHRONOUS_MACHINE__OPERATING_MODE:
				return isSetOperatingMode();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_SUBTRANS:
				return isSetXDirectSubtrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__COOLANT_TYPE:
				return isSetCoolantType();
			case WiresPackage.SYNCHRONOUS_MACHINE__AVR_TO_MANUAL_LEAD:
				return isSetAVRToManualLead();
			case WiresPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES:
				return reactiveCapabilityCurves != null && !reactiveCapabilityCurves.isEmpty();
			case WiresPackage.SYNCHRONOUS_MACHINE__MIN_U:
				return isSetMinU();
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_Q:
				return isSetMaxQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__REFERENCE_PRIORITY:
				return isSetReferencePriority();
			case WiresPackage.SYNCHRONOUS_MACHINE__MAX_U:
				return isSetMaxU();
			case WiresPackage.SYNCHRONOUS_MACHINE__XDIRECT_TRANS:
				return isSetXDirectTrans();
			case WiresPackage.SYNCHRONOUS_MACHINE__HYDRO_PUMP:
				return hydroPump != null;
			case WiresPackage.SYNCHRONOUS_MACHINE__INERTIA:
				return isSetInertia();
			case WiresPackage.SYNCHRONOUS_MACHINE__BASE_Q:
				return isSetBaseQ();
			case WiresPackage.SYNCHRONOUS_MACHINE__TYPE:
				return isSetType();
			case WiresPackage.SYNCHRONOUS_MACHINE__R:
				return isSetR();
			case WiresPackage.SYNCHRONOUS_MACHINE__X0:
				return isSetX0();
			case WiresPackage.SYNCHRONOUS_MACHINE__X2:
				return isSetX2();
			case WiresPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE:
				return initialReactiveCapabilityCurve != null;
			case WiresPackage.SYNCHRONOUS_MACHINE__X:
				return isSetX();
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
		result.append(" (ratedS: ");
		if (ratedSESet) result.append(ratedS); else result.append("<unset>");
		result.append(", r2: ");
		if (r2ESet) result.append(r2); else result.append("<unset>");
		result.append(", r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(", manualToAVR: ");
		if (manualToAVRESet) result.append(manualToAVR); else result.append("<unset>");
		result.append(", qPercent: ");
		if (qPercentESet) result.append(qPercent); else result.append("<unset>");
		result.append(", coolantCondition: ");
		if (coolantConditionESet) result.append(coolantCondition); else result.append("<unset>");
		result.append(", condenserP: ");
		if (condenserPESet) result.append(condenserP); else result.append("<unset>");
		result.append(", xQuadTrans: ");
		if (xQuadTransESet) result.append(xQuadTrans); else result.append("<unset>");
		result.append(", xQuadSubtrans: ");
		if (xQuadSubtransESet) result.append(xQuadSubtrans); else result.append("<unset>");
		result.append(", xQuadSync: ");
		if (xQuadSyncESet) result.append(xQuadSync); else result.append("<unset>");
		result.append(", xDirectSync: ");
		if (xDirectSyncESet) result.append(xDirectSync); else result.append("<unset>");
		result.append(", minQ: ");
		if (minQESet) result.append(minQ); else result.append("<unset>");
		result.append(", aVRToManualLag: ");
		if (aVRToManualLagESet) result.append(aVRToManualLag); else result.append("<unset>");
		result.append(", damping: ");
		if (dampingESet) result.append(damping); else result.append("<unset>");
		result.append(", operatingMode: ");
		if (operatingModeESet) result.append(operatingMode); else result.append("<unset>");
		result.append(", xDirectSubtrans: ");
		if (xDirectSubtransESet) result.append(xDirectSubtrans); else result.append("<unset>");
		result.append(", coolantType: ");
		if (coolantTypeESet) result.append(coolantType); else result.append("<unset>");
		result.append(", aVRToManualLead: ");
		if (aVRToManualLeadESet) result.append(aVRToManualLead); else result.append("<unset>");
		result.append(", minU: ");
		if (minUESet) result.append(minU); else result.append("<unset>");
		result.append(", maxQ: ");
		if (maxQESet) result.append(maxQ); else result.append("<unset>");
		result.append(", referencePriority: ");
		if (referencePriorityESet) result.append(referencePriority); else result.append("<unset>");
		result.append(", maxU: ");
		if (maxUESet) result.append(maxU); else result.append("<unset>");
		result.append(", xDirectTrans: ");
		if (xDirectTransESet) result.append(xDirectTrans); else result.append("<unset>");
		result.append(", inertia: ");
		if (inertiaESet) result.append(inertia); else result.append("<unset>");
		result.append(", baseQ: ");
		if (baseQESet) result.append(baseQ); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", x0: ");
		if (x0ESet) result.append(x0); else result.append("<unset>");
		result.append(", x2: ");
		if (x2ESet) result.append(x2); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SynchronousMachine
