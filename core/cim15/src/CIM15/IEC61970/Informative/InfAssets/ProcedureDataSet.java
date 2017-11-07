/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Common.Document;
import CIM15.IEC61968.Common.UserAttribute;

import CIM15.IEC61970.Meas.MeasurementValue;

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
 * A representation of the model object '<em><b>Procedure Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProperties <em>Properties</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getTransformerObservations <em>Transformer Observations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getMeasurementValues <em>Measurement Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureDataSet extends Document {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<UserAttribute> properties;

	/**
	 * The cached value of the '{@link #getTransformerObservations() <em>Transformer Observations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerObservation> transformerObservations;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

	/**
	 * The default value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMPLETED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletedDateTime() <em>Completed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date completedDateTime = COMPLETED_DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Completed Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean completedDateTimeESet;

	/**
	 * The cached value of the '{@link #getMeasurementValues() <em>Measurement Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementValue> measurementValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureDataSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getProcedureDataSet();
	}

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Common.UserAttribute}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.UserAttribute#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see CIM15.IEC61968.Common.UserAttribute#getProcedureDataSets
	 * @generated
	 */
	public EList<UserAttribute> getProperties() {
		if (properties == null) {
			properties = new BasicInternalEList<UserAttribute>(UserAttribute.class);
		}
		return properties;
	}

	/**
	 * Returns the value of the '<em><b>Transformer Observations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getProcedureDataSets
	 * @generated
	 */
	public EList<TransformerObservation> getTransformerObservations() {
		if (transformerObservations == null) {
			transformerObservations = new BasicInternalEList<TransformerObservation>(TransformerObservation.class);
		}
		return transformerObservations;
	}

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference.
	 * @see #setProcedure(Procedure)
	 * @see CIM15.IEC61970.Informative.InfAssets.Procedure#getProcedureDataSets
	 * @generated
	 */
	public Procedure getProcedure() {
		if (procedure != null && procedure.eIsProxy()) {
			InternalEObject oldProcedure = (InternalEObject)procedure;
			procedure = (Procedure)eResolveProxy(oldProcedure);
			if (procedure != oldProcedure) {
			}
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure basicGetProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getProcedure <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' reference.
	 * @see #getProcedure()
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Completed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed Date Time</em>' attribute.
	 * @see #isSetCompletedDateTime()
	 * @see #unsetCompletedDateTime()
	 * @see #setCompletedDateTime(Date)
	 * @generated
	 */
	public Date getCompletedDateTime() {
		return completedDateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed Date Time</em>' attribute.
	 * @see #isSetCompletedDateTime()
	 * @see #unsetCompletedDateTime()
	 * @see #getCompletedDateTime()
	 * @generated
	 */
	public void setCompletedDateTime(Date newCompletedDateTime) {
		completedDateTime = newCompletedDateTime;
		completedDateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompletedDateTime()
	 * @see #getCompletedDateTime()
	 * @see #setCompletedDateTime(Date)
	 * @generated
	 */
	public void unsetCompletedDateTime() {
		completedDateTime = COMPLETED_DATE_TIME_EDEFAULT;
		completedDateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ProcedureDataSet#getCompletedDateTime <em>Completed Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Completed Date Time</em>' attribute is set.
	 * @see #unsetCompletedDateTime()
	 * @see #getCompletedDateTime()
	 * @see #setCompletedDateTime(Date)
	 * @generated
	 */
	public boolean isSetCompletedDateTime() {
		return completedDateTimeESet;
	}

	/**
	 * Returns the value of the '<em><b>Measurement Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.MeasurementValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.MeasurementValue#getProcedureDataSets <em>Procedure Data Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Values</em>' reference list.
	 * @see CIM15.IEC61970.Meas.MeasurementValue#getProcedureDataSets
	 * @generated
	 */
	public EList<MeasurementValue> getMeasurementValues() {
		if (measurementValues == null) {
			measurementValues = new BasicInternalEList<MeasurementValue>(MeasurementValue.class);
		}
		return measurementValues;
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerObservations()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				if (procedure != null)
					msgs = ((InternalEObject)procedure).eInverseRemove(this, InfAssetsPackage.PROCEDURE__PROCEDURE_DATA_SETS, Procedure.class, msgs);
				return basicSetProcedure((Procedure)otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurementValues()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return ((InternalEList<?>)getTransformerObservations()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return ((InternalEList<?>)getMeasurementValues()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return getProperties();
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return getTransformerObservations();
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				return getCompletedDateTime();
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return getMeasurementValues();
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends UserAttribute>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				getTransformerObservations().addAll((Collection<? extends TransformerObservation>)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				setCompletedDateTime((Date)newValue);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
				getMeasurementValues().addAll((Collection<? extends MeasurementValue>)newValue);
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				getProperties().clear();
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				getTransformerObservations().clear();
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				unsetCompletedDateTime();
				return;
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				getMeasurementValues().clear();
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
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case InfAssetsPackage.PROCEDURE_DATA_SET__TRANSFORMER_OBSERVATIONS:
				return transformerObservations != null && !transformerObservations.isEmpty();
			case InfAssetsPackage.PROCEDURE_DATA_SET__PROCEDURE:
				return procedure != null;
			case InfAssetsPackage.PROCEDURE_DATA_SET__COMPLETED_DATE_TIME:
				return isSetCompletedDateTime();
			case InfAssetsPackage.PROCEDURE_DATA_SET__MEASUREMENT_VALUES:
				return measurementValues != null && !measurementValues.isEmpty();
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
		result.append(" (completedDateTime: ");
		if (completedDateTimeESet) result.append(completedDateTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ProcedureDataSet
