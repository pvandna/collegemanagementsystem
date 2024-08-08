
package college.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class updatestudent extends JFrame implements ActionListener{
    JTextField tfcourse,tfaddress,tfphone,tfemail,tfbranch;
    JLabel labelrollno;
    JButton submit,cancel;
    Choice crollno;
    
    
    
    updatestudent()
             {
                 setSize(900,650);
                 setLocation(350,50);
                 setLayout(null);
                 
                 JLabel heading=new JLabel("UPDATE STUDENT DETAILS");
                 heading.setBounds(50,10,500,50);
                 heading.setFont(new Font("serif",Font.ITALIC,35));
                 add(heading);
                 
                 JLabel lblrollnumber=new JLabel("Sellect  roll no");
        lblrollnumber.setBounds(50,100,200,20);
        lblrollnumber.setFont(new Font("serif",Font.ITALIC,20));
        add(lblrollnumber);
          
        crollno=new Choice();
        crollno.setBounds(250, 100, 200, 20);
        add(crollno);
        
        try
        {  
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from student ");
            while(rs.next())
            {
                crollno.add(rs.getString("rollno"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
                 
                 JLabel lblname=new JLabel("Name");
                 lblname.setBounds(50,150,100,30);
                 lblname.setFont(new Font("serif",Font.BOLD,30));
                 add(lblname);
                  
                 JLabel labelname= new JLabel();
                labelname.setBounds(200,150,150,30);
                labelname.setFont(new Font("serif",Font.BOLD,20));
                add(labelname);
                 
                 JLabel lblfname=new JLabel("Father Name");
                 lblfname.setBounds(400,150,200,30);
                 lblfname.setFont(new Font("serif",Font.BOLD,30));
                 add(lblfname);
                  
                 JLabel labelfname= new JLabel();
                labelfname.setBounds(600,150,150,30);
                labelfname.setFont(new Font("serif",Font.BOLD,20));
                add(labelfname);
                 
                 
                 JLabel lblrollno=new JLabel("Roll NO");
                 lblrollno.setBounds(50,200,200,30);
                 lblrollno.setFont(new Font("serif",Font.BOLD,30));
                 add(lblrollno);
                  
                 labelrollno=new JLabel();
                 labelrollno.setBounds(200,200,200,30);
                 labelrollno.setFont(new Font("serif",Font.BOLD,30));
                 add(labelrollno);
                  
                 JLabel lbldob=new JLabel("D.O.B");
                 lbldob.setBounds(400,200,200,30);
                 lbldob.setFont(new Font("serif",Font.BOLD,30));
                 add(lbldob);
                 
                 JLabel labeldob=new JLabel();
                labeldob.setBounds(600, 200, 150, 30);
                labeldob.setFont(new Font("serif",Font.BOLD,20));
                 add(labeldob);
                 
                 JLabel lbladdress=new JLabel("Address");
                 lbladdress.setBounds(50,250,200,30);
                 lbladdress.setFont(new Font("serif",Font.BOLD,30));
                 add(lbladdress);
                  
                  tfaddress= new JTextField();
                tfaddress.setBounds(200,250,150,30);
                add(tfaddress);
                
                 JLabel lblphone=new JLabel("Phone no");
                 lblphone.setBounds(400,250,200,30);
                 lblphone.setFont(new Font("serif",Font.BOLD,30));
                 add(lblphone);
                  
                  tfphone= new JTextField();
                tfphone.setBounds(600,250,150,30);
                add(tfphone);
                 
                JLabel lblemail=new JLabel("Email Id");
                 lblemail.setBounds(50,300,200,30);
                 lblemail.setFont(new Font("serif",Font.BOLD,30));
                 add(lblemail);
                  
                  tfemail= new JTextField();
                tfemail.setBounds(200,300,150,30);
                add(tfemail);
                 
                 
                 JLabel  lblx=new JLabel("class X %");
                 lblx.setBounds(50,350,250,30);
                 lblx.setFont(new Font("serif",Font.BOLD,30));
                 add(lblx);
                    
                JLabel labelx= new JLabel();
                labelx.setBounds(250,350,150,30);
                labelx.setFont(new Font("serif",Font.BOLD,20));
                add(labelx);
                 
                 JLabel  lblxii=new JLabel("class Xii %");
                 lblxii.setBounds(50,400,250,30);
                 lblxii.setFont(new Font("serif",Font.BOLD,30));
                 add(lblxii);
                    
                
                 JLabel labelxii= new JLabel();
                labelxii.setBounds(250,400,150,30);
                labelxii.setFont(new Font("serif",Font.BOLD,20));
                add(labelxii);

                  JLabel  lblaadhar=new JLabel("Aadhar no");
                 lblaadhar.setBounds(400,400,250,30);
                 lblaadhar.setFont(new Font("serif",Font.BOLD,30));
                 add(lblaadhar);
                    
                
                 JLabel labelaadhar= new JLabel();
                labelaadhar.setBounds(600,400,150,30);
                labelaadhar.setFont(new Font("serif",Font.BOLD,20));
                add(labelaadhar);

                  JLabel  lblcourse=new JLabel("Course");
                 lblcourse.setBounds(400,300,250,30);
                 lblcourse.setFont(new Font("serif",Font.BOLD,30));
                 add(lblcourse);
                     
                  
                 tfcourse=new JTextField();
                 tfcourse.setBounds(600, 300, 250, 30);
                 add(tfcourse);
                 
                 JLabel  lblbranch=new JLabel("Branch");
                 lblbranch.setBounds(400,350,250,30);
                 lblbranch.setFont(new Font("serif",Font.BOLD,30));
                 add(lblbranch);
                     
                 
                 tfbranch=new JTextField();
                 tfbranch.setBounds(600, 350, 250, 30);
                 add(tfbranch);
                 
                 try
                 {
                     conn c=new conn();
                     String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
                     ResultSet rs=c.s.executeQuery(query);
                     while(rs.next())
                     {
                         labelname.setText(rs.getString("name"));
                         labelfname.setText(rs.getString("fname"));
                         labeldob.setText(rs.getString("dob"));
                         tfaddress.setText(rs.getString("address"));
                         tfphone.setText(rs.getString("phone"));
                         tfemail.setText(rs.getString("email"));
                         labelx.setText(rs.getString("calss_x"));
                         labelxii.setText(rs.getString("class_xii"));
                         labelaadhar.setText(rs.getString("aadhar"));
                         labelrollno.setText(rs.getString("rollno"));
                         tfcourse.setText(rs.getString("course"));
                         tfbranch.setText(rs.getString("branch"));
                     }
                     
                 }
                 catch(Exception e)
                 {
                     System.out.println(e);
                 }
                 
                 crollno .addItemListener(new ItemListener ()                                 //inside calling  start
                 {
                     public void itemStateChanged(ItemEvent ie)
                     {
                         
                           try
                 {
                     conn c=new conn();
                     String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
                     ResultSet rs=c.s.executeQuery(query);
                     while(rs.next())
                     {
                         labelname.setText(rs.getString("name"));
                         labelfname.setText(rs.getString("fname"));
                         labeldob.setText(rs.getString("dob"));
                         tfaddress.setText(rs.getString("address"));
                         tfphone.setText(rs.getString("phone"));
                         tfemail.setText(rs.getString("email"));
                         labelx.setText(rs.getString("calss_x"));
                         labelxii.setText(rs.getString("class_xii"));
                         labelaadhar.setText(rs.getString("aadhar"));
                         labelrollno.setText(rs.getString("rollno"));
                         tfcourse.setText(rs.getString("course"));
                         tfbranch.setText(rs.getString("branch"));
                     }
                     
                 }
                 catch(Exception e)
                 {
                     System.out.println(e);
                 }
                 
                     }
                 }
                 );                                                                       //calling end
                 submit=new JButton("UPDATE");
                  submit.setBounds(250,500, 120, 30);
                   submit.setBackground(Color.GREEN);
                  submit.addActionListener(this);                          ////for preesing on login event ocuur
                  submit.setFont(new Font("serif",Font.BOLD,21));
                 add(submit);
        
                 cancel=new JButton("cancel");
                  cancel.setBounds(450,500, 120, 30);
                 cancel.setBackground(Color.RED);
                  cancel.addActionListener(this);                     //for preesing on cancel event ocuur
                 cancel.setFont(new Font("serif",Font.BOLD,21));
                   add(cancel);
        
                 
                  setVisible(true);
             }
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==submit) 
    {  
       String rollno=labelrollno.getText();
       String branch=tfbranch.getText();
       String course=tfcourse.getText();
       String address=tfaddress.getText();
       String phone=tfphone.getText();
       String email=tfemail.getText();
       
       
       try
       {
           String query="update  student  set address='"+address+" ' ,phone= '"+phone+" ', email='"+email+" ',course='"+course+" ', branch= '"+branch+" ' where rollno='"+rollno+"' ";
           conn con=new conn();
           con.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"student detail updated sucessfully");
           setVisible(false);
           
           
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
              
       
        
    }
    else 
    {
        setVisible(false);
    }
}
    
   
    public static void main(String [] args)
    {
        new updatestudent();
    }
}

