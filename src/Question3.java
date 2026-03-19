import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double rate, regular, overtime, double total;
            
        System.out.print("Enter hourly pay rate: ");
        rate = keyboard.nextDouble();
        
        System.out.print("Enter regular hours: ");
        regular = keyboard.nextDouble();
        
        System.out.print("Enter overtime hours: ");
        overtime = keyboard.nextDouble();
        
        total = calculateSalary(rate, regular, overtime);
        
        System.out.println("Weekly salary = ZAR " + total);
        
    }
    
    public static double calculateSalary(double rate, double regular, double overtime) {
        double normalPay, otPay;
        
        normalPay = regular * rate;
        otPay = overtime * rate * 1.5;
        return normalPay + otPay;
    }
}
