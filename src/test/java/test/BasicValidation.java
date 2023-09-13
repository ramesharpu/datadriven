package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{
	
	@Test
	public void pageTitleValidation() {
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		Reporter.log("Expected page title = " + expectedTitle);
		Reporter.log("Actual page title = " + actualTitle);
		
		assertTrue(actualTitle.equals(expectedTitle), "Mismatch in the page title,");
	}

	@Test
	public void urlValidation() {
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Reporter.log("Expected page URL = " + expectedUrl);
		Reporter.log("Actual page URL = " + actualUrl);
		
		assertTrue(actualUrl.equals(expectedUrl), "Mismatch in the page url,");
	}
	
}
