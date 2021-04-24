package onlyselenium;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
FileInputStream fs=new FileInputStream("E:\\bhanu22data.xls");
Workbook wb=Workbook.getWorkbook(fs);
Sheet ws=wb.getSheet("sample");
for(int r=0; r<ws.getRows();r++)
	
{
	for(int c=0; c<ws.getColumns();c++)
	{
		System.out.println(ws.getCell(c,r).getContents());
	}
		
}wb.close();



	}

}
