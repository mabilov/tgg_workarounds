/**
 */
package Source.impl;

import Source.SourcePackage;
import Source.SplitMerge;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Source.impl.SplitMergeImpl#get__con <em>con</em>}</li>
 *   <li>{@link Source.impl.SplitMergeImpl#isMerge <em>Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplitMergeImpl extends ElementImpl implements SplitMerge {
	/**
	 * The cached value of the '{@link #get__con() <em>con</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get__con()
	 * @generated
	 * @ordered
	 */
	protected SplitMerge __con;

	/**
	 * The default value of the '{@link #isMerge() <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerge() <em>Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerge()
	 * @generated
	 * @ordered
	 */
	protected boolean merge = MERGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.SPLIT_MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitMerge get__con() {
		if (__con != null && __con.eIsProxy()) {
			InternalEObject old__con = (InternalEObject) __con;
			__con = (SplitMerge) eResolveProxy(old__con);
			if (__con != old__con) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SourcePackage.SPLIT_MERGE__CON, old__con, __con));
			}
		}
		return __con;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitMerge basicGet__con() {
		return __con;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set__con(SplitMerge new__con) {
		SplitMerge old__con = __con;
		__con = new__con;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SourcePackage.SPLIT_MERGE__CON, old__con, __con));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMerge() {
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerge(boolean newMerge) {
		boolean oldMerge = merge;
		merge = newMerge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SourcePackage.SPLIT_MERGE__MERGE, oldMerge, merge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SourcePackage.SPLIT_MERGE__CON:
			if (resolve)
				return get__con();
			return basicGet__con();
		case SourcePackage.SPLIT_MERGE__MERGE:
			return isMerge();
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
		case SourcePackage.SPLIT_MERGE__CON:
			set__con((SplitMerge) newValue);
			return;
		case SourcePackage.SPLIT_MERGE__MERGE:
			setMerge((Boolean) newValue);
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
		case SourcePackage.SPLIT_MERGE__CON:
			set__con((SplitMerge) null);
			return;
		case SourcePackage.SPLIT_MERGE__MERGE:
			setMerge(MERGE_EDEFAULT);
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
		case SourcePackage.SPLIT_MERGE__CON:
			return __con != null;
		case SourcePackage.SPLIT_MERGE__MERGE:
			return merge != MERGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (merge: ");
		result.append(merge);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SplitMergeImpl
