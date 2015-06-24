/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.Element;
import Source.SourceFactory;
import Source.SourceModel;

import SourceToTargetCorr.E2Sp;

import SourceToTargetCorr.Rules.EA2SRule;
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
 * An implementation of the model object '<em><b>EA2S Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EA2SRuleImpl extends AbstractRuleImpl implements EA2SRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EA2SRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.EA2S_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Element e, SourceModel sm) {
		// initial bindings
		Object[] result1_black = EA2SRuleImpl.pattern_EA2SRule_0_1_blackBBBB(
				this, match, e, sm);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[e] = " + e + ", "
							+ "[sm] = " + sm + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_0_2_bindingAndBlackFBBBB(this, match, e, sm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[e] = " + e + ", "
							+ "[sm] = " + sm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EA2SRuleImpl.pattern_EA2SRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EA2SRuleImpl
					.pattern_EA2SRule_0_4_blackBBB(match, e, sm);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[e] = " + e + ", " + "[sm] = " + sm + ".");
			}
			EA2SRuleImpl.pattern_EA2SRule_0_4_greenBBBF(match, e, sm);
			// EMoflonEdge sm__e____elements = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = EA2SRuleImpl
					.pattern_EA2SRule_0_5_blackBBB(match, e, sm);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[e] = " + e + ", " + "[sm] = " + sm + ".");
			}
			EA2SRuleImpl.pattern_EA2SRule_0_5_greenBB(match, sm);

			// register objects to match
			EA2SRuleImpl
					.pattern_EA2SRule_0_6_expressionBBBB(this, match, e, sm);
			return EA2SRuleImpl.pattern_EA2SRule_0_7_expressionF();
		} else {
			return EA2SRuleImpl.pattern_EA2SRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_1_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Element e = (Element) result1_bindingAndBlack[0];
		SourceModel sm = (SourceModel) result1_bindingAndBlack[1];
		TargetModel tm = (TargetModel) result1_bindingAndBlack[2];
		SM2TM sm2Tm = (SM2TM) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = EA2SRuleImpl.pattern_EA2SRule_1_1_greenBFFFBB(
				e, tm, csp);
		Step s = (Step) result1_green[1];
		Special sp = (Special) result1_green[2];
		E2Sp e2Sp = (E2Sp) result1_green[3];

		// collect translated elements
		Object[] result2_black = EA2SRuleImpl.pattern_EA2SRule_1_2_blackBBBB(e,
				s, sp, e2Sp);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[e] = " + e + ", " + "[s] = "
							+ s + ", " + "[sp] = " + sp + ", " + "[e2Sp] = "
							+ e2Sp + ".");
		}
		Object[] result2_green = EA2SRuleImpl.pattern_EA2SRule_1_2_greenFBBBB(
				e, s, sp, e2Sp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EA2SRuleImpl
				.pattern_EA2SRule_1_3_blackBBBBBBBB(ruleresult, e, s, sp, e2Sp,
						sm, tm, sm2Tm);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[e] = "
							+ e
							+ ", "
							+ "[s] = "
							+ s
							+ ", "
							+ "[sp] = "
							+ sp
							+ ", "
							+ "[e2Sp] = "
							+ e2Sp
							+ ", "
							+ "[sm] = "
							+ sm
							+ ", "
							+ "[tm] = "
							+ tm
							+ ", "
							+ "[sm2Tm] = "
							+ sm2Tm
							+ ".");
		}
		EA2SRuleImpl.pattern_EA2SRule_1_3_greenBBBBBBBFFFFF(ruleresult, e, s,
				sp, e2Sp, sm, tm);
		// EMoflonEdge s__sp____special = (EMoflonEdge) result3_green[7];
		// EMoflonEdge e2Sp__e____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge e2Sp__sp____target = (EMoflonEdge) result3_green[9];
		// EMoflonEdge sm__e____elements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tm__s____steps = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		EA2SRuleImpl.pattern_EA2SRule_1_5_expressionBBBBBBBBB(this, ruleresult,
				e, s, sp, e2Sp, sm, tm, sm2Tm);
		return EA2SRuleImpl.pattern_EA2SRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EA2SRuleImpl
				.pattern_EA2SRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EA2SRuleImpl
				.pattern_EA2SRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Element e = (Element) result2_binding[0];
		SourceModel sm = (SourceModel) result2_binding[1];
		for (Object[] result2_black : EA2SRuleImpl
				.pattern_EA2SRule_2_2_blackBBFFB(e, sm, match)) {
			TargetModel tm = (TargetModel) result2_black[2];
			SM2TM sm2Tm = (SM2TM) result2_black[3];
			// ForEach find context
			for (Object[] result3_black : EA2SRuleImpl
					.pattern_EA2SRule_2_3_blackBBBB(e, sm, tm, sm2Tm)) {
				Object[] result3_green = EA2SRuleImpl
						.pattern_EA2SRule_2_3_greenBBBBFFFF(e, sm, tm, sm2Tm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge sm__e____elements = (EMoflonEdge) result3_green[5];
				// EMoflonEdge sm2Tm__sm____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge sm2Tm__tm____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = EA2SRuleImpl
						.pattern_EA2SRule_2_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, e, sm, tm, sm2Tm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[e] = " + e
									+ ", " + "[sm] = " + sm + ", " + "[tm] = "
									+ tm + ", " + "[sm2Tm] = " + sm2Tm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EA2SRuleImpl.pattern_EA2SRule_2_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EA2SRuleImpl
							.pattern_EA2SRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					EA2SRuleImpl.pattern_EA2SRule_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EA2SRuleImpl.pattern_EA2SRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Element e,
			SourceModel sm) {
		match.registerObject("e", e);
		match.registerObject("sm", sm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Element e, SourceModel sm) {// Create CSP
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
			Element e, SourceModel sm, TargetModel tm, SM2TM sm2Tm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_e_specialAttr = CSPFactoryHelper.eINSTANCE.createVariable(
				"e.specialAttr", true, csp);
		var_e_specialAttr.setValue(e.getSpecialAttr());
		var_e_specialAttr.setType("String");
		Variable var_e_id = CSPFactoryHelper.eINSTANCE.createVariable("e.id",
				true, csp);
		var_e_id.setValue(e.getId());
		var_e_id.setType("String");

		// Create unbound variables
		Variable var_sp_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"sp.value", csp);
		var_sp_value.setType("String");
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id",
				csp);
		var_s_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_e_specialAttr, var_sp_value);
		eq_0.setRuleName("");
		eq_0.solve(var_e_id, var_s_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("e", e);
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
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject e,
			EObject s, EObject sp, EObject e2Sp, EObject sm, EObject tm,
			EObject sm2Tm) {
		ruleresult.registerObject("e", e);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("sp", sp);
		ruleresult.registerObject("e2Sp", e2Sp);
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
		return true && match.getObject("e").eClass()
				.equals(Source.SourcePackage.eINSTANCE.getElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Step s, Special sp,
			TargetModel tm) {
		// initial bindings
		Object[] result1_black = EA2SRuleImpl.pattern_EA2SRule_10_1_blackBBBBB(
				this, match, s, sp, tm);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[s] = " + s + ", "
							+ "[sp] = " + sp + ", " + "[tm] = " + tm + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_10_2_bindingAndBlackFBBBBB(this, match, s,
						sp, tm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[s] = " + s + ", "
							+ "[sp] = " + sp + ", " + "[tm] = " + tm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (EA2SRuleImpl.pattern_EA2SRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = EA2SRuleImpl
					.pattern_EA2SRule_10_4_blackBBBB(match, s, sp, tm);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[s] = " + s + ", " + "[sp] = " + sp + ", "
								+ "[tm] = " + tm + ".");
			}
			EA2SRuleImpl.pattern_EA2SRule_10_4_greenBBBBFF(match, s, sp, tm);
			// EMoflonEdge s__sp____special = (EMoflonEdge) result4_green[4];
			// EMoflonEdge tm__s____steps = (EMoflonEdge) result4_green[5];

			// collect context elements
			Object[] result5_black = EA2SRuleImpl
					.pattern_EA2SRule_10_5_blackBBBB(match, s, sp, tm);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[s] = " + s + ", " + "[sp] = " + sp + ", "
								+ "[tm] = " + tm + ".");
			}
			EA2SRuleImpl.pattern_EA2SRule_10_5_greenBB(match, tm);

			// register objects to match
			EA2SRuleImpl.pattern_EA2SRule_10_6_expressionBBBBB(this, match, s,
					sp, tm);
			return EA2SRuleImpl.pattern_EA2SRule_10_7_expressionF();
		} else {
			return EA2SRuleImpl.pattern_EA2SRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_11_1_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Step s = (Step) result1_bindingAndBlack[0];
		Special sp = (Special) result1_bindingAndBlack[1];
		SourceModel sm = (SourceModel) result1_bindingAndBlack[2];
		TargetModel tm = (TargetModel) result1_bindingAndBlack[3];
		SM2TM sm2Tm = (SM2TM) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EA2SRuleImpl.pattern_EA2SRule_11_1_greenFBFBB(
				sp, sm, csp);
		Element e = (Element) result1_green[0];
		E2Sp e2Sp = (E2Sp) result1_green[2];

		// collect translated elements
		Object[] result2_black = EA2SRuleImpl.pattern_EA2SRule_11_2_blackBBBB(
				e, s, sp, e2Sp);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[e] = " + e + ", " + "[s] = "
							+ s + ", " + "[sp] = " + sp + ", " + "[e2Sp] = "
							+ e2Sp + ".");
		}
		Object[] result2_green = EA2SRuleImpl.pattern_EA2SRule_11_2_greenFBBBB(
				e, s, sp, e2Sp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = EA2SRuleImpl
				.pattern_EA2SRule_11_3_blackBBBBBBBB(ruleresult, e, s, sp,
						e2Sp, sm, tm, sm2Tm);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = "
							+ ruleresult
							+ ", "
							+ "[e] = "
							+ e
							+ ", "
							+ "[s] = "
							+ s
							+ ", "
							+ "[sp] = "
							+ sp
							+ ", "
							+ "[e2Sp] = "
							+ e2Sp
							+ ", "
							+ "[sm] = "
							+ sm
							+ ", "
							+ "[tm] = "
							+ tm
							+ ", "
							+ "[sm2Tm] = "
							+ sm2Tm
							+ ".");
		}
		EA2SRuleImpl.pattern_EA2SRule_11_3_greenBBBBBBBFFFFF(ruleresult, e, s,
				sp, e2Sp, sm, tm);
		// EMoflonEdge s__sp____special = (EMoflonEdge) result3_green[7];
		// EMoflonEdge e2Sp__e____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge e2Sp__sp____target = (EMoflonEdge) result3_green[9];
		// EMoflonEdge sm__e____elements = (EMoflonEdge) result3_green[10];
		// EMoflonEdge tm__s____steps = (EMoflonEdge) result3_green[11];

		// perform postprocessing story node is empty
		// register objects
		EA2SRuleImpl.pattern_EA2SRule_11_5_expressionBBBBBBBBB(this,
				ruleresult, e, s, sp, e2Sp, sm, tm, sm2Tm);
		return EA2SRuleImpl.pattern_EA2SRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EA2SRuleImpl
				.pattern_EA2SRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = EA2SRuleImpl
				.pattern_EA2SRule_12_2_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Step s = (Step) result2_binding[0];
		Special sp = (Special) result2_binding[1];
		TargetModel tm = (TargetModel) result2_binding[2];
		for (Object[] result2_black : EA2SRuleImpl
				.pattern_EA2SRule_12_2_blackBBFBFB(s, sp, tm, match)) {
			SourceModel sm = (SourceModel) result2_black[2];
			SM2TM sm2Tm = (SM2TM) result2_black[4];
			// ForEach find context
			for (Object[] result3_black : EA2SRuleImpl
					.pattern_EA2SRule_12_3_blackBBBBB(s, sp, sm, tm, sm2Tm)) {
				Object[] result3_green = EA2SRuleImpl
						.pattern_EA2SRule_12_3_greenBBBBBFFFFF(s, sp, sm, tm,
								sm2Tm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				// EMoflonEdge s__sp____special = (EMoflonEdge) result3_green[6];
				// EMoflonEdge tm__s____steps = (EMoflonEdge) result3_green[7];
				// EMoflonEdge sm2Tm__sm____source = (EMoflonEdge) result3_green[8];
				// EMoflonEdge sm2Tm__tm____target = (EMoflonEdge) result3_green[9];

				// solve CSP
				Object[] result4_bindingAndBlack = EA2SRuleImpl
						.pattern_EA2SRule_12_4_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, s, sp, sm, tm, sm2Tm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[s] = " + s
									+ ", " + "[sp] = " + sp + ", " + "[sm] = "
									+ sm + ", " + "[tm] = " + tm + ", "
									+ "[sm2Tm] = " + sm2Tm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (EA2SRuleImpl.pattern_EA2SRule_12_5_expressionFBB(this, csp)) {

					// add match to rule result
					Object[] result6_black = EA2SRuleImpl
							.pattern_EA2SRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					EA2SRuleImpl.pattern_EA2SRule_12_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EA2SRuleImpl.pattern_EA2SRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step s, Special sp,
			TargetModel tm) {
		match.registerObject("s", s);
		match.registerObject("sp", sp);
		match.registerObject("tm", tm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step s, Special sp,
			TargetModel tm) {// Create CSP
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
			Step s, Special sp, SourceModel sm, TargetModel tm, SM2TM sm2Tm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sp_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"sp.value", true, csp);
		var_sp_value.setValue(sp.getValue());
		var_sp_value.setType("String");
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id",
				true, csp);
		var_s_id.setValue(s.getId());
		var_s_id.setType("String");

		// Create unbound variables
		Variable var_e_specialAttr = CSPFactoryHelper.eINSTANCE.createVariable(
				"e.specialAttr", csp);
		var_e_specialAttr.setType("String");
		Variable var_e_id = CSPFactoryHelper.eINSTANCE.createVariable("e.id",
				csp);
		var_e_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_e_specialAttr, var_sp_value);
		eq_0.setRuleName("");
		eq_0.solve(var_e_id, var_s_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("sp", sp);
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject e,
			EObject s, EObject sp, EObject e2Sp, EObject sm, EObject tm,
			EObject sm2Tm) {
		ruleresult.registerObject("e", e);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("sp", sp);
		ruleresult.registerObject("e2Sp", e2Sp);
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
		return true
				&& match.getObject("s").eClass()
						.equals(Target.TargetPackage.eINSTANCE.getStep())
				&& match.getObject("sp").eClass()
						.equals(Target.TargetPackage.eINSTANCE.getSpecial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(
			EMoflonEdge _edge_special) {
		// prepare return value
		Object[] result1_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EA2SRuleImpl.pattern_EA2SRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EA2SRuleImpl
				.pattern_EA2SRule_20_2_blackFFFB(_edge_special)) {
			Step s = (Step) result2_black[0];
			Special sp = (Special) result2_black[1];
			TargetModel tm = (TargetModel) result2_black[2];
			Object[] result2_green = EA2SRuleImpl
					.pattern_EA2SRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EA2SRuleImpl.pattern_EA2SRule_20_3_expressionFBBBBB(this,
					match, s, sp, tm)) {
				// Ensure that the correct types of elements are matched
				if (EA2SRuleImpl.pattern_EA2SRule_20_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = EA2SRuleImpl
							.pattern_EA2SRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					EA2SRuleImpl.pattern_EA2SRule_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EA2SRuleImpl.pattern_EA2SRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_elements) {
		// prepare return value
		Object[] result1_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EA2SRuleImpl.pattern_EA2SRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EA2SRuleImpl
				.pattern_EA2SRule_21_2_blackFFB(_edge_elements)) {
			Element e = (Element) result2_black[0];
			SourceModel sm = (SourceModel) result2_black[1];
			Object[] result2_green = EA2SRuleImpl
					.pattern_EA2SRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EA2SRuleImpl.pattern_EA2SRule_21_3_expressionFBBBB(this, match,
					e, sm)) {
				// Ensure that the correct types of elements are matched
				if (EA2SRuleImpl.pattern_EA2SRule_21_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = EA2SRuleImpl
							.pattern_EA2SRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					EA2SRuleImpl.pattern_EA2SRule_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EA2SRuleImpl.pattern_EA2SRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = EA2SRuleImpl
				.pattern_EA2SRule_22_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EA2SRuleImpl.pattern_EA2SRule_22_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : EA2SRuleImpl
				.pattern_EA2SRule_22_2_blackFFFB(_edge_steps)) {
			Step s = (Step) result2_black[0];
			Special sp = (Special) result2_black[1];
			TargetModel tm = (TargetModel) result2_black[2];
			Object[] result2_green = EA2SRuleImpl
					.pattern_EA2SRule_22_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (EA2SRuleImpl.pattern_EA2SRule_22_3_expressionFBBBBB(this,
					match, s, sp, tm)) {
				// Ensure that the correct types of elements are matched
				if (EA2SRuleImpl.pattern_EA2SRule_22_4_expressionFBB(this,
						match)) {

					// Add match to rule result
					Object[] result5_black = EA2SRuleImpl
							.pattern_EA2SRule_22_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					EA2SRuleImpl.pattern_EA2SRule_22_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return EA2SRuleImpl.pattern_EA2SRule_22_6_expressionFB(__result);
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
		Object[] result1_black = EA2SRuleImpl
				.pattern_EA2SRule_25_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EA2SRuleImpl.pattern_EA2SRule_25_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : EA2SRuleImpl
				.pattern_EA2SRule_25_2_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList sm2TmList = (RuleEntryList) result2_black[0];
			SourceModel sm = (SourceModel) result2_black[1];
			SM2TM sm2Tm = (SM2TM) result2_black[2];
			TargetModel tm = (TargetModel) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = EA2SRuleImpl
					.pattern_EA2SRule_25_3_bindingAndBlackFBBBBBB(this,
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
			if (EA2SRuleImpl.pattern_EA2SRule_25_4_expressionFBB(this, csp)) {
				// check nacs
				Object[] result5_black = EA2SRuleImpl
						.pattern_EA2SRule_25_5_blackBBB(sm, tm, sm2Tm);
				if (result5_black != null) {

					// perform
					Object[] result6_black = EA2SRuleImpl
							.pattern_EA2SRule_25_6_blackBBBB(sm, tm, sm2Tm,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[sm] = " + sm
										+ ", " + "[tm] = " + tm + ", "
										+ "[sm2Tm] = " + sm2Tm + ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					EA2SRuleImpl.pattern_EA2SRule_25_6_greenFFFFBBBB(sm, tm,
							ruleResult, csp);
					// Element e = (Element) result6_green[0];
					// Step s = (Step) result6_green[1];
					// Special sp = (Special) result6_green[2];
					// E2Sp e2Sp = (E2Sp) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return EA2SRuleImpl.pattern_EA2SRule_25_7_expressionFB(ruleResult);
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
		Variable var_e_specialAttr = CSPFactoryHelper.eINSTANCE.createVariable(
				"e.specialAttr", csp);
		var_e_specialAttr.setType("String");
		Variable var_sp_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"sp.value", csp);
		var_sp_value.setType("String");
		Variable var_e_id = CSPFactoryHelper.eINSTANCE.createVariable("e.id",
				csp);
		var_e_id.setType("String");
		Variable var_s_id = CSPFactoryHelper.eINSTANCE.createVariable("s.id",
				csp);
		var_s_id.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_e_specialAttr, var_sp_value);
		eq_0.setRuleName("");
		eq_0.solve(var_e_id, var_s_id);

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
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENT_SOURCEMODEL:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Element) arguments.get(1), (SourceModel) arguments.get(2));
		case RulesPackage.EA2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EA2S_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENT_SOURCEMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Element) arguments.get(1), (SourceModel) arguments.get(2));
			return null;
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENT_SOURCEMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Element) arguments.get(1), (SourceModel) arguments.get(2));
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENT_SOURCEMODEL_TARGETMODEL_SM2TM:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Element) arguments.get(1), (SourceModel) arguments.get(2),
					(TargetModel) arguments.get(3), (SM2TM) arguments.get(4));
		case RulesPackage.EA2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.EA2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.EA2S_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_SPECIAL_TARGETMODEL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (Special) arguments.get(2),
					(TargetModel) arguments.get(3));
		case RulesPackage.EA2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.EA2S_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_SPECIAL_TARGETMODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (Special) arguments.get(2),
					(TargetModel) arguments.get(3));
			return null;
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_SPECIAL_TARGETMODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (Special) arguments.get(2),
					(TargetModel) arguments.get(3));
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEP_SPECIAL_SOURCEMODEL_TARGETMODEL_SM2TM:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Step) arguments.get(1), (Special) arguments.get(2),
					(SourceModel) arguments.get(3),
					(TargetModel) arguments.get(4), (SM2TM) arguments.get(5));
		case RulesPackage.EA2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.EA2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6),
					(EObject) arguments.get(7));
			return null;
		case RulesPackage.EA2S_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EA2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.EA2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.EA2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.EA2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SM2TM) arguments.get(1));
		case RulesPackage.EA2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1),
					(TargetModel) arguments.get(2), (SM2TM) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.EA2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EA2SRule_0_1_blackBBBB(EA2SRule _this,
			Match match, Element e, SourceModel sm) {
		return new Object[] { _this, match, e, sm };
	}

	public static final Object[] pattern_EA2SRule_0_2_bindingFBBBB(
			EA2SRule _this, Match match, Element e, SourceModel sm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, e, sm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, e, sm };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EA2SRule_0_2_bindingAndBlackFBBBB(
			EA2SRule _this, Match match, Element e, SourceModel sm) {
		Object[] result_pattern_EA2SRule_0_2_binding = pattern_EA2SRule_0_2_bindingFBBBB(
				_this, match, e, sm);
		if (result_pattern_EA2SRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_EA2SRule_0_2_binding[0];

			Object[] result_pattern_EA2SRule_0_2_black = pattern_EA2SRule_0_2_blackB(csp);
			if (result_pattern_EA2SRule_0_2_black != null) {

				return new Object[] { csp, _this, match, e, sm };
			}
		}
		return null;
	}

	public static final boolean pattern_EA2SRule_0_3_expressionFBB(
			EA2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_0_4_blackBBB(Match match,
			Element e, SourceModel sm) {
		return new Object[] { match, e, sm };
	}

	public static final Object[] pattern_EA2SRule_0_4_greenBBBF(Match match,
			Element e, SourceModel sm) {
		EMoflonEdge sm__e____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(e);
		String sm__e____elements_name_prime = "elements";
		sm__e____elements.setSrc(sm);
		sm__e____elements.setTrg(e);
		match.getToBeTranslatedEdges().add(sm__e____elements);
		sm__e____elements.setName(sm__e____elements_name_prime);
		return new Object[] { match, e, sm, sm__e____elements };
	}

	public static final Object[] pattern_EA2SRule_0_5_blackBBB(Match match,
			Element e, SourceModel sm) {
		return new Object[] { match, e, sm };
	}

	public static final Object[] pattern_EA2SRule_0_5_greenBB(Match match,
			SourceModel sm) {
		match.getContextNodes().add(sm);
		return new Object[] { match, sm };
	}

	public static final void pattern_EA2SRule_0_6_expressionBBBB(
			EA2SRule _this, Match match, Element e, SourceModel sm) {
		_this.registerObjectsToMatch_FWD(match, e, sm);

	}

	public static final boolean pattern_EA2SRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EA2SRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("e");
		EObject _localVariable_1 = isApplicableMatch.getObject("sm");
		EObject _localVariable_2 = isApplicableMatch.getObject("tm");
		EObject _localVariable_3 = isApplicableMatch.getObject("sm2Tm");
		EObject tmpE = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		EObject tmpTm = _localVariable_2;
		EObject tmpSm2Tm = _localVariable_3;
		if (tmpE instanceof Element) {
			Element e = (Element) tmpE;
			if (tmpSm instanceof SourceModel) {
				SourceModel sm = (SourceModel) tmpSm;
				if (tmpTm instanceof TargetModel) {
					TargetModel tm = (TargetModel) tmpTm;
					if (tmpSm2Tm instanceof SM2TM) {
						SM2TM sm2Tm = (SM2TM) tmpSm2Tm;
						return new Object[] { e, sm, tm, sm2Tm,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_1_1_blackBBBBFBB(Element e,
			SourceModel sm, TargetModel tm, SM2TM sm2Tm, EA2SRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { e, sm, tm, sm2Tm, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_1_1_bindingAndBlackFFFFFBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EA2SRule_1_1_binding = pattern_EA2SRule_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_EA2SRule_1_1_binding != null) {
			Element e = (Element) result_pattern_EA2SRule_1_1_binding[0];
			SourceModel sm = (SourceModel) result_pattern_EA2SRule_1_1_binding[1];
			TargetModel tm = (TargetModel) result_pattern_EA2SRule_1_1_binding[2];
			SM2TM sm2Tm = (SM2TM) result_pattern_EA2SRule_1_1_binding[3];

			Object[] result_pattern_EA2SRule_1_1_black = pattern_EA2SRule_1_1_blackBBBBFBB(
					e, sm, tm, sm2Tm, _this, isApplicableMatch);
			if (result_pattern_EA2SRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_EA2SRule_1_1_black[4];

				return new Object[] { e, sm, tm, sm2Tm, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_1_1_greenBFFFBB(Element e,
			TargetModel tm, CSP csp) {
		Step s = TargetFactory.eINSTANCE.createStep();
		Special sp = TargetFactory.eINSTANCE.createSpecial();
		E2Sp e2Sp = SourceToTargetCorrFactory.eINSTANCE.createE2Sp();
		Object _localVariable_0 = csp.getValue("s", "id");
		Object _localVariable_1 = csp.getValue("sp", "value");
		tm.getSteps().add(s);
		s.setSpecial(sp);
		e2Sp.setSource(e);
		e2Sp.setTarget(sp);
		String s_id_prime = (String) _localVariable_0;
		String sp_value_prime = (String) _localVariable_1;
		s.setId(s_id_prime);
		sp.setValue(sp_value_prime);
		return new Object[] { e, s, sp, e2Sp, tm, csp };
	}

	public static final Object[] pattern_EA2SRule_1_2_blackBBBB(Element e,
			Step s, Special sp, E2Sp e2Sp) {
		return new Object[] { e, s, sp, e2Sp };
	}

	public static final Object[] pattern_EA2SRule_1_2_greenFBBBB(Element e,
			Step s, Special sp, E2Sp e2Sp) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(e);
		ruleresult.getCreatedElements().add(s);
		ruleresult.getCreatedElements().add(sp);
		ruleresult.getCreatedLinkElements().add(e2Sp);
		return new Object[] { ruleresult, e, s, sp, e2Sp };
	}

	public static final Object[] pattern_EA2SRule_1_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject sp,
			EObject e2Sp, EObject sm, EObject tm, EObject sm2Tm) {
		if (!e.equals(s)) {
			if (!e.equals(sp)) {
				if (!e.equals(e2Sp)) {
					if (!e.equals(sm)) {
						if (!e.equals(tm)) {
							if (!e.equals(sm2Tm)) {
								if (!s.equals(sp)) {
									if (!s.equals(sm)) {
										if (!s.equals(tm)) {
											if (!s.equals(sm2Tm)) {
												if (!sp.equals(tm)) {
													if (!e2Sp.equals(s)) {
														if (!e2Sp.equals(sp)) {
															if (!e2Sp
																	.equals(sm)) {
																if (!e2Sp
																		.equals(tm)) {
																	if (!e2Sp
																			.equals(sm2Tm)) {
																		if (!sm.equals(sp)) {
																			if (!sm.equals(tm)) {
																				if (!sm.equals(sm2Tm)) {
																					if (!sm2Tm
																							.equals(sp)) {
																						if (!sm2Tm
																								.equals(tm)) {
																							return new Object[] {
																									ruleresult,
																									e,
																									s,
																									sp,
																									e2Sp,
																									sm,
																									tm,
																									sm2Tm };
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

	public static final Object[] pattern_EA2SRule_1_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject sp,
			EObject e2Sp, EObject sm, EObject tm) {
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2Sp__e____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2Sp__sp____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm__e____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EA2SRule";
		String s__sp____special_name_prime = "special";
		String e2Sp__e____source_name_prime = "source";
		String e2Sp__sp____target_name_prime = "target";
		String sm__e____elements_name_prime = "elements";
		String tm__s____steps_name_prime = "steps";
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		ruleresult.getCreatedEdges().add(s__sp____special);
		e2Sp__e____source.setSrc(e2Sp);
		e2Sp__e____source.setTrg(e);
		ruleresult.getCreatedEdges().add(e2Sp__e____source);
		e2Sp__sp____target.setSrc(e2Sp);
		e2Sp__sp____target.setTrg(sp);
		ruleresult.getCreatedEdges().add(e2Sp__sp____target);
		sm__e____elements.setSrc(sm);
		sm__e____elements.setTrg(e);
		ruleresult.getTranslatedEdges().add(sm__e____elements);
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		ruleresult.getCreatedEdges().add(tm__s____steps);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__sp____special.setName(s__sp____special_name_prime);
		e2Sp__e____source.setName(e2Sp__e____source_name_prime);
		e2Sp__sp____target.setName(e2Sp__sp____target_name_prime);
		sm__e____elements.setName(sm__e____elements_name_prime);
		tm__s____steps.setName(tm__s____steps_name_prime);
		return new Object[] { ruleresult, e, s, sp, e2Sp, sm, tm,
				s__sp____special, e2Sp__e____source, e2Sp__sp____target,
				sm__e____elements, tm__s____steps };
	}

	public static final void pattern_EA2SRule_1_5_expressionBBBBBBBBB(
			EA2SRule _this, PerformRuleResult ruleresult, EObject e, EObject s,
			EObject sp, EObject e2Sp, EObject sm, EObject tm, EObject sm2Tm) {
		_this.registerObjects_FWD(ruleresult, e, s, sp, e2Sp, sm, tm, sm2Tm);

	}

	public static final PerformRuleResult pattern_EA2SRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_2_1_bindingFB(EA2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_2_1_blackFBB(EClass eClass,
			EA2SRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_2_1_bindingAndBlackFFB(
			EA2SRule _this) {
		Object[] result_pattern_EA2SRule_2_1_binding = pattern_EA2SRule_2_1_bindingFB(_this);
		if (result_pattern_EA2SRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EA2SRule_2_1_binding[0];

			Object[] result_pattern_EA2SRule_2_1_black = pattern_EA2SRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_EA2SRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EA2SRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EA2SRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EA2SRule_2_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("e");
		EObject _localVariable_1 = match.getObject("sm");
		EObject tmpE = _localVariable_0;
		EObject tmpSm = _localVariable_1;
		if (tmpE instanceof Element) {
			Element e = (Element) tmpE;
			if (tmpSm instanceof SourceModel) {
				SourceModel sm = (SourceModel) tmpSm;
				return new Object[] { e, sm, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_2_2_blackBBFFB(
			Element e, SourceModel sm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2TM sm2Tm : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sm, SM2TM.class, "source")) {
			TargetModel tm = sm2Tm.getTarget();
			if (tm != null) {
				_result.add(new Object[] { e, sm, tm, sm2Tm, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_2_3_blackBBBB(
			Element e, SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sm.getElements().contains(e)) {
			if (sm.equals(sm2Tm.getSource())) {
				if (tm.equals(sm2Tm.getTarget())) {
					_result.add(new Object[] { e, sm, tm, sm2Tm });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EA2SRule_2_3_greenBBBBFFFF(Element e,
			SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
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
		isApplicableMatch.getAllContextElements().add(e);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(sm2Tm);
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
		return new Object[] { e, sm, tm, sm2Tm, isApplicableMatch,
				sm__e____elements, sm2Tm__sm____source, sm2Tm__tm____target };
	}

	public static final Object[] pattern_EA2SRule_2_4_bindingFBBBBBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch, Element e,
			SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, e, sm, tm, sm2Tm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, e, sm, tm,
					sm2Tm };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EA2SRule_2_4_bindingAndBlackFBBBBBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch, Element e,
			SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
		Object[] result_pattern_EA2SRule_2_4_binding = pattern_EA2SRule_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, e, sm, tm, sm2Tm);
		if (result_pattern_EA2SRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_EA2SRule_2_4_binding[0];

			Object[] result_pattern_EA2SRule_2_4_black = pattern_EA2SRule_2_4_blackB(csp);
			if (result_pattern_EA2SRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, e, sm, tm,
						sm2Tm };
			}
		}
		return null;
	}

	public static final boolean pattern_EA2SRule_2_5_expressionFBB(
			EA2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EA2SRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EA2SRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EA2SRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_10_1_blackBBBBB(
			EA2SRule _this, Match match, Step s, Special sp, TargetModel tm) {
		return new Object[] { _this, match, s, sp, tm };
	}

	public static final Object[] pattern_EA2SRule_10_2_bindingFBBBBB(
			EA2SRule _this, Match match, Step s, Special sp, TargetModel tm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, s, sp,
				tm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s, sp, tm };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EA2SRule_10_2_bindingAndBlackFBBBBB(
			EA2SRule _this, Match match, Step s, Special sp, TargetModel tm) {
		Object[] result_pattern_EA2SRule_10_2_binding = pattern_EA2SRule_10_2_bindingFBBBBB(
				_this, match, s, sp, tm);
		if (result_pattern_EA2SRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_EA2SRule_10_2_binding[0];

			Object[] result_pattern_EA2SRule_10_2_black = pattern_EA2SRule_10_2_blackB(csp);
			if (result_pattern_EA2SRule_10_2_black != null) {

				return new Object[] { csp, _this, match, s, sp, tm };
			}
		}
		return null;
	}

	public static final boolean pattern_EA2SRule_10_3_expressionFBB(
			EA2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_10_4_blackBBBB(Match match,
			Step s, Special sp, TargetModel tm) {
		return new Object[] { match, s, sp, tm };
	}

	public static final Object[] pattern_EA2SRule_10_4_greenBBBBFF(Match match,
			Step s, Special sp, TargetModel tm) {
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(s);
		match.getToBeTranslatedNodes().add(sp);
		String s__sp____special_name_prime = "special";
		String tm__s____steps_name_prime = "steps";
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		match.getToBeTranslatedEdges().add(s__sp____special);
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		match.getToBeTranslatedEdges().add(tm__s____steps);
		s__sp____special.setName(s__sp____special_name_prime);
		tm__s____steps.setName(tm__s____steps_name_prime);
		return new Object[] { match, s, sp, tm, s__sp____special,
				tm__s____steps };
	}

	public static final Object[] pattern_EA2SRule_10_5_blackBBBB(Match match,
			Step s, Special sp, TargetModel tm) {
		return new Object[] { match, s, sp, tm };
	}

	public static final Object[] pattern_EA2SRule_10_5_greenBB(Match match,
			TargetModel tm) {
		match.getContextNodes().add(tm);
		return new Object[] { match, tm };
	}

	public static final void pattern_EA2SRule_10_6_expressionBBBBB(
			EA2SRule _this, Match match, Step s, Special sp, TargetModel tm) {
		_this.registerObjectsToMatch_BWD(match, s, sp, tm);

	}

	public static final boolean pattern_EA2SRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EA2SRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_11_1_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("s");
		EObject _localVariable_1 = isApplicableMatch.getObject("sp");
		EObject _localVariable_2 = isApplicableMatch.getObject("sm");
		EObject _localVariable_3 = isApplicableMatch.getObject("tm");
		EObject _localVariable_4 = isApplicableMatch.getObject("sm2Tm");
		EObject tmpS = _localVariable_0;
		EObject tmpSp = _localVariable_1;
		EObject tmpSm = _localVariable_2;
		EObject tmpTm = _localVariable_3;
		EObject tmpSm2Tm = _localVariable_4;
		if (tmpS instanceof Step) {
			Step s = (Step) tmpS;
			if (tmpSp instanceof Special) {
				Special sp = (Special) tmpSp;
				if (tmpSm instanceof SourceModel) {
					SourceModel sm = (SourceModel) tmpSm;
					if (tmpTm instanceof TargetModel) {
						TargetModel tm = (TargetModel) tmpTm;
						if (tmpSm2Tm instanceof SM2TM) {
							SM2TM sm2Tm = (SM2TM) tmpSm2Tm;
							return new Object[] { s, sp, sm, tm, sm2Tm,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_11_1_blackBBBBBFBB(Step s,
			Special sp, SourceModel sm, TargetModel tm, SM2TM sm2Tm,
			EA2SRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { s, sp, sm, tm, sm2Tm, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_11_1_bindingAndBlackFFFFFFBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EA2SRule_11_1_binding = pattern_EA2SRule_11_1_bindingFFFFFB(isApplicableMatch);
		if (result_pattern_EA2SRule_11_1_binding != null) {
			Step s = (Step) result_pattern_EA2SRule_11_1_binding[0];
			Special sp = (Special) result_pattern_EA2SRule_11_1_binding[1];
			SourceModel sm = (SourceModel) result_pattern_EA2SRule_11_1_binding[2];
			TargetModel tm = (TargetModel) result_pattern_EA2SRule_11_1_binding[3];
			SM2TM sm2Tm = (SM2TM) result_pattern_EA2SRule_11_1_binding[4];

			Object[] result_pattern_EA2SRule_11_1_black = pattern_EA2SRule_11_1_blackBBBBBFBB(
					s, sp, sm, tm, sm2Tm, _this, isApplicableMatch);
			if (result_pattern_EA2SRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_EA2SRule_11_1_black[5];

				return new Object[] { s, sp, sm, tm, sm2Tm, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_11_1_greenFBFBB(Special sp,
			SourceModel sm, CSP csp) {
		Element e = SourceFactory.eINSTANCE.createElement();
		E2Sp e2Sp = SourceToTargetCorrFactory.eINSTANCE.createE2Sp();
		Object _localVariable_0 = csp.getValue("e", "specialAttr");
		Object _localVariable_1 = csp.getValue("e", "id");
		sm.getElements().add(e);
		e2Sp.setSource(e);
		e2Sp.setTarget(sp);
		String e_specialAttr_prime = (String) _localVariable_0;
		String e_id_prime = (String) _localVariable_1;
		e.setSpecialAttr(e_specialAttr_prime);
		e.setId(e_id_prime);
		return new Object[] { e, sp, e2Sp, sm, csp };
	}

	public static final Object[] pattern_EA2SRule_11_2_blackBBBB(Element e,
			Step s, Special sp, E2Sp e2Sp) {
		return new Object[] { e, s, sp, e2Sp };
	}

	public static final Object[] pattern_EA2SRule_11_2_greenFBBBB(Element e,
			Step s, Special sp, E2Sp e2Sp) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(e);
		ruleresult.getTranslatedElements().add(s);
		ruleresult.getTranslatedElements().add(sp);
		ruleresult.getCreatedLinkElements().add(e2Sp);
		return new Object[] { ruleresult, e, s, sp, e2Sp };
	}

	public static final Object[] pattern_EA2SRule_11_3_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject sp,
			EObject e2Sp, EObject sm, EObject tm, EObject sm2Tm) {
		if (!e.equals(s)) {
			if (!e.equals(sp)) {
				if (!e.equals(e2Sp)) {
					if (!e.equals(sm)) {
						if (!e.equals(tm)) {
							if (!e.equals(sm2Tm)) {
								if (!s.equals(sp)) {
									if (!s.equals(sm)) {
										if (!s.equals(tm)) {
											if (!s.equals(sm2Tm)) {
												if (!sp.equals(tm)) {
													if (!e2Sp.equals(s)) {
														if (!e2Sp.equals(sp)) {
															if (!e2Sp
																	.equals(sm)) {
																if (!e2Sp
																		.equals(tm)) {
																	if (!e2Sp
																			.equals(sm2Tm)) {
																		if (!sm.equals(sp)) {
																			if (!sm.equals(tm)) {
																				if (!sm.equals(sm2Tm)) {
																					if (!sm2Tm
																							.equals(sp)) {
																						if (!sm2Tm
																								.equals(tm)) {
																							return new Object[] {
																									ruleresult,
																									e,
																									s,
																									sp,
																									e2Sp,
																									sm,
																									tm,
																									sm2Tm };
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

	public static final Object[] pattern_EA2SRule_11_3_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject sp,
			EObject e2Sp, EObject sm, EObject tm) {
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2Sp__e____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2Sp__sp____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm__e____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EA2SRule";
		String s__sp____special_name_prime = "special";
		String e2Sp__e____source_name_prime = "source";
		String e2Sp__sp____target_name_prime = "target";
		String sm__e____elements_name_prime = "elements";
		String tm__s____steps_name_prime = "steps";
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		ruleresult.getTranslatedEdges().add(s__sp____special);
		e2Sp__e____source.setSrc(e2Sp);
		e2Sp__e____source.setTrg(e);
		ruleresult.getCreatedEdges().add(e2Sp__e____source);
		e2Sp__sp____target.setSrc(e2Sp);
		e2Sp__sp____target.setTrg(sp);
		ruleresult.getCreatedEdges().add(e2Sp__sp____target);
		sm__e____elements.setSrc(sm);
		sm__e____elements.setTrg(e);
		ruleresult.getCreatedEdges().add(sm__e____elements);
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		ruleresult.getTranslatedEdges().add(tm__s____steps);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		s__sp____special.setName(s__sp____special_name_prime);
		e2Sp__e____source.setName(e2Sp__e____source_name_prime);
		e2Sp__sp____target.setName(e2Sp__sp____target_name_prime);
		sm__e____elements.setName(sm__e____elements_name_prime);
		tm__s____steps.setName(tm__s____steps_name_prime);
		return new Object[] { ruleresult, e, s, sp, e2Sp, sm, tm,
				s__sp____special, e2Sp__e____source, e2Sp__sp____target,
				sm__e____elements, tm__s____steps };
	}

	public static final void pattern_EA2SRule_11_5_expressionBBBBBBBBB(
			EA2SRule _this, PerformRuleResult ruleresult, EObject e, EObject s,
			EObject sp, EObject e2Sp, EObject sm, EObject tm, EObject sm2Tm) {
		_this.registerObjects_BWD(ruleresult, e, s, sp, e2Sp, sm, tm, sm2Tm);

	}

	public static final PerformRuleResult pattern_EA2SRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_12_1_bindingFB(EA2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_12_1_blackFBB(EClass eClass,
			EA2SRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_12_1_bindingAndBlackFFB(
			EA2SRule _this) {
		Object[] result_pattern_EA2SRule_12_1_binding = pattern_EA2SRule_12_1_bindingFB(_this);
		if (result_pattern_EA2SRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_EA2SRule_12_1_binding[0];

			Object[] result_pattern_EA2SRule_12_1_black = pattern_EA2SRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_EA2SRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EA2SRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "EA2SRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EA2SRule_12_2_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("s");
		EObject _localVariable_1 = match.getObject("sp");
		EObject _localVariable_2 = match.getObject("tm");
		EObject tmpS = _localVariable_0;
		EObject tmpSp = _localVariable_1;
		EObject tmpTm = _localVariable_2;
		if (tmpS instanceof Step) {
			Step s = (Step) tmpS;
			if (tmpSp instanceof Special) {
				Special sp = (Special) tmpSp;
				if (tmpTm instanceof TargetModel) {
					TargetModel tm = (TargetModel) tmpTm;
					return new Object[] { s, sp, tm, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_12_2_blackBBFBFB(
			Step s, Special sp, TargetModel tm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2TM sm2Tm : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tm, SM2TM.class, "target")) {
			SourceModel sm = sm2Tm.getSource();
			if (sm != null) {
				_result.add(new Object[] { s, sp, sm, tm, sm2Tm, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_12_3_blackBBBBB(
			Step s, Special sp, SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sp.equals(s.getSpecial())) {
			if (tm.getSteps().contains(s)) {
				if (sm.equals(sm2Tm.getSource())) {
					if (tm.equals(sm2Tm.getTarget())) {
						_result.add(new Object[] { s, sp, sm, tm, sm2Tm });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EA2SRule_12_3_greenBBBBBFFFFF(Step s,
			Special sp, SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__s____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sm2Tm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String s__sp____special_name_prime = "special";
		String tm__s____steps_name_prime = "steps";
		String sm2Tm__sm____source_name_prime = "source";
		String sm2Tm__tm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(sp);
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(sm2Tm);
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		isApplicableMatch.getAllContextElements().add(s__sp____special);
		tm__s____steps.setSrc(tm);
		tm__s____steps.setTrg(s);
		isApplicableMatch.getAllContextElements().add(tm__s____steps);
		sm2Tm__sm____source.setSrc(sm2Tm);
		sm2Tm__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(sm2Tm__sm____source);
		sm2Tm__tm____target.setSrc(sm2Tm);
		sm2Tm__tm____target.setTrg(tm);
		isApplicableMatch.getAllContextElements().add(sm2Tm__tm____target);
		s__sp____special.setName(s__sp____special_name_prime);
		tm__s____steps.setName(tm__s____steps_name_prime);
		sm2Tm__sm____source.setName(sm2Tm__sm____source_name_prime);
		sm2Tm__tm____target.setName(sm2Tm__tm____target_name_prime);
		return new Object[] { s, sp, sm, tm, sm2Tm, isApplicableMatch,
				s__sp____special, tm__s____steps, sm2Tm__sm____source,
				sm2Tm__tm____target };
	}

	public static final Object[] pattern_EA2SRule_12_4_bindingFBBBBBBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch, Step s,
			Special sp, SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, s, sp, sm, tm, sm2Tm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, s, sp, sm, tm,
					sm2Tm };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EA2SRule_12_4_bindingAndBlackFBBBBBBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch, Step s,
			Special sp, SourceModel sm, TargetModel tm, SM2TM sm2Tm) {
		Object[] result_pattern_EA2SRule_12_4_binding = pattern_EA2SRule_12_4_bindingFBBBBBBB(
				_this, isApplicableMatch, s, sp, sm, tm, sm2Tm);
		if (result_pattern_EA2SRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_EA2SRule_12_4_binding[0];

			Object[] result_pattern_EA2SRule_12_4_black = pattern_EA2SRule_12_4_blackB(csp);
			if (result_pattern_EA2SRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, s, sp, sm,
						tm, sm2Tm };
			}
		}
		return null;
	}

	public static final boolean pattern_EA2SRule_12_5_expressionFBB(
			EA2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EA2SRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EA2SRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EA2SRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_20_1_bindingFB(EA2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_20_1_blackFBB(
			EClass __eClass, EA2SRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_20_1_bindingAndBlackFFB(
			EA2SRule _this) {
		Object[] result_pattern_EA2SRule_20_1_binding = pattern_EA2SRule_20_1_bindingFB(_this);
		if (result_pattern_EA2SRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EA2SRule_20_1_binding[0];

			Object[] result_pattern_EA2SRule_20_1_black = pattern_EA2SRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EA2SRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EA2SRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EA2SRule_20_2_black_nac_0BB(Step s,
			TargetModel tm) {
		for (TargetModel __DEC_s_steps_930270 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(s, TargetModel.class, "steps")) {
			if (!tm.equals(__DEC_s_steps_930270)) {
				return new Object[] { s, tm };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_20_2_black_nac_1BB(
			Special sp, Step s) {
		for (Step __DEC_sp_special_153120 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sp, Step.class, "special")) {
			if (!s.equals(__DEC_sp_special_153120)) {
				return new Object[] { sp, s };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_20_2_blackFFFB(
			EMoflonEdge _edge_special) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpS = _edge_special.getSrc();
		if (tmpS instanceof Step) {
			Step s = (Step) tmpS;
			EObject tmpSp = _edge_special.getTrg();
			if (tmpSp instanceof Special) {
				Special sp = (Special) tmpSp;
				if (sp.equals(s.getSpecial())) {
					if (pattern_EA2SRule_20_2_black_nac_1BB(sp, s) == null) {
						for (TargetModel tm : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(s,
										TargetModel.class, "steps")) {
							if (pattern_EA2SRule_20_2_black_nac_0BB(s, tm) == null) {
								_result.add(new Object[] { s, sp, tm,
										_edge_special });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EA2SRule_20_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EA2SRule_20_3_expressionFBBBBB(
			EA2SRule _this, Match match, Step s, Special sp, TargetModel tm) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, s, sp, tm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EA2SRule_20_4_expressionFBB(
			EA2SRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EA2SRule_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EA2SRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_21_1_bindingFB(EA2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_21_1_blackFBB(
			EClass __eClass, EA2SRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_21_1_bindingAndBlackFFB(
			EA2SRule _this) {
		Object[] result_pattern_EA2SRule_21_1_binding = pattern_EA2SRule_21_1_bindingFB(_this);
		if (result_pattern_EA2SRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EA2SRule_21_1_binding[0];

			Object[] result_pattern_EA2SRule_21_1_black = pattern_EA2SRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EA2SRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EA2SRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EA2SRule_21_2_black_nac_0BB(Element e,
			SourceModel sm) {
		for (SourceModel __DEC_e_elements_264006 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(e, SourceModel.class, "elements")) {
			if (!sm.equals(__DEC_e_elements_264006)) {
				return new Object[] { e, sm };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_21_2_blackFFB(
			EMoflonEdge _edge_elements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSm = _edge_elements.getSrc();
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			EObject tmpE = _edge_elements.getTrg();
			if (tmpE instanceof Element) {
				Element e = (Element) tmpE;
				if (sm.getElements().contains(e)) {
					if (pattern_EA2SRule_21_2_black_nac_0BB(e, sm) == null) {
						_result.add(new Object[] { e, sm, _edge_elements });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EA2SRule_21_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EA2SRule_21_3_expressionFBBBB(
			EA2SRule _this, Match match, Element e, SourceModel sm) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, e, sm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EA2SRule_21_4_expressionFBB(
			EA2SRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EA2SRule_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EA2SRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_22_1_bindingFB(EA2SRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_22_1_blackFBB(
			EClass __eClass, EA2SRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_22_1_bindingAndBlackFFB(
			EA2SRule _this) {
		Object[] result_pattern_EA2SRule_22_1_binding = pattern_EA2SRule_22_1_bindingFB(_this);
		if (result_pattern_EA2SRule_22_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_EA2SRule_22_1_binding[0];

			Object[] result_pattern_EA2SRule_22_1_black = pattern_EA2SRule_22_1_blackFBB(
					__eClass, _this);
			if (result_pattern_EA2SRule_22_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EA2SRule_22_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_22_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EA2SRule_22_2_black_nac_0BB(Step s,
			TargetModel tm) {
		for (TargetModel __DEC_s_steps_51109 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(s, TargetModel.class, "steps")) {
			if (!tm.equals(__DEC_s_steps_51109)) {
				return new Object[] { s, tm };
			}
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_22_2_black_nac_1BB(
			Special sp, Step s) {
		for (Step __DEC_sp_special_947429 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sp, Step.class, "special")) {
			if (!s.equals(__DEC_sp_special_947429)) {
				return new Object[] { sp, s };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_22_2_blackFFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTm = _edge_steps.getSrc();
		if (tmpTm instanceof TargetModel) {
			TargetModel tm = (TargetModel) tmpTm;
			EObject tmpS = _edge_steps.getTrg();
			if (tmpS instanceof Step) {
				Step s = (Step) tmpS;
				if (tm.getSteps().contains(s)) {
					Special sp = s.getSpecial();
					if (sp != null) {
						if (pattern_EA2SRule_22_2_black_nac_0BB(s, tm) == null) {
							if (pattern_EA2SRule_22_2_black_nac_1BB(sp, s) == null) {
								_result.add(new Object[] { s, sp, tm,
										_edge_steps });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EA2SRule_22_2_greenFB(EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EA2SRule_22_3_expressionFBBBBB(
			EA2SRule _this, Match match, Step s, Special sp, TargetModel tm) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, s, sp, tm);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EA2SRule_22_4_expressionFBB(
			EA2SRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_22_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_EA2SRule_22_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_EA2SRule_22_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EA2SRule_25_1_blackB(EA2SRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EA2SRule_25_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EA2SRule_25_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SourceModel sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_25_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SM2TM sm2Tm) {
		if (ruleResult.getCorrObjects().contains(sm2Tm)) {
			return new Object[] { ruleResult, sm2Tm };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_25_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TargetModel tm) {
		if (ruleResult.getTargetObjects().contains(tm)) {
			return new Object[] { ruleResult, tm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EA2SRule_25_2_blackFFFFBB(
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
							if (pattern_EA2SRule_25_2_black_nac_1BB(ruleResult,
									sm2Tm) == null) {
								if (pattern_EA2SRule_25_2_black_nac_0BB(
										ruleResult, sm) == null) {
									if (pattern_EA2SRule_25_2_black_nac_2BB(
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

	public static final Object[] pattern_EA2SRule_25_3_bindingFBBBBBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM sm2Tm,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, sm, tm, sm2Tm, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, tm, sm2Tm,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EA2SRule_25_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EA2SRule_25_3_bindingAndBlackFBBBBBB(
			EA2SRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM sm2Tm,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EA2SRule_25_3_binding = pattern_EA2SRule_25_3_bindingFBBBBBB(
				_this, isApplicableMatch, sm, tm, sm2Tm, ruleResult);
		if (result_pattern_EA2SRule_25_3_binding != null) {
			CSP csp = (CSP) result_pattern_EA2SRule_25_3_binding[0];

			Object[] result_pattern_EA2SRule_25_3_black = pattern_EA2SRule_25_3_blackB(csp);
			if (result_pattern_EA2SRule_25_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, tm,
						sm2Tm, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EA2SRule_25_4_expressionFBB(
			EA2SRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EA2SRule_25_5_blackBBB(SourceModel sm,
			TargetModel tm, SM2TM sm2Tm) {
		return new Object[] { sm, tm, sm2Tm };
	}

	public static final Object[] pattern_EA2SRule_25_6_blackBBBB(
			SourceModel sm, TargetModel tm, SM2TM sm2Tm,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { sm, tm, sm2Tm, ruleResult };
	}

	public static final Object[] pattern_EA2SRule_25_6_greenFFFFBBBB(
			SourceModel sm, TargetModel tm,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Element e = SourceFactory.eINSTANCE.createElement();
		Step s = TargetFactory.eINSTANCE.createStep();
		Special sp = TargetFactory.eINSTANCE.createSpecial();
		E2Sp e2Sp = SourceToTargetCorrFactory.eINSTANCE.createE2Sp();
		Object _localVariable_0 = csp.getValue("e", "specialAttr");
		Object _localVariable_1 = csp.getValue("e", "id");
		Object _localVariable_2 = csp.getValue("s", "id");
		Object _localVariable_3 = csp.getValue("sp", "value");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		sm.getElements().add(e);
		ruleResult.getSourceObjects().add(e);
		tm.getSteps().add(s);
		ruleResult.getTargetObjects().add(s);
		s.setSpecial(sp);
		ruleResult.getTargetObjects().add(sp);
		e2Sp.setSource(e);
		e2Sp.setTarget(sp);
		ruleResult.getCorrObjects().add(e2Sp);
		String e_specialAttr_prime = (String) _localVariable_0;
		String e_id_prime = (String) _localVariable_1;
		String s_id_prime = (String) _localVariable_2;
		String sp_value_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		e.setSpecialAttr(e_specialAttr_prime);
		e.setId(e_id_prime);
		s.setId(s_id_prime);
		sp.setValue(sp_value_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { e, s, sp, e2Sp, sm, tm, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EA2SRule_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EA2SRuleImpl
