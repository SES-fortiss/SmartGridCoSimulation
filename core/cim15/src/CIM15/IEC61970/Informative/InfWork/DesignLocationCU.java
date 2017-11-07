/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Location CU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getConditionFactors <em>Condition Factors</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesigns <em>Designs</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCUGroups <em>CU Groups</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignLocationCU extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getConditionFactors() <em>Condition Factors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionFactor> conditionFactors;

	/**
	 * The default value of the '{@link #isEnergizationFlag() <em>Energization Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnergizationFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENERGIZATION_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnergizationFlag() <em>Energization Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnergizationFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean energizationFlag = ENERGIZATION_FLAG_EDEFAULT;

	/**
	 * This is true if the Energization Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energizationFlagESet;

	/**
	 * The default value of the '{@link #getCuUsage() <em>Cu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String CU_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuUsage() <em>Cu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuUsage()
	 * @generated
	 * @ordered
	 */
	protected String cuUsage = CU_USAGE_EDEFAULT;

	/**
	 * This is true if the Cu Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cuUsageESet;

	/**
	 * The cached value of the '{@link #getCompatibleUnits() <em>Compatible Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompatibleUnit> compatibleUnits;

	/**
	 * The default value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalDate()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemovalDate() <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalDate()
	 * @generated
	 * @ordered
	 */
	protected String removalDate = REMOVAL_DATE_EDEFAULT;

	/**
	 * This is true if the Removal Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean removalDateESet;

	/**
	 * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkTask> workTasks;

	/**
	 * The default value of the '{@link #getCuAction() <em>Cu Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAction()
	 * @generated
	 * @ordered
	 */
	protected static final WorkActionKind CU_ACTION_EDEFAULT = WorkActionKind.INSTALL;

	/**
	 * The cached value of the '{@link #getCuAction() <em>Cu Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAction()
	 * @generated
	 * @ordered
	 */
	protected WorkActionKind cuAction = CU_ACTION_EDEFAULT;

	/**
	 * This is true if the Cu Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cuActionESet;

	/**
	 * The default value of the '{@link #getCuAccount() <em>Cu Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String CU_ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuAccount() <em>Cu Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuAccount()
	 * @generated
	 * @ordered
	 */
	protected String cuAccount = CU_ACCOUNT_EDEFAULT;

	/**
	 * This is true if the Cu Account attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cuAccountESet;

	/**
	 * The default value of the '{@link #getCuQuantity() <em>Cu Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CU_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCuQuantity() <em>Cu Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cuQuantity = CU_QUANTITY_EDEFAULT;

	/**
	 * This is true if the Cu Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cuQuantityESet;

	/**
	 * The cached value of the '{@link #getDesigns() <em>Designs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Design> designs;

	/**
	 * The cached value of the '{@link #getCUGroups() <em>CU Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CUGroup> cuGroups;

	/**
	 * The cached value of the '{@link #getDesignLocation() <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocation()
	 * @generated
	 * @ordered
	 */
	protected DesignLocation designLocation;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignLocationCU() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.DESIGN_LOCATION_CU;
	}

	/**
	 * Returns the value of the '<em><b>Condition Factors</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.ConditionFactor}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Factors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Factors</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.ConditionFactor#getDesignLocationCUs
	 * @generated
	 */
	public EList<ConditionFactor> getConditionFactors() {
		if (conditionFactors == null) {
			conditionFactors = new BasicInternalEList<ConditionFactor>(ConditionFactor.class);
		}
		return conditionFactors;
	}

	/**
	 * Returns the value of the '<em><b>Energization Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energization Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energization Flag</em>' attribute.
	 * @see #isSetEnergizationFlag()
	 * @see #unsetEnergizationFlag()
	 * @see #setEnergizationFlag(boolean)
	 * @generated
	 */
	public boolean isEnergizationFlag() {
		return energizationFlag;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energization Flag</em>' attribute.
	 * @see #isSetEnergizationFlag()
	 * @see #unsetEnergizationFlag()
	 * @see #isEnergizationFlag()
	 * @generated
	 */
	public void setEnergizationFlag(boolean newEnergizationFlag) {
		energizationFlag = newEnergizationFlag;
		energizationFlagESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergizationFlag()
	 * @see #isEnergizationFlag()
	 * @see #setEnergizationFlag(boolean)
	 * @generated
	 */
	public void unsetEnergizationFlag() {
		energizationFlag = ENERGIZATION_FLAG_EDEFAULT;
		energizationFlagESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#isEnergizationFlag <em>Energization Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energization Flag</em>' attribute is set.
	 * @see #unsetEnergizationFlag()
	 * @see #isEnergizationFlag()
	 * @see #setEnergizationFlag(boolean)
	 * @generated
	 */
	public boolean isSetEnergizationFlag() {
		return energizationFlagESet;
	}

	/**
	 * Returns the value of the '<em><b>Cu Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Usage</em>' attribute.
	 * @see #isSetCuUsage()
	 * @see #unsetCuUsage()
	 * @see #setCuUsage(String)
	 * @generated
	 */
	public String getCuUsage() {
		return cuUsage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Usage</em>' attribute.
	 * @see #isSetCuUsage()
	 * @see #unsetCuUsage()
	 * @see #getCuUsage()
	 * @generated
	 */
	public void setCuUsage(String newCuUsage) {
		cuUsage = newCuUsage;
		cuUsageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCuUsage()
	 * @see #getCuUsage()
	 * @see #setCuUsage(String)
	 * @generated
	 */
	public void unsetCuUsage() {
		cuUsage = CU_USAGE_EDEFAULT;
		cuUsageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuUsage <em>Cu Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cu Usage</em>' attribute is set.
	 * @see #unsetCuUsage()
	 * @see #getCuUsage()
	 * @see #setCuUsage(String)
	 * @generated
	 */
	public boolean isSetCuUsage() {
		return cuUsageESet;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getDesignLocationCUs
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
	}

	/**
	 * Returns the value of the '<em><b>Removal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removal Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Date</em>' attribute.
	 * @see #isSetRemovalDate()
	 * @see #unsetRemovalDate()
	 * @see #setRemovalDate(String)
	 * @generated
	 */
	public String getRemovalDate() {
		return removalDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Date</em>' attribute.
	 * @see #isSetRemovalDate()
	 * @see #unsetRemovalDate()
	 * @see #getRemovalDate()
	 * @generated
	 */
	public void setRemovalDate(String newRemovalDate) {
		removalDate = newRemovalDate;
		removalDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemovalDate()
	 * @see #getRemovalDate()
	 * @see #setRemovalDate(String)
	 * @generated
	 */
	public void unsetRemovalDate() {
		removalDate = REMOVAL_DATE_EDEFAULT;
		removalDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getRemovalDate <em>Removal Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Removal Date</em>' attribute is set.
	 * @see #unsetRemovalDate()
	 * @see #getRemovalDate()
	 * @see #setRemovalDate(String)
	 * @generated
	 */
	public boolean isSetRemovalDate() {
		return removalDateESet;
	}

	/**
	 * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkTask}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Tasks</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkTask#getDesignLocationCUs
	 * @generated
	 */
	public EList<WorkTask> getWorkTasks() {
		if (workTasks == null) {
			workTasks = new BasicInternalEList<WorkTask>(WorkTask.class);
		}
		return workTasks;
	}

	/**
	 * Returns the value of the '<em><b>Cu Action</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfWork.WorkActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Action</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #isSetCuAction()
	 * @see #unsetCuAction()
	 * @see #setCuAction(WorkActionKind)
	 * @generated
	 */
	public WorkActionKind getCuAction() {
		return cuAction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Action</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkActionKind
	 * @see #isSetCuAction()
	 * @see #unsetCuAction()
	 * @see #getCuAction()
	 * @generated
	 */
	public void setCuAction(WorkActionKind newCuAction) {
		cuAction = newCuAction == null ? CU_ACTION_EDEFAULT : newCuAction;
		cuActionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCuAction()
	 * @see #getCuAction()
	 * @see #setCuAction(WorkActionKind)
	 * @generated
	 */
	public void unsetCuAction() {
		cuAction = CU_ACTION_EDEFAULT;
		cuActionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAction <em>Cu Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cu Action</em>' attribute is set.
	 * @see #unsetCuAction()
	 * @see #getCuAction()
	 * @see #setCuAction(WorkActionKind)
	 * @generated
	 */
	public boolean isSetCuAction() {
		return cuActionESet;
	}

	/**
	 * Returns the value of the '<em><b>Cu Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Account</em>' attribute.
	 * @see #isSetCuAccount()
	 * @see #unsetCuAccount()
	 * @see #setCuAccount(String)
	 * @generated
	 */
	public String getCuAccount() {
		return cuAccount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Account</em>' attribute.
	 * @see #isSetCuAccount()
	 * @see #unsetCuAccount()
	 * @see #getCuAccount()
	 * @generated
	 */
	public void setCuAccount(String newCuAccount) {
		cuAccount = newCuAccount;
		cuAccountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCuAccount()
	 * @see #getCuAccount()
	 * @see #setCuAccount(String)
	 * @generated
	 */
	public void unsetCuAccount() {
		cuAccount = CU_ACCOUNT_EDEFAULT;
		cuAccountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuAccount <em>Cu Account</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cu Account</em>' attribute is set.
	 * @see #unsetCuAccount()
	 * @see #getCuAccount()
	 * @see #setCuAccount(String)
	 * @generated
	 */
	public boolean isSetCuAccount() {
		return cuAccountESet;
	}

	/**
	 * Returns the value of the '<em><b>Cu Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cu Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cu Quantity</em>' attribute.
	 * @see #isSetCuQuantity()
	 * @see #unsetCuQuantity()
	 * @see #setCuQuantity(BigInteger)
	 * @generated
	 */
	public BigInteger getCuQuantity() {
		return cuQuantity;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cu Quantity</em>' attribute.
	 * @see #isSetCuQuantity()
	 * @see #unsetCuQuantity()
	 * @see #getCuQuantity()
	 * @generated
	 */
	public void setCuQuantity(BigInteger newCuQuantity) {
		cuQuantity = newCuQuantity;
		cuQuantityESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCuQuantity()
	 * @see #getCuQuantity()
	 * @see #setCuQuantity(BigInteger)
	 * @generated
	 */
	public void unsetCuQuantity() {
		cuQuantity = CU_QUANTITY_EDEFAULT;
		cuQuantityESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getCuQuantity <em>Cu Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cu Quantity</em>' attribute is set.
	 * @see #unsetCuQuantity()
	 * @see #getCuQuantity()
	 * @see #setCuQuantity(BigInteger)
	 * @generated
	 */
	public boolean isSetCuQuantity() {
		return cuQuantityESet;
	}

	/**
	 * Returns the value of the '<em><b>Designs</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.Design}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs <em>Design Locations CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designs</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.Design#getDesignLocationsCUs
	 * @generated
	 */
	public EList<Design> getDesigns() {
		if (designs == null) {
			designs = new BasicInternalEList<Design>(Design.class);
		}
		return designs;
	}

	/**
	 * Returns the value of the '<em><b>CU Groups</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CUGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Groups</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CUGroup#getDesignLocationCUs
	 * @generated
	 */
	public EList<CUGroup> getCUGroups() {
		if (cuGroups == null) {
			cuGroups = new BasicInternalEList<CUGroup>(CUGroup.class);
		}
		return cuGroups;
	}

	/**
	 * Returns the value of the '<em><b>Design Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs <em>Design Location CUs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Location</em>' reference.
	 * @see #setDesignLocation(DesignLocation)
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getDesignLocationCUs
	 * @generated
	 */
	public DesignLocation getDesignLocation() {
		if (designLocation != null && designLocation.eIsProxy()) {
			InternalEObject oldDesignLocation = (InternalEObject)designLocation;
			designLocation = (DesignLocation)eResolveProxy(oldDesignLocation);
			if (designLocation != oldDesignLocation) {
			}
		}
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignLocation basicGetDesignLocation() {
		return designLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignLocation(DesignLocation newDesignLocation, NotificationChain msgs) {
		DesignLocation oldDesignLocation = designLocation;
		designLocation = newDesignLocation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getDesignLocation <em>Design Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Location</em>' reference.
	 * @see #getDesignLocation()
	 * @generated
	 */
	public void setDesignLocation(DesignLocation newDesignLocation) {
		if (newDesignLocation != designLocation) {
			NotificationChain msgs = null;
			if (designLocation != null)
				msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS, DesignLocation.class, msgs);
			if (newDesignLocation != null)
				msgs = ((InternalEObject)newDesignLocation).eInverseAdd(this, InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS, DesignLocation.class, msgs);
			msgs = basicSetDesignLocation(newDesignLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.DesignLocationCU#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.DESIGN_LOCATION_CU__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.DESIGN_LOCATION_CU__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditionFactors()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkTasks()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesigns()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCUGroups()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				if (designLocation != null)
					msgs = ((InternalEObject)designLocation).eInverseRemove(this, InfWorkPackage.DESIGN_LOCATION__DESIGN_LOCATION_CUS, DesignLocation.class, msgs);
				return basicSetDesignLocation((DesignLocation)otherEnd, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return ((InternalEList<?>)getConditionFactors()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return ((InternalEList<?>)getWorkTasks()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return ((InternalEList<?>)getCUGroups()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				return basicSetDesignLocation(null, msgs);
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				return basicSetStatus(null, msgs);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return getConditionFactors();
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				return isEnergizationFlag();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				return getCuUsage();
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				return getRemovalDate();
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return getWorkTasks();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				return getCuAction();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				return getCuAccount();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				return getCuQuantity();
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return getDesigns();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return getCUGroups();
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				if (resolve) return getDesignLocation();
				return basicGetDesignLocation();
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				return getStatus();
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
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				getConditionFactors().clear();
				getConditionFactors().addAll((Collection<? extends ConditionFactor>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				setEnergizationFlag((Boolean)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				setCuUsage((String)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				setRemovalDate((String)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				getWorkTasks().clear();
				getWorkTasks().addAll((Collection<? extends WorkTask>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				setCuAction((WorkActionKind)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				setCuAccount((String)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				setCuQuantity((BigInteger)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				getDesigns().clear();
				getDesigns().addAll((Collection<? extends Design>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				getCUGroups().clear();
				getCUGroups().addAll((Collection<? extends CUGroup>)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)newValue);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				setStatus((Status)newValue);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				getConditionFactors().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				unsetEnergizationFlag();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				unsetCuUsage();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				unsetRemovalDate();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				getWorkTasks().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				unsetCuAction();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				unsetCuAccount();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				unsetCuQuantity();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				getDesigns().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				getCUGroups().clear();
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				setDesignLocation((DesignLocation)null);
				return;
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				setStatus((Status)null);
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
			case InfWorkPackage.DESIGN_LOCATION_CU__CONDITION_FACTORS:
				return conditionFactors != null && !conditionFactors.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__ENERGIZATION_FLAG:
				return isSetEnergizationFlag();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_USAGE:
				return isSetCuUsage();
			case InfWorkPackage.DESIGN_LOCATION_CU__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__REMOVAL_DATE:
				return isSetRemovalDate();
			case InfWorkPackage.DESIGN_LOCATION_CU__WORK_TASKS:
				return workTasks != null && !workTasks.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACTION:
				return isSetCuAction();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_ACCOUNT:
				return isSetCuAccount();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_QUANTITY:
				return isSetCuQuantity();
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGNS:
				return designs != null && !designs.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__CU_GROUPS:
				return cuGroups != null && !cuGroups.isEmpty();
			case InfWorkPackage.DESIGN_LOCATION_CU__DESIGN_LOCATION:
				return designLocation != null;
			case InfWorkPackage.DESIGN_LOCATION_CU__STATUS:
				return status != null;
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
		result.append(" (energizationFlag: ");
		if (energizationFlagESet) result.append(energizationFlag); else result.append("<unset>");
		result.append(", cuUsage: ");
		if (cuUsageESet) result.append(cuUsage); else result.append("<unset>");
		result.append(", removalDate: ");
		if (removalDateESet) result.append(removalDate); else result.append("<unset>");
		result.append(", cuAction: ");
		if (cuActionESet) result.append(cuAction); else result.append("<unset>");
		result.append(", cuAccount: ");
		if (cuAccountESet) result.append(cuAccount); else result.append("<unset>");
		result.append(", cuQuantity: ");
		if (cuQuantityESet) result.append(cuQuantity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DesignLocationCU
