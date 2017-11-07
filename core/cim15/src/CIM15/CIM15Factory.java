/**
 */
package CIM15;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CIM15Factory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CIM15Factory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CIM15Factory INSTANCE = CIM15.CIM15Factory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CIM15Factory init() {
		try {
			CIM15Factory theCIM15Factory = (CIM15Factory)EPackage.Registry.INSTANCE.getEFactory(CIM15Package.eNS_URI);
			if (theCIM15Factory != null) {
				return theCIM15Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CIM15Factory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM15Factory() {
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
			case CIM15Package.COMBINED_VERSION: return createCombinedVersion();
			case CIM15Package.STEREOTYPE: return createStereotype();
			case CIM15Package.PACKAGE: return createPackage();
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
			case CIM15Package.CIM_TIME:
				return createCIMTimeFromString(eDataType, initialValue);
			case CIM15Package.CIM_DATE_TIME:
				return createCIMDateTimeFromString(eDataType, initialValue);
			case CIM15Package.CIM_DURATION:
				return createCIMDurationFromString(eDataType, initialValue);
			case CIM15Package.CIMG_YEAR:
				return createCIMGYearFromString(eDataType, initialValue);
			case CIM15Package.CIM_DATE:
				return createCIMDateFromString(eDataType, initialValue);
			case CIM15Package.CIMG_MONTH_DAY:
				return createCIMGMonthDayFromString(eDataType, initialValue);
			case CIM15Package.CIMG_MONTH:
				return createCIMGMonthFromString(eDataType, initialValue);
			case CIM15Package.CIMG_DAY:
				return createCIMGDayFromString(eDataType, initialValue);
			case CIM15Package.CIMG_YEAR_MONTH:
				return createCIMGYearMonthFromString(eDataType, initialValue);
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
			case CIM15Package.CIM_TIME:
				return convertCIMTimeToString(eDataType, instanceValue);
			case CIM15Package.CIM_DATE_TIME:
				return convertCIMDateTimeToString(eDataType, instanceValue);
			case CIM15Package.CIM_DURATION:
				return convertCIMDurationToString(eDataType, instanceValue);
			case CIM15Package.CIMG_YEAR:
				return convertCIMGYearToString(eDataType, instanceValue);
			case CIM15Package.CIM_DATE:
				return convertCIMDateToString(eDataType, instanceValue);
			case CIM15Package.CIMG_MONTH_DAY:
				return convertCIMGMonthDayToString(eDataType, instanceValue);
			case CIM15Package.CIMG_MONTH:
				return convertCIMGMonthToString(eDataType, instanceValue);
			case CIM15Package.CIMG_DAY:
				return convertCIMGDayToString(eDataType, instanceValue);
			case CIM15Package.CIMG_YEAR_MONTH:
				return convertCIMGYearMonthToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedVersion createCombinedVersion() {
		CombinedVersion combinedVersion = new CombinedVersion();
		return combinedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		Stereotype stereotype = new Stereotype();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package createPackage() {
		Package package_ = new Package();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMTimeFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMDateTimeFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMDateTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMDurationFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMDurationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMGYearFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMGYearToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMDateFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMDateToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMGMonthDayFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GMONTH_DAY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMGMonthDayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GMONTH_DAY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMGMonthFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GMONTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMGMonthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GMONTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMGDayFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GDAY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMGDayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GDAY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createCIMGYearMonthFromString(EDataType eDataType, String initialValue) {
		return (Date)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCIMGYearMonthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM15Package getCIM15Package() {
		return (CIM15Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CIM15Package getPackage() {
		return CIM15Package.eINSTANCE;
	}

} //CIM15Factory
