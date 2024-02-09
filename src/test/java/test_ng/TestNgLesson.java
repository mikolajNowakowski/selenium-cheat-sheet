package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNgLesson {

    WebDriver driver;


    @BeforeSuite
    public void setUp(){
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Parameters({ "email", "password" })
    @Test
    public void signin(String email, String password) throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button#submit-login")).click();
        System.out.println("user has logged in");
        Thread.sleep(2000);
    }

    @AfterSuite
    public void end() {
        driver.close();
        driver.quit();
    }




}
