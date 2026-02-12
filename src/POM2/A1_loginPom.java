package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1_loginPom {
	@FindBy(xpath = "//input[@name='email']")private WebElement username;

	@FindBy(xpath = "//input[@name='pass']")private WebElement password;
	@FindBy(xpath = "//button[@name='login']")private WebElement submit;
	
	public  A1_loginPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterusername() {
		username.sendKeys("asfpravin");
	}
	public void enterpass() {
		password.sendKeys("lasllsad");
	}
	public void submit() {
		submit.click();
	}
	

}
