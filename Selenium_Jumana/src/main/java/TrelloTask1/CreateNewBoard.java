package TrelloTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewBoard {
	WebDriver driver;
	WebElement createBtn;
	WebElement boardBtn;
	WebElement b_title;
	WebElement createB;
	
	
	public CreateNewBoard(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCreate() {
		
		createBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/button"));
		createBtn.click();
	}
	
	public void clickBoard() {
		boardBtn = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/nav/ul/li[1]/button"));
		boardBtn.click();
	}
	
	public void addTitle(String title) {
		b_title = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/div[1]/label/input"));
		b_title.sendKeys(title);
	}
	
	public void clickCreateB() {
		createB = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/button"));
		createB.click();
	}

//	public void CreateBoard() {
//		this.clickCreate();
//		this.clickBoard();
//	}
}
