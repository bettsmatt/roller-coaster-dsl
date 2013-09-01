package org.rollercoaster.utils;

import org.eclipse.emf.ecore.EObject;
import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.Corner;
import org.xtext.rollercoaster.dsl.coaster.Straight;

/**
 * Factory to pull description information about each object
 */
@SuppressWarnings("all")
public class Descriptions {
  /**
   * Takes in a modeling object and returns the long description
   */
  public static String getLong(final EObject object) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (object instanceof Straight) {
        final Straight _straight = (Straight)object;
        _matched=true;
        _switchResult = "A lovely straight piece of track";
      }
    }
    if (!_matched) {
      if (object instanceof Corner) {
        final Corner _corner = (Corner)object;
        _matched=true;
        _switchResult = "A curvey corner piece of track";
      }
    }
    if (!_matched) {
      if (object instanceof Cart) {
        final Cart _cart = (Cart)object;
        _matched=true;
        _switchResult = "A cart that goes on the track";
      }
    }
    if (!_matched) {
      _switchResult = "indescribable";
    }
    return _switchResult;
  }
  
  /**
   * Takes in a modeling object and returns the short description
   */
  public static String getShort(final EObject object) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (object instanceof Straight) {
        final Straight _straight = (Straight)object;
        _matched=true;
        _switchResult = "Straight Track";
      }
    }
    if (!_matched) {
      if (object instanceof Corner) {
        final Corner _corner = (Corner)object;
        _matched=true;
        _switchResult = "Corner Track";
      }
    }
    if (!_matched) {
      if (object instanceof Cart) {
        final Cart _cart = (Cart)object;
        _matched=true;
        _switchResult = "Cart";
      }
    }
    if (!_matched) {
      _switchResult = "Indescribable";
    }
    return _switchResult;
  }
}
