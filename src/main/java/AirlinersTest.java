
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AirlinersTest {

    public void airlinersTestsearch() {
    System.setProperty("webdriver.chrome.driver", ".driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.airliners.net");
    WebDriverWait w = new WebDriverWait(driver, 5);
    w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
    driver.findElement(By.cssSelector(".ljEJIv")).click();
    driver.findElement(By.cssSelector(".nav-link-news > a")).click();
    driver.findElement(By.cssSelector(".ps-v2-results-col:nth-child(8) .lazy-load")).click();
    driver.findElement(By.linkText("Large")).click();
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    Main.meny();
    }
}
