package TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNg_BeforeAnnotation {
	@BeforeClass
	
	public void Setup() {
		
		
			System.out.println("This Runs before class");
			
		}
	
@AfterClass
	
	public void Cleanup() {
		
		
			System.out.println("This Runs after class");
			
		}
	
	@Test
	public void testMethod1 () {
		
		System.out.println("running test -> testMethod1");
		
	}
	@Test
public void testMethod2 () {
		
		System.out.println("running test -> testMethod2");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This will run before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This will run after every method");
	}


}
