/**
 */
package CIM15.IEC61968.AssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conductor Insulation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM15.IEC61968.AssetModels.AssetModelsPackage#getConductorInsulationKind()
 * @generated
 */
public enum ConductorInsulationKind implements Enumerator {
	/**
	 * The '<em><b>Tree Retardant Crosslinked Polyethylene</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREE_RETARDANT_CROSSLINKED_POLYETHYLENE_VALUE
	 * @generated
	 * @ordered
	 */
	TREE_RETARDANT_CROSSLINKED_POLYETHYLENE(0, "treeRetardantCrosslinkedPolyethylene", "treeRetardantCrosslinkedPolyethylene"),

	/**
	 * The '<em><b>Butyl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTYL_VALUE
	 * @generated
	 * @ordered
	 */
	BUTYL(1, "butyl", "butyl"),

	/**
	 * The '<em><b>High Pressure Fluid Filled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_PRESSURE_FLUID_FILLED_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_PRESSURE_FLUID_FILLED(2, "highPressureFluidFilled", "highPressureFluidFilled"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "other"),

	/**
	 * The '<em><b>Varnished Cambric Cloth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARNISHED_CAMBRIC_CLOTH_VALUE
	 * @generated
	 * @ordered
	 */
	VARNISHED_CAMBRIC_CLOTH(4, "varnishedCambricCloth", "varnishedCambricCloth"),

	/**
	 * The '<em><b>Silicon Rubber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILICON_RUBBER_VALUE
	 * @generated
	 * @ordered
	 */
	SILICON_RUBBER(5, "siliconRubber", "siliconRubber"),

	/**
	 * The '<em><b>Belted Pilc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELTED_PILC_VALUE
	 * @generated
	 * @ordered
	 */
	BELTED_PILC(6, "beltedPilc", "beltedPilc"),

	/**
	 * The '<em><b>Crosslinked Polyethylene</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSSLINKED_POLYETHYLENE_VALUE
	 * @generated
	 * @ordered
	 */
	CROSSLINKED_POLYETHYLENE(7, "crosslinkedPolyethylene", "crosslinkedPolyethylene"),

	/**
	 * The '<em><b>Oil Paper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OIL_PAPER_VALUE
	 * @generated
	 * @ordered
	 */
	OIL_PAPER(8, "oilPaper", "oilPaper"),

	/**
	 * The '<em><b>Low Capacitance Rubber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_CAPACITANCE_RUBBER_VALUE
	 * @generated
	 * @ordered
	 */
	LOW_CAPACITANCE_RUBBER(9, "lowCapacitanceRubber", "lowCapacitanceRubber"),

	/**
	 * The '<em><b>Asbestos And Varnished Cambric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASBESTOS_AND_VARNISHED_CAMBRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ASBESTOS_AND_VARNISHED_CAMBRIC(10, "asbestosAndVarnishedCambric", "asbestosAndVarnishedCambric"),

	/**
	 * The '<em><b>Tree Resistant High Molecular Weight Polyethylene</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE
	 * @generated
	 * @ordered
	 */
	TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE(11, "treeResistantHighMolecularWeightPolyethylene", "treeResistantHighMolecularWeightPolyethylene"),

	/**
	 * The '<em><b>Unbelted Pilc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBELTED_PILC_VALUE
	 * @generated
	 * @ordered
	 */
	UNBELTED_PILC(12, "unbeltedPilc", "unbeltedPilc"),

	/**
	 * The '<em><b>Ozone Resistant Rubber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OZONE_RESISTANT_RUBBER_VALUE
	 * @generated
	 * @ordered
	 */
	OZONE_RESISTANT_RUBBER(13, "ozoneResistantRubber", "ozoneResistantRubber"),

	/**
	 * The '<em><b>Ethylene Propylene Rubber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHYLENE_PROPYLENE_RUBBER_VALUE
	 * @generated
	 * @ordered
	 */
	ETHYLENE_PROPYLENE_RUBBER(14, "ethylenePropyleneRubber", "ethylenePropyleneRubber"),

