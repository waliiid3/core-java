import java.util.Scanner;

public class EmployeeRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Employee Registration =====");

        System.out.print("Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Department: ");
        String department = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Years of Experience: ");
        int experience = scanner.nextInt();

        System.out.println("\n===== Employee Profile =====");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : $" + salary);
        System.out.println("Experience  : " + experience + " years");

        scanner.close();
    }
}