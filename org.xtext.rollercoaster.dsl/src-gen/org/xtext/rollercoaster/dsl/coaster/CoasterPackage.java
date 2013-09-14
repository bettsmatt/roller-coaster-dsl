/**
 */
package org.xtext.rollercoaster.dsl.coaster;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.rollercoaster.dsl.coaster.CoasterFactory
 * @model kind="package"
 * @generated
 */
public interface CoasterPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "coaster";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/rollercoaster/dsl/Coaster";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "coaster";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CoasterPackage eINSTANCE = org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.ModelImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Roller Coaster</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROLLER_COASTER = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl <em>Roller Coaster</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getRollerCoaster()
   * @generated
   */
  int ROLLER_COASTER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Base Quality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__BASE_QUALITY = 1;

  /**
   * The feature id for the '<em><b>Track</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__TRACK = 2;

  /**
   * The feature id for the '<em><b>Cart</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__CART = 3;

  /**
   * The feature id for the '<em><b>Ticket Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__TICKET_PRICE = 4;

  /**
   * The feature id for the '<em><b>Track Unit Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__TRACK_UNIT_LENGTH = 5;

  /**
   * The number of structural features of the '<em>Roller Coaster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl <em>Straight</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getStraight()
   * @generated
   */
  int STRAIGHT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRAIGHT__NAME = 0;

  /**
   * The feature id for the '<em><b>Powered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRAIGHT__POWERED = 1;

  /**
   * The feature id for the '<em><b>Quality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRAIGHT__QUALITY = 2;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRAIGHT__LENGTH = 3;

  /**
   * The feature id for the '<em><b>Elevation Change</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRAIGHT__ELEVATION_CHANGE = 4;

  /**
   * The number of structural features of the '<em>Straight</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRAIGHT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.CornerImpl <em>Corner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CornerImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getCorner()
   * @generated
   */
  int CORNER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__NAME = 0;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__DIRECTION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__TYPE = 2;

  /**
   * The feature id for the '<em><b>Quality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__QUALITY = 3;

  /**
   * The number of structural features of the '<em>Corner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.CartImpl <em>Cart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CartImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getCart()
   * @generated
   */
  int CART = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CART__NAME = 0;

  /**
   * The feature id for the '<em><b>Quality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CART__QUALITY = 1;

  /**
   * The feature id for the '<em><b>Seat Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CART__SEAT_NUMBER = 2;

  /**
   * The number of structural features of the '<em>Cart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CART_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.SignedIntImpl <em>Signed Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.SignedIntImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getSignedInt()
   * @generated
   */
  int SIGNED_INT = 5;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__SIGN = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Signed Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNED_INT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.rollercoaster.dsl.coaster.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rollercoaster.dsl.coaster.Model#getRollerCoaster <em>Roller Coaster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roller Coaster</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Model#getRollerCoaster()
   * @see #getModel()
   * @generated
   */
  EReference getModel_RollerCoaster();

  /**
   * Returns the meta object for class '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster <em>Roller Coaster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Roller Coaster</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.RollerCoaster
   * @generated
   */
  EClass getRollerCoaster();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getName()
   * @see #getRollerCoaster()
   * @generated
   */
  EAttribute getRollerCoaster_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getBaseQuality <em>Base Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Quality</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getBaseQuality()
   * @see #getRollerCoaster()
   * @generated
   */
  EAttribute getRollerCoaster_BaseQuality();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTrack <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Track</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTrack()
   * @see #getRollerCoaster()
   * @generated
   */
  EReference getRollerCoaster_Track();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getCart <em>Cart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cart</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getCart()
   * @see #getRollerCoaster()
   * @generated
   */
  EReference getRollerCoaster_Cart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTicketPrice <em>Ticket Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ticket Price</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTicketPrice()
   * @see #getRollerCoaster()
   * @generated
   */
  EAttribute getRollerCoaster_TicketPrice();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTrackUnitLength <em>Track Unit Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Track Unit Length</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTrackUnitLength()
   * @see #getRollerCoaster()
   * @generated
   */
  EAttribute getRollerCoaster_TrackUnitLength();

  /**
   * Returns the meta object for class '{@link org.xtext.rollercoaster.dsl.coaster.Straight <em>Straight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Straight</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Straight
   * @generated
   */
  EClass getStraight();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Straight#getName()
   * @see #getStraight()
   * @generated
   */
  EAttribute getStraight_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getPowered <em>Powered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Powered</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Straight#getPowered()
   * @see #getStraight()
   * @generated
   */
  EAttribute getStraight_Powered();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getQuality <em>Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quality</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Straight#getQuality()
   * @see #getStraight()
   * @generated
   */
  EAttribute getStraight_Quality();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Straight#getLength()
   * @see #getStraight()
   * @generated
   */
  EAttribute getStraight_Length();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getElevationChange <em>Elevation Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elevation Change</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Straight#getElevationChange()
   * @see #getStraight()
   * @generated
   */
  EReference getStraight_ElevationChange();

  /**
   * Returns the meta object for class '{@link org.xtext.rollercoaster.dsl.coaster.Corner <em>Corner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corner</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Corner
   * @generated
   */
  EClass getCorner();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Corner#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Corner#getName()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Corner#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Corner#getDirection()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Corner#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Corner#getType()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Corner#getQuality <em>Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quality</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Corner#getQuality()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Quality();

  /**
   * Returns the meta object for class '{@link org.xtext.rollercoaster.dsl.coaster.Cart <em>Cart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cart</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Cart
   * @generated
   */
  EClass getCart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Cart#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Cart#getName()
   * @see #getCart()
   * @generated
   */
  EAttribute getCart_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Cart#getQuality <em>Quality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quality</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Cart#getQuality()
   * @see #getCart()
   * @generated
   */
  EAttribute getCart_Quality();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Cart#getSeatNumber <em>Seat Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seat Number</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Cart#getSeatNumber()
   * @see #getCart()
   * @generated
   */
  EAttribute getCart_SeatNumber();

  /**
   * Returns the meta object for class '{@link org.xtext.rollercoaster.dsl.coaster.SignedInt <em>Signed Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signed Int</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.SignedInt
   * @generated
   */
  EClass getSignedInt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.SignedInt#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.SignedInt#getSign()
   * @see #getSignedInt()
   * @generated
   */
  EAttribute getSignedInt_Sign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.SignedInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.SignedInt#getValue()
   * @see #getSignedInt()
   * @generated
   */
  EAttribute getSignedInt_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CoasterFactory getCoasterFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rollercoaster.dsl.coaster.impl.ModelImpl
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Roller Coaster</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROLLER_COASTER = eINSTANCE.getModel_RollerCoaster();

    /**
     * The meta object literal for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl <em>Roller Coaster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rollercoaster.dsl.coaster.impl.RollerCoasterImpl
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getRollerCoaster()
     * @generated
     */
    EClass ROLLER_COASTER = eINSTANCE.getRollerCoaster();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLLER_COASTER__NAME = eINSTANCE.getRollerCoaster_Name();

    /**
     * The meta object literal for the '<em><b>Base Quality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLLER_COASTER__BASE_QUALITY = eINSTANCE.getRollerCoaster_BaseQuality();

    /**
     * The meta object literal for the '<em><b>Track</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLLER_COASTER__TRACK = eINSTANCE.getRollerCoaster_Track();

    /**
     * The meta object literal for the '<em><b>Cart</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLLER_COASTER__CART = eINSTANCE.getRollerCoaster_Cart();

    /**
     * The meta object literal for the '<em><b>Ticket Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLLER_COASTER__TICKET_PRICE = eINSTANCE.getRollerCoaster_TicketPrice();

    /**
     * The meta object literal for the '<em><b>Track Unit Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLLER_COASTER__TRACK_UNIT_LENGTH = eINSTANCE.getRollerCoaster_TrackUnitLength();

    /**
     * The meta object literal for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl <em>Straight</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rollercoaster.dsl.coaster.impl.StraightImpl
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getStraight()
     * @generated
     */
    EClass STRAIGHT = eINSTANCE.getStraight();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRAIGHT__NAME = eINSTANCE.getStraight_Name();

    /**
     * The meta object literal for the '<em><b>Powered</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRAIGHT__POWERED = eINSTANCE.getStraight_Powered();

    /**
     * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRAIGHT__QUALITY = eINSTANCE.getStraight_Quality();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRAIGHT__LENGTH = eINSTANCE.getStraight_Length();

    /**
     * The meta object literal for the '<em><b>Elevation Change</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRAIGHT__ELEVATION_CHANGE = eINSTANCE.getStraight_ElevationChange();

    /**
     * The meta object literal for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.CornerImpl <em>Corner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CornerImpl
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getCorner()
     * @generated
     */
    EClass CORNER = eINSTANCE.getCorner();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORNER__NAME = eINSTANCE.getCorner_Name();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORNER__DIRECTION = eINSTANCE.getCorner_Direction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORNER__TYPE = eINSTANCE.getCorner_Type();

    /**
     * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORNER__QUALITY = eINSTANCE.getCorner_Quality();

    /**
     * The meta object literal for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.CartImpl <em>Cart</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CartImpl
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getCart()
     * @generated
     */
    EClass CART = eINSTANCE.getCart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CART__NAME = eINSTANCE.getCart_Name();

    /**
     * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CART__QUALITY = eINSTANCE.getCart_Quality();

    /**
     * The meta object literal for the '<em><b>Seat Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CART__SEAT_NUMBER = eINSTANCE.getCart_SeatNumber();

    /**
     * The meta object literal for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.SignedIntImpl <em>Signed Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rollercoaster.dsl.coaster.impl.SignedIntImpl
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getSignedInt()
     * @generated
     */
    EClass SIGNED_INT = eINSTANCE.getSignedInt();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNED_INT__SIGN = eINSTANCE.getSignedInt_Sign();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNED_INT__VALUE = eINSTANCE.getSignedInt_Value();

  }

} //CoasterPackage
