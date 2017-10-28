package testNGTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGScriptForWebDriverDemoWithFireFox {
	
  @Test
  public void verifyHomePageTitle() {
	  
	  // declaration and instantiation of objects/variables
      WebDriver driver = new FirefoxDriver();
      String baseUrl = "http://newtours.demoaut.com";
      
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";

      // launch Firefox and direct it to the Base URL
      driver.get(baseUrl);

      // get the actual value of the title
      actualTitle = driver.getTitle();
       
      //compare the actual title of the page with the expected one and print the result as "Passed" or "Failed"..
      Assert.assertEquals(actualTitle, expectedTitle);
      
      //close Firefox...
      driver.quit();

  }
}
