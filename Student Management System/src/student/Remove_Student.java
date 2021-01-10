package student;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Remove_Student{
      
    JFrame f;
    JTextField t;
    JLabel l1,l2,id1,id2,id3,t1,t2,t3;
    JButton b,b1,b2,b3;
    
    Remove_Student(){
        
        f = new JFrame("Remove Student");
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
        
        id1 = new JLabel("Name:");
        id1.setBounds(240,400,100,30);
        id1.setBackground(Color.WHITE);
        id1.setForeground(Color.BLACK);
        id1.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id1);
        
        t1 = new JLabel();
        t1.setBounds(360,400,150,30);
        t1.setBackground(Color.WHITE);
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("serif",Font.BOLD,20));
        l1.add(t1);
        
        id2 = new JLabel("Phone:");
        id2.setBounds(240,450,100,30);
        id2.setBackground(Color.WHITE);
        id2.setForeground(Color.BLACK);
        id2.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id2);
        
        t2 = new JLabel();
        t2.setBounds(360,450,150,30);
        t2.setBackground(Color.WHITE);
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("serif",Font.BOLD,20));
        l1.add(t2);
        
        id3 = new JLabel("Email:");
        id3.setBounds(240,500,100,30);
        id3.setBackground(Color.WHITE);
        id3.setForeground(Color.BLACK);
        id3.setFont(new Font("serif",Font.BOLD,20));
        l1.add(id3);
        
        t3 = new JLabel();
        t3.setBounds(360,500,150,30);
        t3.setBackground(Color.WHITE);
        t3.setForeground(Color.BLACK);
        t3.setFont(new Font("serif",Font.BOLD,20));
        l1.add(t3);
        
        
        b = new JButton("Search");
        b.setBounds(240,150,110,30);
        b.setFont(new Font("serif",Font.BOLD,20));
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                try{
                    conn con = new conn();
                    String str = "SELECT NAME,PHONE,EMAIL FROM student WHERE STUDENT_ID = '"+t.getText()+"';";
                    ResultSet rs = con.s.executeQuery(str);
                    
                    int i=0;
                    if(rs.next()){
                        String name = rs.getString("NAME");
                        String phone = rs.getString("PHONE");
                        String email = rs.getString("EMAIL");
                        
                        id1.setVisible(true);
                        id2.setVisible(true);
                        id3.setVisible(true);
                        b2.setVisible(true);
                        b3.setVisible(true);
                        i=1;
                        t1.setText(name);
                        t2.setText(phone);
                        t3.setText(email);
                                                
                    }
                    if(i==0)
                        JOptionPane.showMessageDialog(null,"ID not found!");
                    
                }catch(Exception ex){}
                
            }
        });
        l1.add(b);
        
        b1 = new JButton("Back");
        b1.setBounds(360,150,100,30);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new details();
                f.setVisible(false);
            }
        });
        l1.add(b1);
        
        b2 = new JButton("Remove");
        b2.setBounds(240,600,110,30);
        b2.setFont(new Font("serif",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                                
                try{
                    
                    conn con = new conn();
                    String str = "DELETE FROM student WHERE STUDENT_ID = '"+t.getText()+"';";
                    con.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Deleted successfully!");
                    
                    id1.setVisible(false);
                    id2.setVisible(false);
                    id3.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    t1.setVisible(false);
                    t2.setVisible(false);
                    t3.setVisible(false);                             
                                        
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Exception occured while deleting record!");
                    System.out.println(ex);
                }
                                
            }
        });
        l1.add(b2);
        
        b3 = new JButton("Cancel");
        b3.setBounds(360,600,100,30);
        b3.setFont(new Font("serif",Font.BOLD,20));
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new Remove_Student();
                f.setVisible(false);
            }
        });
        l1.add(b3);
        
        id1.setVisible(false);
        id2.setVisible(false);
        id3.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        
        f.add(l1);
        
        f.setVisible(true);
        f.setSize(1200,800);
        f.setLocation(300,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
              
    }

    public static void main(String[] args){
        new Remove_Student();
    } 
}
