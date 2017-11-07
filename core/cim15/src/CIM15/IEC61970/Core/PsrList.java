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
 * A representation of the model object '<em><b>Psr List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.PsrList#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PsrList extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResources()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerSystemResource> powerSystemResources;

	/**
	 * The default value of the '{@link #getTypePSRList() <em>Type PSR List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePSRList()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PSR_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypePSRList() <em>Type PSR List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePSRList()
	 * @generated
	 * @ordered
	 */
	protected String typePSRList = TYPE_PSR_LIST_EDEFAULT;

	/**
	 * This is true if the Type PSR List attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePSRListESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PsrList() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PSR_LIST;
	}

	/**
	 * Returns the value of the '<em><b>Power System Resources</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.PowerSystemResource}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.PowerSystemResource#getPsrLists <em>Psr Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power System Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power System Resources</em>' reference list.
	 * @see CIM15.IEC61970.Core.PowerSystemResource#getPsrLists
	 * @generated
	 */
	public EList<PowerSystemResource> getPowerSystemResources() {
		if (powerSystemResources == null) {
			powerSystemResources = new BasicInternalEList<PowerSystemResource>(PowerSystemResource.class);
		}
		return powerSystemResources;
	}

	/**
	 * Returns the value of the '<em><b>Type PSR List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type PSR List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type PSR List</em>' attribute.
	 * @see #isSetTypePSRList()
	 * @see #unsetTypePSRList()
	 * @see #setTypePSRList(String)
	 * @generated
	 */
	public String getTypePSRList() {
		return typePSRList;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type PSR List</em>' attribute.
	 * @see #isSetTypePSRList()
	 * @see #unsetTypePSRList()
	 * @see #getTypePSRList()
	 * @generated
	 */
	public void setTypePSRList(String newTypePSRList) {
		typePSRList = newTypePSRList;
		typePSRListESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePSRList()
	 * @see #getTypePSRList()
	 * @see #setTypePSRList(String)
	 * @generated
	 */
	public void unsetTypePSRList() {
		typePSRList = TYPE_PSR_LIST_EDEFAULT;
		typePSRListESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.PsrList#getTypePSRList <em>Type PSR List</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type PSR List</em>' attribute is set.
	 * @see #unsetTypePSRList()
	 * @see #getTypePSRList()
	 * @see #setTypePSRList(String)
	 * @generated
	 */
	public boolean isSetTypePSRList() {
		return typePSRListESet;
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowerSystemResources()).basicAdd(otherEnd, msgs);
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return ((InternalEList<?>)getPowerSystemResources()).basicRemove(otherEnd, msgs);
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return getPowerSystemResources();
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				return getTypePSRList();
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				getPowerSystemResources().addAll((Collection<? extends PowerSystemResource>)newValue);
				return;
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				setTypePSRList((String)newValue);
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				getPowerSystemResources().clear();
				return;
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				unsetTypePSRList();
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
			case CorePackage.PSR_LIST__POWER_SYSTEM_RESOURCES:
				return powerSystemResources != null && !powerSystemResources.isEmpty();
			case CorePackage.PSR_LIST__TYPE_PSR_LIST:
				return isSetTypePSRList();
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
		result.append(" (typePSRList: ");
		if (typePSRListESet) result.append(typePSRList); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PsrList
