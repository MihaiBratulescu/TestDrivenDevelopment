package v.Homework.BookingApplication;

import java.util.ArrayList;

public class BookingHelper
{
    public static String overlappingBookingExists(Booking booking)
    {
        if(booking.status == "canceled")
            return "";//can't overlap if it's canceled

        //urmatoarele doua linii apeleaza dependinte externe
        var database = new BookingDatabase();
        ArrayList<Booking> bookings = database.getAllBookings();

        bookings = getAllOtherNotCanceledBookings(bookings, booking);

        for(Booking b : bookings)
        {
            if(arrivesDuringBooking(booking, b) || leavesDuringBooking(booking, b))
            {
                return b.reference;//return reference of the first overlapping booking
            }
        }

        return "";//nothing found
    }

    private static boolean leavesDuringBooking(Booking booking, Booking b) {
        return booking.departureDate.after(b.arrivalDate) &&
        (booking.departureDate.before(b.departureDate) || booking.departureDate == b.departureDate);
    }

    private static boolean arrivesDuringBooking(Booking booking, Booking b) {
        return (booking.arrivalDate.after(b.arrivalDate) || booking.arrivalDate == b.arrivalDate) &&
                booking.arrivalDate.before(b.departureDate);
    }

    private static ArrayList<Booking> getAllOtherNotCanceledBookings(ArrayList<Booking> bookings, Booking booking)
    {
        var result = new ArrayList<Booking>();

        for(Booking b : bookings)
        {
            if(b.id != booking.id && //do not return the booking we just received
               b.status != "canceled")
            {
                result.add(b);
            }
        }

        return result;
    }
}
