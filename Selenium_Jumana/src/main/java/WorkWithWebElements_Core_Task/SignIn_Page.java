package WorkWithWebElements_Core_Task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn_Page {
	WebDriver driver;
	WebElement mailTxt;
	WebElement passTxt;
	WebElement loginBtn;
	//WebElement useErr;


	public SignIn_Page(WebDriver driver) {
		this.driver = driver;
		mailTxt = driver.findElement(By.name("session[email]"));
		passTxt = driver.findElement(By.name("session[password]"));
		loginBtn = driver.findElement(By.name("commit"));
	}
	//
	//


//	public String getErrorMsgUserId() {
//		String msg = "";
//
//		try {
//			useErr = driver.findElement(By.id("message23"));
//			msg = useErr.getText();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		return msg;
//	}


	public void fillUserId(String txt) {
		mailTxt.sendKeys(txt);
	}

	public void fillPassword(String txt) {
		passTxt.sendKeys(txt);
	}
	public void clickLogin() {
		loginBtn.click();
	}

	public void login(String user, String pass) {
		this.fillUserId(user);
		this.fillPassword(pass);
		//if (user != "" && pass != "") {
		this.clickLogin();

	}
}
