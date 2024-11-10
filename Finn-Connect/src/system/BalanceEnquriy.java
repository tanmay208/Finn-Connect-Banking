// Source code is decompiled from a .class file using FernFlower decompiler.
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {
    String pin;
    JLabel label2;
    JButton b1;

    BalanceEnquriy(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        this.add(l3);
        JLabel label1 = new JLabel("Your Current Balance is Rs ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", 1, 20));
        label1.setBounds(470, 350, 700, 35);
        l3.add(label1);
        this.label2 = new JLabel();
        this.label2.setForeground(Color.WHITE);
        this.label2.setFont(new Font("System", 1, 20));
        this.label2.setBounds(470, 400, 400, 35);
        l3.add(this.label2);
        this.b1 = new JButton("Back");
        this.b1.setBounds(800, 500, 150, 35);
        this.b1.setBackground(new Color(65, 125, 128));
        this.b1.setForeground(Color.WHITE);
        this.b1.addActionListener(this);
        l3.add(this.b1);
        int balance = 0;

        try {
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '" + pin + "'");

            while(resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        this.label2.setText("" + balance);
        this.setLayout((LayoutManager)null);
        this.setSize(1550, 1080);
        this.setLocation(0, 0);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new main_Class(this.pin);
    }

    public static void main(String[] args) {
        new BalanceEnquriy("");
    }
}
