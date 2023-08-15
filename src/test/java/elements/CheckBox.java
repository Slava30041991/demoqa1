package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {

    WebDriver driver;
    String value;
    String checkBoxLocator = "//input[@type = 'checkbox' and @value = '%s'] /.." ;

    public CheckBox(WebDriver driver, String value) {
        this.driver = driver;
        this.value = value;
    }
    public void selectCheckBox(){
        driver.findElement(By.xpath(String.format(checkBoxLocator,this.value))).click();
    }

}
