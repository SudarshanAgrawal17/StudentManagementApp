import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    public static boolean deleteStudent(int id) {
        boolean flag = false;
        try{
            Connection con = ConnectDB.createC();
            String query = "delete from students where sid = ?"; // dynamic query with '?'
            PreparedStatement ps = con.prepareStatement(query);

            //set the values of parameters
            ps.setInt(1, id);

            // execute
            ps.executeUpdate();
            flag = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean showAllStudent() {
        boolean flag = false;
        try {
            Connection con = ConnectDB.createC();
            String query = "select * from students";
            java.sql.Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(query);

            while(res.next()){
                // can also pass column name inplace of cloumnIndex
                int id = res.getInt(1);
                String name = res.getString(2);
                String phone = res.getString(3);
                String city = res.getString(4);

                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("Phone Number: "+phone);
                System.out.println("City: "+city);
                System.out.println("----------------------");
                
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean updateStudent(int id, String name, String phone, String city) {
        boolean flag = false;
        try {
            Connection con = ConnectDB.createC();
            String query = "update students set sname = ?, sphone = ?, scity = ? where sid = ?";
            PreparedStatement st = con.prepareStatement(query);
            
            st.setString(1, name);
            st.setString(2, phone);
            st.setString(3, city);
            st.setInt(4, id);
            
            st.executeUpdate();
            
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
