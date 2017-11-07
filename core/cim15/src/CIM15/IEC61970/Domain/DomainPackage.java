/**
 */
package CIM15.IEC61970.Domain;

import CIM15.CIM15Package;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;

import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.CommonPackage;

import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61968.IEC61968Package;

import CIM15.IEC61968.LoadControl.LoadControlPackage;

import CIM15.IEC61968.Metering.MeteringPackage;

import CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage;

import CIM15.IEC61968.Work.WorkPackage;

import CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage;

import CIM15.IEC61970.Contingency.ContingencyPackage;

import CIM15.IEC61970.ControlArea.ControlAreaPackage;

import CIM15.IEC61970.Core.CorePackage;

import CIM15.IEC61970.CutsJumpers.CutsJumpersPackage;

import CIM15.IEC61970.Equivalents.EquivalentsPackage;

import CIM15.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import CIM15.IEC61970.Generation.Production.ProductionPackage;

import CIM15.IEC61970.Graphics.GraphicsPackage;

import CIM15.IEC61970.IEC61970Package;

import CIM15.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;

import CIM15.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM15.IEC61970.Informative.InfCommon.InfCommonPackage;

import CIM15.IEC61970.Informative.InfCore.InfCorePackage;

import CIM15.IEC61970.Informative.InfCustomers.InfCustomersPackage;

import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM15.IEC61970.Informative.InfGMLSupport.InfGMLSupportPackage;

import CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlPackage;

import CIM15.IEC61970.Informative.InfLocations.InfLocationsPackage;

import CIM15.IEC61970.Informative.InfMetering.InfMeteringPackage;

import CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage;

import CIM15.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;

import CIM15.IEC61970.Informative.InfWork.InfWorkPackage;

import CIM15.IEC61970.LoadModel.LoadModelPackage;

import CIM15.IEC61970.Meas.MeasPackage;

import CIM15.IEC61970.OperationalLimits.OperationalLimitsPackage;

import CIM15.IEC61970.Outage.OutagePackage;

import CIM15.IEC61970.Protection.ProtectionPackage;

import CIM15.IEC61970.SCADA.SCADAPackage;

import CIM15.IEC61970.StateVariables.StateVariablesPackage;

import CIM15.IEC61970.Topology.TopologyPackage;

import CIM15.IEC61970.Wires.WiresPackage;

import CIM15.IEC61970.WiresPhaseModel.WiresPhaseModelPackage;

import CIM15.IEC62325.IEC62325Package;

import CIM15.PackageDependencies.PackageDependenciesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CIM15.IEC61970.Domain.DomainFactory
 * @generated
 */
