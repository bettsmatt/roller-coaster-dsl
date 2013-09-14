/**
 */
package org.xtext.rollercoaster.dsl.coaster.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.CoasterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.CartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.CartImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.CartImpl#getSeatNumber <em>Seat Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CartImpl extends MinimalEObjectImpl.Container implements Cart
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuality()
   * @generated
   * @ordered
   */
  protected static final String QUALITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuality()
   * @generated
   * @ordered
   */
  protected String quality = QUALITY_EDEFAULT;

  /**
   * The default value of the '{@link #getSeatNumber() <em>Seat Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeatNumber()
   * @generated
   * @ordered
   */
  protected static final int SEAT_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSeatNumber() <em>Seat Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeatNumber()
   * @generated
   * @ordered
   */
  protected int seatNumber = SEAT_NUMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CartImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CoasterPackage.Literals.CART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.CART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuality()
  {
    return quality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuality(String newQuality)
  {
    String oldQuality = quality;
    quality = newQuality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.CART__QUALITY, oldQuality, quality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSeatNumber()
  {
    return seatNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeatNumber(int newSeatNumber)
  {
    int oldSeatNumber = seatNumber;
    seatNumber = newSeatNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.CART__SEAT_NUMBER, oldSeatNumber, seatNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CoasterPackage.CART__NAME:
        return getName();
      case CoasterPackage.CART__QUALITY:
        return getQuality();
      case CoasterPackage.CART__SEAT_NUMBER:
        return getSeatNumber();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoasterPackage.CART__NAME:
        setName((String)newValue);
        return;
      case CoasterPackage.CART__QUALITY:
        setQuality((String)newValue);
        return;
      case CoasterPackage.CART__SEAT_NUMBER:
        setSeatNumber((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CoasterPackage.CART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CoasterPackage.CART__QUALITY:
        setQuality(QUALITY_EDEFAULT);
        return;
      case CoasterPackage.CART__SEAT_NUMBER:
        setSeatNumber(SEAT_NUMBER_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CoasterPackage.CART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CoasterPackage.CART__QUALITY:
        return QUALITY_EDEFAULT == null ? quality != null : !QUALITY_EDEFAULT.equals(quality);
      case CoasterPackage.CART__SEAT_NUMBER:
        return seatNumber != SEAT_NUMBER_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", quality: ");
    result.append(quality);
    result.append(", seatNumber: ");
    result.append(seatNumber);
    result.append(')');
    return result.toString();
  }

} //CartImpl
