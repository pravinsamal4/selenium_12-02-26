package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_Locator_xpath_by_Attribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\exes\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement name= driver.findElement(By.xpath("//input[@name=\"email\"]"));
		name.sendKeys("pravin");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("pravin");
		Thread.sleep(2000);

	}
		

}
