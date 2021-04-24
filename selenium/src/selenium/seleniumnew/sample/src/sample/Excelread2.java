package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;


public class Excelread2 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		File src1=new File("E:\\bhanu1.xls");
		FileInputStream fs=new FileInputStream(
				src1);
		Workbook wb=Workbook.getWorkbook(fs);
		Sheet ws=wb.getSheet("sample");
		for(int r=0; r<ws.getRows();r++)
		{
			for(int c=0; c<ws.getColumns();c++)
			{
				
				System.out.println(ws.getCell(c,r).getContents());
			}
				
		}
		wb.close();
}
}