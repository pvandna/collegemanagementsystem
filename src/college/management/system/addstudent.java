package college.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.regex.Pattern;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class addstudent extends JFrame implements ActionListener {

    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfaadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    addstudent() {
        setSize(900, 700);
        setLocation(350, 50);
        setLayout(null);
        JLabel heading = new JLabel("NEW STUDENT DETAILS");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 30));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        JLabel lblfname = new JLabel("Father Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 30));
        add(lblfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        JLabel lblrollno = new JLabel("Roll NO.");
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD, 30));
        add(lblrollno);

        labelrollno = new JLabel("1533" + first4);
        labelrollno.setBounds(200, 200, 200, 30);
        labelrollno.setFont(new Font("serif", Font.BOLD, 30));
        add(labelrollno);

        JLabel lbldob = new JLabel("D.O.B");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 30));
        add(lbldob);

        dcdob = new JDateChooser();
        //dcdob.setCalendar(null);
        dcdob.setBounds(600, 200, 150, 30);
        dcdob.getDateEditor().setEnabled(false);
        add(dcdob);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("serif", Font.BOLD, 30));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone no.");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 30));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 30));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        JLabel lblx = new JLabel("Class X%");
        lblx.setBounds(50, 350, 250, 30);
        lblx.setFont(new Font("serif", Font.BOLD, 30));
        add(lblx);

        tfx = new JTextField();
        tfx.setBounds(200, 350, 150, 30);
        add(tfx);

        JLabel lblxii = new JLabel("Class XII%");
        lblxii.setBounds(50, 400, 250, 30);
        lblxii.setFont(new Font("serif", Font.BOLD, 30));
        add(lblxii);

        tfxii = new JTextField();
        tfxii.setBounds(200, 400, 150, 30);
        add(tfxii);

        JLabel lblaadhar = new JLabel("Aadhar no");
        lblaadhar.setBounds(400, 400, 250, 30);
        lblaadhar.setFont(new Font("serif", Font.BOLD, 30));
        add(lblaadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 400, 150, 30);
        add(tfaadhar);

        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(400, 300, 250, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 30));
        add(lblcourse);

        String course[] = {"MSC", "MCA", "MA", "BCA", "BSC", "BA", "BBA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(600, 300, 250, 30);
        add(cbcourse);

        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(400, 350, 250, 30);
        lblbranch.setFont(new Font("serif", Font.BOLD, 30));
        add(lblbranch);

        String branch[] = {"Computer Science", "Physics", "Chemistry", "Hindi", "Maths", "Music", "Psychology"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600, 350, 250, 30);
        add(cbbranch);

        submit = new JButton("SUBMIT");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.GREEN);
        submit.addActionListener(this);                          ////for preesing on login event ocuur
        submit.setFont(new Font("serif", Font.BOLD, 21));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.RED);
        cancel.addActionListener(this);                     //for preesing on cancel event ocuur
        cancel.setFont(new Font("serif", Font.BOLD, 21));
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii = tfxii.getText();
            String aadhar = tfaadhar.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();

            if (tfemail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill E-mail ID");

            } else if (!Pattern.matches("^[a-z A-Z 0-9+-._]+@[A-Z a-z 0-9.-]+$", tfemail.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid email format ");
                tfemail.setText("");
                tfemail.grabFocus();

            } else if (tfaadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Aadhar no.");

            } else if (!Pattern.matches("^[0-9]+$", tfaadhar.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid Aadhar format");
                tfaadhar.setText("");
                tfaadhar.grabFocus();

            } else if (!Pattern.matches("^[0-9]+$", tfphone.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid Phone No");
                tfphone.setText("");
                tfphone.grabFocus();

            } else if (!Pattern.matches("^[0-9]+$", tfxii.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid % of xii");
                tfxii.setText("");
                tfxii.grabFocus();

            } else if (!Pattern.matches("^[0-9]+$", tfx.getText())) {
                JOptionPane.showMessageDialog(this, "Invalid % of x");
                tfx.setText("");
                tfx.grabFocus();

            } else {
                try {
                    String query = "insert into student values( '" + name + " ', '" + fname + " ','" + rollno + " ','" + dob + " ','" + address + " ','" + phone + " ','" + email + " ','" + x + " ','" + xii + " ','" + aadhar + " ','" + course + " ','" + branch + " ')";
                    conn con = new conn();
                    con.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Student Detail Inserted Sucessfully");
                    setVisible(false);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        }
        if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addstudent();
    }
}
