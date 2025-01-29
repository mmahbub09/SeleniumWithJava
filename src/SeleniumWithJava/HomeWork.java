import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HomeWork {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      driver.get("https://demo.automationtesting.in/Register.html");

//      driver.findElement(By.className("dropdown-toggle")).click();
//
//      Select select1 = new Select( driver.findElement(By.className("dropdown-toggle")));
//      Thread.sleep(2000);
//
//      select1.selectByValue("Alerts");
//
//      List<WebElement> options3 = select1.getOptions();
//
//      for(WebElement option : options3){
//            System.out.println(option.getText());
//            if(option.getText().equalsIgnoreCase("Alerts")){
//                option.click();



//      Exercise 2
//
//        driver.get("https://demo.automationtesting.in/Datepicker.html");
//
//        driver.findElement(By.id("datepicker1")).click();
//        Thread.sleep(2000);
//
//        String date = "09-December-2024";
//        String dateArr[] = date.split("-");
//        String dayOfTheDate = dateArr[0];
//        String monthOfTheDate = dateArr[1];
//        String yearOfTheDate = dateArr[2];
//
//        Select month = new Select(driver.findElement(By.xpath("//select[@class='datepick-month-year'][1]")));
//        month.selectByVisibleText(monthOfTheDate);
//
//

 //     Exercise 3

        driver.findElement(By.xpath("//a[contains(text(),'Interactions')]//following-sibling::ul[@class='dropdown-menu']/li")).click();

        ////a[contains(text(),'Interactions')]//following-sibling::ul[@class='dropdown-menu']/li










    }

}
