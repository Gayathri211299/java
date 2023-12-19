package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class QuesOne {
public static void main(String[] args) throws IOException {
	
	//1. Declare your file location
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\StartFrame\\Excellsheet\\Book1.xlsx");
	
	//2. Read the file
	FileInputStream fin = new FileInputStream (f);
	 
	//3.Type of WorkBook
	Workbook w = new XSSFWorkbook (fin);
	
	//4.Get the Sheet
	Sheet s = w.getSheet("Sheet1");
	
	//1<6
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell c = row.getCell(j);
		int cellType = c.getCellType();
		if(cellType==1) {
			String value = c.getStringCellValue();
			System.out.println(value);
		}else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMM,yyyy");
			System.out.println(sim);
		}else {
			double d = c.getNumericCellValue();
			
			//NewDataType Ref = (New Data Type)storeval;
			long l = (long)d;
			
			//converted long to string
			String value = String.valueOf(1);
			
			System.out.println(value);
			
			
		}
		
	}
	
	
	}}}

