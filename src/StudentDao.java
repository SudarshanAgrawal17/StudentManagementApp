import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
    public static boolean insertStudentToDB(Student st){
        boolean flag = false;
        try{
            Connection con = ConnectDB.createC();
            String query = "insert into students(sname, sphone, scity) values(?, ?, ?)"; // dynamic query with '?'
            PreparedStatement ps = con.prepareStatement(query);

            //set the values of parameters
            ps.setString(1, st.getStudentName());
            ps.setString(2, st.getStudentPhone());
            ps.setString(3, st.getStudentCity());

            // execute
            ps.executeUpdate();
            flag = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
