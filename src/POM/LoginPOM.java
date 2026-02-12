package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	@FindBy(xpath = "//input[@name=\"email\"]")private WebElement username;
	@FindBy(xpath = "//input[@name=\"pass\"]")private WebElement password;
	@FindBy(xpath = "//button[@name=\"login\"]")private WebElement submit;
	
	public LoginPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName() {
		username.sendKeys("pravin");
	}
	
	public void enterpassword() {
		password.sendKeys("pravin");
	}
	public void press() {
		submit.click();
	}
}
