package org.rollercoaster.utils;

import org.eclipse.emf.ecore.EObject;
import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.Corner;
import org.xtext.rollercoaster.dsl.coaster.Straight;

/**
 * Factory to pull cost information about each object
 */
@SuppressWarnings("all")
public class Costs {
  /**
   * Takes in a modeling object and returns the cost information
   */
  public static double get(final EObject object) {
    double _switchResult = (double) 0;
    boolean _matched = false;
    if (!_matched) {
      if (object instanceof Straight) {
        final Straight _straight = (Straight)object;
        _matched=true;
        _switchResult = 20.0;
      }
    }
    if (!_matched) {
      if (object instanceof Corner) {
        final Corner _corner = (Corner)object;
        _matched=true;
        _switchResult = 10.0;
      }
    }
    if (!_matched) {
      if (object instanceof Cart) {
        final Cart _cart = (Cart)object;
        _matched=true;
        _switchResult = 5.0;
      }
    }
    if (!_matched) {
      _switchResult = 0.0;
    }
    return _switchResult;
  }
}
