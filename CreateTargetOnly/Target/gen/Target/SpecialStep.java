/**
 */
package Target;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Target.SpecialStep#getContinue <em>Continue</em>}</li>
 * </ul>
 * </p>
 *
 * @see Target.TargetPackage#getSpecialStep()
 * @model
 * @generated
 */
public interface SpecialStep extends Step {
	/**
	 * Returns the value of the '<em><b>Continue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Continue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue</em>' reference.
	 * @see #setContinue(SpecialStep)
	 * @see Target.TargetPackage#getSpecialStep_Continue()
	 * @model
	 * @generated
	 */
	SpecialStep getContinue();

	/**
	 * Sets the value of the '{@link Target.SpecialStep#getContinue <em>Continue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue</em>' reference.
	 * @see #getContinue()
	 * @generated
	 */
	void setContinue(SpecialStep value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SpecialStep
