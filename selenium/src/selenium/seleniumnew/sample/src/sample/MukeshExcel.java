package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MukeshExcel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		File src1=new File("‪E:\bhanuprakash.xlsx");
		FileInputStream fs=new FileInputStream(src1);
				
		Workbook wb=Workbook.getWorkbook(fs);
		//Sheet ws=wb.getSheetAt(0);
	}

}
