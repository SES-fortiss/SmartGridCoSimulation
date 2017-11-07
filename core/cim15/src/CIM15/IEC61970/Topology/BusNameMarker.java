/**
 */
package CIM15.IEC61970.Topology;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.ReportingGroup;
import CIM15.IEC61970.Core.Terminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Name Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Topology.BusNameMarker#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Topology.BusNameMarker#getReportingGroup <em>Reporting Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusNameMarker extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminal;

	/**
	 * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingGroup()
	 * @generated
	 * @ordered
	 */
	protected ReportingGroup reportingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusNameMarker() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.BUS_NAME_MARKER;
	}

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Terminal}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference list.
	 * @see CIM15.IEC61970.Core.Terminal#getBusNameMarker
	 * @generated
	 */
	public EList<Terminal> getTerminal() {
		if (terminal == null) {
			terminal = new BasicInternalEList<Terminal>(Terminal.class);
		}
		return terminal;
	}

	/**
	 * Returns the value of the '<em><b>Reporting Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Group</em>' reference.
	 * @see #setReportingGroup(ReportingGroup)
	 * @see CIM15.IEC61970.Core.ReportingGroup#getBusNameMarker
	 * @generated
	 */
	public ReportingGroup getReportingGroup() {
		if (reportingGroup != null && reportingGroup.eIsProxy()) {
			InternalEObject oldReportingGroup = (InternalEObject)reportingGroup;
			reportingGroup = (ReportingGroup)eResolveProxy(oldReportingGroup);
			if (reportingGroup != oldReportingGroup) {
			}
		}
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingGroup basicGetReportingGroup() {
		return reportingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportingGroup(ReportingGroup newReportingGroup, NotificationChain msgs) {
		ReportingGroup oldReportingGroup = reportingGroup;
		reportingGroup = newReportingGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Topology.BusNameMarker#getReportingGroup <em>Reporting Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Group</em>' reference.
	 * @see #getReportingGroup()
	 * @generated
	 */
	public void setReportingGroup(ReportingGroup newReportingGroup) {
		if (newReportingGroup != reportingGroup) {
			NotificationChain msgs = null;
			if (reportingGroup != null)
				msgs = ((InternalEObject)reportingGroup).eInverseRemove(this, CorePackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs);
			if (newReportingGroup != null)
				msgs = ((InternalEObject)newReportingGroup).eInverseAdd(this, CorePackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs);
			msgs = basicSetReportingGroup(newReportingGroup, msgs);
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
			case TopologyPackage.BUS_NAME_MARKER__TERMINAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminal()).basicAdd(otherEnd, msgs);
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				if (reportingGroup != null)
					msgs = ((InternalEObject)reportingGroup).eInverseRemove(this, CorePackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs);
				return basicSetReportingGroup((ReportingGroup)otherEnd, msgs);
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
			case TopologyPackage.BUS_NAME_MARKER__TERMINAL:
				return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				return basicSetReportingGroup(null, msgs);
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
			case TopologyPackage.BUS_NAME_MARKER__TERMINAL:
				return getTerminal();
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				if (resolve) return getReportingGroup();
				return basicGetReportingGroup();
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
			case TopologyPackage.BUS_NAME_MARKER__TERMINAL:
				getTerminal().clear();
				getTerminal().addAll((Collection<? extends Terminal>)newValue);
				return;
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				setReportingGroup((ReportingGroup)newValue);
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
			case TopologyPackage.BUS_NAME_MARKER__TERMINAL:
				getTerminal().clear();
				return;
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				setReportingGroup((ReportingGroup)null);
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
			case TopologyPackage.BUS_NAME_MARKER__TERMINAL:
				return terminal != null && !terminal.isEmpty();
			case TopologyPackage.BUS_NAME_MARKER__REPORTING_GROUP:
				return reportingGroup != null;
		}
		return super.eIsSet(featureID);
	}

} // BusNameMarker
