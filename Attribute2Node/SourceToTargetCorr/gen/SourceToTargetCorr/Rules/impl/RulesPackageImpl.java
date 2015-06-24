/**
 */
package SourceToTargetCorr.Rules.impl;

import Source.SourcePackage;

import SourceToTargetCorr.Rules.Class1;
import SourceToTargetCorr.Rules.E2SRule;
import SourceToTargetCorr.Rules.ElSpAt2SpRule;
import SourceToTargetCorr.Rules.RulesFactory;
import SourceToTargetCorr.Rules.RulesPackage;
import SourceToTargetCorr.Rules._SpAT2SpRule;

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
	private EClass e2SRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elSpAt2SpRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _SpAT2SpRuleEClass = null;

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
	public EOperation getClass1__IsAppropriate_FWD_SourceModel_15__SourceModel() {
		return class1EClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass1__IsAppropriate_BWD_TargetModel_15__TargetModel() {
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
	public EClass getE2SRule() {
		return e2SRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_FWD__Match_SourceModel_Element() {
		return e2SRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__Perform_FWD__IsApplicableMatch() {
		return e2SRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsApplicable_FWD__Match() {
		return e2SRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element() {
		return e2SRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element() {
		return e2SRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_checkCsp_FWD__CSP() {
		return e2SRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Element() {
		return e2SRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsApplicable_checkCsp_FWD__CSP() {
		return e2SRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return e2SRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__CheckTypes_FWD__Match() {
		return e2SRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_BWD__Match_TargetModel_Step() {
		return e2SRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__Perform_BWD__IsApplicableMatch() {
		return e2SRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsApplicable_BWD__Match() {
		return e2SRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step() {
		return e2SRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step() {
		return e2SRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_checkCsp_BWD__CSP() {
		return e2SRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step() {
		return e2SRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsApplicable_checkCsp_BWD__CSP() {
		return e2SRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return e2SRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__CheckTypes_BWD__Match() {
		return e2SRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_FWD_EMoflonEdge_42__EMoflonEdge() {
		return e2SRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge() {
		return e2SRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__CheckAttributes_FWD__TripleMatch() {
		return e2SRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__CheckAttributes_BWD__TripleMatch() {
		return e2SRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__GenerateModel__RuleEntryContainer_SM2TM() {
		return e2SRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult() {
		return e2SRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getE2SRule__GenerateModel_checkCsp_BWD__CSP() {
		return e2SRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElSpAt2SpRule() {
		return elSpAt2SpRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_SpAT2SpRule() {
		return _SpAT2SpRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_FWD__Match_Element__SpecialAttrType() {
		return _SpAT2SpRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__Perform_FWD__IsApplicableMatch() {
		return _SpAT2SpRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsApplicable_FWD__Match() {
		return _SpAT2SpRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__RegisterObjectsToMatch_FWD__Match_Element__SpecialAttrType() {
		return _SpAT2SpRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_solveCsp_FWD__Match_Element__SpecialAttrType() {
		return _SpAT2SpRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_checkCsp_FWD__CSP() {
		return _SpAT2SpRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Element_Step_E2S__SpecialAttrType() {
		return _SpAT2SpRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsApplicable_checkCsp_FWD__CSP() {
		return _SpAT2SpRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return _SpAT2SpRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__CheckTypes_FWD__Match() {
		return _SpAT2SpRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_BWD__Match_Step_Special() {
		return _SpAT2SpRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__Perform_BWD__IsApplicableMatch() {
		return _SpAT2SpRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsApplicable_BWD__Match() {
		return _SpAT2SpRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__RegisterObjectsToMatch_BWD__Match_Step_Special() {
		return _SpAT2SpRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_solveCsp_BWD__Match_Step_Special() {
		return _SpAT2SpRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_checkCsp_BWD__CSP() {
		return _SpAT2SpRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_Special() {
		return _SpAT2SpRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsApplicable_checkCsp_BWD__CSP() {
		return _SpAT2SpRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return _SpAT2SpRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__CheckTypes_BWD__Match() {
		return _SpAT2SpRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_FWD_EMoflonEdge_43__EMoflonEdge() {
		return _SpAT2SpRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge() {
		return _SpAT2SpRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__CheckAttributes_FWD__TripleMatch() {
		return _SpAT2SpRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__CheckAttributes_BWD__TripleMatch() {
		return _SpAT2SpRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__GenerateModel__RuleEntryContainer_E2S() {
		return _SpAT2SpRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_ModelgeneratorRuleResult() {
		return _SpAT2SpRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation get_SpAT2SpRule__GenerateModel_checkCsp_BWD__CSP() {
		return _SpAT2SpRuleEClass.getEOperations().get(26);
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
				CLASS1___IS_APPROPRIATE_FWD_SOURCE_MODEL_15__SOURCEMODEL);
		createEOperation(class1EClass,
				CLASS1___IS_APPROPRIATE_BWD_TARGET_MODEL_15__TARGETMODEL);
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

		e2SRuleEClass = createEClass(E2S_RULE);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_FWD__MATCH_SOURCEMODEL_ELEMENT);
		createEOperation(e2SRuleEClass,
				E2S_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(e2SRuleEClass, E2S_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(e2SRuleEClass,
				E2S_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SOURCEMODEL_ELEMENT);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SOURCEMODEL_ELEMENT);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				e2SRuleEClass,
				E2S_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_ELEMENT);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				e2SRuleEClass,
				E2S_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(e2SRuleEClass, E2S_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(e2SRuleEClass,
				E2S_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(e2SRuleEClass, E2S_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(e2SRuleEClass,
				E2S_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TARGETMODEL_STEP);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				e2SRuleEClass,
				E2S_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_STEP);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				e2SRuleEClass,
				E2S_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(e2SRuleEClass, E2S_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_42__EMOFLONEDGE);
		createEOperation(e2SRuleEClass,
				E2S_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_57__EMOFLONEDGE);
		createEOperation(e2SRuleEClass,
				E2S_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(e2SRuleEClass,
				E2S_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(e2SRuleEClass,
				E2S_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_SM2TM);
		createEOperation(
				e2SRuleEClass,
				E2S_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOURCEMODEL_TARGETMODEL_SM2TM_MODELGENERATORRULERESULT);
		createEOperation(e2SRuleEClass,
				E2S_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		elSpAt2SpRuleEClass = createEClass(EL_SP_AT2_SP_RULE);

		_SpAT2SpRuleEClass = createEClass(_SP_AT2_SP_RULE);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_FWD__MATCH_ELEMENT__SPECIALATTRTYPE);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ELEMENT__SPECIALATTRTYPE);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ELEMENT__SPECIALATTRTYPE);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(
				_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S__SPECIALATTRTYPE);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(
				_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_BWD__MATCH_STEP_SPECIAL);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_STEP_SPECIAL);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_STEP_SPECIAL);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(
				_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_SPECIAL);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(
				_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_43__EMOFLONEDGE);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_E2S);
		createEOperation(
				_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ELEMENT_STEP_E2S_MODELGENERATORRULERESULT);
		createEOperation(_SpAT2SpRuleEClass,
				_SP_AT2_SP_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
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
		e2SRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		elSpAt2SpRuleEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractRule());
		_SpAT2SpRuleEClass.getESuperTypes().add(
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
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
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
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_solveCsp_FWD__Match_SourceModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
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
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
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
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);

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
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
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
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_solveCsp_BWD__Match_TargetModel(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
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
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
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
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getClass1__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_FWD_SourceModel_15__SourceModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_SourceModel_15", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getClass1__IsAppropriate_BWD_TargetModel_15__TargetModel(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_TargetModel_15", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
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

		initEClass(e2SRuleEClass, E2SRule.class, "E2SRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getE2SRule__IsAppropriate_FWD__Match_SourceModel_Element(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getE2SRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getE2SRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getE2SRule__RegisterObjectsToMatch_FWD__Match_SourceModel_Element(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getE2SRule__IsAppropriate_solveCsp_FWD__Match_SourceModel_Element(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getE2SRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getE2SRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Element(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getSourceModel(), "sm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(), "sm2Tm", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getE2SRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getE2SRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getE2SRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getE2SRule__IsAppropriate_BWD__Match_TargetModel_Step(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getE2SRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getE2SRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getE2SRule__RegisterObjectsToMatch_BWD__Match_TargetModel_Step(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getE2SRule__IsAppropriate_solveCsp_BWD__Match_TargetModel_Step(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getTargetModel(), "tm", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getE2SRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getE2SRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_Step(),
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

		op = initEOperation(getE2SRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getE2SRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sm2Tm", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getE2SRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getE2SRule__IsAppropriate_FWD_EMoflonEdge_42__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_42", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_elements", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getE2SRule__IsAppropriate_BWD_EMoflonEdge_57__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_57", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(), "_edge_steps",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getE2SRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getE2SRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getE2SRule__GenerateModel__RuleEntryContainer_SM2TM(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getSM2TM(),
				"sm2TmParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getE2SRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_SourceModel_TargetModel_SM2TM_ModelgeneratorRuleResult(),
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

		op = initEOperation(getE2SRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(elSpAt2SpRuleEClass, ElSpAt2SpRule.class, "ElSpAt2SpRule",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(_SpAT2SpRuleEClass, _SpAT2SpRule.class, "_SpAT2SpRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				get_SpAT2SpRule__IsAppropriate_FWD__Match_Element__SpecialAttrType(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.get_SpecialAttrType(), "_spAt", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__Perform_FWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__IsApplicable_FWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__RegisterObjectsToMatch_FWD__Match_Element__SpecialAttrType(),
				null, "registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.get_SpecialAttrType(), "_spAt", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__IsAppropriate_solveCsp_FWD__Match_Element__SpecialAttrType(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourcePackage.get_SpecialAttrType(), "_spAt", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__IsAppropriate_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Element_Step_E2S__SpecialAttrType(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e2S", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.get_SpecialAttrType(), "_spAt", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__IsApplicable_checkCsp_FWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_FWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "_spAt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sp", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "_spAt2Sp", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__CheckTypes_FWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__IsAppropriate_BWD__Match_Step_Special(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecial(), "sp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__Perform_BWD__IsApplicableMatch(),
				theTGGRuntimePackage.getPerformRuleResult(), "perform_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__IsApplicable_BWD__Match(),
				theTGGRuntimePackage.getIsApplicableRuleResult(),
				"isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__RegisterObjectsToMatch_BWD__Match_Step_Special(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecial(), "sp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__IsAppropriate_solveCsp_BWD__Match_Step_Special(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecial(), "sp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__IsAppropriate_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isAppropriate_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_Special(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e2S", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTargetPackage.getSpecial(), "sp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__IsApplicable_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "isApplicable_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getPerformRuleResult(),
				"ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "e2S", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "_spAt", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "sp", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "_spAt2Sp", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__CheckTypes_BWD__Match(),
				ecorePackage.getEBoolean(), "checkTypes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getMatch(), "match", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__IsAppropriate_FWD_EMoflonEdge_43__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_FWD_EMoflonEdge_43", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge__special", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__IsAppropriate_BWD_EMoflonEdge_58__EMoflonEdge(),
				theTGGRuntimePackage.getEObjectContainer(),
				"isAppropriate_BWD_EMoflonEdge_58", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getEMoflonEdge(),
				"_edge_special", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__CheckAttributes_FWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_FWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__CheckAttributes_BWD__TripleMatch(),
				theTGGRuntimePackage.getRuleResult(), "checkAttributes_BWD", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getTripleMatch(), "tripleMatch",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__GenerateModel__RuleEntryContainer_E2S(),
				theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(),
				"ruleEntryContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(),
				"e2SParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				get_SpAT2SpRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Element_Step_E2S_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getIsApplicableMatch(),
				"isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSourcePackage.getElement(), "e", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theTargetPackage.getStep(), "s", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theSourceToTargetCorrPackage.getE2S(), "e2S", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTGGRuntimePackage.getModelgeneratorRuleResult(),
				"ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(get_SpAT2SpRule__GenerateModel_checkCsp_BWD__CSP(),
				ecorePackage.getEBoolean(), "generateModel_checkCsp_BWD", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE,
				IS_ORDERED);
	}

} //RulesPackageImpl
