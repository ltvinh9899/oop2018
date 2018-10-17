package week5_6;


import javax.swing.*;
import java.awt.*;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.*;
import java.awt.AlphaComposite;
import java.awt.GradientPaint;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.JFrame;
public  class Diagram extends JFrame {
    public Graphics g;

    public static void main(String[] a) {
        Diagram f = new Diagram();
        // f.setSize(400, 400);
        f.setBounds(550, 200, 400, 400);
        f.setVisible(true);

    }
     public void clearCircle(Circle circle, Graphics g){
        g.setColor(Color.white);
        g.fillRect(circle.getX(), circle.getY(), circle.getRadius()*2, circle.getRadius()*2);
     }
    public void paint(Graphics g) {
        Circle circle = new Circle();
        circle.paint(g);
       Rectangle rectangle = new Rectangle();
        rectangle.paint(g);
        Square square = new Square();
        square.paint(g);
        Triangle triangle = new Triangle();
        triangle.paint(g);
        Layer layer = new Layer();
        layer.clearTriangle(triangle, g);
        Diagram diagram = new Diagram();
        diagram.clearCircle(circle, g);
    }
}


