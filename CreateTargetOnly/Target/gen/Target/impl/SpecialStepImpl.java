/**
 */
package Target.impl;

import Target.SpecialStep;
import Target.TargetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Target.impl.SpecialStepImpl#getContinue <em>Continue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecialStepImpl extends StepImpl implements SpecialStep {
	/**
	 * The cached value of the '{@link #getContinue() <em>Continue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue()
	 * @generated
	 * @ordered
	 */
	protected SpecialStep continue_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.SPECIAL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialStep getContinue() {
		if (continue_ != null && continue_.eIsProxy()) {
			InternalEObject oldContinue = (InternalEObject) continue_;
			continue_ = (SpecialStep) eResolveProxy(oldContinue);
			if (continue_ != oldContinue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TargetPackage.SPECIAL_STEP__CONTINUE, oldContinue,
							continue_));
			}
		}
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialStep basicGetContinue() {
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinue(SpecialStep newContinue) {
		SpecialStep oldContinue = continue_;
		continue_ = newContinue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TargetPackage.SPECIAL_STEP__CONTINUE, oldContinue,
					continue_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TargetPackage.SPECIAL_STEP__CONTINUE:
			if (resolve)
				return getContinue();
			return basicGetContinue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TargetPackage.SPECIAL_STEP__CONTINUE:
			setContinue((SpecialStep) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TargetPackage.SPECIAL_STEP__CONTINUE:
			setContinue((SpecialStep) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TargetPackage.SPECIAL_STEP__CONTINUE:
			return continue_ != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SpecialStepImpl
