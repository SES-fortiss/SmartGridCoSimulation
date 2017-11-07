/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestDataSet extends ProcedureDataSet {
	/**
	 * The default value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenToLabDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecimenToLabDateTime() <em>Specimen To Lab Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenToLabDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date specimenToLabDateTime = SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Specimen To Lab Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specimenToLabDateTimeESet;

	/**
	 * The default value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCLUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected String conclusion = CONCLUSION_EDEFAULT;

	/**
	 * This is true if the Conclusion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conclusionESet;

	/**
	 * The default value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenID()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIMEN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecimenID() <em>Specimen ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenID()
	 * @generated
	 * @ordered
	 */
	protected String specimenID = SPECIMEN_ID_EDEFAULT;

	/**
	 * This is true if the Specimen ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specimenIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestDataSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTestDataSet();
	}

	/**
	 * Returns the value of the '<em><b>Specimen To Lab Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen To Lab Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen To Lab Date Time</em>' attribute.
	 * @see #isSetSpecimenToLabDateTime()
	 * @see #unsetSpecimenToLabDateTime()
	 * @see #setSpecimenToLabDateTime(Date)
	 * @generated
	 */
	public Date getSpecimenToLabDateTime() {
		return specimenToLabDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen To Lab Date Time</em>' attribute.
	 * @see #isSetSpecimenToLabDateTime()
	 * @see #unsetSpecimenToLabDateTime()
	 * @see #getSpecimenToLabDateTime()
	 * @generated
	 */
	public void setSpecimenToLabDateTime(Date newSpecimenToLabDateTime) {
		specimenToLabDateTime = newSpecimenToLabDateTime;
		specimenToLabDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecimenToLabDateTime()
	 * @see #getSpecimenToLabDateTime()
	 * @see #setSpecimenToLabDateTime(Date)
	 * @generated
	 */
	public void unsetSpecimenToLabDateTime() {
		specimenToLabDateTime = SPECIMEN_TO_LAB_DATE_TIME_EDEFAULT;
		specimenToLabDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenToLabDateTime <em>Specimen To Lab Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specimen To Lab Date Time</em>' attribute is set.
	 * @see #unsetSpecimenToLabDateTime()
	 * @see #getSpecimenToLabDateTime()
	 * @see #setSpecimenToLabDateTime(Date)
	 * @generated
	 */
	public boolean isSetSpecimenToLabDateTime() {
		return specimenToLabDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conclusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion</em>' attribute.
	 * @see #isSetConclusion()
	 * @see #unsetConclusion()
	 * @see #setConclusion(String)
	 * @generated
	 */
	public String getConclusion() {
		return conclusion;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' attribute.
	 * @see #isSetConclusion()
	 * @see #unsetConclusion()
	 * @see #getConclusion()
	 * @generated
	 */
	public void setConclusion(String newConclusion) {
		conclusion = newConclusion;
		conclusionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConclusion()
	 * @see #getConclusion()
	 * @see #setConclusion(String)
	 * @generated
	 */
	public void unsetConclusion() {
		conclusion = CONCLUSION_EDEFAULT;
		conclusionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getConclusion <em>Conclusion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conclusion</em>' attribute is set.
	 * @see #unsetConclusion()
	 * @see #getConclusion()
	 * @see #setConclusion(String)
	 * @generated
	 */
	public boolean isSetConclusion() {
		return conclusionESet;
	}

	/**
	 * Returns the value of the '<em><b>Specimen ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen ID</em>' attribute.
	 * @see #isSetSpecimenID()
	 * @see #unsetSpecimenID()
	 * @see #setSpecimenID(String)
	 * @generated
	 */
	public String getSpecimenID() {
		return specimenID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen ID</em>' attribute.
	 * @see #isSetSpecimenID()
	 * @see #unsetSpecimenID()
	 * @see #getSpecimenID()
	 * @generated
	 */
	public void setSpecimenID(String newSpecimenID) {
		specimenID = newSpecimenID;
		specimenIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecimenID()
	 * @see #getSpecimenID()
	 * @see #setSpecimenID(String)
	 * @generated
	 */
	public void unsetSpecimenID() {
		specimenID = SPECIMEN_ID_EDEFAULT;
		specimenIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.TestDataSet#getSpecimenID <em>Specimen ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specimen ID</em>' attribute is set.
	 * @see #unsetSpecimenID()
	 * @see #getSpecimenID()
	 * @see #setSpecimenID(String)
	 * @generated
	 */
	public boolean isSetSpecimenID() {
		return specimenIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				return getSpecimenToLabDateTime();
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				return getConclusion();
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				return getSpecimenID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				setSpecimenToLabDateTime((Date)newValue);
				return;
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				setConclusion((String)newValue);
				return;
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				setSpecimenID((String)newValue);
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
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				unsetSpecimenToLabDateTime();
				return;
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				unsetConclusion();
				return;
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				unsetSpecimenID();
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
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_TO_LAB_DATE_TIME:
				return isSetSpecimenToLabDateTime();
			case InfAssetsPackage.TEST_DATA_SET__CONCLUSION:
				return isSetConclusion();
			case InfAssetsPackage.TEST_DATA_SET__SPECIMEN_ID:
				return isSetSpecimenID();
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
		result.append(" (specimenToLabDateTime: ");
		if (specimenToLabDateTimeESet) result.append(specimenToLabDateTime); else result.append("<unset>");
		result.append(", conclusion: ");
		if (conclusionESet) result.append(conclusion); else result.append("<unset>");
		result.append(", specimenID: ");
		if (specimenIDESet) result.append(specimenID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TestDataSet
