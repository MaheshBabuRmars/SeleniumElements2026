package elements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShottest {
	
	
	WebDriver driver = new ChromeDriver();
	
	public void screenshottest() throws IOException {
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File ("./screenshot/Login"  + ".png");
		
		 FileUtils.copyFile(Source, Destination);
		
		
		 System.out.println("Screenshot saved successfully!");
	
		
	}
	

}
