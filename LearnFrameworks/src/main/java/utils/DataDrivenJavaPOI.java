package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenJavaPOI {
	static List<String> usernamesList = new ArrayList<String>();
	static List<String> passwordList = new ArrayList<String>();
	
	public void readExcel() throws IOException {
		FileInputStream excel= new FileInputStream("./test-data/login-data.xlsx");
		Workbook workBook = new XSSFWorkbook(excel);
		Sheet sheet1=workBook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet1.iterator();
		
		while (rowIterator.hasNext()) {
			Row rowValue =rowIterator.next();
			Iterator<Cell> columnIterator = rowValue.iterator();
			int i =2;
			while (columnIterator.hasNext()) {
				if(i%2==0){
					 usernamesList.add(columnIterator.next().getStringCellValue());
				}else {
					passwordList.add(columnIterator.next().getStringCellValue());
				}
				i++;
			}
		}
		
	}
	
	public void login(String uName, String Pword) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement usernameORM = driver.findElement(By.name("username"));
		usernameORM.sendKeys(uName);
		
		WebElement passwordORM = driver.findElement(By.name("password"));
		passwordORM.sendKeys(Pword);
		
		WebElement clickLogin = driver.findElement(By.xpath("//button[text()=' Login ']"));
		clickLogin.click();
		
		driver.quit();
	}
	
	public void executeTestCase() throws InterruptedException {
		for (int i = 0; i < usernamesList.size(); i++) {
			login(usernamesList.get(i), passwordList.get(i));
		}
		
	}
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		DataDrivenJavaPOI javaPoi= new DataDrivenJavaPOI();
		javaPoi.readExcel();
		System.out.println("Username:"+usernamesList);
		System.out.println("Password:"+passwordList);
		javaPoi.executeTestCase();
	}

}
