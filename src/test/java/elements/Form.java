package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Form {
    WebDriver driver;

    String formLocator = "//tr//td[1][text() ='%s']/../td[2]";

    public void examinationForm(String text){
        driver.findElement(By.xpath(String.format(formLocator))).sendKeys(text);

    }

    public Form(WebDriver driver) {
        this.driver = driver;
    }
}
