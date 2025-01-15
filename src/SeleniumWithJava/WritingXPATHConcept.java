import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WritingXPATHConcept {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

  //      driver.get("https://www.citi.com");
 //       driver.get("https://www.td.com/us/en/personal-banking");



        //xpath is 2 types
        // 1. Absolute xpath - Absolute XPath: Begins from the root of the HTML document and specifies the complete path to the element. It’s not as flexible and can break if the page structure changes.
 //Ex: /html/body/dev[1]/div/div/div/div[1]/article/div[2]/div[1]/h1/span
       //2. Relative xpath- Starts from a specific element and navigates through the DOM hierarchy to locate the desired element. It’s more flexible and resilient to changes in the page structure.
   // Relative xpath always starts with forwards slash(//)
   // Get the html tag of the element.
   // then two square brackets, so that means the high level structure is : //html tag[]
   //Xpath is recommended when there is no ID or name property available for the element.


        //Rule 1: //html tag[@property='value']
//       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc@yahoo.com");
//       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc1234");
//       driver.findElement(By.xpath("//button[@class='cds-button cds-signon-button cds-button-primary cds-button-lg']")).click();
//
//       Thread.sleep(2000);



//     Rule 2: using contains: //html tag[contains@property, 'value')]
//     It has the ability to find the element with partial text.
//     Works better for dynamic value like Ex: id=test_123, test_456, test_789 (the id keep changing in every refresh)

//       driver.findElement(By.xpath("//a[contains(@class, 'includes')]")).click();
//        Thread.sleep(2000);

     // Rule 3: start-with - Matches the starting text of the attribute to find the element and works good for long property value.
    // Also for dynamic id like id=test_123, test_456, test_789 and this is better than contains.

    //    driver.findElement(By.xpath("//button[starts-with(@class, 'cds-cta btn-threeup secondaryCta H')]")).click();

    //    driver.quit();


//Rule 4: ends-with - opposite of starts-with
// works better for dynamic locator
//also for dynamic id like id=123_test, id=456_test, id=789_test
// structure: //html tag[ends-with(@property, 'ending part of the value')]



//Rule 5: specially for links
//matches the text of the links or button, specially for the links
//example: //a[contains(text(), ' Activate ')]
// driver.findElement(By.xpath("//a[contains(text(), ' Activate ')]")).click();
 //OR
//driver.findElement(By.xpath("//a[text]()= ' Activate ']")).click();
// Thread.sleep(2000);


// Rule 6: Using Index Number
// this one works if there is more than one element with same attribute property and value.
  //driver.get("https://www.td.com/us/en/personal-banking");
 // driver.findElement(By.xpath("//li[@class='cmp-link'][1]")).click();
 // Thread.sleep(2000);

//  driver.quit();


//Rule 7: using 'and' and 'or'
// when one attribute does not work then use two attributes with 'and' and 'or'
// //a[@href='#cmp-modal~ccdes2' and @class ='tooltip-bottom-border' ]
//driver.findElement(By.xpath("//a[@href='#cmp-modal~ccdes2' and @class ='tooltip-bottom-border' ]")).click();
//Thread.sleep(2000);
//driver.quit();


// Rule 8: parent, child, and siblings
// //a[@class='cmp-primary-header__menu-link']//parent::li[@class='cmp-primary-header__menu-item ']
//driver.findElement(By.xpath("//a[@class='cmp-primary-header__menu-link']//parent::li[@class='cmp-primary-header__menu-item ']")).click();
//Thread.sleep(2000);

//find by sibling
// //a[text()='Commercial']//parent::li[@class='cmp-link']//preceding-sibling::li[@class='cmp-link']











// Practices
    driver.get("https://www.citi.com/");

    //Rule 1
    //    driver.findElement(By.xpath("//div[@class='carousel--custom-pager__item slick-slide slick-active']")).click();

    //Rule 2


    //Rule 3
   //    driver.findElement(By.xpath("btn cta cta--primary cta--large cta--btn-green-aloe")).click();

//Rule 5
// driver.findElement(By.xpath("//a[contains(text(), 'Open an Account')]")).click();
// Thread.sleep(2000);

 //Rule 7
 //driver.findElement(By.xpath("//a[@href='https://www.citi.com/banking/bank-accounts?intc=citihpmenu_overview_bank-accounts' and @class='main-links plusIcon blueCustomerBtns blueAccPadding ng-star-inserted']")).click();
 Thread.sleep(2000);



    }
}
