/**
 */
package SourceToTargetCorr;

import Source.SourceModel;

import TGGRuntime.AbstractCorrespondence;

import Target.TargetModel;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SM2TM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SourceToTargetCorr.SM2TM#getSource <em>Source</em>}</li>
 *   <li>{@link SourceToTargetCorr.SM2TM#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SourceToTargetCorr.SourceToTargetCorrPackage#getSM2TM()
 * @model
 * @generated
 */
public interface SM2TM extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SourceModel)
	 * @see SourceToTargetCorr.SourceToTargetCorrPackage#getSM2TM_Source()
	 * @model required="true"
	 * @generated
	 */
	SourceModel getSource();

	/**
	 * Sets the value of the '{@link SourceToTargetCorr.SM2TM#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TargetModel)
	 * @see SourceToTargetCorr.SourceToTargetCorrPackage#getSM2TM_Target()
	 * @model required="true"
	 * @generated
	 */
	TargetModel getTarget();

	/**
	 * Sets the value of the '{@link SourceToTargetCorr.SM2TM#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetModel value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SM2TM
