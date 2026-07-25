import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            sum = sum + scanner.nextInt();
        }

        System.out.println("Total Sum = " + sum);

        scanner.close();
    }
    
}
