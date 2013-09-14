/**
 */
package org.xtext.rollercoaster.dsl.coaster;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roller Coaster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getBaseQuality <em>Base Quality</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTrack <em>Track</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getCart <em>Cart</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTicketPrice <em>Ticket Price</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTrackUnitLength <em>Track Unit Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getRollerCoaster()
 * @model
 * @generated
 */
public interface RollerCoaster extends EObject
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
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getRollerCoaster_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base Quality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Quality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Quality</em>' attribute.
   * @see #setBaseQuality(String)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getRollerCoaster_BaseQuality()
   * @model
   * @generated
   */
  String getBaseQuality();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getBaseQuality <em>Base Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Quality</em>' attribute.
   * @see #getBaseQuality()
   * @generated
   */
  void setBaseQuality(String value);

  /**
   * Returns the value of the '<em><b>Track</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Track</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Track</em>' containment reference list.
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getRollerCoaster_Track()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getTrack();

  /**
   * Returns the value of the '<em><b>Cart</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rollercoaster.dsl.coaster.Cart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cart</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cart</em>' containment reference list.
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getRollerCoaster_Cart()
   * @model containment="true"
   * @generated
   */
  EList<Cart> getCart();

  /**
   * Returns the value of the '<em><b>Ticket Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ticket Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ticket Price</em>' attribute.
   * @see #setTicketPrice(int)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getRollerCoaster_TicketPrice()
   * @model
   * @generated
   */
  int getTicketPrice();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTicketPrice <em>Ticket Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ticket Price</em>' attribute.
   * @see #getTicketPrice()
   * @generated
   */
  void setTicketPrice(int value);

  /**
   * Returns the value of the '<em><b>Track Unit Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Track Unit Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Track Unit Length</em>' attribute.
   * @see #setTrackUnitLength(int)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getRollerCoaster_TrackUnitLength()
   * @model
   * @generated
   */
  int getTrackUnitLength();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster#getTrackUnitLength <em>Track Unit Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Track Unit Length</em>' attribute.
   * @see #getTrackUnitLength()
   * @generated
   */
  void setTrackUnitLength(int value);

} // RollerCoaster
