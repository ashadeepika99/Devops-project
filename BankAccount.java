public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0); // initial balance

        account.deposit(200.0);
        account.withdraw(100.0);
        account.checkBalance();
    }
}
