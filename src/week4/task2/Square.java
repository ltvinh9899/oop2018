package week4.task2;

public class Square extends Rectangle {
    double side;
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side) {
        this.side = width;
    }
    public void setLength(double side){
        this.side = length;
    }

    public String toString(){
        return super.toString();
    }
}
