import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainTest {

        @Test
        public void firstTest() {
            WebDriverManager.chromedriver().setup();
           ChromeDriver driver = new ChromeDriver();
            driver.get("https://andersenlab.com/");
            driver.findElement(By.xpath("//button [text()='Let’s discuss your project']")).click();
            String button = driver.findElement(By.xpath("//button [text()='Let’s discuss your project']")).getCssValue("display");
            Assertions.assertEquals("inline-block", button);
            driver.quit();
        }
    @Test
        public void secondTest() {
        WebDriverManager.chromedriver().setup();
              ChromeDriver driver = new ChromeDriver();
            driver.get("https://andersenlab.com/pricing");
            String text = driver.findElement(By.xpath("//*[@href=\"/pricing\"]")).getText();
            Assertions.assertEquals("Pricing", text);
            driver.quit();
        }
    }

