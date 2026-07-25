import java.util.Scanner;

public class PasswordLoginSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctPassword = "java123";
        String enteredPassword = "";

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Password: ");
            enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login Successful!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect Password.");
                System.out.println("Remaining Attempts: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account Locked.");
        }

        scanner.close();
    }
}