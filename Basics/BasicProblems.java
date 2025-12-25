import java.util.Scanner;
public class BasicProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sum of two numbers
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));

        // Area of circle
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area = " + (3.14159 * r * r));

        // Temperature conversion
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit = " + ((c * 9/5) + 32));
    }
}
