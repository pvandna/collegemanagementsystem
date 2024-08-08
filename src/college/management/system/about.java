package college.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class about extends JFrame {
    about()
    {
        setSize(700,500);
        setLocation(400,150);
        getContentPane().setBackground(Color.pink);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon (ClassLoader.getSystemResource("project picture/logo.jpeg"));
        Image i2=i1.getImage().getScaledInstance(280, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(400,0,280,200);
        add(image);
        
       
        
         JLabel heading=new JLabel("GOVT COLLEGE FOR GIRLS SEC 14");
                 heading.setBounds(20,0,500,50);
                 heading.setFont(new Font("serif",Font.BOLD,20));
                 add(heading);
       
       JLabel st=new JLabel("SUBMITTED TO: ");
        st.setBounds(20,80,550,40);
        st.setFont(new Font("serif",Font.ITALIC,30));
        add(st);
       
        JLabel sb=new JLabel("Mr Pradeep ");
        sb.setBounds(20,120,550,40);
        sb.setFont(new Font("serif",Font.ITALIC,20));
        add(sb);
        
       JLabel sby=new JLabel("SUBMITTED BY ");
        sby.setBounds(20,220,550,40);
        sby.setFont(new Font("serif",Font.ITALIC,30));
        add(sby);
         JLabel n=new JLabel("vandna");
        n.setBounds(20,250,550,40);
        n.setFont(new Font("serif",Font.ITALIC,20));
        add(n);
        JLabel r=new JLabel("Roll No=40");
        r.setBounds(20,280,550,40);
        r.setFont(new Font("serif",Font.ITALIC,20));
        add(r);
        JLabel c=new JLabel("M.sc(CS)");
        c.setBounds(20,310,550,40);
        c.setFont(new Font("serif",Font.ITALIC,20));
        add(c);
         JLabel j=new JLabel("AND");
        j.setBounds(140,280,550,40);
        j.setFont(new Font("serif",Font.BOLD,10));
        add(j);
        
        
        JLabel nn=new JLabel("yukti");
        nn.setBounds(200,250,550,40);
        nn.setFont(new Font("serif",Font.ITALIC,20));
        add(nn);
        JLabel rr=new JLabel("Roll No=38");
        rr.setBounds(200,280,550,40);
        rr.setFont(new Font("serif",Font.ITALIC,20));
        add(rr);
        JLabel cc=new JLabel("M.sc(CS)");
        cc.setBounds(200,310,550,40);
        cc.setFont(new Font("serif",Font.ITALIC,20));
        add(cc);
        
        JLabel t=new JLabel("THANKYOU");
        t.setBounds(80,380,550,40);
        t.setFont(new Font("serif",Font.BOLD,40));
        add(t);
        
        
        
        
        setVisible(true);
    
    }
    public static void main(String [] args)
    {
        new about();
    }
    
}
