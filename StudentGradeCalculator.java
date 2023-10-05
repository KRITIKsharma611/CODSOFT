import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects.
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Create an array to store the marks obtained in each subject.
        int[] marks = new int[numberOfSubjects];

        // Get the marks obtained in each subject from the user.
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the total marks.
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the average percentage.
        double averagePercentage = (double) totalMarks / numberOfSubjects * 100;

        // Assign a grade based on the average percentage.
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results to the user.
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}