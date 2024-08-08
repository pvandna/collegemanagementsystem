package college.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class project   extends JFrame implements ActionListener{
    project()               //constructor
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
        
        JMenuItem fi=new JMenuItem("New Faculty Information");
         fi.setForeground(Color.black);
         fi.addActionListener(this);
         ni.add(fi);
        
        JMenuItem si=new JMenuItem("New Student Information");
         si.setForeground(Color.black);
          si.addActionListener(this);
         ni.add(si);
         //details on bar
        JMenu d=new JMenu(" View Details");
        d.setForeground(Color.red);
        mb.add(d);
        
        JMenuItem fd=new JMenuItem("View Faculty Details");
         fd.setForeground(Color.red);
         fd.addActionListener(this);
         d.add(fd);
        
        JMenuItem sd=new JMenuItem("View Student Details");
         sd.setForeground(Color.red);
         sd.addActionListener(this);
         d.add(sd);
         //leave  on bar
        JMenu l=new JMenu (" Apply Leave ");
        mb.add(l);
        
        JMenuItem tl=new JMenuItem("Faculty Leave");
         tl.addActionListener(this);
        l.add(tl);
        
        JMenuItem sl=new JMenuItem("Student Leave");
         sl.addActionListener(this);
         l.add(sl);
        
         //leave detail on bar
        JMenu ld=new JMenu("Leave Details");
        
        mb.add(ld);
        
        JMenuItem fld=new JMenuItem("Faculty Leave Detail");
        fld.addActionListener(this);
         fld.setForeground(Color.MAGENTA);
         ld.add(fld);
        
        JMenuItem sld=new JMenuItem("Student Leave Details");
        sld.addActionListener(this);
         sld.setForeground(Color.MAGENTA);
         ld.add(sld);
        
          //exams on bar
        JMenu e=new JMenu("Examination");
        e.setForeground(Color.blue);
        mb.add(e);
        
        JMenuItem em=new JMenuItem("ENTER MARKS");
         em.setForeground(Color.blue);
         em.addActionListener(this);
         e.add(em);
         
        JMenuItem er=new JMenuItem("RESULT");
        
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
        
         //fee details
         JMenu f=new JMenu("Fee Details");
        f.setForeground(Color.blue);
        mb.add(f);
        
        JMenuItem fs=new JMenuItem("Fee Structure");
         fs.setForeground(Color.blue);
         fs.addActionListener(this);
         f.add(fs);
         
        JMenuItem fm=new JMenuItem("Fee Form");
        
         fm.setForeground(Color.blue);
         fm.addActionListener(this);
         f.add(fm);
        
           //utility on menu bar
        JMenu utility=new JMenu("Utility");
         utility.setForeground(Color.red);
        mb.add( utility);
        
        JMenuItem notepad=new JMenuItem("notepad");
         notepad.setForeground(Color.red);
          utility.add(notepad);
         notepad.addActionListener(this);
         
        JMenuItem cal=new JMenuItem("Calculator");
         cal.setForeground(Color.red);
          utility.add(cal);
          cal.addActionListener(this);
          
          // about on bar
           JMenu about=new JMenu("About");
        mb.add( about);
        
        JMenuItem ab=new JMenuItem("About Project Creator");
        about.add(ab);
        ab.addActionListener(this);
        setVisible(true);
          
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
      else if(msg.contentEquals("notepad"))
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
      else if(msg.equals("New Faculty Information"))
      {
          new addteacher();
      }
      else if(msg.equals("New Student Information"))
      {
          new addstudent();
      }
      else if(msg.equals("View Faculty Details"))
      {
          new teacherdetails();
      }  
      else if(msg.equals("View Student Details"))
      {
          new studentdetails();
      }  
      else if(msg.equals("Student Leave"))
      {
          new studentleave();
      }  
   
   
      else if(msg.equals("Faculty Leave"))
      {
          new teacherleave();
      }  
      
    
    else if(msg.equals("Faculty Leave Detail"))
      {
          new teacherleavedetails();
      }  
      
    else if(msg.equals("Student Leave Details"))
      {
          new studentleavedetails();
      }  
      else if(msg.equals("Update Student Info"))
      {
          new updatestudent();
      }  
      else if(msg.equals("Update Faculty Info"))
      {
          new updateteacher();
      }  
       else if(msg.equals("ENTER MARKS"))
      {
          new entermarks();
      }  
       else if(msg.equals("About Project Creator"))
      {
          new about();
      }  
       
        else if(msg.equals("Fee Structure"))
      {
         new feestructure();
      }  
      else if(msg.equals("Fee Form"))
      {
          new StudentFeeForm();
      }  
       
       
       
       
      else if(msg.equals("RESULT"))
      {
          new examdetails();
      }  
      
      
    
    
    
   
    
    
    
    }
    public static void main(String []args)
    {
      new project();
    }
    
    
}
