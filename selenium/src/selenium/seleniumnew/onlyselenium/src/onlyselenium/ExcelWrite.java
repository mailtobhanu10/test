package onlyselenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		WritableWorkbook wb=Workbook.createWorkbook(new FileOutputStream("E:\\bhanu22data.xls"));
        WritableSheet ws=wb.createSheet("sample", 0);
        ws.addCell(new Label(1,1,"selenium"));
        ws.addCell(new Label(1,1,"java"));
        ws.addCell(new Label(1,2,".net"));
        ws.addCell(new Label(1,3,"appium"));
        wb.write();
        wb.close();
        
	}

}
