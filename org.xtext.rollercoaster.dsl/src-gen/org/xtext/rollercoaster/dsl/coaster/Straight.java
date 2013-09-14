/**
 */
package org.xtext.rollercoaster.dsl.coaster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Straight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Straight#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Straight#getPowered <em>Powered</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Straight#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Straight#getLength <em>Length</em>}</li>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Straight#getElevationChange <em>Elevation Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getStraight()
 * @model
 * @generated
 */
public interface Straight extends EObject
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
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getStraight_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Powered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Powered</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Powered</em>' attribute.
   * @see #setPowered(String)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getStraight_Powered()
   * @model
   * @generated
   */
  String getPowered();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getPowered <em>Powered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Powered</em>' attribute.
   * @see #getPowered()
   * @generated
   */
  void setPowered(String value);

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
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getStraight_Quality()
   * @model
   * @generated
   */
  String getQuality();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getQuality <em>Quality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quality</em>' attribute.
   * @see #getQuality()
   * @generated
   */
  void setQuality(String value);

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
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getStraight_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

  /**
   * Returns the value of the '<em><b>Elevation Change</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elevation Change</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elevation Change</em>' containment reference.
   * @see #setElevationChange(SignedInt)
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getStraight_ElevationChange()
   * @model containment="true"
   * @generated
   */
  SignedInt getElevationChange();

  /**
   * Sets the value of the '{@link org.xtext.rollercoaster.dsl.coaster.Straight#getElevationChange <em>Elevation Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elevation Change</em>' containment reference.
   * @see #getElevationChange()
   * @generated
   */
  void setElevationChange(SignedInt value);

} // Straight
