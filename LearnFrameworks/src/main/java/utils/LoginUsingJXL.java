package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginUsingJXL {
	WebDriver driver;
	String[][] data = null;
	
	@BeforeTest
	public void beforeTest(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();	
	}
	@AfterTest
	public void afterTest () {
		driver.quit();
	}
	
	
	public String[][] readExcel() throws BiffException, IOException {
		FileInputStream exceldata = new FileInputStream("./test-data/LoginUsingJXL.xls");
		Workbook workbook = Workbook.getWorkbook(exceldata);
		Sheet sheet = workbook.getSheet(0);
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		String testdata [][] = new String[rowsCount-1][columnsCount];
		for (int i = 1; i < rowsCount; i++) {
			for(int j = 0; j< columnsCount; j++) {
				testdata[i-1][j]= sheet.getCell(j,i).getContents();
			}
			
		}
		return testdata;
	}
	
	@DataProvider(name = "logindata")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = readExcel();
		return data;
		
	}
	@Test(dataProvider = "logindata")
	public void login(String uName, String Pword) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		WebElement usernameORM = driver.findElement(By.name("username"));
		usernameORM.sendKeys(uName);
		
		WebElement passwordORM = driver.findElement(By.name("password"));
		passwordORM.sendKeys(Pword);
		
		WebElement clickLogin = driver.findElement(By.xpath("//button[text()=' Login ']"));
		clickLogin.click();
		
	}

}
