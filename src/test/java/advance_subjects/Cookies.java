package advance_subjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Cookies {
    String url = "http://teststore.automationtesting.co.uk/";

    @Test
    void test1() throws InterruptedException {
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        var driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

        driver.findElement(By.xpath("//span[text() = 'Sign in']")).click();
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("test69@test.com");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("testtest");
        driver.findElement(By.xpath("//button[@id = 'submit-login']")).click();


        driver.manage().deleteAllCookies();

    }

}
