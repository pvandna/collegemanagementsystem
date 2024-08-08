package college.management.system;
import net.proteanit.sql.DbUtils;                             //rs2xml.jar ki h
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;




public class examdetails extends JFrame  implements ActionListener{
    
  JTextField search;                               //drop down list aslo make it by jcombobox
    JTable table;
    JButton submit ,cancel;
    
    examdetails()
    {  
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading=new JLabel("Chech Result");
        heading.setBounds(80,8,400,50);
         heading.setFont(new Font("serif",Font.BOLD,20));
        add(heading);
          
        search=new JTextField();
        search.setBounds(200, 18, 200, 30);
        add(search);
        
         submit =new JButton("Result"); 
        submit.setBounds(100, 70, 120,30);
         submit.setBackground(Color.green);
         submit.setFont(new Font("serif",Font.BOLD,21));
        submit.addActionListener(this);
        add(submit);
        
        
        
         cancel =new JButton("Cancel"); 
        cancel.setBounds(250, 70, 120,30);
         cancel.setBackground(Color.RED);
           cancel.setFont(new Font("serif",Font.BOLD,21));
       cancel.addActionListener(this);
        add(cancel);
        
        
        table=new JTable();
        
        JScrollPane jsp=new JScrollPane(table);                           //for scroll bar
        jsp.setBounds(0, 130, 900, 700);
        add(jsp);
        
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
        
        
      
        
        table.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                int row=table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row, 2).toString());
            }
            
        });
        
        
         setSize(900,700);
        setLocation(300,100);
        setVisible(true);
        
    }
   public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==submit)
        {
             
           new marks(search.getText());
           setVisible(false);
           
        }
        else 
                {
                    setVisible(false);
                    
                }
        
    }
    
    
    
    public static void main(String argd[])
    {
        new examdetails();
    }
    
}