public class DomainPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#Domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimDomain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DomainPackage eINSTANCE = CIM15.IEC61970.Domain.DomainPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Domain.DateTimeInterval <em>Date Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DateTimeInterval
	 * @see CIM15.IEC61970.Domain.DomainPackage#getDateTimeInterval()
	 * @generated
	 */
	public static final int DATE_TIME_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_INTERVAL__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_INTERVAL__END = 1;

	/**
	 * The number of structural features of the '<em>Date Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_INTERVAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Domain.UnitSymbol <em>Unit Symbol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @see CIM15.IEC61970.Domain.DomainPackage#getUnitSymbol()
	 * @generated
	 */
	public static final int UNIT_SYMBOL = 1;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Domain.Currency <em>Currency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.Currency
	 * @see CIM15.IEC61970.Domain.DomainPackage#getCurrency()
	 * @generated
	 */
	public static final int CURRENCY = 2;

	/**
	 * The meta object id for the '{@link CIM15.IEC61970.Domain.UnitMultiplier <em>Unit Multiplier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @see CIM15.IEC61970.Domain.DomainPackage#getUnitMultiplier()
	 * @generated
	 */
	public static final int UNIT_MULTIPLIER = 3;

	/**
	 * The meta object id for the '<em>Reactance Per Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getReactancePerLength()
	 * @generated
	 */
	public static final int REACTANCE_PER_LENGTH = 4;

	/**
	 * The meta object id for the '<em>Apparent Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getApparentPower()
	 * @generated
	 */
	public static final int APPARENT_POWER = 5;

	/**
	 * The meta object id for the '<em>Damping</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getDamping()
	 * @generated
	 */
	public static final int DAMPING = 6;

	/**
	 * The meta object id for the '<em>Susceptance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getSusceptance()
	 * @generated
	 */
	public static final int SUSCEPTANCE = 7;

	/**
	 * The meta object id for the '<em>Resistance Per Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getResistancePerLength()
	 * @generated
	 */
	public static final int RESISTANCE_PER_LENGTH = 8;

	/**
	 * The meta object id for the '<em>PU</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getPU()
	 * @generated
	 */
	public static final int PU = 9;

	/**
	 * The meta object id for the '<em>Current Flow</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getCurrentFlow()
	 * @generated
	 */
	public static final int CURRENT_FLOW = 10;

	/**
	 * The meta object id for the '<em>Anglerees</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getAnglerees()
	 * @generated
	 */
	public static final int ANGLEREES = 11;

	/**
	 * The meta object id for the '<em>Cost Rate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getCostRate()
	 * @generated
	 */
	public static final int COST_RATE = 12;

	/**
	 * The meta object id for the '<em>Cost Per Energy Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getCostPerEnergyUnit()
	 * @generated
	 */
	public static final int COST_PER_ENERGY_UNIT = 13;

	/**
	 * The meta object id for the '<em>Displacement</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getDisplacement()
	 * @generated
	 */
	public static final int DISPLACEMENT = 14;

	/**
	 * The meta object id for the '<em>Voltage</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getVoltage()
	 * @generated
	 */
	public static final int VOLTAGE = 15;

	/**
	 * The meta object id for the '<em>Reactance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getReactance()
	 * @generated
	 */
	public static final int REACTANCE = 16;

	/**
	 * The meta object id for the '<em>Pressure</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getPressure()
	 * @generated
	 */
	public static final int PRESSURE = 17;

	/**
	 * The meta object id for the '<em>Temperature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getTemperature()
	 * @generated
	 */
	public static final int TEMPERATURE = 18;

	/**
	 * The meta object id for the '<em>Rotation Speed</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getRotationSpeed()
	 * @generated
	 */
	public static final int ROTATION_SPEED = 19;

	/**
	 * The meta object id for the '<em>Susceptance Per Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getSusceptancePerLength()
	 * @generated
	 */
	public static final int SUSCEPTANCE_PER_LENGTH = 20;

	/**
	 * The meta object id for the '<em>String Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CIM15.IEC61970.Domain.DomainPackage#getStringQuantity()
	 * @generated
	 */
	public static final int STRING_QUANTITY = 21;

	/**
	 * The meta object id for the '<em>Active Power Change Rate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getActivePowerChangeRate()
	 * @generated
	 */
	public static final int ACTIVE_POWER_CHANGE_RATE = 22;

	/**
	 * The meta object id for the '<em>Absolute Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CIM15.IEC61970.Domain.DomainPackage#getAbsoluteDate()
	 * @generated
	 */
	public static final int ABSOLUTE_DATE = 23;

	/**
	 * The meta object id for the '<em>Active Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getActivePower()
	 * @generated
	 */
	public static final int ACTIVE_POWER = 24;

	/**
	 * The meta object id for the '<em>Volume</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getVolume()
	 * @generated
	 */
	public static final int VOLUME = 25;

	/**
	 * The meta object id for the '<em>Conductance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getConductance()
	 * @generated
	 */
	public static final int CONDUCTANCE = 26;

	/**
	 * The meta object id for the '<em>Inductance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getInductance()
	 * @generated
	 */
	public static final int INDUCTANCE = 27;

	/**
	 * The meta object id for the '<em>Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getReactivePower()
	 * @generated
	 */
	public static final int REACTIVE_POWER = 28;

	/**
	 * The meta object id for the '<em>Angle Radians</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getAngleRadians()
	 * @generated
	 */
	public static final int ANGLE_RADIANS = 29;

	/**
	 * The meta object id for the '<em>Frequency</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getFrequency()
	 * @generated
	 */
	public static final int FREQUENCY = 30;

	/**
	 * The meta object id for the '<em>Capacitance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getCapacitance()
	 * @generated
	 */
	public static final int CAPACITANCE = 31;

	/**
	 * The meta object id for the '<em>Money</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getMoney()
	 * @generated
	 */
	public static final int MONEY = 32;

	/**
	 * The meta object id for the '<em>Real Energy</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getRealEnergy()
	 * @generated
	 */
	public static final int REAL_ENERGY = 33;

	/**
	 * The meta object id for the '<em>KW Active Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getKWActivePower()
	 * @generated
	 */
	public static final int KW_ACTIVE_POWER = 34;

	/**
	 * The meta object id for the '<em>Minutes</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getMinutes()
	 * @generated
	 */
	public static final int MINUTES = 35;

	/**
	 * The meta object id for the '<em>Impedance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getImpedance()
	 * @generated
	 */
	public static final int IMPEDANCE = 36;

	/**
	 * The meta object id for the '<em>Voltage Per Reactive Power</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getVoltagePerReactivePower()
	 * @generated
	 */
	public static final int VOLTAGE_PER_REACTIVE_POWER = 37;

	/**
	 * The meta object id for the '<em>Volume Flow Rate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getVolumeFlowRate()
	 * @generated
	 */
	public static final int VOLUME_FLOW_RATE = 38;

	/**
	 * The meta object id for the '<em>Conductance Per Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getConductancePerLength()
	 * @generated
	 */
	public static final int CONDUCTANCE_PER_LENGTH = 39;

	/**
	 * The meta object id for the '<em>Per Cent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getPerCent()
	 * @generated
	 */
	public static final int PER_CENT = 40;

	/**
	 * The meta object id for the '<em>Weight</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getWeight()
	 * @generated
	 */
	public static final int WEIGHT = 41;

	/**
	 * The meta object id for the '<em>Resistance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getResistance()
	 * @generated
	 */
	public static final int RESISTANCE = 42;

	/**
	 * The meta object id for the '<em>Seconds</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getSeconds()
	 * @generated
	 */
	public static final int SECONDS = 43;

	/**
	 * The meta object id for the '<em>Float Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getFloatQuantity()
	 * @generated
	 */
	public static final int FLOAT_QUANTITY = 44;

	/**
	 * The meta object id for the '<em>Water Level</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getWaterLevel()
	 * @generated
	 */
	public static final int WATER_LEVEL = 45;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getLength()
	 * @generated
	 */
	public static final int LENGTH = 46;

	/**
	 * The meta object id for the '<em>Hours</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getHours()
	 * @generated
	 */
	public static final int HOURS = 47;

	/**
	 * The meta object id for the '<em>Integer Quantity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see CIM15.IEC61970.Domain.DomainPackage#getIntegerQuantity()
	 * @generated
	 */
	public static final int INTEGER_QUANTITY = 48;

	/**
	 * The meta object id for the '<em>Cost Per Volume</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61970.Domain.DomainPackage#getCostPerVolume()
	 * @generated
	 */
	public static final int COST_PER_VOLUME = 49;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitSymbolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitMultiplierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reactancePerLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType apparentPowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dampingEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType susceptanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resistancePerLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType puEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currentFlowEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anglereesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType costRateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType costPerEnergyUnitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displacementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voltageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reactanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pressureEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType temperatureEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rotationSpeedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType susceptancePerLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringQuantityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activePowerChangeRateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType absoluteDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activePowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType volumeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conductanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inductanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reactivePowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleRadiansEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frequencyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType capacitanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType moneyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realEnergyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kwActivePowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType minutesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType impedanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voltagePerReactivePowerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType volumeFlowRateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conductancePerLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType perCentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weightEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resistanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType secondsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatQuantityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType waterLevelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hoursEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerQuantityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType costPerVolumeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CIM15.IEC61970.Domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackage() {
		super(eNS_URI, DomainFactory.INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackage theDomainPackage = (DomainPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		CIM15Package theCIM15Package = (CIM15Package)(EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) instanceof CIM15Package ? EPackage.Registry.INSTANCE.getEPackage(CIM15Package.eNS_URI) : CIM15Package.eINSTANCE);
		IEC61970Package theIEC61970Package = (IEC61970Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) instanceof IEC61970Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61970Package.eNS_URI) : IEC61970Package.eINSTANCE);
		SCADAPackage theSCADAPackage = (SCADAPackage)(EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) instanceof SCADAPackage ? EPackage.Registry.INSTANCE.getEPackage(SCADAPackage.eNS_URI) : SCADAPackage.eINSTANCE);
		ProductionPackage theProductionPackage = (ProductionPackage)(EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) instanceof ProductionPackage ? EPackage.Registry.INSTANCE.getEPackage(ProductionPackage.eNS_URI) : ProductionPackage.eINSTANCE);
		GenerationDynamicsPackage theGenerationDynamicsPackage = (GenerationDynamicsPackage)(EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) instanceof GenerationDynamicsPackage ? EPackage.Registry.INSTANCE.getEPackage(GenerationDynamicsPackage.eNS_URI) : GenerationDynamicsPackage.eINSTANCE);
		InfWorkPackage theInfWorkPackage = (InfWorkPackage)(EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) instanceof InfWorkPackage ? EPackage.Registry.INSTANCE.getEPackage(InfWorkPackage.eNS_URI) : InfWorkPackage.eINSTANCE);
		InfERPSupportPackage theInfERPSupportPackage = (InfERPSupportPackage)(EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) instanceof InfERPSupportPackage ? EPackage.Registry.INSTANCE.getEPackage(InfERPSupportPackage.eNS_URI) : InfERPSupportPackage.eINSTANCE);
		InfCommonPackage theInfCommonPackage = (InfCommonPackage)(EPackage.Registry.INSTANCE.getEPackage(InfCommonPackage.eNS_URI) instanceof InfCommonPackage ? EPackage.Registry.INSTANCE.getEPackage(InfCommonPackage.eNS_URI) : InfCommonPackage.eINSTANCE);
		InfAssetsPackage theInfAssetsPackage = (InfAssetsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) instanceof InfAssetsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfAssetsPackage.eNS_URI) : InfAssetsPackage.eINSTANCE);
		InfCustomersPackage theInfCustomersPackage = (InfCustomersPackage)(EPackage.Registry.INSTANCE.getEPackage(InfCustomersPackage.eNS_URI) instanceof InfCustomersPackage ? EPackage.Registry.INSTANCE.getEPackage(InfCustomersPackage.eNS_URI) : InfCustomersPackage.eINSTANCE);
		InfOperationsPackage theInfOperationsPackage = (InfOperationsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI) instanceof InfOperationsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfOperationsPackage.eNS_URI) : InfOperationsPackage.eINSTANCE);
		InfLocationsPackage theInfLocationsPackage = (InfLocationsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfLocationsPackage.eNS_URI) instanceof InfLocationsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfLocationsPackage.eNS_URI) : InfLocationsPackage.eINSTANCE);
		InfGMLSupportPackage theInfGMLSupportPackage = (InfGMLSupportPackage)(EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI) instanceof InfGMLSupportPackage ? EPackage.Registry.INSTANCE.getEPackage(InfGMLSupportPackage.eNS_URI) : InfGMLSupportPackage.eINSTANCE);
		InfCorePackage theInfCorePackage = (InfCorePackage)(EPackage.Registry.INSTANCE.getEPackage(InfCorePackage.eNS_URI) instanceof InfCorePackage ? EPackage.Registry.INSTANCE.getEPackage(InfCorePackage.eNS_URI) : InfCorePackage.eINSTANCE);
		InfLoadControlPackage theInfLoadControlPackage = (InfLoadControlPackage)(EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI) instanceof InfLoadControlPackage ? EPackage.Registry.INSTANCE.getEPackage(InfLoadControlPackage.eNS_URI) : InfLoadControlPackage.eINSTANCE);
		InfMeteringPackage theInfMeteringPackage = (InfMeteringPackage)(EPackage.Registry.INSTANCE.getEPackage(InfMeteringPackage.eNS_URI) instanceof InfMeteringPackage ? EPackage.Registry.INSTANCE.getEPackage(InfMeteringPackage.eNS_URI) : InfMeteringPackage.eINSTANCE);
		InfAssetModelsPackage theInfAssetModelsPackage = (InfAssetModelsPackage)(EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) instanceof InfAssetModelsPackage ? EPackage.Registry.INSTANCE.getEPackage(InfAssetModelsPackage.eNS_URI) : InfAssetModelsPackage.eINSTANCE);
		InfTypeAssetPackage theInfTypeAssetPackage = (InfTypeAssetPackage)(EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI) instanceof InfTypeAssetPackage ? EPackage.Registry.INSTANCE.getEPackage(InfTypeAssetPackage.eNS_URI) : InfTypeAssetPackage.eINSTANCE);
		StateVariablesPackage theStateVariablesPackage = (StateVariablesPackage)(EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI) instanceof StateVariablesPackage ? EPackage.Registry.INSTANCE.getEPackage(StateVariablesPackage.eNS_URI) : StateVariablesPackage.eINSTANCE);
		WiresPackage theWiresPackage = (WiresPackage)(EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) instanceof WiresPackage ? EPackage.Registry.INSTANCE.getEPackage(WiresPackage.eNS_URI) : WiresPackage.eINSTANCE);
		MeasPackage theMeasPackage = (MeasPackage)(EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) instanceof MeasPackage ? EPackage.Registry.INSTANCE.getEPackage(MeasPackage.eNS_URI) : MeasPackage.eINSTANCE);
		LoadModelPackage theLoadModelPackage = (LoadModelPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) instanceof LoadModelPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadModelPackage.eNS_URI) : LoadModelPackage.eINSTANCE);
		WiresPhaseModelPackage theWiresPhaseModelPackage = (WiresPhaseModelPackage)(EPackage.Registry.INSTANCE.getEPackage(WiresPhaseModelPackage.eNS_URI) instanceof WiresPhaseModelPackage ? EPackage.Registry.INSTANCE.getEPackage(WiresPhaseModelPackage.eNS_URI) : WiresPhaseModelPackage.eINSTANCE);
		ControlAreaPackage theControlAreaPackage = (ControlAreaPackage)(EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) instanceof ControlAreaPackage ? EPackage.Registry.INSTANCE.getEPackage(ControlAreaPackage.eNS_URI) : ControlAreaPackage.eINSTANCE);
		AuxiliaryEquipmentPackage theAuxiliaryEquipmentPackage = (AuxiliaryEquipmentPackage)(EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI) instanceof AuxiliaryEquipmentPackage ? EPackage.Registry.INSTANCE.getEPackage(AuxiliaryEquipmentPackage.eNS_URI) : AuxiliaryEquipmentPackage.eINSTANCE);
		CorePackage theCorePackage = (CorePackage)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackage ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		GraphicsPackage theGraphicsPackage = (GraphicsPackage)(EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI) instanceof GraphicsPackage ? EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI) : GraphicsPackage.eINSTANCE);
		OperationalLimitsPackage theOperationalLimitsPackage = (OperationalLimitsPackage)(EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) instanceof OperationalLimitsPackage ? EPackage.Registry.INSTANCE.getEPackage(OperationalLimitsPackage.eNS_URI) : OperationalLimitsPackage.eINSTANCE);
		OutagePackage theOutagePackage = (OutagePackage)(EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) instanceof OutagePackage ? EPackage.Registry.INSTANCE.getEPackage(OutagePackage.eNS_URI) : OutagePackage.eINSTANCE);
		CutsJumpersPackage theCutsJumpersPackage = (CutsJumpersPackage)(EPackage.Registry.INSTANCE.getEPackage(CutsJumpersPackage.eNS_URI) instanceof CutsJumpersPackage ? EPackage.Registry.INSTANCE.getEPackage(CutsJumpersPackage.eNS_URI) : CutsJumpersPackage.eINSTANCE);
		ProtectionPackage theProtectionPackage = (ProtectionPackage)(EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) instanceof ProtectionPackage ? EPackage.Registry.INSTANCE.getEPackage(ProtectionPackage.eNS_URI) : ProtectionPackage.eINSTANCE);
		EquivalentsPackage theEquivalentsPackage = (EquivalentsPackage)(EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) instanceof EquivalentsPackage ? EPackage.Registry.INSTANCE.getEPackage(EquivalentsPackage.eNS_URI) : EquivalentsPackage.eINSTANCE);
		ContingencyPackage theContingencyPackage = (ContingencyPackage)(EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) instanceof ContingencyPackage ? EPackage.Registry.INSTANCE.getEPackage(ContingencyPackage.eNS_URI) : ContingencyPackage.eINSTANCE);
		TopologyPackage theTopologyPackage = (TopologyPackage)(EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) instanceof TopologyPackage ? EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI) : TopologyPackage.eINSTANCE);
		IEC61968Package theIEC61968Package = (IEC61968Package)(EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) instanceof IEC61968Package ? EPackage.Registry.INSTANCE.getEPackage(IEC61968Package.eNS_URI) : IEC61968Package.eINSTANCE);
		CommonPackage theCommonPackage = (CommonPackage)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackage ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		AssetModelsPackage theAssetModelsPackage = (AssetModelsPackage)(EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) instanceof AssetModelsPackage ? EPackage.Registry.INSTANCE.getEPackage(AssetModelsPackage.eNS_URI) : AssetModelsPackage.eINSTANCE);
		MeteringPackage theMeteringPackage = (MeteringPackage)(EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI) instanceof MeteringPackage ? EPackage.Registry.INSTANCE.getEPackage(MeteringPackage.eNS_URI) : MeteringPackage.eINSTANCE);
		PaymentMeteringPackage thePaymentMeteringPackage = (PaymentMeteringPackage)(EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) instanceof PaymentMeteringPackage ? EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI) : PaymentMeteringPackage.eINSTANCE);
		AssetsPackage theAssetsPackage = (AssetsPackage)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackage ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackage theWorkPackage = (WorkPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);
		CustomersPackage theCustomersPackage = (CustomersPackage)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackage ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackage theLoadControlPackage = (LoadControlPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		IEC62325Package theIEC62325Package = (IEC62325Package)(EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) instanceof IEC62325Package ? EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) : IEC62325Package.eINSTANCE);
		PackageDependenciesPackage thePackageDependenciesPackage = (PackageDependenciesPackage)(EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) instanceof PackageDependenciesPackage ? EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) : PackageDependenciesPackage.eINSTANCE);

		// Load packages
		theCIM15Package.loadPackage();

		// Fix loaded packages
		theDomainPackage.fixPackageContents();
		theCIM15Package.fixPackageContents();
		theIEC61970Package.fixPackageContents();
		theSCADAPackage.fixPackageContents();
		theProductionPackage.fixPackageContents();
		theGenerationDynamicsPackage.fixPackageContents();
		theInfWorkPackage.fixPackageContents();
		theInfERPSupportPackage.fixPackageContents();
		theInfCommonPackage.fixPackageContents();
		theInfAssetsPackage.fixPackageContents();
		theInfCustomersPackage.fixPackageContents();
		theInfOperationsPackage.fixPackageContents();
		theInfLocationsPackage.fixPackageContents();
		theInfGMLSupportPackage.fixPackageContents();
		theInfCorePackage.fixPackageContents();
		theInfLoadControlPackage.fixPackageContents();
		theInfMeteringPackage.fixPackageContents();
		theInfAssetModelsPackage.fixPackageContents();
		theInfTypeAssetPackage.fixPackageContents();
		theStateVariablesPackage.fixPackageContents();
		theWiresPackage.fixPackageContents();
		theMeasPackage.fixPackageContents();
		theLoadModelPackage.fixPackageContents();
		theWiresPhaseModelPackage.fixPackageContents();
		theControlAreaPackage.fixPackageContents();
		theAuxiliaryEquipmentPackage.fixPackageContents();
		theCorePackage.fixPackageContents();
		theGraphicsPackage.fixPackageContents();
		theOperationalLimitsPackage.fixPackageContents();
		theOutagePackage.fixPackageContents();
		theCutsJumpersPackage.fixPackageContents();
		theProtectionPackage.fixPackageContents();
		theEquivalentsPackage.fixPackageContents();
		theContingencyPackage.fixPackageContents();
		theTopologyPackage.fixPackageContents();
		theIEC61968Package.fixPackageContents();
		theCommonPackage.fixPackageContents();
		theAssetModelsPackage.fixPackageContents();
		theMeteringPackage.fixPackageContents();
		thePaymentMeteringPackage.fixPackageContents();
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61970.Domain.DateTimeInterval <em>Date Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Interval</em>'.
	 * @see CIM15.IEC61970.Domain.DateTimeInterval
	 * @generated
	 */
	public EClass getDateTimeInterval() {
		if (dateTimeIntervalEClass == null) {
			dateTimeIntervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(2);
		}
		return dateTimeIntervalEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Domain.DateTimeInterval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see CIM15.IEC61970.Domain.DateTimeInterval#getStart()
	 * @see #getDateTimeInterval()
	 * @generated
	 */
	public EAttribute getDateTimeInterval_Start() {
        return (EAttribute)getDateTimeInterval().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61970.Domain.DateTimeInterval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see CIM15.IEC61970.Domain.DateTimeInterval#getEnd()
	 * @see #getDateTimeInterval()
	 * @generated
	 */
	public EAttribute getDateTimeInterval_End() {
        return (EAttribute)getDateTimeInterval().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Domain.UnitSymbol <em>Unit Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Symbol</em>'.
	 * @see CIM15.IEC61970.Domain.UnitSymbol
	 * @generated
	 */
	public EEnum getUnitSymbol() {
		if (unitSymbolEEnum == null) {
			unitSymbolEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(0);
		}
		return unitSymbolEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Domain.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency</em>'.
	 * @see CIM15.IEC61970.Domain.Currency
	 * @generated
	 */
	public EEnum getCurrency() {
		if (currencyEEnum == null) {
			currencyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(1);
		}
		return currencyEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61970.Domain.UnitMultiplier <em>Unit Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Multiplier</em>'.
	 * @see CIM15.IEC61970.Domain.UnitMultiplier
	 * @generated
	 */
	public EEnum getUnitMultiplier() {
		if (unitMultiplierEEnum == null) {
			unitMultiplierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(3);
		}
		return unitMultiplierEEnum;
	}

	/**
	 * Returns the meta object for data type '<em>Reactance Per Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reactance Per Length</em>'.
	 * @generated
	 */
	public EDataType getReactancePerLength() {
		if (reactancePerLengthEDataType == null) {
			reactancePerLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(4);
		}
		return reactancePerLengthEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Apparent Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Apparent Power</em>'.
	 * @generated
	 */
	public EDataType getApparentPower() {
		if (apparentPowerEDataType == null) {
			apparentPowerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(5);
		}
		return apparentPowerEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Damping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Damping</em>'.
	 * @generated
	 */
	public EDataType getDamping() {
		if (dampingEDataType == null) {
			dampingEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(6);
		}
		return dampingEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Susceptance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Susceptance</em>'.
	 * @generated
	 */
	public EDataType getSusceptance() {
		if (susceptanceEDataType == null) {
			susceptanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(7);
		}
		return susceptanceEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Resistance Per Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resistance Per Length</em>'.
	 * @generated
	 */
	public EDataType getResistancePerLength() {
		if (resistancePerLengthEDataType == null) {
			resistancePerLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(8);
		}
		return resistancePerLengthEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>PU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>PU</em>'.
	 * @generated
	 */
	public EDataType getPU() {
		if (puEDataType == null) {
			puEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(9);
		}
		return puEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Current Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Current Flow</em>'.
	 * @generated
	 */
	public EDataType getCurrentFlow() {
		if (currentFlowEDataType == null) {
			currentFlowEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(10);
		}
		return currentFlowEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Anglerees</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anglerees</em>'.
	 * @generated
	 */
	public EDataType getAnglerees() {
		if (anglereesEDataType == null) {
			anglereesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(11);
		}
		return anglereesEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Cost Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Rate</em>'.
	 * @generated
	 */
	public EDataType getCostRate() {
		if (costRateEDataType == null) {
			costRateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(12);
		}
		return costRateEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Cost Per Energy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Per Energy Unit</em>'.
	 * @generated
	 */
	public EDataType getCostPerEnergyUnit() {
		if (costPerEnergyUnitEDataType == null) {
			costPerEnergyUnitEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(13);
		}
		return costPerEnergyUnitEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Displacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Displacement</em>'.
	 * @generated
	 */
	public EDataType getDisplacement() {
		if (displacementEDataType == null) {
			displacementEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(14);
		}
		return displacementEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voltage</em>'.
	 * @generated
	 */
	public EDataType getVoltage() {
		if (voltageEDataType == null) {
			voltageEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(15);
		}
		return voltageEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Reactance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reactance</em>'.
	 * @generated
	 */
	public EDataType getReactance() {
		if (reactanceEDataType == null) {
			reactanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(16);
		}
		return reactanceEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pressure</em>'.
	 * @generated
	 */
	public EDataType getPressure() {
		if (pressureEDataType == null) {
			pressureEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(17);
		}
		return pressureEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Temperature</em>'.
	 * @generated
	 */
	public EDataType getTemperature() {
		if (temperatureEDataType == null) {
			temperatureEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(18);
		}
		return temperatureEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Rotation Speed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rotation Speed</em>'.
	 * @generated
	 */
	public EDataType getRotationSpeed() {
		if (rotationSpeedEDataType == null) {
			rotationSpeedEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(19);
		}
		return rotationSpeedEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Susceptance Per Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Susceptance Per Length</em>'.
	 * @generated
	 */
	public EDataType getSusceptancePerLength() {
		if (susceptancePerLengthEDataType == null) {
			susceptancePerLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(20);
		}
		return susceptancePerLengthEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Quantity</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	public EDataType getStringQuantity() {
		if (stringQuantityEDataType == null) {
			stringQuantityEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(21);
		}
		return stringQuantityEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Active Power Change Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Active Power Change Rate</em>'.
	 * @generated
	 */
	public EDataType getActivePowerChangeRate() {
		if (activePowerChangeRateEDataType == null) {
			activePowerChangeRateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(22);
		}
		return activePowerChangeRateEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Absolute Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Absolute Date</em>'.
	 * @see java.lang.String
	 * @generated
	 */
	public EDataType getAbsoluteDate() {
		if (absoluteDateEDataType == null) {
			absoluteDateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(23);
		}
		return absoluteDateEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Active Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Active Power</em>'.
	 * @generated
	 */
	public EDataType getActivePower() {
		if (activePowerEDataType == null) {
			activePowerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(24);
		}
		return activePowerEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Volume</em>'.
	 * @generated
	 */
	public EDataType getVolume() {
		if (volumeEDataType == null) {
			volumeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(25);
		}
		return volumeEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Conductance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conductance</em>'.
	 * @generated
	 */
	public EDataType getConductance() {
		if (conductanceEDataType == null) {
			conductanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(26);
		}
		return conductanceEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Inductance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Inductance</em>'.
	 * @generated
	 */
	public EDataType getInductance() {
		if (inductanceEDataType == null) {
			inductanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(27);
		}
		return inductanceEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Reactive Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reactive Power</em>'.
	 * @generated
	 */
	public EDataType getReactivePower() {
		if (reactivePowerEDataType == null) {
			reactivePowerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(28);
		}
		return reactivePowerEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Angle Radians</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle Radians</em>'.
	 * @generated
	 */
	public EDataType getAngleRadians() {
		if (angleRadiansEDataType == null) {
			angleRadiansEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(29);
		}
		return angleRadiansEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency</em>'.
	 * @generated
	 */
	public EDataType getFrequency() {
		if (frequencyEDataType == null) {
			frequencyEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(30);
		}
		return frequencyEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Capacitance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Capacitance</em>'.
	 * @generated
	 */
	public EDataType getCapacitance() {
		if (capacitanceEDataType == null) {
			capacitanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(31);
		}
		return capacitanceEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Money</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Money</em>'.
	 * @generated
	 */
	public EDataType getMoney() {
		if (moneyEDataType == null) {
			moneyEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(32);
		}
		return moneyEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Real Energy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real Energy</em>'.
	 * @generated
	 */
	public EDataType getRealEnergy() {
		if (realEnergyEDataType == null) {
			realEnergyEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(33);
		}
		return realEnergyEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>KW Active Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>KW Active Power</em>'.
	 * @generated
	 */
	public EDataType getKWActivePower() {
		if (kwActivePowerEDataType == null) {
			kwActivePowerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(34);
		}
		return kwActivePowerEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Minutes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Minutes</em>'.
	 * @generated
	 */
	public EDataType getMinutes() {
		if (minutesEDataType == null) {
			minutesEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(35);
		}
		return minutesEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Impedance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Impedance</em>'.
	 * @generated
	 */
	public EDataType getImpedance() {
		if (impedanceEDataType == null) {
			impedanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(36);
		}
		return impedanceEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Voltage Per Reactive Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voltage Per Reactive Power</em>'.
	 * @generated
	 */
	public EDataType getVoltagePerReactivePower() {
		if (voltagePerReactivePowerEDataType == null) {
			voltagePerReactivePowerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(37);
		}
		return voltagePerReactivePowerEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Volume Flow Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Volume Flow Rate</em>'.
	 * @generated
	 */
	public EDataType getVolumeFlowRate() {
		if (volumeFlowRateEDataType == null) {
			volumeFlowRateEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(38);
		}
		return volumeFlowRateEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Conductance Per Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Conductance Per Length</em>'.
	 * @generated
	 */
	public EDataType getConductancePerLength() {
		if (conductancePerLengthEDataType == null) {
			conductancePerLengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(39);
		}
		return conductancePerLengthEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Per Cent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Per Cent</em>'.
	 * @generated
	 */
	public EDataType getPerCent() {
		if (perCentEDataType == null) {
			perCentEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(40);
		}
		return perCentEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Weight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Weight</em>'.
	 * @generated
	 */
	public EDataType getWeight() {
		if (weightEDataType == null) {
			weightEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(41);
		}
		return weightEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Resistance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resistance</em>'.
	 * @generated
	 */
	public EDataType getResistance() {
		if (resistanceEDataType == null) {
			resistanceEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(42);
		}
		return resistanceEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Seconds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Seconds</em>'.
	 * @generated
	 */
	public EDataType getSeconds() {
		if (secondsEDataType == null) {
			secondsEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(43);
		}
		return secondsEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Float Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float Quantity</em>'.
	 * @generated
	 */
	public EDataType getFloatQuantity() {
		if (floatQuantityEDataType == null) {
			floatQuantityEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(44);
		}
		return floatQuantityEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Water Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Water Level</em>'.
	 * @generated
	 */
	public EDataType getWaterLevel() {
		if (waterLevelEDataType == null) {
			waterLevelEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(45);
		}
		return waterLevelEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @generated
	 */
	public EDataType getLength() {
		if (lengthEDataType == null) {
			lengthEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(46);
		}
		return lengthEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Hours</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hours</em>'.
	 * @generated
	 */
	public EDataType getHours() {
		if (hoursEDataType == null) {
			hoursEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(47);
		}
		return hoursEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Integer Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Quantity</em>'.
	 * @see java.math.BigInteger
	 * @generated
	 */
	public EDataType getIntegerQuantity() {
		if (integerQuantityEDataType == null) {
			integerQuantityEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(48);
		}
		return integerQuantityEDataType;
	}

	/**
	 * Returns the meta object for data type '<em>Cost Per Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cost Per Volume</em>'.
	 * @generated
	 */
	public EDataType getCostPerVolume() {
		if (costPerVolumeEDataType == null) {
			costPerVolumeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI).getEClassifiers().get(49);
		}
		return costPerVolumeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("CIM15.IEC61970.Domain." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Domain.DateTimeInterval <em>Date Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DateTimeInterval
		 * @see CIM15.IEC61970.Domain.DomainPackage#getDateTimeInterval()
		 * @generated
		 */
		public static final EClass DATE_TIME_INTERVAL = eINSTANCE.getDateTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATE_TIME_INTERVAL__START = eINSTANCE.getDateTimeInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATE_TIME_INTERVAL__END = eINSTANCE.getDateTimeInterval_End();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Domain.UnitSymbol <em>Unit Symbol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.UnitSymbol
		 * @see CIM15.IEC61970.Domain.DomainPackage#getUnitSymbol()
		 * @generated
		 */
		public static final EEnum UNIT_SYMBOL = eINSTANCE.getUnitSymbol();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Domain.Currency <em>Currency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.Currency
		 * @see CIM15.IEC61970.Domain.DomainPackage#getCurrency()
		 * @generated
		 */
		public static final EEnum CURRENCY = eINSTANCE.getCurrency();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61970.Domain.UnitMultiplier <em>Unit Multiplier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.UnitMultiplier
		 * @see CIM15.IEC61970.Domain.DomainPackage#getUnitMultiplier()
		 * @generated
		 */
		public static final EEnum UNIT_MULTIPLIER = eINSTANCE.getUnitMultiplier();

		/**
		 * The meta object literal for the '<em>Reactance Per Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getReactancePerLength()
		 * @generated
		 */
		public static final EDataType REACTANCE_PER_LENGTH = eINSTANCE.getReactancePerLength();

		/**
		 * The meta object literal for the '<em>Apparent Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getApparentPower()
		 * @generated
		 */
		public static final EDataType APPARENT_POWER = eINSTANCE.getApparentPower();

		/**
		 * The meta object literal for the '<em>Damping</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getDamping()
		 * @generated
		 */
		public static final EDataType DAMPING = eINSTANCE.getDamping();

		/**
		 * The meta object literal for the '<em>Susceptance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getSusceptance()
		 * @generated
		 */
		public static final EDataType SUSCEPTANCE = eINSTANCE.getSusceptance();

		/**
		 * The meta object literal for the '<em>Resistance Per Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getResistancePerLength()
		 * @generated
		 */
		public static final EDataType RESISTANCE_PER_LENGTH = eINSTANCE.getResistancePerLength();

		/**
		 * The meta object literal for the '<em>PU</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getPU()
		 * @generated
		 */
		public static final EDataType PU = eINSTANCE.getPU();

		/**
		 * The meta object literal for the '<em>Current Flow</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getCurrentFlow()
		 * @generated
		 */
		public static final EDataType CURRENT_FLOW = eINSTANCE.getCurrentFlow();

		/**
		 * The meta object literal for the '<em>Anglerees</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getAnglerees()
		 * @generated
		 */
		public static final EDataType ANGLEREES = eINSTANCE.getAnglerees();

		/**
		 * The meta object literal for the '<em>Cost Rate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getCostRate()
		 * @generated
		 */
		public static final EDataType COST_RATE = eINSTANCE.getCostRate();

		/**
		 * The meta object literal for the '<em>Cost Per Energy Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getCostPerEnergyUnit()
		 * @generated
		 */
		public static final EDataType COST_PER_ENERGY_UNIT = eINSTANCE.getCostPerEnergyUnit();

		/**
		 * The meta object literal for the '<em>Displacement</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getDisplacement()
		 * @generated
		 */
		public static final EDataType DISPLACEMENT = eINSTANCE.getDisplacement();

		/**
		 * The meta object literal for the '<em>Voltage</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getVoltage()
		 * @generated
		 */
		public static final EDataType VOLTAGE = eINSTANCE.getVoltage();

		/**
		 * The meta object literal for the '<em>Reactance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getReactance()
		 * @generated
		 */
		public static final EDataType REACTANCE = eINSTANCE.getReactance();

		/**
		 * The meta object literal for the '<em>Pressure</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getPressure()
		 * @generated
		 */
		public static final EDataType PRESSURE = eINSTANCE.getPressure();

		/**
		 * The meta object literal for the '<em>Temperature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getTemperature()
		 * @generated
		 */
		public static final EDataType TEMPERATURE = eINSTANCE.getTemperature();

		/**
		 * The meta object literal for the '<em>Rotation Speed</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getRotationSpeed()
		 * @generated
		 */
		public static final EDataType ROTATION_SPEED = eINSTANCE.getRotationSpeed();

		/**
		 * The meta object literal for the '<em>Susceptance Per Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getSusceptancePerLength()
		 * @generated
		 */
		public static final EDataType SUSCEPTANCE_PER_LENGTH = eINSTANCE.getSusceptancePerLength();

		/**
		 * The meta object literal for the '<em>String Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CIM15.IEC61970.Domain.DomainPackage#getStringQuantity()
		 * @generated
		 */
		public static final EDataType STRING_QUANTITY = eINSTANCE.getStringQuantity();

		/**
		 * The meta object literal for the '<em>Active Power Change Rate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getActivePowerChangeRate()
		 * @generated
		 */
		public static final EDataType ACTIVE_POWER_CHANGE_RATE = eINSTANCE.getActivePowerChangeRate();

		/**
		 * The meta object literal for the '<em>Absolute Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CIM15.IEC61970.Domain.DomainPackage#getAbsoluteDate()
		 * @generated
		 */
		public static final EDataType ABSOLUTE_DATE = eINSTANCE.getAbsoluteDate();

		/**
		 * The meta object literal for the '<em>Active Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getActivePower()
		 * @generated
		 */
		public static final EDataType ACTIVE_POWER = eINSTANCE.getActivePower();

		/**
		 * The meta object literal for the '<em>Volume</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getVolume()
		 * @generated
		 */
		public static final EDataType VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em>Conductance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getConductance()
		 * @generated
		 */
		public static final EDataType CONDUCTANCE = eINSTANCE.getConductance();

		/**
		 * The meta object literal for the '<em>Inductance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getInductance()
		 * @generated
		 */
		public static final EDataType INDUCTANCE = eINSTANCE.getInductance();

		/**
		 * The meta object literal for the '<em>Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getReactivePower()
		 * @generated
		 */
		public static final EDataType REACTIVE_POWER = eINSTANCE.getReactivePower();

		/**
		 * The meta object literal for the '<em>Angle Radians</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getAngleRadians()
		 * @generated
		 */
		public static final EDataType ANGLE_RADIANS = eINSTANCE.getAngleRadians();

		/**
		 * The meta object literal for the '<em>Frequency</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getFrequency()
		 * @generated
		 */
		public static final EDataType FREQUENCY = eINSTANCE.getFrequency();

		/**
		 * The meta object literal for the '<em>Capacitance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getCapacitance()
		 * @generated
		 */
		public static final EDataType CAPACITANCE = eINSTANCE.getCapacitance();

		/**
		 * The meta object literal for the '<em>Money</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getMoney()
		 * @generated
		 */
		public static final EDataType MONEY = eINSTANCE.getMoney();

		/**
		 * The meta object literal for the '<em>Real Energy</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getRealEnergy()
		 * @generated
		 */
		public static final EDataType REAL_ENERGY = eINSTANCE.getRealEnergy();

		/**
		 * The meta object literal for the '<em>KW Active Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getKWActivePower()
		 * @generated
		 */
		public static final EDataType KW_ACTIVE_POWER = eINSTANCE.getKWActivePower();

		/**
		 * The meta object literal for the '<em>Minutes</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getMinutes()
		 * @generated
		 */
		public static final EDataType MINUTES = eINSTANCE.getMinutes();

		/**
		 * The meta object literal for the '<em>Impedance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getImpedance()
		 * @generated
		 */
		public static final EDataType IMPEDANCE = eINSTANCE.getImpedance();

		/**
		 * The meta object literal for the '<em>Voltage Per Reactive Power</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getVoltagePerReactivePower()
		 * @generated
		 */
		public static final EDataType VOLTAGE_PER_REACTIVE_POWER = eINSTANCE.getVoltagePerReactivePower();

		/**
		 * The meta object literal for the '<em>Volume Flow Rate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getVolumeFlowRate()
		 * @generated
		 */
		public static final EDataType VOLUME_FLOW_RATE = eINSTANCE.getVolumeFlowRate();

		/**
		 * The meta object literal for the '<em>Conductance Per Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getConductancePerLength()
		 * @generated
		 */
		public static final EDataType CONDUCTANCE_PER_LENGTH = eINSTANCE.getConductancePerLength();

		/**
		 * The meta object literal for the '<em>Per Cent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getPerCent()
		 * @generated
		 */
		public static final EDataType PER_CENT = eINSTANCE.getPerCent();

		/**
		 * The meta object literal for the '<em>Weight</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getWeight()
		 * @generated
		 */
		public static final EDataType WEIGHT = eINSTANCE.getWeight();

		/**
		 * The meta object literal for the '<em>Resistance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getResistance()
		 * @generated
		 */
		public static final EDataType RESISTANCE = eINSTANCE.getResistance();

		/**
		 * The meta object literal for the '<em>Seconds</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getSeconds()
		 * @generated
		 */
		public static final EDataType SECONDS = eINSTANCE.getSeconds();

		/**
		 * The meta object literal for the '<em>Float Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getFloatQuantity()
		 * @generated
		 */
		public static final EDataType FLOAT_QUANTITY = eINSTANCE.getFloatQuantity();

		/**
		 * The meta object literal for the '<em>Water Level</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getWaterLevel()
		 * @generated
		 */
		public static final EDataType WATER_LEVEL = eINSTANCE.getWaterLevel();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getLength()
		 * @generated
		 */
		public static final EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Hours</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getHours()
		 * @generated
		 */
		public static final EDataType HOURS = eINSTANCE.getHours();

		/**
		 * The meta object literal for the '<em>Integer Quantity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see CIM15.IEC61970.Domain.DomainPackage#getIntegerQuantity()
		 * @generated
		 */
		public static final EDataType INTEGER_QUANTITY = eINSTANCE.getIntegerQuantity();

		/**
		 * The meta object literal for the '<em>Cost Per Volume</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61970.Domain.DomainPackage#getCostPerVolume()
		 * @generated
		 */
		public static final EDataType COST_PER_VOLUME = eINSTANCE.getCostPerVolume();

	}

} //DomainPackage
