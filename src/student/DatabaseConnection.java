package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jiro Mendador
 */
public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306";
            //please change the rootUname and rootPw with your own account credentials
            String rootUname = "root"; 
            String rootPw = "i@mgr00t";
            Class.forName(driver);

            Connection con = DriverManager.getConnection(url, rootUname, rootPw);
            System.out.println("DATABASE CONNECTION SUCCESS!");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
