package WorkWithWebElements_Core_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	WebDriver driver;
	WebElement AddressBtn;
	WebElement logOutBtn;
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		AddressBtn = driver.findElement(By.linkText("Addresses"));
		logOutBtn = driver.findElement(By.linkText("Sign out"));
		// TODO Auto-generated constructor stub
	}
	
	public void pressAddressBtn() {
		AddressBtn.click();
	}
	
	public void pressLogoutBtn() {
		logOutBtn.click();
	}
	

}
