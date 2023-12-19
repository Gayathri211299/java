package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenDay {
public static void main(String[] args) throws IOException {
	
	//1. Declare your file location
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\StartFrame\\Excellsheet\\Demosheet.xlsx");
	
	//2. Read the file
	FileInputStream fin = new FileInputStream (f);
	 
	//3.Type of WorkBook
	Workbook w = new XSSFWorkbook (fin);
	
	//4.Get the Sheet
	Sheet s = w.getSheet("Details");
	
	//5.Get the Row
	Row r = s.getRow(3);
	
	//6.Get the cell
	Cell c = r.getCell(2);
	System.out.println(c);

	
	
}
}
