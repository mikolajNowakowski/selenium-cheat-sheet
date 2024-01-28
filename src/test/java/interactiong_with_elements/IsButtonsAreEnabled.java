package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsButtonsAreEnabled {

    String url = "https://www.automationtesting.co.uk/buttons.html";

    @Test
    void test1(){
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        var enabledButton = driver.findElement(By.id("btn_three"));
        System.out.println(enabledButton.isEnabled());

        var disabledButton = driver.findElement(By.id("btn_four"));
        System.out.println(disabledButton.isEnabled());

    }

}
