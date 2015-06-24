/**
 */
package SourceToTargetCorr.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SourceToTargetCorr.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = SourceToTargetCorr.Rules.impl.RulesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class1</em>'.
	 * @generated
	 */
	Class1 createClass1();

	/**
	 * Returns a new object of class '<em>E2S Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E2S Rule</em>'.
	 * @generated
	 */
	E2SRule createE2SRule();

	/**
	 * Returns a new object of class '<em>EA2S Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EA2S Rule</em>'.
	 * @generated
	 */
	EA2SRule createEA2SRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
