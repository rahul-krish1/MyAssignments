package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadCreateLead {

	@Test
	public void readExcel() throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		
		
		for (int i = 1; i <=rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < cellNum; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
		
		
		

	}

}
