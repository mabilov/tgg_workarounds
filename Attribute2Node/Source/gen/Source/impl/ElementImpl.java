/**
 */
package Source.impl;

import Source.Element;
import Source.SourcePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Source.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link Source.impl.ElementImpl#getSpecialAttr <em>Special Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialAttr() <em>Special Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_ATTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialAttr() <em>Special Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialAttr()
	 * @generated
	 * @ordered
	 */
	protected String specialAttr = SPECIAL_ATTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SourcePackage.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialAttr() {
		return specialAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialAttr(String newSpecialAttr) {
		String oldSpecialAttr = specialAttr;
		specialAttr = newSpecialAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SourcePackage.ELEMENT__SPECIAL_ATTR, oldSpecialAttr,
					specialAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SourcePackage.ELEMENT__ID:
			return getId();
		case SourcePackage.ELEMENT__SPECIAL_ATTR:
			return getSpecialAttr();
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
		case SourcePackage.ELEMENT__ID:
			setId((String) newValue);
			return;
		case SourcePackage.ELEMENT__SPECIAL_ATTR:
			setSpecialAttr((String) newValue);
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
		case SourcePackage.ELEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case SourcePackage.ELEMENT__SPECIAL_ATTR:
			setSpecialAttr(SPECIAL_ATTR_EDEFAULT);
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
		case SourcePackage.ELEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SourcePackage.ELEMENT__SPECIAL_ATTR:
			return SPECIAL_ATTR_EDEFAULT == null ? specialAttr != null
					: !SPECIAL_ATTR_EDEFAULT.equals(specialAttr);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", specialAttr: ");
		result.append(specialAttr);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ElementImpl
