import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Actitime {

    public void surfActitime(){


        System.setProperty("webdriver.chrome.driver", ".driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actitime.com");
        Main.meny();
    }
}
