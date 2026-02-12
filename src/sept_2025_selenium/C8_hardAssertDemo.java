package sept_2025_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class C8_hardAssertDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement login= driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
		// Wait until login button is clickable and return it
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		
		 // HARD ASSERT → stop execution if button is not clickable
		Assert.assertTrue(login.isEnabled(), "FAIL: Login button is not clickable");
//		Assert.assertFalse(login.isEnabled(), "FAIL: Login button is not clickable");  //if it fall here it will not perform further click 
		login.click();
	}

}
