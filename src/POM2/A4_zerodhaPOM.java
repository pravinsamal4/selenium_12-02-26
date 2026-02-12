package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A4_zerodhaPOM {
	
	@FindBy(xpath = "//input[@id=\"userid\"]")private WebElement username;
	@FindBy(xpath = "//input[@id=\"password\"]")private WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement loginpress;
	@FindBy(xpath = "//a[text()=\"Forgot user ID or password?\"]")WebElement forgot;
	@FindBy(xpath = "//a[@class=\"text-light\"]")WebElement signup;
	public A4_zerodhaPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	public void enterusernaame(String user) {
		username.sendKeys(user);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	public void press() {
		loginpress.click();
	}
	public void pressforgot() {
		forgot.click();
	}
	public void presssignup() {
		signup.click();
	}
	
}
