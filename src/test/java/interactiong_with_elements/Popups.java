package interactiong_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Popups {

    String url = "https://www.automationtesting.co.uk/popups.html";


    @Test
    void test1() throws InterruptedException {
        var driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text() = 'Trigger Pop-up']")).click();
        String mainWindow = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();
//        Iterator<String> iterate = handles.iterator();
//
//        while(iterate.hasNext()){
//            var child = iterate.next();
//        }
        handles.stream().filter(handle -> !handle.equals(mainWindow)).findFirst().ifPresent(handle -> driver.switchTo().window(handle));
        driver.close();

        driver.switchTo().window(mainWindow);

    }

}
