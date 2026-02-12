package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Locator by tagname
//		How to search tagName in HTML (Chrome Inspect):
//
//			Open the page → Right-click → Inspect.
//			Press Ctrl + F in the Elements panel.
//			Type the tag directly, for example:
//			input → highlights all <input> elements.
//			button → highlights all <button> elements.
//			a → highlights all links (<a> tags).
//			👉 The search will show 1 of X → meaning there are X total elements with that tag.
//	WebElement login = driver.findElement(By.tagName("button"));
//	login.click();
//	driver.navigate().back();
	
	//Locator by id (in html page just type #value(example- #email) 
	//“If the id shows 1/1, it’s unique and the best locator. If it appears first in the results, it’s still fine to use, but unique IDs are always preferred.”
	WebElement a=driver.findElement(By.id("pass"));
	a.sendKeys("pravin");
	
	//locator by name
	WebElement name=driver.findElement(By.name("email"));
	name.sendKeys("pravin");
	
//	driver.navigate().back();
	
	//locator by classname
//	WebElement login1=driver.findElement(By.className("_6ltg"));
//	login1.click();
	
	//CSS by attribute
	driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	WebElement name1=driver.findElement(By.cssSelector("input[id=\"name\"]")); //CSS by attribute
	name1.sendKeys("samal");
	
	//CSS by id
    WebElement second=	driver.findElement(By.cssSelector("input#email"));  //css by ID
	second.sendKeys("secondsdf");
	
	//CSS by class
	WebElement address=driver.findElement(By.cssSelector("textarea.form-control")); //css by class
    address.sendKeys("samal");
	
	
	// locator by Linked   text
	driver.navigate().back();
	WebElement got=driver.findElement(By.linkText("Forgotten password?"));
	got.click();
	driver.navigate().back();
	
	//locator by partial linked text
	WebElement reforgot=driver.findElement(By.partialLinkText("Forgotten"));
	reforgot.click();
	driver.navigate().back();
	}
}
