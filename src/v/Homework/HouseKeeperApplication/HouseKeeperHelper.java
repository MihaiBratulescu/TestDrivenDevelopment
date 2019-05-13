package v.Homework.HouseKeeperApplication;

import java.util.ArrayList;
import java.util.Date;

public class HouseKeeperHelper
{
    public static ArrayList<String> sendStatementEmails(String statement, Date statementDate)
    {
        var database     = new HouseKeeperDatabase();
        var houseKeepers = database.getAllHouseKeepers();
        var failedEmails = new ArrayList<String>();

        for(HouseKeeper keeper : houseKeepers)
        {
            if(keeper.email == null)
                continue;

            var emailAddress = keeper.email;
            var emailSubject = "Statement report";
            var statementEmailBody = keeper.statementEmailBody;

            try
            {
                var emailClient = new SmtpClient();
                emailClient.sendEmail(
                        emailAddress,
                        emailSubject,
                        statementEmailBody);
            }
            catch (Exception e)
            {
                failedEmails.add(keeper.email);
            }
        }

        return failedEmails;
    }
}
