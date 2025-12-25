import java.util.Scanner;
public class student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT RESULT & ELIGIBILITY SYSTEM");
        System.out.print("Enter Student Marks (0-100): ");
        int marks = sc.nextInt();
        if(marks >= 90) {
            System.out.println("Grade: A+");        }
        else if(marks >= 75) {
            System.out.println("Grade: A");
        }
        else if(marks >= 60) {
            System.out.println("Grade: B");
        }
        else if(marks >= 40) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: F");
        }
        if(marks >= 75) {
            System.out.println("Eligible for Scholarships ");
        } else if(marks >= 40) {
            System.out.println("Eligible for Next Class Promotion ");
        } else {
            System.out.println("Not Eligible. Needs Improvement ");
        }
    }
}
