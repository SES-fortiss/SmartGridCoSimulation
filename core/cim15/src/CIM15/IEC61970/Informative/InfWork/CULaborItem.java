/**
 */
package CIM15.IEC61970.Informative.InfWork;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CU Labor Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getCompatibleUnits <em>Compatible Units</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode <em>CU Labor Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CULaborItem extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getLaborDuration() <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float LABOR_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLaborDuration() <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborDuration()
	 * @generated
	 * @ordered
	 */
	protected float laborDuration = LABOR_DURATION_EDEFAULT;

	/**
	 * This is true if the Labor Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean laborDurationESet;

	/**
	 * The default value of the '{@link #getLaborRate() <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborRate()
	 * @generated
	 * @ordered
	 */
	protected static final float LABOR_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLaborRate() <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborRate()
	 * @generated
	 * @ordered
	 */
	protected float laborRate = LABOR_RATE_EDEFAULT;

	/**
	 * This is true if the Labor Rate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean laborRateESet;

	/**
	 * The default value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityCode() <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCode()
	 * @generated
	 * @ordered
	 */
	protected String activityCode = ACTIVITY_CODE_EDEFAULT;

	/**
	 * This is true if the Activity Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityCodeESet;

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
	 * The cached value of the '{@link #getCULaborCode() <em>CU Labor Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCULaborCode()
	 * @generated
	 * @ordered
	 */
	protected CULaborCode cuLaborCode;

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
	 * The cached value of the '{@link #getQualificationRequirements() <em>Qualification Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<QualificationRequirement> qualificationRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CULaborItem() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.CU_LABOR_ITEM;
	}

	/**
	 * Returns the value of the '<em><b>Labor Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Duration</em>' attribute.
	 * @see #isSetLaborDuration()
	 * @see #unsetLaborDuration()
	 * @see #setLaborDuration(float)
	 * @generated
	 */
	public float getLaborDuration() {
		return laborDuration;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labor Duration</em>' attribute.
	 * @see #isSetLaborDuration()
	 * @see #unsetLaborDuration()
	 * @see #getLaborDuration()
	 * @generated
	 */
	public void setLaborDuration(float newLaborDuration) {
		laborDuration = newLaborDuration;
		laborDurationESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLaborDuration()
	 * @see #getLaborDuration()
	 * @see #setLaborDuration(float)
	 * @generated
	 */
	public void unsetLaborDuration() {
		laborDuration = LABOR_DURATION_EDEFAULT;
		laborDurationESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborDuration <em>Labor Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Labor Duration</em>' attribute is set.
	 * @see #unsetLaborDuration()
	 * @see #getLaborDuration()
	 * @see #setLaborDuration(float)
	 * @generated
	 */
	public boolean isSetLaborDuration() {
		return laborDurationESet;
	}

	/**
	 * Returns the value of the '<em><b>Labor Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labor Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labor Rate</em>' attribute.
	 * @see #isSetLaborRate()
	 * @see #unsetLaborRate()
	 * @see #setLaborRate(float)
	 * @generated
	 */
	public float getLaborRate() {
		return laborRate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labor Rate</em>' attribute.
	 * @see #isSetLaborRate()
	 * @see #unsetLaborRate()
	 * @see #getLaborRate()
	 * @generated
	 */
	public void setLaborRate(float newLaborRate) {
		laborRate = newLaborRate;
		laborRateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLaborRate()
	 * @see #getLaborRate()
	 * @see #setLaborRate(float)
	 * @generated
	 */
	public void unsetLaborRate() {
		laborRate = LABOR_RATE_EDEFAULT;
		laborRateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getLaborRate <em>Labor Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Labor Rate</em>' attribute is set.
	 * @see #unsetLaborRate()
	 * @see #getLaborRate()
	 * @see #setLaborRate(float)
	 * @generated
	 */
	public boolean isSetLaborRate() {
		return laborRateESet;
	}

	/**
	 * Returns the value of the '<em><b>Activity Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Code</em>' attribute.
	 * @see #isSetActivityCode()
	 * @see #unsetActivityCode()
	 * @see #setActivityCode(String)
	 * @generated
	 */
	public String getActivityCode() {
		return activityCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Code</em>' attribute.
	 * @see #isSetActivityCode()
	 * @see #unsetActivityCode()
	 * @see #getActivityCode()
	 * @generated
	 */
	public void setActivityCode(String newActivityCode) {
		activityCode = newActivityCode;
		activityCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivityCode()
	 * @see #getActivityCode()
	 * @see #setActivityCode(String)
	 * @generated
	 */
	public void unsetActivityCode() {
		activityCode = ACTIVITY_CODE_EDEFAULT;
		activityCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getActivityCode <em>Activity Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activity Code</em>' attribute is set.
	 * @see #unsetActivityCode()
	 * @see #getActivityCode()
	 * @see #setActivityCode(String)
	 * @generated
	 */
	public boolean isSetActivityCode() {
		return activityCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>Compatible Units</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Units</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.CompatibleUnit#getCULaborItems
	 * @generated
	 */
	public EList<CompatibleUnit> getCompatibleUnits() {
		if (compatibleUnits == null) {
			compatibleUnits = new BasicInternalEList<CompatibleUnit>(CompatibleUnit.class);
		}
		return compatibleUnits;
	}

	/**
	 * Returns the value of the '<em><b>CU Labor Code</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CU Labor Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CU Labor Code</em>' reference.
	 * @see #setCULaborCode(CULaborCode)
	 * @see CIM15.IEC61970.Informative.InfWork.CULaborCode#getCULaborItems
	 * @generated
	 */
	public CULaborCode getCULaborCode() {
		if (cuLaborCode != null && cuLaborCode.eIsProxy()) {
			InternalEObject oldCULaborCode = (InternalEObject)cuLaborCode;
			cuLaborCode = (CULaborCode)eResolveProxy(oldCULaborCode);
			if (cuLaborCode != oldCULaborCode) {
			}
		}
		return cuLaborCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CULaborCode basicGetCULaborCode() {
		return cuLaborCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCULaborCode(CULaborCode newCULaborCode, NotificationChain msgs) {
		CULaborCode oldCULaborCode = cuLaborCode;
		cuLaborCode = newCULaborCode;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getCULaborCode <em>CU Labor Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Labor Code</em>' reference.
	 * @see #getCULaborCode()
	 * @generated
	 */
	public void setCULaborCode(CULaborCode newCULaborCode) {
		if (newCULaborCode != cuLaborCode) {
			NotificationChain msgs = null;
			if (cuLaborCode != null)
				msgs = ((InternalEObject)cuLaborCode).eInverseRemove(this, InfWorkPackage.CU_LABOR_CODE__CU_LABOR_ITEMS, CULaborCode.class, msgs);
			if (newCULaborCode != null)
				msgs = ((InternalEObject)newCULaborCode).eInverseAdd(this, InfWorkPackage.CU_LABOR_CODE__CU_LABOR_ITEMS, CULaborCode.class, msgs);
			msgs = basicSetCULaborCode(newCULaborCode, msgs);
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.CULaborItem#getStatus <em>Status</em>}' containment reference.
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_LABOR_ITEM__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfWorkPackage.CU_LABOR_ITEM__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems <em>CU Labor Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getCULaborItems
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new BasicInternalEList<QualificationRequirement>(QualificationRequirement.class);
		}
		return qualificationRequirements;
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
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompatibleUnits()).basicAdd(otherEnd, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				if (cuLaborCode != null)
					msgs = ((InternalEObject)cuLaborCode).eInverseRemove(this, InfWorkPackage.CU_LABOR_CODE__CU_LABOR_ITEMS, CULaborCode.class, msgs);
				return basicSetCULaborCode((CULaborCode)otherEnd, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualificationRequirements()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return ((InternalEList<?>)getCompatibleUnits()).basicRemove(otherEnd, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				return basicSetCULaborCode(null, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				return basicSetStatus(null, msgs);
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				return getLaborDuration();
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				return getLaborRate();
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				return getActivityCode();
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return getCompatibleUnits();
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				if (resolve) return getCULaborCode();
				return basicGetCULaborCode();
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				return getStatus();
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
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
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				setLaborDuration((Float)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				setLaborRate((Float)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				setActivityCode((String)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				getCompatibleUnits().addAll((Collection<? extends CompatibleUnit>)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				setCULaborCode((CULaborCode)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				setStatus((Status)newValue);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
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
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				unsetLaborDuration();
				return;
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				unsetLaborRate();
				return;
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				unsetActivityCode();
				return;
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				getCompatibleUnits().clear();
				return;
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				setCULaborCode((CULaborCode)null);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				setStatus((Status)null);
				return;
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
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
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_DURATION:
				return isSetLaborDuration();
			case InfWorkPackage.CU_LABOR_ITEM__LABOR_RATE:
				return isSetLaborRate();
			case InfWorkPackage.CU_LABOR_ITEM__ACTIVITY_CODE:
				return isSetActivityCode();
			case InfWorkPackage.CU_LABOR_ITEM__COMPATIBLE_UNITS:
				return compatibleUnits != null && !compatibleUnits.isEmpty();
			case InfWorkPackage.CU_LABOR_ITEM__CU_LABOR_CODE:
				return cuLaborCode != null;
			case InfWorkPackage.CU_LABOR_ITEM__STATUS:
				return status != null;
			case InfWorkPackage.CU_LABOR_ITEM__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
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
		result.append(" (laborDuration: ");
		if (laborDurationESet) result.append(laborDuration); else result.append("<unset>");
		result.append(", laborRate: ");
		if (laborRateESet) result.append(laborRate); else result.append("<unset>");
		result.append(", activityCode: ");
		if (activityCodeESet) result.append(activityCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // CULaborItem
