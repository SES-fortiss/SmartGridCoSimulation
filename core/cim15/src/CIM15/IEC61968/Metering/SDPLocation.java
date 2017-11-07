/**
 */
package CIM15.IEC61968.Metering;

import CIM15.IEC61968.Common.Location;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDP Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.SDPLocation#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link CIM15.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDPLocation extends Location {
	/**
	 * The default value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected String accessMethod = ACCESS_METHOD_EDEFAULT;

	/**
	 * This is true if the Access Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessMethodESet;

	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The default value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected String remark = REMARK_EDEFAULT;

	/**
	 * This is true if the Remark attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remarkESet;

	/**
	 * The default value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_ACCESS_PROBLEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected String siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;

	/**
	 * This is true if the Site Access Problem attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean siteAccessProblemESet;

	/**
	 * The default value of the '{@link #getOccupancyDate() <em>Occupancy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancyDate()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPANCY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupancyDate() <em>Occupancy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancyDate()
	 * @generated
	 * @ordered
	 */
	protected String occupancyDate = OCCUPANCY_DATE_EDEFAULT;

	/**
	 * This is true if the Occupancy Date attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean occupancyDateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDPLocation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.SDP_LOCATION;
	}

	/**
	 * Returns the value of the '<em><b>Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Method</em>' attribute.
	 * @see #isSetAccessMethod()
	 * @see #unsetAccessMethod()
	 * @see #setAccessMethod(String)
	 * @generated
	 */
	public String getAccessMethod() {
		return accessMethod;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Method</em>' attribute.
	 * @see #isSetAccessMethod()
	 * @see #unsetAccessMethod()
	 * @see #getAccessMethod()
	 * @generated
	 */
	public void setAccessMethod(String newAccessMethod) {
		accessMethod = newAccessMethod;
		accessMethodESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessMethod()
	 * @see #getAccessMethod()
	 * @see #setAccessMethod(String)
	 * @generated
	 */
	public void unsetAccessMethod() {
		accessMethod = ACCESS_METHOD_EDEFAULT;
		accessMethodESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getAccessMethod <em>Access Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Method</em>' attribute is set.
	 * @see #unsetAccessMethod()
	 * @see #getAccessMethod()
	 * @see #setAccessMethod(String)
	 * @generated
	 */
	public boolean isSetAccessMethod() {
		return accessMethodESet;
	}

	/**
	 * Returns the value of the '<em><b>Service Delivery Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.Metering.ServiceDeliveryPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations <em>SDP Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Delivery Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delivery Points</em>' reference list.
	 * @see CIM15.IEC61968.Metering.ServiceDeliveryPoint#getSDPLocations
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new BasicInternalEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' attribute.
	 * @see #isSetRemark()
	 * @see #unsetRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark</em>' attribute.
	 * @see #isSetRemark()
	 * @see #unsetRemark()
	 * @see #getRemark()
	 * @generated
	 */
	public void setRemark(String newRemark) {
		remark = newRemark;
		remarkESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemark()
	 * @see #getRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public void unsetRemark() {
		remark = REMARK_EDEFAULT;
		remarkESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getRemark <em>Remark</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remark</em>' attribute is set.
	 * @see #unsetRemark()
	 * @see #getRemark()
	 * @see #setRemark(String)
	 * @generated
	 */
	public boolean isSetRemark() {
		return remarkESet;
	}

	/**
	 * Returns the value of the '<em><b>Site Access Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Access Problem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Access Problem</em>' attribute.
	 * @see #isSetSiteAccessProblem()
	 * @see #unsetSiteAccessProblem()
	 * @see #setSiteAccessProblem(String)
	 * @generated
	 */
	public String getSiteAccessProblem() {
		return siteAccessProblem;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Access Problem</em>' attribute.
	 * @see #isSetSiteAccessProblem()
	 * @see #unsetSiteAccessProblem()
	 * @see #getSiteAccessProblem()
	 * @generated
	 */
	public void setSiteAccessProblem(String newSiteAccessProblem) {
		siteAccessProblem = newSiteAccessProblem;
		siteAccessProblemESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSiteAccessProblem()
	 * @see #getSiteAccessProblem()
	 * @see #setSiteAccessProblem(String)
	 * @generated
	 */
	public void unsetSiteAccessProblem() {
		siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;
		siteAccessProblemESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getSiteAccessProblem <em>Site Access Problem</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Site Access Problem</em>' attribute is set.
	 * @see #unsetSiteAccessProblem()
	 * @see #getSiteAccessProblem()
	 * @see #setSiteAccessProblem(String)
	 * @generated
	 */
	public boolean isSetSiteAccessProblem() {
		return siteAccessProblemESet;
	}

	/**
	 * Returns the value of the '<em><b>Occupancy Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy Date</em>' attribute.
	 * @see #isSetOccupancyDate()
	 * @see #unsetOccupancyDate()
	 * @see #setOccupancyDate(String)
	 * @generated
	 */
	public String getOccupancyDate() {
		return occupancyDate;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupancy Date</em>' attribute.
	 * @see #isSetOccupancyDate()
	 * @see #unsetOccupancyDate()
	 * @see #getOccupancyDate()
	 * @generated
	 */
	public void setOccupancyDate(String newOccupancyDate) {
		occupancyDate = newOccupancyDate;
		occupancyDateESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOccupancyDate()
	 * @see #getOccupancyDate()
	 * @see #setOccupancyDate(String)
	 * @generated
	 */
	public void unsetOccupancyDate() {
		occupancyDate = OCCUPANCY_DATE_EDEFAULT;
		occupancyDateESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61968.Metering.SDPLocation#getOccupancyDate <em>Occupancy Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Occupancy Date</em>' attribute is set.
	 * @see #unsetOccupancyDate()
	 * @see #getOccupancyDate()
	 * @see #setOccupancyDate(String)
	 * @generated
	 */
	public boolean isSetOccupancyDate() {
		return occupancyDateESet;
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
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				return getAccessMethod();
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case MeteringPackage.SDP_LOCATION__REMARK:
				return getRemark();
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				return getSiteAccessProblem();
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				return getOccupancyDate();
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				setAccessMethod((String)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__REMARK:
				setRemark((String)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				setSiteAccessProblem((String)newValue);
				return;
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				setOccupancyDate((String)newValue);
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				unsetAccessMethod();
				return;
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case MeteringPackage.SDP_LOCATION__REMARK:
				unsetRemark();
				return;
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				unsetSiteAccessProblem();
				return;
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				unsetOccupancyDate();
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
			case MeteringPackage.SDP_LOCATION__ACCESS_METHOD:
				return isSetAccessMethod();
			case MeteringPackage.SDP_LOCATION__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case MeteringPackage.SDP_LOCATION__REMARK:
				return isSetRemark();
			case MeteringPackage.SDP_LOCATION__SITE_ACCESS_PROBLEM:
				return isSetSiteAccessProblem();
			case MeteringPackage.SDP_LOCATION__OCCUPANCY_DATE:
				return isSetOccupancyDate();
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
		result.append(" (accessMethod: ");
		if (accessMethodESet) result.append(accessMethod); else result.append("<unset>");
		result.append(", remark: ");
		if (remarkESet) result.append(remark); else result.append("<unset>");
		result.append(", siteAccessProblem: ");
		if (siteAccessProblemESet) result.append(siteAccessProblem); else result.append("<unset>");
		result.append(", occupancyDate: ");
		if (occupancyDateESet) result.append(occupancyDate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // SDPLocation
