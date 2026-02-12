package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A0first {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\exes\\chromedriver-win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 System.out.println(driver.getCurrentUrl());
	 Dimension d=new Dimension(100, 200);
	 driver.manage().window().setSize(d);
	 driver.manage().window().maximize();
	 
	 
	WebElement name= driver.findElement(By.xpath("//input[@name=\"email\"]"));
	name.sendKeys("pravin");
	
	WebElement pass=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
	pass.sendKeys("password");
	
	Thread.sleep(2000);
	WebElement hid=driver.findElement(By.xpath("//div[contains(@class,\"_9lsb \")]"));
	hid.click();
	
}
}
