/**
 * 
 */
package cst8284.shape;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Mar 22, 2018  
 */
public class Circle extends BasicShape {

  public Circle() {
    this(1.0);  // default width = 1
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
    return this.getWidth() * this.getWidth() * Math.PI;
  }

  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getPerimeter()
   */
  @Override
  public double getPerimeter() {
    return 2 * this.getWidth() * Math.PI;
  }
  
  // TODO test
  @Override
  public String toString(){
    return ("Circle Overrides " + super.toString());
  }

  // TODO test
  public boolean equals(Object that) {
    return (that instanceof Circle &&
            this.getWidth() == ((Circle) that).getWidth());
  }

}
