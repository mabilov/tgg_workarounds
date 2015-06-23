/**
 */
package Source;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Source.SplitMerge#isMerge <em>Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @see Source.SourcePackage#getSplitMerge()
 * @model
 * @generated
 */
public interface SplitMerge extends Element {
	/**
	 * Returns the value of the '<em><b>Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge</em>' attribute.
	 * @see #setMerge(boolean)
	 * @see Source.SourcePackage#getSplitMerge_Merge()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isMerge();

	/**
	 * Sets the value of the '{@link Source.SplitMerge#isMerge <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge</em>' attribute.
	 * @see #isMerge()
	 * @generated
	 */
	void setMerge(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SplitMerge
