import java.util.Scanner;
class Bank {
    private String depositorName;
    private String accountType;
    private String accountNumber;
    private double balanceAmount;
  
    public void assignInitialValues(String depositorName, String accountType, String accountNumber, double balanceAmount) {
      this.depositorName = depositorName;
      this.accountType = accountType;
      this.accountNumber = accountNumber;
      this.balanceAmount = balanceAmount;
    }
  
    public void depositAmount(double amount) {
      balanceAmount += amount;
    }
  
    public void withdrawAmount(double amount) {
      if (balanceAmount - amount >= 500) {
        balanceAmount -= amount;
      } else {
        System.out.println("Insufficient balance to withdraw");
      }
    }
  
    public void displayData() {
      System.out.println("Depositor Name: " + depositorName);
      System.out.println("Account Type: " + accountType);
      System.out.println("Account Number: " + accountNumber);
      System.out.println("Balance Amount: " + balanceAmount);
    }
  }
  public class Bankk {
    public static void main(String[] args) {
    Bank b = new Bank();
    Scanner sc = new Scanner(System.in);
    
    // go
    // Copy code
    System.out.print("Enter Depositor Name: ");
    String depositorName = sc.nextLine();
    
    System.out.print("Enter Account Type: ");
    String accountType = sc.nextLine();
    
    System.out.print("Enter Account Number: ");
    String accountNumber = sc.nextLine();
    
    System.out.print("Enter Balance Amount: ");
    double balanceAmount = sc.nextDouble();
    
    b.assignInitialValues(depositorName, accountType, accountNumber, balanceAmount);
    
    int choice = 0;
    do {
      System.out.println("\nEnter 1 to deposit");
      System.out.println("Enter 2 to withdraw");
      System.out.println("Enter 3 to display data");
      System.out.println("Enter 4 to exit");
    
      System.out.print("\nEnter your choice: ");
      choice = sc.nextInt();
    
      switch (choice) {
        case 1:
          System.out.print("Enter amount to deposit: ");
          double depositAmount = sc.nextDouble();
          b.depositAmount(depositAmount);
          break;
        case 2:
          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount = sc.nextDouble();
          b.withdrawAmount(withdrawAmount);
          break;
        case 3:
          b.displayData();
          break;
        case 4:
          System.out.println("Exiting program");
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (choice != 4);
    
    sc.close();
    }
    }  