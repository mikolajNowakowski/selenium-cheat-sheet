package advance_subjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class ScreenshotsLesson {

    String url = "http://teststore.automationtesting.co.uk/";

    @Test
    void test1() throws InterruptedException, IOException {
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        var driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);

        takeSnapShot(driver);
    }


    public static void takeSnapShot(WebDriver driver) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./src/test/resources/"+tiemstamp()+".png");

        FileUtils.copyFile(srcFile, destFile);
    }

    public static String tiemstamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

// TODO kosmetyka

}
