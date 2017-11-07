/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getErpJournalEntries <em>Erp Journal Entries</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getChildCostTypes <em>Child Cost Types</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getWorkCostDetails <em>Work Cost Details</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#isAmountAssignable <em>Amount Assignable</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CostType#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostType extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final String STAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected String stage = STAGE_EDEFAULT;

	/**
	 * This is true if the Stage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stageESet;

	/**
	 * The cached value of the '{@link #getErpJournalEntries() <em>Erp Journal Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpJournalEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpJournalEntry> erpJournalEntries;

	/**
	 * The cached value of the '{@link #getParentCostType() <em>Parent Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCostType()
	 * @generated
	 * @ordered
	 */
	protected CostType parentCostType;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet;

	/**
	 * The cached value of the '{@link #getChildCostTypes() <em>Child Cost Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildCostTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CostType> childCostTypes;

	/**
	 * The cached value of the '{@link #getWorkCostDetails() <em>Work Cost Details</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkCostDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkCostDetail> workCostDetails;

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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * This is true if the Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelESet;

	/**
	 * The default value of the '{@link #isAmountAssignable() <em>Amount Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAmountAssignable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AMOUNT_ASSIGNABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAmountAssignable() <em>Amount Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAmountAssignable()
	 * @generated
	 * @ordered
	 */
	protected boolean amountAssignable = AMOUNT_ASSIGNABLE_EDEFAULT;

	/**
	 * This is true if the Amount Assignable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean amountAssignableESet;

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
	protected CostType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.COST_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #setStage(String)
	 * @generated
	 */
	public String getStage() {
		return stage;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see #isSetStage()
	 * @see #unsetStage()
	 * @see #getStage()
	 * @generated
	 */
	public void setStage(String newStage) {
		stage = newStage;
		stageESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStage()
	 * @see #getStage()
	 * @see #setStage(String)
	 * @generated
	 */
	public void unsetStage() {
		stage = STAGE_EDEFAULT;
		stageESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getStage <em>Stage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stage</em>' attribute is set.
	 * @see #unsetStage()
	 * @see #getStage()
	 * @see #setStage(String)
	 * @generated
	 */
	public boolean isSetStage() {
		return stageESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Journal Entries</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes <em>Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Journal Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Journal Entries</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpJournalEntry#getCostTypes
	 * @generated
	 */
	public EList<ErpJournalEntry> getErpJournalEntries() {
		if (erpJournalEntries == null) {
			erpJournalEntries = new BasicInternalEList<ErpJournalEntry>(ErpJournalEntry.class);
		}
		return erpJournalEntries;
	}

	/**
	 * Returns the value of the '<em><b>Parent Cost Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CostType#getChildCostTypes <em>Child Cost Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Cost Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Cost Type</em>' reference.
	 * @see #setParentCostType(CostType)
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getChildCostTypes
	 * @generated
	 */
	public CostType getParentCostType() {
		if (parentCostType != null && parentCostType.eIsProxy()) {
			InternalEObject oldParentCostType = (InternalEObject)parentCostType;
			parentCostType = (CostType)eResolveProxy(oldParentCostType);
			if (parentCostType != oldParentCostType) {
			}
		}
		return parentCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostType basicGetParentCostType() {
		return parentCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCostType(CostType newParentCostType, NotificationChain msgs) {
		CostType oldParentCostType = parentCostType;
		parentCostType = newParentCostType;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Cost Type</em>' reference.
	 * @see #getParentCostType()
	 * @generated
	 */
	public void setParentCostType(CostType newParentCostType) {
		if (newParentCostType != parentCostType) {
			NotificationChain msgs = null;
			if (parentCostType != null)
				msgs = ((InternalEObject)parentCostType).eInverseRemove(this, InfWorkPackage.COST_TYPE__CHILD_COST_TYPES, CostType.class, msgs);
			if (newParentCostType != null)
				msgs = ((InternalEObject)newParentCostType).eInverseAdd(this, InfWorkPackage.COST_TYPE__CHILD_COST_TYPES, CostType.class, msgs);
			msgs = basicSetParentCostType(newParentCostType, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	public void setCode(String newCode) {
		code = newCode;
		codeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public void unsetCode() {
		code = CODE_EDEFAULT;
		codeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * Returns the value of the '<em><b>Child Cost Types</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CostType}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CostType#getParentCostType <em>Parent Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Cost Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Cost Types</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CostType#getParentCostType
	 * @generated
	 */
	public EList<CostType> getChildCostTypes() {
		if (childCostTypes == null) {
			childCostTypes = new BasicInternalEList<CostType>(CostType.class);
		}
		return childCostTypes;
	}

	/**
	 * Returns the value of the '<em><b>Work Cost Details</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Cost Details</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Cost Details</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.WorkCostDetail#getCostType
	 * @generated
	 */
	public EList<WorkCostDetail> getWorkCostDetails() {
		if (workCostDetails == null) {
			workCostDetails = new BasicInternalEList<WorkCostDetail>(WorkCostDetail.class);
		}
		return workCostDetails;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCostType <em>Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCostType
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
	}

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #setLevel(String)
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @generated
	 */
	public void setLevel(String newLevel) {
		level = newLevel;
		levelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevel()
	 * @see #getLevel()
	 * @see #setLevel(String)
	 * @generated
	 */
	public void unsetLevel() {
		level = LEVEL_EDEFAULT;
		levelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getLevel <em>Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level</em>' attribute is set.
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @see #setLevel(String)
	 * @generated
	 */
	public boolean isSetLevel() {
		return levelESet;
	}

	/**
	 * Returns the value of the '<em><b>Amount Assignable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Assignable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Assignable</em>' attribute.
	 * @see #isSetAmountAssignable()
	 * @see #unsetAmountAssignable()
	 * @see #setAmountAssignable(boolean)
	 * @generated
	 */
	public boolean isAmountAssignable() {
		return amountAssignable;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#isAmountAssignable <em>Amount Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Assignable</em>' attribute.
	 * @see #isSetAmountAssignable()
	 * @see #unsetAmountAssignable()
	 * @see #isAmountAssignable()
	 * @generated
	 */
	public void setAmountAssignable(boolean newAmountAssignable) {
		amountAssignable = newAmountAssignable;
		amountAssignableESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#isAmountAssignable <em>Amount Assignable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmountAssignable()
	 * @see #isAmountAssignable()
	 * @see #setAmountAssignable(boolean)
	 * @generated
	 */
	public void unsetAmountAssignable() {
		amountAssignable = AMOUNT_ASSIGNABLE_EDEFAULT;
		amountAssignableESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#isAmountAssignable <em>Amount Assignable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amount Assignable</em>' attribute is set.
	 * @see #unsetAmountAssignable()
	 * @see #isAmountAssignable()
	 * @see #setAmountAssignable(boolean)
	 * @generated
	 */
	public boolean isSetAmountAssignable() {
		return amountAssignableESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CostType#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.COST_TYPE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.COST_TYPE__STATUS, null, msgs);
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
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpJournalEntries()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				if (parentCostType != null)
					msgs = ((InternalEObject)parentCostType).eInverseRemove(this, InfWorkPackage.COST_TYPE__CHILD_COST_TYPES, CostType.class, msgs);
				return basicSetParentCostType((CostType)otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildCostTypes()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkCostDetails()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return ((InternalEList<?>)getErpJournalEntries()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				return basicSetParentCostType(null, msgs);
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return ((InternalEList<?>)getChildCostTypes()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return ((InternalEList<?>)getWorkCostDetails()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.COST_TYPE__STATUS:
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
			case InfWorkPackage.COST_TYPE__STAGE:
				return getStage();
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return getErpJournalEntries();
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				if (resolve) return getParentCostType();
				return basicGetParentCostType();
			case InfWorkPackage.COST_TYPE__CODE:
				return getCode();
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return getChildCostTypes();
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return getWorkCostDetails();
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.COST_TYPE__LEVEL:
				return getLevel();
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNABLE:
				return isAmountAssignable();
			case InfWorkPackage.COST_TYPE__STATUS:
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
			case InfWorkPackage.COST_TYPE__STAGE:
				setStage((String)newValue);
				return;
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				getErpJournalEntries().addAll((Collection<? extends ErpJournalEntry>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				setParentCostType((CostType)newValue);
				return;
			case InfWorkPackage.COST_TYPE__CODE:
				setCode((String)newValue);
				return;
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				getChildCostTypes().clear();
				getChildCostTypes().addAll((Collection<? extends CostType>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				getWorkCostDetails().addAll((Collection<? extends WorkCostDetail>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.COST_TYPE__LEVEL:
				setLevel((String)newValue);
				return;
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNABLE:
				setAmountAssignable((Boolean)newValue);
				return;
			case InfWorkPackage.COST_TYPE__STATUS:
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
			case InfWorkPackage.COST_TYPE__STAGE:
				unsetStage();
				return;
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				getErpJournalEntries().clear();
				return;
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				setParentCostType((CostType)null);
				return;
			case InfWorkPackage.COST_TYPE__CODE:
				unsetCode();
				return;
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				getChildCostTypes().clear();
				return;
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				getWorkCostDetails().clear();
				return;
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.COST_TYPE__LEVEL:
				unsetLevel();
				return;
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNABLE:
				unsetAmountAssignable();
				return;
			case InfWorkPackage.COST_TYPE__STATUS:
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
			case InfWorkPackage.COST_TYPE__STAGE:
				return isSetStage();
			case InfWorkPackage.COST_TYPE__ERP_JOURNAL_ENTRIES:
				return erpJournalEntries != null && !erpJournalEntries.isEmpty();
			case InfWorkPackage.COST_TYPE__PARENT_COST_TYPE:
				return parentCostType != null;
			case InfWorkPackage.COST_TYPE__CODE:
				return isSetCode();
			case InfWorkPackage.COST_TYPE__CHILD_COST_TYPES:
				return childCostTypes != null && !childCostTypes.isEmpty();
			case InfWorkPackage.COST_TYPE__WORK_COST_DETAILS:
				return workCostDetails != null && !workCostDetails.isEmpty();
			case InfWorkPackage.COST_TYPE__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.COST_TYPE__LEVEL:
				return isSetLevel();
			case InfWorkPackage.COST_TYPE__AMOUNT_ASSIGNABLE:
				return isSetAmountAssignable();
			case InfWorkPackage.COST_TYPE__STATUS:
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
		result.append(" (stage: ");
		if (stageESet) result.append(stage); else result.append("<unset>");
		result.append(", code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", level: ");
		if (levelESet) result.append(level); else result.append("<unset>");
		result.append(", amountAssignable: ");
		if (amountAssignableESet) result.append(amountAssignable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CostType
