import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Adlibris {


    public void adlibrisWebsite() {
        System.setProperty("webdriver.chrome.driver", ".driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://Adlibris.Com/se/");
        WebElement p = driver.findElement(By.name("q"));
        p.sendKeys("praktisk mjukvarutestning");
        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        p.submit();
        driver.findElement(By.cssSelector(".purchase__wrapper .btn--first-divider")).click();
        driver.findElement(By.linkText("Till kassan")).click();
        driver.close();
        Main.meny();
    }

}
