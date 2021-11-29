package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);
//        //driver.navigate().to();
        driver.findElement(By.id("gender-male")).click();
        //driver.findElement(By.xpath("//input[@value='M']")).click(); //Custom path

        Thread.sleep(1000);
        driver.findElement(By.id("FirstName")).sendKeys("Krunal");

        Thread.sleep(1000);
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        selectValueFromDropDown(day,"11");
        selectValueFromDropDown(month, "November");
        selectValueFromDropDown(year, "2011");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@id, 'Email')]")).sendKeys("abc123@gmail.com");

        Thread.sleep(1000);
        WebElement element = driver.findElement(By.id("Company"));
        element.sendKeys("Xyz Ltd");

        Thread.sleep(1000);
        driver.findElement(By.id("Newsletter")).click(); // to un-tick the newsletter radio button.

        Thread.sleep(1000);
        driver.findElement(By.name("Password")).sendKeys("Abcxyz123@");

        Thread.sleep(1000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcxyz123@");

        Thread.sleep(1000);
        driver.findElement(By.id("register-button")).click();

    }//Select select1 = new Select(day);
        public static void selectValueFromDropDown(WebElement element, String value) {
            Select select = new Select(element);
            select.selectByVisibleText(value);
        }





//        WebElement element = driver.findElement(By.xpath("//label[@for='gender']"));
//        Actions gender = new Actions(driver);
//        Actions doubleclick = gender.doubleClick(element).doubleClick();
//        doubleclick.perform();

    }

