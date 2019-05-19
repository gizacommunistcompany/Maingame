import java.awt.Color;
import javax.swing.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends Canvas {

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
        Color acornGold = new Color(255, 204, 51);
        g.setColor(goodBrown);

        g.fillOval(500, 550, 75, 200);
        g.fillOval(500, 500, 75, 75);
        g.setColor(Color.WHITE);
        g.fillOval(505, 520, 20, 20);
        g.fillOval(550, 520, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(505, 520, 10, 10);
        g.fillOval(550, 520, 10, 10);
        g.setColor(Color.PINK);
        g.fillOval(510, 550, 40, 10);

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
        while (i < 20) {
            k++;
            if (k > 1000) {
                k = 0;
                j++;
            }
            if (j == 1000) {
                int a = 0;
                j = 0;
                int d = 0;
                int c = 0;
                int e = 0;
                int b = 0;
                a = (int) Math.round(800 * Math.random() + 400);
                Color acornBrown = new Color(204, 102, 0);
                g.setColor(acornBrown);
                g.fillOval(a, d, 30, 30);
                g.setColor(darkBrown);
                g.fillOval(a, d, 30, 10);
                g.fillRect(a + 12, d - 10, 5, 20);

                int a2 = 0;
                int d2 = 0;

                a2 = (int) Math.round(800 * Math.random() + 400);
                // Color acornBrown = new Color(204, 102, 0);
                g.setColor(acornGold);
                g.fillOval(a2, d2, 30, 30);
                g.setColor(darkBrown);
                g.fillOval(a2, d2, 30, 10);
                g.fillRect(a2 + 12, d2 - 10, 5, 20);

                while (d < 670) {
                    e++;
                    if (e > 100) {
                        e = 0;
                        c++;
                    }
                    if (c > 100) {
                        c = 0;
                        b++;
                    }
                    if (b > 1000) {
                        b = 0;
                        g.setColor(sky);
                        g.fillOval(a, d, 30, 30);
                        g.fillOval(a, d, 30, 10);
                        g.fillRect(a + 12, d - 10, 5, 20);
                        d++;
                        g.setColor(acornBrown);
                        g.fillOval(a, d, 30, 30);
                        g.setColor(darkBrown);
                        g.fillOval(a, d, 30, 10);
                        g.fillRect(a + 12, d - 10, 5, 20);
                        g.setColor(sky);
                        g.fillOval(a2, d2, 30, 30);
                        g.fillOval(a2, d2, 30, 10);
                        g.fillRect(a2 + 12, d2 - 10, 5, 20);
                        g.fillOval(a2, d2+1, 30, 30);
                        g.fillOval(a2, d2+1, 30, 10);
                        g.fillRect(a2 + 12, d2 - 9, 5, 20);
                        g.fillOval(a2, d2+2, 30, 30);
                        g.fillOval(a2, d2+2, 30, 10);
                        g.fillRect(a2 + 12, d2 - 8, 5, 20);
                        d2+=3;
                        g.setColor(acornGold);
                        g.fillOval(a2, d2, 30, 30);
                        g.setColor(darkBrown);
                        g.fillOval(a2, d2, 30, 10);
                        g.fillRect(a2 + 12, d2 - 10, 5, 20);
                        g.setColor(sky);
                        g.fillRect(0,0, 1200, 50);
                        if(d2>665){
                            g.setColor(sky);
                            g.fillOval(a2, d2, 30, 10);
                            g.fillOval(a2, d2, 30, 30);
                            g.fillRect(a2 + 12, d2 - 10, 5, 20);
                            d2=0;
                            a2 = (int) Math.round(800 * Math.random() + 400);
                            g.setColor(sky);

                        }

                    }
                }
                g.setColor(sky);
                g.fillOval(a, d, 30, 10);
                g.fillOval(a, d, 30, 30);
                g.fillRect(a + 12, d - 10, 5, 20);
                i++;

            }
        }
/*
        int i2 = 0;
        int k2 = 0;
        int j2 = 0;
        while (i2 < 20) {
            k2++;
            if (k2 > 1000) {
                k2 = 0;
                j2++;
            }
            if (j2 == 1000) {
                int a2 = 0;
                j2 = 0;
                int d2 = 0;
                int c2 = 0;
                int e2 = 0;
                int b2 = 0;
                a2 = (int) Math.round(800 * Math.random() + 400);
               // Color acornBrown = new Color(204, 102, 0);
                g.setColor(acornGold);
                g.fillOval(a2, d2, 30, 30);
                g.setColor(darkBrown);
                g.fillOval(a2, d2, 30, 10);
                g.fillRect(a2 + 12, d2 - 10, 5, 20);
                while (d2 < 670) {
                    e2++;
                    if (e2 > 100) {
                        e2 = 0;
                        c2++;
                    }
                    if (c2 > 100) {
                        c2 = 0;
                        b2++;
                    }
                    if (b2 > 1000) {
                        b2 = 0;
                        g.setColor(sky);
                        g.fillOval(a2, d2, 30, 30);
                        g.fillOval(a2, d2, 30, 10);
                        g.fillRect(a2 + 12, d2 - 10, 5, 20);
                        d2++;
                        g.setColor(acornGold);
                        g.fillOval(a2, d2, 30, 30);
                        g.setColor(darkBrown);
                        g.fillOval(a2, d2, 30, 10);
                        g.fillRect(a2 + 12, d2 - 10, 5, 20);
                    }
                }
                g.setColor(sky);
                g.fillOval(a2, d2, 30, 10);
                g.fillOval(a2, d2, 30, 30);
                g.fillRect(a2 + 12, d2 - 10, 5, 20);
                i2++;*/
    }
}


