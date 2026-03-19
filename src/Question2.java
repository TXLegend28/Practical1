import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        int decade;
        double premium;
        int currentYear;
        int birthYear;


        System.out.print("Enter current year: ");
        currentYear = scanner.nextInt();

        System.out.print("Enter birth year: ");
        birthYear = scanner.nextInt();


        age = currentYear - birthYear;
        premium = calculatePremium(age);

        System.out.printf("Your annual premium is ZAR %.2f%n", premium);
    }
        public static double calculatePremium(int age) {
          int decade = age / 10;
            return (decade + 15) * 20.0;
        }
    }
