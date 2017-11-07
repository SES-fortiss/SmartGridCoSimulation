/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Common.Status;

import CIM15.IEC61970.Core.IdentifiedObject;

import CIM15.IEC61970.Wires.Ground;
import CIM15.IEC61970.Wires.TransformerEnd;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Winding Insulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindingInsulation extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getInsulationPFStatus() <em>Insulation PF Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationPFStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULATION_PF_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulationPFStatus() <em>Insulation PF Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationPFStatus()
	 * @generated
	 * @ordered
	 */
	protected String insulationPFStatus = INSULATION_PF_STATUS_EDEFAULT;

	/**
	 * This is true if the Insulation PF Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulationPFStatusESet;

	/**
	 * The cached value of the '{@link #getGround() <em>Ground</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected Ground ground;

	/**
	 * The cached value of the '{@link #getTransformerObservation() <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerObservation()
	 * @generated
	 * @ordered
	 */
	protected TransformerObservation transformerObservation;

	/**
	 * The default value of the '{@link #getInsulationResistance() <em>Insulation Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationResistance()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULATION_RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulationResistance() <em>Insulation Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulationResistance()
	 * @generated
	 * @ordered
	 */
	protected String insulationResistance = INSULATION_RESISTANCE_EDEFAULT;

	/**
	 * This is true if the Insulation Resistance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulationResistanceESet;

	/**
	 * The cached value of the '{@link #getToWinding() <em>To Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToWinding()
	 * @generated
	 * @ordered
	 */
	protected TransformerEnd toWinding;

	/**
	 * The default value of the '{@link #getLeakageReactance() <em>Leakage Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageReactance()
	 * @generated
	 * @ordered
	 */
	protected static final float LEAKAGE_REACTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLeakageReactance() <em>Leakage Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeakageReactance()
	 * @generated
	 * @ordered
	 */
	protected float leakageReactance = LEAKAGE_REACTANCE_EDEFAULT;

	/**
	 * This is true if the Leakage Reactance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leakageReactanceESet;

	/**
	 * The cached value of the '{@link #getFromWinding() <em>From Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromWinding()
	 * @generated
	 * @ordered
	 */
	protected TransformerEnd fromWinding;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindingInsulation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getWindingInsulation();
	}

	/**
	 * Returns the value of the '<em><b>Insulation PF Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation PF Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation PF Status</em>' attribute.
	 * @see #isSetInsulationPFStatus()
	 * @see #unsetInsulationPFStatus()
	 * @see #setInsulationPFStatus(String)
	 * @generated
	 */
	public String getInsulationPFStatus() {
		return insulationPFStatus;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation PF Status</em>' attribute.
	 * @see #isSetInsulationPFStatus()
	 * @see #unsetInsulationPFStatus()
	 * @see #getInsulationPFStatus()
	 * @generated
	 */
	public void setInsulationPFStatus(String newInsulationPFStatus) {
		insulationPFStatus = newInsulationPFStatus;
		insulationPFStatusESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulationPFStatus()
	 * @see #getInsulationPFStatus()
	 * @see #setInsulationPFStatus(String)
	 * @generated
	 */
	public void unsetInsulationPFStatus() {
		insulationPFStatus = INSULATION_PF_STATUS_EDEFAULT;
		insulationPFStatusESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationPFStatus <em>Insulation PF Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulation PF Status</em>' attribute is set.
	 * @see #unsetInsulationPFStatus()
	 * @see #getInsulationPFStatus()
	 * @see #setInsulationPFStatus(String)
	 * @generated
	 */
	public boolean isSetInsulationPFStatus() {
		return insulationPFStatusESet;
	}

	/**
	 * Returns the value of the '<em><b>Ground</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.Ground#getWindingInsulations <em>Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground</em>' reference.
	 * @see #setGround(Ground)
	 * @see CIM15.IEC61970.Wires.Ground#getWindingInsulations
	 * @generated
	 */
	public Ground getGround() {
		if (ground != null && ground.eIsProxy()) {
			InternalEObject oldGround = (InternalEObject)ground;
			ground = (Ground)eResolveProxy(oldGround);
			if (ground != oldGround) {
			}
		}
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ground basicGetGround() {
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGround(Ground newGround, NotificationChain msgs) {
		Ground oldGround = ground;
		ground = newGround;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getGround <em>Ground</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground</em>' reference.
	 * @see #getGround()
	 * @generated
	 */
	public void setGround(Ground newGround) {
		if (newGround != ground) {
			NotificationChain msgs = null;
			if (ground != null)
				msgs = ((InternalEObject)ground).eInverseRemove(this, WiresPackage.GROUND__WINDING_INSULATIONS, Ground.class, msgs);
			if (newGround != null)
				msgs = ((InternalEObject)newGround).eInverseAdd(this, WiresPackage.GROUND__WINDING_INSULATIONS, Ground.class, msgs);
			msgs = basicSetGround(newGround, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Transformer Observation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs <em>Winding Insulation PFs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Observation</em>' reference.
	 * @see #setTransformerObservation(TransformerObservation)
	 * @see CIM15.IEC61970.Informative.InfAssets.TransformerObservation#getWindingInsulationPFs
	 * @generated
	 */
	public TransformerObservation getTransformerObservation() {
		if (transformerObservation != null && transformerObservation.eIsProxy()) {
			InternalEObject oldTransformerObservation = (InternalEObject)transformerObservation;
			transformerObservation = (TransformerObservation)eResolveProxy(oldTransformerObservation);
			if (transformerObservation != oldTransformerObservation) {
			}
		}
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerObservation basicGetTransformerObservation() {
		return transformerObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerObservation(TransformerObservation newTransformerObservation, NotificationChain msgs) {
		TransformerObservation oldTransformerObservation = transformerObservation;
		transformerObservation = newTransformerObservation;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getTransformerObservation <em>Transformer Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Observation</em>' reference.
	 * @see #getTransformerObservation()
	 * @generated
	 */
	public void setTransformerObservation(TransformerObservation newTransformerObservation) {
		if (newTransformerObservation != transformerObservation) {
			NotificationChain msgs = null;
			if (transformerObservation != null)
				msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS, TransformerObservation.class, msgs);
			if (newTransformerObservation != null)
				msgs = ((InternalEObject)newTransformerObservation).eInverseAdd(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS, TransformerObservation.class, msgs);
			msgs = basicSetTransformerObservation(newTransformerObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Insulation Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation Resistance</em>' attribute.
	 * @see #isSetInsulationResistance()
	 * @see #unsetInsulationResistance()
	 * @see #setInsulationResistance(String)
	 * @generated
	 */
	public String getInsulationResistance() {
		return insulationResistance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation Resistance</em>' attribute.
	 * @see #isSetInsulationResistance()
	 * @see #unsetInsulationResistance()
	 * @see #getInsulationResistance()
	 * @generated
	 */
	public void setInsulationResistance(String newInsulationResistance) {
		insulationResistance = newInsulationResistance;
		insulationResistanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulationResistance()
	 * @see #getInsulationResistance()
	 * @see #setInsulationResistance(String)
	 * @generated
	 */
	public void unsetInsulationResistance() {
		insulationResistance = INSULATION_RESISTANCE_EDEFAULT;
		insulationResistanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getInsulationResistance <em>Insulation Resistance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulation Resistance</em>' attribute is set.
	 * @see #unsetInsulationResistance()
	 * @see #getInsulationResistance()
	 * @see #setInsulationResistance(String)
	 * @generated
	 */
	public boolean isSetInsulationResistance() {
		return insulationResistanceESet;
	}

	/**
	 * Returns the value of the '<em><b>To Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getToWindingInsulations <em>To Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Winding</em>' reference.
	 * @see #setToWinding(TransformerEnd)
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getToWindingInsulations
	 * @generated
	 */
	public TransformerEnd getToWinding() {
		if (toWinding != null && toWinding.eIsProxy()) {
			InternalEObject oldToWinding = (InternalEObject)toWinding;
			toWinding = (TransformerEnd)eResolveProxy(oldToWinding);
			if (toWinding != oldToWinding) {
			}
		}
		return toWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEnd basicGetToWinding() {
		return toWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToWinding(TransformerEnd newToWinding, NotificationChain msgs) {
		TransformerEnd oldToWinding = toWinding;
		toWinding = newToWinding;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getToWinding <em>To Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Winding</em>' reference.
	 * @see #getToWinding()
	 * @generated
	 */
	public void setToWinding(TransformerEnd newToWinding) {
		if (newToWinding != toWinding) {
			NotificationChain msgs = null;
			if (toWinding != null)
				msgs = ((InternalEObject)toWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS, TransformerEnd.class, msgs);
			if (newToWinding != null)
				msgs = ((InternalEObject)newToWinding).eInverseAdd(this, WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS, TransformerEnd.class, msgs);
			msgs = basicSetToWinding(newToWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Leakage Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leakage Reactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leakage Reactance</em>' attribute.
	 * @see #isSetLeakageReactance()
	 * @see #unsetLeakageReactance()
	 * @see #setLeakageReactance(float)
	 * @generated
	 */
	public float getLeakageReactance() {
		return leakageReactance;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leakage Reactance</em>' attribute.
	 * @see #isSetLeakageReactance()
	 * @see #unsetLeakageReactance()
	 * @see #getLeakageReactance()
	 * @generated
	 */
	public void setLeakageReactance(float newLeakageReactance) {
		leakageReactance = newLeakageReactance;
		leakageReactanceESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLeakageReactance()
	 * @see #getLeakageReactance()
	 * @see #setLeakageReactance(float)
	 * @generated
	 */
	public void unsetLeakageReactance() {
		leakageReactance = LEAKAGE_REACTANCE_EDEFAULT;
		leakageReactanceESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getLeakageReactance <em>Leakage Reactance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Leakage Reactance</em>' attribute is set.
	 * @see #unsetLeakageReactance()
	 * @see #getLeakageReactance()
	 * @see #setLeakageReactance(float)
	 * @generated
	 */
	public boolean isSetLeakageReactance() {
		return leakageReactanceESet;
	}

	/**
	 * Returns the value of the '<em><b>From Winding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.TransformerEnd#getFromWindingInsulations <em>From Winding Insulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Winding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Winding</em>' reference.
	 * @see #setFromWinding(TransformerEnd)
	 * @see CIM15.IEC61970.Wires.TransformerEnd#getFromWindingInsulations
	 * @generated
	 */
	public TransformerEnd getFromWinding() {
		if (fromWinding != null && fromWinding.eIsProxy()) {
			InternalEObject oldFromWinding = (InternalEObject)fromWinding;
			fromWinding = (TransformerEnd)eResolveProxy(oldFromWinding);
			if (fromWinding != oldFromWinding) {
			}
		}
		return fromWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerEnd basicGetFromWinding() {
		return fromWinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromWinding(TransformerEnd newFromWinding, NotificationChain msgs) {
		TransformerEnd oldFromWinding = fromWinding;
		fromWinding = newFromWinding;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getFromWinding <em>From Winding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Winding</em>' reference.
	 * @see #getFromWinding()
	 * @generated
	 */
	public void setFromWinding(TransformerEnd newFromWinding) {
		if (newFromWinding != fromWinding) {
			NotificationChain msgs = null;
			if (fromWinding != null)
				msgs = ((InternalEObject)fromWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS, TransformerEnd.class, msgs);
			if (newFromWinding != null)
				msgs = ((InternalEObject)newFromWinding).eInverseAdd(this, WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS, TransformerEnd.class, msgs);
			msgs = basicSetFromWinding(newFromWinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.WindingInsulation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.WINDING_INSULATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfAssetsPackage.WINDING_INSULATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				if (ground != null)
					msgs = ((InternalEObject)ground).eInverseRemove(this, WiresPackage.GROUND__WINDING_INSULATIONS, Ground.class, msgs);
				return basicSetGround((Ground)otherEnd, msgs);
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				if (transformerObservation != null)
					msgs = ((InternalEObject)transformerObservation).eInverseRemove(this, InfAssetsPackage.TRANSFORMER_OBSERVATION__WINDING_INSULATION_PFS, TransformerObservation.class, msgs);
				return basicSetTransformerObservation((TransformerObservation)otherEnd, msgs);
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				if (toWinding != null)
					msgs = ((InternalEObject)toWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_END__TO_WINDING_INSULATIONS, TransformerEnd.class, msgs);
				return basicSetToWinding((TransformerEnd)otherEnd, msgs);
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				if (fromWinding != null)
					msgs = ((InternalEObject)fromWinding).eInverseRemove(this, WiresPackage.TRANSFORMER_END__FROM_WINDING_INSULATIONS, TransformerEnd.class, msgs);
				return basicSetFromWinding((TransformerEnd)otherEnd, msgs);
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
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				return basicSetGround(null, msgs);
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				return basicSetTransformerObservation(null, msgs);
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				return basicSetToWinding(null, msgs);
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				return basicSetFromWinding(null, msgs);
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				return basicSetStatus(null, msgs);
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				return getInsulationPFStatus();
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				if (resolve) return getGround();
				return basicGetGround();
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				if (resolve) return getTransformerObservation();
				return basicGetTransformerObservation();
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				return getInsulationResistance();
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				if (resolve) return getToWinding();
				return basicGetToWinding();
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				return getLeakageReactance();
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				if (resolve) return getFromWinding();
				return basicGetFromWinding();
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				return getStatus();
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				setInsulationPFStatus((String)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				setGround((Ground)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				setInsulationResistance((String)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				setToWinding((TransformerEnd)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				setLeakageReactance((Float)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				setFromWinding((TransformerEnd)newValue);
				return;
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				setStatus((Status)newValue);
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				unsetInsulationPFStatus();
				return;
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				setGround((Ground)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				setTransformerObservation((TransformerObservation)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				unsetInsulationResistance();
				return;
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				setToWinding((TransformerEnd)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				unsetLeakageReactance();
				return;
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				setFromWinding((TransformerEnd)null);
				return;
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				setStatus((Status)null);
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
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_PF_STATUS:
				return isSetInsulationPFStatus();
			case InfAssetsPackage.WINDING_INSULATION__GROUND:
				return ground != null;
			case InfAssetsPackage.WINDING_INSULATION__TRANSFORMER_OBSERVATION:
				return transformerObservation != null;
			case InfAssetsPackage.WINDING_INSULATION__INSULATION_RESISTANCE:
				return isSetInsulationResistance();
			case InfAssetsPackage.WINDING_INSULATION__TO_WINDING:
				return toWinding != null;
			case InfAssetsPackage.WINDING_INSULATION__LEAKAGE_REACTANCE:
				return isSetLeakageReactance();
			case InfAssetsPackage.WINDING_INSULATION__FROM_WINDING:
				return fromWinding != null;
			case InfAssetsPackage.WINDING_INSULATION__STATUS:
				return status != null;
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
		result.append(" (insulationPFStatus: ");
		if (insulationPFStatusESet) result.append(insulationPFStatus); else result.append("<unset>");
		result.append(", insulationResistance: ");
		if (insulationResistanceESet) result.append(insulationResistance); else result.append("<unset>");
		result.append(", leakageReactance: ");
		if (leakageReactanceESet) result.append(leakageReactance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // WindingInsulation
