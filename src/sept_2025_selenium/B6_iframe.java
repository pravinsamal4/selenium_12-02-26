package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6_iframe {
	
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
					"D:\\practice_selenium\\practice_selenium_GIT\\Demo_01_2026\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();

			// Locate iframe using WebElement
			WebElement singleframe =
					driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));

			// Switch to iframe
			driver.switchTo().frame(singleframe);

			// Perform action inside iframe
			WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
			text.sendKeys("samal");

			// Get entered value
			System.out.println(text.getAttribute("value"));
			driver.switchTo().defaultContent();
		}
	}


