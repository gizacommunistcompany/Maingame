import java.awt.Color;
import javax.swing.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends Canvas  {

    public static void main(String[] args) {

        Color sky = new Color(51, 153, 255);
        JFrame frame = new JFrame("Acorn Game");
        Canvas canvas = new Main();
        frame.setSize(1200, 800);
        canvas.setSize(1200, 800);
        canvas.setBackground(sky);
        frame.add(new Main());
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

    }

    public void paint(Graphics g) {

        Color darkBrown = new Color(102, 51, 0);
        Color sky = new Color(51, 153, 255);
        Color goodBrown = new Color(102, 51, 0);
        g.setColor(goodBrown);
        g.fillRect(175, 300, 50, 400);
        Color goodGreen = new Color(0, 204, 0);
        g.setColor(goodGreen);
        g.fillOval(100, 100, 200, 200);
        g.fillOval(150, 150, 200, 200);
        g.fillOval(50, 50, 200, 200);
        g.fillOval(50, 150, 200, 200);
        g.fillOval(150, 50, 200, 200);
        g.fillRect(0, 700, 1250, 300);

        int i = 0;
        int k = 0;
        int j = 0;
        while(i<20){
            k++;
            if(k>1000){
                k = 0;
                j++;
            }
            if(j == 1000){
                int a = 0;
                j = 0;
                int d = 0;
                int c = 0;
                int e = 0;
                int b = 0;
                a = (int) Math.round(800 * Math.random()+400);
                Color acornBrown = new Color(204, 102, 0);
                g.setColor(acornBrown);
                g.fillOval(a, d, 30, 30);
                g.setColor(darkBrown);
                g.fillOval(a, d,30, 10);
                g.fillRect(a+12, d-10, 5, 20);
                while(d<670) {
                    e++;
                    if(e>100){
                        e=0;
                        c++;
                    }
                    if(c>100){
                        c = 0;
                        b++;
                    }
                    if(b>1000) {
                        b = 0;
                        g.setColor(sky);
                        g.fillOval(a, d, 30, 30);
                        g.fillOval(a, d,30, 10);
                        g.fillRect(a+12, d-10, 5, 20);
                        d++;
                        g.setColor(acornBrown);
                        g.fillOval(a, d, 30, 30);
                        g.setColor(darkBrown);
                        g.fillOval(a, d,30, 10);
                        g.fillRect(a+12, d-10, 5, 20);
                    }
                }
                g.setColor(sky);
                g.fillOval(a, d,30, 10);
                g.fillOval(a, d, 30, 30);
                g.fillRect(a+12, d-10, 5, 20);
                i++;
            }
        }
    }
}



