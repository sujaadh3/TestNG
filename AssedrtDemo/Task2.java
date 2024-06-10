package AssedrtDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	WebDriver driver;
	@Test
public void testMethod2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		SoftAssert softVerify = new SoftAssert();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("Verifying Title.....");
		String expectedTitle = "Automation Testing Practice1";
		String actualTitle = driver.getTitle();
		softVerify.assertEquals( expectedTitle, actualTitle,"Title verification");
		
		System.out.println("Verifying presence of wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		softVerify.assertTrue(icon.isDisplayed());
		
		//wikipedia search button verify
		System.out.println("Verifying the presence wikipedia search button");
		WebElement searchBtn = driver.findElement(By.className("wikipedia-search-button"));
		softVerify.assertTrue(searchBtn.isDisplayed());
		
		//report all failure messages
		softVerify.assertAll();
	}
}
