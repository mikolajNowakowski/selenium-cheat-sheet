package more_advanced_element_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTabs {

    String url = "https://www.automationtesting.co.uk/browserTabs.html";

    @Test
    void test1() throws InterruptedException {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//form//input")).click();
        }

        var windowsHandles = driver.getWindowHandles();

        System.out.println(windowsHandles.size());


        for (var item:windowsHandles) {
            Thread.sleep(1500);
            driver.switchTo().window(item);
        }
    }


}
