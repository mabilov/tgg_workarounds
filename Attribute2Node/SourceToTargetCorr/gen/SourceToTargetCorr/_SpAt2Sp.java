/**
 */
package SourceToTargetCorr;

import Source._SpecialAttrType;

import TGGRuntime.AbstractCorrespondence;

import Target.Special;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sp At2 Sp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SourceToTargetCorr._SpAt2Sp#getSource <em>Source</em>}</li>
 *   <li>{@link SourceToTargetCorr._SpAt2Sp#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see SourceToTargetCorr.SourceToTargetCorrPackage#get_SpAt2Sp()
 * @model
 * @generated
 */
public interface _SpAt2Sp extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(_SpecialAttrType)
	 * @see SourceToTargetCorr.SourceToTargetCorrPackage#get_SpAt2Sp_Source()
	 * @model required="true"
	 * @generated
	 */
	_SpecialAttrType getSource();

	/**
	 * Sets the value of the '{@link SourceToTargetCorr._SpAt2Sp#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(_SpecialAttrType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Special)
	 * @see SourceToTargetCorr.SourceToTargetCorrPackage#get_SpAt2Sp_Target()
	 * @model required="true"
	 * @generated
	 */
	Special getTarget();

	/**
	 * Sets the value of the '{@link SourceToTargetCorr._SpAt2Sp#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Special value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // _SpAt2Sp
