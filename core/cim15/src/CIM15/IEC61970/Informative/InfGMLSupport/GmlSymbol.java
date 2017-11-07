/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

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
 * A representation of the model object '<em><b>Gml Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion <em>Version</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel <em>Level</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles <em>Gml Feature Styles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType <em>Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol <em>Gml Base Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlSymbol extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * This is true if the Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelESet;

	/**
	 * The cached value of the '{@link #getGmlFeatureStyles() <em>Gml Feature Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFeatureStyle> gmlFeatureStyles;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getGmlBaseSymbol() <em>Gml Base Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlBaseSymbol()
	 * @generated
	 * @ordered
	 */
	protected GmlBaseSymbol gmlBaseSymbol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlSymbol() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_SYMBOL;
	}

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	public void setVersion(String newVersion) {
		version = newVersion;
		versionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	public void unsetVersion() {
		version = VERSION_EDEFAULT;
		versionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #setLevel(String)
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @generated
	 */
	public void setLevel(String newLevel) {
		level = newLevel;
		levelESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevel()
	 * @see #getLevel()
	 * @see #setLevel(String)
	 * @generated
	 */
	public void unsetLevel() {
		level = LEVEL_EDEFAULT;
		levelESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getLevel <em>Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level</em>' attribute is set.
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @see #setLevel(String)
	 * @generated
	 */
	public boolean isSetLevel() {
		return levelESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols <em>Gml Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Styles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols
	 * @generated
	 */
	public EList<GmlFeatureStyle> getGmlFeatureStyles() {
		if (gmlFeatureStyles == null) {
			gmlFeatureStyles = new BasicInternalEList<GmlFeatureStyle>(GmlFeatureStyle.class);
		}
		return gmlFeatureStyles;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
		typeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public void unsetType() {
		type = TYPE_EDEFAULT;
		typeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Base Symbol</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol#getGmlSymbols <em>Gml Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Base Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Base Symbol</em>' reference.
	 * @see #setGmlBaseSymbol(GmlBaseSymbol)
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlBaseSymbol#getGmlSymbols
	 * @generated
	 */
	public GmlBaseSymbol getGmlBaseSymbol() {
		if (gmlBaseSymbol != null && gmlBaseSymbol.eIsProxy()) {
			InternalEObject oldGmlBaseSymbol = (InternalEObject)gmlBaseSymbol;
			gmlBaseSymbol = (GmlBaseSymbol)eResolveProxy(oldGmlBaseSymbol);
			if (gmlBaseSymbol != oldGmlBaseSymbol) {
			}
		}
		return gmlBaseSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlBaseSymbol basicGetGmlBaseSymbol() {
		return gmlBaseSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGmlBaseSymbol(GmlBaseSymbol newGmlBaseSymbol, NotificationChain msgs) {
		GmlBaseSymbol oldGmlBaseSymbol = gmlBaseSymbol;
		gmlBaseSymbol = newGmlBaseSymbol;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlBaseSymbol <em>Gml Base Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gml Base Symbol</em>' reference.
	 * @see #getGmlBaseSymbol()
	 * @generated
	 */
	public void setGmlBaseSymbol(GmlBaseSymbol newGmlBaseSymbol) {
		if (newGmlBaseSymbol != gmlBaseSymbol) {
			NotificationChain msgs = null;
			if (gmlBaseSymbol != null)
				msgs = ((InternalEObject)gmlBaseSymbol).eInverseRemove(this, InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS, GmlBaseSymbol.class, msgs);
			if (newGmlBaseSymbol != null)
				msgs = ((InternalEObject)newGmlBaseSymbol).eInverseAdd(this, InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS, GmlBaseSymbol.class, msgs);
			msgs = basicSetGmlBaseSymbol(newGmlBaseSymbol, msgs);
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
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFeatureStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				if (gmlBaseSymbol != null)
					msgs = ((InternalEObject)gmlBaseSymbol).eInverseRemove(this, InfGMLSupportPackage.GML_BASE_SYMBOL__GML_SYMBOLS, GmlBaseSymbol.class, msgs);
				return basicSetGmlBaseSymbol((GmlBaseSymbol)otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return ((InternalEList<?>)getGmlFeatureStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				return basicSetGmlBaseSymbol(null, msgs);
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
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				return getVersion();
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				return getLevel();
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return getGmlFeatureStyles();
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				return getType();
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				if (resolve) return getGmlBaseSymbol();
				return basicGetGmlBaseSymbol();
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
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				setVersion((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				setLevel((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
				getGmlFeatureStyles().addAll((Collection<? extends GmlFeatureStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				setType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				setGmlBaseSymbol((GmlBaseSymbol)newValue);
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
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				unsetVersion();
				return;
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				unsetLevel();
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
				return;
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				unsetType();
				return;
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				setGmlBaseSymbol((GmlBaseSymbol)null);
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
			case InfGMLSupportPackage.GML_SYMBOL__VERSION:
				return isSetVersion();
			case InfGMLSupportPackage.GML_SYMBOL__LEVEL:
				return isSetLevel();
			case InfGMLSupportPackage.GML_SYMBOL__GML_FEATURE_STYLES:
				return gmlFeatureStyles != null && !gmlFeatureStyles.isEmpty();
			case InfGMLSupportPackage.GML_SYMBOL__TYPE:
				return isSetType();
			case InfGMLSupportPackage.GML_SYMBOL__GML_BASE_SYMBOL:
				return gmlBaseSymbol != null;
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
		result.append(" (version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(", level: ");
		if (levelESet) result.append(level); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlSymbol
