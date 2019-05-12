package ii.UnitTesting.d.Exercises;

import java.nio.file.Paths;

public class InstallHelper
{
    private String setupDestinationFile;

    public InstallHelper(String installDirectory)
    {

    }

    public boolean DownloadInstaller(IWebClient client, String customerName, String installerName)
    {
        try
        {
            client.downloadFile("http://example.com/" + customerName + "/" + installerName,
                    setupDestinationFile);

            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
