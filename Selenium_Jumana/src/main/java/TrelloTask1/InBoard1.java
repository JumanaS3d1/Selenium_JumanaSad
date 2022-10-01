package TrelloTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InBoard1 {

	WebDriver driver;
	WebElement addACard;
	WebElement addATitle;
	
	
	public InBoard1(WebDriver driver) {
		this.driver = driver;
		addACard = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[3]/a"));
		addATitle = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea"));
	}
	
	public void fillUserEmail(String email) {
		//userEmail.sendKeys(email);
	}

	public void clickLogin() {
		//loginBtn.click();
	}
}
