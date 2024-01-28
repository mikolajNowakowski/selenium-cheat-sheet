package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElements {


    String url = "https://www.automationtesting.co.uk/hiddenElements.html";

    @Test
    void test1(){
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        var hiddenElement = driver.findElement(By.xpath("//p[text() = 'This paragraph should be hidden.']"));
        var visibleElement = driver.findElement(By.xpath("//p[text() = 'This is a visible paragraph.']"));

        System.out.println(hiddenElement.isDisplayed());
        System.out.println(visibleElement.isDisplayed());
    }
}
