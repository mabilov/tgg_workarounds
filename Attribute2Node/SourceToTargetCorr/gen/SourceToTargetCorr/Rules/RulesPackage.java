/**
 */
package SourceToTargetCorr.Rules;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SourceToTargetCorr.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SourceToTargetCorr/model/SourceToTargetCorr.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = SourceToTargetCorr.Rules.impl.RulesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.Class1Impl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getClass1()
	 * @generated
	 */
	int CLASS1 = 0;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Source Model 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_15__SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Target Model 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_15__TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___GENERATE_MODEL__RULEENTRYCONTAINER = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.E2SRuleImpl <em>E2S Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.E2SRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getE2SRule()
	 * @generated
	 */
	int E2S_RULE = 1;

	/**
	 * The number of structural features of the '<em>E2S Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_ELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 42</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_42__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_57__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>E2S Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.ElSpAt2SpRuleImpl <em>El Sp At2 Sp Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.ElSpAt2SpRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getElSpAt2SpRule()
	 * @generated
	 */
	int EL_SP_AT2_SP_RULE = 2;

	/**
	 * The number of structural features of the '<em>El Sp At2 Sp Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_SP_AT2_SP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>El Sp At2 Sp Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EL_SP_AT2_SP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl._SpAT2SpRuleImpl <em>Sp AT2 Sp Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl._SpAT2SpRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#get_SpAT2SpRule()
	 * @generated
	 */
	int _SP_AT2_SP_RULE = 3;

	/**
	 * The number of structural features of the '<em>Sp AT2 Sp Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENT__SPECIALATTRTYPE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENT__SPECIALATTRTYPE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENT__SPECIALATTRTYPE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S__SPECIALATTRTYPE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_SPECIAL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_SPECIAL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_SPECIAL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_SPECIAL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 43</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_43__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Sp AT2 Sp Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see SourceToTargetCorr.Rules.Class1
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD__Match_SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClass1__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel)
	 * @generated
	 */
	EOperation getClass1__RegisterObjectsToMatch_FWD__Match_SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_solveCsp_FWD__Match_SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD__Match_TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getClass1__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel)
	 * @generated
	 */
	EOperation getClass1__RegisterObjectsToMatch_BWD__Match_TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_solveCsp_BWD__Match_TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Target.TargetModel) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Target.TargetModel)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getClass1__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_FWD_SourceModel_15(Source.SourceModel) <em>Is Appropriate FWD Source Model 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Source Model 15</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_FWD_SourceModel_15(Source.SourceModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_SourceModel_15__SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_BWD_TargetModel_15(Target.TargetModel) <em>Is Appropriate BWD Target Model 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Target Model 15</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_BWD_TargetModel_15(Target.TargetModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD_TargetModel_15__TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClass1__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getClass1__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getClass1__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getClass1__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getClass1__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.E2SRule <em>E2S Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E2S Rule</em>'.
	 * @see SourceToTargetCorr.Rules.E2SRule
	 * @generated
	 */
	EClass getE2SRule();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_FWD__Match_SourceModel_Element();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getE2SRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getE2SRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element)
	 * @generated
	 */
	EOperation getE2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Source.Element) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Source.Element)
	 * @generated
	 */
	EOperation getE2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Element();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getE2SRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getE2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getE2SRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_BWD__Match_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getE2SRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getE2SRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getE2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Target.Step) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Target.Step)
	 * @generated
	 */
	EOperation getE2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getE2SRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getE2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getE2SRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_FWD_EMoflonEdge_42(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 42</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 42</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_FWD_EMoflonEdge_42(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_FWD_EMoflonEdge_42__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 57</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 57</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_BWD_EMoflonEdge_57(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getE2SRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getE2SRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM)
	 * @generated
	 */
	EOperation getE2SRule__GenerateModel__RuleEntryContainer_SM2TM();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getE2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getE2SRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.ElSpAt2SpRule <em>El Sp At2 Sp Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>El Sp At2 Sp Rule</em>'.
	 * @see SourceToTargetCorr.Rules.ElSpAt2SpRule
	 * @generated
	 */
	EClass getElSpAt2SpRule();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules._SpAT2SpRule <em>Sp AT2 Sp Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sp AT2 Sp Rule</em>'.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule
	 * @generated
	 */
	EClass get_SpAT2SpRule();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_FWD(TGGRuntime.Match, Source.Element, Source._SpecialAttrType) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_FWD(TGGRuntime.Match, Source.Element, Source._SpecialAttrType)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_FWD__Match_Element__SpecialAttrType();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.Element, Source._SpecialAttrType) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.Element, Source._SpecialAttrType)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__RegisterObjectsToMatch_FWD__Match_Element__SpecialAttrType();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.Element, Source._SpecialAttrType) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.Element, Source._SpecialAttrType)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_solveCsp_FWD__Match_Element__SpecialAttrType();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.Element, Target.Step, SourceToTargetCorr.E2S, Source._SpecialAttrType) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.Element, Target.Step, SourceToTargetCorr.E2S, Source._SpecialAttrType)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Element_Step_E2S__SpecialAttrType();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_BWD(TGGRuntime.Match, Target.Step, Target.Special) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_BWD(TGGRuntime.Match, Target.Step, Target.Special)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_BWD__Match_Step_Special();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.Step, Target.Special) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.Step, Target.Special)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__RegisterObjectsToMatch_BWD__Match_Step_Special();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.Step, Target.Special) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.Step, Target.Special)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_solveCsp_BWD__Match_Step_Special();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.Element, Target.Step, SourceToTargetCorr.E2S, Target.Special) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.Element, Target.Step, SourceToTargetCorr.E2S, Target.Special)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_Special();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_FWD_EMoflonEdge_43(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 43</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 43</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_FWD_EMoflonEdge_43(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_FWD_EMoflonEdge_43__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 58</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 58</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#isAppropriate_BWD_EMoflonEdge_58(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.E2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.E2S)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__GenerateModel__RuleEntryContainer_E2S();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.Element, Target.Step, SourceToTargetCorr.E2S, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.Element, Target.Step, SourceToTargetCorr.E2S, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules._SpAT2SpRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules._SpAT2SpRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation get_SpAT2SpRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.Class1Impl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getClass1()
		 * @generated
		 */
		EClass CLASS1 = eINSTANCE.getClass1();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL = eINSTANCE
				.getClass1__IsAppropriate_FWD__Match_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getClass1__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getClass1__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL = eINSTANCE
				.getClass1__RegisterObjectsToMatch_FWD__Match_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL = eINSTANCE
				.getClass1__IsAppropriate_solveCsp_FWD__Match_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getClass1__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL = eINSTANCE
				.getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getClass1__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getClass1__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL = eINSTANCE
				.getClass1__IsAppropriate_BWD__Match_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getClass1__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getClass1__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL = eINSTANCE
				.getClass1__RegisterObjectsToMatch_BWD__Match_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL = eINSTANCE
				.getClass1__IsAppropriate_solveCsp_BWD__Match_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getClass1__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TARGETMODEL = eINSTANCE
				.getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getClass1__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getClass1__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD Source Model 15</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_15__SOURCEMODEL = eINSTANCE
				.getClass1__IsAppropriate_FWD_SourceModel_15__SourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD Target Model 15</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_15__TARGETMODEL = eINSTANCE
				.getClass1__IsAppropriate_BWD_TargetModel_15__TargetModel();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getClass1__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getClass1__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___GENERATE_MODEL__RULEENTRYCONTAINER = eINSTANCE
				.getClass1__GenerateModel__RuleEntryContainer();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = eINSTANCE
				.getClass1__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getClass1__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.E2SRuleImpl <em>E2S Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.E2SRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getE2SRule()
		 * @generated
		 */
		EClass E2S_RULE = eINSTANCE.getE2SRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT = eINSTANCE
				.getE2SRule__IsAppropriate_FWD__Match_SourceModel_Element();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getE2SRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getE2SRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT = eINSTANCE
				.getE2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT = eINSTANCE
				.getE2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getE2SRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_ELEMENT = eINSTANCE
				.getE2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Element();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getE2SRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getE2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getE2SRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP = eINSTANCE
				.getE2SRule__IsAppropriate_BWD__Match_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getE2SRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getE2SRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP = eINSTANCE
				.getE2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP = eINSTANCE
				.getE2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getE2SRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP = eINSTANCE
				.getE2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getE2SRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getE2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getE2SRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 42</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_42__EMOFLONEDGE = eINSTANCE
				.getE2SRule__IsAppropriate_FWD_EMoflonEdge_42__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 57</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_57__EMOFLONEDGE = eINSTANCE
				.getE2SRule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getE2SRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getE2SRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = eINSTANCE
				.getE2SRule__GenerateModel__RuleEntryContainer_SM2TM();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = eINSTANCE
				.getE2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getE2SRule__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.ElSpAt2SpRuleImpl <em>El Sp At2 Sp Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.ElSpAt2SpRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getElSpAt2SpRule()
		 * @generated
		 */
		EClass EL_SP_AT2_SP_RULE = eINSTANCE.getElSpAt2SpRule();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl._SpAT2SpRuleImpl <em>Sp AT2 Sp Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl._SpAT2SpRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#get_SpAT2SpRule()
		 * @generated
		 */
		EClass _SP_AT2_SP_RULE = eINSTANCE.get_SpAT2SpRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENT__SPECIALATTRTYPE = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_FWD__Match_Element__SpecialAttrType();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.get_SpAT2SpRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.get_SpAT2SpRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENT__SPECIALATTRTYPE = eINSTANCE
				.get_SpAT2SpRule__RegisterObjectsToMatch_FWD__Match_Element__SpecialAttrType();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENT__SPECIALATTRTYPE = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_solveCsp_FWD__Match_Element__SpecialAttrType();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S__SPECIALATTRTYPE = eINSTANCE
				.get_SpAT2SpRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Element_Step_E2S__SpecialAttrType();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.get_SpAT2SpRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.get_SpAT2SpRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.get_SpAT2SpRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_SPECIAL = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_BWD__Match_Step_Special();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.get_SpAT2SpRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.get_SpAT2SpRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_SPECIAL = eINSTANCE
				.get_SpAT2SpRule__RegisterObjectsToMatch_BWD__Match_Step_Special();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_SPECIAL = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_solveCsp_BWD__Match_Step_Special();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_SPECIAL = eINSTANCE
				.get_SpAT2SpRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_Special();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.get_SpAT2SpRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.get_SpAT2SpRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.get_SpAT2SpRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 43</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_43__EMOFLONEDGE = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_FWD_EMoflonEdge_43__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 58</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE = eINSTANCE
				.get_SpAT2SpRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.get_SpAT2SpRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.get_SpAT2SpRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S = eINSTANCE
				.get_SpAT2SpRule__GenerateModel__RuleEntryContainer_E2S();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_MODELGENERATORRULERESULT = eINSTANCE
				.get_SpAT2SpRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation _SP_AT2_SP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.get_SpAT2SpRule__GenerateModel_checkCsp_BWD__CSP();

	}

} //RulesPackage
