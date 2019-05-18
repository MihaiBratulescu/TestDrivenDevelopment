package savingsAccount;

public abstract class SavingsAccountBase {
    private float ammout = 0;

    public void deposit(double ammount) {
        this.ammout += ammount;
    }

    public double getIntrest() {
        return ammout * getIntrestRate();
    }

    protected abstract double getIntrestRate();
}
