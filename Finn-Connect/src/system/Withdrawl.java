// Source code is decompiled from a .class file using FernFlower decompiler.
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1;
    JButton b2;

    Withdrawl(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        this.add(l3);
        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("System", 1, 16));
        label1.setBounds(500, 280, 700, 35);
        l3.add(label1);
        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("System", 1, 16));
        label2.setBounds(500, 345, 400, 35);
        l3.add(label2);
        this.textField = new TextField();
        this.textField.setBackground(new Color(65, 125, 128));
        this.textField.setForeground(Color.WHITE);
        this.textField.setBounds(500, 395, 320, 25);
        this.textField.setFont(new Font("Raleway", 1, 22));
        l3.add(this.textField);
        this.b1 = new JButton("WITHDRAW");
        this.b1.setBounds(900, 460, 150, 35);
        this.b1.setBackground(new Color(65, 125, 128));
        this.b1.setForeground(Color.WHITE);
        this.b1.addActionListener(this);
        l3.add(this.b1);
        this.b2 = new JButton("BACK");
        this.b2.setBounds(900, 510, 150, 35);
        this.b2.setBackground(new Color(65, 125, 128));
        this.b2.setForeground(Color.WHITE);
        this.b2.addActionListener(this);
        l3.add(this.b2);
        this.setLayout((LayoutManager)null);
        this.setSize(1550, 1080);
        this.setLocation(0, 0);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b1) {
            try {
                String amount = this.textField.getText();
                Date date = new Date();
                if (this.textField.getText().equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Please enter the Amount you want to withdraw");
                } else {
                    Connn c = new Connn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + this.pin + "'");
                    int balance = 0;

                    while(resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog((Component)null, "Insufficient Balance");
                        return;
                    }

                    String var10001 = this.pin;
                    c.statement.executeUpdate("insert into bank values('" + var10001 + "', '" + String.valueOf(date) + "', 'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog((Component)null, "Rs. " + amount + " Debited Successfully");
                    this.setVisible(false);
                    new main_Class(this.pin);
                }
            } catch (Exception var7) {
            }
        } else if (e.getSource() == this.b2) {
            this.setVisible(false);
            new main_Class(this.pin);
        }

    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
