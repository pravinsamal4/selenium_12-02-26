package POM;

import org.openqa.selenium.WebDriver;

public class LoginTest {
	public void loginwithcredentials() {

	    // Launches the browser and navigates to Facebook login page
	    // openbrowser.browser() returns a WebDriver instance
	    WebDriver driver = openbrowser.browser("https://www.facebook.com/");

	    // Creates an object of LoginPOM class
	    // The WebDriver is passed to maintain the same browser session
	    // PageFactory initializes the web elements
	    LoginPOM login = new LoginPOM(driver);

	    // Enters the username into the username input field
	    login.enterUserName();

	    // Enters the password into the password input field
	    login.enterpassword();

	    // Clicks the login button to submit the login form
	    login.press();
	}

	public void loginwithoutcredentials() {

	    // Launches the browser and navigates to Facebook login page
	    WebDriver driver = openbrowser.browser("https://www.facebook.com/");

	    // Creates LoginPOM object using the current WebDriver instance
	    LoginPOM login = new LoginPOM(driver);

	    // Clicks the login button without entering username and password
	    login.press();
	}

	public static void main(String[] args) {

	    // Creates an object of the LoginTest class
	    LoginTest logintest = new LoginTest();

	    // Executes login test with valid credentials
	    logintest.loginwithcredentials();

	    // Executes login test without entering credentials
	    logintest.loginwithoutcredentials();
	}

}
