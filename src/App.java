import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Student Management App");
        while (true) {
            System.out.println("1. Add Student Data");
            System.out.println("2. Display Student Data");
            System.out.println("3. Update Student Data");
            System.out.println("4. Delete Student Data");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // to consume the buffer
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    Student st = new Student(name, phone, city);
                    if(StudentDao.insertStudentToDB(st)){
                        System.out.println("Student added successfully!");
                    }
                    else{
                        System.out.println("Something went wrong!");
                    }
                    break;
                case 2:
                    if(!StudentDao.showAllStudent()){
                        System.out.println("Something went wrong!");
                    }
                    break;
                case 3:
                    System.out.print("(Write original if you don't want to update the attribute)\nEnter id of the student to that needs to be updated: ");
                    int id = sc.nextInt();
                    System.out.print("Enter name to update: ");
                    sc.nextLine(); // to consume the buffer
                    name = sc.nextLine();
                    System.out.print("Enter phone number to update: ");
                    phone = sc.nextLine();
                    System.out.print("Enter city to update: ");
                    city = sc.nextLine();
                    if(StudentDao.updateStudent(id, name, phone, city)){
                        System.out.println("Student updated successfully!");
                    }
                    else{
                        System.out.println("Something went wrong!");
                    }
                    break;
                case 4:
                    System.out.print("Enter user id: ");
                    id = sc.nextInt();
                    if(StudentDao.deleteStudent(id)){
                        System.out.println("Student deleted successfully");
                    }
                    else{
                        System.out.println("Something went wrong");
                    }
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
