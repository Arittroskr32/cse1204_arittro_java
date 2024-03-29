import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    Graphics g;
    Container c;
    JLabel labelheading = new JLabel();
    Font fn = new Font("arial", Font.BOLD, 16);

    public MyFrame() {
        c = this.getContentPane();
        c.setLayout(null);
        labelheading.setBounds(185, 10, 150, 70);
        labelheading.setBackground(Color.yellow);
        labelheading.setFont(fn);
        labelheading.setText("Color test");
        c.add(labelheading);
        g.drawOval(100, 100, 70, 70);

    }

}

public class myproject {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setBounds(1000, 250, 500, 500);
        frame.setTitle("Color Check");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
