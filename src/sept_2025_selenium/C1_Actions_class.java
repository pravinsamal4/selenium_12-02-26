package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C1_Actions_class {
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		driver.manage().window().maximize();
//		WebElement a=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
//		WebElement b=driver.findElement(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon context-menu-icon-p\")]"));
//		
//		Actions act=new Actions(driver);
//		
////		act.contextClick(a).click(b).build().perform();
////		act.contextClick(a);
////		act.click(b);
////		act.build();
////		act.perform();
//		((JavascriptExecutor) driver)
//	    .executeScript("arguments[0].scrollIntoView(true);", a);
//		act.moveToElement(a).perform();
//	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		//1.
		Actions act= new Actions(driver);
		
		//2.
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	
		//3.
		
		
		//act.dragAndDrop(source, dest).perform();
	
		act.clickAndHold(source).moveToElement(dest).release().build().perform();
	}

	}

