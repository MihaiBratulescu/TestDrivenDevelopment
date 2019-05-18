package payroll;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayrollContext
{
    protected final double STD_HOURLY_RATE = 10;

    public static class HourlyEmployeeContext extends PayrollContext
    {
        Employee employee = new Employee();

        public static class UnderOvertimeContext extends HourlyEmployeeContext
        {
            protected final int workedHours = 35;

            public static class PayDayContext extends UnderOvertimeContext
            {
                protected final Date payDate = new Date(2019, 05, 17);
             }
        }
    }
}
