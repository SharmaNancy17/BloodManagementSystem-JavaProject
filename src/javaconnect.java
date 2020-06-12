import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {    
    public static Connection connercDb(){
        try{
            String url = "jdbc:mysql://localhost:3306/bloodmanagementsystem";
            String uname = "root";
            String password =  "123456";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,uname,password);
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
