package exercises;

import ii.UnitTesting.d.Exercises.IWebClient;

public class FakeWebClientAlwaysOnline implements IWebClient {
    @Override
    public void downloadFile(String s, String setupDestinationFile) throws Exception {
        //returneaza mereu raspunsuri valide
    }
}
