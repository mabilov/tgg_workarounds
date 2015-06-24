/**
 */
package Target;

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
 *   <li>{@link Target.TargetModel#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see Target.TargetPackage#getTargetModel()
 * @model
 * @generated
 */
public interface TargetModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link Target.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see Target.TargetPackage#getTargetModel_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TargetModel
