/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.SourceFactory;
import Source.SourceModel;
import Source.SplitMerge;

import SourceToTargetCorr.E2S;

import SourceToTargetCorr.Rules.RulesPackage;
import SourceToTargetCorr.Rules.SpM2SpSRule;

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

import Target.SpecialStep;
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
 * An implementation of the model object '<em><b>Sp M2 Sp SRule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpM2SpSRuleImpl extends AbstractRuleImpl implements SpM2SpSRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpM2SpSRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.SP_M2_SP_SRULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SourceModel sm, SplitMerge spM) {
		// initial bindings
		Object[] result1_black = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_0_1_blackBBBB(this, match, sm, spM);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ", " + "[spM] = " + spM + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_0_2_bindingAndBlackFBBBB(this, match, sm,
						spM);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[sm] = " + sm
							+ ", " + "[spM] = " + spM + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_0_4_blackBBB(match, sm, spM);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ", " + "[spM] = " + spM
								+ ".");
			}
			SpM2SpSRuleImpl.pattern_SpM2SpSRule_0_4_greenBBBF(match, sm, spM);
			// EMoflonEdge sm__spM____elements = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_0_5_blackBBB(match, sm, spM);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[sm] = " + sm + ", " + "[spM] = " + spM
								+ ".");
			}
			SpM2SpSRuleImpl.pattern_SpM2SpSRule_0_5_greenBB(match, sm);

			// register objects to match
			SpM2SpSRuleImpl.pattern_SpM2SpSRule_0_6_expressionBBBB(this, match,
					sm, spM);
			return SpM2SpSRuleImpl.pattern_SpM2SpSRule_0_7_expressionF();
		} else {
			return SpM2SpSRuleImpl.pattern_SpM2SpSRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_1_1_bindingAndBlackFFFFFBB(this,
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
		SM2TM smToTm = (SM2TM) result1_bindingAndBlack[2];
		SplitMerge spM = (SplitMerge) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_1_1_greenBBFFB(tm, spM, csp);
		SpecialStep spS = (SpecialStep) result1_green[2];
		E2S spMToSpS = (E2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_1_2_blackBBB(spM, spS, spMToSpS);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[spM] = " + spM + ", "
							+ "[spS] = " + spS + ", " + "[spMToSpS] = "
							+ spMToSpS + ".");
		}
		Object[] result2_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_1_2_greenFBBB(spM, spS, spMToSpS);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_1_3_blackBBBBBBB(ruleresult, sm, tm,
						smToTm, spM, spS, spMToSpS);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
							+ ", " + "[smToTm] = " + smToTm + ", " + "[spM] = "
							+ spM + ", " + "[spS] = " + spS + ", "
							+ "[spMToSpS] = " + spMToSpS + ".");
		}
		SpM2SpSRuleImpl.pattern_SpM2SpSRule_1_3_greenBBBBBBFFFF(ruleresult, sm,
				tm, spM, spS, spMToSpS);
		// EMoflonEdge sm__spM____elements = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tm__spS____steps = (EMoflonEdge) result3_green[7];
		// EMoflonEdge spMToSpS__spM____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge spMToSpS__spS____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		SpM2SpSRuleImpl.pattern_SpM2SpSRule_1_5_expressionBBBBBBBB(this,
				ruleresult, sm, tm, smToTm, spM, spS, spMToSpS);
		return SpM2SpSRuleImpl.pattern_SpM2SpSRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		SourceModel sm = (SourceModel) result2_binding[0];
		SplitMerge spM = (SplitMerge) result2_binding[1];
		for (Object[] result2_black : SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_2_2_blackBFFBB(sm, spM, match)) {
			TargetModel tm = (TargetModel) result2_black[1];
			SM2TM smToTm = (SM2TM) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_2_3_blackBBBB(sm, tm, smToTm, spM)) {
				Object[] result3_green = SpM2SpSRuleImpl
						.pattern_SpM2SpSRule_2_3_greenBBBBFFFF(sm, tm, smToTm,
								spM);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge sm__spM____elements = (EMoflonEdge) result3_green[5];
				// EMoflonEdge smToTm__sm____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge smToTm__tm____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = SpM2SpSRuleImpl
						.pattern_SpM2SpSRule_2_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, sm, tm, smToTm, spM);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[sm] = " + sm
									+ ", " + "[tm] = " + tm + ", "
									+ "[smToTm] = " + smToTm + ", "
									+ "[spM] = " + spM + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_2_5_expressionFBB(this,
						csp)) {

					// add match to rule result
					Object[] result6_black = SpM2SpSRuleImpl
							.pattern_SpM2SpSRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					SpM2SpSRuleImpl.pattern_SpM2SpSRule_2_6_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SpM2SpSRuleImpl.pattern_SpM2SpSRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SourceModel sm,
			SplitMerge spM) {
		match.registerObject("sm", sm);
		match.registerObject("spM", spM);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SourceModel sm,
			SplitMerge spM) {// Create CSP
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
			SourceModel sm, TargetModel tm, SM2TM smToTm, SplitMerge spM) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spM_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"spM.id", true, csp);
		var_spM_id.setValue(spM.getId());
		var_spM_id.setType("String");

		// Create unbound variables
		Variable var_spS_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"spS.id", csp);
		var_spS_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_spM_id, var_spS_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("smToTm", smToTm);
		isApplicableMatch.registerObject("spM", spM);
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
			EObject tm, EObject smToTm, EObject spM, EObject spS,
			EObject spMToSpS) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("smToTm", smToTm);
		ruleresult.registerObject("spM", spM);
		ruleresult.registerObject("spS", spS);
		ruleresult.registerObject("spMToSpS", spMToSpS);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("spM").eClass()
				.equals(Source.SourcePackage.eINSTANCE.getSplitMerge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TargetModel tm,
			SpecialStep spS) {
		// initial bindings
		Object[] result1_black = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_10_1_blackBBBB(this, match, tm, spS);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tm] = " + tm
							+ ", " + "[spS] = " + spS + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_10_2_bindingAndBlackFBBBB(this, match, tm,
						spS);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[tm] = " + tm
							+ ", " + "[spS] = " + spS + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_10_4_blackBBB(match, tm, spS);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[tm] = " + tm + ", " + "[spS] = " + spS
								+ ".");
			}
			SpM2SpSRuleImpl.pattern_SpM2SpSRule_10_4_greenBBBF(match, tm, spS);
			// EMoflonEdge tm__spS____steps = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_10_5_blackBBB(match, tm, spS);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[tm] = " + tm + ", " + "[spS] = " + spS
								+ ".");
			}
			SpM2SpSRuleImpl.pattern_SpM2SpSRule_10_5_greenBB(match, tm);

			// register objects to match
			SpM2SpSRuleImpl.pattern_SpM2SpSRule_10_6_expressionBBBB(this,
					match, tm, spS);
			return SpM2SpSRuleImpl.pattern_SpM2SpSRule_10_7_expressionF();
		} else {
			return SpM2SpSRuleImpl.pattern_SpM2SpSRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_11_1_bindingAndBlackFFFFFBB(this,
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
		SM2TM smToTm = (SM2TM) result1_bindingAndBlack[2];
		SpecialStep spS = (SpecialStep) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_11_1_greenBFBFB(sm, spS, csp);
		SplitMerge spM = (SplitMerge) result1_green[1];
		E2S spMToSpS = (E2S) result1_green[3];

		// collect translated elements
		Object[] result2_black = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_11_2_blackBBB(spM, spS, spMToSpS);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[spM] = " + spM + ", "
							+ "[spS] = " + spS + ", " + "[spMToSpS] = "
							+ spMToSpS + ".");
		}
		Object[] result2_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_11_2_greenFBBB(spM, spS, spMToSpS);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_11_3_blackBBBBBBB(ruleresult, sm, tm,
						smToTm, spM, spS, spMToSpS);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
							+ ", " + "[smToTm] = " + smToTm + ", " + "[spM] = "
							+ spM + ", " + "[spS] = " + spS + ", "
							+ "[spMToSpS] = " + spMToSpS + ".");
		}
		SpM2SpSRuleImpl.pattern_SpM2SpSRule_11_3_greenBBBBBBFFFF(ruleresult,
				sm, tm, spM, spS, spMToSpS);
		// EMoflonEdge sm__spM____elements = (EMoflonEdge) result3_green[6];
		// EMoflonEdge tm__spS____steps = (EMoflonEdge) result3_green[7];
		// EMoflonEdge spMToSpS__spM____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge spMToSpS__spS____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		SpM2SpSRuleImpl.pattern_SpM2SpSRule_11_5_expressionBBBBBBBB(this,
				ruleresult, sm, tm, smToTm, spM, spS, spMToSpS);
		return SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		TargetModel tm = (TargetModel) result2_binding[0];
		SpecialStep spS = (SpecialStep) result2_binding[1];
		for (Object[] result2_black : SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_12_2_blackFBFBB(tm, spS, match)) {
			SourceModel sm = (SourceModel) result2_black[0];
			SM2TM smToTm = (SM2TM) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_12_3_blackBBBB(sm, tm, smToTm, spS)) {
				Object[] result3_green = SpM2SpSRuleImpl
						.pattern_SpM2SpSRule_12_3_greenBBBBFFFF(sm, tm, smToTm,
								spS);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge tm__spS____steps = (EMoflonEdge) result3_green[5];
				// EMoflonEdge smToTm__sm____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge smToTm__tm____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = SpM2SpSRuleImpl
						.pattern_SpM2SpSRule_12_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, sm, tm, smToTm, spS);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[sm] = " + sm
									+ ", " + "[tm] = " + tm + ", "
									+ "[smToTm] = " + smToTm + ", "
									+ "[spS] = " + spS + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_12_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = SpM2SpSRuleImpl
							.pattern_SpM2SpSRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					SpM2SpSRuleImpl.pattern_SpM2SpSRule_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TargetModel tm,
			SpecialStep spS) {
		match.registerObject("tm", tm);
		match.registerObject("spS", spS);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TargetModel tm,
			SpecialStep spS) {// Create CSP
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
			SourceModel sm, TargetModel tm, SM2TM smToTm, SpecialStep spS) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_spS_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"spS.id", true, csp);
		var_spS_id.setValue(spS.getId());
		var_spS_id.setType("String");

		// Create unbound variables
		Variable var_spM_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"spM.id", csp);
		var_spM_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_spM_id, var_spS_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("smToTm", smToTm);
		isApplicableMatch.registerObject("spS", spS);
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
			EObject tm, EObject smToTm, EObject spM, EObject spS,
			EObject spMToSpS) {
		ruleresult.registerObject("sm", sm);
		ruleresult.registerObject("tm", tm);
		ruleresult.registerObject("smToTm", smToTm);
		ruleresult.registerObject("spM", spM);
		ruleresult.registerObject("spS", spS);
		ruleresult.registerObject("spMToSpS", spMToSpS);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("spS").eClass()
				.equals(Target.TargetPackage.eINSTANCE.getSpecialStep());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(
			EMoflonEdge _edge_elements) {
		// prepare return value
		Object[] result1_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_20_2_blackFFB(_edge_elements)) {
			SourceModel sm = (SourceModel) result2_black[0];
			SplitMerge spM = (SplitMerge) result2_black[1];
			Object[] result2_green = SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_20_3_expressionFBBBB(this,
					match, sm, spM)) {
				// Ensure that the correct types of elements are matched
				if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_20_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = SpM2SpSRuleImpl
							.pattern_SpM2SpSRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					SpM2SpSRuleImpl.pattern_SpM2SpSRule_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SpM2SpSRuleImpl.pattern_SpM2SpSRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(
			EMoflonEdge _edge_steps) {
		// prepare return value
		Object[] result1_bindingAndBlack = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_21_2_blackFFB(_edge_steps)) {
			TargetModel tm = (TargetModel) result2_black[0];
			SpecialStep spS = (SpecialStep) result2_black[1];
			Object[] result2_green = SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_21_3_expressionFBBBB(this,
					match, tm, spS)) {
				// Ensure that the correct types of elements are matched
				if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_21_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = SpM2SpSRuleImpl
							.pattern_SpM2SpSRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					SpM2SpSRuleImpl.pattern_SpM2SpSRule_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return SpM2SpSRuleImpl.pattern_SpM2SpSRule_21_6_expressionFB(__result);
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
			RuleEntryContainer ruleEntryContainer, SM2TM smToTmParameter) {
		// create result
		Object[] result1_black = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_24_2_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList smToTmList = (RuleEntryList) result2_black[0];
			SourceModel sm = (SourceModel) result2_black[1];
			SM2TM smToTm = (SM2TM) result2_black[2];
			TargetModel tm = (TargetModel) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = SpM2SpSRuleImpl
					.pattern_SpM2SpSRule_24_3_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, sm, tm, smToTm, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = " + this + ", "
								+ "[isApplicableMatch] = " + isApplicableMatch
								+ ", " + "[sm] = " + sm + ", " + "[tm] = " + tm
								+ ", " + "[smToTm] = " + smToTm + ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (SpM2SpSRuleImpl.pattern_SpM2SpSRule_24_4_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = SpM2SpSRuleImpl
						.pattern_SpM2SpSRule_24_5_blackBBB(sm, tm, smToTm);
				if (result5_black != null) {

					// perform
					Object[] result6_black = SpM2SpSRuleImpl
							.pattern_SpM2SpSRule_24_6_blackBBBB(sm, tm, smToTm,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[sm] = " + sm
										+ ", " + "[tm] = " + tm + ", "
										+ "[smToTm] = " + smToTm + ", "
										+ "[ruleResult] = " + ruleResult + ".");
					}
					SpM2SpSRuleImpl.pattern_SpM2SpSRule_24_6_greenBBFFFBB(sm,
							tm, ruleResult, csp);
					// SplitMerge spM = (SplitMerge) result6_green[2];
					// SpecialStep spS = (SpecialStep) result6_green[3];
					// E2S spMToSpS = (E2S) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return SpM2SpSRuleImpl
				.pattern_SpM2SpSRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM smToTm,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_spM_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"spM.id", csp);
		var_spM_id.setType("String");
		Variable var_spS_id = CSPFactoryHelper.eINSTANCE.createVariable(
				"spS.id", csp);
		var_spS_id.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var_spM_id, var_spS_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sm", sm);
		isApplicableMatch.registerObject("tm", tm);
		isApplicableMatch.registerObject("smToTm", smToTm);
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
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_SPLITMERGE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1),
					(SplitMerge) arguments.get(2));
		case RulesPackage.SP_M2_SP_SRULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_SPLITMERGE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1),
					(SplitMerge) arguments.get(2));
			return null;
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_SPLITMERGE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(SourceModel) arguments.get(1),
					(SplitMerge) arguments.get(2));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPLITMERGE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1),
					(TargetModel) arguments.get(2), (SM2TM) arguments.get(3),
					(SplitMerge) arguments.get(4));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SP_M2_SP_SRULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_SPECIALSTEP:
			return isAppropriate_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1),
					(SpecialStep) arguments.get(2));
		case RulesPackage.SP_M2_SP_SRULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_SPECIALSTEP:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1),
					(SpecialStep) arguments.get(2));
			return null;
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_SPECIALSTEP:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(TargetModel) arguments.get(1),
					(SpecialStep) arguments.get(2));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPECIALSTEP:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1),
					(TargetModel) arguments.get(2), (SM2TM) arguments.get(3),
					(SpecialStep) arguments.get(4));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SP_M2_SP_SRULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SP_M2_SP_SRULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments
					.get(0));
		case RulesPackage.SP_M2_SP_SRULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SP_M2_SP_SRULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(SM2TM) arguments.get(1));
		case RulesPackage.SP_M2_SP_SRULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(SourceModel) arguments.get(1),
					(TargetModel) arguments.get(2), (SM2TM) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.SP_M2_SP_SRULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SpM2SpSRule_0_1_blackBBBB(
			SpM2SpSRule _this, Match match, SourceModel sm, SplitMerge spM) {
		return new Object[] { _this, match, sm, spM };
	}

	public static final Object[] pattern_SpM2SpSRule_0_2_bindingFBBBB(
			SpM2SpSRule _this, Match match, SourceModel sm, SplitMerge spM) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, sm, spM);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sm, spM };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SpM2SpSRule_0_2_bindingAndBlackFBBBB(
			SpM2SpSRule _this, Match match, SourceModel sm, SplitMerge spM) {
		Object[] result_pattern_SpM2SpSRule_0_2_binding = pattern_SpM2SpSRule_0_2_bindingFBBBB(
				_this, match, sm, spM);
		if (result_pattern_SpM2SpSRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern_SpM2SpSRule_0_2_binding[0];

			Object[] result_pattern_SpM2SpSRule_0_2_black = pattern_SpM2SpSRule_0_2_blackB(csp);
			if (result_pattern_SpM2SpSRule_0_2_black != null) {

				return new Object[] { csp, _this, match, sm, spM };
			}
		}
		return null;
	}

	public static final boolean pattern_SpM2SpSRule_0_3_expressionFBB(
			SpM2SpSRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_0_4_blackBBB(Match match,
			SourceModel sm, SplitMerge spM) {
		return new Object[] { match, sm, spM };
	}

	public static final Object[] pattern_SpM2SpSRule_0_4_greenBBBF(Match match,
			SourceModel sm, SplitMerge spM) {
		EMoflonEdge sm__spM____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(spM);
		String sm__spM____elements_name_prime = "elements";
		sm__spM____elements.setSrc(sm);
		sm__spM____elements.setTrg(spM);
		match.getToBeTranslatedEdges().add(sm__spM____elements);
		sm__spM____elements.setName(sm__spM____elements_name_prime);
		return new Object[] { match, sm, spM, sm__spM____elements };
	}

	public static final Object[] pattern_SpM2SpSRule_0_5_blackBBB(Match match,
			SourceModel sm, SplitMerge spM) {
		return new Object[] { match, sm, spM };
	}

	public static final Object[] pattern_SpM2SpSRule_0_5_greenBB(Match match,
			SourceModel sm) {
		match.getContextNodes().add(sm);
		return new Object[] { match, sm };
	}

	public static final void pattern_SpM2SpSRule_0_6_expressionBBBB(
			SpM2SpSRule _this, Match match, SourceModel sm, SplitMerge spM) {
		_this.registerObjectsToMatch_FWD(match, sm, spM);

	}

	public static final boolean pattern_SpM2SpSRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SpM2SpSRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject _localVariable_1 = isApplicableMatch.getObject("tm");
		EObject _localVariable_2 = isApplicableMatch.getObject("smToTm");
		EObject _localVariable_3 = isApplicableMatch.getObject("spM");
		EObject tmpSm = _localVariable_0;
		EObject tmpTm = _localVariable_1;
		EObject tmpSmToTm = _localVariable_2;
		EObject tmpSpM = _localVariable_3;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpTm instanceof TargetModel) {
				TargetModel tm = (TargetModel) tmpTm;
				if (tmpSmToTm instanceof SM2TM) {
					SM2TM smToTm = (SM2TM) tmpSmToTm;
					if (tmpSpM instanceof SplitMerge) {
						SplitMerge spM = (SplitMerge) tmpSpM;
						return new Object[] { sm, tm, smToTm, spM,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_1_1_blackBBBBFBB(
			SourceModel sm, TargetModel tm, SM2TM smToTm, SplitMerge spM,
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sm, tm, smToTm, spM, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_1_1_bindingAndBlackFFFFFBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SpM2SpSRule_1_1_binding = pattern_SpM2SpSRule_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_SpM2SpSRule_1_1_binding != null) {
			SourceModel sm = (SourceModel) result_pattern_SpM2SpSRule_1_1_binding[0];
			TargetModel tm = (TargetModel) result_pattern_SpM2SpSRule_1_1_binding[1];
			SM2TM smToTm = (SM2TM) result_pattern_SpM2SpSRule_1_1_binding[2];
			SplitMerge spM = (SplitMerge) result_pattern_SpM2SpSRule_1_1_binding[3];

			Object[] result_pattern_SpM2SpSRule_1_1_black = pattern_SpM2SpSRule_1_1_blackBBBBFBB(
					sm, tm, smToTm, spM, _this, isApplicableMatch);
			if (result_pattern_SpM2SpSRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern_SpM2SpSRule_1_1_black[4];

				return new Object[] { sm, tm, smToTm, spM, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_1_1_greenBBFFB(
			TargetModel tm, SplitMerge spM, CSP csp) {
		SpecialStep spS = TargetFactory.eINSTANCE.createSpecialStep();
		E2S spMToSpS = SourceToTargetCorrFactory.eINSTANCE.createE2S();
		Object _localVariable_0 = csp.getValue("spS", "id");
		tm.getSteps().add(spS);
		spMToSpS.setSource(spM);
		spMToSpS.setTarget(spS);
		String spS_id_prime = (String) _localVariable_0;
		spS.setId(spS_id_prime);
		return new Object[] { tm, spM, spS, spMToSpS, csp };
	}

	public static final Object[] pattern_SpM2SpSRule_1_2_blackBBB(
			SplitMerge spM, SpecialStep spS, E2S spMToSpS) {
		return new Object[] { spM, spS, spMToSpS };
	}

	public static final Object[] pattern_SpM2SpSRule_1_2_greenFBBB(
			SplitMerge spM, SpecialStep spS, E2S spMToSpS) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(spM);
		ruleresult.getCreatedElements().add(spS);
		ruleresult.getCreatedLinkElements().add(spMToSpS);
		return new Object[] { ruleresult, spM, spS, spMToSpS };
	}

	public static final Object[] pattern_SpM2SpSRule_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject tm,
			EObject smToTm, EObject spM, EObject spS, EObject spMToSpS) {
		if (!sm.equals(tm)) {
			if (!sm.equals(smToTm)) {
				if (!sm.equals(spM)) {
					if (!sm.equals(spS)) {
						if (!sm.equals(spMToSpS)) {
							if (!smToTm.equals(tm)) {
								if (!smToTm.equals(spM)) {
									if (!smToTm.equals(spS)) {
										if (!smToTm.equals(spMToSpS)) {
											if (!spM.equals(tm)) {
												if (!spM.equals(spS)) {
													if (!spM.equals(spMToSpS)) {
														if (!spS.equals(tm)) {
															if (!spMToSpS
																	.equals(tm)) {
																if (!spMToSpS
																		.equals(spS)) {
																	return new Object[] {
																			ruleresult,
																			sm,
																			tm,
																			smToTm,
																			spM,
																			spS,
																			spMToSpS };
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

	public static final Object[] pattern_SpM2SpSRule_1_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject spM,
			EObject spS, EObject spMToSpS) {
		EMoflonEdge sm__spM____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__spS____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spMToSpS__spM____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spMToSpS__spS____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SpM2SpSRule";
		String sm__spM____elements_name_prime = "elements";
		String tm__spS____steps_name_prime = "steps";
		String spMToSpS__spM____source_name_prime = "source";
		String spMToSpS__spS____target_name_prime = "target";
		sm__spM____elements.setSrc(sm);
		sm__spM____elements.setTrg(spM);
		ruleresult.getTranslatedEdges().add(sm__spM____elements);
		tm__spS____steps.setSrc(tm);
		tm__spS____steps.setTrg(spS);
		ruleresult.getCreatedEdges().add(tm__spS____steps);
		spMToSpS__spM____source.setSrc(spMToSpS);
		spMToSpS__spM____source.setTrg(spM);
		ruleresult.getCreatedEdges().add(spMToSpS__spM____source);
		spMToSpS__spS____target.setSrc(spMToSpS);
		spMToSpS__spS____target.setTrg(spS);
		ruleresult.getCreatedEdges().add(spMToSpS__spS____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm__spM____elements.setName(sm__spM____elements_name_prime);
		tm__spS____steps.setName(tm__spS____steps_name_prime);
		spMToSpS__spM____source.setName(spMToSpS__spM____source_name_prime);
		spMToSpS__spS____target.setName(spMToSpS__spS____target_name_prime);
		return new Object[] { ruleresult, sm, tm, spM, spS, spMToSpS,
				sm__spM____elements, tm__spS____steps, spMToSpS__spM____source,
				spMToSpS__spS____target };
	}

	public static final void pattern_SpM2SpSRule_1_5_expressionBBBBBBBB(
			SpM2SpSRule _this, PerformRuleResult ruleresult, EObject sm,
			EObject tm, EObject smToTm, EObject spM, EObject spS,
			EObject spMToSpS) {
		_this.registerObjects_FWD(ruleresult, sm, tm, smToTm, spM, spS,
				spMToSpS);

	}

	public static final PerformRuleResult pattern_SpM2SpSRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_2_1_bindingFB(
			SpM2SpSRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_2_1_blackFBB(
			EClass eClass, SpM2SpSRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_2_1_bindingAndBlackFFB(
			SpM2SpSRule _this) {
		Object[] result_pattern_SpM2SpSRule_2_1_binding = pattern_SpM2SpSRule_2_1_bindingFB(_this);
		if (result_pattern_SpM2SpSRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SpM2SpSRule_2_1_binding[0];

			Object[] result_pattern_SpM2SpSRule_2_1_black = pattern_SpM2SpSRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern_SpM2SpSRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SpM2SpSRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SpM2SpSRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SpM2SpSRule_2_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("sm");
		EObject _localVariable_1 = match.getObject("spM");
		EObject tmpSm = _localVariable_0;
		EObject tmpSpM = _localVariable_1;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpSpM instanceof SplitMerge) {
				SplitMerge spM = (SplitMerge) tmpSpM;
				return new Object[] { sm, spM, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SpM2SpSRule_2_2_blackBFFBB(
			SourceModel sm, SplitMerge spM, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2TM smToTm : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sm, SM2TM.class, "source")) {
			TargetModel tm = smToTm.getTarget();
			if (tm != null) {
				_result.add(new Object[] { sm, tm, smToTm, spM, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SpM2SpSRule_2_3_blackBBBB(
			SourceModel sm, TargetModel tm, SM2TM smToTm, SplitMerge spM) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sm.getElements().contains(spM)) {
			if (sm.equals(smToTm.getSource())) {
				if (tm.equals(smToTm.getTarget())) {
					_result.add(new Object[] { sm, tm, smToTm, spM });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_2_3_greenBBBBFFFF(
			SourceModel sm, TargetModel tm, SM2TM smToTm, SplitMerge spM) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge sm__spM____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String sm__spM____elements_name_prime = "elements";
		String smToTm__sm____source_name_prime = "source";
		String smToTm__tm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(smToTm);
		isApplicableMatch.getAllContextElements().add(spM);
		sm__spM____elements.setSrc(sm);
		sm__spM____elements.setTrg(spM);
		isApplicableMatch.getAllContextElements().add(sm__spM____elements);
		smToTm__sm____source.setSrc(smToTm);
		smToTm__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(smToTm__sm____source);
		smToTm__tm____target.setSrc(smToTm);
		smToTm__tm____target.setTrg(tm);
		isApplicableMatch.getAllContextElements().add(smToTm__tm____target);
		sm__spM____elements.setName(sm__spM____elements_name_prime);
		smToTm__sm____source.setName(smToTm__sm____source_name_prime);
		smToTm__tm____target.setName(smToTm__tm____target_name_prime);
		return new Object[] { sm, tm, smToTm, spM, isApplicableMatch,
				sm__spM____elements, smToTm__sm____source, smToTm__tm____target };
	}

	public static final Object[] pattern_SpM2SpSRule_2_4_bindingFBBBBBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM smToTm, SplitMerge spM) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, sm, tm, smToTm, spM);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, tm,
					smToTm, spM };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SpM2SpSRule_2_4_bindingAndBlackFBBBBBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM smToTm, SplitMerge spM) {
		Object[] result_pattern_SpM2SpSRule_2_4_binding = pattern_SpM2SpSRule_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, sm, tm, smToTm, spM);
		if (result_pattern_SpM2SpSRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern_SpM2SpSRule_2_4_binding[0];

			Object[] result_pattern_SpM2SpSRule_2_4_black = pattern_SpM2SpSRule_2_4_blackB(csp);
			if (result_pattern_SpM2SpSRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, tm,
						smToTm, spM };
			}
		}
		return null;
	}

	public static final boolean pattern_SpM2SpSRule_2_5_expressionFBB(
			SpM2SpSRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SpM2SpSRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SpM2SpSRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SpM2SpSRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_10_1_blackBBBB(
			SpM2SpSRule _this, Match match, TargetModel tm, SpecialStep spS) {
		return new Object[] { _this, match, tm, spS };
	}

	public static final Object[] pattern_SpM2SpSRule_10_2_bindingFBBBB(
			SpM2SpSRule _this, Match match, TargetModel tm, SpecialStep spS) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tm, spS);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tm, spS };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SpM2SpSRule_10_2_bindingAndBlackFBBBB(
			SpM2SpSRule _this, Match match, TargetModel tm, SpecialStep spS) {
		Object[] result_pattern_SpM2SpSRule_10_2_binding = pattern_SpM2SpSRule_10_2_bindingFBBBB(
				_this, match, tm, spS);
		if (result_pattern_SpM2SpSRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern_SpM2SpSRule_10_2_binding[0];

			Object[] result_pattern_SpM2SpSRule_10_2_black = pattern_SpM2SpSRule_10_2_blackB(csp);
			if (result_pattern_SpM2SpSRule_10_2_black != null) {

				return new Object[] { csp, _this, match, tm, spS };
			}
		}
		return null;
	}

	public static final boolean pattern_SpM2SpSRule_10_3_expressionFBB(
			SpM2SpSRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_10_4_blackBBB(Match match,
			TargetModel tm, SpecialStep spS) {
		return new Object[] { match, tm, spS };
	}

	public static final Object[] pattern_SpM2SpSRule_10_4_greenBBBF(
			Match match, TargetModel tm, SpecialStep spS) {
		EMoflonEdge tm__spS____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(spS);
		String tm__spS____steps_name_prime = "steps";
		tm__spS____steps.setSrc(tm);
		tm__spS____steps.setTrg(spS);
		match.getToBeTranslatedEdges().add(tm__spS____steps);
		tm__spS____steps.setName(tm__spS____steps_name_prime);
		return new Object[] { match, tm, spS, tm__spS____steps };
	}

	public static final Object[] pattern_SpM2SpSRule_10_5_blackBBB(Match match,
			TargetModel tm, SpecialStep spS) {
		return new Object[] { match, tm, spS };
	}

	public static final Object[] pattern_SpM2SpSRule_10_5_greenBB(Match match,
			TargetModel tm) {
		match.getContextNodes().add(tm);
		return new Object[] { match, tm };
	}

	public static final void pattern_SpM2SpSRule_10_6_expressionBBBB(
			SpM2SpSRule _this, Match match, TargetModel tm, SpecialStep spS) {
		_this.registerObjectsToMatch_BWD(match, tm, spS);

	}

	public static final boolean pattern_SpM2SpSRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SpM2SpSRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sm");
		EObject _localVariable_1 = isApplicableMatch.getObject("tm");
		EObject _localVariable_2 = isApplicableMatch.getObject("smToTm");
		EObject _localVariable_3 = isApplicableMatch.getObject("spS");
		EObject tmpSm = _localVariable_0;
		EObject tmpTm = _localVariable_1;
		EObject tmpSmToTm = _localVariable_2;
		EObject tmpSpS = _localVariable_3;
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			if (tmpTm instanceof TargetModel) {
				TargetModel tm = (TargetModel) tmpTm;
				if (tmpSmToTm instanceof SM2TM) {
					SM2TM smToTm = (SM2TM) tmpSmToTm;
					if (tmpSpS instanceof SpecialStep) {
						SpecialStep spS = (SpecialStep) tmpSpS;
						return new Object[] { sm, tm, smToTm, spS,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_11_1_blackBBBBFBB(
			SourceModel sm, TargetModel tm, SM2TM smToTm, SpecialStep spS,
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sm, tm, smToTm, spS, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_11_1_bindingAndBlackFFFFFBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SpM2SpSRule_11_1_binding = pattern_SpM2SpSRule_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern_SpM2SpSRule_11_1_binding != null) {
			SourceModel sm = (SourceModel) result_pattern_SpM2SpSRule_11_1_binding[0];
			TargetModel tm = (TargetModel) result_pattern_SpM2SpSRule_11_1_binding[1];
			SM2TM smToTm = (SM2TM) result_pattern_SpM2SpSRule_11_1_binding[2];
			SpecialStep spS = (SpecialStep) result_pattern_SpM2SpSRule_11_1_binding[3];

			Object[] result_pattern_SpM2SpSRule_11_1_black = pattern_SpM2SpSRule_11_1_blackBBBBFBB(
					sm, tm, smToTm, spS, _this, isApplicableMatch);
			if (result_pattern_SpM2SpSRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern_SpM2SpSRule_11_1_black[4];

				return new Object[] { sm, tm, smToTm, spS, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_11_1_greenBFBFB(
			SourceModel sm, SpecialStep spS, CSP csp) {
		SplitMerge spM = SourceFactory.eINSTANCE.createSplitMerge();
		E2S spMToSpS = SourceToTargetCorrFactory.eINSTANCE.createE2S();
		Object _localVariable_0 = csp.getValue("spM", "id");
		sm.getElements().add(spM);
		spMToSpS.setSource(spM);
		spMToSpS.setTarget(spS);
		String spM_id_prime = (String) _localVariable_0;
		spM.setId(spM_id_prime);
		return new Object[] { sm, spM, spS, spMToSpS, csp };
	}

	public static final Object[] pattern_SpM2SpSRule_11_2_blackBBB(
			SplitMerge spM, SpecialStep spS, E2S spMToSpS) {
		return new Object[] { spM, spS, spMToSpS };
	}

	public static final Object[] pattern_SpM2SpSRule_11_2_greenFBBB(
			SplitMerge spM, SpecialStep spS, E2S spMToSpS) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(spM);
		ruleresult.getTranslatedElements().add(spS);
		ruleresult.getCreatedLinkElements().add(spMToSpS);
		return new Object[] { ruleresult, spM, spS, spMToSpS };
	}

	public static final Object[] pattern_SpM2SpSRule_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject sm, EObject tm,
			EObject smToTm, EObject spM, EObject spS, EObject spMToSpS) {
		if (!sm.equals(tm)) {
			if (!sm.equals(smToTm)) {
				if (!sm.equals(spM)) {
					if (!sm.equals(spS)) {
						if (!sm.equals(spMToSpS)) {
							if (!smToTm.equals(tm)) {
								if (!smToTm.equals(spM)) {
									if (!smToTm.equals(spS)) {
										if (!smToTm.equals(spMToSpS)) {
											if (!spM.equals(tm)) {
												if (!spM.equals(spS)) {
													if (!spM.equals(spMToSpS)) {
														if (!spS.equals(tm)) {
															if (!spMToSpS
																	.equals(tm)) {
																if (!spMToSpS
																		.equals(spS)) {
																	return new Object[] {
																			ruleresult,
																			sm,
																			tm,
																			smToTm,
																			spM,
																			spS,
																			spMToSpS };
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

	public static final Object[] pattern_SpM2SpSRule_11_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject sm, EObject tm, EObject spM,
			EObject spS, EObject spMToSpS) {
		EMoflonEdge sm__spM____elements = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tm__spS____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spMToSpS__spM____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge spMToSpS__spS____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SpM2SpSRule";
		String sm__spM____elements_name_prime = "elements";
		String tm__spS____steps_name_prime = "steps";
		String spMToSpS__spM____source_name_prime = "source";
		String spMToSpS__spS____target_name_prime = "target";
		sm__spM____elements.setSrc(sm);
		sm__spM____elements.setTrg(spM);
		ruleresult.getCreatedEdges().add(sm__spM____elements);
		tm__spS____steps.setSrc(tm);
		tm__spS____steps.setTrg(spS);
		ruleresult.getTranslatedEdges().add(tm__spS____steps);
		spMToSpS__spM____source.setSrc(spMToSpS);
		spMToSpS__spM____source.setTrg(spM);
		ruleresult.getCreatedEdges().add(spMToSpS__spM____source);
		spMToSpS__spS____target.setSrc(spMToSpS);
		spMToSpS__spS____target.setTrg(spS);
		ruleresult.getCreatedEdges().add(spMToSpS__spS____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sm__spM____elements.setName(sm__spM____elements_name_prime);
		tm__spS____steps.setName(tm__spS____steps_name_prime);
		spMToSpS__spM____source.setName(spMToSpS__spM____source_name_prime);
		spMToSpS__spS____target.setName(spMToSpS__spS____target_name_prime);
		return new Object[] { ruleresult, sm, tm, spM, spS, spMToSpS,
				sm__spM____elements, tm__spS____steps, spMToSpS__spM____source,
				spMToSpS__spS____target };
	}

	public static final void pattern_SpM2SpSRule_11_5_expressionBBBBBBBB(
			SpM2SpSRule _this, PerformRuleResult ruleresult, EObject sm,
			EObject tm, EObject smToTm, EObject spM, EObject spS,
			EObject spMToSpS) {
		_this.registerObjects_BWD(ruleresult, sm, tm, smToTm, spM, spS,
				spMToSpS);

	}

	public static final PerformRuleResult pattern_SpM2SpSRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_12_1_bindingFB(
			SpM2SpSRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_12_1_blackFBB(
			EClass eClass, SpM2SpSRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_12_1_bindingAndBlackFFB(
			SpM2SpSRule _this) {
		Object[] result_pattern_SpM2SpSRule_12_1_binding = pattern_SpM2SpSRule_12_1_bindingFB(_this);
		if (result_pattern_SpM2SpSRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern_SpM2SpSRule_12_1_binding[0];

			Object[] result_pattern_SpM2SpSRule_12_1_black = pattern_SpM2SpSRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern_SpM2SpSRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SpM2SpSRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "SpM2SpSRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SpM2SpSRule_12_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tm");
		EObject _localVariable_1 = match.getObject("spS");
		EObject tmpTm = _localVariable_0;
		EObject tmpSpS = _localVariable_1;
		if (tmpTm instanceof TargetModel) {
			TargetModel tm = (TargetModel) tmpTm;
			if (tmpSpS instanceof SpecialStep) {
				SpecialStep spS = (SpecialStep) tmpSpS;
				return new Object[] { tm, spS, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SpM2SpSRule_12_2_blackFBFBB(
			TargetModel tm, SpecialStep spS, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SM2TM smToTm : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tm, SM2TM.class, "target")) {
			SourceModel sm = smToTm.getSource();
			if (sm != null) {
				_result.add(new Object[] { sm, tm, smToTm, spS, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SpM2SpSRule_12_3_blackBBBB(
			SourceModel sm, TargetModel tm, SM2TM smToTm, SpecialStep spS) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tm.getSteps().contains(spS)) {
			if (sm.equals(smToTm.getSource())) {
				if (tm.equals(smToTm.getTarget())) {
					_result.add(new Object[] { sm, tm, smToTm, spS });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_12_3_greenBBBBFFFF(
			SourceModel sm, TargetModel tm, SM2TM smToTm, SpecialStep spS) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge tm__spS____steps = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__sm____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge smToTm__tm____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tm__spS____steps_name_prime = "steps";
		String smToTm__sm____source_name_prime = "source";
		String smToTm__tm____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(sm);
		isApplicableMatch.getAllContextElements().add(tm);
		isApplicableMatch.getAllContextElements().add(smToTm);
		isApplicableMatch.getAllContextElements().add(spS);
		tm__spS____steps.setSrc(tm);
		tm__spS____steps.setTrg(spS);
		isApplicableMatch.getAllContextElements().add(tm__spS____steps);
		smToTm__sm____source.setSrc(smToTm);
		smToTm__sm____source.setTrg(sm);
		isApplicableMatch.getAllContextElements().add(smToTm__sm____source);
		smToTm__tm____target.setSrc(smToTm);
		smToTm__tm____target.setTrg(tm);
		isApplicableMatch.getAllContextElements().add(smToTm__tm____target);
		tm__spS____steps.setName(tm__spS____steps_name_prime);
		smToTm__sm____source.setName(smToTm__sm____source_name_prime);
		smToTm__tm____target.setName(smToTm__tm____target_name_prime);
		return new Object[] { sm, tm, smToTm, spS, isApplicableMatch,
				tm__spS____steps, smToTm__sm____source, smToTm__tm____target };
	}

	public static final Object[] pattern_SpM2SpSRule_12_4_bindingFBBBBBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM smToTm, SpecialStep spS) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, sm, tm, smToTm, spS);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, tm,
					smToTm, spS };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SpM2SpSRule_12_4_bindingAndBlackFBBBBBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM smToTm, SpecialStep spS) {
		Object[] result_pattern_SpM2SpSRule_12_4_binding = pattern_SpM2SpSRule_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, sm, tm, smToTm, spS);
		if (result_pattern_SpM2SpSRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern_SpM2SpSRule_12_4_binding[0];

			Object[] result_pattern_SpM2SpSRule_12_4_black = pattern_SpM2SpSRule_12_4_blackB(csp);
			if (result_pattern_SpM2SpSRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, tm,
						smToTm, spS };
			}
		}
		return null;
	}

	public static final boolean pattern_SpM2SpSRule_12_5_expressionFBB(
			SpM2SpSRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SpM2SpSRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SpM2SpSRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SpM2SpSRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_20_1_bindingFB(
			SpM2SpSRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_20_1_blackFBB(
			EClass __eClass, SpM2SpSRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_20_1_bindingAndBlackFFB(
			SpM2SpSRule _this) {
		Object[] result_pattern_SpM2SpSRule_20_1_binding = pattern_SpM2SpSRule_20_1_bindingFB(_this);
		if (result_pattern_SpM2SpSRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SpM2SpSRule_20_1_binding[0];

			Object[] result_pattern_SpM2SpSRule_20_1_black = pattern_SpM2SpSRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SpM2SpSRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SpM2SpSRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SpM2SpSRule_20_2_blackFFB(
			EMoflonEdge _edge_elements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSm = _edge_elements.getSrc();
		if (tmpSm instanceof SourceModel) {
			SourceModel sm = (SourceModel) tmpSm;
			EObject tmpSpM = _edge_elements.getTrg();
			if (tmpSpM instanceof SplitMerge) {
				SplitMerge spM = (SplitMerge) tmpSpM;
				if (sm.getElements().contains(spM)) {
					_result.add(new Object[] { sm, spM, _edge_elements });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SpM2SpSRule_20_3_expressionFBBBB(
			SpM2SpSRule _this, Match match, SourceModel sm, SplitMerge spM) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, sm, spM);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SpM2SpSRule_20_4_expressionFBB(
			SpM2SpSRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_20_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SpM2SpSRule_20_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SpM2SpSRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_21_1_bindingFB(
			SpM2SpSRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_21_1_blackFBB(
			EClass __eClass, SpM2SpSRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_21_1_bindingAndBlackFFB(
			SpM2SpSRule _this) {
		Object[] result_pattern_SpM2SpSRule_21_1_binding = pattern_SpM2SpSRule_21_1_bindingFB(_this);
		if (result_pattern_SpM2SpSRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern_SpM2SpSRule_21_1_binding[0];

			Object[] result_pattern_SpM2SpSRule_21_1_black = pattern_SpM2SpSRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern_SpM2SpSRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SpM2SpSRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SpM2SpSRule_21_2_blackFFB(
			EMoflonEdge _edge_steps) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTm = _edge_steps.getSrc();
		if (tmpTm instanceof TargetModel) {
			TargetModel tm = (TargetModel) tmpTm;
			EObject tmpSpS = _edge_steps.getTrg();
			if (tmpSpS instanceof SpecialStep) {
				SpecialStep spS = (SpecialStep) tmpSpS;
				if (tm.getSteps().contains(spS)) {
					_result.add(new Object[] { tm, spS, _edge_steps });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SpM2SpSRule_21_3_expressionFBBBB(
			SpM2SpSRule _this, Match match, TargetModel tm, SpecialStep spS) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tm, spS);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SpM2SpSRule_21_4_expressionFBB(
			SpM2SpSRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_21_5_blackBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern_SpM2SpSRule_21_5_greenBBB(Match match,
			EOperation __performOperation, EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern_SpM2SpSRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_24_1_blackB(
			SpM2SpSRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SpM2SpSRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SpM2SpSRule_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SourceModel sm) {
		if (ruleResult.getSourceObjects().contains(sm)) {
			return new Object[] { ruleResult, sm };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SM2TM smToTm) {
		if (ruleResult.getCorrObjects().contains(smToTm)) {
			return new Object[] { ruleResult, smToTm };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TargetModel tm) {
		if (ruleResult.getTargetObjects().contains(tm)) {
			return new Object[] { ruleResult, tm };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SpM2SpSRule_24_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList smToTmList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpSmToTm : smToTmList.getEntryObjects()) {
				if (tmpSmToTm instanceof SM2TM) {
					SM2TM smToTm = (SM2TM) tmpSmToTm;
					SourceModel sm = smToTm.getSource();
					if (sm != null) {
						TargetModel tm = smToTm.getTarget();
						if (tm != null) {
							if (pattern_SpM2SpSRule_24_2_black_nac_1BB(
									ruleResult, smToTm) == null) {
								if (pattern_SpM2SpSRule_24_2_black_nac_0BB(
										ruleResult, sm) == null) {
									if (pattern_SpM2SpSRule_24_2_black_nac_2BB(
											ruleResult, tm) == null) {
										_result.add(new Object[] { smToTmList,
												sm, smToTm, tm,
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

	public static final Object[] pattern_SpM2SpSRule_24_3_bindingFBBBBBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM smToTm,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, sm, tm, smToTm, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sm, tm,
					smToTm, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SpM2SpSRule_24_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SpM2SpSRule_24_3_bindingAndBlackFBBBBBB(
			SpM2SpSRule _this, IsApplicableMatch isApplicableMatch,
			SourceModel sm, TargetModel tm, SM2TM smToTm,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SpM2SpSRule_24_3_binding = pattern_SpM2SpSRule_24_3_bindingFBBBBBB(
				_this, isApplicableMatch, sm, tm, smToTm, ruleResult);
		if (result_pattern_SpM2SpSRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern_SpM2SpSRule_24_3_binding[0];

			Object[] result_pattern_SpM2SpSRule_24_3_black = pattern_SpM2SpSRule_24_3_blackB(csp);
			if (result_pattern_SpM2SpSRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sm, tm,
						smToTm, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SpM2SpSRule_24_4_expressionFBB(
			SpM2SpSRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SpM2SpSRule_24_5_blackBBB(
			SourceModel sm, TargetModel tm, SM2TM smToTm) {
		return new Object[] { sm, tm, smToTm };
	}

	public static final Object[] pattern_SpM2SpSRule_24_6_blackBBBB(
			SourceModel sm, TargetModel tm, SM2TM smToTm,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { sm, tm, smToTm, ruleResult };
	}

	public static final Object[] pattern_SpM2SpSRule_24_6_greenBBFFFBB(
			SourceModel sm, TargetModel tm,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		SplitMerge spM = SourceFactory.eINSTANCE.createSplitMerge();
		SpecialStep spS = TargetFactory.eINSTANCE.createSpecialStep();
		E2S spMToSpS = SourceToTargetCorrFactory.eINSTANCE.createE2S();
		Object _localVariable_0 = csp.getValue("spM", "id");
		Object _localVariable_1 = csp.getValue("spS", "id");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		sm.getElements().add(spM);
		ruleResult.getSourceObjects().add(spM);
		tm.getSteps().add(spS);
		ruleResult.getTargetObjects().add(spS);
		spMToSpS.setSource(spM);
		spMToSpS.setTarget(spS);
		ruleResult.getCorrObjects().add(spMToSpS);
		String spM_id_prime = (String) _localVariable_0;
		String spS_id_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		spM.setId(spM_id_prime);
		spS.setId(spS_id_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { sm, tm, spM, spS, spMToSpS, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SpM2SpSRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SpM2SpSRuleImpl
