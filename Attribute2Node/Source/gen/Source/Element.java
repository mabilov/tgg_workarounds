/**
 */
package Source;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Source.Element#get_special <em>special</em>}</li>
 *   <li>{@link Source.Element#getId <em>Id</em>}</li>
 *   <li>{@link Source.Element#getSpecialAttr <em>Special Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see Source.SourcePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>special</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>special</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>special</em>' containment reference.
	 * @see #set_special(_SpecialAttrType)
	 * @see Source.SourcePackage#getElement__special()
	 * @model containment="true"
	 * @generated
	 */
	_SpecialAttrType get_special();

	/**
	 * Sets the value of the '{@link Source.Element#get_special <em>special</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>special</em>' containment reference.
	 * @see #get_special()
	 * @generated
	 */
	void set_special(_SpecialAttrType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Source.SourcePackage#getElement_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Source.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Special Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Attr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Attr</em>' attribute.
	 * @see #setSpecialAttr(String)
	 * @see Source.SourcePackage#getElement_SpecialAttr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSpecialAttr();

	/**
	 * Sets the value of the '{@link Source.Element#getSpecialAttr <em>Special Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Attr</em>' attribute.
	 * @see #getSpecialAttr()
	 * @generated
	 */
	void setSpecialAttr(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Element
