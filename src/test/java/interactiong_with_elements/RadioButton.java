package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {

    String url = "https://www.automationtesting.co.uk/dropdown.html";



    @Test
    void test1() throws InterruptedException {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//label[@for = 'demo-priority-low']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for = 'demo-priority-normal']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for = 'demo-priority-high']")).click();

    }

}
