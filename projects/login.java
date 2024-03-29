import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myfr extends JFrame implements ActionListener {
    Container c;
    Font ft = new Font("Arial", Font.BOLD, 17);
    JLabel labelLogin = new JLabel("Login");
    JLabel labelPass = new JLabel("Password");
    JTextField textLogin = new JTextField();
    JPasswordField textPass = new JPasswordField();
    JButton btnSubmit = new JButton("Submit", null);
    JButton btnRefresh = new JButton("Refresh", null);
    JLabel labelDisplay = new JLabel();

    public Myfr() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        labelLogin.setBounds(100, 50, 70, 35);
        labelLogin.setFont(ft);
        textLogin.setBounds(190, 50, 150, 30);
        textLogin.setFont(ft);
        labelPass.setBounds(100, 90, 100, 35);
        labelPass.setFont(ft);
        textPass.setBounds(190, 90, 150, 30);
        textPass.setFont(ft);
        btnSubmit.setBackground(Color.GREEN);
        btnSubmit.setForeground(Color.red);
        btnSubmit.setBounds(190, 125, 80, 35);
        // btnSubmit.setFont(ft);
        btnSubmit.addActionListener(this);
        btnRefresh.setBounds(280, 125, 80, 35);
        labelDisplay.setBounds(190, 165, 200, 35);
        labelDisplay.setFont(ft);
        btnRefresh.addActionListener(this);

        c.add(labelLogin);
        c.add(textLogin);
        c.add(labelPass);
        c.add(textPass);
        c.add(btnSubmit);
        c.add(btnRefresh);
        c.add(labelDisplay);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            String login = textLogin.getText();
            String pass = String.valueOf(textPass.getPassword());
            if (login.equals("admin") && pass.equals("admin")) {
                labelDisplay.setText("Login Successful");
            } else {
                labelDisplay.setText("Login Failed");
            }
        }
        if (e.getSource() == btnRefresh) {
            textLogin.setText("");
            textPass.setText("");
            labelDisplay.setText(" ");
        }
    }

}

public class login {

    public static void main(String[] args) {
        Myfr frame = new Myfr();
        frame.setBounds(20, 20, 1000, 700);
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}