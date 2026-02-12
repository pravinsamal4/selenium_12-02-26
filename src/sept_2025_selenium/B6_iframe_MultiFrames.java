package sept_2025_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6_iframe_MultiFrames {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","D:\\exes\\28_01_26_exes\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();

			// Click on "Iframe with in an Iframe"
			driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

			// Switch to outer iframe
			WebElement outerFrame =
			driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			driver.switchTo().frame(outerFrame);

			// Switch to inner iframe
			WebElement innerFrame =
					driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")); 
			//iframe[@src="SingleFrame.html"])[2] not working bez it invalid → element does not exist
//XPath index is evaluated within the current DOM. After switching to an iframe, 
//indexing restarts, so using [2] fails if only one element exists."
			driver.switchTo().frame(innerFrame);

			// Enter text
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pravin");
			
			//switch to immediate parent frame
			driver.switchTo().parentFrame();
			
			// Back to main page
			driver.switchTo().defaultContent();
			
		
	}

}
//Excellent observation 👍
//This is a **very important Selenium concept** and interviewers love this question.
//## 🔹 Why XPath is NOT highlighting but still WORKS in Selenium?
//
//### Your XPath:
//
//```xpath
////iframe[@src='SingleFrame.html']
//```
//
//### 🤔 What you see:
//
//* ❌ It does NOT highlight in DevTools
//* ✅ Selenium code works
//
//---
//
//## 🔹 Root Cause (VERY IMPORTANT ⭐)
//
//👉 **The iframe you are trying to locate is inside another iframe**
//
//### Browser DevTools behavior:
//
//* DevTools **search works only in the CURRENT DOM**
//* It does **NOT automatically go inside iframes**
//
//So when you search:
//
//```xpath
////iframe[@src='SingleFrame.html']
//```
//
//DevTools searches **main page DOM only**
//➡️ Inner iframe is **NOT there**
//
//---
//
//## 🔹 Why Selenium still finds it?
//
//Because **you already switched to the outer iframe**:
//
//```java
//driver.switchTo().frame(outerFrame);
//```
//
//Now Selenium’s **current DOM = outer iframe DOM**
//➡️ Inside this DOM, the XPath is **100% correct**
//
//---
//
//## 🔹 Think of it Like This 🧠
//
//```
//Main Page DOM
// └── Outer iframe (MultipleFrames.html)
//      └── Inner iframe (SingleFrame.html)
//```
//
//* DevTools search → stays at **Main Page**
//* Selenium after switch → works **inside Outer iframe**
//
//---
//
//## 🔹 How to Highlight It in DevTools (Manual Way)
//
//1. Right-click inside **outer iframe content**
//2. Choose **Inspect**
//3. Now search:
//
//```xpath
////iframe[@src='SingleFrame.html']
//```
//
//➡️ It WILL highlight
//
//---
//
//## 🔹 Interview One-Liner Answer ⭐
//
//> **"DevTools XPath search does not cross iframe boundaries, but Selenium works because it switches to the iframe and changes the DOM context."**
//
//---
//
//## 🔹 Quick Debug Tip (Real-Time Use)
//
//If XPath:
//
//* ✔️ Works in Selenium
//* ❌ Not highlighting in DevTools
//
//➡️ **99% chance element is inside iframe**
//
//---
//
//## 🔹 Extra Interview Question They Ask
//
//**Q:** Can XPath cross iframe automatically?
//**A:** ❌ No, iframe has a separate DOM



