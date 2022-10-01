package TrelloTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTrelloPassword {
	WebDriver driver;
	WebElement userPass;
	WebElement loginBtn;
	
	
	public LoginTrelloPassword(WebDriver driver) {
		this.driver = driver;
		userPass = driver.findElement(By.id("password"));
		loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/section/div[2]/form/button/span"));
	}
	
	public void fillUserPass(String pass) {
		userPass.sendKeys(pass);
	}

	public void clickLogin() {
		loginBtn.click();
	}

	public void loginPass(String passs) {
		this.fillUserPass(passs);
			this.clickLogin();
	}
}
