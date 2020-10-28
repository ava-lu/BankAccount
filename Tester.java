public class Tester {
  public static void main(String[] args) {
    BankAccount first = new BankAccount(67, "password");
    System.out.println(first.getBalance());
    System.out.println(first.getAccountID());
    first.deposit(500);
    first.withdraw(600);
    System.out.println(first.getBalance());
  }

}
