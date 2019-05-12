package reservation;

import ii.UnitTesting.a.FirstUnitTest.Reservation;
import ii.UnitTesting.a.FirstUnitTest.User;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReservationTests
{
   @Test
   public void canBeCanceledBy_adminCanceling_returnsTrue()
   {
        //arrange
        var reservation = new Reservation();
        var user = new User();
        user.isAdmin = true;
        reservation.madeBy = new User();

       //act
       var result = reservation.canBeCanceledBy(user);

       //assert
       assertTrue(result);
   }

    @Test
    public void canBeCanceledBy_sameUserCanceling_returnsTrue()
    {
        //arrange
        var reservation = new Reservation();
        var user = new User();
        reservation.madeBy = user;

        //act
        var result = reservation.canBeCanceledBy(user);

        //assert
        assertTrue(result);
    }

    @Test
    public void canBeCanceledBy_anotherUserCanceling_returnsTrue()
    {
        //arrange
        var reservation = new Reservation();
        var user = new User();
        reservation.madeBy = new User();

        //act
        var result = reservation.canBeCanceledBy(user);

        //assert
        assertFalse(result);
    }
}
