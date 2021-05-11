import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

 class Main {

    public static void main(String[]args) {
        System.setProperty("webdriver.chrome.driver", ".driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actitime.com/");
        driver.close();
    }

    public static void meny() {
        Scanner menyInput = new Scanner(System.in);
        System.out.println(" Choose a class \n g for google \n a for adlibris \n b for Actitime");
        String input = menyInput.nextLine();
        switch (input) {
            case "g":
                Google newGoogle = new Google();
                newGoogle.googleSearch();
                break;
            case "a":
                Adlibris adlibrisSearch = new Adlibris();
                adlibrisSearch.adlibrisWebsite();
                break;
            case "b":
                Actitime newActitme = new Actitime();
                newActitme.surfActitime();
                break;
        }
    }
}
