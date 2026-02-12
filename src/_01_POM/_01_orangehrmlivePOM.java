package _01_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_orangehrmlivePOM {
	
	@FindBy (xpath = "//input[@name=\"username\"]")private WebElement username;
	@FindBy(xpath = "//input[@type=\"password\"]")private WebElement password;
	@FindBy(xpath ="//button[@type=\"submit\"]")private WebElement login;
	
	public _01_orangehrmlivePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(WebDriver driver) throws InterruptedException {
//		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("Admin");

	
	}
	public void enterpass(WebDriver driver) throws InterruptedException {
//		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(password));

		password.sendKeys("admin123");
	}
	
	public void press() {
		login.click();
	}

}
