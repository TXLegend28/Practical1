import java.util.Scanner;

public class Question5 {
    
    
    public String accountNumber;
    public String ownerName;
    public double balance;
    

    public Question5() {
        accountNumber = "00000000";
        ownerName = "Unknown";
        balance = 0.0;
    }
    

  
    public void setAccountNumber(String number) {

        accountNumber = number;
    }
    
    public void setOwnerName(String name) {

        ownerName = name;
    }
    
    public void setBalance(double amount) {

        balance = amount;
    }


    public String getAccountNumber() {

        return accountNumber;
    }

    public String getOwnerName() {

        return ownerName;
    }

    public double getBalance() {

        return balance;
    }


    public void deductMonthlyFee() {

        balance = balance - 8.00;
    }
    
   
    public static void explainAccountPolicy() {
        System.out.println("A monthly service fee of R8.00 will be deducted from your account.");
    }
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
   
        Question5 account = new Question5();
        

        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        account.setAccountNumber(accNum);
        
        System.out.print("Enter account owner's name: ");
        String name = scanner.nextLine();
        account.setOwnerName(name);
        
        System.out.print("Enter initial balance: R");
        double initialBalance = scanner.nextDouble();
        account.setBalance(initialBalance);
        
      
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance before fee: R" + account.getBalance());
        
   
        explainAccountPolicy();
        

        account.deductMonthlyFee();
        
      
        System.out.println("Balance after monthly fee: R" + account.getBalance());
        
        scanner.close();
    }
}
