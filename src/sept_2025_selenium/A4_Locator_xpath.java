package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Locator_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Xpath by attribute //inspect object it will open inspect search like (//input[@type="text"])
		WebElement name=driver.findElement(By.xpath("//input[@type=\"text\"]")); 
		name.sendKeys("pravin samal");
		
		//xpath by text
		WebElement forgot= driver.findElement(By.xpath("//a[text()='Forgotten password?']")); //xpath by text
		forgot.click();
		driver.navigate().back();
		
		//xpath by contains
		WebElement create= driver.findElement(By.xpath("(//a[contains(@data-testid,open-registration-form-button)])[3]")); //xpath by contains
		create.click();
		driver.navigate().back();
//		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile num')]"));
//		driver.findElement(By.xpath("(//select[@aria-describedby=\"birthday-error-message\"])[1]"));
		
		
	}
}
