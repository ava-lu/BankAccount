public class BankAccount{
  // Instance variables
  private double balance;
  private int accountID;
  private String password;
  // constructor
  public BankAccount(int a, String p) {
    // initialize
    balance = 0;
    accountID = a;
    password = p;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }
}
