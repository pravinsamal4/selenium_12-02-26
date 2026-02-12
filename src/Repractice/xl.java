package Repractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xl {



		    // Reusable method to fetch data from Excel
		    public static String getdata(int row, int cell, String sheet)
		            throws EncryptedDocumentException, IOException {

		        // Create FileInputStream to connect Excel file
		        FileInputStream file =
		            new FileInputStream(
		                "D:\\practice_selenium\\sept_2025_selenium\\Selenium_parametrization(excel)\\data.xlsx"
		            );

		        // Read data from given sheet, row, and cell
		        String value =
		            WorkbookFactory.create(file)
		                           .getSheet(sheet)
		                           .getRow(row)
		                           .getCell(cell)
		                           .getStringCellValue();

		        return value;   // return Excel value
		    }

		    public static void main(String[] args)
		            throws EncryptedDocumentException, IOException {
		    	System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		        // Launch browser
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // Open Facebook login page
		        driver.get("https://www.facebook.com/");

		        // Fetch username from Excel
		        String usernameData = getdata(0, 1, "sh");

		        // Locate username/email field
		        WebElement username =
		            driver.findElement(
		                By.xpath("//input[contains(@placeholder,\"Email address \")]")
		            );

		        // Enter Excel data into textbox
		        username.sendKeys(usernameData);
		    }
		}



