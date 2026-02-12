package sept_2025_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A00_repractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		a.click();
//		WebElement b=driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
//		b.click();
		Alert c=driver.switchTo().alert();
		c.sendKeys("samal");
		System.out.println(c.getText());

//		b.sendKeys("samal");
	}
}
