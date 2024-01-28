package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Accordions {


    String url = "https://www.automationtesting.co.uk/accordion.html";

    @Test
    void test1() throws InterruptedException {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        var webElement1 = driver.findElement(By.xpath("//div[text() = 'Platform Portability']"));
        webElement1.click(); // nic specjalnego




    }


}
