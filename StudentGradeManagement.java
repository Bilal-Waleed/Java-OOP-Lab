import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;

    // Method to display student information
    void displayStudentInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 80 && marks <= 100) {
            return 'A';
        } 
        else if (marks >= 70) {
            return 'B';
        } 
        else if (marks >= 60) {
            return 'C';
        } 
        else if (marks >= 50) {
            return 'D';
        } 
        else {
            return 'F';
        }
    }

    // Method to check pass/fail
    boolean isPassed() {
        return marks >= 50;
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Student Name: ");
        student.name = input.nextLine();

        System.out.print("Enter Roll No: ");
        student.rollNo = input.nextInt();

        System.out.print("Enter Marks: ");
        student.marks = input.nextDouble();

        student.displayStudentInfo();

        System.out.println("Grade: " + student.calculateGrade());

        if (student.isPassed()) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        input.close();
    }
}