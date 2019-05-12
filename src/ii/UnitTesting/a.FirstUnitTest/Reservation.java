package ii.UnitTesting.a.FirstUnitTest;

public class Reservation
{
    public User madeBy;

    public boolean canBeCanceledBy(User user)
    {
        if(user.isAdmin)
            return  true;

        if(madeBy == user)
            return  true;

        return  false;
    }
}