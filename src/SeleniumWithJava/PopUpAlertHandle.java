import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertHandle {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.name("proceed")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
     //   alert.accept();

      //  driver.quit();
        if(alert.getText().equals("Please enter a valid username")){
            System.out.println("This is correct");
        }else {
            System.out.println("This is incorrect");
        }
        alert.accept();


    }
}
