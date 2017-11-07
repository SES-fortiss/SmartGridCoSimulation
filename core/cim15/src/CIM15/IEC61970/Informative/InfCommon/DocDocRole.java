/**
 */
package CIM15.IEC61970.Informative.InfCommon;

import CIM15.IEC61968.Common.CommonPackage;
import CIM15.IEC61968.Common.Document;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doc Doc Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.DocDocRole#getToDocument <em>To Document</em>}</li>
 *   <li>{@link CIM15.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument <em>From Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocDocRole extends Role {
	/**
	 * The cached value of the '{@link #getToDocument() <em>To Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDocument()
	 * @generated
	 * @ordered
	 */
	protected Document toDocument;

	/**
	 * The cached value of the '{@link #getFromDocument() <em>From Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDocument()
	 * @generated
	 * @ordered
	 */
	protected Document fromDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocDocRole() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCommonPackage.Literals.DOC_DOC_ROLE;
	}

	/**
	 * Returns the value of the '<em><b>To Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Document#getFromDocumentRoles <em>From Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Document</em>' reference.
	 * @see #setToDocument(Document)
	 * @see CIM15.IEC61968.Common.Document#getFromDocumentRoles
	 * @generated
	 */
	public Document getToDocument() {
		if (toDocument != null && toDocument.eIsProxy()) {
			InternalEObject oldToDocument = (InternalEObject)toDocument;
			toDocument = (Document)eResolveProxy(oldToDocument);
			if (toDocument != oldToDocument) {
			}
		}
		return toDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetToDocument() {
		return toDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToDocument(Document newToDocument, NotificationChain msgs) {
		Document oldToDocument = toDocument;
		toDocument = newToDocument;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.DocDocRole#getToDocument <em>To Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Document</em>' reference.
	 * @see #getToDocument()
	 * @generated
	 */
	public void setToDocument(Document newToDocument) {
		if (newToDocument != toDocument) {
			NotificationChain msgs = null;
			if (toDocument != null)
				msgs = ((InternalEObject)toDocument).eInverseRemove(this, CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES, Document.class, msgs);
			if (newToDocument != null)
				msgs = ((InternalEObject)newToDocument).eInverseAdd(this, CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES, Document.class, msgs);
			msgs = basicSetToDocument(newToDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * Returns the value of the '<em><b>From Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM15.IEC61968.Common.Document#getToDocumentRoles <em>To Document Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Document</em>' reference.
	 * @see #setFromDocument(Document)
	 * @see CIM15.IEC61968.Common.Document#getToDocumentRoles
	 * @generated
	 */
	public Document getFromDocument() {
		if (fromDocument != null && fromDocument.eIsProxy()) {
			InternalEObject oldFromDocument = (InternalEObject)fromDocument;
			fromDocument = (Document)eResolveProxy(oldFromDocument);
			if (fromDocument != oldFromDocument) {
			}
		}
		return fromDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetFromDocument() {
		return fromDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromDocument(Document newFromDocument, NotificationChain msgs) {
		Document oldFromDocument = fromDocument;
		fromDocument = newFromDocument;
		return msgs;
	}

	/**
	 * Sets the value of the '{@link CIM15.IEC61970.Informative.InfCommon.DocDocRole#getFromDocument <em>From Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Document</em>' reference.
	 * @see #getFromDocument()
	 * @generated
	 */
	public void setFromDocument(Document newFromDocument) {
		if (newFromDocument != fromDocument) {
			NotificationChain msgs = null;
			if (fromDocument != null)
				msgs = ((InternalEObject)fromDocument).eInverseRemove(this, CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES, Document.class, msgs);
			if (newFromDocument != null)
				msgs = ((InternalEObject)newFromDocument).eInverseAdd(this, CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES, Document.class, msgs);
			msgs = basicSetFromDocument(newFromDocument, msgs);
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
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				if (toDocument != null)
					msgs = ((InternalEObject)toDocument).eInverseRemove(this, CommonPackage.DOCUMENT__FROM_DOCUMENT_ROLES, Document.class, msgs);
				return basicSetToDocument((Document)otherEnd, msgs);
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				if (fromDocument != null)
					msgs = ((InternalEObject)fromDocument).eInverseRemove(this, CommonPackage.DOCUMENT__TO_DOCUMENT_ROLES, Document.class, msgs);
				return basicSetFromDocument((Document)otherEnd, msgs);
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
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				return basicSetToDocument(null, msgs);
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				return basicSetFromDocument(null, msgs);
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
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				if (resolve) return getToDocument();
				return basicGetToDocument();
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				if (resolve) return getFromDocument();
				return basicGetFromDocument();
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
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				setToDocument((Document)newValue);
				return;
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				setFromDocument((Document)newValue);
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
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				setToDocument((Document)null);
				return;
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				setFromDocument((Document)null);
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
			case InfCommonPackage.DOC_DOC_ROLE__TO_DOCUMENT:
				return toDocument != null;
			case InfCommonPackage.DOC_DOC_ROLE__FROM_DOCUMENT:
				return fromDocument != null;
		}
		return super.eIsSet(featureID);
	}

} // DocDocRole
