/**
 */
package org.xtext.rollercoaster.dsl.coaster.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.CoasterFactory;
import org.xtext.rollercoaster.dsl.coaster.CoasterPackage;
import org.xtext.rollercoaster.dsl.coaster.Corner;
import org.xtext.rollercoaster.dsl.coaster.Model;
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster;
import org.xtext.rollercoaster.dsl.coaster.SignedInt;
import org.xtext.rollercoaster.dsl.coaster.Straight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoasterPackageImpl extends EPackageImpl implements CoasterPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rollerCoasterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass straightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cornerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signedIntEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CoasterPackageImpl()
  {
    super(eNS_URI, CoasterFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CoasterPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CoasterPackage init()
  {
    if (isInited) return (CoasterPackage)EPackage.Registry.INSTANCE.getEPackage(CoasterPackage.eNS_URI);

    // Obtain or create and register package
    CoasterPackageImpl theCoasterPackage = (CoasterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoasterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoasterPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCoasterPackage.createPackageContents();

    // Initialize created meta-data
    theCoasterPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCoasterPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CoasterPackage.eNS_URI, theCoasterPackage);
    return theCoasterPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_RollerCoaster()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRollerCoaster()
  {
    return rollerCoasterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRollerCoaster_Name()
  {
    return (EAttribute)rollerCoasterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRollerCoaster_BaseQuality()
  {
    return (EAttribute)rollerCoasterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRollerCoaster_Track()
  {
    return (EReference)rollerCoasterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRollerCoaster_Cart()
  {
    return (EReference)rollerCoasterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRollerCoaster_TicketPrice()
  {
    return (EAttribute)rollerCoasterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRollerCoaster_TrackUnitLength()
  {
    return (EAttribute)rollerCoasterEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStraight()
  {
    return straightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStraight_Name()
  {
    return (EAttribute)straightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStraight_Powered()
  {
    return (EAttribute)straightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStraight_Quality()
  {
    return (EAttribute)straightEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStraight_Length()
  {
    return (EAttribute)straightEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStraight_ElevationChange()
  {
    return (EReference)straightEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCorner()
  {
    return cornerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorner_Name()
  {
    return (EAttribute)cornerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorner_Direction()
  {
    return (EAttribute)cornerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorner_Type()
  {
    return (EAttribute)cornerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorner_Quality()
  {
    return (EAttribute)cornerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCart()
  {
    return cartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCart_Name()
  {
    return (EAttribute)cartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCart_Quality()
  {
    return (EAttribute)cartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCart_SeatNumber()
  {
    return (EAttribute)cartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignedInt()
  {
    return signedIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignedInt_Sign()
  {
    return (EAttribute)signedIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignedInt_Value()
  {
    return (EAttribute)signedIntEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoasterFactory getCoasterFactory()
  {
    return (CoasterFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ROLLER_COASTER);

    rollerCoasterEClass = createEClass(ROLLER_COASTER);
    createEAttribute(rollerCoasterEClass, ROLLER_COASTER__NAME);
    createEAttribute(rollerCoasterEClass, ROLLER_COASTER__BASE_QUALITY);
    createEReference(rollerCoasterEClass, ROLLER_COASTER__TRACK);
    createEReference(rollerCoasterEClass, ROLLER_COASTER__CART);
    createEAttribute(rollerCoasterEClass, ROLLER_COASTER__TICKET_PRICE);
    createEAttribute(rollerCoasterEClass, ROLLER_COASTER__TRACK_UNIT_LENGTH);

    straightEClass = createEClass(STRAIGHT);
    createEAttribute(straightEClass, STRAIGHT__NAME);
    createEAttribute(straightEClass, STRAIGHT__POWERED);
    createEAttribute(straightEClass, STRAIGHT__QUALITY);
    createEAttribute(straightEClass, STRAIGHT__LENGTH);
    createEReference(straightEClass, STRAIGHT__ELEVATION_CHANGE);

    cornerEClass = createEClass(CORNER);
    createEAttribute(cornerEClass, CORNER__NAME);
    createEAttribute(cornerEClass, CORNER__DIRECTION);
    createEAttribute(cornerEClass, CORNER__TYPE);
    createEAttribute(cornerEClass, CORNER__QUALITY);

    cartEClass = createEClass(CART);
    createEAttribute(cartEClass, CART__NAME);
    createEAttribute(cartEClass, CART__QUALITY);
    createEAttribute(cartEClass, CART__SEAT_NUMBER);

    signedIntEClass = createEClass(SIGNED_INT);
    createEAttribute(signedIntEClass, SIGNED_INT__SIGN);
    createEAttribute(signedIntEClass, SIGNED_INT__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_RollerCoaster(), this.getRollerCoaster(), null, "rollerCoaster", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rollerCoasterEClass, RollerCoaster.class, "RollerCoaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRollerCoaster_Name(), ecorePackage.getEString(), "name", null, 0, 1, RollerCoaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRollerCoaster_BaseQuality(), ecorePackage.getEString(), "baseQuality", null, 0, 1, RollerCoaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRollerCoaster_Track(), ecorePackage.getEObject(), null, "track", null, 0, -1, RollerCoaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRollerCoaster_Cart(), this.getCart(), null, "cart", null, 0, -1, RollerCoaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRollerCoaster_TicketPrice(), ecorePackage.getEInt(), "ticketPrice", null, 0, 1, RollerCoaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRollerCoaster_TrackUnitLength(), ecorePackage.getEInt(), "trackUnitLength", null, 0, 1, RollerCoaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(straightEClass, Straight.class, "Straight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStraight_Name(), ecorePackage.getEString(), "name", null, 0, 1, Straight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStraight_Powered(), ecorePackage.getEString(), "powered", null, 0, 1, Straight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStraight_Quality(), ecorePackage.getEString(), "quality", null, 0, 1, Straight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStraight_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Straight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStraight_ElevationChange(), this.getSignedInt(), null, "elevationChange", null, 0, 1, Straight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cornerEClass, Corner.class, "Corner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCorner_Name(), ecorePackage.getEString(), "name", null, 0, 1, Corner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCorner_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, Corner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCorner_Type(), ecorePackage.getEString(), "type", null, 0, 1, Corner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCorner_Quality(), ecorePackage.getEString(), "quality", null, 0, 1, Corner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cartEClass, Cart.class, "Cart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCart_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCart_Quality(), ecorePackage.getEString(), "quality", null, 0, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCart_SeatNumber(), ecorePackage.getEInt(), "seatNumber", null, 0, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signedIntEClass, SignedInt.class, "SignedInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignedInt_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, SignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignedInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CoasterPackageImpl
