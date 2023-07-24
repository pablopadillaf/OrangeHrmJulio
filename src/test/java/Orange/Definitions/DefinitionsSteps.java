package Orange.Definitions;

import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Orange.Steps.Conexion;
import io.cucumber.java.en.Given;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private PimPage pimPage = new PimPage(driver);


    @Given("^open the browser$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();
    }

    @When("^the user fill out user (.*) password (.*)$")
    public void fillOutLogin(String userName, String password) {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, password);
    }

    @When("^the user select option add employed$")
    public void llegarAgregarEmpleado() {
        this.pimPage = new PimPage(driver);
        this.pimPage.llegarAgregarEmpleado();
    }

    @When("^the user out first name (.*) middle (.*) lastName (.*)")
    public void fillOutAddEmployed(String firstName, String middleName, String lastName) {
        this.pimPage = new PimPage(driver);
        this.pimPage.fillOutAddEmployed(firstName, middleName, lastName);
    }

    @Then("^the user validate create (.*) (.*)")
    public void validateEmployed(String firstName, String lastName) {
       this.pimPage = new PimPage(driver);
       this.pimPage.validateEmployed(firstName, lastName);
    }
}