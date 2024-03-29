
// Door Lock System

import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ttac extends JFrame implements ActionListener {
    Container c;
    JButton btn[] = new JButton[12];
    Font fn = new Font("Time New Roman", Font.BOLD, 24);
    Font fnfordisplay = new Font("Time New Roman", Font.BOLD, 20);
    JLabel label = new JLabel("Enter Passcode");
    String pass = "1111", str1 = "";
    int row, col;

    public ttac() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        label.setBounds(15, 10, 220, 60);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(fnfordisplay);
        int row, col;

        row = 1;
        col = 1;
        for (int i = 1; i < 10; i++) {
            btn[i] = new JButton(Integer.toString(i));
            btn[i].setBounds(20 + (col - 1) * 70, 10 + row * 70, 70, 70);
            c.add(btn[i]);
            btn[i].addActionListener(this);
            col++;
            if (col > 3) {
                row++;
                col = 1;
            }
        }
        // for C sign
        row = 4;
        col = 1;
        int i = 10;
        btn[i] = new JButton("<-");
        btn[i].setBounds(20 + (col - 1) * 70, 10 + row * 70, 70, 70);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for 0 button
        row = 4;
        col = 2;
        i = 0;
        btn[i] = new JButton(Integer.toString(i));
        btn[i].setBounds(20 + (col - 1) * 70, 10 + row * 70, 70, 70);
        c.add(btn[i]);
        btn[i].addActionListener(this);
        // for = Button
        row = 4;
        col = 3;
        i = 11;
        btn[i] = new JButton("=");
        btn[i].setBounds(20 + (col - 1) * 70, 10 + row * 70, 70, 70);
        c.add(btn[i]);
        btn[i].addActionListener(this);

        c.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <= 9; i++) {
            if (e.getSource() == btn[i]) {
                str1 = str1 + Integer.toString(i);
                label.setText(str1);
            }
        } // end for digit
          // for = sign
        if (e.getSource() == btn[11]) {
            if (str1.equals("1111")) {
                label.setText("Door Unlocked");
                str1 = "";
            } else {
                label.setText("Incorrect");
                str1 = "";
            }
        }
        // for C Button
        if (e.getSource() == btn[10]) {
            str1 = "";
            label.setText("");
        }
    }

}

public class topic4 {
    public static void main(String[] args) {
        ttac frame = new ttac();
        frame.setTitle("Tic Tac");
        frame.setBackground(Color.DARK_GRAY);
        frame.setBounds(1100, 200, 270, 420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
