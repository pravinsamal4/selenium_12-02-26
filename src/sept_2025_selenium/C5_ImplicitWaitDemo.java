package sept_2025_selenium;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class C5_ImplicitWaitDemo {

	

	    public static void main(String[] args) {

	        System.setProperty("webdriver.chrome.driver",
	                "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        driver.get("https://kite.zerodha.com/");

	        long startTime = System.currentTimeMillis();

	        try {
	            // Element that does NOT exist
	            driver.findElement(By.id("element_not_present"));
	        } catch (NoSuchElementException e) {
	            System.out.println("Element not found (as expected)");
	        }

	        long endTime = System.currentTimeMillis();

	        System.out.println("Implicit wait time: " + (endTime - startTime) + " ms");

	        driver.quit();
	    }
	
}



