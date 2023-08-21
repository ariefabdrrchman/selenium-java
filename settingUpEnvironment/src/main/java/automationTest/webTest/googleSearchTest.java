package automationTest.webTest;

import automationTest.webPage.googleSearch;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchTest {

    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws Exception {
        System.out.println("Test starts, opening google.com");
        try {
            googleTest();
        } finally {
            driver.quit();
        }
        System.out.println("Test finished");
    }

    public static void googleTest() throws Exception {
        driver.get("https://google.com");
        googleSearch.searchBox(driver).sendKeys("Selenium Java");
        Thread.sleep(1000);
        googleSearch.searchButton(driver).sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }
}
