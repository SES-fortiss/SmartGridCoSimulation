/**
 */
package CIM15.IEC61970.Informative.InfMetering;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfMeteringFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfMeteringFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfMeteringFactory INSTANCE = CIM15.IEC61970.Informative.InfMetering.InfMeteringFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfMeteringFactory init() {
		try {
			InfMeteringFactory theInfMeteringFactory = (InfMeteringFactory)EPackage.Registry.INSTANCE.getEFactory(InfMeteringPackage.eNS_URI);
			if (theInfMeteringFactory != null) {
				return theInfMeteringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfMeteringFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfMeteringFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InfMeteringPackage.GAS_METERING_FUNCTION: return createGasMeteringFunction();
			case InfMeteringPackage.WATER_METERING_FUNCTION: return createWaterMeteringFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GasMeteringFunction createGasMeteringFunction() {
		GasMeteringFunction gasMeteringFunction = new GasMeteringFunction();
		return gasMeteringFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterMeteringFunction createWaterMeteringFunction() {
		WaterMeteringFunction waterMeteringFunction = new WaterMeteringFunction();
		return waterMeteringFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfMeteringPackage getInfMeteringPackage() {
		return (InfMeteringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfMeteringPackage getPackage() {
		return InfMeteringPackage.eINSTANCE;
	}

} //InfMeteringFactory
