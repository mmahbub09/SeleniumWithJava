import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.orangehrm.com/");


        Actions actions = new Actions(driver);
//
//        actions.moveToElement(driver.findElement(By.linkText("Company"))).build().perform();
//        Thread.sleep(2000);
//
//        driver.findElement(By.linkText("Careers")).click();
//        Thread.sleep(2000);
//
//        driver.quit();


 //Exercise

//        actions.moveToElement(driver.findElement(By.linkText("Resources"))).build().perform();
//        Thread.sleep(2000);
//
//        driver.findElement(By.linkText("eBooks")).click();
//        Thread.sleep(2000);
//
//        driver.quit();


 //Exercise

      actions.moveToElement(driver.findElement(By.linkText("Solutions")))
              .moveToElement(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[1]")))
              .moveToElement(driver.findElement(By.linkText("HR Administration")))
              .click()
              .build()
              .perform();
      Thread.sleep(2000);


      //create a class named homepage.





    }
}
