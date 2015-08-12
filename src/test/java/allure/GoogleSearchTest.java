package allure;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void searchBananasTest() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.id("lst-ib")).sendKeys("BANANAS");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();
        Assert.assertTrue(driver.findElement(
                By.cssSelector("[data-async-context='query:BANANAS'] h3")
        ).getText().toLowerCase().contains("banana"));
        driver.quit();

    }

}
