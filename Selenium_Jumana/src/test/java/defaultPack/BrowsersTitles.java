package defaultPack;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import defaultPack.ReadCsvFile;

public class BrowsersTitles {
	
	@BeforeSuite
	public void launchPage() throws InterruptedException {
		 WebDriver driver = OpenBrowsers.openBrowser("chrome");
		  driver.get("https://www.bing.com/");
		  Thread.sleep(3000);
		  WebElement search = driver.findElement(By.name("q"));
		  search.sendKeys("Selenium");
	}
	
	
  @Test
  public void testBing() throws InterruptedException {
//	  WebDriver driver = OpenBrowsers.openBrowser("chrome");
//	  driver.get("https://www.bing.com/");
//	  Thread.sleep(3000);
//	  WebElement search = driver.findElement(By.name("q"));
//	  search.sendKeys("Selenium");
//	
//	  WebElement btn = driver.findElement(By.xpath("//*[@id=\"search_icon\"]"));
//	  btn.click();
//	
//	  WebElement d = driver.findElement(By.xpath("//*[@id='b_results']/li[1]/div[1]/h2/a"));
//	  
//	  System.out.println(d.getText());
	  
		
		
  }
  @DataProvider(name = "Data")
	public static Object[][] getData() throws Exception{
		
		List<String[]> lines = ReadCsvFile.readAllLines("BrowserTitle.csv");
		lines.remove(0);
		Object[][] data = new Object[lines.size()][lines.get(0).length];
		int index = 0;
		for(String[] line : lines) {
			data[index] = line;
			index++;
		}
		return data;
	}
	@Test(dataProvider = "Data")
	public void testData(String title, String printed) {
		
		assertEquals(title, printed);
	}

}
