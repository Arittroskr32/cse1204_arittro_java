import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

class MyFrameCSE extends JFrame {
    JLabel label1 = new JLabel();
    Container c;
    Font fn = new Font("Arial", Font.BOLD, 20);
    // Color color = new Color(255, 255, 255);

    public MyFrameCSE() {
        c = this.getContentPane();
        c.setLayout(null);
        label1.setBounds(100, 50, 300, 30);
        label1.setText("Wecome to Java Label for CSE");
        label1.setFont(fn);
        label1.setForeground(new Color(100, 200, 100));
        c.add(label1);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(0, 255, 0));
        g.drawRect(150, 200, 250, 175);
        g.fillRect(150, 200, 250, 175);
        g.setColor(new Color(255, 0, 0));
        g.fillOval(230, 230, 100, 100);
    }
}

public class Main extends JFrame {
    public static void main(String[] args) {
        System.out.println("Welcome to GUI in Java");
        MyFrameCSE f = new MyFrameCSE();

        ImageIcon image = new ImageIcon("1662532671452.jpg");
        f.setIconImage(image.getImage());

        f.setTitle("CSE 1203 Class");
        f.setVisible(true);
        f.setBounds(1000, 100, 500, 550);
        // f.setSize(300, 400);
        // f.setBackground(new Color(100, 100, 100));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}