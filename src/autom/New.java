package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement F_name= driver.findElement(By.name("firstname"));
		F_name.sendKeys("Nilam");
		
		WebElement L_name=driver.findElement(By.name("lastname"));
		L_name.sendKeys("Pharate");
		
		Thread.sleep(2000);
		WebElement gender=driver.findElement(By.id("sex-1"));
		gender.click();
		boolean res=gender.isSelected();
		System.out.println(res);
		
		Thread.sleep(2000);
		WebElement Exp=driver.findElement(By.id("exp-2"));
		Exp.click();
		
		Thread.sleep(2000);
		WebElement Date=driver.findElement(By.id("datepicker"));
		Date.sendKeys("09/08/2022");
		
		Thread.sleep(2000);
		WebElement profession=driver.findElement(By.id("profession-1"));
		profession.click();

		Thread.sleep(2000);
		WebElement tool=driver.findElement(By.id("tool-2"));
		tool.click();

		Thread.sleep(2000);
		Select continents=new Select (driver.findElement(By.xpath("//select[contains(@class,'input-xlarge')]")));
		driver.findElement(By.xpath("//select[contains(@class,'input-xlarge')]")).click();
		continents.selectByIndex(3);
		
		Thread.sleep(2000);
		driver.close();
	}

}
