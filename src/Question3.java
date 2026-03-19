import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        double rate;
        double regularHours;
        double overtimeHours;
        double normalPay;
        double overtimePay;
        double totalSalary;
        
        System.out.print("Enter hourly pay rate: ");
        rate = scanner.nextDouble();
        
        System.out.print("Enter regular hours: ");
        regularHours = scanner.nextDouble();
        
        System.out.print("Enter overtime hours: ");
        overtimeHours = scanner.nextDouble();
        
        // Calculate normal pay
        normalPay = regularHours * rate;
        
        // Calculate overtime pay (1.5 times the rate)
        overtimePay = overtimeHours * rate * 1.5;
        
        // Total salary
        totalSalary = normalPay + overtimePay;
        
        System.out.println("Weekly salary = ZAR " + totalSalary);

    }
}
