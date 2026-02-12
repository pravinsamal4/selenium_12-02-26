
package sept_2025_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_openbrowser {
	public static WebDriver browser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	
}
