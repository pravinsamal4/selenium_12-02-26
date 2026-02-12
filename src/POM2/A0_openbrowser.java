package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A0_openbrowser {
	public static WebDriver browser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public static void main(String[] args) {
		browser("https://kite.zerodha.com/");
	}
	

}
