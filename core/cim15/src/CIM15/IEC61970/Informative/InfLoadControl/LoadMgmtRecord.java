/**
 */
package CIM15.IEC61970.Informative.InfLoadControl;

import CIM15.IEC61968.Common.ActivityRecord;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Mgmt Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadMgmtRecord extends ActivityRecord {
	/**
	 * The cached value of the '{@link #getLoadMgmtFunction() <em>Load Mgmt Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadMgmtFunction()
	 * @generated
	 * @ordered
	 */
	protected LoadMgmtFunction loadMgmtFunction;

	/**
	 * The default value of the '{@link #getLoadReduction() <em>Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReduction()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_REDUCTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadReduction() <em>Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReduction()
	 * @generated
	 * @ordered
	 */
	protected float loadReduction = LOAD_REDUCTION_EDEFAULT;

	/**
	 * This is true if the Load Reduction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean loadReductionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadMgmtRecord() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfLoadControlPackage.Literals.LOAD_MGMT_RECORD;
	}

	/**
	 * Returns the value of the '<em><b>Load Mgmt Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords <em>Load Mgmt Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Mgmt Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Mgmt Function</em>' reference.
	 * @see #setLoadMgmtFunction(LoadMgmtFunction)
	 * @see CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtFunction#getLoadMgmtRecords
	 * @generated
	 */
	public LoadMgmtFunction getLoadMgmtFunction() {
		if (loadMgmtFunction != null && loadMgmtFunction.eIsProxy()) {
			InternalEObject oldLoadMgmtFunction = (InternalEObject)loadMgmtFunction;
			loadMgmtFunction = (LoadMgmtFunction)eResolveProxy(oldLoadMgmtFunction);
			if (loadMgmtFunction != oldLoadMgmtFunction) {
			}
		}
		return loadMgmtFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMgmtFunction basicGetLoadMgmtFunction() {
		return loadMgmtFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadMgmtFunction(LoadMgmtFunction newLoadMgmtFunction, NotificationChain msgs) {
		LoadMgmtFunction oldLoadMgmtFunction = loadMgmtFunction;
		loadMgmtFunction = newLoadMgmtFunction;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadMgmtFunction <em>Load Mgmt Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Mgmt Function</em>' reference.
	 * @see #getLoadMgmtFunction()
	 * @generated
	 */
	public void setLoadMgmtFunction(LoadMgmtFunction newLoadMgmtFunction) {
		if (newLoadMgmtFunction != loadMgmtFunction) {
			NotificationChain msgs = null;
			if (loadMgmtFunction != null)
				msgs = ((InternalEObject)loadMgmtFunction).eInverseRemove(this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS, LoadMgmtFunction.class, msgs);
			if (newLoadMgmtFunction != null)
				msgs = ((InternalEObject)newLoadMgmtFunction).eInverseAdd(this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS, LoadMgmtFunction.class, msgs);
			msgs = basicSetLoadMgmtFunction(newLoadMgmtFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Load Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Reduction</em>' attribute.
	 * @see #isSetLoadReduction()
	 * @see #unsetLoadReduction()
	 * @see #setLoadReduction(float)
	 * @generated
	 */
	public float getLoadReduction() {
		return loadReduction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Reduction</em>' attribute.
	 * @see #isSetLoadReduction()
	 * @see #unsetLoadReduction()
	 * @see #getLoadReduction()
	 * @generated
	 */
	public void setLoadReduction(float newLoadReduction) {
		loadReduction = newLoadReduction;
		loadReductionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLoadReduction()
	 * @see #getLoadReduction()
	 * @see #setLoadReduction(float)
	 * @generated
	 */
	public void unsetLoadReduction() {
		loadReduction = LOAD_REDUCTION_EDEFAULT;
		loadReductionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfLoadControl.LoadMgmtRecord#getLoadReduction <em>Load Reduction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Load Reduction</em>' attribute is set.
	 * @see #unsetLoadReduction()
	 * @see #getLoadReduction()
	 * @see #setLoadReduction(float)
	 * @generated
	 */
	public boolean isSetLoadReduction() {
		return loadReductionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				if (loadMgmtFunction != null)
					msgs = ((InternalEObject)loadMgmtFunction).eInverseRemove(this, InfLoadControlPackage.LOAD_MGMT_FUNCTION__LOAD_MGMT_RECORDS, LoadMgmtFunction.class, msgs);
				return basicSetLoadMgmtFunction((LoadMgmtFunction)otherEnd, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				return basicSetLoadMgmtFunction(null, msgs);
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				if (resolve) return getLoadMgmtFunction();
				return basicGetLoadMgmtFunction();
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				return getLoadReduction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				setLoadMgmtFunction((LoadMgmtFunction)newValue);
				return;
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				setLoadReduction((Float)newValue);
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				setLoadMgmtFunction((LoadMgmtFunction)null);
				return;
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				unsetLoadReduction();
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
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_MGMT_FUNCTION:
				return loadMgmtFunction != null;
			case InfLoadControlPackage.LOAD_MGMT_RECORD__LOAD_REDUCTION:
				return isSetLoadReduction();
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
		result.append(" (loadReduction: ");
		if (loadReductionESet) result.append(loadReduction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // LoadMgmtRecord
