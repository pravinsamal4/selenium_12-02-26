package sept_2025_selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();

		List<WebElement> rows=driver.findElements(By.xpath("//table//tbody//tr"));
		List<WebElement> column=driver.findElements(By.xpath("//table//thead//th"));
		
//		System.out.println(rows.size());
		
		double max=0;
		double highestPrice=0;
		String highestPriceCompany ="";
		if(column.size()>3) {
		for(int i=1;i<=rows.size(); i++) {
		WebElement currentprice=	driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
		String 	currenttext=currentprice.getText();
		max=Double.parseDouble(currenttext);
		
		if(max>highestPrice) {
			highestPrice=max;
			highestPriceCompany =	driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[1]")).getText();
		}
		
		}
		  System.out.println("Highest Price  : " + highestPrice);
	        System.out.println("Company Name  : " + highestPriceCompany);
		}
		else {
			System.out.println("not avialable");
			
		}
	}
}
