/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.Element;
import Source.SourceFactory;
import Source._SpecialAttrType;

import SourceToTargetCorr.E2S;

import SourceToTargetCorr.Rules.RulesPackage;
import SourceToTargetCorr.Rules._SpAT2SpRule;

import SourceToTargetCorr.SourceToTargetCorrFactory;
import SourceToTargetCorr._SpAt2Sp;

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
 * An implementation of the model object '<em><b>Sp AT2 Sp Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class _SpAT2SpRuleImpl extends AbstractRuleImpl implements _SpAT2SpRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _SpAT2SpRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals._SP_AT2_SP_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Element e,
			_SpecialAttrType _spAt) {
		// initial bindings
		Object[] result1_black = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_0_1_blackBBBB(this, match, e, _spAt);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[e] = " + e + ", "
							+ "[_spAt] = " + _spAt + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_0_2_bindingAndBlackFBBBB(this, match, e,
						_spAt);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[e] = " + e + ", "
							+ "[_spAt] = " + _spAt + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_0_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_0_4_blackBBB(match, e, _spAt);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[e] = " + e + ", " + "[_spAt] = " + _spAt
								+ ".");
			}
			_SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_0_4_greenBBBF(match, e, _spAt);
			// EMoflonEdge e___spAt_____special = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_0_5_blackBBB(match, e, _spAt);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[e] = " + e + ", " + "[_spAt] = " + _spAt
								+ ".");
			}
			_SpAT2SpRuleImpl.pattern__SpAT2SpRule_0_5_greenBB(match, e);

			// register objects to match
			_SpAT2SpRuleImpl.pattern__SpAT2SpRule_0_6_expressionBBBB(this,
					match, e, _spAt);
			return _SpAT2SpRuleImpl.pattern__SpAT2SpRule_0_7_expressionF();
		} else {
			return _SpAT2SpRuleImpl.pattern__SpAT2SpRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_1_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Element e = (Element) result1_bindingAndBlack[0];
		Step s = (Step) result1_bindingAndBlack[1];
		E2S e2S = (E2S) result1_bindingAndBlack[2];
		_SpecialAttrType _spAt = (_SpecialAttrType) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_1_1_greenBBFFB(s, _spAt, csp);
		Special sp = (Special) result1_green[2];
		_SpAt2Sp _spAt2Sp = (_SpAt2Sp) result1_green[3];

		// collect translated elements
		Object[] result2_black = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_1_2_blackBBB(_spAt, sp, _spAt2Sp);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[_spAt] = " + _spAt + ", "
							+ "[sp] = " + sp + ", " + "[_spAt2Sp] = "
							+ _spAt2Sp + ".");
		}
		Object[] result2_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_1_2_greenFBBB(_spAt, sp, _spAt2Sp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_1_3_blackBBBBBBB(ruleresult, e, s, e2S,
						_spAt, sp, _spAt2Sp);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[e] = " + e + ", " + "[s] = " + s + ", "
							+ "[e2S] = " + e2S + ", " + "[_spAt] = " + _spAt
							+ ", " + "[sp] = " + sp + ", " + "[_spAt2Sp] = "
							+ _spAt2Sp + ".");
		}
		_SpAT2SpRuleImpl.pattern__SpAT2SpRule_1_3_greenBBBBBBFFFF(ruleresult,
				e, s, _spAt, sp, _spAt2Sp);
		// EMoflonEdge e___spAt_____special = (EMoflonEdge) result3_green[6];
		// EMoflonEdge s__sp____special = (EMoflonEdge) result3_green[7];
		// EMoflonEdge _spAt2Sp___spAt____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge _spAt2Sp__sp____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		_SpAT2SpRuleImpl.pattern__SpAT2SpRule_1_5_expressionBBBBBBBB(this,
				ruleresult, e, s, e2S, _spAt, sp, _spAt2Sp);
		return _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_2_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_2_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_2_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Element e = (Element) result2_binding[0];
		_SpecialAttrType _spAt = (_SpecialAttrType) result2_binding[1];
		for (Object[] result2_black : _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_2_2_blackBFFBB(e, _spAt, match)) {
			Step s = (Step) result2_black[1];
			E2S e2S = (E2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_2_3_blackBBBB(e, s, e2S, _spAt)) {
				Object[] result3_green = _SpAT2SpRuleImpl
						.pattern__SpAT2SpRule_2_3_greenBBBBFFFF(e, s, e2S,
								_spAt);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge e___spAt_____special = (EMoflonEdge) result3_green[5];
				// EMoflonEdge e2S__e____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge e2S__s____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = _SpAT2SpRuleImpl
						.pattern__SpAT2SpRule_2_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, e, s, e2S, _spAt);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[e] = " + e
									+ ", " + "[s] = " + s + ", " + "[e2S] = "
									+ e2S + ", " + "[_spAt] = " + _spAt + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_2_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = _SpAT2SpRuleImpl
							.pattern__SpAT2SpRule_2_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					_SpAT2SpRuleImpl.pattern__SpAT2SpRule_2_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Element e,
			_SpecialAttrType _spAt) {
		match.registerObject("e", e);
		match.registerObject("_spAt", _spAt);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Element e,
			_SpecialAttrType _spAt) {// Create CSP
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
			Element e, Step s, E2S e2S, _SpecialAttrType _spAt) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var__spAt_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"_spAt.value", true, csp);
		var__spAt_value.setValue(_spAt.getValue());
		var__spAt_value.setType("String");

		// Create unbound variables
		Variable var_sp_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"sp.value", csp);
		var_sp_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var__spAt_value, var_sp_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("e", e);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("e2S", e2S);
		isApplicableMatch.registerObject("_spAt", _spAt);
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
			EObject s, EObject e2S, EObject _spAt, EObject sp, EObject _spAt2Sp) {
		ruleresult.registerObject("e", e);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("e2S", e2S);
		ruleresult.registerObject("_spAt", _spAt);
		ruleresult.registerObject("sp", sp);
		ruleresult.registerObject("_spAt2Sp", _spAt2Sp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && match.getObject("_spAt").eClass()
				.equals(Source.SourcePackage.eINSTANCE.get_SpecialAttrType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Step s, Special sp) {
		// initial bindings
		Object[] result1_black = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_10_1_blackBBBB(this, match, s, sp);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [initial bindings] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[s] = " + s + ", "
							+ "[sp] = " + sp + ".");
		}

		// Solve CSP
		Object[] result2_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_10_2_bindingAndBlackFBBBB(this, match, s,
						sp);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [Solve CSP] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[match] = " + match + ", " + "[s] = " + s + ", "
							+ "[sp] = " + sp + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// Check CSP
		if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_10_3_expressionFBB(this, csp)) {

			// collect elements to be translated
			Object[] result4_black = _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_10_4_blackBBB(match, s, sp);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect elements to be translated] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[s] = " + s + ", " + "[sp] = " + sp + ".");
			}
			_SpAT2SpRuleImpl.pattern__SpAT2SpRule_10_4_greenBBBF(match, s, sp);
			// EMoflonEdge s__sp____special = (EMoflonEdge) result4_green[3];

			// collect context elements
			Object[] result5_black = _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_10_5_blackBBB(match, s, sp);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching in node [collect context elements] failed."
								+ " Variables: " + "[match] = " + match + ", "
								+ "[s] = " + s + ", " + "[sp] = " + sp + ".");
			}
			_SpAT2SpRuleImpl.pattern__SpAT2SpRule_10_5_greenBB(match, s);

			// register objects to match
			_SpAT2SpRuleImpl.pattern__SpAT2SpRule_10_6_expressionBBBB(this,
					match, s, sp);
			return _SpAT2SpRuleImpl.pattern__SpAT2SpRule_10_7_expressionF();
		} else {
			return _SpAT2SpRuleImpl.pattern__SpAT2SpRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// perform transformation
		Object[] result1_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_11_1_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [perform transformation] failed."
							+ " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch
							+ ".");
		}
		Element e = (Element) result1_bindingAndBlack[0];
		Step s = (Step) result1_bindingAndBlack[1];
		E2S e2S = (E2S) result1_bindingAndBlack[2];
		Special sp = (Special) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_11_1_greenBFBFB(e, sp, csp);
		_SpecialAttrType _spAt = (_SpecialAttrType) result1_green[1];
		_SpAt2Sp _spAt2Sp = (_SpAt2Sp) result1_green[3];

		// collect translated elements
		Object[] result2_black = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_11_2_blackBBB(_spAt, sp, _spAt2Sp);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [collect translated elements] failed."
							+ " Variables: " + "[_spAt] = " + _spAt + ", "
							+ "[sp] = " + sp + ", " + "[_spAt2Sp] = "
							+ _spAt2Sp + ".");
		}
		Object[] result2_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_11_2_greenFBBB(_spAt, sp, _spAt2Sp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		// bookkeeping for edges
		Object[] result3_black = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_11_3_blackBBBBBBB(ruleresult, e, s, e2S,
						_spAt, sp, _spAt2Sp);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [bookkeeping for edges] failed."
							+ " Variables: " + "[ruleresult] = " + ruleresult
							+ ", " + "[e] = " + e + ", " + "[s] = " + s + ", "
							+ "[e2S] = " + e2S + ", " + "[_spAt] = " + _spAt
							+ ", " + "[sp] = " + sp + ", " + "[_spAt2Sp] = "
							+ _spAt2Sp + ".");
		}
		_SpAT2SpRuleImpl.pattern__SpAT2SpRule_11_3_greenBBBBBBFFFF(ruleresult,
				e, s, _spAt, sp, _spAt2Sp);
		// EMoflonEdge e___spAt_____special = (EMoflonEdge) result3_green[6];
		// EMoflonEdge s__sp____special = (EMoflonEdge) result3_green[7];
		// EMoflonEdge _spAt2Sp___spAt____source = (EMoflonEdge) result3_green[8];
		// EMoflonEdge _spAt2Sp__sp____target = (EMoflonEdge) result3_green[9];

		// perform postprocessing story node is empty
		// register objects
		_SpAT2SpRuleImpl.pattern__SpAT2SpRule_11_5_expressionBBBBBBBB(this,
				ruleresult, e, s, e2S, _spAt, sp, _spAt2Sp);
		return _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// prepare return value
		Object[] result1_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_12_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		// EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_12_1_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach core match
		Object[] result2_binding = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_12_2_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException("Binding in node core match failed."
					+ " Variables: " + "[match] = " + match + ".");
		}
		Step s = (Step) result2_binding[0];
		Special sp = (Special) result2_binding[1];
		for (Object[] result2_black : _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_12_2_blackFBFBB(s, sp, match)) {
			Element e = (Element) result2_black[0];
			E2S e2S = (E2S) result2_black[2];
			// ForEach find context
			for (Object[] result3_black : _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_12_3_blackBBBB(e, s, e2S, sp)) {
				Object[] result3_green = _SpAT2SpRuleImpl
						.pattern__SpAT2SpRule_12_3_greenBBBBFFFF(e, s, e2S, sp);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				// EMoflonEdge s__sp____special = (EMoflonEdge) result3_green[5];
				// EMoflonEdge e2S__e____source = (EMoflonEdge) result3_green[6];
				// EMoflonEdge e2S__s____target = (EMoflonEdge) result3_green[7];

				// solve CSP
				Object[] result4_bindingAndBlack = _SpAT2SpRuleImpl
						.pattern__SpAT2SpRule_12_4_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, e, s, e2S, sp);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException(
							"Pattern matching in node [solve CSP] failed."
									+ " Variables: " + "[this] = " + this
									+ ", " + "[isApplicableMatch] = "
									+ isApplicableMatch + ", " + "[e] = " + e
									+ ", " + "[s] = " + s + ", " + "[e2S] = "
									+ e2S + ", " + "[sp] = " + sp + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// check CSP
				if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_12_5_expressionFBB(
						this, csp)) {

					// add match to rule result
					Object[] result6_black = _SpAT2SpRuleImpl
							.pattern__SpAT2SpRule_12_6_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [add match to rule result] failed."
										+ " Variables: " + "[ruleresult] = "
										+ ruleresult + ", "
										+ "[isApplicableMatch] = "
										+ isApplicableMatch + ".");
					}
					_SpAT2SpRuleImpl.pattern__SpAT2SpRule_12_6_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Step s, Special sp) {
		match.registerObject("s", s);
		match.registerObject("sp", sp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Step s, Special sp) {// Create CSP
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
			Element e, Step s, E2S e2S, Special sp) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_sp_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"sp.value", true, csp);
		var_sp_value.setValue(sp.getValue());
		var_sp_value.setType("String");

		// Create unbound variables
		Variable var__spAt_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"_spAt.value", csp);
		var__spAt_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var__spAt_value, var_sp_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("e", e);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("e2S", e2S);
		isApplicableMatch.registerObject("sp", sp);
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
			EObject s, EObject e2S, EObject _spAt, EObject sp, EObject _spAt2Sp) {
		ruleresult.registerObject("e", e);
		ruleresult.registerObject("s", s);
		ruleresult.registerObject("e2S", e2S);
		ruleresult.registerObject("_spAt", _spAt);
		ruleresult.registerObject("sp", sp);
		ruleresult.registerObject("_spAt2Sp", _spAt2Sp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && match.getObject("sp").eClass()
				.equals(Target.TargetPackage.eINSTANCE.getSpecial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_43(
			EMoflonEdge _edge__special) {
		// prepare return value
		Object[] result1_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_20_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_20_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_20_2_blackFFB(_edge__special)) {
			Element e = (Element) result2_black[0];
			_SpecialAttrType _spAt = (_SpecialAttrType) result2_black[1];
			Object[] result2_green = _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_20_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_20_3_expressionFBBBB(
					this, match, e, _spAt)) {
				// Ensure that the correct types of elements are matched
				if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_20_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = _SpAT2SpRuleImpl
							.pattern__SpAT2SpRule_20_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					_SpAT2SpRuleImpl.pattern__SpAT2SpRule_20_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_58(
			EMoflonEdge _edge_special) {
		// prepare return value
		Object[] result1_bindingAndBlack = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_21_1_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching in node [prepare return value] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_21_1_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach test core match and DECs
		for (Object[] result2_black : _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_21_2_blackFFB(_edge_special)) {
			Step s = (Step) result2_black[0];
			Special sp = (Special) result2_black[1];
			Object[] result2_green = _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_21_2_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// bookkeeping with generic isAppropriate method
			if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_21_3_expressionFBBBB(
					this, match, s, sp)) {
				// Ensure that the correct types of elements are matched
				if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_21_4_expressionFBB(
						this, match)) {

					// Add match to rule result
					Object[] result5_black = _SpAT2SpRuleImpl
							.pattern__SpAT2SpRule_21_5_blackBBB(match,
									__performOperation, __result);
					if (result5_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [Add match to rule result] failed."
										+ " Variables: " + "[match] = " + match
										+ ", " + "[__performOperation] = "
										+ __performOperation + ", "
										+ "[__result] = " + __result + ".");
					}
					_SpAT2SpRuleImpl.pattern__SpAT2SpRule_21_5_greenBBB(match,
							__performOperation, __result);

				} else {
				}

			} else {
			}

		}
		return _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_21_6_expressionFB(__result);
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
			RuleEntryContainer ruleEntryContainer, E2S e2SParameter) {
		// create result
		Object[] result1_black = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_24_1_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching in node [create result] failed."
							+ " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_24_1_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach is applicable core
		for (Object[] result2_black : _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_24_2_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			// RuleEntryList e2SList = (RuleEntryList) result2_black[0];
			Element e = (Element) result2_black[1];
			E2S e2S = (E2S) result2_black[2];
			Step s = (Step) result2_black[3];

			// solve CSP
			Object[] result3_bindingAndBlack = _SpAT2SpRuleImpl
					.pattern__SpAT2SpRule_24_3_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, e, s, e2S, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException(
						"Pattern matching in node [solve CSP] failed."
								+ " Variables: " + "[this] = " + this + ", "
								+ "[isApplicableMatch] = " + isApplicableMatch
								+ ", " + "[e] = " + e + ", " + "[s] = " + s
								+ ", " + "[e2S] = " + e2S + ", "
								+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// check CSP
			if (_SpAT2SpRuleImpl.pattern__SpAT2SpRule_24_4_expressionFBB(this,
					csp)) {
				// check nacs
				Object[] result5_black = _SpAT2SpRuleImpl
						.pattern__SpAT2SpRule_24_5_blackBBB(e, s, e2S);
				if (result5_black != null) {

					// perform
					Object[] result6_black = _SpAT2SpRuleImpl
							.pattern__SpAT2SpRule_24_6_blackBBBB(e, s, e2S,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching in node [perform] failed."
										+ " Variables: " + "[e] = " + e + ", "
										+ "[s] = " + s + ", " + "[e2S] = "
										+ e2S + ", " + "[ruleResult] = "
										+ ruleResult + ".");
					}
					_SpAT2SpRuleImpl.pattern__SpAT2SpRule_24_6_greenBBFFFBB(e,
							s, ruleResult, csp);
					// _SpecialAttrType _spAt = (_SpecialAttrType) result6_green[2];
					// Special sp = (Special) result6_green[3];
					// _SpAt2Sp _spAt2Sp = (_SpAt2Sp) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return _SpAT2SpRuleImpl
				.pattern__SpAT2SpRule_24_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			Element e, Step s, E2S e2S, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var__spAt_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"_spAt.value", csp);
		var__spAt_value.setType("String");
		Variable var_sp_value = CSPFactoryHelper.eINSTANCE.createVariable(
				"sp.value", csp);
		var_sp_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("");
		eq.solve(var__spAt_value, var_sp_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("e", e);
		isApplicableMatch.registerObject("s", s);
		isApplicableMatch.registerObject("e2S", e2S);
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
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENT__SPECIALATTRTYPE:
			return isAppropriate_FWD((Match) arguments.get(0),
					(Element) arguments.get(1),
					(_SpecialAttrType) arguments.get(2));
		case RulesPackage._SP_AT2_SP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENT__SPECIALATTRTYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(Element) arguments.get(1),
					(_SpecialAttrType) arguments.get(2));
			return null;
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENT__SPECIALATTRTYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(Element) arguments.get(1),
					(_SpecialAttrType) arguments.get(2));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S__SPECIALATTRTYPE:
			return isApplicable_solveCsp_FWD(
					(IsApplicableMatch) arguments.get(0),
					(Element) arguments.get(1), (Step) arguments.get(2),
					(E2S) arguments.get(3), (_SpecialAttrType) arguments.get(4));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage._SP_AT2_SP_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_SPECIAL:
			return isAppropriate_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (Special) arguments.get(2));
		case RulesPackage._SP_AT2_SP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_SPECIAL:
			registerObjectsToMatch_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (Special) arguments.get(2));
			return null;
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_SPECIAL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
					(Step) arguments.get(1), (Special) arguments.get(2));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_SPECIAL:
			return isApplicable_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Element) arguments.get(1), (Step) arguments.get(2),
					(E2S) arguments.get(3), (Special) arguments.get(4));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0),
					(EObject) arguments.get(1), (EObject) arguments.get(2),
					(EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage._SP_AT2_SP_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_43__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_43((EMoflonEdge) arguments
					.get(0));
		case RulesPackage._SP_AT2_SP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_58((EMoflonEdge) arguments
					.get(0));
		case RulesPackage._SP_AT2_SP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage._SP_AT2_SP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(E2S) arguments.get(1));
		case RulesPackage._SP_AT2_SP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD(
					(IsApplicableMatch) arguments.get(0),
					(Element) arguments.get(1), (Step) arguments.get(2),
					(E2S) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage._SP_AT2_SP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern__SpAT2SpRule_0_1_blackBBBB(
			_SpAT2SpRule _this, Match match, Element e, _SpecialAttrType _spAt) {
		return new Object[] { _this, match, e, _spAt };
	}

	public static final Object[] pattern__SpAT2SpRule_0_2_bindingFBBBB(
			_SpAT2SpRule _this, Match match, Element e, _SpecialAttrType _spAt) {
		CSP _localVariable_0 = _this
				.isAppropriate_solveCsp_FWD(match, e, _spAt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, e, _spAt };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_0_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern__SpAT2SpRule_0_2_bindingAndBlackFBBBB(
			_SpAT2SpRule _this, Match match, Element e, _SpecialAttrType _spAt) {
		Object[] result_pattern__SpAT2SpRule_0_2_binding = pattern__SpAT2SpRule_0_2_bindingFBBBB(
				_this, match, e, _spAt);
		if (result_pattern__SpAT2SpRule_0_2_binding != null) {
			CSP csp = (CSP) result_pattern__SpAT2SpRule_0_2_binding[0];

			Object[] result_pattern__SpAT2SpRule_0_2_black = pattern__SpAT2SpRule_0_2_blackB(csp);
			if (result_pattern__SpAT2SpRule_0_2_black != null) {

				return new Object[] { csp, _this, match, e, _spAt };
			}
		}
		return null;
	}

	public static final boolean pattern__SpAT2SpRule_0_3_expressionFBB(
			_SpAT2SpRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_0_4_blackBBB(Match match,
			Element e, _SpecialAttrType _spAt) {
		return new Object[] { match, e, _spAt };
	}

	public static final Object[] pattern__SpAT2SpRule_0_4_greenBBBF(
			Match match, Element e, _SpecialAttrType _spAt) {
		EMoflonEdge e___spAt_____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(_spAt);
		String e___spAt_____special_name_prime = "_special";
		e___spAt_____special.setSrc(e);
		e___spAt_____special.setTrg(_spAt);
		match.getToBeTranslatedEdges().add(e___spAt_____special);
		e___spAt_____special.setName(e___spAt_____special_name_prime);
		return new Object[] { match, e, _spAt, e___spAt_____special };
	}

	public static final Object[] pattern__SpAT2SpRule_0_5_blackBBB(Match match,
			Element e, _SpecialAttrType _spAt) {
		return new Object[] { match, e, _spAt };
	}

	public static final Object[] pattern__SpAT2SpRule_0_5_greenBB(Match match,
			Element e) {
		match.getContextNodes().add(e);
		return new Object[] { match, e };
	}

	public static final void pattern__SpAT2SpRule_0_6_expressionBBBB(
			_SpAT2SpRule _this, Match match, Element e, _SpecialAttrType _spAt) {
		_this.registerObjectsToMatch_FWD(match, e, _spAt);

	}

	public static final boolean pattern__SpAT2SpRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern__SpAT2SpRule_0_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_1_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("e");
		EObject _localVariable_1 = isApplicableMatch.getObject("s");
		EObject _localVariable_2 = isApplicableMatch.getObject("e2S");
		EObject _localVariable_3 = isApplicableMatch.getObject("_spAt");
		EObject tmpE = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpE2S = _localVariable_2;
		EObject tmp_spAt = _localVariable_3;
		if (tmpE instanceof Element) {
			Element e = (Element) tmpE;
			if (tmpS instanceof Step) {
				Step s = (Step) tmpS;
				if (tmpE2S instanceof E2S) {
					E2S e2S = (E2S) tmpE2S;
					if (tmp_spAt instanceof _SpecialAttrType) {
						_SpecialAttrType _spAt = (_SpecialAttrType) tmp_spAt;
						return new Object[] { e, s, e2S, _spAt,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_1_1_blackBBBBFBB(
			Element e, Step s, E2S e2S, _SpecialAttrType _spAt,
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { e, s, e2S, _spAt, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_1_1_bindingAndBlackFFFFFBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern__SpAT2SpRule_1_1_binding = pattern__SpAT2SpRule_1_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern__SpAT2SpRule_1_1_binding != null) {
			Element e = (Element) result_pattern__SpAT2SpRule_1_1_binding[0];
			Step s = (Step) result_pattern__SpAT2SpRule_1_1_binding[1];
			E2S e2S = (E2S) result_pattern__SpAT2SpRule_1_1_binding[2];
			_SpecialAttrType _spAt = (_SpecialAttrType) result_pattern__SpAT2SpRule_1_1_binding[3];

			Object[] result_pattern__SpAT2SpRule_1_1_black = pattern__SpAT2SpRule_1_1_blackBBBBFBB(
					e, s, e2S, _spAt, _this, isApplicableMatch);
			if (result_pattern__SpAT2SpRule_1_1_black != null) {
				CSP csp = (CSP) result_pattern__SpAT2SpRule_1_1_black[4];

				return new Object[] { e, s, e2S, _spAt, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_1_1_greenBBFFB(Step s,
			_SpecialAttrType _spAt, CSP csp) {
		Special sp = TargetFactory.eINSTANCE.createSpecial();
		_SpAt2Sp _spAt2Sp = SourceToTargetCorrFactory.eINSTANCE
				.create_SpAt2Sp();
		Object _localVariable_0 = csp.getValue("sp", "value");
		s.setSpecial(sp);
		_spAt2Sp.setSource(_spAt);
		_spAt2Sp.setTarget(sp);
		String sp_value_prime = (String) _localVariable_0;
		sp.setValue(sp_value_prime);
		return new Object[] { s, _spAt, sp, _spAt2Sp, csp };
	}

	public static final Object[] pattern__SpAT2SpRule_1_2_blackBBB(
			_SpecialAttrType _spAt, Special sp, _SpAt2Sp _spAt2Sp) {
		return new Object[] { _spAt, sp, _spAt2Sp };
	}

	public static final Object[] pattern__SpAT2SpRule_1_2_greenFBBB(
			_SpecialAttrType _spAt, Special sp, _SpAt2Sp _spAt2Sp) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(_spAt);
		ruleresult.getCreatedElements().add(sp);
		ruleresult.getCreatedLinkElements().add(_spAt2Sp);
		return new Object[] { ruleresult, _spAt, sp, _spAt2Sp };
	}

	public static final Object[] pattern__SpAT2SpRule_1_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject e2S,
			EObject _spAt, EObject sp, EObject _spAt2Sp) {
		if (!e.equals(s)) {
			if (!e.equals(e2S)) {
				if (!e.equals(sp)) {
					if (!s.equals(sp)) {
						if (!e2S.equals(s)) {
							if (!e2S.equals(sp)) {
								if (!_spAt.equals(e)) {
									if (!_spAt.equals(s)) {
										if (!_spAt.equals(e2S)) {
											if (!_spAt.equals(sp)) {
												if (!_spAt.equals(_spAt2Sp)) {
													if (!_spAt2Sp.equals(e)) {
														if (!_spAt2Sp.equals(s)) {
															if (!_spAt2Sp
																	.equals(e2S)) {
																if (!_spAt2Sp
																		.equals(sp)) {
																	return new Object[] {
																			ruleresult,
																			e,
																			s,
																			e2S,
																			_spAt,
																			sp,
																			_spAt2Sp };
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

	public static final Object[] pattern__SpAT2SpRule_1_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject _spAt,
			EObject sp, EObject _spAt2Sp) {
		EMoflonEdge e___spAt_____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _spAt2Sp___spAt____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _spAt2Sp__sp____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "_SpAT2SpRule";
		String e___spAt_____special_name_prime = "_special";
		String s__sp____special_name_prime = "special";
		String _spAt2Sp___spAt____source_name_prime = "source";
		String _spAt2Sp__sp____target_name_prime = "target";
		e___spAt_____special.setSrc(e);
		e___spAt_____special.setTrg(_spAt);
		ruleresult.getTranslatedEdges().add(e___spAt_____special);
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		ruleresult.getCreatedEdges().add(s__sp____special);
		_spAt2Sp___spAt____source.setSrc(_spAt2Sp);
		_spAt2Sp___spAt____source.setTrg(_spAt);
		ruleresult.getCreatedEdges().add(_spAt2Sp___spAt____source);
		_spAt2Sp__sp____target.setSrc(_spAt2Sp);
		_spAt2Sp__sp____target.setTrg(sp);
		ruleresult.getCreatedEdges().add(_spAt2Sp__sp____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		e___spAt_____special.setName(e___spAt_____special_name_prime);
		s__sp____special.setName(s__sp____special_name_prime);
		_spAt2Sp___spAt____source.setName(_spAt2Sp___spAt____source_name_prime);
		_spAt2Sp__sp____target.setName(_spAt2Sp__sp____target_name_prime);
		return new Object[] { ruleresult, e, s, _spAt, sp, _spAt2Sp,
				e___spAt_____special, s__sp____special,
				_spAt2Sp___spAt____source, _spAt2Sp__sp____target };
	}

	public static final void pattern__SpAT2SpRule_1_5_expressionBBBBBBBB(
			_SpAT2SpRule _this, PerformRuleResult ruleresult, EObject e,
			EObject s, EObject e2S, EObject _spAt, EObject sp, EObject _spAt2Sp) {
		_this.registerObjects_FWD(ruleresult, e, s, e2S, _spAt, sp, _spAt2Sp);

	}

	public static final PerformRuleResult pattern__SpAT2SpRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_2_1_bindingFB(
			_SpAT2SpRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_2_1_blackFBB(
			EClass eClass, _SpAT2SpRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_2_1_bindingAndBlackFFB(
			_SpAT2SpRule _this) {
		Object[] result_pattern__SpAT2SpRule_2_1_binding = pattern__SpAT2SpRule_2_1_bindingFB(_this);
		if (result_pattern__SpAT2SpRule_2_1_binding != null) {
			EClass eClass = (EClass) result_pattern__SpAT2SpRule_2_1_binding[0];

			Object[] result_pattern__SpAT2SpRule_2_1_black = pattern__SpAT2SpRule_2_1_blackFBB(
					eClass, _this);
			if (result_pattern__SpAT2SpRule_2_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern__SpAT2SpRule_2_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_2_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "_SpAT2SpRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern__SpAT2SpRule_2_2_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("e");
		EObject _localVariable_1 = match.getObject("_spAt");
		EObject tmpE = _localVariable_0;
		EObject tmp_spAt = _localVariable_1;
		if (tmpE instanceof Element) {
			Element e = (Element) tmpE;
			if (tmp_spAt instanceof _SpecialAttrType) {
				_SpecialAttrType _spAt = (_SpecialAttrType) tmp_spAt;
				return new Object[] { e, _spAt, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern__SpAT2SpRule_2_2_blackBFFBB(
			Element e, _SpecialAttrType _spAt, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (E2S e2S : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(e, E2S.class, "source")) {
			Step s = e2S.getTarget();
			if (s != null) {
				_result.add(new Object[] { e, s, e2S, _spAt, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern__SpAT2SpRule_2_3_blackBBBB(
			Element e, Step s, E2S e2S, _SpecialAttrType _spAt) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (_spAt.equals(e.get_special())) {
			if (e.equals(e2S.getSource())) {
				if (s.equals(e2S.getTarget())) {
					_result.add(new Object[] { e, s, e2S, _spAt });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_2_3_greenBBBBFFFF(
			Element e, Step s, E2S e2S, _SpecialAttrType _spAt) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge e___spAt_____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__e____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__s____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String e___spAt_____special_name_prime = "_special";
		String e2S__e____source_name_prime = "source";
		String e2S__s____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(e);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(e2S);
		isApplicableMatch.getAllContextElements().add(_spAt);
		e___spAt_____special.setSrc(e);
		e___spAt_____special.setTrg(_spAt);
		isApplicableMatch.getAllContextElements().add(e___spAt_____special);
		e2S__e____source.setSrc(e2S);
		e2S__e____source.setTrg(e);
		isApplicableMatch.getAllContextElements().add(e2S__e____source);
		e2S__s____target.setSrc(e2S);
		e2S__s____target.setTrg(s);
		isApplicableMatch.getAllContextElements().add(e2S__s____target);
		e___spAt_____special.setName(e___spAt_____special_name_prime);
		e2S__e____source.setName(e2S__e____source_name_prime);
		e2S__s____target.setName(e2S__s____target_name_prime);
		return new Object[] { e, s, e2S, _spAt, isApplicableMatch,
				e___spAt_____special, e2S__e____source, e2S__s____target };
	}

	public static final Object[] pattern__SpAT2SpRule_2_4_bindingFBBBBBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch, Element e,
			Step s, E2S e2S, _SpecialAttrType _spAt) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(
				isApplicableMatch, e, s, e2S, _spAt);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, e, s, e2S,
					_spAt };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_2_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern__SpAT2SpRule_2_4_bindingAndBlackFBBBBBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch, Element e,
			Step s, E2S e2S, _SpecialAttrType _spAt) {
		Object[] result_pattern__SpAT2SpRule_2_4_binding = pattern__SpAT2SpRule_2_4_bindingFBBBBBB(
				_this, isApplicableMatch, e, s, e2S, _spAt);
		if (result_pattern__SpAT2SpRule_2_4_binding != null) {
			CSP csp = (CSP) result_pattern__SpAT2SpRule_2_4_binding[0];

			Object[] result_pattern__SpAT2SpRule_2_4_black = pattern__SpAT2SpRule_2_4_blackB(csp);
			if (result_pattern__SpAT2SpRule_2_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, e, s, e2S,
						_spAt };
			}
		}
		return null;
	}

	public static final boolean pattern__SpAT2SpRule_2_5_expressionFBB(
			_SpAT2SpRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_2_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern__SpAT2SpRule_2_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "_SpAT2SpRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern__SpAT2SpRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_10_1_blackBBBB(
			_SpAT2SpRule _this, Match match, Step s, Special sp) {
		return new Object[] { _this, match, s, sp };
	}

	public static final Object[] pattern__SpAT2SpRule_10_2_bindingFBBBB(
			_SpAT2SpRule _this, Match match, Step s, Special sp) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, s, sp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, s, sp };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_10_2_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern__SpAT2SpRule_10_2_bindingAndBlackFBBBB(
			_SpAT2SpRule _this, Match match, Step s, Special sp) {
		Object[] result_pattern__SpAT2SpRule_10_2_binding = pattern__SpAT2SpRule_10_2_bindingFBBBB(
				_this, match, s, sp);
		if (result_pattern__SpAT2SpRule_10_2_binding != null) {
			CSP csp = (CSP) result_pattern__SpAT2SpRule_10_2_binding[0];

			Object[] result_pattern__SpAT2SpRule_10_2_black = pattern__SpAT2SpRule_10_2_blackB(csp);
			if (result_pattern__SpAT2SpRule_10_2_black != null) {

				return new Object[] { csp, _this, match, s, sp };
			}
		}
		return null;
	}

	public static final boolean pattern__SpAT2SpRule_10_3_expressionFBB(
			_SpAT2SpRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_10_4_blackBBB(
			Match match, Step s, Special sp) {
		return new Object[] { match, s, sp };
	}

	public static final Object[] pattern__SpAT2SpRule_10_4_greenBBBF(
			Match match, Step s, Special sp) {
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sp);
		String s__sp____special_name_prime = "special";
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		match.getToBeTranslatedEdges().add(s__sp____special);
		s__sp____special.setName(s__sp____special_name_prime);
		return new Object[] { match, s, sp, s__sp____special };
	}

	public static final Object[] pattern__SpAT2SpRule_10_5_blackBBB(
			Match match, Step s, Special sp) {
		return new Object[] { match, s, sp };
	}

	public static final Object[] pattern__SpAT2SpRule_10_5_greenBB(Match match,
			Step s) {
		match.getContextNodes().add(s);
		return new Object[] { match, s };
	}

	public static final void pattern__SpAT2SpRule_10_6_expressionBBBB(
			_SpAT2SpRule _this, Match match, Step s, Special sp) {
		_this.registerObjectsToMatch_BWD(match, s, sp);

	}

	public static final boolean pattern__SpAT2SpRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern__SpAT2SpRule_10_8_expressionF() {
		boolean _result = false;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_11_1_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("e");
		EObject _localVariable_1 = isApplicableMatch.getObject("s");
		EObject _localVariable_2 = isApplicableMatch.getObject("e2S");
		EObject _localVariable_3 = isApplicableMatch.getObject("sp");
		EObject tmpE = _localVariable_0;
		EObject tmpS = _localVariable_1;
		EObject tmpE2S = _localVariable_2;
		EObject tmpSp = _localVariable_3;
		if (tmpE instanceof Element) {
			Element e = (Element) tmpE;
			if (tmpS instanceof Step) {
				Step s = (Step) tmpS;
				if (tmpE2S instanceof E2S) {
					E2S e2S = (E2S) tmpE2S;
					if (tmpSp instanceof Special) {
						Special sp = (Special) tmpSp;
						return new Object[] { e, s, e2S, sp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_11_1_blackBBBBFBB(
			Element e, Step s, E2S e2S, Special sp, _SpAT2SpRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { e, s, e2S, sp, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_11_1_bindingAndBlackFFFFFBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern__SpAT2SpRule_11_1_binding = pattern__SpAT2SpRule_11_1_bindingFFFFB(isApplicableMatch);
		if (result_pattern__SpAT2SpRule_11_1_binding != null) {
			Element e = (Element) result_pattern__SpAT2SpRule_11_1_binding[0];
			Step s = (Step) result_pattern__SpAT2SpRule_11_1_binding[1];
			E2S e2S = (E2S) result_pattern__SpAT2SpRule_11_1_binding[2];
			Special sp = (Special) result_pattern__SpAT2SpRule_11_1_binding[3];

			Object[] result_pattern__SpAT2SpRule_11_1_black = pattern__SpAT2SpRule_11_1_blackBBBBFBB(
					e, s, e2S, sp, _this, isApplicableMatch);
			if (result_pattern__SpAT2SpRule_11_1_black != null) {
				CSP csp = (CSP) result_pattern__SpAT2SpRule_11_1_black[4];

				return new Object[] { e, s, e2S, sp, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_11_1_greenBFBFB(
			Element e, Special sp, CSP csp) {
		_SpecialAttrType _spAt = SourceFactory.eINSTANCE
				.create_SpecialAttrType();
		_SpAt2Sp _spAt2Sp = SourceToTargetCorrFactory.eINSTANCE
				.create_SpAt2Sp();
		Object _localVariable_0 = csp.getValue("_spAt", "value");
		e.set_special(_spAt);
		_spAt2Sp.setSource(_spAt);
		_spAt2Sp.setTarget(sp);
		String _spAt_value_prime = (String) _localVariable_0;
		_spAt.setValue(_spAt_value_prime);
		return new Object[] { e, _spAt, sp, _spAt2Sp, csp };
	}

	public static final Object[] pattern__SpAT2SpRule_11_2_blackBBB(
			_SpecialAttrType _spAt, Special sp, _SpAt2Sp _spAt2Sp) {
		return new Object[] { _spAt, sp, _spAt2Sp };
	}

	public static final Object[] pattern__SpAT2SpRule_11_2_greenFBBB(
			_SpecialAttrType _spAt, Special sp, _SpAt2Sp _spAt2Sp) {
		PerformRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createPerformRuleResult();
		ruleresult.getCreatedElements().add(_spAt);
		ruleresult.getTranslatedElements().add(sp);
		ruleresult.getCreatedLinkElements().add(_spAt2Sp);
		return new Object[] { ruleresult, _spAt, sp, _spAt2Sp };
	}

	public static final Object[] pattern__SpAT2SpRule_11_3_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject e2S,
			EObject _spAt, EObject sp, EObject _spAt2Sp) {
		if (!e.equals(s)) {
			if (!e.equals(e2S)) {
				if (!e.equals(sp)) {
					if (!s.equals(sp)) {
						if (!e2S.equals(s)) {
							if (!e2S.equals(sp)) {
								if (!_spAt.equals(e)) {
									if (!_spAt.equals(s)) {
										if (!_spAt.equals(e2S)) {
											if (!_spAt.equals(sp)) {
												if (!_spAt.equals(_spAt2Sp)) {
													if (!_spAt2Sp.equals(e)) {
														if (!_spAt2Sp.equals(s)) {
															if (!_spAt2Sp
																	.equals(e2S)) {
																if (!_spAt2Sp
																		.equals(sp)) {
																	return new Object[] {
																			ruleresult,
																			e,
																			s,
																			e2S,
																			_spAt,
																			sp,
																			_spAt2Sp };
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

	public static final Object[] pattern__SpAT2SpRule_11_3_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject e, EObject s, EObject _spAt,
			EObject sp, EObject _spAt2Sp) {
		EMoflonEdge e___spAt_____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _spAt2Sp___spAt____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge _spAt2Sp__sp____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "_SpAT2SpRule";
		String e___spAt_____special_name_prime = "_special";
		String s__sp____special_name_prime = "special";
		String _spAt2Sp___spAt____source_name_prime = "source";
		String _spAt2Sp__sp____target_name_prime = "target";
		e___spAt_____special.setSrc(e);
		e___spAt_____special.setTrg(_spAt);
		ruleresult.getCreatedEdges().add(e___spAt_____special);
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		ruleresult.getTranslatedEdges().add(s__sp____special);
		_spAt2Sp___spAt____source.setSrc(_spAt2Sp);
		_spAt2Sp___spAt____source.setTrg(_spAt);
		ruleresult.getCreatedEdges().add(_spAt2Sp___spAt____source);
		_spAt2Sp__sp____target.setSrc(_spAt2Sp);
		_spAt2Sp__sp____target.setTrg(sp);
		ruleresult.getCreatedEdges().add(_spAt2Sp__sp____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		e___spAt_____special.setName(e___spAt_____special_name_prime);
		s__sp____special.setName(s__sp____special_name_prime);
		_spAt2Sp___spAt____source.setName(_spAt2Sp___spAt____source_name_prime);
		_spAt2Sp__sp____target.setName(_spAt2Sp__sp____target_name_prime);
		return new Object[] { ruleresult, e, s, _spAt, sp, _spAt2Sp,
				e___spAt_____special, s__sp____special,
				_spAt2Sp___spAt____source, _spAt2Sp__sp____target };
	}

	public static final void pattern__SpAT2SpRule_11_5_expressionBBBBBBBB(
			_SpAT2SpRule _this, PerformRuleResult ruleresult, EObject e,
			EObject s, EObject e2S, EObject _spAt, EObject sp, EObject _spAt2Sp) {
		_this.registerObjects_BWD(ruleresult, e, s, e2S, _spAt, sp, _spAt2Sp);

	}

	public static final PerformRuleResult pattern__SpAT2SpRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_12_1_bindingFB(
			_SpAT2SpRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_12_1_blackFBB(
			EClass eClass, _SpAT2SpRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperationname = performOperation.getName();
			if (performOperationname.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_12_1_bindingAndBlackFFB(
			_SpAT2SpRule _this) {
		Object[] result_pattern__SpAT2SpRule_12_1_binding = pattern__SpAT2SpRule_12_1_bindingFB(_this);
		if (result_pattern__SpAT2SpRule_12_1_binding != null) {
			EClass eClass = (EClass) result_pattern__SpAT2SpRule_12_1_binding[0];

			Object[] result_pattern__SpAT2SpRule_12_1_black = pattern__SpAT2SpRule_12_1_blackFBB(
					eClass, _this);
			if (result_pattern__SpAT2SpRule_12_1_black != null) {
				EOperation performOperation = (EOperation) result_pattern__SpAT2SpRule_12_1_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_12_1_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = false;
		String ruleresult_rule_prime = "_SpAT2SpRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern__SpAT2SpRule_12_2_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("s");
		EObject _localVariable_1 = match.getObject("sp");
		EObject tmpS = _localVariable_0;
		EObject tmpSp = _localVariable_1;
		if (tmpS instanceof Step) {
			Step s = (Step) tmpS;
			if (tmpSp instanceof Special) {
				Special sp = (Special) tmpSp;
				return new Object[] { s, sp, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern__SpAT2SpRule_12_2_blackFBFBB(
			Step s, Special sp, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (E2S e2S : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(s, E2S.class, "target")) {
			Element e = e2S.getSource();
			if (e != null) {
				_result.add(new Object[] { e, s, e2S, sp, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern__SpAT2SpRule_12_3_blackBBBB(
			Element e, Step s, E2S e2S, Special sp) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (sp.equals(s.getSpecial())) {
			if (e.equals(e2S.getSource())) {
				if (s.equals(e2S.getTarget())) {
					_result.add(new Object[] { e, s, e2S, sp });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_12_3_greenBBBBFFFF(
			Element e, Step s, E2S e2S, Special sp) {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		EMoflonEdge s__sp____special = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__e____source = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge e2S__s____target = TGGRuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String s__sp____special_name_prime = "special";
		String e2S__e____source_name_prime = "source";
		String e2S__s____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(e);
		isApplicableMatch.getAllContextElements().add(s);
		isApplicableMatch.getAllContextElements().add(e2S);
		isApplicableMatch.getAllContextElements().add(sp);
		s__sp____special.setSrc(s);
		s__sp____special.setTrg(sp);
		isApplicableMatch.getAllContextElements().add(s__sp____special);
		e2S__e____source.setSrc(e2S);
		e2S__e____source.setTrg(e);
		isApplicableMatch.getAllContextElements().add(e2S__e____source);
		e2S__s____target.setSrc(e2S);
		e2S__s____target.setTrg(s);
		isApplicableMatch.getAllContextElements().add(e2S__s____target);
		s__sp____special.setName(s__sp____special_name_prime);
		e2S__e____source.setName(e2S__e____source_name_prime);
		e2S__s____target.setName(e2S__s____target_name_prime);
		return new Object[] { e, s, e2S, sp, isApplicableMatch,
				s__sp____special, e2S__e____source, e2S__s____target };
	}

	public static final Object[] pattern__SpAT2SpRule_12_4_bindingFBBBBBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch, Element e,
			Step s, E2S e2S, Special sp) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(
				isApplicableMatch, e, s, e2S, sp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, e, s, e2S, sp };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_12_4_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern__SpAT2SpRule_12_4_bindingAndBlackFBBBBBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch, Element e,
			Step s, E2S e2S, Special sp) {
		Object[] result_pattern__SpAT2SpRule_12_4_binding = pattern__SpAT2SpRule_12_4_bindingFBBBBBB(
				_this, isApplicableMatch, e, s, e2S, sp);
		if (result_pattern__SpAT2SpRule_12_4_binding != null) {
			CSP csp = (CSP) result_pattern__SpAT2SpRule_12_4_binding[0];

			Object[] result_pattern__SpAT2SpRule_12_4_black = pattern__SpAT2SpRule_12_4_blackB(csp);
			if (result_pattern__SpAT2SpRule_12_4_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, e, s, e2S,
						sp };
			}
		}
		return null;
	}

	public static final boolean pattern__SpAT2SpRule_12_5_expressionFBB(
			_SpAT2SpRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_12_6_blackBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern__SpAT2SpRule_12_6_greenBB(
			IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "_SpAT2SpRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern__SpAT2SpRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_20_1_bindingFB(
			_SpAT2SpRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_20_1_blackFBB(
			EClass __eClass, _SpAT2SpRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_FWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_20_1_bindingAndBlackFFB(
			_SpAT2SpRule _this) {
		Object[] result_pattern__SpAT2SpRule_20_1_binding = pattern__SpAT2SpRule_20_1_bindingFB(_this);
		if (result_pattern__SpAT2SpRule_20_1_binding != null) {
			EClass __eClass = (EClass) result_pattern__SpAT2SpRule_20_1_binding[0];

			Object[] result_pattern__SpAT2SpRule_20_1_black = pattern__SpAT2SpRule_20_1_blackFBB(
					__eClass, _this);
			if (result_pattern__SpAT2SpRule_20_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern__SpAT2SpRule_20_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_20_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern__SpAT2SpRule_20_2_black_nac_0BB(
			_SpecialAttrType _spAt, Element e) {
		for (Element __DEC__spAt__special_395106 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(_spAt, Element.class, "_special")) {
			if (!e.equals(__DEC__spAt__special_395106)) {
				return new Object[] { _spAt, e };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern__SpAT2SpRule_20_2_blackFFB(
			EMoflonEdge _edge__special) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpE = _edge__special.getSrc();
		if (tmpE instanceof Element) {
			Element e = (Element) tmpE;
			EObject tmp_spAt = _edge__special.getTrg();
			if (tmp_spAt instanceof _SpecialAttrType) {
				_SpecialAttrType _spAt = (_SpecialAttrType) tmp_spAt;
				if (_spAt.equals(e.get_special())) {
					if (pattern__SpAT2SpRule_20_2_black_nac_0BB(_spAt, e) == null) {
						_result.add(new Object[] { e, _spAt, _edge__special });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_20_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern__SpAT2SpRule_20_3_expressionFBBBB(
			_SpAT2SpRule _this, Match match, Element e, _SpecialAttrType _spAt) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, e, _spAt);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern__SpAT2SpRule_20_4_expressionFBB(
			_SpAT2SpRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_20_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern__SpAT2SpRule_20_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern__SpAT2SpRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_21_1_bindingFB(
			_SpAT2SpRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_21_1_blackFBB(
			EClass __eClass, _SpAT2SpRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperationname = __performOperation.getName();
			if (__performOperationname.equals("isApplicable_BWD")) {
				return new Object[] { __performOperation, __eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_21_1_bindingAndBlackFFB(
			_SpAT2SpRule _this) {
		Object[] result_pattern__SpAT2SpRule_21_1_binding = pattern__SpAT2SpRule_21_1_bindingFB(_this);
		if (result_pattern__SpAT2SpRule_21_1_binding != null) {
			EClass __eClass = (EClass) result_pattern__SpAT2SpRule_21_1_binding[0];

			Object[] result_pattern__SpAT2SpRule_21_1_black = pattern__SpAT2SpRule_21_1_blackFBB(
					__eClass, _this);
			if (result_pattern__SpAT2SpRule_21_1_black != null) {
				EOperation __performOperation = (EOperation) result_pattern__SpAT2SpRule_21_1_black[0];

				return new Object[] { __performOperation, __eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_21_1_greenF() {
		EObjectContainer __result = TGGRuntimeFactory.eINSTANCE
				.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern__SpAT2SpRule_21_2_black_nac_0BB(
			Special sp, Step s) {
		for (Step __DEC_sp_special_682499 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(sp, Step.class, "special")) {
			if (!s.equals(__DEC_sp_special_682499)) {
				return new Object[] { sp, s };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern__SpAT2SpRule_21_2_blackFFB(
			EMoflonEdge _edge_special) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpS = _edge_special.getSrc();
		if (tmpS instanceof Step) {
			Step s = (Step) tmpS;
			EObject tmpSp = _edge_special.getTrg();
			if (tmpSp instanceof Special) {
				Special sp = (Special) tmpSp;
				if (sp.equals(s.getSpecial())) {
					if (pattern__SpAT2SpRule_21_2_black_nac_0BB(sp, s) == null) {
						_result.add(new Object[] { s, sp, _edge_special });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_21_2_greenFB(
			EClass __eClass) {
		Match match = TGGRuntimeFactory.eINSTANCE.createMatch();
		String __eClassname = __eClass.getName();
		String match_ruleName_prime = __eClassname;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern__SpAT2SpRule_21_3_expressionFBBBB(
			_SpAT2SpRule _this, Match match, Step s, Special sp) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, s, sp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern__SpAT2SpRule_21_4_expressionFBB(
			_SpAT2SpRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_21_5_blackBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		return new Object[] { match, __performOperation, __result };
	}

	public static final Object[] pattern__SpAT2SpRule_21_5_greenBBB(
			Match match, EOperation __performOperation,
			EObjectContainer __result) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		return new Object[] { match, __performOperation, __result };
	}

	public static final EObjectContainer pattern__SpAT2SpRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_24_1_blackB(
			_SpAT2SpRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern__SpAT2SpRule_24_1_greenFF() {
		IsApplicableMatch isApplicableMatch = TGGRuntimeFactory.eINSTANCE
				.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = TGGRuntimeFactory.eINSTANCE
				.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = false;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern__SpAT2SpRule_24_2_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Element e) {
		if (ruleResult.getSourceObjects().contains(e)) {
			return new Object[] { ruleResult, e };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_24_2_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, E2S e2S) {
		if (ruleResult.getCorrObjects().contains(e2S)) {
			return new Object[] { ruleResult, e2S };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_24_2_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Step s) {
		if (ruleResult.getTargetObjects().contains(s)) {
			return new Object[] { ruleResult, s };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern__SpAT2SpRule_24_2_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer,
			ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList e2SList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpE2S : e2SList.getEntryObjects()) {
				if (tmpE2S instanceof E2S) {
					E2S e2S = (E2S) tmpE2S;
					Element e = e2S.getSource();
					if (e != null) {
						Step s = e2S.getTarget();
						if (s != null) {
							if (pattern__SpAT2SpRule_24_2_black_nac_1BB(
									ruleResult, e2S) == null) {
								if (pattern__SpAT2SpRule_24_2_black_nac_0BB(
										ruleResult, e) == null) {
									if (pattern__SpAT2SpRule_24_2_black_nac_2BB(
											ruleResult, s) == null) {
										_result.add(new Object[] { e2SList, e,
												e2S, s, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern__SpAT2SpRule_24_3_bindingFBBBBBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch, Element e,
			Step s, E2S e2S, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(
				isApplicableMatch, e, s, e2S, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, e, s, e2S,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern__SpAT2SpRule_24_3_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern__SpAT2SpRule_24_3_bindingAndBlackFBBBBBB(
			_SpAT2SpRule _this, IsApplicableMatch isApplicableMatch, Element e,
			Step s, E2S e2S, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern__SpAT2SpRule_24_3_binding = pattern__SpAT2SpRule_24_3_bindingFBBBBBB(
				_this, isApplicableMatch, e, s, e2S, ruleResult);
		if (result_pattern__SpAT2SpRule_24_3_binding != null) {
			CSP csp = (CSP) result_pattern__SpAT2SpRule_24_3_binding[0];

			Object[] result_pattern__SpAT2SpRule_24_3_black = pattern__SpAT2SpRule_24_3_blackB(csp);
			if (result_pattern__SpAT2SpRule_24_3_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, e, s, e2S,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern__SpAT2SpRule_24_4_expressionFBB(
			_SpAT2SpRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern__SpAT2SpRule_24_5_blackBBB(Element e,
			Step s, E2S e2S) {
		return new Object[] { e, s, e2S };
	}

	public static final Object[] pattern__SpAT2SpRule_24_6_blackBBBB(Element e,
			Step s, E2S e2S, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { e, s, e2S, ruleResult };
	}

	public static final Object[] pattern__SpAT2SpRule_24_6_greenBBFFFBB(
			Element e, Step s, ModelgeneratorRuleResult ruleResult, CSP csp) {
		_SpecialAttrType _spAt = SourceFactory.eINSTANCE
				.create_SpecialAttrType();
		Special sp = TargetFactory.eINSTANCE.createSpecial();
		_SpAt2Sp _spAt2Sp = SourceToTargetCorrFactory.eINSTANCE
				.create_SpAt2Sp();
		Object _localVariable_0 = csp.getValue("_spAt", "value");
		Object _localVariable_1 = csp.getValue("sp", "value");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		e.set_special(_spAt);
		ruleResult.getSourceObjects().add(_spAt);
		s.setSpecial(sp);
		ruleResult.getTargetObjects().add(sp);
		_spAt2Sp.setSource(_spAt);
		_spAt2Sp.setTarget(sp);
		ruleResult.getCorrObjects().add(_spAt2Sp);
		String _spAt_value_prime = (String) _localVariable_0;
		String sp_value_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		_spAt.setValue(_spAt_value_prime);
		sp.setValue(sp_value_prime);
		ruleResult.setPerformCount(Integer
				.valueOf(ruleResult_performCount_prime));
		return new Object[] { e, s, _spAt, sp, _spAt2Sp, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern__SpAT2SpRule_24_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //_SpAT2SpRuleImpl
