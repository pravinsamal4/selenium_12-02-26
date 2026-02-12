package sept_2025_selenium;

import java.net.HttpURLConnection;

/*
 LInk href="https://xyz.com";
 https://xyz.com----> server--->status code 
 status code >=400 broken link
  */
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01_Broken_links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
	List<WebElement>	links=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links"+ links.size());
	
	int noOfBrokenLink=0;
	for(WebElement linkElement:links) {
		String hrefattvalues=linkElement.getAttribute("href");
		
		if(hrefattvalues ==null || hrefattvalues.isEmpty()) {
			System.out.println("href attribute values are null or empty. not possible to get ");
			continue;
		}
		
		try {
			URL linkUrl=new URL(hrefattvalues);
			HttpURLConnection conn=(HttpURLConnection) linkUrl.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefattvalues  + ": broken link ");
			noOfBrokenLink++;
			}
			else {
				System.out.println(hrefattvalues+" not broken link");
			}
		}
		catch (Exception e) {
			
		}
	}
	System.out.println("number of broken links" +  noOfBrokenLink) ;
	}

}
