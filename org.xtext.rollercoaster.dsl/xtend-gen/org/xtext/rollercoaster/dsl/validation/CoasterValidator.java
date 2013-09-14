/**
 * generated by Xtext
 */
package org.xtext.rollercoaster.dsl.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.CoasterPackage.Literals;
import org.xtext.rollercoaster.dsl.coaster.Corner;
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster;
import org.xtext.rollercoaster.dsl.coaster.SignedInt;
import org.xtext.rollercoaster.dsl.coaster.Straight;
import org.xtext.rollercoaster.dsl.validation.AbstractCoasterValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class CoasterValidator extends AbstractCoasterValidator {
  @Check
  public void checkCompletePath(final RollerCoaster rc) {
    int totalAngle = 0;
    EList<EObject> _track = rc.getTrack();
    Iterable<Corner> _filter = Iterables.<Corner>filter(_track, Corner.class);
    for (final Corner t : _filter) {
      {
        int dir = 1;
        String _direction = t.getDirection();
        boolean _equals = _direction.equals("left");
        if (_equals) {
          int _minus = (-1);
          dir = _minus;
        }
        boolean _or = false;
        String _type = t.getType();
        boolean _equals_1 = _type.equals("sharp45");
        if (_equals_1) {
          _or = true;
        } else {
          String _type_1 = t.getType();
          boolean _equals_2 = _type_1.equals("easy45");
          _or = (_equals_1 || _equals_2);
        }
        if (_or) {
          int _multiply = (45 * dir);
          int _plus = (totalAngle + _multiply);
          totalAngle = _plus;
        } else {
          int _multiply_1 = (90 * dir);
          int _plus_1 = (totalAngle + _multiply_1);
          totalAngle = _plus_1;
        }
      }
    }
    int _modulo = (totalAngle % 360);
    boolean _notEquals = (_modulo != 0);
    if (_notEquals) {
      int _modulo_1 = (totalAngle % 360);
      String _plus = ("Track angles do not form a cycle! " + Integer.valueOf(_modulo_1));
      String _plus_1 = (_plus + " degrees from a cycle.");
      EStructuralFeature _eStructuralFeature = Literals.ROLLER_COASTER.getEStructuralFeature("track");
      this.warning(_plus_1, _eStructuralFeature);
    }
  }
  
  @Check
  public void checkStartMeetsEnd(final RollerCoaster rc) {
    double distance = 0.0;
    double currentX = 0.0;
    double currentY = 0.0;
    double currentAngle = 0.0;
    EList<EObject> _track = rc.getTrack();
    for (final Object t : _track) {
      {
        Corner c = null;
        Straight s = null;
        boolean _matched = false;
        if (!_matched) {
          if (t instanceof Corner) {
            final Corner _corner = (Corner)t;
            _matched=true;
            c = _corner;
          }
        }
        if (!_matched) {
          if (t instanceof Straight) {
            final Straight _straight = (Straight)t;
            _matched=true;
            s = _straight;
          }
        }
        boolean _notEquals = (!Objects.equal(c, null));
        if (_notEquals) {
          double dir = 1.0;
          double angle = 0.0;
          String _direction = c.getDirection();
          boolean _equals = _direction.equals("left");
          if (_equals) {
            int _minus = (-1);
            dir = _minus;
          }
          boolean _or = false;
          String _type = c.getType();
          boolean _equals_1 = _type.equals("sharp45");
          if (_equals_1) {
            _or = true;
          } else {
            String _type_1 = c.getType();
            boolean _equals_2 = _type_1.equals("easy45");
            _or = (_equals_1 || _equals_2);
          }
          if (_or) {
            double _multiply = (22.5 * dir);
            double _radians = Math.toRadians(_multiply);
            angle = _radians;
          } else {
            double _multiply_1 = (45 * dir);
            double _radians_1 = Math.toRadians(_multiply_1);
            angle = _radians_1;
          }
          int r = rc.getTrackUnitLength();
          String _type_2 = c.getType();
          boolean _equals_3 = _type_2.equals("sharp45");
          if (_equals_3) {
            double _plus = (currentAngle + angle);
            double _cos = Math.cos(_plus);
            double _divide = (r / 2.0);
            double _pow = Math.pow(_divide, 2);
            double _pow_1 = Math.pow(r, 2);
            double _plus_1 = (_pow + _pow_1);
            double _sqrt = Math.sqrt(_plus_1);
            double _multiply_2 = (_cos * _sqrt);
            double _plus_2 = (currentX + _multiply_2);
            currentX = _plus_2;
            double _plus_3 = (currentAngle + angle);
            double _sin = Math.sin(_plus_3);
            double _divide_1 = (r / 2.0);
            double _pow_2 = Math.pow(_divide_1, 2);
            double _pow_3 = Math.pow(r, 2);
            double _plus_4 = (_pow_2 + _pow_3);
            double _sqrt_1 = Math.sqrt(_plus_4);
            double _multiply_3 = (_sin * _sqrt_1);
            double _plus_5 = (currentY + _multiply_3);
            currentY = _plus_5;
          } else {
            String _type_3 = c.getType();
            boolean _equals_4 = _type_3.equals("sharp90");
            if (_equals_4) {
              double _plus_6 = (currentAngle + angle);
              double _cos_1 = Math.cos(_plus_6);
              double _divide_2 = (r / 2.0);
              double _pow_4 = Math.pow(_divide_2, 2);
              double _divide_3 = (r / 2.0);
              double _pow_5 = Math.pow(_divide_3, 2);
              double _plus_7 = (_pow_4 + _pow_5);
              double _sqrt_2 = Math.sqrt(_plus_7);
              double _multiply_4 = (_cos_1 * _sqrt_2);
              double _plus_8 = (currentX + _multiply_4);
              currentX = _plus_8;
              double _plus_9 = (currentAngle + angle);
              double _sin_1 = Math.sin(_plus_9);
              double _divide_4 = (r / 2.0);
              double _pow_6 = Math.pow(_divide_4, 2);
              double _divide_5 = (r / 2.0);
              double _pow_7 = Math.pow(_divide_5, 2);
              double _plus_10 = (_pow_6 + _pow_7);
              double _sqrt_3 = Math.sqrt(_plus_10);
              double _multiply_5 = (_sin_1 * _sqrt_3);
              double _plus_11 = (currentY + _multiply_5);
              currentY = _plus_11;
            } else {
              String _type_4 = c.getType();
              boolean _equals_5 = _type_4.equals("easy45");
              if (_equals_5) {
                double _plus_12 = (currentAngle + angle);
                double _cos_2 = Math.cos(_plus_12);
                double _pow_8 = Math.pow(r, 2);
                int _multiply_6 = (r * 2);
                double _pow_9 = Math.pow(_multiply_6, 2);
                double _plus_13 = (_pow_8 + _pow_9);
                double _sqrt_4 = Math.sqrt(_plus_13);
                double _multiply_7 = (_cos_2 * _sqrt_4);
                double _plus_14 = (currentX + _multiply_7);
                currentX = _plus_14;
                double _plus_15 = (currentAngle + angle);
                double _sin_2 = Math.sin(_plus_15);
                double _pow_10 = Math.pow(r, 2);
                int _multiply_8 = (r * 2);
                double _pow_11 = Math.pow(_multiply_8, 2);
                double _plus_16 = (_pow_10 + _pow_11);
                double _sqrt_5 = Math.sqrt(_plus_16);
                double _multiply_9 = (_sin_2 * _sqrt_5);
                double _plus_17 = (currentY + _multiply_9);
                currentY = _plus_17;
              } else {
                String _type_5 = c.getType();
                boolean _equals_6 = _type_5.equals("easy90");
                if (_equals_6) {
                  double _plus_18 = (currentAngle + angle);
                  double _cos_3 = Math.cos(_plus_18);
                  double _pow_12 = Math.pow(r, 2);
                  double _pow_13 = Math.pow(r, 2);
                  double _plus_19 = (_pow_12 + _pow_13);
                  double _sqrt_6 = Math.sqrt(_plus_19);
                  double _multiply_10 = (_cos_3 * _sqrt_6);
                  double _plus_20 = (currentX + _multiply_10);
                  currentX = _plus_20;
                  double _plus_21 = (currentAngle + angle);
                  double _sin_3 = Math.sin(_plus_21);
                  double _pow_14 = Math.pow(r, 2);
                  double _pow_15 = Math.pow(r, 2);
                  double _plus_22 = (_pow_14 + _pow_15);
                  double _sqrt_7 = Math.sqrt(_plus_22);
                  double _multiply_11 = (_sin_3 * _sqrt_7);
                  double _plus_23 = (currentY + _multiply_11);
                  currentY = _plus_23;
                }
              }
            }
          }
          double _multiply_12 = (angle * 2);
          double _plus_24 = (currentAngle + _multiply_12);
          currentAngle = _plus_24;
        } else {
          boolean _notEquals_1 = (!Objects.equal(s, null));
          if (_notEquals_1) {
            double _cos_4 = Math.cos(currentAngle);
            int _length = s.getLength();
            double _multiply_13 = (_cos_4 * _length);
            double _plus_25 = (currentX + _multiply_13);
            currentX = _plus_25;
            double _sin_4 = Math.sin(currentAngle);
            int _length_1 = s.getLength();
            double _multiply_14 = (_sin_4 * _length_1);
            double _plus_26 = (currentY + _multiply_14);
            currentY = _plus_26;
          }
        }
      }
    }
    double _pow = Math.pow(currentX, 2);
    double _pow_1 = Math.pow(currentY, 2);
    double _plus = (_pow + _pow_1);
    double _sqrt = Math.sqrt(_plus);
    distance = _sqrt;
    boolean _greaterEqualsThan = (distance >= 0.5);
    if (_greaterEqualsThan) {
      int _intValue = Double.valueOf(distance).intValue();
      int _plus_1 = (_intValue + 1);
      String _plus_2 = ("End of Track does not meet start! End of track is" + Integer.valueOf(_plus_1));
      String _plus_3 = (_plus_2 + "m from the start.");
      EStructuralFeature _eStructuralFeature = Literals.ROLLER_COASTER.getEStructuralFeature("track");
      this.warning(_plus_3, _eStructuralFeature);
    }
  }
  
  @Check
  public void elevationMeetsAtStartAndEnd(final RollerCoaster rc) {
    int elevation = 0;
    EList<EObject> _track = rc.getTrack();
    for (final Object t : _track) {
      {
        Corner c = null;
        Straight s = null;
        boolean _matched = false;
        if (!_matched) {
          if (t instanceof Corner) {
            final Corner _corner = (Corner)t;
            _matched=true;
            c = _corner;
          }
        }
        if (!_matched) {
          if (t instanceof Straight) {
            final Straight _straight = (Straight)t;
            _matched=true;
            s = _straight;
          }
        }
        String _plus = (c + ">>");
        String _plus_1 = (_plus + s);
        InputOutput.<String>println(_plus_1);
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(s, null));
        if (!_notEquals) {
          _and = false;
        } else {
          SignedInt _elevationChange = s.getElevationChange();
          boolean _notEquals_1 = (!Objects.equal(_elevationChange, null));
          _and = (_notEquals && _notEquals_1);
        }
        if (_and) {
          SignedInt _elevationChange_1 = s.getElevationChange();
          int _value = _elevationChange_1.getValue();
          String _plus_2 = ("first val: " + Integer.valueOf(_value));
          String _plus_3 = (_plus_2 + " track:");
          String _name = s.getName();
          String _plus_4 = (_plus_3 + _name);
          InputOutput.<String>println(_plus_4);
          SignedInt _elevationChange_2 = s.getElevationChange();
          int change = _elevationChange_2.getValue();
          InputOutput.<String>println("1");
          SignedInt _elevationChange_3 = s.getElevationChange();
          String _sign = _elevationChange_3.getSign();
          boolean _notEquals_2 = (!Objects.equal(_sign, null));
          if (_notEquals_2) {
            int _minus = (-1);
            int _multiply = (change * _minus);
            change = _multiply;
          }
          InputOutput.<String>println("2");
          int _plus_5 = (elevation + change);
          elevation = _plus_5;
          InputOutput.<String>println("3");
        }
        InputOutput.<String>println("4");
      }
    }
    InputOutput.<String>println("5");
    String _plus = ("final elevation: " + Integer.valueOf(elevation));
    InputOutput.<String>println(_plus);
    boolean _notEquals = (elevation != 0);
    if (_notEquals) {
      String _plus_1 = ("End of Track does not meet start! Height of last track unit is " + Integer.valueOf(elevation));
      String _plus_2 = (_plus_1 + "m from start.");
      EStructuralFeature _eStructuralFeature = Literals.ROLLER_COASTER.getEStructuralFeature("track");
      this.warning(_plus_2, _eStructuralFeature);
    }
  }
  
  @Check
  public void hasEnoughPower(final RollerCoaster rc) {
    int speed = 0;
    EList<EObject> _track = rc.getTrack();
    for (final Object t : _track) {
      {
        Corner c = null;
        Straight s = null;
        boolean _matched = false;
        if (!_matched) {
          if (t instanceof Corner) {
            final Corner _corner = (Corner)t;
            _matched=true;
            c = _corner;
          }
        }
        if (!_matched) {
          if (t instanceof Straight) {
            final Straight _straight = (Straight)t;
            _matched=true;
            s = _straight;
          }
        }
        boolean _notEquals = (!Objects.equal(c, null));
        if (_notEquals) {
          Integer _switchResult_1 = null;
          String _quality = c.getQuality();
          final String _switchValue = _quality;
          boolean _matched_1 = false;
          if (!_matched_1) {
            if (_switchValue instanceof String) {
              final String _string = (String)_switchValue;
              if (Objects.equal(_switchValue,"wood")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(1);
              }
            }
          }
          if (!_matched_1) {
            if (_switchValue instanceof String) {
              final String _string = (String)_switchValue;
              if (Objects.equal(_switchValue,"iron")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(2);
              }
            }
          }
          if (!_matched_1) {
            if (_switchValue instanceof String) {
              final String _string = (String)_switchValue;
              if (Objects.equal(_switchValue,"steel")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(3);
              }
            }
          }
          if (!_matched_1) {
            Integer _switchResult_2 = null;
            String _baseQuality = rc.getBaseQuality();
            final String _switchValue_1 = _baseQuality;
            boolean _matched_2 = false;
            if (!_matched_2) {
              if (_switchValue_1 instanceof String) {
                final String _string = (String)_switchValue_1;
                if (Objects.equal(_switchValue_1,"wood")) {
                  _matched_2=true;
                  _switchResult_2 = Integer.valueOf(1);
                }
              }
            }
            if (!_matched_2) {
              if (_switchValue_1 instanceof String) {
                final String _string = (String)_switchValue_1;
                if (Objects.equal(_switchValue_1,"iron")) {
                  _matched_2=true;
                  _switchResult_2 = Integer.valueOf(2);
                }
              }
            }
            if (!_matched_2) {
              if (_switchValue_1 instanceof String) {
                final String _string = (String)_switchValue_1;
                if (Objects.equal(_switchValue_1,"steel")) {
                  _matched_2=true;
                  _switchResult_2 = Integer.valueOf(3);
                }
              }
            }
            _switchResult_1 = _switchResult_2;
          }
          Integer quality = _switchResult_1;
          this.checkSpeedOnCurve(rc, c, (quality).intValue(), speed);
        }
        boolean _notEquals_1 = (!Objects.equal(s, null));
        if (_notEquals_1) {
          Integer _switchResult_3 = null;
          String _quality_1 = s.getQuality();
          final String _switchValue_2 = _quality_1;
          boolean _matched_3 = false;
          if (!_matched_3) {
            if (_switchValue_2 instanceof String) {
              final String _string = (String)_switchValue_2;
              if (Objects.equal(_switchValue_2,"wood")) {
                _matched_3=true;
                _switchResult_3 = Integer.valueOf(1);
              }
            }
          }
          if (!_matched_3) {
            if (_switchValue_2 instanceof String) {
              final String _string = (String)_switchValue_2;
              if (Objects.equal(_switchValue_2,"iron")) {
                _matched_3=true;
                _switchResult_3 = Integer.valueOf(2);
              }
            }
          }
          if (!_matched_3) {
            if (_switchValue_2 instanceof String) {
              final String _string = (String)_switchValue_2;
              if (Objects.equal(_switchValue_2,"steel")) {
                _matched_3=true;
                _switchResult_3 = Integer.valueOf(3);
              }
            }
          }
          if (!_matched_3) {
            Integer _switchResult_4 = null;
            String _baseQuality_1 = rc.getBaseQuality();
            final String _switchValue_3 = _baseQuality_1;
            boolean _matched_4 = false;
            if (!_matched_4) {
              if (_switchValue_3 instanceof String) {
                final String _string = (String)_switchValue_3;
                if (Objects.equal(_switchValue_3,"wood")) {
                  _matched_4=true;
                  _switchResult_4 = Integer.valueOf(1);
                }
              }
            }
            if (!_matched_4) {
              if (_switchValue_3 instanceof String) {
                final String _string = (String)_switchValue_3;
                if (Objects.equal(_switchValue_3,"iron")) {
                  _matched_4=true;
                  _switchResult_4 = Integer.valueOf(2);
                }
              }
            }
            if (!_matched_4) {
              if (_switchValue_3 instanceof String) {
                final String _string = (String)_switchValue_3;
                if (Objects.equal(_switchValue_3,"steel")) {
                  _matched_4=true;
                  _switchResult_4 = Integer.valueOf(3);
                }
              }
            }
            _switchResult_3 = _switchResult_4;
          }
          Integer quality_1 = _switchResult_3;
          String _powered = s.getPowered();
          boolean _notEquals_2 = (!Objects.equal(_powered, null));
          if (_notEquals_2) {
            int _totalWeight = this.getTotalWeight(rc);
            int _multiply = ((quality_1).intValue() * 100);
            int temp = (_totalWeight / _multiply);
            int _length = s.getLength();
            int _multiply_1 = (_length * (quality_1).intValue());
            int _divide = (_multiply_1 / temp);
            int _plus = (speed + _divide);
            speed = _plus;
          }
          SignedInt _elevationChange = s.getElevationChange();
          boolean _notEquals_3 = (!Objects.equal(_elevationChange, null));
          if (_notEquals_3) {
            SignedInt _elevationChange_1 = s.getElevationChange();
            int _value = _elevationChange_1.getValue();
            int change = (_value / 2);
            SignedInt _elevationChange_2 = s.getElevationChange();
            String _sign = _elevationChange_2.getSign();
            boolean _notEquals_4 = (!Objects.equal(_sign, null));
            if (_notEquals_4) {
              int _length_1 = s.getLength();
              int _multiply_2 = (change * _length_1);
              int _multiply_3 = (_multiply_2 * (quality_1).intValue());
              int _plus_1 = (speed + _multiply_3);
              speed = _plus_1;
            } else {
              int _minus = (-1);
              int _multiply_4 = (change * _minus);
              change = _multiply_4;
              int _totalWeight_1 = this.getTotalWeight(rc);
              int _multiply_5 = ((quality_1).intValue() * 1000);
              int temp_1 = (_totalWeight_1 / _multiply_5);
              int _length_2 = s.getLength();
              int _multiply_6 = (change * _length_2);
              int _divide_1 = (_multiply_6 / (quality_1).intValue());
              int _plus_2 = (speed + _divide_1);
              int _minus_1 = (_plus_2 - temp_1);
              speed = _minus_1;
            }
          } else {
            int _length_3 = s.getLength();
            int _multiply_7 = ((quality_1).intValue() * 10);
            int _divide_2 = (_length_3 / _multiply_7);
            int _minus_2 = (speed - _divide_2);
            speed = _minus_2;
          }
          this.checkSpeedOnStraights(rc, s, (quality_1).intValue(), speed);
          boolean _lessEqualsThan = (speed <= 0);
          if (_lessEqualsThan) {
            String _name = s.getName();
            String _plus_3 = ("Cart is moving backwards or stopped on Track: " + _name);
            String _plus_4 = (_plus_3 + ", add powered units or downhill slopes.");
            EStructuralFeature _eStructuralFeature = Literals.ROLLER_COASTER.getEStructuralFeature("track");
            this.warning(_plus_4, _eStructuralFeature);
          }
        }
      }
    }
  }
  
  public int getTotalWeight(final RollerCoaster rc) {
    int totalWeight = 1;
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
  
  public void checkSpeedOnStraights(final RollerCoaster rc, final Straight s, final int trackQuality, final int speed) {
    EList<Cart> _cart = rc.getCart();
    for (final Cart c : _cart) {
      {
        Integer _switchResult = null;
        String _quality = c.getQuality();
        final String _switchValue = _quality;
        boolean _matched = false;
        if (!_matched) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"wood")) {
              _matched=true;
              _switchResult = Integer.valueOf(1);
            }
          }
        }
        if (!_matched) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"iron")) {
              _matched=true;
              _switchResult = Integer.valueOf(2);
            }
          }
        }
        if (!_matched) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"steel")) {
              _matched=true;
              _switchResult = Integer.valueOf(3);
            }
          }
        }
        if (!_matched) {
          Integer _switchResult_1 = null;
          String _baseQuality = rc.getBaseQuality();
          final String _switchValue_1 = _baseQuality;
          boolean _matched_1 = false;
          if (!_matched_1) {
            if (_switchValue_1 instanceof String) {
              final String _string = (String)_switchValue_1;
              if (Objects.equal(_switchValue_1,"wood")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(1);
              }
            }
          }
          if (!_matched_1) {
            if (_switchValue_1 instanceof String) {
              final String _string = (String)_switchValue_1;
              if (Objects.equal(_switchValue_1,"iron")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(2);
              }
            }
          }
          if (!_matched_1) {
            if (_switchValue_1 instanceof String) {
              final String _string = (String)_switchValue_1;
              if (Objects.equal(_switchValue_1,"steel")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(3);
              }
            }
          }
          _switchResult = _switchResult_1;
        }
        Integer cartQuality = _switchResult;
        int qualityFactor = (trackQuality + (cartQuality).intValue());
        int _divide = (speed / qualityFactor);
        boolean _greaterThan = (_divide > 75);
        if (_greaterThan) {
          String _name = c.getName();
          String _plus = ("Cart " + _name);
          String _plus_1 = (_plus + " has been destroyed due to the excessive speed of ");
          String _plus_2 = (_plus_1 + Integer.valueOf(speed));
          String _plus_3 = (_plus_2 + "kph on Track: ");
          String _name_1 = s.getName();
          String _plus_4 = (_plus_3 + _name_1);
          String _plus_5 = (_plus_4 + ", please improve quality of track or cart or reduce speed.");
          EStructuralFeature _eStructuralFeature = Literals.ROLLER_COASTER.getEStructuralFeature("track");
          this.warning(_plus_5, _eStructuralFeature);
        }
      }
    }
  }
  
  public void checkSpeedOnCurve(final RollerCoaster rc, final Corner corner, final int trackQuality, final int speed) {
    EList<Cart> _cart = rc.getCart();
    for (final Cart c : _cart) {
      {
        Integer _switchResult = null;
        String _quality = c.getQuality();
        final String _switchValue = _quality;
        boolean _matched = false;
        if (!_matched) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"wood")) {
              _matched=true;
              _switchResult = Integer.valueOf(1);
            }
          }
        }
        if (!_matched) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"iron")) {
              _matched=true;
              _switchResult = Integer.valueOf(2);
            }
          }
        }
        if (!_matched) {
          if (_switchValue instanceof String) {
            final String _string = (String)_switchValue;
            if (Objects.equal(_switchValue,"steel")) {
              _matched=true;
              _switchResult = Integer.valueOf(3);
            }
          }
        }
        if (!_matched) {
          Integer _switchResult_1 = null;
          String _baseQuality = rc.getBaseQuality();
          final String _switchValue_1 = _baseQuality;
          boolean _matched_1 = false;
          if (!_matched_1) {
            if (_switchValue_1 instanceof String) {
              final String _string = (String)_switchValue_1;
              if (Objects.equal(_switchValue_1,"wood")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(1);
              }
            }
          }
          if (!_matched_1) {
            if (_switchValue_1 instanceof String) {
              final String _string = (String)_switchValue_1;
              if (Objects.equal(_switchValue_1,"iron")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(2);
              }
            }
          }
          if (!_matched_1) {
            if (_switchValue_1 instanceof String) {
              final String _string = (String)_switchValue_1;
              if (Objects.equal(_switchValue_1,"steel")) {
                _matched_1=true;
                _switchResult_1 = Integer.valueOf(3);
              }
            }
          }
          _switchResult = _switchResult_1;
        }
        Integer cartQuality = _switchResult;
        int qualityFactor = (trackQuality + (cartQuality).intValue());
        Integer _switchResult_2 = null;
        String _type = corner.getType();
        final String _switchValue_2 = _type;
        boolean _matched_2 = false;
        if (!_matched_2) {
          if (_switchValue_2 instanceof String) {
            final String _string = (String)_switchValue_2;
            if (Objects.equal(_switchValue_2,"sharp45")) {
              _matched_2=true;
              _switchResult_2 = Integer.valueOf(3);
            }
          }
        }
        if (!_matched_2) {
          if (_switchValue_2 instanceof String) {
            final String _string = (String)_switchValue_2;
            if (Objects.equal(_switchValue_2,"sharp90")) {
              _matched_2=true;
              _switchResult_2 = Integer.valueOf(4);
            }
          }
        }
        if (!_matched_2) {
          if (_switchValue_2 instanceof String) {
            final String _string = (String)_switchValue_2;
            if (Objects.equal(_switchValue_2,"easy45")) {
              _matched_2=true;
              _switchResult_2 = Integer.valueOf(1);
            }
          }
        }
        if (!_matched_2) {
          if (_switchValue_2 instanceof String) {
            final String _string = (String)_switchValue_2;
            if (Objects.equal(_switchValue_2,"easy90")) {
              _matched_2=true;
              _switchResult_2 = Integer.valueOf(2);
            }
          }
        }
        Integer cornerType = _switchResult_2;
        int _divide = (speed / qualityFactor);
        int _multiply = (_divide * (cornerType).intValue());
        boolean _greaterThan = (_multiply > 100);
        if (_greaterThan) {
          String _name = c.getName();
          String _plus = ("Cart " + _name);
          String _plus_1 = (_plus + " has left the track due the excessive speed of ");
          String _plus_2 = (_plus_1 + Integer.valueOf(speed));
          String _plus_3 = (_plus_2 + "kph on Corner: ");
          String _name_1 = corner.getName();
          String _plus_4 = (_plus_3 + _name_1);
          String _plus_5 = (_plus_4 + ", please improve quality of track or cart or reduce speed.");
          EStructuralFeature _eStructuralFeature = Literals.ROLLER_COASTER.getEStructuralFeature("track");
          this.warning(_plus_5, _eStructuralFeature);
        }
      }
    }
  }
}
