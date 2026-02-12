package sept_2025_selenium;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_position {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	driver.manage().window().maximize();
	
	Point p=new Point(200, 350);
	driver.manage().window().setPosition(p);
	
	}

}
