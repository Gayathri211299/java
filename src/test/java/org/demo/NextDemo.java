package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NextDemo {
public static void main(String[] args) throws IOException {
	//1. Declare your file location
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\StartFrame\\Excellsheet\\Demosheet.xlsx");
		
		//2. Read the file
		FileInputStream fin = new FileInputStream (f);
		 
		//3.Type of WorkBook
		Workbook w = new XSSFWorkbook (fin);
		
		//4.Get the Sheet
		Sheet s = w.getSheet("Details");
		
		
		//5.Get the physical number of rows
		int phy = s.getPhysicalNumberOfRows();
		System.out.println("Physical Number of Rows:"+phy);
		
Row r = s.getRow(3);
		int phycells = r.getPhysicalNumberOfCells();
		System.out.println("Physical Number of cell:"+phycells);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
