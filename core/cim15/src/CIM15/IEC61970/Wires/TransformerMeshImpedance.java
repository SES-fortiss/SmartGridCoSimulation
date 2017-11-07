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
 * A representation of the model object '<em><b>Transformer Mesh Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEnd <em>To Transformer End</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getToTransformerEndInfo <em>To Transformer End Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX0 <em>X0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR0 <em>R0</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerMeshImpedance extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getFromTransformerEndInfo() <em>From Transformer End Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTransformerEndInfo()
	 * @generated
	 * @ordered
	 */
	protected TransformerEndInfo fromTransformerEndInfo;

	/**
	 * The cached value of the '{@link #getToTransformerEnd() <em>To Transformer End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerEnd> toTransformerEnd;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * This is true if the R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rESet;

	/**
	 * The cached value of the '{@link #getToTransformerEndInfo() <em>To Transformer End Info</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTransformerEndInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerEndInfo> toTransformerEndInfo;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected float x0 = X0_EDEFAULT;

	/**
	 * This is true if the X0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x0ESet;

	/**
	 * The cached value of the '{@link #getFromTransformerEnd() <em>From Transformer End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTransformerEnd()
	 * @generated
	 * @ordered
	 */
	protected TransformerEnd fromTransformerEnd;

	/**
	 * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected float r0 = R0_EDEFAULT;

	/**
	 * This is true if the R0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean r0ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerMeshImpedance() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.TRANSFORMER_MESH_IMPEDANCE;
	}

	/**
	 * Returns the value of the '<em><b>From Transformer End Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getFromMeshImpedance <em>From Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Transformer End Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Transformer End Info</em>' reference.
	 * @see #setFromTransformerEndInfo(TransformerEndInfo)
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getFromMeshImpedance
	 * @generated
	 */
	public TransformerEndInfo getFromTransformerEndInfo() {
		if (fromTransformerEndInfo != null && fromTransformerEndInfo.eIsProxy()) {
			InternalEObject oldFromTransformerEndInfo = (InternalEObject)fromTransformerEndInfo;
			fromTransformerEndInfo = (TransformerEndInfo)eResolveProxy(oldFromTransformerEndInfo);
			if (fromTransformerEndInfo != oldFromTransformerEndInfo) {
			}
		}
		return fromTransformerEndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEndInfo basicGetFromTransformerEndInfo() {
		return fromTransformerEndInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromTransformerEndInfo(TransformerEndInfo newFromTransformerEndInfo, NotificationChain msgs) {
		TransformerEndInfo oldFromTransformerEndInfo = fromTransformerEndInfo;
		fromTransformerEndInfo = newFromTransformerEndInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEndInfo <em>From Transformer End Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Transformer End Info</em>' reference.
	 * @see #getFromTransformerEndInfo()
	 * @generated
	 */
	public void setFromTransformerEndInfo(TransformerEndInfo newFromTransformerEndInfo) {
		if (newFromTransformerEndInfo != fromTransformerEndInfo) {
			NotificationChain msgs = null;
			if (fromTransformerEndInfo != null)
				msgs = ((InternalEObject)fromTransformerEndInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE, TransformerEndInfo.class, msgs);
			if (newFromTransformerEndInfo != null)
				msgs = ((InternalEObject)newFromTransformerEndInfo).eInverseAdd(this, AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE, TransformerEndInfo.class, msgs);
			msgs = basicSetFromTransformerEndInfo(newFromTransformerEndInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>To Transformer End</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Wires.TransformerEnd}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getToMeshImpedance <em>To Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Transformer End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Transformer End</em>' reference list.
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getToMeshImpedance
	 * @generated
	 */
	public EList<TransformerEnd> getToTransformerEnd() {
		if (toTransformerEnd == null) {
			toTransformerEnd = new BasicInternalEList<TransformerEnd>(TransformerEnd.class);
		}
		return toTransformerEnd;
	}

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #setR(float)
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #getR()
	 * @generated
	 */
	public void setR(float newR) {
		r = newR;
		rESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public void unsetR() {
		r = R_EDEFAULT;
		rESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR <em>R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R</em>' attribute is set.
	 * @see #unsetR()
	 * @see #getR()
	 * @see #setR(float)
	 * @generated
	 */
	public boolean isSetR() {
		return rESet;
	}

	/**
	 * Returns the value of the '<em><b>To Transformer End Info</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61968.AssetModels.TransformerEndInfo}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.TransformerEndInfo#getToMeshImpedance <em>To Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Transformer End Info</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Transformer End Info</em>' reference list.
	 * @see CIM15.IEC61968.AssetModels.TransformerEndInfo#getToMeshImpedance
	 * @generated
	 */
	public EList<TransformerEndInfo> getToTransformerEndInfo() {
		if (toTransformerEndInfo == null) {
			toTransformerEndInfo = new BasicInternalEList<TransformerEndInfo>(TransformerEndInfo.class);
		}
		return toTransformerEndInfo;
	}

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	public void setX(float newX) {
		x = newX;
		xESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public void unsetX() {
		x = X_EDEFAULT;
		xESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * Returns the value of the '<em><b>X0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X0</em>' attribute.
	 * @see #isSetX0()
	 * @see #unsetX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public float getX0() {
		return x0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' attribute.
	 * @see #isSetX0()
	 * @see #unsetX0()
	 * @see #getX0()
	 * @generated
	 */
	public void setX0(float newX0) {
		x0 = newX0;
		x0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX0 <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX0()
	 * @see #getX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public void unsetX0() {
		x0 = X0_EDEFAULT;
		x0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getX0 <em>X0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X0</em>' attribute is set.
	 * @see #unsetX0()
	 * @see #getX0()
	 * @see #setX0(float)
	 * @generated
	 */
	public boolean isSetX0() {
		return x0ESet;
	}

	/**
	 * Returns the value of the '<em><b>From Transformer End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getFromMeshImpedance <em>From Mesh Impedance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Transformer End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Transformer End</em>' reference.
	 * @see #setFromTransformerEnd(TransformerEnd)
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getFromMeshImpedance
	 * @generated
	 */
	public TransformerEnd getFromTransformerEnd() {
		if (fromTransformerEnd != null && fromTransformerEnd.eIsProxy()) {
			InternalEObject oldFromTransformerEnd = (InternalEObject)fromTransformerEnd;
			fromTransformerEnd = (TransformerEnd)eResolveProxy(oldFromTransformerEnd);
			if (fromTransformerEnd != oldFromTransformerEnd) {
			}
		}
		return fromTransformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEnd basicGetFromTransformerEnd() {
		return fromTransformerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromTransformerEnd(TransformerEnd newFromTransformerEnd, NotificationChain msgs) {
		TransformerEnd oldFromTransformerEnd = fromTransformerEnd;
		fromTransformerEnd = newFromTransformerEnd;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getFromTransformerEnd <em>From Transformer End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Transformer End</em>' reference.
	 * @see #getFromTransformerEnd()
	 * @generated
	 */
	public void setFromTransformerEnd(TransformerEnd newFromTransformerEnd) {
		if (newFromTransformerEnd != fromTransformerEnd) {
			NotificationChain msgs = null;
			if (fromTransformerEnd != null)
				msgs = ((InternalEObject)fromTransformerEnd).eInverseRemove(this, WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE, TransformerEnd.class, msgs);
			if (newFromTransformerEnd != null)
				msgs = ((InternalEObject)newFromTransformerEnd).eInverseAdd(this, WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE, TransformerEnd.class, msgs);
			msgs = basicSetFromTransformerEnd(newFromTransformerEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>R0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R0</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R0</em>' attribute.
	 * @see #isSetR0()
	 * @see #unsetR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public float getR0() {
		return r0;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R0</em>' attribute.
	 * @see #isSetR0()
	 * @see #unsetR0()
	 * @see #getR0()
	 * @generated
	 */
	public void setR0(float newR0) {
		r0 = newR0;
		r0ESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR0 <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR0()
	 * @see #getR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public void unsetR0() {
		r0 = R0_EDEFAULT;
		r0ESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.TransformerMeshImpedance#getR0 <em>R0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R0</em>' attribute is set.
	 * @see #unsetR0()
	 * @see #getR0()
	 * @see #setR0(float)
	 * @generated
	 */
	public boolean isSetR0() {
		return r0ESet;
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
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
				if (fromTransformerEndInfo != null)
					msgs = ((InternalEObject)fromTransformerEndInfo).eInverseRemove(this, AssetModelsPackage.TRANSFORMER_END_INFO__FROM_MESH_IMPEDANCE, TransformerEndInfo.class, msgs);
				return basicSetFromTransformerEndInfo((TransformerEndInfo)otherEnd, msgs);
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToTransformerEnd()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToTransformerEndInfo()).basicAdd(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
				if (fromTransformerEnd != null)
					msgs = ((InternalEObject)fromTransformerEnd).eInverseRemove(this, WiresPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE, TransformerEnd.class, msgs);
				return basicSetFromTransformerEnd((TransformerEnd)otherEnd, msgs);
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
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
				return basicSetFromTransformerEndInfo(null, msgs);
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
				return ((InternalEList<?>)getToTransformerEnd()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO:
				return ((InternalEList<?>)getToTransformerEndInfo()).basicRemove(otherEnd, msgs);
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
				return basicSetFromTransformerEnd(null, msgs);
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
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
				if (resolve) return getFromTransformerEndInfo();
				return basicGetFromTransformerEndInfo();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
				return getToTransformerEnd();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R:
				return getR();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO:
				return getToTransformerEndInfo();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X:
				return getX();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
				return getX0();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
				if (resolve) return getFromTransformerEnd();
				return basicGetFromTransformerEnd();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
				return getR0();
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
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
				setFromTransformerEndInfo((TransformerEndInfo)newValue);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
				getToTransformerEnd().clear();
				getToTransformerEnd().addAll((Collection<? extends TransformerEnd>)newValue);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R:
				setR((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO:
				getToTransformerEndInfo().clear();
				getToTransformerEndInfo().addAll((Collection<? extends TransformerEndInfo>)newValue);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X:
				setX((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
				setX0((Float)newValue);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
				setFromTransformerEnd((TransformerEnd)newValue);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
				setR0((Float)newValue);
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
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
				setFromTransformerEndInfo((TransformerEndInfo)null);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
				getToTransformerEnd().clear();
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R:
				unsetR();
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO:
				getToTransformerEndInfo().clear();
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X:
				unsetX();
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
				unsetX0();
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
				setFromTransformerEnd((TransformerEnd)null);
				return;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
				unsetR0();
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
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END_INFO:
				return fromTransformerEndInfo != null;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END:
				return toTransformerEnd != null && !toTransformerEnd.isEmpty();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R:
				return isSetR();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END_INFO:
				return toTransformerEndInfo != null && !toTransformerEndInfo.isEmpty();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X:
				return isSetX();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__X0:
				return isSetX0();
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END:
				return fromTransformerEnd != null;
			case WiresPackage.TRANSFORMER_MESH_IMPEDANCE__R0:
				return isSetR0();
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
		result.append(" (r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", x0: ");
		if (x0ESet) result.append(x0); else result.append("<unset>");
		result.append(", r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TransformerMeshImpedance
