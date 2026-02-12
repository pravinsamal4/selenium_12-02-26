package sept_2025_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_new_tab {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		
	}

}
