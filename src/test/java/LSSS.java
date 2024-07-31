import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners({AllureTestNg.class})

public class LSSS {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }


    @Test
    public void testCategoryFilter() {

        try {

            driver.get("https://rozetka.com.ua/notebooks/c80004/");


            wait = new WebDriverWait(driver, Duration.ofSeconds(3));


            WebElement agnFilter = driver.findElement(By.xpath("//rz-button-product-page:nth-child(2)"));
            agnFilter.click();

            wait = new WebDriverWait(driver, Duration.ofSeconds(3));



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
        }









