/**
 */
package CIM15.IEC61970.OperationalLimits;

import CIM15.Element;

import CIM15.IEC61970.Core.CorePackage;
import CIM15.IEC61970.Core.Terminal;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Group Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchGroupTerminal extends Element {
	/**
	 * The cached value of the '{@link #getBranchGroup() <em>Branch Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchGroup()
	 * @generated
	 * @ordered
	 */
	protected BranchGroup branchGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchGroupTerminal() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.BRANCH_GROUP_TERMINAL;
	}

	/**
	 * Returns the value of the '<em><b>Branch Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Group</em>' reference.
	 * @see #setBranchGroup(BranchGroup)
	 * @see CIM15.IEC61970.OperationalLimits.BranchGroup#getBranchGroupTerminal
	 * @generated
	 */
	public BranchGroup getBranchGroup() {
		if (branchGroup != null && branchGroup.eIsProxy()) {
			InternalEObject oldBranchGroup = (InternalEObject)branchGroup;
			branchGroup = (BranchGroup)eResolveProxy(oldBranchGroup);
			if (branchGroup != oldBranchGroup) {
			}
		}
		return branchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroup basicGetBranchGroup() {
		return branchGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchGroup(BranchGroup newBranchGroup, NotificationChain msgs) {
		BranchGroup oldBranchGroup = branchGroup;
		branchGroup = newBranchGroup;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Group</em>' reference.
	 * @see #getBranchGroup()
	 * @generated
	 */
	public void setBranchGroup(BranchGroup newBranchGroup) {
		if (newBranchGroup != branchGroup) {
			NotificationChain msgs = null;
			if (branchGroup != null)
				msgs = ((InternalEObject)branchGroup).eInverseRemove(this, OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs);
			if (newBranchGroup != null)
				msgs = ((InternalEObject)newBranchGroup).eInverseAdd(this, OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs);
			msgs = basicSetBranchGroup(newBranchGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see CIM15.IEC61970.Core.Terminal#getBranchGroupTerminal
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
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#getTerminal <em>Terminal</em>}' reference.
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
				msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs);
			if (newTerminal != null)
				msgs = ((InternalEObject)newTerminal).eInverseAdd(this, CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs);
			msgs = basicSetTerminal(newTerminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
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
	 * Sets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.OperationalLimits.BranchGroupTerminal#isPositiveFlowIn <em>Positive Flow In</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				if (branchGroup != null)
					msgs = ((InternalEObject)branchGroup).eInverseRemove(this, OperationalLimitsPackage.BRANCH_GROUP__BRANCH_GROUP_TERMINAL, BranchGroup.class, msgs);
				return basicSetBranchGroup((BranchGroup)otherEnd, msgs);
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				if (terminal != null)
					msgs = ((InternalEObject)terminal).eInverseRemove(this, CorePackage.TERMINAL__BRANCH_GROUP_TERMINAL, Terminal.class, msgs);
				return basicSetTerminal((Terminal)otherEnd, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				return basicSetBranchGroup(null, msgs);
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				return basicSetTerminal(null, msgs);
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				if (resolve) return getBranchGroup();
				return basicGetBranchGroup();
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
				return isPositiveFlowIn();
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				setBranchGroup((BranchGroup)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
				setPositiveFlowIn((Boolean)newValue);
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				setBranchGroup((BranchGroup)null);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
				unsetPositiveFlowIn();
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
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__BRANCH_GROUP:
				return branchGroup != null;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__TERMINAL:
				return terminal != null;
			case OperationalLimitsPackage.BRANCH_GROUP_TERMINAL__POSITIVE_FLOW_IN:
				return isSetPositiveFlowIn();
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

} // BranchGroupTerminal
