import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        double amount, finalAmount;
      
        amount = getInvestmentAmount();
        
        finalAmount = amount * 1.05;
        
        System.out.println("After one year at 5% interest you would have: R" + finalAmount);
    }
    
    public static double getInvestmentAmount() {
        Scanner scanner = new Scanner(System.in);
        double value;
      
        System.out.print("Enter starting investment amount: R");
        value = scanner.nextDouble();

        return value;
    }
}
