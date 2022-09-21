package autom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scr1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File ("D:\\screenshot\\nilam.jpg");
		FileHandler.copy(src, dest);
		
	}

}
