package programs_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class How_many_images_are_there_on_the_webpage {
	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver",
	            "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	    // Close login popup
//	    wait.until(ExpectedConditions.elementToBeClickable(
//	            By.xpath("//button[text()='✕']"))).click();

	    WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
	    wait.until(ExpectedConditions.elementToBeClickable(electronics));
	    electronics.click();

	    Actions act = new Actions(driver);
	    WebElement electronics1 = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//span[text()='Electronics']")));
	    act.moveToElement(electronics1).perform();

	    WebElement dslr = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//a[@title='DSLR & Mirrorless']")));
	    dslr.click();

	    Thread.sleep(2000);

	    // ✅ FIX: first row product images
//	    List<WebElement> images = driver.findElements(By.tagName("img")); ///total count on page
	    
	    //for first 
	    List<WebElement> images= driver.findElements
	    (By.xpath("(//div[@class=\"lvJbLV col-12-12\"])[2]//img"));
   		
	    System.out.println("number of images " + images.size());
	}

}
