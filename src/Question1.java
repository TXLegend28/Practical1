import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 2.0;
        double num2 = 5.0;
        System.out.println("Enter your first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter your second number: ");
        num2 = scanner.nextDouble();


        double percent = (num1 / num2) * 100;
        System.out.println(num1 + " is " + percent + "% of " + num2);

        percent = (num2 / num1) * 100;
        System.out.println(num2 + " is " + percent + "% of " + num1);

    }
}