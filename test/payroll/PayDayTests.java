package payroll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayDayTests extends PayrollContext.HourlyEmployeeContext.UnderOvertimeContext
{
    protected final Date payDate = new Date(2019, 05, 17);

    @Test
    @DisplayName("HourlyEmployee_UnderOvertime_PayDay_runPayroll_IsPaidStdHrRateTimesHoursWorked")
    void runPayroll_IsPaidStdHrRateTimesHoursWorked()
    {
        assertEquals(STD_HOURLY_RATE * workedHours, employee.getPay());
    }
}