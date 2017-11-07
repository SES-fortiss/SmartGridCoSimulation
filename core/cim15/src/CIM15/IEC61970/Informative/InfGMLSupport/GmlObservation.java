/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import CIM15.Element;

import CIM15.IEC61970.Informative.InfOperations.ChangeItem;

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
 * A representation of the model object '<em><b>Gml Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlDiagramObjects <em>Gml Diagram Objects</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getChangeItems <em>Change Items</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getGmlValues <em>Gml Values</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlObservation extends Element {
	/**
	 * The default value of the '{@link #getResultOf() <em>Result Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOf()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultOf() <em>Result Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOf()
	 * @generated
	 * @ordered
	 */
	protected String resultOf = RESULT_OF_EDEFAULT;

	/**
	 * This is true if the Result Of attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultOfESet;

	/**
	 * The cached value of the '{@link #getGmlDiagramObjects() <em>Gml Diagram Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlDiagramObject> gmlDiagramObjects;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * This is true if the Target attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetESet;

	/**
	 * The cached value of the '{@link #getChangeItems() <em>Change Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeItem> changeItems;

	/**
	 * The default value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected static final String USING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected String using = USING_EDEFAULT;

	/**
	 * This is true if the Using attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usingESet;

	/**
	 * The cached value of the '{@link #getGmlValues() <em>Gml Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlValues()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlValue> gmlValues;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * This is true if the Date Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlObservation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_OBSERVATION;
	}

	/**
	 * Returns the value of the '<em><b>Result Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of</em>' attribute.
	 * @see #isSetResultOf()
	 * @see #unsetResultOf()
	 * @see #setResultOf(String)
	 * @generated
	 */
	public String getResultOf() {
		return resultOf;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of</em>' attribute.
	 * @see #isSetResultOf()
	 * @see #unsetResultOf()
	 * @see #getResultOf()
	 * @generated
	 */
	public void setResultOf(String newResultOf) {
		resultOf = newResultOf;
		resultOfESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResultOf()
	 * @see #getResultOf()
	 * @see #setResultOf(String)
	 * @generated
	 */
	public void unsetResultOf() {
		resultOf = RESULT_OF_EDEFAULT;
		resultOfESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getResultOf <em>Result Of</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result Of</em>' attribute is set.
	 * @see #unsetResultOf()
	 * @see #getResultOf()
	 * @see #setResultOf(String)
	 * @generated
	 */
	public boolean isSetResultOf() {
		return resultOfESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins <em>Gml Observatins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Diagram Objects</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlDiagramObject#getGmlObservatins
	 * @generated
	 */
	public EList<GmlDiagramObject> getGmlDiagramObjects() {
		if (gmlDiagramObjects == null) {
			gmlDiagramObjects = new BasicInternalEList<GmlDiagramObject>(GmlDiagramObject.class);
		}
		return gmlDiagramObjects;
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #setTarget(String)
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(String newTarget) {
		target = newTarget;
		targetESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTarget()
	 * @see #getTarget()
	 * @see #setTarget(String)
	 * @generated
	 */
	public void unsetTarget() {
		target = TARGET_EDEFAULT;
		targetESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getTarget <em>Target</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target</em>' attribute is set.
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @see #setTarget(String)
	 * @generated
	 */
	public boolean isSetTarget() {
		return targetESet;
	}

	/**
	 * Returns the value of the '<em><b>Change Items</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfOperations.ChangeItem}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Items</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfOperations.ChangeItem#getGmlObservation
	 * @generated
	 */
	public EList<ChangeItem> getChangeItems() {
		if (changeItems == null) {
			changeItems = new BasicInternalEList<ChangeItem>(ChangeItem.class);
		}
		return changeItems;
	}

	/**
	 * Returns the value of the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' attribute.
	 * @see #isSetUsing()
	 * @see #unsetUsing()
	 * @see #setUsing(String)
	 * @generated
	 */
	public String getUsing() {
		return using;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' attribute.
	 * @see #isSetUsing()
	 * @see #unsetUsing()
	 * @see #getUsing()
	 * @generated
	 */
	public void setUsing(String newUsing) {
		using = newUsing;
		usingESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsing()
	 * @see #getUsing()
	 * @see #setUsing(String)
	 * @generated
	 */
	public void unsetUsing() {
		using = USING_EDEFAULT;
		usingESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getUsing <em>Using</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Using</em>' attribute is set.
	 * @see #unsetUsing()
	 * @see #getUsing()
	 * @see #setUsing(String)
	 * @generated
	 */
	public boolean isSetUsing() {
		return usingESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation <em>Gml Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Values</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlValue#getGmlObservation
	 * @generated
	 */
	public EList<GmlValue> getGmlValues() {
		if (gmlValues == null) {
			gmlValues = new BasicInternalEList<GmlValue>(GmlValue.class);
		}
		return gmlValues;
	}

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #isSetDateTime()
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		dateTime = newDateTime;
		dateTimeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public void unsetDateTime() {
		dateTime = DATE_TIME_EDEFAULT;
		dateTimeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlObservation#getDateTime <em>Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Date Time</em>' attribute is set.
	 * @see #unsetDateTime()
	 * @see #getDateTime()
	 * @see #setDateTime(Date)
	 * @generated
	 */
	public boolean isSetDateTime() {
		return dateTimeESet;
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlDiagramObjects()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChangeItems()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlValues()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getGmlDiagramObjects()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return ((InternalEList<?>)getChangeItems()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return ((InternalEList<?>)getGmlValues()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				return getResultOf();
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return getGmlDiagramObjects();
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				return getTarget();
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return getChangeItems();
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				return getUsing();
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return getGmlValues();
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				return getDateTime();
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
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				setResultOf((String)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				getGmlDiagramObjects().addAll((Collection<? extends GmlDiagramObject>)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				setTarget((String)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				getChangeItems().clear();
				getChangeItems().addAll((Collection<? extends ChangeItem>)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				setUsing((String)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				getGmlValues().clear();
				getGmlValues().addAll((Collection<? extends GmlValue>)newValue);
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				setDateTime((Date)newValue);
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
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				unsetResultOf();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				getGmlDiagramObjects().clear();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				unsetTarget();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				getChangeItems().clear();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				unsetUsing();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				getGmlValues().clear();
				return;
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				unsetDateTime();
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
			case InfGMLSupportPackage.GML_OBSERVATION__RESULT_OF:
				return isSetResultOf();
			case InfGMLSupportPackage.GML_OBSERVATION__GML_DIAGRAM_OBJECTS:
				return gmlDiagramObjects != null && !gmlDiagramObjects.isEmpty();
			case InfGMLSupportPackage.GML_OBSERVATION__TARGET:
				return isSetTarget();
			case InfGMLSupportPackage.GML_OBSERVATION__CHANGE_ITEMS:
				return changeItems != null && !changeItems.isEmpty();
			case InfGMLSupportPackage.GML_OBSERVATION__USING:
				return isSetUsing();
			case InfGMLSupportPackage.GML_OBSERVATION__GML_VALUES:
				return gmlValues != null && !gmlValues.isEmpty();
			case InfGMLSupportPackage.GML_OBSERVATION__DATE_TIME:
				return isSetDateTime();
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
		result.append(" (resultOf: ");
		if (resultOfESet) result.append(resultOf); else result.append("<unset>");
		result.append(", target: ");
		if (targetESet) result.append(target); else result.append("<unset>");
		result.append(", using: ");
		if (usingESet) result.append(using); else result.append("<unset>");
		result.append(", dateTime: ");
		if (dateTimeESet) result.append(dateTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlObservation
