package autom;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Child_browser_popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		
		WebElement alert=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[1]"));
		WebElement confirm=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[2]"));
		WebElement promt=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[3]"));
		WebElement Line_Brk=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[4]"));
		
		alert.click();
		confirm.click();
		promt.click();
		Line_Brk.click();
		String url1 =driver.getWindowHandle();
		System.out.println("Main Window url"+url1);
		ArrayList<String> adddr = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(adddr.get(0));
		System.out.println(adddr.get(1));
		System.out.println(adddr.get(2));
		System.out.println(adddr.get(3));
		System.out.println(adddr.get(4));
		System.out.println("=========================");
		for(int i=0;i<adddr.size();i++)
		{
			driver.switchTo().window(adddr.get(i));
			String url=driver.getCurrentUrl();
			System.out.println("Index="+i+":"+url);
			Thread.sleep(1000);
		}
		//implicit wait/apply for whole webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//explicit wait/apply for specific webelement
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		
		driver.switchTo().window(adddr.get(2));
		driver.switchTo().frame("iframeResult");
		WebElement tryit=driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		tryit.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(@title,'Change Theme')]")).click();
	}
}
