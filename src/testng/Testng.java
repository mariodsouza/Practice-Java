package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng {
	@Test
	public void test1() {
		System.out.println("In Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("In Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("In Test3");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("In Before Class");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("In Before Groups");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In Before Method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In Before Suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("In After Test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("In After Class");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("In After Groups");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("In After Method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("In After Suite");
	}
	
	@DataProvider
	public void dataProvider() {
		
	}

}
