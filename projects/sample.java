import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFormCalculator extends JFrame implements ActionListener {
    Container c;
    JLabel labeldisplay = new JLabel("0");
    Font fn = new Font("Digitfacewide", Font.BOLD, 17);
    JButton btn[] = new JButton[16];
    int row, col;
    String str1 = "", str2 = "", op = "";

    MyFormCalculator() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        // set the properties of the boject
        labeldisplay.setBounds(15, 30, 250, 50);
        labeldisplay.setBackground(Color.LIGHT_GRAY);
        labeldisplay.setForeground(Color.BLACK);
        labeldisplay.setOpaque(true);
        labeldisplay.setHorizontalAlignment(JLabel.RIGHT);
        labeldisplay.setFont(fn);
        // creat buttons(1-9)
        row = 1;
        col = 1;
        for (int i = 1; i <= 9; i++) {
            btn[i] = new JButton(Integer.toString(i));
            btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
            c.add(btn[i]);
            btn[i].addActionListener(this);
            col++;
            if (col > 3) {
                row++;
                col = 1;
            }
        }

        c.add(labeldisplay);

    }

    public void actionPerformed(ActionEvent e) {

    }// end of action performed
}

public class sample {
    public static void main(String[] args) {
        MyFormCalculator frame = new MyFormCalculator();
        frame.setTitle("My Calculator");
        frame.setBounds(1000, 200, 300, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
