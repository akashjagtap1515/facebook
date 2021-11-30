package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public static WebDriver openChromeBrowser() {
		 ChromeOptions options  = new ChromeOptions();
			options.addArguments("--disable-notifications");//code for disable fb notification
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
		
		public static WebDriver openFireFoxBrowser() {
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			return driver;
	}
		
		

}
