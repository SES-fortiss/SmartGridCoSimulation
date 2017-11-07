/**
 */
package CIM15.IEC61970.Core;

import CIM15.Element;

import CIM15.IEC61970.Graphics.DiagramObject;

import CIM15.IEC61970.Informative.InfCore.InfCorePackage;
import CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Core.IdentifiedObject#getNames <em>Names</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentifiedObject extends Element {
	/**
	 * The cached value of the '{@link #getNames() <em>Names</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<Name> names;

	/**
	 * The cached value of the '{@link #getDiagramObjects() <em>Diagram Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramObject> diagramObjects;

	/**
	 * The default value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected static final String MRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMRID() <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRID()
	 * @generated
	 * @ordered
	 */
	protected String mRID = MRID_EDEFAULT;

	/**
	 * This is true if the MRID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mRIDESet;

	/**
	 * The default value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected String aliasName = ALIAS_NAME_EDEFAULT;

	/**
	 * This is true if the Alias Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aliasNameESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getModelingAuthoritySet() <em>Modeling Authority Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingAuthoritySet()
	 * @generated
	 * @ordered
	 */
	protected ModelingAuthoritySet modelingAuthoritySet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiedObject() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IDENTIFIED_OBJECT;
	}

	/**
	 * Returns the value of the '<em><b>Names</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Core.Name}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Core.Name#getIdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' reference list.
	 * @see CIM15.IEC61970.Core.Name#getIdentifiedObject
	 * @generated
	 */
	public EList<Name> getNames() {
		if (names == null) {
			names = new BasicInternalEList<Name>(Name.class);
		}
		return names;
	}

	/**
	 * Returns the value of the '<em><b>Diagram Objects</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Graphics.DiagramObject}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Graphics.DiagramObject#getIdentifiedObject <em>Identified Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Objects</em>' reference list.
	 * @see CIM15.IEC61970.Graphics.DiagramObject#getIdentifiedObject
	 * @generated
	 */
	public EList<DiagramObject> getDiagramObjects() {
		if (diagramObjects == null) {
			diagramObjects = new BasicInternalEList<DiagramObject>(DiagramObject.class);
		}
		return diagramObjects;
	}

	/**
	 * Returns the value of the '<em><b>MRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRID</em>' attribute.
	 * @see #isSetMRID()
	 * @see #unsetMRID()
	 * @see #setMRID(String)
	 * @generated
	 */
	public String getMRID() {
		return mRID;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRID</em>' attribute.
	 * @see #isSetMRID()
	 * @see #unsetMRID()
	 * @see #getMRID()
	 * @generated
	 */
	public void setMRID(String newMRID) {
		mRID = newMRID;
		mRIDESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMRID()
	 * @see #getMRID()
	 * @see #setMRID(String)
	 * @generated
	 */
	public void unsetMRID() {
		mRID = MRID_EDEFAULT;
		mRIDESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getMRID <em>MRID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MRID</em>' attribute is set.
	 * @see #unsetMRID()
	 * @see #getMRID()
	 * @see #setMRID(String)
	 * @generated
	 */
	public boolean isSetMRID() {
		return mRIDESet;
	}

	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' attribute.
	 * @see #isSetAliasName()
	 * @see #unsetAliasName()
	 * @see #setAliasName(String)
	 * @generated
	 */
	public String getAliasName() {
		return aliasName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' attribute.
	 * @see #isSetAliasName()
	 * @see #unsetAliasName()
	 * @see #getAliasName()
	 * @generated
	 */
	public void setAliasName(String newAliasName) {
		aliasName = newAliasName;
		aliasNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAliasName()
	 * @see #getAliasName()
	 * @see #setAliasName(String)
	 * @generated
	 */
	public void unsetAliasName() {
		aliasName = ALIAS_NAME_EDEFAULT;
		aliasNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alias Name</em>' attribute is set.
	 * @see #unsetAliasName()
	 * @see #getAliasName()
	 * @see #setAliasName(String)
	 * @generated
	 */
	public boolean isSetAliasName() {
		return aliasNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
		nameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public void unsetName() {
		name = NAME_EDEFAULT;
		nameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * Returns the value of the '<em><b>Modeling Authority Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet#getIdentifiedObjects <em>Identified Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modeling Authority Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Authority Set</em>' reference.
	 * @see #setModelingAuthoritySet(ModelingAuthoritySet)
	 * @see CIM15.IEC61970.Informative.InfCore.ModelingAuthoritySet#getIdentifiedObjects
	 * @generated
	 */
	public ModelingAuthoritySet getModelingAuthoritySet() {
		if (modelingAuthoritySet != null && modelingAuthoritySet.eIsProxy()) {
			InternalEObject oldModelingAuthoritySet = (InternalEObject)modelingAuthoritySet;
			modelingAuthoritySet = (ModelingAuthoritySet)eResolveProxy(oldModelingAuthoritySet);
			if (modelingAuthoritySet != oldModelingAuthoritySet) {
			}
		}
		return modelingAuthoritySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingAuthoritySet basicGetModelingAuthoritySet() {
		return modelingAuthoritySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelingAuthoritySet(ModelingAuthoritySet newModelingAuthoritySet, NotificationChain msgs) {
		ModelingAuthoritySet oldModelingAuthoritySet = modelingAuthoritySet;
		modelingAuthoritySet = newModelingAuthoritySet;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Core.IdentifiedObject#getModelingAuthoritySet <em>Modeling Authority Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Authority Set</em>' reference.
	 * @see #getModelingAuthoritySet()
	 * @generated
	 */
	public void setModelingAuthoritySet(ModelingAuthoritySet newModelingAuthoritySet) {
		if (newModelingAuthoritySet != modelingAuthoritySet) {
			NotificationChain msgs = null;
			if (modelingAuthoritySet != null)
				msgs = ((InternalEObject)modelingAuthoritySet).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS, ModelingAuthoritySet.class, msgs);
			if (newModelingAuthoritySet != null)
				msgs = ((InternalEObject)newModelingAuthoritySet).eInverseAdd(this, InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS, ModelingAuthoritySet.class, msgs);
			msgs = basicSetModelingAuthoritySet(newModelingAuthoritySet, msgs);
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
			case CorePackage.IDENTIFIED_OBJECT__NAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNames()).basicAdd(otherEnd, msgs);
			case CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagramObjects()).basicAdd(otherEnd, msgs);
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				if (modelingAuthoritySet != null)
					msgs = ((InternalEObject)modelingAuthoritySet).eInverseRemove(this, InfCorePackage.MODELING_AUTHORITY_SET__IDENTIFIED_OBJECTS, ModelingAuthoritySet.class, msgs);
				return basicSetModelingAuthoritySet((ModelingAuthoritySet)otherEnd, msgs);
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
			case CorePackage.IDENTIFIED_OBJECT__NAMES:
				return ((InternalEList<?>)getNames()).basicRemove(otherEnd, msgs);
			case CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
				return ((InternalEList<?>)getDiagramObjects()).basicRemove(otherEnd, msgs);
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				return basicSetModelingAuthoritySet(null, msgs);
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
			case CorePackage.IDENTIFIED_OBJECT__NAMES:
				return getNames();
			case CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
				return getDiagramObjects();
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				return getMRID();
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				return getAliasName();
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				return getName();
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				if (resolve) return getModelingAuthoritySet();
				return basicGetModelingAuthoritySet();
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
			case CorePackage.IDENTIFIED_OBJECT__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends Name>)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
				getDiagramObjects().addAll((Collection<? extends DiagramObject>)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				setMRID((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				setAliasName((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				setName((String)newValue);
				return;
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				setModelingAuthoritySet((ModelingAuthoritySet)newValue);
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
			case CorePackage.IDENTIFIED_OBJECT__NAMES:
				getNames().clear();
				return;
			case CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
				getDiagramObjects().clear();
				return;
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				unsetMRID();
				return;
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				unsetAliasName();
				return;
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				unsetName();
				return;
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				setModelingAuthoritySet((ModelingAuthoritySet)null);
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
			case CorePackage.IDENTIFIED_OBJECT__NAMES:
				return names != null && !names.isEmpty();
			case CorePackage.IDENTIFIED_OBJECT__DIAGRAM_OBJECTS:
				return diagramObjects != null && !diagramObjects.isEmpty();
			case CorePackage.IDENTIFIED_OBJECT__MRID:
				return isSetMRID();
			case CorePackage.IDENTIFIED_OBJECT__ALIAS_NAME:
				return isSetAliasName();
			case CorePackage.IDENTIFIED_OBJECT__NAME:
				return isSetName();
			case CorePackage.IDENTIFIED_OBJECT__MODELING_AUTHORITY_SET:
				return modelingAuthoritySet != null;
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
		result.append(" (mRID: ");
		if (mRIDESet) result.append(mRID); else result.append("<unset>");
		result.append(", aliasName: ");
		if (aliasNameESet) result.append(aliasName); else result.append("<unset>");
		result.append(", name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // IdentifiedObject
