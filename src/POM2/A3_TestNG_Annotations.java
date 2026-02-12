package POM2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A3_TestNG_Annotations {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	@Test
	public void test() {
		System.out.println("test completed");
	}
	@Test
	public void test1() {
		System.out.println("test1 completed");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 completed");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	
	@AfterTest
	public void Aftertets() {
		System.out.println("after test");
	}

}
