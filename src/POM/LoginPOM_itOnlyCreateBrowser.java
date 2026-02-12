package POM;

import org.openqa.selenium.WebDriver;



	public class LoginPOM_itOnlyCreateBrowser {

	    // WebDriver reference used to control the browser
	    // Declared at class level to maintain the same browser session
	    WebDriver driver;

	    // Reference of LoginPOM class (Page Object Model)
	    // Used to access login page elements and actions
	    LoginPOM login;

	    // Setup method to initialize browser and page objects
	    public void setup() {

	        // Launches the browser and opens Facebook login page
	        // Returns WebDriver instance
	        driver = openbrowser.browser("https://www.facebook.com/");

	        // Creates LoginPOM object and passes WebDriver
	        // Initializes web elements using PageFactory
	        
	        login = new LoginPOM(driver);
	    }

	    // Method to perform login using valid credentials
	    public void loginwithcredentials() {

	        // Enters username into username field
	        login.enterUserName();

	        // Enters password into password field
	        login.enterpassword();

	        // Clicks the login button
	        login.press();
	    }

	    // Method to test login without entering credentials
	    public void loginwithoutcredentials() {

	        // Clicks login button without username and password
	        login.press();
	    }

	    // Method to close the browser and end the session
	    public void tearDown() {

	        // Closes all browser windows and quits WebDriver
	        driver.quit();
	    }

	    // Main method – execution starts from here
	    public static void main(String[] args) {

	        // Creates object of test class
	        LoginPOM_itOnlyCreateBrowser test = new LoginPOM_itOnlyCreateBrowser();

	        // Executes login with credentials test case
	        test.setup();                  // Open browser
	        test.loginwithcredentials();   // Perform login
	        test.tearDown();               // Close browser

	        // Executes login without credentials test case
	        test.setup();                  // Open browser again
	        test.loginwithoutcredentials();// Click login without input
	        test.tearDown();               // Close browser
	    }
	}




