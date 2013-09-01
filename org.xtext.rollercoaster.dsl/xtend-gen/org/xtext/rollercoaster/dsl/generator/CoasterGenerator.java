/**
 * generated by Xtext
 */
package org.xtext.rollercoaster.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.rollercoaster.utils.Costs;
import org.rollercoaster.utils.Descriptions;
import org.xtext.rollercoaster.dsl.coaster.Cart;
import org.xtext.rollercoaster.dsl.coaster.Corner;
import org.xtext.rollercoaster.dsl.coaster.RollerCoaster;
import org.xtext.rollercoaster.dsl.coaster.Straight;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class CoasterGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<RollerCoaster> _filter = Iterables.<RollerCoaster>filter(_iterable, RollerCoaster.class);
    final Procedure1<RollerCoaster> _function = new Procedure1<RollerCoaster>() {
        public void apply(final RollerCoaster rc) {
          String _name = rc.getName();
          String _plus = (_name + ".html");
          CharSequence _genReport = CoasterGenerator.this.genReport(rc);
          fsa.generateFile(_plus, _genReport);
        }
      };
    IterableExtensions.<RollerCoaster>forEach(_filter, _function);
  }
  
  /**
   * Generate an html report of the coasters stats
   * For starting off this is going to include the
   * 	Max Speed
   * 	Cost
   * 	Fun
   * 	Name
   */
  public CharSequence genReport(final RollerCoaster rc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h4>Roller Coaster report for the ");
    String _name = rc.getName();
    _builder.append(_name, "		");
    _builder.append(" roller coaster on the  ");
    Date _date = new Date();
    _builder.append(_date, "		");
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<p>Number of Pieces of track \t: ");
    EList<EObject> _track = rc.getTrack();
    int _length = ((Object[])Conversions.unwrapArray(_track, Object.class)).length;
    _builder.append(_length, "		");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<p>Number of Carts \t\t\t\t: ");
    EList<Cart> _cart = rc.getCart();
    int _length_1 = ((Object[])Conversions.unwrapArray(_cart, Object.class)).length;
    _builder.append(_length_1, "		");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<h4>Itemized Cost of Track</h4>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<ul> ");
    _builder.newLine();
    _builder.append("\t\t\t");
    EList<EObject> _track_1 = rc.getTrack();
    final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject t) {
          return Boolean.valueOf((t instanceof Straight));
        }
      };
    final Iterable<EObject> listOfStraight = IterableExtensions.<EObject>filter(_track_1, _function);
    _builder.newLineIfNotEmpty();
    {
      int _length_2 = ((Object[])Conversions.unwrapArray(listOfStraight, Object.class)).length;
      boolean _greaterThan = (_length_2 > 0);
      if (_greaterThan) {
        _builder.append("\t\t\t");
        final EObject head = IterableExtensions.<EObject>head(listOfStraight);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("<li> ");
        String _short = Descriptions.getShort(head);
        _builder.append(_short, "			");
        _builder.append(" : ");
        double _get = Costs.get(head);
        _builder.append(_get, "			");
        _builder.append(" * ");
        int _length_3 = ((Object[])Conversions.unwrapArray(listOfStraight, Object.class)).length;
        _builder.append(_length_3, "			");
        _builder.append(" : ");
        double _get_1 = Costs.get(head);
        int _length_4 = ((Object[])Conversions.unwrapArray(listOfStraight, Object.class)).length;
        double _multiply = (_get_1 * _length_4);
        _builder.append(_multiply, "			");
        _builder.append(" </li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    EList<EObject> _track_2 = rc.getTrack();
    final Function1<EObject,Boolean> _function_1 = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject t) {
          return Boolean.valueOf((t instanceof Corner));
        }
      };
    final Iterable<EObject> listOfCorner = IterableExtensions.<EObject>filter(_track_2, _function_1);
    _builder.newLineIfNotEmpty();
    {
      int _length_5 = ((Object[])Conversions.unwrapArray(listOfCorner, Object.class)).length;
      boolean _greaterThan_1 = (_length_5 > 0);
      if (_greaterThan_1) {
        _builder.append("\t\t\t");
        final EObject head_1 = IterableExtensions.<EObject>head(listOfCorner);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("<li> ");
        String _short_1 = Descriptions.getShort(head_1);
        _builder.append(_short_1, "			");
        _builder.append(" : ");
        double _get_2 = Costs.get(head_1);
        _builder.append(_get_2, "			");
        _builder.append(" * ");
        int _length_6 = ((Object[])Conversions.unwrapArray(listOfCorner, Object.class)).length;
        _builder.append(_length_6, "			");
        _builder.append(" : ");
        double _get_3 = Costs.get(head_1);
        int _length_7 = ((Object[])Conversions.unwrapArray(listOfCorner, Object.class)).length;
        double _multiply_1 = (_get_3 * _length_7);
        _builder.append(_multiply_1, "			");
        _builder.append(" </li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<li> Total Track Cost : ");
    EList<EObject> _track_3 = rc.getTrack();
    final Function2<Double,EObject,Double> _function_2 = new Function2<Double,EObject,Double>() {
        public Double apply(final Double seed, final EObject item) {
          double _get = Costs.get(item);
          double _plus = ((seed).doubleValue() + _get);
          return Double.valueOf(_plus);
        }
      };
    Double _fold = IterableExtensions.<EObject, Double>fold(_track_3, Double.valueOf(0.00), _function_2);
    _builder.append(_fold, "			");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h4>Itemized Cost of Carts</h4> ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<ul> ");
    _builder.newLine();
    {
      EList<Cart> _cart_1 = rc.getCart();
      for(final Cart o : _cart_1) {
        _builder.append("\t\t\t");
        _builder.append("<li> ");
        String _short_2 = Descriptions.getShort(o);
        _builder.append(_short_2, "			");
        _builder.append(" : ");
        double _get_4 = Costs.get(o);
        _builder.append(_get_4, "			");
        _builder.append(" </li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("<li> Total : ");
    EList<Cart> _cart_2 = rc.getCart();
    final Function2<Double,Cart,Double> _function_3 = new Function2<Double,Cart,Double>() {
        public Double apply(final Double seed, final Cart item) {
          double _get = Costs.get(item);
          double _plus = ((seed).doubleValue() + _get);
          return Double.valueOf(_plus);
        }
      };
    Double _fold_1 = IterableExtensions.<Cart, Double>fold(_cart_2, Double.valueOf(0.00), _function_3);
    _builder.append(_fold_1, "			");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h4> Sample rendering of the track </h4>");
    _builder.newLine();
    _builder.append("  \t\t\t\t");
    String _pathForTrack = this.getPathForTrack(rc);
    _builder.append(_pathForTrack, "  				");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>\t");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Build a svg path from a list of tracks
   */
  public String getPathForTrack(final RollerCoaster rc) {
    String _xblockexpression = null;
    {
      EList<EObject> tracks = rc.getTrack();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<svg width=\"2000px\" height=\"2000px\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"> ");
      final String start = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<path d=\" M 400 300 ");
      final String pathStart = _builder_1.toString();
      String path = "";
      double currentAngle = 0.0;
      for (final EObject trackPiece : tracks) {
        String _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (trackPiece instanceof Straight) {
            final Straight _straight = (Straight)trackPiece;
            _matched=true;
            String _xblockexpression_1 = null;
            {
              final int length = _straight.getLength();
              double _radians = Math.toRadians(currentAngle);
              double _sin = Math.sin(_radians);
              final double endX = (_sin * length);
              double _radians_1 = Math.toRadians(currentAngle);
              double _cos = Math.cos(_radians_1);
              final double endY = (_cos * length);
              String _plus = (" l " + Double.valueOf(endX));
              String _plus_1 = (_plus + " ");
              String _plus_2 = (_plus_1 + Double.valueOf(endY));
              _xblockexpression_1 = (_plus_2);
            }
            _switchResult = _xblockexpression_1;
          }
        }
        if (!_matched) {
          if (trackPiece instanceof Corner) {
            final Corner _corner = (Corner)trackPiece;
            _matched=true;
            String _xblockexpression_1 = null;
            {
              String arcSize = " 0 0 ";
              Integer _switchResult_1 = null;
              String _direction = _corner.getDirection();
              final String _switchValue = _direction;
              boolean _matched_1 = false;
              if (!_matched_1) {
                if (Objects.equal(_switchValue,"left")) {
                  _matched_1=true;
                  int _minus = (-1);
                  _switchResult_1 = Integer.valueOf(_minus);
                }
              }
              if (!_matched_1) {
                if (Objects.equal(_switchValue,"right")) {
                  _matched_1=true;
                  _switchResult_1 = Integer.valueOf(1);
                }
              }
              final Integer modifier = _switchResult_1;
              String _switchResult_2 = null;
              String _direction_1 = _corner.getDirection();
              final String _switchValue_1 = _direction_1;
              boolean _matched_2 = false;
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,"left")) {
                  _matched_2=true;
                  _switchResult_2 = " 0 0 1 ";
                }
              }
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,"right")) {
                  _matched_2=true;
                  _switchResult_2 = " 0 0 0 ";
                }
              }
              final String flags = _switchResult_2;
              int x = 0;
              int y = 0;
              double angle = 0.0;
              int r = rc.getTrackUnitLength();
              String _type = _corner.getType();
              final String _switchValue_2 = _type;
              boolean _matched_3 = false;
              if (!_matched_3) {
                if (Objects.equal(_switchValue_2,"sharp45")) {
                  _matched_3=true;
                  int _divide = (r / 2);
                  x = _divide;
                  y = r;
                  angle = 22.5;
                  String _plus = (" " + Integer.valueOf(y));
                  String _plus_1 = (_plus + " ");
                  String _plus_2 = (_plus_1 + Integer.valueOf(y));
                  String _plus_3 = (_plus_2 + " ");
                  arcSize = _plus_3;
                }
              }
              if (!_matched_3) {
                if (Objects.equal(_switchValue_2,"sharp90")) {
                  _matched_3=true;
                  int _divide_1 = (r / 2);
                  x = _divide_1;
                  int _divide_2 = (r / 2);
                  y = _divide_2;
                  angle = 45;
                  String _plus_4 = (" " + Integer.valueOf(y));
                  String _plus_5 = (_plus_4 + " ");
                  String _plus_6 = (_plus_5 + Integer.valueOf(y));
                  String _plus_7 = (_plus_6 + " ");
                  arcSize = _plus_7;
                }
              }
              if (!_matched_3) {
                if (Objects.equal(_switchValue_2,"easy45")) {
                  _matched_3=true;
                  int _divide_3 = (r / 2);
                  x = _divide_3;
                  y = r;
                  angle = 22.5;
                  String _plus_8 = (" " + Integer.valueOf(y));
                  String _plus_9 = (_plus_8 + " ");
                  String _plus_10 = (_plus_9 + Integer.valueOf(y));
                  String _plus_11 = (_plus_10 + " ");
                  arcSize = _plus_11;
                }
              }
              if (!_matched_3) {
                if (Objects.equal(_switchValue_2,"easy90")) {
                  _matched_3=true;
                  x = r;
                  y = r;
                  angle = 45;
                  String _plus_12 = (" " + Integer.valueOf(y));
                  String _plus_13 = (_plus_12 + " ");
                  String _plus_14 = (_plus_13 + Integer.valueOf(y));
                  String _plus_15 = (_plus_14 + " ");
                  arcSize = _plus_15;
                }
              }
              double _multiply = ((modifier).intValue() * angle);
              double _plus_16 = (_multiply + currentAngle);
              double _radians = Math.toRadians(_plus_16);
              double _sin = Math.sin(_radians);
              int _multiply_1 = (x * x);
              int _multiply_2 = (y * y);
              int _plus_17 = (_multiply_1 + _multiply_2);
              double _sqrt = Math.sqrt(_plus_17);
              final double endX = (_sin * _sqrt);
              double _multiply_3 = ((modifier).intValue() * angle);
              double _plus_18 = (_multiply_3 + currentAngle);
              double _radians_1 = Math.toRadians(_plus_18);
              double _cos = Math.cos(_radians_1);
              int _multiply_4 = (x * x);
              int _multiply_5 = (y * y);
              int _plus_19 = (_multiply_4 + _multiply_5);
              double _sqrt_1 = Math.sqrt(_plus_19);
              final double endY = (_cos * _sqrt_1);
              double _multiply_6 = (angle * 2);
              double _multiply_7 = (_multiply_6 * (modifier).intValue());
              double _plus_20 = (currentAngle + _multiply_7);
              currentAngle = _plus_20;
              String _plus_21 = (" a " + arcSize);
              String _plus_22 = (_plus_21 + " ");
              String _plus_23 = (_plus_22 + flags);
              String _plus_24 = (_plus_23 + " ");
              String _plus_25 = (_plus_24 + Double.valueOf(endX));
              String _plus_26 = (_plus_25 + " ");
              String _plus_27 = (_plus_26 + Double.valueOf(endY));
              String _plus_28 = (_plus_27 + " ");
              _xblockexpression_1 = (_plus_28);
            }
            _switchResult = _xblockexpression_1;
          }
        }
        String _plus = (path + _switchResult);
        path = _plus;
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("\"stroke=\"black\" fill=\"transparent\"/>");
      final String pathEnd = _builder_2.toString();
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("</svg>");
      String end = _builder_3.toString();
      String _plus_1 = (start + pathStart);
      String _plus_2 = (_plus_1 + path);
      String _plus_3 = (_plus_2 + pathEnd);
      String _plus_4 = (_plus_3 + end);
      _xblockexpression = (_plus_4);
    }
    return _xblockexpression;
  }
}
