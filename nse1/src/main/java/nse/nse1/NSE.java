package nse.nse1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.Base;
import Utilities.utility;

public class NSE extends Base{
	
	utility utility=new utility();
	public NSE(WebDriver driver) {
	Base.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "main_livemkt")
	WebElement hover;
	@FindBy(xpath ="//li[@id = 'main_livewth_stkwth']//a[text() =  'Equity Stock']")
	WebElement equity;
	public void NsePage() throws InterruptedException, IOException {
	Actions ac=new Actions(driver);
	ac.moveToElement(hover).build().perform();
	WebDriverWait wait = new WebDriverWait(driver, 70);
	wait.until(ExpectedConditions.visibilityOf(equity));
	equity.click();
	Thread.sleep(4000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,400)");
	
	//utility methods created on seprate java class file
	utility.takescreshot("nseshare");
	
}

}
