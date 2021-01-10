package student;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class details {
    
    JFrame f;
    JLabel l1;
    JButton b1,b2,b3,b4,b5,l2;
    
    details(){
        
        f = new JFrame("Student Detail");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Student/icons/details.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(0,0,1200,800);
                
        l2 = new JButton("STUDENT DETAILS");
        l2.setBounds(300,20,600,60);
        l2.setFont(new Font("serif",Font.BOLD,40));
        l2.setBackground(Color.WHITE);
        l2.setForeground(Color.BLACK);
        l1.add(l2);
        
        b1 = new JButton("ADD");
        b1.setBounds(500,250,200,40);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
                new Add_Student();
                f.setVisible(false);
                
            }
        });
        l1.add(b1);
        
        b2 = new JButton("VIEW");
        b2.setBounds(500,300,200,40);
        b2.setFont(new Font("serif",Font.BOLD,20));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
                new View_Student();
                f.setVisible(false);
            }
        });
        l1.add(b2);
        
        b3 = new JButton("REMOVE");
        b3.setBounds(500,350,200,40);
        b3.setFont(new Font("serif",Font.BOLD,20));
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
                new Remove_Student();
                f.setVisible(false);
            }
        });
        l1.add(b3);
        
        b4 = new JButton("UPDATE");
        b4.setBounds(500,400,200,40);
        b4.setFont(new Font("serif",Font.BOLD,20));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
                new Search_Student();
                f.setVisible(false);
            }
        });
        l1.add(b4);
        
        b5 = new JButton("BACK");
        b5.setBounds(500,560,200,40);
        b5.setFont(new Font("serif",Font.BOLD,20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){              
                login l = new login();
                f.setVisible(false);
            }
        });
        l1.add(b5);
        
        f.add(l1);
        
        f.setVisible(true);
        f.setSize(1200,800);
        f.setLocation(300,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
                
    }
    public static void main(String[] arg){
        new details();
    }
}

