package week5_6;

import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
public class Shape extends Layer {
    protected Color color = Color.red;
//    protected int x;
//    protected int y;
//    protected int width;
//    protected int height;
//    public Shape(){
//    }
//    public  Shape(Color color, int x, int y, int width, int height){
//        this.color = color;
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }
//    public Color getColor(){
//        return color;
//    }
//    public void setColor(Color color){
//        this.color = color;
//    }
//   public int getX(){
//        return x;
//   }
//   public void setX(){
//        this.x = x;
//   }
//   public int getY(){
//        return y;
//   }
//   public void setY(){
//        this.y = y;
//   }
//   public int getWidth(){
//        return width;
//   }
//   public void setWidth(){
//        this.width = width;
//   }
//   public int getHeight(){
//        return height;
//   }
//   public void setHeight(){
//        this.height =height;
//   }
    public void paint(Graphics g) {
        g.setColor(color);
    }
}
