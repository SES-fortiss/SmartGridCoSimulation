/**
 */
package CIM15.IEC61970.Meas;

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
 * A representation of the model object '<em><b>Value Alias Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Meas.ValueAliasSet#getDiscretes <em>Discretes</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.ValueAliasSet#getCommands <em>Commands</em>}</li>
 *   <li>{@link CIM15.IEC61970.Meas.ValueAliasSet#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueAliasSet extends IdentifiedObject {
	/**
	 * The cached value of the '{@link #getDiscretes() <em>Discretes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretes()
	 * @generated
	 * @ordered
	 */
	protected EList<Discrete> discretes;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueToAlias> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueAliasSet() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.VALUE_ALIAS_SET;
	}

	/**
	 * Returns the value of the '<em><b>Discretes</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Discrete}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Discrete#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discretes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretes</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Discrete#getValueAliasSet
	 * @generated
	 */
	public EList<Discrete> getDiscretes() {
		if (discretes == null) {
			discretes = new BasicInternalEList<Discrete>(Discrete.class);
		}
		return discretes;
	}

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.Command}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.Command#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see CIM15.IEC61970.Meas.Command#getValueAliasSet
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new BasicInternalEList<Command>(Command.class);
		}
		return commands;
	}

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Meas.ValueToAlias}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Meas.ValueToAlias#getValueAliasSet <em>Value Alias Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see CIM15.IEC61970.Meas.ValueToAlias#getValueAliasSet
	 * @generated
	 */
	public EList<ValueToAlias> getValues() {
		if (values == null) {
			values = new BasicInternalEList<ValueToAlias>(ValueToAlias.class);
		}
		return values;
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
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiscretes()).basicAdd(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return ((InternalEList<?>)getDiscretes()).basicRemove(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return getDiscretes();
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return getCommands();
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return getValues();
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
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				getDiscretes().clear();
				getDiscretes().addAll((Collection<? extends Discrete>)newValue);
				return;
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends ValueToAlias>)newValue);
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
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				getDiscretes().clear();
				return;
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				getCommands().clear();
				return;
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				getValues().clear();
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
			case MeasPackage.VALUE_ALIAS_SET__DISCRETES:
				return discretes != null && !discretes.isEmpty();
			case MeasPackage.VALUE_ALIAS_SET__COMMANDS:
				return commands != null && !commands.isEmpty();
			case MeasPackage.VALUE_ALIAS_SET__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ValueAliasSet
