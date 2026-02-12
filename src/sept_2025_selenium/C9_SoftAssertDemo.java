package sept_2025_selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class C9_SoftAssertDemo {
	

	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver",
	                "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com ");

	        WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));

	        // Explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(login));

	        // SOFT ASSERT
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(login.isEnabled(), "FAIL: Login button is not clickable");
//	        softAssert.assertFalse(login.isEnabled(), "FAIL: Login button is not clickable");

	        // Test continues even if assertion fails
	        login.click();

	        // Collect all soft assertion results
	        softAssert.assertAll();

	        driver.quit();
	    }
	}



