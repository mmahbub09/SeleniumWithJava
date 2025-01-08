import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PracticeLesson {

    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get("https://demo.automationtesting.in/Alerts.html");


//        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("CancelTab")).click();
//        Thread.sleep(2000);
//
//
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//        Thread.sleep(2000);
//
//        driver.quit();


//.  Exercise

      //  driver.get("https://demo.automationtesting.in/Register.html");
//    First name
//     driver.findElement(By.xpath("//form[1]/div[1]/div[1]/input")).sendKeys("John");

//.  Last name
//     driver.findElement(By.xpath("//form[1]/div[1]/div[2]/input[1]")).sendKeys("Oliver");

//.   Address
//     driver.findElement(By.xpath("//div[1]/textarea[1]")).sendKeys("2104 Hillside Avenue");

//.    Email
//     driver.findElement(By.xpath("//div[3]/div[1]/input[1]")).sendKeys("abc@yahoo.com");

//.   Phone
//    driver.findElement(By.xpath("//div[4]/div[1]/input[1]")).sendKeys("123-456-7890");

//.    Gender
//     driver.findElement(By.xpath("//label[2]/input[1]")).click();

//.   Hobbies
//    driver.findElement(By.id("checkbox2")).click();


//   Language
//   driver.findElement(By.id("msdd")).click();
//
//        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]")));
//
//        select.selectByVisibleText("English");
//
//        List<WebElement> availableOptions = select.getOptions();
//
//        for (WebElement option : availableOptions) {
//            System.out.println(option.getText());
//            if (option.getText().equalsIgnoreCase("English")) {
//                option.click();




//    Skill
//        driver.findElement(By.id("Skills")).click();
//
//        Select select = new Select(driver.findElement(By.id("Skills")));
//
//        select.selectByVisibleText("C");


//       Country
//        driver.findElement(By.id("countries")).click();

//        Select select = new Select( driver.findElement(By.id("countries")));

//        select.selectByVisibleText();


//     Select Country

        //driver.findElement(By.className("select2-selection__arrow")).click();
//        new WebDriverWait(driver, Duration.ofSeconds(20)).ignoring(StaleElementReferenceException.class)
//                .until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("select2-selection__arrow"))))
//                .click();
//        Thread.sleep(2000);
//        driver.findElement(By.className("select2-search__field")).sendKeys("Bangladesh");
//        Thread.sleep(2000);


//Date of Birth
//Year
//      WebElement yearbox = driver.findElement(By.id("yearbox"));
//        Select forYearBox = new Select(yearbox);
//        forYearBox.selectByVisibleText("1995");
//        Thread.sleep(2000);


 // Month
//        WebElement monthBox = driver.findElement(By.xpath("//div[2]/select[1]"));
//        Select forMonthBox = new Select(monthBox);
//        forMonthBox.selectByVisibleText("July");
//        Thread.sleep(2000);

//Day
//      WebElement dayBox = driver.findElement(By.id("daybox"));
//      Select forDayBox = new Select(dayBox);
//      forDayBox.selectByVisibleText("20");
//      Thread.sleep(2000);
//


//   Password
//     driver.findElement(By.id("firstpassword")).sendKeys("abc123");
//     Thread.sleep(2000);

//.  Confirm password
//     driver.findElement(By.id("secondpassword")).sendKeys("abc123");
//     Thread.sleep(2000);

//  Submit Button
//     driver.findElement(By.id("submitbtn")).click();
//     Thread.sleep(2000);
//

//   Refresh Button
//     driver.findElement(By.id("Button1")).click();
//     Thread.sleep(5000);



//     driver.quit();








    //Practice Problems

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     driver.get("google.co.in");

//     String title = driver.getTitle();
//
//     if(title.equals("google")){
//         System.out.println("The Title is: + Google");
//
//        }else{
//         System.out.println("Error");
//     }










            }
        }




