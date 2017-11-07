/**
 */
package CIM15.IEC61970.Contingency;

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
 * A representation of the model object '<em><b>Contingency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}</li>
 *   <li>{@link CIM15.IEC61970.Contingency.Contingency#getContingencyElement <em>Contingency Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Contingency extends IdentifiedObject {
	/**
	 * The default value of the '{@link #isMustStudy() <em>Must Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustStudy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_STUDY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustStudy() <em>Must Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustStudy()
	 * @generated
	 * @ordered
	 */
	protected boolean mustStudy = MUST_STUDY_EDEFAULT;

	/**
	 * This is true if the Must Study attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mustStudyESet;

	/**
	 * The cached value of the '{@link #getContingencyElement() <em>Contingency Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContingencyElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ContingencyElement> contingencyElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contingency() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContingencyPackage.Literals.CONTINGENCY;
	}

	/**
	 * Returns the value of the '<em><b>Must Study</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Study</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Study</em>' attribute.
	 * @see #isSetMustStudy()
	 * @see #unsetMustStudy()
	 * @see #setMustStudy(boolean)
	 * @generated
	 */
	public boolean isMustStudy() {
		return mustStudy;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Study</em>' attribute.
	 * @see #isSetMustStudy()
	 * @see #unsetMustStudy()
	 * @see #isMustStudy()
	 * @generated
	 */
	public void setMustStudy(boolean newMustStudy) {
		mustStudy = newMustStudy;
		mustStudyESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustStudy()
	 * @see #isMustStudy()
	 * @see #setMustStudy(boolean)
	 * @generated
	 */
	public void unsetMustStudy() {
		mustStudy = MUST_STUDY_EDEFAULT;
		mustStudyESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Contingency.Contingency#isMustStudy <em>Must Study</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Study</em>' attribute is set.
	 * @see #unsetMustStudy()
	 * @see #isMustStudy()
	 * @see #setMustStudy(boolean)
	 * @generated
	 */
	public boolean isSetMustStudy() {
		return mustStudyESet;
	}

	/**
	 * Returns the value of the '<em><b>Contingency Element</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Contingency.ContingencyElement}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Contingency.ContingencyElement#getContingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency Element</em>' reference list.
	 * @see CIM15.IEC61970.Contingency.ContingencyElement#getContingency
	 * @generated
	 */
	public EList<ContingencyElement> getContingencyElement() {
		if (contingencyElement == null) {
			contingencyElement = new BasicInternalEList<ContingencyElement>(ContingencyElement.class);
		}
		return contingencyElement;
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContingencyElement()).basicAdd(otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return ((InternalEList<?>)getContingencyElement()).basicRemove(otherEnd, msgs);
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
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				return isMustStudy();
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return getContingencyElement();
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
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				setMustStudy((Boolean)newValue);
				return;
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				getContingencyElement().clear();
				getContingencyElement().addAll((Collection<? extends ContingencyElement>)newValue);
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
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				unsetMustStudy();
				return;
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				getContingencyElement().clear();
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
			case ContingencyPackage.CONTINGENCY__MUST_STUDY:
				return isSetMustStudy();
			case ContingencyPackage.CONTINGENCY__CONTINGENCY_ELEMENT:
				return contingencyElement != null && !contingencyElement.isEmpty();
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
		result.append(" (mustStudy: ");
		if (mustStudyESet) result.append(mustStudy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Contingency
