package Repractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_consepts {

	public  void browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
//		return driver;
		}
	public static void main(String[] args) {
		 java_consepts a=new java_consepts();
		 a.browser();
	} 


}
