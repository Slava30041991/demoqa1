package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accordion {
    WebDriver driver;
    public static final By ACCORDION_LOCAOR_STATE = By.xpath("//div[text() = 'Select State']/..");
    public static final By ACCORDION_LOCAOR_CITY = By.xpath("//div[text() = 'Select City']/..");

    String locatorState = "//div[text() = '%s']/..";
    String locatorCity = "//div[text() = '%s']/..";

    public Accordion(WebDriver driver) {
        this.driver = driver;
    }

    public void selectStateCity(String state, String city ){
        driver.findElement(ACCORDION_LOCAOR_STATE).click();
        driver.findElement(By.xpath(String.format(locatorState,state))).click();
        driver.findElement(ACCORDION_LOCAOR_CITY).click();
        driver.findElement(By.xpath(String.format(locatorCity,city))).click();

    }
}
