package Repractice;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class recap {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		WebElement opentab= driver.findElement(By.id("opentab"));
		opentab.click();
		
		Set<String> sw=driver.getWindowHandles();		
		Iterator<String> i=sw.iterator();
		
		while(i.hasNext()) {
			driver.switchTo().window(i.next());
			Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]")).isDisplayed());
		WebElement a= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[3]/div[2]"));
		System.out.println(a.isDisplayed());
		}
	}
	}
