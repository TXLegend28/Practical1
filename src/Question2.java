import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        int decade;
        int premium;
        int currentYear;
        int birthYear;


        System.out.print("Enter current year: ");
        currentYear = scanner.nextInt();

        System.out.print("Enter birth year: ");
         birthYear = scanner.nextInt();

        age = currentYear - birthYear;
        decade = age / 10;
        premium = (decade + 15) * 20;

        System.out.println("Your annual premium is ZAR " + premium);

        scanner.close();
    }
}