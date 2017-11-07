/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.Topology.BusNameMarker;
import CIM15.IEC61970.Topology.TopologicalNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ReportingGroup#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportingGroup extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusNameMarker()
	 * @generated
	 * @ordered
	 */
	protected EList<BusNameMarker> busNameMarker;

	/**
	 * The cached value of the '{@link #getReportingSuperGroup() <em>Reporting Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingSuperGroup()
	 * @generated
	 * @ordered
	 */
	protected ReportingSuperGroup reportingSuperGroup;

	/**
	 * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologicalNode()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologicalNode> topologicalNode;

	/**
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportingGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REPORTING_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Topology.BusNameMarker}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.BusNameMarker#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Name Marker</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Name Marker</em>' reference list.
	 * @see CIM15.IEC61970.Topology.BusNameMarker#getReportingGroup
	 * @generated
	 */
	public EList<BusNameMarker> getBusNameMarker() {
		if (busNameMarker == null) {
			busNameMarker = new BasicInternalEList<BusNameMarker>(BusNameMarker.class);
		}
		return busNameMarker;
	}

	/**
	 * Returns the value of the '<em><b>Reporting Super Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporting Super Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Super Group</em>' reference.
	 * @see #setReportingSuperGroup(ReportingSuperGroup)
	 * @see CIM15.IEC61970.Core.ReportingSuperGroup#getReportingGroup
	 * @generated
	 */
	public ReportingSuperGroup getReportingSuperGroup() {
		if (reportingSuperGroup != null && reportingSuperGroup.eIsProxy()) {
			InternalEObject oldReportingSuperGroup = (InternalEObject)reportingSuperGroup;
			reportingSuperGroup = (ReportingSuperGroup)eResolveProxy(oldReportingSuperGroup);
			if (reportingSuperGroup != oldReportingSuperGroup) {
			}
		}
		return reportingSuperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingSuperGroup basicGetReportingSuperGroup() {
		return reportingSuperGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportingSuperGroup(ReportingSuperGroup newReportingSuperGroup, NotificationChain msgs) {
		ReportingSuperGroup oldReportingSuperGroup = reportingSuperGroup;
		reportingSuperGroup = newReportingSuperGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Super Group</em>' reference.
	 * @see #getReportingSuperGroup()
	 * @generated
	 */
	public void setReportingSuperGroup(ReportingSuperGroup newReportingSuperGroup) {
		if (newReportingSuperGroup != reportingSuperGroup) {
			NotificationChain msgs = null;
			if (reportingSuperGroup != null)
				msgs = ((InternalEObject)reportingSuperGroup).eInverseRemove(this, CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs);
			if (newReportingSuperGroup != null)
				msgs = ((InternalEObject)newReportingSuperGroup).eInverseAdd(this, CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs);
			msgs = basicSetReportingSuperGroup(newReportingSuperGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Topology.TopologicalNode}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Topology.TopologicalNode#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topological Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topological Node</em>' reference list.
	 * @see CIM15.IEC61970.Topology.TopologicalNode#getReportingGroup
	 * @generated
	 */
	public EList<TopologicalNode> getTopologicalNode() {
		if (topologicalNode == null) {
			topologicalNode = new BasicInternalEList<TopologicalNode>(TopologicalNode.class);
		}
		return topologicalNode;
	}

	/**
	 * Returns the value of the '<em><b>Power System Resource</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resource</em>' reference list.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getReportingGroup
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResource() {
		if (powerSystemResource == null) {
			powerSystemResource = new BasicInternalEList<PowerSystemResource>(PowerSystemResource.class);
		}
		return powerSystemResource;
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
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusNameMarker()).basicAdd(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				if (reportingSuperGroup != null)
					msgs = ((InternalEObject)reportingSuperGroup).eInverseRemove(this, CorePackage.REPORTING_SUPER_GROUP__REPORTING_GROUP, ReportingSuperGroup.class, msgs);
				return basicSetReportingSuperGroup((ReportingSuperGroup)otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologicalNode()).basicAdd(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResource()).basicAdd(otherEnd, msgs);
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
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return ((InternalEList<?>)getBusNameMarker()).basicRemove(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				return basicSetReportingSuperGroup(null, msgs);
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return ((InternalEList<?>)getTopologicalNode()).basicRemove(otherEnd, msgs);
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return ((InternalEList<?>)getPowerSystemResource()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return getBusNameMarker();
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				if (resolve) return getReportingSuperGroup();
				return basicGetReportingSuperGroup();
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return getTopologicalNode();
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return getPowerSystemResource();
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
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				getBusNameMarker().clear();
				getBusNameMarker().addAll((Collection<? extends BusNameMarker>)newValue);
				return;
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				setReportingSuperGroup((ReportingSuperGroup)newValue);
				return;
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				getTopologicalNode().addAll((Collection<? extends TopologicalNode>)newValue);
				return;
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				getPowerSystemResource().clear();
				getPowerSystemResource().addAll((Collection<? extends PowerSystemResource>)newValue);
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
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				getBusNameMarker().clear();
				return;
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				setReportingSuperGroup((ReportingSuperGroup)null);
				return;
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				getTopologicalNode().clear();
				return;
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				getPowerSystemResource().clear();
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
			case CorePackage.REPORTING_GROUP__BUS_NAME_MARKER:
				return busNameMarker != null && !busNameMarker.isEmpty();
			case CorePackage.REPORTING_GROUP__REPORTING_SUPER_GROUP:
				return reportingSuperGroup != null;
			case CorePackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
				return topologicalNode != null && !topologicalNode.isEmpty();
			case CorePackage.REPORTING_GROUP__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null && !powerSystemResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ReportingGroup
