class BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Minimum balance must be maintained.");
        } else {
            balance -= amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.deposit(500);
        acc.withdraw(450);
        acc.withdraw(100);
    }
}