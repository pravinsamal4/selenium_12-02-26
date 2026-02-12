package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_JavascriptEcecutor {
	public static WebDriver openbrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	public static void main(String[] args) {
		WebDriver driver=openbrowser("https://www.facebook.com/");
		WebElement a= driver.findElement(By.xpath("//span[text()=\" Meta © 2025\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", a);
	}

}
