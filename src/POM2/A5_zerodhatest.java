package POM2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import _01_utility._01_excel;

public class A5_zerodhatest {
	WebDriver driver;
	public void loginwithcreditials() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		A4_zerodhaPOM zerodha=new A4_zerodhaPOM(driver);
		String username1=_01_excel.getdata(3, 1, "sh");
		zerodha.enterusernaame(username1);
		String pass=_01_excel.getdata(4, 1, "sh");
		zerodha.enterpassword(pass);
		zerodha.press();
	}
	
	public void pressonsignup() {
		driver=A0_openbrowser.browser("https://kite.zerodha.com/");
		A4_zerodhaPOM zerodha=new A4_zerodhaPOM(driver);
		zerodha.presssignup();

	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		A5_zerodhatest a5=new A5_zerodhatest();
		a5.loginwithcreditials();
		a5.pressonsignup();
	}
}
