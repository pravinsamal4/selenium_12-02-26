package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_isSelected {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://testkru.com/Elements/RadioButtons");
         
	        WebElement element = driver.findElement(By.id("firstSelect5"));
	 
	        System.out.println("Is element selected: " + element.isSelected());
	        
	       //case 2 radio box is selected 
	        WebElement element1 = driver.findElement(By.id("secondSelect5"));
	 
	        System.out.println("Is element selected: " + element1.isSelected());
	
	}

}
