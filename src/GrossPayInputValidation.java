import java.util.Scanner;
/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {

    public static Scanner scanner;

    public static void main(String[] args){

        //Initialize known variables
        scanner = new Scanner(System.in);

        System.out.println("How many MaxHours should employee work this week?");
        int maxHours = scanner.nextInt();

        System.out.println("What's gross salary Rate");
        int rate = scanner.nextInt();

        System.out.println("Gross pay: $" + GrossPayInputValidation.ValidateWorkHours(maxHours, rate));

    }

    public static double ValidateWorkHours( int workMaxHours, int workRate){


        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > workMaxHours || hoursWorked < 1){
            System.out.println("Invalid workedHours. Your workHours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        return workRate * hoursWorked;


    }
}
