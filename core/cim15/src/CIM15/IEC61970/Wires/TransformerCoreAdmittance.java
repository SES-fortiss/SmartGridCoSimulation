/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.TransformerEndInfo;

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
 * A representation of the model object '<em><b>Transformer Core Admittance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG0 <em>G0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB0 <em>B0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG <em>G</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEndInfo <em>Transformer End Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerCoreAdmittance extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected static final float G0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0()
	 * @generated
	 * @ordered
	 */
	protected float g0 = G0_EDEFAULT;

	/**
	 * This is true if the G0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean g0ESet;

	/**
	 * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected static final float B0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0()
	 * @generated
	 * @ordered
	 */
	protected float b0 = B0_EDEFAULT;

	/**
	 * This is true if the B0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean b0ESet;

	/**
	 * The default value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected static final float G_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected float g = G_EDEFAULT;

	/**
	 * This is true if the G attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gESet;

	/**
	 * The cached value of the '{@link #getTransformerEndInfo() <em>Transformer End Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEndInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerEndInfo transformerEndInfo;

	/**
	 * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerEnd> transformerEnd;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final float B_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected float b = B_EDEFAULT;

	/**
	 * This is true if the B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerCoreAdmittance() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_CORE_ADMITTANCE;
	}

	/**
	 * Returns the value of the '<em><b>G0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0</em>' attribute.
	 * @see #isSetG0()
	 * @see #unsetG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public float getG0() {
		return g0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0</em>' attribute.
	 * @see #isSetG0()
	 * @see #unsetG0()
	 * @see #getG0()
	 * @generated
	 */
	public void setG0(float newG0) {
		g0 = newG0;
		g0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG0 <em>G0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG0()
	 * @see #getG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public void unsetG0() {
		g0 = G0_EDEFAULT;
		g0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG0 <em>G0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G0</em>' attribute is set.
	 * @see #unsetG0()
	 * @see #getG0()
	 * @see #setG0(float)
	 * @generated
	 */
	public boolean isSetG0() {
		return g0ESet;
	}

	/**
	 * Returns the value of the '<em><b>B0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0</em>' attribute.
	 * @see #isSetB0()
	 * @see #unsetB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public float getB0() {
		return b0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0</em>' attribute.
	 * @see #isSetB0()
	 * @see #unsetB0()
	 * @see #getB0()
	 * @generated
	 */
	public void setB0(float newB0) {
		b0 = newB0;
		b0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB0 <em>B0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB0()
	 * @see #getB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public void unsetB0() {
		b0 = B0_EDEFAULT;
		b0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB0 <em>B0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B0</em>' attribute is set.
	 * @see #unsetB0()
	 * @see #getB0()
	 * @see #setB0(float)
	 * @generated
	 */
	public boolean isSetB0() {
		return b0ESet;
	}

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #isSetG()
	 * @see #unsetG()
	 * @see #setG(float)
	 * @generated
	 */
	public float getG() {
		return g;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' attribute.
	 * @see #isSetG()
	 * @see #unsetG()
	 * @see #getG()
	 * @generated
	 */
	public void setG(float newG) {
		g = newG;
		gESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG <em>G</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG()
	 * @see #getG()
	 * @see #setG(float)
	 * @generated
	 */
	public void unsetG() {
		g = G_EDEFAULT;
		gESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getG <em>G</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G</em>' attribute is set.
	 * @see #unsetG()
	 * @see #getG()
	 * @see #setG(float)
	 * @generated
	 */
	public boolean isSetG() {
		return gESet;
	}

	/**
	 * Returns the value of the '<em><b>Transformer End Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getCoreAdmittance <em>Core Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End Info</em>' reference.
	 * @see #setTransformerEndInfo(TransformerEndInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getCoreAdmittance
	 * @generated
	 */
	public TransformerEndInfo getTransformerEndInfo() {
		if (transformerEndInfo != null && transformerEndInfo.eIsProxy()) {
			InternalEObject oldTransformerEndInfo = (InternalEObject)transformerEndInfo;
			transformerEndInfo = (TransformerEndInfo)eResolveProxy(oldTransformerEndInfo);
			if (transformerEndInfo != oldTransformerEndInfo) {
			}
		}
		return transformerEndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEndInfo basicGetTransformerEndInfo() {
		return transformerEndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerEndInfo(TransformerEndInfo newTransformerEndInfo, NotificationChain msgs) {
		TransformerEndInfo oldTransformerEndInfo = transformerEndInfo;
		transformerEndInfo = newTransformerEndInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getTransformerEndInfo <em>Transformer End Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer End Info</em>' reference.
	 * @see #getTransformerEndInfo()
	 * @generated
	 */
	public void setTransformerEndInfo(TransformerEndInfo newTransformerEndInfo) {
		if (newTransformerEndInfo != transformerEndInfo) {
			NotificationChain msgs = null;
			if (transformerEndInfo != null)
				msgs = ((InternalEObject)transformerEndInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, TransformerEndInfo.class, msgs);
			if (newTransformerEndInfo != null)
				msgs = ((InternalEObject)newTransformerEndInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, TransformerEndInfo.class, msgs);
			msgs = basicSetTransformerEndInfo(newTransformerEndInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer End</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerEnd}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getCoreAdmittance <em>Core Admittance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer End</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getCoreAdmittance
	 * @generated
	 */
	public EList<TransformerEnd> getTransformerEnd() {
		if (transformerEnd == null) {
			transformerEnd = new BasicInternalEList<TransformerEnd>(TransformerEnd.class);
		}
		return transformerEnd;
	}

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #setB(float)
	 * @generated
	 */
	public float getB() {
		return b;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #getB()
	 * @generated
	 */
	public void setB(float newB) {
		b = newB;
		bESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public void unsetB() {
		b = B_EDEFAULT;
		bESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerCoreAdmittance#getB <em>B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B</em>' attribute is set.
	 * @see #unsetB()
	 * @see #getB()
	 * @see #setB(float)
	 * @generated
	 */
	public boolean isSetB() {
		return bESet;
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
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
				if (transformerEndInfo != null)
					msgs = ((InternalEObject)transformerEndInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__CORE_ADMITTANCE, TransformerEndInfo.class, msgs);
				return basicSetTransformerEndInfo((TransformerEndInfo)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerEnd()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
				return basicSetTransformerEndInfo(null, msgs);
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
				return ((InternalEList<?>)getTransformerEnd()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
				return getG0();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
				return getB0();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G:
				return getG();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
				if (resolve) return getTransformerEndInfo();
				return basicGetTransformerEndInfo();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
				return getTransformerEnd();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B:
				return getB();
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
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
				setG0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
				setB0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G:
				setG((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
				setTransformerEndInfo((TransformerEndInfo)newValue);
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
				getTransformerEnd().clear();
				getTransformerEnd().addAll((Collection<? extends TransformerEnd>)newValue);
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B:
				setB((Float)newValue);
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
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
				unsetG0();
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
				unsetB0();
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G:
				unsetG();
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
				setTransformerEndInfo((TransformerEndInfo)null);
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
				getTransformerEnd().clear();
				return;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B:
				unsetB();
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
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G0:
				return isSetG0();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B0:
				return isSetB0();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__G:
				return isSetG();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END_INFO:
				return transformerEndInfo != null;
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END:
				return transformerEnd != null && !transformerEnd.isEmpty();
			case WiresPackage.TRANSFORMER_CORE_ADMITTANCE__B:
				return isSetB();
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
		result.append(" (g0: ");
		if (g0ESet) result.append(g0); else result.append("<unset>");
		result.append(", b0: ");
		if (b0ESet) result.append(b0); else result.append("<unset>");
		result.append(", g: ");
		if (gESet) result.append(g); else result.append("<unset>");
		result.append(", b: ");
		if (bESet) result.append(b); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerCoreAdmittance
