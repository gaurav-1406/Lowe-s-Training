import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalAttendance = 280;
        int present;
        int totalMarks;
        float averageMarks;
        int studentID;
        String studentName;
        int marks1;
        int marks2;
        int marks3;

        System.out.println("Enter student ID: ");
        studentID = input.nextInt();

        input.nextLine(); // To consume the new line character

        System.out.println("Enter student name: ");
        studentName = input.nextLine();

        System.out.println("Enter marks 1: ");
        marks1 = input.nextInt();

        System.out.println("Enter marks 2: ");
        marks2 = input.nextInt();

        System.out.println("Enter marks 3: ");
        marks3 = input.nextInt();

        System.out.println("Enter number of classes present: ");
        present = input.nextInt();

        totalMarks = marks1 + marks2 + marks3;
        averageMarks = totalMarks / 3.0f;

        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        if (present >= (totalAttendance * 0.6)) {
            System.out.println("Student is regular");
        } else {
            System.out.println("Student is not regular");
        }
    }
}