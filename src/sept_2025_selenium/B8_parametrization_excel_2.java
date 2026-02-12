package sept_2025_selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B8_parametrization_excel_2 {
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username= driver.findElement(By.xpath(" //input[contains(@placeholder,\"Email address \")]"));
		FileInputStream a1=new FileInputStream("D:\\practice_selenium\\sept_2025_selenium\\Selenium_parametrization(excel)\\data.xlsx");
		
		Workbook work=WorkbookFactory.create(a1);
		
		String data=work.getSheet("sh").getRow(0).getCell(1).getStringCellValue();
		username.sendKeys(data);
		
		System.out.println(username.getAttribute("value"));
		
		WebElement  pass=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		
		String data1= work.getSheet("sh").getRow(1).getCell(1).getStringCellValue();
		pass.sendKeys(data1);
	}

}
