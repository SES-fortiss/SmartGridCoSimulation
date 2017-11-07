/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment;

import CIM15.IEC61970.ControlArea.TieFlow;

import CIM15.IEC61970.Informative.InfAssets.Bushing;
import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM15.IEC61970.Meas.Measurement;

import CIM15.IEC61970.OperationalLimits.BranchGroupTerminal;
import CIM15.IEC61970.OperationalLimits.OperationalLimitSet;

import CIM15.IEC61970.StateVariables.StateVariablesPackage;
import CIM15.IEC61970.StateVariables.SvPowerFlow;

import CIM15.IEC61970.Topology.BusNameMarker;
import CIM15.IEC61970.Topology.TopologicalNode;
import CIM15.IEC61970.Topology.TopologyPackage;

import CIM15.IEC61970.Wires.MutualCoupling;
import CIM15.IEC61970.Wires.RegulatingControl;
import CIM15.IEC61970.Wires.TransformerEnd;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getHasSecond_MutualCoupling <em>Has Second Mutual Coupling</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getPhases <em>Phases</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#isConnected <em>Connected</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getHasFirst_MutualCoupling <em>Has First Mutual Coupling</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getAuxiliaryEquipment <em>Auxiliary Equipment</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.Terminal#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Terminal extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getBushingInfo() <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBushingInfo()
	 * @generated
	 * @ordered
	 */
	protected Bushing bushingInfo;

	/**
	 * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<TieFlow> tieFlow;

	/**
	 * The cached value of the '{@link #getHasSecond_MutualCoupling() <em>Has Second Mutual Coupling</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSecond_MutualCoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualCoupling> hasSecond_MutualCoupling;

	/**
	 * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.ABCN;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phases = PHASES_EDEFAULT;

	/**
	 * This is true if the Phases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phasesESet;

	/**
	 * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitSet()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimitSet> operationalLimitSet;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * This is true if the Connected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectedESet;

	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatingControl> regulatingControl;

	/**
	 * The cached value of the '{@link #getHasFirst_MutualCoupling() <em>Has First Mutual Coupling</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFirst_MutualCoupling()
	 * @generated
	 * @ordered
	 */
	protected EList<MutualCoupling> hasFirst_MutualCoupling;

	/**
	 * The cached value of the '{@link #getAuxiliaryEquipment() <em>Auxiliary Equipment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryEquipment()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryEquipment> auxiliaryEquipment;

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
	 * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivityNode()
	 * @generated
	 * @ordered
	 */
	protected ConnectivityNode connectivityNode;

	/**
	 * The cached value of the '{@link #getBranchGroupTerminal() <em>Branch Group Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchGroupTerminal()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchGroupTerminal> branchGroupTerminal;

	/**
	 * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusNameMarker()
	 * @generated
	 * @ordered
	 */
	protected BusNameMarker busNameMarker;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Sequence Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumberESet;

	/**
	 * The cached value of the '{@link #getSvPowerFlow() <em>Sv Power Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvPowerFlow()
	 * @generated
	 * @ordered
	 */
	protected SvPowerFlow svPowerFlow;

	/**
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected TopologicalNode topologicalNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Terminal() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TERMINAL;
	}

	/**
	 * Returns the value of the '<em><b>Bushing Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Bushing#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bushing Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bushing Info</em>' reference.
	 * @see #setBushingInfo(Bushing)
	 * @see CIM15.IEC61970.Informative.InfAssets.Bushing#getTerminal
	 * @generated
	 */
	public Bushing getBushingInfo() {
		if (bushingInfo != null && bushingInfo.eIsProxy()) {
			InternalEObject oldBushingInfo = (InternalEObject)bushingInfo;
			bushingInfo = (Bushing)eResolveProxy(oldBushingInfo);
			if (bushingInfo != oldBushingInfo) {
			}
		}
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bushing basicGetBushingInfo() {
		return bushingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBushingInfo(Bushing newBushingInfo, NotificationChain msgs) {
		Bushing oldBushingInfo = bushingInfo;
		bushingInfo = newBushingInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getBushingInfo <em>Bushing Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bushing Info</em>' reference.
	 * @see #getBushingInfo()
	 * @generated
	 */
	public void setBushingInfo(Bushing newBushingInfo) {
		if (newBushingInfo != bushingInfo) {
			NotificationChain msgs = null;
			if (bushingInfo != null)
				msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING__TERMINAL, Bushing.class, msgs);
			if (newBushingInfo != null)
				msgs = ((InternalEObject)newBushingInfo).eInverseAdd(this, InfAssetsPackage.BUSHING__TERMINAL, Bushing.class, msgs);
			msgs = basicSetBushingInfo(newBushingInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.TieFlow}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.TieFlow#getTerminal
	 * @generated
	 */
	public EList<TieFlow> getTieFlow() {
		if (tieFlow == null) {
			tieFlow = new BasicInternalEList<TieFlow>(TieFlow.class);
		}
		return tieFlow;
	}

	/**
	 * Returns the value of the '<em><b>Has Second Mutual Coupling</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.MutualCoupling}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Second Mutual Coupling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Second Mutual Coupling</em>' reference list.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getSecond_Terminal
	 * @generated
	 */
	public EList<MutualCoupling> getHasSecond_MutualCoupling() {
		if (hasSecond_MutualCoupling == null) {
			hasSecond_MutualCoupling = new BasicInternalEList<MutualCoupling>(MutualCoupling.class);
		}
		return hasSecond_MutualCoupling;
	}

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' attribute.
	 * The default value is <code>"ABCN"</code>.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhases()
	 * @see #unsetPhases()
	 * @see #setPhases(PhaseCode)
	 * @generated
	 */
	public PhaseCode getPhases() {
		return phases;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhases()
	 * @see #unsetPhases()
	 * @see #getPhases()
	 * @generated
	 */
	public void setPhases(PhaseCode newPhases) {
		phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
		phasesESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Terminal#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhases()
	 * @see #getPhases()
	 * @see #setPhases(PhaseCode)
	 * @generated
	 */
	public void unsetPhases() {
		phases = PHASES_EDEFAULT;
		phasesESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Terminal#getPhases <em>Phases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phases</em>' attribute is set.
	 * @see #unsetPhases()
	 * @see #getPhases()
	 * @see #setPhases(PhaseCode)
	 * @generated
	 */
	public boolean isSetPhases() {
		return phasesESet;
	}

	/**
	 * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Limit Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Limit Set</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.OperationalLimitSet#getTerminal
	 * @generated
	 */
	public EList<OperationalLimitSet> getOperationalLimitSet() {
		if (operationalLimitSet == null) {
			operationalLimitSet = new BasicInternalEList<OperationalLimitSet>(OperationalLimitSet.class);
		}
		return operationalLimitSet;
	}

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Measurement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Measurement#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Measurement#getTerminal
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new BasicInternalEList<Measurement>(Measurement.class);
		}
		return measurements;
	}

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #isSetConnected()
	 * @see #unsetConnected()
	 * @see #setConnected(boolean)
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isSetConnected()
	 * @see #unsetConnected()
	 * @see #isConnected()
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		connected = newConnected;
		connectedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Terminal#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnected()
	 * @see #isConnected()
	 * @see #setConnected(boolean)
	 * @generated
	 */
	public void unsetConnected() {
		connected = CONNECTED_EDEFAULT;
		connectedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Terminal#isConnected <em>Connected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connected</em>' attribute is set.
	 * @see #unsetConnected()
	 * @see #isConnected()
	 * @see #setConnected(boolean)
	 * @generated
	 */
	public boolean isSetConnected() {
		return connectedESet;
	}

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConductingEquipment#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see CIM15.IEC61970.Core.ConductingEquipment#getTerminals
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Regulating Control</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.RegulatingControl}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.RegulatingControl#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulating Control</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulating Control</em>' reference list.
	 * @see CIM15.IEC61970.Wires.RegulatingControl#getTerminal
	 * @generated
	 */
	public EList<RegulatingControl> getRegulatingControl() {
		if (regulatingControl == null) {
			regulatingControl = new BasicInternalEList<RegulatingControl>(RegulatingControl.class);
		}
		return regulatingControl;
	}

	/**
	 * Returns the value of the '<em><b>Has First Mutual Coupling</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.MutualCoupling}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has First Mutual Coupling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has First Mutual Coupling</em>' reference list.
	 * @see CIM15.IEC61970.Wires.MutualCoupling#getFirst_Terminal
	 * @generated
	 */
	public EList<MutualCoupling> getHasFirst_MutualCoupling() {
		if (hasFirst_MutualCoupling == null) {
			hasFirst_MutualCoupling = new BasicInternalEList<MutualCoupling>(MutualCoupling.class);
		}
		return hasFirst_MutualCoupling;
	}

	/**
	 * Returns the value of the '<em><b>Auxiliary Equipment</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Equipment</em>' reference list.
	 * @see CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipment#getTerminal
	 * @generated
	 */
	public EList<AuxiliaryEquipment> getAuxiliaryEquipment() {
		if (auxiliaryEquipment == null) {
			auxiliaryEquipment = new BasicInternalEList<AuxiliaryEquipment>(AuxiliaryEquipment.class);
		}
		return auxiliaryEquipment;
	}

	/**
	 * Returns the value of the '<em><b>Transformer End</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerEnd}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getTerminal
	 * @generated
	 */
	public EList<TransformerEnd> getTransformerEnd() {
		if (transformerEnd == null) {
			transformerEnd = new BasicInternalEList<TransformerEnd>(TransformerEnd.class);
		}
		return transformerEnd;
	}

	/**
	 * Returns the value of the '<em><b>Connectivity Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ConnectivityNode#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity Node</em>' reference.
	 * @see #setConnectivityNode(ConnectivityNode)
	 * @see CIM15.IEC61970.Core.ConnectivityNode#getTerminals
	 * @generated
	 */
	public ConnectivityNode getConnectivityNode() {
		if (connectivityNode != null && connectivityNode.eIsProxy()) {
			InternalEObject oldConnectivityNode = (InternalEObject)connectivityNode;
			connectivityNode = (ConnectivityNode)eResolveProxy(oldConnectivityNode);
			if (connectivityNode != oldConnectivityNode) {
			}
		}
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNode basicGetConnectivityNode() {
		return connectivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectivityNode(ConnectivityNode newConnectivityNode, NotificationChain msgs) {
		ConnectivityNode oldConnectivityNode = connectivityNode;
		connectivityNode = newConnectivityNode;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getConnectivityNode <em>Connectivity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivity Node</em>' reference.
	 * @see #getConnectivityNode()
	 * @generated
	 */
	public void setConnectivityNode(ConnectivityNode newConnectivityNode) {
		if (newConnectivityNode != connectivityNode) {
			NotificationChain msgs = null;
			if (connectivityNode != null)
				msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
			if (newConnectivityNode != null)
				msgs = ((InternalEObject)newConnectivityNode).eInverseAdd(this, CorePackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
			msgs = basicSetConnectivityNode(newConnectivityNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Branch Group Terminal</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Group Terminal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Group Terminal</em>' reference list.
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal
	 * @generated
	 */
	public EList<BranchGroupTerminal> getBranchGroupTerminal() {
		if (branchGroupTerminal == null) {
			branchGroupTerminal = new BasicInternalEList<BranchGroupTerminal>(BranchGroupTerminal.class);
		}
		return branchGroupTerminal;
	}

	/**
	 * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.BusNameMarker#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Name Marker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Name Marker</em>' reference.
	 * @see #setBusNameMarker(BusNameMarker)
	 * @see CIM15.IEC61970.Topology.BusNameMarker#getTerminal
	 * @generated
	 */
	public BusNameMarker getBusNameMarker() {
		if (busNameMarker != null && busNameMarker.eIsProxy()) {
			InternalEObject oldBusNameMarker = (InternalEObject)busNameMarker;
			busNameMarker = (BusNameMarker)eResolveProxy(oldBusNameMarker);
			if (busNameMarker != oldBusNameMarker) {
			}
		}
		return busNameMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusNameMarker basicGetBusNameMarker() {
		return busNameMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusNameMarker(BusNameMarker newBusNameMarker, NotificationChain msgs) {
		BusNameMarker oldBusNameMarker = busNameMarker;
		busNameMarker = newBusNameMarker;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getBusNameMarker <em>Bus Name Marker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Name Marker</em>' reference.
	 * @see #getBusNameMarker()
	 * @generated
	 */
	public void setBusNameMarker(BusNameMarker newBusNameMarker) {
		if (newBusNameMarker != busNameMarker) {
			NotificationChain msgs = null;
			if (busNameMarker != null)
				msgs = ((InternalEObject)busNameMarker).eInverseRemove(this, TopologyPackage.BUS_NAME_MARKER__TERMINAL, BusNameMarker.class, msgs);
			if (newBusNameMarker != null)
				msgs = ((InternalEObject)newBusNameMarker).eInverseAdd(this, TopologyPackage.BUS_NAME_MARKER__TERMINAL, BusNameMarker.class, msgs);
			msgs = basicSetBusNameMarker(newBusNameMarker, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #isSetSequenceNumber()
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
		sequenceNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public void unsetSequenceNumber() {
		sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
		sequenceNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.Terminal#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
	 * @see #unsetSequenceNumber()
	 * @see #getSequenceNumber()
	 * @see #setSequenceNumber(int)
	 * @generated
	 */
	public boolean isSetSequenceNumber() {
		return sequenceNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Sv Power Flow</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.StateVariables.SvPowerFlow#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sv Power Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sv Power Flow</em>' reference.
	 * @see #setSvPowerFlow(SvPowerFlow)
	 * @see CIM15.IEC61970.StateVariables.SvPowerFlow#getTerminal
	 * @generated
	 */
	public SvPowerFlow getSvPowerFlow() {
		if (svPowerFlow != null && svPowerFlow.eIsProxy()) {
			InternalEObject oldSvPowerFlow = (InternalEObject)svPowerFlow;
			svPowerFlow = (SvPowerFlow)eResolveProxy(oldSvPowerFlow);
			if (svPowerFlow != oldSvPowerFlow) {
			}
		}
		return svPowerFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvPowerFlow basicGetSvPowerFlow() {
		return svPowerFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvPowerFlow(SvPowerFlow newSvPowerFlow, NotificationChain msgs) {
		SvPowerFlow oldSvPowerFlow = svPowerFlow;
		svPowerFlow = newSvPowerFlow;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sv Power Flow</em>' reference.
	 * @see #getSvPowerFlow()
	 * @generated
	 */
	public void setSvPowerFlow(SvPowerFlow newSvPowerFlow) {
		if (newSvPowerFlow != svPowerFlow) {
			NotificationChain msgs = null;
			if (svPowerFlow != null)
				msgs = ((InternalEObject)svPowerFlow).eInverseRemove(this, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, SvPowerFlow.class, msgs);
			if (newSvPowerFlow != null)
				msgs = ((InternalEObject)newSvPowerFlow).eInverseAdd(this, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, SvPowerFlow.class, msgs);
			msgs = basicSetSvPowerFlow(newSvPowerFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference.
	 * @see #setTopologicalNode(TopologicalNode)
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getTerminal
	 * @generated
	 */
	public TopologicalNode getTopologicalNode() {
		if (topologicalNode != null && topologicalNode.eIsProxy()) {
			InternalEObject oldTopologicalNode = (InternalEObject)topologicalNode;
			topologicalNode = (TopologicalNode)eResolveProxy(oldTopologicalNode);
			if (topologicalNode != oldTopologicalNode) {
			}
		}
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologicalNode basicGetTopologicalNode() {
		return topologicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologicalNode(TopologicalNode newTopologicalNode, NotificationChain msgs) {
		TopologicalNode oldTopologicalNode = topologicalNode;
		topologicalNode = newTopologicalNode;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.Terminal#getTopologicalNode <em>Topological Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topological Node</em>' reference.
	 * @see #getTopologicalNode()
	 * @generated
	 */
	public void setTopologicalNode(TopologicalNode newTopologicalNode) {
		if (newTopologicalNode != topologicalNode) {
			NotificationChain msgs = null;
			if (topologicalNode != null)
				msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs);
			if (newTopologicalNode != null)
				msgs = ((InternalEObject)newTopologicalNode).eInverseAdd(this, TopologyPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs);
			msgs = basicSetTopologicalNode(newTopologicalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case CorePackage.TERMINAL__BUSHING_INFO:
				if (bushingInfo != null)
					msgs = ((InternalEObject)bushingInfo).eInverseRemove(this, InfAssetsPackage.BUSHING__TERMINAL, Bushing.class, msgs);
				return basicSetBushingInfo((Bushing)otherEnd, msgs);
			case CorePackage.TERMINAL__TIE_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTieFlow()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasSecond_MutualCoupling()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimitSet()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulatingControl()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasFirst_MutualCoupling()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__AUXILIARY_EQUIPMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuxiliaryEquipment()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__TRANSFORMER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerEnd()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				if (connectivityNode != null)
					msgs = ((InternalEObject)connectivityNode).eInverseRemove(this, CorePackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs);
				return basicSetConnectivityNode((ConnectivityNode)otherEnd, msgs);
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranchGroupTerminal()).basicAdd(otherEnd, msgs);
			case CorePackage.TERMINAL__BUS_NAME_MARKER:
				if (busNameMarker != null)
					msgs = ((InternalEObject)busNameMarker).eInverseRemove(this, TopologyPackage.BUS_NAME_MARKER__TERMINAL, BusNameMarker.class, msgs);
				return basicSetBusNameMarker((BusNameMarker)otherEnd, msgs);
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				if (svPowerFlow != null)
					msgs = ((InternalEObject)svPowerFlow).eInverseRemove(this, StateVariablesPackage.SV_POWER_FLOW__TERMINAL, SvPowerFlow.class, msgs);
				return basicSetSvPowerFlow((SvPowerFlow)otherEnd, msgs);
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				if (topologicalNode != null)
					msgs = ((InternalEObject)topologicalNode).eInverseRemove(this, TopologyPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs);
				return basicSetTopologicalNode((TopologicalNode)otherEnd, msgs);
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
			case CorePackage.TERMINAL__BUSHING_INFO:
				return basicSetBushingInfo(null, msgs);
			case CorePackage.TERMINAL__TIE_FLOW:
				return ((InternalEList<?>)getTieFlow()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return ((InternalEList<?>)getHasSecond_MutualCoupling()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return ((InternalEList<?>)getOperationalLimitSet()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return ((InternalEList<?>)getRegulatingControl()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return ((InternalEList<?>)getHasFirst_MutualCoupling()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__AUXILIARY_EQUIPMENT:
				return ((InternalEList<?>)getAuxiliaryEquipment()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__TRANSFORMER_END:
				return ((InternalEList<?>)getTransformerEnd()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				return basicSetConnectivityNode(null, msgs);
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return ((InternalEList<?>)getBranchGroupTerminal()).basicRemove(otherEnd, msgs);
			case CorePackage.TERMINAL__BUS_NAME_MARKER:
				return basicSetBusNameMarker(null, msgs);
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				return basicSetSvPowerFlow(null, msgs);
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				return basicSetTopologicalNode(null, msgs);
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
			case CorePackage.TERMINAL__BUSHING_INFO:
				if (resolve) return getBushingInfo();
				return basicGetBushingInfo();
			case CorePackage.TERMINAL__TIE_FLOW:
				return getTieFlow();
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return getHasSecond_MutualCoupling();
			case CorePackage.TERMINAL__PHASES:
				return getPhases();
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return getOperationalLimitSet();
			case CorePackage.TERMINAL__MEASUREMENTS:
				return getMeasurements();
			case CorePackage.TERMINAL__CONNECTED:
				return isConnected();
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return getRegulatingControl();
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return getHasFirst_MutualCoupling();
			case CorePackage.TERMINAL__AUXILIARY_EQUIPMENT:
				return getAuxiliaryEquipment();
			case CorePackage.TERMINAL__TRANSFORMER_END:
				return getTransformerEnd();
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				if (resolve) return getConnectivityNode();
				return basicGetConnectivityNode();
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return getBranchGroupTerminal();
			case CorePackage.TERMINAL__BUS_NAME_MARKER:
				if (resolve) return getBusNameMarker();
				return basicGetBusNameMarker();
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				if (resolve) return getSvPowerFlow();
				return basicGetSvPowerFlow();
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				if (resolve) return getTopologicalNode();
				return basicGetTopologicalNode();
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
			case CorePackage.TERMINAL__BUSHING_INFO:
				setBushingInfo((Bushing)newValue);
				return;
			case CorePackage.TERMINAL__TIE_FLOW:
				getTieFlow().clear();
				getTieFlow().addAll((Collection<? extends TieFlow>)newValue);
				return;
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				getHasSecond_MutualCoupling().clear();
				getHasSecond_MutualCoupling().addAll((Collection<? extends MutualCoupling>)newValue);
				return;
			case CorePackage.TERMINAL__PHASES:
				setPhases((PhaseCode)newValue);
				return;
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
				getOperationalLimitSet().addAll((Collection<? extends OperationalLimitSet>)newValue);
				return;
			case CorePackage.TERMINAL__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
				return;
			case CorePackage.TERMINAL__CONNECTED:
				setConnected((Boolean)newValue);
				return;
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
				return;
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				getRegulatingControl().clear();
				getRegulatingControl().addAll((Collection<? extends RegulatingControl>)newValue);
				return;
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				getHasFirst_MutualCoupling().clear();
				getHasFirst_MutualCoupling().addAll((Collection<? extends MutualCoupling>)newValue);
				return;
			case CorePackage.TERMINAL__AUXILIARY_EQUIPMENT:
				getAuxiliaryEquipment().clear();
				getAuxiliaryEquipment().addAll((Collection<? extends AuxiliaryEquipment>)newValue);
				return;
			case CorePackage.TERMINAL__TRANSFORMER_END:
				getTransformerEnd().clear();
				getTransformerEnd().addAll((Collection<? extends TransformerEnd>)newValue);
				return;
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)newValue);
				return;
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				getBranchGroupTerminal().addAll((Collection<? extends BranchGroupTerminal>)newValue);
				return;
			case CorePackage.TERMINAL__BUS_NAME_MARKER:
				setBusNameMarker((BusNameMarker)newValue);
				return;
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				setSvPowerFlow((SvPowerFlow)newValue);
				return;
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)newValue);
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
			case CorePackage.TERMINAL__BUSHING_INFO:
				setBushingInfo((Bushing)null);
				return;
			case CorePackage.TERMINAL__TIE_FLOW:
				getTieFlow().clear();
				return;
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				getHasSecond_MutualCoupling().clear();
				return;
			case CorePackage.TERMINAL__PHASES:
				unsetPhases();
				return;
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				getOperationalLimitSet().clear();
				return;
			case CorePackage.TERMINAL__MEASUREMENTS:
				getMeasurements().clear();
				return;
			case CorePackage.TERMINAL__CONNECTED:
				unsetConnected();
				return;
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
				return;
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				getRegulatingControl().clear();
				return;
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				getHasFirst_MutualCoupling().clear();
				return;
			case CorePackage.TERMINAL__AUXILIARY_EQUIPMENT:
				getAuxiliaryEquipment().clear();
				return;
			case CorePackage.TERMINAL__TRANSFORMER_END:
				getTransformerEnd().clear();
				return;
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				setConnectivityNode((ConnectivityNode)null);
				return;
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				getBranchGroupTerminal().clear();
				return;
			case CorePackage.TERMINAL__BUS_NAME_MARKER:
				setBusNameMarker((BusNameMarker)null);
				return;
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				unsetSequenceNumber();
				return;
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				setSvPowerFlow((SvPowerFlow)null);
				return;
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				setTopologicalNode((TopologicalNode)null);
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
			case CorePackage.TERMINAL__BUSHING_INFO:
				return bushingInfo != null;
			case CorePackage.TERMINAL__TIE_FLOW:
				return tieFlow != null && !tieFlow.isEmpty();
			case CorePackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
				return hasSecond_MutualCoupling != null && !hasSecond_MutualCoupling.isEmpty();
			case CorePackage.TERMINAL__PHASES:
				return isSetPhases();
			case CorePackage.TERMINAL__OPERATIONAL_LIMIT_SET:
				return operationalLimitSet != null && !operationalLimitSet.isEmpty();
			case CorePackage.TERMINAL__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
			case CorePackage.TERMINAL__CONNECTED:
				return isSetConnected();
			case CorePackage.TERMINAL__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
			case CorePackage.TERMINAL__REGULATING_CONTROL:
				return regulatingControl != null && !regulatingControl.isEmpty();
			case CorePackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
				return hasFirst_MutualCoupling != null && !hasFirst_MutualCoupling.isEmpty();
			case CorePackage.TERMINAL__AUXILIARY_EQUIPMENT:
				return auxiliaryEquipment != null && !auxiliaryEquipment.isEmpty();
			case CorePackage.TERMINAL__TRANSFORMER_END:
				return transformerEnd != null && !transformerEnd.isEmpty();
			case CorePackage.TERMINAL__CONNECTIVITY_NODE:
				return connectivityNode != null;
			case CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL:
				return branchGroupTerminal != null && !branchGroupTerminal.isEmpty();
			case CorePackage.TERMINAL__BUS_NAME_MARKER:
				return busNameMarker != null;
			case CorePackage.TERMINAL__SEQUENCE_NUMBER:
				return isSetSequenceNumber();
			case CorePackage.TERMINAL__SV_POWER_FLOW:
				return svPowerFlow != null;
			case CorePackage.TERMINAL__TOPOLOGICAL_NODE:
				return topologicalNode != null;
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
		result.append(" (phases: ");
		if (phasesESet) result.append(phases); else result.append("<unset>");
		result.append(", connected: ");
		if (connectedESet) result.append(connected); else result.append("<unset>");
		result.append(", sequenceNumber: ");
		if (sequenceNumberESet) result.append(sequenceNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Terminal
