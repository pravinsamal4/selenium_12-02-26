package sept_2025_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class B9_Drag_And_Drop {
	public static void main(String[] args) {
		WebDriver driver= A_openbrowser.browser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement a=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		 driver.switchTo().frame(a);
		WebElement sec= driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
	WebElement des=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
	
	Actions sact=new Actions(driver);
	sact.dragAndDrop(sec, des);
		sact.perform();
		}

}
