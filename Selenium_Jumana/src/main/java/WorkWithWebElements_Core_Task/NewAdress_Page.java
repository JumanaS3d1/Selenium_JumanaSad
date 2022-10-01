package WorkWithWebElements_Core_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAdress_Page {

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
	WebElement intr;
	WebElement note;
	WebElement createAdd;
	
	public NewAdress_Page(WebDriver Driver) {
		driver = Driver;
		Fname = driver.findElement(By.name("address[first_name]"));
		Lname = driver.findElement(By.name("address[last_name]"));
		add1 = driver.findElement(By.name("address[address1]"));
		add2 = driver.findElement(By.name("address[address2]"));
		city = driver.findElement(By.name("address[city]"));
		state = driver.findElement(By.name("address[state]"));
		zipCode = driver.findElement(By.name("address[zip_code]"));
		country = driver.findElement(By.name("address[country]"));
		birth = driver.findElement(By.name("address[birthday]"));
		color = driver.findElement(By.name("address[color]"));
		age = driver.findElement(By.name("address[age]"));
		website = driver.findElement(By.name("address[website]"));
		phone = driver.findElement(By.name("address[phone]"));
		//intr = driver.findElement(By.name("address[interest_climb]"));
		note = driver.findElement(By.name("address[note]"));
		createAdd = driver.findElement(By.name("commit"));
		
	}
	
	public void fillAddressdata (String FN, String LN, String Add1, String City, String State, String ZIP, String Country, String ComInt) {
		
		Fname.sendKeys(FN);
		Lname.sendKeys(LN);
		add1.sendKeys(Add1);
		city.sendKeys(City);
		state.sendKeys(State);
		zipCode.sendKeys(ZIP);
		country.sendKeys(Country);
		//intr.sendKeys(ComInt);
		
	} 
	
}
