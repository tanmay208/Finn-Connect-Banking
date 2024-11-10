// Source code is decompiled from a .class file using FernFlower decompiler.
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1;
    JButton button2;
    JButton button3;

    Login() {
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        this.add(image);
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        this.add(iimage);
        this.label1 = new JLabel("WELCOME TO FINN CONNECT");
        this.label1.setForeground(Color.WHITE);
        this.label1.setFont(new Font("AvantGarde", 1, 38));
        this.label1.setBounds(150, 125, 600, 40);
        this.add(this.label1);
        this.label2 = new JLabel("Account No:");
        this.label2.setFont(new Font("Raleway", 1, 28));
        this.label2.setForeground(Color.WHITE);
        this.label2.setBounds(150, 190, 375, 30);
        this.add(this.label2);
        this.textField2 = new JTextField(15);
        this.textField2.setBounds(325, 190, 230, 30);
        this.textField2.setFont(new Font("Arial", 1, 14));
        this.add(this.textField2);
        this.label3 = new JLabel("PIN: ");
        this.label3.setFont(new Font("Raleway", 1, 28));
        this.label3.setForeground(Color.WHITE);
        this.label3.setBounds(150, 250, 375, 30);
        this.add(this.label3);
        this.passwordField3 = new JPasswordField(15);
        this.passwordField3.setBounds(325, 250, 230, 30);
        this.passwordField3.setFont(new Font("Arial", 1, 14));
        this.add(this.passwordField3);
        this.button1 = new JButton("SIGN IN");
        this.button1.setFont(new Font("Arial", 1, 14));
        this.button1.setForeground(Color.WHITE);
        this.button1.setBackground(Color.BLACK);
        this.button1.setBounds(300, 300, 100, 30);
        this.button1.addActionListener(this);
        this.add(this.button1);
        this.button2 = new JButton("CLEAR");
        this.button2.setFont(new Font("Arial", 1, 14));
        this.button2.setForeground(Color.WHITE);
        this.button2.setBackground(Color.BLACK);
        this.button2.setBounds(430, 300, 100, 30);
        this.button2.addActionListener(this);
        this.add(this.button2);
        this.button3 = new JButton("SIGN UP");
        this.button3.setFont(new Font("Arial", 1, 14));
        this.button3.setForeground(Color.WHITE);
        this.button3.setBackground(Color.BLACK);
        this.button3.setBounds(300, 350, 230, 30);
        this.button3.addActionListener(this);
        this.add(this.button3);
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, 1);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        this.add(iiimage);
        this.setLayout((LayoutManager)null);
        this.setSize(850, 480);
        this.setLocation(450, 200);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == this.button1) {
                Connn c = new Connn();
                String cardno = this.textField2.getText();
                String pin = this.passwordField3.getText();
                String q = "select * from login where card_number = '" + cardno + "' and  pin = '" + pin + "'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    this.setVisible(false);
                    new main_Class(pin);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Incorrect Card Number or PIN");
                }
            } else if (e.getSource() == this.button2) {
                this.textField2.setText("");
                this.passwordField3.setText("");
            } else if (e.getSource() == this.button3) {
                new Signup();
                this.setVisible(false);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
