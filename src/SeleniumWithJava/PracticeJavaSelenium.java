import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJavaSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demo.automationtesting.in/WebTable.html");


        driver.findElement(By.linkText("Practice Site")).click();

        driver.findElement(By.linkText("Shop")).click();

        driver.findElement(By.className("woocommerce-LoopProduct-link")).click();

        driver.findElement(By.linkText("Android Quick Start Guide")).click();



    }
}
