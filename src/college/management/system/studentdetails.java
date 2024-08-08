package college.management.system;
import net.proteanit.sql.DbUtils;                             //rs2xml.jar class
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class studentdetails extends JFrame implements  ActionListener{
    
    Choice crollno;                               //drop down list aslo make it by jcombobox
    JTable table;
    JButton search ,print,update,add,delete;
    
    studentdetails()
    {  
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading=new JLabel("Search by roll no");
        heading.setBounds(20,20,150,20);
        add(heading);
          
        crollno=new Choice();
        crollno.setBounds(180, 20, 150, 20);
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
        
        table=new JTable();
        try
        {  
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from student ");
           table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        JScrollPane jsp=new JScrollPane(table);                           //for scroll bar apper when oversize
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
        
         add =new JButton("Add"); 
        add.setBounds(220, 70, 80,20);
        add.addActionListener(this);
        add(add);
        
         update =new JButton("Update"); 
        update.setBounds(320, 70, 80,20);
        update.addActionListener(this);
        add(update);
        
         delete =new JButton("delete"); 
        delete.setBounds(420, 70, 80,20);
        delete.addActionListener(this);
        add(delete);
        
        
        
        
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
          if(ae.getSource()== delete)
                {
                  
           
            try
            {
                conn c=new conn();
                  String query="delete  from student where rollno='"+crollno.getSelectedItem()+"'";

                c.s.executeUpdate(query);
             
                 JOptionPane.showMessageDialog(null,"record deleted sucessfully"); 
                 setVisible(false);
                
            }
            catch(Exception e)
                    {
                        System.out.println(e);
                    }
                
       // JOptionPane.showMessageDialog(null,"updated table is"); 
       /*  try
        {  
            new studentdetails();
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from student ");
            
           table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         */
        
                }

        
        
        
        else if(ae.getSource()==search)
        {
            String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
            try
            {
                conn c=new conn();
                ResultSet rs=c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
               // table.setModel(DbUtils.resultSetToTableModel(rs));
                
                
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
        else if(ae.getSource()==update)
                {
                    setVisible(false);
                   new updatestudent();
                }
        else if(ae.getSource()==add)
                {
                    setVisible(false);
                    new addstudent();
                    
                    
                }
      
    }
    
    
    
    public static void main(String argd[])
    {
        new studentdetails();
    }
    
}
