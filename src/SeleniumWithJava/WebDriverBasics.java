import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
    public static void main(String[] args) throws InterruptedException {


        // Step 0: Setting a system property
        //System.setProperty("webdriver.chrome.driver", "/Users/m33m/IdeaProjects/JavaSeleniumMaven/Driver/chromedriver");


        // Step 1: Declare a webdriver
        WebDriver driver = new ChromeDriver();


        //To maximize the browser
        driver.manage().window().maximize();


        //Step 2: To get the url or navigate to the given url
        driver.get("https://www.orangehrm.com/");

        //How to get the page title
        //System.out.println("The title of the page is: " + driver.getTitle());
        String title = driver.getTitle();

        if(title.equals("Human Resources Management Software | OrangeHRM")){
            System.out.println("we are in a correct site");
        }else {
            System.out.println("we are in a wrong site");
            System.out.println("the correct title is: " + driver.getTitle());
        }


        //Step 3: To click an element
        driver.findElement(By.id("Form_submitForm_action_request")).click();


        //To make the browser wait
        Thread.sleep(5000);

        //Step 4: to close the browser
        driver.quit();



    }
}
