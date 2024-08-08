
package college.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class entermarks extends JFrame implements ActionListener{
    Choice crollno;
    JComboBox cbsem;
    JButton submit,cancel;
    JTextField tfsub1,tfsub2,tfsub3,tfsub4,tfsub5,tfmarks1,tfmarks2,tfmarks3,tfmarks4,tfmarks5;
    
    entermarks()
    {
        
        setSize(1000,500);
        setLocation(300,150);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1=new ImageIcon (ClassLoader.getSystemResource("project picture/marks.jpg"));
        Image i2=i1.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(550,40,350,300);
        add(image);
        
        JLabel heading=new JLabel("ENTER MARKS OF STUDENT");
                 heading.setBounds(50,0,500,50);
                 heading.setFont(new Font("serif",Font.ITALIC,20));
                 add(heading);
       
        JLabel lblrollnumber=new JLabel("select roll no ");
        lblrollnumber.setBounds(50,70,150,20);
        lblrollnumber.setFont(new Font("serif",Font.ITALIC,20));
        add(lblrollnumber);
          
        crollno=new Choice();
        crollno.setBounds(200, 70, 150, 20);
        add(crollno);
        
        try
        {  
            conn c= new conn();
            ResultSet rs=c.s.executeQuery("select * from student");
            while(rs.next())
            {
                crollno.add(rs.getString("rollno"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
         JLabel lblsem=new JLabel("SELECT SEMESTER ");
        lblsem.setBounds(50,110,150,20);
        lblsem.setFont(new Font("serif",Font.ITALIC,20));
        add(lblsem);
             
        String sem[]={"1st","2nd","3rd","4th","5th","6th"};
        cbsem= new JComboBox(sem);
        cbsem.setBounds(200, 110, 150, 20);
        cbsem.setBackground(Color.WHITE);
        add(cbsem);
        
         JLabel lblentersub=new JLabel("Enter Subject");
        lblentersub.setBounds(100,150,200,40);
        lblentersub.setFont(new Font("serif",Font.ITALIC,20));
        add(lblentersub);
        
         JLabel lblentermarks=new JLabel("Enter Marks ");
        lblentermarks.setBounds(320,150,200,40);
        lblentermarks.setFont(new Font("serif",Font.ITALIC,20));
        add(lblentermarks);
        
         tfsub1=new JTextField();
         tfsub1.setBounds(50,200,200,20);
        add(tfsub1);
        
         tfsub2=new JTextField();
         tfsub2.setBounds(50,230,200,20);
        add(tfsub2);
        
         tfsub3=new JTextField();
         tfsub3.setBounds(50,260,200,20);
        add(tfsub3);
        
         tfsub4=new JTextField();
         tfsub4.setBounds(50,290,200,20);
        add(tfsub4);
        
         tfsub5=new JTextField();
         tfsub5.setBounds(50,320,200,20);
        add(tfsub5);
        
        tfmarks1=new JTextField();
         tfmarks1.setBounds(320,200,200,20);
        add(tfmarks1);
        
        tfmarks2=new JTextField();
         tfmarks2.setBounds(320,230,200,20);
        add(tfmarks2);
        
        tfmarks3=new JTextField();
         tfmarks3.setBounds(320,260,200,20);
        add(tfmarks3);
        
        tfmarks4=new JTextField();
         tfmarks4.setBounds(320,290,200,20);
        add(tfmarks4);
        
        tfmarks5=new JTextField();
         tfmarks5.setBounds(320,320,200,20);
        add(tfmarks5);
        
          
        submit=new JButton("Submit");
        submit.setBounds(70,360, 150, 30);
        submit.setBackground(Color.GREEN);
        submit.setFont(new Font("serif",Font.BOLD,21));
        submit.addActionListener(this);                          ////for preesing on login event ocuur
        add(submit);
        
        cancel=new JButton("Clear");
        cancel.setBounds(280,360, 150, 30);
        cancel.setBackground(Color.RED);
        cancel.setFont(new Font("serif",Font.BOLD,21));
        cancel.addActionListener(this);                     //for preesing on cancel event ocuur
        add(cancel);
        
        
        
        
        
        
        setVisible(true);
    }
    
   
    public void actionPerformed(ActionEvent ae)
    {  
              
    
        if(ae.getSource()==submit)
        {  
            String rollno=crollno.getSelectedItem();            
            String sem=(String)cbsem.getSelectedItem();
            String  sub1=tfsub1.getText();
            String  sub2=tfsub2.getText();
            String  sub3=tfsub3.getText();
            String  sub4=tfsub4.getText();
            String  sub5=tfsub5.getText();

            try
            {
                conn c=new conn();
               
              // String query1 = "insert into subject values('"+crollno.getSelectedItem()+"','"+cbsem.getSelectedItem()+"','"+tfsub1.getText()+"','"+tfsub2.getText()+"','"+tfsub3.getText()+"','"+tfsub4.getText()+"','"+tfsub5.getText()+"')";  //this is also right
              
               String query1="insert into subject values( '"+rollno+"', '"+sem+"','"+sub1+"','"+sub2+"','"+sub3+"','"+sub4+"','"+sub5+"')";                //both method are correct
               String query2 = "insert into marks values('"+crollno.getSelectedItem()+"','"+cbsem.getSelectedItem()+"','"+tfmarks1.getText()+"','"+tfmarks2.getText()+"','"+tfmarks3.getText()+"','"+tfmarks4.getText()+"','"+tfmarks5.getText()+"')";
                 
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);

                
                
                
              if(!Pattern.matches("^[0-9]+$", tfmarks1.getText()))
             {       
            JOptionPane.showMessageDialog(this,"Invalid marks"); 
            tfmarks1.setText("");
            tfmarks1.grabFocus();
    
            
             }
              else if(!Pattern.matches("^[0-9]+$", tfmarks2.getText()))
             {       
            JOptionPane.showMessageDialog(this,"Invalid marks"); 
            tfmarks2.setText("");
            tfmarks2.grabFocus();
             }
              else if(!Pattern.matches("^[0-9]+$", tfmarks3.getText()))
             {       
            JOptionPane.showMessageDialog(this,"Invalid marks"); 
            tfmarks3.setText("");
            tfmarks3.grabFocus();
             }
              else if(!Pattern.matches("^[0-9]+$", tfmarks4.getText()))
             {       
            JOptionPane.showMessageDialog(this,"Invalid marks"); 
            tfmarks4.setText("");
            tfmarks4.grabFocus();
             }
              else if(!Pattern.matches("^[0-9]+$", tfmarks5.getText()))
             {       
            JOptionPane.showMessageDialog(this,"Invalid marks"); 
            tfmarks5.setText("");
            tfmarks5.grabFocus();
             }
    
              else if(tfsub1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Fill subject"); 
                    
                }
            else  if(tfsub2.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Fill subject"); 
                    
                }
            else  if(tfsub3.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Fill subject"); 
                    
                }
            else  if(tfsub4.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Fill subject"); 
                    
                }
            else  if(tfsub5.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Fill subject"); 
                    
                }
              else
            {

                 JOptionPane.showMessageDialog(null,"DETAILS INSERTED SUCCESSFULLY");
                 setVisible(false);
            
            }
            
            
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
            
        }
    
        
        
    }
    
    
    
    
    public static void main(String args[])
    {
        new entermarks();
    }
    
}
