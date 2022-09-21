package autom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		Alert alt=driver.switchTo().alert();//return target locator,target locator having alert method 
										//which is form alert interface
	
	alt.accept();
	
//	Alert alt1=driver.switchTo().alert();
//	alt1.accept();
	String text=alt.getText();
	System.out.println(text);
				
	}

}
