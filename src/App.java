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
                    break;
                case 3:
                    break;
                case 4:
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
