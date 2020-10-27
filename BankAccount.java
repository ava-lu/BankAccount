public class BankAccount{
  // Instance variables
  private double balance;
  private int accountID;
  private String password;
  // constructor
  public BankAccount(int accountID, String password) {
    // initialize
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

}
