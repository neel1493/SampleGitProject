package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP-PC\\Downloads\\geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://meet.google.com");
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		Dimension d=new Dimension(500,700);//width ,height //pixel
		driver.manage().window().setSize(d);//resize with given dimensions

	    WebElement UserName=driver.findElement(By.id("textUsername"));
	    UserName.sendKeys("Admin");
	    WebElement signup=driver.findElement(By.partialLinkText("Account"));
	    signup.click();
	}
}
