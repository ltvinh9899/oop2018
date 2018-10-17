package week5_6;

import java.awt.*;

public  class Layer extends Diagram{
      public void clearTriangle(Triangle triangle, Graphics g){
          int[] x = {triangle.getX1(), triangle.getX2(), triangle.getX3()};
          int[] y = {triangle.getY1(), triangle.getY2(), triangle.getY3()};
          g.setColor(Color.white);
          g.fillPolygon(x, y, 3);
      }
}
