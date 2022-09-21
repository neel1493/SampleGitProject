package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(2000);
		 WebElement UserName=driver.findElement(By.id("txtUsername"));
		 UserName.sendKeys("Admin");
		 
			Thread.sleep(2000);

		 WebElement passwrd=driver.findElement(By.name("txtPassword"));
		 passwrd.sendKeys("admin123");
			Thread.sleep(2000);

		 WebElement button=driver.findElement(By.className("button"));
		 button.click();
	}

}
