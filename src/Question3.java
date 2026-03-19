import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double rate, regular, overtime, total;
            
        System.out.print("Enter hourly pay rate: ");
        rate = scanner.nextDouble();
        
        System.out.print("Enter regular hours: ");
        regular = scanner.nextDouble();
        
        System.out.print("Enter overtime hours: ");
        overtime = scanner.nextDouble();
        
        total = calculateSalary(rate, regular, overtime);
        
        System.out.println("Weekly salary = ZAR " + total);
        
    }
    
    public static double calculateSalary(double rate, double regular, double overtime) {
        double normalPay, overtPay;
        
        normalPay = regular * rate;
        overtPay = overtime * rate * 1.5;
        return normalPay + overtPay;
    }
}
