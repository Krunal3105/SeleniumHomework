package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\aviik\\IdeaProjects\\Software\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://demo.nopcommerce.com/");

    }
}
