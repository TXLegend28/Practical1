import java.util.Scanner;

public class BankAccount {
    
    
    public String accountNumber;
    public String ownerName;
    public double balance;
    

    public BankAccount() {
        accountNumber = "00000000";
        ownerName = "Unknown";
        balance = 0.0;
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
    
  
    public void setAccountNumber(String number) {
        accountNumber = number;
    }
    
    public void setOwnerName(String name) {
        ownerName = name;
    }
    
    public void setBalance(double amount) {
        balance = amount;
    }
    
  
    public void deductMonthlyFee() {
        balance = balance - 8.00;
    }
    
   
    public static void explainAccountPolicy() {
        System.out.println("A monthly service fee of ZAR 8.00 will be deducted from your account.");
    }
    

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
   
        BankAccount account = new BankAccount();
        

        System.out.print("Enter account number: ");
        String accNum = keyboard.nextLine();
        account.setAccountNumber(accNum);
        
        System.out.print("Enter account owner's name: ");
        String name = keyboard.nextLine();
        account.setOwnerName(name);
        
        System.out.print("Enter initial balance (ZAR): ");
        double initialBalance = keyboard.nextDouble();
        account.setBalance(initialBalance);
        
      
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner: " + account.getOwnerName());
        System.out.println("Balance before fee: ZAR " + account.getBalance());
        
   
        explainAccountPolicy();
        

        account.deductMonthlyFee();
        
      
        System.out.println("Balance after monthly fee: ZAR " + account.getBalance());
        
        keyboard.close();
    }
}
