package s2319.shopiee;

public class User {
    private double balance;
    private double userId;

    public User(double balance, double userId) {
        this.balance = balance;
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public double getUserId() {
        return userId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setUserId(double userId) {
        this.userId = userId;
    }
}