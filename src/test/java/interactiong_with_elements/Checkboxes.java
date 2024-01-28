package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxes {

    String url = "https://www.automationtesting.co.uk/dropdown.html";

    @Test
    void test1(){
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        var checkboxRed = driver.findElement(By.xpath("//input[@id = 'cb_red']")); // MAke sure to focus on the input tag !!
        var checkboxGreen = driver.findElement(By.xpath("//input[@id = 'cb_green']"));
        System.out.println(checkboxRed.isSelected());
        System.out.println(checkboxGreen.isSelected());
    }

}
