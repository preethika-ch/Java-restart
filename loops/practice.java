import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("LOOPS PROGRAM");
        System.out.println("1. Multiplication Table (for loop)");
        System.out.println("2. Factorial of a Number (for loop)");
        System.out.println("3. Fibonacci Series (for loop)");
        System.out.println("4. Reverse a Number (while loop)");
        System.out.println("5. Sum of Digits (while loop)");
        System.out.println("6. Print 1 to N (do-while loop)");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                System.out.println("Multiplication Table of " + n);
                for(int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
                break;

            case 2:
                System.out.print("Enter number: ");
                int f = sc.nextInt();
                int fact = 1;
                for(int i = 1; i <= f; i++) {
                    fact *= i;
                }
                System.out.println("Factorial = " + fact);
                break;

            case 3:
                System.out.print("Enter count of terms: ");
                int t = sc.nextInt();
                int a = 0, b = 1;
                System.out.print("Fibonacci Series: ");
                for(int i = 1; i <= t; i++) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                }
                break;

            case 4:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                int rev = 0;
                while(num > 0) {
                    rev = rev * 10 + (num % 10);
                    num /= 10;
                }
                System.out.println("Reversed Number = " + rev);
                break;

            case 5:
                System.out.print("Enter number: ");
                int x = sc.nextInt();
                int sum = 0;
                while(x > 0) {
                    sum += x % 10;
                    x /= 10;
                }
                System.out.println("Sum of Digits = " + sum);
                break;

            case 6:
                System.out.print("Enter N: ");
                int N = sc.nextInt();
                int i = 1;
                System.out.print("Numbers: ");
                do {
                    System.out.print(i + " ");
                    i++;
                } while(i <= N);
                break;

            default:
                System.out.println("Invalid Option ");
        }
    }
}
