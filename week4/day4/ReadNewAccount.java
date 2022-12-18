package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadNewAccount {

	public static String[][] readData() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/NewAccountSalesforce.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowNum = sheet.getLastRowNum();
		System.out.println("Total Rows : " + rowNum);
		
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		
		String[][] data = new String[rowNum][cellNum];
		
		for (int i = 1; i <=rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j <cellNum; j++) {
				XSSFCell cell = row.getCell(j);
//				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
				
			}
			
		}
		wb.close();
		return data;

	}

}
