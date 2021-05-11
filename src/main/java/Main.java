import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

 class Main {

    public static void main(String[]args) {
        meny();
    }

    public static void meny() {
        while (true) {
        Scanner menyInput = new Scanner(System.in);
        System.out.println(" Choose a class \n g for google \n a for adlibris \n b for Actitime \n p for Airliners \n e for exit");
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
                case "p":
                    AirlinersTest a = new AirlinersTest();
                    a.airlinersTestsearch();
                    break;
                case "e":
                    System.exit(0);
                default:
                    System.out.println("Wrong Key");
            }
        }
    }
}
