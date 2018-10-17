package week5_6;

import java.awt.*;

public class Square extends Rectangle{
    private int side = 100;
    private int x = 40;
    private int y = 200;
//    public Square(int side, int x, int y){
//        this.width = side;
//        this.height = side;
//        this.x = x;
//        this.y = y;
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
    public int getWidth(){
        return side;
    }
    public void setWidth(int side){
        this.width = side;
    }
    public int getHeight(){
        return side;
    }
    public void setHeight(int side){
        this.height = side;
    }
    @Override
    public void paint(Graphics g){
       // int side = 100;
        setHeight(side);
        setWidth(side);
        setX(x);
        setY(y);
        super.paint(g);
    }
}
