package vi.TestDrivenDevelopment.g.CleanTests;

public class Account {
    private final double _accountRate;
    private double _balance = 0;

    public Account()
    {
        _accountRate = Bank.getStandardRate();
    }

    public double getBalance() {
        return _balance;
    }

    public double getIntrestRate() {
        return _accountRate;
    }

    public double getIntrest() {
        return _balance * _accountRate;
    }

    public void deposit(int ammount) {
        _balance += ammount;
    }
}
