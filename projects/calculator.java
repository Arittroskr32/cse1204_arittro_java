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
        // for 0
        row = 4;
        col = 1;
        int i = 0;
        btn[i] = new JButton(Integer.toString(i));
        btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for =
        row = 4;
        col = 2;
        i = 10;
        btn[i] = new JButton("=");
        btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
        btn[i].setBackground(Color.YELLOW);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for +
        row = 4;
        col = 3;
        i = 11;
        btn[i] = new JButton("+");
        btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
        btn[i].setBackground(Color.blue);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for -
        row = 4;
        col = 4;
        i = 12;
        btn[i] = new JButton("-");
        btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
        btn[i].setBackground(Color.blue);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for /
        row = 3;
        col = 4;
        i = 13;
        btn[i] = new JButton("/");
        btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
        btn[i].setBackground(Color.blue);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for *
        row = 2;
        col = 4;
        i = 14;
        btn[i] = new JButton("*");
        btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
        btn[i].setBackground(Color.blue);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for C
        row = 1;
        col = 4;
        i = 15;
        btn[i] = new JButton("C");
        btn[i].setBounds(20 + (col - 1) * 60, 100 + (row - 1) * 60, 60, 60);
        btn[i].setBackground(Color.red);
        c.add(btn[i]);
        btn[i].addActionListener(this);

        // add objects to the container
        c.add(labeldisplay);

    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <= 9; i++) {
            if (e.getSource() == btn[i]) {
                str1 = str1 + Integer.toString(i);
                labeldisplay.setText(str1);
            }
        } // end for digit
          // for all operator
        for (int i = 11; i <= 14; i++) {
            if (e.getSource() == btn[i]) {
                switch (i) {
                    case 11:
                        op = "+";
                        break;
                    case 12:
                        op = "-";
                        break;
                    case 13:
                        op = "/";
                        break;
                    case 14:
                        op = "*";
                        break;
                }
                str2 = str1;
                str1 = "";
                labeldisplay.setText(str1);
                labeldisplay.setText(op);
            }
        }
        // for = button
        if (e.getSource() == btn[10]) {
            int result = 0;
            int x = Integer.parseInt(str2);
            int y = Integer.parseInt(str1);
            switch (op) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "*":
                    result = x * y;
                    break;
                case "/":
                    result = x / y;
                    break;
            }
            labeldisplay.setText(Integer.toString(result));
            str1 = "";
            str2 = "";
        } // end of = button
          // for c button
        if (e.getSource() == btn[15]) {
            str1 = "";
            str2 = "";
            labeldisplay.setText("0");
        }

    }// end of action performed
}

public class calculator {
    public static void main(String[] args) {
        MyFormCalculator frame = new MyFormCalculator();
        frame.setTitle("My Calculator");
        frame.setBounds(1000, 200, 300, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
