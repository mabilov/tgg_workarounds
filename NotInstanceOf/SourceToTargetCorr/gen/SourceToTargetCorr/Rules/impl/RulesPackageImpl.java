/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.SourcePackage;

import SourceToTargetCorr.Rules.E2SRule;
import SourceToTargetCorr.Rules.EA2SRule;
import SourceToTargetCorr.Rules.EB2SRule;
import SourceToTargetCorr.Rules.RulesFactory;
import SourceToTargetCorr.Rules.RulesPackage;
import SourceToTargetCorr.Rules.SM2TMRule;

import SourceToTargetCorr.SourceToTargetCorrPackage;

import SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl;

import TGGLanguage.TGGLanguagePackage;

import TGGLanguage.csp.CspPackage;

import TGGLanguage.modelgenerator.ModelgeneratorPackage;

import TGGRuntime.TGGRuntimePackage;

import Target.TargetPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sm2TMRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e2SRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ea2SRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eb2SRuleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SourceToTargetCorr.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SourcePackage.eINSTANCE.eClass();
		TargetPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SourceToTargetCorrPackageImpl theSourceToTargetCorrPackage = (SourceToTargetCorrPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SourceToTargetCorrPackage.eNS_URI) instanceof SourceToTargetCorrPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SourceToTargetCorrPackage.eNS_URI)
				: SourceToTargetCorrPackage.eINSTANCE);

		// Create package meta-data objects
		theRulesPackage.createPackageContents();
		theSourceToTargetCorrPackage.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();
		theSourceToTargetCorrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSM2TMRule() {
		return sm2TMRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_FWD__Match_SourceModel() {
		return sm2TMRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__Perform_FWD__IsApplicableMatch() {
		return sm2TMRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsApplicable_FWD__Match() {
		return sm2TMRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__RegisterObjectsToMatch_FWD__Match_SourceModel() {
		return sm2TMRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_solveCsp_FWD__Match_SourceModel() {
		return sm2TMRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_checkCsp_FWD__CSP() {
		return sm2TMRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel() {
		return sm2TMRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsApplicable_checkCsp_FWD__CSP() {
		return sm2TMRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return sm2TMRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__CheckTypes_FWD__Match() {
		return sm2TMRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_BWD__Match_TargetModel() {
		return sm2TMRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__Perform_BWD__IsApplicableMatch() {
		return sm2TMRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsApplicable_BWD__Match() {
		return sm2TMRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__RegisterObjectsToMatch_BWD__Match_TargetModel() {
		return sm2TMRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_solveCsp_BWD__Match_TargetModel() {
		return sm2TMRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_checkCsp_BWD__CSP() {
		return sm2TMRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_TargetModel() {
		return sm2TMRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsApplicable_checkCsp_BWD__CSP() {
		return sm2TMRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return sm2TMRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__CheckTypes_BWD__Match() {
		return sm2TMRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_FWD_SourceModel_0__SourceModel() {
		return sm2TMRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__IsAppropriate_BWD_TargetModel_0__TargetModel() {
		return sm2TMRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__CheckAttributes_FWD__TripleMatch() {
		return sm2TMRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__CheckAttributes_BWD__TripleMatch() {
		return sm2TMRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__GenerateModel__RuleEntryContainer() {
		return sm2TMRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return sm2TMRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSM2TMRule__GenerateModel_checkCsp_BWD__CSP() {
		return sm2TMRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE2SRule() {
		return e2SRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEA2SRule() {
		return ea2SRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_FWD__Match_ElementTypeA_SourceModel() {
		return ea2SRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__Perform_FWD__IsApplicableMatch() {
		return ea2SRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsApplicable_FWD__Match() {
		return ea2SRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__RegisterObjectsToMatch_FWD__Match_ElementTypeA_SourceModel() {
		return ea2SRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_solveCsp_FWD__Match_ElementTypeA_SourceModel() {
		return ea2SRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_checkCsp_FWD__CSP() {
		return ea2SRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ElementTypeA_SourceModel_TargetModel_SM2TM() {
		return ea2SRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsApplicable_checkCsp_FWD__CSP() {
		return ea2SRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return ea2SRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__CheckTypes_FWD__Match() {
		return ea2SRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_BWD__Match_TargetModel_Step() {
		return ea2SRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__Perform_BWD__IsApplicableMatch() {
		return ea2SRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsApplicable_BWD__Match() {
		return ea2SRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step() {
		return ea2SRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step() {
		return ea2SRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_checkCsp_BWD__CSP() {
		return ea2SRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step() {
		return ea2SRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsApplicable_checkCsp_BWD__CSP() {
		return ea2SRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return ea2SRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__CheckTypes_BWD__Match() {
		return ea2SRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return ea2SRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return ea2SRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__CheckAttributes_FWD__TripleMatch() {
		return ea2SRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__CheckAttributes_BWD__TripleMatch() {
		return ea2SRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__GenerateModel__RuleEntryContainer_SM2TM() {
		return ea2SRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult() {
		return ea2SRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEA2SRule__GenerateModel_checkCsp_BWD__CSP() {
		return ea2SRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEB2SRule() {
		return eb2SRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_FWD__Match_ElementTypeB_SourceModel() {
		return eb2SRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__Perform_FWD__IsApplicableMatch() {
		return eb2SRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsApplicable_FWD__Match() {
		return eb2SRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__RegisterObjectsToMatch_FWD__Match_ElementTypeB_SourceModel() {
		return eb2SRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_solveCsp_FWD__Match_ElementTypeB_SourceModel() {
		return eb2SRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_checkCsp_FWD__CSP() {
		return eb2SRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ElementTypeB_SourceModel_TargetModel_SM2TM() {
		return eb2SRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsApplicable_checkCsp_FWD__CSP() {
		return eb2SRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return eb2SRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__CheckTypes_FWD__Match() {
		return eb2SRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_BWD__Match_TargetModel_Step() {
		return eb2SRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__Perform_BWD__IsApplicableMatch() {
		return eb2SRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsApplicable_BWD__Match() {
		return eb2SRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step() {
		return eb2SRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step() {
		return eb2SRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_checkCsp_BWD__CSP() {
		return eb2SRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step() {
		return eb2SRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsApplicable_checkCsp_BWD__CSP() {
		return eb2SRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return eb2SRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__CheckTypes_BWD__Match() {
		return eb2SRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return eb2SRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return eb2SRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__CheckAttributes_FWD__TripleMatch() {
		return eb2SRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__CheckAttributes_BWD__TripleMatch() {
		return eb2SRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__GenerateModel__RuleEntryContainer_SM2TM() {
		return eb2SRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult() {
		return eb2SRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEB2SRule__GenerateModel_checkCsp_BWD__CSP() {
		return eb2SRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		sm2TMRuleEClass = createEClass(SM2TM_RULE);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(sm2TMRuleEClass, SM2TM_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(sm2TMRuleEClass, SM2TM_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(sm2TMRuleEClass, SM2TM_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TARGETMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(sm2TMRuleEClass, SM2TM_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_FWD_SOURCE_MODEL_0__SOURCEMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___IS_APPROPRIATE_BWD_TARGET_MODEL_0__TARGETMODEL);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___GENERATE_MODEL__RULEENTRYCONTAINER);
		createEOperation(
				sm2TMRuleEClass,
				SM2TM_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT);
		createEOperation(sm2TMRuleEClass,
				SM2TM_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		e2SRuleEClass = createEClass(E2S_RULE);

		ea2SRuleEClass = createEClass(EA2S_RULE);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENTTYPEA_SOURCEMODEL);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(ea2SRuleEClass, EA2S_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENTTYPEA_SOURCEMODEL);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENTTYPEA_SOURCEMODEL);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				ea2SRuleEClass,
				EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENTTYPEA_SOURCEMODEL_TARGETMODEL_SM2TM);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				ea2SRuleEClass,
				EA2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(ea2SRuleEClass, EA2S_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(ea2SRuleEClass, EA2S_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				ea2SRuleEClass,
				EA2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				ea2SRuleEClass,
				EA2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(ea2SRuleEClass, EA2S_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM);
		createEOperation(
				ea2SRuleEClass,
				EA2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT);
		createEOperation(ea2SRuleEClass,
				EA2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		eb2SRuleEClass = createEClass(EB2S_RULE);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENTTYPEB_SOURCEMODEL);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(eb2SRuleEClass, EB2S_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENTTYPEB_SOURCEMODEL);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENTTYPEB_SOURCEMODEL);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				eb2SRuleEClass,
				EB2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENTTYPEB_SOURCEMODEL_TARGETMODEL_SM2TM);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				eb2SRuleEClass,
				EB2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(eb2SRuleEClass, EB2S_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(eb2SRuleEClass, EB2S_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				eb2SRuleEClass,
				EB2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				eb2SRuleEClass,
				EB2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(eb2SRuleEClass, EB2S_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM);
		createEOperation(
				eb2SRuleEClass,
				EB2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT);
		createEOperation(eb2SRuleEClass,
				EB2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TGGRuntimePackage theTGGRuntimePackage = (TGGRuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(TGGRuntimePackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage) EPackage.Registry.INSTANCE
				.getEPackage(SourcePackage.eNS_URI);
		CspPackage theCspPackage = (CspPackage) EPackage.Registry.INSTANCE
				.getEPackage(CspPackage.eNS_URI);
		TargetPackage theTargetPackage = (TargetPackage) EPackage.Registry.INSTANCE
				.getEPackage(TargetPackage.eNS_URI);
		ModelgeneratorPackage theModelgeneratorPackage = (ModelgeneratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModelgeneratorPackage.eNS_URI);
		SourceToTargetCorrPackage theSourceToTargetCorrPackage = (SourceToTargetCorrPackage) EPackage.Registry.INSTANCE
				.getEPackage(SourceToTargetCorrPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sm2TMRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		e2SRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		ea2SRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		eb2SRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(sm2TMRuleEClass, SM2TMRule.class, "SM2TMRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(
				getSM2TMRule__IsAppropriate_FWD__Match_SourceModel(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__RegisterObjectsToMatch_FWD__Match_SourceModel(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__IsAppropriate_solveCsp_FWD__Match_SourceModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getSM2TMRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__IsAppropriate_BWD__Match_TargetModel(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__RegisterObjectsToMatch_BWD__Match_TargetModel(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__IsAppropriate_solveCsp_BWD__Match_TargetModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_TargetModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getSM2TMRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__IsAppropriate_FWD_SourceModel_0__SourceModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_SourceModel_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__IsAppropriate_BWD_TargetModel_0__TargetModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_TargetModel_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__GenerateModel__RuleEntryContainer(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSM2TMRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSM2TMRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(e2SRuleEClass, E2SRule.class, "E2SRule", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ea2SRuleEClass, EA2SRule.class, "EA2SRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getEA2SRule__IsAppropriate_FWD__Match_ElementTypeA_SourceModel(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeA(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__RegisterObjectsToMatch_FWD__Match_ElementTypeA_SourceModel(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeA(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__IsAppropriate_solveCsp_FWD__Match_ElementTypeA_SourceModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeA(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ElementTypeA_SourceModel_TargetModel_SM2TM(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeA(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "sm2Tm", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEA2SRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__IsAppropriate_BWD__Match_TargetModel_Step(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEA2SRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEA2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEA2SRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "sm2Tm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEA2SRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEA2SRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge_steps",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__GenerateModel__RuleEntryContainer_SM2TM(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(),
				"sm2TmParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "sm2Tm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEA2SRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(eb2SRuleEClass, EB2SRule.class, "EB2SRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getEB2SRule__IsAppropriate_FWD__Match_ElementTypeB_SourceModel(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeB(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__RegisterObjectsToMatch_FWD__Match_ElementTypeB_SourceModel(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeB(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__IsAppropriate_solveCsp_FWD__Match_ElementTypeB_SourceModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeB(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEB2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_ElementTypeB_SourceModel_TargetModel_SM2TM(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElementTypeB(), "e", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "sm2Tm", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEB2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEB2SRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__IsAppropriate_BWD__Match_TargetModel_Step(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEB2SRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEB2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEB2SRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEB2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "sm2Tm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEB2SRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getEB2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getEB2SRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge_steps",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__GenerateModel__RuleEntryContainer_SM2TM(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(),
				"sm2TmParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getEB2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "sm2Tm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEB2SRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);
	}

} //RulesPackageImpl
