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

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance+=amount;
      return true;
    }
    else return false;
  }

  public boolean withdraw(double amount) {
    if (amount < 0 || amount > balance) return false;
    else {
      balance-=amount;
      return true;
    }
  }
  public String toString() {
    String str = "#" + accountID + "\t" + "$" + balance;
    return str;
  }

  private boolean authenticate(String password) {
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password) && withdraw(amount)) {
      if (other.deposit(amount)) return true;
    }
    else {
      // should never happen
      System.out.println("ERROR!");
    }
    return false;
  }

}
