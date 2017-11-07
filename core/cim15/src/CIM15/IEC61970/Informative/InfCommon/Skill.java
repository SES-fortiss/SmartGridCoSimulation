/**
 */
package CIM15.IEC61970.Informative.InfCommon;

import CIM15.IEC61968.Common.Document;

import CIM15.IEC61970.Domain.DateTimeInterval;

import CIM15.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM15.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM15.IEC61970.Informative.InfWork.QualificationRequirement;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Skill#getCrafts <em>Crafts</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Skill#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Skill#getErpPerson <em>Erp Person</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Skill#getLevel <em>Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Skill#getQualificationRequirements <em>Qualification Requirements</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.Skill#getCertificationPeriod <em>Certification Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Skill extends Document {
	/**
	 * The cached value of the '{@link #getCrafts() <em>Crafts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Craft> crafts;

	/**
	 * The default value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDateTime() <em>Effective Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date effectiveDateTime = EFFECTIVE_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Effective Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectiveDateTimeESet;

	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final SkillLevelKind LEVEL_EDEFAULT = SkillLevelKind.APPRENTICE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected SkillLevelKind level = LEVEL_EDEFAULT;

	/**
	 * This is true if the Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelESet;

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
	 * The cached value of the '{@link #getCertificationPeriod() <em>Certification Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificationPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval certificationPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Skill() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.SKILL;
	}

	/**
	 * Returns the value of the '<em><b>Crafts</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfCommon.Craft}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCommon.Craft#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crafts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crafts</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfCommon.Craft#getSkills
	 * @generated
	 */
	public EList<Craft> getCrafts() {
		if (crafts == null) {
			crafts = new BasicInternalEList<Craft>(Craft.class);
		}
		return crafts;
	}

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' attribute.
	 * @see #isSetEffectiveDateTime()
	 * @see #unsetEffectiveDateTime()
	 * @see #setEffectiveDateTime(Date)
	 * @generated
	 */
	public Date getEffectiveDateTime() {
		return effectiveDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' attribute.
	 * @see #isSetEffectiveDateTime()
	 * @see #unsetEffectiveDateTime()
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	public void setEffectiveDateTime(Date newEffectiveDateTime) {
		effectiveDateTime = newEffectiveDateTime;
		effectiveDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffectiveDateTime()
	 * @see #getEffectiveDateTime()
	 * @see #setEffectiveDateTime(Date)
	 * @generated
	 */
	public void unsetEffectiveDateTime() {
		effectiveDateTime = EFFECTIVE_DATE_TIME_EDEFAULT;
		effectiveDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getEffectiveDateTime <em>Effective Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effective Date Time</em>' attribute is set.
	 * @see #unsetEffectiveDateTime()
	 * @see #getEffectiveDateTime()
	 * @see #setEffectiveDateTime(Date)
	 * @generated
	 */
	public boolean isSetEffectiveDateTime() {
		return effectiveDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Erp Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erp Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erp Person</em>' reference.
	 * @see #setErpPerson(ErpPerson)
	 * @see CIM15.IEC61970.Informative.InfERPSupport.ErpPerson#getSkills
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getErpPerson <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erp Person</em>' reference.
	 * @see #getErpPerson()
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SKILLS, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__SKILLS, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfCommon.SkillLevelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfCommon.SkillLevelKind
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #setLevel(SkillLevelKind)
	 * @generated
	 */
	public SkillLevelKind getLevel() {
		return level;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfCommon.SkillLevelKind
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @generated
	 */
	public void setLevel(SkillLevelKind newLevel) {
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		levelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevel()
	 * @see #getLevel()
	 * @see #setLevel(SkillLevelKind)
	 * @generated
	 */
	public void unsetLevel() {
		level = LEVEL_EDEFAULT;
		levelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getLevel <em>Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level</em>' attribute is set.
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @see #setLevel(SkillLevelKind)
	 * @generated
	 */
	public boolean isSetLevel() {
		return levelESet;
	}

	/**
	 * Returns the value of the '<em><b>Qualification Requirements</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification Requirements</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.QualificationRequirement#getSkills
	 * @generated
	 */
	public EList<QualificationRequirement> getQualificationRequirements() {
		if (qualificationRequirements == null) {
			qualificationRequirements = new BasicInternalEList<QualificationRequirement>(QualificationRequirement.class);
		}
		return qualificationRequirements;
	}

	/**
	 * Returns the value of the '<em><b>Certification Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certification Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certification Period</em>' containment reference.
	 * @see #setCertificationPeriod(DateTimeInterval)
	 * @generated
	 */
	public DateTimeInterval getCertificationPeriod() {
		return certificationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificationPeriod(DateTimeInterval newCertificationPeriod, NotificationChain msgs) {
		DateTimeInterval oldCertificationPeriod = certificationPeriod;
		certificationPeriod = newCertificationPeriod;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.Skill#getCertificationPeriod <em>Certification Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certification Period</em>' containment reference.
	 * @see #getCertificationPeriod()
	 * @generated
	 */
	public void setCertificationPeriod(DateTimeInterval newCertificationPeriod) {
		if (newCertificationPeriod != certificationPeriod) {
			NotificationChain msgs = null;
			if (certificationPeriod != null)
				msgs = ((InternalEObject)certificationPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SKILL__CERTIFICATION_PERIOD, null, msgs);
			if (newCertificationPeriod != null)
				msgs = ((InternalEObject)newCertificationPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfCommonPackage.SKILL__CERTIFICATION_PERIOD, null, msgs);
			msgs = basicSetCertificationPeriod(newCertificationPeriod, msgs);
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
			case InfCommonPackage.SKILL__CRAFTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCrafts()).basicAdd(otherEnd, msgs);
			case InfCommonPackage.SKILL__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SKILLS, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
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
			case InfCommonPackage.SKILL__CRAFTS:
				return ((InternalEList<?>)getCrafts()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.SKILL__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				return ((InternalEList<?>)getQualificationRequirements()).basicRemove(otherEnd, msgs);
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				return basicSetCertificationPeriod(null, msgs);
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
			case InfCommonPackage.SKILL__CRAFTS:
				return getCrafts();
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				return getEffectiveDateTime();
			case InfCommonPackage.SKILL__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
			case InfCommonPackage.SKILL__LEVEL:
				return getLevel();
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				return getQualificationRequirements();
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				return getCertificationPeriod();
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
			case InfCommonPackage.SKILL__CRAFTS:
				getCrafts().clear();
				getCrafts().addAll((Collection<? extends Craft>)newValue);
				return;
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				setEffectiveDateTime((Date)newValue);
				return;
			case InfCommonPackage.SKILL__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
				return;
			case InfCommonPackage.SKILL__LEVEL:
				setLevel((SkillLevelKind)newValue);
				return;
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				getQualificationRequirements().addAll((Collection<? extends QualificationRequirement>)newValue);
				return;
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				setCertificationPeriod((DateTimeInterval)newValue);
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
			case InfCommonPackage.SKILL__CRAFTS:
				getCrafts().clear();
				return;
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				unsetEffectiveDateTime();
				return;
			case InfCommonPackage.SKILL__ERP_PERSON:
				setErpPerson((ErpPerson)null);
				return;
			case InfCommonPackage.SKILL__LEVEL:
				unsetLevel();
				return;
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				getQualificationRequirements().clear();
				return;
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				setCertificationPeriod((DateTimeInterval)null);
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
			case InfCommonPackage.SKILL__CRAFTS:
				return crafts != null && !crafts.isEmpty();
			case InfCommonPackage.SKILL__EFFECTIVE_DATE_TIME:
				return isSetEffectiveDateTime();
			case InfCommonPackage.SKILL__ERP_PERSON:
				return erpPerson != null;
			case InfCommonPackage.SKILL__LEVEL:
				return isSetLevel();
			case InfCommonPackage.SKILL__QUALIFICATION_REQUIREMENTS:
				return qualificationRequirements != null && !qualificationRequirements.isEmpty();
			case InfCommonPackage.SKILL__CERTIFICATION_PERIOD:
				return certificationPeriod != null;
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
		result.append(" (effectiveDateTime: ");
		if (effectiveDateTimeESet) result.append(effectiveDateTime); else result.append("<unset>");
		result.append(", level: ");
		if (levelESet) result.append(level); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Skill
