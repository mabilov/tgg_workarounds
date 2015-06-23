/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.SourcePackage;

import SourceToTargetCorr.Rules.A2SRule;
import SourceToTargetCorr.Rules.Class1;
import SourceToTargetCorr.Rules.ContinueFixRule;
import SourceToTargetCorr.Rules.ContinueRule;
import SourceToTargetCorr.Rules.NextRule;
import SourceToTargetCorr.Rules.RulesFactory;
import SourceToTargetCorr.Rules.RulesPackage;
import SourceToTargetCorr.Rules.SpM2SpSRule;

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
	private EClass class1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a2SRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spM2SpSRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueFixRuleEClass = null;

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
	public EClass getClass1() {
		return class1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD__Match_SourceModel() {
		return class1EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__Perform_FWD__IsApplicableMatch() {
		return class1EClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_FWD__Match() {
		return class1EClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjectsToMatch_FWD__Match_SourceModel() {
		return class1EClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_solveCsp_FWD__Match_SourceModel() {
		return class1EClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_checkCsp_FWD__CSP() {
		return class1EClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel() {
		return class1EClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_checkCsp_FWD__CSP() {
		return class1EClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return class1EClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckTypes_FWD__Match() {
		return class1EClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_BWD__Match_TargetModel() {
		return class1EClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__Perform_BWD__IsApplicableMatch() {
		return class1EClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_BWD__Match() {
		return class1EClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjectsToMatch_BWD__Match_TargetModel() {
		return class1EClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_solveCsp_BWD__Match_TargetModel() {
		return class1EClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_checkCsp_BWD__CSP() {
		return class1EClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_TargetModel() {
		return class1EClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsApplicable_checkCsp_BWD__CSP() {
		return class1EClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return class1EClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckTypes_BWD__Match() {
		return class1EClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_FWD_SourceModel_6__SourceModel() {
		return class1EClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_BWD_TargetModel_6__TargetModel() {
		return class1EClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckAttributes_FWD__TripleMatch() {
		return class1EClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__CheckAttributes_BWD__TripleMatch() {
		return class1EClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__GenerateModel__RuleEntryContainer() {
		return class1EClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return class1EClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__GenerateModel_checkCsp_BWD__CSP() {
		return class1EClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA2SRule() {
		return a2SRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_FWD__Match_SourceModel_Activity() {
		return a2SRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__Perform_FWD__IsApplicableMatch() {
		return a2SRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsApplicable_FWD__Match() {
		return a2SRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Activity() {
		return a2SRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Activity() {
		return a2SRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_checkCsp_FWD__CSP() {
		return a2SRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Activity() {
		return a2SRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsApplicable_checkCsp_FWD__CSP() {
		return a2SRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return a2SRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__CheckTypes_FWD__Match() {
		return a2SRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_BWD__Match_TargetModel_Step() {
		return a2SRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__Perform_BWD__IsApplicableMatch() {
		return a2SRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsApplicable_BWD__Match() {
		return a2SRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step() {
		return a2SRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step() {
		return a2SRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_checkCsp_BWD__CSP() {
		return a2SRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step() {
		return a2SRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsApplicable_checkCsp_BWD__CSP() {
		return a2SRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return a2SRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__CheckTypes_BWD__Match() {
		return a2SRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return a2SRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge() {
		return a2SRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__CheckAttributes_FWD__TripleMatch() {
		return a2SRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__CheckAttributes_BWD__TripleMatch() {
		return a2SRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__GenerateModel__RuleEntryContainer_SM2TM() {
		return a2SRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult() {
		return a2SRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getA2SRule__GenerateModel_checkCsp_BWD__CSP() {
		return a2SRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpM2SpSRule() {
		return spM2SpSRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_FWD__Match_SourceModel_SplitMerge() {
		return spM2SpSRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__Perform_FWD__IsApplicableMatch() {
		return spM2SpSRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsApplicable_FWD__Match() {
		return spM2SpSRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__RegisterObjectsToMatch_FWD__Match_SourceModel_SplitMerge() {
		return spM2SpSRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_SplitMerge() {
		return spM2SpSRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_checkCsp_FWD__CSP() {
		return spM2SpSRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SplitMerge() {
		return spM2SpSRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsApplicable_checkCsp_FWD__CSP() {
		return spM2SpSRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return spM2SpSRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__CheckTypes_FWD__Match() {
		return spM2SpSRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_BWD__Match_TargetModel_SpecialStep() {
		return spM2SpSRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__Perform_BWD__IsApplicableMatch() {
		return spM2SpSRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsApplicable_BWD__Match() {
		return spM2SpSRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__RegisterObjectsToMatch_BWD__Match_TargetModel_SpecialStep() {
		return spM2SpSRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_SpecialStep() {
		return spM2SpSRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_checkCsp_BWD__CSP() {
		return spM2SpSRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SpecialStep() {
		return spM2SpSRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsApplicable_checkCsp_BWD__CSP() {
		return spM2SpSRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return spM2SpSRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__CheckTypes_BWD__Match() {
		return spM2SpSRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
		return spM2SpSRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge() {
		return spM2SpSRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__CheckAttributes_FWD__TripleMatch() {
		return spM2SpSRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__CheckAttributes_BWD__TripleMatch() {
		return spM2SpSRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__GenerateModel__RuleEntryContainer_SM2TM() {
		return spM2SpSRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult() {
		return spM2SpSRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpM2SpSRule__GenerateModel_checkCsp_BWD__CSP() {
		return spM2SpSRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextRule() {
		return nextRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_FWD__Match_SourceModel_Element_Element() {
		return nextRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__Perform_FWD__IsApplicableMatch() {
		return nextRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsApplicable_FWD__Match() {
		return nextRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element_Element() {
		return nextRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element_Element() {
		return nextRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_checkCsp_FWD__CSP() {
		return nextRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step() {
		return nextRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsApplicable_checkCsp_FWD__CSP() {
		return nextRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return nextRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__CheckTypes_FWD__Match() {
		return nextRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_BWD__Match_Step_TargetModel_Step() {
		return nextRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__Perform_BWD__IsApplicableMatch() {
		return nextRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsApplicable_BWD__Match() {
		return nextRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__RegisterObjectsToMatch_BWD__Match_Step_TargetModel_Step() {
		return nextRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_solveCsp_BWD__Match_Step_TargetModel_Step() {
		return nextRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_checkCsp_BWD__CSP() {
		return nextRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step() {
		return nextRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsApplicable_checkCsp_BWD__CSP() {
		return nextRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return nextRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__CheckTypes_BWD__Match() {
		return nextRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge() {
		return nextRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
		return nextRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__CheckAttributes_FWD__TripleMatch() {
		return nextRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__CheckAttributes_BWD__TripleMatch() {
		return nextRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__GenerateModel__RuleEntryContainer_E2S() {
		return nextRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step_ModelgeneratorRuleResult() {
		return nextRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNextRule__GenerateModel_checkCsp_BWD__CSP() {
		return nextRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinueRule() {
		return continueRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinueFixRule() {
		return continueFixRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_FWD__Match_SplitMerge_SplitMerge() {
		return continueFixRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__Perform_FWD__IsApplicableMatch() {
		return continueFixRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsApplicable_FWD__Match() {
		return continueFixRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__RegisterObjectsToMatch_FWD__Match_SplitMerge_SplitMerge() {
		return continueFixRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_solveCsp_FWD__Match_SplitMerge_SplitMerge() {
		return continueFixRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_checkCsp_FWD__CSP() {
		return continueFixRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SpecialStep_SpecialStep_SplitMerge_SplitMerge_E2S_E2S() {
		return continueFixRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsApplicable_checkCsp_FWD__CSP() {
		return continueFixRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return continueFixRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__CheckTypes_FWD__Match() {
		return continueFixRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_BWD__Match_SpecialStep_SpecialStep() {
		return continueFixRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__Perform_BWD__IsApplicableMatch() {
		return continueFixRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsApplicable_BWD__Match() {
		return continueFixRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__RegisterObjectsToMatch_BWD__Match_SpecialStep_SpecialStep() {
		return continueFixRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_solveCsp_BWD__Match_SpecialStep_SpecialStep() {
		return continueFixRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_checkCsp_BWD__CSP() {
		return continueFixRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SpecialStep_SpecialStep_SplitMerge_SplitMerge_E2S_E2S() {
		return continueFixRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsApplicable_checkCsp_BWD__CSP() {
		return continueFixRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return continueFixRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__CheckTypes_BWD__Match() {
		return continueFixRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge() {
		return continueFixRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
		return continueFixRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__CheckAttributes_FWD__TripleMatch() {
		return continueFixRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__CheckAttributes_BWD__TripleMatch() {
		return continueFixRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__GenerateModel__RuleEntryContainer_E2S_E2S() {
		return continueFixRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SpecialStep_SpecialStep_SplitMerge_SplitMerge_E2S_E2S_ModelgeneratorRuleResult() {
		return continueFixRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinueFixRule__GenerateModel_checkCsp_BWD__CSP() {
		return continueFixRuleEClass.getEOperations().get(26);
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
		class1EClass = createEClass(CLASS1);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL);
		createEOperation(class1EClass, CLASS1___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(class1EClass, CLASS1___IS_APPLICABLE_FWD__MATCH);
		createEOperation(class1EClass,
				CLASS1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(class1EClass,
				CLASS1___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(class1EClass,
				CLASS1___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(class1EClass, CLASS1___CHECK_TYPES_FWD__MATCH);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL);
		createEOperation(class1EClass, CLASS1___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(class1EClass, CLASS1___IS_APPLICABLE_BWD__MATCH);
		createEOperation(class1EClass,
				CLASS1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(class1EClass,
				CLASS1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TARGETMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(class1EClass,
				CLASS1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(class1EClass, CLASS1___CHECK_TYPES_BWD__MATCH);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_6__SOURCEMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_6__TARGETMODEL);
		createEOperation(class1EClass,
				CLASS1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(class1EClass,
				CLASS1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(class1EClass,
				CLASS1___GENERATE_MODEL__RULEENTRYCONTAINER);
		createEOperation(
				class1EClass,
				CLASS1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT);
		createEOperation(class1EClass,
				CLASS1___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		a2SRuleEClass = createEClass(A2S_RULE);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ACTIVITY);
		createEOperation(a2SRuleEClass,
				A2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(a2SRuleEClass, A2S_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(a2SRuleEClass,
				A2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ACTIVITY);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ACTIVITY);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				a2SRuleEClass,
				A2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_ACTIVITY);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				a2SRuleEClass,
				A2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(a2SRuleEClass, A2S_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(a2SRuleEClass,
				A2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(a2SRuleEClass, A2S_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(a2SRuleEClass,
				A2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				a2SRuleEClass,
				A2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				a2SRuleEClass,
				A2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(a2SRuleEClass, A2S_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE);
		createEOperation(a2SRuleEClass,
				A2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE);
		createEOperation(a2SRuleEClass,
				A2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(a2SRuleEClass,
				A2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(a2SRuleEClass,
				A2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM);
		createEOperation(
				a2SRuleEClass,
				A2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT);
		createEOperation(a2SRuleEClass,
				A2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		spM2SpSRuleEClass = createEClass(SP_M2_SP_SRULE);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_SPLITMERGE);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_SPLITMERGE);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_SPLITMERGE);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPLITMERGE);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				spM2SpSRuleEClass,
				SP_M2_SP_SRULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_SPECIALSTEP);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_SPECIALSTEP);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_SPECIALSTEP);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_SPECIALSTEP);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				spM2SpSRuleEClass,
				SP_M2_SP_SRULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM);
		createEOperation(
				spM2SpSRuleEClass,
				SP_M2_SP_SRULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT);
		createEOperation(spM2SpSRuleEClass,
				SP_M2_SP_SRULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		nextRuleEClass = createEClass(NEXT_RULE);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT);
		createEOperation(nextRuleEClass,
				NEXT_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(nextRuleEClass, NEXT_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(nextRuleEClass,
				NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT_ELEMENT);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				nextRuleEClass,
				NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				nextRuleEClass,
				NEXT_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(nextRuleEClass, NEXT_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_TARGETMODEL_STEP);
		createEOperation(nextRuleEClass,
				NEXT_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(nextRuleEClass, NEXT_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(nextRuleEClass,
				NEXT_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_TARGETMODEL_STEP);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_TARGETMODEL_STEP);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				nextRuleEClass,
				NEXT_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				nextRuleEClass,
				NEXT_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(nextRuleEClass, NEXT_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE);
		createEOperation(nextRuleEClass,
				NEXT_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_24__EMOFLONEDGE);
		createEOperation(nextRuleEClass,
				NEXT_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(nextRuleEClass,
				NEXT_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(nextRuleEClass,
				NEXT_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S);
		createEOperation(
				nextRuleEClass,
				NEXT_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_ELEMENT_STEP_ELEMENT_TARGETMODEL_SM2TM_E2S_E2S_STEP_MODELGENERATORRULERESULT);
		createEOperation(nextRuleEClass,
				NEXT_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		continueRuleEClass = createEClass(CONTINUE_RULE);

		continueFixRuleEClass = createEClass(CONTINUE_FIX_RULE);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_FWD__MATCH_SPLITMERGE_SPLITMERGE);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SPLITMERGE_SPLITMERGE);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SPLITMERGE_SPLITMERGE);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SPECIALSTEP_SPECIALSTEP_SPLITMERGE_SPLITMERGE_E2S_E2S);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				continueFixRuleEClass,
				CONTINUE_FIX_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_BWD__MATCH_SPECIALSTEP_SPECIALSTEP);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(
				continueFixRuleEClass,
				CONTINUE_FIX_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_SPECIALSTEP_SPECIALSTEP);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_SPECIALSTEP_SPECIALSTEP);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPECIALSTEP_SPECIALSTEP_SPLITMERGE_SPLITMERGE_E2S_E2S);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				continueFixRuleEClass,
				CONTINUE_FIX_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_25__EMOFLONEDGE);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S_E2S);
		createEOperation(
				continueFixRuleEClass,
				CONTINUE_FIX_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SPECIALSTEP_SPECIALSTEP_SPLITMERGE_SPLITMERGE_E2S_E2S_MODELGENERATORRULERESULT);
		createEOperation(continueFixRuleEClass,
				CONTINUE_FIX_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
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
		class1EClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		a2SRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		spM2SpSRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		nextRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		continueRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		continueFixRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(class1EClass, Class1.class, "Class1", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(
				getClass1__IsAppropriate_FWD__Match_SourceModel(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "source", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__RegisterObjectsToMatch_FWD__Match_SourceModel(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "source", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_solveCsp_FWD__Match_SourceModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "source", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getClass1__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "source", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getClass1__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "source", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "target", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sourceToTarget", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__IsAppropriate_BWD__Match_TargetModel(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "target", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__RegisterObjectsToMatch_BWD__Match_TargetModel(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "target", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_solveCsp_BWD__Match_TargetModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "target", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getClass1__IsApplicable_solveCsp_BWD__IsApplicableMatch_TargetModel(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "target", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getClass1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "source", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "target", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sourceToTarget", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_FWD_SourceModel_6__SourceModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_SourceModel_6", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "source", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_BWD_TargetModel_6__TargetModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_TargetModel_6", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "target", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__GenerateModel__RuleEntryContainer(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClass1__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(a2SRuleEClass, A2SRule.class, "A2SRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getA2SRule__IsAppropriate_FWD__Match_SourceModel_Activity(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getActivity(), "a", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getA2SRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getA2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Activity(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getActivity(), "a", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getA2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Activity(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getActivity(), "a", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getA2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Activity(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getActivity(), "a", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getA2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "aToS", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "smToTm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "a", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getA2SRule__IsAppropriate_BWD__Match_TargetModel_Step(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getA2SRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getA2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getA2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getA2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getA2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "aToS", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "smToTm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "a", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getA2SRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getA2SRule__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_22", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getA2SRule__IsAppropriate_BWD_EMoflonEdge_28__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_28", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge_steps",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getA2SRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getA2SRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getA2SRule__GenerateModel__RuleEntryContainer_SM2TM(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(),
				"smToTmParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getA2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getA2SRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(spM2SpSRuleEClass, SpM2SpSRule.class, "SpM2SpSRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getSpM2SpSRule__IsAppropriate_FWD__Match_SourceModel_SplitMerge(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spM", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__RegisterObjectsToMatch_FWD__Match_SourceModel_SplitMerge(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spM", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_SplitMerge(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spM", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SplitMerge(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spM", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "smToTm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spM", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spS", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spMToSpS", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__IsAppropriate_BWD__Match_TargetModel_SpecialStep(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "spS", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__RegisterObjectsToMatch_BWD__Match_TargetModel_SpecialStep(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "spS", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_SpecialStep(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "spS", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_SpecialStep(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "spS", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "smToTm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spM", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spS", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spMToSpS", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_23", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__IsAppropriate_BWD_EMoflonEdge_29__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_29", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge_steps",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__GenerateModel__RuleEntryContainer_SM2TM(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(),
				"smToTmParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getSpM2SpSRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSpM2SpSRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(nextRuleEClass, NextRule.class, "NextRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getNextRule__IsAppropriate_FWD__Match_SourceModel_Element_Element(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNextRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getNextRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element_Element(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getNextRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element_Element(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getNextRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e1ToS1", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e2ToS2", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getNextRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "smToTm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e1ToS1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2ToS2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getNextRule__IsAppropriate_BWD__Match_Step_TargetModel_Step(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNextRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getNextRule__RegisterObjectsToMatch_BWD__Match_Step_TargetModel_Step(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getNextRule__IsAppropriate_solveCsp_BWD__Match_Step_TargetModel_Step(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getNextRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e1ToS1", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e2ToS2", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getNextRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "smToTm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e1ToS1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2ToS2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getNextRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getNextRule__IsAppropriate_BWD_EMoflonEdge_30__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_30", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge_next",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getNextRule__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_24", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge_next",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNextRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNextRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getNextRule__GenerateModel__RuleEntryContainer_E2S(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(),
				"e1ToS1Parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getNextRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_Element_Step_Element_TargetModel_SM2TM_E2S_E2S_Step_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "smToTm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e1ToS1", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e2ToS2", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNextRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(continueRuleEClass, ContinueRule.class, "ContinueRule",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continueFixRuleEClass, ContinueFixRule.class,
				"ContinueFixRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_FWD__Match_SplitMerge_SplitMerge(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm1", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinueFixRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__RegisterObjectsToMatch_FWD__Match_SplitMerge_SplitMerge(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm1", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_solveCsp_FWD__Match_SplitMerge_SplitMerge(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm1", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SpecialStep_SpecialStep_SplitMerge_SplitMerge_E2S_E2S(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "spm1ToSps1",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "spm2ToSps2",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sps2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sps1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm1ToSps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm2ToSps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinueFixRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_BWD__Match_SpecialStep_SpecialStep(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinueFixRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__RegisterObjectsToMatch_BWD__Match_SpecialStep_SpecialStep(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_solveCsp_BWD__Match_SpecialStep_SpecialStep(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SpecialStep_SpecialStep_SplitMerge_SplitMerge_E2S_E2S(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "spm1ToSps1",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "spm2ToSps2",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sps2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sps1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm2", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm1", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm1ToSps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "spm2ToSps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinueFixRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_BWD_EMoflonEdge_31__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_31", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_continue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_25", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge___con",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__GenerateModel__RuleEntryContainer_E2S_E2S(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(),
				"spm2ToSps2Parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(),
				"spm1ToSps1Parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SpecialStep_SpecialStep_SplitMerge_SplitMerge_E2S_E2S_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecialStep(), "sps1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm2", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSplitMerge(), "spm1", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "spm1ToSps1",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "spm2ToSps2",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getContinueFixRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);
	}

} //RulesPackageImpl
