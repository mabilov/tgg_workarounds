/**
 */
package SourceToTargetCorr.impl;

import SourceToTargetCorr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceToTargetCorrFactoryImpl extends EFactoryImpl implements
		SourceToTargetCorrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceToTargetCorrFactory init() {
		try {
			SourceToTargetCorrFactory theSourceToTargetCorrFactory = (SourceToTargetCorrFactory) EPackage.Registry.INSTANCE
					.getEFactory(SourceToTargetCorrPackage.eNS_URI);
			if (theSourceToTargetCorrFactory != null) {
				return theSourceToTargetCorrFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SourceToTargetCorrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceToTargetCorrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SourceToTargetCorrPackage.SM2TM:
			return createSM2TM();
		case SourceToTargetCorrPackage.E2S:
			return createE2S();
		case SourceToTargetCorrPackage.E2_SP:
			return createE2Sp();
		case SourceToTargetCorrPackage._SP_AT2_SP:
			return create_SpAt2Sp();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SM2TM createSM2TM() {
		SM2TMImpl sm2TM = new SM2TMImpl();
		return sm2TM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E2S createE2S() {
		E2SImpl e2S = new E2SImpl();
		return e2S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E2Sp createE2Sp() {
		E2SpImpl e2Sp = new E2SpImpl();
		return e2Sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _SpAt2Sp create_SpAt2Sp() {
		_SpAt2SpImpl _SpAt2Sp = new _SpAt2SpImpl();
		return _SpAt2Sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceToTargetCorrPackage getSourceToTargetCorrPackage() {
		return (SourceToTargetCorrPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SourceToTargetCorrPackage getPackage() {
		return SourceToTargetCorrPackage.eINSTANCE;
	}

} //SourceToTargetCorrFactoryImpl
