import java.util.Scanner;

public class SalaryCalculation {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many sales did the employee make this week?");
        double employeeSales = scanner.nextDouble();

        System.out.println("What's the employee's target?");
        double employeeTarget = scanner.nextDouble();

        System.out.println("What's the employee's salary?");
        double employeeSalary = scanner.nextDouble();

        System.out.println("What's the employee's bonus?");
        double employeeBonus = scanner.nextDouble();

        System.out.println("Is this employee committed or not?");
        boolean employeeCommitted= scanner.nextBoolean();

        scanner.close();

        var salaryX = SalaryCalculation.salaryCalculator(employeeSales, employeeSalary, employeeBonus, employeeTarget, employeeCommitted);

        //Output
        System.out.println("The employee's pay is $" + salaryX);


    }

    public static double salaryCalculator( double sales, double salary, double bonus, double target, boolean isCommitted){

        if(sales == target && target !=0){
            System.out.println("Congrats! You've met your target, You will get 100% of the bonus");
            salary = salary + bonus;

        }

        else if (sales > target){
            System.out.println("Congrats! You've met your target, You will get 100% of the bonus and 5% of the sales");
            salary= salary + bonus + (sales * 0.05);
        }

        else if (sales != 0){

            if(isCommitted) {
                System.out.println("Unfortunately, You did not make your target,So you will get only your salary");
            }
            else {
                salary =salary-(salary * (0.05));
                System.out.println("Congrats! You've met your target, But You will get 95% of the salary");
            }
        }

        else {
            System.out.println("Unfortunately, You did not make your target,So you will get 50% your salary");
            salary=(salary * 0.5);
        }

        return salary;
    }
}
