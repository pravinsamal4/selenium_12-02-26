package _01_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import _01_POM._01_orangehrmlivePOM;
import _01_utility._01_openbrowser;

public class _01_orangehrmliveTest {
	
	WebDriver driver;
	@BeforeClass
	public void lunchbrowser() {
		driver=_01_openbrowser.browser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void loginwithcreditials() throws InterruptedException {
		_01_orangehrmlivePOM or=new _01_orangehrmlivePOM(driver);
		or.enterusername(driver);
		or.enterpass(driver);
		or.press();
	}
	@Test
	public void test1() {
		System.out.println("hello");
	}

}
