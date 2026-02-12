package Repractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A1_ScrollInto {
	public static void main(String []args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement e1=		driver.findElement(By.xpath("//div[@id=\"withOptGroup\"]"));
		WebElement e2=driver.findElement(By.xpath("//h1[text()=\"Select Menu\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",e2);
		e1.click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()=\"Group 1, option 2\"]")).click();
        
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des=new File("D:\\practice_selenium\\sept_2025_selenium\\screenshot\\samal.jpg");
        FileHandler.copy(src, des);
	}

}
