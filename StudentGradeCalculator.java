import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for homework grades
        System.out.println("Enter homework grades (8 grades):");
        double[] homeworkGrades = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Homework " + (i + 1) + ": ");
            homeworkGrades[i] = scanner.nextDouble();
        }

        // Input for quiz grades
        System.out.println("Enter quiz grades (5 grades):");
        double[] quizGrades = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Quiz " + (i + 1) + ": ");
            quizGrades[i] = scanner.nextDouble();
        }

        // Input for exam grades
        System.out.print("Enter Mid-Term Exam grade: ");
        double midTermExamGrade = scanner.nextDouble();

        System.out.print("Enter Final Exam grade: ");
        double finalExamGrade = scanner.nextDouble();

        // Input for final project grade
        System.out.print("Enter Final Project grade: ");
        double finalProjectGrade = scanner.nextDouble();

        // Calculate final grade
        double finalGrade = calculateFinalGrade(homeworkGrades, quizGrades, midTermExamGrade, finalExamGrade, finalProjectGrade);

        // Determine letter grade
        char letterGrade = determineLetterGrade(finalGrade);

        // Display the final grade as an alphabet
        System.out.println("Final Grade: " + letterGrade);
    }

    private static double calculateFinalGrade(double[] homework, double[] quizzes, double midTermExam, double finalExam, double finalProject) {
        // Calculate averages
        double homeworkAverage = calculateAverage(homework);
        double quizAverage = calculateAverage(quizzes);

        // Calculate weighted grades
        double homeworkWeighted = homeworkAverage * 0.15;
        double quizWeighted = quizAverage * 0.05;
        double midTermExamWeighted = midTermExam * 0.25;
        double finalExamWeighted = finalExam * 0.30;
        double finalProjectWeighted = finalProject * 0.25;

        // Calculate total weighted grade
        return homeworkWeighted + quizWeighted + midTermExamWeighted + finalExamWeighted + finalProjectWeighted;
    }

    private static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    //input for final letter grade
    private static char determineLetterGrade(double finalGrade) {
        if (finalGrade >= 92) {
            return 'A';
        } else if (finalGrade >= 90) {
            return 'A-';
        } else if (finalGrade >= 87) {
            return 'B+';
        } else if (finalGrade >= 82) {
            return 'B';
        } else if (finalGrade >= 80) {
            return 'B-';
        } else if (finalGrade >= 77) {
            return 'C+';
        } else if (finalGrade >= 72) {
            return 'C';
        } else if (finalGrade >= 70) {
            return 'C-';
        } else if (finalGrade >= 67) {
            return 'D+';
        } else if (finalGrade >= 62) {
            return 'D';
        } else if (finalGrade >= 60) {
            return 'D-';
        } else {
            return 'F';
        }
    }
}
