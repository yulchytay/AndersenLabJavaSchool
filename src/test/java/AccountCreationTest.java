import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AccountCreationTest {
    private String createAccountUrl = "https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp";

    @Test
    public void createValidAccountTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.navigateToWebPage(createAccountUrl);
        createAccountPage.fillFirstName("Yuliia");
        createAccountPage.fillLastName("Petrushko");
        createAccountPage.fillUserName("Petrushko2022");
        createAccountPage.fillPassword("yuliiapetrushko2022");
        createAccountPage.fillConfirmPassword("yuliiapetrushko2022");
        createAccountPage.clickNextButton();
       // boolean result = createAccountPage.validatePageTitle("Подтвердите номер телефона");
        //Assert.assertTrue("Page title wasn't expected", result);

    }

    @Test
    public void createInvalidAccountTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.navigateToWebPage(createAccountUrl);
        createAccountPage.clickNextButton();
        boolean result = createAccountPage.validatePageTitle("Створити обліковий запис Google");
        Assert.assertTrue("page title wasn't expected", result);
        driver.quit();
    }
}
