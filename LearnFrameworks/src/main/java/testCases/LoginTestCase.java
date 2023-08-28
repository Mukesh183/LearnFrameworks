package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import learnPageObjectModel.LoginPageObjects;


public class LoginTestCase {
	@Test
	public void loginTestCase() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.submitButton.click();
		
		driver.quit();
		
		
		/*LoginPageObjects.username(driver).sendKeys("Admin");
		LoginPageObjects.password(driver).sendKeys("admin123");
		LoginPageObjects.summitButton(driver).click();
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
		 * clickLogin.click();
		 * 
		 * // LoginPageObjects loginObject = new LoginPageObjects(); //loginObject.
		 */	
		}

}
