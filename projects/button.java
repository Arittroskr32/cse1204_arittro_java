import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton btnSubmit = new JButton("Submit");
    JButton btncancel = new JButton("Cancel");
    JButton btnrefresh = new JButton("Refresh");
    JLabel label1 = new JLabel();

    public MyFrame() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        // Adding Submit button properties
        btnSubmit.setBounds(100, 100, 100, 35);
        btnSubmit.setBackground(Color.green);
        btncancel.setBounds(220, 100, 100, 35);
        btncancel.setBackground(Color.red);
        btnrefresh.setBounds(340, 100, 100, 35);
        btnrefresh.setBackground(Color.BLACK);
        label1.setBounds(100, 170, 200, 35);
        label1.setText("Output is here");
        // Adding submit button to container
        c.add(btnSubmit);
        c.add(btncancel);
        c.add(btnrefresh);
        c.add(label1);
        // for actionListener
        btnSubmit.addActionListener(this);
        btncancel.addActionListener(this);
        btnrefresh.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            label1.setText("Submitt button is clicked");
        }
        if (e.getSource() == btncancel) {
            label1.setText("Exit");
        }
        if (e.getSource() == btnrefresh) {
            label1.setText("");
        }
    }
}

public class button {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("My Button");
        frame.setBounds(200, 200, 500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
