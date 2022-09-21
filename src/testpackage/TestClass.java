package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testCases.HomePage;
import testCases.LoginPage;


public class TestClass {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//verify login functionality
	LoginPage login=new LoginPage(driver);
	login.sendUserName();
	login.sendPassword();
	login.clickOnLoginButton();
	
	HomePage home =new HomePage(driver);
	home.verifyPIMTab();
	home.verifyAdminTab();
	home.verifyLeaveTab();
	}
}
