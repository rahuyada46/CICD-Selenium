package Base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTestSuite {
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("\nBaseTestSuite -> This runs once before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("\nBaseTestSuite -> This runs once after class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("\nBaseTestSuite -> This runs once before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("\nBaseTestSuite -> This runs once after suite");
  }

}
