package sept_2025_selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class C6_ExplicitWaitDemo {

 

	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver",
	                "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://kite.zerodha.com/");

	        // EXPLICIT WAIT
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      
	        // Wait until username field is visible
	        WebElement userId = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("userid"))
	        );

	        userId.sendKeys("demoUser");

	        // Wait until password field is visible
	        WebElement password = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("password"))
	        );

	        password.sendKeys("demoPass");

	        // Wait until login button is clickable
	        WebElement loginBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
	        );

	        loginBtn.click();

	        driver.quit();
	    }
	}



