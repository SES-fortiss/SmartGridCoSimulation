/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import CIM15.IEC61970.Informative.InfOperations.CircuitSection;
import CIM15.IEC61970.Informative.InfOperations.InfOperationsPackage;

import CIM15.IEC61970.Wires.ACLineSegment;
import CIM15.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConductorAsset extends Asset {
	/**
	 * The default value of the '{@link #isIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HORIZONTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean isHorizontal = IS_HORIZONTAL_EDEFAULT;

	/**
	 * This is true if the Is Horizontal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isHorizontalESet;

	/**
	 * The cached value of the '{@link #getCircuitSection() <em>Circuit Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitSection()
	 * @generated
	 * @ordered
	 */
	protected CircuitSection circuitSection;

	/**
	 * The default value of the '{@link #getGroundingMethod() <em>Grounding Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundingMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUNDING_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroundingMethod() <em>Grounding Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundingMethod()
	 * @generated
	 * @ordered
	 */
	protected String groundingMethod = GROUNDING_METHOD_EDEFAULT;

	/**
	 * This is true if the Grounding Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groundingMethodESet;

	/**
	 * The default value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsulated() <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean insulated = INSULATED_EDEFAULT;

	/**
	 * This is true if the Insulated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insulatedESet;

	/**
	 * The cached value of the '{@link #getConductorSegment() <em>Conductor Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorSegment()
	 * @generated
	 * @ordered
	 */
	protected ACLineSegment conductorSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductorAsset() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getConductorAsset();
	}

	/**
	 * Returns the value of the '<em><b>Is Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Horizontal</em>' attribute.
	 * @see #isSetIsHorizontal()
	 * @see #unsetIsHorizontal()
	 * @see #setIsHorizontal(boolean)
	 * @generated
	 */
	public boolean isIsHorizontal() {
		return isHorizontal;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Horizontal</em>' attribute.
	 * @see #isSetIsHorizontal()
	 * @see #unsetIsHorizontal()
	 * @see #isIsHorizontal()
	 * @generated
	 */
	public void setIsHorizontal(boolean newIsHorizontal) {
		isHorizontal = newIsHorizontal;
		isHorizontalESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsHorizontal()
	 * @see #isIsHorizontal()
	 * @see #setIsHorizontal(boolean)
	 * @generated
	 */
	public void unsetIsHorizontal() {
		isHorizontal = IS_HORIZONTAL_EDEFAULT;
		isHorizontalESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isIsHorizontal <em>Is Horizontal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Horizontal</em>' attribute is set.
	 * @see #unsetIsHorizontal()
	 * @see #isIsHorizontal()
	 * @see #setIsHorizontal(boolean)
	 * @generated
	 */
	public boolean isSetIsHorizontal() {
		return isHorizontalESet;
	}

	/**
	 * Returns the value of the '<em><b>Circuit Section</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Section</em>' reference.
	 * @see #setCircuitSection(CircuitSection)
	 * @see CIM15.IEC61970.Informative.InfOperations.CircuitSection#getConductorAssets
	 * @generated
	 */
	public CircuitSection getCircuitSection() {
		if (circuitSection != null && circuitSection.eIsProxy()) {
			InternalEObject oldCircuitSection = (InternalEObject)circuitSection;
			circuitSection = (CircuitSection)eResolveProxy(oldCircuitSection);
			if (circuitSection != oldCircuitSection) {
			}
		}
		return circuitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitSection basicGetCircuitSection() {
		return circuitSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitSection(CircuitSection newCircuitSection, NotificationChain msgs) {
		CircuitSection oldCircuitSection = circuitSection;
		circuitSection = newCircuitSection;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getCircuitSection <em>Circuit Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Section</em>' reference.
	 * @see #getCircuitSection()
	 * @generated
	 */
	public void setCircuitSection(CircuitSection newCircuitSection) {
		if (newCircuitSection != circuitSection) {
			NotificationChain msgs = null;
			if (circuitSection != null)
				msgs = ((InternalEObject)circuitSection).eInverseRemove(this, InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS, CircuitSection.class, msgs);
			if (newCircuitSection != null)
				msgs = ((InternalEObject)newCircuitSection).eInverseAdd(this, InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS, CircuitSection.class, msgs);
			msgs = basicSetCircuitSection(newCircuitSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Grounding Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounding Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounding Method</em>' attribute.
	 * @see #isSetGroundingMethod()
	 * @see #unsetGroundingMethod()
	 * @see #setGroundingMethod(String)
	 * @generated
	 */
	public String getGroundingMethod() {
		return groundingMethod;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grounding Method</em>' attribute.
	 * @see #isSetGroundingMethod()
	 * @see #unsetGroundingMethod()
	 * @see #getGroundingMethod()
	 * @generated
	 */
	public void setGroundingMethod(String newGroundingMethod) {
		groundingMethod = newGroundingMethod;
		groundingMethodESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroundingMethod()
	 * @see #getGroundingMethod()
	 * @see #setGroundingMethod(String)
	 * @generated
	 */
	public void unsetGroundingMethod() {
		groundingMethod = GROUNDING_METHOD_EDEFAULT;
		groundingMethodESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getGroundingMethod <em>Grounding Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grounding Method</em>' attribute is set.
	 * @see #unsetGroundingMethod()
	 * @see #getGroundingMethod()
	 * @see #setGroundingMethod(String)
	 * @generated
	 */
	public boolean isSetGroundingMethod() {
		return groundingMethodESet;
	}

	/**
	 * Returns the value of the '<em><b>Insulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulated</em>' attribute.
	 * @see #isSetInsulated()
	 * @see #unsetInsulated()
	 * @see #setInsulated(boolean)
	 * @generated
	 */
	public boolean isInsulated() {
		return insulated;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulated</em>' attribute.
	 * @see #isSetInsulated()
	 * @see #unsetInsulated()
	 * @see #isInsulated()
	 * @generated
	 */
	public void setInsulated(boolean newInsulated) {
		insulated = newInsulated;
		insulatedESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsulated()
	 * @see #isInsulated()
	 * @see #setInsulated(boolean)
	 * @generated
	 */
	public void unsetInsulated() {
		insulated = INSULATED_EDEFAULT;
		insulatedESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#isInsulated <em>Insulated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insulated</em>' attribute is set.
	 * @see #unsetInsulated()
	 * @see #isInsulated()
	 * @see #setInsulated(boolean)
	 * @generated
	 */
	public boolean isSetInsulated() {
		return insulatedESet;
	}

	/**
	 * Returns the value of the '<em><b>Conductor Segment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Wires.ACLineSegment#getConductorAssets <em>Conductor Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Segment</em>' reference.
	 * @see #setConductorSegment(ACLineSegment)
	 * @see CIM15.IEC61970.Wires.ACLineSegment#getConductorAssets
	 * @generated
	 */
	public ACLineSegment getConductorSegment() {
		if (conductorSegment != null && conductorSegment.eIsProxy()) {
			InternalEObject oldConductorSegment = (InternalEObject)conductorSegment;
			conductorSegment = (ACLineSegment)eResolveProxy(oldConductorSegment);
			if (conductorSegment != oldConductorSegment) {
			}
		}
		return conductorSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACLineSegment basicGetConductorSegment() {
		return conductorSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductorSegment(ACLineSegment newConductorSegment, NotificationChain msgs) {
		ACLineSegment oldConductorSegment = conductorSegment;
		conductorSegment = newConductorSegment;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.ConductorAsset#getConductorSegment <em>Conductor Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor Segment</em>' reference.
	 * @see #getConductorSegment()
	 * @generated
	 */
	public void setConductorSegment(ACLineSegment newConductorSegment) {
		if (newConductorSegment != conductorSegment) {
			NotificationChain msgs = null;
			if (conductorSegment != null)
				msgs = ((InternalEObject)conductorSegment).eInverseRemove(this, WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS, ACLineSegment.class, msgs);
			if (newConductorSegment != null)
				msgs = ((InternalEObject)newConductorSegment).eInverseAdd(this, WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS, ACLineSegment.class, msgs);
			msgs = basicSetConductorSegment(newConductorSegment, msgs);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				if (circuitSection != null)
					msgs = ((InternalEObject)circuitSection).eInverseRemove(this, InfOperationsPackage.CIRCUIT_SECTION__CONDUCTOR_ASSETS, CircuitSection.class, msgs);
				return basicSetCircuitSection((CircuitSection)otherEnd, msgs);
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				if (conductorSegment != null)
					msgs = ((InternalEObject)conductorSegment).eInverseRemove(this, WiresPackage.AC_LINE_SEGMENT__CONDUCTOR_ASSETS, ACLineSegment.class, msgs);
				return basicSetConductorSegment((ACLineSegment)otherEnd, msgs);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				return basicSetCircuitSection(null, msgs);
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				return basicSetConductorSegment(null, msgs);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				return isIsHorizontal();
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				if (resolve) return getCircuitSection();
				return basicGetCircuitSection();
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				return getGroundingMethod();
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				return isInsulated();
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				if (resolve) return getConductorSegment();
				return basicGetConductorSegment();
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
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				setIsHorizontal((Boolean)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				setCircuitSection((CircuitSection)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				setGroundingMethod((String)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				setInsulated((Boolean)newValue);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				setConductorSegment((ACLineSegment)newValue);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				unsetIsHorizontal();
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				setCircuitSection((CircuitSection)null);
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				unsetGroundingMethod();
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				unsetInsulated();
				return;
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				setConductorSegment((ACLineSegment)null);
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
			case InfAssetsPackage.CONDUCTOR_ASSET__IS_HORIZONTAL:
				return isSetIsHorizontal();
			case InfAssetsPackage.CONDUCTOR_ASSET__CIRCUIT_SECTION:
				return circuitSection != null;
			case InfAssetsPackage.CONDUCTOR_ASSET__GROUNDING_METHOD:
				return isSetGroundingMethod();
			case InfAssetsPackage.CONDUCTOR_ASSET__INSULATED:
				return isSetInsulated();
			case InfAssetsPackage.CONDUCTOR_ASSET__CONDUCTOR_SEGMENT:
				return conductorSegment != null;
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
		result.append(" (isHorizontal: ");
		if (isHorizontalESet) result.append(isHorizontal); else result.append("<unset>");
		result.append(", groundingMethod: ");
		if (groundingMethodESet) result.append(groundingMethod); else result.append("<unset>");
		result.append(", insulated: ");
		if (insulatedESet) result.append(insulated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // ConductorAsset
