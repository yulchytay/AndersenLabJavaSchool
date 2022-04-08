import infra.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends BasePage {

    private WebDriver driver;
    @FindBy(name = "firstName")
    WebElement firstNameField;
    @FindBy(name="lastName")
    WebElement lastNameField;
    @FindBy(name="Username")
    WebElement userNameField;
    @FindBy(name="Passwd")
    WebElement passwordField;
    @FindBy (name="ConfirmPasswd")
    WebElement confirmPasswordField;
    @FindBy(id="accountDetailsNext")
    WebElement nextButton;
    By mainPageTitle= By.id("headingText");



    public CreateAccountPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    private void fillField(WebElement field, String value){
        field.sendKeys(value);
    }
    public void fillFirstName(String firstName)
    {
        this.fillField(firstNameField, firstName);

    }
    public void fillLastName(String lastName)
    {
      this.fillField(lastNameField, lastName);

    }
    public void fillUserName(String userName)
    {
        this.fillField(userNameField,userName);

    }
    public void fillPassword(String password)
    {
        this.fillField(passwordField,password);

    }
    public void fillConfirmPassword(String password)
    {
        this.fillField(confirmPasswordField,password);

    }
    public void clickNextButton(){
        nextButton.click();

    }

    public boolean validatePageTitle(String expectedTitle){
             String actualTitle = driver.findElement(mainPageTitle).getText();
    return actualTitle.equals(expectedTitle);
    }

}
