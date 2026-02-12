package sept_2025_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_ChilldBrowser_popup_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://kite.zerodha.com/");
	
    WebElement signupLink = driver.findElement(By.xpath("//a[text()=\"Don't have an account? Signup now!\"]"));
    signupLink.click();
    signupLink.click();
    signupLink.click();
    
    Set<String> address= driver.getWindowHandles();
    Iterator<String> i=address.iterator();
    while(i.hasNext()) {
    	driver.switchTo().window(i.next());
    	String actual=driver.getTitle();
    	String expected="Open a free demat and trading account online at Zerodha";
    	if(actual.equals(expected)) {
    		WebElement mobile = driver.findElement(By.xpath("//input[@name=\"mobile\"]"));
	        mobile.sendKeys("4566");
	        break;
    	}
    }
	}

}
