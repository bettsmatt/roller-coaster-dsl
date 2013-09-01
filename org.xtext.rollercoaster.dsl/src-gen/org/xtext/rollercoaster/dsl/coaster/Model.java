/**
 */
package org.xtext.rollercoaster.dsl.coaster;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.rollercoaster.dsl.coaster.Model#getRollerCoaster <em>Roller Coaster</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Roller Coaster</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.rollercoaster.dsl.coaster.RollerCoaster}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roller Coaster</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roller Coaster</em>' containment reference list.
   * @see org.xtext.rollercoaster.dsl.coaster.CoasterPackage#getModel_RollerCoaster()
   * @model containment="true"
   * @generated
   */
  EList<RollerCoaster> getRollerCoaster();

} // Model
