package TrelloTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTrelloEmail {

	WebDriver driver;
	WebElement userEmail;
	WebElement loginBtn;
	
	
	public LoginTrelloEmail(WebDriver driver) {
		this.driver = driver;
		userEmail = driver.findElement(By.id("user"));
		loginBtn = driver.findElement(By.id("login"));
	}
	
	public void fillUserEmail(String email) {
		userEmail.sendKeys(email);
	}

	public void clickLogin() {
		loginBtn.click();
	}

	public void login(String user) {
		this.fillUserEmail(user);
			this.clickLogin();
	}
}
