package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public Base() {
		 
		try {
			FileInputStream	fis = new FileInputStream("C:\\Users\\Adityayadav\\eclipse-workspace\\nse1\\src\\main\\java\\Utilities\\file.properties");
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();}
		catch (IOException e) {
			e.printStackTrace(); }
	}
	
	@BeforeTest
	public void openBrowser() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		//driver.close();
		}
}
