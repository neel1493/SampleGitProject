package autom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nilam {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.google.co.in");
	driver.close();
	WebDriver driver1= new ChromeDriver();
	driver1.get("https://www.google.co.in");
}
}
