/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.AssetModels.OverheadConductorInfo;

import CIM15.IEC61970.Core.IdentifiedObject;
import CIM15.IEC61970.Core.PhaseCode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mounting Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getConnections <em>Connections</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getOverheadConductors <em>Overhead Conductors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MountingPoint extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<MountingConnection> connections;

	/**
	 * The default value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoord()
	 * @generated
	 * @ordered
	 */
	protected static final int XCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXCoord() <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoord()
	 * @generated
	 * @ordered
	 */
	protected int xCoord = XCOORD_EDEFAULT;

	/**
	 * This is true if the XCoord attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xCoordESet;

	/**
	 * The default value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASE_CODE_EDEFAULT = PhaseCode.S12_N;

	/**
	 * The cached value of the '{@link #getPhaseCode() <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCode()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phaseCode = PHASE_CODE_EDEFAULT;

	/**
	 * This is true if the Phase Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseCodeESet;

	/**
	 * The default value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoord()
	 * @generated
	 * @ordered
	 */
	protected static final int YCOORD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYCoord() <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoord()
	 * @generated
	 * @ordered
	 */
	protected int yCoord = YCOORD_EDEFAULT;

	/**
	 * This is true if the YCoord attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yCoordESet;

	/**
	 * The cached value of the '{@link #getOverheadConductors() <em>Overhead Conductors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverheadConductors()
	 * @generated
	 * @ordered
	 */
	protected EList<OverheadConductorInfo> overheadConductors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MountingPoint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getMountingPoint();
	}

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.MountingConnection}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints <em>Mounting Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints
	 * @generated
	 */
	public EList<MountingConnection> getConnections() {
		if (connections == null) {
			connections = new BasicInternalEList<MountingConnection>(MountingConnection.class);
		}
		return connections;
	}

	/**
	 * Returns the value of the '<em><b>XCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XCoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoord</em>' attribute.
	 * @see #isSetXCoord()
	 * @see #unsetXCoord()
	 * @see #setXCoord(int)
	 * @generated
	 */
	public int getXCoord() {
		return xCoord;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoord</em>' attribute.
	 * @see #isSetXCoord()
	 * @see #unsetXCoord()
	 * @see #getXCoord()
	 * @generated
	 */
	public void setXCoord(int newXCoord) {
		xCoord = newXCoord;
		xCoordESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXCoord()
	 * @see #getXCoord()
	 * @see #setXCoord(int)
	 * @generated
	 */
	public void unsetXCoord() {
		xCoord = XCOORD_EDEFAULT;
		xCoordESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getXCoord <em>XCoord</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XCoord</em>' attribute is set.
	 * @see #unsetXCoord()
	 * @see #getXCoord()
	 * @see #setXCoord(int)
	 * @generated
	 */
	public boolean isSetXCoord() {
		return xCoordESet;
	}

	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public PhaseCode getPhaseCode() {
		return phaseCode;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see CIM15.IEC61970.Core.PhaseCode
	 * @see #isSetPhaseCode()
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @generated
	 */
	public void setPhaseCode(PhaseCode newPhaseCode) {
		phaseCode = newPhaseCode == null ? PHASE_CODE_EDEFAULT : newPhaseCode;
		phaseCodeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public void unsetPhaseCode() {
		phaseCode = PHASE_CODE_EDEFAULT;
		phaseCodeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getPhaseCode <em>Phase Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Code</em>' attribute is set.
	 * @see #unsetPhaseCode()
	 * @see #getPhaseCode()
	 * @see #setPhaseCode(PhaseCode)
	 * @generated
	 */
	public boolean isSetPhaseCode() {
		return phaseCodeESet;
	}

	/**
	 * Returns the value of the '<em><b>YCoord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCoord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoord</em>' attribute.
	 * @see #isSetYCoord()
	 * @see #unsetYCoord()
	 * @see #setYCoord(int)
	 * @generated
	 */
	public int getYCoord() {
		return yCoord;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoord</em>' attribute.
	 * @see #isSetYCoord()
	 * @see #unsetYCoord()
	 * @see #getYCoord()
	 * @generated
	 */
	public void setYCoord(int newYCoord) {
		yCoord = newYCoord;
		yCoordESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYCoord()
	 * @see #getYCoord()
	 * @see #setYCoord(int)
	 * @generated
	 */
	public void unsetYCoord() {
		yCoord = YCOORD_EDEFAULT;
		yCoordESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getYCoord <em>YCoord</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>YCoord</em>' attribute is set.
	 * @see #unsetYCoord()
	 * @see #getYCoord()
	 * @see #setYCoord(int)
	 * @generated
	 */
	public boolean isSetYCoord() {
		return yCoordESet;
	}

	/**
	 * Returns the value of the '<em><b>Overhead Conductors</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.OverheadConductorInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint <em>Mounting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead Conductors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead Conductors</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.OverheadConductorInfo#getMountingPoint
	 * @generated
	 */
	public EList<OverheadConductorInfo> getOverheadConductors() {
		if (overheadConductors == null) {
			overheadConductors = new BasicInternalEList<OverheadConductorInfo>(OverheadConductorInfo.class);
		}
		return overheadConductors;
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
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverheadConductors()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return ((InternalEList<?>)getOverheadConductors()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return getConnections();
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				return getXCoord();
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				return getPhaseCode();
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				return getYCoord();
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return getOverheadConductors();
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
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends MountingConnection>)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				setXCoord((Integer)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				setPhaseCode((PhaseCode)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				setYCoord((Integer)newValue);
				return;
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				getOverheadConductors().clear();
				getOverheadConductors().addAll((Collection<? extends OverheadConductorInfo>)newValue);
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
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				getConnections().clear();
				return;
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				unsetXCoord();
				return;
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				unsetPhaseCode();
				return;
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				unsetYCoord();
				return;
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				getOverheadConductors().clear();
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
			case InfAssetsPackage.MOUNTING_POINT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case InfAssetsPackage.MOUNTING_POINT__XCOORD:
				return isSetXCoord();
			case InfAssetsPackage.MOUNTING_POINT__PHASE_CODE:
				return isSetPhaseCode();
			case InfAssetsPackage.MOUNTING_POINT__YCOORD:
				return isSetYCoord();
			case InfAssetsPackage.MOUNTING_POINT__OVERHEAD_CONDUCTORS:
				return overheadConductors != null && !overheadConductors.isEmpty();
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
		result.append(" (xCoord: ");
		if (xCoordESet) result.append(xCoord); else result.append("<unset>");
		result.append(", phaseCode: ");
		if (phaseCodeESet) result.append(phaseCode); else result.append("<unset>");
		result.append(", yCoord: ");
		if (yCoordESet) result.append(yCoord); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // MountingPoint
