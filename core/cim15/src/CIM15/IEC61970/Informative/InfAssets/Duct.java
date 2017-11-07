/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.AssetModels.CableInfo;

import CIM15.IEC61968.Assets.AssetContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Duct#getXCoord <em>XCoord</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Duct#getYCoord <em>YCoord</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Duct#getDuctBankInfo <em>Duct Bank Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.Duct#getCableInfos <em>Cable Infos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Duct extends AssetContainer {
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
	 * The cached value of the '{@link #getDuctBankInfo() <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuctBankInfo()
	 * @generated
	 * @ordered
	 */
	protected DuctBank ductBankInfo;

	/**
	 * The cached value of the '{@link #getCableInfos() <em>Cable Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCableInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<CableInfo> cableInfos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Duct() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getDuct();
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getXCoord <em>XCoord</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getXCoord <em>XCoord</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getXCoord <em>XCoord</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getYCoord <em>YCoord</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getYCoord <em>YCoord</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getYCoord <em>YCoord</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Duct Bank Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.DuctBank#getDuctInfos <em>Duct Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duct Bank Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duct Bank Info</em>' reference.
	 * @see #setDuctBankInfo(DuctBank)
	 * @see CIM15.IEC61970.Informative.InfAssets.DuctBank#getDuctInfos
	 * @generated
	 */
	public DuctBank getDuctBankInfo() {
		if (ductBankInfo != null && ductBankInfo.eIsProxy()) {
			InternalEObject oldDuctBankInfo = (InternalEObject)ductBankInfo;
			ductBankInfo = (DuctBank)eResolveProxy(oldDuctBankInfo);
			if (ductBankInfo != oldDuctBankInfo) {
			}
		}
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuctBank basicGetDuctBankInfo() {
		return ductBankInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuctBankInfo(DuctBank newDuctBankInfo, NotificationChain msgs) {
		DuctBank oldDuctBankInfo = ductBankInfo;
		ductBankInfo = newDuctBankInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.Duct#getDuctBankInfo <em>Duct Bank Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duct Bank Info</em>' reference.
	 * @see #getDuctBankInfo()
	 * @generated
	 */
	public void setDuctBankInfo(DuctBank newDuctBankInfo) {
		if (newDuctBankInfo != ductBankInfo) {
			NotificationChain msgs = null;
			if (ductBankInfo != null)
				msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT_BANK__DUCT_INFOS, DuctBank.class, msgs);
			if (newDuctBankInfo != null)
				msgs = ((InternalEObject)newDuctBankInfo).eInverseAdd(this, InfAssetsPackage.DUCT_BANK__DUCT_INFOS, DuctBank.class, msgs);
			msgs = basicSetDuctBankInfo(newDuctBankInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Cable Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.CableInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.CableInfo#getDuctBankInfo <em>Duct Bank Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cable Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cable Infos</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.CableInfo#getDuctBankInfo
	 * @generated
	 */
	public EList<CableInfo> getCableInfos() {
		if (cableInfos == null) {
			cableInfos = new BasicInternalEList<CableInfo>(CableInfo.class);
		}
		return cableInfos;
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
			case InfAssetsPackage.DUCT__DUCT_BANK_INFO:
				if (ductBankInfo != null)
					msgs = ((InternalEObject)ductBankInfo).eInverseRemove(this, InfAssetsPackage.DUCT_BANK__DUCT_INFOS, DuctBank.class, msgs);
				return basicSetDuctBankInfo((DuctBank)otherEnd, msgs);
			case InfAssetsPackage.DUCT__CABLE_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCableInfos()).basicAdd(otherEnd, msgs);
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
			case InfAssetsPackage.DUCT__DUCT_BANK_INFO:
				return basicSetDuctBankInfo(null, msgs);
			case InfAssetsPackage.DUCT__CABLE_INFOS:
				return ((InternalEList<?>)getCableInfos()).basicRemove(otherEnd, msgs);
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
			case InfAssetsPackage.DUCT__XCOORD:
				return getXCoord();
			case InfAssetsPackage.DUCT__YCOORD:
				return getYCoord();
			case InfAssetsPackage.DUCT__DUCT_BANK_INFO:
				if (resolve) return getDuctBankInfo();
				return basicGetDuctBankInfo();
			case InfAssetsPackage.DUCT__CABLE_INFOS:
				return getCableInfos();
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
			case InfAssetsPackage.DUCT__XCOORD:
				setXCoord((Integer)newValue);
				return;
			case InfAssetsPackage.DUCT__YCOORD:
				setYCoord((Integer)newValue);
				return;
			case InfAssetsPackage.DUCT__DUCT_BANK_INFO:
				setDuctBankInfo((DuctBank)newValue);
				return;
			case InfAssetsPackage.DUCT__CABLE_INFOS:
				getCableInfos().clear();
				getCableInfos().addAll((Collection<? extends CableInfo>)newValue);
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
			case InfAssetsPackage.DUCT__XCOORD:
				unsetXCoord();
				return;
			case InfAssetsPackage.DUCT__YCOORD:
				unsetYCoord();
				return;
			case InfAssetsPackage.DUCT__DUCT_BANK_INFO:
				setDuctBankInfo((DuctBank)null);
				return;
			case InfAssetsPackage.DUCT__CABLE_INFOS:
				getCableInfos().clear();
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
			case InfAssetsPackage.DUCT__XCOORD:
				return isSetXCoord();
			case InfAssetsPackage.DUCT__YCOORD:
				return isSetYCoord();
			case InfAssetsPackage.DUCT__DUCT_BANK_INFO:
				return ductBankInfo != null;
			case InfAssetsPackage.DUCT__CABLE_INFOS:
				return cableInfos != null && !cableInfos.isEmpty();
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
		result.append(", yCoord: ");
		if (yCoordESet) result.append(yCoord); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Duct
