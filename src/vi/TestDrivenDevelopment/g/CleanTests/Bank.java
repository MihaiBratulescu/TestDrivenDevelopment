package vi.TestDrivenDevelopment.g.CleanTests;

public class Bank {
    private static double _currentRate;

    public static double getStandardRate() {
        return _currentRate;
    }

    public static void setStandardRate(double rate)
    {
        _currentRate = rate;
    }
}
