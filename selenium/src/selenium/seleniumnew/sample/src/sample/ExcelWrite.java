
//workbook----wrirableworkbook------//worksheet-------label(col,row)



package sample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.google.common.io.FileBackedOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
WritableWorkbook W=Workbook.createWorkbook(new FileOutputStream("E:\\bhanu1.xls"));		
	WritableSheet ws=W.createSheet("sample",0);
	ws.addCell(new Label(1,0,"java"));
	ws.addCell(new Label(1,1,"durga"));
	ws.addCell(new Label(1,2,"nani"));
	ws.addCell(new Label(1,3,"bhanu"));
	W.write();
	W.close();
	
}}
