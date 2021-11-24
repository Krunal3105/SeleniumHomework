package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException{


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aviik\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("xyz123@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Krunal3105");

       // driver.findElement(By.className("login-button")).click();
       // Thread.sleep(2000);
        // driver.findElement(By.className("ico-logout")).click();
        Thread.sleep(2000);
        driver.close();



    }
}
