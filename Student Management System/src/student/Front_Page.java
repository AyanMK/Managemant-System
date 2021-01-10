package student;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Front_Page{
    
    JFrame f;
    JLabel l1,l2,l3;
    JButton b;
    
    Front_Page(){
        
        f = new JFrame("Student Management System");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("student/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);        
        l1 = new JLabel(i3);
        l1.setBounds(0,0,1200,800);
                
        b = new JButton("Start");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(455,650,300,60);
        b.setFont(new Font("serif",Font.BOLD,30));
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                login i = new login();
                f.setVisible(false);
            }
        });
        l1.add(b);
        
        l2 = new JLabel("STUDENT MANAGEMENT SYSTEM");
        l2.setBounds(50,0,1200,90);
        l2.setFont(new Font("serif",Font.BOLD,65));
        l2.setForeground(Color.black);
        l2.setBackground(Color.white);
        l1.add(l2);
        
        l3 = new JLabel("Made by Ayan");
        l3.setBounds(1000,700,200,40);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l3.setForeground(Color.white);
        l3.setBackground(Color.white);
        l1.add(l3);
        
        f.add(l1);
        
        f.getContentPane().setBackground(Color.white);
        
        f.setVisible(true);
        f.setSize(1200,800);
        f.setLocation(300,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }

    public static void main(String[] arg){
        new Front_Page();
    }
}

