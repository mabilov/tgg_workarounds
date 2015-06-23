/**
 */
package SourceToTargetCorr.Rules.util;

import SourceToTargetCorr.Rules.*;

import TGGRuntime.AbstractRule;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SourceToTargetCorr.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseClass1(Class1 object) {
			return createClass1Adapter();
		}

		@Override
		public Adapter caseA2SRule(A2SRule object) {
			return createA2SRuleAdapter();
		}

		@Override
		public Adapter caseSpM2SpSRule(SpM2SpSRule object) {
			return createSpM2SpSRuleAdapter();
		}

		@Override
		public Adapter caseNextRule(NextRule object) {
			return createNextRuleAdapter();
		}

		@Override
		public Adapter caseContinueRule(ContinueRule object) {
			return createContinueRuleAdapter();
		}

		@Override
		public Adapter caseContinueFixRule(ContinueFixRule object) {
			return createContinueFixRuleAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link SourceToTargetCorr.Rules.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SourceToTargetCorr.Rules.Class1
	 * @generated
	 */
	public Adapter createClass1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SourceToTargetCorr.Rules.A2SRule <em>A2S Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SourceToTargetCorr.Rules.A2SRule
	 * @generated
	 */
	public Adapter createA2SRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SourceToTargetCorr.Rules.SpM2SpSRule <em>Sp M2 Sp SRule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule
	 * @generated
	 */
	public Adapter createSpM2SpSRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SourceToTargetCorr.Rules.NextRule <em>Next Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SourceToTargetCorr.Rules.NextRule
	 * @generated
	 */
	public Adapter createNextRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SourceToTargetCorr.Rules.ContinueRule <em>Continue Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SourceToTargetCorr.Rules.ContinueRule
	 * @generated
	 */
	public Adapter createContinueRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SourceToTargetCorr.Rules.ContinueFixRule <em>Continue Fix Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SourceToTargetCorr.Rules.ContinueFixRule
	 * @generated
	 */
	public Adapter createContinueFixRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TGGRuntime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TGGRuntime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RulesAdapterFactory
