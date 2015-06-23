/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.SourceFactory;
import Source.SourceModel;

import SourceToTargetCorr.Rules.Class1;
import SourceToTargetCorr.Rules.RulesPackage;

import SourceToTargetCorr.SM2TM;
import SourceToTargetCorr.SourceToTargetCorrFactory;

import TGGLanguage.csp.CSP;

import TGGLanguage.modelgenerator.RuleEntryContainer;

import TGGRuntime.EMoflonEdge;
import TGGRuntime.EObjectContainer;
import TGGRuntime.IsApplicableMatch;
import TGGRuntime.IsApplicableRuleResult;
import TGGRuntime.Match;
import TGGRuntime.ModelgeneratorRuleResult;
import TGGRuntime.PerformRuleResult;
import TGGRuntime.RuleResult;
import TGGRuntime.TGGRuntimeFactory;
import TGGRuntime.TripleMatch;

import TGGRuntime.impl.AbstractRuleImpl;

import Target.TargetFactory;
import Target.TargetModel;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
import org.moflon.csp.*;
import csp.constraints.*;
import TGGLanguage.csp.*;

// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Class1Impl extends AbstractRuleImpl implements Class1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SourceModel source) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_0_1_blackBBB(this,
				match, source);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[source] = "
							+ source + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_0_2_bindingAndBlackFBBB(this, match, source);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[source] = "
							+ source + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_0_4_blackBB(
					match, source);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[source] = " + source + ".");
			}
			Class1Impl.pattern_Class1_0_4_greenBB(match, source);

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_0_5_blackBB(
					match, source);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[source] = " + source + ".");
			}
			// register objects to match
			Class1Impl.pattern_Class1_0_6_expressionBBB(this, match, source);
			return Class1Impl.pattern_Class1_0_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_1_1_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SourceModel source = (SourceModel) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_1_1_greenBFF(source);
		TargetModel target = (TargetModel) result1_green[1];
		SM2TM sourceToTarget = (SM2TM) result1_green[2];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_1_2_blackBBB(source,
				target, sourceToTarget);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[source] = " + source + ", "
							+ "[target] = " + target + ", "
							+ "[sourceToTarget] = " + sourceToTarget + ".");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_1_2_greenFBBB(
				source, target, sourceToTarget);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_1_3_blackBBBB(
				ruleresult, source, target, sourceToTarget);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[source] = " + source + ", "
							+ "[target] = " + target + ", "
							+ "[sourceToTarget] = " + sourceToTarget + ".");
		}
		Class1Impl.pattern_Class1_1_3_greenBBBBFF(ruleresult, source, target,
				sourceToTarget);
		// EMoflonEdge sourceToTarget__source____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge sourceToTarget__target____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_1_5_expressionBBBBB(this, ruleresult, source,
				target, sourceToTarget);
		return Class1Impl.pattern_Class1_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl
				.pattern_Class1_2_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SourceModel source = (SourceModel) result2_binding[0];
		for (Object[] result2_black : Class1Impl.pattern_Class1_2_2_blackBB(
				source, match)) {
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_2_3_blackB(source)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_2_3_greenBF(source);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_2_4_bindingAndBlackFBBB(this,
								isApplicableMatch, source);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[source] = "
									+ source + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl
							.pattern_Class1_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					Class1Impl.pattern_Class1_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SourceModel source) {
		match.registerObject("source", source);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SourceModel source) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			SourceModel source) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("source", source);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult,
			EObject source, EObject target, EObject sourceToTarget) {
		ruleresult.registerObject("source", source);
		ruleresult.registerObject("target", target);
		ruleresult.registerObject("sourceToTarget", sourceToTarget);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("source").eClass()
				.equals(Source.SourcePackage.eINSTANCE.getSourceModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TargetModel target) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_10_1_blackBBB(this,
				match, target);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[target] = "
							+ target + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_10_2_bindingAndBlackFBBB(this, match, target);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[target] = "
							+ target + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_10_4_blackBB(
					match, target);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[target] = " + target + ".");
			}
			Class1Impl.pattern_Class1_10_4_greenBB(match, target);

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_10_5_blackBB(
					match, target);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[target] = " + target + ".");
			}
			// register objects to match
			Class1Impl.pattern_Class1_10_6_expressionBBB(this, match, target);
			return Class1Impl.pattern_Class1_10_7_expressionF();
		} else {
			return Class1Impl.pattern_Class1_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_11_1_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		TargetModel target = (TargetModel) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_11_1_greenFBF(target);
		SourceModel source = (SourceModel) result1_green[0];
		SM2TM sourceToTarget = (SM2TM) result1_green[2];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_11_2_blackBBB(
				source, target, sourceToTarget);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[source] = " + source + ", "
							+ "[target] = " + target + ", "
							+ "[sourceToTarget] = " + sourceToTarget + ".");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_11_2_greenFBBB(
				source, target, sourceToTarget);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_11_3_blackBBBB(
				ruleresult, source, target, sourceToTarget);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[source] = " + source + ", "
							+ "[target] = " + target + ", "
							+ "[sourceToTarget] = " + sourceToTarget + ".");
		}
		Class1Impl.pattern_Class1_11_3_greenBBBBFF(ruleresult, source, target,
				sourceToTarget);
		// EMoflonEdge sourceToTarget__source____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge sourceToTarget__target____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_11_5_expressionBBBBB(this, ruleresult,
				source, target, sourceToTarget);
		return Class1Impl.pattern_Class1_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl
				.pattern_Class1_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = Class1Impl
				.pattern_Class1_12_2_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		TargetModel target = (TargetModel) result2_binding[0];
		for (Object[] result2_black : Class1Impl.pattern_Class1_12_2_blackBB(
				target, match)) {
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_12_3_blackB(target)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_12_3_greenBF(target);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_12_4_bindingAndBlackFBBB(this,
								isApplicableMatch, target);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[target] = "
									+ target + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (Class1Impl.pattern_Class1_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = Class1Impl
							.pattern_Class1_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					Class1Impl.pattern_Class1_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return Class1Impl.pattern_Class1_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TargetModel target) {
		match.registerObject("target", target);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TargetModel target) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			TargetModel target) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("target", target);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult,
			EObject source, EObject target, EObject sourceToTarget) {
		ruleresult.registerObject("source", source);
		ruleresult.registerObject("target", target);
		ruleresult.registerObject("sourceToTarget", sourceToTarget);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("target").eClass()
				.equals(Target.TargetPackage.eINSTANCE.getTargetModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_SourceModel_0(SourceModel source) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_20_2_blackB(source)) {
			Object[] result2_green = Class1Impl
					.pattern_Class1_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_20_3_expressionFBBB(this, match,
					source)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TargetModel_0(TargetModel target) {
		// prepare return value
		Object[] result1_bindingAndBlack = Class1Impl
				.pattern_Class1_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : Class1Impl
				.pattern_Class1_21_2_blackB(target)) {
			Object[] result2_green = Class1Impl
					.pattern_Class1_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_21_3_expressionFBBB(this, match,
					target)) {
				// Ensure that the correct types of elements are matched
				if (Class1Impl.pattern_Class1_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = Class1Impl
							.pattern_Class1_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					Class1Impl.pattern_Class1_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return Class1Impl.pattern_Class1_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_FWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleResult checkAttributes_BWD(TripleMatch tripleMatch) {
		throw new UnsupportedOperationException(
				"developments on attribute synchronization with eMoflon not yet completed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(
			RuleEntryContainer ruleEntryContainer) {
		// create result
		Object[] result1_black = Class1Impl.pattern_Class1_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Class1Impl.pattern_Class1_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// is applicable core
		Object[] result2_black = Class1Impl.pattern_Class1_24_2_blackB(this);
		if (result2_black != null) {

			// solve CSP
			Object[] result3_bindingAndBlack = Class1Impl
					.pattern_Class1_24_3_bindingAndBlackFBBB(this,
							isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = " + this + ", "
								+ "[isApplicableMatch] = " + isApplicableMatch
								+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (Class1Impl.pattern_Class1_24_4_expressionFBB(this, csp)) {
				// check nacs story node is empty

				// perform
				Object[] result6_black = Class1Impl
						.pattern_Class1_24_6_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching in node [perform] failed."
									+ " Variables: " + "[ruleResult] = "
									+ ruleResult + ".");
				}
				Class1Impl.pattern_Class1_24_6_greenFFFB(ruleResult);
				// SourceModel source = (SourceModel) result6_green[0];
				// TargetModel target = (TargetModel) result6_green[1];
				// SM2TM sourceToTarget = (SM2TM) result6_green[2];

			} else {
			}

		} else {
		}
		return Class1Impl.pattern_Class1_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1));
		case RulesPackage.CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1));
		case RulesPackage.CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1));
			return null;
		case RulesPackage.CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TARGETMODEL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(TargetModel) arguments.get(1));
		case RulesPackage.CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3));
			return null;
		case RulesPackage.CLASS1___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_0__SOURCEMODEL:
			return isAppropriate_FWD_SourceModel_0((SourceModel) arguments
					.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_0__TARGETMODEL:
			return isAppropriate_BWD_TargetModel_0((TargetModel) arguments
					.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS1___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.CLASS1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.CLASS1___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Class1_0_1_blackBBB(Class1 _this,
			Match match, SourceModel source) {
		return new Object[] { _this, match, source };
	}

	public static final Object[] pattern_Class1_0_2_bindingFBBB(Class1 _this,
			Match match, SourceModel source) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, source);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, source };
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_0_2_bindingAndBlackFBBB(
			Class1 _this, Match match, SourceModel source) {
		Object[] result_pattern_Class1_0_2_binding = pattern_Class1_0_2_bindingFBBB(
				_this, match, source);
		if (result_pattern_Class1_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_0_2_binding[0];

			Object[] result_pattern_Class1_0_2_black = pattern_Class1_0_2_blackB(csp);
			if (result_pattern_Class1_0_2_black != null) {

				return new Object[] { csp, _this, match, source };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_0_3_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_0_4_blackBB(Match match,
			SourceModel source) {
		return new Object[] { match, source };
	}

	public static final Object[] pattern_Class1_0_4_greenBB(Match match,
			SourceModel source) {
		match.getToBeTranslatedNodes().add(source);
		return new Object[] { match, source };
	}

	public static final Object[] pattern_Class1_0_5_blackBB(Match match,
			SourceModel source) {
		return new Object[] { match, source };
	}

	public static final void pattern_Class1_0_6_expressionBBB(Class1 _this,
			Match match, SourceModel source) {
		_this.registerObjectsToMatch_FWD(match, source);

	}

	public static final boolean pattern_Class1_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_1_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("source");
		EObject tmpSource = _localVariable_0;
		if (tmpSource instanceof SourceModel) {
			SourceModel source = (SourceModel) tmpSource;
			return new Object[] { source, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_blackBFBB(
			SourceModel source, Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { source, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_bindingAndBlackFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_1_1_binding = pattern_Class1_1_1_bindingFB(isApplicableMatch);
		if (result_pattern_Class1_1_1_binding != null) {
			SourceModel source = (SourceModel) result_pattern_Class1_1_1_binding[0];

			Object[] result_pattern_Class1_1_1_black = pattern_Class1_1_1_blackBFBB(
					source, _this, isApplicableMatch);
			if (result_pattern_Class1_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_1_1_black[1];

				return new Object[] { source, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_greenBFF(SourceModel source) {
		TargetModel target = TargetFactory.eINSTANCE.createTargetModel();
		SM2TM sourceToTarget = SourceToTargetCorrFactory.eINSTANCE
				.createSM2TM();
		sourceToTarget.setSource(source);
		sourceToTarget.setTarget(target);
		return new Object[] { source, target, sourceToTarget };
	}

	public static final Object[] pattern_Class1_1_2_blackBBB(
			SourceModel source, TargetModel target, SM2TM sourceToTarget) {
		return new Object[] { source, target, sourceToTarget };
	}

	public static final Object[] pattern_Class1_1_2_greenFBBB(
			SourceModel source, TargetModel target, SM2TM sourceToTarget) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(source);
		ruleresult.getCreatedElements().add(target);
		ruleresult.getCreatedLinkElements().add(sourceToTarget);
		return new Object[] { ruleresult, source, target, sourceToTarget };
	}

	public static final Object[] pattern_Class1_1_3_blackBBBB(
			PerformRuleResult ruleresult, EObject source, EObject target,
			EObject sourceToTarget) {
		if (!source.equals(target)) {
			if (!source.equals(sourceToTarget)) {
				if (!sourceToTarget.equals(target)) {
					return new Object[] { ruleresult, source, target,
							sourceToTarget };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject source, EObject target,
			EObject sourceToTarget) {
		EMoflonEdge sourceToTarget__source____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sourceToTarget__target____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String sourceToTarget__source____source_name_prime = "source";
		String sourceToTarget__target____target_name_prime = "target";
		sourceToTarget__source____source.setSrc(sourceToTarget);
		sourceToTarget__source____source.setTrg(source);
		ruleresult.getCreatedEdges().add(sourceToTarget__source____source);
		sourceToTarget__target____target.setSrc(sourceToTarget);
		sourceToTarget__target____target.setTrg(target);
		ruleresult.getCreatedEdges().add(sourceToTarget__target____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sourceToTarget__source____source
				.setName(sourceToTarget__source____source_name_prime);
		sourceToTarget__target____target
				.setName(sourceToTarget__target____target_name_prime);
		return new Object[] { ruleresult, source, target, sourceToTarget,
				sourceToTarget__source____source,
				sourceToTarget__target____target };
	}

	public static final void pattern_Class1_1_5_expressionBBBBB(Class1 _this,
			PerformRuleResult ruleresult, EObject source, EObject target,
			EObject sourceToTarget) {
		_this.registerObjects_FWD(ruleresult, source, target, sourceToTarget);

	}

	public static final PerformRuleResult pattern_Class1_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_2_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_blackFBB(EClass eClass,
			Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_2_1_binding = pattern_Class1_2_1_bindingFB(_this);
		if (result_pattern_Class1_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_2_1_binding[0];

			Object[] result_pattern_Class1_2_1_black = pattern_Class1_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_Class1_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_2_2_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("source");
		EObject tmpSource = _localVariable_0;
		if (tmpSource instanceof SourceModel) {
			SourceModel source = (SourceModel) tmpSource;
			return new Object[] { source, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_2_2_blackBB(
			SourceModel source, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { source, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_2_3_blackB(
			SourceModel source) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { source });
		return _result;
	}

	public static final Object[] pattern_Class1_2_3_greenBF(SourceModel source) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(source);
		return new Object[] { source, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_2_4_bindingFBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, SourceModel source) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, source);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, source };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_2_4_bindingAndBlackFBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			SourceModel source) {
		Object[] result_pattern_Class1_2_4_binding = pattern_Class1_2_4_bindingFBBB(
				_this, isApplicableMatch, source);
		if (result_pattern_Class1_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_2_4_binding[0];

			Object[] result_pattern_Class1_2_4_black = pattern_Class1_2_4_blackB(csp);
			if (result_pattern_Class1_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, source };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_2_5_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_10_1_blackBBB(Class1 _this,
			Match match, TargetModel target) {
		return new Object[] { _this, match, target };
	}

	public static final Object[] pattern_Class1_10_2_bindingFBBB(Class1 _this,
			Match match, TargetModel target) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, target);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, target };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_10_2_bindingAndBlackFBBB(
			Class1 _this, Match match, TargetModel target) {
		Object[] result_pattern_Class1_10_2_binding = pattern_Class1_10_2_bindingFBBB(
				_this, match, target);
		if (result_pattern_Class1_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_10_2_binding[0];

			Object[] result_pattern_Class1_10_2_black = pattern_Class1_10_2_blackB(csp);
			if (result_pattern_Class1_10_2_black != null) {

				return new Object[] { csp, _this, match, target };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_10_3_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_10_4_blackBB(Match match,
			TargetModel target) {
		return new Object[] { match, target };
	}

	public static final Object[] pattern_Class1_10_4_greenBB(Match match,
			TargetModel target) {
		match.getToBeTranslatedNodes().add(target);
		return new Object[] { match, target };
	}

	public static final Object[] pattern_Class1_10_5_blackBB(Match match,
			TargetModel target) {
		return new Object[] { match, target };
	}

	public static final void pattern_Class1_10_6_expressionBBB(Class1 _this,
			Match match, TargetModel target) {
		_this.registerObjectsToMatch_BWD(match, target);

	}

	public static final boolean pattern_Class1_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Class1_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_Class1_11_1_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("target");
		EObject tmpTarget = _localVariable_0;
		if (tmpTarget instanceof TargetModel) {
			TargetModel target = (TargetModel) tmpTarget;
			return new Object[] { target, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_blackBFBB(
			TargetModel target, Class1 _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { target, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_bindingAndBlackFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_11_1_binding = pattern_Class1_11_1_bindingFB(isApplicableMatch);
		if (result_pattern_Class1_11_1_binding != null) {
			TargetModel target = (TargetModel) result_pattern_Class1_11_1_binding[0];

			Object[] result_pattern_Class1_11_1_black = pattern_Class1_11_1_blackBFBB(
					target, _this, isApplicableMatch);
			if (result_pattern_Class1_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_11_1_black[1];

				return new Object[] { target, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_greenFBF(TargetModel target) {
		SourceModel source = SourceFactory.eINSTANCE.createSourceModel();
		SM2TM sourceToTarget = SourceToTargetCorrFactory.eINSTANCE
				.createSM2TM();
		sourceToTarget.setSource(source);
		sourceToTarget.setTarget(target);
		return new Object[] { source, target, sourceToTarget };
	}

	public static final Object[] pattern_Class1_11_2_blackBBB(
			SourceModel source, TargetModel target, SM2TM sourceToTarget) {
		return new Object[] { source, target, sourceToTarget };
	}

	public static final Object[] pattern_Class1_11_2_greenFBBB(
			SourceModel source, TargetModel target, SM2TM sourceToTarget) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(source);
		ruleresult.getTranslatedElements().add(target);
		ruleresult.getCreatedLinkElements().add(sourceToTarget);
		return new Object[] { ruleresult, source, target, sourceToTarget };
	}

	public static final Object[] pattern_Class1_11_3_blackBBBB(
			PerformRuleResult ruleresult, EObject source, EObject target,
			EObject sourceToTarget) {
		if (!source.equals(target)) {
			if (!source.equals(sourceToTarget)) {
				if (!sourceToTarget.equals(target)) {
					return new Object[] { ruleresult, source, target,
							sourceToTarget };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject source, EObject target,
			EObject sourceToTarget) {
		EMoflonEdge sourceToTarget__source____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sourceToTarget__target____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String sourceToTarget__source____source_name_prime = "source";
		String sourceToTarget__target____target_name_prime = "target";
		sourceToTarget__source____source.setSrc(sourceToTarget);
		sourceToTarget__source____source.setTrg(source);
		ruleresult.getCreatedEdges().add(sourceToTarget__source____source);
		sourceToTarget__target____target.setSrc(sourceToTarget);
		sourceToTarget__target____target.setTrg(target);
		ruleresult.getCreatedEdges().add(sourceToTarget__target____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sourceToTarget__source____source
				.setName(sourceToTarget__source____source_name_prime);
		sourceToTarget__target____target
				.setName(sourceToTarget__target____target_name_prime);
		return new Object[] { ruleresult, source, target, sourceToTarget,
				sourceToTarget__source____source,
				sourceToTarget__target____target };
	}

	public static final void pattern_Class1_11_5_expressionBBBBB(Class1 _this,
			PerformRuleResult ruleresult, EObject source, EObject target,
			EObject sourceToTarget) {
		_this.registerObjects_BWD(ruleresult, source, target, sourceToTarget);

	}

	public static final PerformRuleResult pattern_Class1_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_12_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_blackFBB(EClass eClass,
			Class1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_12_1_binding = pattern_Class1_12_1_bindingFB(_this);
		if (result_pattern_Class1_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_Class1_12_1_binding[0];

			Object[] result_pattern_Class1_12_1_black = pattern_Class1_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_Class1_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Class1_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "Class1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Class1_12_2_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("target");
		EObject tmpTarget = _localVariable_0;
		if (tmpTarget instanceof TargetModel) {
			TargetModel target = (TargetModel) tmpTarget;
			return new Object[] { target, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_12_2_blackBB(
			TargetModel target, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { target, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_12_3_blackB(
			TargetModel target) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { target });
		return _result;
	}

	public static final Object[] pattern_Class1_12_3_greenBF(TargetModel target) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(target);
		return new Object[] { target, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_12_4_bindingFBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, TargetModel target) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, target);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, target };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_12_4_bindingAndBlackFBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			TargetModel target) {
		Object[] result_pattern_Class1_12_4_binding = pattern_Class1_12_4_bindingFBBB(
				_this, isApplicableMatch, target);
		if (result_pattern_Class1_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_12_4_binding[0];

			Object[] result_pattern_Class1_12_4_black = pattern_Class1_12_4_blackB(csp);
			if (result_pattern_Class1_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, target };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_12_5_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Class1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Class1_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Class1_20_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_20_1_binding = pattern_Class1_20_1_bindingFB(_this);
		if (result_pattern_Class1_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_20_1_binding[0];

			Object[] result_pattern_Class1_20_1_black = pattern_Class1_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Class1_20_2_blackB(
			SourceModel source) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { source });
		return _result;
	}

	public static final Object[] pattern_Class1_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_20_3_expressionFBBB(
			Class1 _this, Match match, SourceModel source) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, source);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_20_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_21_1_bindingFB(Class1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_blackFBB(EClass __eClass,
			Class1 _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_bindingAndBlackFFB(
			Class1 _this) {
		Object[] result_pattern_Class1_21_1_binding = pattern_Class1_21_1_bindingFB(_this);
		if (result_pattern_Class1_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_Class1_21_1_binding[0];

			Object[] result_pattern_Class1_21_1_black = pattern_Class1_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_Class1_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Class1_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Class1_21_2_blackB(
			TargetModel target) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { target });
		return _result;
	}

	public static final Object[] pattern_Class1_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Class1_21_3_expressionFBBB(
			Class1 _this, Match match, TargetModel target) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, target);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Class1_21_4_expressionFBB(Class1 _this,
			Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_Class1_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_Class1_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Class1_24_1_blackB(Class1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Class1_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Class1_24_2_blackB(Class1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Class1_24_3_bindingFBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Class1_24_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_24_3_bindingAndBlackFBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Class1_24_3_binding = pattern_Class1_24_3_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_Class1_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_24_3_binding[0];

			Object[] result_pattern_Class1_24_3_black = pattern_Class1_24_3_blackB(csp);
			if (result_pattern_Class1_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Class1_24_4_expressionFBB(Class1 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Class1_24_6_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_Class1_24_6_greenFFFB(
			ModelgeneratorRuleResult ruleResult) {
		SourceModel source = SourceFactory.eINSTANCE.createSourceModel();
		TargetModel target = TargetFactory.eINSTANCE.createTargetModel();
		SM2TM sourceToTarget = SourceToTargetCorrFactory.eINSTANCE
				.createSM2TM();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(source);
		ruleResult.getTargetObjects().add(target);
		sourceToTarget.setSource(source);
		sourceToTarget.setTarget(target);
		ruleResult.getCorrObjects().add(sourceToTarget);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { source, target, sourceToTarget, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Class1_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Class1Impl
