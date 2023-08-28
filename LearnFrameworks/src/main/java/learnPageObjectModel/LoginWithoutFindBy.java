package learnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//PageFactory without Annotations
public class LoginWithoutFindBy {
	
	public static WebElement email;
	public static WebElement password;
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/signin");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		email.sendKeys("mukesh.perumal00@gmail.com");
		password.sendKeys("WrongPassword$0");
		driver.quit();
		
	}
}
