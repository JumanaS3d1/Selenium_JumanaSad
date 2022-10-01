package WorkWithWebElements_Core_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBook_Page {
	WebDriver driver;
	WebElement newAddBtn;
	WebElement addresses;
	Table adsTable;

	public AddressBook_Page(WebDriver Driver) {
		driver = Driver;
		newAddBtn = driver.findElement(By.linkText("New Address"));
		addresses = driver.findElement(By.className("table"));
		adsTable = new Table(driver, addresses);
	}
	
	public void pressNewBtn() {
		newAddBtn.click();
	}
	
	public int AddsCounter() {
		return adsTable.getRowNumber();
	}
	
}
