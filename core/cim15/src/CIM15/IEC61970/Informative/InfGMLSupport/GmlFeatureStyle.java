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
 * A representation of the model object '<em><b>Gml Feature Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlGeometryStyles <em>Gml Geometry Styles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlSymbols <em>Gml Symbols</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlTobologyStyles <em>Gml Tobology Styles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlLabelStyles <em>Gml Label Styles</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes <em>Gml Feature Types</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlFeatureStyle extends IdentifiedObject {
	/**
	 * The default value of the '{@link #getSemanticTypeIdentifier() <em>Semantic Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_TYPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticTypeIdentifier() <em>Semantic Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String semanticTypeIdentifier = SEMANTIC_TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * This is true if the Semantic Type Identifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean semanticTypeIdentifierESet;

	/**
	 * The default value of the '{@link #getFeatureType() <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureType()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureType() <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureType()
	 * @generated
	 * @ordered
	 */
	protected String featureType = FEATURE_TYPE_EDEFAULT;

	/**
	 * This is true if the Feature Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean featureTypeESet;

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
	 * The default value of the '{@link #getFeatureTypeName() <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureTypeName() <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureTypeName()
	 * @generated
	 * @ordered
	 */
	protected String featureTypeName = FEATURE_TYPE_NAME_EDEFAULT;

	/**
	 * This is true if the Feature Type Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean featureTypeNameESet;

	/**
	 * The default value of the '{@link #getFeatureConstraint() <em>Feature Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureConstraint() <em>Feature Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureConstraint()
	 * @generated
	 * @ordered
	 */
	protected String featureConstraint = FEATURE_CONSTRAINT_EDEFAULT;

	/**
	 * This is true if the Feature Constraint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean featureConstraintESet;

	/**
	 * The cached value of the '{@link #getGmlGeometryStyles() <em>Gml Geometry Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlGeometryStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlGeometryStyle> gmlGeometryStyles;

	/**
	 * The cached value of the '{@link #getGmlSymbols() <em>Gml Symbols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlSymbol> gmlSymbols;

	/**
	 * The cached value of the '{@link #getGmlTobologyStyles() <em>Gml Tobology Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlTobologyStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlTopologyStyle> gmlTobologyStyles;

	/**
	 * The cached value of the '{@link #getGmlLabelStyles() <em>Gml Label Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlLabelStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlLabelStyle> gmlLabelStyles;

	/**
	 * The cached value of the '{@link #getGmlFeatureTypes() <em>Gml Feature Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGmlFeatureTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GmlFeatureType> gmlFeatureTypes;

	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected String baseType = BASE_TYPE_EDEFAULT;

	/**
	 * This is true if the Base Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseTypeESet;

	/**
	 * The default value of the '{@link #getQueryGrammar() <em>Query Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryGrammar()
	 * @generated
	 * @ordered
	 */
	protected static final QueryGrammarKind QUERY_GRAMMAR_EDEFAULT = QueryGrammarKind.OTHER;

	/**
	 * The cached value of the '{@link #getQueryGrammar() <em>Query Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryGrammar()
	 * @generated
	 * @ordered
	 */
	protected QueryGrammarKind queryGrammar = QUERY_GRAMMAR_EDEFAULT;

	/**
	 * This is true if the Query Grammar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queryGrammarESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFeatureStyle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FEATURE_STYLE;
	}

	/**
	 * Returns the value of the '<em><b>Semantic Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantic Type Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type Identifier</em>' attribute.
	 * @see #isSetSemanticTypeIdentifier()
	 * @see #unsetSemanticTypeIdentifier()
	 * @see #setSemanticTypeIdentifier(String)
	 * @generated
	 */
	public String getSemanticTypeIdentifier() {
		return semanticTypeIdentifier;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Type Identifier</em>' attribute.
	 * @see #isSetSemanticTypeIdentifier()
	 * @see #unsetSemanticTypeIdentifier()
	 * @see #getSemanticTypeIdentifier()
	 * @generated
	 */
	public void setSemanticTypeIdentifier(String newSemanticTypeIdentifier) {
		semanticTypeIdentifier = newSemanticTypeIdentifier;
		semanticTypeIdentifierESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSemanticTypeIdentifier()
	 * @see #getSemanticTypeIdentifier()
	 * @see #setSemanticTypeIdentifier(String)
	 * @generated
	 */
	public void unsetSemanticTypeIdentifier() {
		semanticTypeIdentifier = SEMANTIC_TYPE_IDENTIFIER_EDEFAULT;
		semanticTypeIdentifierESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getSemanticTypeIdentifier <em>Semantic Type Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Semantic Type Identifier</em>' attribute is set.
	 * @see #unsetSemanticTypeIdentifier()
	 * @see #getSemanticTypeIdentifier()
	 * @see #setSemanticTypeIdentifier(String)
	 * @generated
	 */
	public boolean isSetSemanticTypeIdentifier() {
		return semanticTypeIdentifierESet;
	}

	/**
	 * Returns the value of the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type</em>' attribute.
	 * @see #isSetFeatureType()
	 * @see #unsetFeatureType()
	 * @see #setFeatureType(String)
	 * @generated
	 */
	public String getFeatureType() {
		return featureType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type</em>' attribute.
	 * @see #isSetFeatureType()
	 * @see #unsetFeatureType()
	 * @see #getFeatureType()
	 * @generated
	 */
	public void setFeatureType(String newFeatureType) {
		featureType = newFeatureType;
		featureTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatureType()
	 * @see #getFeatureType()
	 * @see #setFeatureType(String)
	 * @generated
	 */
	public void unsetFeatureType() {
		featureType = FEATURE_TYPE_EDEFAULT;
		featureTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureType <em>Feature Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feature Type</em>' attribute is set.
	 * @see #unsetFeatureType()
	 * @see #getFeatureType()
	 * @see #setFeatureType(String)
	 * @generated
	 */
	public boolean isSetFeatureType() {
		return featureTypeESet;
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
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}' attribute.
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
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getVersion <em>Version</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Feature Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type Name</em>' attribute.
	 * @see #isSetFeatureTypeName()
	 * @see #unsetFeatureTypeName()
	 * @see #setFeatureTypeName(String)
	 * @generated
	 */
	public String getFeatureTypeName() {
		return featureTypeName;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type Name</em>' attribute.
	 * @see #isSetFeatureTypeName()
	 * @see #unsetFeatureTypeName()
	 * @see #getFeatureTypeName()
	 * @generated
	 */
	public void setFeatureTypeName(String newFeatureTypeName) {
		featureTypeName = newFeatureTypeName;
		featureTypeNameESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatureTypeName()
	 * @see #getFeatureTypeName()
	 * @see #setFeatureTypeName(String)
	 * @generated
	 */
	public void unsetFeatureTypeName() {
		featureTypeName = FEATURE_TYPE_NAME_EDEFAULT;
		featureTypeNameESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureTypeName <em>Feature Type Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feature Type Name</em>' attribute is set.
	 * @see #unsetFeatureTypeName()
	 * @see #getFeatureTypeName()
	 * @see #setFeatureTypeName(String)
	 * @generated
	 */
	public boolean isSetFeatureTypeName() {
		return featureTypeNameESet;
	}

	/**
	 * Returns the value of the '<em><b>Feature Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Constraint</em>' attribute.
	 * @see #isSetFeatureConstraint()
	 * @see #unsetFeatureConstraint()
	 * @see #setFeatureConstraint(String)
	 * @generated
	 */
	public String getFeatureConstraint() {
		return featureConstraint;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Constraint</em>' attribute.
	 * @see #isSetFeatureConstraint()
	 * @see #unsetFeatureConstraint()
	 * @see #getFeatureConstraint()
	 * @generated
	 */
	public void setFeatureConstraint(String newFeatureConstraint) {
		featureConstraint = newFeatureConstraint;
		featureConstraintESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatureConstraint()
	 * @see #getFeatureConstraint()
	 * @see #setFeatureConstraint(String)
	 * @generated
	 */
	public void unsetFeatureConstraint() {
		featureConstraint = FEATURE_CONSTRAINT_EDEFAULT;
		featureConstraintESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getFeatureConstraint <em>Feature Constraint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feature Constraint</em>' attribute is set.
	 * @see #unsetFeatureConstraint()
	 * @see #getFeatureConstraint()
	 * @see #setFeatureConstraint(String)
	 * @generated
	 */
	public boolean isSetFeatureConstraint() {
		return featureConstraintESet;
	}

	/**
	 * Returns the value of the '<em><b>Gml Geometry Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Geometry Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Geometry Styles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlGeometryStyle#getGmlFeatureStyle
	 * @generated
	 */
	public EList<GmlGeometryStyle> getGmlGeometryStyles() {
		if (gmlGeometryStyles == null) {
			gmlGeometryStyles = new BasicInternalEList<GmlGeometryStyle>(GmlGeometryStyle.class);
		}
		return gmlGeometryStyles;
	}

	/**
	 * Returns the value of the '<em><b>Gml Symbols</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Symbols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Symbols</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlSymbol#getGmlFeatureStyles
	 * @generated
	 */
	public EList<GmlSymbol> getGmlSymbols() {
		if (gmlSymbols == null) {
			gmlSymbols = new BasicInternalEList<GmlSymbol>(GmlSymbol.class);
		}
		return gmlSymbols;
	}

	/**
	 * Returns the value of the '<em><b>Gml Tobology Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Tobology Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Tobology Styles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlTopologyStyle#getGmlFeatureStyle
	 * @generated
	 */
	public EList<GmlTopologyStyle> getGmlTobologyStyles() {
		if (gmlTobologyStyles == null) {
			gmlTobologyStyles = new BasicInternalEList<GmlTopologyStyle>(GmlTopologyStyle.class);
		}
		return gmlTobologyStyles;
	}

	/**
	 * Returns the value of the '<em><b>Gml Label Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle <em>Gml Feature Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Label Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Label Styles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlLabelStyle#getGmlFeatureStyle
	 * @generated
	 */
	public EList<GmlLabelStyle> getGmlLabelStyles() {
		if (gmlLabelStyles == null) {
			gmlLabelStyles = new BasicInternalEList<GmlLabelStyle>(GmlLabelStyle.class);
		}
		return gmlLabelStyles;
	}

	/**
	 * Returns the value of the '<em><b>Gml Feature Types</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles <em>Gml Feature Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Types</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles
	 * @generated
	 */
	public EList<GmlFeatureType> getGmlFeatureTypes() {
		if (gmlFeatureTypes == null) {
			gmlFeatureTypes = new BasicInternalEList<GmlFeatureType>(GmlFeatureType.class);
		}
		return gmlFeatureTypes;
	}

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see #isSetBaseType()
	 * @see #unsetBaseType()
	 * @see #setBaseType(String)
	 * @generated
	 */
	public String getBaseType() {
		return baseType;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see #isSetBaseType()
	 * @see #unsetBaseType()
	 * @see #getBaseType()
	 * @generated
	 */
	public void setBaseType(String newBaseType) {
		baseType = newBaseType;
		baseTypeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseType()
	 * @see #getBaseType()
	 * @see #setBaseType(String)
	 * @generated
	 */
	public void unsetBaseType() {
		baseType = BASE_TYPE_EDEFAULT;
		baseTypeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getBaseType <em>Base Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Type</em>' attribute is set.
	 * @see #unsetBaseType()
	 * @see #getBaseType()
	 * @see #setBaseType(String)
	 * @generated
	 */
	public boolean isSetBaseType() {
		return baseTypeESet;
	}

	/**
	 * Returns the value of the '<em><b>Query Grammar</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Grammar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Grammar</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @see #isSetQueryGrammar()
	 * @see #unsetQueryGrammar()
	 * @see #setQueryGrammar(QueryGrammarKind)
	 * @generated
	 */
	public QueryGrammarKind getQueryGrammar() {
		return queryGrammar;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Grammar</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.QueryGrammarKind
	 * @see #isSetQueryGrammar()
	 * @see #unsetQueryGrammar()
	 * @see #getQueryGrammar()
	 * @generated
	 */
	public void setQueryGrammar(QueryGrammarKind newQueryGrammar) {
		queryGrammar = newQueryGrammar == null ? QUERY_GRAMMAR_EDEFAULT : newQueryGrammar;
		queryGrammarESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueryGrammar()
	 * @see #getQueryGrammar()
	 * @see #setQueryGrammar(QueryGrammarKind)
	 * @generated
	 */
	public void unsetQueryGrammar() {
		queryGrammar = QUERY_GRAMMAR_EDEFAULT;
		queryGrammarESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getQueryGrammar <em>Query Grammar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Query Grammar</em>' attribute is set.
	 * @see #unsetQueryGrammar()
	 * @see #getQueryGrammar()
	 * @see #setQueryGrammar(QueryGrammarKind)
	 * @generated
	 */
	public boolean isSetQueryGrammar() {
		return queryGrammarESet;
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlGeometryStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlSymbols()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlTobologyStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlLabelStyles()).basicAdd(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFeatureTypes()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return ((InternalEList<?>)getGmlGeometryStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return ((InternalEList<?>)getGmlSymbols()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return ((InternalEList<?>)getGmlTobologyStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return ((InternalEList<?>)getGmlLabelStyles()).basicRemove(otherEnd, msgs);
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return ((InternalEList<?>)getGmlFeatureTypes()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				return getSemanticTypeIdentifier();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				return getFeatureType();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				return getVersion();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				return getFeatureTypeName();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				return getFeatureConstraint();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return getGmlGeometryStyles();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return getGmlSymbols();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return getGmlTobologyStyles();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return getGmlLabelStyles();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return getGmlFeatureTypes();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				return getBaseType();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				return getQueryGrammar();
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				setSemanticTypeIdentifier((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				setFeatureType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				setVersion((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				setFeatureTypeName((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				setFeatureConstraint((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				getGmlGeometryStyles().addAll((Collection<? extends GmlGeometryStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				getGmlSymbols().clear();
				getGmlSymbols().addAll((Collection<? extends GmlSymbol>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				getGmlTobologyStyles().clear();
				getGmlTobologyStyles().addAll((Collection<? extends GmlTopologyStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				getGmlLabelStyles().clear();
				getGmlLabelStyles().addAll((Collection<? extends GmlLabelStyle>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				getGmlFeatureTypes().clear();
				getGmlFeatureTypes().addAll((Collection<? extends GmlFeatureType>)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				setBaseType((String)newValue);
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				setQueryGrammar((QueryGrammarKind)newValue);
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				unsetSemanticTypeIdentifier();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				unsetFeatureType();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				unsetVersion();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				unsetFeatureTypeName();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				unsetFeatureConstraint();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				getGmlGeometryStyles().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				getGmlSymbols().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				getGmlTobologyStyles().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				getGmlLabelStyles().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				getGmlFeatureTypes().clear();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				unsetBaseType();
				return;
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				unsetQueryGrammar();
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
			case InfGMLSupportPackage.GML_FEATURE_STYLE__SEMANTIC_TYPE_IDENTIFIER:
				return isSetSemanticTypeIdentifier();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE:
				return isSetFeatureType();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__VERSION:
				return isSetVersion();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_TYPE_NAME:
				return isSetFeatureTypeName();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__FEATURE_CONSTRAINT:
				return isSetFeatureConstraint();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_GEOMETRY_STYLES:
				return gmlGeometryStyles != null && !gmlGeometryStyles.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_SYMBOLS:
				return gmlSymbols != null && !gmlSymbols.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_TOBOLOGY_STYLES:
				return gmlTobologyStyles != null && !gmlTobologyStyles.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_LABEL_STYLES:
				return gmlLabelStyles != null && !gmlLabelStyles.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__GML_FEATURE_TYPES:
				return gmlFeatureTypes != null && !gmlFeatureTypes.isEmpty();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__BASE_TYPE:
				return isSetBaseType();
			case InfGMLSupportPackage.GML_FEATURE_STYLE__QUERY_GRAMMAR:
				return isSetQueryGrammar();
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
		result.append(" (semanticTypeIdentifier: ");
		if (semanticTypeIdentifierESet) result.append(semanticTypeIdentifier); else result.append("<unset>");
		result.append(", featureType: ");
		if (featureTypeESet) result.append(featureType); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(", featureTypeName: ");
		if (featureTypeNameESet) result.append(featureTypeName); else result.append("<unset>");
		result.append(", featureConstraint: ");
		if (featureConstraintESet) result.append(featureConstraint); else result.append("<unset>");
		result.append(", baseType: ");
		if (baseTypeESet) result.append(baseType); else result.append("<unset>");
		result.append(", queryGrammar: ");
		if (queryGrammarESet) result.append(queryGrammar); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // GmlFeatureStyle
