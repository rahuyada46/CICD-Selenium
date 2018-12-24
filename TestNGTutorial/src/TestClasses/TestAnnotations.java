package TestClasses;

import org.testng.annotations.Test;
import AppCode.SomeClasstoTest;
public class TestAnnotations {
	@Test
	public void testMethod1() {
		SomeClasstoTest obj = new SomeClasstoTest();
		int result = obj.someNumbers(1, 2);
		
		System.out.println("running test -> testMethod1 and its result =" + result);
	}
	
	@Test
	public void testMethod2() {
		System.out.println("running test -> testMethod2");
	}
}
