package verify;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase002 extends BaseClass {

	@Test(priority = 1)
	public void clcikOnSearch() {
		String testx = driver.getTitle();
		System.out.println(testx);
		Assert.assertEquals("tetsingfalied", testx);
	}

	@Test(priority = 2)
	public void MovetoNextPage() {
		List<WebElement> list = driver.findElements(By.xpath("//h3"));
		list.get(0).click();
	}

}
