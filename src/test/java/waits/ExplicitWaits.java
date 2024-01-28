package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaits {


    // Expected Conditions:
    // - elementToBeClickable()
    // - elementToBoSelected()
    // - visibilitiOf()
    // - visibilityOfAllElements()
    // - visibilityOFAllElementsLocatedBy()
    // - visibilityOfElementsLocated()

    String url = "https://www.automationtesting.co.uk/loader.html";


    @Test
    void test1() {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'loaderBtn']")));

        driver.findElement(By.xpath("//button[@id = 'loaderBtn']")).click();



    }


}
