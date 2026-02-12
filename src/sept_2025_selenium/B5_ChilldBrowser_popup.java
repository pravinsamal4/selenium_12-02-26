package sept_2025_selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_ChilldBrowser_popup {
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver","D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://kite.zerodha.com/");
	        // 5. Locate and click the Signup link (opens a new window)
	        WebElement signupLink = driver.findElement(By.xpath("//a[text()=\"Don't have an account? Signup now!\"]"));
	        signupLink.click();

	        // 6. Get all window (ID's)handles (parent + child)
	        Set<String> windowHandles = driver.getWindowHandles();

	        // 7. Create an iterator to traverse the window handles
	        Iterator<String> iterator = windowHandles.iterator();

	        // 8. Get the parent window handle using next()
	        String parentWindow = iterator.next();
	        System.out.println("Parent Window ID: " + parentWindow);

	        // 9. Get the child window handle using next()
	        String childWindow = iterator.next();
	        System.out.println("Child Window ID: " + childWindow);

	        // 10. Switch Selenium control to the child window
	        driver.switchTo().window(childWindow);

	        // 11. Locate mobile number input field in child window
	        WebElement mobile = driver.findElement(By.xpath("//input[@name=\"mobile\"]"));

	        // 12. Enter mobile number
	        mobile.sendKeys("4566");
	    }
	}

	
	
	
	
	

