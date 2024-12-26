import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
 //       driver.get("https://demo.automationtesting.in/Frames.html");

//        System.out.println(driver.findElements(By.tagName("iframe")).size());

//        driver.switchTo().frame("singleframe");

//        driver.findElement(By.cssSelector("body > section > div > div > div > input[type=text]")).sendKeys("hello iframe");

 //       Thread.sleep(3000);

 //       driver.quit();

 //  Exercise

//     driver.findElement(By.linkText("Home")).click();
//
//     driver.findElement(By.id("email")).sendKeys("test@test.com");
//
//     driver.findElement(By.id("enterimg")).click();
//
//     Thread.sleep(3000);


//     Exercise

//        driver.findElement(By.linkText("Register")).click();
//
//        driver.findElement(By.id("imagesrc")).sendKeys("/Users/m33m/Desktop/Test automation.docx");
//
//        Thread.sleep(2000);
//
//        driver.quit();


    }
}
