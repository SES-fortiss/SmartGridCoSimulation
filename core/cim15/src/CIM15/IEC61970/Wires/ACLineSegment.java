/**
 */
package CIM15.IEC61970.Wires;

import CIM15.IEC61968.AssetModels.AssetModelsPackage;
import CIM15.IEC61968.AssetModels.ConductorInfo;

import CIM15.IEC61970.CutsJumpers.Clamp;
import CIM15.IEC61970.CutsJumpers.Cut;

import CIM15.IEC61970.Informative.InfAssets.ConductorAsset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getSequenceImpedance <em>Sequence Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getConductorAssets <em>Conductor Assets</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getR <em>R</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getX <em>X</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getConductorInfo <em>Conductor Info</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getCut <em>Cut</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getPhaseImpedance <em>Phase Impedance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getClamp <em>Clamp</em>}</li>
 *   <li>{@link CIM15.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ACLineSegment extends Conductor {
	/**
	 * The default value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0ch()
	 * @generated
	 * @ordered
	 */
	protected static final float G0CH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG0ch()
	 * @generated
	 * @ordered
	 */
	protected float g0ch = G0CH_EDEFAULT;

	/**
	 * This is true if the G0ch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean g0chESet;

	/**
	 * The cached value of the '{@link #getSequenceImpedance() <em>Sequence Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceImpedance()
	 * @generated
	 * @ordered
	 */
	protected PerLengthSequenceImpedance sequenceImpedance;

	/**
	 * The cached value of the '{@link #getConductorAssets() <em>Conductor Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductorAsset> conductorAssets;

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
	 * The cached value of the '{@link #getConductorInfo() <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorInfo()
	 * @generated
	 * @ordered
	 */
	protected ConductorInfo conductorInfo;

	/**
	 * The default value of the '{@link #getGch() <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGch()
	 * @generated
	 * @ordered
	 */
	protected static final float GCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGch() <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGch()
	 * @generated
	 * @ordered
	 */
	protected float gch = GCH_EDEFAULT;

	/**
	 * This is true if the Gch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gchESet;

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
	 * The default value of the '{@link #getBch() <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBch()
	 * @generated
	 * @ordered
	 */
	protected static final float BCH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBch() <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBch()
	 * @generated
	 * @ordered
	 */
	protected float bch = BCH_EDEFAULT;

	/**
	 * This is true if the Bch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bchESet;

	/**
	 * The default value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0ch()
	 * @generated
	 * @ordered
	 */
	protected static final float B0CH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB0ch()
	 * @generated
	 * @ordered
	 */
	protected float b0ch = B0CH_EDEFAULT;

	/**
	 * This is true if the B0ch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean b0chESet;

	/**
	 * The cached value of the '{@link #getCut() <em>Cut</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCut()
	 * @generated
	 * @ordered
	 */
	protected EList<Cut> cut;

	/**
	 * The cached value of the '{@link #getPhaseImpedance() <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseImpedance()
	 * @generated
	 * @ordered
	 */
	protected PerLengthPhaseImpedance phaseImpedance;

	/**
	 * The cached value of the '{@link #getClamp() <em>Clamp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClamp()
	 * @generated
	 * @ordered
	 */
	protected EList<Clamp> clamp;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACLineSegment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.AC_LINE_SEGMENT;
	}

	/**
	 * Returns the value of the '<em><b>G0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G0ch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>G0ch</em>' attribute.
	 * @see #isSetG0ch()
	 * @see #unsetG0ch()
	 * @see #setG0ch(float)
	 * @generated
	 */
	public float getG0ch() {
		return g0ch;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G0ch</em>' attribute.
	 * @see #isSetG0ch()
	 * @see #unsetG0ch()
	 * @see #getG0ch()
	 * @generated
	 */
	public void setG0ch(float newG0ch) {
		g0ch = newG0ch;
		g0chESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetG0ch()
	 * @see #getG0ch()
	 * @see #setG0ch(float)
	 * @generated
	 */
	public void unsetG0ch() {
		g0ch = G0CH_EDEFAULT;
		g0chESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getG0ch <em>G0ch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>G0ch</em>' attribute is set.
	 * @see #unsetG0ch()
	 * @see #getG0ch()
	 * @see #setG0ch(float)
	 * @generated
	 */
	public boolean isSetG0ch() {
		return g0chESet;
	}

	/**
	 * Returns the value of the '<em><b>Sequence Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getLineSegments <em>Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Impedance</em>' reference.
	 * @see #setSequenceImpedance(PerLengthSequenceImpedance)
	 * @see CIM15.IEC61970.Wires.PerLengthSequenceImpedance#getLineSegments
	 * @generated
	 */
	public PerLengthSequenceImpedance getSequenceImpedance() {
		if (sequenceImpedance != null && sequenceImpedance.eIsProxy()) {
			InternalEObject oldSequenceImpedance = (InternalEObject)sequenceImpedance;
			sequenceImpedance = (PerLengthSequenceImpedance)eResolveProxy(oldSequenceImpedance);
			if (sequenceImpedance != oldSequenceImpedance) {
			}
		}
		return sequenceImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthSequenceImpedance basicGetSequenceImpedance() {
		return sequenceImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceImpedance(PerLengthSequenceImpedance newSequenceImpedance, NotificationChain msgs) {
		PerLengthSequenceImpedance oldSequenceImpedance = sequenceImpedance;
		sequenceImpedance = newSequenceImpedance;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getSequenceImpedance <em>Sequence Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Impedance</em>' reference.
	 * @see #getSequenceImpedance()
	 * @generated
	 */
	public void setSequenceImpedance(PerLengthSequenceImpedance newSequenceImpedance) {
		if (newSequenceImpedance != sequenceImpedance) {
			NotificationChain msgs = null;
			if (sequenceImpedance != null)
				msgs = ((InternalEObject)sequenceImpedance).eInverseRemove(this, WiresPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__LINE_SEGMENTS, PerLengthSequenceImpedance.class, msgs);
			if (newSequenceImpedance != null)
				msgs = ((InternalEObject)newSequenceImpedance).eInverseAdd(this, WiresPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__LINE_SEGMENTS, PerLengthSequenceImpedance.class, msgs);
			msgs = basicSetSequenceImpedance(newSequenceImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Conductor Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Assets</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment
	 * @generated
	 */
	public EList<ConductorAsset> getConductorAssets() {
		if (conductorAssets == null) {
			conductorAssets = new BasicInternalEList<ConductorAsset>(ConductorAsset.class);
		}
		return conductorAssets;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getR <em>R</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getR <em>R</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getR <em>R</em>}' attribute is set.
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getX <em>X</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getX <em>X</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Conductor Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.AssetModels.ConductorInfo#getLineSegments <em>Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Info</em>' reference.
	 * @see #setConductorInfo(ConductorInfo)
	 * @see CIM15.IEC61968.AssetModels.ConductorInfo#getLineSegments
	 * @generated
	 */
	public ConductorInfo getConductorInfo() {
		if (conductorInfo != null && conductorInfo.eIsProxy()) {
			InternalEObject oldConductorInfo = (InternalEObject)conductorInfo;
			conductorInfo = (ConductorInfo)eResolveProxy(oldConductorInfo);
			if (conductorInfo != oldConductorInfo) {
			}
		}
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductorInfo basicGetConductorInfo() {
		return conductorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductorInfo(ConductorInfo newConductorInfo, NotificationChain msgs) {
		ConductorInfo oldConductorInfo = conductorInfo;
		conductorInfo = newConductorInfo;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getConductorInfo <em>Conductor Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Info</em>' reference.
	 * @see #getConductorInfo()
	 * @generated
	 */
	public void setConductorInfo(ConductorInfo newConductorInfo) {
		if (newConductorInfo != conductorInfo) {
			NotificationChain msgs = null;
			if (conductorInfo != null)
				msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS, ConductorInfo.class, msgs);
			if (newConductorInfo != null)
				msgs = ((InternalEObject)newConductorInfo).eInverseAdd(this, AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS, ConductorInfo.class, msgs);
			msgs = basicSetConductorInfo(newConductorInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Gch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gch</em>' attribute.
	 * @see #isSetGch()
	 * @see #unsetGch()
	 * @see #setGch(float)
	 * @generated
	 */
	public float getGch() {
		return gch;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gch</em>' attribute.
	 * @see #isSetGch()
	 * @see #unsetGch()
	 * @see #getGch()
	 * @generated
	 */
	public void setGch(float newGch) {
		gch = newGch;
		gchESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGch()
	 * @see #getGch()
	 * @see #setGch(float)
	 * @generated
	 */
	public void unsetGch() {
		gch = GCH_EDEFAULT;
		gchESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getGch <em>Gch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gch</em>' attribute is set.
	 * @see #unsetGch()
	 * @see #getGch()
	 * @see #setGch(float)
	 * @generated
	 */
	public boolean isSetGch() {
		return gchESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getR0 <em>R0</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Bch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bch</em>' attribute.
	 * @see #isSetBch()
	 * @see #unsetBch()
	 * @see #setBch(float)
	 * @generated
	 */
	public float getBch() {
		return bch;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bch</em>' attribute.
	 * @see #isSetBch()
	 * @see #unsetBch()
	 * @see #getBch()
	 * @generated
	 */
	public void setBch(float newBch) {
		bch = newBch;
		bchESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBch()
	 * @see #getBch()
	 * @see #setBch(float)
	 * @generated
	 */
	public void unsetBch() {
		bch = BCH_EDEFAULT;
		bchESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getBch <em>Bch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bch</em>' attribute is set.
	 * @see #unsetBch()
	 * @see #getBch()
	 * @see #setBch(float)
	 * @generated
	 */
	public boolean isSetBch() {
		return bchESet;
	}

	/**
	 * Returns the value of the '<em><b>B0ch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B0ch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B0ch</em>' attribute.
	 * @see #isSetB0ch()
	 * @see #unsetB0ch()
	 * @see #setB0ch(float)
	 * @generated
	 */
	public float getB0ch() {
		return b0ch;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B0ch</em>' attribute.
	 * @see #isSetB0ch()
	 * @see #unsetB0ch()
	 * @see #getB0ch()
	 * @generated
	 */
	public void setB0ch(float newB0ch) {
		b0ch = newB0ch;
		b0chESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB0ch()
	 * @see #getB0ch()
	 * @see #setB0ch(float)
	 * @generated
	 */
	public void unsetB0ch() {
		b0ch = B0CH_EDEFAULT;
		b0chESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getB0ch <em>B0ch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B0ch</em>' attribute is set.
	 * @see #unsetB0ch()
	 * @see #getB0ch()
	 * @see #setB0ch(float)
	 * @generated
	 */
	public boolean isSetB0ch() {
		return b0chESet;
	}

	/**
	 * Returns the value of the '<em><b>Cut</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.CutsJumpers.Cut}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.CutsJumpers.Cut#getACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut</em>' reference list.
	 * @see CIM15.IEC61970.CutsJumpers.Cut#getACLineSegment
	 * @generated
	 */
	public EList<Cut> getCut() {
		if (cut == null) {
			cut = new BasicInternalEList<Cut>(Cut.class);
		}
		return cut;
	}

	/**
	 * Returns the value of the '<em><b>Phase Impedance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getLineSegments <em>Line Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Impedance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Impedance</em>' reference.
	 * @see #setPhaseImpedance(PerLengthPhaseImpedance)
	 * @see CIM15.IEC61970.Wires.PerLengthPhaseImpedance#getLineSegments
	 * @generated
	 */
	public PerLengthPhaseImpedance getPhaseImpedance() {
		if (phaseImpedance != null && phaseImpedance.eIsProxy()) {
			InternalEObject oldPhaseImpedance = (InternalEObject)phaseImpedance;
			phaseImpedance = (PerLengthPhaseImpedance)eResolveProxy(oldPhaseImpedance);
			if (phaseImpedance != oldPhaseImpedance) {
			}
		}
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerLengthPhaseImpedance basicGetPhaseImpedance() {
		return phaseImpedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance, NotificationChain msgs) {
		PerLengthPhaseImpedance oldPhaseImpedance = phaseImpedance;
		phaseImpedance = newPhaseImpedance;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getPhaseImpedance <em>Phase Impedance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Impedance</em>' reference.
	 * @see #getPhaseImpedance()
	 * @generated
	 */
	public void setPhaseImpedance(PerLengthPhaseImpedance newPhaseImpedance) {
		if (newPhaseImpedance != phaseImpedance) {
			NotificationChain msgs = null;
			if (phaseImpedance != null)
				msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS, PerLengthPhaseImpedance.class, msgs);
			if (newPhaseImpedance != null)
				msgs = ((InternalEObject)newPhaseImpedance).eInverseAdd(this, WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS, PerLengthPhaseImpedance.class, msgs);
			msgs = basicSetPhaseImpedance(newPhaseImpedance, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Clamp</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.CutsJumpers.Clamp}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.CutsJumpers.Clamp#getACLineSegment <em>AC Line Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clamp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clamp</em>' reference list.
	 * @see CIM15.IEC61970.CutsJumpers.Clamp#getACLineSegment
	 * @generated
	 */
	public EList<Clamp> getClamp() {
		if (clamp == null) {
			clamp = new BasicInternalEList<Clamp>(Clamp.class);
		}
		return clamp;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Wires.ACLineSegment#getX0 <em>X0</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				if (sequenceImpedance != null)
					msgs = ((InternalEObject)sequenceImpedance).eInverseRemove(this, WiresPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__LINE_SEGMENTS, PerLengthSequenceImpedance.class, msgs);
				return basicSetSequenceImpedance((PerLengthSequenceImpedance)otherEnd, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductorAssets()).basicAdd(otherEnd, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_INFO:
				if (conductorInfo != null)
					msgs = ((InternalEObject)conductorInfo).eInverseRemove(this, AssetModelsPackage.CONDUCTOR_INFO__LINE_SEGMENTS, ConductorInfo.class, msgs);
				return basicSetConductorInfo((ConductorInfo)otherEnd, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCut()).basicAdd(otherEnd, msgs);
			case WiresPackage.AC_LINE_SEGMENT__PHASE_IMPEDANCE:
				if (phaseImpedance != null)
					msgs = ((InternalEObject)phaseImpedance).eInverseRemove(this, WiresPackage.PER_LENGTH_PHASE_IMPEDANCE__LINE_SEGMENTS, PerLengthPhaseImpedance.class, msgs);
				return basicSetPhaseImpedance((PerLengthPhaseImpedance)otherEnd, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CLAMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClamp()).basicAdd(otherEnd, msgs);
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
			case WiresPackage.AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				return basicSetSequenceImpedance(null, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return ((InternalEList<?>)getConductorAssets()).basicRemove(otherEnd, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_INFO:
				return basicSetConductorInfo(null, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CUT:
				return ((InternalEList<?>)getCut()).basicRemove(otherEnd, msgs);
			case WiresPackage.AC_LINE_SEGMENT__PHASE_IMPEDANCE:
				return basicSetPhaseImpedance(null, msgs);
			case WiresPackage.AC_LINE_SEGMENT__CLAMP:
				return ((InternalEList<?>)getClamp()).basicRemove(otherEnd, msgs);
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
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				return getG0ch();
			case WiresPackage.AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				if (resolve) return getSequenceImpedance();
				return basicGetSequenceImpedance();
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return getConductorAssets();
			case WiresPackage.AC_LINE_SEGMENT__R:
				return getR();
			case WiresPackage.AC_LINE_SEGMENT__X:
				return getX();
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_INFO:
				if (resolve) return getConductorInfo();
				return basicGetConductorInfo();
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				return getGch();
			case WiresPackage.AC_LINE_SEGMENT__R0:
				return getR0();
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				return getBch();
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				return getB0ch();
			case WiresPackage.AC_LINE_SEGMENT__CUT:
				return getCut();
			case WiresPackage.AC_LINE_SEGMENT__PHASE_IMPEDANCE:
				if (resolve) return getPhaseImpedance();
				return basicGetPhaseImpedance();
			case WiresPackage.AC_LINE_SEGMENT__CLAMP:
				return getClamp();
			case WiresPackage.AC_LINE_SEGMENT__X0:
				return getX0();
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
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				setG0ch((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				setSequenceImpedance((PerLengthSequenceImpedance)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
				getConductorAssets().addAll((Collection<? extends ConductorAsset>)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__R:
				setR((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__X:
				setX((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				setGch((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				setBch((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				setB0ch((Float)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__CUT:
				getCut().clear();
				getCut().addAll((Collection<? extends Cut>)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__CLAMP:
				getClamp().clear();
				getClamp().addAll((Collection<? extends Clamp>)newValue);
				return;
			case WiresPackage.AC_LINE_SEGMENT__X0:
				setX0((Float)newValue);
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
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				unsetG0ch();
				return;
			case WiresPackage.AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				setSequenceImpedance((PerLengthSequenceImpedance)null);
				return;
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS:
				getConductorAssets().clear();
				return;
			case WiresPackage.AC_LINE_SEGMENT__R:
				unsetR();
				return;
			case WiresPackage.AC_LINE_SEGMENT__X:
				unsetX();
				return;
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_INFO:
				setConductorInfo((ConductorInfo)null);
				return;
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				unsetGch();
				return;
			case WiresPackage.AC_LINE_SEGMENT__R0:
				unsetR0();
				return;
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				unsetBch();
				return;
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				unsetB0ch();
				return;
			case WiresPackage.AC_LINE_SEGMENT__CUT:
				getCut().clear();
				return;
			case WiresPackage.AC_LINE_SEGMENT__PHASE_IMPEDANCE:
				setPhaseImpedance((PerLengthPhaseImpedance)null);
				return;
			case WiresPackage.AC_LINE_SEGMENT__CLAMP:
				getClamp().clear();
				return;
			case WiresPackage.AC_LINE_SEGMENT__X0:
				unsetX0();
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
			case WiresPackage.AC_LINE_SEGMENT__G0CH:
				return isSetG0ch();
			case WiresPackage.AC_LINE_SEGMENT__SEQUENCE_IMPEDANCE:
				return sequenceImpedance != null;
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS:
				return conductorAssets != null && !conductorAssets.isEmpty();
			case WiresPackage.AC_LINE_SEGMENT__R:
				return isSetR();
			case WiresPackage.AC_LINE_SEGMENT__X:
				return isSetX();
			case WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_INFO:
				return conductorInfo != null;
			case WiresPackage.AC_LINE_SEGMENT__GCH:
				return isSetGch();
			case WiresPackage.AC_LINE_SEGMENT__R0:
				return isSetR0();
			case WiresPackage.AC_LINE_SEGMENT__BCH:
				return isSetBch();
			case WiresPackage.AC_LINE_SEGMENT__B0CH:
				return isSetB0ch();
			case WiresPackage.AC_LINE_SEGMENT__CUT:
				return cut != null && !cut.isEmpty();
			case WiresPackage.AC_LINE_SEGMENT__PHASE_IMPEDANCE:
				return phaseImpedance != null;
			case WiresPackage.AC_LINE_SEGMENT__CLAMP:
				return clamp != null && !clamp.isEmpty();
			case WiresPackage.AC_LINE_SEGMENT__X0:
				return isSetX0();
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
		result.append(" (g0ch: ");
		if (g0chESet) result.append(g0ch); else result.append("<unset>");
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", gch: ");
		if (gchESet) result.append(gch); else result.append("<unset>");
		result.append(", r0: ");
		if (r0ESet) result.append(r0); else result.append("<unset>");
		result.append(", bch: ");
		if (bchESet) result.append(bch); else result.append("<unset>");
		result.append(", b0ch: ");
		if (b0chESet) result.append(b0ch); else result.append("<unset>");
		result.append(", x0: ");
		if (x0ESet) result.append(x0); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ACLineSegment
