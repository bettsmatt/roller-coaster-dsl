/**
 */
package org.xtext.rollercoaster.dsl.coaster.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.CoasterPackage;
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roller Coaster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl#getBaseQuality <em>Base Quality</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl#getCart <em>Cart</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl#getTicketPrice <em>Ticket Price</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl#getTrackUnitLength <em>Track Unit Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RollerCoasterImpl extends MinimalEObjectImpl.Container implements RollerCoaster
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
   * The default value of the '{@link #getBaseQuality() <em>Base Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseQuality()
   * @generated
   * @ordered
   */
  protected static final String BASE_QUALITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseQuality() <em>Base Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseQuality()
   * @generated
   * @ordered
   */
  protected String baseQuality = BASE_QUALITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTrack() <em>Track</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrack()
   * @generated
   * @ordered
   */
  protected EList<EObject> track;

  /**
   * The cached value of the '{@link #getCart() <em>Cart</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCart()
   * @generated
   * @ordered
   */
  protected EList<Cart> cart;

  /**
   * The default value of the '{@link #getTicketPrice() <em>Ticket Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTicketPrice()
   * @generated
   * @ordered
   */
  protected static final int TICKET_PRICE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTicketPrice() <em>Ticket Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTicketPrice()
   * @generated
   * @ordered
   */
  protected int ticketPrice = TICKET_PRICE_EDEFAULT;

  /**
   * The default value of the '{@link #getTrackUnitLength() <em>Track Unit Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrackUnitLength()
   * @generated
   * @ordered
   */
  protected static final int TRACK_UNIT_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTrackUnitLength() <em>Track Unit Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrackUnitLength()
   * @generated
   * @ordered
   */
  protected int trackUnitLength = TRACK_UNIT_LENGTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RollerCoasterImpl()
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
    return CoasterPackage.Literals.ROLLER_COASTER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.ROLLER_COASTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseQuality()
  {
    return baseQuality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseQuality(String newBaseQuality)
  {
    String oldBaseQuality = baseQuality;
    baseQuality = newBaseQuality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.ROLLER_COASTER__BASE_QUALITY, oldBaseQuality, baseQuality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getTrack()
  {
    if (track == null)
    {
      track = new EObjectContainmentEList<EObject>(EObject.class, this, CoasterPackage.ROLLER_COASTER__TRACK);
    }
    return track;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Cart> getCart()
  {
    if (cart == null)
    {
      cart = new EObjectContainmentEList<Cart>(Cart.class, this, CoasterPackage.ROLLER_COASTER__CART);
    }
    return cart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTicketPrice()
  {
    return ticketPrice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTicketPrice(int newTicketPrice)
  {
    int oldTicketPrice = ticketPrice;
    ticketPrice = newTicketPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.ROLLER_COASTER__TICKET_PRICE, oldTicketPrice, ticketPrice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTrackUnitLength()
  {
    return trackUnitLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrackUnitLength(int newTrackUnitLength)
  {
    int oldTrackUnitLength = trackUnitLength;
    trackUnitLength = newTrackUnitLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.ROLLER_COASTER__TRACK_UNIT_LENGTH, oldTrackUnitLength, trackUnitLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CoasterPackage.ROLLER_COASTER__TRACK:
        return ((InternalEList<?>)getTrack()).basicRemove(otherEnd, msgs);
      case CoasterPackage.ROLLER_COASTER__CART:
        return ((InternalEList<?>)getCart()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CoasterPackage.ROLLER_COASTER__NAME:
        return getName();
      case CoasterPackage.ROLLER_COASTER__BASE_QUALITY:
        return getBaseQuality();
      case CoasterPackage.ROLLER_COASTER__TRACK:
        return getTrack();
      case CoasterPackage.ROLLER_COASTER__CART:
        return getCart();
      case CoasterPackage.ROLLER_COASTER__TICKET_PRICE:
        return getTicketPrice();
      case CoasterPackage.ROLLER_COASTER__TRACK_UNIT_LENGTH:
        return getTrackUnitLength();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoasterPackage.ROLLER_COASTER__NAME:
        setName((String)newValue);
        return;
      case CoasterPackage.ROLLER_COASTER__BASE_QUALITY:
        setBaseQuality((String)newValue);
        return;
      case CoasterPackage.ROLLER_COASTER__TRACK:
        getTrack().clear();
        getTrack().addAll((Collection<? extends EObject>)newValue);
        return;
      case CoasterPackage.ROLLER_COASTER__CART:
        getCart().clear();
        getCart().addAll((Collection<? extends Cart>)newValue);
        return;
      case CoasterPackage.ROLLER_COASTER__TICKET_PRICE:
        setTicketPrice((Integer)newValue);
        return;
      case CoasterPackage.ROLLER_COASTER__TRACK_UNIT_LENGTH:
        setTrackUnitLength((Integer)newValue);
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
      case CoasterPackage.ROLLER_COASTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CoasterPackage.ROLLER_COASTER__BASE_QUALITY:
        setBaseQuality(BASE_QUALITY_EDEFAULT);
        return;
      case CoasterPackage.ROLLER_COASTER__TRACK:
        getTrack().clear();
        return;
      case CoasterPackage.ROLLER_COASTER__CART:
        getCart().clear();
        return;
      case CoasterPackage.ROLLER_COASTER__TICKET_PRICE:
        setTicketPrice(TICKET_PRICE_EDEFAULT);
        return;
      case CoasterPackage.ROLLER_COASTER__TRACK_UNIT_LENGTH:
        setTrackUnitLength(TRACK_UNIT_LENGTH_EDEFAULT);
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
      case CoasterPackage.ROLLER_COASTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CoasterPackage.ROLLER_COASTER__BASE_QUALITY:
        return BASE_QUALITY_EDEFAULT == null ? baseQuality != null : !BASE_QUALITY_EDEFAULT.equals(baseQuality);
      case CoasterPackage.ROLLER_COASTER__TRACK:
        return track != null && !track.isEmpty();
      case CoasterPackage.ROLLER_COASTER__CART:
        return cart != null && !cart.isEmpty();
      case CoasterPackage.ROLLER_COASTER__TICKET_PRICE:
        return ticketPrice != TICKET_PRICE_EDEFAULT;
      case CoasterPackage.ROLLER_COASTER__TRACK_UNIT_LENGTH:
        return trackUnitLength != TRACK_UNIT_LENGTH_EDEFAULT;
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
    result.append(", baseQuality: ");
    result.append(baseQuality);
    result.append(", ticketPrice: ");
    result.append(ticketPrice);
    result.append(", trackUnitLength: ");
    result.append(trackUnitLength);
    result.append(')');
    return result.toString();
  }

} //RollerCoasterImpl
