import java.util.Scanner;

public class EnsureFromYearGrade {

    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        System.out.println(EnsureFromYearGrade.yearGrade(grade));
    }

    public static String yearGrade(String StudentGrade){
        String message;

        switch(StudentGrade){
            case "A":
                message = "Excellent Grade!";
                break;
            case "B":
                message = "Very Good Great!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        return message;
    }
}
