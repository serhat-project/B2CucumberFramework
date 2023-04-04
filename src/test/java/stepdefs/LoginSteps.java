package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginObjects;
import readers.property.PropertyReader;

public class LoginSteps extends BaseSteps{

    LoginObjects loginObjects;
    @Given("user on homepage")
    public void userOnHomepage() {
        loginObjects = new LoginObjects();
        String url = PropertyReader.read().get("url");
        driver.get(url);
    }

    @When("user clicks My Account Link")
    public void userClicksMyAccountLink() {
        click(loginObjects.menuMyAccountLink);

    }

    @And("user clicks Login Link")
    public void userClicksLoginLink() {
        click(loginObjects.menuLoginLink);
    }

    @Then("Login page should be visible")
    public void loginPageShouldBeVisible() {
        waitForVisibility(loginObjects.loginFormUsername);
    }

    @When("user fill the login form with the following data")
    public void userFillTheLoginFormWithTheFollowingData(DataTable table) {

    }

    @And("user clicks Login button")
    public void userClicksLoginButton() {
    }

    @Then("login should be successfull")
    public void loginShouldBeSuccessfull() {
    }
}