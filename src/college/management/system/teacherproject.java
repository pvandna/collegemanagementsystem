package college.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class teacherproject   extends JFrame implements ActionListener{
    teacherproject()               //constructor
    {   setSize(1540,850);
    ImageIcon i1=new ImageIcon (ClassLoader.getSystemResource("project picture/campus.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel imag =new JLabel(i3);
        add(imag);
     // menu bar   
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
         //new information on bar
        JMenu ni=new JMenu("New Information");
        ni.setForeground(Color.black);
        mb.add(ni);
        
       
        
        JMenuItem si=new JMenuItem("new student information");
         si.setForeground(Color.black);
          si.addActionListener(this);
         ni.add(si);
         //details on bar
        JMenu d=new JMenu(" View Details");
        d.setForeground(Color.red);
        mb.add(d);
        
       
        
        JMenuItem sd=new JMenuItem("view student detial");
         sd.setForeground(Color.red);
         sd.addActionListener(this);
         d.add(sd);
         //leave  on bar
        JMenu l=new JMenu (" Apply Leave ");
        mb.add(l);
        
        JMenuItem tl=new JMenuItem("faculty leave");
         tl.addActionListener(this);
        l.add(tl);
        
        JMenuItem sl=new JMenuItem("student leave");
         sl.addActionListener(this);
         l.add(sl);
        
         //leave detail on bar
       /* JMenu ld=new JMenu("Leave Details");
        
        mb.add(ld);
        
        JMenuItem fld=new JMenuItem("faculty leave detail");
        fld.addActionListener(this);
         fld.setForeground(Color.MAGENTA);
         ld.add(fld);
        
        JMenuItem sld=new JMenuItem("student leave details");
        sld.addActionListener(this);
         sld.setForeground(Color.MAGENTA);
         ld.add(sld);*/
        
          //exams on bar
        JMenu e=new JMenu("Examination");
        e.setForeground(Color.blue);
        mb.add(e);
        
        JMenuItem em=new JMenuItem("enter marks");
         em.setForeground(Color.blue);
         em.addActionListener(this);
         e.add(em);
         
        JMenuItem er=new JMenuItem("Examination result");
        
         er.setForeground(Color.blue);
         er.addActionListener(this);
         e.add(er);
        
         //update info on menu bar
        JMenu ui=new JMenu("Update Detail");
        ui.setForeground(Color.black);
        mb.add(ui);
        
        JMenuItem usi=new JMenuItem("Update Student Info");
         usi.setForeground(Color.black);
         usi.addActionListener(this);
         ui.add(usi);
         
        JMenuItem uti=new JMenuItem("Update Faculty Info");
         uti.setForeground(Color.black);
          uti.addActionListener(this);
         ui.add(uti);
        
         
        
           //utility on menu bar
        JMenu utility=new JMenu("Utility");
         utility.setForeground(Color.red);
        mb.add( utility);
        
        JMenuItem notepad=new JMenuItem("Notepad");
         notepad.setForeground(Color.red);
          utility.add(notepad);
         notepad.addActionListener(this);
         
        JMenuItem cal=new JMenuItem("Calculator");
         cal.setForeground(Color.red);
          utility.add(cal);
          cal.addActionListener(this);
          
          // about on bar
     /*      JMenu about=new JMenu("About");
        mb.add( about);
        
        JMenuItem ab=new JMenuItem("about project creator");
        about.add(ab);
        ab.addActionListener(this);
        setVisible(true);*/
          
            //exit on menu bar
        JMenu exit=new JMenu("EXIT");
        mb.add( exit);
        
        JMenuItem ex=new JMenuItem("exit");
        exit.add(ex);
        ex.addActionListener(this);
        setVisible(true);
        
       
    }
   public void actionPerformed(ActionEvent obj)
    {
      String msg= obj.getActionCommand();
      if (msg.equals("exit"))
              setVisible(false);
      else if(msg.contentEquals("Calculator"))
      {
          try
          {
            Runtime.getRuntime().exec("calc.exe");  
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
      }
      else if(msg.contentEquals("Notepad"))
      {
          try
          {
            Runtime.getRuntime().exec("notepad.exe");  
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
      }
    
      else if(msg.equals("new student information"))
      {
          new addstudent();
      }
      
      else if(msg.equals("view student detial"))
      {
          new studentdetails();
      }  
      else if(msg.equals("student leave"))
      {
          new studentleave();
      }  
   
   
      else if(msg.equals("faculty leave"))
      {
          new teacherleave();
      }  
      
    
    /*else if(msg.equals("faculty leave detail"))
      {
          new teacherleavedetails();
      }  
      
    else if(msg.equals("student leave details"))
      {
          new studentleavedetails();
      }  */
      else if(msg.equals("Update Student Info"))
      {
          new updatestudent();
      }  
      else if(msg.equals("Update Faculty Info"))
      {
          new tinfoupdate();
      }  
       else if(msg.equals("enter marks"))
      {
          new entermarks();
      }  
      
      else if(msg.equals("Examination result"))
      {
          new examdetails();
      }  
      
    
    
    
   
    
    
    
    }
    public static void main(String []args)
    {
      new teacherproject();
    }
    
    
}
