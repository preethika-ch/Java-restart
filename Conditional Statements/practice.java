import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CONDITIONALS PRACTICE PROGRAMS");
        System.out.println("1. Check Positive / Negative / Zero");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Find Largest of Three Numbers");
        System.out.println("4. Grade Calculator");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                if(n > 0)
                    System.out.println("Number is Positive");
                else if(n < 0)
                    System.out.println("Number is Negative");
                else
                    System.out.println("Number is Zero");
                break;

            case 2:
                System.out.print("Enter a number: ");
                int x = sc.nextInt();
                if(x % 2 == 0)
                    System.out.println("Even Number");
                else
                    System.out.println("Odd Number");
                break;

            case 3:
                System.out.print("Enter three numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(a >= b && a >= c)
                    System.out.println(a + " is Largest");
                else if(b >= a && b >= c)
                    System.out.println(b + " is Largest");
                else
                    System.out.println(c + " is Largest");
                break;

            case 4:
                System.out.print("Enter marks (0–100): ");
                int marks = sc.nextInt();
                if(marks >= 90)
                    System.out.println("Grade: A+");
                else if(marks >= 75)
                    System.out.println("Grade: A");
                else if(marks >= 60)
                    System.out.println("Grade: B");
                else if(marks >= 40)
                    System.out.println("Grade: C");
                else
                    System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}