	/**
	 * The '<em><b>High Molecular Weight Polyethylene</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_MOLECULAR_WEIGHT_POLYETHYLENE(15, "highMolecularWeightPolyethylene", "highMolecularWeightPolyethylene"),

	/**
	 * The '<em><b>Varnished Dacron Glass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARNISHED_DACRON_GLASS_VALUE
	 * @generated
	 * @ordered
	 */
	VARNISHED_DACRON_GLASS(16, "varnishedDacronGlass", "varnishedDacronGlass"),

	/**
	 * The '<em><b>Rubber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUBBER_VALUE
	 * @generated
	 * @ordered
	 */
	RUBBER(17, "rubber", "rubber");

	/**
	 * The '<em><b>Tree Retardant Crosslinked Polyethylene</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tree Retardant Crosslinked Polyethylene</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREE_RETARDANT_CROSSLINKED_POLYETHYLENE
	 * @generated
	 * @ordered
	 */
	public static final int TREE_RETARDANT_CROSSLINKED_POLYETHYLENE_VALUE = 0;

	/**
	 * The '<em><b>Butyl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Butyl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTYL
	 * @generated
	 * @ordered
	 */
	public static final int BUTYL_VALUE = 1;

	/**
	 * The '<em><b>High Pressure Fluid Filled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Pressure Fluid Filled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_PRESSURE_FLUID_FILLED
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_PRESSURE_FLUID_FILLED_VALUE = 2;

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
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>Varnished Cambric Cloth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Varnished Cambric Cloth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARNISHED_CAMBRIC_CLOTH
	 * @generated
	 * @ordered
	 */
	public static final int VARNISHED_CAMBRIC_CLOTH_VALUE = 4;

	/**
	 * The '<em><b>Silicon Rubber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Silicon Rubber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SILICON_RUBBER
	 * @generated
	 * @ordered
	 */
	public static final int SILICON_RUBBER_VALUE = 5;

	/**
	 * The '<em><b>Belted Pilc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Belted Pilc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BELTED_PILC
	 * @generated
	 * @ordered
	 */
	public static final int BELTED_PILC_VALUE = 6;

	/**
	 * The '<em><b>Crosslinked Polyethylene</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Crosslinked Polyethylene</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSSLINKED_POLYETHYLENE
	 * @generated
	 * @ordered
	 */
	public static final int CROSSLINKED_POLYETHYLENE_VALUE = 7;

	/**
	 * The '<em><b>Oil Paper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oil Paper</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OIL_PAPER
	 * @generated
	 * @ordered
	 */
	public static final int OIL_PAPER_VALUE = 8;

	/**
	 * The '<em><b>Low Capacitance Rubber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low Capacitance Rubber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_CAPACITANCE_RUBBER
	 * @generated
	 * @ordered
	 */
	public static final int LOW_CAPACITANCE_RUBBER_VALUE = 9;

	/**
	 * The '<em><b>Asbestos And Varnished Cambric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asbestos And Varnished Cambric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASBESTOS_AND_VARNISHED_CAMBRIC
	 * @generated
	 * @ordered
	 */
	public static final int ASBESTOS_AND_VARNISHED_CAMBRIC_VALUE = 10;

	/**
	 * The '<em><b>Tree Resistant High Molecular Weight Polyethylene</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tree Resistant High Molecular Weight Polyethylene</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE
	 * @generated
	 * @ordered
	 */
	public static final int TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE = 11;

	/**
	 * The '<em><b>Unbelted Pilc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unbelted Pilc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNBELTED_PILC
	 * @generated
	 * @ordered
	 */
	public static final int UNBELTED_PILC_VALUE = 12;

	/**
	 * The '<em><b>Ozone Resistant Rubber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ozone Resistant Rubber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OZONE_RESISTANT_RUBBER
	 * @generated
	 * @ordered
	 */
	public static final int OZONE_RESISTANT_RUBBER_VALUE = 13;

