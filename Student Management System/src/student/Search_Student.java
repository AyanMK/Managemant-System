package student;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Search_Student {
      
    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b1;
    
    Search_Student(){
        
        f = new JFrame("Search");
        f.setBackground(Color.GREEN);
        f.setLayout(null);
        
        l1=new JLabel();
        l1.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("student/icons/add.jpg"));
        Image i1 = img.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        l1.setIcon(i2);
        l1.setBounds(0,0,1200,800);
                
        l2 = new JLabel("Student ID");
        l2.setVisible(true);
        l2.setBounds(40,100,250,30);
        l2.setForeground(Color.white);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l1.add(l2);
                
        t = new JTextField();
        t.setBounds(240,100,220,30);
        l1.add(t);
        
        b = new JButton("Search");
        b.setBounds(240,150,100,30);
        b.setFont(new Font("serif",Font.BOLD,20));
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                try{
                    conn con = new conn();
                    String str = "SELECT STUDENT_ID FROM student WHERE STUDENT_ID = '"+t.getText()+"';";
                    ResultSet rs = con.s.executeQuery(str);
                    
                    int i=0;
                    if(rs.next()){
                        i=1;
                        new Update_Student(t.getText());
                        f.setVisible(false);
                    }
                    if(i==0)
                        JOptionPane.showMessageDialog(null,"ID not found!");
                    
                }catch(Exception ex){}
                
            }
        });
        l1.add(b);
        
        b1 = new JButton("Cancel");
        b1.setBounds(360,150,100,30);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new details();
                f.setVisible(false);
            }
        });
        l1.add(b1);
        
        f.add(l1);
        
        f.setVisible(true);
        f.setSize(1200,800);
        f.setLocation(300,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
              
    }

    public static void main(String[] args){
        new Search_Student();
    } 
}