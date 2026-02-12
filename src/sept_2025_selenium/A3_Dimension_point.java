package sept_2025_selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Dimension_point {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Dimension q=new Dimension(300,200);
		driver.manage().window().setSize(q);
//		Thread.sleep(2000);
//		driver.close();
		driver.quit();
		
	
	}

}
