/**
 */
package org.xtext.rollercoaster.dsl.coaster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Cart#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Cart#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Cart#getSeatNumber <em>Seat Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getCart()
 * @model
 * @generated
 */
public interface Cart extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getCart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Cart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Quality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quality</em>' attribute.
   * @see #setQuality(String)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getCart_Quality()
   * @model
   * @generated
   */
  String getQuality();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Cart#getQuality <em>Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quality</em>' attribute.
   * @see #getQuality()
   * @generated
   */
  void setQuality(String value);

  /**
   * Returns the value of the '<em><b>Seat Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seat Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seat Number</em>' attribute.
   * @see #setSeatNumber(int)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getCart_SeatNumber()
   * @model
   * @generated
   */
  int getSeatNumber();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Cart#getSeatNumber <em>Seat Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seat Number</em>' attribute.
   * @see #getSeatNumber()
   * @generated
   */
  void setSeatNumber(int value);

} // Cart
