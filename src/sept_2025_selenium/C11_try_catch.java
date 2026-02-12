package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C11_try_catch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement hide=driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]"));
		hide.click();
		try {
		WebElement text=driver.findElement(By.xpath("//input[@id=\"displayed-text\"]"));
		text.sendKeys("asdffg");
		}
		catch(Exception e) {
			System.out.println("not present");
		}
		System.out.println("testing continue");
	}

}
