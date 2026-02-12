package POM2;

import org.openqa.selenium.WebDriver;

import POM.openbrowser;

public class A2_logintest {
				
	
	public void loginwithcredentials() {
		WebDriver driver= openbrowser.browser("https://www.facebook.com/");
		A1_loginPom lo=new A1_loginPom(driver);
		lo.enterusername();
		lo.enterpass();
		lo.submit();
	}
	public static void main(String[] args) {
		A2_logintest login=new A2_logintest();
		login.loginwithcredentials();
	}

}
