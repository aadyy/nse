package nse.nse1;

import java.io.IOException;
import org.testng.annotations.Test;
import Utilities.Base;

public class TestNSE extends Base {
	
	NSE obj=new NSE(driver);

	@Test
	public void testNSE() throws InterruptedException, IOException {
	obj.NsePage();
	}
}
 