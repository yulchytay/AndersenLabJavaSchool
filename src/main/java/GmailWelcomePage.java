import infra.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailWelcomePage extends BasePage {
    private By creteAccountButton = By.linkText("https://www.google.com/intl/uk/gmail/about");
    private WebDriver driver;

    public GmailWelcomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public void clickOnCreateAccount(WebDriver driver) {
        this.driver = driver;
        driver.findElement(creteAccountButton).click();
    }

}

