//package sept_2025_selenium;
//
//public class A00_repractice {
//
// 
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/select-menu");
//
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//	WebElement e1=	driver.findElement(By.xpath("//div[@class=\" css-2b097c-container\"]"));
//    // ★ Scroll into view
//    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", e1);
//
//    // ★ Wait until clickable
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//    wait.until(ExpectedConditions.elementToBeClickable(e1));
//
//    // ★ Final click
//    e1.click();
//
//
//	}
//
//-------------------------------------------------------------------------------
//
//package sept_2025_selenium;

//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class A0_recap{
//	public static void main(String[] args) throws InterruptedException {
//
//	    System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
//	    driver.get("https://demoqa.com/select-menu");
//
//	    driver.manage().window().maximize();
//
//	    // Wait for page load
//	    Thread.sleep(1500);
//
//	    WebElement e1 = driver.findElement(By.xpath("//div[@id=\"withOptGroup\"]"));
//
//	    // 🔥 Scroll into view (this is the main fix)
//	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", e1);
//
//	    // 🔥 Wait until element is clickable
////	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////	    wait.until(ExpectedConditions.elementToBeClickable(e1));
//
//	    // 🔥 Now click
//	    e1.click();
//	}
//
//}
//
//
//
//}
//-----------------------------------------------------------------------------------



