// Source code is decompiled from a .class file using FernFlower decompiler.
package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;

    mini(String pin) {
        this.pin = pin;
        this.getContentPane().setBackground(new Color(135, 206, 235));
        this.setSize(400, 600);
        this.setLocation(20, 20);
        this.setLayout((LayoutManager)null);
        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 400, 200);
        this.add(label1);
        JLabel label2 = new JLabel("Statement");
        label2.setFont(new Font("System", 1, 15));
        label2.setBounds(150, 20, 200, 20);
        this.add(label2);
        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        this.add(label3);
        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        this.add(label4);

        String var10001;
        try {
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '" + pin + "'");

            while(resultSet.next()) {
                var10001 = resultSet.getString("card_number").substring(0, 4);
                label3.setText("Card Number:  " + var10001 + "XXXXXXXX" + resultSet.getString("card_number").substring(12));
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        try {
            int balance = 0;
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");

            while(resultSet.next()) {
                var10001 = label1.getText();
                label1.setText(var10001 + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            label4.setText("Your Total Balance is Rs " + balance);
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        this.button = new JButton("Exit");
        this.button.setBounds(20, 500, 100, 25);
        this.button.addActionListener(this);
        this.button.setBackground(Color.BLACK);
        this.button.setForeground(Color.WHITE);
        this.add(this.button);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
