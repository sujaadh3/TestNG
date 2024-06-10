package ParallelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Task1 {
	WebDriver driver;
	@Test
	public void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		/*try { //Paused add to see the execution
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}*/
	}
	@Test
	public void verifyLogo() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));  
		Assert.assertTrue(logo.isDisplayed());
		/*try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
