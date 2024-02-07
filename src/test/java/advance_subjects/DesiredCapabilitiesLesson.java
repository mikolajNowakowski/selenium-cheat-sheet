package advance_subjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DesiredCapabilitiesLesson {

    String url = "https://expired.badssl.com/";

    @Test
    void test1() throws InterruptedException {

//        DesiredCapabilities cap =  new DesiredCapabilities();
//cap.setBrowserName("chrome");
//cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--allow-running-insecure-content");
        chromeOptions.addArguments("--ignore-certificate-errors");
//        chromeOptions.merge(cap);
        var driver = new ChromeDriver(chromeOptions);
        driver.get(url);
    }

}
