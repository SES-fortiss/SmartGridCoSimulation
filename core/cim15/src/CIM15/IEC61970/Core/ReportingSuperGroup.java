/**
 */
package CIM15.IEC61970.Core;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Super Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportingSuperGroup extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportingGroup> reportingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportingSuperGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REPORTING_SUPER_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Reporting Group</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.ReportingGroup}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Group</em>' reference list.
	 * @see CIM15.IEC61970.Core.ReportingGroup#getReportingSuperGroup
	 * @generated
	 */
	public EList<ReportingGroup> getReportingGroup() {
		if (reportingGroup == null) {
			reportingGroup = new BasicInternalEList<ReportingGroup>(ReportingGroup.class);
		}
		return reportingGroup;
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReportingGroup()).basicAdd(otherEnd, msgs);
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return ((InternalEList<?>)getReportingGroup()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return getReportingGroup();
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				getReportingGroup().clear();
				getReportingGroup().addAll((Collection<? extends ReportingGroup>)newValue);
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				getReportingGroup().clear();
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
			case CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP:
				return reportingGroup != null && !reportingGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ReportingSuperGroup
