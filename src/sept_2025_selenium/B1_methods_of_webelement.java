package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_methods_of_webelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\exes\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		//WebElement methods
		//isSelected --Returns true if the checkbox/radio is ticked/selected, otherwise false.
		WebElement op1=driver.findElement(By.xpath("//input[@id=\"vfb-7-1\"]"));
		op1.click();
		boolean check=  op1.isSelected();
		System.out.println(check);
		
		//2. isEnabled()
        //Checks if the element is enabled for interaction (not disabled).
		//Returns true if you can type/click on it, false if it has disabled attribute.
		WebElement op2=driver.findElement(By.xpath("//input[@value=\"checkbox1\"]"));
//		op2.click();
		System.out.println(op2.isEnabled());
		
//		3. isSelected()
//		Only for checkbox / radio button / dropdown option.
		WebElement op3=driver.findElement(By.linkText("Checkbox"));
		System.out.println(op3.isDisplayed());
		
		//		driver.quit();
	}

}
