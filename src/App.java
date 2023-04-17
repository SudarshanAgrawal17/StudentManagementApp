import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Student Management App");
        while(true){
            System.out.println("1. Add Student Data");
            System.out.println("2. Display Student Data");
            System.out.println("3. Update Student Data");
            System.out.println("4. Delete Student Data");
            System.out.println("5. Exit");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch){
                case 1:
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
