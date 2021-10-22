package verify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

	public  static WebDriver driver;

	
	
	@BeforeSuite
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("calling quit metgids");
		driver.quit();
	}

}
