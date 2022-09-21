package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
//		WebElement username=driver.findElement(By.id("email"));
//		username.sendKeys("nilamt142@gmail.com");
//		
//		Thread.sleep(1000);
//		WebElement pass=driver.findElement(By.name("pass"));
//		pass.sendKeys("Neel$1402");
		
//		Thread.sleep(1000);
//		WebElement login=driver.findElement(By.id("loginbutton"));
//		login.click();
//		
//		Thread.sleep(2000);
//		WebElement forgot=driver.findElement(By.partialLinkText("password"));
//	    forgot.click();
	    
	    Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up for Facebook")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Nilam");
	    driver.findElement(By.name("lastname")).sendKeys("Pharate");
	    driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("8855958563");
	    driver.findElement(By.xpath("//input[contains(@data-type,'password')]")).sendKeys("Nilu@1402");
	 
	    WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
	    Select date1=new Select(date);
	    date1.selectByValue("14");
	    WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	    Select month1=new Select(month);
	    month1.selectByValue("2");
	    WebElement year=driver.findElement(By.id("year"));
	    Select year1=new Select(year);
	    year1.selectByVisibleText("1993");
	    Thread.sleep(2000);
	    
	    WebElement radio=driver.findElement(By.xpath("//input[contains(@value,\"-1\")]"));
	    radio.click();
	    boolean s1=radio.isSelected();
	    System.out.println(s1);
	    driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	  
	   
	    Thread.sleep(2000);
	    driver.close();
	}

}
