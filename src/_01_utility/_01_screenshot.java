package _01_utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class _01_screenshot {
	public static void screenshot(WebDriver driver, String name) throws IOException {

	    // Creates a date-time format for unique screenshot naming
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("__ddMMyyyy_HHmmss");

	    // Captures the current system date and time
	    LocalDateTime now = LocalDateTime.now();

	    // Converts date-time into formatted string 
	    String date = dtf.format(now);

	    // Takes screenshot of the current browser window and stores it temporarily
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	    // Creates the destination file path with screenshot name + timestamp
	    File destination = new File(
	        "D:\\practice_selenium\\sept_2025_selenium\\screenshot\\"+ name + date + ".jpg");

	    // Copies the screenshot from temporary location to destination folder
	    FileHandler.copy(src, destination);
	}

}
