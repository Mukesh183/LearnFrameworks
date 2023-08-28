package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import learnPageObjectModel.LoginPageObjects;
import learnPageObjectModel.UpdatePageObjects;

public class UpdateProfileTestCase {
	@Test
	public void updateProfileTestCase() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.submitButton.click();
		Thread.sleep(5000);
		PageFactory.initElements(driver, UpdatePageObjects.class);
		UpdatePageObjects.myInfo.click();
		Thread.sleep(5000);
		UpdatePageObjects.nickName.sendKeys("Maddy");
		UpdatePageObjects.clickMartialStatus.click();
		UpdatePageObjects.Single.sendKeys("Single");
		
		
		/*
		 * LoginPageObjects.username(driver).sendKeys("Admin");
		 * LoginPageObjects.password(driver).sendKeys("admin123");
		 * LoginPageObjects.summitButton(driver).click(); Thread.sleep(5000);
		 * UpdatePageObjects.myInfo(driver).click(); Thread.sleep(5000);
		 * UpdatePageObjects.nickName(driver).sendKeys("Maddy"); driver.quit();
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement usernameORM = driver.findElement(By.name("username"));
		 * usernameORM.sendKeys("Admin");
		 * 
		 * WebElement passwordORM = driver.findElement(By.name("password"));
		 * passwordORM.sendKeys("admin123");
		 * 
		 * WebElement clickLogin =
		 * driver.findElement(By.xpath("//button[text()=' Login ']"));
		 * clickLogin.click(); Thread.sleep(5000);
		 * 
		 * WebElement clickMyInfo = driver.findElement(By.xpath("//a[.='My Info']"));
		 * clickMyInfo.click(); Thread.sleep(5000); WebElement enterNickName =
		 * driver.findElement(By.
		 * xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		 * enterNickName.sendKeys("Maddy");
		 * 
		 * driver.quit();
		 */
		 
	}

}
