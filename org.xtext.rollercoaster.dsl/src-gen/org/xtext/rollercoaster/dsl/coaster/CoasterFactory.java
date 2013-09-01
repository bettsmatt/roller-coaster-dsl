/**
 */
package org.xtext.rollercoaster.dsl.coaster;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage
 * @generated
 */
public interface CoasterFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CoasterFactory eINSTANCE = org.xtext.rollercoaster.dsl.coaster.impl.CoasterFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Roller Coaster</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Roller Coaster</em>'.
   * @generated
   */
  RollerCoaster createRollerCoaster();

  /**
   * Returns a new object of class '<em>Straight</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Straight</em>'.
   * @generated
   */
  Straight createStraight();

  /**
   * Returns a new object of class '<em>Corner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Corner</em>'.
   * @generated
   */
  Corner createCorner();

  /**
   * Returns a new object of class '<em>Cart</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cart</em>'.
   * @generated
   */
  Cart createCart();

  /**
   * Returns a new object of class '<em>Signed Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signed Int</em>'.
   * @generated
   */
  SignedInt createSignedInt();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CoasterPackage getCoasterPackage();

} //CoasterFactory
