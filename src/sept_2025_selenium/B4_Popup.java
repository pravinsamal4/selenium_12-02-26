  package sept_2025_selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B4_Popup {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
		"D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		driver.manage().window().maximize();

		WebElement alertBtn = driver.findElement(By.name("alertbox"));
		alertBtn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		System.out.println("Alert text: " + alert.getText());
		alert.accept();   // click OK

//		driver.quit();
	}
}
