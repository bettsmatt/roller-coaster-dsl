/**
 */
package org.xtext.rollercoaster.dsl.coaster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Track#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Track#getLength <em>Length</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Track#getElevationChange <em>Elevation Change</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Track#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends EObject
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
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getTrack_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Track#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getTrack_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Track#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

  /**
   * Returns the value of the '<em><b>Elevation Change</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elevation Change</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elevation Change</em>' attribute.
   * @see #setElevationChange(int)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getTrack_ElevationChange()
   * @model
   * @generated
   */
  int getElevationChange();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Track#getElevationChange <em>Elevation Change</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elevation Change</em>' attribute.
   * @see #getElevationChange()
   * @generated
   */
  void setElevationChange(int value);

  /**
   * Returns the value of the '<em><b>Angle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle</em>' containment reference.
   * @see #setAngle(SignedInt)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getTrack_Angle()
   * @model containment="true"
   * @generated
   */
  SignedInt getAngle();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Track#getAngle <em>Angle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle</em>' containment reference.
   * @see #getAngle()
   * @generated
   */
  void setAngle(SignedInt value);

} // Track
