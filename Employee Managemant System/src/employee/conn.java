package employee;

import java.sql.*;
//import javax.swing.JOptionPane;

public class conn {
    
    public Connection c;
    public Statement s;
    
    public conn(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system","root","");
            s = c.createStatement();
            //JOptionPane.showMessageDialog(null,"Connected");
        }catch(Exception e){
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
}