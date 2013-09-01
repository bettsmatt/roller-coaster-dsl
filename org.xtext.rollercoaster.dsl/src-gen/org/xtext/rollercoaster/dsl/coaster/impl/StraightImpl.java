/**
 */
package org.xtext.rollercoaster.dsl.coaster.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.rollercoaster.dsl.coaster.CoasterPackage;
import org.xtext.rollercoaster.dsl.coaster.Straight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Straight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl#getName <em>Name</em>}</li>
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
   * The default value of the '{@link #getElevationChange() <em>Elevation Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElevationChange()
   * @generated
   * @ordered
   */
  protected static final int ELEVATION_CHANGE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getElevationChange() <em>Elevation Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElevationChange()
   * @generated
   * @ordered
   */
  protected int elevationChange = ELEVATION_CHANGE_EDEFAULT;

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
  public int getElevationChange()
  {
    return elevationChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElevationChange(int newElevationChange)
  {
    int oldElevationChange = elevationChange;
    elevationChange = newElevationChange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoasterPackage.STRAIGHT__ELEVATION_CHANGE, oldElevationChange, elevationChange));
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
      case CoasterPackage.STRAIGHT__LENGTH:
        setLength((Integer)newValue);
        return;
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        setElevationChange((Integer)newValue);
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
      case CoasterPackage.STRAIGHT__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        setElevationChange(ELEVATION_CHANGE_EDEFAULT);
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
      case CoasterPackage.STRAIGHT__LENGTH:
        return length != LENGTH_EDEFAULT;
      case CoasterPackage.STRAIGHT__ELEVATION_CHANGE:
        return elevationChange != ELEVATION_CHANGE_EDEFAULT;
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
    result.append(", length: ");
    result.append(length);
    result.append(", elevationChange: ");
    result.append(elevationChange);
    result.append(')');
    return result.toString();
  }

} //StraightImpl
