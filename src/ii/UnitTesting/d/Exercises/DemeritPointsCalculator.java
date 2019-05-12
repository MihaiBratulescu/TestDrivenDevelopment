package ii.UnitTesting.d.Exercises;

public class DemeritPointsCalculator
{
    private static int speedLimit = 50;
    private static int kmPerDemeritPoint = 5;

    public int CalculateDemeritPoints(int speed)
    {
        if(speed < 0)
            throw new IllegalArgumentException();

        if(speed <= speedLimit)
            return 0;

        var demeritPoints = (speed - speedLimit) / kmPerDemeritPoint;

        return demeritPoints;
    }
}
