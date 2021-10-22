package verify;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase001 extends BaseClass {





	@Test(priority = 0)
	public void verifytitle() {
		String txt = driver.getTitle();
		System.out.println(" inside Testcase01");
		Assert.assertEquals("Google1", txt);

	}

	@Test(priority = 1)
	public void typeInsearchBox() {
		driver.findElement(By.name("q")).sendKeys("alphabet");
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).build().perform();
		System.out.println("inside testcase001 2 method");
	}

}
