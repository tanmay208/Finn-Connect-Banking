// Source code is decompiled from a .class file using FernFlower decompiler.
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        this.add(l3);
        JLabel label = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label.setBounds(510, 250, 700, 35);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("System", 1, 23));
        l3.add(label);
        this.b1 = new JButton("Rs. 100");
        this.b1.setForeground(Color.WHITE);
        this.b1.setBackground(new Color(65, 125, 128));
        this.b1.setBounds(510, 330, 150, 35);
        this.b1.addActionListener(this);
        l3.add(this.b1);
        this.b2 = new JButton("Rs. 500");
        this.b2.setForeground(Color.WHITE);
        this.b2.setBackground(new Color(65, 125, 128));
        this.b2.setBounds(800, 330, 150, 35);
        this.b2.addActionListener(this);
        l3.add(this.b2);
        this.b3 = new JButton("Rs. 1000");
        this.b3.setForeground(Color.WHITE);
        this.b3.setBackground(new Color(65, 125, 128));
        this.b3.setBounds(510, 380, 150, 35);
        this.b3.addActionListener(this);
        l3.add(this.b3);
        this.b4 = new JButton("Rs. 2000");
        this.b4.setForeground(Color.WHITE);
        this.b4.setBackground(new Color(65, 125, 128));
        this.b4.setBounds(800, 380, 150, 35);
        this.b4.addActionListener(this);
        l3.add(this.b4);
        this.b5 = new JButton("Rs. 5000");
        this.b5.setForeground(Color.WHITE);
        this.b5.setBackground(new Color(65, 125, 128));
        this.b5.setBounds(510, 430, 150, 35);
        this.b5.addActionListener(this);
        l3.add(this.b5);
        this.b6 = new JButton("Rs. 10000");
        this.b6.setForeground(Color.WHITE);
        this.b6.setBackground(new Color(65, 125, 128));
        this.b6.setBounds(800, 430, 150, 35);
        this.b6.addActionListener(this);
        l3.add(this.b6);
        this.b7 = new JButton("BACK");
        this.b7.setForeground(Color.WHITE);
        this.b7.setBackground(new Color(65, 125, 128));
        this.b7.setBounds(800, 490, 150, 35);
        this.b7.addActionListener(this);
        l3.add(this.b7);
        this.setLayout((LayoutManager)null);
        this.setSize(1550, 1080);
        this.setLocation(0, 0);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b7) {
            this.setVisible(false);
            new main_Class(this.pin);
        } else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Connn c = new Connn();
            Date date = new Date();

            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + this.pin + "'");
                int balance = 0;

                while(resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != this.b7 && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog((Component)null, "Insuffient Balance");
                    return;
                }

                String var10001 = this.pin;
                c.statement.executeUpdate("insert into bank values('" + var10001 + "','" + String.valueOf(date) + "', 'withdrawl', '" + amount + "')");
                JOptionPane.showMessageDialog((Component)null, "Rs. " + amount + " Debited Successfully");
            } catch (Exception var7) {
                var7.printStackTrace();
            }

            this.setVisible(false);
            new main_Class(this.pin);
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
