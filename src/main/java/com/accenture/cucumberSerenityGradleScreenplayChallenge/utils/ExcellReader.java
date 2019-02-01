package com.accenture.cucumberSerenityGradleScreenplayChallenge.utils;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcellReader {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	//private static XSSFRow Row;
	
	public static void setExcelFile(String Path,String SheetName) throws Exception {
		try {
				FileInputStream ExcelFile = new FileInputStream(Path);
				ExcelWBook = new XSSFWorkbook(ExcelFile);
				ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e){
				throw (e);
		}

	}
	
	public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
			}catch (Exception e){
			return"";
			}
	}
	
	public static ArrayList<String> fullyData() throws Exception {
		
		setExcelFile("C:\\Users\\yeison.sanchez\\Documents\\challengescreenplaycucumberserenity\\cucumberSerenityGradleScreenplayChallenge\\bin\\Data\\data.xlsx", "data");
		
		ArrayList<String> datas = new ArrayList<String>();
		for(int i=0; i<7; i++) {
			datas.add(getCellData(i, 0));
		}

		return datas;
		
	}
}
