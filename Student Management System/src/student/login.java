package student;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class login{
    
    JFrame f;
    JLabel l1,l2,id1,id2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;
    
    login(){
        
        f = new JFrame("Login");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("student/icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(0,0,1200,800);
        
        l2 = new JLabel("Please Enter User Name & Password");
        l2.setBounds(40,120,500,50);
        l2.setFont(new Font("serif",Font.PLAIN,23));
        l2.setForeground(Color.black);
        l1.add(l2);
        
        id1 = new JLabel("User Name");
        id1.setBounds(40,200,200,40);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id1.setBackground(Color.WHITE);
        id1.setForeground(Color.BLACK);
        l1.add(id1);
        
        t1 = new JTextField();
        t1.setBounds(180,200,200,40);
        l1.add(t1);
        
        id2 = new JLabel("Password");
        id2.setBounds(40,250,200,40);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id2.setBackground(Color.WHITE);
        id2.setForeground(Color.BLACK);
        l1.add(id2);
               
        t2 = new JPasswordField();
        t2.setBounds(180,250,200,40);
        l1.add(t2);
        
        b1 = new JButton("Login");
        b1.setBounds(40,330,345,40);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //conn c1 = new conn();
                String u = t1.getText();
                String p = t2.getText();
                                
                if(u.equals("admin") && p.equals("admin")){
                    
                    new details().f.setVisible(true);
                    f.setVisible(false);
                    JOptionPane.showMessageDialog(null, "login");                                        
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");                    
            }
            }
        });
        l1.add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(40,380,345,40);
        b2.setFont(new Font("serif",Font.BOLD,20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                new Front_Page();
            }
        });
        l1.add(b2);
        
        f.add(l1);
        
        f.getContentPane().setBackground(Color.WHITE);
        
        f.setVisible(true);
        f.setSize(1200,800);
        f.setLocation(300,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
    
    public static void main(String[] arg){
        new login();
    }   
}