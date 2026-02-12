package sept_2025_selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A0_recap{
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\28_01_26_exes\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
	
		WebElement carSelect = wait.until(
			    ExpectedConditions.elementToBeClickable(By.id("carselect"))
			);

			Select select = new Select(carSelect);
			select.selectByVisibleText("BMW");
			
			File sec=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File de=new File("D:\\practice_selenium\\sept_2025_selenium\\screenshot\\pravin.jpg");
			FileHandler.copy(sec, de);
	}
}





