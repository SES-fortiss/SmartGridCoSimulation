/**
 */
package CIM15.IEC61970.ControlArea;

import CIM15.Element;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.Terminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.ControlArea.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TieFlow extends Element {
	/**
	 * The cached value of the '{@link #getAltTieMeas() <em>Alt Tie Meas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltTieMeas()
	 * @generated
	 * @ordered
	 */
	protected EList<AltTieMeas> altTieMeas;

	/**
	 * The default value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIVE_FLOW_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositiveFlowIn()
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

	/**
	 * This is true if the Positive Flow In attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean positiveFlowInESet;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The cached value of the '{@link #getControlArea() <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlArea()
	 * @generated
	 * @ordered
	 */
	protected ControlArea controlArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TieFlow() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.TIE_FLOW;
	}

	/**
	 * Returns the value of the '<em><b>Alt Tie Meas</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.ControlArea.AltTieMeas}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Tie Meas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Tie Meas</em>' reference list.
	 * @see CIM15.IEC61970.ControlArea.AltTieMeas#getTieFlow
	 * @generated
	 */
	public EList<AltTieMeas> getAltTieMeas() {
		if (altTieMeas == null) {
			altTieMeas = new BasicInternalEList<AltTieMeas>(AltTieMeas.class);
		}
		return altTieMeas;
	}

	/**
	 * Returns the value of the '<em><b>Positive Flow In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Flow In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isSetPositiveFlowIn()
	 * @see #unsetPositiveFlowIn()
	 * @see #setPositiveFlowIn(boolean)
	 * @generated
	 */
	public boolean isPositiveFlowIn() {
		return positiveFlowIn;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Flow In</em>' attribute.
	 * @see #isSetPositiveFlowIn()
	 * @see #unsetPositiveFlowIn()
	 * @see #isPositiveFlowIn()
	 * @generated
	 */
	public void setPositiveFlowIn(boolean newPositiveFlowIn) {
		positiveFlowIn = newPositiveFlowIn;
		positiveFlowInESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPositiveFlowIn()
	 * @see #isPositiveFlowIn()
	 * @see #setPositiveFlowIn(boolean)
	 * @generated
	 */
	public void unsetPositiveFlowIn() {
		positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;
		positiveFlowInESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.ControlArea.TieFlow#isPositiveFlowIn <em>Positive Flow In</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Positive Flow In</em>' attribute is set.
	 * @see #unsetPositiveFlowIn()
	 * @see #isPositiveFlowIn()
	 * @see #setPositiveFlowIn(boolean)
	 * @generated
	 */
	public boolean isSetPositiveFlowIn() {
		return positiveFlowInESet;
	}

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getTieFlow
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminal(Terminal newTerminal, NotificationChain msgs) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.TieFlow#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		if (newTerminal != terminal) {
			NotificationChain msgs = null;
			if (terminal != null)
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__TIE_FLOW, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__TIE_FLOW, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Control Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.ControlArea.ControlArea#getTieFlow <em>Tie Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area</em>' reference.
	 * @see #setControlArea(ControlArea)
	 * @see CIM15.IEC61970.ControlArea.ControlArea#getTieFlow
	 * @generated
	 */
	public ControlArea getControlArea() {
		if (controlArea != null && controlArea.eIsProxy()) {
			InternalEObject oldControlArea = (InternalEObject)controlArea;
			controlArea = (ControlArea)eResolveProxy(oldControlArea);
			if (controlArea != oldControlArea) {
			}
		}
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea basicGetControlArea() {
		return controlArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlArea(ControlArea newControlArea, NotificationChain msgs) {
		ControlArea oldControlArea = controlArea;
		controlArea = newControlArea;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.ControlArea.TieFlow#getControlArea <em>Control Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area</em>' reference.
	 * @see #getControlArea()
	 * @generated
	 */
	public void setControlArea(ControlArea newControlArea) {
		if (newControlArea != controlArea) {
			NotificationChain msgs = null;
			if (controlArea != null)
				msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
			if (newControlArea != null)
				msgs = ((InternalEObject)newControlArea).eInverseAdd(this, ControlAreaPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
			msgs = basicSetControlArea(newControlArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltTieMeas()).basicAdd(otherEnd, msgs);
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__TIE_FLOW, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				if (controlArea != null)
					msgs = ((InternalEObject)controlArea).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA__TIE_FLOW, ControlArea.class, msgs);
				return basicSetControlArea((ControlArea)otherEnd, msgs);
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
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return ((InternalEList<?>)getAltTieMeas()).basicRemove(otherEnd, msgs);
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				return basicSetTerminal(null, msgs);
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				return basicSetControlArea(null, msgs);
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
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return getAltTieMeas();
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				if (resolve) return getControlArea();
				return basicGetControlArea();
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
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				getAltTieMeas().addAll((Collection<? extends AltTieMeas>)newValue);
				return;
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				setPositiveFlowIn((Boolean)newValue);
				return;
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				setControlArea((ControlArea)newValue);
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
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				return;
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				unsetPositiveFlowIn();
				return;
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				setControlArea((ControlArea)null);
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
			case ControlAreaPackage.TIE_FLOW__ALT_TIE_MEAS:
				return altTieMeas != null && !altTieMeas.isEmpty();
			case ControlAreaPackage.TIE_FLOW__POSITIVE_FLOW_IN:
				return isSetPositiveFlowIn();
			case ControlAreaPackage.TIE_FLOW__TERMINAL:
				return terminal != null;
			case ControlAreaPackage.TIE_FLOW__CONTROL_AREA:
				return controlArea != null;
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
		result.append(" (positiveFlowIn: ");
		if (positiveFlowInESet) result.append(positiveFlowIn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // TieFlow
