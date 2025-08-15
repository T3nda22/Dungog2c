package Banking;

public class Banking {

    private int accountNo;
    private float initialBalance;
    private int pin;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setInitialBalance(float initialBalance) {
        this.initialBalance = initialBalance;
    }

    public float getInitialBalance() {
        return initialBalance;
    }

    public boolean verifyAccount(int acc, int pn) {
        return acc == accountNo && pn == pin;
    }

    public void viewBalance() {
        System.out.println("Current Balance: " + initialBalance);
    }

    public void deposit(float amount) {
        if (amount > 0) {
            initialBalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= initialBalance) {
            initialBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
