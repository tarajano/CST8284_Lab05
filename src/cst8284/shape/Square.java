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
  
  public Square(double width) {
    super.setWidth(width);
  }
  
  public Square(Square square) {
    this(square.getWidth());
  }
  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getArea()
   */
  @Override
  public double getArea() {
    return this.getWidth() * this.getWidth();
  }

  /* (non-Javadoc)
   * @see cst8284.shape.BasicShape#getPerimeter()
   */
  @Override
  public double getPerimeter() {
    return this.getWidth() * 4;
  }

  // TODO test
  @Override
  public String toString(){
    return ("Square Overrides " + super.toString());
  }
 
  // TODO test
  public boolean equals(Object that) {
    return (that instanceof Square &&
            this.getWidth() == ((Square) that).getWidth());
  }
  
}
