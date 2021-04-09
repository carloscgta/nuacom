package nuacom.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage extends PageGenerator {

    public BasePage(WebDriver driver) {
        // TODO Auto-generated constructor stub
        super(driver);

    }
   // Properties prop = new Properties();

    // If we need we can use custom wait in BasePage and all page classes

    WebDriverWait wait = new WebDriverWait(this.driver, 40);

    public <T> void click(T elementAttr) throws InterruptedException {
        moverParaElemento(elementAttr);
        waitForElement(elementAttr);
        ((WebElement) elementAttr).click();

    }


    // Wait generic method

    public <T> void waitForElement(T elementAttr) throws InterruptedException {

        wait.until(ExpectedConditions. visibilityOf((WebElement) elementAttr));

        ((WebElement) elementAttr).isDisplayed();
    }

    public <T> Boolean elementIsDisplayed(T elementAttr) throws InterruptedException {
        scrollToElement(elementAttr);
        Boolean  isDisplayed=false;
        if(((WebElement) elementAttr).isDisplayed()) {
            isDisplayed=true;
        }

        return isDisplayed;
    }


    public <T> void scrollToElement(T elementAttr) throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ((WebElement) elementAttr));

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("window.scrollBy(0,200)", "");
    }



    // Write Text by using JAVA Generics (You can use both By or Webelement)

    public <T> void writeText(T elementAttr, String text) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));

        ((WebElement) elementAttr).sendKeys(text);

    }

    // Write Text by using JAVA Generics (You can use both By or Webelement)

    public <T> void clearText(T elementAttr) throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));

        ((WebElement) elementAttr).clear();

        ((WebElement) elementAttr).sendKeys("");

    }


    // Read Text by using JAVA Generics (You can use both By or Webelement)

    public <T> String readText(T elementAttr) {

        wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));

        return ((WebElement) elementAttr).getText();


    }


    // Read Text by using JAVA Generics (You can use both By or Webelement)

    public <T> void selectElement(T elementAttr, int index) {


        List<WebElement> elements = (List<WebElement>) elementAttr;

        elements.get(index).click();

    }

    public <T> void moverParaElemento(T elementAttr) throws InterruptedException {


        Actions builder = new Actions(driver);
        builder.moveToElement((WebElement) elementAttr).perform();

    }
}
