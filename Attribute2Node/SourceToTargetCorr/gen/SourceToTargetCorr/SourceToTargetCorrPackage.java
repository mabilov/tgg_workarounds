/**
 */
package SourceToTargetCorr;

import TGGRuntime.TGGRuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see SourceToTargetCorr.SourceToTargetCorrFactory
 * @model kind="package"
 * @generated
 */
public interface SourceToTargetCorrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SourceToTargetCorr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SourceToTargetCorr/model/SourceToTargetCorr.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SourceToTargetCorr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SourceToTargetCorrPackage eINSTANCE = SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.impl.SM2TMImpl <em>SM2TM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.impl.SM2TMImpl
	 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#getSM2TM()
	 * @generated
	 */
	int SM2TM = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2TM__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2TM__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SM2TM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2TM_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SM2TM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM2TM_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.impl.E2SImpl <em>E2S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.impl.E2SImpl
	 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#getE2S()
	 * @generated
	 */
	int E2S = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>E2S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>E2S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2S_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.impl.E2SpImpl <em>E2 Sp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.impl.E2SpImpl
	 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#getE2Sp()
	 * @generated
	 */
	int E2_SP = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2_SP__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2_SP__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>E2 Sp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2_SP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>E2 Sp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2_SP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SourceToTargetCorr.impl._SpAt2SpImpl <em>Sp At2 Sp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SourceToTargetCorr.impl._SpAt2SpImpl
	 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#get_SpAt2Sp()
	 * @generated
	 */
	int _SP_AT2_SP = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP__SOURCE = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP__TARGET = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sp At2 Sp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_FEATURE_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sp At2 Sp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _SP_AT2_SP_OPERATION_COUNT = TGGRuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.SM2TM <em>SM2TM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SM2TM</em>'.
	 * @see SourceToTargetCorr.SM2TM
	 * @generated
	 */
	EClass getSM2TM();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr.SM2TM#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see SourceToTargetCorr.SM2TM#getSource()
	 * @see #getSM2TM()
	 * @generated
	 */
	EReference getSM2TM_Source();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr.SM2TM#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see SourceToTargetCorr.SM2TM#getTarget()
	 * @see #getSM2TM()
	 * @generated
	 */
	EReference getSM2TM_Target();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.E2S <em>E2S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E2S</em>'.
	 * @see SourceToTargetCorr.E2S
	 * @generated
	 */
	EClass getE2S();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr.E2S#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see SourceToTargetCorr.E2S#getSource()
	 * @see #getE2S()
	 * @generated
	 */
	EReference getE2S_Source();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr.E2S#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see SourceToTargetCorr.E2S#getTarget()
	 * @see #getE2S()
	 * @generated
	 */
	EReference getE2S_Target();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr.E2Sp <em>E2 Sp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E2 Sp</em>'.
	 * @see SourceToTargetCorr.E2Sp
	 * @generated
	 */
	EClass getE2Sp();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr.E2Sp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see SourceToTargetCorr.E2Sp#getSource()
	 * @see #getE2Sp()
	 * @generated
	 */
	EReference getE2Sp_Source();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr.E2Sp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see SourceToTargetCorr.E2Sp#getTarget()
	 * @see #getE2Sp()
	 * @generated
	 */
	EReference getE2Sp_Target();

	/**
	 * Returns the meta object for class '{@link SourceToTargetCorr._SpAt2Sp <em>Sp At2 Sp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sp At2 Sp</em>'.
	 * @see SourceToTargetCorr._SpAt2Sp
	 * @generated
	 */
	EClass get_SpAt2Sp();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr._SpAt2Sp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see SourceToTargetCorr._SpAt2Sp#getSource()
	 * @see #get_SpAt2Sp()
	 * @generated
	 */
	EReference get_SpAt2Sp_Source();

	/**
	 * Returns the meta object for the reference '{@link SourceToTargetCorr._SpAt2Sp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see SourceToTargetCorr._SpAt2Sp#getTarget()
	 * @see #get_SpAt2Sp()
	 * @generated
	 */
	EReference get_SpAt2Sp_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SourceToTargetCorrFactory getSourceToTargetCorrFactory();

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
		 * The meta object literal for the '{@link SourceToTargetCorr.impl.SM2TMImpl <em>SM2TM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.impl.SM2TMImpl
		 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#getSM2TM()
		 * @generated
		 */
		EClass SM2TM = eINSTANCE.getSM2TM();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM2TM__SOURCE = eINSTANCE.getSM2TM_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SM2TM__TARGET = eINSTANCE.getSM2TM_Target();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.impl.E2SImpl <em>E2S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.impl.E2SImpl
		 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#getE2S()
		 * @generated
		 */
		EClass E2S = eINSTANCE.getE2S();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E2S__SOURCE = eINSTANCE.getE2S_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E2S__TARGET = eINSTANCE.getE2S_Target();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.impl.E2SpImpl <em>E2 Sp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.impl.E2SpImpl
		 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#getE2Sp()
		 * @generated
		 */
		EClass E2_SP = eINSTANCE.getE2Sp();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E2_SP__SOURCE = eINSTANCE.getE2Sp_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference E2_SP__TARGET = eINSTANCE.getE2Sp_Target();

		/**
		 * The meta object literal for the '{@link SourceToTargetCorr.impl._SpAt2SpImpl <em>Sp At2 Sp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SourceToTargetCorr.impl._SpAt2SpImpl
		 * @see SourceToTargetCorr.impl.SourceToTargetCorrPackageImpl#get_SpAt2Sp()
		 * @generated
		 */
		EClass _SP_AT2_SP = eINSTANCE.get_SpAt2Sp();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _SP_AT2_SP__SOURCE = eINSTANCE.get_SpAt2Sp_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _SP_AT2_SP__TARGET = eINSTANCE.get_SpAt2Sp_Target();

	}

} //SourceToTargetCorrPackage
