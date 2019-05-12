package exercises;

import ii.UnitTesting.d.Exercises.IWebClient;
import ii.UnitTesting.d.Exercises.InstallHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class InstallHelperTests
{
    InstallHelper installer;

    @BeforeEach
    void setUp()
    {
        installer = new InstallHelper("..//...//");
    }

    @Test
    public void install_webClientIsOffline_throwsException_Stubs()
    {
        IWebClient client = new FakeWebClientAlwaysOffline();

        boolean result = installer.DownloadInstaller(client, "", "");

        assertFalse(result);
    }

    @Test
    public void install_webClientIsOffline_throwsException_Mock() throws Exception {
        IWebClient client = mock(IWebClient.class);

        doThrow(new Exception())
                .when(client)
                .downloadFile(anyString(), anyString());

        boolean result = installer.DownloadInstaller(client, "", "");

        assertFalse(result);
        verify(client ).downloadFile(anyString(), anyString());
    }
}
