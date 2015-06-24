/**
 */
package Target;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Target.Special#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Target.TargetPackage#getSpecial()
 * @model
 * @generated
 */
public interface Special extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Target.TargetPackage#getSpecial_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Target.Special#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Special
