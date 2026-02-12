package sept_2025_selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_ChilldBrowser_popup_ArrayList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		

	    WebElement signupLink = driver.findElement(By.xpath("//a[text()=\"Don't have an account? Signup now!\"]"));
	    signupLink.click();
	    signupLink.click();
	    signupLink.click();
	    
	    Set<String> address=driver.getWindowHandles();
	    ArrayList<String > list=new ArrayList<String>(address);
	    
	    System.out.println(list.get(0));
	    System.out.println(list.get(1));
	    System.out.println(list.get(2));
	    System.out.println(list.get(3));
	    driver.switchTo().window(list.get(3));
	    WebElement mobile = driver.findElement(By.xpath("//input[@name=\"mobile\"]"));
        mobile.sendKeys("4566");
	}

}
