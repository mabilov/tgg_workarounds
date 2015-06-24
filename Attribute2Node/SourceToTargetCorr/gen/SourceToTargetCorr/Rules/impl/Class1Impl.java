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
	public boolean isAppropriate_FWD(Match match, SourceModel sm) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_0_1_blackBBB(this,
				match, sm);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_0_2_bindingAndBlackFBBB(this, match, sm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_0_4_blackBB(
					match, sm);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ".");
			}
			Class1Impl.pattern_Class1_0_4_greenBB(match, sm);

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_0_5_blackBB(
					match, sm);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ".");
			}
			// register objects to match
			Class1Impl.pattern_Class1_0_6_expressionBBB(this, match, sm);
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
		SourceModel sm = (SourceModel) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_1_1_greenBFF(sm);
		TargetModel tm = (TargetModel) result1_green[1];
		SM2TM sm2Tm = (SM2TM) result1_green[2];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_1_2_blackBBB(sm, tm,
				sm2Tm);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[sm] = " + sm + ", "
							+ "[tm] = " + tm + ", " + "[sm2Tm] = " + sm2Tm
							+ ".");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_1_2_greenFBBB(sm,
				tm, sm2Tm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_1_3_blackBBBB(
				ruleresult, sm, tm, sm2Tm);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
							+ ", " + "[sm2Tm] = " + sm2Tm + ".");
		}
		Class1Impl.pattern_Class1_1_3_greenBBBBFF(ruleresult, sm, tm, sm2Tm);
		// EMoflonEdge sm2Tm__sm____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge sm2Tm__tm____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_1_5_expressionBBBBB(this, ruleresult, sm, tm,
				sm2Tm);
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
		SourceModel sm = (SourceModel) result2_binding[0];
		for (Object[] result2_black : Class1Impl.pattern_Class1_2_2_blackBB(sm,
				match)) {
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_2_3_blackB(sm)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_2_3_greenBF(sm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_2_4_bindingAndBlackFBBB(this,
								isApplicableMatch, sm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[sm] = " + sm
									+ ".");
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
	public void registerObjectsToMatch_FWD(Match match, SourceModel sm) {
		match.registerObject("sm", sm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SourceModel sm) {// Create CSP
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
			SourceModel sm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject sm,
			EObject tm, EObject sm2Tm) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("sm2Tm", sm2Tm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("sm").eClass()
				.equals(Source.SourcePackage.eINSTANCE.getSourceModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TargetModel tm) {
		// initial bindings
		Object[] result1_black = Class1Impl.pattern_Class1_10_1_blackBBB(this,
				match, tm);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tm] = " + tm
							+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = Class1Impl
				.pattern_Class1_10_2_bindingAndBlackFBBB(this, match, tm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tm] = " + tm
							+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (Class1Impl.pattern_Class1_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = Class1Impl.pattern_Class1_10_4_blackBB(
					match, tm);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[tm] = " + tm + ".");
			}
			Class1Impl.pattern_Class1_10_4_greenBB(match, tm);

			// collect context elements
			Object[] result5_black = Class1Impl.pattern_Class1_10_5_blackBB(
					match, tm);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[tm] = " + tm + ".");
			}
			// register objects to match
			Class1Impl.pattern_Class1_10_6_expressionBBB(this, match, tm);
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
		TargetModel tm = (TargetModel) result1_bindingAndBlack[0];
		// CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = Class1Impl.pattern_Class1_11_1_greenFBF(tm);
		SourceModel sm = (SourceModel) result1_green[0];
		SM2TM sm2Tm = (SM2TM) result1_green[2];

		// collect translated elements
		Object[] result2_black = Class1Impl.pattern_Class1_11_2_blackBBB(sm,
				tm, sm2Tm);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[sm] = " + sm + ", "
							+ "[tm] = " + tm + ", " + "[sm2Tm] = " + sm2Tm
							+ ".");
		}
		Object[] result2_green = Class1Impl.pattern_Class1_11_2_greenFBBB(sm,
				tm, sm2Tm);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = Class1Impl.pattern_Class1_11_3_blackBBBB(
				ruleresult, sm, tm, sm2Tm);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
							+ ", " + "[sm2Tm] = " + sm2Tm + ".");
		}
		Class1Impl.pattern_Class1_11_3_greenBBBBFF(ruleresult, sm, tm, sm2Tm);
		// EMoflonEdge sm2Tm__sm____source = (EMoflonEdge) result3_green[4];
		// EMoflonEdge sm2Tm__tm____target = (EMoflonEdge) result3_green[5];

		// perform postprocessing story node is empty
		// register objects
		Class1Impl.pattern_Class1_11_5_expressionBBBBB(this, ruleresult, sm,
				tm, sm2Tm);
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
		TargetModel tm = (TargetModel) result2_binding[0];
		for (Object[] result2_black : Class1Impl.pattern_Class1_12_2_blackBB(
				tm, match)) {
			// ForEach find context
			for (Object[] result3_black : Class1Impl
					.pattern_Class1_12_3_blackB(tm)) {
				Object[] result3_green = Class1Impl
						.pattern_Class1_12_3_greenBF(tm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				// solve CSP
				Object[] result4_bindingAndBlack = Class1Impl
						.pattern_Class1_12_4_bindingAndBlackFBBB(this,
								isApplicableMatch, tm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[tm] = " + tm
									+ ".");
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
	public void registerObjectsToMatch_BWD(Match match, TargetModel tm) {
		match.registerObject("tm", tm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TargetModel tm) {// Create CSP
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
			TargetModel tm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tm", tm);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject sm,
			EObject tm, EObject sm2Tm) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("sm2Tm", sm2Tm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("tm").eClass()
				.equals(Target.TargetPackage.eINSTANCE.getTargetModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_SourceModel_15(SourceModel sm) {
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
		for (Object[] result2_black : Class1Impl.pattern_Class1_20_2_blackB(sm)) {
			Object[] result2_green = Class1Impl
					.pattern_Class1_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_20_3_expressionFBBB(this, match, sm)) {
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
	public EObjectContainer isAppropriate_BWD_TargetModel_15(TargetModel tm) {
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
		for (Object[] result2_black : Class1Impl.pattern_Class1_21_2_blackB(tm)) {
			Object[] result2_green = Class1Impl
					.pattern_Class1_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (Class1Impl.pattern_Class1_21_3_expressionFBBB(this, match, tm)) {
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
				// SourceModel sm = (SourceModel) result6_green[0];
				// TargetModel tm = (TargetModel) result6_green[1];
				// SM2TM sm2Tm = (SM2TM) result6_green[2];

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
		case RulesPackage.CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_15__SOURCEMODEL:
			return isAppropriate_FWD_SourceModel_15((SourceModel) arguments
					.get(0));
		case RulesPackage.CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_15__TARGETMODEL:
			return isAppropriate_BWD_TargetModel_15((TargetModel) arguments
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
			Match match, SourceModel sm) {
		return new Object[] { _this, match, sm };
	}

	public static final Object[] pattern_Class1_0_2_bindingFBBB(Class1 _this,
			Match match, SourceModel sm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, sm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sm };
		}
		return null;
	}

	public static final Object[] pattern_Class1_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_0_2_bindingAndBlackFBBB(
			Class1 _this, Match match, SourceModel sm) {
		Object[] result_pattern_Class1_0_2_binding = pattern_Class1_0_2_bindingFBBB(
				_this, match, sm);
		if (result_pattern_Class1_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_0_2_binding[0];

			Object[] result_pattern_Class1_0_2_black = pattern_Class1_0_2_blackB(csp);
			if (result_pattern_Class1_0_2_black != null) {

				return new Object[] { csp, _this, match, sm };
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
			SourceModel sm) {
		return new Object[] { match, sm };
	}

	public static final Object[] pattern_Class1_0_4_greenBB(Match match,
			SourceModel sm) {
		match.getToBeTranslatedNodes().add(sm);
		return new Object[] { match, sm };
	}

	public static final Object[] pattern_Class1_0_5_blackBB(Match match,
			SourceModel sm) {
		return new Object[] { match, sm };
	}

	public static final void pattern_Class1_0_6_expressionBBB(Class1 _this,
			Match match, SourceModel sm) {
		_this.registerObjectsToMatch_FWD(match, sm);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject tmpSm = _localVariable_0;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			return new Object[] { sm, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_blackBFBB(SourceModel sm,
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_bindingAndBlackFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_1_1_binding = pattern_Class1_1_1_bindingFB(isApplicableMatch);
		if (result_pattern_Class1_1_1_binding != null) {
			SourceModel sm = (SourceModel) result_pattern_Class1_1_1_binding[0];

			Object[] result_pattern_Class1_1_1_black = pattern_Class1_1_1_blackBFBB(
					sm, _this, isApplicableMatch);
			if (result_pattern_Class1_1_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_1_1_black[1];

				return new Object[] { sm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_1_greenBFF(SourceModel sm) {
		TargetModel tm = TargetFactory.eINSTANCE.createTargetModel();
		SM2TM sm2Tm = SourceToTargetCorrFactory.eINSTANCE.createSM2TM();
		sm2Tm.setSource(sm);
		sm2Tm.setTarget(tm);
		return new Object[] { sm, tm, sm2Tm };
	}

	public static final Object[] pattern_Class1_1_2_blackBBB(SourceModel sm,
			TargetModel tm, SM2TM sm2Tm) {
		return new Object[] { sm, tm, sm2Tm };
	}

	public static final Object[] pattern_Class1_1_2_greenFBBB(SourceModel sm,
			TargetModel tm, SM2TM sm2Tm) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(sm);
		ruleresult.getCreatedElements().add(tm);
		ruleresult.getCreatedLinkElements().add(sm2Tm);
		return new Object[] { ruleresult, sm, tm, sm2Tm };
	}

	public static final Object[] pattern_Class1_1_3_blackBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject sm2Tm) {
		if (!sm.equals(tm)) {
			if (!sm.equals(sm2Tm)) {
				if (!sm2Tm.equals(tm)) {
					return new Object[] { ruleresult, sm, tm, sm2Tm };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_1_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject sm2Tm) {
		EMoflonEdge sm2Tm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String sm2Tm__sm____source_name_prime = "source";
		String sm2Tm__tm____target_name_prime = "target";
		sm2Tm__sm____source.setSrc(sm2Tm);
		sm2Tm__sm____source.setTrg(sm);
		ruleresult.getCreatedEdges().add(sm2Tm__sm____source);
		sm2Tm__tm____target.setSrc(sm2Tm);
		sm2Tm__tm____target.setTrg(tm);
		ruleresult.getCreatedEdges().add(sm2Tm__tm____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm2Tm__sm____source.setName(sm2Tm__sm____source_name_prime);
		sm2Tm__tm____target.setName(sm2Tm__tm____target_name_prime);
		return new Object[] { ruleresult, sm, tm, sm2Tm, sm2Tm__sm____source,
				sm2Tm__tm____target };
	}

	public static final void pattern_Class1_1_5_expressionBBBBB(Class1 _this,
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject sm2Tm) {
		_this.registerObjects_FWD(ruleresult, sm, tm, sm2Tm);

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
		EObject _localVariable_0 = match.getObject("sm");
		EObject tmpSm = _localVariable_0;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			return new Object[] { sm, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_2_2_blackBB(
			SourceModel sm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { sm, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_2_3_blackB(
			SourceModel sm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { sm });
		return _result;
	}

	public static final Object[] pattern_Class1_2_3_greenBF(SourceModel sm) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(sm);
		return new Object[] { sm, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_2_4_bindingFBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, SourceModel sm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, sm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm };
		}
		return null;
	}

	public static final Object[] pattern_Class1_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_2_4_bindingAndBlackFBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch, SourceModel sm) {
		Object[] result_pattern_Class1_2_4_binding = pattern_Class1_2_4_bindingFBBB(
				_this, isApplicableMatch, sm);
		if (result_pattern_Class1_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_2_4_binding[0];

			Object[] result_pattern_Class1_2_4_black = pattern_Class1_2_4_blackB(csp);
			if (result_pattern_Class1_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm };
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
			Match match, TargetModel tm) {
		return new Object[] { _this, match, tm };
	}

	public static final Object[] pattern_Class1_10_2_bindingFBBB(Class1 _this,
			Match match, TargetModel tm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tm };
		}
		return null;
	}

	public static final Object[] pattern_Class1_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_10_2_bindingAndBlackFBBB(
			Class1 _this, Match match, TargetModel tm) {
		Object[] result_pattern_Class1_10_2_binding = pattern_Class1_10_2_bindingFBBB(
				_this, match, tm);
		if (result_pattern_Class1_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_10_2_binding[0];

			Object[] result_pattern_Class1_10_2_black = pattern_Class1_10_2_blackB(csp);
			if (result_pattern_Class1_10_2_black != null) {

				return new Object[] { csp, _this, match, tm };
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
			TargetModel tm) {
		return new Object[] { match, tm };
	}

	public static final Object[] pattern_Class1_10_4_greenBB(Match match,
			TargetModel tm) {
		match.getToBeTranslatedNodes().add(tm);
		return new Object[] { match, tm };
	}

	public static final Object[] pattern_Class1_10_5_blackBB(Match match,
			TargetModel tm) {
		return new Object[] { match, tm };
	}

	public static final void pattern_Class1_10_6_expressionBBB(Class1 _this,
			Match match, TargetModel tm) {
		_this.registerObjectsToMatch_BWD(match, tm);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tm");
		EObject tmpTm = _localVariable_0;
		if (tmpTm instanceof TargetModel) {
			TargetModel tm = (TargetModel) tmpTm;
			return new Object[] { tm, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_blackBFBB(TargetModel tm,
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_bindingAndBlackFFBB(
			Class1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Class1_11_1_binding = pattern_Class1_11_1_bindingFB(isApplicableMatch);
		if (result_pattern_Class1_11_1_binding != null) {
			TargetModel tm = (TargetModel) result_pattern_Class1_11_1_binding[0];

			Object[] result_pattern_Class1_11_1_black = pattern_Class1_11_1_blackBFBB(
					tm, _this, isApplicableMatch);
			if (result_pattern_Class1_11_1_black != null) {
				CSP csp = (CSP) result_pattern_Class1_11_1_black[1];

				return new Object[] { tm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_1_greenFBF(TargetModel tm) {
		SourceModel sm = SourceFactory.eINSTANCE.createSourceModel();
		SM2TM sm2Tm = SourceToTargetCorrFactory.eINSTANCE.createSM2TM();
		sm2Tm.setSource(sm);
		sm2Tm.setTarget(tm);
		return new Object[] { sm, tm, sm2Tm };
	}

	public static final Object[] pattern_Class1_11_2_blackBBB(SourceModel sm,
			TargetModel tm, SM2TM sm2Tm) {
		return new Object[] { sm, tm, sm2Tm };
	}

	public static final Object[] pattern_Class1_11_2_greenFBBB(SourceModel sm,
			TargetModel tm, SM2TM sm2Tm) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(sm);
		ruleresult.getTranslatedElements().add(tm);
		ruleresult.getCreatedLinkElements().add(sm2Tm);
		return new Object[] { ruleresult, sm, tm, sm2Tm };
	}

	public static final Object[] pattern_Class1_11_3_blackBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject sm2Tm) {
		if (!sm.equals(tm)) {
			if (!sm.equals(sm2Tm)) {
				if (!sm2Tm.equals(tm)) {
					return new Object[] { ruleresult, sm, tm, sm2Tm };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Class1_11_3_greenBBBBFF(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject sm2Tm) {
		EMoflonEdge sm2Tm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Class1";
		String sm2Tm__sm____source_name_prime = "source";
		String sm2Tm__tm____target_name_prime = "target";
		sm2Tm__sm____source.setSrc(sm2Tm);
		sm2Tm__sm____source.setTrg(sm);
		ruleresult.getCreatedEdges().add(sm2Tm__sm____source);
		sm2Tm__tm____target.setSrc(sm2Tm);
		sm2Tm__tm____target.setTrg(tm);
		ruleresult.getCreatedEdges().add(sm2Tm__tm____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm2Tm__sm____source.setName(sm2Tm__sm____source_name_prime);
		sm2Tm__tm____target.setName(sm2Tm__tm____target_name_prime);
		return new Object[] { ruleresult, sm, tm, sm2Tm, sm2Tm__sm____source,
				sm2Tm__tm____target };
	}

	public static final void pattern_Class1_11_5_expressionBBBBB(Class1 _this,
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject sm2Tm) {
		_this.registerObjects_BWD(ruleresult, sm, tm, sm2Tm);

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
		EObject _localVariable_0 = match.getObject("tm");
		EObject tmpTm = _localVariable_0;
		if (tmpTm instanceof TargetModel) {
			TargetModel tm = (TargetModel) tmpTm;
			return new Object[] { tm, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Class1_12_2_blackBB(
			TargetModel tm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tm, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Class1_12_3_blackB(
			TargetModel tm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tm });
		return _result;
	}

	public static final Object[] pattern_Class1_12_3_greenBF(TargetModel tm) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(tm);
		return new Object[] { tm, isApplicableMatch };
	}

	public static final Object[] pattern_Class1_12_4_bindingFBBB(Class1 _this,
			IsApplicableMatch isApplicableMatch, TargetModel tm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, tm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tm };
		}
		return null;
	}

	public static final Object[] pattern_Class1_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Class1_12_4_bindingAndBlackFBBB(
			Class1 _this, IsApplicableMatch isApplicableMatch, TargetModel tm) {
		Object[] result_pattern_Class1_12_4_binding = pattern_Class1_12_4_bindingFBBB(
				_this, isApplicableMatch, tm);
		if (result_pattern_Class1_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_Class1_12_4_binding[0];

			Object[] result_pattern_Class1_12_4_black = pattern_Class1_12_4_blackB(csp);
			if (result_pattern_Class1_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tm };
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
			SourceModel sm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { sm });
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
			Class1 _this, Match match, SourceModel sm) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, sm);
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
			TargetModel tm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tm });
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
			Class1 _this, Match match, TargetModel tm) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tm);
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
		SourceModel sm = SourceFactory.eINSTANCE.createSourceModel();
		TargetModel tm = TargetFactory.eINSTANCE.createTargetModel();
		SM2TM sm2Tm = SourceToTargetCorrFactory.eINSTANCE.createSM2TM();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(sm);
		ruleResult.getTargetObjects().add(tm);
		sm2Tm.setSource(sm);
		sm2Tm.setTarget(tm);
		ruleResult.getCorrObjects().add(sm2Tm);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { sm, tm, sm2Tm, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Class1_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Class1Impl
