package nuacom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//https://www.baeldung.com/java-selenium-webdriver-cookies

    @FindBy(how = How.XPATH, using = "(//a[@href='//app.nuacom.ie/login/'])[1]")
    public WebElement linkLogin;

    @FindBy(how = How.XPATH, using = "//*[@id='login_form']/div[2]/div[1]/input")
    public WebElement inputUserName;

    @FindBy(how = How.XPATH, using = "//*[@id='login_form']/div[2]/div[2]/input")
    public WebElement inputPassword;

    @FindBy(how = How.XPATH, using = "//button[@id='login_form_submit']")
    public WebElement buttonLogin;

    @FindBy(how = How.XPATH, using = "//*[@id='login_form_submit']")
    public WebElement linkLoggedSession;

    @FindBy(how = How.XPATH, using = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement ButtoncookiePopup;


    @FindBy(how = How.XPATH, using = "//div[@class='login_error text-danger']")
    public WebElement erroMessageFailedLogin;

    public boolean validateInvalidLogin() throws InterruptedException {

        if(elementIsDisplayed(erroMessageFailedLogin))
            return true;
        return false;
    }



    public void acceptCookie(){
        try {

            click(ButtoncookiePopup);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void clickLinkLogin()  {

        try {

            click(linkLogin);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void writeUserNameNuacom(String username)  {

        try {
            waitForElement(inputUserName);
            writeText(inputUserName,username);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void writePasswordNuacom(String password) {

        try {
            waitForElement(inputPassword);
            writeText(inputPassword,password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButtonNuacom()  {
        try {
            click(buttonLogin);
            waitForElement(erroMessageFailedLogin);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean validateLoginNuacom()  {

        try {
            if(elementIsDisplayed(linkLoggedSession))
                return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }







}
