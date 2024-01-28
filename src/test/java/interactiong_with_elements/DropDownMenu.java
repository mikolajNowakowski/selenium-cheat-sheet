package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMenu {

    String url = "https://www.automationtesting.co.uk/dropdown.html";

    @Test
    void test1(){
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        var dropDownMenu = new Select(driver.findElement(By.name("cars")));
        //dropDownMenu.selectByVisibleText("Honda");
dropDownMenu.selectByValue("jeep");
    }

}
