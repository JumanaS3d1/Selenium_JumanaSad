package defaultPack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OpenBrowserTestNG {
	@Parameters({ "BrowserName" })
	@Test
	public void testBrowser(String browserName) throws Exception {
		WebDriver driver = OpenBrowsers.openBrowser(browserName);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			driver.quit();
		}

	}

