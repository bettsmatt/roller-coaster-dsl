/**
 */
package org.xtext.rollercoaster.dsl.coaster.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rollercoaster.dsl.coaster.CoasterPackage;
import org.xtext.rollercoaster.dsl.coaster.SignedInt;
import org.xtext.rollercoaster.dsl.coaster.Straight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Straight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl#getPowered <em>Powered</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl#getElevationChange <em>Elevation Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StraightImpl extends MinimalEObjectImpl.Container implements Straight
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
   * The default value of the '{@link #getPowered() <em>Powered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowered()
   * @generated
   * @ordered
   */
  protected static final String POWERED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPowered() <em>Powered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPowered()
   * @generated
   * @ordered
   */
  protected String powered = POWERED_EDEFAULT;

  /**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected static final int LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected int length = LENGTH_EDEFAULT;

  /**
   * The cached value of the '{@link #getElevationChange() <em>Elevation Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElevationChange()
   * @generated
   * @ordered
   */
  protected SignedInt elevationChange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StraightImpl()
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
    return CoasterPackage.Literals.STRAIGHT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.STRAIGHT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPowered()
  {
    return powered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPowered(String newPowered)
  {
    String oldPowered = powered;
    powered = newPowered;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.STRAIGHT__POWERED, oldPowered, powered));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(int newLength)
  {
    int oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.STRAIGHT__LENGTH, oldLength, length));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignedInt getElevationChange()
  {
    return elevationChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElevationChange(SignedInt newElevationChange, NotificationChain msgs)
  {
    SignedInt oldElevationChange = elevationChange;
    elevationChange = newElevationChange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoasterPackage.STRAIGHT__ELEVATION_CHANGE, oldElevationChange, newElevationChange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElevationChange(SignedInt newElevationChange)
  {
    if (newElevationChange != elevationChange)
    {
      NotificationChain msgs = null;
      if (elevationChange != null)
        msgs = ((InternalEObject)elevationChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoasterPackage.STRAIGHT__ELEVATION_CHANGE, null, msgs);
      if (newElevationChange != null)
        msgs = ((InternalEObject)newElevationChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoasterPackage.STRAIGHT__ELEVATION_CHANGE, null, msgs);
      msgs = basicSetElevationChange(newElevationChange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.STRAIGHT__ELEVATION_CHANGE, newElevationChange, newElevationChange));
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
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        return basicSetElevationChange(null, msgs);
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
      case CoasterPackage.STRAIGHT__NAME:
        return getName();
      case CoasterPackage.STRAIGHT__POWERED:
        return getPowered();
      case CoasterPackage.STRAIGHT__LENGTH:
        return getLength();
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        return getElevationChange();
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
      case CoasterPackage.STRAIGHT__NAME:
        setName((String)newValue);
        return;
      case CoasterPackage.STRAIGHT__POWERED:
        setPowered((String)newValue);
        return;
      case CoasterPackage.STRAIGHT__LENGTH:
        setLength((Integer)newValue);
        return;
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        setElevationChange((SignedInt)newValue);
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
      case CoasterPackage.STRAIGHT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CoasterPackage.STRAIGHT__POWERED:
        setPowered(POWERED_EDEFAULT);
        return;
      case CoasterPackage.STRAIGHT__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        setElevationChange((SignedInt)null);
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
      case CoasterPackage.STRAIGHT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CoasterPackage.STRAIGHT__POWERED:
        return POWERED_EDEFAULT == null ? powered != null : !POWERED_EDEFAULT.equals(powered);
      case CoasterPackage.STRAIGHT__LENGTH:
        return length != LENGTH_EDEFAULT;
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        return elevationChange != null;
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
    result.append(", powered: ");
    result.append(powered);
    result.append(", length: ");
    result.append(length);
    result.append(')');
    return result.toString();
  }

} //StraightImpl
