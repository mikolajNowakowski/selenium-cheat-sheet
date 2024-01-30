package more_advanced_element_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class L01_TravelWebsitePt1 {

    String url = "https://www.easyjet.com/en";

    @Test
    void test1() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        var driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get(url);

        driver.findElement(By.id("ensRejectAll")).click();
       // driver.findElement(By.id("one-way")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("origin")).click();
        driver.findElement(By.name("origin")).clear();
        driver.findElement(By.name("origin")).sendKeys("London");

        List<WebElement> uiMenuItems = new WebDriverWait(driver,Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'ui-menu-item')]")));



        uiMenuItems.stream().filter(webElement -> webElement.getText().contains("Luton")).findFirst().orElseThrow().click();


        for (var item:uiMenuItems
             ) {
            System.out.println(item.getText());

        }
    }
}
