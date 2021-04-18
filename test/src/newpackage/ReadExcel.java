package newpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	@Test
	public void open() throws BiffException, IOException
	{
		FileInputStream fis=new FileInputStream("D:\\bhanupraks.xlsx");
		Workbook  wb=Workbook.getWorkbook(fis);
		Sheet ws=wb.getSheet("sample");
		for(int r=0;r<ws.getRows();r++)
		{
			for(int c=0;c<ws.getColumns();c++)
			{
				System.out.println(ws.getCell(c,r).getContents());
				}
			wb.close();
		
		}}}