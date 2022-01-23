
import java.util.Scanner;

public class StudentsExamsDegrees {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Please, Enter Number Of Students");
        double numberOfStudents = scanner.nextDouble();
        System.out.println("Please, Enter Number Of Exams");
        double numberOfExams = scanner.nextDouble();

        StudentsExamsDegrees.StudentDegree(numberOfStudents, numberOfExams);
    }

    public static void StudentDegree(double numOfStudents, double noOfExams){

        if(numOfStudents <= 0 || noOfExams <= 0 ){
            System.out.println("Number of Student and Exams Can't be with value 0 or less");
        }
        else {
            for (int i = 0; i < numOfStudents; i++) {
                double totalDegrees = 0;
                for (int j = 0; j < noOfExams; j++) {
                    System.out.println("Please, Enter Exam Degree for Student NO. " + (i + 1) + "  On Exam NO. " + (j + 1));
                    double Degree = scanner.nextDouble();
                    totalDegrees = totalDegrees + Degree;
                }
                System.out.println("Total Degrees For Student NO. " + (i + 1) + " = " + totalDegrees);
            }
            scanner.close();
        }
    }
}
