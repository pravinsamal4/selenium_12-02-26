package Repractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class recap3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\exes\\28_01_26_exes\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement sw=driver.findElement(By.cssSelector("a#opentab"));
			sw.click();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> i=s.iterator();
		
		while(i.hasNext()) {
			driver.switchTo().window(i.next());
			String exp="All Courses";
			if(exp.equals(driver.getTitle())) {
				System.out.println(driver.findElement(By.xpath("//a[text()='Sign In']")).isDisplayed());
				driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			}
		}
		
		
		
	}
	}
