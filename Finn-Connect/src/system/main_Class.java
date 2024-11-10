// Source code is decompiled from a .class file using FernFlower decompiler.
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    String pin;

    main_Class(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        this.add(l3);
        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(510, 300, 700, 35);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("System", 1, 28));
        l3.add(label);
        this.b1 = new JButton("DEPOSIT");
        this.b1.setForeground(Color.WHITE);
        this.b1.setBackground(new Color(65, 125, 128));
        this.b1.setBounds(510, 370, 150, 35);
        this.b1.addActionListener(this);
        l3.add(this.b1);
        this.b2 = new JButton("CASH WITHDRAWAL");
        this.b2.setForeground(Color.WHITE);
        this.b2.setBackground(new Color(65, 125, 128));
        this.b2.setBounds(800, 370, 150, 35);
        this.b2.addActionListener(this);
        l3.add(this.b2);
        this.b3 = new JButton("FAST CASH");
        this.b3.setForeground(Color.WHITE);
        this.b3.setBackground(new Color(65, 125, 128));
        this.b3.setBounds(510, 420, 150, 35);
        this.b3.addActionListener(this);
        l3.add(this.b3);
        this.b4 = new JButton("STATEMENT");
        this.b4.setForeground(Color.WHITE);
        this.b4.setBackground(new Color(65, 125, 128));
        this.b4.setBounds(800, 420, 150, 35);
        this.b4.addActionListener(this);
        l3.add(this.b4);
        this.b5 = new JButton("PIN CHANGE");
        this.b5.setForeground(Color.WHITE);
        this.b5.setBackground(new Color(65, 125, 128));
        this.b5.setBounds(510, 470, 150, 35);
        this.b5.addActionListener(this);
        l3.add(this.b5);
        this.b6 = new JButton("BALANCE ENQUIRY");
        this.b6.setForeground(Color.WHITE);
        this.b6.setBackground(new Color(65, 125, 128));
        this.b6.setBounds(800, 470, 150, 35);
        this.b6.addActionListener(this);
        l3.add(this.b6);
        this.b7 = new JButton("EXIT");
        this.b7.setForeground(Color.WHITE);
        this.b7.setBackground(new Color(65, 125, 128));
        this.b7.setBounds(800, 520, 150, 35);
        this.b7.addActionListener(this);
        l3.add(this.b7);
        this.setLayout((LayoutManager)null);
        this.setSize(1550, 1080);
        this.setLocation(0, 0);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b1) {
            new Deposit(this.pin);
            this.setVisible(false);
        } else if (e.getSource() == this.b7) {
            System.exit(0);
        } else if (e.getSource() == this.b2) {
            new Withdrawl(this.pin);
            this.setVisible(false);
        } else if (e.getSource() == this.b6) {
            new BalanceEnquriy(this.pin);
            this.setVisible(false);
        } else if (e.getSource() == this.b3) {
            new FastCash(this.pin);
            this.setVisible(false);
        } else if (e.getSource() == this.b5) {
            new Pin(this.pin);
            this.setVisible(false);
        } else if (e.getSource() == this.b4) {
            new mini(this.pin);
        }

    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
