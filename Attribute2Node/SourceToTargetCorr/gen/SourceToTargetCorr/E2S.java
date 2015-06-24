/**
 */
package SourceToTargetCorr;

import Source.Element;

import TGGRuntime.AbstractCorrespondence;

import Target.Step;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>E2S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SourceToTargetCorr.E2S#getSource <em>Source</em>}</li>
 *   <li>{@link SourceToTargetCorr.E2S#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SourceToTargetCorr.SourceToTargetCorrPackage#getE2S()
 * @model
 * @generated
 */
public interface E2S extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see SourceToTargetCorr.SourceToTargetCorrPackage#getE2S_Source()
	 * @model required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link SourceToTargetCorr.E2S#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Step)
	 * @see SourceToTargetCorr.SourceToTargetCorrPackage#getE2S_Target()
	 * @model required="true"
	 * @generated
	 */
	Step getTarget();

	/**
	 * Sets the value of the '{@link SourceToTargetCorr.E2S#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Step value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // E2S
