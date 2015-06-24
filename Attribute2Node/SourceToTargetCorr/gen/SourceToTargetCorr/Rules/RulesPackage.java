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
	 * The operation id for the '<em>Is Appropriate FWD Source Model 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_0__SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Target Model 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_0__TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

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
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.EA2SRuleImpl <em>EA2S Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.EA2SRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getEA2SRule()
	 * @generated
	 */
	int EA2S_RULE = 2;

	/**
	 * The number of structural features of the '<em>EA2S Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENT_SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENT_SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENT_SOURCEMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENT_SOURCEMODEL_TARGETMODEL_SM2TM = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_SPECIAL_TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_SPECIAL_TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_SPECIAL_TARGETMODEL = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEP_SPECIAL_SOURCEMODEL_TARGETMODEL_SM2TM = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>EA2S Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EA2S_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

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
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_FWD_SourceModel_0(Source.SourceModel) <em>Is Appropriate FWD Source Model 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Source Model 0</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_FWD_SourceModel_0(Source.SourceModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_FWD_SourceModel_0__SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.Class1#isAppropriate_BWD_TargetModel_0(Target.TargetModel) <em>Is Appropriate BWD Target Model 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Target Model 0</em>' operation.
	 * @see SourceToTargetCorr.Rules.Class1#isAppropriate_BWD_TargetModel_0(Target.TargetModel)
	 * @generated
	 */
	EOperation getClass1__IsAppropriate_BWD_TargetModel_0__TargetModel();

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
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.E2SRule#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * @see SourceToTargetCorr.Rules.E2SRule#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getE2SRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

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
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.EA2SRule <em>EA2S Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EA2S Rule</em>'.
	 * @see SourceToTargetCorr.Rules.EA2SRule
	 * @generated
	 */
	EClass getEA2SRule();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_FWD(TGGRuntime.Match, Source.Element, Source.SourceModel) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_FWD(TGGRuntime.Match, Source.Element, Source.SourceModel)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_FWD__Match_Element_SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEA2SRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEA2SRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.Element, Source.SourceModel) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.Element, Source.SourceModel)
	 * @generated
	 */
	EOperation getEA2SRule__RegisterObjectsToMatch_FWD__Match_Element_SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.Element, Source.SourceModel) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.Element, Source.SourceModel)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_solveCsp_FWD__Match_Element_SourceModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.Element, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.Element, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM)
	 * @generated
	 */
	EOperation getEA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Element_SourceModel_TargetModel_SM2TM();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEA2SRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEA2SRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_BWD(TGGRuntime.Match, Target.Step, Target.Special, Target.TargetModel) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_BWD(TGGRuntime.Match, Target.Step, Target.Special, Target.TargetModel)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_BWD__Match_Step_Special_TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getEA2SRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEA2SRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.Step, Target.Special, Target.TargetModel) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.Step, Target.Special, Target.TargetModel)
	 * @generated
	 */
	EOperation getEA2SRule__RegisterObjectsToMatch_BWD__Match_Step_Special_TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.Step, Target.Special, Target.TargetModel) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.Step, Target.Special, Target.TargetModel)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_solveCsp_BWD__Match_Step_Special_TargetModel();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Target.Step, Target.Special, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Target.Step, Target.Special, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM)
	 * @generated
	 */
	EOperation getEA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Step_Special_SourceModel_TargetModel_SM2TM();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEA2SRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getEA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getEA2SRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getEA2SRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEA2SRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getEA2SRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM)
	 * @generated
	 */
	EOperation getEA2SRule__GenerateModel__RuleEntryContainer_SM2TM();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getEA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.EA2SRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.EA2SRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getEA2SRule__GenerateModel_checkCsp_BWD__CSP();

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
		 * The meta object literal for the '<em><b>Is Appropriate FWD Source Model 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_0__SOURCEMODEL = eINSTANCE
				.getClass1__IsAppropriate_FWD_SourceModel_0__SourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD Target Model 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_0__TARGETMODEL = eINSTANCE
				.getClass1__IsAppropriate_BWD_TargetModel_0__TargetModel();

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
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = eINSTANCE
				.getE2SRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation E2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = eINSTANCE
				.getE2SRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

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
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.EA2SRuleImpl <em>EA2S Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.EA2SRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getEA2SRule()
		 * @generated
		 */
		EClass EA2S_RULE = eINSTANCE.getEA2SRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENT_SOURCEMODEL = eINSTANCE
				.getEA2SRule__IsAppropriate_FWD__Match_Element_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getEA2SRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getEA2SRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENT_SOURCEMODEL = eINSTANCE
				.getEA2SRule__RegisterObjectsToMatch_FWD__Match_Element_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENT_SOURCEMODEL = eINSTANCE
				.getEA2SRule__IsAppropriate_solveCsp_FWD__Match_Element_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getEA2SRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENT_SOURCEMODEL_TARGETMODEL_SM2TM = eINSTANCE
				.getEA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Element_SourceModel_TargetModel_SM2TM();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getEA2SRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getEA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getEA2SRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_SPECIAL_TARGETMODEL = eINSTANCE
				.getEA2SRule__IsAppropriate_BWD__Match_Step_Special_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getEA2SRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getEA2SRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_SPECIAL_TARGETMODEL = eINSTANCE
				.getEA2SRule__RegisterObjectsToMatch_BWD__Match_Step_Special_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_SPECIAL_TARGETMODEL = eINSTANCE
				.getEA2SRule__IsAppropriate_solveCsp_BWD__Match_Step_Special_TargetModel();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getEA2SRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_STEP_SPECIAL_SOURCEMODEL_TARGETMODEL_SM2TM = eINSTANCE
				.getEA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Step_Special_SourceModel_TargetModel_SM2TM();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getEA2SRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getEA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getEA2SRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = eINSTANCE
				.getEA2SRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = eINSTANCE
				.getEA2SRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = eINSTANCE
				.getEA2SRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getEA2SRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getEA2SRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = eINSTANCE
				.getEA2SRule__GenerateModel__RuleEntryContainer_SM2TM();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = eINSTANCE
				.getEA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EA2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getEA2SRule__GenerateModel_checkCsp_BWD__CSP();

	}

} //RulesPackage
