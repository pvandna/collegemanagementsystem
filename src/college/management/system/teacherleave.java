package college.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class teacherleave  extends JFrame implements ActionListener{
    Choice cempid,ctime;
    JDateChooser dcdate;
    JButton submit,cancel;
    
    teacherleave()
    {
        
        setSize(500,550);
        setLocation(550,100);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
         
         JLabel heading=new JLabel("APPLY LEAVE (TEACHER)");
        heading.setBounds(20,20,500,30);
        heading.setFont(new Font("tahema",Font.BOLD,20));
        add(heading);
        
        JLabel lblrollno=new JLabel("search by EMPID");
        lblrollno.setBounds(60,100,200,30);
        lblrollno.setFont(new Font("tahema",Font.PLAIN,20));
        add(lblrollno);
        
          
        cempid=new Choice();
        cempid.setBounds(60, 130, 200, 20);
        add(cempid);
        
        try
        {  
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from teacher ");
            while(rs.next())
            {
                cempid.add(rs.getString("empid"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        JLabel lbldate=new JLabel("DATE");
        lbldate.setBounds(60,180,200,30);
        lbldate.setFont(new Font("tahema",Font.PLAIN,20));
        add(lbldate);
        
        dcdate=new JDateChooser();
         dcdate.setBounds(60, 210, 200, 30);
        add(dcdate);
        
        JLabel lbltime=new JLabel("Time Duration");
        lbltime.setBounds(60,260,200,30);
        lbltime.setFont(new Font("tahema",Font.PLAIN,20));
        add(lbltime);
        
        ctime=new Choice();
        ctime.setBounds(60, 290, 200, 20);
        ctime.add("full day");
         ctime.add("half day");
        add(ctime);
         
        submit=new JButton("SUBMIT");
                  submit.setBounds(60,350, 150, 30);
                   submit.setBackground(Color.GREEN);
                  submit.addActionListener(this);                          ////for preesing on login event ocuur
                  submit.setFont(new Font("serif",Font.BOLD,21));
                 add(submit);
        
                 cancel=new JButton("cancel");
                  cancel.setBounds(230,350, 150, 30);
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
            String empid=cempid.getSelectedItem();
             String date=  ((JTextField)dcdate.getDateEditor().getUiComponent()).getText();
              String duration=ctime.getSelectedItem();
              
              String querry="insert into teacherleave values('"+empid+"','"+date+"','"+duration+"')";
              
              try
              {
                  conn c=new conn();
                  c.s.executeUpdate(querry);
                  JOptionPane.showMessageDialog(null,"leave confirmed");
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
    
    
    
    public static void main(String args[])
    {
        new teacherleave();
    }
}
