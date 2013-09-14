package org.rollercoaster.utils;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.Corner;
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster;
import org.xtext.rollercoaster.dsl.coaster.SignedInt;
import org.xtext.rollercoaster.dsl.coaster.Straight;

/**
 * Find out some interesting facts about the roller coaster
 * Used for common statistics needed for validation and generating reports.
 */
@SuppressWarnings("all")
public class RollerCoasterInfo {
  /**
   * Weight of roller coaster carts
   */
  public static int getTotalWeight(final RollerCoaster rc) {
    int totalWeight = 0;
    EList<Cart> _cart = rc.getCart();
    for (final Cart c : _cart) {
      int _seatNumber = c.getSeatNumber();
      int _multiply = (_seatNumber * 120);
      int _plus = (totalWeight + _multiply);
      int _plus_1 = (_plus + 250);
      totalWeight = _plus_1;
    }
    return totalWeight;
  }
  
  public static Integer getQuality(final RollerCoaster rc, final Object trackPiece) {
    Integer _xblockexpression = null;
    {
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (trackPiece instanceof Straight) {
          final Straight _straight = (Straight)trackPiece;
          _matched=true;
          String _quality = _straight.getQuality();
          _switchResult = _quality;
        }
      }
      if (!_matched) {
        if (trackPiece instanceof Corner) {
          final Corner _corner = (Corner)trackPiece;
          _matched=true;
          String _quality = _corner.getQuality();
          _switchResult = _quality;
        }
      }
      if (!_matched) {
        if (trackPiece instanceof Cart) {
          final Cart _cart = (Cart)trackPiece;
          _matched=true;
          String _quality = _cart.getQuality();
          _switchResult = _quality;
        }
      }
      final String qual = _switchResult;
      Integer _switchResult_1 = null;
      boolean _matched_1 = false;
      if (!_matched_1) {
        if (qual instanceof String) {
          final String _string = (String)qual;
          if (Objects.equal(qual,"wood")) {
            _matched_1=true;
            _switchResult_1 = Integer.valueOf(1);
          }
        }
      }
      if (!_matched_1) {
        if (qual instanceof String) {
          final String _string = (String)qual;
          if (Objects.equal(qual,"iron")) {
            _matched_1=true;
            _switchResult_1 = Integer.valueOf(2);
          }
        }
      }
      if (!_matched_1) {
        if (qual instanceof String) {
          final String _string = (String)qual;
          if (Objects.equal(qual,"steel")) {
            _matched_1=true;
            _switchResult_1 = Integer.valueOf(3);
          }
        }
      }
      if (!_matched_1) {
        Integer _switchResult_2 = null;
        String _baseQuality = rc.getBaseQuality();
        final String _switchValue = _baseQuality;
        boolean _matched_2 = false;
        if (!_matched_2) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"wood")) {
              _matched_2=true;
              _switchResult_2 = Integer.valueOf(1);
            }
          }
        }
        if (!_matched_2) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"iron")) {
              _matched_2=true;
              _switchResult_2 = Integer.valueOf(2);
            }
          }
        }
        if (!_matched_2) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"steel")) {
              _matched_2=true;
              _switchResult_2 = Integer.valueOf(3);
            }
          }
        }
        _switchResult_1 = _switchResult_2;
      }
      _xblockexpression = (_switchResult_1);
    }
    return _xblockexpression;
  }
  
  public static Integer getCornerGRaiting(final Corner c) {
    Integer _switchResult = null;
    String _type = c.getType();
    final String _switchValue = _type;
    boolean _matched = false;
    if (!_matched) {
      if (_switchValue instanceof String) {
        final String _string = (String)_switchValue;
        if (Objects.equal(_switchValue,"easy90")) {
          _matched=true;
          _switchResult = Integer.valueOf(2);
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof String) {
        final String _string = (String)_switchValue;
        if (Objects.equal(_switchValue,"easy45")) {
          _matched=true;
          _switchResult = Integer.valueOf(1);
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof String) {
        final String _string = (String)_switchValue;
        if (Objects.equal(_switchValue,"sharp90")) {
          _matched=true;
          _switchResult = Integer.valueOf(4);
        }
      }
    }
    if (!_matched) {
      if (_switchValue instanceof String) {
        final String _string = (String)_switchValue;
        if (Objects.equal(_switchValue,"sharp45")) {
          _matched=true;
          _switchResult = Integer.valueOf(3);
        }
      }
    }
    return _switchResult;
  }
  
  public static int getCornerGForce(final RollerCoaster rc, final int currentSpeed, final Corner corner) {
    int _xblockexpression = (int) 0;
    {
      Integer _quality = RollerCoasterInfo.getQuality(rc, corner);
      Integer _quality_1 = RollerCoasterInfo.getQuality(rc, corner);
      final int qualityFactor = ((_quality).intValue() + (_quality_1).intValue());
      final Integer cornerType = RollerCoasterInfo.getCornerGRaiting(corner);
      int _divide = (currentSpeed / qualityFactor);
      int _multiply = (_divide * (cornerType).intValue());
      _xblockexpression = (_multiply);
    }
    return _xblockexpression;
  }
  
  public static int getMaxGForce(final RollerCoaster rc) {
    int speed = 0;
    int maxGForce = 0;
    EList<EObject> _track = rc.getTrack();
    for (final Object s : _track) {
      boolean _matched = false;
      if (!_matched) {
        if (s instanceof Straight) {
          final Straight _straight = (Straight)s;
          _matched=true;
          final Integer quality = RollerCoasterInfo.getQuality(rc, _straight);
          String _powered = _straight.getPowered();
          boolean _notEquals = (!Objects.equal(_powered, null));
          if (_notEquals) {
            int _totalWeight = RollerCoasterInfo.getTotalWeight(rc);
            int _multiply = ((quality).intValue() * 100);
            int temp = (_totalWeight / _multiply);
            int _length = _straight.getLength();
            int _multiply_1 = (_length * (quality).intValue());
            int _divide = (_multiply_1 / temp);
            int _plus = (speed + _divide);
            speed = _plus;
          }
          SignedInt _elevationChange = _straight.getElevationChange();
          boolean _notEquals_1 = (!Objects.equal(_elevationChange, null));
          if (_notEquals_1) {
            SignedInt _elevationChange_1 = _straight.getElevationChange();
            int _value = _elevationChange_1.getValue();
            int change = (_value / 2);
            SignedInt _elevationChange_2 = _straight.getElevationChange();
            String _sign = _elevationChange_2.getSign();
            boolean _notEquals_2 = (!Objects.equal(_sign, null));
            if (_notEquals_2) {
              int _length_1 = _straight.getLength();
              int _multiply_2 = (change * _length_1);
              int _multiply_3 = (_multiply_2 * (quality).intValue());
              int _plus_1 = (speed + _multiply_3);
              speed = _plus_1;
            } else {
              int _minus = (-1);
              int _multiply_4 = (change * _minus);
              change = _multiply_4;
              int _totalWeight_1 = RollerCoasterInfo.getTotalWeight(rc);
              int _multiply_5 = ((quality).intValue() * 1000);
              int temp_1 = (_totalWeight_1 / _multiply_5);
              int _length_2 = _straight.getLength();
              int _multiply_6 = (change * _length_2);
              int _divide_1 = (_multiply_6 / (quality).intValue());
              int _plus_2 = (speed + _divide_1);
              int _minus_1 = (_plus_2 - temp_1);
              speed = _minus_1;
            }
          } else {
            int _length_3 = _straight.getLength();
            int _multiply_7 = ((quality).intValue() * 10);
            int _divide_2 = (_length_3 / _multiply_7);
            int _minus_2 = (speed - _divide_2);
            speed = _minus_2;
          }
        }
      }
      if (!_matched) {
        if (s instanceof Corner) {
          final Corner _corner = (Corner)s;
          _matched=true;
          final int gForce = RollerCoasterInfo.getCornerGForce(rc, speed, _corner);
          boolean _greaterThan = (gForce > maxGForce);
          if (_greaterThan) {
            maxGForce = gForce;
          }
        }
      }
    }
    return maxGForce;
  }
  
  public static int getMaxSpeed(final RollerCoaster rc) {
    int speed = 0;
    int maxSpeed = 0;
    EList<EObject> _track = rc.getTrack();
    for (final Object s : _track) {
      boolean _matched = false;
      if (!_matched) {
        if (s instanceof Straight) {
          final Straight _straight = (Straight)s;
          _matched=true;
          final Integer quality = RollerCoasterInfo.getQuality(rc, _straight);
          String _powered = _straight.getPowered();
          boolean _notEquals = (!Objects.equal(_powered, null));
          if (_notEquals) {
            int _totalWeight = RollerCoasterInfo.getTotalWeight(rc);
            int _multiply = ((quality).intValue() * 100);
            int temp = (_totalWeight / _multiply);
            int _length = _straight.getLength();
            int _multiply_1 = (_length * (quality).intValue());
            int _divide = (_multiply_1 / temp);
            int _plus = (speed + _divide);
            speed = _plus;
          }
          SignedInt _elevationChange = _straight.getElevationChange();
          boolean _notEquals_1 = (!Objects.equal(_elevationChange, null));
          if (_notEquals_1) {
            SignedInt _elevationChange_1 = _straight.getElevationChange();
            int _value = _elevationChange_1.getValue();
            int change = (_value / 2);
            SignedInt _elevationChange_2 = _straight.getElevationChange();
            String _sign = _elevationChange_2.getSign();
            boolean _notEquals_2 = (!Objects.equal(_sign, null));
            if (_notEquals_2) {
              int _length_1 = _straight.getLength();
              int _multiply_2 = (change * _length_1);
              int _multiply_3 = (_multiply_2 * (quality).intValue());
              int _plus_1 = (speed + _multiply_3);
              speed = _plus_1;
            } else {
              int _minus = (-1);
              int _multiply_4 = (change * _minus);
              change = _multiply_4;
              int _totalWeight_1 = RollerCoasterInfo.getTotalWeight(rc);
              int _multiply_5 = ((quality).intValue() * 1000);
              int temp_1 = (_totalWeight_1 / _multiply_5);
              int _length_2 = _straight.getLength();
              int _multiply_6 = (change * _length_2);
              int _divide_1 = (_multiply_6 / (quality).intValue());
              int _plus_2 = (speed + _divide_1);
              int _minus_1 = (_plus_2 - temp_1);
              speed = _minus_1;
            }
          } else {
            int _length_3 = _straight.getLength();
            int _multiply_7 = ((quality).intValue() * 10);
            int _divide_2 = (_length_3 / _multiply_7);
            int _minus_2 = (speed - _divide_2);
            speed = _minus_2;
          }
          boolean _greaterThan = (speed > maxSpeed);
          if (_greaterThan) {
            maxSpeed = speed;
          }
        }
      }
    }
    return maxSpeed;
  }
}
