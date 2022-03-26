package Lessons_10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GooglePage {
    org.openqa.selenium.chrome.ChromeDriver chromeDriver;

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void firstTest() throws InterruptedException {
        chromeDriver.get("https://www.google.com/");
        chromeDriver.findElement(By.name("q")).click();
        chromeDriver.findElement(By.name("q")).sendKeys("Java");

        chromeDriver.findElement(By.cssSelector(".FPdoLc.lJ9FBc *[value='Пошук Google']")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
    }

    @After
    public void shotDown() {
        chromeDriver.close();
    }


}


