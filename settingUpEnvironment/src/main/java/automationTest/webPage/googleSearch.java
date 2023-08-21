package automationTest.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearch {

    public static WebElement element = null;

    public static WebElement searchBox(WebDriver driver) {
        element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        return element;
    }

    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        return element;
    }
}
