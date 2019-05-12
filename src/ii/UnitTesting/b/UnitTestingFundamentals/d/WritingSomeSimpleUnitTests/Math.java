package ii.UnitTesting.b.UnitTestingFundamentals.d.WritingSomeSimpleUnitTests;

import java.util.ArrayList;

public class Math
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public  int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    public ArrayList<Integer> getOddNumbers(int count)
    {
        var result = new ArrayList<Integer>();

        for(var i = 0; result.size() < count; i++)
            if (isOdd(i))
            {
                result.add(i);
            }

        return result;
    }

    private boolean isOdd(int i)
    {
        return i % 2 != 0;
    }
}
