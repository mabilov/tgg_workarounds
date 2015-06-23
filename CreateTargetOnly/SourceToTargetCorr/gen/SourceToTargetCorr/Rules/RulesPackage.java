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
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.A2SRuleImpl <em>A2S Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.A2SRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getA2SRule()
	 * @generated
	 */
	int A2S_RULE = 1;

	/**
	 * The number of structural features of the '<em>A2S Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ACTIVITY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ACTIVITY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ACTIVITY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_ACTIVITY = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>A2S Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A2S_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.SpM2SpSRuleImpl <em>Sp M2 Sp SRule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.SpM2SpSRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getSpM2SpSRule()
	 * @generated
	 */
	int SP_M2_SP_SRULE = 2;

	/**
	 * The number of structural features of the '<em>Sp M2 Sp SRule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_SPLITMERGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_SPLITMERGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_SPLITMERGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPLITMERGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_SPECIALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_SPECIALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_SPECIALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPECIALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Sp M2 Sp SRule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_M2_SP_SRULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.NextRuleImpl <em>Next Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.NextRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getNextRule()
	 * @generated
	 */
	int NEXT_RULE = 3;

	/**
	 * The number of structural features of the '<em>Next Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPLICABLE_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___CHECK_TYPES_FWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_TARGETMODEL_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The number of operations of the '<em>Next Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.Rules.impl.ContinueRuleImpl <em>Continue Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.Rules.impl.ContinueRuleImpl
	 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getContinueRule()
	 * @generated
	 */
	int CONTINUE_RULE = 4;

	/**
	 * The number of structural features of the '<em>Continue Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___IS_APPROPRIATE_BWD__MATCH_SPECIALSTEP_SPECIALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___IS_APPLICABLE_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_SPECIALSTEP_SPECIALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_SPECIALSTEP_SPECIALSTEP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPLITMERGE_SPLITMERGE_SPECIALSTEP_SPECIALSTEP_E2S_E2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___CHECK_TYPES_BWD__MATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S_E2S = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPLITMERGE_SPLITMERGE_SPECIALSTEP_SPECIALSTEP_E2S_E2S_MODELGENERATORRULERESULT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The number of operations of the '<em>Continue Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_RULE_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

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
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.A2SRule <em>A2S Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A2S Rule</em>'.
	 * @see SourceToTargetCorr.Rules.A2SRule
	 * @generated
	 */
	EClass getA2SRule();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.Activity) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.Activity)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_FWD__Match_SourceModel_Activity();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getA2SRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getA2SRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.Activity) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.Activity)
	 * @generated
	 */
	EOperation getA2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Activity();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.Activity) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.Activity)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Activity();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Source.Activity) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Source.Activity)
	 * @generated
	 */
	EOperation getA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Activity();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getA2SRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getA2SRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_BWD__Match_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getA2SRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getA2SRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getA2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Target.Step) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Target.Step)
	 * @generated
	 */
	EOperation getA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getA2SRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getA2SRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_FWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#isAppropriate_BWD_EMoflonEdge_0(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getA2SRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getA2SRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getA2SRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM)
	 * @generated
	 */
	EOperation getA2SRule__GenerateModel__RuleEntryContainer_SM2TM();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.A2SRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.A2SRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getA2SRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.SpM2SpSRule <em>Sp M2 Sp SRule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sp M2 Sp SRule</em>'.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule
	 * @generated
	 */
	EClass getSpM2SpSRule();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.SplitMerge) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.SplitMerge)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_FWD__Match_SourceModel_SplitMerge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSpM2SpSRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.SplitMerge) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.SplitMerge)
	 * @generated
	 */
	EOperation getSpM2SpSRule__RegisterObjectsToMatch_FWD__Match_SourceModel_SplitMerge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.SplitMerge) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.SplitMerge)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_SplitMerge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Source.SplitMerge) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Source.SplitMerge)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SplitMerge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSpM2SpSRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSpM2SpSRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel, Target.SpecialStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_BWD(TGGRuntime.Match, Target.TargetModel, Target.SpecialStep)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_BWD__Match_TargetModel_SpecialStep();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSpM2SpSRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel, Target.SpecialStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.TargetModel, Target.SpecialStep)
	 * @generated
	 */
	EOperation getSpM2SpSRule__RegisterObjectsToMatch_BWD__Match_TargetModel_SpecialStep();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel, Target.SpecialStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.TargetModel, Target.SpecialStep)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_SpecialStep();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Target.SpecialStep) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, Target.SpecialStep)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SpecialStep();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSpM2SpSRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getSpM2SpSRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_FWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#isAppropriate_BWD_EMoflonEdge_1(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSpM2SpSRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSpM2SpSRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getSpM2SpSRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.SM2TM)
	 * @generated
	 */
	EOperation getSpM2SpSRule__GenerateModel__RuleEntryContainer_SM2TM();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Target.TargetModel, SourceToTargetCorr.SM2TM, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSpM2SpSRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.SpM2SpSRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.SpM2SpSRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getSpM2SpSRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.NextRule <em>Next Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Rule</em>'.
	 * @see SourceToTargetCorr.Rules.NextRule
	 * @generated
	 */
	EClass getNextRule();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element, Source.Element) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element, Source.Element)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_FWD__Match_SourceModel_Element_Element();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#perform_FWD(TGGRuntime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#perform_FWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNextRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isApplicable_FWD(TGGRuntime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isApplicable_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNextRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element, Source.Element) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#registerObjectsToMatch_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element, Source.Element)
	 * @generated
	 */
	EOperation getNextRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element_Element();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element, Source.Element) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_solveCsp_FWD(TGGRuntime.Match, Source.SourceModel, Source.Element, Source.Element)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element_Element();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Source.Element, Target.Step, Source.Element, Target.TargetModel, SourceToTargetCorr.SM2TM, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, Target.Step) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isApplicable_solveCsp_FWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Source.Element, Target.Step, Source.Element, Target.TargetModel, SourceToTargetCorr.SM2TM, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, Target.Step)
	 * @generated
	 */
	EOperation getNextRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isApplicable_checkCsp_FWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNextRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#registerObjects_FWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNextRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#checkTypes_FWD(TGGRuntime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#checkTypes_FWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNextRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_BWD(TGGRuntime.Match, Target.Step, Target.TargetModel, Target.Step) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_BWD(TGGRuntime.Match, Target.Step, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_BWD__Match_Step_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getNextRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNextRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.Step, Target.TargetModel, Target.Step) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.Step, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getNextRule__RegisterObjectsToMatch_BWD__Match_Step_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.Step, Target.TargetModel, Target.Step) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.Step, Target.TargetModel, Target.Step)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_solveCsp_BWD__Match_Step_TargetModel_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Source.Element, Target.Step, Source.Element, Target.TargetModel, SourceToTargetCorr.SM2TM, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, Target.Step) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Source.Element, Target.Step, Source.Element, Target.TargetModel, SourceToTargetCorr.SM2TM, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, Target.Step)
	 * @generated
	 */
	EOperation getNextRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNextRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getNextRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getNextRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_BWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#isAppropriate_FWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#isAppropriate_FWD_EMoflonEdge_2(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getNextRule__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#checkAttributes_FWD(TGGRuntime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#checkAttributes_FWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNextRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getNextRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.E2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.E2S)
	 * @generated
	 */
	EOperation getNextRule__GenerateModel__RuleEntryContainer_E2S();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Source.Element, Target.Step, Source.Element, Target.TargetModel, SourceToTargetCorr.SM2TM, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, Target.Step, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SourceModel, Source.Element, Target.Step, Source.Element, Target.TargetModel, SourceToTargetCorr.SM2TM, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, Target.Step, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getNextRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.NextRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.NextRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getNextRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.Rules.ContinueRule <em>Continue Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Rule</em>'.
	 * @see SourceToTargetCorr.Rules.ContinueRule
	 * @generated
	 */
	EClass getContinueRule();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#isAppropriate_BWD(TGGRuntime.Match, Target.SpecialStep, Target.SpecialStep) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#isAppropriate_BWD(TGGRuntime.Match, Target.SpecialStep, Target.SpecialStep)
	 * @generated
	 */
	EOperation getContinueRule__IsAppropriate_BWD__Match_SpecialStep_SpecialStep();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#perform_BWD(TGGRuntime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#perform_BWD(TGGRuntime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getContinueRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#isApplicable_BWD(TGGRuntime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#isApplicable_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getContinueRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.SpecialStep, Target.SpecialStep) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#registerObjectsToMatch_BWD(TGGRuntime.Match, Target.SpecialStep, Target.SpecialStep)
	 * @generated
	 */
	EOperation getContinueRule__RegisterObjectsToMatch_BWD__Match_SpecialStep_SpecialStep();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.SpecialStep, Target.SpecialStep) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#isAppropriate_solveCsp_BWD(TGGRuntime.Match, Target.SpecialStep, Target.SpecialStep)
	 * @generated
	 */
	EOperation getContinueRule__IsAppropriate_solveCsp_BWD__Match_SpecialStep_SpecialStep();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#isAppropriate_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getContinueRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SplitMerge, Source.SplitMerge, Target.SpecialStep, Target.SpecialStep, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#isApplicable_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SplitMerge, Source.SplitMerge, Target.SpecialStep, Target.SpecialStep, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S)
	 * @generated
	 */
	EOperation getContinueRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SplitMerge_SplitMerge_SpecialStep_SpecialStep_E2S_E2S();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#isApplicable_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getContinueRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#registerObjects_BWD(TGGRuntime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getContinueRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#checkTypes_BWD(TGGRuntime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#checkTypes_BWD(TGGRuntime.Match)
	 * @generated
	 */
	EOperation getContinueRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#isAppropriate_BWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#isAppropriate_BWD_EMoflonEdge_3(TGGRuntime.EMoflonEdge)
	 * @generated
	 */
	EOperation getContinueRule__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#checkAttributes_BWD(TGGRuntime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#checkAttributes_BWD(TGGRuntime.TripleMatch)
	 * @generated
	 */
	EOperation getContinueRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#generateModel(TGGLanguage.modelgenerator.RuleEntryContainer, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S)
	 * @generated
	 */
	EOperation getContinueRule__GenerateModel__RuleEntryContainer_E2S_E2S();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SplitMerge, Source.SplitMerge, Target.SpecialStep, Target.SpecialStep, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, TGGRuntime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#generateModel_solveCsp_BWD(TGGRuntime.IsApplicableMatch, Source.SplitMerge, Source.SplitMerge, Target.SpecialStep, Target.SpecialStep, SourceToTargetCorr.E2S, SourceToTargetCorr.E2S, TGGRuntime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getContinueRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SplitMerge_SplitMerge_SpecialStep_SpecialStep_E2S_E2S_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link SourceToTargetCorr.Rules.ContinueRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see SourceToTargetCorr.Rules.ContinueRule#generateModel_checkCsp_BWD(TGGLanguage.csp.CSP)
	 * @generated
	 */
	EOperation getContinueRule__GenerateModel_checkCsp_BWD__CSP();

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
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.A2SRuleImpl <em>A2S Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.A2SRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getA2SRule()
		 * @generated
		 */
		EClass A2S_RULE = eINSTANCE.getA2SRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ACTIVITY = eINSTANCE
				.getA2SRule__IsAppropriate_FWD__Match_SourceModel_Activity();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getA2SRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getA2SRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ACTIVITY = eINSTANCE
				.getA2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Activity();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ACTIVITY = eINSTANCE
				.getA2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Activity();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getA2SRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_ACTIVITY = eINSTANCE
				.getA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Activity();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getA2SRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getA2SRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP = eINSTANCE
				.getA2SRule__IsAppropriate_BWD__Match_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getA2SRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getA2SRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP = eINSTANCE
				.getA2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP = eINSTANCE
				.getA2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getA2SRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP = eINSTANCE
				.getA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getA2SRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getA2SRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = eINSTANCE
				.getA2SRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = eINSTANCE
				.getA2SRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getA2SRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getA2SRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = eINSTANCE
				.getA2SRule__GenerateModel__RuleEntryContainer_SM2TM();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = eINSTANCE
				.getA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation A2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getA2SRule__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.SpM2SpSRuleImpl <em>Sp M2 Sp SRule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.SpM2SpSRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getSpM2SpSRule()
		 * @generated
		 */
		EClass SP_M2_SP_SRULE = eINSTANCE.getSpM2SpSRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_SPLITMERGE = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_FWD__Match_SourceModel_SplitMerge();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getSpM2SpSRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getSpM2SpSRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_SPLITMERGE = eINSTANCE
				.getSpM2SpSRule__RegisterObjectsToMatch_FWD__Match_SourceModel_SplitMerge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_SPLITMERGE = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_SplitMerge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPLITMERGE = eINSTANCE
				.getSpM2SpSRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SplitMerge();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getSpM2SpSRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getSpM2SpSRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getSpM2SpSRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_SPECIALSTEP = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_BWD__Match_TargetModel_SpecialStep();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getSpM2SpSRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getSpM2SpSRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_SPECIALSTEP = eINSTANCE
				.getSpM2SpSRule__RegisterObjectsToMatch_BWD__Match_TargetModel_SpecialStep();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_SPECIALSTEP = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_SpecialStep();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPECIALSTEP = eINSTANCE
				.getSpM2SpSRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SpecialStep();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getSpM2SpSRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getSpM2SpSRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getSpM2SpSRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = eINSTANCE
				.getSpM2SpSRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getSpM2SpSRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getSpM2SpSRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM = eINSTANCE
				.getSpM2SpSRule__GenerateModel__RuleEntryContainer_SM2TM();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT = eINSTANCE
				.getSpM2SpSRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SP_M2_SP_SRULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getSpM2SpSRule__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.NextRuleImpl <em>Next Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.NextRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getNextRule()
		 * @generated
		 */
		EClass NEXT_RULE = eINSTANCE.getNextRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT = eINSTANCE
				.getNextRule__IsAppropriate_FWD__Match_SourceModel_Element_Element();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getNextRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getNextRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT = eINSTANCE
				.getNextRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element_Element();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT = eINSTANCE
				.getNextRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element_Element();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getNextRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP = eINSTANCE
				.getNextRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getNextRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getNextRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getNextRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_TARGETMODEL_STEP = eINSTANCE
				.getNextRule__IsAppropriate_BWD__Match_Step_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getNextRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getNextRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_TARGETMODEL_STEP = eINSTANCE
				.getNextRule__RegisterObjectsToMatch_BWD__Match_Step_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_TARGETMODEL_STEP = eINSTANCE
				.getNextRule__IsAppropriate_solveCsp_BWD__Match_Step_TargetModel_Step();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getNextRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP = eINSTANCE
				.getNextRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getNextRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getNextRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getNextRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = eINSTANCE
				.getNextRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE = eINSTANCE
				.getNextRule__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getNextRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getNextRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S = eINSTANCE
				.getNextRule__GenerateModel__RuleEntryContainer_E2S();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP_MODELGENERATORRULERESULT = eINSTANCE
				.getNextRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEXT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getNextRule__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.Rules.impl.ContinueRuleImpl <em>Continue Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.Rules.impl.ContinueRuleImpl
		 * @see SourceToTargetCorr.Rules.impl.RulesPackageImpl#getContinueRule()
		 * @generated
		 */
		EClass CONTINUE_RULE = eINSTANCE.getContinueRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___IS_APPROPRIATE_BWD__MATCH_SPECIALSTEP_SPECIALSTEP = eINSTANCE
				.getContinueRule__IsAppropriate_BWD__Match_SpecialStep_SpecialStep();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getContinueRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getContinueRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_SPECIALSTEP_SPECIALSTEP = eINSTANCE
				.getContinueRule__RegisterObjectsToMatch_BWD__Match_SpecialStep_SpecialStep();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_SPECIALSTEP_SPECIALSTEP = eINSTANCE
				.getContinueRule__IsAppropriate_solveCsp_BWD__Match_SpecialStep_SpecialStep();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getContinueRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPLITMERGE_SPLITMERGE_SPECIALSTEP_SPECIALSTEP_E2S_E2S = eINSTANCE
				.getContinueRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SplitMerge_SplitMerge_SpecialStep_SpecialStep_E2S_E2S();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getContinueRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getContinueRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getContinueRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE = eINSTANCE
				.getContinueRule__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getContinueRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S_E2S = eINSTANCE
				.getContinueRule__GenerateModel__RuleEntryContainer_E2S_E2S();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPLITMERGE_SPLITMERGE_SPECIALSTEP_SPECIALSTEP_E2S_E2S_MODELGENERATORRULERESULT = eINSTANCE
				.getContinueRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SplitMerge_SplitMerge_SpecialStep_SpecialStep_E2S_E2S_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getContinueRule__GenerateModel_checkCsp_BWD__CSP();

	}

} //RulesPackage
