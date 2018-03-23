/**
 * 
 */
package cst8284.shape;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Mar 23, 2018  
 */
public class Rectangle extends BasicShape {
  
  private double height;

  /**
   * 
   */
  public Rectangle() {
    this(1,1); // default width and height to 1
  }

  public Rectangle(double width, double height) {
    super.setWidth(width);
    this.setHeight(height);
  }

  public Rectangle(Rectangle rectangle) {
    super.setWidth(rectangle.getWidth());
    this.setHeight(rectangle.getHeight());
  }
  
  public void setHeight(double height){
    this.height = height;
  }

  public double getHeight(){
    return this.height;
  }
  
  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getArea()
   */
  @Override
  public double getArea() {
    return this.getWidth() * this.getHeight();
  }

  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getPerimeter()
   */
  @Override
  public double getPerimeter() {
    return 2 * (this.getHeight() + this.getWidth());
  }

  // TODO test
  @Override
  public String toString(){
    return ("Rectangle Overrides " + super.toString());
  }
  
  // TODO test
  @Override
  public boolean equals(Object that) {
    return (super.equals(that) && // <-- are both squares with equal widths ?
            this.getHeight()  == ((Rectangle) that).getHeight());
  }
}
