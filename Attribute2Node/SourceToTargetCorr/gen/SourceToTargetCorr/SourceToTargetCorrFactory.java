/**
 */
package SourceToTargetCorr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SourceToTargetCorr.SourceToTargetCorrPackage
 * @generated
 */
public interface SourceToTargetCorrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourceToTargetCorrFactory eINSTANCE = SourceToTargetCorr.impl.SourceToTargetCorrFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>SM2TM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SM2TM</em>'.
	 * @generated
	 */
	SM2TM createSM2TM();

	/**
	 * Returns a new object of class '<em>E2S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E2S</em>'.
	 * @generated
	 */
	E2S createE2S();

	/**
	 * Returns a new object of class '<em>E2 Sp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E2 Sp</em>'.
	 * @generated
	 */
	E2Sp createE2Sp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SourceToTargetCorrPackage getSourceToTargetCorrPackage();

} //SourceToTargetCorrFactory
