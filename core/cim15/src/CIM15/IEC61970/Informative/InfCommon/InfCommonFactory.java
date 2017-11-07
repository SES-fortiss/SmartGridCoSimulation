/**
 */
package CIM15.IEC61970.Informative.InfCommon;

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
public class InfCommonFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfCommonFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfCommonFactory INSTANCE = CIM15.IEC61970.Informative.InfCommon.InfCommonFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfCommonFactory init() {
		try {
			InfCommonFactory theInfCommonFactory = (InfCommonFactory)EPackage.Registry.INSTANCE.getEFactory(InfCommonPackage.eNS_URI);
			if (theInfCommonFactory != null) {
				return theInfCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfCommonFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCommonFactory() {
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
			case InfCommonPackage.ROLE: return createRole();
			case InfCommonPackage.BANK: return createBank();
			case InfCommonPackage.SKILL: return createSkill();
			case InfCommonPackage.BUSINESS_ROLE: return createBusinessRole();
			case InfCommonPackage.SCHEDULED_EVENT: return createScheduledEvent();
			case InfCommonPackage.SCHEDULE_PARAMETER_INFO: return createScheduleParameterInfo();
			case InfCommonPackage.DOC_PSR_ROLE: return createDocPsrRole();
			case InfCommonPackage.RATIO: return createRatio();
			case InfCommonPackage.BANK_ACCOUNT: return createBankAccount();
			case InfCommonPackage.CRAFT: return createCraft();
			case InfCommonPackage.DOC_DOC_ROLE: return createDocDocRole();
			case InfCommonPackage.BUSINESS_PLAN: return createBusinessPlan();
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
			case InfCommonPackage.SKILL_LEVEL_KIND:
				return createSkillLevelKindFromString(eDataType, initialValue);
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
			case InfCommonPackage.SKILL_LEVEL_KIND:
				return convertSkillLevelKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		Role role = new Role();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank createBank() {
		Bank bank = new Bank();
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill createSkill() {
		Skill skill = new Skill();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRole createBusinessRole() {
		BusinessRole businessRole = new BusinessRole();
		return businessRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduledEvent createScheduledEvent() {
		ScheduledEvent scheduledEvent = new ScheduledEvent();
		return scheduledEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleParameterInfo createScheduleParameterInfo() {
		ScheduleParameterInfo scheduleParameterInfo = new ScheduleParameterInfo();
		return scheduleParameterInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocPsrRole createDocPsrRole() {
		DocPsrRole docPsrRole = new DocPsrRole();
		return docPsrRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		Ratio ratio = new Ratio();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccount createBankAccount() {
		BankAccount bankAccount = new BankAccount();
		return bankAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Craft createCraft() {
		Craft craft = new Craft();
		return craft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocDocRole createDocDocRole() {
		DocDocRole docDocRole = new DocDocRole();
		return docDocRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPlan createBusinessPlan() {
		BusinessPlan businessPlan = new BusinessPlan();
		return businessPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillLevelKind createSkillLevelKindFromString(EDataType eDataType, String initialValue) {
		SkillLevelKind result = SkillLevelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSkillLevelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfCommonPackage getInfCommonPackage() {
		return (InfCommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfCommonPackage getPackage() {
		return InfCommonPackage.eINSTANCE;
	}

} //InfCommonFactory
