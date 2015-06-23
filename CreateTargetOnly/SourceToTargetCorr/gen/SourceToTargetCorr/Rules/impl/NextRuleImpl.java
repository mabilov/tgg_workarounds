/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.Element;
import Source.SourceModel;

import SourceToTargetCorr.E2S;

import SourceToTargetCorr.Rules.NextRule;
import SourceToTargetCorr.Rules.RulesPackage;

import SourceToTargetCorr.SM2TM;

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

import Target.Step;
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
 * An implementation of the model object '<em><b>Next Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NextRuleImpl extends AbstractRuleImpl implements NextRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NextRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.NEXT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SourceModel sm, Element e2,
			Element e1) {
		// initial bindings
		Object[] result1_black = NextRuleImpl.pattern_NextRule_0_1_blackBBBBB(
				this, match, sm, e2, e1);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ", " + "[e2] = " + e2 + ", " + "[e1] = " + e1
							+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_0_2_bindingAndBlackFBBBBB(this, match, sm,
						e2, e1);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ", " + "[e2] = " + e2 + ", " + "[e1] = " + e1
							+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (NextRuleImpl.pattern_NextRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = NextRuleImpl
					.pattern_NextRule_0_4_blackBBBB(match, sm, e2, e1);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ", " + "[e2] = " + e2 + ", "
								+ "[e1] = " + e1 + ".");
			}
			NextRuleImpl.pattern_NextRule_0_4_greenBBBF(match, e2, e1);
			// EMoflonEdge e1__e2____next = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = NextRuleImpl
					.pattern_NextRule_0_5_blackBBBB(match, sm, e2, e1);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ", " + "[e2] = " + e2 + ", "
								+ "[e1] = " + e1 + ".");
			}
			NextRuleImpl.pattern_NextRule_0_5_greenBBBBFF(match, sm, e2, e1);
			// EMoflonEdge sm__e1____elements = (EMoflonEdge) result5_green[4];
			// EMoflonEdge sm__e2____elements = (EMoflonEdge) result5_green[5];

			// register objects to match
			NextRuleImpl.pattern_NextRule_0_6_expressionBBBBB(this, match, sm,
					e2, e1);
			return NextRuleImpl.pattern_NextRule_0_7_expressionF();
		} else {
			return NextRuleImpl.pattern_NextRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_1_1_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SourceModel sm = (SourceModel) result1_bindingAndBlack[0];
		Element e2 = (Element) result1_bindingAndBlack[1];
		Step s1 = (Step) result1_bindingAndBlack[2];
		Element e1 = (Element) result1_bindingAndBlack[3];
		TargetModel tm = (TargetModel) result1_bindingAndBlack[4];
		SM2TM smToTm = (SM2TM) result1_bindingAndBlack[5];
		E2S e1ToS1 = (E2S) result1_bindingAndBlack[6];
		E2S e2ToS2 = (E2S) result1_bindingAndBlack[7];
		Step s2 = (Step) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		NextRuleImpl.pattern_NextRule_1_1_greenBB(s1, s2);

		// collect translated elements
		Object[] result2_green = NextRuleImpl.pattern_NextRule_1_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = NextRuleImpl
				.pattern_NextRule_1_3_blackBBBBBBBBBB(ruleresult, sm, e2, s1,
						e1, tm, smToTm, e1ToS1, e2ToS2, s2);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[sm] = "
							+ sm
							+ ", "
							+ "[e2] = "
							+ e2
							+ ", "
							+ "[s1] = "
							+ s1
							+ ", "
							+ "[e1] = "
							+ e1
							+ ", "
							+ "[tm] = "
							+ tm
							+ ", "
							+ "[smToTm] = "
							+ smToTm
							+ ", "
							+ "[e1ToS1] = "
							+ e1ToS1
							+ ", "
							+ "[e2ToS2] = "
							+ e2ToS2
							+ ", "
							+ "[s2] = " + s2 + ".");
		}
		NextRuleImpl.pattern_NextRule_1_3_greenBBBBBFF(ruleresult, e2, s1, e1,
				s2);
		// EMoflonEdge s1__s2____next = (EMoflonEdge) result3_green[5];
		// EMoflonEdge e1__e2____next = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		NextRuleImpl.pattern_NextRule_1_5_expressionBBBBBBBBBBB(this,
				ruleresult, sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2);
		return NextRuleImpl.pattern_NextRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NextRuleImpl
				.pattern_NextRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = NextRuleImpl
				.pattern_NextRule_2_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SourceModel sm = (SourceModel) result2_binding[0];
		Element e2 = (Element) result2_binding[1];
		Element e1 = (Element) result2_binding[2];
		for (Object[] result2_black : NextRuleImpl
				.pattern_NextRule_2_2_blackBBFBFFFFFB(sm, e2, e1, match)) {
			Step s1 = (Step) result2_black[2];
			TargetModel tm = (TargetModel) result2_black[4];
			SM2TM smToTm = (SM2TM) result2_black[5];
			E2S e1ToS1 = (E2S) result2_black[6];
			E2S e2ToS2 = (E2S) result2_black[7];
			Step s2 = (Step) result2_black[8];
			// ForEach find context
			for (Object[] result3_black : NextRuleImpl
					.pattern_NextRule_2_3_blackBBBBBBBBB(sm, e2, s1, e1, tm,
							smToTm, e1ToS1, e2ToS2, s2)) {
				Object[] result3_green = NextRuleImpl
						.pattern_NextRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(sm,
								e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge sm__e1____elements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge sm__e2____elements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge e1__e2____next = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tm__s1____steps = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tm__s2____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge smToTm__sm____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge smToTm__tm____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge e1ToS1__e1____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge e1ToS1__s1____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge e2ToS2__e2____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge e2ToS2__s2____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = NextRuleImpl
						.pattern_NextRule_2_4_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, sm, e2, s1, e1, tm, smToTm,
								e1ToS1, e2ToS2, s2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[sm] = "
									+ sm
									+ ", "
									+ "[e2] = "
									+ e2
									+ ", "
									+ "[s1] = "
									+ s1
									+ ", "
									+ "[e1] = "
									+ e1
									+ ", "
									+ "[tm] = "
									+ tm
									+ ", "
									+ "[smToTm] = "
									+ smToTm
									+ ", "
									+ "[e1ToS1] = "
									+ e1ToS1
									+ ", "
									+ "[e2ToS2] = "
									+ e2ToS2
									+ ", "
									+ "[s2] = " + s2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (NextRuleImpl.pattern_NextRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = NextRuleImpl
							.pattern_NextRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					NextRuleImpl.pattern_NextRule_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NextRuleImpl.pattern_NextRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SourceModel sm,
			Element e2, Element e1) {
		match.registerObject("sm", sm);
		match.registerObject("e2", e2);
		match.registerObject("e1", e1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SourceModel sm,
			Element e2, Element e1) {// Create CSP
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
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("e2", e2);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("e1", e1);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("smToTm", smToTm);
		isApplicableMatch.registerObject("e1ToS1", e1ToS1);
		isApplicableMatch.registerObject("e2ToS2", e2ToS2);
		isApplicableMatch.registerObject("s2", s2);
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
			EObject e2, EObject s1, EObject e1, EObject tm, EObject smToTm,
			EObject e1ToS1, EObject e2ToS2, EObject s2) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("e2", e2);
		ruleresult.registerObject("s1", s1);
		ruleresult.registerObject("e1", e1);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("smToTm", smToTm);
		ruleresult.registerObject("e1ToS1", e1ToS1);
		ruleresult.registerObject("e2ToS2", e2ToS2);
		ruleresult.registerObject("s2", s2);

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
	public boolean isAppropriate_BWD(Match match, Step s1, TargetModel tm,
			Step s2) {
		// initial bindings
		Object[] result1_black = NextRuleImpl.pattern_NextRule_10_1_blackBBBBB(
				this, match, s1, tm, s2);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[s1] = " + s1
							+ ", " + "[tm] = " + tm + ", " + "[s2] = " + s2
							+ ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_10_2_bindingAndBlackFBBBBB(this, match, s1,
						tm, s2);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[s1] = " + s1
							+ ", " + "[tm] = " + tm + ", " + "[s2] = " + s2
							+ ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (NextRuleImpl.pattern_NextRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = NextRuleImpl
					.pattern_NextRule_10_4_blackBBBB(match, s1, tm, s2);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[s1] = " + s1 + ", " + "[tm] = " + tm + ", "
								+ "[s2] = " + s2 + ".");
			}
			NextRuleImpl.pattern_NextRule_10_4_greenBBBF(match, s1, s2);
			// EMoflonEdge s1__s2____next = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = NextRuleImpl
					.pattern_NextRule_10_5_blackBBBB(match, s1, tm, s2);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[s1] = " + s1 + ", " + "[tm] = " + tm + ", "
								+ "[s2] = " + s2 + ".");
			}
			NextRuleImpl.pattern_NextRule_10_5_greenBBBBFF(match, s1, tm, s2);
			// EMoflonEdge tm__s1____steps = (EMoflonEdge) result5_green[4];
			// EMoflonEdge tm__s2____steps = (EMoflonEdge) result5_green[5];

			// register objects to match
			NextRuleImpl.pattern_NextRule_10_6_expressionBBBBB(this, match, s1,
					tm, s2);
			return NextRuleImpl.pattern_NextRule_10_7_expressionF();
		} else {
			return NextRuleImpl.pattern_NextRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_11_1_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		SourceModel sm = (SourceModel) result1_bindingAndBlack[0];
		Element e2 = (Element) result1_bindingAndBlack[1];
		Step s1 = (Step) result1_bindingAndBlack[2];
		Element e1 = (Element) result1_bindingAndBlack[3];
		TargetModel tm = (TargetModel) result1_bindingAndBlack[4];
		SM2TM smToTm = (SM2TM) result1_bindingAndBlack[5];
		E2S e1ToS1 = (E2S) result1_bindingAndBlack[6];
		E2S e2ToS2 = (E2S) result1_bindingAndBlack[7];
		Step s2 = (Step) result1_bindingAndBlack[8];
		// CSP csp = (CSP) result1_bindingAndBlack[9];
		NextRuleImpl.pattern_NextRule_11_1_greenBB(e2, e1);

		// collect translated elements
		Object[] result2_green = NextRuleImpl.pattern_NextRule_11_2_greenF();
		if (result2_green == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = NextRuleImpl
				.pattern_NextRule_11_3_blackBBBBBBBBBB(ruleresult, sm, e2, s1,
						e1, tm, smToTm, e1ToS1, e2ToS2, s2);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[sm] = "
							+ sm
							+ ", "
							+ "[e2] = "
							+ e2
							+ ", "
							+ "[s1] = "
							+ s1
							+ ", "
							+ "[e1] = "
							+ e1
							+ ", "
							+ "[tm] = "
							+ tm
							+ ", "
							+ "[smToTm] = "
							+ smToTm
							+ ", "
							+ "[e1ToS1] = "
							+ e1ToS1
							+ ", "
							+ "[e2ToS2] = "
							+ e2ToS2
							+ ", "
							+ "[s2] = " + s2 + ".");
		}
		NextRuleImpl.pattern_NextRule_11_3_greenBBBBBFF(ruleresult, e2, s1, e1,
				s2);
		// EMoflonEdge s1__s2____next = (EMoflonEdge) result3_green[5];
		// EMoflonEdge e1__e2____next = (EMoflonEdge) result3_green[6];

		// perform postprocessing story node is empty
		// register objects
		NextRuleImpl.pattern_NextRule_11_5_expressionBBBBBBBBBBB(this,
				ruleresult, sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2);
		return NextRuleImpl.pattern_NextRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NextRuleImpl
				.pattern_NextRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = NextRuleImpl
				.pattern_NextRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Step s1 = (Step) result2_binding[0];
		TargetModel tm = (TargetModel) result2_binding[1];
		Step s2 = (Step) result2_binding[2];
		for (Object[] result2_black : NextRuleImpl
				.pattern_NextRule_12_2_blackFFBFBFFFBB(s1, tm, s2, match)) {
			SourceModel sm = (SourceModel) result2_black[0];
			Element e2 = (Element) result2_black[1];
			Element e1 = (Element) result2_black[3];
			SM2TM smToTm = (SM2TM) result2_black[5];
			E2S e1ToS1 = (E2S) result2_black[6];
			E2S e2ToS2 = (E2S) result2_black[7];
			// ForEach find context
			for (Object[] result3_black : NextRuleImpl
					.pattern_NextRule_12_3_blackBBBBBBBBB(sm, e2, s1, e1, tm,
							smToTm, e1ToS1, e2ToS2, s2)) {
				Object[] result3_green = NextRuleImpl
						.pattern_NextRule_12_3_greenBBBBBBBBBFFFFFFFFFFFF(sm,
								e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				// EMoflonEdge sm__e1____elements = (EMoflonEdge) result3_green[10];
				// EMoflonEdge sm__e2____elements = (EMoflonEdge) result3_green[11];
				// EMoflonEdge s1__s2____next = (EMoflonEdge) result3_green[12];
				// EMoflonEdge tm__s1____steps = (EMoflonEdge) result3_green[13];
				// EMoflonEdge tm__s2____steps = (EMoflonEdge) result3_green[14];
				// EMoflonEdge smToTm__sm____source = (EMoflonEdge) result3_green[15];
				// EMoflonEdge smToTm__tm____target = (EMoflonEdge) result3_green[16];
				// EMoflonEdge e1ToS1__e1____source = (EMoflonEdge) result3_green[17];
				// EMoflonEdge e1ToS1__s1____target = (EMoflonEdge) result3_green[18];
				// EMoflonEdge e2ToS2__e2____source = (EMoflonEdge) result3_green[19];
				// EMoflonEdge e2ToS2__s2____target = (EMoflonEdge) result3_green[20];

				// solve CSP
				Object[] result4_bindingAndBlack = NextRuleImpl
						.pattern_NextRule_12_4_bindingAndBlackFBBBBBBBBBBB(
								this, isApplicableMatch, sm, e2, s1, e1, tm,
								smToTm, e1ToS1, e2ToS2, s2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = "
									+ this
									+ ", "
									+ "[isApplicableMatch] = "
									+ isApplicableMatch
									+ ", "
									+ "[sm] = "
									+ sm
									+ ", "
									+ "[e2] = "
									+ e2
									+ ", "
									+ "[s1] = "
									+ s1
									+ ", "
									+ "[e1] = "
									+ e1
									+ ", "
									+ "[tm] = "
									+ tm
									+ ", "
									+ "[smToTm] = "
									+ smToTm
									+ ", "
									+ "[e1ToS1] = "
									+ e1ToS1
									+ ", "
									+ "[e2ToS2] = "
									+ e2ToS2
									+ ", "
									+ "[s2] = " + s2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (NextRuleImpl.pattern_NextRule_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = NextRuleImpl
							.pattern_NextRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					NextRuleImpl.pattern_NextRule_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NextRuleImpl.pattern_NextRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step s1,
			TargetModel tm, Step s2) {
		match.registerObject("s1", s1);
		match.registerObject("tm", tm);
		match.registerObject("s2", s2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step s1, TargetModel tm,
			Step s2) {// Create CSP
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
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("e2", e2);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("e1", e1);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("smToTm", smToTm);
		isApplicableMatch.registerObject("e1ToS1", e1ToS1);
		isApplicableMatch.registerObject("e2ToS2", e2ToS2);
		isApplicableMatch.registerObject("s2", s2);
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
			EObject e2, EObject s1, EObject e1, EObject tm, EObject smToTm,
			EObject e1ToS1, EObject e2ToS2, EObject s2) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("e2", e2);
		ruleresult.registerObject("s1", s1);
		ruleresult.registerObject("e1", e1);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("smToTm", smToTm);
		ruleresult.registerObject("e1ToS1", e1ToS1);
		ruleresult.registerObject("e2ToS2", e2ToS2);
		ruleresult.registerObject("s2", s2);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_30(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NextRuleImpl.pattern_NextRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : NextRuleImpl
				.pattern_NextRule_20_2_blackFFFB(_edge_next)) {
			Step s1 = (Step) result2_black[0];
			TargetModel tm = (TargetModel) result2_black[1];
			Step s2 = (Step) result2_black[2];
			Object[] result2_green = NextRuleImpl
					.pattern_NextRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (NextRuleImpl.pattern_NextRule_20_3_expressionFBBBBB(this,
					match, s1, tm, s2)) {
				// Ensure that the correct types of elements are matched
				if (NextRuleImpl.pattern_NextRule_20_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = NextRuleImpl
							.pattern_NextRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					NextRuleImpl.pattern_NextRule_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return NextRuleImpl.pattern_NextRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_24(
			EMoflonEdge _edge_next) {
		// prepare return value
		Object[] result1_bindingAndBlack = NextRuleImpl
				.pattern_NextRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NextRuleImpl.pattern_NextRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : NextRuleImpl
				.pattern_NextRule_21_2_blackFFFB(_edge_next)) {
			SourceModel sm = (SourceModel) result2_black[0];
			Element e2 = (Element) result2_black[1];
			Element e1 = (Element) result2_black[2];
			Object[] result2_green = NextRuleImpl
					.pattern_NextRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (NextRuleImpl.pattern_NextRule_21_3_expressionFBBBBB(this,
					match, sm, e2, e1)) {
				// Ensure that the correct types of elements are matched
				if (NextRuleImpl.pattern_NextRule_21_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = NextRuleImpl
							.pattern_NextRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					NextRuleImpl.pattern_NextRule_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return NextRuleImpl.pattern_NextRule_21_6_expressionFB(__result);
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
			RuleEntryContainer ruleEntryContainer, E2S e1ToS1Parameter) {
		// create result
		Object[] result1_black = NextRuleImpl
				.pattern_NextRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = NextRuleImpl.pattern_NextRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : NextRuleImpl
				.pattern_NextRule_24_2_blackFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList e1ToS1List = (RuleEntryList) result2_black[0];
			SourceModel sm = (SourceModel) result2_black[1];
			Element e1 = (Element) result2_black[2];
			E2S e1ToS1 = (E2S) result2_black[3];
			Step s1 = (Step) result2_black[4];
			TargetModel tm = (TargetModel) result2_black[5];
			Step s2 = (Step) result2_black[6];
			E2S e2ToS2 = (E2S) result2_black[7];
			Element e2 = (Element) result2_black[8];
			SM2TM smToTm = (SM2TM) result2_black[9];

			// solve CSP
			Object[] result3_bindingAndBlack = NextRuleImpl
					.pattern_NextRule_24_3_bindingAndBlackFBBBBBBBBBBBB(this,
							isApplicableMatch, sm, e2, s1, e1, tm, smToTm,
							e1ToS1, e2ToS2, s2, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = "
								+ this
								+ ", "
								+ "[isApplicableMatch] = "
								+ isApplicableMatch
								+ ", "
								+ "[sm] = "
								+ sm
								+ ", "
								+ "[e2] = "
								+ e2
								+ ", "
								+ "[s1] = "
								+ s1
								+ ", "
								+ "[e1] = "
								+ e1
								+ ", "
								+ "[tm] = "
								+ tm
								+ ", "
								+ "[smToTm] = "
								+ smToTm
								+ ", "
								+ "[e1ToS1] = "
								+ e1ToS1
								+ ", "
								+ "[e2ToS2] = "
								+ e2ToS2
								+ ", "
								+ "[s2] = "
								+ s2
								+ ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (NextRuleImpl.pattern_NextRule_24_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = NextRuleImpl
						.pattern_NextRule_24_5_blackBBBBBBBBB(sm, e2, s1, e1,
								tm, smToTm, e1ToS1, e2ToS2, s2);
				if (result5_black != null) {

					// perform
					Object[] result6_black = NextRuleImpl
							.pattern_NextRule_24_6_blackBBBBBBBBBB(sm, e2, s1,
									e1, tm, smToTm, e1ToS1, e2ToS2, s2,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[sm] = "
										+ sm
										+ ", "
										+ "[e2] = "
										+ e2
										+ ", "
										+ "[s1] = "
										+ s1
										+ ", "
										+ "[e1] = "
										+ e1
										+ ", "
										+ "[tm] = "
										+ tm
										+ ", "
										+ "[smToTm] = "
										+ smToTm
										+ ", "
										+ "[e1ToS1] = "
										+ e1ToS1
										+ ", "
										+ "[e2ToS2] = "
										+ e2ToS2
										+ ", "
										+ "[s2] = "
										+ s2
										+ ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					NextRuleImpl.pattern_NextRule_24_6_greenBBBBB(e2, s1, e1,
							s2, ruleResult);

				} else {
				}

			} else {
			}

		}
		return NextRuleImpl.pattern_NextRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("e2", e2);
		isApplicableMatch.registerObject("s1", s1);
		isApplicableMatch.registerObject("e1", e1);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("smToTm", smToTm);
		isApplicableMatch.registerObject("e1ToS1", e1ToS1);
		isApplicableMatch.registerObject("e2ToS2", e2ToS2);
		isApplicableMatch.registerObject("s2", s2);
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
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2),
					(Element) arguments.get(3));
		case RulesPackage.NEXT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NEXT_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2),
					(Element) arguments.get(3));
			return null;
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2),
					(Element) arguments.get(3));
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2),
					(Step) arguments.get(3), (Element) arguments.get(4),
					(TargetModel) arguments.get(5), (SM2TM) arguments.get(6),
					(E2S) arguments.get(7), (E2S) arguments.get(8),
					(Step) arguments.get(9));
		case RulesPackage.NEXT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NEXT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.NEXT_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_TARGETMODEL_STEP:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (TargetModel) arguments.get(2),
					(Step) arguments.get(3));
		case RulesPackage.NEXT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NEXT_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_TARGETMODEL_STEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (TargetModel) arguments.get(2),
					(Step) arguments.get(3));
			return null;
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_TARGETMODEL_STEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (TargetModel) arguments.get(2),
					(Step) arguments.get(3));
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2),
					(Step) arguments.get(3), (Element) arguments.get(4),
					(TargetModel) arguments.get(5), (SM2TM) arguments.get(6),
					(E2S) arguments.get(7), (E2S) arguments.get(8),
					(Step) arguments.get(9));
		case RulesPackage.NEXT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NEXT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7), (EObject) arguments.get(8),
					(EObject) arguments.get(9));
			return null;
		case RulesPackage.NEXT_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_30((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NEXT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_24__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_24((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.NEXT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NEXT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.NEXT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(E2S) arguments.get(1));
		case RulesPackage.NEXT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1), (Element) arguments.get(2),
					(Step) arguments.get(3), (Element) arguments.get(4),
					(TargetModel) arguments.get(5), (SM2TM) arguments.get(6),
					(E2S) arguments.get(7), (E2S) arguments.get(8),
					(Step) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.NEXT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NextRule_0_1_blackBBBBB(
			NextRule _this, Match match, SourceModel sm, Element e2, Element e1) {
		if (!e1.equals(e2)) {
			return new Object[] { _this, match, sm, e2, e1 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_0_2_bindingFBBBBB(
			NextRule _this, Match match, SourceModel sm, Element e2, Element e1) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, sm, e2,
				e1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sm, e2, e1 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NextRule_0_2_bindingAndBlackFBBBBB(
			NextRule _this, Match match, SourceModel sm, Element e2, Element e1) {
		Object[] result_pattern_NextRule_0_2_binding = pattern_NextRule_0_2_bindingFBBBBB(
				_this, match, sm, e2, e1);
		if (result_pattern_NextRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_NextRule_0_2_binding[0];

			Object[] result_pattern_NextRule_0_2_black = pattern_NextRule_0_2_blackB(csp);
			if (result_pattern_NextRule_0_2_black != null) {

				return new Object[] { csp, _this, match, sm, e2, e1 };
			}
		}
		return null;
	}

	public static final boolean pattern_NextRule_0_3_expressionFBB(
			NextRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NextRule_0_4_blackBBBB(Match match,
			SourceModel sm, Element e2, Element e1) {
		if (!e1.equals(e2)) {
			return new Object[] { match, sm, e2, e1 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_0_4_greenBBBF(Match match,
			Element e2, Element e1) {
		EMoflonEdge e1__e2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String e1__e2____next_name_prime = "next";
		e1__e2____next.setSrc(e1);
		e1__e2____next.setTrg(e2);
		match.getToBeTranslatedEdges().add(e1__e2____next);
		e1__e2____next.setName(e1__e2____next_name_prime);
		return new Object[] { match, e2, e1, e1__e2____next };
	}

	public static final Object[] pattern_NextRule_0_5_blackBBBB(Match match,
			SourceModel sm, Element e2, Element e1) {
		if (!e1.equals(e2)) {
			return new Object[] { match, sm, e2, e1 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_0_5_greenBBBBFF(Match match,
			SourceModel sm, Element e2, Element e1) {
		EMoflonEdge sm__e1____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm__e2____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(sm);
		match.getContextNodes().add(e2);
		match.getContextNodes().add(e1);
		String sm__e1____elements_name_prime = "elements";
		String sm__e2____elements_name_prime = "elements";
		sm__e1____elements.setSrc(sm);
		sm__e1____elements.setTrg(e1);
		match.getContextEdges().add(sm__e1____elements);
		sm__e2____elements.setSrc(sm);
		sm__e2____elements.setTrg(e2);
		match.getContextEdges().add(sm__e2____elements);
		sm__e1____elements.setName(sm__e1____elements_name_prime);
		sm__e2____elements.setName(sm__e2____elements_name_prime);
		return new Object[] { match, sm, e2, e1, sm__e1____elements,
				sm__e2____elements };
	}

	public static final void pattern_NextRule_0_6_expressionBBBBB(
			NextRule _this, Match match, SourceModel sm, Element e2, Element e1) {
		_this.registerObjectsToMatch_FWD(match, sm, e2, e1);

	}

	public static final boolean pattern_NextRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NextRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_NextRule_1_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject _localVariable_1 = isApplicableMatch.getObject("e2");
		EObject _localVariable_2 = isApplicableMatch.getObject("s1");
		EObject _localVariable_3 = isApplicableMatch.getObject("e1");
		EObject _localVariable_4 = isApplicableMatch.getObject("tm");
		EObject _localVariable_5 = isApplicableMatch.getObject("smToTm");
		EObject _localVariable_6 = isApplicableMatch.getObject("e1ToS1");
		EObject _localVariable_7 = isApplicableMatch.getObject("e2ToS2");
		EObject _localVariable_8 = isApplicableMatch.getObject("s2");
		EObject tmpSm = _localVariable_0;
		EObject tmpE2 = _localVariable_1;
		EObject tmpS1 = _localVariable_2;
		EObject tmpE1 = _localVariable_3;
		EObject tmpTm = _localVariable_4;
		EObject tmpSmToTm = _localVariable_5;
		EObject tmpE1ToS1 = _localVariable_6;
		EObject tmpE2ToS2 = _localVariable_7;
		EObject tmpS2 = _localVariable_8;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpE2 instanceof Element) {
				Element e2 = (Element) tmpE2;
				if (tmpS1 instanceof Step) {
					Step s1 = (Step) tmpS1;
					if (tmpE1 instanceof Element) {
						Element e1 = (Element) tmpE1;
						if (tmpTm instanceof TargetModel) {
							TargetModel tm = (TargetModel) tmpTm;
							if (tmpSmToTm instanceof SM2TM) {
								SM2TM smToTm = (SM2TM) tmpSmToTm;
								if (tmpE1ToS1 instanceof E2S) {
									E2S e1ToS1 = (E2S) tmpE1ToS1;
									if (tmpE2ToS2 instanceof E2S) {
										E2S e2ToS2 = (E2S) tmpE2ToS2;
										if (tmpS2 instanceof Step) {
											Step s2 = (Step) tmpS2;
											return new Object[] { sm, e2, s1,
													e1, tm, smToTm, e1ToS1,
													e2ToS2, s2,
													isApplicableMatch };
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

	public static final Object[] pattern_NextRule_1_1_blackBBBBBBBBBFBB(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2, NextRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!s1.equals(s2)) {
			if (!e1.equals(e2)) {
				if (!e1ToS1.equals(e2ToS2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { sm, e2, s1, e1, tm, smToTm,
									e1ToS1, e2ToS2, s2, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_1_1_bindingAndBlackFFFFFFFFFFBB(
			NextRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NextRule_1_1_binding = pattern_NextRule_1_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_NextRule_1_1_binding != null) {
			SourceModel sm = (SourceModel) result_pattern_NextRule_1_1_binding[0];
			Element e2 = (Element) result_pattern_NextRule_1_1_binding[1];
			Step s1 = (Step) result_pattern_NextRule_1_1_binding[2];
			Element e1 = (Element) result_pattern_NextRule_1_1_binding[3];
			TargetModel tm = (TargetModel) result_pattern_NextRule_1_1_binding[4];
			SM2TM smToTm = (SM2TM) result_pattern_NextRule_1_1_binding[5];
			E2S e1ToS1 = (E2S) result_pattern_NextRule_1_1_binding[6];
			E2S e2ToS2 = (E2S) result_pattern_NextRule_1_1_binding[7];
			Step s2 = (Step) result_pattern_NextRule_1_1_binding[8];

			Object[] result_pattern_NextRule_1_1_black = pattern_NextRule_1_1_blackBBBBBBBBBFBB(
					sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2, _this,
					isApplicableMatch);
			if (result_pattern_NextRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_NextRule_1_1_black[9];

				return new Object[] { sm, e2, s1, e1, tm, smToTm, e1ToS1,
						e2ToS2, s2, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_1_1_greenBB(Step s1, Step s2) {
		s1.setNext(s2);
		return new Object[] { s1, s2 };
	}

	public static final Object[] pattern_NextRule_1_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_NextRule_1_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject e2, EObject s1,
			EObject e1, EObject tm, EObject smToTm, EObject e1ToS1,
			EObject e2ToS2, EObject s2) {
		if (!sm.equals(tm)) {
			if (!sm.equals(smToTm)) {
				if (!e2.equals(sm)) {
					if (!e2.equals(s1)) {
						if (!e2.equals(tm)) {
							if (!e2.equals(smToTm)) {
								if (!e2.equals(e2ToS2)) {
									if (!e2.equals(s2)) {
										if (!s1.equals(sm)) {
											if (!s1.equals(tm)) {
												if (!s1.equals(smToTm)) {
													if (!s1.equals(s2)) {
														if (!e1.equals(sm)) {
															if (!e1.equals(e2)) {
																if (!e1.equals(s1)) {
																	if (!e1.equals(tm)) {
																		if (!e1.equals(smToTm)) {
																			if (!e1.equals(e1ToS1)) {
																				if (!e1.equals(e2ToS2)) {
																					if (!e1.equals(s2)) {
																						if (!smToTm
																								.equals(tm)) {
																							if (!e1ToS1
																									.equals(sm)) {
																								if (!e1ToS1
																										.equals(e2)) {
																									if (!e1ToS1
																											.equals(s1)) {
																										if (!e1ToS1
																												.equals(tm)) {
																											if (!e1ToS1
																													.equals(smToTm)) {
																												if (!e1ToS1
																														.equals(e2ToS2)) {
																													if (!e1ToS1
																															.equals(s2)) {
																														if (!e2ToS2
																																.equals(sm)) {
																															if (!e2ToS2
																																	.equals(s1)) {
																																if (!e2ToS2
																																		.equals(tm)) {
																																	if (!e2ToS2
																																			.equals(smToTm)) {
																																		if (!e2ToS2
																																				.equals(s2)) {
																																			if (!s2.equals(sm)) {
																																				if (!s2.equals(tm)) {
																																					if (!s2.equals(smToTm)) {
																																						return new Object[] {
																																								ruleresult,
																																								sm,
																																								e2,
																																								s1,
																																								e1,
																																								tm,
																																								smToTm,
																																								e1ToS1,
																																								e2ToS2,
																																								s2 };
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
		return null;
	}

	public static final Object[] pattern_NextRule_1_3_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject e2, EObject s1, EObject e1,
			EObject s2) {
		EMoflonEdge s1__s2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e1__e2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NextRule";
		String s1__s2____next_name_prime = "next";
		String e1__e2____next_name_prime = "next";
		s1__s2____next.setSrc(s1);
		s1__s2____next.setTrg(s2);
		ruleresult.getCreatedEdges().add(s1__s2____next);
		e1__e2____next.setSrc(e1);
		e1__e2____next.setTrg(e2);
		ruleresult.getTranslatedEdges().add(e1__e2____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s1__s2____next.setName(s1__s2____next_name_prime);
		e1__e2____next.setName(e1__e2____next_name_prime);
		return new Object[] { ruleresult, e2, s1, e1, s2, s1__s2____next,
				e1__e2____next };
	}

	public static final void pattern_NextRule_1_5_expressionBBBBBBBBBBB(
			NextRule _this, PerformRuleResult ruleresult, EObject sm,
			EObject e2, EObject s1, EObject e1, EObject tm, EObject smToTm,
			EObject e1ToS1, EObject e2ToS2, EObject s2) {
		_this.registerObjects_FWD(ruleresult, sm, e2, s1, e1, tm, smToTm,
				e1ToS1, e2ToS2, s2);

	}

	public static final PerformRuleResult pattern_NextRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NextRule_2_1_bindingFB(NextRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_2_1_blackFBB(EClass eClass,
			NextRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NextRule_2_1_bindingAndBlackFFB(
			NextRule _this) {
		Object[] result_pattern_NextRule_2_1_binding = pattern_NextRule_2_1_bindingFB(_this);
		if (result_pattern_NextRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_NextRule_2_1_binding[0];

			Object[] result_pattern_NextRule_2_1_black = pattern_NextRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_NextRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NextRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "NextRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NextRule_2_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("sm");
		EObject _localVariable_1 = match.getObject("e2");
		EObject _localVariable_2 = match.getObject("e1");
		EObject tmpSm = _localVariable_0;
		EObject tmpE2 = _localVariable_1;
		EObject tmpE1 = _localVariable_2;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpE2 instanceof Element) {
				Element e2 = (Element) tmpE2;
				if (tmpE1 instanceof Element) {
					Element e1 = (Element) tmpE1;
					return new Object[] { sm, e2, e1, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NextRule_2_2_blackBBFBFFFFFB(
			SourceModel sm, Element e2, Element e1, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!e1.equals(e2)) {
			for (SM2TM smToTm : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(sm, SM2TM.class, "source")) {
				TargetModel tm = smToTm.getTarget();
				if (tm != null) {
					for (E2S e1ToS1 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(e1, E2S.class, "source")) {
						Step s1 = e1ToS1.getTarget();
						if (s1 != null) {
							for (E2S e2ToS2 : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(e2, E2S.class,
											"source")) {
								if (!e1ToS1.equals(e2ToS2)) {
									Step s2 = e2ToS2.getTarget();
									if (s2 != null) {
										if (!s1.equals(s2)) {
											_result.add(new Object[] { sm, e2,
													s1, e1, tm, smToTm, e1ToS1,
													e2ToS2, s2, match });
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

	public static final Iterable<Object[]> pattern_NextRule_2_3_blackBBBBBBBBB(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!s1.equals(s2)) {
			if (!e1.equals(e2)) {
				if (!e1ToS1.equals(e2ToS2)) {
					if (sm.getElements().contains(e1)) {
						if (sm.getElements().contains(e2)) {
							if (e2.equals(e1.getNext())) {
								if (tm.getSteps().contains(s1)) {
									if (tm.getSteps().contains(s2)) {
										if (sm.equals(smToTm.getSource())) {
											if (tm.equals(smToTm.getTarget())) {
												if (e1.equals(e1ToS1
														.getSource())) {
													if (s1.equals(e1ToS1
															.getTarget())) {
														if (e2.equals(e2ToS2
																.getSource())) {
															if (s2.equals(e2ToS2
																	.getTarget())) {
																_result.add(new Object[] {
																		sm, e2,
																		s1, e1,
																		tm,
																		smToTm,
																		e1ToS1,
																		e2ToS2,
																		s2 });
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

	public static final Object[] pattern_NextRule_2_3_greenBBBBBBBBBFFFFFFFFFFFF(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge sm__e1____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm__e2____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e1__e2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s1____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s2____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e1ToS1__e1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e1ToS1__s1____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2ToS2__e2____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2ToS2__s2____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String sm__e1____elements_name_prime = "elements";
		String sm__e2____elements_name_prime = "elements";
		String e1__e2____next_name_prime = "next";
		String tm__s1____steps_name_prime = "steps";
		String tm__s2____steps_name_prime = "steps";
		String smToTm__sm____source_name_prime = "source";
		String smToTm__tm____target_name_prime = "target";
		String e1ToS1__e1____source_name_prime = "source";
		String e1ToS1__s1____target_name_prime = "target";
		String e2ToS2__e2____source_name_prime = "source";
		String e2ToS2__s2____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(e2);
		isApplicableMatch.getAllContextElements().add(s1);
		isApplicableMatch.getAllContextElements().add(e1);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(smToTm);
		isApplicableMatch.getAllContextElements().add(e1ToS1);
		isApplicableMatch.getAllContextElements().add(e2ToS2);
		isApplicableMatch.getAllContextElements().add(s2);
		sm__e1____elements.setSrc(sm);
		sm__e1____elements.setTrg(e1);
		isApplicableMatch.getAllContextElements().add(sm__e1____elements);
		sm__e2____elements.setSrc(sm);
		sm__e2____elements.setTrg(e2);
		isApplicableMatch.getAllContextElements().add(sm__e2____elements);
		e1__e2____next.setSrc(e1);
		e1__e2____next.setTrg(e2);
		isApplicableMatch.getAllContextElements().add(e1__e2____next);
		tm__s1____steps.setSrc(tm);
		tm__s1____steps.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(tm__s1____steps);
		tm__s2____steps.setSrc(tm);
		tm__s2____steps.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(tm__s2____steps);
		smToTm__sm____source.setSrc(smToTm);
		smToTm__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(smToTm__sm____source);
		smToTm__tm____target.setSrc(smToTm);
		smToTm__tm____target.setTrg(tm);
		isApplicableMatch.getAllContextElements().add(smToTm__tm____target);
		e1ToS1__e1____source.setSrc(e1ToS1);
		e1ToS1__e1____source.setTrg(e1);
		isApplicableMatch.getAllContextElements().add(e1ToS1__e1____source);
		e1ToS1__s1____target.setSrc(e1ToS1);
		e1ToS1__s1____target.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(e1ToS1__s1____target);
		e2ToS2__e2____source.setSrc(e2ToS2);
		e2ToS2__e2____source.setTrg(e2);
		isApplicableMatch.getAllContextElements().add(e2ToS2__e2____source);
		e2ToS2__s2____target.setSrc(e2ToS2);
		e2ToS2__s2____target.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(e2ToS2__s2____target);
		sm__e1____elements.setName(sm__e1____elements_name_prime);
		sm__e2____elements.setName(sm__e2____elements_name_prime);
		e1__e2____next.setName(e1__e2____next_name_prime);
		tm__s1____steps.setName(tm__s1____steps_name_prime);
		tm__s2____steps.setName(tm__s2____steps_name_prime);
		smToTm__sm____source.setName(smToTm__sm____source_name_prime);
		smToTm__tm____target.setName(smToTm__tm____target_name_prime);
		e1ToS1__e1____source.setName(e1ToS1__e1____source_name_prime);
		e1ToS1__s1____target.setName(e1ToS1__s1____target_name_prime);
		e2ToS2__e2____source.setName(e2ToS2__e2____source_name_prime);
		e2ToS2__s2____target.setName(e2ToS2__s2____target_name_prime);
		return new Object[] { sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2,
				isApplicableMatch, sm__e1____elements, sm__e2____elements,
				e1__e2____next, tm__s1____steps, tm__s2____steps,
				smToTm__sm____source, smToTm__tm____target,
				e1ToS1__e1____source, e1ToS1__s1____target,
				e2ToS2__e2____source, e2ToS2__s2____target };
	}

	public static final Object[] pattern_NextRule_2_4_bindingFBBBBBBBBBBB(
			NextRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2,
				s2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, e2, s1,
					e1, tm, smToTm, e1ToS1, e2ToS2, s2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NextRule_2_4_bindingAndBlackFBBBBBBBBBBB(
			NextRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		Object[] result_pattern_NextRule_2_4_binding = pattern_NextRule_2_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, sm, e2, s1, e1, tm, smToTm, e1ToS1,
				e2ToS2, s2);
		if (result_pattern_NextRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_NextRule_2_4_binding[0];

			Object[] result_pattern_NextRule_2_4_black = pattern_NextRule_2_4_blackB(csp);
			if (result_pattern_NextRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, e2,
						s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2 };
			}
		}
		return null;
	}

	public static final boolean pattern_NextRule_2_5_expressionFBB(
			NextRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NextRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NextRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NextRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NextRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NextRule_10_1_blackBBBBB(
			NextRule _this, Match match, Step s1, TargetModel tm, Step s2) {
		if (!s1.equals(s2)) {
			return new Object[] { _this, match, s1, tm, s2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_10_2_bindingFBBBBB(
			NextRule _this, Match match, Step s1, TargetModel tm, Step s2) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, s1, tm,
				s2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s1, tm, s2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NextRule_10_2_bindingAndBlackFBBBBB(
			NextRule _this, Match match, Step s1, TargetModel tm, Step s2) {
		Object[] result_pattern_NextRule_10_2_binding = pattern_NextRule_10_2_bindingFBBBBB(
				_this, match, s1, tm, s2);
		if (result_pattern_NextRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_NextRule_10_2_binding[0];

			Object[] result_pattern_NextRule_10_2_black = pattern_NextRule_10_2_blackB(csp);
			if (result_pattern_NextRule_10_2_black != null) {

				return new Object[] { csp, _this, match, s1, tm, s2 };
			}
		}
		return null;
	}

	public static final boolean pattern_NextRule_10_3_expressionFBB(
			NextRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NextRule_10_4_blackBBBB(Match match,
			Step s1, TargetModel tm, Step s2) {
		if (!s1.equals(s2)) {
			return new Object[] { match, s1, tm, s2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_10_4_greenBBBF(Match match,
			Step s1, Step s2) {
		EMoflonEdge s1__s2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String s1__s2____next_name_prime = "next";
		s1__s2____next.setSrc(s1);
		s1__s2____next.setTrg(s2);
		match.getToBeTranslatedEdges().add(s1__s2____next);
		s1__s2____next.setName(s1__s2____next_name_prime);
		return new Object[] { match, s1, s2, s1__s2____next };
	}

	public static final Object[] pattern_NextRule_10_5_blackBBBB(Match match,
			Step s1, TargetModel tm, Step s2) {
		if (!s1.equals(s2)) {
			return new Object[] { match, s1, tm, s2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_10_5_greenBBBBFF(Match match,
			Step s1, TargetModel tm, Step s2) {
		EMoflonEdge tm__s1____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s2____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(s1);
		match.getContextNodes().add(tm);
		match.getContextNodes().add(s2);
		String tm__s1____steps_name_prime = "steps";
		String tm__s2____steps_name_prime = "steps";
		tm__s1____steps.setSrc(tm);
		tm__s1____steps.setTrg(s1);
		match.getContextEdges().add(tm__s1____steps);
		tm__s2____steps.setSrc(tm);
		tm__s2____steps.setTrg(s2);
		match.getContextEdges().add(tm__s2____steps);
		tm__s1____steps.setName(tm__s1____steps_name_prime);
		tm__s2____steps.setName(tm__s2____steps_name_prime);
		return new Object[] { match, s1, tm, s2, tm__s1____steps,
				tm__s2____steps };
	}

	public static final void pattern_NextRule_10_6_expressionBBBBB(
			NextRule _this, Match match, Step s1, TargetModel tm, Step s2) {
		_this.registerObjectsToMatch_BWD(match, s1, tm, s2);

	}

	public static final boolean pattern_NextRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NextRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_NextRule_11_1_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject _localVariable_1 = isApplicableMatch.getObject("e2");
		EObject _localVariable_2 = isApplicableMatch.getObject("s1");
		EObject _localVariable_3 = isApplicableMatch.getObject("e1");
		EObject _localVariable_4 = isApplicableMatch.getObject("tm");
		EObject _localVariable_5 = isApplicableMatch.getObject("smToTm");
		EObject _localVariable_6 = isApplicableMatch.getObject("e1ToS1");
		EObject _localVariable_7 = isApplicableMatch.getObject("e2ToS2");
		EObject _localVariable_8 = isApplicableMatch.getObject("s2");
		EObject tmpSm = _localVariable_0;
		EObject tmpE2 = _localVariable_1;
		EObject tmpS1 = _localVariable_2;
		EObject tmpE1 = _localVariable_3;
		EObject tmpTm = _localVariable_4;
		EObject tmpSmToTm = _localVariable_5;
		EObject tmpE1ToS1 = _localVariable_6;
		EObject tmpE2ToS2 = _localVariable_7;
		EObject tmpS2 = _localVariable_8;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpE2 instanceof Element) {
				Element e2 = (Element) tmpE2;
				if (tmpS1 instanceof Step) {
					Step s1 = (Step) tmpS1;
					if (tmpE1 instanceof Element) {
						Element e1 = (Element) tmpE1;
						if (tmpTm instanceof TargetModel) {
							TargetModel tm = (TargetModel) tmpTm;
							if (tmpSmToTm instanceof SM2TM) {
								SM2TM smToTm = (SM2TM) tmpSmToTm;
								if (tmpE1ToS1 instanceof E2S) {
									E2S e1ToS1 = (E2S) tmpE1ToS1;
									if (tmpE2ToS2 instanceof E2S) {
										E2S e2ToS2 = (E2S) tmpE2ToS2;
										if (tmpS2 instanceof Step) {
											Step s2 = (Step) tmpS2;
											return new Object[] { sm, e2, s1,
													e1, tm, smToTm, e1ToS1,
													e2ToS2, s2,
													isApplicableMatch };
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

	public static final Object[] pattern_NextRule_11_1_blackBBBBBBBBBFBB(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2, NextRule _this,
			IsApplicableMatch isApplicableMatch) {
		if (!s1.equals(s2)) {
			if (!e1.equals(e2)) {
				if (!e1ToS1.equals(e2ToS2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { sm, e2, s1, e1, tm, smToTm,
									e1ToS1, e2ToS2, s2, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_11_1_bindingAndBlackFFFFFFFFFFBB(
			NextRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NextRule_11_1_binding = pattern_NextRule_11_1_bindingFFFFFFFFFB(isApplicableMatch);
		if (result_pattern_NextRule_11_1_binding != null) {
			SourceModel sm = (SourceModel) result_pattern_NextRule_11_1_binding[0];
			Element e2 = (Element) result_pattern_NextRule_11_1_binding[1];
			Step s1 = (Step) result_pattern_NextRule_11_1_binding[2];
			Element e1 = (Element) result_pattern_NextRule_11_1_binding[3];
			TargetModel tm = (TargetModel) result_pattern_NextRule_11_1_binding[4];
			SM2TM smToTm = (SM2TM) result_pattern_NextRule_11_1_binding[5];
			E2S e1ToS1 = (E2S) result_pattern_NextRule_11_1_binding[6];
			E2S e2ToS2 = (E2S) result_pattern_NextRule_11_1_binding[7];
			Step s2 = (Step) result_pattern_NextRule_11_1_binding[8];

			Object[] result_pattern_NextRule_11_1_black = pattern_NextRule_11_1_blackBBBBBBBBBFBB(
					sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2, _this,
					isApplicableMatch);
			if (result_pattern_NextRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_NextRule_11_1_black[9];

				return new Object[] { sm, e2, s1, e1, tm, smToTm, e1ToS1,
						e2ToS2, s2, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_11_1_greenBB(Element e2,
			Element e1) {
		e1.setNext(e2);
		return new Object[] { e2, e1 };
	}

	public static final Object[] pattern_NextRule_11_2_greenF() {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_NextRule_11_3_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject e2, EObject s1,
			EObject e1, EObject tm, EObject smToTm, EObject e1ToS1,
			EObject e2ToS2, EObject s2) {
		if (!sm.equals(tm)) {
			if (!sm.equals(smToTm)) {
				if (!e2.equals(sm)) {
					if (!e2.equals(s1)) {
						if (!e2.equals(tm)) {
							if (!e2.equals(smToTm)) {
								if (!e2.equals(e2ToS2)) {
									if (!e2.equals(s2)) {
										if (!s1.equals(sm)) {
											if (!s1.equals(tm)) {
												if (!s1.equals(smToTm)) {
													if (!s1.equals(s2)) {
														if (!e1.equals(sm)) {
															if (!e1.equals(e2)) {
																if (!e1.equals(s1)) {
																	if (!e1.equals(tm)) {
																		if (!e1.equals(smToTm)) {
																			if (!e1.equals(e1ToS1)) {
																				if (!e1.equals(e2ToS2)) {
																					if (!e1.equals(s2)) {
																						if (!smToTm
																								.equals(tm)) {
																							if (!e1ToS1
																									.equals(sm)) {
																								if (!e1ToS1
																										.equals(e2)) {
																									if (!e1ToS1
																											.equals(s1)) {
																										if (!e1ToS1
																												.equals(tm)) {
																											if (!e1ToS1
																													.equals(smToTm)) {
																												if (!e1ToS1
																														.equals(e2ToS2)) {
																													if (!e1ToS1
																															.equals(s2)) {
																														if (!e2ToS2
																																.equals(sm)) {
																															if (!e2ToS2
																																	.equals(s1)) {
																																if (!e2ToS2
																																		.equals(tm)) {
																																	if (!e2ToS2
																																			.equals(smToTm)) {
																																		if (!e2ToS2
																																				.equals(s2)) {
																																			if (!s2.equals(sm)) {
																																				if (!s2.equals(tm)) {
																																					if (!s2.equals(smToTm)) {
																																						return new Object[] {
																																								ruleresult,
																																								sm,
																																								e2,
																																								s1,
																																								e1,
																																								tm,
																																								smToTm,
																																								e1ToS1,
																																								e2ToS2,
																																								s2 };
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
		return null;
	}

	public static final Object[] pattern_NextRule_11_3_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject e2, EObject s1, EObject e1,
			EObject s2) {
		EMoflonEdge s1__s2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e1__e2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NextRule";
		String s1__s2____next_name_prime = "next";
		String e1__e2____next_name_prime = "next";
		s1__s2____next.setSrc(s1);
		s1__s2____next.setTrg(s2);
		ruleresult.getTranslatedEdges().add(s1__s2____next);
		e1__e2____next.setSrc(e1);
		e1__e2____next.setTrg(e2);
		ruleresult.getCreatedEdges().add(e1__e2____next);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s1__s2____next.setName(s1__s2____next_name_prime);
		e1__e2____next.setName(e1__e2____next_name_prime);
		return new Object[] { ruleresult, e2, s1, e1, s2, s1__s2____next,
				e1__e2____next };
	}

	public static final void pattern_NextRule_11_5_expressionBBBBBBBBBBB(
			NextRule _this, PerformRuleResult ruleresult, EObject sm,
			EObject e2, EObject s1, EObject e1, EObject tm, EObject smToTm,
			EObject e1ToS1, EObject e2ToS2, EObject s2) {
		_this.registerObjects_BWD(ruleresult, sm, e2, s1, e1, tm, smToTm,
				e1ToS1, e2ToS2, s2);

	}

	public static final PerformRuleResult pattern_NextRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NextRule_12_1_bindingFB(NextRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_12_1_blackFBB(EClass eClass,
			NextRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NextRule_12_1_bindingAndBlackFFB(
			NextRule _this) {
		Object[] result_pattern_NextRule_12_1_binding = pattern_NextRule_12_1_bindingFB(_this);
		if (result_pattern_NextRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_NextRule_12_1_binding[0];

			Object[] result_pattern_NextRule_12_1_black = pattern_NextRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_NextRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NextRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "NextRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NextRule_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("s1");
		EObject _localVariable_1 = match.getObject("tm");
		EObject _localVariable_2 = match.getObject("s2");
		EObject tmpS1 = _localVariable_0;
		EObject tmpTm = _localVariable_1;
		EObject tmpS2 = _localVariable_2;
		if (tmpS1 instanceof Step) {
			Step s1 = (Step) tmpS1;
			if (tmpTm instanceof TargetModel) {
				TargetModel tm = (TargetModel) tmpTm;
				if (tmpS2 instanceof Step) {
					Step s2 = (Step) tmpS2;
					return new Object[] { s1, tm, s2, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NextRule_12_2_blackFFBFBFFFBB(
			Step s1, TargetModel tm, Step s2, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!s1.equals(s2)) {
			for (SM2TM smToTm : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tm, SM2TM.class, "target")) {
				SourceModel sm = smToTm.getSource();
				if (sm != null) {
					for (E2S e1ToS1 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(s1, E2S.class, "target")) {
						Element e1 = e1ToS1.getSource();
						if (e1 != null) {
							for (E2S e2ToS2 : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(s2, E2S.class,
											"target")) {
								if (!e1ToS1.equals(e2ToS2)) {
									Element e2 = e2ToS2.getSource();
									if (e2 != null) {
										if (!e1.equals(e2)) {
											_result.add(new Object[] { sm, e2,
													s1, e1, tm, smToTm, e1ToS1,
													e2ToS2, s2, match });
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

	public static final Iterable<Object[]> pattern_NextRule_12_3_blackBBBBBBBBB(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!s1.equals(s2)) {
			if (!e1.equals(e2)) {
				if (!e1ToS1.equals(e2ToS2)) {
					if (sm.getElements().contains(e1)) {
						if (sm.getElements().contains(e2)) {
							if (s2.equals(s1.getNext())) {
								if (tm.getSteps().contains(s1)) {
									if (tm.getSteps().contains(s2)) {
										if (sm.equals(smToTm.getSource())) {
											if (tm.equals(smToTm.getTarget())) {
												if (e1.equals(e1ToS1
														.getSource())) {
													if (s1.equals(e1ToS1
															.getTarget())) {
														if (e2.equals(e2ToS2
																.getSource())) {
															if (s2.equals(e2ToS2
																	.getTarget())) {
																_result.add(new Object[] {
																		sm, e2,
																		s1, e1,
																		tm,
																		smToTm,
																		e1ToS1,
																		e2ToS2,
																		s2 });
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

	public static final Object[] pattern_NextRule_12_3_greenBBBBBBBBBFFFFFFFFFFFF(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge sm__e1____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm__e2____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge s1__s2____next = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s1____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s2____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e1ToS1__e1____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e1ToS1__s1____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2ToS2__e2____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2ToS2__s2____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String sm__e1____elements_name_prime = "elements";
		String sm__e2____elements_name_prime = "elements";
		String s1__s2____next_name_prime = "next";
		String tm__s1____steps_name_prime = "steps";
		String tm__s2____steps_name_prime = "steps";
		String smToTm__sm____source_name_prime = "source";
		String smToTm__tm____target_name_prime = "target";
		String e1ToS1__e1____source_name_prime = "source";
		String e1ToS1__s1____target_name_prime = "target";
		String e2ToS2__e2____source_name_prime = "source";
		String e2ToS2__s2____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(e2);
		isApplicableMatch.getAllContextElements().add(s1);
		isApplicableMatch.getAllContextElements().add(e1);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(smToTm);
		isApplicableMatch.getAllContextElements().add(e1ToS1);
		isApplicableMatch.getAllContextElements().add(e2ToS2);
		isApplicableMatch.getAllContextElements().add(s2);
		sm__e1____elements.setSrc(sm);
		sm__e1____elements.setTrg(e1);
		isApplicableMatch.getAllContextElements().add(sm__e1____elements);
		sm__e2____elements.setSrc(sm);
		sm__e2____elements.setTrg(e2);
		isApplicableMatch.getAllContextElements().add(sm__e2____elements);
		s1__s2____next.setSrc(s1);
		s1__s2____next.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(s1__s2____next);
		tm__s1____steps.setSrc(tm);
		tm__s1____steps.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(tm__s1____steps);
		tm__s2____steps.setSrc(tm);
		tm__s2____steps.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(tm__s2____steps);
		smToTm__sm____source.setSrc(smToTm);
		smToTm__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(smToTm__sm____source);
		smToTm__tm____target.setSrc(smToTm);
		smToTm__tm____target.setTrg(tm);
		isApplicableMatch.getAllContextElements().add(smToTm__tm____target);
		e1ToS1__e1____source.setSrc(e1ToS1);
		e1ToS1__e1____source.setTrg(e1);
		isApplicableMatch.getAllContextElements().add(e1ToS1__e1____source);
		e1ToS1__s1____target.setSrc(e1ToS1);
		e1ToS1__s1____target.setTrg(s1);
		isApplicableMatch.getAllContextElements().add(e1ToS1__s1____target);
		e2ToS2__e2____source.setSrc(e2ToS2);
		e2ToS2__e2____source.setTrg(e2);
		isApplicableMatch.getAllContextElements().add(e2ToS2__e2____source);
		e2ToS2__s2____target.setSrc(e2ToS2);
		e2ToS2__s2____target.setTrg(s2);
		isApplicableMatch.getAllContextElements().add(e2ToS2__s2____target);
		sm__e1____elements.setName(sm__e1____elements_name_prime);
		sm__e2____elements.setName(sm__e2____elements_name_prime);
		s1__s2____next.setName(s1__s2____next_name_prime);
		tm__s1____steps.setName(tm__s1____steps_name_prime);
		tm__s2____steps.setName(tm__s2____steps_name_prime);
		smToTm__sm____source.setName(smToTm__sm____source_name_prime);
		smToTm__tm____target.setName(smToTm__tm____target_name_prime);
		e1ToS1__e1____source.setName(e1ToS1__e1____source_name_prime);
		e1ToS1__s1____target.setName(e1ToS1__s1____target_name_prime);
		e2ToS2__e2____source.setName(e2ToS2__e2____source_name_prime);
		e2ToS2__s2____target.setName(e2ToS2__s2____target_name_prime);
		return new Object[] { sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2,
				isApplicableMatch, sm__e1____elements, sm__e2____elements,
				s1__s2____next, tm__s1____steps, tm__s2____steps,
				smToTm__sm____source, smToTm__tm____target,
				e1ToS1__e1____source, e1ToS1__s1____target,
				e2ToS2__e2____source, e2ToS2__s2____target };
	}

	public static final Object[] pattern_NextRule_12_4_bindingFBBBBBBBBBBB(
			NextRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2,
				s2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, e2, s1,
					e1, tm, smToTm, e1ToS1, e2ToS2, s2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NextRule_12_4_bindingAndBlackFBBBBBBBBBBB(
			NextRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		Object[] result_pattern_NextRule_12_4_binding = pattern_NextRule_12_4_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, sm, e2, s1, e1, tm, smToTm, e1ToS1,
				e2ToS2, s2);
		if (result_pattern_NextRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_NextRule_12_4_binding[0];

			Object[] result_pattern_NextRule_12_4_black = pattern_NextRule_12_4_blackB(csp);
			if (result_pattern_NextRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, e2,
						s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2 };
			}
		}
		return null;
	}

	public static final boolean pattern_NextRule_12_5_expressionFBB(
			NextRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NextRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NextRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NextRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NextRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NextRule_20_1_bindingFB(NextRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_20_1_blackFBB(
			EClass __eClass, NextRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NextRule_20_1_bindingAndBlackFFB(
			NextRule _this) {
		Object[] result_pattern_NextRule_20_1_binding = pattern_NextRule_20_1_bindingFB(_this);
		if (result_pattern_NextRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_NextRule_20_1_binding[0];

			Object[] result_pattern_NextRule_20_1_black = pattern_NextRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_NextRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NextRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_NextRule_20_2_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpS1 = _edge_next.getSrc();
		if (tmpS1 instanceof Step) {
			Step s1 = (Step) tmpS1;
			EObject tmpS2 = _edge_next.getTrg();
			if (tmpS2 instanceof Step) {
				Step s2 = (Step) tmpS2;
				if (!s1.equals(s2)) {
					if (s2.equals(s1.getNext())) {
						for (TargetModel tm : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(s1,
										TargetModel.class, "steps")) {
							if (tm.getSteps().contains(s2)) {
								_result.add(new Object[] { s1, tm, s2,
										_edge_next });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_NextRule_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NextRule_20_3_expressionFBBBBB(
			NextRule _this, Match match, Step s1, TargetModel tm, Step s2) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, s1, tm, s2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NextRule_20_4_expressionFBB(
			NextRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NextRule_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_NextRule_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_NextRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NextRule_21_1_bindingFB(NextRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_21_1_blackFBB(
			EClass __eClass, NextRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NextRule_21_1_bindingAndBlackFFB(
			NextRule _this) {
		Object[] result_pattern_NextRule_21_1_binding = pattern_NextRule_21_1_bindingFB(_this);
		if (result_pattern_NextRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_NextRule_21_1_binding[0];

			Object[] result_pattern_NextRule_21_1_black = pattern_NextRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_NextRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NextRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_NextRule_21_2_blackFFFB(
			EMoflonEdge _edge_next) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpE1 = _edge_next.getSrc();
		if (tmpE1 instanceof Element) {
			Element e1 = (Element) tmpE1;
			EObject tmpE2 = _edge_next.getTrg();
			if (tmpE2 instanceof Element) {
				Element e2 = (Element) tmpE2;
				if (!e1.equals(e2)) {
					if (e2.equals(e1.getNext())) {
						for (SourceModel sm : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(e1,
										SourceModel.class, "elements")) {
							if (sm.getElements().contains(e2)) {
								_result.add(new Object[] { sm, e2, e1,
										_edge_next });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_NextRule_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NextRule_21_3_expressionFBBBBB(
			NextRule _this, Match match, SourceModel sm, Element e2, Element e1) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, sm, e2, e1);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NextRule_21_4_expressionFBB(
			NextRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NextRule_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_NextRule_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_NextRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NextRule_24_1_blackB(NextRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_NextRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SourceModel sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Element e1) {
		if (ruleResult.getSourceObjects().contains(e1)) {
			return new Object[] { ruleResult, e1 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, E2S e1ToS1) {
		if (ruleResult.getCorrObjects().contains(e1ToS1)) {
			return new Object[] { ruleResult, e1ToS1 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Step s1) {
		if (ruleResult.getTargetObjects().contains(s1)) {
			return new Object[] { ruleResult, s1 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TargetModel tm) {
		if (ruleResult.getTargetObjects().contains(tm)) {
			return new Object[] { ruleResult, tm };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Step s2) {
		if (ruleResult.getTargetObjects().contains(s2)) {
			return new Object[] { ruleResult, s2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, E2S e2ToS2) {
		if (ruleResult.getCorrObjects().contains(e2ToS2)) {
			return new Object[] { ruleResult, e2ToS2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Element e2) {
		if (ruleResult.getSourceObjects().contains(e2)) {
			return new Object[] { ruleResult, e2 };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_2_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, SM2TM smToTm) {
		if (ruleResult.getCorrObjects().contains(smToTm)) {
			return new Object[] { ruleResult, smToTm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NextRule_24_2_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList e1ToS1List : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpE1ToS1 : e1ToS1List.getEntryObjects()) {
				if (tmpE1ToS1 instanceof E2S) {
					E2S e1ToS1 = (E2S) tmpE1ToS1;
					Element e1 = e1ToS1.getSource();
					if (e1 != null) {
						Step s1 = e1ToS1.getTarget();
						if (s1 != null) {
							if (pattern_NextRule_24_2_black_nac_2BB(ruleResult,
									e1ToS1) == null) {
								if (pattern_NextRule_24_2_black_nac_1BB(
										ruleResult, e1) == null) {
									if (pattern_NextRule_24_2_black_nac_3BB(
											ruleResult, s1) == null) {
										for (SourceModel sm : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(e1,
														SourceModel.class,
														"elements")) {
											if (pattern_NextRule_24_2_black_nac_0BB(
													ruleResult, sm) == null) {
												for (Element e2 : sm
														.getElements()) {
													if (!e1.equals(e2)) {
														if (pattern_NextRule_24_2_black_nac_7BB(
																ruleResult, e2) == null) {
															for (TargetModel tm : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(
																			s1,
																			TargetModel.class,
																			"steps")) {
																if (pattern_NextRule_24_2_black_nac_4BB(
																		ruleResult,
																		tm) == null) {
																	for (Step s2 : tm
																			.getSteps()) {
																		if (!s1.equals(s2)) {
																			if (pattern_NextRule_24_2_black_nac_5BB(
																					ruleResult,
																					s2) == null) {
																				for (SM2TM smToTm : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								sm,
																								SM2TM.class,
																								"source")) {
																					if (tm.equals(smToTm
																							.getTarget())) {
																						if (pattern_NextRule_24_2_black_nac_8BB(
																								ruleResult,
																								smToTm) == null) {
																							for (E2S e2ToS2 : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											e2,
																											E2S.class,
																											"source")) {
																								if (!e1ToS1
																										.equals(e2ToS2)) {
																									if (s2.equals(e2ToS2
																											.getTarget())) {
																										if (pattern_NextRule_24_2_black_nac_6BB(
																												ruleResult,
																												e2ToS2) == null) {
																											_result.add(new Object[] {
																													e1ToS1List,
																													sm,
																													e1,
																													e1ToS1,
																													s1,
																													tm,
																													s2,
																													e2ToS2,
																													e2,
																													smToTm,
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
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_NextRule_24_3_bindingFBBBBBBBBBBBB(
			NextRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, sm, e2, s1, e1, tm, smToTm, e1ToS1, e2ToS2,
				s2, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, e2, s1,
					e1, tm, smToTm, e1ToS1, e2ToS2, s2, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NextRule_24_3_bindingAndBlackFBBBBBBBBBBBB(
			NextRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_NextRule_24_3_binding = pattern_NextRule_24_3_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, sm, e2, s1, e1, tm, smToTm, e1ToS1,
				e2ToS2, s2, ruleResult);
		if (result_pattern_NextRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_NextRule_24_3_binding[0];

			Object[] result_pattern_NextRule_24_3_black = pattern_NextRule_24_3_blackB(csp);
			if (result_pattern_NextRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, e2,
						s1, e1, tm, smToTm, e1ToS1, e2ToS2, s2, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_NextRule_24_4_expressionFBB(
			NextRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NextRule_24_5_blackBBBBBBBBB(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2) {
		if (!s1.equals(s2)) {
			if (!e1.equals(e2)) {
				if (!e1ToS1.equals(e2ToS2)) {
					return new Object[] { sm, e2, s1, e1, tm, smToTm, e1ToS1,
							e2ToS2, s2 };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_6_blackBBBBBBBBBB(
			SourceModel sm, Element e2, Step s1, Element e1, TargetModel tm,
			SM2TM smToTm, E2S e1ToS1, E2S e2ToS2, Step s2,
			ModelgeneratorRuleResult ruleResult) {
		if (!s1.equals(s2)) {
			if (!e1.equals(e2)) {
				if (!e1ToS1.equals(e2ToS2)) {
					return new Object[] { sm, e2, s1, e1, tm, smToTm, e1ToS1,
							e2ToS2, s2, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NextRule_24_6_greenBBBBB(Element e2,
			Step s1, Element e1, Step s2, ModelgeneratorRuleResult ruleResult) {
		s1.setNext(s2);
		e1.setNext(e2);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { e2, s1, e1, s2, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_NextRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NextRuleImpl
