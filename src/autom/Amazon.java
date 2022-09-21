package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		search.sendKeys("mobiles");

		WebElement search1 = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		search1.click();

		WebElement link = driver.findElement(By.id("nav-link-accountList"));
		link.click();
		driver.findElement(By.xpath("//a[contains(text(),'Create your Amazon account')]")).click();

		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		Actions act = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		act.moveToElement(move).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Baby Wishlist')]")).click();

	}

}
