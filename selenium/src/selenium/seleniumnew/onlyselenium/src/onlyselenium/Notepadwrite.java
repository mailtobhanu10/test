package onlyselenium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Notepadwrite {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("F:\\data.txt");
		BufferedWriter br=new BufferedWriter(fw);
		br.write("this is sample data and the");
		br.newLine();
		br.write("testing");
		br.close();
	}

}
