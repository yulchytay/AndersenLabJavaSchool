package infra;

import io.opentelemetry.api.internal.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  abstract class BasePage {

    private WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;

    }

    protected BasePage() {
    }

    public int getWindowHandlesNumber(){
        return driver.getWindowHandles().size();
    }

    public void navigateToWebPage(String url){
        driver.get(url);
    }

}
