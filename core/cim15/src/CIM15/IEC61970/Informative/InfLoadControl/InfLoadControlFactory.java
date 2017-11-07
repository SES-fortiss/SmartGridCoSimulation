/**
 */
package CIM15.IEC61970.Informative.InfLoadControl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class InfLoadControlFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfLoadControlFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfLoadControlFactory INSTANCE = CIM15.IEC61970.Informative.InfLoadControl.InfLoadControlFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfLoadControlFactory init() {
		try {
			InfLoadControlFactory theInfLoadControlFactory = (InfLoadControlFactory)EPackage.Registry.INSTANCE.getEFactory(InfLoadControlPackage.eNS_URI);
			if (theInfLoadControlFactory != null) {
				return theInfLoadControlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfLoadControlFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfLoadControlFactory() {
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD: return createLoadMgmtRecord();
			case InfLoadControlPackage.LOAD_SHED_FUNCTION: return createLoadShedFunction();
			case InfLoadControlPackage.LOAD_MGMT_FUNCTION: return createLoadMgmtFunction();
			case InfLoadControlPackage.LOAD_LIMIT_FUNCTION: return createLoadLimitFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfLoadControlPackage.LOAD_MGMT_KIND:
				return createLoadMgmtKindFromString(eDataType, initialValue);
			case InfLoadControlPackage.LOAD_STATE_KIND:
				return createLoadStateKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfLoadControlPackage.LOAD_MGMT_KIND:
				return convertLoadMgmtKindToString(eDataType, instanceValue);
			case InfLoadControlPackage.LOAD_STATE_KIND:
				return convertLoadStateKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMgmtRecord createLoadMgmtRecord() {
		LoadMgmtRecord loadMgmtRecord = new LoadMgmtRecord();
		return loadMgmtRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadShedFunction createLoadShedFunction() {
		LoadShedFunction loadShedFunction = new LoadShedFunction();
		return loadShedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMgmtFunction createLoadMgmtFunction() {
		LoadMgmtFunction loadMgmtFunction = new LoadMgmtFunction();
		return loadMgmtFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadLimitFunction createLoadLimitFunction() {
		LoadLimitFunction loadLimitFunction = new LoadLimitFunction();
		return loadLimitFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMgmtKind createLoadMgmtKindFromString(EDataType eDataType, String initialValue) {
		LoadMgmtKind result = LoadMgmtKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadMgmtKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadStateKind createLoadStateKindFromString(EDataType eDataType, String initialValue) {
		LoadStateKind result = LoadStateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadStateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfLoadControlPackage getInfLoadControlPackage() {
		return (InfLoadControlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfLoadControlPackage getPackage() {
		return InfLoadControlPackage.eINSTANCE;
	}

} //InfLoadControlFactory
