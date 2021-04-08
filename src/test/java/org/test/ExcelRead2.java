package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\karth\\eclipse-sudharsan framework\\Sample\\excel\\demodata.xlsx");
		
		FileInputStream fileinputstream= new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(fileinputstream );
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		
		
	}

}
