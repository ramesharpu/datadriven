package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	private WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("Valid browser not provided, hence quitting the automation run");
			System.exit(0);
		}
		
		//maximize the window
		driver.manage().window().maximize();
		
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void closeTab() {
		this.driver.close();
	}
	
	public void quitBrowser() {
		this.driver.quit();
	}
	

}
