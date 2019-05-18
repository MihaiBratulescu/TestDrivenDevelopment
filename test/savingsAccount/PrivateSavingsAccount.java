package savingsAccount;

public class PrivateSavingsAccount extends SavingsAccountBase {
    @Override
    protected double getIntrestRate() {
        return .03;
    }
}
