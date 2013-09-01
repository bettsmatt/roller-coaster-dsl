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
   * The feature id for the '<em><b>Track</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__TRACK = 1;

  /**
   * The feature id for the '<em><b>Cart</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER__CART = 2;

  /**
   * The number of structural features of the '<em>Roller Coaster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLLER_COASTER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.TrackImpl <em>Track</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.TrackImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getTrack()
   * @generated
   */
  int TRACK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__NAME = 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__LENGTH = 1;

  /**
   * The feature id for the '<em><b>Elevation Change</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__ELEVATION_CHANGE = 2;

  /**
   * The feature id for the '<em><b>Angle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK__ANGLE = 3;

  /**
   * The number of structural features of the '<em>Track</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRACK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.CartImpl <em>Cart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CartImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getCart()
   * @generated
   */
  int CART = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CART__NAME = 0;

  /**
   * The number of structural features of the '<em>Cart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.SignedIntImpl <em>Signed Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.rollercoaster.dsl.coaster.impl.SignedIntImpl
   * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getSignedInt()
   * @generated
   */
  int SIGNED_INT = 4;

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
   * Returns the meta object for class '{@link org.xtext.rollercoaster.dsl.coaster.Track <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Track</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Track
   * @generated
   */
  EClass getTrack();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Track#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Track#getName()
   * @see #getTrack()
   * @generated
   */
  EAttribute getTrack_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Track#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Track#getLength()
   * @see #getTrack()
   * @generated
   */
  EAttribute getTrack_Length();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.rollercoaster.dsl.coaster.Track#getElevationChange <em>Elevation Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Elevation Change</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Track#getElevationChange()
   * @see #getTrack()
   * @generated
   */
  EAttribute getTrack_ElevationChange();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.rollercoaster.dsl.coaster.Track#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Angle</em>'.
   * @see org.xtext.rollercoaster.dsl.coaster.Track#getAngle()
   * @see #getTrack()
   * @generated
   */
  EReference getTrack_Angle();

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
     * The meta object literal for the '{@link org.xtext.rollercoaster.dsl.coaster.impl.TrackImpl <em>Track</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.rollercoaster.dsl.coaster.impl.TrackImpl
     * @see org.xtext.rollercoaster.dsl.coaster.impl.CoasterPackageImpl#getTrack()
     * @generated
     */
    EClass TRACK = eINSTANCE.getTrack();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACK__NAME = eINSTANCE.getTrack_Name();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACK__LENGTH = eINSTANCE.getTrack_Length();

    /**
     * The meta object literal for the '<em><b>Elevation Change</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRACK__ELEVATION_CHANGE = eINSTANCE.getTrack_ElevationChange();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRACK__ANGLE = eINSTANCE.getTrack_Angle();

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