	/**
	 * The '<em><b>Ethylene Propylene Rubber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ethylene Propylene Rubber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHYLENE_PROPYLENE_RUBBER
	 * @generated
	 * @ordered
	 */
	public static final int ETHYLENE_PROPYLENE_RUBBER_VALUE = 14;

	/**
	 * The '<em><b>High Molecular Weight Polyethylene</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Molecular Weight Polyethylene</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_MOLECULAR_WEIGHT_POLYETHYLENE
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE = 15;

	/**
	 * The '<em><b>Varnished Dacron Glass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Varnished Dacron Glass</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VARNISHED_DACRON_GLASS
	 * @generated
	 * @ordered
	 */
	public static final int VARNISHED_DACRON_GLASS_VALUE = 16;

	/**
	 * The '<em><b>Rubber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rubber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUBBER
	 * @generated
	 * @ordered
	 */
	public static final int RUBBER_VALUE = 17;

	/**
	 * An array of all the '<em><b>Conductor Insulation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConductorInsulationKind[] VALUES_ARRAY =
		new ConductorInsulationKind[] {
			TREE_RETARDANT_CROSSLINKED_POLYETHYLENE,
			BUTYL,
			HIGH_PRESSURE_FLUID_FILLED,
			OTHER,
			VARNISHED_CAMBRIC_CLOTH,
			SILICON_RUBBER,
			BELTED_PILC,
			CROSSLINKED_POLYETHYLENE,
			OIL_PAPER,
			LOW_CAPACITANCE_RUBBER,
			ASBESTOS_AND_VARNISHED_CAMBRIC,
			TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE,
			UNBELTED_PILC,
			OZONE_RESISTANT_RUBBER,
			ETHYLENE_PROPYLENE_RUBBER,
			HIGH_MOLECULAR_WEIGHT_POLYETHYLENE,
			VARNISHED_DACRON_GLASS,
			RUBBER,
		};

	/**
	 * A public read-only list of all the '<em><b>Conductor Insulation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConductorInsulationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conductor Insulation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConductorInsulationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConductorInsulationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conductor Insulation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConductorInsulationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConductorInsulationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conductor Insulation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConductorInsulationKind get(int value) {
		switch (value) {
			case TREE_RETARDANT_CROSSLINKED_POLYETHYLENE_VALUE: return TREE_RETARDANT_CROSSLINKED_POLYETHYLENE;
			case BUTYL_VALUE: return BUTYL;
			case HIGH_PRESSURE_FLUID_FILLED_VALUE: return HIGH_PRESSURE_FLUID_FILLED;
			case OTHER_VALUE: return OTHER;
			case VARNISHED_CAMBRIC_CLOTH_VALUE: return VARNISHED_CAMBRIC_CLOTH;
			case SILICON_RUBBER_VALUE: return SILICON_RUBBER;
			case BELTED_PILC_VALUE: return BELTED_PILC;
			case CROSSLINKED_POLYETHYLENE_VALUE: return CROSSLINKED_POLYETHYLENE;
			case OIL_PAPER_VALUE: return OIL_PAPER;
			case LOW_CAPACITANCE_RUBBER_VALUE: return LOW_CAPACITANCE_RUBBER;
			case ASBESTOS_AND_VARNISHED_CAMBRIC_VALUE: return ASBESTOS_AND_VARNISHED_CAMBRIC;
			case TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE: return TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE;
			case UNBELTED_PILC_VALUE: return UNBELTED_PILC;
			case OZONE_RESISTANT_RUBBER_VALUE: return OZONE_RESISTANT_RUBBER;
			case ETHYLENE_PROPYLENE_RUBBER_VALUE: return ETHYLENE_PROPYLENE_RUBBER;
			case HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE: return HIGH_MOLECULAR_WEIGHT_POLYETHYLENE;
			case VARNISHED_DACRON_GLASS_VALUE: return VARNISHED_DACRON_GLASS;
			case RUBBER_VALUE: return RUBBER;
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
	private ConductorInsulationKind(int value, String name, String literal) {
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
	
} //ConductorInsulationKind
