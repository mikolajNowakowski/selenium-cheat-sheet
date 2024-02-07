package more_advanced_element_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorExamples {

    // JAvaScriptExecutor jse = (JavaScriptExecutor) driver;
    // jse.executeScript(Script, Arguments);

    String url = "https://www.automationtesting.co.uk/contactForm.html";

    @Test
    void test1() {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Smith");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("james@test.com");
        driver.findElement(By.cssSelector("textarea")).sendKeys("This is sample comment");


        var submitButton = driver.findElement(By.cssSelector("[type = 'submit']"));
        var resetButton = driver.findElement(By.cssSelector("[type = 'reset']"));


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click(), arguments[1].click()",resetButton,submitButton);
    }

}
