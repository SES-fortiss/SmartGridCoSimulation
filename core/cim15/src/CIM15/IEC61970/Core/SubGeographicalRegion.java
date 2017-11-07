/**
 */
package CIM15.IEC61970.Core;

import CIM15.IEC61970.Wires.Line;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.SubGeographicalRegion#getSubstations <em>Substations</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.SubGeographicalRegion#getLines <em>Lines</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.SubGeographicalRegion#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubGeographicalRegion extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getSubstations() <em>Substations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstations()
	 * @generated
	 * @ordered
	 */
	protected EList<Substation> substations;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected GeographicalRegion region;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubGeographicalRegion() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SUB_GEOGRAPHICAL_REGION;
	}

	/**
	 * Returns the value of the '<em><b>Substations</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Substation}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Substation#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substations</em>' reference list.
	 * @see CIM15.IEC61970.Core.Substation#getRegion
	 * @generated
	 */
	public EList<Substation> getSubstations() {
		if (substations == null) {
			substations = new BasicInternalEList<Substation>(Substation.class);
		}
		return substations;
	}

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.Line}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.Line#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see CIM15.IEC61970.Wires.Line#getRegion
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new BasicInternalEList<Line>(Line.class);
		}
		return lines;
	}

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.GeographicalRegion#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(GeographicalRegion)
	 * @see CIM15.IEC61970.Core.GeographicalRegion#getRegions
	 * @generated
	 */
	public GeographicalRegion getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (GeographicalRegion)eResolveProxy(oldRegion);
			if (region != oldRegion) {
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(GeographicalRegion newRegion, NotificationChain msgs) {
		GeographicalRegion oldRegion = region;
		region = newRegion;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.SubGeographicalRegion#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	public void setRegion(GeographicalRegion newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, CorePackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
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
			case CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstations()).basicAdd(otherEnd, msgs);
			case CorePackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
			case CorePackage.SUB_GEOGRAPHICAL_REGION__REGION:
				if (region != null)
					msgs = ((InternalEObject)region).eInverseRemove(this, CorePackage.GEOGRAPHICAL_REGION__REGIONS, GeographicalRegion.class, msgs);
				return basicSetRegion((GeographicalRegion)otherEnd, msgs);
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
			case CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return ((InternalEList<?>)getSubstations()).basicRemove(otherEnd, msgs);
			case CorePackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case CorePackage.SUB_GEOGRAPHICAL_REGION__REGION:
				return basicSetRegion(null, msgs);
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
			case CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return getSubstations();
			case CorePackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return getLines();
			case CorePackage.SUB_GEOGRAPHICAL_REGION__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
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
			case CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				getSubstations().clear();
				getSubstations().addAll((Collection<? extends Substation>)newValue);
				return;
			case CorePackage.SUB_GEOGRAPHICAL_REGION__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends Line>)newValue);
				return;
			case CorePackage.SUB_GEOGRAPHICAL_REGION__REGION:
				setRegion((GeographicalRegion)newValue);
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
			case CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				getSubstations().clear();
				return;
			case CorePackage.SUB_GEOGRAPHICAL_REGION__LINES:
				getLines().clear();
				return;
			case CorePackage.SUB_GEOGRAPHICAL_REGION__REGION:
				setRegion((GeographicalRegion)null);
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
			case CorePackage.SUB_GEOGRAPHICAL_REGION__SUBSTATIONS:
				return substations != null && !substations.isEmpty();
			case CorePackage.SUB_GEOGRAPHICAL_REGION__LINES:
				return lines != null && !lines.isEmpty();
			case CorePackage.SUB_GEOGRAPHICAL_REGION__REGION:
				return region != null;
		}
		return super.eIsSet(featureID);
	}

} // SubGeographicalRegion
