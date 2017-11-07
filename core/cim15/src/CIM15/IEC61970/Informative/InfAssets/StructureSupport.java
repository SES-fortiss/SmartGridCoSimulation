/**
 */
package CIM15.IEC61970.Informative.InfAssets;

import CIM15.IEC61968.Assets.Asset;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getLength <em>Length</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSecuredStructure <em>Secured Structure</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getDirection <em>Direction</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorKind <em>Anchor Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureSupport extends Asset {
	/**
	 * The default value of the '{@link #getAnchorRodCount() <em>Anchor Rod Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ANCHOR_ROD_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnchorRodCount() <em>Anchor Rod Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodCount()
	 * @generated
	 * @ordered
	 */
	protected int anchorRodCount = ANCHOR_ROD_COUNT_EDEFAULT;

	/**
	 * This is true if the Anchor Rod Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorRodCountESet;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * This is true if the Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lengthESet;

	/**
	 * The default value of the '{@link #getAnchorRodLength() <em>Anchor Rod Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodLength()
	 * @generated
	 * @ordered
	 */
	protected static final float ANCHOR_ROD_LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAnchorRodLength() <em>Anchor Rod Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorRodLength()
	 * @generated
	 * @ordered
	 */
	protected float anchorRodLength = ANCHOR_ROD_LENGTH_EDEFAULT;

	/**
	 * This is true if the Anchor Rod Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorRodLengthESet;

	/**
	 * The cached value of the '{@link #getSecuredStructure() <em>Secured Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredStructure()
	 * @generated
	 * @ordered
	 */
	protected Structure securedStructure;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final float DIRECTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected float direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getAnchorKind() <em>Anchor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorKind()
	 * @generated
	 * @ordered
	 */
	protected static final AnchorKind ANCHOR_KIND_EDEFAULT = AnchorKind.CONCRETE;

	/**
	 * The cached value of the '{@link #getAnchorKind() <em>Anchor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorKind()
	 * @generated
	 * @ordered
	 */
	protected AnchorKind anchorKind = ANCHOR_KIND_EDEFAULT;

	/**
	 * This is true if the Anchor Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorKindESet;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final StructureSupportKind KIND_EDEFAULT = StructureSupportKind.GUY;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected StructureSupportKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureSupport() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getStructureSupport();
	}

	/**
	 * Returns the value of the '<em><b>Anchor Rod Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Rod Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Rod Count</em>' attribute.
	 * @see #isSetAnchorRodCount()
	 * @see #unsetAnchorRodCount()
	 * @see #setAnchorRodCount(int)
	 * @generated
	 */
	public int getAnchorRodCount() {
		return anchorRodCount;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Rod Count</em>' attribute.
	 * @see #isSetAnchorRodCount()
	 * @see #unsetAnchorRodCount()
	 * @see #getAnchorRodCount()
	 * @generated
	 */
	public void setAnchorRodCount(int newAnchorRodCount) {
		anchorRodCount = newAnchorRodCount;
		anchorRodCountESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorRodCount()
	 * @see #getAnchorRodCount()
	 * @see #setAnchorRodCount(int)
	 * @generated
	 */
	public void unsetAnchorRodCount() {
		anchorRodCount = ANCHOR_ROD_COUNT_EDEFAULT;
		anchorRodCountESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor Rod Count</em>' attribute is set.
	 * @see #unsetAnchorRodCount()
	 * @see #getAnchorRodCount()
	 * @see #setAnchorRodCount(int)
	 * @generated
	 */
	public boolean isSetAnchorRodCount() {
		return anchorRodCountESet;
	}

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(float)
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	public void setLength(float newLength) {
		length = newLength;
		lengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(float)
	 * @generated
	 */
	public void unsetLength() {
		length = LENGTH_EDEFAULT;
		lengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(float)
	 * @generated
	 */
	public boolean isSetLength() {
		return lengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Anchor Rod Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Rod Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Rod Length</em>' attribute.
	 * @see #isSetAnchorRodLength()
	 * @see #unsetAnchorRodLength()
	 * @see #setAnchorRodLength(float)
	 * @generated
	 */
	public float getAnchorRodLength() {
		return anchorRodLength;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Rod Length</em>' attribute.
	 * @see #isSetAnchorRodLength()
	 * @see #unsetAnchorRodLength()
	 * @see #getAnchorRodLength()
	 * @generated
	 */
	public void setAnchorRodLength(float newAnchorRodLength) {
		anchorRodLength = newAnchorRodLength;
		anchorRodLengthESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorRodLength()
	 * @see #getAnchorRodLength()
	 * @see #setAnchorRodLength(float)
	 * @generated
	 */
	public void unsetAnchorRodLength() {
		anchorRodLength = ANCHOR_ROD_LENGTH_EDEFAULT;
		anchorRodLengthESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor Rod Length</em>' attribute is set.
	 * @see #unsetAnchorRodLength()
	 * @see #getAnchorRodLength()
	 * @see #setAnchorRodLength(float)
	 * @generated
	 */
	public boolean isSetAnchorRodLength() {
		return anchorRodLengthESet;
	}

	/**
	 * Returns the value of the '<em><b>Secured Structure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61970.Informative.InfAssets.Structure#getStructureSupportInfos <em>Structure Support Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secured Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secured Structure</em>' reference.
	 * @see #setSecuredStructure(Structure)
	 * @see CIM15.IEC61970.Informative.InfAssets.Structure#getStructureSupportInfos
	 * @generated
	 */
	public Structure getSecuredStructure() {
		if (securedStructure != null && securedStructure.eIsProxy()) {
			InternalEObject oldSecuredStructure = (InternalEObject)securedStructure;
			securedStructure = (Structure)eResolveProxy(oldSecuredStructure);
			if (securedStructure != oldSecuredStructure) {
			}
		}
		return securedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetSecuredStructure() {
		return securedStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuredStructure(Structure newSecuredStructure, NotificationChain msgs) {
		Structure oldSecuredStructure = securedStructure;
		securedStructure = newSecuredStructure;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSecuredStructure <em>Secured Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secured Structure</em>' reference.
	 * @see #getSecuredStructure()
	 * @generated
	 */
	public void setSecuredStructure(Structure newSecuredStructure) {
		if (newSecuredStructure != securedStructure) {
			NotificationChain msgs = null;
			if (securedStructure != null)
				msgs = ((InternalEObject)securedStructure).eInverseRemove(this, InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS, Structure.class, msgs);
			if (newSecuredStructure != null)
				msgs = ((InternalEObject)newSecuredStructure).eInverseAdd(this, InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS, Structure.class, msgs);
			msgs = basicSetSecuredStructure(newSecuredStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(float)
	 * @generated
	 */
	public float getDirection() {
		return direction;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	public void setDirection(float newDirection) {
		direction = newDirection;
		directionESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(float)
	 * @generated
	 */
	public void unsetDirection() {
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(float)
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * Returns the value of the '<em><b>Anchor Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.AnchorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.AnchorKind
	 * @see #isSetAnchorKind()
	 * @see #unsetAnchorKind()
	 * @see #setAnchorKind(AnchorKind)
	 * @generated
	 */
	public AnchorKind getAnchorKind() {
		return anchorKind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorKind <em>Anchor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.AnchorKind
	 * @see #isSetAnchorKind()
	 * @see #unsetAnchorKind()
	 * @see #getAnchorKind()
	 * @generated
	 */
	public void setAnchorKind(AnchorKind newAnchorKind) {
		anchorKind = newAnchorKind == null ? ANCHOR_KIND_EDEFAULT : newAnchorKind;
		anchorKindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorKind <em>Anchor Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorKind()
	 * @see #getAnchorKind()
	 * @see #setAnchorKind(AnchorKind)
	 * @generated
	 */
	public void unsetAnchorKind() {
		anchorKind = ANCHOR_KIND_EDEFAULT;
		anchorKindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getAnchorKind <em>Anchor Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor Kind</em>' attribute is set.
	 * @see #unsetAnchorKind()
	 * @see #getAnchorKind()
	 * @see #setAnchorKind(AnchorKind)
	 * @generated
	 */
	public boolean isSetAnchorKind() {
		return anchorKindESet;
	}

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CIM15.IEC61970.Informative.InfAssets.StructureSupportKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(StructureSupportKind)
	 * @generated
	 */
	public StructureSupportKind getKind() {
		return kind;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CIM15.IEC61970.Informative.InfAssets.StructureSupportKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	public void setKind(StructureSupportKind newKind) {
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		kindESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(StructureSupportKind)
	 * @generated
	 */
	public void unsetKind() {
		kind = KIND_EDEFAULT;
		kindESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(StructureSupportKind)
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(String)
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	public void setSize(String newSize) {
		size = newSize;
		sizeESet = true;
	}

	/**
	 * Unsets the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(String)
	 * @generated
	 */
	public void unsetSize() {
		size = SIZE_EDEFAULT;
		sizeESet = false;
	}

	/**
	 * Returns whether the value of the '{@link CIM15.IEC61970.Informative.InfAssets.StructureSupport#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(String)
	 * @generated
	 */
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
				if (securedStructure != null)
					msgs = ((InternalEObject)securedStructure).eInverseRemove(this, InfAssetsPackage.STRUCTURE__STRUCTURE_SUPPORT_INFOS, Structure.class, msgs);
				return basicSetSecuredStructure((Structure)otherEnd, msgs);
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
			case InfAssetsPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
				return basicSetSecuredStructure(null, msgs);
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
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
				return getAnchorRodCount();
			case InfAssetsPackage.STRUCTURE_SUPPORT__LENGTH:
				return getLength();
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
				return getAnchorRodLength();
			case InfAssetsPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
				if (resolve) return getSecuredStructure();
				return basicGetSecuredStructure();
			case InfAssetsPackage.STRUCTURE_SUPPORT__DIRECTION:
				return getDirection();
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_KIND:
				return getAnchorKind();
			case InfAssetsPackage.STRUCTURE_SUPPORT__KIND:
				return getKind();
			case InfAssetsPackage.STRUCTURE_SUPPORT__SIZE:
				return getSize();
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
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
				setAnchorRodCount((Integer)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__LENGTH:
				setLength((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
				setAnchorRodLength((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
				setSecuredStructure((Structure)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__DIRECTION:
				setDirection((Float)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_KIND:
				setAnchorKind((AnchorKind)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__KIND:
				setKind((StructureSupportKind)newValue);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__SIZE:
				setSize((String)newValue);
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
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
				unsetAnchorRodCount();
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__LENGTH:
				unsetLength();
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
				unsetAnchorRodLength();
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
				setSecuredStructure((Structure)null);
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__DIRECTION:
				unsetDirection();
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_KIND:
				unsetAnchorKind();
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__KIND:
				unsetKind();
				return;
			case InfAssetsPackage.STRUCTURE_SUPPORT__SIZE:
				unsetSize();
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
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_COUNT:
				return isSetAnchorRodCount();
			case InfAssetsPackage.STRUCTURE_SUPPORT__LENGTH:
				return isSetLength();
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_ROD_LENGTH:
				return isSetAnchorRodLength();
			case InfAssetsPackage.STRUCTURE_SUPPORT__SECURED_STRUCTURE:
				return securedStructure != null;
			case InfAssetsPackage.STRUCTURE_SUPPORT__DIRECTION:
				return isSetDirection();
			case InfAssetsPackage.STRUCTURE_SUPPORT__ANCHOR_KIND:
				return isSetAnchorKind();
			case InfAssetsPackage.STRUCTURE_SUPPORT__KIND:
				return isSetKind();
			case InfAssetsPackage.STRUCTURE_SUPPORT__SIZE:
				return isSetSize();
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
		result.append(" (anchorRodCount: ");
		if (anchorRodCountESet) result.append(anchorRodCount); else result.append("<unset>");
		result.append(", length: ");
		if (lengthESet) result.append(length); else result.append("<unset>");
		result.append(", anchorRodLength: ");
		if (anchorRodLengthESet) result.append(anchorRodLength); else result.append("<unset>");
		result.append(", direction: ");
		if (directionESet) result.append(direction); else result.append("<unset>");
		result.append(", anchorKind: ");
		if (anchorKindESet) result.append(anchorKind); else result.append("<unset>");
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // StructureSupport
