package sept_2025_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B4_Popup_2 {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		WebElement a=driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
//		a.click();
//		Alert a1=driver.switchTo().alert();
//		a1.accept();
//		-------------------------------------------------------------------
//		WebElement b=driver.findElement(By.xpath("//button[@name=\"confirmalertbox\"]"));
//		b.click();
//		Alert b2=driver.switchTo().alert();
//		b2.dismiss();
		
//		------------------------------------------------------------------
		WebElement c3=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
//	    
		
		
		
		
		
		
		
		
		
		
		
		
		                                                                             ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", c3);

		c3.click();
		Alert c=driver.switchTo().alert();
		c.sendKeys("sasmal");
		c.accept();
		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());
	}   
}
