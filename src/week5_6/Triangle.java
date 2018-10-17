package week5_6;

import java.awt.*;

public class Triangle extends Shape{
    private int[] x = {260, 200, 320};
    private int[] y = {200, 300, 300};
    public void setX(int[] x){
        this.x = x;
    }
    public int getX1(){
        return x[0];
    }
    public int getX2(){
        return x[1];
    }
    public int getX3(){
        return x[2];
    }
   public void setY(int[] y){
        this.y = y;
   }
    public int getY1(){
        return y[0];
    }
    public int getY2(){
        return y[1];
    }
    public int getY3(){
        return y[2];
    }
    @Override
    public void paint(Graphics g){
        g.fillPolygon(x, y, 3);
    }
}
