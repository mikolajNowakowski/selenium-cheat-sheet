package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGDependsOnMethods {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
    }

// Flaga enabled=false sprawia ze test sie nie wywołuje


    @Test(dependsOnMethods = {"fillEmail","fillPassword"})
    public void clickSubmitButton(){
        driver.findElement(By.xpath("//button[@id='submit-login']")).click();
        Assert.assertEquals(1,1);
    }

    @Test
    public void fillEmail(){
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@test.com");
    }

    @Test
    public void fillPassword(){
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test123");
    }
}
