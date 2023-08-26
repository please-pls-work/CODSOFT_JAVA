public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(bankAccount);
        atm.start();
    }
}
