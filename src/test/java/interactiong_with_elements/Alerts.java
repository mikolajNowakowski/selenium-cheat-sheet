package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Alerts {

    String url = "https://www.automationtesting.co.uk/popups.html";


    //alerta nie ma w htmlu
    // jak jest alert nie mozemy bawic sie htmlm

    @Test
    void test1() throws InterruptedException {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text() = 'Trigger Alert']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

}
