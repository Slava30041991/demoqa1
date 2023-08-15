package pages;
import elements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public static final By STUDENT_FORM_TITLE = By.xpath("//h5 [text() ='Student Registration Form' ]");
    public static final By BUTTON_CLOSE = By.xpath("//button[@id = 'submit']");
    public static final By FORM_LOCATOR = By.xpath("//tr//td[1][text() ='%s']/../td[2]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(BASE_URL);
        return this;
    }

    public void create(){

        new Input(driver,"firstName").write("Misha");
        new Input(driver,"lastName").write("Misjha");
        new Input(driver,"userEmail").write("lemom12@mail.ro");
        new Input(driver,"userNumber").write("2514785658");
        new RadioButton(driver,"Female").selectRadiButton();
        new Calendar(driver).selectDate("August","2023","4");
        new TextArea(driver,"currentAddress").writeTextArea("icle we will go into");
        new CheckBox(driver,"2").selectCheckBox();


    }
    public void  clickButtonEnter(){
        new Button(driver).submitForm();
    }

    public void accordionCreate(){
        new Accordion(driver).selectStateCity("NCR","Delhi");
    }


    @Override
    public boolean isPageOpen() {
        return isExist(STUDENT_FORM_TITLE);
    }}