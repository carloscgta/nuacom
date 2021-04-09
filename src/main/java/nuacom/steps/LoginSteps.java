package nuacom.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nuacom.core.DriverFactory;
import nuacom.pages.LoginPage;

public class LoginSteps {

    @Before(value = "@nuaconLogin")
    public void before(Scenario cenario) throws Exception {

    }

    //DriverFactory.page.GetInstance(NuacomLoginPage.class).acceptCookie();
    // DriverFactory.page.GetInstance(LoginPage.class).clickLinkLogin();


    @Given("^the user is placed in the home page$")
    public void the_user_is_placed_in_the_home_page() throws Throwable {

        DriverFactory.page.GetInstance(LoginPage.class).acceptCookie();
        DriverFactory.page.GetInstance(LoginPage.class).clickLinkLogin();
    }

    @Given("^set the username \"([^\"]*)\"$")
    public void set_the_username(String arg1) throws Throwable {

        DriverFactory.page.GetInstance(LoginPage.class).writeUserNameNuacom(arg1);

    }

    @Given("^set the Password \"([^\"]*)\"$")
    public void set_the_Password(String arg1) throws Throwable {
        DriverFactory.page.GetInstance(LoginPage.class).writePasswordNuacom(arg1);
    }

    @When("^Click in Login button$")
    public void click_in_Login_button() throws Throwable {
        DriverFactory.page.GetInstance(LoginPage.class).clickLoginButtonNuacom();

    }

    @Then("^the application should not perform the login displaying the message \"([^\"]*)\"$")
    public void the_application_should_not_perform_the_login_displaying_the_message(String arg1) throws Throwable {
        DriverFactory.page.GetInstance(LoginPage.class).validateInvalidLogin();
    }


    @After(value = "@nuaconLogin")
    public void after(Scenario cenario) throws Exception {

    }

}
