package TestUtilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TestUtility {
	
	// screenshots code
	
	public static void takeScreenshot(WebDriver driver, int testID) throws IOException
	{
		Date d =new Date();
	   String FileName = d.toString().replace(":", "_").replace(" ", "_");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("test-output\\testScreenshots\\Test_"+testID+FileName+".jpg");
		FileHandler.copy(source, dest);
	}

	
	}
	


