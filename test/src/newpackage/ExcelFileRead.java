package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead  {
	public void open() 
	{
		try {
			File f=new File("‪‪d:\\sirsfile.xlsx");
			FileInputStream fis=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet ws=wb.getSheet("Sheet1");
			String str=ws.getRow(0).getCell(1).getStringCellValue();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("the exception is"+e.getMessage());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("the exception is"+e.getMessage());
		} 
		
		
	}
	public static void main(String args[]) 
	{
	
		ExcelFileRead obj=new ExcelFileRead();
		obj.open();
	}

}
