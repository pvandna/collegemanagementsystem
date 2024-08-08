
package college.management.system;
import net.proteanit.sql.DbUtils;                             //rs2xml.jar ki h
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class teacherleavedetails extends JFrame implements  ActionListener{
    
    Choice cempid;                               //drop down list aslo make it by jcombobox
    JTable table;
    JButton search ,print,cancel;
    
    teacherleavedetails()
    {  
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading=new JLabel("Search by EMPID");
        heading.setBounds(20,20,150,20);
        add(heading);
          
        cempid=new Choice();
        cempid.setBounds(180, 20, 150, 20);
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
        
        table=new JTable();
        try
        {  
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from teacherleave ");
           table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        JScrollPane jsp=new JScrollPane(table);                           //for scroll bar
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
        
        search =new JButton("Search"); 
        search.setBounds(20, 70, 80,20);
        search.addActionListener(this);
        add(search);
        
         print =new JButton("Print"); 
        print.setBounds(120, 70, 80,20);
        print.addActionListener(this);
        add(print);
        
        
        
         cancel =new JButton("Cancel"); 
        cancel.setBounds(220, 70, 80,20);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==search)
        {
            String query="select * from teacherleave where empid='"+cempid.getSelectedItem()+"'";
            try
            {
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            }
            catch(Exception e)
                    {
                        System.out.println(e);
                    }
            
        }
        else if(ae.getSource()==print)
                {
                    try
                    {
                        table.print();
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
    
    
    
    public static void main(String argd[])
    {
        new teacherleavedetails();
    }
    
}


