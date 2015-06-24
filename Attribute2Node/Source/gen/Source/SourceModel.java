/**
 */
package Source;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Source.SourceModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see Source.SourcePackage#getSourceModel()
 * @model
 * @generated
 */
public interface SourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link Source.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see Source.SourcePackage#getSourceModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SourceModel
