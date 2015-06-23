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
	 * Returns a new object of class '<em>A2S Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A2S Rule</em>'.
	 * @generated
	 */
	A2SRule createA2SRule();

	/**
	 * Returns a new object of class '<em>Sp M2 Sp SRule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sp M2 Sp SRule</em>'.
	 * @generated
	 */
	SpM2SpSRule createSpM2SpSRule();

	/**
	 * Returns a new object of class '<em>Next Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Rule</em>'.
	 * @generated
	 */
	NextRule createNextRule();

	/**
	 * Returns a new object of class '<em>Continue Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue Rule</em>'.
	 * @generated
	 */
	ContinueRule createContinueRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
