package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MSEdge {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\aviik\\IdeaProjects\\Software\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        String url = driver.getCurrentUrl();
        System.out.println(url);

        Thread.sleep(1000);
        driver.close();



    }
}
