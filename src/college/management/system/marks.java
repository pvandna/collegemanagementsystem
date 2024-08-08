
package college.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class marks extends JFrame implements ActionListener
{   
    String rollno;
    JButton cancel;
    
    marks(String rollno)
    {
        this.rollno=rollno;
        setSize(500,600);
        setLocation(500,100);
         setLayout(null);
        getContentPane().setBackground(Color.white);
       
        
        JLabel heading=new JLabel("GOVT.COLLEGE FOR GIRLS(SEC-14 )");
        heading.setBounds(100,10,500,30);
         heading.setFont(new Font("serif",Font.BOLD,20));
        add(heading);
        
        JLabel subheading=new JLabel("Result Of Examination ");
       subheading.setBounds(100,50,500,25);
        subheading.setFont(new Font("serif",Font.BOLD,18));
        add(subheading);
        
         JLabel lblrollnumber=new JLabel("Roll no "+ rollno);
        lblrollnumber.setBounds(60,100,500,20);
        lblrollnumber.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollnumber);
        
         JLabel lblsem=new JLabel();
        lblsem.setBounds(60,130,500,20);
        lblsem.setFont(new Font("serif",Font.PLAIN,20));
        add(lblsem);
        
         JLabel sub1=new JLabel();
        sub1.setBounds(50,200,500,25);
        sub1.setFont(new Font("serif",Font.PLAIN,20));
        add(sub1);
        
         JLabel sub2=new JLabel();
        sub2.setBounds(50,230,500,25);
        sub2.setFont(new Font("serif",Font.PLAIN,20));
        add(sub2);
        
         JLabel sub3=new JLabel();
        sub3.setBounds(50,260,500,25);
        sub3.setFont(new Font("serif",Font.PLAIN,20));
        add(sub3);
        
         JLabel sub4=new JLabel();
        sub4.setBounds(50,290,500,25);
        sub4.setFont(new Font("serif",Font.PLAIN,20));
        add(sub4);
        
         JLabel sub5=new JLabel();
        sub5.setBounds(50,320,500,25);
        sub5.setFont(new Font("serif",Font.PLAIN,20));
        add(sub5);
        
          JLabel mrk1=new JLabel();
        mrk1.setBounds(250,200,500,25);
        mrk1.setFont(new Font("serif",Font.PLAIN,20));
        add(mrk1);
        
         JLabel mrk2=new JLabel();
        mrk2.setBounds(250,230,500,25);
        mrk2.setFont(new Font("serif",Font.PLAIN,20));
        add(mrk2);
        
         JLabel mrk3=new JLabel();
        mrk3.setBounds(250,260,500,25);
        mrk3.setFont(new Font("serif",Font.PLAIN,20));
        add(mrk3);
        
         JLabel mrk4=new JLabel();
        mrk4.setBounds(250,290,500,25);
        mrk4.setFont(new Font("serif",Font.PLAIN,20));
        add(mrk4);
        
         JLabel mrk5=new JLabel();
        mrk5.setBounds(250,320,500,25);
        mrk5.setFont(new Font("serif",Font.PLAIN,25));
        add(mrk5);
        
          try
            {     conn c=new conn();
            ResultSet rs2=c.s.executeQuery("select * from  marks where rollno='"+rollno+"'");
             while(rs2.next())
            {
               // if we want to print marks on same label then use it
         /*   
            sub1.setText(sub1.getText()+ "           " +rs2.getString("marks1"));
            sub2.setText(sub2.getText()+ "           " +rs2.getString("marks2"));
            sub3.setText(sub3.getText()+ "           " +rs2.getString("marks3"));
             sub4.setText(sub4.getText()+"           " +rs2.getString("marks4"));
            sub5.setText(sub5.getText()+ "           " +rs2.getString("marks5"));
            lblsem.setText("semester" +rs2.getString("semester"));
            */    
            mrk1.setText(rs2.getString("marks1"));
            mrk2.setText(rs2.getString("marks2"));
            mrk3.setText(rs2.getString("marks3"));
            mrk4.setText(rs2.getString("marks4"));
             mrk5.setText(rs2.getString("marks5"));
            lblsem.setText(rs2.getString("semester")); 
            }
            
        ResultSet rs1=c.s.executeQuery("select * from subject where rollno='"+rollno+"'");
            while(rs1.next())
            {
                sub1.setText(rs1.getString("sub1"));
                sub2.setText(rs1.getString("sub2"));
                sub3.setText(rs1.getString("sub3"));
                sub4.setText(rs1.getString("sub4"));
                sub5.setText(rs1.getString("sub5"));
            }
        }
          
        catch(Exception e)
        {
            System.out.println(e);
        }
           cancel =new JButton("Cancel"); 
        cancel.setBounds(280, 400, 150,30);
         cancel.setBackground(Color.RED);
           cancel.setFont(new Font("serif",Font.BOLD,21));
       cancel.addActionListener(this);
        add(cancel);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==cancel)
        {
           
                    setVisible(false);
                    
                }
        
    }
    public static void main(String[] args)
    {
           new marks("");
    }
    
}
