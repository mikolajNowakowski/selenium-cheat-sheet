package advance_subjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionsLesson {

    String url = "https://www.automationtesting.co.uk/browserTabs.html";

    @Test
    void test1() throws InterruptedException {
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        var driver = new ChromeDriver(chromeOptions);
        driver.get(url);
    }

}
