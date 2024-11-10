// Source code is decompiled from a .class file using FernFlower decompiler.
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JCheckBox c4;
    JCheckBox c5;
    JCheckBox c6;
    JButton s;
    JButton c;
    String formno;

    Signup3(String formno) {
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        this.add(image);
        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", 1, 22));
        l1.setBounds(280, 40, 400, 40);
        this.add(l1);
        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", 1, 22));
        l2.setBounds(280, 70, 400, 40);
        this.add(l2);
        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", 1, 18));
        l3.setBounds(100, 140, 200, 30);
        this.add(l3);
        this.r1 = new JRadioButton("Saving Account");
        this.r1.setFont(new Font("Raleway", 1, 16));
        this.r1.setBackground(new Color(135, 206, 235));
        this.r1.setBounds(100, 180, 150, 30);
        this.add(this.r1);
        this.r2 = new JRadioButton("Fixed Deposit Account");
        this.r2.setFont(new Font("Raleway", 1, 16));
        this.r2.setBackground(new Color(135, 206, 235));
        this.r2.setBounds(350, 180, 300, 30);
        this.add(this.r2);
        this.r3 = new JRadioButton("Current Account");
        this.r3.setFont(new Font("Raleway", 1, 16));
        this.r3.setBackground(new Color(135, 206, 235));
        this.r3.setBounds(100, 220, 250, 30);
        this.add(this.r3);
        this.r4 = new JRadioButton("Recurring Deposit Account");
        this.r4.setFont(new Font("Raleway", 1, 16));
        this.r4.setBackground(new Color(135, 206, 235));
        this.r4.setBounds(350, 220, 250, 30);
        this.add(this.r4);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.r1);
        buttonGroup.add(this.r2);
        buttonGroup.add(this.r3);
        buttonGroup.add(this.r4);
        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", 1, 18));
        l4.setBounds(100, 300, 200, 30);
        this.add(l4);
        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", 1, 12));
        l5.setBounds(100, 330, 200, 20);
        this.add(l5);
        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", 1, 18));
        l6.setBounds(330, 300, 250, 30);
        this.add(l6);
        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway", 1, 12));
        l7.setBounds(330, 330, 500, 20);
        this.add(l7);
        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", 1, 18));
        l8.setBounds(100, 370, 200, 30);
        this.add(l8);
        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", 1, 18));
        l9.setBounds(330, 370, 200, 30);
        this.add(l9);
        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", 1, 12));
        l10.setBounds(100, 400, 200, 20);
        this.add(l10);
        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", 1, 18));
        l11.setBounds(100, 450, 200, 30);
        this.add(l11);
        this.c1 = new JCheckBox("ATM CARD");
        this.c1.setBackground(new Color(135, 206, 235));
        this.c1.setFont(new Font("Raleway", 1, 16));
        this.c1.setBounds(100, 500, 200, 30);
        this.add(this.c1);
        this.c2 = new JCheckBox("Internet Banking");
        this.c2.setBackground(new Color(135, 206, 235));
        this.c2.setFont(new Font("Raleway", 1, 16));
        this.c2.setBounds(350, 500, 200, 30);
        this.add(this.c2);
        this.c3 = new JCheckBox("Mobile Banking");
        this.c3.setBackground(new Color(135, 206, 235));
        this.c3.setFont(new Font("Raleway", 1, 16));
        this.c3.setBounds(100, 550, 200, 30);
        this.add(this.c3);
        this.c4 = new JCheckBox("EMAIL Alerts");
        this.c4.setBackground(new Color(135, 206, 235));
        this.c4.setFont(new Font("Raleway", 1, 16));
        this.c4.setBounds(350, 550, 200, 30);
        this.add(this.c4);
        this.c5 = new JCheckBox("Cheque Book");
        this.c5.setBackground(new Color(135, 206, 235));
        this.c5.setFont(new Font("Raleway", 1, 16));
        this.c5.setBounds(100, 600, 200, 30);
        this.add(this.c5);
        this.c6 = new JCheckBox("E-Statement");
        this.c6.setBackground(new Color(135, 206, 235));
        this.c6.setFont(new Font("Raleway", 1, 16));
        this.c6.setBounds(350, 600, 200, 30);
        this.add(this.c6);
        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.", true);
        c7.setBackground(new Color(135, 206, 235));
        c7.setFont(new Font("Raleway", 1, 12));
        c7.setBounds(100, 680, 600, 20);
        this.add(c7);
        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", 1, 14));
        l12.setBounds(700, 10, 100, 30);
        this.add(l12);
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", 1, 14));
        l13.setBounds(760, 10, 60, 30);
        this.add(l13);
        this.s = new JButton("Submit");
        this.s.setFont(new Font("Raleway", 1, 14));
        this.s.setBackground(Color.BLACK);
        this.s.setForeground(Color.WHITE);
        this.s.setBounds(250, 720, 100, 30);
        this.s.addActionListener(this);
        this.add(this.s);
        this.c = new JButton("Cancel");
        this.c.setFont(new Font("Raleway", 1, 14));
        this.c.setBackground(Color.BLACK);
        this.c.setForeground(Color.WHITE);
        this.c.setBounds(420, 720, 100, 30);
        this.c.addActionListener(this);
        this.add(this.c);
        this.getContentPane().setBackground(new Color(135, 206, 235));
        this.setSize(850, 800);
        this.setLayout((LayoutManager)null);
        this.setLocation(400, 20);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (this.r1.isSelected()) {
            atype = "Saving Account";
        } else if (this.r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (this.r3.isSelected()) {
            atype = "Current Account";
        } else if (this.r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = ran.nextLong() % 90000000L + 1409963000000000L;
        String cardno = "" + Math.abs(first7);
        long first3 = ran.nextLong() % 9000L + 1000L;
        String pin = "" + Math.abs(first3);
        String fac = "";
        if (this.c1.isSelected()) {
            fac = fac + "ATM CARD ";
        } else if (this.c2.isSelected()) {
            fac = fac + "Internet Banking";
        } else if (this.c3.isSelected()) {
            fac = fac + "Mobile Banking";
        } else if (this.c4.isSelected()) {
            fac = fac + "EMAIL Alerts";
        } else if (this.c5.isSelected()) {
            fac = fac + "Cheque Book";
        } else if (this.c6.isSelected()) {
            fac = fac + "E-Statement";
        }

        try {
            if (e.getSource() == this.s) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog((Component)null, "Fill all the fields");
                } else {
                    Connn c1 = new Connn();
                    String q1 = "insert into signupthree values('" + this.formno + "', '" + atype + "','" + cardno + "','" + pin + "','" + fac + "')";
                    String q2 = "insert into login values('" + this.formno + "','" + cardno + "','" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog((Component)null, "Card Number : " + cardno + "\n Pin : " + pin);
                    new Deposit(pin);
                    this.setVisible(false);
                }
            } else if (e.getSource() == this.c) {
                System.exit(0);
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
