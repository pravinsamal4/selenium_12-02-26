package sept_2025_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_getTitle_getCurrentUrl {
	public static void main(String[] args) {
		 System.setProperty("wedriver.chrome.driver", "D:\\exes\\chromedriver-win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
		 
		 String a=driver.getTitle();
		 System.out.println(a);
		 
		 String b=driver.getCurrentUrl();
		 System.out.println(b);
	}

}
