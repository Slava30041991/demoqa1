package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String textAreaLocatorId = "currentAddress";
    String Id;

    public TextArea(WebDriver driver, String textAreaLocatorId) {
        this.driver = driver;
        this.Id = textAreaLocatorId;

    }

    public void writeTextArea(String text){
        driver.findElement(By.id(String.format(textAreaLocatorId, this.Id))).sendKeys(text);

    }
}
