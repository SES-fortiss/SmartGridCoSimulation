/**
 */
package CIM15.IEC61968.Customers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Customer Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.Customers.CustomersPackage#getCustomerKind()
 * @generated
 */
public enum CustomerKind implements Enumerator {
	/**
	 * The '<em><b>Wind Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIND_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	WIND_MACHINE(0, "windMachine", "windMachine"),

	/**
	 * The '<em><b>Residential And Commercial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_AND_COMMERCIAL_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENTIAL_AND_COMMERCIAL(1, "residentialAndCommercial", "residentialAndCommercial"),

	/**
	 * The '<em><b>Internal Use</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_USE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL_USE(2, "internalUse", "internalUse"),

	/**
	 * The '<em><b>Energy Service Scheduler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_SERVICE_SCHEDULER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_SERVICE_SCHEDULER(3, "energyServiceScheduler", "energyServiceScheduler"),

	/**
	 * The '<em><b>Residential And Streetlight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_AND_STREETLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENTIAL_AND_STREETLIGHT(4, "residentialAndStreetlight", "residentialAndStreetlight"),

	/**
	 * The '<em><b>Residential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENTIAL(5, "residential", "residential"),

	/**
	 * The '<em><b>Pumping Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUMPING_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	PUMPING_LOAD(6, "pumpingLoad", "pumpingLoad"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(7, "other", "other"),

	/**
	 * The '<em><b>Commercial Industrial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMERCIAL_INDUSTRIAL_VALUE
	 * @generated
	 * @ordered
	 */
	COMMERCIAL_INDUSTRIAL(8, "commercialIndustrial", "commercialIndustrial"),

	/**
	 * The '<em><b>Energy Service Supplier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_SERVICE_SUPPLIER_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY_SERVICE_SUPPLIER(9, "energyServiceSupplier", "energyServiceSupplier"),

	/**
	 * The '<em><b>Residential Streetlight Others</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_STREETLIGHT_OTHERS_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENTIAL_STREETLIGHT_OTHERS(10, "residentialStreetlightOthers", "residentialStreetlightOthers"),

	/**
	 * The '<em><b>Residential Farm Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_FARM_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENTIAL_FARM_SERVICE(11, "residentialFarmService", "residentialFarmService");

	/**
	 * The '<em><b>Wind Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wind Machine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIND_MACHINE
	 * @generated
	 * @ordered
	 */
	public static final int WIND_MACHINE_VALUE = 0;

	/**
	 * The '<em><b>Residential And Commercial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Residential And Commercial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_AND_COMMERCIAL
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENTIAL_AND_COMMERCIAL_VALUE = 1;

	/**
	 * The '<em><b>Internal Use</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Internal Use</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_USE
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_USE_VALUE = 2;

	/**
	 * The '<em><b>Energy Service Scheduler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Energy Service Scheduler</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENERGY_SERVICE_SCHEDULER
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SERVICE_SCHEDULER_VALUE = 3;

	/**
	 * The '<em><b>Residential And Streetlight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Residential And Streetlight</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_AND_STREETLIGHT
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENTIAL_AND_STREETLIGHT_VALUE = 4;

	/**
	 * The '<em><b>Residential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Residential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENTIAL_VALUE = 5;

	/**
	 * The '<em><b>Pumping Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pumping Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUMPING_LOAD
	 * @generated
	 * @ordered
	 */
	public static final int PUMPING_LOAD_VALUE = 6;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 7;

	/**
	 * The '<em><b>Commercial Industrial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Commercial Industrial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMERCIAL_INDUSTRIAL
	 * @generated
	 * @ordered
	 */
	public static final int COMMERCIAL_INDUSTRIAL_VALUE = 8;

	/**
	 * The '<em><b>Energy Service Supplier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Energy Service Supplier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENERGY_SERVICE_SUPPLIER
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_SERVICE_SUPPLIER_VALUE = 9;

	/**
	 * The '<em><b>Residential Streetlight Others</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Residential Streetlight Others</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_STREETLIGHT_OTHERS
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENTIAL_STREETLIGHT_OTHERS_VALUE = 10;

	/**
	 * The '<em><b>Residential Farm Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Residential Farm Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDENTIAL_FARM_SERVICE
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENTIAL_FARM_SERVICE_VALUE = 11;

	/**
	 * An array of all the '<em><b>Customer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CustomerKind[] VALUES_ARRAY =
		new CustomerKind[] {
			WIND_MACHINE,
			RESIDENTIAL_AND_COMMERCIAL,
			INTERNAL_USE,
			ENERGY_SERVICE_SCHEDULER,
			RESIDENTIAL_AND_STREETLIGHT,
			RESIDENTIAL,
			PUMPING_LOAD,
			OTHER,
			COMMERCIAL_INDUSTRIAL,
			ENERGY_SERVICE_SUPPLIER,
			RESIDENTIAL_STREETLIGHT_OTHERS,
			RESIDENTIAL_FARM_SERVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Customer Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CustomerKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Customer Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Customer Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Customer Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomerKind get(int value) {
		switch (value) {
			case WIND_MACHINE_VALUE: return WIND_MACHINE;
			case RESIDENTIAL_AND_COMMERCIAL_VALUE: return RESIDENTIAL_AND_COMMERCIAL;
			case INTERNAL_USE_VALUE: return INTERNAL_USE;
			case ENERGY_SERVICE_SCHEDULER_VALUE: return ENERGY_SERVICE_SCHEDULER;
			case RESIDENTIAL_AND_STREETLIGHT_VALUE: return RESIDENTIAL_AND_STREETLIGHT;
			case RESIDENTIAL_VALUE: return RESIDENTIAL;
			case PUMPING_LOAD_VALUE: return PUMPING_LOAD;
			case OTHER_VALUE: return OTHER;
			case COMMERCIAL_INDUSTRIAL_VALUE: return COMMERCIAL_INDUSTRIAL;
			case ENERGY_SERVICE_SUPPLIER_VALUE: return ENERGY_SERVICE_SUPPLIER;
			case RESIDENTIAL_STREETLIGHT_OTHERS_VALUE: return RESIDENTIAL_STREETLIGHT_OTHERS;
			case RESIDENTIAL_FARM_SERVICE_VALUE: return RESIDENTIAL_FARM_SERVICE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CustomerKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CustomerKind
