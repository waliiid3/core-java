import java.util.Scanner;

public class RestaurantMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Restaurant Menu =====");
        System.out.println("1. Burger - $5");
        System.out.println("2. Pizza - $8");
        System.out.println("3. Sandwich - $4");
        System.out.println("4. Coffee - $2");

        System.out.print("Choose your item (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("You ordered Burger.");
                break;

            case 2:
                System.out.println("You ordered Pizza.");
                break;

            case 3:
                System.out.println("You ordered Sandwich.");
                break;

            case 4:
                System.out.println("You ordered Coffee.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        scanner.close();
    }
}