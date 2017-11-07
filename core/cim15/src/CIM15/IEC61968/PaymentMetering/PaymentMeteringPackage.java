/**
 */
package CIM15.IEC61968.PaymentMetering;

import CIM15.CIM15Package;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;

import CIM15.IEC61968.Assets.AssetsPackage;

import CIM15.IEC61968.Common.CommonPackage;

import CIM15.IEC61968.Customers.CustomersPackage;

import CIM15.IEC61968.IEC61968Package;

import CIM15.IEC61968.LoadControl.LoadControlPackage;

import CIM15.IEC61968.Metering.MeteringPackage;

import CIM15.IEC61968.Work.WorkPackage;

import CIM15.IEC61970.AuxiliaryEquipment.AuxiliaryEquipmentPackage;

import CIM15.IEC61970.Contingency.ContingencyPackage;

import CIM15.IEC61970.ControlArea.ControlAreaPackage;

import CIM15.IEC61970.Core.CorePackage;

import CIM15.IEC61970.CutsJumpers.CutsJumpersPackage;

import CIM15.IEC61970.Domain.DomainPackage;

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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringFactory
 * @generated
 */
public class PaymentMeteringPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "PaymentMetering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://iec.ch/TC57/2010/CIM-schema-cim15#PaymentMetering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "cimPaymentMetering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PaymentMeteringPackage eINSTANCE = CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage.init();

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Shift <em>Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Shift
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift()
	 * @generated
	 */
	public static final int SHIFT = 17;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__TRANSACTIONS_GRAND_TOTAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__ACTIVITY_INTERVAL = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.VendorShift <em>Vendor Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift()
	 * @generated
	 */
	public static final int VENDOR_SHIFT = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__UUID = SHIFT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__NAMES = SHIFT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__DIAGRAM_OBJECTS = SHIFT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__MRID = SHIFT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__ALIAS_NAME = SHIFT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__NAME = SHIFT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__MODELING_AUTHORITY_SET = SHIFT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__TRANSACTIONS_GRAND_TOTAL = SHIFT__TRANSACTIONS_GRAND_TOTAL;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Activity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__ACTIVITY_INTERVAL = SHIFT__ACTIVITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__VENDOR = SHIFT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merchant Debit Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT = SHIFT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__POSTED = SHIFT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receipts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__RECEIPTS = SHIFT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Merchant Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__MERCHANT_ACCOUNT = SHIFT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT__TRANSACTIONS = SHIFT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Vendor Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT_FEATURE_COUNT = SHIFT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Vendor Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_SHIFT_OPERATION_COUNT = SHIFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Transactor <em>Transactor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Transactor
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactor()
	 * @generated
	 */
	public static final int TRANSACTOR = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Merchant Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR__MERCHANT_ACCOUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.CashierShift <em>Cashier Shift</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift()
	 * @generated
	 */
	public static final int CASHIER_SHIFT = 2;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__UUID = SHIFT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__NAMES = SHIFT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__DIAGRAM_OBJECTS = SHIFT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__MRID = SHIFT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__ALIAS_NAME = SHIFT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__NAME = SHIFT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__MODELING_AUTHORITY_SET = SHIFT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__TRANSACTIONS_GRAND_TOTAL = SHIFT__TRANSACTIONS_GRAND_TOTAL;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING;

	/**
	 * The feature id for the '<em><b>Activity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__ACTIVITY_INTERVAL = SHIFT__ACTIVITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__TRANSACTIONS = SHIFT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Of Sale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__POINT_OF_SALE = SHIFT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receipts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__RECEIPTS = SHIFT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cashier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__CASHIER = SHIFT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cash Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT__CASH_FLOAT = SHIFT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cashier Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT_FEATURE_COUNT = SHIFT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cashier Shift</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_SHIFT_OPERATION_COUNT = SHIFT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.TariffProfile <em>Tariff Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTariffProfile()
	 * @generated
	 */
	public static final int TARIFF_PROFILE = 3;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Tariffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__TARIFFS = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tariff Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__TARIFF_CYCLE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE__TIME_TARIFF_INTERVALS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tariff Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tariff Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TARIFF_PROFILE_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit <em>Accounting Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.AccountingUnit
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountingUnit()
	 * @generated
	 */
	public static final int ACCOUNTING_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTING_UNIT__MULTIPLIER = 0;

	/**
	 * The feature id for the '<em><b>Energy Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTING_UNIT__ENERGY_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Monetary Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTING_UNIT__MONETARY_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTING_UNIT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Accounting Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTING_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Accounting Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTING_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Transaction <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Transaction
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction()
	 * @generated
	 */
	public static final int TRANSACTION = 5;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Pricing Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__PRICING_STRUCTURE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__LINE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Donor Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__DONOR_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__USER_ATTRIBUTES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receiver Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__RECEIVER_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auxiliary Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__AUXILIARY_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Service Units Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__SERVICE_UNITS_ERROR = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vendor Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__VENDOR_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__RECEIPT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Diverse Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__DIVERSE_REFERENCE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Service Units Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__SERVICE_UNITS_ENERGY = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Meter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__METER = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reversed Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__REVERSED_ID = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Customer Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__CUSTOMER_ACCOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Cashier Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION__CASHIER_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval <em>Time Tariff Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTimeTariffInterval()
	 * @generated
	 */
	public static final int TIME_TARIFF_INTERVAL = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL__START_DATE_TIME = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tariff Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL__TARIFF_PROFILES = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL__CHARGES = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Time Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Time Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TARIFF_INTERVAL_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Charge <em>Charge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Charge
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge()
	 * @generated
	 */
	public static final int CHARGE = 7;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__CONSUMPTION_TARIFF_INTERVALS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__VARIABLE_PORTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__TIME_TARIFF_INTERVALS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__AUXILIARY_ACCOUNTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__CHILD_CHARGES = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fixed Portion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__FIXED_PORTION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Charge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE__PARENT_CHARGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement <em>Auxiliary Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement()
	 * @generated
	 */
	public static final int AUXILIARY_AGREEMENT = 8;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__NAMES = CommonPackage.AGREEMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__DIAGRAM_OBJECTS = CommonPackage.AGREEMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Customer Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vend Portion Arrear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aux Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__AUX_REF = CommonPackage.AGREEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pay Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__PAY_CYCLE = CommonPackage.AGREEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arrears Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__ARREARS_INTEREST = CommonPackage.AGREEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fixed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__FIXED_AMOUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auxiliary Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS = CommonPackage.AGREEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vend Portion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__VEND_PORTION = CommonPackage.AGREEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sub Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__SUB_CATEGORY = CommonPackage.AGREEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Aux Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__AUX_CYCLE = CommonPackage.AGREEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Aux Priority Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE = CommonPackage.AGREEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT__MIN_AMOUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Auxiliary Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Auxiliary Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Tender <em>Tender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Tender
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender()
	 * @generated
	 */
	public static final int TENDER = 9;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__KIND = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__CHANGE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__AMOUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__CARD = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__RECEIPT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cheque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER__CHEQUE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Tender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TENDER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier <em>Service Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier()
	 * @generated
	 */
	public static final int SERVICE_SUPPLIER = 10;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__UUID = CommonPackage.ORGANISATION__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__NAMES = CommonPackage.ORGANISATION__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__DIAGRAM_OBJECTS = CommonPackage.ORGANISATION__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__MRID = CommonPackage.ORGANISATION__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__ALIAS_NAME = CommonPackage.ORGANISATION__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__NAME = CommonPackage.ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__MODELING_AUTHORITY_SET = CommonPackage.ORGANISATION__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Phone2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__PHONE2 = CommonPackage.ORGANISATION__PHONE2;

	/**
	 * The feature id for the '<em><b>Phone1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__PHONE1 = CommonPackage.ORGANISATION__PHONE1;

	/**
	 * The feature id for the '<em><b>Street Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__STREET_ADDRESS = CommonPackage.ORGANISATION__STREET_ADDRESS;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__POSTAL_ADDRESS = CommonPackage.ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__ELECTRONIC_ADDRESS = CommonPackage.ORGANISATION__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Business Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__BUSINESS_ROLES = CommonPackage.ORGANISATION__BUSINESS_ROLES;

	/**
	 * The feature id for the '<em><b>Bank Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__BANK_ACCOUNTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issuer Identification Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER = CommonPackage.ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Delivery Points</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__KIND = CommonPackage.ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Customer Agreements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS = CommonPackage.ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER_FEATURE_COUNT = CommonPackage.ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Service Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_SUPPLIER_OPERATION_COUNT = CommonPackage.ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.MerchantAgreement <em>Merchant Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAgreement
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAgreement()
	 * @generated
	 */
	public static final int MERCHANT_AGREEMENT = 11;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__UUID = CommonPackage.AGREEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__NAMES = CommonPackage.AGREEMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__DIAGRAM_OBJECTS = CommonPackage.AGREEMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__MRID = CommonPackage.AGREEMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__ALIAS_NAME = CommonPackage.AGREEMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__NAME = CommonPackage.AGREEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__MODELING_AUTHORITY_SET = CommonPackage.AGREEMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__CHANGE_ITEMS = CommonPackage.AGREEMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__TO_DOCUMENT_ROLES = CommonPackage.AGREEMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__ELECTRONIC_ADDRESS = CommonPackage.AGREEMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__REVISION_NUMBER = CommonPackage.AGREEMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__NETWORK_DATA_SETS = CommonPackage.AGREEMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__FROM_DOCUMENT_ROLES = CommonPackage.AGREEMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__SCHEDULE_PARAMETER_INFOS = CommonPackage.AGREEMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__ERP_ORGANISATION_ROLES = CommonPackage.AGREEMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__CREATED_DATE_TIME = CommonPackage.AGREEMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__MEASUREMENTS = CommonPackage.AGREEMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__LAST_MODIFIED_DATE_TIME = CommonPackage.AGREEMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__ACTIVITY_RECORDS = CommonPackage.AGREEMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__SUBJECT = CommonPackage.AGREEMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__CHANGE_SETS = CommonPackage.AGREEMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__ERP_PERSON_ROLES = CommonPackage.AGREEMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__SCHEDULED_EVENTS = CommonPackage.AGREEMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__TITLE = CommonPackage.AGREEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__DOC_STATUS = CommonPackage.AGREEMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__ASSET_ROLES = CommonPackage.AGREEMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__STATUS = CommonPackage.AGREEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.AGREEMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__CATEGORY = CommonPackage.AGREEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Sign Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__SIGN_DATE = CommonPackage.AGREEMENT__SIGN_DATE;

	/**
	 * The feature id for the '<em><b>Validity Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__VALIDITY_INTERVAL = CommonPackage.AGREEMENT__VALIDITY_INTERVAL;

	/**
	 * The feature id for the '<em><b>Merchant Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS = CommonPackage.AGREEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merchant Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT_FEATURE_COUNT = CommonPackage.AGREEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Merchant Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_AGREEMENT_OPERATION_COUNT = CommonPackage.AGREEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.LineDetail <em>Line Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.LineDetail
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getLineDetail()
	 * @generated
	 */
	public static final int LINE_DETAIL = 12;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DETAIL__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DETAIL__ROUNDING = 1;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DETAIL__DATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DETAIL__NOTE = 3;

	/**
	 * The number of structural features of the '<em>Line Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DETAIL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Line Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval <em>Consumption Tariff Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getConsumptionTariffInterval()
	 * @generated
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL = 13;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL__START_VALUE = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL__CHARGES = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tariff Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tou Tariff Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Consumption Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Consumption Tariff Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_TARIFF_INTERVAL_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Vendor <em>Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Vendor
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor()
	 * @generated
	 */
	public static final int VENDOR = 14;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Vendor Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR__VENDOR_SHIFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Cheque <em>Cheque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Cheque
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque()
	 * @generated
	 */
	public static final int CHEQUE = 15;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Tender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE__TENDER = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Micr Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE__MICR_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bank Account Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE__BANK_ACCOUNT_DETAIL = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cheque Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE__CHEQUE_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE__DATE = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE__KIND = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHEQUE_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.AccountMovement <em>Account Movement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.AccountMovement
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountMovement()
	 * @generated
	 */
	public static final int ACCOUNT_MOVEMENT = 16;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_MOVEMENT__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_MOVEMENT__REASON = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_MOVEMENT__AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Account Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_MOVEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Account Movement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_MOVEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Receipt <em>Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Receipt
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt()
	 * @generated
	 */
	public static final int RECEIPT = 18;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Vendor Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__VENDOR_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Bankable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__IS_BANKABLE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__LINE = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cashier Shift</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__CASHIER_SHIFT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tenders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__TENDERS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT__TRANSACTIONS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECEIPT_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Due <em>Due</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Due
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue()
	 * @generated
	 */
	public static final int DUE = 19;

	/**
	 * The feature id for the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUE__INTEREST = 0;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUE__CHARGES = 1;

	/**
	 * The feature id for the '<em><b>Principle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUE__PRINCIPLE = 2;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUE__CURRENT = 3;

	/**
	 * The feature id for the '<em><b>Arrears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUE__ARREARS = 4;

	/**
	 * The number of structural features of the '<em>Due</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Due</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail <em>Bank Account Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail()
	 * @generated
	 */
	public static final int BANK_ACCOUNT_DETAIL = 20;

	/**
	 * The feature id for the '<em><b>Holder ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_DETAIL__HOLDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_DETAIL__HOLDER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_DETAIL__BANK_NAME = 2;

	/**
	 * The feature id for the '<em><b>Branch Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_DETAIL__BRANCH_CODE = 3;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>Bank Account Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_DETAIL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bank Account Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BANK_ACCOUNT_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount <em>Auxiliary Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount()
	 * @generated
	 */
	public static final int AUXILIARY_ACCOUNT = 21;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Last Debit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__LAST_DEBIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Transactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__CHARGES = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Principle Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Credit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__LAST_CREDIT = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Auxiliary Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__BALANCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Due</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT__DUE = CommonPackage.DOCUMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Auxiliary Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Auxiliary Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_ACCOUNT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Cashier <em>Cashier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Cashier
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashier()
	 * @generated
	 */
	public static final int CASHIER = 22;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__ELECTRONIC_ADDRESS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cashier Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER__CASHIER_SHIFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cashier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cashier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CASHIER_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.Card <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.Card
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard()
	 * @generated
	 */
	public static final int CARD = 23;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD__UUID = CIM15Package.ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Cv Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD__CV_NUMBER = CIM15Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD__EXPIRY_DATE = CIM15Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD__PAN = CIM15Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Account Holder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD__ACCOUNT_HOLDER_NAME = CIM15Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD__TENDER = CIM15Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD_FEATURE_COUNT = CIM15Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CARD_OPERATION_COUNT = CIM15Package.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount <em>Merchant Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount()
	 * @generated
	 */
	public static final int MERCHANT_ACCOUNT = 24;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__UUID = CommonPackage.DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__NAMES = CommonPackage.DOCUMENT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__DIAGRAM_OBJECTS = CommonPackage.DOCUMENT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__MRID = CommonPackage.DOCUMENT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__ALIAS_NAME = CommonPackage.DOCUMENT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__NAME = CommonPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__MODELING_AUTHORITY_SET = CommonPackage.DOCUMENT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Change Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__CHANGE_ITEMS = CommonPackage.DOCUMENT__CHANGE_ITEMS;

	/**
	 * The feature id for the '<em><b>To Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__TO_DOCUMENT_ROLES = CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Electronic Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__ELECTRONIC_ADDRESS = CommonPackage.DOCUMENT__ELECTRONIC_ADDRESS;

	/**
	 * The feature id for the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__REVISION_NUMBER = CommonPackage.DOCUMENT__REVISION_NUMBER;

	/**
	 * The feature id for the '<em><b>Network Data Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__NETWORK_DATA_SETS = CommonPackage.DOCUMENT__NETWORK_DATA_SETS;

	/**
	 * The feature id for the '<em><b>From Document Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__FROM_DOCUMENT_ROLES = CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES;

	/**
	 * The feature id for the '<em><b>Schedule Parameter Infos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__SCHEDULE_PARAMETER_INFOS = CommonPackage.DOCUMENT__SCHEDULE_PARAMETER_INFOS;

	/**
	 * The feature id for the '<em><b>Erp Organisation Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__ERP_ORGANISATION_ROLES = CommonPackage.DOCUMENT__ERP_ORGANISATION_ROLES;

	/**
	 * The feature id for the '<em><b>Created Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__CREATED_DATE_TIME = CommonPackage.DOCUMENT__CREATED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__MEASUREMENTS = CommonPackage.DOCUMENT__MEASUREMENTS;

	/**
	 * The feature id for the '<em><b>Last Modified Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__LAST_MODIFIED_DATE_TIME = CommonPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME;

	/**
	 * The feature id for the '<em><b>Activity Records</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__ACTIVITY_RECORDS = CommonPackage.DOCUMENT__ACTIVITY_RECORDS;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__SUBJECT = CommonPackage.DOCUMENT__SUBJECT;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__CHANGE_SETS = CommonPackage.DOCUMENT__CHANGE_SETS;

	/**
	 * The feature id for the '<em><b>Erp Person Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__ERP_PERSON_ROLES = CommonPackage.DOCUMENT__ERP_PERSON_ROLES;

	/**
	 * The feature id for the '<em><b>Scheduled Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__SCHEDULED_EVENTS = CommonPackage.DOCUMENT__SCHEDULED_EVENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__TITLE = CommonPackage.DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__DOC_STATUS = CommonPackage.DOCUMENT__DOC_STATUS;

	/**
	 * The feature id for the '<em><b>Asset Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__ASSET_ROLES = CommonPackage.DOCUMENT__ASSET_ROLES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__STATUS = CommonPackage.DOCUMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Power System Resource Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__POWER_SYSTEM_RESOURCE_ROLES = CommonPackage.DOCUMENT__POWER_SYSTEM_RESOURCE_ROLES;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__CATEGORY = CommonPackage.DOCUMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Merchant Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__MERCHANT_AGREEMENT = CommonPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__CURRENT_BALANCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provisional Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__PROVISIONAL_BALANCE = CommonPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transactors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__TRANSACTORS = CommonPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vendor Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT__VENDOR_SHIFTS = CommonPackage.DOCUMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Merchant Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT_FEATURE_COUNT = CommonPackage.DOCUMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Merchant Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MERCHANT_ACCOUNT_OPERATION_COUNT = CommonPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.PointOfSale <em>Point Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.PointOfSale
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getPointOfSale()
	 * @generated
	 */
	public static final int POINT_OF_SALE = 25;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__UUID = CorePackage.IDENTIFIED_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Names</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__NAMES = CorePackage.IDENTIFIED_OBJECT__NAMES;

	/**
	 * The feature id for the '<em><b>Diagram Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__DIAGRAM_OBJECTS = CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS;

	/**
	 * The feature id for the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__MRID = CorePackage.IDENTIFIED_OBJECT__MRID;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__ALIAS_NAME = CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__NAME = CorePackage.IDENTIFIED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Modeling Authority Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__MODELING_AUTHORITY_SET = CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET;

	/**
	 * The feature id for the '<em><b>Cashier Shifts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__CASHIER_SHIFTS = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE__LOCATION = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE_FEATURE_COUNT = CorePackage.IDENTIFIED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POINT_OF_SALE_OPERATION_COUNT = CorePackage.IDENTIFIED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.TenderKind <em>Tender Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.TenderKind
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTenderKind()
	 * @generated
	 */
	public static final int TENDER_KIND = 26;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.ChequeKind <em>Cheque Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.ChequeKind
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getChequeKind()
	 * @generated
	 */
	public static final int CHEQUE_KIND = 27;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.ChargeKind <em>Charge Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.ChargeKind
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getChargeKind()
	 * @generated
	 */
	public static final int CHARGE_KIND = 28;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.TransactionKind <em>Transaction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.TransactionKind
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactionKind()
	 * @generated
	 */
	public static final int TRANSACTION_KIND = 29;

	/**
	 * The meta object id for the '{@link CIM15.IEC61968.PaymentMetering.SupplierKind <em>Supplier Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CIM15.IEC61968.PaymentMetering.SupplierKind
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getSupplierKind()
	 * @generated
	 */
	public static final int SUPPLIER_KIND = 30;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashierShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tariffProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTariffIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSupplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass merchantAgreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumptionTariffIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chequeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountMovementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankAccountDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cashierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass merchantAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointOfSaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tenderKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chequeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplierKindEEnum = null;

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
	 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaymentMeteringPackage() {
		super(eNS_URI, PaymentMeteringFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link PaymentMeteringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PaymentMeteringPackage init() {
		if (isInited) return (PaymentMeteringPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI);

		// Obtain or create and register package
		PaymentMeteringPackage thePaymentMeteringPackage = (PaymentMeteringPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaymentMeteringPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaymentMeteringPackage());

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
		DomainPackage theDomainPackage = (DomainPackage)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackage ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
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
		AssetsPackage theAssetsPackage = (AssetsPackage)(EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) instanceof AssetsPackage ? EPackage.Registry.INSTANCE.getEPackage(AssetsPackage.eNS_URI) : AssetsPackage.eINSTANCE);
		WorkPackage theWorkPackage = (WorkPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) instanceof WorkPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkPackage.eNS_URI) : WorkPackage.eINSTANCE);
		CustomersPackage theCustomersPackage = (CustomersPackage)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackage ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		LoadControlPackage theLoadControlPackage = (LoadControlPackage)(EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) instanceof LoadControlPackage ? EPackage.Registry.INSTANCE.getEPackage(LoadControlPackage.eNS_URI) : LoadControlPackage.eINSTANCE);
		IEC62325Package theIEC62325Package = (IEC62325Package)(EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) instanceof IEC62325Package ? EPackage.Registry.INSTANCE.getEPackage(IEC62325Package.eNS_URI) : IEC62325Package.eINSTANCE);
		PackageDependenciesPackage thePackageDependenciesPackage = (PackageDependenciesPackage)(EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) instanceof PackageDependenciesPackage ? EPackage.Registry.INSTANCE.getEPackage(PackageDependenciesPackage.eNS_URI) : PackageDependenciesPackage.eINSTANCE);

		// Load packages
		theCIM15Package.loadPackage();

		// Fix loaded packages
		thePaymentMeteringPackage.fixPackageContents();
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
		theDomainPackage.fixPackageContents();
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
		theAssetsPackage.fixPackageContents();
		theWorkPackage.fixPackageContents();
		theCustomersPackage.fixPackageContents();
		theLoadControlPackage.fixPackageContents();
		theIEC62325Package.fixPackageContents();
		thePackageDependenciesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaymentMeteringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaymentMeteringPackage.eNS_URI, thePaymentMeteringPackage);
		return thePaymentMeteringPackage;
	}


	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.VendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Shift</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift
	 * @generated
	 */
	public EClass getVendorShift() {
		if (vendorShiftEClass == null) {
			vendorShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(0);
		}
		return vendorShiftEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getVendor()
	 * @see #getVendorShift()
	 * @generated
	 */
	public EReference getVendorShift_Vendor() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount <em>Merchant Debit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Debit Amount</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantDebitAmount()
	 * @see #getVendorShift()
	 * @generated
	 */
	public EAttribute getVendorShift_MerchantDebitAmount() {
        return (EAttribute)getVendorShift().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.VendorShift#isPosted <em>Posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#isPosted()
	 * @see #getVendorShift()
	 * @generated
	 */
	public EAttribute getVendorShift_Posted() {
        return (EAttribute)getVendorShift().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receipts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getReceipts()
	 * @see #getVendorShift()
	 * @generated
	 */
	public EReference getVendorShift_Receipts() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merchant Account</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getMerchantAccount()
	 * @see #getVendorShift()
	 * @generated
	 */
	public EReference getVendorShift_MerchantAccount() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.VendorShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.VendorShift#getTransactions()
	 * @see #getVendorShift()
	 * @generated
	 */
	public EReference getVendorShift_Transactions() {
        return (EReference)getVendorShift().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Transactor <em>Transactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactor</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transactor
	 * @generated
	 */
	public EClass getTransactor() {
		if (transactorEClass == null) {
			transactorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(1);
		}
		return transactorEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Transactor#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merchant Accounts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transactor#getMerchantAccounts()
	 * @see #getTransactor()
	 * @generated
	 */
	public EReference getTransactor_MerchantAccounts() {
        return (EReference)getTransactor().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.CashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cashier Shift</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift
	 * @generated
	 */
	public EClass getCashierShift() {
		if (cashierShiftEClass == null) {
			cashierShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(2);
		}
		return cashierShiftEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getTransactions()
	 * @see #getCashierShift()
	 * @generated
	 */
	public EReference getCashierShift_Transactions() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getPointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Of Sale</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getPointOfSale()
	 * @see #getCashierShift()
	 * @generated
	 */
	public EReference getCashierShift_PointOfSale() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getReceipts <em>Receipts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receipts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getReceipts()
	 * @see #getCashierShift()
	 * @generated
	 */
	public EReference getCashierShift_Receipts() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cashier</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getCashier()
	 * @see #getCashierShift()
	 * @generated
	 */
	public EReference getCashierShift_Cashier() {
        return (EReference)getCashierShift().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.CashierShift#getCashFloat <em>Cash Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cash Float</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.CashierShift#getCashFloat()
	 * @see #getCashierShift()
	 * @generated
	 */
	public EAttribute getCashierShift_CashFloat() {
        return (EAttribute)getCashierShift().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.TariffProfile <em>Tariff Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tariff Profile</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile
	 * @generated
	 */
	public EClass getTariffProfile() {
		if (tariffProfileEClass == null) {
			tariffProfileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tariffProfileEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffs <em>Tariffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariffs</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffs()
	 * @see #getTariffProfile()
	 * @generated
	 */
	public EReference getTariffProfile_Tariffs() {
        return (EReference)getTariffProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumption Tariff Intervals</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile#getConsumptionTariffIntervals()
	 * @see #getTariffProfile()
	 * @generated
	 */
	public EReference getTariffProfile_ConsumptionTariffIntervals() {
        return (EReference)getTariffProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff Cycle</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile#getTariffCycle()
	 * @see #getTariffProfile()
	 * @generated
	 */
	public EAttribute getTariffProfile_TariffCycle() {
        return (EAttribute)getTariffProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Tariff Intervals</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TariffProfile#getTimeTariffIntervals()
	 * @see #getTariffProfile()
	 * @generated
	 */
	public EReference getTariffProfile_TimeTariffIntervals() {
        return (EReference)getTariffProfile().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit <em>Accounting Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accounting Unit</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountingUnit
	 * @generated
	 */
	public EClass getAccountingUnit() {
		if (accountingUnitEClass == null) {
			accountingUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(5);
		}
		return accountingUnitEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountingUnit#getMultiplier()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	public EAttribute getAccountingUnit_Multiplier() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit <em>Energy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Unit</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountingUnit#getEnergyUnit()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	public EAttribute getAccountingUnit_EnergyUnit() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit <em>Monetary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monetary Unit</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountingUnit#getMonetaryUnit()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	public EAttribute getAccountingUnit_MonetaryUnit() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountingUnit#getValue()
	 * @see #getAccountingUnit()
	 * @generated
	 */
	public EAttribute getAccountingUnit_Value() {
        return (EAttribute)getAccountingUnit().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction
	 * @generated
	 */
	public EClass getTransaction() {
		if (transactionEClass == null) {
			transactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(8);
		}
		return transactionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getPricingStructure <em>Pricing Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pricing Structure</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getPricingStructure()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_PricingStructure() {
        return (EReference)getTransaction().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getLine()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_Line() {
        return (EReference)getTransaction().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDonorReference <em>Donor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Donor Reference</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getDonorReference()
	 * @see #getTransaction()
	 * @generated
	 */
	public EAttribute getTransaction_DonorReference() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Transaction#getUserAttributes <em>User Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Attributes</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getUserAttributes()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_UserAttributes() {
        return (EReference)getTransaction().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Transaction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getKind()
	 * @see #getTransaction()
	 * @generated
	 */
	public EAttribute getTransaction_Kind() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceiverReference <em>Receiver Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receiver Reference</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getReceiverReference()
	 * @see #getTransaction()
	 * @generated
	 */
	public EAttribute getTransaction_ReceiverReference() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auxiliary Account</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getAuxiliaryAccount()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_AuxiliaryAccount() {
        return (EReference)getTransaction().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsError <em>Service Units Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Units Error</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsError()
	 * @see #getTransaction()
	 * @generated
	 */
	public EAttribute getTransaction_ServiceUnitsError() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Shift</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getVendorShift()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_VendorShift() {
        return (EReference)getTransaction().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getReceipt()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_Receipt() {
        return (EReference)getTransaction().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Transaction#getDiverseReference <em>Diverse Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diverse Reference</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getDiverseReference()
	 * @see #getTransaction()
	 * @generated
	 */
	public EAttribute getTransaction_DiverseReference() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy <em>Service Units Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Units Energy</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getServiceUnitsEnergy()
	 * @see #getTransaction()
	 * @generated
	 */
	public EAttribute getTransaction_ServiceUnitsEnergy() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getMeter()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_Meter() {
        return (EReference)getTransaction().getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Transaction#getReversedId <em>Reversed Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reversed Id</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getReversedId()
	 * @see #getTransaction()
	 * @generated
	 */
	public EAttribute getTransaction_ReversedId() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getCustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Account</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getCustomerAccount()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_CustomerAccount() {
        return (EReference)getTransaction().getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Transaction#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cashier Shift</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Transaction#getCashierShift()
	 * @see #getTransaction()
	 * @generated
	 */
	public EReference getTransaction_CashierShift() {
        return (EReference)getTransaction().getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval <em>Time Tariff Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Tariff Interval</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval
	 * @generated
	 */
	public EClass getTimeTariffInterval() {
		if (timeTariffIntervalEClass == null) {
			timeTariffIntervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(9);
		}
		return timeTariffIntervalEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumption Tariff Intervals</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getConsumptionTariffIntervals()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	public EReference getTimeTariffInterval_ConsumptionTariffIntervals() {
        return (EReference)getTimeTariffInterval().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime <em>Start Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date Time</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getStartDateTime()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	public EAttribute getTimeTariffInterval_StartDateTime() {
        return (EAttribute)getTimeTariffInterval().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getSequenceNumber()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	public EAttribute getTimeTariffInterval_SequenceNumber() {
        return (EAttribute)getTimeTariffInterval().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariff Profiles</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getTariffProfiles()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	public EReference getTimeTariffInterval_TariffProfiles() {
        return (EReference)getTimeTariffInterval().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charges</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval#getCharges()
	 * @see #getTimeTariffInterval()
	 * @generated
	 */
	public EReference getTimeTariffInterval_Charges() {
        return (EReference)getTimeTariffInterval().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Charge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge
	 * @generated
	 */
	public EClass getCharge() {
		if (chargeEClass == null) {
			chargeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(10);
		}
		return chargeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumption Tariff Intervals</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getConsumptionTariffIntervals()
	 * @see #getCharge()
	 * @generated
	 */
	public EReference getCharge_ConsumptionTariffIntervals() {
        return (EReference)getCharge().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Charge#getVariablePortion <em>Variable Portion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Portion</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getVariablePortion()
	 * @see #getCharge()
	 * @generated
	 */
	public EAttribute getCharge_VariablePortion() {
        return (EAttribute)getCharge().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals <em>Time Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Tariff Intervals</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getTimeTariffIntervals()
	 * @see #getCharge()
	 * @generated
	 */
	public EReference getCharge_TimeTariffIntervals() {
        return (EReference)getCharge().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary Accounts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getAuxiliaryAccounts()
	 * @see #getCharge()
	 * @generated
	 */
	public EReference getCharge_AuxiliaryAccounts() {
        return (EReference)getCharge().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Charge#getChildCharges <em>Child Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Charges</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getChildCharges()
	 * @see #getCharge()
	 * @generated
	 */
	public EReference getCharge_ChildCharges() {
        return (EReference)getCharge().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.Charge#getFixedPortion <em>Fixed Portion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Portion</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getFixedPortion()
	 * @see #getCharge()
	 * @generated
	 */
	public EReference getCharge_FixedPortion() {
        return (EReference)getCharge().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Charge#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getKind()
	 * @see #getCharge()
	 * @generated
	 */
	public EAttribute getCharge_Kind() {
        return (EAttribute)getCharge().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Charge#getParentCharge <em>Parent Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Charge</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Charge#getParentCharge()
	 * @see #getCharge()
	 * @generated
	 */
	public EReference getCharge_ParentCharge() {
        return (EReference)getCharge().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement <em>Auxiliary Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Agreement</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement
	 * @generated
	 */
	public EClass getAuxiliaryAgreement() {
		if (auxiliaryAgreementEClass == null) {
			auxiliaryAgreementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(11);
		}
		return auxiliaryAgreementEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement <em>Customer Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Agreement</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getCustomerAgreement()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EReference getAuxiliaryAgreement_CustomerAgreement() {
        return (EReference)getAuxiliaryAgreement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear <em>Vend Portion Arrear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vend Portion Arrear</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortionArrear()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_VendPortionArrear() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef <em>Aux Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Ref</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxRef()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_AuxRef() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle <em>Pay Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay Cycle</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getPayCycle()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_PayCycle() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest <em>Arrears Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrears Interest</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getArrearsInterest()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_ArrearsInterest() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount <em>Fixed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Amount</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getFixedAmount()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_FixedAmount() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Auxiliary Accounts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxiliaryAccounts()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EReference getAuxiliaryAgreement_AuxiliaryAccounts() {
        return (EReference)getAuxiliaryAgreement().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion <em>Vend Portion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vend Portion</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getVendPortion()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_VendPortion() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory <em>Sub Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Category</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getSubCategory()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_SubCategory() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle <em>Aux Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Cycle</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxCycle()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_AuxCycle() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode <em>Aux Priority Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Priority Code</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getAuxPriorityCode()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_AuxPriorityCode() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount <em>Min Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Amount</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement#getMinAmount()
	 * @see #getAuxiliaryAgreement()
	 * @generated
	 */
	public EAttribute getAuxiliaryAgreement_MinAmount() {
        return (EAttribute)getAuxiliaryAgreement().getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Tender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tender</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Tender
	 * @generated
	 */
	public EClass getTender() {
		if (tenderEClass == null) {
			tenderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(12);
		}
		return tenderEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Tender#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getKind()
	 * @see #getTender()
	 * @generated
	 */
	public EAttribute getTender_Kind() {
        return (EAttribute)getTender().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Tender#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getChange()
	 * @see #getTender()
	 * @generated
	 */
	public EAttribute getTender_Change() {
        return (EAttribute)getTender().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Tender#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getAmount()
	 * @see #getTender()
	 * @generated
	 */
	public EAttribute getTender_Amount() {
        return (EAttribute)getTender().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Tender#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getCard()
	 * @see #getTender()
	 * @generated
	 */
	public EReference getTender_Card() {
        return (EReference)getTender().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Tender#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getReceipt()
	 * @see #getTender()
	 * @generated
	 */
	public EReference getTender_Receipt() {
        return (EReference)getTender().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Tender#getCheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cheque</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Tender#getCheque()
	 * @see #getTender()
	 * @generated
	 */
	public EReference getTender_Cheque() {
        return (EReference)getTender().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier <em>Service Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Supplier</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier
	 * @generated
	 */
	public EClass getServiceSupplier() {
		if (serviceSupplierEClass == null) {
			serviceSupplierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(13);
		}
		return serviceSupplierEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts <em>Bank Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bank Accounts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getBankAccounts()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public EReference getServiceSupplier_BankAccounts() {
        return (EReference)getServiceSupplier().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Identification Number</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getIssuerIdentificationNumber()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public EAttribute getServiceSupplier_IssuerIdentificationNumber() {
        return (EAttribute)getServiceSupplier().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints <em>Service Delivery Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Delivery Points</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getServiceDeliveryPoints()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public EReference getServiceSupplier_ServiceDeliveryPoints() {
        return (EReference)getServiceSupplier().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getKind()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public EAttribute getServiceSupplier_Kind() {
        return (EAttribute)getServiceSupplier().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements <em>Customer Agreements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customer Agreements</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier#getCustomerAgreements()
	 * @see #getServiceSupplier()
	 * @generated
	 */
	public EReference getServiceSupplier_CustomerAgreements() {
        return (EReference)getServiceSupplier().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.MerchantAgreement <em>Merchant Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merchant Agreement</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAgreement
	 * @generated
	 */
	public EClass getMerchantAgreement() {
		if (merchantAgreementEClass == null) {
			merchantAgreementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(14);
		}
		return merchantAgreementEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts <em>Merchant Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Merchant Accounts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAgreement#getMerchantAccounts()
	 * @see #getMerchantAgreement()
	 * @generated
	 */
	public EReference getMerchantAgreement_MerchantAccounts() {
        return (EReference)getMerchantAgreement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.LineDetail <em>Line Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Detail</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.LineDetail
	 * @generated
	 */
	public EClass getLineDetail() {
		if (lineDetailEClass == null) {
			lineDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(15);
		}
		return lineDetailEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.LineDetail#getAmount()
	 * @see #getLineDetail()
	 * @generated
	 */
	public EAttribute getLineDetail_Amount() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getRounding <em>Rounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.LineDetail#getRounding()
	 * @see #getLineDetail()
	 * @generated
	 */
	public EAttribute getLineDetail_Rounding() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.LineDetail#getDateTime()
	 * @see #getLineDetail()
	 * @generated
	 */
	public EAttribute getLineDetail_DateTime() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.LineDetail#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.LineDetail#getNote()
	 * @see #getLineDetail()
	 * @generated
	 */
	public EAttribute getLineDetail_Note() {
        return (EAttribute)getLineDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval <em>Consumption Tariff Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumption Tariff Interval</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval
	 * @generated
	 */
	public EClass getConsumptionTariffInterval() {
		if (consumptionTariffIntervalEClass == null) {
			consumptionTariffIntervalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(16);
		}
		return consumptionTariffIntervalEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue <em>Start Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Value</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getStartValue()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	public EAttribute getConsumptionTariffInterval_StartValue() {
        return (EAttribute)getConsumptionTariffInterval().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charges</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getCharges()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	public EReference getConsumptionTariffInterval_Charges() {
        return (EReference)getConsumptionTariffInterval().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getSequenceNumber()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	public EAttribute getConsumptionTariffInterval_SequenceNumber() {
        return (EAttribute)getConsumptionTariffInterval().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tariff Profiles</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTariffProfiles()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	public EReference getConsumptionTariffInterval_TariffProfiles() {
        return (EReference)getConsumptionTariffInterval().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTouTariffIntervals <em>Tou Tariff Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tou Tariff Intervals</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval#getTouTariffIntervals()
	 * @see #getConsumptionTariffInterval()
	 * @generated
	 */
	public EReference getConsumptionTariffInterval_TouTariffIntervals() {
        return (EReference)getConsumptionTariffInterval().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Vendor
	 * @generated
	 */
	public EClass getVendor() {
		if (vendorEClass == null) {
			vendorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(17);
		}
		return vendorEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Vendor#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vendor Shifts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Vendor#getVendorShifts()
	 * @see #getVendor()
	 * @generated
	 */
	public EReference getVendor_VendorShifts() {
        return (EReference)getVendor().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Cheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheque</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cheque
	 * @generated
	 */
	public EClass getCheque() {
		if (chequeEClass == null) {
			chequeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(18);
		}
		return chequeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Cheque#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tender</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cheque#getTender()
	 * @see #getCheque()
	 * @generated
	 */
	public EReference getCheque_Tender() {
        return (EReference)getCheque().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Cheque#getMicrNumber <em>Micr Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micr Number</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cheque#getMicrNumber()
	 * @see #getCheque()
	 * @generated
	 */
	public EAttribute getCheque_MicrNumber() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.Cheque#getBankAccountDetail <em>Bank Account Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bank Account Detail</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cheque#getBankAccountDetail()
	 * @see #getCheque()
	 * @generated
	 */
	public EReference getCheque_BankAccountDetail() {
        return (EReference)getCheque().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Cheque#getChequeNumber <em>Cheque Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cheque Number</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cheque#getChequeNumber()
	 * @see #getCheque()
	 * @generated
	 */
	public EAttribute getCheque_ChequeNumber() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Cheque#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cheque#getDate()
	 * @see #getCheque()
	 * @generated
	 */
	public EAttribute getCheque_Date() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Cheque#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cheque#getKind()
	 * @see #getCheque()
	 * @generated
	 */
	public EAttribute getCheque_Kind() {
        return (EAttribute)getCheque().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.AccountMovement <em>Account Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Movement</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountMovement
	 * @generated
	 */
	public EClass getAccountMovement() {
		if (accountMovementEClass == null) {
			accountMovementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(21);
		}
		return accountMovementEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AccountMovement#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountMovement#getDateTime()
	 * @see #getAccountMovement()
	 * @generated
	 */
	public EAttribute getAccountMovement_DateTime() {
        return (EAttribute)getAccountMovement().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AccountMovement#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountMovement#getReason()
	 * @see #getAccountMovement()
	 * @generated
	 */
	public EAttribute getAccountMovement_Reason() {
        return (EAttribute)getAccountMovement().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AccountMovement#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AccountMovement#getAmount()
	 * @see #getAccountMovement()
	 * @generated
	 */
	public EAttribute getAccountMovement_Amount() {
        return (EAttribute)getAccountMovement().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Shift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Shift
	 * @generated
	 */
	public EClass getShift() {
		if (shiftEClass == null) {
			shiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(22);
		}
		return shiftEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal <em>Transactions Grand Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transactions Grand Total</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotal()
	 * @see #getShift()
	 * @generated
	 */
	public EAttribute getShift_TransactionsGrandTotal() {
        return (EAttribute)getShift().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipts Grand Total Bankable</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalBankable()
	 * @see #getShift()
	 * @generated
	 */
	public EAttribute getShift_ReceiptsGrandTotalBankable() {
        return (EAttribute)getShift().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipts Grand Total Rounding</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalRounding()
	 * @see #getShift()
	 * @generated
	 */
	public EAttribute getShift_ReceiptsGrandTotalRounding() {
        return (EAttribute)getShift().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transactions Grand Total Rounding</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Shift#getTransactionsGrandTotalRounding()
	 * @see #getShift()
	 * @generated
	 */
	public EAttribute getShift_TransactionsGrandTotalRounding() {
        return (EAttribute)getShift().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.Shift#getActivityInterval <em>Activity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity Interval</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Shift#getActivityInterval()
	 * @see #getShift()
	 * @generated
	 */
	public EReference getShift_ActivityInterval() {
        return (EReference)getShift().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipts Grand Total Non Bankable</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Shift#getReceiptsGrandTotalNonBankable()
	 * @see #getShift()
	 * @generated
	 */
	public EAttribute getShift_ReceiptsGrandTotalNonBankable() {
        return (EAttribute)getShift().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt
	 * @generated
	 */
	public EClass getReceipt() {
		if (receiptEClass == null) {
			receiptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(23);
		}
		return receiptEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Receipt#getVendorShift <em>Vendor Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Shift</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getVendorShift()
	 * @see #getReceipt()
	 * @generated
	 */
	public EReference getReceipt_VendorShift() {
        return (EReference)getReceipt().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Receipt#isIsBankable <em>Is Bankable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bankable</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#isIsBankable()
	 * @see #getReceipt()
	 * @generated
	 */
	public EAttribute getReceipt_IsBankable() {
        return (EAttribute)getReceipt().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.Receipt#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getLine()
	 * @see #getReceipt()
	 * @generated
	 */
	public EReference getReceipt_Line() {
        return (EReference)getReceipt().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Receipt#getCashierShift <em>Cashier Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cashier Shift</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getCashierShift()
	 * @see #getReceipt()
	 * @generated
	 */
	public EReference getReceipt_CashierShift() {
        return (EReference)getReceipt().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Receipt#getTenders <em>Tenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tenders</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getTenders()
	 * @see #getReceipt()
	 * @generated
	 */
	public EReference getReceipt_Tenders() {
        return (EReference)getReceipt().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Receipt#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactions</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Receipt#getTransactions()
	 * @see #getReceipt()
	 * @generated
	 */
	public EReference getReceipt_Transactions() {
        return (EReference)getReceipt().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Due <em>Due</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Due</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Due
	 * @generated
	 */
	public EClass getDue() {
		if (dueEClass == null) {
			dueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(24);
		}
		return dueEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Due#getInterest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interest</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Due#getInterest()
	 * @see #getDue()
	 * @generated
	 */
	public EAttribute getDue_Interest() {
        return (EAttribute)getDue().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Due#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charges</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Due#getCharges()
	 * @see #getDue()
	 * @generated
	 */
	public EAttribute getDue_Charges() {
        return (EAttribute)getDue().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Due#getPrinciple <em>Principle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principle</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Due#getPrinciple()
	 * @see #getDue()
	 * @generated
	 */
	public EAttribute getDue_Principle() {
        return (EAttribute)getDue().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Due#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Due#getCurrent()
	 * @see #getDue()
	 * @generated
	 */
	public EAttribute getDue_Current() {
        return (EAttribute)getDue().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Due#getArrears <em>Arrears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrears</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Due#getArrears()
	 * @see #getDue()
	 * @generated
	 */
	public EAttribute getDue_Arrears() {
        return (EAttribute)getDue().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail <em>Bank Account Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Account Detail</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail
	 * @generated
	 */
	public EClass getBankAccountDetail() {
		if (bankAccountDetailEClass == null) {
			bankAccountDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(25);
		}
		return bankAccountDetailEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderID <em>Holder ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holder ID</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderID()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	public EAttribute getBankAccountDetail_HolderID() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderName <em>Holder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Holder Name</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail#getHolderName()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	public EAttribute getBankAccountDetail_HolderName() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBankName <em>Bank Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank Name</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBankName()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	public EAttribute getBankAccountDetail_BankName() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode <em>Branch Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Code</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail#getBranchCode()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	public EAttribute getBankAccountDetail_BranchCode() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail#getAccountNumber()
	 * @see #getBankAccountDetail()
	 * @generated
	 */
	public EAttribute getBankAccountDetail_AccountNumber() {
        return (EAttribute)getBankAccountDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount <em>Auxiliary Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Account</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount
	 * @generated
	 */
	public EClass getAuxiliaryAccount() {
		if (auxiliaryAccountEClass == null) {
			auxiliaryAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(26);
		}
		return auxiliaryAccountEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Debit</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastDebit()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EReference getAuxiliaryAccount_LastDebit() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Transactions</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPaymentTransactions()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EReference getAuxiliaryAccount_PaymentTransactions() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charges</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getCharges()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EReference getAuxiliaryAccount_Charges() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principle Amount</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getPrincipleAmount()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EAttribute getAuxiliaryAccount_PrincipleAmount() {
        return (EAttribute)getAuxiliaryAccount().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Credit</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getLastCredit()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EReference getAuxiliaryAccount_LastCredit() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auxiliary Agreement</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getAuxiliaryAgreement()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EReference getAuxiliaryAccount_AuxiliaryAgreement() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getBalance()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EAttribute getAuxiliaryAccount_Balance() {
        return (EAttribute)getAuxiliaryAccount().getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getDue <em>Due</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Due</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount#getDue()
	 * @see #getAuxiliaryAccount()
	 * @generated
	 */
	public EReference getAuxiliaryAccount_Due() {
        return (EReference)getAuxiliaryAccount().getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Cashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cashier</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cashier
	 * @generated
	 */
	public EClass getCashier() {
		if (cashierEClass == null) {
			cashierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(27);
		}
		return cashierEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link CIM15.IEC61968.PaymentMetering.Cashier#getElectronicAddress <em>Electronic Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electronic Address</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cashier#getElectronicAddress()
	 * @see #getCashier()
	 * @generated
	 */
	public EReference getCashier_ElectronicAddress() {
        return (EReference)getCashier().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.Cashier#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cashier Shifts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Cashier#getCashierShifts()
	 * @see #getCashier()
	 * @generated
	 */
	public EReference getCashier_CashierShifts() {
        return (EReference)getCashier().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Card
	 * @generated
	 */
	public EClass getCard() {
		if (cardEClass == null) {
			cardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(28);
		}
		return cardEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Card#getCvNumber <em>Cv Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cv Number</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Card#getCvNumber()
	 * @see #getCard()
	 * @generated
	 */
	public EAttribute getCard_CvNumber() {
        return (EAttribute)getCard().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Card#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Card#getExpiryDate()
	 * @see #getCard()
	 * @generated
	 */
	public EAttribute getCard_ExpiryDate() {
        return (EAttribute)getCard().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Card#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Card#getPan()
	 * @see #getCard()
	 * @generated
	 */
	public EAttribute getCard_Pan() {
        return (EAttribute)getCard().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.Card#getAccountHolderName <em>Account Holder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Holder Name</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Card#getAccountHolderName()
	 * @see #getCard()
	 * @generated
	 */
	public EAttribute getCard_AccountHolderName() {
        return (EAttribute)getCard().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.Card#getTender <em>Tender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tender</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.Card#getTender()
	 * @see #getCard()
	 * @generated
	 */
	public EReference getCard_Tender() {
        return (EReference)getCard().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount <em>Merchant Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merchant Account</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount
	 * @generated
	 */
	public EClass getMerchantAccount() {
		if (merchantAccountEClass == null) {
			merchantAccountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(29);
		}
		return merchantAccountEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merchant Agreement</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount#getMerchantAgreement()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	public EReference getMerchantAccount_MerchantAgreement() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance <em>Current Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Balance</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount#getCurrentBalance()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	public EAttribute getMerchantAccount_CurrentBalance() {
        return (EAttribute)getMerchantAccount().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provisional Balance</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount#getProvisionalBalance()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	public EAttribute getMerchantAccount_ProvisionalBalance() {
        return (EAttribute)getMerchantAccount().getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getTransactors <em>Transactors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transactors</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount#getTransactors()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	public EReference getMerchantAccount_Transactors() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vendor Shifts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount#getVendorShifts()
	 * @see #getMerchantAccount()
	 * @generated
	 */
	public EReference getMerchantAccount_VendorShifts() {
        return (EReference)getMerchantAccount().getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link CIM15.IEC61968.PaymentMetering.PointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Of Sale</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.PointOfSale
	 * @generated
	 */
	public EClass getPointOfSale() {
		if (pointOfSaleEClass == null) {
			pointOfSaleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(30);
		}
		return pointOfSaleEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link CIM15.IEC61968.PaymentMetering.PointOfSale#getCashierShifts <em>Cashier Shifts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cashier Shifts</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.PointOfSale#getCashierShifts()
	 * @see #getPointOfSale()
	 * @generated
	 */
	public EReference getPointOfSale_CashierShifts() {
        return (EReference)getPointOfSale().getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link CIM15.IEC61968.PaymentMetering.PointOfSale#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.PointOfSale#getLocation()
	 * @see #getPointOfSale()
	 * @generated
	 */
	public EAttribute getPointOfSale_Location() {
        return (EAttribute)getPointOfSale().getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.PaymentMetering.TenderKind <em>Tender Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tender Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TenderKind
	 * @generated
	 */
	public EEnum getTenderKind() {
		if (tenderKindEEnum == null) {
			tenderKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(4);
		}
		return tenderKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.PaymentMetering.ChequeKind <em>Cheque Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cheque Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ChequeKind
	 * @generated
	 */
	public EEnum getChequeKind() {
		if (chequeKindEEnum == null) {
			chequeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(6);
		}
		return chequeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.PaymentMetering.ChargeKind <em>Charge Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.ChargeKind
	 * @generated
	 */
	public EEnum getChargeKind() {
		if (chargeKindEEnum == null) {
			chargeKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(7);
		}
		return chargeKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.PaymentMetering.TransactionKind <em>Transaction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transaction Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.TransactionKind
	 * @generated
	 */
	public EEnum getTransactionKind() {
		if (transactionKindEEnum == null) {
			transactionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(19);
		}
		return transactionKindEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link CIM15.IEC61968.PaymentMetering.SupplierKind <em>Supplier Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supplier Kind</em>'.
	 * @see CIM15.IEC61968.PaymentMetering.SupplierKind
	 * @generated
	 */
	public EEnum getSupplierKind() {
		if (supplierKindEEnum == null) {
			supplierKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PaymentMeteringPackage.eNS_URI).getEClassifiers().get(20);
		}
		return supplierKindEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PaymentMeteringFactory getPaymentMeteringFactory() {
		return (PaymentMeteringFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("CIM15.IEC61968.PaymentMetering." + eClassifier.getName());
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
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.VendorShift <em>Vendor Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.VendorShift
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendorShift()
		 * @generated
		 */
		public static final EClass VENDOR_SHIFT = eINSTANCE.getVendorShift();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VENDOR_SHIFT__VENDOR = eINSTANCE.getVendorShift_Vendor();

		/**
		 * The meta object literal for the '<em><b>Merchant Debit Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT = eINSTANCE.getVendorShift_MerchantDebitAmount();

		/**
		 * The meta object literal for the '<em><b>Posted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VENDOR_SHIFT__POSTED = eINSTANCE.getVendorShift_Posted();

		/**
		 * The meta object literal for the '<em><b>Receipts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VENDOR_SHIFT__RECEIPTS = eINSTANCE.getVendorShift_Receipts();

		/**
		 * The meta object literal for the '<em><b>Merchant Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VENDOR_SHIFT__MERCHANT_ACCOUNT = eINSTANCE.getVendorShift_MerchantAccount();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VENDOR_SHIFT__TRANSACTIONS = eINSTANCE.getVendorShift_Transactions();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Transactor <em>Transactor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Transactor
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactor()
		 * @generated
		 */
		public static final EClass TRANSACTOR = eINSTANCE.getTransactor();

		/**
		 * The meta object literal for the '<em><b>Merchant Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTOR__MERCHANT_ACCOUNTS = eINSTANCE.getTransactor_MerchantAccounts();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.CashierShift <em>Cashier Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.CashierShift
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashierShift()
		 * @generated
		 */
		public static final EClass CASHIER_SHIFT = eINSTANCE.getCashierShift();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CASHIER_SHIFT__TRANSACTIONS = eINSTANCE.getCashierShift_Transactions();

		/**
		 * The meta object literal for the '<em><b>Point Of Sale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CASHIER_SHIFT__POINT_OF_SALE = eINSTANCE.getCashierShift_PointOfSale();

		/**
		 * The meta object literal for the '<em><b>Receipts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CASHIER_SHIFT__RECEIPTS = eINSTANCE.getCashierShift_Receipts();

		/**
		 * The meta object literal for the '<em><b>Cashier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CASHIER_SHIFT__CASHIER = eINSTANCE.getCashierShift_Cashier();

		/**
		 * The meta object literal for the '<em><b>Cash Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CASHIER_SHIFT__CASH_FLOAT = eINSTANCE.getCashierShift_CashFloat();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.TariffProfile <em>Tariff Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.TariffProfile
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTariffProfile()
		 * @generated
		 */
		public static final EClass TARIFF_PROFILE = eINSTANCE.getTariffProfile();

		/**
		 * The meta object literal for the '<em><b>Tariffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TARIFF_PROFILE__TARIFFS = eINSTANCE.getTariffProfile_Tariffs();

		/**
		 * The meta object literal for the '<em><b>Consumption Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TARIFF_PROFILE__CONSUMPTION_TARIFF_INTERVALS = eINSTANCE.getTariffProfile_ConsumptionTariffIntervals();

		/**
		 * The meta object literal for the '<em><b>Tariff Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TARIFF_PROFILE__TARIFF_CYCLE = eINSTANCE.getTariffProfile_TariffCycle();

		/**
		 * The meta object literal for the '<em><b>Time Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TARIFF_PROFILE__TIME_TARIFF_INTERVALS = eINSTANCE.getTariffProfile_TimeTariffIntervals();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.AccountingUnit <em>Accounting Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.AccountingUnit
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountingUnit()
		 * @generated
		 */
		public static final EClass ACCOUNTING_UNIT = eINSTANCE.getAccountingUnit();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNTING_UNIT__MULTIPLIER = eINSTANCE.getAccountingUnit_Multiplier();

		/**
		 * The meta object literal for the '<em><b>Energy Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNTING_UNIT__ENERGY_UNIT = eINSTANCE.getAccountingUnit_EnergyUnit();

		/**
		 * The meta object literal for the '<em><b>Monetary Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNTING_UNIT__MONETARY_UNIT = eINSTANCE.getAccountingUnit_MonetaryUnit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNTING_UNIT__VALUE = eINSTANCE.getAccountingUnit_Value();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Transaction <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Transaction
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransaction()
		 * @generated
		 */
		public static final EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Pricing Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__PRICING_STRUCTURE = eINSTANCE.getTransaction_PricingStructure();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__LINE = eINSTANCE.getTransaction_Line();

		/**
		 * The meta object literal for the '<em><b>Donor Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSACTION__DONOR_REFERENCE = eINSTANCE.getTransaction_DonorReference();

		/**
		 * The meta object literal for the '<em><b>User Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__USER_ATTRIBUTES = eINSTANCE.getTransaction_UserAttributes();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSACTION__KIND = eINSTANCE.getTransaction_Kind();

		/**
		 * The meta object literal for the '<em><b>Receiver Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSACTION__RECEIVER_REFERENCE = eINSTANCE.getTransaction_ReceiverReference();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__AUXILIARY_ACCOUNT = eINSTANCE.getTransaction_AuxiliaryAccount();

		/**
		 * The meta object literal for the '<em><b>Service Units Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSACTION__SERVICE_UNITS_ERROR = eINSTANCE.getTransaction_ServiceUnitsError();

		/**
		 * The meta object literal for the '<em><b>Vendor Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__VENDOR_SHIFT = eINSTANCE.getTransaction_VendorShift();

		/**
		 * The meta object literal for the '<em><b>Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__RECEIPT = eINSTANCE.getTransaction_Receipt();

		/**
		 * The meta object literal for the '<em><b>Diverse Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSACTION__DIVERSE_REFERENCE = eINSTANCE.getTransaction_DiverseReference();

		/**
		 * The meta object literal for the '<em><b>Service Units Energy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSACTION__SERVICE_UNITS_ENERGY = eINSTANCE.getTransaction_ServiceUnitsEnergy();

		/**
		 * The meta object literal for the '<em><b>Meter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__METER = eINSTANCE.getTransaction_Meter();

		/**
		 * The meta object literal for the '<em><b>Reversed Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRANSACTION__REVERSED_ID = eINSTANCE.getTransaction_ReversedId();

		/**
		 * The meta object literal for the '<em><b>Customer Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__CUSTOMER_ACCOUNT = eINSTANCE.getTransaction_CustomerAccount();

		/**
		 * The meta object literal for the '<em><b>Cashier Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRANSACTION__CASHIER_SHIFT = eINSTANCE.getTransaction_CashierShift();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.TimeTariffInterval <em>Time Tariff Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.TimeTariffInterval
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTimeTariffInterval()
		 * @generated
		 */
		public static final EClass TIME_TARIFF_INTERVAL = eINSTANCE.getTimeTariffInterval();

		/**
		 * The meta object literal for the '<em><b>Consumption Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_TARIFF_INTERVAL__CONSUMPTION_TARIFF_INTERVALS = eINSTANCE.getTimeTariffInterval_ConsumptionTariffIntervals();

		/**
		 * The meta object literal for the '<em><b>Start Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_TARIFF_INTERVAL__START_DATE_TIME = eINSTANCE.getTimeTariffInterval_StartDateTime();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_TARIFF_INTERVAL__SEQUENCE_NUMBER = eINSTANCE.getTimeTariffInterval_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Tariff Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_TARIFF_INTERVAL__TARIFF_PROFILES = eINSTANCE.getTimeTariffInterval_TariffProfiles();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_TARIFF_INTERVAL__CHARGES = eINSTANCE.getTimeTariffInterval_Charges();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Charge <em>Charge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Charge
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCharge()
		 * @generated
		 */
		public static final EClass CHARGE = eINSTANCE.getCharge();

		/**
		 * The meta object literal for the '<em><b>Consumption Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHARGE__CONSUMPTION_TARIFF_INTERVALS = eINSTANCE.getCharge_ConsumptionTariffIntervals();

		/**
		 * The meta object literal for the '<em><b>Variable Portion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHARGE__VARIABLE_PORTION = eINSTANCE.getCharge_VariablePortion();

		/**
		 * The meta object literal for the '<em><b>Time Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHARGE__TIME_TARIFF_INTERVALS = eINSTANCE.getCharge_TimeTariffIntervals();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHARGE__AUXILIARY_ACCOUNTS = eINSTANCE.getCharge_AuxiliaryAccounts();

		/**
		 * The meta object literal for the '<em><b>Child Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHARGE__CHILD_CHARGES = eINSTANCE.getCharge_ChildCharges();

		/**
		 * The meta object literal for the '<em><b>Fixed Portion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHARGE__FIXED_PORTION = eINSTANCE.getCharge_FixedPortion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHARGE__KIND = eINSTANCE.getCharge_Kind();

		/**
		 * The meta object literal for the '<em><b>Parent Charge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHARGE__PARENT_CHARGE = eINSTANCE.getCharge_ParentCharge();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement <em>Auxiliary Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAgreement
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAgreement()
		 * @generated
		 */
		public static final EClass AUXILIARY_AGREEMENT = eINSTANCE.getAuxiliaryAgreement();

		/**
		 * The meta object literal for the '<em><b>Customer Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_AGREEMENT__CUSTOMER_AGREEMENT = eINSTANCE.getAuxiliaryAgreement_CustomerAgreement();

		/**
		 * The meta object literal for the '<em><b>Vend Portion Arrear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__VEND_PORTION_ARREAR = eINSTANCE.getAuxiliaryAgreement_VendPortionArrear();

		/**
		 * The meta object literal for the '<em><b>Aux Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__AUX_REF = eINSTANCE.getAuxiliaryAgreement_AuxRef();

		/**
		 * The meta object literal for the '<em><b>Pay Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__PAY_CYCLE = eINSTANCE.getAuxiliaryAgreement_PayCycle();

		/**
		 * The meta object literal for the '<em><b>Arrears Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__ARREARS_INTEREST = eINSTANCE.getAuxiliaryAgreement_ArrearsInterest();

		/**
		 * The meta object literal for the '<em><b>Fixed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__FIXED_AMOUNT = eINSTANCE.getAuxiliaryAgreement_FixedAmount();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_AGREEMENT__AUXILIARY_ACCOUNTS = eINSTANCE.getAuxiliaryAgreement_AuxiliaryAccounts();

		/**
		 * The meta object literal for the '<em><b>Vend Portion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__VEND_PORTION = eINSTANCE.getAuxiliaryAgreement_VendPortion();

		/**
		 * The meta object literal for the '<em><b>Sub Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__SUB_CATEGORY = eINSTANCE.getAuxiliaryAgreement_SubCategory();

		/**
		 * The meta object literal for the '<em><b>Aux Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__AUX_CYCLE = eINSTANCE.getAuxiliaryAgreement_AuxCycle();

		/**
		 * The meta object literal for the '<em><b>Aux Priority Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__AUX_PRIORITY_CODE = eINSTANCE.getAuxiliaryAgreement_AuxPriorityCode();

		/**
		 * The meta object literal for the '<em><b>Min Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_AGREEMENT__MIN_AMOUNT = eINSTANCE.getAuxiliaryAgreement_MinAmount();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Tender <em>Tender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Tender
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTender()
		 * @generated
		 */
		public static final EClass TENDER = eINSTANCE.getTender();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TENDER__KIND = eINSTANCE.getTender_Kind();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TENDER__CHANGE = eINSTANCE.getTender_Change();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TENDER__AMOUNT = eINSTANCE.getTender_Amount();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TENDER__CARD = eINSTANCE.getTender_Card();

		/**
		 * The meta object literal for the '<em><b>Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TENDER__RECEIPT = eINSTANCE.getTender_Receipt();

		/**
		 * The meta object literal for the '<em><b>Cheque</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TENDER__CHEQUE = eINSTANCE.getTender_Cheque();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.ServiceSupplier <em>Service Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.ServiceSupplier
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getServiceSupplier()
		 * @generated
		 */
		public static final EClass SERVICE_SUPPLIER = eINSTANCE.getServiceSupplier();

		/**
		 * The meta object literal for the '<em><b>Bank Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_SUPPLIER__BANK_ACCOUNTS = eINSTANCE.getServiceSupplier_BankAccounts();

		/**
		 * The meta object literal for the '<em><b>Issuer Identification Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER = eINSTANCE.getServiceSupplier_IssuerIdentificationNumber();

		/**
		 * The meta object literal for the '<em><b>Service Delivery Points</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS = eINSTANCE.getServiceSupplier_ServiceDeliveryPoints();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SERVICE_SUPPLIER__KIND = eINSTANCE.getServiceSupplier_Kind();

		/**
		 * The meta object literal for the '<em><b>Customer Agreements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS = eINSTANCE.getServiceSupplier_CustomerAgreements();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.MerchantAgreement <em>Merchant Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.MerchantAgreement
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAgreement()
		 * @generated
		 */
		public static final EClass MERCHANT_AGREEMENT = eINSTANCE.getMerchantAgreement();

		/**
		 * The meta object literal for the '<em><b>Merchant Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS = eINSTANCE.getMerchantAgreement_MerchantAccounts();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.LineDetail <em>Line Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.LineDetail
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getLineDetail()
		 * @generated
		 */
		public static final EClass LINE_DETAIL = eINSTANCE.getLineDetail();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINE_DETAIL__AMOUNT = eINSTANCE.getLineDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Rounding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINE_DETAIL__ROUNDING = eINSTANCE.getLineDetail_Rounding();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINE_DETAIL__DATE_TIME = eINSTANCE.getLineDetail_DateTime();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINE_DETAIL__NOTE = eINSTANCE.getLineDetail_Note();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval <em>Consumption Tariff Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.ConsumptionTariffInterval
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getConsumptionTariffInterval()
		 * @generated
		 */
		public static final EClass CONSUMPTION_TARIFF_INTERVAL = eINSTANCE.getConsumptionTariffInterval();

		/**
		 * The meta object literal for the '<em><b>Start Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSUMPTION_TARIFF_INTERVAL__START_VALUE = eINSTANCE.getConsumptionTariffInterval_StartValue();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONSUMPTION_TARIFF_INTERVAL__CHARGES = eINSTANCE.getConsumptionTariffInterval_Charges();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSUMPTION_TARIFF_INTERVAL__SEQUENCE_NUMBER = eINSTANCE.getConsumptionTariffInterval_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Tariff Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONSUMPTION_TARIFF_INTERVAL__TARIFF_PROFILES = eINSTANCE.getConsumptionTariffInterval_TariffProfiles();

		/**
		 * The meta object literal for the '<em><b>Tou Tariff Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONSUMPTION_TARIFF_INTERVAL__TOU_TARIFF_INTERVALS = eINSTANCE.getConsumptionTariffInterval_TouTariffIntervals();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Vendor <em>Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Vendor
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getVendor()
		 * @generated
		 */
		public static final EClass VENDOR = eINSTANCE.getVendor();

		/**
		 * The meta object literal for the '<em><b>Vendor Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference VENDOR__VENDOR_SHIFTS = eINSTANCE.getVendor_VendorShifts();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Cheque <em>Cheque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Cheque
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCheque()
		 * @generated
		 */
		public static final EClass CHEQUE = eINSTANCE.getCheque();

		/**
		 * The meta object literal for the '<em><b>Tender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHEQUE__TENDER = eINSTANCE.getCheque_Tender();

		/**
		 * The meta object literal for the '<em><b>Micr Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHEQUE__MICR_NUMBER = eINSTANCE.getCheque_MicrNumber();

		/**
		 * The meta object literal for the '<em><b>Bank Account Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CHEQUE__BANK_ACCOUNT_DETAIL = eINSTANCE.getCheque_BankAccountDetail();

		/**
		 * The meta object literal for the '<em><b>Cheque Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHEQUE__CHEQUE_NUMBER = eINSTANCE.getCheque_ChequeNumber();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHEQUE__DATE = eINSTANCE.getCheque_Date();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CHEQUE__KIND = eINSTANCE.getCheque_Kind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.AccountMovement <em>Account Movement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.AccountMovement
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAccountMovement()
		 * @generated
		 */
		public static final EClass ACCOUNT_MOVEMENT = eINSTANCE.getAccountMovement();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNT_MOVEMENT__DATE_TIME = eINSTANCE.getAccountMovement_DateTime();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNT_MOVEMENT__REASON = eINSTANCE.getAccountMovement_Reason();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCOUNT_MOVEMENT__AMOUNT = eINSTANCE.getAccountMovement_Amount();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Shift <em>Shift</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Shift
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getShift()
		 * @generated
		 */
		public static final EClass SHIFT = eINSTANCE.getShift();

		/**
		 * The meta object literal for the '<em><b>Transactions Grand Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHIFT__TRANSACTIONS_GRAND_TOTAL = eINSTANCE.getShift_TransactionsGrandTotal();

		/**
		 * The meta object literal for the '<em><b>Receipts Grand Total Bankable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE = eINSTANCE.getShift_ReceiptsGrandTotalBankable();

		/**
		 * The meta object literal for the '<em><b>Receipts Grand Total Rounding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING = eINSTANCE.getShift_ReceiptsGrandTotalRounding();

		/**
		 * The meta object literal for the '<em><b>Transactions Grand Total Rounding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING = eINSTANCE.getShift_TransactionsGrandTotalRounding();

		/**
		 * The meta object literal for the '<em><b>Activity Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SHIFT__ACTIVITY_INTERVAL = eINSTANCE.getShift_ActivityInterval();

		/**
		 * The meta object literal for the '<em><b>Receipts Grand Total Non Bankable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE = eINSTANCE.getShift_ReceiptsGrandTotalNonBankable();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Receipt <em>Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Receipt
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getReceipt()
		 * @generated
		 */
		public static final EClass RECEIPT = eINSTANCE.getReceipt();

		/**
		 * The meta object literal for the '<em><b>Vendor Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECEIPT__VENDOR_SHIFT = eINSTANCE.getReceipt_VendorShift();

		/**
		 * The meta object literal for the '<em><b>Is Bankable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECEIPT__IS_BANKABLE = eINSTANCE.getReceipt_IsBankable();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECEIPT__LINE = eINSTANCE.getReceipt_Line();

		/**
		 * The meta object literal for the '<em><b>Cashier Shift</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECEIPT__CASHIER_SHIFT = eINSTANCE.getReceipt_CashierShift();

		/**
		 * The meta object literal for the '<em><b>Tenders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECEIPT__TENDERS = eINSTANCE.getReceipt_Tenders();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RECEIPT__TRANSACTIONS = eINSTANCE.getReceipt_Transactions();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Due <em>Due</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Due
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getDue()
		 * @generated
		 */
		public static final EClass DUE = eINSTANCE.getDue();

		/**
		 * The meta object literal for the '<em><b>Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DUE__INTEREST = eINSTANCE.getDue_Interest();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DUE__CHARGES = eINSTANCE.getDue_Charges();

		/**
		 * The meta object literal for the '<em><b>Principle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DUE__PRINCIPLE = eINSTANCE.getDue_Principle();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DUE__CURRENT = eINSTANCE.getDue_Current();

		/**
		 * The meta object literal for the '<em><b>Arrears</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DUE__ARREARS = eINSTANCE.getDue_Arrears();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.BankAccountDetail <em>Bank Account Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.BankAccountDetail
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getBankAccountDetail()
		 * @generated
		 */
		public static final EClass BANK_ACCOUNT_DETAIL = eINSTANCE.getBankAccountDetail();

		/**
		 * The meta object literal for the '<em><b>Holder ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BANK_ACCOUNT_DETAIL__HOLDER_ID = eINSTANCE.getBankAccountDetail_HolderID();

		/**
		 * The meta object literal for the '<em><b>Holder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BANK_ACCOUNT_DETAIL__HOLDER_NAME = eINSTANCE.getBankAccountDetail_HolderName();

		/**
		 * The meta object literal for the '<em><b>Bank Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BANK_ACCOUNT_DETAIL__BANK_NAME = eINSTANCE.getBankAccountDetail_BankName();

		/**
		 * The meta object literal for the '<em><b>Branch Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BANK_ACCOUNT_DETAIL__BRANCH_CODE = eINSTANCE.getBankAccountDetail_BranchCode();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER = eINSTANCE.getBankAccountDetail_AccountNumber();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.AuxiliaryAccount <em>Auxiliary Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.AuxiliaryAccount
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getAuxiliaryAccount()
		 * @generated
		 */
		public static final EClass AUXILIARY_ACCOUNT = eINSTANCE.getAuxiliaryAccount();

		/**
		 * The meta object literal for the '<em><b>Last Debit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_ACCOUNT__LAST_DEBIT = eINSTANCE.getAuxiliaryAccount_LastDebit();

		/**
		 * The meta object literal for the '<em><b>Payment Transactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_ACCOUNT__PAYMENT_TRANSACTIONS = eINSTANCE.getAuxiliaryAccount_PaymentTransactions();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_ACCOUNT__CHARGES = eINSTANCE.getAuxiliaryAccount_Charges();

		/**
		 * The meta object literal for the '<em><b>Principle Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_ACCOUNT__PRINCIPLE_AMOUNT = eINSTANCE.getAuxiliaryAccount_PrincipleAmount();

		/**
		 * The meta object literal for the '<em><b>Last Credit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_ACCOUNT__LAST_CREDIT = eINSTANCE.getAuxiliaryAccount_LastCredit();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_ACCOUNT__AUXILIARY_AGREEMENT = eINSTANCE.getAuxiliaryAccount_AuxiliaryAgreement();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute AUXILIARY_ACCOUNT__BALANCE = eINSTANCE.getAuxiliaryAccount_Balance();

		/**
		 * The meta object literal for the '<em><b>Due</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AUXILIARY_ACCOUNT__DUE = eINSTANCE.getAuxiliaryAccount_Due();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Cashier <em>Cashier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Cashier
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCashier()
		 * @generated
		 */
		public static final EClass CASHIER = eINSTANCE.getCashier();

		/**
		 * The meta object literal for the '<em><b>Electronic Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CASHIER__ELECTRONIC_ADDRESS = eINSTANCE.getCashier_ElectronicAddress();

		/**
		 * The meta object literal for the '<em><b>Cashier Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CASHIER__CASHIER_SHIFTS = eINSTANCE.getCashier_CashierShifts();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.Card <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.Card
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getCard()
		 * @generated
		 */
		public static final EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Cv Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CARD__CV_NUMBER = eINSTANCE.getCard_CvNumber();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CARD__EXPIRY_DATE = eINSTANCE.getCard_ExpiryDate();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CARD__PAN = eINSTANCE.getCard_Pan();

		/**
		 * The meta object literal for the '<em><b>Account Holder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CARD__ACCOUNT_HOLDER_NAME = eINSTANCE.getCard_AccountHolderName();

		/**
		 * The meta object literal for the '<em><b>Tender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CARD__TENDER = eINSTANCE.getCard_Tender();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.MerchantAccount <em>Merchant Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.MerchantAccount
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getMerchantAccount()
		 * @generated
		 */
		public static final EClass MERCHANT_ACCOUNT = eINSTANCE.getMerchantAccount();

		/**
		 * The meta object literal for the '<em><b>Merchant Agreement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MERCHANT_ACCOUNT__MERCHANT_AGREEMENT = eINSTANCE.getMerchantAccount_MerchantAgreement();

		/**
		 * The meta object literal for the '<em><b>Current Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MERCHANT_ACCOUNT__CURRENT_BALANCE = eINSTANCE.getMerchantAccount_CurrentBalance();

		/**
		 * The meta object literal for the '<em><b>Provisional Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MERCHANT_ACCOUNT__PROVISIONAL_BALANCE = eINSTANCE.getMerchantAccount_ProvisionalBalance();

		/**
		 * The meta object literal for the '<em><b>Transactors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MERCHANT_ACCOUNT__TRANSACTORS = eINSTANCE.getMerchantAccount_Transactors();

		/**
		 * The meta object literal for the '<em><b>Vendor Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MERCHANT_ACCOUNT__VENDOR_SHIFTS = eINSTANCE.getMerchantAccount_VendorShifts();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.PointOfSale <em>Point Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.PointOfSale
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getPointOfSale()
		 * @generated
		 */
		public static final EClass POINT_OF_SALE = eINSTANCE.getPointOfSale();

		/**
		 * The meta object literal for the '<em><b>Cashier Shifts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POINT_OF_SALE__CASHIER_SHIFTS = eINSTANCE.getPointOfSale_CashierShifts();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POINT_OF_SALE__LOCATION = eINSTANCE.getPointOfSale_Location();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.TenderKind <em>Tender Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.TenderKind
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTenderKind()
		 * @generated
		 */
		public static final EEnum TENDER_KIND = eINSTANCE.getTenderKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.ChequeKind <em>Cheque Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.ChequeKind
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getChequeKind()
		 * @generated
		 */
		public static final EEnum CHEQUE_KIND = eINSTANCE.getChequeKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.ChargeKind <em>Charge Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.ChargeKind
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getChargeKind()
		 * @generated
		 */
		public static final EEnum CHARGE_KIND = eINSTANCE.getChargeKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.TransactionKind <em>Transaction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.TransactionKind
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactionKind()
		 * @generated
		 */
		public static final EEnum TRANSACTION_KIND = eINSTANCE.getTransactionKind();

		/**
		 * The meta object literal for the '{@link CIM15.IEC61968.PaymentMetering.SupplierKind <em>Supplier Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CIM15.IEC61968.PaymentMetering.SupplierKind
		 * @see CIM15.IEC61968.PaymentMetering.PaymentMeteringPackage#getSupplierKind()
		 * @generated
		 */
		public static final EEnum SUPPLIER_KIND = eINSTANCE.getSupplierKind();

	}

} //PaymentMeteringPackage
