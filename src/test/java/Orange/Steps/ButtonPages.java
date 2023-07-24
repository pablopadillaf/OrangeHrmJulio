package Orange.Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//ul//li//a//span[text()='PIM']")
    private WebElement btnPin;

    @FindBy(how = How.XPATH, using = "//div//button[text() = ' Add ']")
    private WebElement btnAddEmployed;

    @FindBy(how = How.XPATH, using = "//button[text() = ' Save ']")
    private WebElement btnSaveEmployed;

    public ButtonPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void btnLogin() {
        this.btnLogin.isDisplayed();
        this.btnLogin.click();
    }

    public void btnPin() {
        this.btnPin.isSelected();
        this.btnPin.click();
    }

    public void btnAddEmployed() {
        this.btnAddEmployed.isDisplayed();
        this.btnAddEmployed.sendKeys(Keys.ENTER);
    }

    public void SaveEmployed(){
        this.btnSaveEmployed.isDisplayed();
        this.btnSaveEmployed.click();
    }

}
