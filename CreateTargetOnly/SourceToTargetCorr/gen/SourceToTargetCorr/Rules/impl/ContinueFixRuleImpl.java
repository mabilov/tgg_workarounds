/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.Element;
import Source.SplitMerge;

import SourceToTargetCorr.E2S;

import SourceToTargetCorr.Rules.ContinueFixRule;
import SourceToTargetCorr.Rules.RulesPackage;

import TGGLanguage.csp.CSP;

import TGGLanguage.modelgenerator.RuleEntryContainer;
import TGGLanguage.modelgenerator.RuleEntryList;

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

import Target.SpecialStep;
import Target.Step;

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
 * An implementation of the model object '<em><b>Continue Fix Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinueFixRuleImpl extends AbstractRuleImpl implements
		ContinueFixRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinueFixRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.CONTINUE_FIX_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SplitMerge spm2,
			SplitMerge spm1) {
		// initial bindings
		Object[] result1_black = ContinueFixRuleImpl
				.pattern_ContinueFixRule_0_1_blackBBBB(this, match, spm2, spm1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[spm2] = " + spm2
							+ ", " + "[spm1] = " + spm1 + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_0_2_bindingAndBlackFBBBB(this, match,
						spm2, spm1);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[spm2] = " + spm2
							+ ", " + "[spm1] = " + spm1 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ContinueFixRuleImpl.pattern_ContinueFixRule_0_3_expressionFBB(this,
				csp)) {

			// collect elements to be translated
			Object[] result4_black = ContinueFixRuleImpl
					.pattern_ContinueFixRule_0_4_blackBBB(match, spm2, spm1);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[spm2] = " + spm2 + ", " + "[spm1] = "
								+ spm1 + ".");
			}
			ContinueFixRuleImpl.pattern_ContinueFixRule_0_4_greenBBBF(match,
					spm2, spm1);
			// EMoflonEdge spm1__spm2______con = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ContinueFixRuleImpl
					.pattern_ContinueFixRule_0_5_blackBBB(match, spm2, spm1);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[spm2] = " + spm2 + ", " + "[spm1] = "
								+ spm1 + ".");
			}
			ContinueFixRuleImpl.pattern_ContinueFixRule_0_5_greenBBB(match,
					spm2, spm1);

			// register objects to match
			ContinueFixRuleImpl.pattern_ContinueFixRule_0_6_expressionBBBB(
					this, match, spm2, spm1);
			return ContinueFixRuleImpl
					.pattern_ContinueFixRule_0_7_expressionF();
		} else {
			return ContinueFixRuleImpl
					.pattern_ContinueFixRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_1_1_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SpecialStep sps2 = (SpecialStep) result1_bindingAndBlack[0];
		SpecialStep sps1 = (SpecialStep) result1_bindingAndBlack[1];
		SplitMerge spm2 = (SplitMerge) result1_bindingAndBlack[2];
		SplitMerge spm1 = (SplitMerge) result1_bindingAndBlack[3];
		E2S spm1ToSps1 = (E2S) result1_bindingAndBlack[4];
		E2S spm2ToSps2 = (E2S) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		ContinueFixRuleImpl.pattern_ContinueFixRule_1_1_greenBB(sps2, sps1);

		// collect translated elements
		Object[] result2_green = ContinueFixRuleImpl
				.pattern_ContinueFixRule_1_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ContinueFixRuleImpl
				.pattern_ContinueFixRule_1_3_blackBBBBBBB(ruleresult, sps2,
						sps1, spm2, spm1, spm1ToSps1, spm2ToSps2);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sps2] = " + sps2 + ", " + "[sps1] = "
							+ sps1 + ", " + "[spm2] = " + spm2 + ", "
							+ "[spm1] = " + spm1 + ", " + "[spm1ToSps1] = "
							+ spm1ToSps1 + ", " + "[spm2ToSps2] = "
							+ spm2ToSps2 + ".");
		}
		ContinueFixRuleImpl.pattern_ContinueFixRule_1_3_greenBBBBBFF(
				ruleresult, sps2, sps1, spm2, spm1);
		// EMoflonEdge sps1__sps2____continue = (EMoflonEdge) result3_green[5];
		// EMoflonEdge spm1__spm2______con = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		ContinueFixRuleImpl.pattern_ContinueFixRule_1_5_expressionBBBBBBBB(
				this, ruleresult, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2);
		return ContinueFixRuleImpl
				.pattern_ContinueFixRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ContinueFixRuleImpl
				.pattern_ContinueFixRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ContinueFixRuleImpl
				.pattern_ContinueFixRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SplitMerge spm2 = (SplitMerge) result2_binding[0];
		SplitMerge spm1 = (SplitMerge) result2_binding[1];
		for (Object[] result2_black : ContinueFixRuleImpl
				.pattern_ContinueFixRule_2_2_blackFFBBFFB(spm2, spm1, match)) {
			SpecialStep sps2 = (SpecialStep) result2_black[0];
			SpecialStep sps1 = (SpecialStep) result2_black[1];
			E2S spm1ToSps1 = (E2S) result2_black[4];
			E2S spm2ToSps2 = (E2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ContinueFixRuleImpl
					.pattern_ContinueFixRule_2_3_blackBBBBBB(sps2, sps1, spm2,
							spm1, spm1ToSps1, spm2ToSps2)) {
				Object[] result3_green = ContinueFixRuleImpl
						.pattern_ContinueFixRule_2_3_greenBBBBBBFFFFFF(sps2,
								sps1, spm2, spm1, spm1ToSps1, spm2ToSps2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge spm1__spm2______con = (EMoflonEdge) result3_green[7];
				// EMoflonEdge spm1ToSps1__spm1____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge spm1ToSps1__sps1____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge spm2ToSps2__spm2____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge spm2ToSps2__sps2____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ContinueFixRuleImpl
						.pattern_ContinueFixRule_2_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, sps2, sps1, spm2,
								spm1, spm1ToSps1, spm2ToSps2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[sps2] = "
									+ sps2
									+ ", "
									+ "[sps1] = "
									+ sps1
									+ ", "
									+ "[spm2] = "
									+ spm2
									+ ", "
									+ "[spm1] = "
									+ spm1
									+ ", "
									+ "[spm1ToSps1] = "
									+ spm1ToSps1
									+ ", "
									+ "[spm2ToSps2] = "
									+ spm2ToSps2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ContinueFixRuleImpl
						.pattern_ContinueFixRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ContinueFixRuleImpl
							.pattern_ContinueFixRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ContinueFixRuleImpl.pattern_ContinueFixRule_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ContinueFixRuleImpl
				.pattern_ContinueFixRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SplitMerge spm2,
			SplitMerge spm1) {
		match.registerObject("spm2", spm2);
		match.registerObject("spm1", spm1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SplitMerge spm2,
			SplitMerge spm1) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_spm1_merge = CSPFactoryHelper.eINSTANCE.createVariable(
				"spm1.merge", true, csp);
		var_spm1_merge.setValue(spm1.isMerge());
		var_spm1_merge.setType("Boolean");
		Variable var_spm2_merge = CSPFactoryHelper.eINSTANCE.createVariable(
				"spm2.merge", true, csp);
		var_spm2_merge.setValue(spm2.isMerge());
		var_spm2_merge.setType("Boolean");

		// Create unbound variables
		Variable var_false = CSPFactoryHelper.eINSTANCE.createVariable("false",
				csp);
		var_false.setType("boolean");
		Variable var_true = CSPFactoryHelper.eINSTANCE.createVariable("true",
				csp);
		var_true.setType("boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_spm1_merge, var_false);
		eq_0.setRuleName("");
		eq_0.solve(var_spm2_merge, var_true);
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
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sps2", sps2);
		isApplicableMatch.registerObject("sps1", sps1);
		isApplicableMatch.registerObject("spm2", spm2);
		isApplicableMatch.registerObject("spm1", spm1);
		isApplicableMatch.registerObject("spm1ToSps1", spm1ToSps1);
		isApplicableMatch.registerObject("spm2ToSps2", spm2ToSps2);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject sps2,
			EObject sps1, EObject spm2, EObject spm1, EObject spm1ToSps1,
			EObject spm2ToSps2) {
		ruleresult.registerObject("sps2", sps2);
		ruleresult.registerObject("sps1", sps1);
		ruleresult.registerObject("spm2", spm2);
		ruleresult.registerObject("spm1", spm1);
		ruleresult.registerObject("spm1ToSps1", spm1ToSps1);
		ruleresult.registerObject("spm2ToSps2", spm2ToSps2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, SpecialStep sps2,
			SpecialStep sps1) {
		// initial bindings
		Object[] result1_black = ContinueFixRuleImpl
				.pattern_ContinueFixRule_10_1_blackBBBB(this, match, sps2, sps1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sps2] = " + sps2
							+ ", " + "[sps1] = " + sps1 + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_10_2_bindingAndBlackFBBBB(this, match,
						sps2, sps1);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sps2] = " + sps2
							+ ", " + "[sps1] = " + sps1 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (ContinueFixRuleImpl.pattern_ContinueFixRule_10_3_expressionFBB(
				this, csp)) {

			// collect elements to be translated
			Object[] result4_black = ContinueFixRuleImpl
					.pattern_ContinueFixRule_10_4_blackBBB(match, sps2, sps1);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sps2] = " + sps2 + ", " + "[sps1] = "
								+ sps1 + ".");
			}
			ContinueFixRuleImpl.pattern_ContinueFixRule_10_4_greenBBBF(match,
					sps2, sps1);
			// EMoflonEdge sps1__sps2____continue = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = ContinueFixRuleImpl
					.pattern_ContinueFixRule_10_5_blackBBB(match, sps2, sps1);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sps2] = " + sps2 + ", " + "[sps1] = "
								+ sps1 + ".");
			}
			ContinueFixRuleImpl.pattern_ContinueFixRule_10_5_greenBBB(match,
					sps2, sps1);

			// register objects to match
			ContinueFixRuleImpl.pattern_ContinueFixRule_10_6_expressionBBBB(
					this, match, sps2, sps1);
			return ContinueFixRuleImpl
					.pattern_ContinueFixRule_10_7_expressionF();
		} else {
			return ContinueFixRuleImpl
					.pattern_ContinueFixRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_11_1_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SpecialStep sps2 = (SpecialStep) result1_bindingAndBlack[0];
		SpecialStep sps1 = (SpecialStep) result1_bindingAndBlack[1];
		SplitMerge spm2 = (SplitMerge) result1_bindingAndBlack[2];
		SplitMerge spm1 = (SplitMerge) result1_bindingAndBlack[3];
		E2S spm1ToSps1 = (E2S) result1_bindingAndBlack[4];
		E2S spm2ToSps2 = (E2S) result1_bindingAndBlack[5];
		// CSP csp = (CSP) result1_bindingAndBlack[6];
		ContinueFixRuleImpl.pattern_ContinueFixRule_11_1_greenBB(spm2, spm1);

		// collect translated elements
		Object[] result2_green = ContinueFixRuleImpl
				.pattern_ContinueFixRule_11_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = ContinueFixRuleImpl
				.pattern_ContinueFixRule_11_3_blackBBBBBBB(ruleresult, sps2,
						sps1, spm2, spm1, spm1ToSps1, spm2ToSps2);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sps2] = " + sps2 + ", " + "[sps1] = "
							+ sps1 + ", " + "[spm2] = " + spm2 + ", "
							+ "[spm1] = " + spm1 + ", " + "[spm1ToSps1] = "
							+ spm1ToSps1 + ", " + "[spm2ToSps2] = "
							+ spm2ToSps2 + ".");
		}
		ContinueFixRuleImpl.pattern_ContinueFixRule_11_3_greenBBBBBFF(
				ruleresult, sps2, sps1, spm2, spm1);
		// EMoflonEdge sps1__sps2____continue = (EMoflonEdge) result3_green[5];
		// EMoflonEdge spm1__spm2______con = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		ContinueFixRuleImpl.pattern_ContinueFixRule_11_5_expressionBBBBBBBB(
				this, ruleresult, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2);
		return ContinueFixRuleImpl
				.pattern_ContinueFixRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ContinueFixRuleImpl
				.pattern_ContinueFixRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = ContinueFixRuleImpl
				.pattern_ContinueFixRule_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SpecialStep sps2 = (SpecialStep) result2_binding[0];
		SpecialStep sps1 = (SpecialStep) result2_binding[1];
		for (Object[] result2_black : ContinueFixRuleImpl
				.pattern_ContinueFixRule_12_2_blackBBFFFFB(sps2, sps1, match)) {
			SplitMerge spm2 = (SplitMerge) result2_black[2];
			SplitMerge spm1 = (SplitMerge) result2_black[3];
			E2S spm1ToSps1 = (E2S) result2_black[4];
			E2S spm2ToSps2 = (E2S) result2_black[5];
			// ForEach find context
			for (Object[] result3_black : ContinueFixRuleImpl
					.pattern_ContinueFixRule_12_3_blackBBBBBB(sps2, sps1, spm2,
							spm1, spm1ToSps1, spm2ToSps2)) {
				Object[] result3_green = ContinueFixRuleImpl
						.pattern_ContinueFixRule_12_3_greenBBBBBBFFFFFF(sps2,
								sps1, spm2, spm1, spm1ToSps1, spm2ToSps2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				// EMoflonEdge sps1__sps2____continue = (EMoflonEdge) result3_green[7];
				// EMoflonEdge spm1ToSps1__spm1____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge spm1ToSps1__sps1____target = (EMoflonEdge) result3_green[9];
				// EMoflonEdge spm2ToSps2__spm2____source = (EMoflonEdge) result3_green[10];
				// EMoflonEdge spm2ToSps2__sps2____target = (EMoflonEdge) result3_green[11];

				// solve CSP
				Object[] result4_bindingAndBlack = ContinueFixRuleImpl
						.pattern_ContinueFixRule_12_4_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, sps2, sps1, spm2,
								spm1, spm1ToSps1, spm2ToSps2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[sps2] = "
									+ sps2
									+ ", "
									+ "[sps1] = "
									+ sps1
									+ ", "
									+ "[spm2] = "
									+ spm2
									+ ", "
									+ "[spm1] = "
									+ spm1
									+ ", "
									+ "[spm1ToSps1] = "
									+ spm1ToSps1
									+ ", "
									+ "[spm2ToSps2] = "
									+ spm2ToSps2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (ContinueFixRuleImpl
						.pattern_ContinueFixRule_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = ContinueFixRuleImpl
							.pattern_ContinueFixRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					ContinueFixRuleImpl.pattern_ContinueFixRule_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ContinueFixRuleImpl
				.pattern_ContinueFixRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, SpecialStep sps2,
			SpecialStep sps1) {
		match.registerObject("sps2", sps2);
		match.registerObject("sps1", sps1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, SpecialStep sps2,
			SpecialStep sps1) {// Create CSP
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
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spm1_merge = CSPFactoryHelper.eINSTANCE.createVariable(
				"spm1.merge", true, csp);
		var_spm1_merge.setValue(spm1.isMerge());
		var_spm1_merge.setType("Boolean");
		Variable var_spm2_merge = CSPFactoryHelper.eINSTANCE.createVariable(
				"spm2.merge", true, csp);
		var_spm2_merge.setValue(spm2.isMerge());
		var_spm2_merge.setType("Boolean");

		// Create unbound variables
		Variable var_false = CSPFactoryHelper.eINSTANCE.createVariable("false",
				csp);
		var_false.setType("boolean");
		Variable var_true = CSPFactoryHelper.eINSTANCE.createVariable("true",
				csp);
		var_true.setType("boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_spm1_merge, var_false);
		eq_0.setRuleName("");
		eq_0.solve(var_spm2_merge, var_true);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sps2", sps2);
		isApplicableMatch.registerObject("sps1", sps1);
		isApplicableMatch.registerObject("spm2", spm2);
		isApplicableMatch.registerObject("spm1", spm1);
		isApplicableMatch.registerObject("spm1ToSps1", spm1ToSps1);
		isApplicableMatch.registerObject("spm2ToSps2", spm2ToSps2);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject sps2,
			EObject sps1, EObject spm2, EObject spm1, EObject spm1ToSps1,
			EObject spm2ToSps2) {
		ruleresult.registerObject("sps2", sps2);
		ruleresult.registerObject("sps1", sps1);
		ruleresult.registerObject("spm2", spm2);
		ruleresult.registerObject("spm1", spm1);
		ruleresult.registerObject("spm1ToSps1", spm1ToSps1);
		ruleresult.registerObject("spm2ToSps2", spm2ToSps2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_31(
			EMoflonEdge _edge_continue) {
		// prepare return value
		Object[] result1_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ContinueFixRuleImpl
				.pattern_ContinueFixRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ContinueFixRuleImpl
				.pattern_ContinueFixRule_20_2_blackFFB(_edge_continue)) {
			SpecialStep sps2 = (SpecialStep) result2_black[0];
			SpecialStep sps1 = (SpecialStep) result2_black[1];
			Object[] result2_green = ContinueFixRuleImpl
					.pattern_ContinueFixRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ContinueFixRuleImpl
					.pattern_ContinueFixRule_20_3_expressionFBBBB(this, match,
							sps2, sps1)) {
				// Ensure that the correct types of elements are matched
				if (ContinueFixRuleImpl
						.pattern_ContinueFixRule_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ContinueFixRuleImpl
							.pattern_ContinueFixRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ContinueFixRuleImpl.pattern_ContinueFixRule_20_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ContinueFixRuleImpl
				.pattern_ContinueFixRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_25(
			EMoflonEdge _edge___con) {
		// prepare return value
		Object[] result1_bindingAndBlack = ContinueFixRuleImpl
				.pattern_ContinueFixRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ContinueFixRuleImpl
				.pattern_ContinueFixRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : ContinueFixRuleImpl
				.pattern_ContinueFixRule_21_2_blackFFB(_edge___con)) {
			SplitMerge spm2 = (SplitMerge) result2_black[0];
			SplitMerge spm1 = (SplitMerge) result2_black[1];
			Object[] result2_green = ContinueFixRuleImpl
					.pattern_ContinueFixRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (ContinueFixRuleImpl
					.pattern_ContinueFixRule_21_3_expressionFBBBB(this, match,
							spm2, spm1)) {
				// Ensure that the correct types of elements are matched
				if (ContinueFixRuleImpl
						.pattern_ContinueFixRule_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = ContinueFixRuleImpl
							.pattern_ContinueFixRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					ContinueFixRuleImpl.pattern_ContinueFixRule_21_5_greenBBB(
							match, __performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return ContinueFixRuleImpl
				.pattern_ContinueFixRule_21_6_expressionFB(__result);
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
			RuleEntryContainer ruleEntryContainer, E2S spm2ToSps2Parameter,
			E2S spm1ToSps1Parameter) {
		// create result
		Object[] result1_black = ContinueFixRuleImpl
				.pattern_ContinueFixRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ContinueFixRuleImpl
				.pattern_ContinueFixRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : ContinueFixRuleImpl
				.pattern_ContinueFixRule_24_2_blackFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			// RuleEntryList spm2ToSps2List = (RuleEntryList) result2_black[0];
			SpecialStep sps2 = (SpecialStep) result2_black[1];
			E2S spm2ToSps2 = (E2S) result2_black[2];
			SplitMerge spm2 = (SplitMerge) result2_black[3];
			// RuleEntryList spm1ToSps1List = (RuleEntryList) result2_black[4];
			SpecialStep sps1 = (SpecialStep) result2_black[5];
			E2S spm1ToSps1 = (E2S) result2_black[6];
			SplitMerge spm1 = (SplitMerge) result2_black[7];

			// solve CSP
			Object[] result3_bindingAndBlack = ContinueFixRuleImpl
					.pattern_ContinueFixRule_24_3_bindingAndBlackFBBBBBBBBB(
							this, isApplicableMatch, sps2, sps1, spm2, spm1,
							spm1ToSps1, spm2ToSps2, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[sps2] = "
								+ sps2
								+ ", "
								+ "[sps1] = "
								+ sps1
								+ ", "
								+ "[spm2] = "
								+ spm2
								+ ", "
								+ "[spm1] = "
								+ spm1
								+ ", "
								+ "[spm1ToSps1] = "
								+ spm1ToSps1
								+ ", "
								+ "[spm2ToSps2] = "
								+ spm2ToSps2
								+ ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (ContinueFixRuleImpl.pattern_ContinueFixRule_24_4_expressionFBB(
					this, csp)) {
				// check nacs
				Object[] result5_black = ContinueFixRuleImpl
						.pattern_ContinueFixRule_24_5_blackBBBBBB(sps2, sps1,
								spm2, spm1, spm1ToSps1, spm2ToSps2);
				if (result5_black != null) {

					// perform
					Object[] result6_black = ContinueFixRuleImpl
							.pattern_ContinueFixRule_24_6_blackBBBBBBB(sps2,
									sps1, spm2, spm1, spm1ToSps1, spm2ToSps2,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[sps2] = " + sps2
										+ ", " + "[sps1] = " + sps1 + ", "
										+ "[spm2] = " + spm2 + ", "
										+ "[spm1] = " + spm1 + ", "
										+ "[spm1ToSps1] = " + spm1ToSps1 + ", "
										+ "[spm2ToSps2] = " + spm2ToSps2 + ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					ContinueFixRuleImpl
							.pattern_ContinueFixRule_24_6_greenBBBBB(sps2,
									sps1, spm2, spm1, ruleResult);

				} else {
				}

			} else {
			}

		}
		return ContinueFixRuleImpl
				.pattern_ContinueFixRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spm1_merge = CSPFactoryHelper.eINSTANCE.createVariable(
				"spm1.merge", true, csp);
		var_spm1_merge.setValue(spm1.isMerge());
		var_spm1_merge.setType("Boolean");
		Variable var_spm2_merge = CSPFactoryHelper.eINSTANCE.createVariable(
				"spm2.merge", true, csp);
		var_spm2_merge.setValue(spm2.isMerge());
		var_spm2_merge.setType("Boolean");

		// Create unbound variables
		Variable var_false = CSPFactoryHelper.eINSTANCE.createVariable("false",
				csp);
		var_false.setType("boolean");
		Variable var_true = CSPFactoryHelper.eINSTANCE.createVariable("true",
				csp);
		var_true.setType("boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_spm1_merge, var_false);
		eq_0.setRuleName("");
		eq_0.solve(var_spm2_merge, var_true);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sps2", sps2);
		isApplicableMatch.registerObject("sps1", sps1);
		isApplicableMatch.registerObject("spm2", spm2);
		isApplicableMatch.registerObject("spm1", spm1);
		isApplicableMatch.registerObject("spm1ToSps1", spm1ToSps1);
		isApplicableMatch.registerObject("spm2ToSps2", spm2ToSps2);
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
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_FWD__MATCH_SPLITMERGE_SPLITMERGE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SplitMerge) arguments.get(1),
					(SplitMerge) arguments.get(2));
		case RulesPackage.CONTINUE_FIX_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SPLITMERGE_SPLITMERGE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SplitMerge) arguments.get(1),
					(SplitMerge) arguments.get(2));
			return null;
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SPLITMERGE_SPLITMERGE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SplitMerge) arguments.get(1),
					(SplitMerge) arguments.get(2));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SPECIALSTEP_SPECIALSTEP_SPLITMERGE_SPLITMERGE_E2S_E2S:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SpecialStep) arguments.get(1),
					(SpecialStep) arguments.get(2),
					(SplitMerge) arguments.get(3),
					(SplitMerge) arguments.get(4), (E2S) arguments.get(5),
					(E2S) arguments.get(6));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CONTINUE_FIX_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_BWD__MATCH_SPECIALSTEP_SPECIALSTEP:
			return isAppropriate_BWD((Match) arguments.get(0),
					(SpecialStep) arguments.get(1),
					(SpecialStep) arguments.get(2));
		case RulesPackage.CONTINUE_FIX_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_SPECIALSTEP_SPECIALSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(SpecialStep) arguments.get(1),
					(SpecialStep) arguments.get(2));
			return null;
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_SPECIALSTEP_SPECIALSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(SpecialStep) arguments.get(1),
					(SpecialStep) arguments.get(2));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPECIALSTEP_SPECIALSTEP_SPLITMERGE_SPLITMERGE_E2S_E2S:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SpecialStep) arguments.get(1),
					(SpecialStep) arguments.get(2),
					(SplitMerge) arguments.get(3),
					(SplitMerge) arguments.get(4), (E2S) arguments.get(5),
					(E2S) arguments.get(6));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CONTINUE_FIX_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_31((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_25((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONTINUE_FIX_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S_E2S:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(E2S) arguments.get(1), (E2S) arguments.get(2));
		case RulesPackage.CONTINUE_FIX_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPECIALSTEP_SPECIALSTEP_SPLITMERGE_SPLITMERGE_E2S_E2S_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SpecialStep) arguments.get(1),
					(SpecialStep) arguments.get(2),
					(SplitMerge) arguments.get(3),
					(SplitMerge) arguments.get(4), (E2S) arguments.get(5),
					(E2S) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CONTINUE_FIX_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ContinueFixRule_0_1_blackBBBB(
			ContinueFixRule _this, Match match, SplitMerge spm2, SplitMerge spm1) {
		if (!spm1.equals(spm2)) {
			return new Object[] { _this, match, spm2, spm1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_0_2_bindingFBBBB(
			ContinueFixRule _this, Match match, SplitMerge spm2, SplitMerge spm1) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, spm2,
				spm1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, spm2, spm1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinueFixRule_0_2_bindingAndBlackFBBBB(
			ContinueFixRule _this, Match match, SplitMerge spm2, SplitMerge spm1) {
		Object[] result_pattern_ContinueFixRule_0_2_binding = pattern_ContinueFixRule_0_2_bindingFBBBB(
				_this, match, spm2, spm1);
		if (result_pattern_ContinueFixRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_ContinueFixRule_0_2_binding[0];

			Object[] result_pattern_ContinueFixRule_0_2_black = pattern_ContinueFixRule_0_2_blackB(csp);
			if (result_pattern_ContinueFixRule_0_2_black != null) {

				return new Object[] { csp, _this, match, spm2, spm1 };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinueFixRule_0_3_expressionFBB(
			ContinueFixRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_0_4_blackBBB(
			Match match, SplitMerge spm2, SplitMerge spm1) {
		if (!spm1.equals(spm2)) {
			return new Object[] { match, spm2, spm1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_0_4_greenBBBF(
			Match match, SplitMerge spm2, SplitMerge spm1) {
		EMoflonEdge spm1__spm2______con = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String spm1__spm2______con_name_prime = "__con";
		spm1__spm2______con.setSrc(spm1);
		spm1__spm2______con.setTrg(spm2);
		match.getToBeTranslatedEdges().add(spm1__spm2______con);
		spm1__spm2______con.setName(spm1__spm2______con_name_prime);
		return new Object[] { match, spm2, spm1, spm1__spm2______con };
	}

	public static final Object[] pattern_ContinueFixRule_0_5_blackBBB(
			Match match, SplitMerge spm2, SplitMerge spm1) {
		if (!spm1.equals(spm2)) {
			return new Object[] { match, spm2, spm1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_0_5_greenBBB(
			Match match, SplitMerge spm2, SplitMerge spm1) {
		match.getContextNodes().add(spm2);
		match.getContextNodes().add(spm1);
		return new Object[] { match, spm2, spm1 };
	}

	public static final void pattern_ContinueFixRule_0_6_expressionBBBB(
			ContinueFixRule _this, Match match, SplitMerge spm2, SplitMerge spm1) {
		_this.registerObjectsToMatch_FWD(match, spm2, spm1);

	}

	public static final boolean pattern_ContinueFixRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ContinueFixRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_1_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sps2");
		EObject _localVariable_1 = isApplicableMatch.getObject("sps1");
		EObject _localVariable_2 = isApplicableMatch.getObject("spm2");
		EObject _localVariable_3 = isApplicableMatch.getObject("spm1");
		EObject _localVariable_4 = isApplicableMatch.getObject("spm1ToSps1");
		EObject _localVariable_5 = isApplicableMatch.getObject("spm2ToSps2");
		EObject tmpSps2 = _localVariable_0;
		EObject tmpSps1 = _localVariable_1;
		EObject tmpSpm2 = _localVariable_2;
		EObject tmpSpm1 = _localVariable_3;
		EObject tmpSpm1ToSps1 = _localVariable_4;
		EObject tmpSpm2ToSps2 = _localVariable_5;
		if (tmpSps2 instanceof SpecialStep) {
			SpecialStep sps2 = (SpecialStep) tmpSps2;
			if (tmpSps1 instanceof SpecialStep) {
				SpecialStep sps1 = (SpecialStep) tmpSps1;
				if (tmpSpm2 instanceof SplitMerge) {
					SplitMerge spm2 = (SplitMerge) tmpSpm2;
					if (tmpSpm1 instanceof SplitMerge) {
						SplitMerge spm1 = (SplitMerge) tmpSpm1;
						if (tmpSpm1ToSps1 instanceof E2S) {
							E2S spm1ToSps1 = (E2S) tmpSpm1ToSps1;
							if (tmpSpm2ToSps2 instanceof E2S) {
								E2S spm2ToSps2 = (E2S) tmpSpm2ToSps2;
								return new Object[] { sps2, sps1, spm2, spm1,
										spm1ToSps1, spm2ToSps2,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_1_1_blackBBBBBBFBB(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2,
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch) {
		if (!sps1.equals(sps2)) {
			if (!spm1.equals(spm2)) {
				if (!spm1ToSps1.equals(spm2ToSps2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { sps2, sps1, spm2, spm1,
									spm1ToSps1, spm2ToSps2, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_1_1_bindingAndBlackFFFFFFFBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ContinueFixRule_1_1_binding = pattern_ContinueFixRule_1_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ContinueFixRule_1_1_binding != null) {
			SpecialStep sps2 = (SpecialStep) result_pattern_ContinueFixRule_1_1_binding[0];
			SpecialStep sps1 = (SpecialStep) result_pattern_ContinueFixRule_1_1_binding[1];
			SplitMerge spm2 = (SplitMerge) result_pattern_ContinueFixRule_1_1_binding[2];
			SplitMerge spm1 = (SplitMerge) result_pattern_ContinueFixRule_1_1_binding[3];
			E2S spm1ToSps1 = (E2S) result_pattern_ContinueFixRule_1_1_binding[4];
			E2S spm2ToSps2 = (E2S) result_pattern_ContinueFixRule_1_1_binding[5];

			Object[] result_pattern_ContinueFixRule_1_1_black = pattern_ContinueFixRule_1_1_blackBBBBBBFBB(
					sps2, sps1, spm2, spm1, spm1ToSps1, spm2ToSps2, _this,
					isApplicableMatch);
			if (result_pattern_ContinueFixRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_ContinueFixRule_1_1_black[6];

				return new Object[] { sps2, sps1, spm2, spm1, spm1ToSps1,
						spm2ToSps2, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_1_1_greenBB(
			SpecialStep sps2, SpecialStep sps1) {
		sps1.setContinue(sps2);
		return new Object[] { sps2, sps1 };
	}

	public static final Object[] pattern_ContinueFixRule_1_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ContinueFixRule_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject sps2, EObject sps1,
			EObject spm2, EObject spm1, EObject spm1ToSps1, EObject spm2ToSps2) {
		if (!sps1.equals(sps2)) {
			if (!spm2.equals(sps2)) {
				if (!spm2.equals(sps1)) {
					if (!spm2.equals(spm2ToSps2)) {
						if (!spm1.equals(sps2)) {
							if (!spm1.equals(sps1)) {
								if (!spm1.equals(spm2)) {
									if (!spm1.equals(spm1ToSps1)) {
										if (!spm1.equals(spm2ToSps2)) {
											if (!spm1ToSps1.equals(sps2)) {
												if (!spm1ToSps1.equals(sps1)) {
													if (!spm1ToSps1
															.equals(spm2)) {
														if (!spm1ToSps1
																.equals(spm2ToSps2)) {
															if (!spm2ToSps2
																	.equals(sps2)) {
																if (!spm2ToSps2
																		.equals(sps1)) {
																	return new Object[] {
																			ruleresult,
																			sps2,
																			sps1,
																			spm2,
																			spm1,
																			spm1ToSps1,
																			spm2ToSps2 };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_1_3_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject sps2, EObject sps1,
			EObject spm2, EObject spm1) {
		EMoflonEdge sps1__sps2____continue = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm1__spm2______con = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ContinueFixRule";
		String sps1__sps2____continue_name_prime = "continue";
		String spm1__spm2______con_name_prime = "__con";
		sps1__sps2____continue.setSrc(sps1);
		sps1__sps2____continue.setTrg(sps2);
		ruleresult.getCreatedEdges().add(sps1__sps2____continue);
		spm1__spm2______con.setSrc(spm1);
		spm1__spm2______con.setTrg(spm2);
		ruleresult.getTranslatedEdges().add(spm1__spm2______con);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sps1__sps2____continue.setName(sps1__sps2____continue_name_prime);
		spm1__spm2______con.setName(spm1__spm2______con_name_prime);
		return new Object[] { ruleresult, sps2, sps1, spm2, spm1,
				sps1__sps2____continue, spm1__spm2______con };
	}

	public static final void pattern_ContinueFixRule_1_5_expressionBBBBBBBB(
			ContinueFixRule _this, PerformRuleResult ruleresult, EObject sps2,
			EObject sps1, EObject spm2, EObject spm1, EObject spm1ToSps1,
			EObject spm2ToSps2) {
		_this.registerObjects_FWD(ruleresult, sps2, sps1, spm2, spm1,
				spm1ToSps1, spm2ToSps2);

	}

	public static final PerformRuleResult pattern_ContinueFixRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_2_1_bindingFB(
			ContinueFixRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_2_1_blackFBB(
			EClass eClass, ContinueFixRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_2_1_bindingAndBlackFFB(
			ContinueFixRule _this) {
		Object[] result_pattern_ContinueFixRule_2_1_binding = pattern_ContinueFixRule_2_1_bindingFB(_this);
		if (result_pattern_ContinueFixRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ContinueFixRule_2_1_binding[0];

			Object[] result_pattern_ContinueFixRule_2_1_black = pattern_ContinueFixRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_ContinueFixRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ContinueFixRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ContinueFixRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ContinueFixRule_2_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("spm2");
		EObject _localVariable_1 = match.getObject("spm1");
		EObject tmpSpm2 = _localVariable_0;
		EObject tmpSpm1 = _localVariable_1;
		if (tmpSpm2 instanceof SplitMerge) {
			SplitMerge spm2 = (SplitMerge) tmpSpm2;
			if (tmpSpm1 instanceof SplitMerge) {
				SplitMerge spm1 = (SplitMerge) tmpSpm1;
				return new Object[] { spm2, spm1, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ContinueFixRule_2_2_blackFFBBFFB(
			SplitMerge spm2, SplitMerge spm1, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!spm1.equals(spm2)) {
			for (E2S spm1ToSps1 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(spm1, E2S.class, "source")) {
				Step tmpSps1 = spm1ToSps1.getTarget();
				if (tmpSps1 instanceof SpecialStep) {
					SpecialStep sps1 = (SpecialStep) tmpSps1;
					for (E2S spm2ToSps2 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(spm2, E2S.class,
									"source")) {
						if (!spm1ToSps1.equals(spm2ToSps2)) {
							Step tmpSps2 = spm2ToSps2.getTarget();
							if (tmpSps2 instanceof SpecialStep) {
								SpecialStep sps2 = (SpecialStep) tmpSps2;
								if (!sps1.equals(sps2)) {
									_result.add(new Object[] { sps2, sps1,
											spm2, spm1, spm1ToSps1, spm2ToSps2,
											match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ContinueFixRule_2_3_blackBBBBBB(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sps1.equals(sps2)) {
			if (!spm1.equals(spm2)) {
				if (!spm1ToSps1.equals(spm2ToSps2)) {
					if (spm2.equals(spm1.get__con())) {
						if (spm1.equals(spm1ToSps1.getSource())) {
							if (sps1.equals(spm1ToSps1.getTarget())) {
								if (spm2.equals(spm2ToSps2.getSource())) {
									if (sps2.equals(spm2ToSps2.getTarget())) {
										_result.add(new Object[] { sps2, sps1,
												spm2, spm1, spm1ToSps1,
												spm2ToSps2 });
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_2_3_greenBBBBBBFFFFFF(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge spm1__spm2______con = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm1ToSps1__spm1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm1ToSps1__sps1____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm2ToSps2__spm2____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm2ToSps2__sps2____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String spm1__spm2______con_name_prime = "__con";
		String spm1ToSps1__spm1____source_name_prime = "source";
		String spm1ToSps1__sps1____target_name_prime = "target";
		String spm2ToSps2__spm2____source_name_prime = "source";
		String spm2ToSps2__sps2____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sps2);
		isApplicableMatch.getAllContextElements().add(sps1);
		isApplicableMatch.getAllContextElements().add(spm2);
		isApplicableMatch.getAllContextElements().add(spm1);
		isApplicableMatch.getAllContextElements().add(spm1ToSps1);
		isApplicableMatch.getAllContextElements().add(spm2ToSps2);
		spm1__spm2______con.setSrc(spm1);
		spm1__spm2______con.setTrg(spm2);
		isApplicableMatch.getAllContextElements().add(spm1__spm2______con);
		spm1ToSps1__spm1____source.setSrc(spm1ToSps1);
		spm1ToSps1__spm1____source.setTrg(spm1);
		isApplicableMatch.getAllContextElements().add(
				spm1ToSps1__spm1____source);
		spm1ToSps1__sps1____target.setSrc(spm1ToSps1);
		spm1ToSps1__sps1____target.setTrg(sps1);
		isApplicableMatch.getAllContextElements().add(
				spm1ToSps1__sps1____target);
		spm2ToSps2__spm2____source.setSrc(spm2ToSps2);
		spm2ToSps2__spm2____source.setTrg(spm2);
		isApplicableMatch.getAllContextElements().add(
				spm2ToSps2__spm2____source);
		spm2ToSps2__sps2____target.setSrc(spm2ToSps2);
		spm2ToSps2__sps2____target.setTrg(sps2);
		isApplicableMatch.getAllContextElements().add(
				spm2ToSps2__sps2____target);
		spm1__spm2______con.setName(spm1__spm2______con_name_prime);
		spm1ToSps1__spm1____source
				.setName(spm1ToSps1__spm1____source_name_prime);
		spm1ToSps1__sps1____target
				.setName(spm1ToSps1__sps1____target_name_prime);
		spm2ToSps2__spm2____source
				.setName(spm2ToSps2__spm2____source_name_prime);
		spm2ToSps2__sps2____target
				.setName(spm2ToSps2__sps2____target_name_prime);
		return new Object[] { sps2, sps1, spm2, spm1, spm1ToSps1, spm2ToSps2,
				isApplicableMatch, spm1__spm2______con,
				spm1ToSps1__spm1____source, spm1ToSps1__sps1____target,
				spm2ToSps2__spm2____source, spm2ToSps2__sps2____target };
	}

	public static final Object[] pattern_ContinueFixRule_2_4_bindingFBBBBBBBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch,
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sps2, sps1,
					spm2, spm1, spm1ToSps1, spm2ToSps2 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinueFixRule_2_4_bindingAndBlackFBBBBBBBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch,
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		Object[] result_pattern_ContinueFixRule_2_4_binding = pattern_ContinueFixRule_2_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2);
		if (result_pattern_ContinueFixRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_ContinueFixRule_2_4_binding[0];

			Object[] result_pattern_ContinueFixRule_2_4_black = pattern_ContinueFixRule_2_4_blackB(csp);
			if (result_pattern_ContinueFixRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sps2,
						sps1, spm2, spm1, spm1ToSps1, spm2ToSps2 };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinueFixRule_2_5_expressionFBB(
			ContinueFixRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ContinueFixRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ContinueFixRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ContinueFixRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_10_1_blackBBBB(
			ContinueFixRule _this, Match match, SpecialStep sps2,
			SpecialStep sps1) {
		if (!sps1.equals(sps2)) {
			return new Object[] { _this, match, sps2, sps1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_10_2_bindingFBBBB(
			ContinueFixRule _this, Match match, SpecialStep sps2,
			SpecialStep sps1) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, sps2,
				sps1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sps2, sps1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinueFixRule_10_2_bindingAndBlackFBBBB(
			ContinueFixRule _this, Match match, SpecialStep sps2,
			SpecialStep sps1) {
		Object[] result_pattern_ContinueFixRule_10_2_binding = pattern_ContinueFixRule_10_2_bindingFBBBB(
				_this, match, sps2, sps1);
		if (result_pattern_ContinueFixRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_ContinueFixRule_10_2_binding[0];

			Object[] result_pattern_ContinueFixRule_10_2_black = pattern_ContinueFixRule_10_2_blackB(csp);
			if (result_pattern_ContinueFixRule_10_2_black != null) {

				return new Object[] { csp, _this, match, sps2, sps1 };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinueFixRule_10_3_expressionFBB(
			ContinueFixRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_10_4_blackBBB(
			Match match, SpecialStep sps2, SpecialStep sps1) {
		if (!sps1.equals(sps2)) {
			return new Object[] { match, sps2, sps1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_10_4_greenBBBF(
			Match match, SpecialStep sps2, SpecialStep sps1) {
		EMoflonEdge sps1__sps2____continue = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String sps1__sps2____continue_name_prime = "continue";
		sps1__sps2____continue.setSrc(sps1);
		sps1__sps2____continue.setTrg(sps2);
		match.getToBeTranslatedEdges().add(sps1__sps2____continue);
		sps1__sps2____continue.setName(sps1__sps2____continue_name_prime);
		return new Object[] { match, sps2, sps1, sps1__sps2____continue };
	}

	public static final Object[] pattern_ContinueFixRule_10_5_blackBBB(
			Match match, SpecialStep sps2, SpecialStep sps1) {
		if (!sps1.equals(sps2)) {
			return new Object[] { match, sps2, sps1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_10_5_greenBBB(
			Match match, SpecialStep sps2, SpecialStep sps1) {
		match.getContextNodes().add(sps2);
		match.getContextNodes().add(sps1);
		return new Object[] { match, sps2, sps1 };
	}

	public static final void pattern_ContinueFixRule_10_6_expressionBBBB(
			ContinueFixRule _this, Match match, SpecialStep sps2,
			SpecialStep sps1) {
		_this.registerObjectsToMatch_BWD(match, sps2, sps1);

	}

	public static final boolean pattern_ContinueFixRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ContinueFixRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_11_1_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sps2");
		EObject _localVariable_1 = isApplicableMatch.getObject("sps1");
		EObject _localVariable_2 = isApplicableMatch.getObject("spm2");
		EObject _localVariable_3 = isApplicableMatch.getObject("spm1");
		EObject _localVariable_4 = isApplicableMatch.getObject("spm1ToSps1");
		EObject _localVariable_5 = isApplicableMatch.getObject("spm2ToSps2");
		EObject tmpSps2 = _localVariable_0;
		EObject tmpSps1 = _localVariable_1;
		EObject tmpSpm2 = _localVariable_2;
		EObject tmpSpm1 = _localVariable_3;
		EObject tmpSpm1ToSps1 = _localVariable_4;
		EObject tmpSpm2ToSps2 = _localVariable_5;
		if (tmpSps2 instanceof SpecialStep) {
			SpecialStep sps2 = (SpecialStep) tmpSps2;
			if (tmpSps1 instanceof SpecialStep) {
				SpecialStep sps1 = (SpecialStep) tmpSps1;
				if (tmpSpm2 instanceof SplitMerge) {
					SplitMerge spm2 = (SplitMerge) tmpSpm2;
					if (tmpSpm1 instanceof SplitMerge) {
						SplitMerge spm1 = (SplitMerge) tmpSpm1;
						if (tmpSpm1ToSps1 instanceof E2S) {
							E2S spm1ToSps1 = (E2S) tmpSpm1ToSps1;
							if (tmpSpm2ToSps2 instanceof E2S) {
								E2S spm2ToSps2 = (E2S) tmpSpm2ToSps2;
								return new Object[] { sps2, sps1, spm2, spm1,
										spm1ToSps1, spm2ToSps2,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_11_1_blackBBBBBBFBB(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2,
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch) {
		if (!sps1.equals(sps2)) {
			if (!spm1.equals(spm2)) {
				if (!spm1ToSps1.equals(spm2ToSps2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { sps2, sps1, spm2, spm1,
									spm1ToSps1, spm2ToSps2, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_11_1_bindingAndBlackFFFFFFFBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ContinueFixRule_11_1_binding = pattern_ContinueFixRule_11_1_bindingFFFFFFB(isApplicableMatch);
		if (result_pattern_ContinueFixRule_11_1_binding != null) {
			SpecialStep sps2 = (SpecialStep) result_pattern_ContinueFixRule_11_1_binding[0];
			SpecialStep sps1 = (SpecialStep) result_pattern_ContinueFixRule_11_1_binding[1];
			SplitMerge spm2 = (SplitMerge) result_pattern_ContinueFixRule_11_1_binding[2];
			SplitMerge spm1 = (SplitMerge) result_pattern_ContinueFixRule_11_1_binding[3];
			E2S spm1ToSps1 = (E2S) result_pattern_ContinueFixRule_11_1_binding[4];
			E2S spm2ToSps2 = (E2S) result_pattern_ContinueFixRule_11_1_binding[5];

			Object[] result_pattern_ContinueFixRule_11_1_black = pattern_ContinueFixRule_11_1_blackBBBBBBFBB(
					sps2, sps1, spm2, spm1, spm1ToSps1, spm2ToSps2, _this,
					isApplicableMatch);
			if (result_pattern_ContinueFixRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_ContinueFixRule_11_1_black[6];

				return new Object[] { sps2, sps1, spm2, spm1, spm1ToSps1,
						spm2ToSps2, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_11_1_greenBB(
			SplitMerge spm2, SplitMerge spm1) {
		spm1.set__con(spm2);
		return new Object[] { spm2, spm1 };
	}

	public static final Object[] pattern_ContinueFixRule_11_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ContinueFixRule_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject sps2, EObject sps1,
			EObject spm2, EObject spm1, EObject spm1ToSps1, EObject spm2ToSps2) {
		if (!sps1.equals(sps2)) {
			if (!spm2.equals(sps2)) {
				if (!spm2.equals(sps1)) {
					if (!spm2.equals(spm2ToSps2)) {
						if (!spm1.equals(sps2)) {
							if (!spm1.equals(sps1)) {
								if (!spm1.equals(spm2)) {
									if (!spm1.equals(spm1ToSps1)) {
										if (!spm1.equals(spm2ToSps2)) {
											if (!spm1ToSps1.equals(sps2)) {
												if (!spm1ToSps1.equals(sps1)) {
													if (!spm1ToSps1
															.equals(spm2)) {
														if (!spm1ToSps1
																.equals(spm2ToSps2)) {
															if (!spm2ToSps2
																	.equals(sps2)) {
																if (!spm2ToSps2
																		.equals(sps1)) {
																	return new Object[] {
																			ruleresult,
																			sps2,
																			sps1,
																			spm2,
																			spm1,
																			spm1ToSps1,
																			spm2ToSps2 };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_11_3_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject sps2, EObject sps1,
			EObject spm2, EObject spm1) {
		EMoflonEdge sps1__sps2____continue = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm1__spm2______con = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ContinueFixRule";
		String sps1__sps2____continue_name_prime = "continue";
		String spm1__spm2______con_name_prime = "__con";
		sps1__sps2____continue.setSrc(sps1);
		sps1__sps2____continue.setTrg(sps2);
		ruleresult.getTranslatedEdges().add(sps1__sps2____continue);
		spm1__spm2______con.setSrc(spm1);
		spm1__spm2______con.setTrg(spm2);
		ruleresult.getCreatedEdges().add(spm1__spm2______con);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sps1__sps2____continue.setName(sps1__sps2____continue_name_prime);
		spm1__spm2______con.setName(spm1__spm2______con_name_prime);
		return new Object[] { ruleresult, sps2, sps1, spm2, spm1,
				sps1__sps2____continue, spm1__spm2______con };
	}

	public static final void pattern_ContinueFixRule_11_5_expressionBBBBBBBB(
			ContinueFixRule _this, PerformRuleResult ruleresult, EObject sps2,
			EObject sps1, EObject spm2, EObject spm1, EObject spm1ToSps1,
			EObject spm2ToSps2) {
		_this.registerObjects_BWD(ruleresult, sps2, sps1, spm2, spm1,
				spm1ToSps1, spm2ToSps2);

	}

	public static final PerformRuleResult pattern_ContinueFixRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_12_1_bindingFB(
			ContinueFixRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_12_1_blackFBB(
			EClass eClass, ContinueFixRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_12_1_bindingAndBlackFFB(
			ContinueFixRule _this) {
		Object[] result_pattern_ContinueFixRule_12_1_binding = pattern_ContinueFixRule_12_1_bindingFB(_this);
		if (result_pattern_ContinueFixRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_ContinueFixRule_12_1_binding[0];

			Object[] result_pattern_ContinueFixRule_12_1_black = pattern_ContinueFixRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_ContinueFixRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ContinueFixRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "ContinueFixRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ContinueFixRule_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("sps2");
		EObject _localVariable_1 = match.getObject("sps1");
		EObject tmpSps2 = _localVariable_0;
		EObject tmpSps1 = _localVariable_1;
		if (tmpSps2 instanceof SpecialStep) {
			SpecialStep sps2 = (SpecialStep) tmpSps2;
			if (tmpSps1 instanceof SpecialStep) {
				SpecialStep sps1 = (SpecialStep) tmpSps1;
				return new Object[] { sps2, sps1, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ContinueFixRule_12_2_blackBBFFFFB(
			SpecialStep sps2, SpecialStep sps1, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sps1.equals(sps2)) {
			for (E2S spm1ToSps1 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sps1, E2S.class, "target")) {
				Element tmpSpm1 = spm1ToSps1.getSource();
				if (tmpSpm1 instanceof SplitMerge) {
					SplitMerge spm1 = (SplitMerge) tmpSpm1;
					for (E2S spm2ToSps2 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(sps2, E2S.class,
									"target")) {
						if (!spm1ToSps1.equals(spm2ToSps2)) {
							Element tmpSpm2 = spm2ToSps2.getSource();
							if (tmpSpm2 instanceof SplitMerge) {
								SplitMerge spm2 = (SplitMerge) tmpSpm2;
								if (!spm1.equals(spm2)) {
									_result.add(new Object[] { sps2, sps1,
											spm2, spm1, spm1ToSps1, spm2ToSps2,
											match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ContinueFixRule_12_3_blackBBBBBB(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sps1.equals(sps2)) {
			if (!spm1.equals(spm2)) {
				if (!spm1ToSps1.equals(spm2ToSps2)) {
					if (sps2.equals(sps1.getContinue())) {
						if (spm1.equals(spm1ToSps1.getSource())) {
							if (sps1.equals(spm1ToSps1.getTarget())) {
								if (spm2.equals(spm2ToSps2.getSource())) {
									if (sps2.equals(spm2ToSps2.getTarget())) {
										_result.add(new Object[] { sps2, sps1,
												spm2, spm1, spm1ToSps1,
												spm2ToSps2 });
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_12_3_greenBBBBBBFFFFFF(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge sps1__sps2____continue = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm1ToSps1__spm1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm1ToSps1__sps1____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm2ToSps2__spm2____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spm2ToSps2__sps2____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String sps1__sps2____continue_name_prime = "continue";
		String spm1ToSps1__spm1____source_name_prime = "source";
		String spm1ToSps1__sps1____target_name_prime = "target";
		String spm2ToSps2__spm2____source_name_prime = "source";
		String spm2ToSps2__sps2____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sps2);
		isApplicableMatch.getAllContextElements().add(sps1);
		isApplicableMatch.getAllContextElements().add(spm2);
		isApplicableMatch.getAllContextElements().add(spm1);
		isApplicableMatch.getAllContextElements().add(spm1ToSps1);
		isApplicableMatch.getAllContextElements().add(spm2ToSps2);
		sps1__sps2____continue.setSrc(sps1);
		sps1__sps2____continue.setTrg(sps2);
		isApplicableMatch.getAllContextElements().add(sps1__sps2____continue);
		spm1ToSps1__spm1____source.setSrc(spm1ToSps1);
		spm1ToSps1__spm1____source.setTrg(spm1);
		isApplicableMatch.getAllContextElements().add(
				spm1ToSps1__spm1____source);
		spm1ToSps1__sps1____target.setSrc(spm1ToSps1);
		spm1ToSps1__sps1____target.setTrg(sps1);
		isApplicableMatch.getAllContextElements().add(
				spm1ToSps1__sps1____target);
		spm2ToSps2__spm2____source.setSrc(spm2ToSps2);
		spm2ToSps2__spm2____source.setTrg(spm2);
		isApplicableMatch.getAllContextElements().add(
				spm2ToSps2__spm2____source);
		spm2ToSps2__sps2____target.setSrc(spm2ToSps2);
		spm2ToSps2__sps2____target.setTrg(sps2);
		isApplicableMatch.getAllContextElements().add(
				spm2ToSps2__sps2____target);
		sps1__sps2____continue.setName(sps1__sps2____continue_name_prime);
		spm1ToSps1__spm1____source
				.setName(spm1ToSps1__spm1____source_name_prime);
		spm1ToSps1__sps1____target
				.setName(spm1ToSps1__sps1____target_name_prime);
		spm2ToSps2__spm2____source
				.setName(spm2ToSps2__spm2____source_name_prime);
		spm2ToSps2__sps2____target
				.setName(spm2ToSps2__sps2____target_name_prime);
		return new Object[] { sps2, sps1, spm2, spm1, spm1ToSps1, spm2ToSps2,
				isApplicableMatch, sps1__sps2____continue,
				spm1ToSps1__spm1____source, spm1ToSps1__sps1____target,
				spm2ToSps2__spm2____source, spm2ToSps2__sps2____target };
	}

	public static final Object[] pattern_ContinueFixRule_12_4_bindingFBBBBBBBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch,
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sps2, sps1,
					spm2, spm1, spm1ToSps1, spm2ToSps2 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinueFixRule_12_4_bindingAndBlackFBBBBBBBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch,
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		Object[] result_pattern_ContinueFixRule_12_4_binding = pattern_ContinueFixRule_12_4_bindingFBBBBBBBB(
				_this, isApplicableMatch, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2);
		if (result_pattern_ContinueFixRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_ContinueFixRule_12_4_binding[0];

			Object[] result_pattern_ContinueFixRule_12_4_black = pattern_ContinueFixRule_12_4_blackB(csp);
			if (result_pattern_ContinueFixRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sps2,
						sps1, spm2, spm1, spm1ToSps1, spm2ToSps2 };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinueFixRule_12_5_expressionFBB(
			ContinueFixRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ContinueFixRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ContinueFixRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ContinueFixRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_20_1_bindingFB(
			ContinueFixRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_20_1_blackFBB(
			EClass __eClass, ContinueFixRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_20_1_bindingAndBlackFFB(
			ContinueFixRule _this) {
		Object[] result_pattern_ContinueFixRule_20_1_binding = pattern_ContinueFixRule_20_1_bindingFB(_this);
		if (result_pattern_ContinueFixRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ContinueFixRule_20_1_binding[0];

			Object[] result_pattern_ContinueFixRule_20_1_black = pattern_ContinueFixRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ContinueFixRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ContinueFixRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ContinueFixRule_20_2_blackFFB(
			EMoflonEdge _edge_continue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSps1 = _edge_continue.getSrc();
		if (tmpSps1 instanceof SpecialStep) {
			SpecialStep sps1 = (SpecialStep) tmpSps1;
			EObject tmpSps2 = _edge_continue.getTrg();
			if (tmpSps2 instanceof SpecialStep) {
				SpecialStep sps2 = (SpecialStep) tmpSps2;
				if (!sps1.equals(sps2)) {
					if (sps2.equals(sps1.getContinue())) {
						_result.add(new Object[] { sps2, sps1, _edge_continue });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ContinueFixRule_20_3_expressionFBBBB(
			ContinueFixRule _this, Match match, SpecialStep sps2,
			SpecialStep sps1) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, sps2, sps1);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ContinueFixRule_20_4_expressionFBB(
			ContinueFixRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ContinueFixRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ContinueFixRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_21_1_bindingFB(
			ContinueFixRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_21_1_blackFBB(
			EClass __eClass, ContinueFixRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_21_1_bindingAndBlackFFB(
			ContinueFixRule _this) {
		Object[] result_pattern_ContinueFixRule_21_1_binding = pattern_ContinueFixRule_21_1_bindingFB(_this);
		if (result_pattern_ContinueFixRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_ContinueFixRule_21_1_binding[0];

			Object[] result_pattern_ContinueFixRule_21_1_black = pattern_ContinueFixRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_ContinueFixRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ContinueFixRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ContinueFixRule_21_2_blackFFB(
			EMoflonEdge _edge___con) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSpm1 = _edge___con.getSrc();
		if (tmpSpm1 instanceof SplitMerge) {
			SplitMerge spm1 = (SplitMerge) tmpSpm1;
			EObject tmpSpm2 = _edge___con.getTrg();
			if (tmpSpm2 instanceof SplitMerge) {
				SplitMerge spm2 = (SplitMerge) tmpSpm2;
				if (!spm1.equals(spm2)) {
					if (spm2.equals(spm1.get__con())) {
						_result.add(new Object[] { spm2, spm1, _edge___con });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ContinueFixRule_21_3_expressionFBBBB(
			ContinueFixRule _this, Match match, SplitMerge spm2, SplitMerge spm1) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, spm2, spm1);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ContinueFixRule_21_4_expressionFBB(
			ContinueFixRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_ContinueFixRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_ContinueFixRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_24_1_blackB(
			ContinueFixRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ContinueFixRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ContinueFixRule_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SpecialStep sps2) {
		if (ruleResult.getTargetObjects().contains(sps2)) {
			return new Object[] { ruleResult, sps2 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, E2S spm2ToSps2) {
		if (ruleResult.getCorrObjects().contains(spm2ToSps2)) {
			return new Object[] { ruleResult, spm2ToSps2 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SplitMerge spm2) {
		if (ruleResult.getSourceObjects().contains(spm2)) {
			return new Object[] { ruleResult, spm2 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, SpecialStep sps1) {
		if (ruleResult.getTargetObjects().contains(sps1)) {
			return new Object[] { ruleResult, sps1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, E2S spm1ToSps1) {
		if (ruleResult.getCorrObjects().contains(spm1ToSps1)) {
			return new Object[] { ruleResult, spm1ToSps1 };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, SplitMerge spm1) {
		if (ruleResult.getSourceObjects().contains(spm1)) {
			return new Object[] { ruleResult, spm1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ContinueFixRule_24_2_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList spm2ToSps2List : ruleEntryContainer
				.getRuleEntryList()) {
			for (RuleEntryList spm1ToSps1List : ruleEntryContainer
					.getRuleEntryList()) {
				if (!spm1ToSps1List.equals(spm2ToSps2List)) {
					for (EObject tmpSpm2ToSps2 : spm2ToSps2List
							.getEntryObjects()) {
						if (tmpSpm2ToSps2 instanceof E2S) {
							E2S spm2ToSps2 = (E2S) tmpSpm2ToSps2;
							Step tmpSps2 = spm2ToSps2.getTarget();
							if (tmpSps2 instanceof SpecialStep) {
								SpecialStep sps2 = (SpecialStep) tmpSps2;
								Element tmpSpm2 = spm2ToSps2.getSource();
								if (tmpSpm2 instanceof SplitMerge) {
									SplitMerge spm2 = (SplitMerge) tmpSpm2;
									if (pattern_ContinueFixRule_24_2_black_nac_1BB(
											ruleResult, spm2ToSps2) == null) {
										if (pattern_ContinueFixRule_24_2_black_nac_0BB(
												ruleResult, sps2) == null) {
											if (pattern_ContinueFixRule_24_2_black_nac_2BB(
													ruleResult, spm2) == null) {
												for (EObject tmpSpm1ToSps1 : spm1ToSps1List
														.getEntryObjects()) {
													if (tmpSpm1ToSps1 instanceof E2S) {
														E2S spm1ToSps1 = (E2S) tmpSpm1ToSps1;
														if (!spm1ToSps1
																.equals(spm2ToSps2)) {
															Step tmpSps1 = spm1ToSps1
																	.getTarget();
															if (tmpSps1 instanceof SpecialStep) {
																SpecialStep sps1 = (SpecialStep) tmpSps1;
																if (!sps1
																		.equals(sps2)) {
																	Element tmpSpm1 = spm1ToSps1
																			.getSource();
																	if (tmpSpm1 instanceof SplitMerge) {
																		SplitMerge spm1 = (SplitMerge) tmpSpm1;
																		if (!spm1
																				.equals(spm2)) {
																			if (pattern_ContinueFixRule_24_2_black_nac_4BB(
																					ruleResult,
																					spm1ToSps1) == null) {
																				if (pattern_ContinueFixRule_24_2_black_nac_3BB(
																						ruleResult,
																						sps1) == null) {
																					if (pattern_ContinueFixRule_24_2_black_nac_5BB(
																							ruleResult,
																							spm1) == null) {
																						_result.add(new Object[] {
																								spm2ToSps2List,
																								sps2,
																								spm2ToSps2,
																								spm2,
																								spm1ToSps1List,
																								sps1,
																								spm1ToSps1,
																								spm1,
																								ruleEntryContainer,
																								ruleResult });
																					}
																				}
																			}
																		}
																	}

																}
															}

														}
													}
												}
											}
										}
									}
								}

							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_24_3_bindingFBBBBBBBBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch,
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sps2, sps1,
					spm2, spm1, spm1ToSps1, spm2ToSps2, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ContinueFixRule_24_3_bindingAndBlackFBBBBBBBBB(
			ContinueFixRule _this, IsApplicableMatch isApplicableMatch,
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ContinueFixRule_24_3_binding = pattern_ContinueFixRule_24_3_bindingFBBBBBBBBB(
				_this, isApplicableMatch, sps2, sps1, spm2, spm1, spm1ToSps1,
				spm2ToSps2, ruleResult);
		if (result_pattern_ContinueFixRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_ContinueFixRule_24_3_binding[0];

			Object[] result_pattern_ContinueFixRule_24_3_black = pattern_ContinueFixRule_24_3_blackB(csp);
			if (result_pattern_ContinueFixRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sps2,
						sps1, spm2, spm1, spm1ToSps1, spm2ToSps2, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ContinueFixRule_24_4_expressionFBB(
			ContinueFixRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ContinueFixRule_24_5_blackBBBBBB(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2) {
		if (!sps1.equals(sps2)) {
			if (!spm1.equals(spm2)) {
				if (!spm1ToSps1.equals(spm2ToSps2)) {
					return new Object[] { sps2, sps1, spm2, spm1, spm1ToSps1,
							spm2ToSps2 };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_6_blackBBBBBBB(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, E2S spm1ToSps1, E2S spm2ToSps2,
			ModelgeneratorRuleResult ruleResult) {
		if (!sps1.equals(sps2)) {
			if (!spm1.equals(spm2)) {
				if (!spm1ToSps1.equals(spm2ToSps2)) {
					return new Object[] { sps2, sps1, spm2, spm1, spm1ToSps1,
							spm2ToSps2, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ContinueFixRule_24_6_greenBBBBB(
			SpecialStep sps2, SpecialStep sps1, SplitMerge spm2,
			SplitMerge spm1, ModelgeneratorRuleResult ruleResult) {
		sps1.setContinue(sps2);
		spm1.set__con(spm2);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { sps2, sps1, spm2, spm1, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ContinueFixRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ContinueFixRuleImpl
