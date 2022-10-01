package TrelloTask1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Core.OpenBrowsers;
import Pages.BankSystem.LoginPage;

public class TestLoginTrello {

	WebDriver driver;
	String userEmailVal = "jumana.s3d@gmail.com";
	String userPasswordVal = "78419562";

	@BeforeSuite
	public void beforeSuite() throws InterruptedException {
		driver = OpenBrowsers.openBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://trello.com/login");
		Thread.sleep(1000);

	}

//	@BeforeMethod
//	public void beforeMethod() {
//		LoginPage loginPage = new LoginPage(driver);
//	}

	@Test
	public void loginEmailTest() throws InterruptedException {
		LoginTrelloEmail loginTrello = new LoginTrelloEmail(driver);
		loginTrello.login(userEmailVal);
		Thread.sleep(2000);
	}

	@Test (dependsOnMethods = { "loginEmailTest" })
	public void loginPasswordTest() throws InterruptedException {
		LoginTrelloPassword loginTrelloPass = new LoginTrelloPassword(driver);
		loginTrelloPass.loginPass(userPasswordVal);
		Thread.sleep(2000);
	}
	
	@Test (dependsOnMethods = { "loginPasswordTest" })
	public void CreateNewBoardTest() throws InterruptedException {
		CreateNewBoard	createBoard = new CreateNewBoard(driver);
		Thread.sleep(2000);
		createBoard.clickCreate();
		Thread.sleep(2000);
		createBoard.clickBoard();
	}
	
	@Test (dependsOnMethods = { "CreateNewBoardTest" })
	public void addTitleAndConfirm() throws InterruptedException {
		CreateNewBoard	createBoard2 = new CreateNewBoard(driver);
		Thread.sleep(2000);
		createBoard2.addTitle("TestBoard2");
		Thread.sleep(2000);
		createBoard2.clickCreateB();
	}

}
