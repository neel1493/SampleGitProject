package autom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {
	
	
	static WebDriver driver;
	  static int i=1;
	public  static void  ScreenS() throws IOException
		{
		 
			File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File ("D:\\screenshot\\n"+i+".jpg");
			FileHandler.copy(source, dest);
			i++;
		}
	public static void Date_SS() throws IOException
	{
		Date date = new Date();
		String SS = date.toString().replace(" ","-").replace(":","-");
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File ("D:\\screenshot\\n"+SS+".jpg");
		FileHandler.copy(source, dest);
	}
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login");
		driver.manage().window().maximize();
	    ScreenS();
	    Date_SS();
	    driver.close();
	}

}
