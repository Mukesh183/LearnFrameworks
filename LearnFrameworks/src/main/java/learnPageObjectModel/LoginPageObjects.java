package learnPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how = How.NAME,using = "username")
	public static WebElement username;
	@FindBy(name = "password")
	public static WebElement password;
	@FindBy(xpath = "//button[text()=' Login ']")
	public static WebElement submitButton;
	
	
	
	
	
	/*
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.name("username")); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement summitButton(WebDriver driver) { return
	 * driver.findElement(By.xpath("//button[text()=' Login ']")); }
	 */	
}
