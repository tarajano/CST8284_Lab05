/**
 * 
 */
package test.cst8284.shape;

import static org.junit.Assert.*;
import org.junit.Test;
import cst8284.shape.Circle;
import cst8284.shape.Rectangle;
import cst8284.shape.Square;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Mar 23, 2018  
 */
public class TestShapesEqualities {

  Rectangle rect = new Rectangle();
  Circle circle = new Circle();
  Square square = new Square();
  
  @Test
  public void rectangleInstanceofSquare() {
    assertTrue(rect instanceof Square);
  }
  
  @Test
  public void circleNotSquare() {
    assertFalse(circle.equals(square));
  }

  @Test
  public void circleEqualsCircleCopy() {
    assertTrue(circle.equals(new Circle(circle)));
  }
  

}
