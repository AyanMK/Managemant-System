package employee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ViewAll_Employee {
    
    public JFrame f;
    public JLabel l,l1;
    private JTable table;
    JButton b1;
    String x[] = {"ID","NAME","SALARY","ADDRESS","EDUCATION","JOB","FATHER","MOTHER","DATE OF BIRTH","PHONE","EMAIL","NATIONAL_ID"};
    String y[][] = new String[20][20];
    int i = 0,j=0;
    
    
    ViewAll_Employee(){
                        
        f = new JFrame("All Employee List");
        f.setBackground(Color.white);
        f.setLayout(null);
        f.setBounds(300,100,1200,800);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        l=new JLabel();
        l.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/x.jpg"));
        Image i1 = img.getImage().getScaledInstance(1200,800,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        l.setIcon(i2);
        l.setBounds(0,0,1200,800);
        
        l1 = new JLabel("All Employee Details");
        l1.setBounds(425,20,500,50);
        l1.setFont(new Font("serif",Font.ITALIC,40));
        l1.setForeground(Color.black);
        l.add(l1);
        
        try{
            
            conn con = new conn();
            String str = "SELECT * FROM employee";
            ResultSet rs = con.s.executeQuery(str);
            
            while(rs.next()){
                
                y[i][j++] = rs.getString("EMPLOYEE_ID");
                y[i][j++] = rs.getString("EMPLOYEE_NAME");
                y[i][j++] = rs.getString("SALARY");
                y[i][j++] = rs.getString("ADDRESS");
                y[i][j++] = rs.getString("EDUCATION");
                y[i][j++] = rs.getString("JOB");
                y[i][j++] = rs.getString("FATHER_NAME");
                y[i][j++] = rs.getString("MOTHER_NAME");
                y[i][j++] = rs.getString("DATE_OF_BIRTH");
                y[i][j++] = rs.getString("PHONE");
                y[i][j++] = rs.getString("EMAIL");
                y[i][j++] = rs.getString("NATIONAL_ID");
                i++;
                j=0;
            }       
        table = new JTable(y,x);
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
            System.out.println(ex);
        }
                        
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10,100,1180,600);
        l.add(sp);
        
        b1 = new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("serif",Font.BOLD,20));
        b1.setBounds(525,720,150,40);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                new details();
                f.setVisible(false);
            }
        });
        l.add(b1);
        
        f.add(l);        
        f.setVisible(true);
        
    }
    
    public static void main(String[] args){
        new ViewAll_Employee();
    }
}
