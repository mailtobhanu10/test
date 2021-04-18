package newpackage;

import java.io.File;
import java.io.FileInputStream;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ReadExcelData {
	@Test
	public void m() throws Exception
	{
		
		FileInputStream fis=new FileInputStream("‪D:\bhanupraks.xlsx");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet ws=wb.getSheet("sheet1");
		for(int r=0;r<ws.getRows();r++)
		{
			for(int c=0;c<ws.getColumns();c++)
			{
				String data=ws.getCell(c, r).getContents();
				System.out.println(data);
			}
		}
		
		
	}

}
