package css_selectors;

import org.openqa.selenium.WebElement;

public class CssSelectorsLesson {



//    WebElement element = driver.findElement(By.cssSelector("div")); -> TAG
//
//    WebElement element = driver.findElement(By.cssSelector("#elementId")); -> ID
//
//    WebElement element = driver.findElement(By.cssSelector(".className")); -> ClassName
//
//    WebElement element = driver.findElement(By.cssSelector("[attributeName='value']")); -> Atribute value
//
//    WebElement element = driver.findElement(By.cssSelector("div.className")); -> tag and classname
//
//    WebElement element = driver.findElement(By.cssSelector("input[type='text']")); -> tag and attribute
//
//    WebElement element = driver.findElement(By.cssSelector("div span")); -> Descendant Combinator
//
//    WebElement element = driver.findElement(By.cssSelector("div > span")); -> child combinator
//
//    WebElement element = driver.findElement(By.cssSelector("ul li:nth-child(2)"));

                                    //Description
                                    //    <ul>
                                    //  <li>Item 1</li>
                                    //  <li>Item 2</li> <!-- This is the element matched by :nth-child(2) -->
                                    //  <li>Item 3</li>
                                    //</ul>



//
//    WebElement element = driver.findElement(By.cssSelector("input[id^='startWithValue']"));
//
//    WebElement element = driver.findElement(By.cssSelector("input[id$='endsWithValue']"));
//
//    WebElement element = driver.findElement(By.cssSelector("input[id*='substringValue']"));
//
//    // Example: Find an element with class 'enabled' only if it's inside a div with id 'container'
//    WebElement element = driver.findElement(By.cssSelector("div#container .enabled"));
//
//    // Example: Find elements where 'data-status' attribute contains 'active'
//    List<WebElement> elements = driver.findElements(By.cssSelector("[data-status*='active']"));
//
//    // Example: Find all input elements that are not disabled
//    List<WebElement> elements = driver.findElements(By.cssSelector("input:not([disabled])"));
//
//    WebElement element = driver.findElement(By.cssSelector("button[name='example'][id='example']"));

    //$$(li"first-child) - zwraca elementy które są pierwszymi dziećmi i sa typu li
    //$$(li"last-child) - zwraca elementy które są ostatnimi dziećmi i sa typu li
    //$$(li"nth-child(2)) - zwraca elementy które są drugim dzieckiem i sa typu li

    // $$(table > tr) ->  zwraca elementy tr w table tylko wtedy gdy tr jest bezpośrednim dzieckiem table
    // $$("label + form") -> zwracamy pierwszy elementy typu form wystepujace po tagu label

}
