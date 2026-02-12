package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B7_iframe_Index_ID {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//iframe by index
//		driver.switchTo().frame(0);
//		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
//		text.sendKeys("samal");
		
		//iframe by id of iframe as string in this just pass value of id 
		driver.switchTo().frame("singleframe");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("samal");

	}

}
