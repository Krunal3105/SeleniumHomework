package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aviik\\IdeaProjects\\Software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        Thread.sleep(2000);
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

        Thread.sleep(2000);
        driver.navigate().back();

        Thread.sleep(2000);
        driver.quit();


    }
}
