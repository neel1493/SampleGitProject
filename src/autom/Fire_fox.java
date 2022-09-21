package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire_fox {
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP-PC\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login");
		Thread.sleep(2000);
		String get_title=driver.getTitle();
		System.out.println(get_title);
	    WebElement UserName=driver.findElement(By.name("username"));
		UserName.sendKeys("guddu_panda_");
		
	    WebElement password=driver.findElement(By.name("password"));
	    password.sendKeys("nilam2");
		Thread.sleep(2000);

	    driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[2]/div/div/div")).click();
		Thread.sleep(2000);

	    WebElement LoginButton=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	    LoginButton.click();
		Thread.sleep(2000);

		//driver.close();
	}

}
