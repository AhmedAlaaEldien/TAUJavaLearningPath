import java.util.Scanner;

public class Cashier {
    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Please Enter Number Of Items.");
        int numberOfItems = scanner.nextInt();

        double totalPrice = 0;

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter the cost of the item number:  " + (i + 1));
            double price = scanner.nextDouble();
            totalPrice = totalPrice + price;
            System.out.println();

        }
        scanner.close();
        System.out.println("Total Price for all items =  " +totalPrice+"$");

    }
}
