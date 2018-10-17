package week5_6;

import java.awt.*;

public class Rectangle extends Shape{
    protected int x = 200;
    protected int y = 40;
    protected int width = 120;
    protected int height = 100;
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
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height =height;
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
      g.fillRect(getX(), getY(), getWidth() , getHeight() );
    }
}
