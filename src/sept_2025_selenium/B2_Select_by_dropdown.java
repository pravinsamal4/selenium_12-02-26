package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B2_Select_by_dropdown {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\exes\\28_01_26_exes\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.letskodeit.com/practice");
		 
		 //select by index
		 WebElement car=  driver.findElement(By.xpath("//select[@id=\"carselect\"]"));
		 Select a=new Select(car);
		 a.selectByIndex(1);
		 
		 //select by value
		 a.selectByValue("honda");
		 
		 //select by visible Text
		 a.selectByVisibleText("BMW");
	}
}
