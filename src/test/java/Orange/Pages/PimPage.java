package Orange.Pages;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {


    private ButtonPages buttonPages;
    private Questions questions;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement txtFirstName;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddleName;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement txtLastName;


    public PimPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    public void llegarAgregarEmpleado() {
        this.buttonPages.btnPin();
        this.buttonPages.btnAddEmployed();
    }

    public void fillOutAddEmployed(String firstName, String middleName, String lastName) {
        this.txtFirstName.sendKeys(firstName);
        this.txtMiddleName.sendKeys(middleName);
        this.txtLastName.sendKeys(lastName);
        this.buttonPages.SaveEmployed();

    }

    public void validateEmployed(String firstName, String lastName) {
        this.questions.timeSeconds(7);
        this.questions.validateEmployed(firstName, lastName);
    }
}
