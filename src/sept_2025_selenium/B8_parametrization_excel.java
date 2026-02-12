package sept_2025_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B8_parametrization_excel {
	
	    public static void main(String[] args)
	            throws EncryptedDocumentException, IOException {

	        // Set the path of ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver","D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe" );

	        // Launch Chrome browser
	        WebDriver driver = new ChromeDriver();

	        // Maximize browser window
	        driver.manage().window().maximize();

	        // Open the login page URL
	        driver.get("https://practice.expandtesting.com/login");

	        // Locate the username input field using XPath
	        WebElement username =
	            driver.findElement(By.xpath("//input[@name=\"username\"]"));

	        // Static data entry (not used now)
	        // username.sendKeys("praviun");

	        // Create FileInputStream to read the Excel file
	        FileInputStream fille =new FileInputStream("D:\\practice_selenium\\sept_2025_selenium\\Selenium_parametrization(excel)\\data.xlsx");

	        // Read the Excel file using WorkbookFactory
	        // getSheet("sh")  → selects sheet name "sh"
	        // getRow(0)       → selects first row (index starts from 0)
	        // getCell(1)      → selects second column (index starts from 0)
	        // getStringCellValue() → reads cell value as String
	        String data =WorkbookFactory.create(fille).getSheet("sh").getRow(0).getCell(1).getStringCellValue();

	        // Send Excel data into username text field
	        username.sendKeys(data);

	        // Print Excel data in console for verification
	        System.out.println(data);
	        	//or
			System.out.println(username.getAttribute("value"));

	    }
	}



