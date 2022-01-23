import java.util.Scanner;

public class StudentsExamsDegrees {
    public static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Please, Enter Number Of Students");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Please, Enter Number Of Exams");
        int numberOfExams = scanner.nextInt();

        StudentsExamsDegrees.StudentDegree(numberOfStudents, numberOfExams);
    }

    public static void StudentDegree(int numOfStudents, int noOfExams){

        for(int i=0; i<numOfStudents; i++){
            double totalDegrees=0;
            for(int j=0; j<noOfExams; j++){
                System.out.println("Please, Enter Exam Degree for Student NO. " + (i+1) + "  On Exam NO. " + (j+1));
                double Degree = scanner.nextDouble();
                totalDegrees=totalDegrees+Degree;
            }
            System.out.println("Total Degrees For Student NO. " + (i+1) + " = "+ totalDegrees);
        }
        scanner.close();
    }
}
