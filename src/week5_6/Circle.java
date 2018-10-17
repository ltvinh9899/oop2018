package week5_6;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
public class Circle extends Shape{
    private int x = 40;
    private int y = 40;
    private int radius = 50;
//    public Circle{
//
//    }
//    public Circle(int x, int y, int radius){
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }
       public int getX(){
        return x;
   }
   public void setX(int x){
        this.x = x;
   }
   public int getY(){
        return y;
   }
   public void setY(int y){
        this.y = y;
   }
   public int getRadius(){
        return radius;
   }
   public void setRadius(int radius){
        this.radius = radius;
   }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 2*radius, 2*radius);
    }
}
