/**
 */
package org.xtext.rollercoaster.dsl.coaster.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.rollercoaster.dsl.coaster.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoasterFactoryImpl extends EFactoryImpl implements CoasterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CoasterFactory init()
  {
    try
    {
      CoasterFactory theCoasterFactory = (CoasterFactory)EPackage.Registry.INSTANCE.getEFactory(CoasterPackage.eNS_URI);
      if (theCoasterFactory != null)
      {
        return theCoasterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CoasterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoasterFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CoasterPackage.MODEL: return createModel();
      case CoasterPackage.ROLLER_COASTER: return createRollerCoaster();
      case CoasterPackage.TRACK: return createTrack();
      case CoasterPackage.CART: return createCart();
      case CoasterPackage.SIGNED_INT: return createSignedInt();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RollerCoaster createRollerCoaster()
  {
    RollerCoasterImpl rollerCoaster = new RollerCoasterImpl();
    return rollerCoaster;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Track createTrack()
  {
    TrackImpl track = new TrackImpl();
    return track;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cart createCart()
  {
    CartImpl cart = new CartImpl();
    return cart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignedInt createSignedInt()
  {
    SignedIntImpl signedInt = new SignedIntImpl();
    return signedInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoasterPackage getCoasterPackage()
  {
    return (CoasterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CoasterPackage getPackage()
  {
    return CoasterPackage.eINSTANCE;
  }

} //CoasterFactoryImpl
