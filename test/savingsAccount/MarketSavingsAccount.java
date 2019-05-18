package savingsAccount;

public class MarketSavingsAccount extends SavingsAccountBase
{
    @Override
    protected double getIntrestRate() {
        return .05;
    }
}
