package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_mouse {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		Actions act =new Actions(driver); 
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.xpath("//input[contains(@type,'text')]"));

		act.moveToElement(search).doubleClick().build().perform();
		WebElement prime=driver.findElement(By.xpath("//span[contains(@class,'nav-icon nav-arrow')]//parent::a"));
		act.moveToElement(prime).perform();
		act.moveToElement(prime).click().build().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@id,'multiasins-img-link']")).click();
		
		Thread.sleep(1000);
		driver.close();
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://demoqa.com/droppable/");
		driver1.manage().window().maximize();
		Actions act1 =new Actions(driver1); 
		WebElement drag= driver1.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop= driver1.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		act1.dragAndDrop(drag, drop).perform();
		driver1.close();

	}

}
