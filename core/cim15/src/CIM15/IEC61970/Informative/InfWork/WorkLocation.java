/**
 */
package CIM15.IEC61970.Informative.InfWork;

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
 * A representation of the model object '<em><b>Work Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getDesignLocations <em>Design Locations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkLocation extends Location {
	/**
	 * The cached value of the '{@link #getOneCallRequest() <em>One Call Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneCallRequest()
	 * @generated
	 * @ordered
	 */
	protected OneCallRequest oneCallRequest;

	/**
	 * The default value of the '{@link #getSubdivision() <em>Subdivision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdivision()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBDIVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubdivision() <em>Subdivision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdivision()
	 * @generated
	 * @ordered
	 */
	protected String subdivision = SUBDIVISION_EDEFAULT;

	/**
	 * This is true if the Subdivision attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean subdivisionESet;

	/**
	 * The default value of the '{@link #getNearestIntersection() <em>Nearest Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNearestIntersection()
	 * @generated
	 * @ordered
	 */
	protected static final String NEAREST_INTERSECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNearestIntersection() <em>Nearest Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNearestIntersection()
	 * @generated
	 * @ordered
	 */
	protected String nearestIntersection = NEAREST_INTERSECTION_EDEFAULT;

	/**
	 * This is true if the Nearest Intersection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nearestIntersectionESet;

	/**
	 * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected String block = BLOCK_EDEFAULT;

	/**
	 * This is true if the Block attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blockESet;

	/**
	 * The cached value of the '{@link #getDesignLocations() <em>Design Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignLocation> designLocations;

	/**
	 * The default value of the '{@link #getLot() <em>Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLot()
	 * @generated
	 * @ordered
	 */
	protected static final String LOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLot() <em>Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLot()
	 * @generated
	 * @ordered
	 */
	protected String lot = LOT_EDEFAULT;

	/**
	 * This is true if the Lot attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lotESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkLocation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfWorkPackage.Literals.WORK_LOCATION;
	}

	/**
	 * Returns the value of the '<em><b>One Call Request</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Call Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Call Request</em>' reference.
	 * @see #setOneCallRequest(OneCallRequest)
	 * @see CIM15.IEC61970.Informative.InfWork.OneCallRequest#getWorkLocations
	 * @generated
	 */
	public OneCallRequest getOneCallRequest() {
		if (oneCallRequest != null && oneCallRequest.eIsProxy()) {
			InternalEObject oldOneCallRequest = (InternalEObject)oneCallRequest;
			oneCallRequest = (OneCallRequest)eResolveProxy(oldOneCallRequest);
			if (oneCallRequest != oldOneCallRequest) {
			}
		}
		return oneCallRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneCallRequest basicGetOneCallRequest() {
		return oneCallRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneCallRequest(OneCallRequest newOneCallRequest, NotificationChain msgs) {
		OneCallRequest oldOneCallRequest = oneCallRequest;
		oneCallRequest = newOneCallRequest;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getOneCallRequest <em>One Call Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Call Request</em>' reference.
	 * @see #getOneCallRequest()
	 * @generated
	 */
	public void setOneCallRequest(OneCallRequest newOneCallRequest) {
		if (newOneCallRequest != oneCallRequest) {
			NotificationChain msgs = null;
			if (oneCallRequest != null)
				msgs = ((InternalEObject)oneCallRequest).eInverseRemove(this, InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS, OneCallRequest.class, msgs);
			if (newOneCallRequest != null)
				msgs = ((InternalEObject)newOneCallRequest).eInverseAdd(this, InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS, OneCallRequest.class, msgs);
			msgs = basicSetOneCallRequest(newOneCallRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Subdivision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subdivision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdivision</em>' attribute.
	 * @see #isSetSubdivision()
	 * @see #unsetSubdivision()
	 * @see #setSubdivision(String)
	 * @generated
	 */
	public String getSubdivision() {
		return subdivision;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdivision</em>' attribute.
	 * @see #isSetSubdivision()
	 * @see #unsetSubdivision()
	 * @see #getSubdivision()
	 * @generated
	 */
	public void setSubdivision(String newSubdivision) {
		subdivision = newSubdivision;
		subdivisionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubdivision()
	 * @see #getSubdivision()
	 * @see #setSubdivision(String)
	 * @generated
	 */
	public void unsetSubdivision() {
		subdivision = SUBDIVISION_EDEFAULT;
		subdivisionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getSubdivision <em>Subdivision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subdivision</em>' attribute is set.
	 * @see #unsetSubdivision()
	 * @see #getSubdivision()
	 * @see #setSubdivision(String)
	 * @generated
	 */
	public boolean isSetSubdivision() {
		return subdivisionESet;
	}

	/**
	 * Returns the value of the '<em><b>Nearest Intersection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nearest Intersection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nearest Intersection</em>' attribute.
	 * @see #isSetNearestIntersection()
	 * @see #unsetNearestIntersection()
	 * @see #setNearestIntersection(String)
	 * @generated
	 */
	public String getNearestIntersection() {
		return nearestIntersection;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nearest Intersection</em>' attribute.
	 * @see #isSetNearestIntersection()
	 * @see #unsetNearestIntersection()
	 * @see #getNearestIntersection()
	 * @generated
	 */
	public void setNearestIntersection(String newNearestIntersection) {
		nearestIntersection = newNearestIntersection;
		nearestIntersectionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNearestIntersection()
	 * @see #getNearestIntersection()
	 * @see #setNearestIntersection(String)
	 * @generated
	 */
	public void unsetNearestIntersection() {
		nearestIntersection = NEAREST_INTERSECTION_EDEFAULT;
		nearestIntersectionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getNearestIntersection <em>Nearest Intersection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nearest Intersection</em>' attribute is set.
	 * @see #unsetNearestIntersection()
	 * @see #getNearestIntersection()
	 * @see #setNearestIntersection(String)
	 * @generated
	 */
	public boolean isSetNearestIntersection() {
		return nearestIntersectionESet;
	}

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute.
	 * @see #isSetBlock()
	 * @see #unsetBlock()
	 * @see #setBlock(String)
	 * @generated
	 */
	public String getBlock() {
		return block;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #isSetBlock()
	 * @see #unsetBlock()
	 * @see #getBlock()
	 * @generated
	 */
	public void setBlock(String newBlock) {
		block = newBlock;
		blockESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlock()
	 * @see #getBlock()
	 * @see #setBlock(String)
	 * @generated
	 */
	public void unsetBlock() {
		block = BLOCK_EDEFAULT;
		blockESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getBlock <em>Block</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Block</em>' attribute is set.
	 * @see #unsetBlock()
	 * @see #getBlock()
	 * @see #setBlock(String)
	 * @generated
	 */
	public boolean isSetBlock() {
		return blockESet;
	}

	/**
	 * Returns the value of the '<em><b>Design Locations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfWork.DesignLocation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations <em>Work Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Locations</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfWork.DesignLocation#getWorkLocations
	 * @generated
	 */
	public EList<DesignLocation> getDesignLocations() {
		if (designLocations == null) {
			designLocations = new BasicInternalEList<DesignLocation>(DesignLocation.class);
		}
		return designLocations;
	}

	/**
	 * Returns the value of the '<em><b>Lot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot</em>' attribute.
	 * @see #isSetLot()
	 * @see #unsetLot()
	 * @see #setLot(String)
	 * @generated
	 */
	public String getLot() {
		return lot;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot</em>' attribute.
	 * @see #isSetLot()
	 * @see #unsetLot()
	 * @see #getLot()
	 * @generated
	 */
	public void setLot(String newLot) {
		lot = newLot;
		lotESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLot()
	 * @see #getLot()
	 * @see #setLot(String)
	 * @generated
	 */
	public void unsetLot() {
		lot = LOT_EDEFAULT;
		lotESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfWork.WorkLocation#getLot <em>Lot</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lot</em>' attribute is set.
	 * @see #unsetLot()
	 * @see #getLot()
	 * @see #setLot(String)
	 * @generated
	 */
	public boolean isSetLot() {
		return lotESet;
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
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				if (oneCallRequest != null)
					msgs = ((InternalEObject)oneCallRequest).eInverseRemove(this, InfWorkPackage.ONE_CALL_REQUEST__WORK_LOCATIONS, OneCallRequest.class, msgs);
				return basicSetOneCallRequest((OneCallRequest)otherEnd, msgs);
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDesignLocations()).basicAdd(otherEnd, msgs);
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
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				return basicSetOneCallRequest(null, msgs);
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return ((InternalEList<?>)getDesignLocations()).basicRemove(otherEnd, msgs);
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
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				if (resolve) return getOneCallRequest();
				return basicGetOneCallRequest();
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				return getSubdivision();
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				return getNearestIntersection();
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				return getBlock();
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return getDesignLocations();
			case InfWorkPackage.WORK_LOCATION__LOT:
				return getLot();
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
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				setOneCallRequest((OneCallRequest)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				setSubdivision((String)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				setNearestIntersection((String)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				setBlock((String)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				getDesignLocations().addAll((Collection<? extends DesignLocation>)newValue);
				return;
			case InfWorkPackage.WORK_LOCATION__LOT:
				setLot((String)newValue);
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
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				setOneCallRequest((OneCallRequest)null);
				return;
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				unsetSubdivision();
				return;
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				unsetNearestIntersection();
				return;
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				unsetBlock();
				return;
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				getDesignLocations().clear();
				return;
			case InfWorkPackage.WORK_LOCATION__LOT:
				unsetLot();
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
			case InfWorkPackage.WORK_LOCATION__ONE_CALL_REQUEST:
				return oneCallRequest != null;
			case InfWorkPackage.WORK_LOCATION__SUBDIVISION:
				return isSetSubdivision();
			case InfWorkPackage.WORK_LOCATION__NEAREST_INTERSECTION:
				return isSetNearestIntersection();
			case InfWorkPackage.WORK_LOCATION__BLOCK:
				return isSetBlock();
			case InfWorkPackage.WORK_LOCATION__DESIGN_LOCATIONS:
				return designLocations != null && !designLocations.isEmpty();
			case InfWorkPackage.WORK_LOCATION__LOT:
				return isSetLot();
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
		result.append(" (subdivision: ");
		if (subdivisionESet) result.append(subdivision); else result.append("<unset>");
		result.append(", nearestIntersection: ");
		if (nearestIntersectionESet) result.append(nearestIntersection); else result.append("<unset>");
		result.append(", block: ");
		if (blockESet) result.append(block); else result.append("<unset>");
		result.append(", lot: ");
		if (lotESet) result.append(lot); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WorkLocation
