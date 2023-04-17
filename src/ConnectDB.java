import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    static Connection con;
    public static Connection createC(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // user
            String user = "root";
            String password = "mysql@123";
            String url = "jdbc:mysql://localhost:3306/student_manage";

            con = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
