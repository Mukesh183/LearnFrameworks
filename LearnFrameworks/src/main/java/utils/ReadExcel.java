package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String fileLocation = "./test-data/login-data.xlsx";
		XSSFWorkbook wBook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows: "+lastRowNum);
		System.out.println("Inclusive of Header: "+physicalNumberOfRows);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=lastRowNum;i++) {
			XSSFRow row = sheet.getRow(i);		
			for (int j=0;j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//				String value = cell.getStringCellValue();
				System.out.println(value);
			}	 
		
		}
	}
}
	
	
