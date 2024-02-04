package more_advanced_element_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Iframes {
    String url = "https://www.automationtesting.co.uk/iframes.html";

    @Test
    void test1() {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//a[text() = 'Toggle']")).click();

        driver.switchTo().parentFrame();

        driver.findElement(By.xpath("//a[text() = 'Toggle']")).click();

        driver.switchTo().frame(1);

        driver.findElement(By.xpath("//button[@class = 'ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
    }
}
