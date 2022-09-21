package autom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
		
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");  //scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");  //scroll up
	}

}
