package WorkWithWebElements_Core_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckAddress {

	WebDriver driver;
	WebElement Fname;
	WebElement Lname;
	WebElement add1;
	WebElement add2;
	WebElement city;
	WebElement state;
	WebElement zipCode;
	WebElement country;
	WebElement birth;
	WebElement color;
	WebElement age;
	WebElement website;
	WebElement phone;
	WebElement intr1, intr2, intr3;
	WebElement note;
	WebElement createAdd;
	
	WebElement EditBtn;
	WebElement ListBtn;
	
	public CheckAddress(WebDriver Driver) {
		driver = Driver;
		
		Fname = driver.findElement(By.xpath("/html/body/div/p[1]/span[2]"));
		Lname = driver.findElement(By.xpath("/html/body/div/p[2]/span[2]"));
		add1 = driver.findElement(By.xpath("/html/body/div/p[3]/span[2]"));
		city = driver.findElement(By.xpath("/html/body/div/p[5]/span[2]"));
		state = driver.findElement(By.xpath("/html/body/div/p[6]/span[2]"));
		zipCode = driver.findElement(By.xpath("/html/body/div/p[7]/span[2]"));
		country = driver.findElement(By.xpath("/html/body/div/p[8]/span[2]"));
		//intr1 = driver.findElement(By.xpath("/html/body/div/p[14]/span[2]"));
		//intr2 = driver.findElement(By.xpath("/html/body/div/p[15]/span[2]"));
		//intr3 = driver.findElement(By.xpath("/html/body/div/p[16]/span[2]"));
		
		
		EditBtn = driver.findElement(By.linkText("Edit"));
		ListBtn = driver.findElement(By.linkText("List"));
		
	}
	
	public void Checkdata(String FN, String LN, String Add1, String City, String State, String ZIP, String Country, String ComInt) {
		if(Fname.getText() != FN) Assert.fail("Name missmatch");
		if(Lname.getText() != LN) Assert.fail("last name missmatch");
		if(add1.getText() != Add1) Assert.fail("miss match address");
		if(city.getText() != City) Assert.fail("City missMatch");
		if(state.getText() != State) Assert.fail("State Missmatch");
		if(zipCode.getText() != ZIP) Assert.fail("Zip code missmatch");
		if(country.getText() != Country) Assert.fail("Country missmatch");	
		
	}
	
	public void EditPress() {
		EditBtn.click();
	}
	
	public void ListPress() {
		ListBtn.click();
	}
	
}
