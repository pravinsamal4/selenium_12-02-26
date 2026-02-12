package sept_2025_selenium;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class B3_Screenshot {
	public static void main(String []args ) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	
//       ----- Take screenshot (stored in temporary location)
//      TakesScreenshot ts = (TakesScreenshot) driver;
//      File srcScreenshot = ts.getScreenshotAs(OutputType.FILE);
	File sec=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File des=new File("D:\\practice_selenium\\sept_2025_selenium\\screenshot\\pravin1.jpg" );
	FileHandler.copy(sec, des);
	System.out.println("success");
	}

}

//public class B3_Screenshot {
//
//    public static void main(String[] args) throws IOException {
//
//        // 1️⃣ Set ChromeDriver path
//        System.setProperty(
//            "webdriver.chrome.driver",
//            "D:\\exes\\nov_2025\\chromedriver-win32\\chromedriver.exe"
//        );
//
//        // 2️⃣ Launch Chrome browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        // 3️⃣ Open application URL
//        driver.get("https://demoqa.com/select-menu");
//
//        // 4️⃣ Take screenshot (stored in temporary location)
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File srcScreenshot = ts.getScreenshotAs(OutputType.FILE);
//
//        // 5️⃣ Define destination path
//        File destScreenshot = new File(
//            "D:\\practice_selenium\\sept_2025_selenium\\screenshot\\pravin1.jpg"
//        );
//        destScreenshot.getParentFile().mkdirs(); // create folder if not exists
//
//        // 6️⃣ Copy screenshot to destination
//        FileHandler.copy(srcScreenshot, destScreenshot);
//
//        // 7️⃣ Confirmation message
//        System.out.println("Screenshot captured successfully");
//
//        // 8️⃣ Close browser
//        driver.quit();
//    }
//}
//
//
