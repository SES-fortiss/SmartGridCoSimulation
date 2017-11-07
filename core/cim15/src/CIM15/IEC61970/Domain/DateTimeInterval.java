/**
 */
package CIM15.IEC61970.Domain;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Domain.DateTimeInterval#getStart <em>Start</em>}</li>
 *   <li>{@link CIM15.IEC61970.Domain.DateTimeInterval#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTimeInterval extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * This is true if the Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startESet;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * This is true if the End attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeInterval() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DATE_TIME_INTERVAL;
	}

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #setStart(Date)
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Domain.DateTimeInterval#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #getStart()
	 * @generated
	 */
	public void setStart(Date newStart) {
		start = newStart;
		startESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Domain.DateTimeInterval#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStart()
	 * @see #getStart()
	 * @see #setStart(Date)
	 * @generated
	 */
	public void unsetStart() {
		start = START_EDEFAULT;
		startESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Domain.DateTimeInterval#getStart <em>Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start</em>' attribute is set.
	 * @see #unsetStart()
	 * @see #getStart()
	 * @see #setStart(Date)
	 * @generated
	 */
	public boolean isSetStart() {
		return startESet;
	}

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #isSetEnd()
	 * @see #unsetEnd()
	 * @see #setEnd(Date)
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Domain.DateTimeInterval#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #isSetEnd()
	 * @see #unsetEnd()
	 * @see #getEnd()
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		end = newEnd;
		endESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Domain.DateTimeInterval#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnd()
	 * @see #getEnd()
	 * @see #setEnd(Date)
	 * @generated
	 */
	public void unsetEnd() {
		end = END_EDEFAULT;
		endESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Domain.DateTimeInterval#getEnd <em>End</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End</em>' attribute is set.
	 * @see #unsetEnd()
	 * @see #getEnd()
	 * @see #setEnd(Date)
	 * @generated
	 */
	public boolean isSetEnd() {
		return endESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.DATE_TIME_INTERVAL__START:
				return getStart();
			case DomainPackage.DATE_TIME_INTERVAL__END:
				return getEnd();
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
			case DomainPackage.DATE_TIME_INTERVAL__START:
				setStart((Date)newValue);
				return;
			case DomainPackage.DATE_TIME_INTERVAL__END:
				setEnd((Date)newValue);
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
			case DomainPackage.DATE_TIME_INTERVAL__START:
				unsetStart();
				return;
			case DomainPackage.DATE_TIME_INTERVAL__END:
				unsetEnd();
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
			case DomainPackage.DATE_TIME_INTERVAL__START:
				return isSetStart();
			case DomainPackage.DATE_TIME_INTERVAL__END:
				return isSetEnd();
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
		result.append(" (start: ");
		if (startESet) result.append(start); else result.append("<unset>");
		result.append(", end: ");
		if (endESet) result.append(end); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DateTimeInterval
