import org.openqa.selenium.WebDriver;

public class CreateAccountPageBuilder {
    private WebDriver driver;

    public CreateAccountPageBuilder setDriver(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public CreateAccountPage createCreateAccountPage() {
        return new CreateAccountPage(driver);
    }
}