import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

        public void seleniumStart() {
            System.setProperty("webdriver.chrome.driver", ".driver/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
        }
}
