package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelread {
	XSSFWorkbook wb;
	XSSFSheet sample;
	    public void excelDagtaconfig(String excelpath){
		// TODO Auto-generated method stub
		try{
		File src1=new File("excelpath");
		FileInputStream fs=new FileInputStream(
				src1);
	 wb=new XSSFWorkbook(fs);
		}catch(Exception e){
		System.out.println(e.getMessage());
		}}
	    public String getData(int sheetnumber,int row,int coloum)
	    {
	    	sample=wb.getSheetAt(sheetnumber);
	    	String data=sample.getRow(row).getCell(coloum).getStringCellValue();
	    	return getData();
	    }
	    public int getRowCount(int sheetIndex)
	    {
	   int row= wb.getSheetAt(sheetIndex).getLastRowNum();
	   row=row+1;
	   return row;
	   
	    }
}
