/**
 * 
 */
package cst8284.shape;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Mar 22, 2018  
 */
public class Square extends BasicShape {

  public Square() {
    // TODO Auto-generated constructor stub
  }
  
  public Circle(double width) {
    super.setWidth(width);
  }
  
  public Circle(Circle circle) {
    this(circle.getWidth());
  }
  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getArea()
   */
  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return 0;
  }

  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getPerimeter()
   */
  @Override
  public double getPerimeter() {
    // TODO Auto-generated method stub
    return 0;
  }

}
