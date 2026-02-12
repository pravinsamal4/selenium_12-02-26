package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A7_isDisplayed {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\exes\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testkru.com/Elements/TextMessages");
		WebElement element =driver.findElement(By.xpath("//p[@id=\"plainText\"]"));
		System.out.println("Is element visible on webpage: " + element.isDisplayed());
	}

}
