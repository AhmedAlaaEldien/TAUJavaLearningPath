import java.util.Scanner;

public class SimpleCalculator {

    public static Scanner scanner;

    public static void main(String[] args){

        System.out.println("Sum="+SimpleCalculator.calculatorToSumNumbersOfIndex());
    }

    public static double calculatorToSumNumbersOfIndex(){

        scanner = new Scanner(System.in);
        System.out.println("What's the Length of the Array to store the inputs?");
        int arrayLength= scanner.nextInt();
        int[] storeArray= new int[arrayLength];
        int counter=0;
        int sum=0;

        do{
            System.out.println("What's the value for the"+counter+"index of the array?");
            int input= scanner.nextInt();
            storeArray[counter]= input;
            System.out.println("StoredIndex="+storeArray[counter]);
            sum=sum + storeArray[counter];
            counter++;
        }while (arrayLength > counter);

        scanner.close();
        return sum ;
    }

    public static double calculatorToSumTwoNumbers() {
        scanner = new Scanner(System.in);
        boolean again;
        double sumx;
        do {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            sumx = num1 + num2;

            System.out.println("The sum is " + sumx);

            System.out.println("Would you like to start over? True or False");
            again = scanner.nextBoolean();

        } while (again);
        return sumx;
    }
}
