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
 * A representation of the model object '<em><b>Gml Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureType#getGmlFeatureStyles <em>Gml Feature Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GmlFeatureType extends IdentifiedObject {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlFeatureType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.GML_FEATURE_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Gml Feature Styles</b></em>' reference list.
	 * The list contents are of type {@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle}.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes <em>Gml Feature Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gml Feature Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gml Feature Styles</em>' reference list.
	 * @see CIM15.IEC61970.Informative.InfGMLSupport.GmlFeatureStyle#getGmlFeatureTypes
	 * @generated
	 */
	public EList<GmlFeatureStyle> getGmlFeatureStyles() {
		if (gmlFeatureStyles == null) {
			gmlFeatureStyles = new BasicInternalEList<GmlFeatureStyle>(GmlFeatureStyle.class);
		}
		return gmlFeatureStyles;
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGmlFeatureStyles()).basicAdd(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return ((InternalEList<?>)getGmlFeatureStyles()).basicRemove(otherEnd, msgs);
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return getGmlFeatureStyles();
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
				getGmlFeatureStyles().addAll((Collection<? extends GmlFeatureStyle>)newValue);
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				getGmlFeatureStyles().clear();
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
			case InfGMLSupportPackage.GML_FEATURE_TYPE__GML_FEATURE_STYLES:
				return gmlFeatureStyles != null && !gmlFeatureStyles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // GmlFeatureType
