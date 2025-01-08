import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeJavaSelenium {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
 //       driver.get("https://jqueryui.com/droppable/");


//        driver.findElement(By.linkText("Practice Site")).click();
//
//        driver.findElement(By.linkText("Shop")).click();
//
//        driver.findElement(By.className("woocommerce-LoopProduct-link")).click();
//
//        driver.findElement(By.linkText("Android Quick Start Guide")).click();




//    WebDriver driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.manage().deleteAllCookies();
//    driver.get("https://jqueryui.com/droppable/");





// #1 way to do iframe with WebElement

//        WebElement iframe = driver.findElement(By.className("demo-frame"));
//        driver.switchTo().frame(iframe);

// #2 way to do iframe with index

//        driver.switchTo().frame(0);
//
//        Actions actions1 = new Actions(driver);
//        actions1.clickAndHold(driver.findElement(By.id("draggable")))
//                        .moveToElement(driver.findElement(By.id("droppable")))
//                                .release().build().perform();
//        Thread.sleep(5000);
//


        //to find the count of an iframe
//        List<WebElement> youFrames = driver.findElements(By.tagName("iframe"));
//        System.out.println("Total number of iframes are: " + youFrames.size());
//
//        for(WebElement youFrame : youFrames){
//            String source = youFrame.getDomAttribute("src");
//            System.out.println("The url of the iframe is: " + source);
//        }



    // driver.get("https://www.orangehrm.com/");
        driver.switchTo().frame("iframe");

     WebElement w = driver.findElement(By.className("Resources"));

        Select s = new Select(w);
        s.selectByIndex(1);

        Thread.sleep(3000);
        driver.quit();























    }
}
