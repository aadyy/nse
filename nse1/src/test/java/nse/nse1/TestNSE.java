package nse.nse1;

import java.io.IOException;

import org.testng.annotations.Test;
import Utilities.Base;

public class TestNSE extends Base {
	
	@Test
	public void testNSE() throws InterruptedException, IOException {
	NSE obj=new NSE(driver);
	obj.NsePage();
		
	}

}
