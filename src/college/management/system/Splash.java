package college.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Splash  extends JFrame implements ActionListener{ 
     JButton login,cancel;
   Splash()               //constructor
    { 
       getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
         login=new JButton("Admin Login");
        login.setBounds(170,10, 220, 80);
        login.setBackground(Color.GREEN);
       login.addActionListener(this);                          ////for preesing on login event ocuur
        login.setFont(new Font("serif",Font.BOLD,21));
        add(login);
        
        cancel=new JButton("Teacher Login");
        cancel.setBounds(400,10, 220, 80);
        cancel.setBackground(Color.green);
        cancel.addActionListener(this);                     //for preesing on cancel event ocuur
        cancel.setFont(new Font("serif",Font.BOLD,21));
        add(cancel);
        
        ImageIcon i1=new ImageIcon (ClassLoader.getSystemResource("project picture/college.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel imag =new JLabel(i3);
        imag.setBounds(0, 0, 1000 ,700);
        add(imag);
        
        
        
        
        
        
        
        setLocation(150,50);
        setSize(1000,700);
       setVisible(true);
    }
   
    public void actionPerformed(ActionEvent obj)
    {
       if(obj.getSource()==login)
      {
          new Login();
           
           setVisible(false);
                    
                
      }
       else
       {
            
                  new teacherlogin();
                  setVisible(false);
                  
       }
    }
    public static void main(String []args)
    {
      new Splash();
    }
    
}
