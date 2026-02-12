package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_isEnabled {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://testkru.com/Elements/Buttons");
		  
	        WebElement element = driver.findElement(By.id("disabledButton"));
	  
	        System.out.println("Is element enabled on webpage: " + element.isEnabled());
	        
	        WebElement element1 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
	        System.out.println("Is element enabled on webpage: " + element1.isEnabled());

	
	
	}

}
