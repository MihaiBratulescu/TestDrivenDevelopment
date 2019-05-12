package ii.UnitTesting.d.Exercises;

public class InstallHelper
{
    private String setupDestinationFile;

    public boolean DownloadInstaller(String customerName, String installerName)
    {
        var client = new WebClient();

        try
        {
            client.downloadFile("http://example.com/" + customerName + "/" +installerName,
                    setupDestinationFile);

            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
