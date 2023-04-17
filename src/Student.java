public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public Student(int id, String name, String phone, String city){
        studentId = id;
        studentName = name;
        studentPhone = phone;
        studentCity = city;
    }

    public Student(String name, String phone, String city){
        studentName = name;
        studentPhone = phone;
        studentCity = city;
    }

    public Student(){ }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int id){
        studentId = id;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public String getStudentPhone(){
        return studentPhone;
    }

    public void setStudentPhone(String phone){
        studentPhone = phone;
    }

    public String getStudentCity(){
        return studentCity;
    }

    public void setStudentCity(String city){
        studentCity = city;
    }
}
