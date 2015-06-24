/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.Element;
import Source.SourceFactory;
import Source.SourceModel;

import SourceToTargetCorr.E2S;

import SourceToTargetCorr.Rules.E2SRule;
import SourceToTargetCorr.Rules.RulesPackage;

import SourceToTargetCorr.SM2TM;
import SourceToTargetCorr.SourceToTargetCorrFactory;

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

import Target.Special;
import Target.Step;
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
 * An implementation of the model object '<em><b>E2S Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class E2SRuleImpl extends AbstractRuleImpl implements E2SRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected E2SRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.E2S_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SourceModel sm, Element e) {
		// initial bindings
		Object[] result1_black = E2SRuleImpl.pattern_E2SRule_0_1_blackBBBB(
				this, match, sm, e);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ", " + "[e] = " + e + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_0_2_bindingAndBlackFBBBB(this, match, sm, e);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ", " + "[e] = " + e + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (E2SRuleImpl.pattern_E2SRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = E2SRuleImpl.pattern_E2SRule_0_4_blackBBB(
					match, sm, e);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ", " + "[e] = " + e + ".");
			}
			E2SRuleImpl.pattern_E2SRule_0_4_greenBBBF(match, sm, e);
			// EMoflonEdge sm__e____elements = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = E2SRuleImpl.pattern_E2SRule_0_5_blackBBB(
					match, sm, e);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ", " + "[e] = " + e + ".");
			}
			E2SRuleImpl.pattern_E2SRule_0_5_greenBB(match, sm);

			// register objects to match
			E2SRuleImpl.pattern_E2SRule_0_6_expressionBBBB(this, match, sm, e);
			return E2SRuleImpl.pattern_E2SRule_0_7_expressionF();
		} else {
			return E2SRuleImpl.pattern_E2SRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_1_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SourceModel sm = (SourceModel) result1_bindingAndBlack[0];
		TargetModel tm = (TargetModel) result1_bindingAndBlack[1];
		SM2TM sm2Tm = (SM2TM) result1_bindingAndBlack[2];
		Element e = (Element) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = E2SRuleImpl.pattern_E2SRule_1_1_greenBBFFB(tm,
				e, csp);
		Step s = (Step) result1_green[2];
		E2S e2S = (E2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = E2SRuleImpl.pattern_E2SRule_1_2_blackBBB(e, s,
				e2S);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[e] = " + e + ", " + "[s] = "
							+ s + ", " + "[e2S] = " + e2S + ".");
		}
		Object[] result2_green = E2SRuleImpl.pattern_E2SRule_1_2_greenFBBB(e,
				s, e2S);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = E2SRuleImpl.pattern_E2SRule_1_3_blackBBBBBBB(
				ruleresult, sm, tm, sm2Tm, e, s, e2S);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
							+ ", " + "[sm2Tm] = " + sm2Tm + ", " + "[e] = " + e
							+ ", " + "[s] = " + s + ", " + "[e2S] = " + e2S
							+ ".");
		}
		E2SRuleImpl.pattern_E2SRule_1_3_greenBBBBBBFFFF(ruleresult, sm, tm, e,
				s, e2S);
		// EMoflonEdge sm__e____elements = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tm__s____steps = (EMoflonEdge) result3_green[7];
		// EMoflonEdge e2S__e____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge e2S__s____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		E2SRuleImpl.pattern_E2SRule_1_5_expressionBBBBBBBB(this, ruleresult,
				sm, tm, sm2Tm, e, s, e2S);
		return E2SRuleImpl.pattern_E2SRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = E2SRuleImpl
				.pattern_E2SRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = E2SRuleImpl
				.pattern_E2SRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SourceModel sm = (SourceModel) result2_binding[0];
		Element e = (Element) result2_binding[1];
		for (Object[] result2_black : E2SRuleImpl
				.pattern_E2SRule_2_2_blackBFFBB(sm, e, match)) {
			TargetModel tm = (TargetModel) result2_black[1];
			SM2TM sm2Tm = (SM2TM) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : E2SRuleImpl
					.pattern_E2SRule_2_3_blackBBBB(sm, tm, sm2Tm, e)) {
				Object[] result3_green = E2SRuleImpl
						.pattern_E2SRule_2_3_greenBBBBFFFF(sm, tm, sm2Tm, e);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge sm__e____elements = (EMoflonEdge) result3_green[5];
				// EMoflonEdge sm2Tm__sm____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge sm2Tm__tm____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = E2SRuleImpl
						.pattern_E2SRule_2_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, sm, tm, sm2Tm, e);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[sm] = " + sm
									+ ", " + "[tm] = " + tm + ", "
									+ "[sm2Tm] = " + sm2Tm + ", " + "[e] = "
									+ e + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (E2SRuleImpl.pattern_E2SRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = E2SRuleImpl
							.pattern_E2SRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					E2SRuleImpl.pattern_E2SRule_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return E2SRuleImpl.pattern_E2SRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SourceModel sm,
			Element e) {
		match.registerObject("sm", sm);
		match.registerObject("e", e);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SourceModel sm, Element e) {// Create CSP
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
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Element e) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_e_id = CSPFactoryHelper.eINSTANCE.createVariable("e.id",
				true, csp);
		var_e_id.setValue(e.getId());
		var_e_id.setType("String");

		// Create unbound variables
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id",
				csp);
		var_s_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_e_id, var_s_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("sm2Tm", sm2Tm);
		isApplicableMatch.registerObject("e", e);
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
			EObject tm, EObject sm2Tm, EObject e, EObject s, EObject e2S) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("sm2Tm", sm2Tm);
		ruleresult.registerObject("e", e);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("e2S", e2S);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("e").eClass()
				.equals(Source.SourcePackage.eINSTANCE.getElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TargetModel tm, Step s) {
		// initial bindings
		Object[] result1_black = E2SRuleImpl.pattern_E2SRule_10_1_blackBBBB(
				this, match, tm, s);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tm] = " + tm
							+ ", " + "[s] = " + s + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_10_2_bindingAndBlackFBBBB(this, match, tm, s);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tm] = " + tm
							+ ", " + "[s] = " + s + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (E2SRuleImpl.pattern_E2SRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = E2SRuleImpl.pattern_E2SRule_10_4_blackBBB(
					match, tm, s);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[tm] = " + tm + ", " + "[s] = " + s + ".");
			}
			E2SRuleImpl.pattern_E2SRule_10_4_greenBBBF(match, tm, s);
			// EMoflonEdge tm__s____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = E2SRuleImpl.pattern_E2SRule_10_5_blackBBB(
					match, tm, s);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[tm] = " + tm + ", " + "[s] = " + s + ".");
			}
			E2SRuleImpl.pattern_E2SRule_10_5_greenBB(match, tm);

			// register objects to match
			E2SRuleImpl.pattern_E2SRule_10_6_expressionBBBB(this, match, tm, s);
			return E2SRuleImpl.pattern_E2SRule_10_7_expressionF();
		} else {
			return E2SRuleImpl.pattern_E2SRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_11_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SourceModel sm = (SourceModel) result1_bindingAndBlack[0];
		TargetModel tm = (TargetModel) result1_bindingAndBlack[1];
		SM2TM sm2Tm = (SM2TM) result1_bindingAndBlack[2];
		Step s = (Step) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = E2SRuleImpl.pattern_E2SRule_11_1_greenBFBFB(
				sm, s, csp);
		Element e = (Element) result1_green[1];
		E2S e2S = (E2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = E2SRuleImpl.pattern_E2SRule_11_2_blackBBB(e,
				s, e2S);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[e] = " + e + ", " + "[s] = "
							+ s + ", " + "[e2S] = " + e2S + ".");
		}
		Object[] result2_green = E2SRuleImpl.pattern_E2SRule_11_2_greenFBBB(e,
				s, e2S);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = E2SRuleImpl.pattern_E2SRule_11_3_blackBBBBBBB(
				ruleresult, sm, tm, sm2Tm, e, s, e2S);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
							+ ", " + "[sm2Tm] = " + sm2Tm + ", " + "[e] = " + e
							+ ", " + "[s] = " + s + ", " + "[e2S] = " + e2S
							+ ".");
		}
		E2SRuleImpl.pattern_E2SRule_11_3_greenBBBBBBFFFF(ruleresult, sm, tm, e,
				s, e2S);
		// EMoflonEdge sm__e____elements = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tm__s____steps = (EMoflonEdge) result3_green[7];
		// EMoflonEdge e2S__e____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge e2S__s____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		E2SRuleImpl.pattern_E2SRule_11_5_expressionBBBBBBBB(this, ruleresult,
				sm, tm, sm2Tm, e, s, e2S);
		return E2SRuleImpl.pattern_E2SRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = E2SRuleImpl
				.pattern_E2SRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = E2SRuleImpl
				.pattern_E2SRule_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		TargetModel tm = (TargetModel) result2_binding[0];
		Step s = (Step) result2_binding[1];
		for (Object[] result2_black : E2SRuleImpl
				.pattern_E2SRule_12_2_blackFBFBB(tm, s, match)) {
			SourceModel sm = (SourceModel) result2_black[0];
			SM2TM sm2Tm = (SM2TM) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : E2SRuleImpl
					.pattern_E2SRule_12_3_blackBBBB(sm, tm, sm2Tm, s)) {
				Object[] result3_green = E2SRuleImpl
						.pattern_E2SRule_12_3_greenBBBBFFFF(sm, tm, sm2Tm, s);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge tm__s____steps = (EMoflonEdge) result3_green[5];
				// EMoflonEdge sm2Tm__sm____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge sm2Tm__tm____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = E2SRuleImpl
						.pattern_E2SRule_12_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, sm, tm, sm2Tm, s);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[sm] = " + sm
									+ ", " + "[tm] = " + tm + ", "
									+ "[sm2Tm] = " + sm2Tm + ", " + "[s] = "
									+ s + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (E2SRuleImpl.pattern_E2SRule_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = E2SRuleImpl
							.pattern_E2SRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					E2SRuleImpl.pattern_E2SRule_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return E2SRuleImpl.pattern_E2SRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TargetModel tm, Step s) {
		match.registerObject("tm", tm);
		match.registerObject("s", s);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TargetModel tm, Step s) {// Create CSP
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
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Step s) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id",
				true, csp);
		var_s_id.setValue(s.getId());
		var_s_id.setType("String");

		// Create unbound variables
		Variable var_e_id = CSPFactoryHelper.eINSTANCE.createVariable("e.id",
				csp);
		var_e_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_e_id, var_s_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("sm2Tm", sm2Tm);
		isApplicableMatch.registerObject("s", s);
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
			EObject tm, EObject sm2Tm, EObject e, EObject s, EObject e2S) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("sm2Tm", sm2Tm);
		ruleresult.registerObject("e", e);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("e2S", e2S);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("s").eClass()
				.equals(Target.TargetPackage.eINSTANCE.getStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(
			EMoflonEdge _edge_elements) {
		// prepare return value
		Object[] result1_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = E2SRuleImpl.pattern_E2SRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : E2SRuleImpl
				.pattern_E2SRule_20_2_blackFFB(_edge_elements)) {
			SourceModel sm = (SourceModel) result2_black[0];
			Element e = (Element) result2_black[1];
			Object[] result2_green = E2SRuleImpl
					.pattern_E2SRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (E2SRuleImpl.pattern_E2SRule_20_3_expressionFBBBB(this, match,
					sm, e)) {
				// Ensure that the correct types of elements are matched
				if (E2SRuleImpl.pattern_E2SRule_20_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = E2SRuleImpl
							.pattern_E2SRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					E2SRuleImpl.pattern_E2SRule_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return E2SRuleImpl.pattern_E2SRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = E2SRuleImpl
				.pattern_E2SRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = E2SRuleImpl.pattern_E2SRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : E2SRuleImpl
				.pattern_E2SRule_21_2_blackFFB(_edge_steps)) {
			TargetModel tm = (TargetModel) result2_black[0];
			Step s = (Step) result2_black[1];
			Object[] result2_green = E2SRuleImpl
					.pattern_E2SRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (E2SRuleImpl.pattern_E2SRule_21_3_expressionFBBBB(this, match,
					tm, s)) {
				// Ensure that the correct types of elements are matched
				if (E2SRuleImpl.pattern_E2SRule_21_4_expressionFBB(this, match)) {

					// Add match to rule result
					Object[] result5_black = E2SRuleImpl
							.pattern_E2SRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					E2SRuleImpl.pattern_E2SRule_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return E2SRuleImpl.pattern_E2SRule_21_6_expressionFB(__result);
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
			RuleEntryContainer ruleEntryContainer, SM2TM sm2TmParameter) {
		// create result
		Object[] result1_black = E2SRuleImpl.pattern_E2SRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = E2SRuleImpl.pattern_E2SRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : E2SRuleImpl
				.pattern_E2SRule_24_2_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList sm2TmList = (RuleEntryList) result2_black[0];
			SourceModel sm = (SourceModel) result2_black[1];
			SM2TM sm2Tm = (SM2TM) result2_black[2];
			TargetModel tm = (TargetModel) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = E2SRuleImpl
					.pattern_E2SRule_24_3_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, sm, tm, sm2Tm, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = " + this + ", "
								+ "[isApplicableMatch] = " + isApplicableMatch
								+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
								+ ", " + "[sm2Tm] = " + sm2Tm + ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (E2SRuleImpl.pattern_E2SRule_24_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = E2SRuleImpl
						.pattern_E2SRule_24_5_blackBBB(sm, tm, sm2Tm);
				if (result5_black != null) {

					// perform
					Object[] result6_black = E2SRuleImpl
							.pattern_E2SRule_24_6_blackBBBB(sm, tm, sm2Tm,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[sm] = " + sm
										+ ", " + "[tm] = " + tm + ", "
										+ "[sm2Tm] = " + sm2Tm + ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					E2SRuleImpl.pattern_E2SRule_24_6_greenBBFFFBB(sm, tm,
							ruleResult, csp);
					// Element e = (Element) result6_green[2];
					// Step s = (Step) result6_green[3];
					// E2S e2S = (E2S) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return E2SRuleImpl.pattern_E2SRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM sm2Tm,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_e_id = CSPFactoryHelper.eINSTANCE.createVariable("e.id",
				csp);
		var_e_id.setType("String");
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id",
				csp);
		var_s_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_e_id, var_s_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("sm2Tm", sm2Tm);
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
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2));
		case RulesPackage.E2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.E2S_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.E2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2));
			return null;
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2));
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.E2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_ELEMENT:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1),
					(TargetModel) arguments.get(2), (SM2TM) arguments.get(3),
					(Element) arguments.get(4));
		case RulesPackage.E2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.E2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.E2S_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1), (Step) arguments.get(2));
		case RulesPackage.E2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.E2S_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.E2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1), (Step) arguments.get(2));
			return null;
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1), (Step) arguments.get(2));
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.E2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1),
					(TargetModel) arguments.get(2), (SM2TM) arguments.get(3),
					(Step) arguments.get(4));
		case RulesPackage.E2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.E2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.E2S_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.E2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.E2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.E2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.E2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SM2TM) arguments.get(1));
		case RulesPackage.E2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1),
					(TargetModel) arguments.get(2), (SM2TM) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.E2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_E2SRule_0_1_blackBBBB(E2SRule _this,
			Match match, SourceModel sm, Element e) {
		return new Object[] { _this, match, sm, e };
	}

	public static final Object[] pattern_E2SRule_0_2_bindingFBBBB(
			E2SRule _this, Match match, SourceModel sm, Element e) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, sm, e);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sm, e };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_E2SRule_0_2_bindingAndBlackFBBBB(
			E2SRule _this, Match match, SourceModel sm, Element e) {
		Object[] result_pattern_E2SRule_0_2_binding = pattern_E2SRule_0_2_bindingFBBBB(
				_this, match, sm, e);
		if (result_pattern_E2SRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_E2SRule_0_2_binding[0];

			Object[] result_pattern_E2SRule_0_2_black = pattern_E2SRule_0_2_blackB(csp);
			if (result_pattern_E2SRule_0_2_black != null) {

				return new Object[] { csp, _this, match, sm, e };
			}
		}
		return null;
	}

	public static final boolean pattern_E2SRule_0_3_expressionFBB(
			E2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_E2SRule_0_4_blackBBB(Match match,
			SourceModel sm, Element e) {
		return new Object[] { match, sm, e };
	}

	public static final Object[] pattern_E2SRule_0_4_greenBBBF(Match match,
			SourceModel sm, Element e) {
		EMoflonEdge sm__e____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(e);
		String sm__e____elements_name_prime = "elements";
		sm__e____elements.setSrc(sm);
		sm__e____elements.setTrg(e);
		match.getToBeTranslatedEdges().add(sm__e____elements);
		sm__e____elements.setName(sm__e____elements_name_prime);
		return new Object[] { match, sm, e, sm__e____elements };
	}

	public static final Object[] pattern_E2SRule_0_5_blackBBB(Match match,
			SourceModel sm, Element e) {
		return new Object[] { match, sm, e };
	}

	public static final Object[] pattern_E2SRule_0_5_greenBB(Match match,
			SourceModel sm) {
		match.getContextNodes().add(sm);
		return new Object[] { match, sm };
	}

	public static final void pattern_E2SRule_0_6_expressionBBBB(E2SRule _this,
			Match match, SourceModel sm, Element e) {
		_this.registerObjectsToMatch_FWD(match, sm, e);

	}

	public static final boolean pattern_E2SRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_E2SRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_E2SRule_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject _localVariable_1 = isApplicableMatch.getObject("tm");
		EObject _localVariable_2 = isApplicableMatch.getObject("sm2Tm");
		EObject _localVariable_3 = isApplicableMatch.getObject("e");
		EObject tmpSm = _localVariable_0;
		EObject tmpTm = _localVariable_1;
		EObject tmpSm2Tm = _localVariable_2;
		EObject tmpE = _localVariable_3;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpTm instanceof TargetModel) {
				TargetModel tm = (TargetModel) tmpTm;
				if (tmpSm2Tm instanceof SM2TM) {
					SM2TM sm2Tm = (SM2TM) tmpSm2Tm;
					if (tmpE instanceof Element) {
						Element e = (Element) tmpE;
						return new Object[] { sm, tm, sm2Tm, e,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_1_1_blackBBBBFBB(
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Element e,
			E2SRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sm, tm, sm2Tm, e, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_1_1_bindingAndBlackFFFFFBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_E2SRule_1_1_binding = pattern_E2SRule_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_E2SRule_1_1_binding != null) {
			SourceModel sm = (SourceModel) result_pattern_E2SRule_1_1_binding[0];
			TargetModel tm = (TargetModel) result_pattern_E2SRule_1_1_binding[1];
			SM2TM sm2Tm = (SM2TM) result_pattern_E2SRule_1_1_binding[2];
			Element e = (Element) result_pattern_E2SRule_1_1_binding[3];

			Object[] result_pattern_E2SRule_1_1_black = pattern_E2SRule_1_1_blackBBBBFBB(
					sm, tm, sm2Tm, e, _this, isApplicableMatch);
			if (result_pattern_E2SRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_E2SRule_1_1_black[4];

				return new Object[] { sm, tm, sm2Tm, e, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_1_1_greenBBFFB(TargetModel tm,
			Element e, CSP csp) {
		Step s = TargetFactory.eINSTANCE.createStep();
		E2S e2S = SourceToTargetCorrFactory.eINSTANCE.createE2S();
		Object _localVariable_0 = csp.getValue("s", "id");
		tm.getSteps().add(s);
		e2S.setSource(e);
		e2S.setTarget(s);
		String s_id_prime = (String) _localVariable_0;
		s.setId(s_id_prime);
		return new Object[] { tm, e, s, e2S, csp };
	}

	public static final Object[] pattern_E2SRule_1_2_blackBBB(Element e,
			Step s, E2S e2S) {
		return new Object[] { e, s, e2S };
	}

	public static final Object[] pattern_E2SRule_1_2_greenFBBB(Element e,
			Step s, E2S e2S) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(e);
		ruleresult.getCreatedElements().add(s);
		ruleresult.getCreatedLinkElements().add(e2S);
		return new Object[] { ruleresult, e, s, e2S };
	}

	public static final Object[] pattern_E2SRule_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject tm,
			EObject sm2Tm, EObject e, EObject s, EObject e2S) {
		if (!sm.equals(tm)) {
			if (!sm.equals(sm2Tm)) {
				if (!sm2Tm.equals(tm)) {
					if (!e.equals(sm)) {
						if (!e.equals(tm)) {
							if (!e.equals(sm2Tm)) {
								if (!e.equals(s)) {
									if (!e.equals(e2S)) {
										if (!s.equals(sm)) {
											if (!s.equals(tm)) {
												if (!s.equals(sm2Tm)) {
													if (!e2S.equals(sm)) {
														if (!e2S.equals(tm)) {
															if (!e2S.equals(sm2Tm)) {
																if (!e2S.equals(s)) {
																	return new Object[] {
																			ruleresult,
																			sm,
																			tm,
																			sm2Tm,
																			e,
																			s,
																			e2S };
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

	public static final Object[] pattern_E2SRule_1_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject e,
			EObject s, EObject e2S) {
		EMoflonEdge sm__e____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__e____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__s____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "E2SRule";
		String sm__e____elements_name_prime = "elements";
		String tm__s____steps_name_prime = "steps";
		String e2S__e____source_name_prime = "source";
		String e2S__s____target_name_prime = "target";
		sm__e____elements.setSrc(sm);
		sm__e____elements.setTrg(e);
		ruleresult.getTranslatedEdges().add(sm__e____elements);
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		ruleresult.getCreatedEdges().add(tm__s____steps);
		e2S__e____source.setSrc(e2S);
		e2S__e____source.setTrg(e);
		ruleresult.getCreatedEdges().add(e2S__e____source);
		e2S__s____target.setSrc(e2S);
		e2S__s____target.setTrg(s);
		ruleresult.getCreatedEdges().add(e2S__s____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm__e____elements.setName(sm__e____elements_name_prime);
		tm__s____steps.setName(tm__s____steps_name_prime);
		e2S__e____source.setName(e2S__e____source_name_prime);
		e2S__s____target.setName(e2S__s____target_name_prime);
		return new Object[] { ruleresult, sm, tm, e, s, e2S, sm__e____elements,
				tm__s____steps, e2S__e____source, e2S__s____target };
	}

	public static final void pattern_E2SRule_1_5_expressionBBBBBBBB(
			E2SRule _this, PerformRuleResult ruleresult, EObject sm,
			EObject tm, EObject sm2Tm, EObject e, EObject s, EObject e2S) {
		_this.registerObjects_FWD(ruleresult, sm, tm, sm2Tm, e, s, e2S);

	}

	public static final PerformRuleResult pattern_E2SRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_E2SRule_2_1_bindingFB(E2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_2_1_blackFBB(EClass eClass,
			E2SRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_E2SRule_2_1_bindingAndBlackFFB(
			E2SRule _this) {
		Object[] result_pattern_E2SRule_2_1_binding = pattern_E2SRule_2_1_bindingFB(_this);
		if (result_pattern_E2SRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_E2SRule_2_1_binding[0];

			Object[] result_pattern_E2SRule_2_1_black = pattern_E2SRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_E2SRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_E2SRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "E2SRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_E2SRule_2_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("sm");
		EObject _localVariable_1 = match.getObject("e");
		EObject tmpSm = _localVariable_0;
		EObject tmpE = _localVariable_1;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpE instanceof Element) {
				Element e = (Element) tmpE;
				return new Object[] { sm, e, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_E2SRule_2_2_blackBFFBB(
			SourceModel sm, Element e, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2TM sm2Tm : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sm, SM2TM.class, "source")) {
			TargetModel tm = sm2Tm.getTarget();
			if (tm != null) {
				_result.add(new Object[] { sm, tm, sm2Tm, e, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_E2SRule_2_3_blackBBBB(
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Element e) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sm.getElements().contains(e)) {
			if (sm.equals(sm2Tm.getSource())) {
				if (tm.equals(sm2Tm.getTarget())) {
					_result.add(new Object[] { sm, tm, sm2Tm, e });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_E2SRule_2_3_greenBBBBFFFF(
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Element e) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge sm__e____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String sm__e____elements_name_prime = "elements";
		String sm2Tm__sm____source_name_prime = "source";
		String sm2Tm__tm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(sm2Tm);
		isApplicableMatch.getAllContextElements().add(e);
		sm__e____elements.setSrc(sm);
		sm__e____elements.setTrg(e);
		isApplicableMatch.getAllContextElements().add(sm__e____elements);
		sm2Tm__sm____source.setSrc(sm2Tm);
		sm2Tm__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2Tm__sm____source);
		sm2Tm__tm____target.setSrc(sm2Tm);
		sm2Tm__tm____target.setTrg(tm);
		isApplicableMatch.getAllContextElements().add(sm2Tm__tm____target);
		sm__e____elements.setName(sm__e____elements_name_prime);
		sm2Tm__sm____source.setName(sm2Tm__sm____source_name_prime);
		sm2Tm__tm____target.setName(sm2Tm__tm____target_name_prime);
		return new Object[] { sm, tm, sm2Tm, e, isApplicableMatch,
				sm__e____elements, sm2Tm__sm____source, sm2Tm__tm____target };
	}

	public static final Object[] pattern_E2SRule_2_4_bindingFBBBBBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch, SourceModel sm,
			TargetModel tm, SM2TM sm2Tm, Element e) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, sm, tm, sm2Tm, e);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, tm, sm2Tm,
					e };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_E2SRule_2_4_bindingAndBlackFBBBBBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch, SourceModel sm,
			TargetModel tm, SM2TM sm2Tm, Element e) {
		Object[] result_pattern_E2SRule_2_4_binding = pattern_E2SRule_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, sm, tm, sm2Tm, e);
		if (result_pattern_E2SRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_E2SRule_2_4_binding[0];

			Object[] result_pattern_E2SRule_2_4_black = pattern_E2SRule_2_4_blackB(csp);
			if (result_pattern_E2SRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, tm,
						sm2Tm, e };
			}
		}
		return null;
	}

	public static final boolean pattern_E2SRule_2_5_expressionFBB(
			E2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_E2SRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_E2SRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "E2SRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_E2SRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_E2SRule_10_1_blackBBBB(E2SRule _this,
			Match match, TargetModel tm, Step s) {
		return new Object[] { _this, match, tm, s };
	}

	public static final Object[] pattern_E2SRule_10_2_bindingFBBBB(
			E2SRule _this, Match match, TargetModel tm, Step s) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tm, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tm, s };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_E2SRule_10_2_bindingAndBlackFBBBB(
			E2SRule _this, Match match, TargetModel tm, Step s) {
		Object[] result_pattern_E2SRule_10_2_binding = pattern_E2SRule_10_2_bindingFBBBB(
				_this, match, tm, s);
		if (result_pattern_E2SRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_E2SRule_10_2_binding[0];

			Object[] result_pattern_E2SRule_10_2_black = pattern_E2SRule_10_2_blackB(csp);
			if (result_pattern_E2SRule_10_2_black != null) {

				return new Object[] { csp, _this, match, tm, s };
			}
		}
		return null;
	}

	public static final boolean pattern_E2SRule_10_3_expressionFBB(
			E2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_E2SRule_10_4_blackBBB(Match match,
			TargetModel tm, Step s) {
		return new Object[] { match, tm, s };
	}

	public static final Object[] pattern_E2SRule_10_4_greenBBBF(Match match,
			TargetModel tm, Step s) {
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(s);
		String tm__s____steps_name_prime = "steps";
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		match.getToBeTranslatedEdges().add(tm__s____steps);
		tm__s____steps.setName(tm__s____steps_name_prime);
		return new Object[] { match, tm, s, tm__s____steps };
	}

	public static final Object[] pattern_E2SRule_10_5_blackBBB(Match match,
			TargetModel tm, Step s) {
		return new Object[] { match, tm, s };
	}

	public static final Object[] pattern_E2SRule_10_5_greenBB(Match match,
			TargetModel tm) {
		match.getContextNodes().add(tm);
		return new Object[] { match, tm };
	}

	public static final void pattern_E2SRule_10_6_expressionBBBB(E2SRule _this,
			Match match, TargetModel tm, Step s) {
		_this.registerObjectsToMatch_BWD(match, tm, s);

	}

	public static final boolean pattern_E2SRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_E2SRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_E2SRule_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject _localVariable_1 = isApplicableMatch.getObject("tm");
		EObject _localVariable_2 = isApplicableMatch.getObject("sm2Tm");
		EObject _localVariable_3 = isApplicableMatch.getObject("s");
		EObject tmpSm = _localVariable_0;
		EObject tmpTm = _localVariable_1;
		EObject tmpSm2Tm = _localVariable_2;
		EObject tmpS = _localVariable_3;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpTm instanceof TargetModel) {
				TargetModel tm = (TargetModel) tmpTm;
				if (tmpSm2Tm instanceof SM2TM) {
					SM2TM sm2Tm = (SM2TM) tmpSm2Tm;
					if (tmpS instanceof Step) {
						Step s = (Step) tmpS;
						return new Object[] { sm, tm, sm2Tm, s,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_11_1_blackBBBBFBB(
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Step s, E2SRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sm, tm, sm2Tm, s, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_11_1_bindingAndBlackFFFFFBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_E2SRule_11_1_binding = pattern_E2SRule_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_E2SRule_11_1_binding != null) {
			SourceModel sm = (SourceModel) result_pattern_E2SRule_11_1_binding[0];
			TargetModel tm = (TargetModel) result_pattern_E2SRule_11_1_binding[1];
			SM2TM sm2Tm = (SM2TM) result_pattern_E2SRule_11_1_binding[2];
			Step s = (Step) result_pattern_E2SRule_11_1_binding[3];

			Object[] result_pattern_E2SRule_11_1_black = pattern_E2SRule_11_1_blackBBBBFBB(
					sm, tm, sm2Tm, s, _this, isApplicableMatch);
			if (result_pattern_E2SRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_E2SRule_11_1_black[4];

				return new Object[] { sm, tm, sm2Tm, s, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_11_1_greenBFBFB(
			SourceModel sm, Step s, CSP csp) {
		Element e = SourceFactory.eINSTANCE.createElement();
		E2S e2S = SourceToTargetCorrFactory.eINSTANCE.createE2S();
		Object _localVariable_0 = csp.getValue("e", "id");
		sm.getElements().add(e);
		e2S.setSource(e);
		e2S.setTarget(s);
		String e_id_prime = (String) _localVariable_0;
		e.setId(e_id_prime);
		return new Object[] { sm, e, s, e2S, csp };
	}

	public static final Object[] pattern_E2SRule_11_2_blackBBB(Element e,
			Step s, E2S e2S) {
		return new Object[] { e, s, e2S };
	}

	public static final Object[] pattern_E2SRule_11_2_greenFBBB(Element e,
			Step s, E2S e2S) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(e);
		ruleresult.getTranslatedElements().add(s);
		ruleresult.getCreatedLinkElements().add(e2S);
		return new Object[] { ruleresult, e, s, e2S };
	}

	public static final Object[] pattern_E2SRule_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject tm,
			EObject sm2Tm, EObject e, EObject s, EObject e2S) {
		if (!sm.equals(tm)) {
			if (!sm.equals(sm2Tm)) {
				if (!sm2Tm.equals(tm)) {
					if (!e.equals(sm)) {
						if (!e.equals(tm)) {
							if (!e.equals(sm2Tm)) {
								if (!e.equals(s)) {
									if (!e.equals(e2S)) {
										if (!s.equals(sm)) {
											if (!s.equals(tm)) {
												if (!s.equals(sm2Tm)) {
													if (!e2S.equals(sm)) {
														if (!e2S.equals(tm)) {
															if (!e2S.equals(sm2Tm)) {
																if (!e2S.equals(s)) {
																	return new Object[] {
																			ruleresult,
																			sm,
																			tm,
																			sm2Tm,
																			e,
																			s,
																			e2S };
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

	public static final Object[] pattern_E2SRule_11_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject e,
			EObject s, EObject e2S) {
		EMoflonEdge sm__e____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__e____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__s____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "E2SRule";
		String sm__e____elements_name_prime = "elements";
		String tm__s____steps_name_prime = "steps";
		String e2S__e____source_name_prime = "source";
		String e2S__s____target_name_prime = "target";
		sm__e____elements.setSrc(sm);
		sm__e____elements.setTrg(e);
		ruleresult.getCreatedEdges().add(sm__e____elements);
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		ruleresult.getTranslatedEdges().add(tm__s____steps);
		e2S__e____source.setSrc(e2S);
		e2S__e____source.setTrg(e);
		ruleresult.getCreatedEdges().add(e2S__e____source);
		e2S__s____target.setSrc(e2S);
		e2S__s____target.setTrg(s);
		ruleresult.getCreatedEdges().add(e2S__s____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm__e____elements.setName(sm__e____elements_name_prime);
		tm__s____steps.setName(tm__s____steps_name_prime);
		e2S__e____source.setName(e2S__e____source_name_prime);
		e2S__s____target.setName(e2S__s____target_name_prime);
		return new Object[] { ruleresult, sm, tm, e, s, e2S, sm__e____elements,
				tm__s____steps, e2S__e____source, e2S__s____target };
	}

	public static final void pattern_E2SRule_11_5_expressionBBBBBBBB(
			E2SRule _this, PerformRuleResult ruleresult, EObject sm,
			EObject tm, EObject sm2Tm, EObject e, EObject s, EObject e2S) {
		_this.registerObjects_BWD(ruleresult, sm, tm, sm2Tm, e, s, e2S);

	}

	public static final PerformRuleResult pattern_E2SRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_E2SRule_12_1_bindingFB(E2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_12_1_blackFBB(EClass eClass,
			E2SRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_E2SRule_12_1_bindingAndBlackFFB(
			E2SRule _this) {
		Object[] result_pattern_E2SRule_12_1_binding = pattern_E2SRule_12_1_bindingFB(_this);
		if (result_pattern_E2SRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_E2SRule_12_1_binding[0];

			Object[] result_pattern_E2SRule_12_1_black = pattern_E2SRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_E2SRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_E2SRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "E2SRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_E2SRule_12_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tm");
		EObject _localVariable_1 = match.getObject("s");
		EObject tmpTm = _localVariable_0;
		EObject tmpS = _localVariable_1;
		if (tmpTm instanceof TargetModel) {
			TargetModel tm = (TargetModel) tmpTm;
			if (tmpS instanceof Step) {
				Step s = (Step) tmpS;
				return new Object[] { tm, s, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_E2SRule_12_2_blackFBFBB(
			TargetModel tm, Step s, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2TM sm2Tm : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tm, SM2TM.class, "target")) {
			SourceModel sm = sm2Tm.getSource();
			if (sm != null) {
				_result.add(new Object[] { sm, tm, sm2Tm, s, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_E2SRule_12_3_blackBBBB(
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Step s) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tm.getSteps().contains(s)) {
			if (sm.equals(sm2Tm.getSource())) {
				if (tm.equals(sm2Tm.getTarget())) {
					_result.add(new Object[] { sm, tm, sm2Tm, s });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_E2SRule_12_3_greenBBBBFFFF(
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, Step s) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tm__s____steps_name_prime = "steps";
		String sm2Tm__sm____source_name_prime = "source";
		String sm2Tm__tm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(sm2Tm);
		isApplicableMatch.getAllContextElements().add(s);
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		isApplicableMatch.getAllContextElements().add(tm__s____steps);
		sm2Tm__sm____source.setSrc(sm2Tm);
		sm2Tm__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2Tm__sm____source);
		sm2Tm__tm____target.setSrc(sm2Tm);
		sm2Tm__tm____target.setTrg(tm);
		isApplicableMatch.getAllContextElements().add(sm2Tm__tm____target);
		tm__s____steps.setName(tm__s____steps_name_prime);
		sm2Tm__sm____source.setName(sm2Tm__sm____source_name_prime);
		sm2Tm__tm____target.setName(sm2Tm__tm____target_name_prime);
		return new Object[] { sm, tm, sm2Tm, s, isApplicableMatch,
				tm__s____steps, sm2Tm__sm____source, sm2Tm__tm____target };
	}

	public static final Object[] pattern_E2SRule_12_4_bindingFBBBBBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch, SourceModel sm,
			TargetModel tm, SM2TM sm2Tm, Step s) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, sm, tm, sm2Tm, s);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, tm, sm2Tm,
					s };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_E2SRule_12_4_bindingAndBlackFBBBBBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch, SourceModel sm,
			TargetModel tm, SM2TM sm2Tm, Step s) {
		Object[] result_pattern_E2SRule_12_4_binding = pattern_E2SRule_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, sm, tm, sm2Tm, s);
		if (result_pattern_E2SRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_E2SRule_12_4_binding[0];

			Object[] result_pattern_E2SRule_12_4_black = pattern_E2SRule_12_4_blackB(csp);
			if (result_pattern_E2SRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, tm,
						sm2Tm, s };
			}
		}
		return null;
	}

	public static final boolean pattern_E2SRule_12_5_expressionFBB(
			E2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_E2SRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_E2SRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "E2SRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_E2SRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_E2SRule_20_1_bindingFB(E2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_20_1_blackFBB(EClass __eClass,
			E2SRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_E2SRule_20_1_bindingAndBlackFFB(
			E2SRule _this) {
		Object[] result_pattern_E2SRule_20_1_binding = pattern_E2SRule_20_1_bindingFB(_this);
		if (result_pattern_E2SRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_E2SRule_20_1_binding[0];

			Object[] result_pattern_E2SRule_20_1_black = pattern_E2SRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_E2SRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_E2SRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_E2SRule_20_2_black_nac_0BB(Element e,
			SourceModel sm) {
		for (SourceModel __DEC_e_elements_695499 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(e, SourceModel.class, "elements")) {
			if (!sm.equals(__DEC_e_elements_695499)) {
				return new Object[] { e, sm };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_E2SRule_20_2_blackFFB(
			EMoflonEdge _edge_elements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSm = _edge_elements.getSrc();
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			EObject tmpE = _edge_elements.getTrg();
			if (tmpE instanceof Element) {
				Element e = (Element) tmpE;
				if (sm.getElements().contains(e)) {
					if (pattern_E2SRule_20_2_black_nac_0BB(e, sm) == null) {
						_result.add(new Object[] { sm, e, _edge_elements });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_E2SRule_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_E2SRule_20_3_expressionFBBBB(
			E2SRule _this, Match match, SourceModel sm, Element e) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, sm, e);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_E2SRule_20_4_expressionFBB(
			E2SRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_E2SRule_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_E2SRule_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_E2SRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_E2SRule_21_1_bindingFB(E2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_21_1_blackFBB(EClass __eClass,
			E2SRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_E2SRule_21_1_bindingAndBlackFFB(
			E2SRule _this) {
		Object[] result_pattern_E2SRule_21_1_binding = pattern_E2SRule_21_1_bindingFB(_this);
		if (result_pattern_E2SRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_E2SRule_21_1_binding[0];

			Object[] result_pattern_E2SRule_21_1_black = pattern_E2SRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_E2SRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_E2SRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_E2SRule_21_2_black_nac_0B(Step s) {
		Special __DEC_s_special_135076 = s.getSpecial();
		if (__DEC_s_special_135076 != null) {
			return new Object[] { s };
		}

		return null;
	}

	public static final Object[] pattern_E2SRule_21_2_black_nac_1BB(Step s,
			TargetModel tm) {
		for (TargetModel __DEC_s_steps_261089 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(s, TargetModel.class, "steps")) {
			if (!tm.equals(__DEC_s_steps_261089)) {
				return new Object[] { s, tm };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_E2SRule_21_2_blackFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTm = _edge_steps.getSrc();
		if (tmpTm instanceof TargetModel) {
			TargetModel tm = (TargetModel) tmpTm;
			EObject tmpS = _edge_steps.getTrg();
			if (tmpS instanceof Step) {
				Step s = (Step) tmpS;
				if (tm.getSteps().contains(s)) {
					if (pattern_E2SRule_21_2_black_nac_0B(s) == null) {
						if (pattern_E2SRule_21_2_black_nac_1BB(s, tm) == null) {
							_result.add(new Object[] { tm, s, _edge_steps });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_E2SRule_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_E2SRule_21_3_expressionFBBBB(
			E2SRule _this, Match match, TargetModel tm, Step s) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tm, s);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_E2SRule_21_4_expressionFBB(
			E2SRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_E2SRule_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_E2SRule_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_E2SRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_E2SRule_24_1_blackB(E2SRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_E2SRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_E2SRule_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SourceModel sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SM2TM sm2Tm) {
		if (ruleResult.getCorrObjects().contains(sm2Tm)) {
			return new Object[] { ruleResult, sm2Tm };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TargetModel tm) {
		if (ruleResult.getTargetObjects().contains(tm)) {
			return new Object[] { ruleResult, tm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_E2SRule_24_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList sm2TmList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpSm2Tm : sm2TmList.getEntryObjects()) {
				if (tmpSm2Tm instanceof SM2TM) {
					SM2TM sm2Tm = (SM2TM) tmpSm2Tm;
					SourceModel sm = sm2Tm.getSource();
					if (sm != null) {
						TargetModel tm = sm2Tm.getTarget();
						if (tm != null) {
							if (pattern_E2SRule_24_2_black_nac_1BB(ruleResult,
									sm2Tm) == null) {
								if (pattern_E2SRule_24_2_black_nac_0BB(
										ruleResult, sm) == null) {
									if (pattern_E2SRule_24_2_black_nac_2BB(
											ruleResult, tm) == null) {
										_result.add(new Object[] { sm2TmList,
												sm, sm2Tm, tm,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_E2SRule_24_3_bindingFBBBBBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch, SourceModel sm,
			TargetModel tm, SM2TM sm2Tm, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, sm, tm, sm2Tm, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, tm, sm2Tm,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_E2SRule_24_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_E2SRule_24_3_bindingAndBlackFBBBBBB(
			E2SRule _this, IsApplicableMatch isApplicableMatch, SourceModel sm,
			TargetModel tm, SM2TM sm2Tm, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_E2SRule_24_3_binding = pattern_E2SRule_24_3_bindingFBBBBBB(
				_this, isApplicableMatch, sm, tm, sm2Tm, ruleResult);
		if (result_pattern_E2SRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_E2SRule_24_3_binding[0];

			Object[] result_pattern_E2SRule_24_3_black = pattern_E2SRule_24_3_blackB(csp);
			if (result_pattern_E2SRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, tm,
						sm2Tm, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_E2SRule_24_4_expressionFBB(
			E2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_E2SRule_24_5_blackBBB(SourceModel sm,
			TargetModel tm, SM2TM sm2Tm) {
		return new Object[] { sm, tm, sm2Tm };
	}

	public static final Object[] pattern_E2SRule_24_6_blackBBBB(SourceModel sm,
			TargetModel tm, SM2TM sm2Tm, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { sm, tm, sm2Tm, ruleResult };
	}

	public static final Object[] pattern_E2SRule_24_6_greenBBFFFBB(
			SourceModel sm, TargetModel tm,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Element e = SourceFactory.eINSTANCE.createElement();
		Step s = TargetFactory.eINSTANCE.createStep();
		E2S e2S = SourceToTargetCorrFactory.eINSTANCE.createE2S();
		Object _localVariable_0 = csp.getValue("e", "id");
		Object _localVariable_1 = csp.getValue("s", "id");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		sm.getElements().add(e);
		ruleResult.getSourceObjects().add(e);
		tm.getSteps().add(s);
		ruleResult.getTargetObjects().add(s);
		e2S.setSource(e);
		e2S.setTarget(s);
		ruleResult.getCorrObjects().add(e2S);
		String e_id_prime = (String) _localVariable_0;
		String s_id_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		e.setId(e_id_prime);
		s.setId(s_id_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { sm, tm, e, s, e2S, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_E2SRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //E2SRuleImpl
