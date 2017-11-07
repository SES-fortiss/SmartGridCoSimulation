/**
 */
package CIM15.IEC61970.Informative.InfGMLSupport;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Map extends Diagram {
	/**
	 * The default value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPageNumber() <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNumber()
	 * @generated
	 * @ordered
	 */
	protected int pageNumber = PAGE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Page Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pageNumberESet;

	/**
	 * The default value of the '{@link #getMapLocGrid() <em>Map Loc Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLocGrid()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_LOC_GRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapLocGrid() <em>Map Loc Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLocGrid()
	 * @generated
	 * @ordered
	 */
	protected String mapLocGrid = MAP_LOC_GRID_EDEFAULT;

	/**
	 * This is true if the Map Loc Grid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mapLocGridESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfGMLSupportPackage.Literals.MAP;
	}

	/**
	 * Returns the value of the '<em><b>Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Number</em>' attribute.
	 * @see #isSetPageNumber()
	 * @see #unsetPageNumber()
	 * @see #setPageNumber(int)
	 * @generated
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Number</em>' attribute.
	 * @see #isSetPageNumber()
	 * @see #unsetPageNumber()
	 * @see #getPageNumber()
	 * @generated
	 */
	public void setPageNumber(int newPageNumber) {
		pageNumber = newPageNumber;
		pageNumberESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPageNumber()
	 * @see #getPageNumber()
	 * @see #setPageNumber(int)
	 * @generated
	 */
	public void unsetPageNumber() {
		pageNumber = PAGE_NUMBER_EDEFAULT;
		pageNumberESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getPageNumber <em>Page Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Number</em>' attribute is set.
	 * @see #unsetPageNumber()
	 * @see #getPageNumber()
	 * @see #setPageNumber(int)
	 * @generated
	 */
	public boolean isSetPageNumber() {
		return pageNumberESet;
	}

	/**
	 * Returns the value of the '<em><b>Map Loc Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Loc Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Loc Grid</em>' attribute.
	 * @see #isSetMapLocGrid()
	 * @see #unsetMapLocGrid()
	 * @see #setMapLocGrid(String)
	 * @generated
	 */
	public String getMapLocGrid() {
		return mapLocGrid;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Loc Grid</em>' attribute.
	 * @see #isSetMapLocGrid()
	 * @see #unsetMapLocGrid()
	 * @see #getMapLocGrid()
	 * @generated
	 */
	public void setMapLocGrid(String newMapLocGrid) {
		mapLocGrid = newMapLocGrid;
		mapLocGridESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMapLocGrid()
	 * @see #getMapLocGrid()
	 * @see #setMapLocGrid(String)
	 * @generated
	 */
	public void unsetMapLocGrid() {
		mapLocGrid = MAP_LOC_GRID_EDEFAULT;
		mapLocGridESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfGMLSupport.Map#getMapLocGrid <em>Map Loc Grid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map Loc Grid</em>' attribute is set.
	 * @see #unsetMapLocGrid()
	 * @see #getMapLocGrid()
	 * @see #setMapLocGrid(String)
	 * @generated
	 */
	public boolean isSetMapLocGrid() {
		return mapLocGridESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				return getPageNumber();
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				return getMapLocGrid();
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
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				setPageNumber((Integer)newValue);
				return;
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				setMapLocGrid((String)newValue);
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
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				unsetPageNumber();
				return;
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				unsetMapLocGrid();
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
			case InfGMLSupportPackage.MAP__PAGE_NUMBER:
				return isSetPageNumber();
			case InfGMLSupportPackage.MAP__MAP_LOC_GRID:
				return isSetMapLocGrid();
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
		result.append(" (pageNumber: ");
		if (pageNumberESet) result.append(pageNumber); else result.append("<unset>");
		result.append(", mapLocGrid: ");
		if (mapLocGridESet) result.append(mapLocGrid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // Map
