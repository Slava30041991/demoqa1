package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class RadioButton {
    WebDriver driver;
    String value;
    String radioLocator = "//input[@type='radio' and @value = '%s']/..";
    public RadioButton(WebDriver driver, String value) {
        this.driver = driver;
        this.value = value;

    }

    public void selectRadiButton() {
        driver.findElement(By.xpath(String.format(radioLocator,this.value))).click();

    }
}