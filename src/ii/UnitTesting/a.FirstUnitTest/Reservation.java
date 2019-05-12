package ii.UnitTesting.a.FirstUnitTest;

public class Reservation
{
    public User madeBy;

    public boolean canBeCanceledBy(User user)
    {
        return (user.isAdmin || madeBy == user);
    }
}
