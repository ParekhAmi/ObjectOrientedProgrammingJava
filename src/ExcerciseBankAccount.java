
//----------------------------Encapsulation----------------------

public class ExcerciseBankAccount {
    private String owner;
    private double balance;

    public ExcerciseBankAccount(String ow, double bal) {
        this.owner = ow;
        this.balance = Math.max(bal, 0);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double withdraw) {
        if (withdraw <= this.balance) {
            this.balance = this.balance - withdraw;
            return withdraw;
        }
        return 0;
    }

    public double deposit(double deposit) {
        if (deposit > 0) {
            this.balance = this.balance + deposit;
            return deposit;
        }
        return 0;
    }
}
