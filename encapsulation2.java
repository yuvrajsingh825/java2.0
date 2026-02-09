public class BankAccount {
    // private data members
    private double balance;

    // getter
    public double getBalance() {
        return balance;
    }

    // setter
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}

public class encapsulation2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(5000);
        acc.withdraw(2000);

        System.out.println("Remaining Balance: " + acc.getBalance());
    }
}
 {
    
}
