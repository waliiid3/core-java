import java.util.Scanner;

public class ECommerceDiscountSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== E-Commerce Discount System =====");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter purchase amount: $");
        double purchaseAmount = scanner.nextDouble();

        double discountPercentage;

        if (purchaseAmount >= 500) {
            discountPercentage = 20;
        } else if (purchaseAmount >= 200) {
            discountPercentage = 15;
        } else if (purchaseAmount >= 100) {
            discountPercentage = 10;
        } else {
            discountPercentage = 0;
        }

        double discountAmount = purchaseAmount * discountPercentage / 100;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("\n===== Bill Summary =====");
        System.out.println("Customer Name      : " + customerName);
        System.out.println("Purchase Amount    : $" + purchaseAmount);
        System.out.println("Discount Applied   : " + discountPercentage + "%");
        System.out.println("Discount Amount    : $" + discountAmount);
        System.out.println("Final Amount       : $" + finalAmount);

        if (discountPercentage > 0) {
            System.out.println("Congratulations! You received a discount.");
        } else {
            System.out.println("Add more items to get a discount.");
        }

        scanner.close();
    }
}