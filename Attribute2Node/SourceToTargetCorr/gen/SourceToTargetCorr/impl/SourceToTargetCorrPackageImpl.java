/**
 */
package SourceToTargetCorr.impl;

import Source.SourcePackage;

import SourceToTargetCorr.E2Sp;

import SourceToTargetCorr.Rules.RulesPackage;

import SourceToTargetCorr.Rules.impl.RulesPackageImpl;

import SourceToTargetCorr.SourceToTargetCorrFactory;
import SourceToTargetCorr.SourceToTargetCorrPackage;
import SourceToTargetCorr._SpAt2Sp;

import TGGLanguage.TGGLanguagePackage;

import TGGRuntime.TGGRuntimePackage;

import Target.TargetPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceToTargetCorrPackageImpl extends EPackageImpl implements
		SourceToTargetCorrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sm2TMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e2SEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e2SpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _SpAt2SpEClass = null;

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
	 * @see SourceToTargetCorr.SourceToTargetCorrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SourceToTargetCorrPackageImpl() {
		super(eNS_URI, SourceToTargetCorrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SourceToTargetCorrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SourceToTargetCorrPackage init() {
		if (isInited)
			return (SourceToTargetCorrPackage) EPackage.Registry.INSTANCE
					.getEPackage(SourceToTargetCorrPackage.eNS_URI);

		// Obtain or create and register package
		SourceToTargetCorrPackageImpl theSourceToTargetCorrPackage = (SourceToTargetCorrPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SourceToTargetCorrPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new SourceToTargetCorrPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SourcePackage.eINSTANCE.eClass();
		TargetPackage.eINSTANCE.eClass();
		TGGLanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Create package meta-data objects
		theSourceToTargetCorrPackage.createPackageContents();
		theRulesPackage.createPackageContents();

		// Initialize created meta-data
		theSourceToTargetCorrPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSourceToTargetCorrPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SourceToTargetCorrPackage.eNS_URI,
				theSourceToTargetCorrPackage);
		return theSourceToTargetCorrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSM2TM() {
		return sm2TMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSM2TM_Source() {
		return (EReference) sm2TMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSM2TM_Target() {
		return (EReference) sm2TMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE2S() {
		return e2SEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE2S_Source() {
		return (EReference) e2SEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE2S_Target() {
		return (EReference) e2SEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE2Sp() {
		return e2SpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE2Sp_Source() {
		return (EReference) e2SpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE2Sp_Target() {
		return (EReference) e2SpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass get_SpAt2Sp() {
		return _SpAt2SpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference get_SpAt2Sp_Source() {
		return (EReference) _SpAt2SpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference get_SpAt2Sp_Target() {
		return (EReference) _SpAt2SpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceToTargetCorrFactory getSourceToTargetCorrFactory() {
		return (SourceToTargetCorrFactory) getEFactoryInstance();
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
		sm2TMEClass = createEClass(SM2TM);
		createEReference(sm2TMEClass, SM2TM__SOURCE);
		createEReference(sm2TMEClass, SM2TM__TARGET);

		e2SEClass = createEClass(E2S);
		createEReference(e2SEClass, E2S__SOURCE);
		createEReference(e2SEClass, E2S__TARGET);

		e2SpEClass = createEClass(E2_SP);
		createEReference(e2SpEClass, E2_SP__SOURCE);
		createEReference(e2SpEClass, E2_SP__TARGET);

		_SpAt2SpEClass = createEClass(_SP_AT2_SP);
		createEReference(_SpAt2SpEClass, _SP_AT2_SP__SOURCE);
		createEReference(_SpAt2SpEClass, _SP_AT2_SP__TARGET);
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
		RulesPackage theRulesPackage = (RulesPackage) EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI);
		TGGRuntimePackage theTGGRuntimePackage = (TGGRuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(TGGRuntimePackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage) EPackage.Registry.INSTANCE
				.getEPackage(SourcePackage.eNS_URI);
		TargetPackage theTargetPackage = (TargetPackage) EPackage.Registry.INSTANCE
				.getEPackage(TargetPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRulesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sm2TMEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());
		e2SEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());
		e2SpEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());
		_SpAt2SpEClass.getESuperTypes().add(
				theTGGRuntimePackage.getAbstractCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(sm2TMEClass, SourceToTargetCorr.SM2TM.class, "SM2TM",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSM2TM_Source(), theSourcePackage.getSourceModel(),
				null, "source", null, 1, 1, SourceToTargetCorr.SM2TM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSM2TM_Target(), theTargetPackage.getTargetModel(),
				null, "target", null, 1, 1, SourceToTargetCorr.SM2TM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(e2SEClass, SourceToTargetCorr.E2S.class, "E2S",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE2S_Source(), theSourcePackage.getElement(), null,
				"source", null, 1, 1, SourceToTargetCorr.E2S.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getE2S_Target(), theTargetPackage.getStep(), null,
				"target", null, 1, 1, SourceToTargetCorr.E2S.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(e2SpEClass, E2Sp.class, "E2Sp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getE2Sp_Source(), theSourcePackage.getElement(), null,
				"source", null, 1, 1, E2Sp.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getE2Sp_Target(), theTargetPackage.getSpecial(), null,
				"target", null, 1, 1, E2Sp.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_SpAt2SpEClass, _SpAt2Sp.class, "_SpAt2Sp", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(get_SpAt2Sp_Source(),
				theSourcePackage.get_SpecialAttrType(), null, "source", null,
				1, 1, _SpAt2Sp.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(get_SpAt2Sp_Target(), theTargetPackage.getSpecial(),
				null, "target", null, 1, 1, _SpAt2Sp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SourceToTargetCorrPackageImpl
