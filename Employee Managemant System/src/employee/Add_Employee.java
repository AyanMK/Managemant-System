package employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Add_Employee {
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    JButton b,b1;  
            
    Add_Employee(){
        
        f = new JFrame("Add Employee");
        f.setBackground(Color.white);
        f.setLayout(null);
                
        id15=new JLabel();
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/add.jpg"));
        Image i1 = img.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        id15.setIcon(i2);
        id15.setBounds(0,0,1200,800);
        
        id14 = new JLabel("New Employee Details");
        id14.setBounds(420,100,500,50);
        id14.setFont(new Font("serif",Font.ITALIC,40));
        id14.setForeground(Color.black);
        id15.add(id14);
        f.add(id15);
        
        id1 = new JLabel("Name");
        id1.setBounds(200,200,200,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);
        
        t1 = new JTextField();
        t1.setBounds(400,200,150,30);
        id15.add(t1);
        
        id2 = new JLabel("Date of Birth (Y/M/D)");
        id2.setBounds(200,250,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);
        
        t2 = new JTextField();
        t2.setBounds(400,250,150,30);
        id15.add(t2);
        
        id3 = new JLabel("Address");
        id3.setBounds(200,300,200,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);
       
        t3 = new JTextField();
        t3.setBounds(400,300,150,30);
        id15.add(t3);
        
        id4 = new JLabel("Education");
        id4.setBounds(200,350,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);
        
        t4 = new JTextField();
        t4.setBounds(400,350,150,30);
        id15.add(t4);
        
        id5 = new JLabel("Job Psot");
        id5.setBounds(200,400,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);
        
        t5 = new JTextField();
        t5.setBounds(400,400,150,30);
        id15.add(t5);
        
        id6 = new JLabel("Employee ID");
        id6.setBounds(200,450,150,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);
        
        t6 = new JTextField();
        t6.setBounds(400,450,150,30);
        id15.add(t6);
           
        id7 = new JLabel("Father's Name");
        id7.setBounds(600,200,200,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);
        
        t7 = new JTextField();
        t7.setBounds(800,200,150,30);
        id15.add(t7);
              
        id8 = new JLabel("Mother's Name");
        id8.setBounds(600,250,200,30);
        id8.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id8);
        
        t8 = new JTextField();
        t8.setBounds(800,250,150,30);
        id15.add(t8);
                        
        id9 = new JLabel("Salary");
        id9.setBounds(600,300,200,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id9);
        
        t9 = new JTextField();
        t9.setBounds(800,300,150,30);
        id15.add(t9);
                        
        id10 = new JLabel("Phone");
        id10.setBounds(600,350,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);
        
        t10 = new JTextField();
        t10.setBounds(800,350,150,30);
        id15.add(t10);
              
        id11 = new JLabel("Email ID");
        id11.setBounds(600,400,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);
        
        t11 = new JTextField();
        t11.setBounds(800,400,150,30);
        id15.add(t11);
        
        id12 = new JLabel("National ID");
        id12.setBounds(600,450,100,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);
        
        t12 = new JTextField();
        t12.setBounds(800,450,150,30);
        id15.add(t12);
        
                
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("serif",Font.BOLD,20));
        b.setBounds(400,600,150,40);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                String name = t1.getText();
                String dob = t2.getText();
                String add = t3.getText();
                String edu = t4.getText();
                String job = t5.getText();
                String eid = t6.getText();
                String father = t7.getText();
                String mother = t8.getText();
                String sal = t9.getText();
                String phone = t10.getText();
                String email = t11.getText();
                String nid = t12.getText();
                
                try{
                    
                    conn cc = new conn();
                    String q = "insert into employee values('"+eid+"','"+name+"','"+sal+"','"+add+"','"+edu+"','"+job+"','"+father+"','"+mother+"','"+dob+"','"+phone+"','"+email+"','"+nid+"')";
                    cc.s.executeUpdate(q);
                    JOptionPane.showMessageDialog(null,"Detail Successfully Inserted");
                    f.setVisible(false);
                    new details();
                    
                }catch(Exception ee){
                    System.out.println("The error is:"+ee);
                    JOptionPane.showMessageDialog(null,ee);
                }                 
            }
        });
        id15.add(b);
        
        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setBounds(600,600,150,40);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new details();
                f.setVisible(false);
            }
        });
        id15.add(b1);
        
        f.setVisible(true);
        f.setSize(1200,800);
        f.setLocation(300,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
                             
    }
    public static void main(String[] args){
        new Add_Employee();
    }   
}
