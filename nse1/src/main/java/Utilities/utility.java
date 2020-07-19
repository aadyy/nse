package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class utility extends Base{
	
	public void takescreshot(String filename) throws IOException {
		
	File screenshotTaken=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotTaken, new File("C:\\Users\\Adityayadav\\eclipse-workspace\\nse1\\Screenshots"+filename+".jpg"));
	}

}
	