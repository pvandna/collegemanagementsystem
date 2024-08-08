package college.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton login, cancel;
    JTextField jtuname, jtpassword;

    Login() //constuctor
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        jtuname = new JTextField();
        jtuname.setBounds(150, 20, 150, 20);
        add(jtuname);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);

        jtpassword = new JPasswordField();
        jtpassword.setBounds(150, 70, 150, 20);
        add(jtpassword);

        login = new JButton("login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.GREEN);
        login.addActionListener(this);                          ////for preesing on login event ocuur
        login.setFont(new Font("serif", Font.BOLD, 21));
        add(login);

        cancel = new JButton("cancel");
        cancel.setBounds(200, 140, 120, 30);
        cancel.setBackground(Color.RED);
        cancel.addActionListener(this);                     //for preesing on cancel event ocuur
        cancel.setFont(new Font("serif", Font.BOLD, 21));
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project picture/login.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imag = new JLabel(i3);
        imag.setBounds(350, 20, 200, 200);         //  because setLayout(null);
        add(imag);

        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent obj) {
        if (obj.getSource() == login) {
            if (jtuname.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "fill username");

            } else if (jtpassword.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "fill password");
            } else {
                String username = jtuname.getText();
                String password = jtpassword.getText();
                // String query ="select * from login where username=  ' " +username + " ' and password= ' "+password+" ' "; 
                String query = "select * from login where username='" + username + "' and password='" + password + "'";
                try {

                    conn con1 = new conn();                      //connection created with sql
                    ResultSet rs = con1.s.executeQuery(query);
                    if (rs.next()) {
                        setVisible(false);                           //if username and passwod is correct

                        new project();                               //then open next frame

                    } else {
                        JOptionPane.showMessageDialog(null, "invalid username and password");
                        jtuname.setText("");
                         jtpassword.setText("");
                       // setVisible(false);
                        //  new project(); 
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } else if (obj.getSource() == cancel) {
            setVisible(false);
        }

    }

    public static void main(String args[]) {
        new Login();
    }

}
