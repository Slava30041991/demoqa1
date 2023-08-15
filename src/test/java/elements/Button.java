package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {
    WebDriver driver;

    public static final By BUTTON_CLOSE = By.xpath("//div[@class ='modal-footer' ]/button");

    public Button(WebDriver driver) {
        this.driver = driver;
    }

    public void submitForm(){
        driver.findElement(By.id("firstName")).sendKeys("\n");
        driver.findElement(BUTTON_CLOSE).click();

   }

}
