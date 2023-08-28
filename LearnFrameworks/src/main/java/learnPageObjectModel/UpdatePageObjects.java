package learnPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePageObjects {
	
	@FindBy(xpath = "//a[.='My Info']")
	public static WebElement myInfo;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
	public static WebElement nickName;
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	public static WebElement clickMartialStatus;
	@FindBy(xpath = "//div[text()='Single']")
	public static WebElement Single;
	
	
	/*
	 * public static WebElement myInfo(WebDriver driver) { return
	 * driver.findElement(By.xpath("//a[.='My Info']")); }
	 * 
	 * public static WebElement nickName(WebDriver driver) { return
	 * driver.findElement(By.
	 * xpath("(//input[@class='oxd-input oxd-input--active'])[2]")); }
	 */
}
