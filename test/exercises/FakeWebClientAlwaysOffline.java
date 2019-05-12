package exercises;

import ii.UnitTesting.d.Exercises.IWebClient;

public class FakeWebClientAlwaysOffline implements IWebClient {
    @Override
    public void downloadFile(String s, String setupDestinationFile) throws Exception {
        throw new Exception("web client offline");
    }
}
