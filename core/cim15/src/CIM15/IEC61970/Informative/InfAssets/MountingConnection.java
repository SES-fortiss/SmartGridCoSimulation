/**
 */
package CIM15.IEC61970.Informative.InfAssets;

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
 * A representation of the model object '<em><b>Mounting Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos <em>Structure Infos</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.MountingConnection#getMountingPoints <em>Mounting Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MountingConnection extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getStructureInfos() <em>Structure Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<Structure> structureInfos;

	/**
	 * The cached value of the '{@link #getMountingPoints() <em>Mounting Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountingPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<MountingPoint> mountingPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MountingConnection() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getMountingConnection();
	}

	/**
	 * Returns the value of the '<em><b>Structure Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.Structure}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getMountingConnections <em>Mounting Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Infos</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getMountingConnections
	 * @generated
	 */
	public EList<Structure> getStructureInfos() {
		if (structureInfos == null) {
			structureInfos = new BasicInternalEList<Structure>(Structure.class);
		}
		return structureInfos;
	}

	/**
	 * Returns the value of the '<em><b>Mounting Points</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.MountingPoint}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.MountingPoint#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Points</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.MountingPoint#getConnections
	 * @generated
	 */
	public EList<MountingPoint> getMountingPoints() {
		if (mountingPoints == null) {
			mountingPoints = new BasicInternalEList<MountingPoint>(MountingPoint.class);
		}
		return mountingPoints;
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructureInfos()).basicAdd(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMountingPoints()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return ((InternalEList<?>)getStructureInfos()).basicRemove(otherEnd, msgs);
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return ((InternalEList<?>)getMountingPoints()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return getStructureInfos();
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return getMountingPoints();
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				getStructureInfos().clear();
				getStructureInfos().addAll((Collection<? extends Structure>)newValue);
				return;
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				getMountingPoints().clear();
				getMountingPoints().addAll((Collection<? extends MountingPoint>)newValue);
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				getStructureInfos().clear();
				return;
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				getMountingPoints().clear();
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
			case InfAssetsPackage.MOUNTING_CONNECTION__STRUCTURE_INFOS:
				return structureInfos != null && !structureInfos.isEmpty();
			case InfAssetsPackage.MOUNTING_CONNECTION__MOUNTING_POINTS:
				return mountingPoints != null && !mountingPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // MountingConnection
