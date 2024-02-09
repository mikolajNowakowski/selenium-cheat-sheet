package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class TestNgLessonDataProvider {

    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @DataProvider
    public Object[][] emailPasswordProvider() {
        Object[][] data = new Object[3][2];

        data[0][0] = "test2@test.com";
        data[0][1] = "test12345";

        data[1][0] = "test@test.com";
        data[1][1] = "test123";

        data[2][0] = "doesntexist@test.com";
        data[2][1] = "xxxxxxxxxx";

        return data;

    }


    @Test(dataProvider = "emailPasswordProvider")
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

    @AfterMethod
    public void end() {
        driver.close();
        driver.quit();
    }


}
